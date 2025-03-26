package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PCPRACA")
public class Pcpraca {
    @Id
    @Column(name = "CODPRACA", nullable = false)
    private Short id;

    @Column(name = "PRACA", nullable = false, length = 25)
    private String praca;

    @Column(name = "NUMREGIAO", nullable = false)
    private Short numregiao;

    @Column(name = "ROTA", nullable = false)
    private Short rota;

    @Column(name = "SEQROTA", nullable = false)
    private Short seqrota;

    @Column(name = "POPULACAO")
    private Long populacao;

    @Column(name = "PERFRETEPROGRESS", precision = 8, scale = 4)
    private BigDecimal perfreteprogress;

    @Column(name = "CODPRACAORIG")
    private Integer codpracaorig;

    @Column(name = "DISTANCIA", precision = 12, scale = 2)
    private BigDecimal distancia;

    @Column(name = "VLPAUTAFRETE", precision = 12, scale = 2)
    private BigDecimal vlpautafrete;

    @Column(name = "CODPRACAORIG2")
    private Integer codpracaorig2;

    @Column(name = "CODPRACAORIG3")
    private Integer codpracaorig3;

    @Column(name = "CODPRACAORIG4")
    private Integer codpracaorig4;

    @Column(name = "CODMUNIC")
    private Integer codmunic;

    @Column(name = "SITUACAO", length = 1)
    private String situacao;

    @Column(name = "NUMREGIAO2")
    private Short numregiao2;

    @Column(name = "DTCADASTRO")
    private LocalDate dtcadastro;

    @Column(name = "CEPINICIAL", length = 9)
    private String cepinicial;

    @Column(name = "CEPFINAL", length = 9)
    private String cepfinal;

    @Column(name = "PRIORIDADEENTREGA", length = 1)
    private String prioridadeentrega;

    @Column(name = "TIPOPRACA", length = 1)
    private String tipopraca;

    @Column(name = "OBS", length = 300)
    private String obs;

    @Column(name = "CODPRACAPRINCIPAL")
    private Short codpracaprincipal;

    @Column(name = "VLMINCARREG", precision = 12, scale = 2)
    private BigDecimal vlmincarreg;

    @Column(name = "PERCMINCARREG", precision = 10, scale = 2)
    private BigDecimal percmincarreg;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getPraca() {
        return praca;
    }

    public void setPraca(String praca) {
        this.praca = praca;
    }

    public Short getNumregiao() {
        return numregiao;
    }

    public void setNumregiao(Short numregiao) {
        this.numregiao = numregiao;
    }

    public Short getRota() {
        return rota;
    }

    public void setRota(Short rota) {
        this.rota = rota;
    }

    public Short getSeqrota() {
        return seqrota;
    }

    public void setSeqrota(Short seqrota) {
        this.seqrota = seqrota;
    }

    public Long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }

    public BigDecimal getPerfreteprogress() {
        return perfreteprogress;
    }

    public void setPerfreteprogress(BigDecimal perfreteprogress) {
        this.perfreteprogress = perfreteprogress;
    }

    public Integer getCodpracaorig() {
        return codpracaorig;
    }

    public void setCodpracaorig(Integer codpracaorig) {
        this.codpracaorig = codpracaorig;
    }

    public BigDecimal getDistancia() {
        return distancia;
    }

    public void setDistancia(BigDecimal distancia) {
        this.distancia = distancia;
    }

    public BigDecimal getVlpautafrete() {
        return vlpautafrete;
    }

    public void setVlpautafrete(BigDecimal vlpautafrete) {
        this.vlpautafrete = vlpautafrete;
    }

    public Integer getCodpracaorig2() {
        return codpracaorig2;
    }

    public void setCodpracaorig2(Integer codpracaorig2) {
        this.codpracaorig2 = codpracaorig2;
    }

    public Integer getCodpracaorig3() {
        return codpracaorig3;
    }

    public void setCodpracaorig3(Integer codpracaorig3) {
        this.codpracaorig3 = codpracaorig3;
    }

    public Integer getCodpracaorig4() {
        return codpracaorig4;
    }

    public void setCodpracaorig4(Integer codpracaorig4) {
        this.codpracaorig4 = codpracaorig4;
    }

    public Integer getCodmunic() {
        return codmunic;
    }

    public void setCodmunic(Integer codmunic) {
        this.codmunic = codmunic;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Short getNumregiao2() {
        return numregiao2;
    }

    public void setNumregiao2(Short numregiao2) {
        this.numregiao2 = numregiao2;
    }

    public LocalDate getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(LocalDate dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public String getCepinicial() {
        return cepinicial;
    }

    public void setCepinicial(String cepinicial) {
        this.cepinicial = cepinicial;
    }

    public String getCepfinal() {
        return cepfinal;
    }

    public void setCepfinal(String cepfinal) {
        this.cepfinal = cepfinal;
    }

    public String getPrioridadeentrega() {
        return prioridadeentrega;
    }

    public void setPrioridadeentrega(String prioridadeentrega) {
        this.prioridadeentrega = prioridadeentrega;
    }

    public String getTipopraca() {
        return tipopraca;
    }

    public void setTipopraca(String tipopraca) {
        this.tipopraca = tipopraca;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Short getCodpracaprincipal() {
        return codpracaprincipal;
    }

    public void setCodpracaprincipal(Short codpracaprincipal) {
        this.codpracaprincipal = codpracaprincipal;
    }

    public BigDecimal getVlmincarreg() {
        return vlmincarreg;
    }

    public void setVlmincarreg(BigDecimal vlmincarreg) {
        this.vlmincarreg = vlmincarreg;
    }

    public BigDecimal getPercmincarreg() {
        return percmincarreg;
    }

    public void setPercmincarreg(BigDecimal percmincarreg) {
        this.percmincarreg = percmincarreg;
    }

}