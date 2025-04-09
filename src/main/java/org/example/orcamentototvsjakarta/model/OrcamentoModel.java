package org.example.orcamentototvsjakarta.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrcamentoModel {
    private Long id;
    private LocalDate data;
    private BigDecimal vltotal;
    private Integer codcli;
    private Short codusur;
    private BigDecimal vldesconto;


    public OrcamentoModel(Long id, LocalDate data, BigDecimal vltotal, Integer codcli, Short codusur, BigDecimal vldesconto) {
        this.id = id;
        this.data = data;
        this.vltotal = vltotal;
        this.codcli = codcli;
        this.codusur = codusur;
        this.vldesconto = vldesconto;
    }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getVltotal() {
        return vltotal;
    }

    public void setVltotal(BigDecimal vltotal) {
        this.vltotal = vltotal;
    }

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

    public BigDecimal getVldesconto() {
        return vldesconto;
    }

}

