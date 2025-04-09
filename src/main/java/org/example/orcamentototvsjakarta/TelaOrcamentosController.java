package org.example.orcamentototvsjakarta;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.orcamentototvsjakarta.model.OrcamentoModel;
import org.example.orcamentototvsjakarta.db.entidade.Pcorcavendac;
import org.example.orcamentototvsjakarta.util.AlertUtil;
import org.example.orcamentototvsjakarta.util.JPAUtil;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Controller da tela de orçamentos gerados.
 * Apresenta os orçamentos em uma tabela e permite visualizar seus itens.
 */
public class TelaOrcamentosController {
    private static final Logger LOGGER = Logger.getLogger(TelaOrcamentosController.class.getName());

    // Componentes FXML
    @FXML private TableView<OrcamentoModel> tableOrcamentos;
    @FXML private TableColumn<OrcamentoModel, Long> colNumero;
    @FXML private TableColumn<OrcamentoModel, LocalDate> colData;
    @FXML private TableColumn<OrcamentoModel, BigDecimal> colValorTotal;
    @FXML private TableColumn<OrcamentoModel, Integer> colCliente;
    @FXML private TableColumn<OrcamentoModel, Short> colUsuario;
    @FXML private TableColumn<OrcamentoModel, BigDecimal> colDesconto;

    // Dados
    private final ObservableList<OrcamentoModel> orcamentos = FXCollections.observableArrayList();

    // Formatadores
    private final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /**
     * Inicializa o controller após a injeção dos componentes FXML
     */
    @FXML
    private void initialize() {
        configurarColunas();
        configurarTabela();
        carregarTodosOrcamentos();
    }

    /**
     * Configura as colunas da tabela
     */
    private void configurarColunas() {
        // Configuração de cell value factories
        colNumero.setCellValueFactory(new PropertyValueFactory<>("id"));
        colData.setCellValueFactory(new PropertyValueFactory<>("data"));
        colValorTotal.setCellValueFactory(new PropertyValueFactory<>("vltotal"));
        colCliente.setCellValueFactory(new PropertyValueFactory<>("codcli"));
        colUsuario.setCellValueFactory(new PropertyValueFactory<>("codusur"));
        colDesconto.setCellValueFactory(new PropertyValueFactory<>("vldesconto"));

        // Formatação de células
        configurarFormatacoesTabela();
    }

