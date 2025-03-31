package org.example.orcamentototvsjakarta;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javafx.application.Application;
import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;

public class Main extends Application {
    @Override
    public void init() throws Exception {
        //Thread.sleep(5000); // Simula carregamento para o preloader
    }

    @Override
    public void start(Stage stage) {
        new Thread(() -> {
            try {
                notifyPreloader(new MensagemNotification("Inicializando banco de dados..."));
                Thread.sleep(300);
                notifyPreloader(new Preloader.ProgressNotification(0.1));
                Thread.sleep(300);  // Delay reduzido para melhor visualização

                EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
                emf.createEntityManager().close();

                notifyPreloader(new MensagemNotification("Carregando entidades..."));
                Thread.sleep(500);
                notifyPreloader(new Preloader.ProgressNotification(0.4));
                Thread.sleep(500);

                notifyPreloader(new MensagemNotification("Configurando ambiente..."));
                Thread.sleep(500);
                notifyPreloader(new Preloader.ProgressNotification(0.7));
                Thread.sleep(500);

                notifyPreloader(new MensagemNotification("Abrindo tela inicial..."));
                Thread.sleep(500);
                notifyPreloader(new Preloader.ProgressNotification(1.0));

                javafx.application.Platform.runLater(() -> {
                    try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaParametros12.fxml"));
                        Parent root = loader.load();
                        Scene scene = new Scene(root);

                        stage.initStyle(StageStyle.UNDECORATED);
                        stage.setResizable(false);
                        stage.setTitle("Parâmetros");
                        stage.setScene(scene);
                        stage.show();

                        URL cssUrl = getClass().getResource("/css/main.css");
                        if (cssUrl != null) {
                            scene.getStylesheets().add(cssUrl.toExternalForm());
                        }

                        notifyPreloader(new TelaProntaNotification());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }


    public static void main(String[] args) {
        System.setProperty("javafx.preloader", OrcamentoPreloader.class.getCanonicalName());
        launch(args);
    }
}
