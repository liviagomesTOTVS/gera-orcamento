package org.example.orcamentototvsjakarta;


import javafx.application.Application;
import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
    @Override
    public void init() throws Exception {
        Thread.sleep(5000);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/telaParametros12.fxml"));
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/telaParametros12.fxml"));
        Parent root = loader.load();

        stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(false);
        stage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                stage.setMaximized(false);
        }});

        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                stage.setMaximized(false);
            }});
        notifyPreloader(new TelaProntaNotification());
        stage.show();
    }

    public static void main(String[] args) {
        System.setProperty("javafx.preloader", OrcamentoPreloader.class.getCanonicalName());
        launch(args);
    }
}

