package org.example.orcamentototvsjakarta;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.example.orcamentototvsjakarta.db.dao.PcdeptoDAO;
import org.example.orcamentototvsjakarta.db.entidade.Pcdepto;
import org.example.orcamentototvsjakarta.model.DepartamentoModel;
import org.example.orcamentototvsjakarta.model.ParametrosModel;
import org.example.orcamentototvsjakarta.util.AlertUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Controller da tela de seleção de departamentos.
 * Permite selecionar os departamentos que serão incluídos no orçamento.
 */
public class TelaDepartamentoController {

    // Componentes FXML
    @FXML private ListView<DepartamentoModel> listDepartamentos;
    @FXML private Button btnProximo;
    @FXML private Button btnAnterior;
    @FXML private Button btnTodos;
    @FXML private Button btnNenhum;
    @FXML private Button btnInverter;

    // Dados e dependências
    private ParametrosModel parametrosModel;
    private final PcdeptoDAO pcdeptoDAO = new PcdeptoDAO();
    private final ObservableList<DepartamentoModel> departamentos = FXCollections.observableArrayList();

    /**
     * Define o modelo de parâmetros recebido da tela anterior
     *
     * @param parametrosModel Modelo com os parâmetros do orçamento
     */
    public void setParametrosModel(ParametrosModel parametrosModel) {
        this.parametrosModel = Objects.requireNonNull(parametrosModel, "ParametrosModel não pode ser nulo");
    }

    /**
     * Inicializa o controller após a injeção dos componentes FXML
     */
    @FXML
    public void initialize() {
        carregarDepartamentos();
        configurarListView();
        configurarBotoes();
    }

    /**
     * Configura os listeners dos botões
     */
    private void configurarBotoes() {
        btnProximo.setOnAction(event -> onProximo());
        btnAnterior.setOnAction(event -> onAnterior());
        btnTodos.setOnAction(event -> selecionarTodos(true));
        btnNenhum.setOnAction(event -> selecionarTodos(false));
        btnInverter.setOnAction(event -> inverterSelecao());
    }

    /**
     * Configura o ListView com o factory personalizado para células
     */
    private void configurarListView() {
        listDepartamentos.setItems(departamentos);
        listDepartamentos.setCellFactory(this::criarCelulaPersonalizada);
    }

    /**
     * Cria um ListCell personalizado para os departamentos
     */
    private ListCell<DepartamentoModel> criarCelulaPersonalizada(ListView<DepartamentoModel> listView) {
        return new ListCell<>() {
            private final CheckBox checkBox = new CheckBox();
            private final Label lblCodigo = new Label();
            private final Label lblDescricao = new Label();
            private final HBox hBox = new HBox(10, checkBox, lblCodigo, lblDescricao);

            {
                // Inicialização dos componentes
                configurarComponentesCelula();
            }

            private void configurarComponentesCelula() {
                checkBox.setOnAction(event -> {
                    DepartamentoModel departamento = getItem();
                    if (departamento != null) {
                        departamento.setSelecionado(checkBox.isSelected());
                        listDepartamentos.refresh(); // Força a atualização da lista
                    }
                });
                checkBox.setCursor(Cursor.HAND);
                checkBox.setMinWidth(43);
                lblCodigo.setMinWidth(80);
                lblCodigo.setTextAlignment(TextAlignment.CENTER);
                lblDescricao.setMinWidth(200);
            }

            @Override
            protected void updateItem(DepartamentoModel departamento, boolean empty) {
                super.updateItem(departamento, empty);
                if (empty || departamento == null) {
                    setGraphic(null);
                } else {
                    lblCodigo.setText(departamento.getCodigo());
                    lblDescricao.setText(departamento.getDescricao());
                    checkBox.setSelected(departamento.isSelecionado());
                    setGraphic(hBox);
                }
            }
        };
    }

