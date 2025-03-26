package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "PCCNAE")
public class Pccnae {
    @Id
    @Column(name = "CODCNAE", nullable = false, length = 60)
    private String codcnae;

    @Column(name = "DESCCNAE", nullable = false, length = 250)
    private String desccnae;

    @Column(name = "PERCARGATRIBMEDIA", precision = 8, scale = 4)
    private BigDecimal percargatribmedia;

    @Column(name = "MARGEMMVA", precision = 8, scale = 4)
    private BigDecimal margemmva;

    @Column(name = "PERLIMVENDACNAE", precision = 18, scale = 6)
    private BigDecimal perlimvendacnae;

    @Column(name = "PERCFATMES", precision = 18, scale = 2)
    private BigDecimal percfatmes;

    @Column(name = "FATMEDIOMENSAL", precision = 18, scale = 2)
    private BigDecimal fatmediomensal;

    public String getCodcnae() {
        return codcnae;
    }

    public void setCodcnae(String codcnae) {
        this.codcnae = codcnae;
    }

    public String getDesccnae() {
        return desccnae;
    }

    public void setDesccnae(String desccnae) {
        this.desccnae = desccnae;
    }

    public BigDecimal getPercargatribmedia() {
        return percargatribmedia;
    }

    public void setPercargatribmedia(BigDecimal percargatribmedia) {
        this.percargatribmedia = percargatribmedia;
    }

    public BigDecimal getMargemmva() {
        return margemmva;
    }

    public void setMargemmva(BigDecimal margemmva) {
        this.margemmva = margemmva;
    }

    public BigDecimal getPerlimvendacnae() {
        return perlimvendacnae;
    }

    public void setPerlimvendacnae(BigDecimal perlimvendacnae) {
        this.perlimvendacnae = perlimvendacnae;
    }

    public BigDecimal getPercfatmes() {
        return percfatmes;
    }

    public void setPercfatmes(BigDecimal percfatmes) {
        this.percfatmes = percfatmes;
    }

    public BigDecimal getFatmediomensal() {
        return fatmediomensal;
    }

    public void setFatmediomensal(BigDecimal fatmediomensal) {
        this.fatmediomensal = fatmediomensal;
    }

}