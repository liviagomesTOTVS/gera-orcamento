package org.example.orcamentototvsjakarta.util;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import org.example.orcamentototvsjakarta.db.dao.PcclientDAO;
import org.example.orcamentototvsjakarta.db.entidade.Pcclient;

import java.util.List;

public class ModalTableClientes extends BorderPane {

    private final TableView<Pcclient> tabela = new TableView<>();
    private final TextField tffiltro = new TextField();
    private final PcclientDAO pcclientDAO = new PcclientDAO();
    private Pcclient selecionado;

    public ModalTableClientes() {
        // Tabela
        TableColumn<Pcclient, Integer> colCodigo = new TableColumn<>("Código");
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codcli"));

        TableColumn<Pcclient, String> colNome = new TableColumn<>("Cliente");
        colNome.setCellValueFactory(new PropertyValueFactory<>("cliente"));

        tabela.getColumns().addAll(colCodigo, colNome);
        tabela.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        this.setCenter(tabela);

        // Campo de filtro
        tffiltro.setPromptText("Digite código ou nome do cliente");

        // Botão de pesquisa
        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.setOnAction(e -> pesquisar());

        // Botões de ação
        Button btConfirmar = new Button("Confirmar");
        Button btCancelar = new Button("Cancelar");

        btConfirmar.setOnAction(e -> confirmar());
        btCancelar.setOnAction(e -> cancelar());

        HBox hboxTopo = new HBox(10, tffiltro, btnPesquisar);
        hboxTopo.setAlignment(Pos.CENTER);
        hboxTopo.setPadding(new Insets(10));

        HBox hboxBotoes = new HBox(20, btConfirmar, btCancelar);
        hboxBotoes.setAlignment(Pos.CENTER);
        hboxBotoes.setMinHeight(40);

        this.setTop(hboxTopo);
        this.setBottom(hboxBotoes);
        this.setPadding(new Insets(10));
        this.setEffect(new DropShadow(20, Color.BLACK));
    }

    private void pesquisar() {
        String filtro = tffiltro.getText().trim();
        if (filtro.isEmpty()) {
            showAlert("Digite ao menos parte do nome ou código do cliente.");
            return;
        }

        try {
            List<Pcclient> resultado = pcclientDAO.buscarPorFiltro(filtro);
            tabela.setItems(FXCollections.observableArrayList(resultado));
        } catch (Exception e) {
            showAlert("Erro ao buscar clientes: " + e.getMessage());
        }
    }

    private void confirmar() {
        selecionado = tabela.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            this.getScene().getWindow().hide();
        } else {
            showAlert("Selecione um cliente da lista.");
        }
    }

    private void cancelar() {
        selecionado = null;
        this.getScene().getWindow().hide();
    }

    public Pcclient getSelecionado() {
        return selecionado;
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.WARNING, msg, ButtonType.OK);
        alert.setHeaderText(null);
        alert.showAndWait();
    }
}