    /**
     * Carrega os departamentos do banco de dados
     */
    private void carregarDepartamentos() {
        try {
            List<Pcdepto> listaDeptos = pcdeptoDAO.buscarTodos();
            // Ordena os departamentos pelo código (convertendo para inteiro)
            listaDeptos.sort(Comparator.comparingInt(dep -> Integer.parseInt(dep.getId().toString())));

            departamentos.clear();
            for (Pcdepto dep : listaDeptos) {
                DepartamentoModel model = new DepartamentoModel(
                        false,
                        dep.getId().toString(),
                        dep.getDescricao()
                );
                departamentos.add(model);
            }

            if (departamentos.isEmpty()) {
                // Log para depuração
                System.out.println("Aviso: Nenhum departamento encontrado na base de dados");
                AlertUtil.showAlert("Não foram encontrados departamentos cadastrados no sistema.",
                        Alert.AlertType.WARNING);
            }
        } catch (NumberFormatException e) {
            // Log detalhado para depuração
            System.err.println("Erro ao converter código de departamento: " + e.getMessage());
            e.printStackTrace();

            // Mensagem amigável para o usuário
            AlertUtil.showAlert("Alguns departamentos possuem código em formato inválido e foram ignorados.",
                    Alert.AlertType.WARNING);
        } catch (Exception e) {
            // Log detalhado para depuração
            System.err.println("Erro ao carregar departamentos: " + e.getMessage());
            e.printStackTrace();

            // Mensagem amigável para o usuário
            AlertUtil.showAlert("Não foi possível carregar a lista de departamentos.",
                    Alert.AlertType.ERROR);
        }
    }

    /**
     * Seleciona ou deseleciona todos os departamentos
     */
    private void selecionarTodos(boolean selecionar) {
        departamentos.forEach(dep -> dep.setSelecionado(selecionar));
        listDepartamentos.refresh();
    }

    /**
     * Inverte a seleção de todos os departamentos
     */
    private void inverterSelecao() {
        departamentos.forEach(dep -> dep.setSelecionado(!dep.isSelecionado()));
        listDepartamentos.refresh();
    }

    /**
     * Avança para a próxima tela, validando a seleção
     */
    private void onProximo() {
        try {
            List<String> departamentosSelecionados = obterDepartamentosSelecionados();

            if (departamentosSelecionados.isEmpty()) {
                AlertUtil.showAlert("Selecione pelo menos um departamento!", Alert.AlertType.WARNING);
                return;
            }

            abrirTelaTributacao(departamentosSelecionados);
        } catch (Exception e) {
            // Log detalhado para depuração
            System.err.println("Erro inesperado ao avançar para próxima tela: " + e.getMessage());
            e.printStackTrace();

            // Mensagem amigável para o usuário
            AlertUtil.showAlert("Ocorreu um erro ao tentar avançar para a próxima etapa.",
                    Alert.AlertType.ERROR);
        }
    }

    /**
     * Obtém a lista de códigos dos departamentos selecionados
     */
    private List<String> obterDepartamentosSelecionados() {
        return departamentos.stream()
                .filter(DepartamentoModel::isSelecionado)
                .map(DepartamentoModel::getCodigo)
                .collect(Collectors.toList());
    }

