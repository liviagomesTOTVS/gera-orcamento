package org.example.orcamentototvsjakarta;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import org.example.orcamentototvsjakarta.db.entidade.Pcorcavendai;

public class TelaItensOrcamentoController {

    @FXML
    private TableView<Pcorcavendai> tableItens;
    @FXML
    private TableColumn<Pcorcavendai, String> colProduto;
    @FXML
    private TableColumn<Pcorcavendai, java.math.BigDecimal> colQuantidade;

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
        // Configura a coluna para exibir o código do produto, convertendo o valor para String
        colProduto.setCellValueFactory(cellData ->
                new javafx.beans.property.SimpleStringProperty(String.valueOf(cellData.getValue().getId().getCodprod()))
        );
        colQuantidade.setCellValueFactory(new PropertyValueFactory<>("qt"));
    }

    private void carregarItens(Long orcamentoId) {
        EntityManager em = EMF.createEntityManager();
        try {
            // Consulta para buscar os itens vinculados ao orçamento utilizando a propriedade "numorca"
            List<Pcorcavendai> resultados = em.createQuery(
                            "SELECT i FROM Pcorcavendai i WHERE i.id.numorca = :numorca", Pcorcavendai.class)
                    .setParameter("numorca", orcamentoId)
                    .getResultList();
            itensOrcamento.setAll(resultados);
            tableItens.setItems(itensOrcamento);
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
}
