package org.example.orcamentototvsjakarta.DTO;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class OrcamentoParams {

    private Integer codcli;
    private Integer rca;
    private Integer codfilial;
    private Integer codpraca;
    private String cobranca;   // Alterado para String
    private Integer supervisor;
    private Integer planoPagamento;
    private Integer codatv1;
    private Integer seq;
    private Integer codfilialnf;
    private Double percentual = 0.0;


    public Integer getCodfilialnf() {
        return codfilialnf;
    }

    public void setCodfilialnf(Integer codfilialnf) {
        this.codfilialnf = codfilialnf;
    }

    private Short codusur;
    private BigDecimal valorMaximo;
    private String tipoPreco;

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

    // Getters e Setters

    public Integer getCodcli() {
        return codcli;
    }

    public void setCodcli(Integer codcli) {
        this.codcli = codcli;
    }

    public BigDecimal getValorMaximo() {
        // Garantir que nunca retorne null
        return valorMaximo != null ? valorMaximo : BigDecimal.valueOf(10000);
    }

    public void setValorMaximo(BigDecimal valorMaximo) {
        if (valorMaximo != null && valorMaximo.compareTo(BigDecimal.ZERO) > 0) {
            this.valorMaximo = valorMaximo;
            // Log para depuração
            Logger.getLogger(OrcamentoParams.class.getName())
                    .info("Valor máximo definido (BigDecimal): " + valorMaximo);
        } else {
            // Usar valor padrão se nulo ou inválido
            this.valorMaximo = BigDecimal.valueOf(10000);
            Logger.getLogger(OrcamentoParams.class.getName())
                    .warning("Valor máximo inválido, usando padrão: 10000");
        }
    }

    // Sobrecarga para Double
    public void setValorMaximo(Double valorMaximo) {
        if (valorMaximo != null && valorMaximo > 0) {
            this.valorMaximo = BigDecimal.valueOf(valorMaximo);
            // Log para depuração
            Logger.getLogger(OrcamentoParams.class.getName())
                    .info("Valor máximo definido (Double): " + valorMaximo);
        } else {
            // Usar valor padrão se nulo ou inválido
            this.valorMaximo = BigDecimal.valueOf(10000);
            Logger.getLogger(OrcamentoParams.class.getName())
                    .warning("Valor máximo (Double) inválido, usando padrão: 10000");
        }
    }


    public Integer getRca() {
        return rca;
    }

    public void setRca(Integer rca) {
        this.rca = rca;
    }

    public Integer getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(Integer codfilial) {
        this.codfilial = codfilial;
    }

    public Integer getCodpraca() {
        return codpraca;
    }

    public void setCodpraca(Integer codpraca) {
        this.codpraca = codpraca;
    }

    public String getCobranca() {   // Alterado para String
        return cobranca;
    }

    public void setCobranca(String cobranca) {   // Alterado para String
        this.cobranca = cobranca;
    }

    public Integer getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Integer supervisor) {
        this.supervisor = supervisor;
    }

    public Integer getPlanoPagamento() {
        return planoPagamento;
    }

    public void setPlanoPagamento(Integer planoPagamento) {
        this.planoPagamento = planoPagamento;
    }

    public Integer getCodatv1() {
        return codatv1;
    }

    public void setCodatv1(Integer codatv1) {
        this.codatv1 = codatv1;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Short getCodusur() {
        return codusur;
    }

    public void setCodusur(Short codusur) {
        this.codusur = codusur;
    }

    public String getCodcob() {   // Alterado para String
        return cobranca;
    }

    public Integer getCodsupervisor() {
        return supervisor;
    }

    public Integer getCodplpag() {
        return planoPagamento;
    }

    public Integer getNumprevenda() {
        return seq;
    }


    public String getTipoPreco() {
        return tipoPreco;
    }

    public void setTipoPreco(String tipoPreco) {
        this.tipoPreco = tipoPreco;
    }

    public void setCodcob(String cobranca) {
        this.cobranca = cobranca;
    }

    public void setCodplpag(short planoPagamento) {
        this.planoPagamento = (int) planoPagamento;
    }

    public void setCodsupervisor(short supervisor) {
        this.supervisor = (int) supervisor;
    }

    public void setNumprevenda(String number) {
        try {
            this.codatv1 = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            // Se não for possível converter para inteiro, define como null ou 0
            this.codatv1 = 0;
        }
    }


}