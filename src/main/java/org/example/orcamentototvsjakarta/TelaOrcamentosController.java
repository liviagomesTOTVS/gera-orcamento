package org.example.orcamentototvsjakarta;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.example.orcamentototvsjakarta.model.OrcamentoModel;
import org.example.orcamentototvsjakarta.db.entidade.Pcorcavendac;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class TelaOrcamentosController {

    @FXML
    private TableView<OrcamentoModel> tableOrcamentos;
    @FXML
    private TableColumn<OrcamentoModel, Long> colNumero;
    @FXML
    private TableColumn<OrcamentoModel, LocalDate> colData;
    @FXML
    private TableColumn<OrcamentoModel, BigDecimal> colValorTotal;
    @FXML
    private TableColumn<OrcamentoModel, Integer> colCliente;
    @FXML
    private TableColumn<OrcamentoModel, Short> colUsuario;
    @FXML
    private TableColumn<OrcamentoModel, BigDecimal> colDesconto;


    private ObservableList<OrcamentoModel> orcamentos = FXCollections.observableArrayList();

    // Gerenciamento único do EntityManagerFactory
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("default");

    @FXML
    private void initialize() {
        colNumero.setCellValueFactory(new PropertyValueFactory<>("id"));
        colData.setCellValueFactory(new PropertyValueFactory<>("data"));
        colValorTotal.setCellValueFactory(new PropertyValueFactory<>("vltotal"));
        colCliente.setCellValueFactory(new PropertyValueFactory<>("codcli"));
        colUsuario.setCellValueFactory(new PropertyValueFactory<>("codusur"));
        colDesconto.setCellValueFactory(new PropertyValueFactory<>("vldesconto"));

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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

        carregarOrcamentos();

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
    }

    private void carregarOrcamentos() {
        EntityManager em = EMF.createEntityManager();
        try {
            List<Pcorcavendac> resultados = em.createQuery("SELECT o FROM Pcorcavendac o", Pcorcavendac.class).getResultList();
            for (Pcorcavendac o : resultados) {
                orcamentos.add(new OrcamentoModel(o.getId(), o.getData(), o.getVltotal(), o.getCodcli(), o.getCodusur(), o.getVldesconto()));
            }
            tableOrcamentos.setItems(orcamentos);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }

    private void abrirTelaItensOrcamento(Long orcamentoId) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaItensOrcamento.fxml"));
            Parent root = loader.load();

            TelaItensOrcamentoController itensController = loader.getController();
            itensController.setOrcamentoId(orcamentoId);

            Stage stage = new Stage();
            stage.setTitle("Itens do Orçamento");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onVoltar() {
        Stage stage = (Stage) tableOrcamentos.getScene().getWindow();
        stage.close();
    }

    public void setNumorcasGerados(String numorcasGerados) {
        if (numorcasGerados == null || numorcasGerados.isEmpty()) {
            return;
        }

        EntityManager em = EMF.createEntityManager();
        try {
            List<Long> ids = new ArrayList<>();
            for (String s : numorcasGerados.split(",")) {
                ids.add(Long.parseLong(s.trim()));
            }

            List<Pcorcavendac> resultados = em.createQuery(
                            "SELECT o FROM Pcorcavendac o WHERE o.id IN :ids", Pcorcavendac.class)
                    .setParameter("ids", ids)
                    .getResultList();

            orcamentos.clear();
            for (Pcorcavendac o : resultados) {
                orcamentos.add(new OrcamentoModel(o.getId(), o.getData(), o.getVltotal(), o.getCodcli(), o.getCodusur(),o.getVldesconto()));
            }
            tableOrcamentos.setItems(orcamentos);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }

    @FXML
    private void onVoltarMenu() {
        try {
            // Fecha a tela atual
            Stage stageAtual = (Stage) tableOrcamentos.getScene().getWindow();
            stageAtual.close();

            // Abre a tela inicial (ex: TelaParametros)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaParametros12.fxml"));
            Parent root = loader.load();

            Stage novaStage = new Stage();
            novaStage.setTitle("Novo Orçamento");
            novaStage.setScene(new Scene(root));
            novaStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
