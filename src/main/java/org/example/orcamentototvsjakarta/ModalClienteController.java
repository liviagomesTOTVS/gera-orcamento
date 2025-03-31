package org.example.orcamentototvsjakarta;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.example.orcamentototvsjakarta.DTO.ClienteDTO;
import org.example.orcamentototvsjakarta.db.dao.PcclientDAO;

import java.util.List;

public class ModalClienteController {

    @FXML private TextField txtFiltro;
    @FXML private TableView<ClienteDTO> tabelaClientes;
    @FXML private TableColumn<ClienteDTO, Integer> colCodigo;
    @FXML private TableColumn<ClienteDTO, String> colNome;
    @FXML private TableColumn<ClienteDTO, String> colCnpj;

    private final PcclientDAO dao = new PcclientDAO();
    private ClienteDTO clienteSelecionado;

    @FXML
    public void initialize() {
        colCodigo.setCellValueFactory(data -> new SimpleObjectProperty<>(data.getValue().getCodcli()));
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome()));
        colCnpj.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getCnpj())); // se tiver no DTO

        // Dê dois cliques para selecionar o cliente
        tabelaClientes.setRowFactory(tv -> {
            TableRow<ClienteDTO> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && !row.isEmpty()) {
                    clienteSelecionado = row.getItem();
                    fechar();
                }
            });
            return row;
        });
    }


    @FXML
    public void onBuscar() {
        System.out.println("Buscando Cliente");
        String filtro = txtFiltro.getText().trim();
        if (filtro.isEmpty())
            System.out.println("Filtro nulo");;

        List<ClienteDTO> resultados = dao.buscarDTOPorFiltro(filtro, 50);
        tabelaClientes.setItems(FXCollections.observableArrayList(resultados));
    }


    @FXML
    public void onSelecionar() {
        clienteSelecionado = tabelaClientes.getSelectionModel().getSelectedItem();
        fechar();
    }

    @FXML
    public void onCancelar() {
        clienteSelecionado = null;
        fechar();
    }

    private void fechar() {
        Stage stage = (Stage) txtFiltro.getScene().getWindow();
        stage.close();
    }

    public ClienteDTO getClienteSelecionado() {
        return clienteSelecionado;
    }
}
