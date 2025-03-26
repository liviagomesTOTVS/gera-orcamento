package org.example.orcamentototvsjakarta;

import javafx.application.Preloader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class OrcamentoPreloader extends Preloader {
    private Stage preloaderStage;

    @Override
    public void start(Stage stage) throws Exception {
        this.preloaderStage = stage;
        Label label = new Label("Carregando Orçamento");
        label.setStyle("-fx-font-size: 16pt; -fx-font-weight: bold; -fx-text-fill: white;");
        ProgressIndicator progressIndicator = new ProgressIndicator();
        progressIndicator.setStyle("-fx-progress-color: white;");
        VBox vbox = new VBox(20, label, progressIndicator);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: #0041a6; -fx-padding: 20;");
        Scene scene = new Scene(vbox, 400, 200);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.centerOnScreen();
        stage.show();
        System.out.println("Preloader: Tela de carregamento exibida.");
    }
    @Override
    public void handleApplicationNotification(PreloaderNotification info) {
        if (info instanceof TelaProntaNotification) {
            preloaderStage.hide();
        }
    }

}