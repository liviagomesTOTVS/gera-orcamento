package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class PcfilialId implements java.io.Serializable {
    private static final long serialVersionUID = -1220039356178860777L;
    @Column(name = "CODIGO", nullable = false, length = 2)
    private String codigo;

    @Column(name = "CONSOLIDADADOS504", length = 1)
    private String consolidadados504;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getConsolidadados504() {
        return consolidadados504;
    }

    public void setConsolidadados504(String consolidadados504) {
        this.consolidadados504 = consolidadados504;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PcfilialId entity = (PcfilialId) o;
        return Objects.equals(this.codigo, entity.codigo) &&
                Objects.equals(this.consolidadados504, entity.consolidadados504);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, consolidadados504);
    }

}