package org.example.orcamentototvsjakarta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.example.orcamentototvsjakarta.util.AlertUtil;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
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
        } catch (PersistenceException e) {
            LOGGER.log(Level.SEVERE, "Erro de conexão com o banco de dados", e);
            Platform.runLater(() ->
                    exibirErroInicializacao("Erro de Banco de Dados",
                            "Não foi possível conectar ao banco de dados. Verifique se o servidor está disponível.", e));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LOGGER.log(Level.WARNING, "Processo de inicialização interrompido", e);
            Platform.runLater(() ->
                    exibirErroInicializacao("Inicialização Interrompida",
                            "O processo de inicialização foi interrompido.", e));
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro inesperado durante inicialização", e);
            Platform.runLater(() ->
                    exibirErroInicializacao("Erro de Inicialização",
                            "Ocorreu um erro ao iniciar a aplicação.", e));
        }
    }

    private void inicializarBancoDados() throws InterruptedException, PersistenceException {
        notifyPreloader(new MensagemNotification("Inicializando banco de dados..."));
        notifyPreloader(new Preloader.ProgressNotification(0.1));

        try {
            // Criação do EntityManagerFactory como singleton
            emf = Persistence.createEntityManagerFactory("default");
            // Verificar conexão
            EntityManager em = emf.createEntityManager();
            em.close();
        } catch (PersistenceException e) {
            LOGGER.log(Level.SEVERE, "Falha ao conectar ao banco de dados", e);
            throw e; // Relança a exceção para tratamento específico
        }

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
                LOGGER.log(Level.SEVERE, "Erro ao carregar interface gráfica", e);
                exibirErroInicializacao("Erro de Interface",
                        "Não foi possível carregar a interface gráfica.", e);
            }
        });
    }

    private void carregarInterface(Stage stage) throws IOException {
        try {
            URL fxmlUrl = getClass().getResource("/fxml/telaParametros12.fxml");
            if (fxmlUrl == null) {
                throw new IOException("Arquivo FXML não encontrado: /fxml/telaParametros12.fxml");
            }

            FXMLLoader loader = new FXMLLoader(fxmlUrl);
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
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar arquivo FXML", e);
            throw e; // Relança para tratamento adequado
        } catch (IllegalStateException e) {
            LOGGER.log(Level.SEVERE, "Erro ao inicializar controlador", e);
            throw new IOException("Erro ao inicializar a tela: " + e.getMessage(), e);
        }
    }

    private void exibirErroInicializacao(String titulo, String mensagem, Exception e) {
        // Log detalhado para depuração
        LOGGER.log(Level.SEVERE, mensagem, e);

        // Exibir diálogo de erro para o usuário
        try {
            AlertUtil.showAlert(mensagem, Alert.AlertType.ERROR);
        } catch (Exception dialogError) {
            // Fallback se AlertUtil falhar
            LOGGER.log(Level.SEVERE, "Erro ao exibir diálogo de erro", dialogError);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(titulo);
            alert.setHeaderText("Erro na Inicialização");
            alert.setContentText(mensagem);
            alert.showAndWait();
        }

        // Encerra a aplicação após o erro crítico
        Platform.exit();
    }

    @Override
    public void stop() {
        try {
            if (emf != null && emf.isOpen()) {
                emf.close();
                LOGGER.info("EntityManagerFactory fechado com sucesso");
            }
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao fechar EntityManagerFactory", e);
        }
    }

    public static void main(String[] args) {
        System.setProperty("javafx.preloader", OrcamentoPreloader.class.getCanonicalName());
        launch(args);
    }

    // Método utilitário para obter EntityManager
    public static EntityManager createEntityManager() {
        try {
            if (emf == null || !emf.isOpen()) {
                emf = Persistence.createEntityManagerFactory("default");
            }
            return emf.createEntityManager();
        } catch (PersistenceException e) {
            LOGGER.log(Level.SEVERE, "Erro ao criar EntityManager", e);
            throw new RuntimeException("Não foi possível estabelecer conexão com o banco de dados.", e);
        }
    }
}