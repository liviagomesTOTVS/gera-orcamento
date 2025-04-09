package org.example.orcamentototvsjakarta;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import org.example.orcamentototvsjakarta.DTO.OrcamentoParams;
import org.example.orcamentototvsjakarta.db.dao.PctributDAO;
import org.example.orcamentototvsjakarta.db.entidade.Pctribut;
import org.example.orcamentototvsjakarta.model.OrcamentoModel;
import org.example.orcamentototvsjakarta.model.ParametrosModel;
import org.example.orcamentototvsjakarta.model.TributacaoModel;
import org.example.orcamentototvsjakarta.repository.ProdutoRepository;
import org.example.orcamentototvsjakarta.service.OrcamentoService;
import org.example.orcamentototvsjakarta.util.AlertUtil;
import org.example.orcamentototvsjakarta.util.JPAUtil;

import jakarta.persistence.EntityManager;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Controller da tela de seleção de tributações.
 * Permite selecionar as tributações para gerar orçamentos.
 */
public class TelaTributacaoController {

    private static final Logger LOGGER = Logger.getLogger(TelaTributacaoController.class.getName());
    private static final int BATCH_SIZE = 500; // Tamanho de lote para processamento

    // Componentes FXML
    @FXML private ListView<TributacaoModel> listTributacoes;
    @FXML private Button btnProximo;
    @FXML private Button btnAnterior;
    @FXML private Button btnTodos;
    @FXML private Button btnNenhum;
    @FXML private Button btnInverter;

    // Dados e dependências
    private ParametrosModel parametrosModel;
    private List<String> departamentosSelecionados;
    private final PctributDAO pcTributDAO = new PctributDAO();
    private final ObservableList<TributacaoModel> tributacoes = FXCollections.observableArrayList();
    private OrcamentoService orcamentoService;
    private ProdutoRepository produtoRepository;

    /**
     * Inicializa o controller após a injeção dos componentes FXML
     */
    @FXML
    public void initialize() {
        orcamentoService = new OrcamentoService();
        produtoRepository = new ProdutoRepository();
        configurarListView();
        configurarBotoes();
    }

    /**
     * Define o modelo de parâmetros recebido da tela anterior
     *
     * @param parametrosModel Modelo com os parâmetros do orçamento
     */
    public void setParametrosModel(ParametrosModel parametrosModel) {
        this.parametrosModel = Objects.requireNonNull(parametrosModel, "ParametrosModel não pode ser nulo");
    }

    /**
     * Define os departamentos selecionados na tela anterior
     *
     * @param departamentosSelecionados Lista de códigos de departamentos selecionados
     */
    public void setDepartamentosSelecionados(List<String> departamentosSelecionados) {
        this.departamentosSelecionados = Objects.requireNonNull(departamentosSelecionados,
                "Departamentos selecionados não podem ser nulos");
        carregarTributacoes();
    }

    /**
     * Configura os listeners dos botões
     */
    private void configurarBotoes() {
        btnProximo.setOnAction(event -> onProximo());
        btnAnterior.setOnAction(event -> onAnterior());
        btnTodos.setOnAction(event -> selecionarTodos(true));
        btnNenhum.setOnAction(event -> selecionarTodos(false));
        btnInverter.setOnAction(event -> inverterSelecao());
    }

    /**
     * Configura o ListView com o factory personalizado para células
     */
    private void configurarListView() {
        listTributacoes.setItems(tributacoes);
        listTributacoes.setCellFactory(this::criarCelulaPersonalizada);
    }

