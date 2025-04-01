package org.example.orcamentototvsjakarta;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.text.NumberFormat;


import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;

import org.example.orcamentototvsjakarta.DTO.ItemOrcamentoDTO;
import org.example.orcamentototvsjakarta.db.entidade.Pcorcavendai;

public class TelaItensOrcamentoController {

    @FXML
    private TableView<ItemOrcamentoDTO> tableItens;

    @FXML
    private TableColumn<ItemOrcamentoDTO, Long> colCodigo;
    @FXML
    private TableColumn<ItemOrcamentoDTO, String> colDescricao;
    @FXML
    private TableColumn<ItemOrcamentoDTO, BigDecimal> colQuantidade;
    @FXML
    private TableColumn<ItemOrcamentoDTO, BigDecimal> colCusto;
    @FXML
    private TableColumn<ItemOrcamentoDTO, BigDecimal> colVenda;
    @FXML
    private TableColumn<ItemOrcamentoDTO, BigDecimal> colTabela;
    @FXML
    private TableColumn<ItemOrcamentoDTO, Integer> colCodst;



    private ObservableList<Pcorcavendai> itensOrcamento = FXCollections.observableArrayList();

    // Gerenciamento único do EntityManagerFactory
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("default");

    /**
     * Recebe o ID do orçamento e carrega os itens correspondentes.
     */
    public void setOrcamentoId(Long orcamentoId) {
        carregarItens(orcamentoId);
    }

    @FXML
    private void initialize() {
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codprod"));
        colDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        colQuantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        colCusto.setCellValueFactory(new PropertyValueFactory<>("vlcustofin"));
        colVenda.setCellValueFactory(new PropertyValueFactory<>("pvenda"));
        colTabela.setCellValueFactory(new PropertyValueFactory<>("ptabela"));
        colCodst.setCellValueFactory(new PropertyValueFactory<>("codst"));

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        colCusto.setCellFactory(column -> new TableCell<>() {
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

        colVenda.setCellFactory(column -> new TableCell<>() {
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

        colTabela.setCellFactory(column -> new TableCell<>() {
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

    private void carregarItens(Long orcamentoId) {
        EntityManager em = EMF.createEntityManager();
        try {
            List<ItemOrcamentoDTO> resultados = em.createQuery(
                            "SELECT new org.example.orcamentototvsjakarta.DTO.ItemOrcamentoDTO(" +
                                    "   i.id.codprod, p.descricao, i.qt, i.vlcustofin, i.pvenda, i.ptabela, i.codst) " +
                                    "FROM Pcorcavendai i, Pcprodut p " +
                                    "WHERE i.id.codprod = p.id AND i.id.numorca = :numorca", ItemOrcamentoDTO.class)
                    .setParameter("numorca", orcamentoId)
                    .getResultList();

            tableItens.setItems(FXCollections.observableArrayList(resultados));
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }


    @FXML
    private void onVoltar() {
        Stage stage = (Stage) tableItens.getScene().getWindow();
        stage.close();
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
