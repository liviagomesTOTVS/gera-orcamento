package org.example.orcamentototvsjakarta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;

public class Main extends Application {
    @Override
    public void init() throws Exception {
        Thread.sleep(5000); // Simula carregamento para o preloader
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/telaParametros12.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

//        URL cssResource = getClass().getResource("/css/main2.css");
//        if (cssResource != null) {
//            scene.getStylesheets().add(cssResource.toExternalForm());
//        } else {
//            System.err.println("Arquivo CSS não encontrado: /css/main.css");
//        }

        // Configurações da janela
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(false);
        stage.setTitle("Parâmetros");
        stage.setScene(scene);

        // Impede que maximize
        stage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                stage.setMaximized(false);
            }
        });

        notifyPreloader(new TelaProntaNotification());
        stage.show();
    }

    public static void main(String[] args) {
        System.setProperty("javafx.preloader", OrcamentoPreloader.class.getCanonicalName());
        launch(args);
    }
}