    /**
     * Abre a tela de tributação com os parâmetros necessários
     */
    private void abrirTelaTributacao(List<String> departamentosSelecionados) {
        Stage novaJanela = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaTributacao2.fxml"));
            Parent root = loader.load();

            TelaTributacaoController controller = loader.getController();
            if (controller == null) {
                throw new IllegalStateException("Controlador da tela de tributação não foi inicializado corretamente");
            }

            // Passa os parâmetros para a próxima tela
            controller.setParametrosModel(parametrosModel);
            controller.setDepartamentosSelecionados(departamentosSelecionados);

            // Configura e mostra a nova tela
            novaJanela = new Stage();
            novaJanela.setTitle("Tributação");
            novaJanela.setScene(new Scene(root));
            novaJanela.initStyle(StageStyle.UNDECORATED);
            novaJanela.show();

            // Fecha a tela atual apenas se a nova tela foi aberta com sucesso
            fecharJanelaAtual(btnProximo);

        } catch (IOException e) {
            // Log detalhado para depuração
            System.err.println("Erro ao carregar arquivo FXML da tela de tributação: " + e.getMessage());
            e.printStackTrace();

            // Fechar a nova janela se foi criada mas ocorreu erro
            if (novaJanela != null) {
                novaJanela.close();
            }

            // Mensagem amigável para o usuário
            AlertUtil.showAlert("Não foi possível abrir a próxima tela. Erro de arquivo.",
                    Alert.AlertType.ERROR);
        } catch (IllegalStateException e) {
            // Log detalhado para depuração
            System.err.println("Erro de inicialização do controlador: " + e.getMessage());
            e.printStackTrace();

            // Fechar a nova janela se foi criada mas ocorreu erro
            if (novaJanela != null) {
                novaJanela.close();
            }

            // Mensagem amigável para o usuário
            AlertUtil.showAlert("Erro ao inicializar a tela de tributação.",
                    Alert.AlertType.ERROR);
        } catch (Exception e) {
            // Log detalhado para depuração
            System.err.println("Erro inesperado ao abrir tela de tributação: " + e.getMessage());
            e.printStackTrace();

            // Fechar a nova janela se foi criada mas ocorreu erro
            if (novaJanela != null) {
                novaJanela.close();
            }

            // Mensagem amigável para o usuário
            AlertUtil.showAlert("Ocorreu um erro ao tentar abrir a próxima tela.",
                    Alert.AlertType.ERROR);
        }
    }

    /**
     * Volta para a tela anterior
     */
    private void onAnterior() {
        Stage novaJanela = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaParametros12.fxml"));
            Parent root = loader.load();

            novaJanela = new Stage();
            novaJanela.setTitle("Parâmetros");
            novaJanela.setScene(new Scene(root));
            novaJanela.initStyle(StageStyle.UNDECORATED);
            novaJanela.show();

            // Fecha a janela atual apenas se a nova tela foi aberta com sucesso
            fecharJanelaAtual(btnAnterior);

        } catch (IOException e) {
            // Log detalhado para depuração
            System.err.println("Erro ao carregar arquivo FXML da tela de parâmetros: " + e.getMessage());
            e.printStackTrace();

            // Fechar a nova janela se foi criada mas ocorreu erro
            if (novaJanela != null) {
                novaJanela.close();
            }

            // Mensagem amigável para o usuário
            AlertUtil.showAlert("Não foi possível retornar à tela anterior. Erro de arquivo.",
                    Alert.AlertType.ERROR);
        } catch (Exception e) {
            // Log detalhado para depuração
            System.err.println("Erro inesperado ao abrir tela de parâmetros: " + e.getMessage());
            e.printStackTrace();

            // Fechar a nova janela se foi criada mas ocorreu erro
            if (novaJanela != null) {
                novaJanela.close();
            }

            // Mensagem amigável para o usuário
            AlertUtil.showAlert("Ocorreu um erro ao tentar retornar à tela anterior.",
                    Alert.AlertType.ERROR);
        }
    }

    /**
     * Fecha a janela que contém o botão especificado
     */
    private void fecharJanelaAtual(Button botao) {
        try {
            Stage janelaAtual = (Stage) botao.getScene().getWindow();
            janelaAtual.close();
        } catch (Exception e) {
            // Apenas log para depuração, sem alertar o usuário
            System.err.println("Erro ao fechar janela atual: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Fecha a janela atual
     */
    @FXML
    public void closeWindow(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.close();
        } catch (Exception e) {
            // Apenas log para depuração, sem alertar o usuário
            System.err.println("Erro ao fechar janela: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Minimiza a janela atual
     */
    @FXML
    public void minimizeWindow(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setIconified(true);
        } catch (Exception e) {
            // Apenas log para depuração, sem alertar o usuário
            System.err.println("Erro ao minimizar janela: " + e.getMessage());
            e.printStackTrace();

            // Este erro não é crítico, então não alertamos o usuário
        }
    }
}