package org.example.orcamentototvsjakarta;

import jakarta.persistence.Query;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import jakarta.persistence.EntityManager;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.example.orcamentototvsjakarta.DTO.ItemOrcamentoDTO;
import org.example.orcamentototvsjakarta.util.AlertUtil;
import org.example.orcamentototvsjakarta.util.JPAUtil;

/**
 * Controller da tela de itens de orçamento.
 * Exibe os itens associados a um orçamento específico.
 */
public class TelaItensOrcamentoController {
    private static final Logger LOGGER = Logger.getLogger(TelaItensOrcamentoController.class.getName());

    // Componentes FXML
    @FXML private TableView<ItemOrcamentoDTO> tableItens;
    @FXML private TableColumn<ItemOrcamentoDTO, Integer> colCodigo;
    @FXML private TableColumn<ItemOrcamentoDTO, String> colDescricao;
    @FXML private TableColumn<ItemOrcamentoDTO, BigDecimal> colQuantidade;
    @FXML private TableColumn<ItemOrcamentoDTO, BigDecimal> colCusto;
    @FXML private TableColumn<ItemOrcamentoDTO, BigDecimal> colVenda;
    @FXML private TableColumn<ItemOrcamentoDTO, BigDecimal> colTabela;
    @FXML private TableColumn<ItemOrcamentoDTO, Integer> colCodst;
    @FXML private TableColumn<ItemOrcamentoDTO, BigDecimal> colTotal;


    // Formatadores
    private final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    private final NumberFormat quantityFormat = NumberFormat.getNumberInstance(new Locale("pt", "BR"));

    // Dados
    private Long orcamentoId;
    private final ObservableList<ItemOrcamentoDTO> itensOrcamento = FXCollections.observableArrayList();

    /**
     * Inicializa o controller após a injeção dos componentes FXML
     */
    @FXML
    private void initialize() {

        configurarColunas();
        configurarTabela();
    }

    /**
     * Configura as colunas da tabela
     */
    private void configurarColunas() {
        // Configuração de cell value factories
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codprod"));
        colDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        colQuantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        colCusto.setCellValueFactory(new PropertyValueFactory<>("vlcustofin"));
        colVenda.setCellValueFactory(new PropertyValueFactory<>("pvenda"));
        colTabela.setCellValueFactory(new PropertyValueFactory<>("ptabela"));
        colCodst.setCellValueFactory(new PropertyValueFactory<>("codst"));

        colTotal.setCellValueFactory(cellData -> {
            BigDecimal quantidade = cellData.getValue().getQuantidade();
            BigDecimal preco = cellData.getValue().getPvenda();
            return new SimpleObjectProperty<>(quantidade.multiply(preco));
        });


        // Configuração de formatação de células
        configurarFormatacoesCelulas();
    }

    /**
     * Configura as formatações personalizadas para as colunas
     */
    private void configurarFormatacoesCelulas() {
        // Formatação para quantidade (números com casas decimais)
        colQuantidade.setCellFactory(column -> new TableCell<>() {
            @Override
            protected void updateItem(BigDecimal value, boolean empty) {
                super.updateItem(value, empty);
                if (empty || value == null) {
                    setText(null);
                } else {
                    setText(quantityFormat.format(value));
                }
            }
        });

        // Formatação monetária para valores
        configurarFormatacaoMonetaria(colCusto);
        configurarFormatacaoMonetaria(colVenda);
        configurarFormatacaoMonetaria(colTabela);
        configurarFormatacaoMonetaria(colTotal);

    }

    /**
     * Configura formatação monetária para uma coluna específica
     */
    private void configurarFormatacaoMonetaria(TableColumn<ItemOrcamentoDTO, BigDecimal> column) {
        column.setCellFactory(col -> new TableCell<>() {
            @Override
            protected void updateItem(BigDecimal value, boolean empty) {
                super.updateItem(value, empty);
                if (empty || value == null) {
                    setText(null);
                } else {
                    setText(currencyFormat.format(value));
                }
            }
        });
    }

