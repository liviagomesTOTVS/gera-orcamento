package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class PcorcavendaisngpcId implements java.io.Serializable {
    private static final long serialVersionUID = -1213337754569658815L;
    @Column(name = "NUMORCA", nullable = false)
    private Long numorca;

    @Column(name = "CODPROD", nullable = false)
    private Integer codprod;

    @Column(name = "NUMSEQ", nullable = false)
    private Long numseq;

    @Column(name = "NUMNOTIFMED", nullable = false, length = 10)
    private String numnotifmed;

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

    public String getNumnotifmed() {
        return numnotifmed;
    }

    public void setNumnotifmed(String numnotifmed) {
        this.numnotifmed = numnotifmed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PcorcavendaisngpcId entity = (PcorcavendaisngpcId) o;
        return Objects.equals(this.numseq, entity.numseq) &&
                Objects.equals(this.numnotifmed, entity.numnotifmed) &&
                Objects.equals(this.codprod, entity.codprod) &&
                Objects.equals(this.numorca, entity.numorca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numseq, numnotifmed, codprod, numorca);
    }

}