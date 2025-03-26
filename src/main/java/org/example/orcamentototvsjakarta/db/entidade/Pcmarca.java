package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PCMARCA")
public class Pcmarca {
    @Id
    @Column(name = "CODMARCA", nullable = false)
    private Integer id;

    @Column(name = "MARCA", length = 40)
    private String marca;

    @Column(name = "ATIVO", length = 1)
    private String ativo;

    @Column(name = "CODCOMPRADOR")
    private Integer codcomprador;

    @Column(name = "CODADWORDS", length = 200)
    private String codadwords;

    @Column(name = "DESCRICAOECOMMERCE", length = 400)
    private String descricaoecommerce;

    @Column(name = "CODCAMPLOMADEE", length = 200)
    private String codcamplomadee;

    @Column(name = "TITULO", length = 200)
    private String titulo;

    @Column(name = "DTULTALTER")
    private LocalDate dtultalter;

    @Column(name = "DTCADASTRO")
    private LocalDate dtcadastro;

    @Column(name = "DTALTERC5")
    private Instant dtalterc5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public Integer getCodcomprador() {
        return codcomprador;
    }

    public void setCodcomprador(Integer codcomprador) {
        this.codcomprador = codcomprador;
    }

    public String getCodadwords() {
        return codadwords;
    }

    public void setCodadwords(String codadwords) {
        this.codadwords = codadwords;
    }

    public String getDescricaoecommerce() {
        return descricaoecommerce;
    }

    public void setDescricaoecommerce(String descricaoecommerce) {
        this.descricaoecommerce = descricaoecommerce;
    }

    public String getCodcamplomadee() {
        return codcamplomadee;
    }

    public void setCodcamplomadee(String codcamplomadee) {
        this.codcamplomadee = codcamplomadee;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDtultalter() {
        return dtultalter;
    }

    public void setDtultalter(LocalDate dtultalter) {
        this.dtultalter = dtultalter;
    }

    public LocalDate getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(LocalDate dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public Instant getDtalterc5() {
        return dtalterc5;
    }

    public void setDtalterc5(Instant dtalterc5) {
        this.dtalterc5 = dtalterc5;
    }

}