    /**
     * Cria um ListCell personalizado para as tributações
     */
    private ListCell<TributacaoModel> criarCelulaPersonalizada(ListView<TributacaoModel> listView) {
        return new ListCell<>() {
            private final CheckBox checkBox = new CheckBox();
            private final Label lblCodigo = new Label();
            private final Label lblDescricao = new Label();
            private final HBox hBox = new HBox(10, checkBox, lblCodigo, lblDescricao);

            {
                // Inicialização dos componentes
                configurarComponentesCelula();
            }

            private void configurarComponentesCelula() {
                checkBox.setOnAction(event -> {
                    TributacaoModel tributacao = getItem();
                    if (tributacao != null) {
                        tributacao.setSelecionado(checkBox.isSelected());
                    }
                });
                checkBox.setCursor(Cursor.HAND);
                checkBox.setMinWidth(43);
                lblCodigo.setMinWidth(80);
                lblCodigo.setTextAlignment(TextAlignment.CENTER);
                lblDescricao.setMinWidth(200);
            }

            @Override
            protected void updateItem(TributacaoModel tributacao, boolean empty) {
                super.updateItem(tributacao, empty);
                if (empty || tributacao == null) {
                    setGraphic(null);
                } else {
                    lblCodigo.setText(tributacao.getCodigo().toString());
                    lblDescricao.setText(tributacao.getDescricao());
                    checkBox.setSelected(tributacao.isSelecionado());
                    setGraphic(hBox);
                }
            }
        };
    }

