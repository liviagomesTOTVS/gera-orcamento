package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PCSUPERV")
public class Pcsuperv {
    @Id
    @Column(name = "CODSUPERVISOR", nullable = false)
    private Short id;

    @Column(name = "NOME", nullable = false, length = 40)
    private String nome;

    @Column(name = "REGIONAL", nullable = false)
    private Short regional;

    @Column(name = "COD_CADRCA")
    private Short codCadrca;

    @Column(name = "POSICAO", length = 1)
    private String posicao;

    @Column(name = "PERCPARTVENDAPREV", precision = 8, scale = 4)
    private BigDecimal percpartvendaprev;

    @Column(name = "PERCMARGEMPREV", precision = 8, scale = 4)
    private BigDecimal percmargemprev;

    @Column(name = "CODGERENTE")
    private Short codgerente;

    @Column(name = "TIPOSUPERVISOR", length = 1)
    private String tiposupervisor;

    @Column(name = "PERCOMISSAO", precision = 4, scale = 2)
    private BigDecimal percomissao;

    @Column(name = "DTADMISSAO")
    private LocalDate dtadmissao;

    @Column(name = "DTDEMISSAO")
    private LocalDate dtdemissao;

    @Column(name = "CPF", length = 20)
    private String cpf;

    @Column(name = "CODCOORDENADOR")
    private Long codcoordenador;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "VLCORRENTE", precision = 22, scale = 6)
    private BigDecimal vlcorrente;

    @Column(name = "VLLIMCRED", precision = 22, scale = 6)
    private BigDecimal vllimcred;

    @Column(name = "USADEBCRED", length = 1)
    private String usadebcred;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Short getRegional() {
        return regional;
    }

    public void setRegional(Short regional) {
        this.regional = regional;
    }

    public Short getCodCadrca() {
        return codCadrca;
    }

    public void setCodCadrca(Short codCadrca) {
        this.codCadrca = codCadrca;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
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

    public Short getCodgerente() {
        return codgerente;
    }

    public void setCodgerente(Short codgerente) {
        this.codgerente = codgerente;
    }

    public String getTiposupervisor() {
        return tiposupervisor;
    }

    public void setTiposupervisor(String tiposupervisor) {
        this.tiposupervisor = tiposupervisor;
    }

    public BigDecimal getPercomissao() {
        return percomissao;
    }

    public void setPercomissao(BigDecimal percomissao) {
        this.percomissao = percomissao;
    }

    public LocalDate getDtadmissao() {
        return dtadmissao;
    }

    public void setDtadmissao(LocalDate dtadmissao) {
        this.dtadmissao = dtadmissao;
    }

    public LocalDate getDtdemissao() {
        return dtdemissao;
    }

    public void setDtdemissao(LocalDate dtdemissao) {
        this.dtdemissao = dtdemissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getCodcoordenador() {
        return codcoordenador;
    }

    public void setCodcoordenador(Long codcoordenador) {
        this.codcoordenador = codcoordenador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getVlcorrente() {
        return vlcorrente;
    }

    public void setVlcorrente(BigDecimal vlcorrente) {
        this.vlcorrente = vlcorrente;
    }

    public BigDecimal getVllimcred() {
        return vllimcred;
    }

    public void setVllimcred(BigDecimal vllimcred) {
        this.vllimcred = vllimcred;
    }

    public String getUsadebcred() {
        return usadebcred;
    }

    public void setUsadebcred(String usadebcred) {
        this.usadebcred = usadebcred;
    }

}