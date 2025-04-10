package org.example.orcamentototvsjakarta;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.example.orcamentototvsjakarta.DTO.*;
import org.example.orcamentototvsjakarta.db.dao.*;
import org.example.orcamentototvsjakarta.model.ParametrosModel;
import org.example.orcamentototvsjakarta.util.AlertUtil;
import org.example.orcamentototvsjakarta.util.JPAUtil;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Controller da tela de parâmetros para geração de orçamentos.
 * Responsável por coletar os parâmetros iniciais necessários para o processo.
 */
public class TelaParametrosController {
    private static final Logger LOGGER = Logger.getLogger(TelaParametrosController.class.getName());

    // Componentes FXML
    @FXML private ComboBox<String> comboCliente, comboPraca, comboRCA, comboSupervisor, comboRamoAtividade;
    @FXML private TextField txtQtdeMaxItens, txtValorMaxOrcamento;
    @FXML private Button btnAvancar;
    @FXML private TextField tfCliente;
    @FXML private CheckBox cbPrecoCusto, cbPrecoVenda;
    @FXML private ComboBox<FilialDTO> comboFilial;
    @FXML private ComboBox<FuncionarioDTO> comboFuncionario;
    @FXML private ComboBox<CobrancaDTO> comboCobranca;
    @FXML private ComboBox<PlanoPagamentoDTO> comboPlanoPagamento;

    // DAOs
    private final PcfilialDAO pcfilialDAO = new PcfilialDAO();
    private final PcclientDAO pcclientDAO = new PcclientDAO();
    private final PcplpagDAO pcplpagDAO = new PcplpagDAO();
    private final PccobDAO pccobDAO = new PccobDAO();
    private final PcusuariDAO pcusuariDAO = new PcusuariDAO();
    private final PcemprDAO pcemprDAO = new PcemprDAO();

    // Constantes e variáveis de estado
    private ClienteDTO clienteSelecionadoManual = null;
    private static final String OPCAO_PADRAO = "Selecione...";
    private static final String NAO_INFORMADO = "Não informado";
    private static final int CLIENTE_PADRAO_ID = 2;

