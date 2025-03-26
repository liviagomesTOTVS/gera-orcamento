package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PCDEPTO")
public class Pcdepto {
    @Id
    @Column(name = "CODEPTO", nullable = false)
    private Integer id;

    @Column(name = "DESCRICAO", nullable = false, length = 25)
    private String descricao;

    @Column(name = "PERCPARTVENDAPREV", precision = 8, scale = 4)
    private BigDecimal percpartvendaprev;

    @Column(name = "PERCMARGEMPREV", precision = 8, scale = 4)
    private BigDecimal percmargemprev;

    @Column(name = "TIPOMERC", length = 2)
    private String tipomerc;

    @Column(name = "EMITEQTUNIT", length = 1)
    private String emiteqtunit;

    @Column(name = "ATUALIZAINVGERAL", length = 1)
    private String atualizainvgeral;

    @Column(name = "MARGEMPREVISTA", precision = 6, scale = 2)
    private BigDecimal margemprevista;

    @Column(name = "REFERENCIA", length = 20)
    private String referencia;

    @Column(name = "PERDESCMAXIDEAL", precision = 10, scale = 2)
    private BigDecimal perdescmaxideal;

    @Column(name = "PERDESCMAXPOSSIVEL", precision = 10, scale = 2)
    private BigDecimal perdescmaxpossivel;

    @Column(name = "PERDESCMAXAVISTA", precision = 10, scale = 2)
    private BigDecimal perdescmaxavista;

    @Column(name = "PERCCOMGARANTIDA", precision = 10, scale = 2)
    private BigDecimal perccomgarantida;

    @Column(name = "IDINTEGRACAOCIASHOP", length = 250)
    private String idintegracaociashop;

    @Column(name = "ENVIAECOMMERCE", length = 1)
    private String enviaecommerce;

    @Column(name = "DTULTALTER")
    private LocalDate dtultalter;

    @Column(name = "CODCAMPLOMADEE", length = 200)
    private String codcamplomadee;

    @Column(name = "CODADWORDS", length = 200)
    private String codadwords;

    @Column(name = "ATIVO", length = 1)
    private String ativo;

    @Column(name = "DESCRICAOECOMMERCE", length = 200)
    private String descricaoecommerce;

    @Column(name = "TITULO", length = 200)
    private String titulo;

    @Column(name = "CODDEPTOPRINC")
    private Integer coddeptoprinc;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPercpartvendaprev() {
        return percpartvendaprev;
    }

    public void setPercpartvendaprev(BigDecimal percpartvendaprev) {
        this.percpartvendaprev = percpartvendaprev;
    }

    public BigDecimal getPercmargemprev() {
        return percmargemprev;
    }

    public void setPercmargemprev(BigDecimal percmargemprev) {
        this.percmargemprev = percmargemprev;
    }

    public String getTipomerc() {
        return tipomerc;
    }

    public void setTipomerc(String tipomerc) {
        this.tipomerc = tipomerc;
    }

    public String getEmiteqtunit() {
        return emiteqtunit;
    }

    public void setEmiteqtunit(String emiteqtunit) {
        this.emiteqtunit = emiteqtunit;
    }

    public String getAtualizainvgeral() {
        return atualizainvgeral;
    }

    public void setAtualizainvgeral(String atualizainvgeral) {
        this.atualizainvgeral = atualizainvgeral;
    }

    public BigDecimal getMargemprevista() {
        return margemprevista;
    }

    public void setMargemprevista(BigDecimal margemprevista) {
        this.margemprevista = margemprevista;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public BigDecimal getPerdescmaxideal() {
        return perdescmaxideal;
    }

    public void setPerdescmaxideal(BigDecimal perdescmaxideal) {
        this.perdescmaxideal = perdescmaxideal;
    }

    public BigDecimal getPerdescmaxpossivel() {
        return perdescmaxpossivel;
    }

    public void setPerdescmaxpossivel(BigDecimal perdescmaxpossivel) {
        this.perdescmaxpossivel = perdescmaxpossivel;
    }

    public BigDecimal getPerdescmaxavista() {
        return perdescmaxavista;
    }

    public void setPerdescmaxavista(BigDecimal perdescmaxavista) {
        this.perdescmaxavista = perdescmaxavista;
    }

    public BigDecimal getPerccomgarantida() {
        return perccomgarantida;
    }

    public void setPerccomgarantida(BigDecimal perccomgarantida) {
        this.perccomgarantida = perccomgarantida;
    }

    public String getIdintegracaociashop() {
        return idintegracaociashop;
    }

    public void setIdintegracaociashop(String idintegracaociashop) {
        this.idintegracaociashop = idintegracaociashop;
    }

    public String getEnviaecommerce() {
        return enviaecommerce;
    }

    public void setEnviaecommerce(String enviaecommerce) {
        this.enviaecommerce = enviaecommerce;
    }

    public LocalDate getDtultalter() {
        return dtultalter;
    }

    public void setDtultalter(LocalDate dtultalter) {
        this.dtultalter = dtultalter;
    }

    public String getCodcamplomadee() {
        return codcamplomadee;
    }

    public void setCodcamplomadee(String codcamplomadee) {
        this.codcamplomadee = codcamplomadee;
    }

    public String getCodadwords() {
        return codadwords;
    }

    public void setCodadwords(String codadwords) {
        this.codadwords = codadwords;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getDescricaoecommerce() {
        return descricaoecommerce;
    }

    public void setDescricaoecommerce(String descricaoecommerce) {
        this.descricaoecommerce = descricaoecommerce;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCoddeptoprinc() {
        return coddeptoprinc;
    }

    public void setCoddeptoprinc(Integer coddeptoprinc) {
        this.coddeptoprinc = coddeptoprinc;
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