    /**
     * Configura comportamentos da tabela
     */
    private void configurarTabela() {
        // Configurar placeholder para tabela vazia
        tableItens.setPlaceholder(new Label("Não há itens neste orçamento"));

        // Vincular dados à tabela
        tableItens.setItems(itensOrcamento);
    }

    /**
     * Recebe o ID do orçamento e carrega os itens correspondentes
     *
     * @param orcamentoId ID do orçamento a ser carregado
     */
    public void setOrcamentoId(Long orcamentoId) {
        this.orcamentoId = orcamentoId;

        if (orcamentoId != null) {
            LOGGER.info("Carregando itens do orçamento: " + orcamentoId);
            carregarItens();
        }
    }

    /**
     * Carrega os itens do orçamento do banco de dados
     */
    private void carregarItens() {
        try {
            EntityManager em = JPAUtil.getEntityManager();

            // Usando SQL nativo em vez de JPQL para evitar problemas de mapeamento
            String sql =
                    "SELECT i.NUMORCA, i.NUMSEQ, i.CODPROD, p.DESCRICAO, i.QT, " +
                            "i.QTUNITEMB, p.UNIDADE, p.EMBALAGEM, i.PVENDA, i.PTABELA, " +
                            "i.CODST, i.VLCUSTOFIN " +
                            "FROM PCORCAVENDAI i " +
                            "JOIN PCPRODUT p ON i.CODPROD = p.CODPROD " +
                            "WHERE i.NUMORCA = ?1 " +
                            "ORDER BY i.NUMSEQ";

            jakarta.persistence.Query query = em.createNativeQuery(sql);
            query.setParameter(1, this.orcamentoId);

            List<Object[]> resultados = query.getResultList();

            // Limpar lista atual
            itensOrcamento.clear();

            // Processar os resultados
            for (Object[] row : resultados) {
                ItemOrcamentoDTO item = new ItemOrcamentoDTO();
                // Os índices dependem da ordem do SELECT acima
                // Adapte conforme necessário baseado nos campos da classe ItemOrcamentoDTO
                item.setCodprod(((Number)row[2]).intValue());
                item.setDescricao((String)row[3]);
                item.setQuantidade(new BigDecimal(((Number)row[4]).toString()));
                item.setPvenda(new BigDecimal(((Number)row[8]).toString()));
                item.setPtabela(new BigDecimal(((Number)row[9]).toString()));
                item.setCodst(((Number)row[10]).intValue());

                // Verificar se o campo vlcustofin está disponível no resultado
                if (row.length > 11 && row[11] != null) {
                    item.setVlcustofin(new BigDecimal(((Number)row[11]).toString()));
                }

                itensOrcamento.add(item);
            }

            // Atualizar título da janela com contagem de itens
            atualizarTituloJanela();

            em.close();

            LOGGER.info("Carregados " + itensOrcamento.size() + " itens para o orçamento " + orcamentoId);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar itens do orçamento " + orcamentoId, e);
            AlertUtil.showAlert("Erro ao carregar itens: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    /**
     * Atualiza o título da janela com informações sobre o orçamento
     */
    private void atualizarTituloJanela() {
        Stage stage = (Stage) tableItens.getScene().getWindow();
        if (stage != null) {
            stage.setTitle("Orçamento #" + orcamentoId + " - " + itensOrcamento.size() + " item(ns)");
        }
    }

    /**
     * Retorna à tela anterior
     */
    @FXML
    private void onVoltar() {
        closeWindow(new ActionEvent(tableItens, null));
    }

    /**
     * Fecha a janela atual
     */
    @FXML
    public void closeWindow(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.close();
            LOGGER.info("Fechando tela de itens do orçamento " + orcamentoId);
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

    /**
     * Atualiza os dados da tabela
     */
    @FXML
    public void onRefresh() {
        if (orcamentoId != null) {
            carregarItens();
        }
    }
}