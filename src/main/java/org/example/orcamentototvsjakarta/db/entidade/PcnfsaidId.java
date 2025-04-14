package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class PcnfsaidId implements java.io.Serializable {
    private static final long serialVersionUID = 319346532105508836L;
    @Column(name = "NUMTRANSVENDA", nullable = false)
    private Long numtransvenda;

    @Column(name = "NUMNOTA")
    private Long numnota;

    public Long getNumtransvenda() {
        return numtransvenda;
    }

    public void setNumtransvenda(Long numtransvenda) {
        this.numtransvenda = numtransvenda;
    }

    public Long getNumnota() {
        return numnota;
    }

    public void setNumnota(Long numnota) {
        this.numnota = numnota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PcnfsaidId entity = (PcnfsaidId) o;
        return Objects.equals(this.numtransvenda, entity.numtransvenda) &&
                Objects.equals(this.numnota, entity.numnota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numtransvenda, numnota);
    }

}