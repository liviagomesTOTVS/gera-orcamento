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
        colDesconto.setCellValueFactory(cellData -> {
            OrcamentoModel orcamento = cellData.getValue();
            return orcamento.vldescontoProperty();
        });

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

                if (empty || value == null) {
                    setText(null);
                } else {
                    // Log para diagnóstico
                    LOGGER.fine("Formatando valor de desconto: " + value + " para célula na linha " + getIndex());
                    setText(currencyFormat.format(value));
                }
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
                // Adicionar logs para diagnóstico
                //LOGGER.info("Carregando orçamento #" + o.getId() + ":");
                //LOGGER.info("- Data: " + o.getData());
                //LOGGER.info("- Valor Total: " + o.getVltotal());
                //LOGGER.info("- Cliente: " + o.getCodcli());
                //LOGGER.info("- Usuário: " + o.getCodusur());
                //LOGGER.info("- Desconto: " + o.getVldesconto());

                // Criar o modelo com os valores do banco
                OrcamentoModel orcamento = new OrcamentoModel(
                        o.getId(), o.getData(), o.getVltotal(),
                        o.getCodcli(), o.getCodusur(), o.getVldesconto());

                // Verificar se o valor de desconto foi corretamente atribuído no modelo
                //LOGGER.info("- Desconto atribuído ao modelo: " + orcamento.getVldesconto());

                orcamentos.add(orcamento);
            }

            //LOGGER.info("Carregados " + orcamentos.size() + " orçamentos");
        } catch (Exception ex) {
            // Tratamento de exceções aqui...
            //LOGGER.log(Level.SEVERE, "Erro ao carregar orçamentos", ex);
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
        if (orcamentoId == null) {
            //LOGGER.warning("Tentativa de abrir tela de itens com ID nulo");
            return;
        }

        Stage stage = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaItensOrcamento.fxml"));
            Parent root = loader.load();

            TelaItensOrcamentoController itensController = loader.getController();
            if (itensController == null) {
                throw new IllegalStateException("Controlador da tela de itens não foi inicializado corretamente");
            }

            stage = new Stage();
            stage.setTitle("Itens do Orçamento #" + orcamentoId);
            stage.setScene(new Scene(root));

            stage.setResizable(false);
            Stage finalStage = stage;
            stage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue) {
                    finalStage.setMaximized(false);
                }
            });

            // Mostrar a janela antes de chamar setOrcamentoId para garantir que a Scene esteja disponível
            stage.show();

            // Definir o ID do orçamento após mostrar a janela
            itensController.setOrcamentoId(orcamentoId);

            //LOGGER.info("Aberta tela de itens para o orçamento " + orcamentoId);
        } catch (IOException e) {
            // Erro ao carregar o arquivo FXML
            //LOGGER.log(Level.SEVERE, "Erro ao carregar tela de itens do orçamento", e);
            AlertUtil.showAlert("Não foi possível abrir a tela de itens do orçamento. Arquivo de layout não encontrado.",
                    Alert.AlertType.ERROR);

            // Fechar a janela se ela foi criada mas houve erro no processo
            if (stage != null) {
                stage.close();
            }
        } catch (IllegalStateException e) {
            // Erro específico do controlador
            //LOGGER.log(Level.SEVERE, "Erro de inicialização da tela de itens", e);
            AlertUtil.showAlert("Erro ao inicializar a tela de itens do orçamento.",
                    Alert.AlertType.ERROR);

            if (stage != null) {
                stage.close();
            }
        } catch (Exception e) {
            // Erro genérico
            //LOGGER.log(Level.SEVERE, "Erro inesperado ao abrir tela de itens", e);
            AlertUtil.showAlert("Ocorreu um erro ao abrir os detalhes do orçamento.",
                    Alert.AlertType.ERROR);

            if (stage != null) {
                stage.close();
            }
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
                //LOGGER.warning("Lista de IDs de orçamentos está vazia após parse");
                AlertUtil.showAlert("Nenhum orçamento válido foi gerado.",
                        Alert.AlertType.WARNING);
                return;
            }

            //LOGGER.info("Carregando orçamentos com IDs: " + ids);

            // Buscar orçamentos pelo ID
            List<Pcorcavendac> resultados = em.createQuery(
                            "SELECT o FROM Pcorcavendac o WHERE o.id IN :ids ORDER BY o.id",
                            Pcorcavendac.class)
                    .setParameter("ids", ids)
                    .getResultList();

            // Atualizar a tabela
            orcamentos.clear();
            for (Pcorcavendac o : resultados) {
                // Adicionar logs para diagnóstico
                //LOGGER.info("Carregando orçamento específico #" + o.getId() + ":");
                //LOGGER.info("- Valor Total: " + o.getVltotal());
                //LOGGER.info("- Desconto: " + o.getVldesconto());

                // Verificar valores nulos
                if (o.getVldesconto() == null) {
                    LOGGER.warning("Desconto NULO para orçamento #" + o.getId());
                    // Usar zero como valor padrão em caso de nulo
                    o.setVldesconto(BigDecimal.ZERO);
                }

                OrcamentoModel orcamento = new OrcamentoModel(
                        o.getId(), o.getData(), o.getVltotal(),
                        o.getCodcli(), o.getCodusur(), o.getVldesconto());

                // Verificar se o valor de desconto foi corretamente atribuído no modelo
                //LOGGER.info("- Desconto atribuído ao modelo: " + orcamento.getVldesconto());

                orcamentos.add(orcamento);
            }

            LOGGER.info("Carregados " + orcamentos.size() + " orçamentos específicos");

            if (orcamentos.isEmpty()) {
                AlertUtil.showAlert("Os orçamentos foram gerados, mas não puderam ser visualizados neste momento.",
                        Alert.AlertType.WARNING);
            }
        } catch (Exception e) {
            // Tratamento de exceções aqui...
            LOGGER.log(Level.SEVERE, "Erro ao carregar orçamentos específicos", e);
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
        Stage novaStage = null;
        try {
            // Fecha a tela atual
            Stage stageAtual = (Stage) tableOrcamentos.getScene().getWindow();

            // Abre a tela inicial (TelaParametros)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaParametros12.fxml"));
            Parent root = loader.load();

            novaStage = new Stage();
            novaStage.setTitle("Novo Orçamento");
            novaStage.setScene(new Scene(root));
            novaStage.initStyle(StageStyle.UNDECORATED);
            novaStage.show();

            // Apenas feche a tela atual se a nova foi aberta com sucesso
            stageAtual.close();

            LOGGER.info("Retornando ao menu principal");
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar tela de parâmetros", e);

            if (novaStage != null) {
                novaStage.close();
            }

            // Mensagem mais específica baseada no erro
            String mensagemErro = "Não foi possível retornar ao menu principal.";
            if (e.getMessage() != null && e.getMessage().contains("telaParametros12.fxml")) {
                mensagemErro = "Arquivo de layout do menu principal não encontrado.";
            }

            AlertUtil.showAlert(mensagemErro, Alert.AlertType.ERROR);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro inesperado ao retornar ao menu", e);

            if (novaStage != null) {
                novaStage.close();
            }

            AlertUtil.showAlert("Ocorreu um erro ao retornar ao menu principal.", Alert.AlertType.ERROR);
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