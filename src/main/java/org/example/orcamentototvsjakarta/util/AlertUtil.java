package org.example.orcamentototvsjakarta.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.Region;

/**
 * Classe utilitária para exibição de alertas padronizados na aplicação.
 */
public class AlertUtil {

    /**
     * Exibe um alerta padronizado com a mensagem e tipo especificados.
     *
     * @param message A mensagem a ser exibida
     * @param type O tipo de alerta (INFORMATION, WARNING, ERROR, CONFIRMATION)
     */
    public static void showAlert(String message, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle("AVISO!");
        alert.setHeaderText(null);
        alert.setContentText(message);

        DialogPane dialogPane = alert.getDialogPane();
        estilizarDialogPane(dialogPane);

        alert.showAndWait();
    }

    /**
     * Aplica estilos personalizados ao DialogPane do alerta.
     *
     * @param dialogPane O DialogPane a ser estilizado
     */
    private static void estilizarDialogPane(DialogPane dialogPane) {
        // Estilo do painel de diálogo
        dialogPane.setStyle("-fx-background-color: #0041a6; -fx-border-color: #2980b9; -fx-border-width: 2;");

        // Estilo do conteúdo
        dialogPane.lookup(".content").setStyle(
                "-fx-background-color: #0041a6; " +
                        "-fx-text-fill: white; " +
                        "-fx-font-weight: bold; " +
                        "-fx-font-size: 14pt; " +
                        "-fx-font-family: Arial");

        // Estilo do botão OK
        Button okButton = (Button) dialogPane.lookupButton(ButtonType.OK);
        okButton.setStyle(
                "-fx-background-color: white; " +
                        "-fx-text-fill: #0041a6; " +
                        "-fx-cursor: hand; " +
                        "-fx-font-weight: bold; " +
                        "-fx-font-family: Arial");

        // Dimensões do diálogo
        dialogPane.setMinHeight(Region.USE_PREF_SIZE);
        dialogPane.setMinWidth(400);
        dialogPane.setPrefHeight(300);
        dialogPane.setPrefWidth(500);
    }
}