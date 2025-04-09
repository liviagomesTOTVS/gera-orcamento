package org.example.orcamentototvsjakarta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    private static EntityManagerFactory emf;

    @Override
    public void init() throws Exception {
        // Inicialização, se necessário
    }

    @Override
    public void start(Stage stage) {
        new Thread(() -> inicializarAplicacao(stage)).start();
    }

    private void inicializarAplicacao(Stage stage) {
        try {
            inicializarBancoDados();
            carregarEntidades();
            configurarAmbiente();
            abrirTelaInicial(stage);
        } catch (Exception e) {
            Platform.runLater(() -> exibirErroInicializacao(e));
        }
    }

    private void inicializarBancoDados() throws InterruptedException {
        notifyPreloader(new MensagemNotification("Inicializando banco de dados..."));
        notifyPreloader(new Preloader.ProgressNotification(0.1));

        // Criação do EntityManagerFactory como singleton
        emf = Persistence.createEntityManagerFactory("default");
        // Verificar conexão
        EntityManager em = emf.createEntityManager();
        em.close();

        Thread.sleep(300); // Em produção, remover ou substituir por verificação real
    }

    private void carregarEntidades() throws InterruptedException {
        notifyPreloader(new MensagemNotification("Carregando entidades..."));
        notifyPreloader(new Preloader.ProgressNotification(0.4));
        // Código real para carregar entidades ou validar modelo
        Thread.sleep(500); // Em produção, remover
    }

    private void configurarAmbiente() throws InterruptedException {
        notifyPreloader(new MensagemNotification("Configurando ambiente..."));
        notifyPreloader(new Preloader.ProgressNotification(0.7));
        // Código real para configuração
        Thread.sleep(500); // Em produção, remover
    }

    private void abrirTelaInicial(Stage stage) throws InterruptedException {
        notifyPreloader(new MensagemNotification("Abrindo tela inicial..."));
        notifyPreloader(new Preloader.ProgressNotification(1.0));

        Platform.runLater(() -> {
            try {
                carregarInterface(stage);
                notifyPreloader(new TelaProntaNotification());
            } catch (IOException e) {
                exibirErroInicializacao(e);
            }
        });
    }

    private void carregarInterface(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaParametros12.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        URL cssUrl = getClass().getResource("/css/main.css");
        if (cssUrl != null) {
            scene.getStylesheets().add(cssUrl.toExternalForm());
        }
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(false);
        stage.setTitle("Parâmetros");
        stage.setScene(scene);
        stage.show();
    }

    private void exibirErroInicializacao(Exception e) {
        e.printStackTrace();
        // Exibir diálogo de erro para o usuário
        // AlertUtil.showError("Erro de Inicialização", "Não foi possível iniciar a aplicação", e.getMessage());
    }

    @Override
    public void stop() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }

    public static void main(String[] args) {
        System.setProperty("javafx.preloader", OrcamentoPreloader.class.getCanonicalName());
        launch(args);
    }

    // Método utilitário para obter EntityManager (opcional)
    public static EntityManager createEntityManager() {
        if (emf == null || !emf.isOpen()) {
            emf = Persistence.createEntityManagerFactory("default");
        }
        return emf.createEntityManager();
    }
}