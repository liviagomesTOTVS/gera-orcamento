package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class PclibId implements java.io.Serializable {
    private static final long serialVersionUID = 6258831740127301869L;
    @Column(name = "CODFUNC", nullable = false)
    private Integer codfunc;

    @Column(name = "CODTABELA", nullable = false)
    private Short codtabela;

    @Column(name = "CODIGOA", nullable = false, length = 40)
    private String codigoa;

    @Column(name = "CODIGON", nullable = false)
    private Long codigon;

    public Integer getCodfunc() {
        return codfunc;
    }

    public void setCodfunc(Integer codfunc) {
        this.codfunc = codfunc;
    }

    public Short getCodtabela() {
        return codtabela;
    }

    public void setCodtabela(Short codtabela) {
        this.codtabela = codtabela;
    }

    public String getCodigoa() {
        return codigoa;
    }

    public void setCodigoa(String codigoa) {
        this.codigoa = codigoa;
    }

    public Long getCodigon() {
        return codigon;
    }

    public void setCodigon(Long codigon) {
        this.codigon = codigon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PclibId entity = (PclibId) o;
        return Objects.equals(this.codigon, entity.codigon) &&
                Objects.equals(this.codtabela, entity.codtabela) &&
                Objects.equals(this.codfunc, entity.codfunc) &&
                Objects.equals(this.codigoa, entity.codigoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigon, codtabela, codfunc, codigoa);
    }

}