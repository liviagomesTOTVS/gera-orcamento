package org.example.orcamentototvsjakarta;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.example.orcamentototvsjakarta.DTO.ClienteDTO;
import org.example.orcamentototvsjakarta.DTO.FilialDTO;
import org.example.orcamentototvsjakarta.DTO.FuncionarioDTO;
import org.example.orcamentototvsjakarta.db.dao.*;
import org.example.orcamentototvsjakarta.db.entidade.Pcclient;
import org.example.orcamentototvsjakarta.model.ParametrosModel;
import org.example.orcamentototvsjakarta.util.ModalTableClientes;

import java.net.URL;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TelaParametrosController extends Application {

    @FXML private ComboBox<String>  comboCliente, comboPraca, comboPlanoPagamento, comboCobranca, comboRCA, comboSupervisor, comboRamoAtividade, comboCaixa;
    @FXML private TextField txtQtdeMaxItens, txtValorMaxOrcamento;
    @FXML private Button btnAvancar;
    @FXML private TextField tfCliente;
    @FXML private CheckBox cbCusto, cbVenda;
    @FXML private ComboBox<FilialDTO> comboFilial;
    @FXML private ComboBox<FuncionarioDTO> comboFuncionario;



    private final PcfilialDAO pcfilialDAO = new PcfilialDAO();
    private final PcclientDAO pcclientDAO = new PcclientDAO();
    private final PcplpagDAO pcplpagDAO = new PcplpagDAO();
    private final PccobDAO pccobDAO = new PccobDAO();
    private final PcusuariDAO pcusuariDAO = new PcusuariDAO();
    private final PccaixaDAO pccaixaDAO = new PccaixaDAO();
    private final PcemprDAO pcemprDAO = new PcemprDAO();
    private ClienteDTO clienteSelecionadoManual = null;



    @Override
    public void start(Stage primaryStage) throws Exception {

    }


    @FXML
    public void initialize() {
        carregarDados();
        //comboCliente.setOnAction(event -> carregarDadosRelacionadosCliente());
        comboRCA.setOnAction(event -> onRCASelecionado());
        btnAvancar.setOnAction(event -> onAvancar());

        // Listener de foco do campo tfCliente
        tfCliente.focusedProperty().addListener((obs, antigo, novo) -> {
            if (!novo) { // perdeu o foco
                buscarClientePorCodigoDigitado();
            }
        });

        try {
            ClienteDTO clienteDefault = pcclientDAO.buscarDTOporCodigo(2);
            if (clienteDefault != null) {
                clienteSelecionadoManual = clienteDefault;
                tfCliente.setText(clienteDefault.toString());
                carregarDadosRelacionadosCliente(clienteDefault.getCodcli());
            }
        } catch (Exception e) {
            showAlert("Erro ao carregar cliente padrão: " + e.getMessage(), Alert.AlertType.ERROR);
        }

        cbCusto.setOnAction(event -> {
            if (cbCusto.isSelected()) {
                cbVenda.setSelected(false);
            }
        });

        cbVenda.setOnAction(event -> {
            if (cbVenda.isSelected()) {
                cbCusto.setSelected(false);
            }
        });

    }

    private void carregarDados() {
        //carregarDadosClientes();
        carregarDadosFiliais();

        carregarOpcoesRCA();
        carregarOpcoesCaixas();
        carregarOpcoesFuncionarios();

        comboPraca.setDisable(true);
        comboRamoAtividade.setDisable(true);
        comboPlanoPagamento.setDisable(true);
        comboCobranca.setDisable(true);
        comboSupervisor.setDisable(true);
    }

    private void carregarDadosClientes() {
        try {
            List<String> clientes = pcclientDAO.buscarTodos().stream()
                    .sorted(Comparator.comparing(pcclient -> pcclient.getId().getCodcli()))
                    .map(pcclient -> pcclient.getId().getCodcli() + " - " + pcclient.getCliente())
                    .collect(Collectors.toList());

            carregarComboBox(comboCliente, clientes);
        } catch (Exception e) {
            showAlert("Erro ao carregar clientes: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


//    private void carregarDadosClientes() {
//        try {
//            Pcclient cliente = pcclientDAO.buscarPorCodigo(2);
//
//            carregarComboBox2(comboCliente, cliente.getId().getCodcli() + " - " + cliente.getCliente());
//        } catch (Exception e) {
//            showAlert("Erro ao carregar clientes: " + e.getMessage(), Alert.AlertType.ERROR);
//        }
//    }

    // Método para abrir a janela modal de pesquisa de cliente
    private void onPesquisarCliente() {
        ModalTableClientes modal = new ModalTableClientes();
        Stage stage = new Stage();
        stage.setScene(new Scene(modal));
        stage.setTitle("Pesquisar Cliente");
        stage.setWidth(600);
        stage.setHeight(480);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.showAndWait();

        Pcclient clienteSelecionado = modal.getSelecionado();
        if (clienteSelecionado != null) {
            clienteSelecionadoManual = new ClienteDTO(clienteSelecionado.getId().getCodcli(), clienteSelecionado.getCliente());
            tfCliente.setText(clienteSelecionadoManual.toString());
            carregarDadosRelacionadosCliente(clienteSelecionadoManual.getCodcli());
        }
    }

    private void buscarClientePorCodigoDigitado() {
        String texto = tfCliente.getText().trim();

        if (texto.isEmpty()) {
            clienteSelecionadoManual = null;
            return;
        }

        try {
            Integer codcli = Integer.parseInt(texto.replaceAll("[^0-9]", ""));
            ClienteDTO cliente = pcclientDAO.buscarDTOporCodigo(codcli);


            if (cliente != null) {
                clienteSelecionadoManual = cliente;
                tfCliente.setText(cliente.toString());
                carregarDadosRelacionadosCliente(cliente.getCodcli());
            } else {
                showAlert("Cliente não encontrado para o código informado!", Alert.AlertType.WARNING);
                tfCliente.clear();
                clienteSelecionadoManual = null;
            }

        } catch (NumberFormatException e) {
            showAlert("Informe apenas o código numérico do cliente.", Alert.AlertType.WARNING);
            tfCliente.clear();
            clienteSelecionadoManual = null;
        } catch (Exception e) {
            showAlert("Erro ao buscar cliente: " + e.getMessage(), Alert.AlertType.ERROR);
            tfCliente.clear();
            clienteSelecionadoManual = null;
        }
    }

    public void abrirModalPesquisa(ActionEvent actionEvent) {
        onPesquisarCliente();
    }

    private void carregarComboBoxFilial(ComboBox<FilialDTO> comboBox, List<FilialDTO> valores) {
        comboBox.setItems(FXCollections.observableArrayList(valores));
        comboBox.getItems().add(0, new FilialDTO(null, "Selecione..."));
        comboBox.getSelectionModel().selectFirst();
    }


    private void carregarDadosFiliais() {
        try {
            List<FilialDTO> filiais = pcfilialDAO.buscarTodas().stream()
                    .sorted(Comparator.comparing(pcfilial -> pcfilial.getId().getCodigo()))
                    .map(pcfilial -> new FilialDTO(Integer.valueOf(pcfilial.getId().getCodigo()), pcfilial.getRazaosocial()))
                    .collect(Collectors.toList());

            carregarComboBoxFilial(comboFilial, filiais);
        } catch (Exception e) {
            showAlert("Erro ao carregar filiais: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    //    private void carregarDadosRelacionadosCliente() {
//        String clienteSelecionado = comboCliente.getSelectionModel().getSelectedItem();
//        //String clienteSelecionado = "2";
//
//        if (clienteSelecionado == null || clienteSelecionado.equals("Selecione...")) {
//            comboPraca.setValue(null);
//            comboRamoAtividade.setValue(null);
//            comboPlanoPagamento.getSelectionModel().clearSelection();
//            comboCobranca.getSelectionModel().clearSelection();
//            return;
//        }
//
//        comboPraca.setDisable(false);
//        comboRamoAtividade.setDisable(false);
//        comboPlanoPagamento.setDisable(false);
//        comboCobranca.setDisable(false);
//        try {
//            Integer codcli = Integer.parseInt(clienteSelecionado.split(" - ")[0]);
//            //Integer codcli = 2;
//
//            // Buscar dados do cliente
//            Integer codPraca = pcclientDAO.buscarPracaPorCliente(codcli);
//            Integer codRamoAtividade = pcclientDAO.buscarRamoAtividadePorCliente(codcli);
//            Short codPlanoPagamento = pcclientDAO.buscarPlanoPagamentoPorCliente(codcli);
//            String codCobranca = pcclientDAO.buscarCobrancaPorCliente(codcli);
//
//            // Preencher Praça e Ramo de Atividade do Cliente
//            comboPraca.setValue(codPraca != null ? codPraca.toString() : "Não informado");
//            comboRamoAtividade.setValue(codRamoAtividade != null ? codRamoAtividade.toString() : "Não informado");
//
//            // Carregar todas as opções antes de definir o valor do cliente
//            carregarOpcoesCobranca(codCobranca);
//            carregarOpcoesPlanoPagamento(Integer.valueOf(codPlanoPagamento));
//
//            comboPraca.setDisable(true);
//            comboRamoAtividade.setDisable(true);
//        } catch (Exception e) {
//            showAlert("Erro ao carregar dados do cliente: " + e.getMessage(), Alert.AlertType.ERROR);
//        }
//    }
private void carregarDadosRelacionadosCliente(Integer codcli) {
    if (codcli == null) {
        comboPraca.setValue(null);
        comboRamoAtividade.setValue(null);
        comboPlanoPagamento.getSelectionModel().clearSelection();
        comboCobranca.getSelectionModel().clearSelection();
        return;
    }

    comboPraca.setDisable(false);
    comboRamoAtividade.setDisable(false);
    comboPlanoPagamento.setDisable(false);
    comboCobranca.setDisable(false);

    try {
        Integer codPraca = pcclientDAO.buscarPracaPorCliente(codcli);
        Integer codRamo = pcclientDAO.buscarRamoAtividadePorCliente(codcli);
        Short codPlano = pcclientDAO.buscarPlanoPagamentoPorCliente(codcli);
        String codCobranca = pcclientDAO.buscarCobrancaPorCliente(codcli);

        comboPraca.setValue(codPraca != null ? codPraca.toString() : "Não informado");
        comboRamoAtividade.setValue(codRamo != null ? codRamo.toString() : "Não informado");

        carregarOpcoesCobranca(codCobranca);
        carregarOpcoesPlanoPagamento(codPlano != null ? codPlano.intValue() : null);

        comboPraca.setDisable(true);
        comboRamoAtividade.setDisable(true);

    } catch (Exception e) {
        showAlert("Erro ao carregar dados do cliente: " + e.getMessage(), Alert.AlertType.ERROR);
    }
}

    private void carregarComboBoxFuncionario(ComboBox<FuncionarioDTO> comboBox, List<FuncionarioDTO> valores) {
        comboBox.setItems(FXCollections.observableArrayList(valores));
        comboBox.getItems().add(0, new FuncionarioDTO(null, "Selecione..."));
        comboBox.getSelectionModel().selectFirst();
    }


    private void carregarOpcoesFuncionarios() {
        try {
            List<FuncionarioDTO> funcionarios = pcemprDAO.listarTodos().stream()
                    .sorted(Comparator.comparing(pcempr -> pcempr.getId()))
                    .map(pcempr -> new FuncionarioDTO(pcempr.getId(), pcempr.getNome()))
                    .collect(Collectors.toList());

            carregarComboBoxFuncionario(comboFuncionario, funcionarios);
        } catch (Exception e) {
            showAlert("Erro ao carregar funcionários: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


    private void carregarOpcoesCaixas() {
        try {
            List<String> caixas = pccaixaDAO.buscarTodos().stream()
                    .sorted(Comparator.comparing(pccaixa -> pccaixa.getId()))
                    .map(pccaixa -> pccaixa.getId() + " - " + pccaixa.getDescricao())
                    .collect(Collectors.toList());

            carregarComboBox(comboCaixa, caixas);
        } catch (Exception e) {
            showAlert("Erro ao carregar caixas: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


    private void carregarOpcoesCobranca(String codCobrancaCliente) {
        try {
            List<String> cobrancas = pccobDAO.buscarTodos().stream()
                    .sorted(Comparator.comparing(pccob -> pccob.getCodcob()))
                    .map(pccob -> pccob.getCodcob() + " - " + pccob.getCobranca())
                    .collect(Collectors.toList());

            carregarComboBox(comboCobranca, cobrancas);

            // Definir o valor padrão se aplicável
            if (codCobrancaCliente != null) {
                for (String cobranca : cobrancas) {
                    if (cobranca.startsWith(codCobrancaCliente + " -")) {
                        comboCobranca.setValue(cobranca);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            showAlert("Erro ao carregar cobranças: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


    private void carregarOpcoesPlanoPagamento(Integer codPlanoPagamentoCliente) {
        try {
            List<String> planos = pcplpagDAO.buscarTodos().stream()
                    .sorted(Comparator.comparing(pcplpag -> pcplpag.getId()))
                    .map(pcplpag -> pcplpag.getId() + " - " + pcplpag.getDescricao())
                    .collect(Collectors.toList());

            carregarComboBox(comboPlanoPagamento, planos);


            // Definir o valor padrão se aplicável
            if (codPlanoPagamentoCliente != null) {
                for (String plano : planos) {
                    if (plano.startsWith(codPlanoPagamentoCliente + " -")) {
                        comboPlanoPagamento.setValue(plano);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            showAlert("Erro ao carregar planos de pagamento: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


    private void carregarOpcoesRCA() {
        try {
            List<String> rcas = pcusuariDAO.buscarTodos().stream()
                    .sorted(Comparator.comparing(pcusuari -> pcusuari.getId()))
                    .map(pcusuari -> pcusuari.getId() + " - " + pcusuari.getNome())
                    .collect(Collectors.toList());

            carregarComboBox(comboRCA, rcas);
        } catch (Exception e) {
            showAlert("Erro ao carregar RCA: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }


    private void carregarComboBox(ComboBox<String> comboBox, List<String> valores) {
        comboBox.setItems(FXCollections.observableArrayList(valores));
        comboBox.getItems().add(0, "Selecione...");
        comboBox.getSelectionModel().selectFirst();
    }

    private void carregarComboBox2(ComboBox<String> comboBox, String valor) {
        comboBox.getItems().clear(); // Limpa itens anteriores
        comboBox.getItems().add(valor); // Adiciona o único valor
        comboBox.getSelectionModel().selectFirst(); // Seleciona automaticamente
    }



    private void onRCASelecionado() {
        String rcaSelecionado = comboRCA.getSelectionModel().getSelectedItem();

        if (rcaSelecionado != null && !rcaSelecionado.equals("Selecione...")) {
            // Obtém o código do RCA (antes do " - ")
            Short codRCA = Short.parseShort(rcaSelecionado.split(" - ")[0]);

            // Buscar o código do supervisor associado ao RCA
            Short codSupervisor = pcusuariDAO.buscarSupervisorPorRCA(codRCA);

            if (codSupervisor != null) {
                comboSupervisor.setValue(codSupervisor.toString());
            } else {
                comboSupervisor.setValue("Não informado");
            }

            // Torna o campo Supervisor não editável
            //comboSupervisor.setDisable(true);
        } else {
            comboSupervisor.setValue(null);
            comboSupervisor.setDisable(false);
        }
    }

    private void onAvancar() {
        String clienteSelecionado = clienteSelecionadoManual.toString();
        FilialDTO filialSelecionadaDTO = comboFilial.getSelectionModel().getSelectedItem();
        if (filialSelecionadaDTO == null || filialSelecionadaDTO.getCodigo() == null) {
            showAlert("Selecione uma filial antes de continuar!", Alert.AlertType.WARNING);
            return;
        }
        String filialSelecionada = filialSelecionadaDTO.toString(); // ou .getCodigo().toString() se quiser só o código

        String rcaSelecionado = getSelectedValue(comboRCA);


        if (clienteSelecionadoManual == null) {
            showAlert("Selecione um cliente antes de continuar!", Alert.AlertType.WARNING);
            return;
        }


        if (filialSelecionada == null) {
            showAlert("Selecione uma filial antes de continuar!", Alert.AlertType.WARNING);
            return;
        }

        if (rcaSelecionado == null) {
            showAlert("Selecione um RCA antes de continuar!", Alert.AlertType.WARNING);
            return;
        }

        Integer qtdeMaxItens = getIntegerValue(txtQtdeMaxItens, "Qtde Máx. Itens no Orçamento");
        if (qtdeMaxItens == null) {
            showAlert("Informe a quantidade máxima de itens no orçamento!", Alert.AlertType.WARNING);
            return;
        }

        String pracaSelecionada = getSelectedValue(comboPraca);
        String planoPagamentoSelecionado = getSelectedValue(comboPlanoPagamento);
        String cobrancaSelecionada = getSelectedValue(comboCobranca);
        String supervisorSelecionado = getSelectedValue(comboSupervisor);

        // Criando objeto de parâmetros para passar à próxima tela
        ParametrosModel parametros = new ParametrosModel(
                clienteSelecionado, filialSelecionada, pracaSelecionada,
                getSelectedValue(comboRamoAtividade), planoPagamentoSelecionado,
                cobrancaSelecionada, rcaSelecionado, supervisorSelecionado,
                qtdeMaxItens
        );

        try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/telaDepartamentos16.fxml"));
            Parent root = loader.load();

            TelaDepartamentoController controller = loader.getController();
            if (controller == null) {
                showAlert("Erro ao carregar controlador da tela de departamentdos!", Alert.AlertType.ERROR);
                return;
            }

            // Passando os parâmetros diretamente para a tela de tributação via controller da tela de departamentos
            controller.setParametrosModel(parametros);


            Stage stage = new Stage();
            stage.setTitle("Departamentos");
            stage.setScene(new Scene(root));
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();

            ((Stage) btnAvancar.getScene().getWindow()).close();


        } catch (Exception e) {
            showAlert("Erro ao carregar próxima tela: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private Integer getIntegerValue(TextField field, String fieldName) {
        try {
            return field.getText().trim().isEmpty() ? null : Integer.parseInt(field.getText().trim());
        } catch (NumberFormatException ex) {
            showAlert("Insira um valor numérico válido para '" + fieldName + "'!", Alert.AlertType.ERROR);
            return null;
        }
    }

    private Double getDoubleValue(TextField field, String fieldName) {
        try {
            return field.getText().trim().isEmpty() ? null : Double.parseDouble(field.getText().trim());
        } catch (NumberFormatException ex) {
            showAlert("Insira um valor numérico válido para '" + fieldName + "'!", Alert.AlertType.ERROR);
            return null;
        }
    }

    private String getSelectedValue(ComboBox<String> comboBox) {
        String value = comboBox.getSelectionModel().getSelectedItem();
        return (value != null && !value.equals("Selecione...")) ? value : null;
    }

    private void showAlert(String message, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle("AVISO!");
        alert.setHeaderText(null);
        alert.setContentText(message);
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.setStyle("-fx-background-color:  #0041a6; -fx-border-color: #2980b9; -fx-border-width: 2;");
        dialogPane.lookup(".content").setStyle("-fx-background-color:  #0041a6; -fx-text-fill: white;-fx-font-weight: bold; -fx-font-size: 14pt; -fx-font-family: Arial");
        Button okButton = (Button) dialogPane.lookupButton(ButtonType.OK);
        okButton.setStyle("-fx-background-color: white; -fx-text-fill: white;-fx-cursor: hand; -fx-text-fill: #0041a6;-fx-font-weight: bold;-fx-font-family: Arial");
        dialogPane.setMinHeight(Region.USE_PREF_SIZE);
        dialogPane.setMinWidth(400);
        dialogPane.setPrefHeight(150);
        dialogPane.setPrefWidth(500);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void closeWindow(ActionEvent actionEvent) {
        // Obtém a janela atual e fecha
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    public void minimizeWindow(ActionEvent actionEvent) {
        // Obtém a janela atual e minimiza
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }



}
