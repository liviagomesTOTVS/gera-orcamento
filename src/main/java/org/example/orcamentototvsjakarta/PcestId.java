package org.example.orcamentototvsjakarta;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class PcestId implements java.io.Serializable {
    private static final long serialVersionUID = 9006002457176145759L;
    @Column(name = "CODFILIAL", nullable = false, length = 2)
    private String codfilial;

    @Column(name = "CODPROD", nullable = false)
    private Integer codprod;

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
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
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PcestId entity = (PcestId) o;
        return Objects.equals(this.codfilial, entity.codfilial) &&
                Objects.equals(this.codprod, entity.codprod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codfilial, codprod);
    }

}