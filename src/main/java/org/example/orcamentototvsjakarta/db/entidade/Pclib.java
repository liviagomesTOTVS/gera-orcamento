package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "PCLIB")
public class Pclib {
    @EmbeddedId
    private PclibId id;

    @Column(name = "CODFUNC_LIB")
    private Integer codfuncLib;

    @Column(name = "DATA_LIB")
    private LocalDate dataLib;

    public PclibId getId() {
        return id;
    }

    public void setId(PclibId id) {
        this.id = id;
    }

    public Integer getCodfuncLib() {
        return codfuncLib;
    }

    public void setCodfuncLib(Integer codfuncLib) {
        this.codfuncLib = codfuncLib;
    }

    public LocalDate getDataLib() {
        return dataLib;
    }

    public void setDataLib(LocalDate dataLib) {
        this.dataLib = dataLib;
    }

}