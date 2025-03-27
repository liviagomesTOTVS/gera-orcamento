package org.example.orcamentototvsjakarta;

import javafx.application.Preloader;

public class MensagemNotification implements Preloader.PreloaderNotification {
    private final String mensagem;

    public MensagemNotification(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
