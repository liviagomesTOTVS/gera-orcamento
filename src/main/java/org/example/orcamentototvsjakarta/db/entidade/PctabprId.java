package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class PctabprId implements java.io.Serializable {
    private static final long serialVersionUID = -5886274120806113845L;
    @Column(name = "NUMREGIAO", nullable = false)
    private Short numregiao;

    @Column(name = "CODPROD", nullable = false)
    private Integer codprod;

    public Short getNumregiao() {
        return numregiao;
    }

    public void setNumregiao(Short numregiao) {
        this.numregiao = numregiao;
    }

    public Integer getCodprod() {
        return codprod;
    }

    public void setCodprod(Integer codprod) {
        this.codprod = codprod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PctabprId entity = (PctabprId) o;
        return Objects.equals(this.codprod, entity.codprod) &&
                Objects.equals(this.numregiao, entity.numregiao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codprod, numregiao);
    }

}