    /**
     * Configura as formatações personalizadas para as colunas
     */
    private void configurarFormatacoesTabela() {
        // Máscara de valor monetário - colValorTotal
        colValorTotal.setCellFactory(column -> new TableCell<>() {
            @Override
            protected void updateItem(BigDecimal value, boolean empty) {
                super.updateItem(value, empty);
                setText((empty || value == null) ? null : currencyFormat.format(value));
            }
        });

        // Máscara de valor monetário - colDesconto
        colDesconto.setCellFactory(column -> new TableCell<>() {
            @Override
            protected void updateItem(BigDecimal value, boolean empty) {
                super.updateItem(value, empty);
                setText((empty || value == null) ? null : currencyFormat.format(value));
            }
        });

        // Máscara de data - colData
        colData.setCellFactory(column -> new TableCell<>() {
            @Override
            protected void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                setText((empty || date == null) ? null : date.format(dateFormatter));
            }
        });
    }

    /**
     * Configura comportamentos da tabela
     */
    private void configurarTabela() {
        // Configuração para detectar o duplo clique e abrir a tela de itens
        tableOrcamentos.setRowFactory(tv -> {
            TableRow<OrcamentoModel> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (!row.isEmpty())) {
                    OrcamentoModel selected = row.getItem();
                    abrirTelaItensOrcamento(selected.getId());
                }
            });
            return row;
        });

        // Configurar placeholder para tabela vazia
        tableOrcamentos.setPlaceholder(new Label("Nenhum orçamento disponível"));

        // Vincular dados à tabela
        tableOrcamentos.setItems(orcamentos);
    }

    /**
     * Carrega todos os orçamentos do banco de dados
     */
    private void carregarTodosOrcamentos() {
        EntityManager em = null;
        try {
            em = JPAUtil.getEntityManager();

            List<Pcorcavendac> resultados = em.createQuery(
                            "SELECT o FROM Pcorcavendac o ORDER BY o.id DESC", Pcorcavendac.class)
                    .setMaxResults(100) // Limita a 100 resultados por questão de performance
                    .getResultList();

            orcamentos.clear();
            for (Pcorcavendac o : resultados) {
                orcamentos.add(new OrcamentoModel(
                        o.getId(), o.getData(), o.getVltotal(),
                        o.getCodcli(), o.getCodusur(), o.getVldesconto()));
            }

            LOGGER.info("Carregados " + orcamentos.size() + " orçamentos");
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar orçamentos", ex);
            AlertUtil.showAlert("Erro ao carregar orçamentos: " + ex.getMessage(),
                    Alert.AlertType.ERROR);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }



    /**
     * Abre a tela de detalhes dos itens do orçamento
     *
     * @param orcamentoId ID do orçamento a ser visualizado
     */
    private void abrirTelaItensOrcamento(Long orcamentoId) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaItensOrcamento.fxml"));
            Parent root = loader.load();

            TelaItensOrcamentoController itensController = loader.getController();

            Stage stage = new Stage();
            stage.setTitle("Itens do Orçamento #" + orcamentoId);
            stage.setScene(new Scene(root));

            // Mostrar a janela antes de chamar setOrcamentoId para garantir que a Scene esteja disponível
            stage.show();

            // Definir o ID do orçamento após mostrar a janela
            itensController.setOrcamentoId(orcamentoId);

            LOGGER.info("Aberta tela de itens para o orçamento " + orcamentoId);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao abrir tela de itens", e);
            AlertUtil.showAlert("Erro ao abrir tela de itens: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
    }

    /**
     * Fecha a tela atual
     */
    @FXML
    private void onVoltar() {
        Stage stage = (Stage) tableOrcamentos.getScene().getWindow();
        stage.close();
    }

    /**
     * Define os orçamentos a serem exibidos com base nos IDs gerados
     *
     * @param numorcasGerados String com IDs de orçamentos separados por vírgula
     */
    public void setNumorcasGerados(String numorcasGerados) {
        if (numorcasGerados == null || numorcasGerados.isEmpty()) {
            LOGGER.warning("Nenhum orçamento informado para carregar");
            return;
        }

        EntityManager em = null;
        try {
            em = JPAUtil.getEntityManager();

            // Converter string de IDs para lista de Long
            List<Long> ids = Arrays.stream(numorcasGerados.split(","))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .map(Long::parseLong)
                    .collect(Collectors.toList());

            if (ids.isEmpty()) {
                LOGGER.warning("Lista de IDs de orçamentos está vazia após parse");
                return;
            }

            LOGGER.info("Carregando orçamentos com IDs: " + ids);

            // Buscar orçamentos pelo ID
            List<Pcorcavendac> resultados = em.createQuery(
                            "SELECT o FROM Pcorcavendac o WHERE o.id IN :ids ORDER BY o.id",
                            Pcorcavendac.class)
                    .setParameter("ids", ids)
                    .getResultList();

            // Atualizar a tabela
            orcamentos.clear();
            for (Pcorcavendac o : resultados) {
                orcamentos.add(new OrcamentoModel(
                        o.getId(), o.getData(), o.getVltotal(),
                        o.getCodcli(), o.getCodusur(), o.getVldesconto()));
            }

            LOGGER.info("Carregados " + orcamentos.size() + " orçamentos específicos");

            if (orcamentos.isEmpty()) {
                AlertUtil.showAlert("Nenhum orçamento encontrado com os IDs informados.",
                        Alert.AlertType.WARNING);
            }
        } catch (NumberFormatException e) {
            LOGGER.log(Level.WARNING, "Erro ao converter IDs de orçamentos", e);
            AlertUtil.showAlert("Formato inválido de IDs de orçamentos: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar orçamentos específicos", e);
            AlertUtil.showAlert("Erro ao carregar orçamentos: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Retorna ao menu principal (tela de parâmetros)
     */
    @FXML
    private void onVoltarMenu() {
        try {
            // Fecha a tela atual
            Stage stageAtual = (Stage) tableOrcamentos.getScene().getWindow();
            stageAtual.close();

            // Abre a tela inicial (TelaParametros)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaParametros12.fxml"));
            Parent root = loader.load();

            Stage novaStage = new Stage();
            novaStage.setTitle("Novo Orçamento");
            novaStage.setScene(new Scene(root));
            novaStage.initStyle(StageStyle.UNDECORATED);
            novaStage.show();

            LOGGER.info("Retornando ao menu principal");
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao abrir tela de parâmetros", e);
            AlertUtil.showAlert("Erro ao retornar ao menu principal: " + e.getMessage(),
                    Alert.AlertType.ERROR);
        }
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