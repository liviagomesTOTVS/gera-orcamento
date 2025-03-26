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
import javafx.scene.layout.Region;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.example.orcamentototvsjakarta.db.dao.PcdeptoDAO;
import org.example.orcamentototvsjakarta.db.entidade.Pcdepto;
import org.example.orcamentototvsjakarta.model.DepartamentoModel;
import org.example.orcamentototvsjakarta.model.ParametrosModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TelaDepartamentoController {

    @FXML private ListView<DepartamentoModel> listDepartamentos;
    @FXML private Button btnProximo;
    @FXML private Button btnAnterior;
    @FXML private Button btnTodos;
    @FXML private Button btnNenhum;
    @FXML private Button btnInverter;

    private ParametrosModel parametrosModel;
    private final PcdeptoDAO pcdeptoDAO = new PcdeptoDAO();
    private final ObservableList<DepartamentoModel> departamentos = FXCollections.observableArrayList();



    public void setParametrosModel(ParametrosModel parametrosModel) {
        this.parametrosModel = parametrosModel;
    }

    @FXML
    public void initialize() {
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        carregarDepartamentos();
        listDepartamentos.setItems(departamentos);

        listDepartamentos.setCellFactory(param -> new ListCell<>() {
            private final CheckBox checkBox = new CheckBox();
            private final Label lblCodigo = new Label();
            private final Label lblDescricao = new Label();
            private final HBox hBox = new HBox(10, checkBox, lblCodigo, lblDescricao);

            {
                checkBox.setOnAction(event -> {
                    DepartamentoModel departamento = getItem();
                    if (departamento != null) {
                        departamento.setSelecionado(checkBox.isSelected());
                        listDepartamentos.refresh(); // Força a atualização da lista
                    }
                });
                checkBox.setCursor(Cursor.HAND);
                checkBox.setMinWidth(43);
                lblCodigo.setMinWidth(80);
                lblCodigo.setTextAlignment(TextAlignment.CENTER);
                lblDescricao.setMinWidth(200);
            }

            @Override
            protected void updateItem(DepartamentoModel departamento, boolean empty) {
                super.updateItem(departamento, empty);
                if (empty || departamento == null) {
                    setGraphic(null);
                } else {
                    lblCodigo.setText(departamento.getCodigo());
                    lblDescricao.setText(departamento.getDescricao());
                    checkBox.setSelected(departamento.isSelecionado());
                    setGraphic(hBox);
                }
            }
        });

        btnProximo.setOnAction(event -> onProximo());
        btnAnterior.setOnAction(event -> onAnterior());
        btnTodos.setOnAction(event -> selecionarTodos(true));
        btnNenhum.setOnAction(event -> selecionarTodos(false));
        btnInverter.setOnAction(event -> inverterSelecao());
    }

    private void carregarDepartamentos() {
        List<Pcdepto> listaDeptos = pcdeptoDAO.buscarTodos();
        // Ordena os departamentos pelo código (convertendo para inteiro, se necessário)
        listaDeptos.sort(Comparator.comparingInt(dep -> Integer.parseInt(dep.getId().toString())));

        departamentos.clear();
        for (Pcdepto dep : listaDeptos) {
            DepartamentoModel model = new DepartamentoModel(false, dep.getId().toString(), dep.getDescricao());
            departamentos.add(model);
        }
    }


    private void selecionarTodos(boolean selecionar) {
        for (DepartamentoModel dep : listDepartamentos.getItems()) {
            dep.setSelecionado(selecionar);
        }
        listDepartamentos.refresh();
    }

    private void inverterSelecao() {
        for (DepartamentoModel dep : listDepartamentos.getItems()) {
            dep.setSelecionado(!dep.isSelecionado());
        }
        listDepartamentos.refresh();
    }

    private void onProximo() {
        List<String> departamentosSelecionados = new ArrayList<>();

        for (DepartamentoModel dep : listDepartamentos.getItems()) {
            if (dep.isSelecionado()) {
                departamentosSelecionados.add(dep.getCodigo());
            }
        }

        if (departamentosSelecionados.isEmpty()) {
            showAlert("Selecione pelo menos um departamento!", Alert.AlertType.WARNING);
            return;
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaTributacao2.fxml"));
            Parent root = loader.load();

            TelaTributacaoController controller = loader.getController();
            if (controller == null) {
                showAlert("Erro ao carregar controlador da tela de tributação!", Alert.AlertType.ERROR);
                return;
            }

            // Passa os parâmetros da tela de parâmetros
            controller.setParametrosModel(parametrosModel);
            controller.setDepartamentosSelecionados(departamentosSelecionados);

            Stage stage = new Stage();
            stage.setTitle("Tributação");
            stage.setScene(new Scene(root));
            stage.show();

            ((Stage) btnProximo.getScene().getWindow()).close();
        } catch (Exception e) {
            showAlert("Erro ao carregar a tela de tributação: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


    private void onAnterior() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaParametros12.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btnAnterior.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            showAlert("Erro ao carregar a tela de parâmetros!", Alert.AlertType.ERROR);
        }
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
        okButton.setStyle("-fx-background-color: white; -fx-text-fill: #0041a6;-fx-font-weight: bold;-fx-font-family: Arial");
        dialogPane.setMinHeight(Region.USE_PREF_SIZE);
        dialogPane.setMinWidth(400);
        dialogPane.setPrefHeight(150);
        dialogPane.setPrefWidth(500);
        alert.showAndWait();
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
