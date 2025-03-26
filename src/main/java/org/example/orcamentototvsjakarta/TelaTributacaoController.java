package org.example.orcamentototvsjakarta;

import javafx.application.Platform;
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
import javafx.scene.layout.Region;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.example.orcamentototvsjakarta.db.dao.PctributDAO;
import org.example.orcamentototvsjakarta.db.entidade.Pctribut;
import org.example.orcamentototvsjakarta.model.ParametrosModel;
import org.example.orcamentototvsjakarta.model.TributacaoModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.Persistence;
import jakarta.persistence.StoredProcedureQuery;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TelaTributacaoController {

    @FXML private ListView<TributacaoModel> listTributacoes;
    @FXML private Button btnProximo;
    @FXML private Button btnAnterior;
    @FXML private Button btnTodos;
    @FXML private Button btnNenhum;
    @FXML private Button btnInverter;

    private ParametrosModel parametrosModel;
    private List<String> departamentosSelecionados;
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("default");

    private final PctributDAO pcTributDAO = new PctributDAO();
    private final ObservableList<TributacaoModel> tributacoes = FXCollections.observableArrayList();

    public void setParametrosModel(ParametrosModel parametrosModel) {
        this.parametrosModel = parametrosModel;
    }

    public void setDepartamentosSelecionados(List<String> departamentosSelecionados) {
        this.departamentosSelecionados = departamentosSelecionados;
        carregarTributacoes();
    }

    @FXML
    public void initialize() {
        listTributacoes.setItems(tributacoes);

        listTributacoes.setCellFactory(param -> new ListCell<>() {
            private final CheckBox checkBox = new CheckBox();
            private final Label lblCodigo = new Label();
            private final Label lblDescricao = new Label();
            private final HBox hBox = new HBox(10, checkBox, lblCodigo, lblDescricao);

            {
                checkBox.setOnAction(event -> {
                    TributacaoModel tributacao = getItem();
                    if (tributacao != null) {
                        tributacao.setSelecionado(checkBox.isSelected());
                    }
                });
                checkBox.setCursor(Cursor.HAND);
                checkBox.setMinWidth(43);
                lblCodigo.setMinWidth(80);
                lblCodigo.setTextAlignment(TextAlignment.CENTER);
                lblDescricao.setMinWidth(200);
            }

            @Override
            protected void updateItem(TributacaoModel tributacao, boolean empty) {
                super.updateItem(tributacao, empty);
                if (empty || tributacao == null) {
                    setGraphic(null);
                } else {
                    lblCodigo.setText(tributacao.getCodigo().toString());
                    lblDescricao.setText(tributacao.getDescricao());
                    checkBox.setSelected(tributacao.isSelecionado());
                    setGraphic(hBox);
                }
            }
        });

        btnProximo.setOnAction(event -> onProximo());
        btnAnterior.setOnAction(event -> onAnterior());
        btnTodos.setOnAction(event -> selecionarTodos(true));
        btnNenhum.setOnAction(event -> selecionarTodos(false));
        btnInverter.setOnAction(event -> inverterSelecao());

        carregarTributacoes();
    }

    private void carregarTributacoes() {
        List<Pctribut> listaTributacoes = pcTributDAO.buscarTodos();

        // Ordena as tributacoes pelo código (assumindo que trib.getId() seja comparável ou numérico)
        listaTributacoes.sort(Comparator.comparing(Pctribut::getId));

        tributacoes.clear();

        for (Pctribut trib : listaTributacoes) {
            TributacaoModel model = new TributacaoModel(false, trib.getId(), trib.getMensagem());
            tributacoes.add(model);
        }
    }


    private void selecionarTodos(boolean selecionar) {
        for (TributacaoModel trib : listTributacoes.getItems()) {
            trib.setSelecionado(selecionar);
        }
        listTributacoes.refresh();
    }

    private void inverterSelecao() {
        for (TributacaoModel trib : listTributacoes.getItems()) {
            trib.setSelecionado(!trib.isSelecionado());
        }
        listTributacoes.refresh();
    }

    @FXML
    private void onProximo() {
        List<String> departamentosSelecionadosLista = new ArrayList<>();
        List<String> tributacoesSelecionadasLista = new ArrayList<>();
        List<String> codstLista = new ArrayList<>();
        List<String> mensagensLista = new ArrayList<>();

        // Coletar departamentos selecionados
        for (String codigoDepartamento : departamentosSelecionados) {
            departamentosSelecionadosLista.add(codigoDepartamento);
        }

        if (departamentosSelecionadosLista.isEmpty()) {
            showAlert("Selecione pelo menos um departamento!", Alert.AlertType.WARNING);
            return;
        }

        // Coletar tributações selecionadas
        for (TributacaoModel trib : listTributacoes.getItems()) {
            if (trib.isSelecionado()) {
                tributacoesSelecionadasLista.add(trib.getCodigo().toString());
                codstLista.add(trib.getCodigo().toString());
                mensagensLista.add(trib.getDescricao());
            }
        }

        if (tributacoesSelecionadasLista.isEmpty()) {
            showAlert("Selecione pelo menos uma tributação!", Alert.AlertType.WARNING);
            return;
        }

//        // Verifica se os parâmetros foram repassados corretamente
//        if (parametrosModel == null) {
//            showAlert("Parâmetros não informados!", Alert.AlertType.ERROR);
//            return;
//        }

        try {
            // Extração dos valores dos parâmetros
            int codcli = Integer.parseInt(parametrosModel.getCliente().split(" - ")[0].trim());
            int rca = Integer.parseInt(parametrosModel.getRca().split(" - ")[0].trim());
            int planoPagamento = Integer.parseInt(parametrosModel.getPlanoPagamento().split(" - ")[0].trim());
            int codativ = Integer.parseInt(parametrosModel.getRamoAtividade().split(" - ")[0].trim());
            String cobranca = parametrosModel.getCobranca().split(" - ")[0].trim();
            int funcionario = 0;
            int supervisor = Integer.parseInt(parametrosModel.getSupervisor().split(" - ")[0].trim());
            int caixa = 0;

            // Concatenação de departamentos e tributações para envio à procedure (caso ainda seja necessário)
            String departamentosConcatenados = String.join(",", departamentosSelecionadosLista);
            String codstConcatenado = String.join(",", codstLista);
            String mensagensConcatenadas = String.join(" | ", mensagensLista);

            // Extrai o código da filial
            String filialCode = parametrosModel.getFilial().split(" - ")[0].trim();
            int limiteProdutos = parametrosModel.getQtdeMaxItens();

            // Depuração dos parâmetros
            System.out.println("Depuração dos parâmetros:");
            System.out.println("p_codcli           = " + codcli);
            System.out.println("p_codativ          = " + codativ);
            System.out.println("p_cobranca         = " + cobranca);
            System.out.println("p_plano_pagamento  = " + planoPagamento);
            System.out.println("p_funcionario      = " + funcionario);
            System.out.println("p_rca              = " + rca);
            System.out.println("p_supervisor       = " + supervisor);
            System.out.println("p_caixa            = " + caixa);
            System.out.println("p_codst            = " + codstConcatenado);
            System.out.println("p_mensagem         = " + mensagensConcatenadas);
            System.out.println("p_departamento     = " + departamentosConcatenados);
            System.out.println("p_codfilial        = " + filialCode);
            System.out.println("p_codfilialnf      = " + filialCode);
            System.out.println("p_limite_produtos  = " + limiteProdutos);

            List<Integer> listaDepartamentosInt = new ArrayList<>();
            for (String dep : departamentosSelecionadosLista) {
                listaDepartamentosInt.add(Integer.parseInt(dep.trim()));
            }
            List<Integer> listaCodstInt = new ArrayList<>();
            for (String cod : codstLista) {
                listaCodstInt.add(Integer.parseInt(cod.trim()));
            }

            // Constrói as cláusulas IN dinamicamente
            String inClauseDep = "(" + listaDepartamentosInt.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(",")) + ")";
            String inClauseCodst = "(" + listaCodstInt.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(",")) + ")";

            // Criando EntityManager e iniciando a transação
            EntityManager em = EMF.createEntityManager();
            em.getTransaction().begin();

            // --- Executa a query nativa para seleção dos produtos ---
            String sql = "SELECT * FROM ( " +
                    "  SELECT ROWNUM NUMSEQ, CODPROD, QTUNITEMB, QTESTOQUE, QTEST, QTESTGER, PUNIT, PTABELA, CODST " +
                    "  FROM ( " +
                    "      SELECT " +
                    "          PCPRODUT.CODPROD, " +
//                    "          ROWNUM NUMSEQ, " +
                    "          PCPRODUT.DESCRICAO, " +
                    "          PCPRODUT.EMBALAGEM, " +
                    "          PCPRODUT.UNIDADE, " +
                    "          NVL(VIEWMENOREMBALAGEM.CODAUXILIAR, PCPRODUT.CODAUXILIAR) CODAUXILIAR, " +
                    "          PCFORNEC.CODFORNEC, " +
                    "          PCFORNEC.FORNECEDOR, " +
                    "          PCMARCA.CODMARCA, " +
                    "          PCMARCA.MARCA, " +
                    "          PCPRODUT.CODFAB, " +
                    "          PCPRODUT.OBS2, " +
                    "          NVL(VIEWMENOREMBALAGEM.QTUNIT, PCPRODUT.QTUNIT) QTUNITEMB, " +
                    "          PCPRODUT.CODINTERNO, " +
                    "          PCPRODUT.NUMORIGINAL, " +
                    "          (NVL(PCEST.QTEST, 0) - NVL(PCEST.QTESTGER, 0)) - NVL((SELECT SUM(PCORCAVENDAI.QT) " +
                    "              FROM PCORCAVENDAI, PCORCAVENDAC " +
                    "              WHERE PCORCAVENDAI.NUMORCA = PCORCAVENDAC.NUMORCA " +
                    "                AND PCORCAVENDAI.CODPROD = PCPRODUT.CODPROD " +
                    "                AND NVL(PCORCAVENDAC.CODFILIALNF, PCORCAVENDAC.CODFILIAL) = PCEST.CODFILIAL " +
                    "                AND PCORCAVENDAC.NUMPED IS NULL " +
                    "                AND PCORCAVENDAC.NUMCCF IS NULL " +
                    "                AND PCORCAVENDAC.DTCANCEL IS NULL), 0) QTPEDIDA, " +
                    "          CEIL(((NVL(PCEST.QTEST, 0) - NVL(PCEST.QTESTGER, 0)) - NVL((SELECT SUM(PCORCAVENDAI.QT) " +
                    "              FROM PCORCAVENDAI, PCORCAVENDAC " +
                    "              WHERE PCORCAVENDAI.NUMORCA = PCORCAVENDAC.NUMORCA " +
                    "                AND PCORCAVENDAI.CODPROD = PCPRODUT.CODPROD " +
                    "                AND NVL(PCORCAVENDAC.CODFILIALNF, PCORCAVENDAC.CODFILIAL) = PCEST.CODFILIAL " +
                    "                AND PCORCAVENDAC.NUMPED IS NULL " +
                    "                AND PCORCAVENDAC.NUMCCF IS NULL " +
                    "                AND PCORCAVENDAC.FUT_DATACRIACAO IS NOT NULL " +
                    "                AND PCORCAVENDAC.DTCANCEL IS NULL), 0)) * 1 - (PCEST.QTESTGER * -1)) AS QTESTOQUE, " +
                    "          PCEST.QTEST, " +
                    "          PCEST.QTESTGER, " +
                    "          DECODE(NVL(PCEST.CUSTOCONT, 0), 0, NVL(PCEST.CUSTOFIN, 0), PCEST.CUSTOCONT) PUNIT, " +
                    "          DECODE(NVL(PCEST.CUSTOCONT, 0), 0, NVL(PCEST.CUSTOFIN, 0), PCEST.CUSTOCONT) PTABELA, " +
                    "          PCTRIBUT.CODST " +
                    "      FROM PCPRODUT, PCFORNEC, PCMARCA, PCEST, PCTABPR, PCCLIENT, PCPRACA, " +
                    "           PCTRIBUT, PCTRIBPISCOFINS, PCCONSUM, PCPLPAG, VIEWMENOREMBALAGEM " +
                    "      WHERE PCPRODUT.CODPROD = PCEST.CODPROD " +
                    "        AND PCPRODUT.DTEXCLUSAO IS NULL " +
                    "        AND PCPRODUT.CODFORNEC = PCFORNEC.CODFORNEC(+) " +
                    "        AND PCPRODUT.CODMARCA = PCMARCA.CODMARCA(+) " +
                    "        AND PCCLIENT.CODPRACA = PCPRACA.CODPRACA " +
                    "        AND PCTABPR.CODPROD = PCPRODUT.CODPROD " +
                    "        AND PCTABPR.NUMREGIAO = PCPRACA.NUMREGIAO " +
                    "        AND PCEST.CODFILIAL = VIEWMENOREMBALAGEM.CODFILIAL(+) " +
                    "        AND PCEST.CODPROD = VIEWMENOREMBALAGEM.CODPROD(+) " +
                    "        AND ((PCCONSUM.USATRIBUTACAOPORUF = 'S' " +
                    "              AND EXISTS (SELECT 1 FROM PCTABTRIB " +
                    "                          WHERE PCTABTRIB.CODPROD = PCEST.CODPROD " +
                    "                            AND PCTABTRIB.CODFILIALNF = PCEST.CODFILIAL " +
                    "                            AND PCTABTRIB.UFDESTINO = PCCLIENT.ESTENT " +
                    "                            AND PCTABTRIB.CODST = PCTRIBUT.CODST)) " +
                    "           OR (PCCONSUM.USATRIBUTACAOPORUF = 'N' " +
                    "               AND (PCTRIBUT.CODST = PCTABPR.CODST))) " +
                    "        AND ((PCCONSUM.USATRIBUTACAOPORUF = 'S' " +
                    "              AND EXISTS (SELECT 1 FROM PCTABTRIB " +
                    "                          WHERE PCTABTRIB.CODPROD = PCEST.CODPROD " +
                    "                            AND PCTABTRIB.CODFILIALNF = PCEST.CODFILIAL " +
                    "                            AND PCTABTRIB.UFDESTINO = PCCLIENT.ESTENT " +
                    "                            AND PCTABTRIB.CODTRIBPISCOFINS = PCTRIBPISCOFINS.CODTRIBPISCOFINS)) " +
                    "           OR (PCCONSUM.USATRIBUTACAOPORUF = 'N' " +
                    "               AND (PCTRIBPISCOFINS.CODTRIBPISCOFINS = PCTABPR.CODTRIBPISCOFINS))) " +
                    "        AND (NVL(PCEST.QTEST, 0) - NVL(PCEST.QTESTGER, 0)) - NVL((SELECT SUM(PCORCAVENDAI.QT) " +
                    "               FROM PCORCAVENDAI, PCORCAVENDAC " +
                    "               WHERE PCORCAVENDAI.NUMORCA = PCORCAVENDAC.NUMORCA " +
                    "                 AND PCORCAVENDAI.CODPROD = PCPRODUT.CODPROD " +
                    "                 AND NVL(PCORCAVENDAC.CODFILIALNF, PCORCAVENDAC.CODFILIAL) = PCEST.CODFILIAL " +
                    "                 AND PCORCAVENDAC.NUMPED IS NULL " +
                    "                 AND PCORCAVENDAC.NUMCCF IS NULL " +
                    "                 AND PCORCAVENDAC.FUT_DATACRIACAO IS NOT NULL " +
                    "                 AND PCORCAVENDAC.DTCANCEL IS NULL), 0) > 0 " +
                    "        AND PCPRODUT.CODEPTO IN " + inClauseDep + " " +
                    "        AND PCTRIBUT.CODST IN " + inClauseCodst + " " +
                    "        AND PCCLIENT.CODCLI = :codcli " +
                    "        AND PCPLPAG.CODPLPAG = :codplpag " +
                    "        AND PCEST.CODFILIAL = :filial " +
                    "    ) " +   // Fecha a subquery interna
                    "  ) " +    // Fecha a subquery intermediária
                    "ORDER BY DBMS_RANDOM.RANDOM";

            System.out.println("\n\nQuery Final: " + sql);


            // Após executar a consulta nativa e obter os resultados
            List<Object[]> results = em.createNativeQuery(sql)
                    .setParameter("codcli", codcli)
                    .setParameter("codplpag", planoPagamento)
                    .setParameter("filial", filialCode)
                    .getResultList();

            System.out.println("Produtos encontrados: " + results.size());

// Construir a string de produtos no formato esperado
            StringBuilder produtosConcatenados = new StringBuilder();
            for (Object[] row : results) {
                Integer numSeq = ((Number) row[0]).intValue();
                Integer codProd = ((Number) row[1]).intValue();
                Double qtUnitEmb = ((Number) row[2]).doubleValue();
                Double qtEstoque = ((Number) row[3]).doubleValue();
                Double qtest = ((Number) row[4]).doubleValue();
                Double qtestger = ((Number) row[5]).doubleValue();
                Double pUnit = ((Number) row[6]).doubleValue();
                Double pTabela = ((Number) row[7]).doubleValue();
                Integer codSt = ((Number) row[8]).intValue();

                produtosConcatenados.append(codProd).append("|")
                        .append(qtUnitEmb).append("|")
                        .append(qtEstoque).append("|")
                        .append(pUnit).append("|")
                        .append(pTabela).append("|")
                        .append(codSt).append("|")
                        .append(numSeq).append(";");
                System.out.println("Produto: NUMSEQ=" + numSeq + ", CODPROD=" + codProd);
            }

            // Remove o último ";" se houver produtos
            String produtosString = produtosConcatenados.length() > 0
                    ? produtosConcatenados.substring(0, produtosConcatenados.length() - 1)
                    : "";

            if (produtosString.isEmpty()) {
                showAlert("Nenhum produto foi selecionado!", Alert.AlertType.WARNING);
                return;
            }

            // Agora, chama a procedure passando os produtos em p_mensagem
            StoredProcedureQuery sp = em.createStoredProcedureQuery("sp_processa_orcamento");
            sp.registerStoredProcedureParameter(1, Integer.class, ParameterMode.IN);  // p_codcli
            sp.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);   // p_codativ
            sp.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);   // p_cobranca
            sp.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);   // p_plano_pagamento
            sp.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);   // p_funcionario
            sp.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);   // p_rca
            sp.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);   // p_supervisor
            sp.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);   // p_caixa
            sp.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);   // p_codst
            sp.registerStoredProcedureParameter(10, String.class, ParameterMode.IN);  // p_mensagem (produtos)
            sp.registerStoredProcedureParameter(11, String.class, ParameterMode.IN);  // p_departamento
            sp.registerStoredProcedureParameter(12, String.class, ParameterMode.IN);  // p_codfilial
            sp.registerStoredProcedureParameter(13, String.class, ParameterMode.IN);  // p_codfilialnf
            sp.registerStoredProcedureParameter(14, Integer.class, ParameterMode.IN); // p_limite_produtos
            sp.registerStoredProcedureParameter(15, String.class, ParameterMode.OUT); // novo param


            sp.setParameter(1, codcli);
            sp.setParameter(2, String.valueOf(codativ));
            sp.setParameter(3, cobranca);
            sp.setParameter(4, String.valueOf(planoPagamento));
            sp.setParameter(5, String.valueOf(funcionario));
            sp.setParameter(6, String.valueOf(rca));
            sp.setParameter(7, String.valueOf(supervisor));
            sp.setParameter(8, String.valueOf(caixa));
            sp.setParameter(9, codstConcatenado);  // Mantido por compatibilidade, mas não usado
            sp.setParameter(10, produtosString);   // Passa os produtos aqui
            sp.setParameter(11, departamentosConcatenados);  // Mantido por compatibilidade, mas não usado
            sp.setParameter(12, filialCode);
            sp.setParameter(13, filialCode);
            sp.setParameter(14, limiteProdutos);

            System.out.println("\n\nprodutosString: " + produtosString);

            sp.execute();
            String numorcasGerados = (String) sp.getOutputParameterValue(15);

            em.getTransaction().commit();
            em.close();

            showAlert("Procedimento executado com sucesso!", Alert.AlertType.INFORMATION);
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaOrcamentos.fxml"));
                Parent root = loader.load();

                // Se necessário, você pode passar dados adicionais ao controlador da nova tela
                // TelaOrcamentosController orcamentoController = loader.getController();
                // orcamentoController.setDados(...);
                TelaOrcamentosController controller = loader.getController();
                controller.setNumorcasGerados(numorcasGerados);

                Stage stage = (Stage) btnProximo.getScene().getWindow();
                //stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root));
            } catch (IOException e) {
                showAlert("Erro ao carregar a tela de orçamentos: " + e.getMessage(), Alert.AlertType.ERROR);
            }
        } catch (Exception ex) {
            showAlert("Erro ao chamar o procedimento: " + ex.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void onAnterior() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaDepartamentos16.fxml"));
            Parent root = loader.load();

            TelaDepartamentoController controller = loader.getController();
            if (controller == null) {
                showAlert("Erro ao carregar controlador da tela de departamentos!", Alert.AlertType.ERROR);
                return;
            }

            // Passar os parâmetros corretamente ao voltar
            controller.setParametrosModel(parametrosModel);

            Stage novaJanela = new Stage();
            novaJanela.setTitle("Departamentos");
            novaJanela.setScene(new Scene(root));
            //novaJanela.initStyle(StageStyle.UNDECORATED);
            novaJanela.show();

            Stage janelaAtual = (Stage) btnAnterior.getScene().getWindow();
            janelaAtual.close();
        } catch (IOException e) {
            showAlert("Erro ao carregar a tela de departamentos!", Alert.AlertType.ERROR);
        }
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
