package org.example.orcamentototvsjakarta.model;

import javafx.beans.property.*;
import java.math.BigDecimal;
import java.util.function.Function;

public class ParametrosModel {
    private final StringProperty cliente;
    private final StringProperty filial;
    private final StringProperty praca;
    private final StringProperty ramoAtividade;
    private final StringProperty planoPagamento;
    private final StringProperty cobranca;
    private final StringProperty rca;
    private final StringProperty supervisor;
    private final IntegerProperty qtdeMaxItens;
    private BigDecimal valorMaxOrcamento;
    private final StringProperty tipoPrecoProperty = new SimpleStringProperty("VENDA");
    private Double percentual = 0.0;
    private boolean boletoSelecionado;
    private boolean pixSelecionado;
    private boolean cartaoSelecionado;


    public ParametrosModel(String cliente, String filial, String praca, String ramoAtividade,
                           String planoPagamento, String cobranca, String rca, String supervisor,
                           Integer qtdeMaxItens, Double valorMaxOrcamento, Double percentual) {
        System.out.println("ParametrosModel recebeu valorMaxOrcamento: " + valorMaxOrcamento);
        System.out.println("ParametrosModel recebeu percentual: " + percentual);

        this.cliente = new SimpleStringProperty(cliente);
        this.filial = new SimpleStringProperty(filial);
        this.praca = new SimpleStringProperty(praca);
        this.ramoAtividade = new SimpleStringProperty(ramoAtividade);
        this.planoPagamento = new SimpleStringProperty(planoPagamento);
        this.cobranca = new SimpleStringProperty(cobranca);
        this.rca = new SimpleStringProperty(rca);
        this.supervisor = new SimpleStringProperty(supervisor);
        this.qtdeMaxItens = new SimpleIntegerProperty(qtdeMaxItens != null ? qtdeMaxItens : 10);

        this.valorMaxOrcamento = valorMaxOrcamento != null ?
                BigDecimal.valueOf(valorMaxOrcamento) :
                BigDecimal.valueOf(10000);

        // Adiciona a inicialização do percentual
        this.percentual = percentual != null ? percentual : 0.0;

        System.out.println("ParametrosModel definiu valorMaxOrcamento: " + this.valorMaxOrcamento);
        System.out.println("ParametrosModel definiu percentual: " + this.percentual);

        validarParametros();
    }


    // Método para calcular o valor do desconto baseado no percentual
    public double calcularValorDesconto(double valorBase) {
        if (percentual == null || percentual == 0.0) {
            return 0.0;
        }

        double percentualDecimal = percentual / 100.0;

        if ("C".equalsIgnoreCase(tipoPrecoProperty.get())) {
            // Para preço de custo (acréscimo)
            return valorBase * percentualDecimal;
        } else {
            // Para preço de venda (desconto)
            return valorBase * percentualDecimal;
        }
    }

    // O resto dos métodos permanece igual

    public boolean isBoletoSelecionado() {
        return boletoSelecionado;
    }

    public void setBoletoSelecionado(boolean boletoSelecionado) {
        this.boletoSelecionado = boletoSelecionado;
    }

    public boolean isPixSelecionado() {
        return pixSelecionado;
    }

    public void setPixSelecionado(boolean pixSelecionado) {
        this.pixSelecionado = pixSelecionado;
    }

    public boolean isCartaoSelecionado() {
        return cartaoSelecionado;
    }

    public void setCartaoSelecionado(boolean cartaoSelecionado) {
        this.cartaoSelecionado = cartaoSelecionado;
    }

    public boolean temFiltroTipoVendaAtivo() {
        return boletoSelecionado || pixSelecionado || cartaoSelecionado;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

    public String getTipoPreco() {
        return tipoPrecoProperty.get();
    }

    public void setTipoPreco(String tipoPreco) {
        this.tipoPrecoProperty.set(tipoPreco);
    }

    public StringProperty tipoPrecoProperty() {
        return tipoPrecoProperty;
    }

    private void validarParametros() {
        Function<String, Integer> extrairNumero = str -> {
            try {
                return (str != null && !str.isEmpty()) ? Integer.parseInt(str) : 0;
            } catch (NumberFormatException e) {
                return 0;
            }
        };

        if (cliente.get() == null || cliente.get().isEmpty()) cliente.set("0");
        if (filial.get() == null || filial.get().isEmpty()) filial.set("1");
        if (praca.get() == null || praca.get().isEmpty()) praca.set("1");
        if (ramoAtividade.get() == null || ramoAtividade.get().isEmpty()) ramoAtividade.set("1");
        if (planoPagamento.get() == null || planoPagamento.get().isEmpty()) planoPagamento.set("1");
        if (cobranca.get() == null || cobranca.get().isEmpty()) cobranca.set("D");
        if (rca.get() == null || rca.get().isEmpty()) rca.set("0");
        if (supervisor.get() == null || supervisor.get().isEmpty()) supervisor.set("1");
    }

    // Getters das Propriedades
    public StringProperty clienteProperty() { return cliente; }
    public StringProperty filialProperty() { return filial; }
    public StringProperty pracaProperty() { return praca; }
    public StringProperty ramoAtividadeProperty() { return ramoAtividade; }
    public StringProperty planoPagamentoProperty() { return planoPagamento; }
    public StringProperty cobrancaProperty() { return cobranca; }
    public StringProperty rcaProperty() { return rca; }
    public StringProperty supervisorProperty() { return supervisor; }
    public IntegerProperty qtdeMaxItensProperty() { return qtdeMaxItens; }

    // Métodos para obter os valores diretamente
    public String getCliente() { return cliente.get(); }
    public String getFilial() { return filial.get(); }
    public String getPraca() { return praca.get(); }
    public String getRamoAtividade() { return ramoAtividade.get(); }
    public String getPlanoPagamento() { return planoPagamento.get(); }
    public String getCobranca() { return cobranca.get(); }
    public String getRca() { return rca.get(); }
    public String getSupervisor() { return supervisor.get(); }
    public Integer getQtdeMaxItens() { return qtdeMaxItens.get(); }

    // Sobrecarga para compatibilidade com código existente
    public void setValorMaxOrcamento(Double valorMaxOrcamento) {
        this.valorMaxOrcamento = valorMaxOrcamento != null ?
                BigDecimal.valueOf(valorMaxOrcamento) :
                BigDecimal.valueOf(10000);
    }

    public BigDecimal getValorMaxOrcamento() {
        return valorMaxOrcamento;
    }

    public void setValorMaxOrcamento(BigDecimal valorMaxOrcamento) {
        this.valorMaxOrcamento = valorMaxOrcamento;
    }
}