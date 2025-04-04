package org.example.orcamentototvsjakarta;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.example.orcamentototvsjakarta.DTO.*;
import org.example.orcamentototvsjakarta.db.dao.*;
import org.example.orcamentototvsjakarta.model.ParametrosModel;

import java.net.URL;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TelaParametrosController extends Application {

    @FXML private ComboBox<String>  comboCliente, comboPraca, comboRCA, comboSupervisor, comboRamoAtividade;
    @FXML private TextField txtQtdeMaxItens, txtValorMaxOrcamento;
    @FXML private Button btnAvancar;
    @FXML private TextField tfCliente;
    @FXML private CheckBox cbPrecoCusto, cbPrecoVenda;
    @FXML private ComboBox<FilialDTO> comboFilial;
    @FXML private ComboBox<FuncionarioDTO> comboFuncionario;
    @FXML private ComboBox<CobrancaDTO> comboCobranca;
    @FXML private ComboBox<PlanoPagamentoDTO> comboPlanoPagamento;


    private final PcfilialDAO pcfilialDAO = new PcfilialDAO();
    private final PcclientDAO pcclientDAO = new PcclientDAO();
    private final PcplpagDAO pcplpagDAO = new PcplpagDAO();
    private final PccobDAO pccobDAO = new PccobDAO();
    private final PcusuariDAO pcusuariDAO = new PcusuariDAO();
    private final PcemprDAO pcemprDAO = new PcemprDAO();
    private ClienteDTO clienteSelecionadoManual = null;


    @Override
    public void start(Stage primaryStage) throws Exception {

    }

    @FXML
    public void initialize() {
        carregarDados();
        //comboCliente.setOnAction(event -> carregarDadosRelacionadosCliente());
        comboRCA.setOnAction(event -> onRCASelecionado());
        btnAvancar.setOnAction(event -> onAvancar());

        // Listener de foco do campo tfCliente
        tfCliente.focusedProperty().addListener((obs, antigo, novo) -> {
            if (!novo) { // perdeu o foco
                buscarClientePorCodigoDigitado();
            }
        });

        try {
            ClienteDTO clienteDefault = pcclientDAO.buscarDTOporCodigo(2);
            if (clienteDefault != null) {
                clienteSelecionadoManual = clienteDefault;
                tfCliente.setText(clienteDefault.toString());
                carregarDadosRelacionadosCliente(clienteDefault.getCodcli());
            }
        } catch (Exception e) {
            showAlert("Erro ao carregar cliente padrão: " + e.getMessage(), Alert.AlertType.ERROR);
        }

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

    private void carregarDados() {
        //carregarDadosClientes();
        carregarDadosFiliais();

        carregarOpcoesRCA();
        carregarOpcoesFuncionarios();

        comboPraca.setDisable(true);
        comboRamoAtividade.setDisable(true);
        comboPlanoPagamento.setDisable(true);
        comboCobranca.setDisable(true);
        comboSupervisor.setDisable(true);
    }

    private void carregarDadosClientes() {
        try {
            List<String> clientes = pcclientDAO.buscarTodosDTO().stream()
                    .sorted(Comparator.comparing(ClienteDTO::getCodcli))
                    .map(ClienteDTO::toString)
                    .collect(Collectors.toList());

            carregarComboBox(comboCliente, clientes);
        } catch (Exception e) {
            showAlert("Erro ao carregar clientes: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


    // Método para abrir a janela modal de pesquisa de cliente
    private void onPesquisarCliente() {
        try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/modalCliente.fxml"));
            Parent root = loader.load();

            ModalClienteController controller = loader.getController();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Pesquisar Cliente");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

            ClienteDTO clienteSelecionado = controller.getClienteSelecionado();
            if (clienteSelecionado != null) {
                clienteSelecionadoManual = clienteSelecionado;
                tfCliente.setText(clienteSelecionado.toString());
                carregarDadosRelacionadosCliente(clienteSelecionadoManual.getCodcli());
            }

        } catch (Exception e) {
            showAlert("Erro ao abrir modal de cliente: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


    private void buscarClientePorCodigoDigitado() {
        String texto = tfCliente.getText().trim();

        if (texto.isEmpty()) {
            clienteSelecionadoManual = null;
            return;
        }

        try {
            Integer codcli = Integer.parseInt(texto.replaceAll("[^0-9]", ""));
            ClienteDTO cliente = pcclientDAO.buscarDTOporCodigo(codcli);


            if (cliente != null) {
                clienteSelecionadoManual = cliente;
                tfCliente.setText(cliente.toString());
                carregarDadosRelacionadosCliente(cliente.getCodcli());
            } else {
                showAlert("Cliente não encontrado para o código informado!", Alert.AlertType.WARNING);
                tfCliente.clear();
                clienteSelecionadoManual = null;
            }

        } catch (NumberFormatException e) {
            showAlert("Informe apenas o código numérico do cliente.", Alert.AlertType.WARNING);
            tfCliente.clear();
            clienteSelecionadoManual = null;
        } catch (Exception e) {
            showAlert("Erro ao buscar cliente: " + e.getMessage(), Alert.AlertType.ERROR);
            tfCliente.clear();
            clienteSelecionadoManual = null;
        }
    }

    public void abrirModalPesquisa(ActionEvent actionEvent) {
        onPesquisarCliente();
    }

    private void carregarComboBoxFilial(ComboBox<FilialDTO> comboBox, List<FilialDTO> valores) {
        comboBox.setItems(FXCollections.observableArrayList(valores));
        comboBox.getItems().add(0, new FilialDTO(null, "Selecione..."));
        comboBox.getSelectionModel().selectFirst();
    }


    private void carregarDadosFiliais() {
        try {
            List<FilialDTO> filiais = pcfilialDAO.buscarTodas().stream()
                    .sorted(Comparator.comparing(pcfilial -> pcfilial.getId().getCodigo()))
                    .map(pcfilial -> new FilialDTO(pcfilial.getId().getCodigo(), pcfilial.getRazaosocial()))
                    .collect(Collectors.toList());

            carregarComboBoxFilial(comboFilial, filiais);
        } catch (Exception e) {
            showAlert("Erro ao carregar filiais: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


private void carregarDadosRelacionadosCliente(Integer codcli) {
    if (codcli == null) {
        comboPraca.setValue(null);
        comboRamoAtividade.setValue(null);
        comboPlanoPagamento.getSelectionModel().clearSelection();
        comboCobranca.getSelectionModel().clearSelection();
        return;
    }

    comboPraca.setDisable(false);
    comboRamoAtividade.setDisable(false);
    comboPlanoPagamento.setDisable(false);
    comboCobranca.setDisable(false);

    try {
        Integer codPraca = pcclientDAO.buscarPracaPorCliente(codcli);
        Integer codRamo = pcclientDAO.buscarRamoAtividadePorCliente(codcli);
        Short codPlano = pcclientDAO.buscarPlanoPagamentoPorCliente(codcli);
        String codCobranca = pcclientDAO.buscarCobrancaPorCliente(codcli);

        comboPraca.setValue(codPraca != null ? codPraca.toString() : "Não informado");
        comboRamoAtividade.setValue(codRamo != null ? codRamo.toString() : "Não informado");

        carregarOpcoesCobranca(codCobranca);
        carregarOpcoesPlanoPagamento(codPlano != null ? codPlano.intValue() : null);

        comboPraca.setDisable(true);
        comboRamoAtividade.setDisable(true);

    } catch (Exception e) {
        showAlert("Erro ao carregar dados do cliente: " + e.getMessage(), Alert.AlertType.ERROR);
    }
}

    private void carregarComboBoxFuncionario(ComboBox<FuncionarioDTO> comboBox, List<FuncionarioDTO> valores) {
        comboBox.setItems(FXCollections.observableArrayList(valores));
        comboBox.getItems().add(0, new FuncionarioDTO(null, "Selecione..."));
        comboBox.getSelectionModel().selectFirst();
    }


    private void carregarOpcoesFuncionarios() {
        try {
            List<FuncionarioDTO> funcionarios = pcemprDAO.listarTodos().stream()
                    .sorted(Comparator.comparing(pcempr -> pcempr.getId()))
                    .map(pcempr -> new FuncionarioDTO(pcempr.getId(), pcempr.getNome()))
                    .collect(Collectors.toList());

            carregarComboBoxFuncionario(comboFuncionario, funcionarios);
        } catch (Exception e) {
            showAlert("Erro ao carregar funcionários: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


    private void carregarComboBoxCobranca(ComboBox<CobrancaDTO> comboBox, List<CobrancaDTO> valores) {
        comboBox.setItems(FXCollections.observableArrayList(valores));
        comboBox.getItems().add(0, new CobrancaDTO(null, "Selecione..."));
        comboBox.getSelectionModel().selectFirst();
    }


    private void carregarOpcoesCobranca(String codCobrancaCliente) {
        try {
            List<CobrancaDTO> cobrancas = pccobDAO.buscarTodos().stream()
                    .sorted(Comparator.comparing(pccob -> pccob.getCodcob()))
                    .map(pccob -> new CobrancaDTO(pccob.getCodcob(), pccob.getCobranca()))
                    .collect(Collectors.toList());

            carregarComboBoxCobranca(comboCobranca, cobrancas);

            if (codCobrancaCliente != null) {
                for (CobrancaDTO dto : cobrancas) {
                    if (dto.getCodigo().equals(codCobrancaCliente)) {
                        comboCobranca.getSelectionModel().select(dto);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            showAlert("Erro ao carregar cobranças: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void carregarComboBoxPlanoPagamento(ComboBox<PlanoPagamentoDTO> comboBox, List<PlanoPagamentoDTO> valores) {
        comboBox.setItems(FXCollections.observableArrayList(valores));
        comboBox.getItems().add(0, new PlanoPagamentoDTO(null, "Selecione..."));
        comboBox.getSelectionModel().selectFirst();
    }


    private void carregarOpcoesPlanoPagamento(Integer codPlanoPagamentoCliente) {
        try {
            List<PlanoPagamentoDTO> planos = pcplpagDAO.buscarTodos().stream()
                    .sorted(Comparator.comparing(pcplpag -> pcplpag.getId()))
                    .map(pcplpag -> new PlanoPagamentoDTO(Integer.valueOf(pcplpag.getId()), pcplpag.getDescricao()))
                    .collect(Collectors.toList());

            carregarComboBoxPlanoPagamento(comboPlanoPagamento, planos);

            if (codPlanoPagamentoCliente != null) {
                for (PlanoPagamentoDTO dto : planos) {
                    if (dto.getCodigo().equals(codPlanoPagamentoCliente)) {
                        comboPlanoPagamento.getSelectionModel().select(dto);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            showAlert("Erro ao carregar planos de pagamento: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


    private void carregarOpcoesRCA() {
        try {
            List<String> rcas = pcusuariDAO.buscarTodos().stream()
                    .sorted(Comparator.comparing(pcusuari -> pcusuari.getId()))
                    .map(pcusuari -> pcusuari.getId() + " - " + pcusuari.getNome())
                    .collect(Collectors.toList());

            carregarComboBox(comboRCA, rcas);
        } catch (Exception e) {
            showAlert("Erro ao carregar RCA: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


    private void carregarComboBox(ComboBox<String> comboBox, List<String> valores) {
        comboBox.setItems(FXCollections.observableArrayList(valores));
        comboBox.getItems().add(0, "Selecione...");
        comboBox.getSelectionModel().selectFirst();
    }

    private void carregarComboBox2(ComboBox<String> comboBox, String valor) {
        comboBox.getItems().clear(); // Limpa itens anteriores
        comboBox.getItems().add(valor); // Adiciona o único valor
        comboBox.getSelectionModel().selectFirst(); // Seleciona automaticamente
    }



    private void onRCASelecionado() {
        String rcaSelecionado = comboRCA.getSelectionModel().getSelectedItem();

        if (rcaSelecionado != null && !rcaSelecionado.equals("Selecione...")) {
            // Obtém o código do RCA (antes do " - ")
            Short codRCA = Short.parseShort(rcaSelecionado.split(" - ")[0]);

            // Buscar o código do supervisor associado ao RCA
            Short codSupervisor = pcusuariDAO.buscarSupervisorPorRCA(codRCA);

            if (codSupervisor != null) {
                comboSupervisor.setValue(codSupervisor.toString());
            } else {
                comboSupervisor.setValue("Não informado");
            }

            // Torna o campo Supervisor não editável
            //comboSupervisor.setDisable(true);
        } else {
            comboSupervisor.setValue(null);
            comboSupervisor.setDisable(false);
        }
    }

    private void onAvancar() {
        // Validação: Cliente
        if (clienteSelecionadoManual == null) {
            showAlert("Selecione um cliente antes de continuar!", Alert.AlertType.WARNING);
            return;
        }

        // Extração dos parâmetros
        String clienteSelecionado = clienteSelecionadoManual.toString();
        String rcaSelecionado = getSelectedValue(comboRCA);
        String supervisorSelecionado = getSelectedValue(comboSupervisor);
        String pracaSelecionada = getSelectedValue(comboPraca);
        String ramoAtividadeSelecionado = getSelectedValue(comboRamoAtividade);
        Double valorMaxOrcamento = getDoubleValue(txtValorMaxOrcamento, "Valor Máx. do Orçamento");

        // Validação: Filial
        FilialDTO filialDTO = comboFilial.getSelectionModel().getSelectedItem();
        if (filialDTO == null || filialDTO.getCodigo() == null) {
            showAlert("Selecione uma filial antes de continuar!", Alert.AlertType.WARNING);
            return;
        }
        String filialSelecionada = filialDTO.toString();

        // Validação: RCA
        if (rcaSelecionado == null) {
            showAlert("Selecione um RCA antes de continuar!", Alert.AlertType.WARNING);
            return;
        }

        // Validação: Quantidade máxima de itens
        Integer qtdeMaxItens = getIntegerValue(txtQtdeMaxItens, "Qtde Máx. Itens no Orçamento");
        if (qtdeMaxItens == null) {
            showAlert("Informe a quantidade máxima de itens no orçamento!", Alert.AlertType.WARNING);
            return;
        }

        // Plano de pagamento
        PlanoPagamentoDTO planoDTO = comboPlanoPagamento.getSelectionModel().getSelectedItem();
        String planoPagamentoSelecionado = (planoDTO != null && planoDTO.getCodigo() != null)
                ? planoDTO.getCodigo().toString()
                : null;

        // Cobrança
        CobrancaDTO cobrancaDTO = comboCobranca.getSelectionModel().getSelectedItem();
        String cobrancaSelecionada = (cobrancaDTO != null && cobrancaDTO.getCodigo() != null)
                ? cobrancaDTO.getCodigo()
                : null;

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
                valorMaxOrcamento // Se null, o model assume o valor padrão (10.000)
        );

        // Define o tipo de preço (C = Custo, V = Venda)
        if (cbPrecoCusto.isSelected()) {
            parametros.setTipoPreco("C");
        } else if (cbPrecoVenda.isSelected()) {
            parametros.setTipoPreco("V");
        } else {
            showAlert("Selecione o tipo de preço (Custo ou Venda)!", Alert.AlertType.WARNING);
            return;
        }

        // Abre a próxima tela
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaDepartamentos16.fxml"));
            Parent root = loader.load();

            TelaDepartamentoController controller = loader.getController();
            if (controller == null) {
                showAlert("Erro ao carregar controlador da tela de departamentos!", Alert.AlertType.ERROR);
                return;
            }

            controller.setParametrosModel(parametros);

            Stage stage = new Stage();
            stage.setTitle("Departamentos");
            stage.setScene(new Scene(root));
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();

            ((Stage) btnAvancar.getScene().getWindow()).close();

        } catch (Exception e) {
            showAlert("Erro ao carregar próxima tela: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


    private Integer getIntegerValue(TextField field, String fieldName) {
        try {
            return field.getText().trim().isEmpty() ? null : Integer.parseInt(field.getText().trim());
        } catch (NumberFormatException ex) {
            showAlert("Insira um valor numérico válido para '" + fieldName + "'!", Alert.AlertType.ERROR);
            return null;
        }
    }

    private Double getDoubleValue(TextField field, String fieldName) {
        try {
            return field.getText().trim().isEmpty() ? null : Double.parseDouble(field.getText().trim());
        } catch (NumberFormatException ex) {
            showAlert("Insira um valor numérico válido para '" + fieldName + "'!", Alert.AlertType.ERROR);
            return null;
        }
    }

    private String getSelectedValue(ComboBox<String> comboBox) {
        String value = comboBox.getSelectionModel().getSelectedItem();
        return (value != null && !value.equals("Selecione...")) ? value : null;
    }

    private void showAlert(String message, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle("AVISO!");
        alert.setHeaderText(null);
        alert.setContentText(message);
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.setStyle("-fx-background-color:  #0041a6; -fx-border-color: #2980b9; -fx-border-width: 2;");
        dialogPane.lookup(".content").setStyle("-fx-background-color:  #0041a6; -fx-text-fill: white;-fx-font-weight: bold; -fx-font-size: 14pt; -fx-font-family: Arial");
        Button okButton = (Button) dialogPane.lookupButton(ButtonType.OK);
        okButton.setStyle("-fx-background-color: white; -fx-text-fill: white;-fx-cursor: hand; -fx-text-fill: #0041a6;-fx-font-weight: bold;-fx-font-family: Arial");
        dialogPane.setMinHeight(Region.USE_PREF_SIZE);
        dialogPane.setMinWidth(400);
        dialogPane.setPrefHeight(600);
        dialogPane.setPrefWidth(500);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void closeWindow(ActionEvent actionEvent) {
        // Obtém a janela atual e fecha
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    public void minimizeWindow(ActionEvent actionEvent) {
        // Obtém a janela atual e minimiza
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

}