    /**
     * Carrega as tributações do banco de dados
     */
    private void carregarTributacoes() {
        try {
            List<Pctribut> listaTributacoes = pcTributDAO.buscarTodos();
            listaTributacoes.sort(Comparator.comparing(Pctribut::getId));

            tributacoes.clear();
            for (Pctribut trib : listaTributacoes) {
                TributacaoModel model = new TributacaoModel(false, trib.getId(), trib.getMensagem());
                tributacoes.add(model);
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar tributações", e);
            AlertUtil.showAlert("Erro ao carregar tributações: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    /**
     * Seleciona ou deseleciona todas as tributações
     */
    private void selecionarTodos(boolean selecionar) {
        tributacoes.forEach(trib -> trib.setSelecionado(selecionar));
        listTributacoes.refresh();
    }

    /**
     * Inverte a seleção de todas as tributações
     */
    private void inverterSelecao() {
        tributacoes.forEach(trib -> trib.setSelecionado(!trib.isSelecionado()));
        listTributacoes.refresh();
    }

    /**
     * Avança para a próxima tela, gerando os orçamentos
     */
    @FXML
    private void onProximo() {
        EntityManager em = null;
        try {
            // Validar seleções
            if (!validarSelecoes()) {
                return;
            }

            em = JPAUtil.getEntityManager();

            // Exibir indicador de progresso
            btnProximo.setDisable(true);
            btnProximo.setText("Processando...");

            // Extrair dados dos parâmetros
            OrcamentoParams params = criarParametrosOrcamento();

            // Obter tributações e departamentos selecionados
            List<Short> tributacoesSelecionadas = getTributacoesSelecionadas();
            List<Integer> departamentosSelecionados = getDepartamentosSelecionados();

            // Buscar produtos com base nos critérios com paginação
            String produtosString = buscarEFormatarProdutos(em, params, tributacoesSelecionadas, departamentosSelecionados);

            if (produtosString.isEmpty()) {
                AlertUtil.showAlert("Nenhum produto foi selecionado para este cliente.\n" +
                        "Verifique se ele possui tributação válida.", Alert.AlertType.WARNING);
                return;
            }

            // Processar orçamentos
            List<OrcamentoModel> orcamentosCriados = orcamentoService.processarOrcamentos(
                    params, produtosString, params.getValorMaximo().intValue());

            if (orcamentosCriados.isEmpty()) {
                AlertUtil.showAlert("Nenhum orçamento foi criado!", Alert.AlertType.WARNING);
                return;
            }

            // Extrair números dos orçamentos gerados
            String numorcasGerados = orcamentosCriados.stream()
                    .map(orc -> String.valueOf(orc.getId()))
                    .collect(Collectors.joining(","));

            AlertUtil.showAlert("Orçamentos gerados com sucesso!", Alert.AlertType.INFORMATION);

            // Navegar para a tela de orçamentos
            navegarParaTelaOrcamentos(numorcasGerados);

        } catch (NumberFormatException e) {
            LOGGER.log(Level.SEVERE, "Erro ao converter valores", e);
            AlertUtil.showAlert("Erro ao converter valores: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao processar orçamentos", e);
            AlertUtil.showAlert("Erro ao processar orçamentos: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        } finally {
            if (em != null) {
                em.close();
            }
            btnProximo.setDisable(false);
            btnProximo.setText("Próximo");
        }
    }

    /**
     * Busca e formata produtos para processamento, usando paginação
     */
    private String buscarEFormatarProdutos(EntityManager em, OrcamentoParams params,
                                           List<Short> tributacoesSelecionadas,
                                           List<Integer> departamentosSelecionados) {
        StringBuilder produtosConcatenados = new StringBuilder();

        try {
            int offset = 0;
            int pageSize = BATCH_SIZE;
            List<Object[]> produtosPage;

            do {
                produtosPage = produtoRepository.buscarProdutosPaginados(
                        em,
                        params.getCodcli(),
                        params.getCodplpag().shortValue(),
                        params.getCodfilial(),
                        departamentosSelecionados,
                        tributacoesSelecionadas,
                        params.getValorMaximo().intValue(),
                        offset,
                        pageSize
                );

                for (Object[] row : produtosPage) {
                    Integer codProd = ((Number) row[1]).intValue();
                    Double qtUnitEmb = ((Number) row[2]).doubleValue();
                    Double qtEstoque = ((Number) row[3]).doubleValue();
                    Double pUnit = ((Number) row[6]).doubleValue();
                    Double pTabela = ((Number) row[7]).doubleValue();
                    Integer codSt = ((Number) row[8]).intValue();

                    produtosConcatenados.append(codProd).append("|")
                            .append(qtUnitEmb).append("|")
                            .append(qtEstoque).append("|")
                            .append(pUnit).append("|")
                            .append(pTabela).append("|")
                            .append(codSt).append(";");
                }

                offset += pageSize;
            } while (!produtosPage.isEmpty() && produtosPage.size() == pageSize);

            // Remove o último ";" se houver produtos
            if (produtosConcatenados.length() > 0) {
                produtosConcatenados.setLength(produtosConcatenados.length() - 1);
            }

            return produtosConcatenados.toString();

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao buscar produtos", e);
            throw new RuntimeException("Erro ao buscar produtos: " + e.getMessage(), e);
        }
    }

    /**
     * Obtém a lista de tributações selecionadas
     */
    private List<Short> getTributacoesSelecionadas() {
        return tributacoes.stream()
                .filter(TributacaoModel::isSelecionado)
                .map(TributacaoModel::getCodigo)
                .collect(Collectors.toList());
    }

    /**
     * Obtém a lista de departamentos selecionados como inteiros
     */
    private List<Integer> getDepartamentosSelecionados() {
        return departamentosSelecionados.stream()
                .map(dep -> Integer.parseInt(dep.trim()))
                .collect(Collectors.toList());
    }

    /**
     * Valida as seleções de departamentos e tributações
     */
    private boolean validarSelecoes() {
        if (departamentosSelecionados == null || departamentosSelecionados.isEmpty()) {
            AlertUtil.showAlert("Selecione pelo menos um departamento!", Alert.AlertType.WARNING);
            return false;
        }

        List<TributacaoModel> tributacoesSelecionadas = tributacoes.stream()
                .filter(TributacaoModel::isSelecionado)
                .collect(Collectors.toList());

        if (tributacoesSelecionadas.isEmpty()) {
            AlertUtil.showAlert("Selecione pelo menos uma tributação!", Alert.AlertType.WARNING);
            return false;
        }

        return true;
    }

    /**
     * Cria o objeto de parâmetros para geração do orçamento
     */
    private OrcamentoParams criarParametrosOrcamento() {
        try {
            // Extração dos valores dos parâmetros
            int codcli = extrairCodigoNumerico(parametrosModel.getCliente());
            int rca = extrairCodigoNumerico(parametrosModel.getRca());
            int planoPagamento = extrairCodigoNumerico(parametrosModel.getPlanoPagamento());
            int codativ = extrairCodigoNumerico(parametrosModel.getRamoAtividade());
            String cobranca = extrairCodigoTexto(parametrosModel.getCobranca());
            int supervisor = extrairCodigoNumerico(parametrosModel.getSupervisor());
            String filialCode = extrairCodigoTexto(parametrosModel.getFilial());

            int limiteProdutos = parametrosModel.getQtdeMaxItens();
            Double valormax = parametrosModel.getValorMaxOrcamento().doubleValue();
            String tipoPreco = parametrosModel.getTipoPreco();

            // Logs para debug
            LOGGER.info("cobranca: " + cobranca);
            LOGGER.info("filial: " + filialCode);


            // Criar o objeto OrcamentoParams
            OrcamentoParams params = new OrcamentoParams();
            params.setCodcli(codcli);
            params.setCodatv1(codativ);
            params.setCodcob(cobranca);
            params.setCodplpag((short) planoPagamento);
            params.setCodusur((short) rca);
            params.setCodsupervisor((short) supervisor);
            params.setCodfilial(Integer.valueOf(filialCode));


            params.setValorMaximo(valormax);
            params.setTipoPreco(tipoPreco.toUpperCase());
            params.setNumprevenda("0");

            return params;
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao extrair parâmetros", e);
            throw new IllegalArgumentException("Erro ao extrair parâmetros: " + e.getMessage(), e);
        }
    }

    /**
     * Extrai o código numérico de uma string no formato "código - descrição"
     */
    private int extrairCodigoNumerico(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("Valor não pode ser nulo ou vazio");
        }

        // Caso especial para valores como "Não informado"
        if (texto.equals("Não informado")) {
            return 0;
        }

        // Extrai apenas a parte antes do " - "
        String[] partes = texto.split(" - ", 2);
        String codigoTexto = partes[0].trim();

        try {
            return Integer.parseInt(codigoTexto);
        } catch (NumberFormatException e) {
            LOGGER.log(Level.SEVERE, "Não foi possível converter para número: " + codigoTexto, e);
            throw new IllegalArgumentException("Valor inválido: " + codigoTexto);
        }
    }

    /**
     * Extrai o código de texto de uma string no formato "código - descrição"
     */
    private String extrairCodigoTexto(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("Valor não pode ser nulo ou vazio");
        }

        // Extrai apenas a parte antes do " - "
        String[] partes = texto.split(" - ", 2);
        return partes[0].trim();
    }

    /**
     * Navega para a tela de orçamentos
     */
    private void navegarParaTelaOrcamentos(String numorcasGerados) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaOrcamentos.fxml"));
        Parent root = loader.load();

        TelaOrcamentosController controller = loader.getController();
        controller.setNumorcasGerados(numorcasGerados);

        Stage stage = (Stage) btnProximo.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    /**
     * Volta para a tela anterior
     */
    private void onAnterior() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaDepartamentos16.fxml"));
            Parent root = loader.load();

            TelaDepartamentoController controller = loader.getController();
            if (controller == null) {
                AlertUtil.showAlert("Erro ao carregar controlador da tela de departamentos!",
                        Alert.AlertType.ERROR);
                return;
            }

            // Passar os parâmetros corretamente ao voltar
            controller.setParametrosModel(parametrosModel);

            Stage novaJanela = new Stage();
            novaJanela.setTitle("Departamentos");
            novaJanela.setScene(new Scene(root));
            novaJanela.show();

            // Fecha a janela atual
            fecharJanelaAtual();

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar tela de departamentos", e);
            AlertUtil.showAlert("Erro ao carregar a tela de departamentos: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    /**
     * Fecha a janela atual
     */
    private void fecharJanelaAtual() {
        Stage janelaAtual = (Stage) btnAnterior.getScene().getWindow();
        janelaAtual.close();
    }

    /**
     * Fecha a janela atual
     */
    @FXML
    public void closeWindow(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    /**
     * Minimiza a janela atual
     */
    @FXML
    public void minimizeWindow(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }
}