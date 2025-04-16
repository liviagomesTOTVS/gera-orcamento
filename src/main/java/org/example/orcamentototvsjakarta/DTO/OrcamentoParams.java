package org.example.orcamentototvsjakarta.DTO;

import java.math.BigDecimal;

/**
 * Classe DTO que contém todos os parâmetros necessários para gerar um orçamento
 */
public class OrcamentoParams {
    private Integer codcli;
    private Short codusur;
    private Integer codfilial;
    private Integer codfilialnf;
    private String codcob;
    private Short codsupervisor;
    private Integer codplpag;
    private Integer codatv1;
    private String numprevenda;
    private BigDecimal valorMaximo;
    private String tipoPreco = "VENDA"; // Valor padrão
    private Double percentual = 0.0;    // Valor padrão
    private boolean boletoSelecionado;
    private boolean pixSelecionado;
    private boolean cartaoSelecionado;

    // Construtor completo
    public OrcamentoParams(Integer codcli, Short codusur, Integer codfilial, Integer codfilialnf,
                           String codcob, Short codsupervisor, Integer codplpag, Integer codatv1,
                           String numprevenda, BigDecimal valorMaximo, String tipoPreco, Double percentual,
                           boolean boletoSelecionado, boolean pixSelecionado, boolean cartaoSelecionado) {
        this.codcli = codcli;
        this.codusur = codusur;
        this.codfilial = codfilial;
        this.codfilialnf = codfilialnf;
        this.codcob = codcob;
        this.codsupervisor = codsupervisor;
        this.codplpag = codplpag;
        this.codatv1 = codatv1;
        this.numprevenda = numprevenda;
        this.valorMaximo = valorMaximo;
        if (tipoPreco != null) this.tipoPreco = tipoPreco;
        if (percentual != null) this.percentual = percentual;
        this.boletoSelecionado = boletoSelecionado;
        this.pixSelecionado = pixSelecionado;
        this.cartaoSelecionado = cartaoSelecionado;

        // Log para diagnóstico
        System.out.println("OrcamentoParams criado com valorMaximo: " + this.valorMaximo);
        System.out.println("OrcamentoParams criado com percentual: " + this.percentual);
        System.out.println("OrcamentoParams criado com tipoPreco: " + this.tipoPreco);
    }

    public OrcamentoParams() {

    }

    // Getters e Setters
    public Integer getCodcli() {
        return codcli;
    }

    public void setCodcli(Integer codcli) {
        this.codcli = codcli;
    }

    public Short getCodusur() {
        return codusur;
    }

    public void setCodusur(Short codusur) {
        this.codusur = codusur;
    }

    public Integer getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(Integer codfilial) {
        this.codfilial = codfilial;
    }

    public Integer getCodfilialnf() {
        return codfilialnf;
    }

    public void setCodfilialnf(Integer codfilialnf) {
        this.codfilialnf = codfilialnf;
    }

    public String getCodcob() {
        return codcob;
    }

    public void setCodcob(String codcob) {
        this.codcob = codcob;
    }

    public Short getCodsupervisor() {
        return codsupervisor;
    }

    public void setCodsupervisor(Short codsupervisor) {
        this.codsupervisor = codsupervisor;
    }

    public Integer getCodplpag() {
        return codplpag;
    }

    public void setCodplpag(Integer codplpag) {
        this.codplpag = codplpag;
    }

    public Integer getCodatv1() {
        return codatv1;
    }

    public void setCodatv1(Integer codatv1) {
        this.codatv1 = codatv1;
    }

    public String getNumprevenda() {
        return numprevenda;
    }

    public void setNumprevenda(String numprevenda) {
        this.numprevenda = numprevenda;
    }

    public BigDecimal getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(BigDecimal valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public String getTipoPreco() {
        return tipoPreco;
    }

    public void setTipoPreco(String tipoPreco) {
        this.tipoPreco = tipoPreco;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

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
        // Adicionar log aqui
        System.out.println("temFiltroTipoVendaAtivo - Boleto: " + boletoSelecionado +
                ", Pix: " + pixSelecionado +
                ", Cartão: " + cartaoSelecionado);

        // Se todos estiverem ativos ou todos inativos, não há filtro específico
        boolean resultado = !((boletoSelecionado && pixSelecionado && cartaoSelecionado) ||
                (!boletoSelecionado && !pixSelecionado && !cartaoSelecionado));

        System.out.println("temFiltroTipoVendaAtivo resultado: " + resultado);
        return resultado;
    }
}