    /**
     * Inicializa o controller após a injeção dos componentes FXML
     */
    @FXML
    public void initialize() {
        try {
            configurarListeners();
            carregarDadosIniciais();
            carregarClientePadrao();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao inicializar a tela de parâmetros", e);
            AlertUtil.showAlert("Erro ao inicializar a tela: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    /**
     * Configura os listeners de eventos dos componentes
     */
    private void configurarListeners() {
        // Listeners para eventos de UI
        configurarListenersComboBoxes();
        configurarListenersCheckboxes();
        configurarListenersCamposTexto();
        configurarBotoes();
    }

    /**
     * Configura os listeners dos botões
     */
    private void configurarBotoes() {
        btnAvancar.setOnAction(this::onAvancar);
    }

    private void configurarListenersComboBoxes() {
        comboRCA.setOnAction(event -> onRCASelecionado());
    }

    private void configurarListenersCheckboxes() {
        // Configuração de checkbox mutuamente exclusivos
        cbPrecoCusto.setOnAction(event -> {
            if (cbPrecoCusto.isSelected()) {
                cbPrecoVenda.setSelected(false);
            }
        });

        cbPrecoVenda.setOnAction(event -> {
            if (cbPrecoVenda.isSelected()) {
                cbPrecoCusto.setSelected(false);
            }
        });
    }

    private void configurarListenersCamposTexto() {
        // Listener para campo de cliente quando perde o foco
        tfCliente.focusedProperty().addListener((obs, antigo, novo) -> {
            if (!novo) { // perdeu o foco
                buscarClientePorCodigoDigitado();
            }
        });
    }

    /**
     * Carrega os dados iniciais necessários para a tela
     */
    private void carregarDadosIniciais() {
        // Executa em paralelo onde possível
        Thread filialThread = new Thread(this::carregarDadosFiliais);
        Thread rcaThread = new Thread(this::carregarOpcoesRCA);
        Thread funcionariosThread = new Thread(this::carregarOpcoesFuncionarios);

        filialThread.start();
        rcaThread.start();
        funcionariosThread.start();

        try {
            filialThread.join();
            rcaThread.join();
            funcionariosThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LOGGER.log(Level.WARNING, "Carregamento de dados interrompido", e);
        }

        // Inicializa estado dos campos relacionados ao cliente
        desabilitarCamposRelacionadosAoCliente(true);
    }

    /**
     * Carrega o cliente padrão se disponível
     */
    private void carregarClientePadrao() {
        try {
            Optional<ClienteDTO> clienteDefault = Optional.ofNullable(
                    pcclientDAO.buscarDTOporCodigo(CLIENTE_PADRAO_ID));

            clienteDefault.ifPresent(cliente -> {
                LOGGER.info("Cliente padrão carregado: " + cliente.getCodcli() + " - " + cliente.getNome());
                clienteSelecionadoManual = cliente;
                tfCliente.setText(cliente.toString());
                carregarDadosRelacionadosCliente(cliente.getCodcli());
            });
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao carregar cliente padrão", e);
            AlertUtil.showAlert("Erro ao carregar cliente padrão: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    /**
     * Habilita ou desabilita campos relacionados ao cliente
     */
    private void desabilitarCamposRelacionadosAoCliente(boolean disable) {
        comboPraca.setDisable(disable);
        comboRamoAtividade.setDisable(disable);
        comboPlanoPagamento.setDisable(disable);
        comboCobranca.setDisable(disable);
    }

    /**
     * Método genérico para carregar ComboBoxes com valores e opção padrão
     */
    private <T> void carregarComboBox(ComboBox<T> comboBox, List<T> valores, T valorPadrao) {
        comboBox.getItems().clear();
        comboBox.setItems(FXCollections.observableArrayList(valores));

        if (valorPadrao != null) {
            comboBox.getItems().add(0, valorPadrao);
        }

        comboBox.getSelectionModel().selectFirst();
    }

    /**
     * Carrega os dados das filiais no combobox correspondente
     */
    private void carregarDadosFiliais() {
        try {
            List<FilialDTO> filiais = pcfilialDAO.buscarTodas().stream()
                    .sorted(Comparator.comparing(pcfilial -> pcfilial.getId().getCodigo()))
                    .map(pcfilial -> new FilialDTO(pcfilial.getId().getCodigo(), pcfilial.getRazaosocial()))
                    .collect(Collectors.toList());

            javafx.application.Platform.runLater(() -> {
                carregarComboBox(comboFilial, filiais, new FilialDTO(null, OPCAO_PADRAO));
            });
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao carregar filiais", e);
            javafx.application.Platform.runLater(() -> {
                AlertUtil.showAlert("Erro ao carregar filiais: " + e.getMessage(), Alert.AlertType.ERROR);
            });
        }
    }

    /**
     * Carrega as opções de RCA no combobox correspondente
     */
    private void carregarOpcoesRCA() {
        try {
            List<String> rcas = pcusuariDAO.buscarTodos().stream()
                    .sorted(Comparator.comparing(pcusuari -> pcusuari.getId()))
                    .map(pcusuari -> pcusuari.getId() + " - " + pcusuari.getNome())
                    .collect(Collectors.toList());

            javafx.application.Platform.runLater(() -> {
                carregarComboBox(comboRCA, rcas, OPCAO_PADRAO);
            });
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao carregar RCAs", e);
            javafx.application.Platform.runLater(() -> {
                AlertUtil.showAlert("Erro ao carregar RCA: " + e.getMessage(), Alert.AlertType.ERROR);
            });
        }
    }

    /**
     * Carrega as opções de funcionários no combobox correspondente
     */
    private void carregarOpcoesFuncionarios() {
        try {
            List<FuncionarioDTO> funcionarios = pcemprDAO.listarTodos().stream()
                    .sorted(Comparator.comparing(pcempr -> pcempr.getId()))
                    .map(pcempr -> new FuncionarioDTO(pcempr.getId(), pcempr.getNome()))
                    .collect(Collectors.toList());

            javafx.application.Platform.runLater(() -> {
                carregarComboBox(comboFuncionario, funcionarios, new FuncionarioDTO(null, OPCAO_PADRAO));
            });
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao carregar funcionários", e);
            javafx.application.Platform.runLater(() -> {
                AlertUtil.showAlert("Erro ao carregar funcionários: " + e.getMessage(), Alert.AlertType.ERROR);
            });
        }
    }

    /**
     * Carrega as opções de cobrança no combobox correspondente
     */
    private void carregarOpcoesCobranca(String codCobrancaCliente) {
        try {
            List<CobrancaDTO> cobrancas = pccobDAO.buscarTodos().stream()
                    .sorted(Comparator.comparing(pccob -> pccob.getCodcob()))
                    .map(pccob -> new CobrancaDTO(pccob.getCodcob(), pccob.getCobranca()))
                    .collect(Collectors.toList());

            carregarComboBox(comboCobranca, cobrancas, new CobrancaDTO(null, OPCAO_PADRAO));

            if (codCobrancaCliente != null) {
                selecionarItemPorCodigo(comboCobranca, codCobrancaCliente, CobrancaDTO::getCodigo);
            }
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao carregar cobranças", e);
            AlertUtil.showAlert("Erro ao carregar cobranças: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    /**
     * Carrega as opções de plano de pagamento no combobox correspondente
     */
    private void carregarOpcoesPlanoPagamento(Integer codPlanoPagamentoCliente) {
        try {
            List<PlanoPagamentoDTO> planos = pcplpagDAO.buscarTodos().stream()
                    .sorted(Comparator.comparing(pcplpag -> pcplpag.getId()))
                    .map(pcplpag -> new PlanoPagamentoDTO(Integer.valueOf(pcplpag.getId()), pcplpag.getDescricao()))
                    .collect(Collectors.toList());

            carregarComboBox(comboPlanoPagamento, planos, new PlanoPagamentoDTO(null, OPCAO_PADRAO));

            if (codPlanoPagamentoCliente != null) {
                selecionarItemPorCodigo(comboPlanoPagamento, codPlanoPagamentoCliente, PlanoPagamentoDTO::getCodigo);
            }
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao carregar planos de pagamento", e);
            AlertUtil.showAlert("Erro ao carregar planos de pagamento: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    /**
     * Método genérico para selecionar um item em um combobox por seu código
     */
    private <T, U> void selecionarItemPorCodigo(ComboBox<T> comboBox, U codigo, Function<T, U> extrator) {
        for (T item : comboBox.getItems()) {
            if (codigo.equals(extrator.apply(item))) {
                comboBox.getSelectionModel().select(item);
                break;
            }
        }
    }

    /**
     * Handler para evento de seleção de RCA
     */
    private void onRCASelecionado() {
        String rcaSelecionado = comboRCA.getSelectionModel().getSelectedItem();

        if (rcaSelecionado != null && !rcaSelecionado.equals(OPCAO_PADRAO)) {
            try {
                // Obtém o código do RCA (antes do " - ")
                Short codRCA = Short.parseShort(rcaSelecionado.split(" - ")[0]);

                // Buscar o código do supervisor associado ao RCA
                Short codSupervisor = pcusuariDAO.buscarSupervisorPorRCA(codRCA);

                comboSupervisor.setValue(codSupervisor != null ? codSupervisor.toString() : NAO_INFORMADO);
            } catch (NumberFormatException e) {
                LOGGER.log(Level.WARNING, "Formato inválido para código do RCA", e);
                AlertUtil.showAlert("Formato inválido para código do RCA", Alert.AlertType.ERROR);
            }
        } else {
            comboSupervisor.setValue(null);
        }
    }

    /**
     * Método para abrir o modal de pesquisa de cliente
     */
    @FXML
    public void abrirModalPesquisa(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/modalCliente.fxml"));
            Parent root = loader.load();

            ModalClienteController controller = loader.getController();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Pesquisar Cliente");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

            Optional.ofNullable(controller.getClienteSelecionado()).ifPresent(cliente -> {
                clienteSelecionadoManual = cliente;
                tfCliente.setText(cliente.toString());
                carregarDadosRelacionadosCliente(cliente.getCodcli());
            });

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao abrir modal de cliente", e);
            AlertUtil.showAlert("Erro ao abrir modal de cliente: " + e.getMessage(), Alert.AlertType.ERROR);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro inesperado", e);
            AlertUtil.showAlert("Erro inesperado: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    /**
     * Busca cliente pelo código digitado no campo de texto
     */
    private void buscarClientePorCodigoDigitado() {
        String texto = tfCliente.getText().trim();

        if (texto.isEmpty()) {
            clienteSelecionadoManual = null;
            return;
        }

        try {
            // Extrai apenas os números do texto
            String numeroTexto = texto.replaceAll("[^0-9]", "");
            if (numeroTexto.isEmpty()) {
                throw new NumberFormatException("Sem números válidos no texto");
            }

            Integer codcli = Integer.parseInt(numeroTexto);
            Optional<ClienteDTO> clienteOpt = Optional.ofNullable(pcclientDAO.buscarDTOporCodigo(codcli));

            if (clienteOpt.isPresent()) {
                ClienteDTO cliente = clienteOpt.get();
                clienteSelecionadoManual = cliente;
                tfCliente.setText(cliente.toString());
                carregarDadosRelacionadosCliente(cliente.getCodcli());
            } else {
                AlertUtil.showAlert("Cliente não encontrado para o código informado!", Alert.AlertType.WARNING);
                limparDadosCliente();
            }

        } catch (NumberFormatException e) {
            LOGGER.log(Level.INFO, "Formato inválido para código do cliente: " + texto, e);
            AlertUtil.showAlert("Informe apenas o código numérico do cliente.", Alert.AlertType.WARNING);
            limparDadosCliente();
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao buscar cliente: " + texto, e);
            AlertUtil.showAlert("Erro ao buscar cliente: " + e.getMessage(), Alert.AlertType.ERROR);
            limparDadosCliente();
        }
    }

    /**
     * Limpa os dados do cliente selecionado
     */
    private void limparDadosCliente() {
        tfCliente.clear();
        clienteSelecionadoManual = null;
        limparDadosRelacionadosCliente();
    }

    /**
     * Carrega os dados relacionados ao cliente selecionado
     */
    private void carregarDadosRelacionadosCliente(Integer codcli) {
        if (codcli == null) {
            limparDadosRelacionadosCliente();
            return;
        }

        desabilitarCamposRelacionadosAoCliente(false);

        try {
            // Busca informações do cliente
            Integer codPraca = pcclientDAO.buscarPracaPorCliente(codcli);
            Integer codRamo = pcclientDAO.buscarRamoAtividadePorCliente(codcli);
            Short codPlano = pcclientDAO.buscarPlanoPagamentoPorCliente(codcli);
            String codCobranca = pcclientDAO.buscarCobrancaPorCliente(codcli);

            // Preenche os campos com os dados obtidos
            comboPraca.setValue(codPraca != null ? codPraca.toString() : NAO_INFORMADO);
            comboRamoAtividade.setValue(codRamo != null ? codRamo.toString() : NAO_INFORMADO);

            // Carrega opções relacionadas
            try {
                carregarOpcoesCobranca(codCobranca);
            } catch (Exception e) {
                // Log detalhado para depuração
                LOGGER.log(Level.WARNING, "Erro ao carregar opções de cobrança para o cliente " + codcli, e);

                // Apenas registra o erro e continua, sem exibir alerta ao usuário
                // para evitar interrupção do fluxo por erro não crítico
                comboCobranca.getSelectionModel().clearSelection();
            }

            try {
                carregarOpcoesPlanoPagamento(codPlano != null ? codPlano.intValue() : null);
            } catch (Exception e) {
                // Log detalhado para depuração
                LOGGER.log(Level.WARNING, "Erro ao carregar planos de pagamento para o cliente " + codcli, e);

                // Apenas registra o erro e continua, sem exibir alerta ao usuário
                comboPlanoPagamento.getSelectionModel().clearSelection();
            }

            // Campos de visualização apenas
            comboPraca.setDisable(true);
            comboRamoAtividade.setDisable(true);

        } catch (Exception e) {
            // Log detalhado para depuração
            LOGGER.log(Level.WARNING, "Erro ao carregar dados do cliente: " + codcli, e);

            // Verifica o tipo de erro para apresentar mensagem mais específica
            String mensagemErro;
            if (e instanceof java.sql.SQLException) {
                mensagemErro = "Ocorreu um erro ao consultar os dados do cliente no banco de dados.";
            } else if (e instanceof NullPointerException) {
                mensagemErro = "Erro ao processar os dados do cliente. Alguns campos podem não ter sido inicializados corretamente.";
            } else {
                // Mensagem genérica para outros tipos de erro
                mensagemErro = "Não foi possível carregar todos os dados do cliente. Porém, você pode continuar o processo.";
            }

            // Exibe mensagem amigável para o usuário sem detalhes técnicos
            AlertUtil.showAlert(mensagemErro, Alert.AlertType.WARNING);

            // Tenta recuperar parte dos dados, mantendo o cliente selecionado
            // mas limpando campos relacionados que podem estar com problemas
            limparDadosRelacionadosCliente();
            desabilitarCamposRelacionadosAoCliente(false);
        }
    }

    /**
     * Limpa os dados relacionados ao cliente
     */
    private void limparDadosRelacionadosCliente() {
        comboPraca.setValue(null);
        comboRamoAtividade.setValue(null);
        comboPlanoPagamento.getSelectionModel().clearSelection();
        comboCobranca.getSelectionModel().clearSelection();
        desabilitarCamposRelacionadosAoCliente(true);
    }

    /**
     * Abre a tela de departamentos com os parâmetros selecionados
     */
    private void abrirTelaDepartamentos(ParametrosModel parametros) {
        try {
            // Carrega o arquivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaDepartamentos16.fxml"));
            Parent root = loader.load();

            // Obtém o controller e configura os parâmetros
            TelaDepartamentoController controller = loader.getController();
            if (controller == null) {
                AlertUtil.showAlert("Erro ao carregar controlador da tela de departamentos!",
                        Alert.AlertType.ERROR);
                return;
            }

            controller.setParametrosModel(parametros);

            // Configura e mostra a nova tela
            Stage stage = new Stage();
            stage.setTitle("Departamentos");
            stage.setScene(new Scene(root));
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();

            // Fecha a tela atual
            ((Stage) btnAvancar.getScene().getWindow()).close();

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar próxima tela", e);
            AlertUtil.showAlert("Erro ao carregar próxima tela: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    /**
     * Converte o texto de um campo para Double
     */
    private Double getDoubleValue(TextField field, String fieldName) {
        try {
            // Verificação de segurança para evitar NullPointerException
            if (field == null) {
                LOGGER.log(Level.WARNING, "Campo " + fieldName + " é nulo");
                AlertUtil.showAlert("O campo '" + fieldName + "' não foi inicializado corretamente. Por favor, contate o suporte técnico.",
                        Alert.AlertType.ERROR);
                return null;
            }

            String text = field.getText();
            if (text == null || text.trim().isEmpty()) {
                return null;
            }

            return Double.parseDouble(text.trim().replace(',', '.'));
        } catch (NumberFormatException ex) {
            LOGGER.log(Level.INFO, "Formato inválido para " + fieldName + ": " + (field != null ? field.getText() : "campo nulo"), ex);
            AlertUtil.showAlert("Insira um valor numérico válido para '" + fieldName + "'!",
                    Alert.AlertType.ERROR);
            return null;
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Erro ao processar o campo " + fieldName, ex);
            AlertUtil.showAlert("Ocorreu um erro ao processar o campo '" + fieldName + "': " + ex.getMessage(),
                    Alert.AlertType.ERROR);
            return null;
        }
    }

    /**
     * Converte o texto de um campo para Integer
     */
    private Integer getIntegerValue(TextField field, String fieldName) {
        try {
            // Verificação de segurança para evitar NullPointerException
            if (field == null) {
                LOGGER.log(Level.WARNING, "Campo " + fieldName + " é nulo");
                AlertUtil.showAlert("O campo '" + fieldName + "' não foi inicializado corretamente. Por favor, contate o suporte técnico.",
                        Alert.AlertType.ERROR);
                return null;
            }

            String text = field.getText();
            if (text == null || text.trim().isEmpty()) {
                return null;
            }

            return Integer.parseInt(text.trim());
        } catch (NumberFormatException ex) {
            LOGGER.log(Level.INFO, "Formato inválido para " + fieldName + ": " + (field != null ? field.getText() : "campo nulo"), ex);
            AlertUtil.showAlert("Insira um valor numérico válido para '" + fieldName + "'!",
                    Alert.AlertType.ERROR);
            return null;
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Erro ao processar o campo " + fieldName, ex);
            AlertUtil.showAlert("Ocorreu um erro ao processar o campo '" + fieldName + "': " + ex.getMessage(),
                    Alert.AlertType.ERROR);
            return null;
        }
    }

    /**
     * Cria o modelo de parâmetros com os dados preenchidos
     */
    private ParametrosModel criarParametrosModel() {
        try {
            // Extração dos parâmetros dos componentes
            String clienteSelecionado = clienteSelecionadoManual != null ? clienteSelecionadoManual.toString() : "";
            String rcaSelecionado = getSelectedValue(comboRCA);
            String supervisorSelecionado = getSelectedValue(comboSupervisor);
            String pracaSelecionada = getSelectedValue(comboPraca);
            String ramoAtividadeSelecionado = getSelectedValue(comboRamoAtividade);

            // Tratamento seguro para evitar NullPointerException
            Double valorMaxOrcamento = null;
            if (txtValorMaxOrcamento != null && !txtValorMaxOrcamento.getText().trim().isEmpty()) {
                valorMaxOrcamento = getDoubleValue(txtValorMaxOrcamento, "Valor Máx. do Orçamento");
                // Registre o valor para depuração
                LOGGER.info("Valor máximo informado pelo usuário: " + valorMaxOrcamento);
            } else {
                LOGGER.info("Campo de valor máximo vazio, usando valor padrão");
            }

            Integer qtdeMaxItens = null;
            if (txtQtdeMaxItens != null) {
                qtdeMaxItens = getIntegerValue(txtQtdeMaxItens, "Qtde Máx. Itens no Orçamento");
                if (qtdeMaxItens == null) {
                    AlertUtil.showAlert("Informe a quantidade máxima de itens no orçamento!", Alert.AlertType.WARNING);
                    txtQtdeMaxItens.requestFocus();
                    return null;
                }
            }

            FilialDTO filialDTO = comboFilial.getSelectionModel().getSelectedItem();
            String filialSelecionada = filialDTO != null ? filialDTO.toString() : "";

            // Extração de valores dos combos de objetos com verificação de nulos
            String planoPagamentoSelecionado = getValorComboDTO(
                    comboPlanoPagamento,
                    dto -> dto != null && dto.getCodigo() != null ? dto.getCodigo().toString() : null
            );

            String cobrancaSelecionada = getValorComboDTO(
                    comboCobranca,
                    dto -> dto != null ? dto.getCodigo() : null
            );

            // Monta o modelo de parâmetros
            ParametrosModel parametros = new ParametrosModel(
                    clienteSelecionado,
                    filialSelecionada,
                    pracaSelecionada,
                    ramoAtividadeSelecionado,
                    planoPagamentoSelecionado,
                    cobrancaSelecionada,
                    rcaSelecionado,
                    supervisorSelecionado,
                    qtdeMaxItens,
                    valorMaxOrcamento // Se null, o model assume o valor padrão
            );

            // Registre o valor após criar o modelo para verificar se foi preservado
            LOGGER.info("Valor máximo no ParametrosModel: " + parametros.getValorMaxOrcamento());

            // Define o tipo de preço (C = Custo, V = Venda)
            parametros.setTipoPreco((cbPrecoCusto != null && cbPrecoCusto.isSelected()) ? "C" : "V");

            return parametros;
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao criar modelo de parâmetros", e);
            AlertUtil.showAlert("Erro ao processar os parâmetros: " + e.getMessage(), Alert.AlertType.ERROR);
            return null;
        }
    }

    /**
     * Handler para o botão Avançar
     */
    @FXML
    public void onAvancar(ActionEvent event) {
        try {
            if (!validarCampos()) {
                return;
            }

            ParametrosModel parametros = criarParametrosModel();
            if (parametros == null) {
                AlertUtil.showAlert("Não foi possível criar os parâmetros. Verifique os dados informados.",
                        Alert.AlertType.ERROR);
                return;
            }

            abrirTelaDepartamentos(parametros);
        } catch (NullPointerException e) {
            LOGGER.log(Level.SEVERE, "Erro de referência nula ao avançar para próxima tela", e);
            AlertUtil.showAlert("Um campo obrigatório não foi inicializado corretamente. Detalhes: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao avançar para próxima tela", e);
            AlertUtil.showAlert("Erro ao processar a solicitação: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    /**
     * Validação adicional verificando se os campos obrigatórios estão inicializados
     */
    private boolean verificarInicializacaoCampos() {
        StringBuilder mensagemErro = new StringBuilder("Os seguintes campos não foram inicializados corretamente:\n");
        boolean todosInicializados = true;

        if (tfCliente == null) {
            mensagemErro.append("- Campo Cliente\n");
            todosInicializados = false;
        }

        if (comboFilial == null) {
            mensagemErro.append("- Combo Filial\n");
            todosInicializados = false;
        }

        if (comboRCA == null) {
            mensagemErro.append("- Combo RCA\n");
            todosInicializados = false;
        }

        if (txtQtdeMaxItens == null) {
            mensagemErro.append("- Campo Quantidade Máxima de Itens\n");
            todosInicializados = false;
        }

        if (cbPrecoCusto == null || cbPrecoVenda == null) {
            mensagemErro.append("- Checkboxes de tipo de preço\n");
            todosInicializados = false;
        }

        if (!todosInicializados) {
            LOGGER.log(Level.SEVERE, mensagemErro.toString());
            AlertUtil.showAlert(mensagemErro.toString() + "\nPor favor, contate o suporte técnico.",
                    Alert.AlertType.ERROR);
        }

        return todosInicializados;
    }

    /**
     * Valida os campos obrigatórios antes de avançar
     */
    private boolean validarCampos() {
        // Verificar inicialização dos campos obrigatórios
        if (!verificarInicializacaoCampos()) {
            return false;
        }

        // Validação: Cliente
        if (clienteSelecionadoManual == null) {
            AlertUtil.showAlert("Selecione um cliente antes de continuar!", Alert.AlertType.WARNING);
            tfCliente.requestFocus();
            return false;
        }

        // Validação: Filial
        FilialDTO filialDTO = comboFilial.getSelectionModel().getSelectedItem();
        if (filialDTO == null || filialDTO.getCodigo() == null) {
            AlertUtil.showAlert("Selecione uma filial antes de continuar!", Alert.AlertType.WARNING);
            comboFilial.requestFocus();
            return false;
        }

        // Validação: RCA
        if (getSelectedValue(comboRCA) == null) {
            AlertUtil.showAlert("Selecione um RCA antes de continuar!", Alert.AlertType.WARNING);
            comboRCA.requestFocus();
            return false;
        }

        // Validação: Quantidade máxima de itens
        Integer qtdeMaxItens = getIntegerValue(txtQtdeMaxItens, "Qtde Máx. Itens no Orçamento");
        if (qtdeMaxItens == null) {
            AlertUtil.showAlert("Informe a quantidade máxima de itens no orçamento!", Alert.AlertType.WARNING);
            txtQtdeMaxItens.requestFocus();
            return false;
        }

        // Validação: Tipo de preço
        if (!cbPrecoCusto.isSelected() && !cbPrecoVenda.isSelected()) {
            AlertUtil.showAlert("Selecione o tipo de preço (Custo ou Venda)!", Alert.AlertType.WARNING);
            cbPrecoCusto.requestFocus();
            return false;
        }

        return true;
    }

    /**
     * Extrai um valor de um combobox de DTOs usando uma função extratora
     * com verificação adicional de nulos
     */
    private <T, R> R getValorComboDTO(ComboBox<T> comboBox, Function<T, R> extrator) {
        if (comboBox == null) {
            LOGGER.log(Level.WARNING, "ComboBox é nulo ao tentar extrair valor");
            return null;
        }

        try {
            T selectedItem = comboBox.getSelectionModel().getSelectedItem();
            return (selectedItem != null) ? extrator.apply(selectedItem) : null;
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao extrair valor do ComboBox", e);
            return null;
        }
    }

    /**
     * Obtém o valor selecionado de um ComboBox desconsiderando a opção padrão
     * com verificação adicional de nulos
     */
    private String getSelectedValue(ComboBox<String> comboBox) {
        if (comboBox == null) {
            LOGGER.log(Level.WARNING, "ComboBox é nulo ao tentar obter valor selecionado");
            return null;
        }

        try {
            String value = comboBox.getSelectionModel().getSelectedItem();
            return (value != null && !value.equals(OPCAO_PADRAO)) ? value : null;
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao obter valor selecionado do ComboBox", e);
            return null;
        }
    }

    /**
     * Fecha a janela atual
     */
    @FXML
    public void closeWindow(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.close();

            // Liberar recursos JPA ao fechar a aplicação se necessário
            // JPAUtil.closeEntityManagerFactory();
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao fechar janela", e);
        }
    }

    /**
     * Minimiza a janela atual
     */
    @FXML
    public void minimizeWindow(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setIconified(true);
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao minimizar janela", e);
        }
    }
}