package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class PcclientId implements java.io.Serializable {
    private static final long serialVersionUID = -900640730703578164L;
    @Column(name = "CODCLI", nullable = false)
    private Integer codcli;

    @Column(name = "DTCADASTRO")
    private LocalDate dtcadastro;

    @Column(name = "DTEXCLUSAO")
    private LocalDate dtexclusao;

    @Column(name = "CODUSUR1")
    private Short codusur1;

    @Column(name = "CODUSUR2")
    private Short codusur2;

    public Integer getCodcli() {
        return codcli;
    }

    public void setCodcli(Integer codcli) {
        this.codcli = codcli;
    }

    public LocalDate getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(LocalDate dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public LocalDate getDtexclusao() {
        return dtexclusao;
    }

    public void setDtexclusao(LocalDate dtexclusao) {
        this.dtexclusao = dtexclusao;
    }

    public Short getCodusur1() {
        return codusur1;
    }

    public void setCodusur1(Short codusur1) {
        this.codusur1 = codusur1;
    }

    public Short getCodusur2() {
        return codusur2;
    }

    public void setCodusur2(Short codusur2) {
        this.codusur2 = codusur2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PcclientId entity = (PcclientId) o;
        return Objects.equals(this.codcli, entity.codcli) &&
                Objects.equals(this.dtexclusao, entity.dtexclusao) &&
                Objects.equals(this.codusur2, entity.codusur2) &&
                Objects.equals(this.dtcadastro, entity.dtcadastro) &&
                Objects.equals(this.codusur1, entity.codusur1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codcli, dtexclusao, codusur2, dtcadastro, codusur1);
    }

}