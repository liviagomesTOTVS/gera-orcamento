package org.example.orcamentototvsjakarta;

import javafx.application.Preloader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class OrcamentoPreloader extends Preloader {

    private Stage preloaderStage;
    private Label lblMensagem;
    private ProgressBar progressBar;

    @Override
    public void start(Stage primaryStage) {
        this.preloaderStage = primaryStage;

        lblMensagem = new Label("Inicializando...");
        lblMensagem.setStyle("-fx-font-size: 14pt; -fx-text-fill: white;");

        progressBar = new ProgressBar(0);
        progressBar.setPrefWidth(300);
        // Estilo melhorado para a barra de progresso
        progressBar.setStyle("-fx-accent: #5ea261; " +  // Cor verde
                "-fx-control-inner-background: #003366; " +  // Cor de fundo
                "-fx-border-color: white; " +
                "-fx-border-width: 1px;");

        VBox root = new VBox(20, lblMensagem, progressBar);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #0041a6; -fx-padding: 20;");

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
    }

    @Override
    public void handleApplicationNotification(PreloaderNotification info) {
        // Garante que as atualizações são feitas na thread FX
        if (info instanceof ProgressNotification progress) {
            javafx.application.Platform.runLater(() ->
                    progressBar.setProgress(progress.getProgress()));
        } else if (info instanceof MensagemNotification mensagem) {
            javafx.application.Platform.runLater(() ->
                    lblMensagem.setText(mensagem.getMensagem()));
        } else if (info instanceof TelaProntaNotification) {
            javafx.application.Platform.runLater(() ->
                    preloaderStage.hide());
        }
    }
}
