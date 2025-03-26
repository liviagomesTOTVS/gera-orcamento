package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class PcorcavendaiId implements java.io.Serializable {
    private static final long serialVersionUID = 3578019463429996462L;
    @Column(name = "NUMORCA", nullable = false)
    private Long numorca;

    @Column(name = "CODPROD", nullable = false)
    private Integer codprod;

    @Column(name = "NUMSEQ", nullable = false)
    private Long numseq;

    public Long getNumorca() {
        return numorca;
    }

    public void setNumorca(Long numorca) {
        this.numorca = numorca;
    }

    public Integer getCodprod() {
        return codprod;
    }

    public void setCodprod(Integer codprod) {
        this.codprod = codprod;
    }

    public Long getNumseq() {
        return numseq;
    }

    public void setNumseq(Long numseq) {
        this.numseq = numseq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PcorcavendaiId entity = (PcorcavendaiId) o;
        return Objects.equals(this.numseq, entity.numseq) &&
                Objects.equals(this.codprod, entity.codprod) &&
                Objects.equals(this.numorca, entity.numorca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numseq, codprod, numorca);
    }

}