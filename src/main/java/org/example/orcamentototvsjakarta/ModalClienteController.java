package org.example.orcamentototvsjakarta;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import org.example.orcamentototvsjakarta.DTO.ClienteDTO;
import org.example.orcamentototvsjakarta.db.dao.PcclientDAO;
import org.example.orcamentototvsjakarta.util.AlertUtil;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Controller do modal de pesquisa e seleção de cliente.
 */
public class ModalClienteController {
    private static final Logger LOGGER = Logger.getLogger(ModalClienteController.class.getName());
    private static final int LIMITE_RESULTADOS = 50;

    @FXML private TextField txtFiltro;
    @FXML private TableView<ClienteDTO> tabelaClientes;
    @FXML private TableColumn<ClienteDTO, Integer> colCodigo;
    @FXML private TableColumn<ClienteDTO, String> colNome;
    @FXML private TableColumn<ClienteDTO, String> colCnpj;
    @FXML private Button btnBuscar;
    @FXML private Button btnSelecionar;
    @FXML private Button btnCancelar;

    private final PcclientDAO dao = new PcclientDAO();
    private ClienteDTO clienteSelecionado;

    /**
     * Inicializa o controller após a injeção dos componentes FXML
     */
    @FXML
    public void initialize() {
        try {
            configurarColunas();
            configurarEventos();
            configurarBuscarAoEntrar();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao inicializar o modal de cliente", e);
            AlertUtil.showAlert("Erro ao inicializar a tela de busca de cliente. Detalhes: " + e.getMessage(),
                    Alert.AlertType.ERROR);

            // Desabilitar interações em caso de erro crítico
            if (txtFiltro != null) txtFiltro.setDisable(true);
            if (btnBuscar != null) btnBuscar.setDisable(true);
            if (tabelaClientes != null) tabelaClientes.setDisable(true);
        }
    }


    /**
     * Configura as colunas da tabela
     */
    private void configurarColunas() {
        colCodigo.setCellValueFactory(data -> new SimpleObjectProperty<>(data.getValue().getCodcli()));
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome()));
        colCnpj.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getCnpjFormatado()));
    }

    /**
     * Configura os eventos de interação com a tabela e outros componentes
     */
    private void configurarEventos() {
        // Configuração de duplo-clique para selecionar cliente
        tabelaClientes.setRowFactory(tv -> {
            TableRow<ClienteDTO> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && !row.isEmpty()) {
                    clienteSelecionado = row.getItem();
                    fechar();
                }
            });
            return row;
        });

        // Habilitar ou desabilitar botão de selecionar com base na seleção da tabela
        tabelaClientes.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> btnSelecionar.setDisable(newValue == null));

        // Configurar tecla Enter para buscar quando o foco estiver no campo de filtro
        txtFiltro.setOnKeyPressed(this::verificarTeclaEnterFiltro);
    }

    /**
     * Configura para buscar ao abrir o modal, se houver texto no filtro
     */
    private void configurarBuscarAoEntrar() {
        // Focar o campo de filtro ao iniciar
        txtFiltro.requestFocus();

        // Executa busca inicial (vazia para mostrar todos)
        executarBusca();
    }

    /**
     * Verifica se a tecla Enter foi pressionada no campo de filtro
     */
    private void verificarTeclaEnterFiltro(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            executarBusca();
            event.consume();
        }
    }

    /**
     * Executa a busca de clientes com base no texto do filtro
     */
    private void executarBusca() {
        try {
            String filtro = txtFiltro.getText().trim();
            LOGGER.info("Buscando clientes com filtro: " + filtro);

            // Verificar se DAO está disponível
            if (dao == null) {
                throw new IllegalStateException("Componente de acesso a dados não inicializado");
            }

            List<ClienteDTO> resultados = dao.buscarDTOPorFiltro(filtro, LIMITE_RESULTADOS);
            tabelaClientes.setItems(FXCollections.observableArrayList(resultados));

            if (resultados.isEmpty()) {
                LOGGER.info("Nenhum cliente encontrado com o filtro: " + filtro);
                tabelaClientes.setPlaceholder(new Label("Nenhum cliente encontrado com o filtro informado"));
            } else {
                LOGGER.info("Encontrados " + resultados.size() + " clientes");
                tabelaClientes.getSelectionModel().selectFirst();
                tabelaClientes.requestFocus();
            }
        } catch (IllegalStateException e) {
            // Erro específico para problemas de inicialização
            LOGGER.log(Level.SEVERE, "Erro de inicialização", e);
            AlertUtil.showAlert("Não foi possível realizar a busca. Componente não inicializado corretamente.",
                    Alert.AlertType.ERROR);
        } catch (jakarta.persistence.PersistenceException e) {
            // Erro específico de banco de dados
            LOGGER.log(Level.SEVERE, "Erro de banco de dados", e);
            AlertUtil.showAlert("Erro de banco de dados ao buscar clientes. Verifique sua conexão.",
                    Alert.AlertType.ERROR);
        } catch (Exception e) {
            // Erros genéricos
            LOGGER.log(Level.SEVERE, "Erro ao buscar clientes", e);
            AlertUtil.showAlert("Não foi possível completar a busca de clientes.",
                    Alert.AlertType.ERROR);
        }
    }

    /**
     * Método chamado pelo botão Buscar
     */
    @FXML
    public void onBuscar(ActionEvent event) {
        executarBusca();
    }

    /**
     * Método chamado pelo botão Selecionar
     */
    @FXML
    public void onSelecionar(ActionEvent event) {
        try {
            clienteSelecionado = tabelaClientes.getSelectionModel().getSelectedItem();
            if (clienteSelecionado != null) {
                LOGGER.info("Cliente selecionado: " + clienteSelecionado.getCodcli() + " - " + clienteSelecionado.getNome());
                fechar();
            } else {
                AlertUtil.showAlert("Selecione um cliente da tabela", Alert.AlertType.WARNING);
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao selecionar cliente", e);
            AlertUtil.showAlert("Ocorreu um erro ao selecionar o cliente", Alert.AlertType.ERROR);
        }
    }

    /**
     * Método chamado pelo botão Cancelar
     */
    @FXML
    public void onCancelar(ActionEvent event) {
        clienteSelecionado = null;
        fechar();
    }

    /**
     * Fecha o modal
     */
    private void fechar() {
        try {
            Stage stage = (Stage) txtFiltro.getScene().getWindow();
            if (stage != null) {
                stage.close();
            } else {
                LOGGER.warning("Tentativa de fechar janela, mas referência é nula");
            }
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao fechar janela", e);
            // Não exibimos alerta ao usuário já que estamos fechando a janela de qualquer forma
        }
    }

    /**
     * Retorna o cliente selecionado
     */
    public ClienteDTO getClienteSelecionado() {
        return clienteSelecionado;
    }
}