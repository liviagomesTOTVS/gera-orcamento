package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PCPLPAG")
public class Pcplpag {
    @Id
    @Column(name = "CODPLPAG", nullable = false)
    private Short id;

    @Column(name = "DESCRICAO", length = 40)
    private String descricao;

    @Column(name = "NUMDIAS")
    private Short numdias;

    @Column(name = "TIPOPRAZO", length = 1)
    private String tipoprazo;

    @Column(name = "PRAZO1")
    private Short prazo1;

    @Column(name = "PRAZO2")
    private Short prazo2;

    @Column(name = "PRAZO3")
    private Short prazo3;

    @Column(name = "DTVENC1")
    private LocalDate dtvenc1;

    @Column(name = "DTVENC2")
    private LocalDate dtvenc2;

    @Column(name = "DTVENC3")
    private LocalDate dtvenc3;

    @Column(name = "NUMPR", precision = 6, scale = 2)
    private BigDecimal numpr;

    @Column(name = "TIPOVENDA", length = 2)
    private String tipovenda;

    @Column(name = "PERTXFIM", precision = 8, scale = 4)
    private BigDecimal pertxfim;

    @Column(name = "OBS", length = 2)
    private String obs;

    @Column(name = "OFERTA", length = 1)
    private String oferta;

    @Column(name = "PRAZO4")
    private Short prazo4;

    @Column(name = "PRAZO5")
    private Short prazo5;

    @Column(name = "PRAZO6")
    private Short prazo6;

    @Column(name = "PRAZO7")
    private Short prazo7;

    @Column(name = "PRAZO8")
    private Short prazo8;

    @Column(name = "PRAZO9")
    private Short prazo9;

    @Column(name = "PRAZO10")
    private Short prazo10;

    @Column(name = "PRAZO11")
    private Short prazo11;

    @Column(name = "PRAZO12")
    private Short prazo12;

    @Column(name = "VENDABK", length = 1)
    private String vendabk;

    @Column(name = "VLMINPEDIDO", precision = 12, scale = 2)
    private BigDecimal vlminpedido;

    @Column(name = "CODCOB", length = 4)
    private String codcob;

    @Column(name = "TIPOENTRADA")
    private Boolean tipoentrada;

    @Column(name = "LETRAPLPAG", length = 2)
    private String letraplpag;

    @Column(name = "MARGEMMIN", precision = 5, scale = 2)
    private BigDecimal margemmin;

    @Column(name = "NUMITENSMINIMO")
    private Short numitensminimo;

    @Column(name = "OBSPLPAG", length = 100)
    private String obsplpag;

    @Column(name = "PERTXFIMPALM", precision = 8, scale = 4)
    private BigDecimal pertxfimpalm;

    @Column(name = "CODEQUIPE")
    private Short codequipe;

    @Column(name = "TIPORESTRICAO", length = 2)
    private String tiporestricao;

    @Column(name = "CODRESTRICAO")
    private Integer codrestricao;

    @Column(name = "CODPLPAGKRAFT", length = 3)
    private String codplpagkraft;

    @Column(name = "ENVIAPLANOFV", length = 1)
    private String enviaplanofv;

    @Column(name = "PRAZOPONDERADO", length = 1)
    private String prazoponderado;

    @Column(name = "USAPLPAGAUTOSERVICO", length = 1)
    private String usaplpagautoservico;

    @Column(name = "USADESCLINHAPROD", length = 1)
    private String usadesclinhaprod;

    @Column(name = "ENTRADA", length = 1)
    private String entrada;

    @Column(name = "FORMAPARCELAMENTO", length = 1)
    private String formaparcelamento;

    @Column(name = "NUMPARCELAS")
    private Short numparcelas;

    @Column(name = "NUMDIASCARENCIA")
    private Short numdiascarencia;

    @Column(name = "NUMDIASCARTAO")
    private Short numdiascartao;

    @Column(name = "CODFILIAL", length = 2)
    private String codfilial;

    @Column(name = "USAPRAZOADICIONALPCCLIENT", length = 1)
    private String usaprazoadicionalpcclient;

    @Column(name = "TXFATOR", precision = 18, scale = 6)
    private BigDecimal txfator;

    @Column(name = "VLTXCARNE", precision = 8, scale = 2)
    private BigDecimal vltxcarne;

    @Column(name = "DESCRICAO2", length = 45)
    private String descricao2;

    @Column(name = "USADESCFINANCEIRO", length = 1)
    private String usadescfinanceiro;

    @Column(name = "USAMULTIFILIAL", length = 1)
    private String usamultifilial;

    @Column(name = "STATUS", length = 1)
    private String status;

    @Column(name = "NUMEROPARCELASDIAFIXO")
    private Short numeroparcelasdiafixo;

    @Column(name = "DIASCARENCIA")
    private Short diascarencia;

    @Column(name = "DIAFIXO")
    private Short diafixo;

    @Column(name = "CODFUNC")
    private Integer codfunc;

    @Column(name = "NUMDIASATRASOINI")
    private Short numdiasatrasoini;

    @Column(name = "NUMDIASATRASOFIM")
    private Short numdiasatrasofim;

    @Column(name = "VLMINPARCELA", precision = 18, scale = 6)
    private BigDecimal vlminparcela;

    @Column(name = "DIASMINPARCELA")
    private Integer diasminparcela;

    @Column(name = "DIASMAXPARCELA")
    private Integer diasmaxparcela;

    @Column(name = "DESCENTLIMCREDCLI", length = 1)
    private String descentlimcredcli;

    @Column(name = "NAOCOBRARTXBOLETO", length = 1)
    private String naocobrartxboleto;

    @Column(name = "USASUPPLICARD", length = 1)
    private String usasupplicard;

    @Column(name = "CONDFINANC", length = 9)
    private String condfinanc;

    @Column(name = "CODSUPPLICARD", length = 15)
    private String codsupplicard;

    @Column(name = "DIAFIXOCLIPRIMPARC", length = 1)
    private String diafixocliprimparc;

    @Column(name = "DTULTALTER")
    private LocalDate dtultalter;

    @Column(name = "DTCADASTRO")
    private LocalDate dtcadastro;

    @Column(name = "DTALTERC5")
    private Instant dtalterc5;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Short getNumdias() {
        return numdias;
    }

    public void setNumdias(Short numdias) {
        this.numdias = numdias;
    }

    public String getTipoprazo() {
        return tipoprazo;
    }

    public void setTipoprazo(String tipoprazo) {
        this.tipoprazo = tipoprazo;
    }

    public Short getPrazo1() {
        return prazo1;
    }

    public void setPrazo1(Short prazo1) {
        this.prazo1 = prazo1;
    }

    public Short getPrazo2() {
        return prazo2;
    }

    public void setPrazo2(Short prazo2) {
        this.prazo2 = prazo2;
    }

    public Short getPrazo3() {
        return prazo3;
    }

    public void setPrazo3(Short prazo3) {
        this.prazo3 = prazo3;
    }

    public LocalDate getDtvenc1() {
        return dtvenc1;
    }

    public void setDtvenc1(LocalDate dtvenc1) {
        this.dtvenc1 = dtvenc1;
    }

    public LocalDate getDtvenc2() {
        return dtvenc2;
    }

    public void setDtvenc2(LocalDate dtvenc2) {
        this.dtvenc2 = dtvenc2;
    }

    public LocalDate getDtvenc3() {
        return dtvenc3;
    }

    public void setDtvenc3(LocalDate dtvenc3) {
        this.dtvenc3 = dtvenc3;
    }

    public BigDecimal getNumpr() {
        return numpr;
    }

    public void setNumpr(BigDecimal numpr) {
        this.numpr = numpr;
    }

    public String getTipovenda() {
        return tipovenda;
    }

    public void setTipovenda(String tipovenda) {
        this.tipovenda = tipovenda;
    }

    public BigDecimal getPertxfim() {
        return pertxfim;
    }

    public void setPertxfim(BigDecimal pertxfim) {
        this.pertxfim = pertxfim;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public Short getPrazo4() {
        return prazo4;
    }

    public void setPrazo4(Short prazo4) {
        this.prazo4 = prazo4;
    }

    public Short getPrazo5() {
        return prazo5;
    }

    public void setPrazo5(Short prazo5) {
        this.prazo5 = prazo5;
    }

    public Short getPrazo6() {
        return prazo6;
    }

    public void setPrazo6(Short prazo6) {
        this.prazo6 = prazo6;
    }

    public Short getPrazo7() {
        return prazo7;
    }

    public void setPrazo7(Short prazo7) {
        this.prazo7 = prazo7;
    }

    public Short getPrazo8() {
        return prazo8;
    }

    public void setPrazo8(Short prazo8) {
        this.prazo8 = prazo8;
    }

    public Short getPrazo9() {
        return prazo9;
    }

    public void setPrazo9(Short prazo9) {
        this.prazo9 = prazo9;
    }

    public Short getPrazo10() {
        return prazo10;
    }

    public void setPrazo10(Short prazo10) {
        this.prazo10 = prazo10;
    }

    public Short getPrazo11() {
        return prazo11;
    }

    public void setPrazo11(Short prazo11) {
        this.prazo11 = prazo11;
    }

    public Short getPrazo12() {
        return prazo12;
    }

    public void setPrazo12(Short prazo12) {
        this.prazo12 = prazo12;
    }

    public String getVendabk() {
        return vendabk;
    }

    public void setVendabk(String vendabk) {
        this.vendabk = vendabk;
    }

    public BigDecimal getVlminpedido() {
        return vlminpedido;
    }

    public void setVlminpedido(BigDecimal vlminpedido) {
        this.vlminpedido = vlminpedido;
    }

    public String getCodcob() {
        return codcob;
    }

    public void setCodcob(String codcob) {
        this.codcob = codcob;
    }

    public Boolean getTipoentrada() {
        return tipoentrada;
    }

    public void setTipoentrada(Boolean tipoentrada) {
        this.tipoentrada = tipoentrada;
    }

    public String getLetraplpag() {
        return letraplpag;
    }

    public void setLetraplpag(String letraplpag) {
        this.letraplpag = letraplpag;
    }

    public BigDecimal getMargemmin() {
        return margemmin;
    }

    public void setMargemmin(BigDecimal margemmin) {
        this.margemmin = margemmin;
    }

    public Short getNumitensminimo() {
        return numitensminimo;
    }

    public void setNumitensminimo(Short numitensminimo) {
        this.numitensminimo = numitensminimo;
    }

    public String getObsplpag() {
        return obsplpag;
    }

    public void setObsplpag(String obsplpag) {
        this.obsplpag = obsplpag;
    }

    public BigDecimal getPertxfimpalm() {
        return pertxfimpalm;
    }

    public void setPertxfimpalm(BigDecimal pertxfimpalm) {
        this.pertxfimpalm = pertxfimpalm;
    }

    public Short getCodequipe() {
        return codequipe;
    }

    public void setCodequipe(Short codequipe) {
        this.codequipe = codequipe;
    }

    public String getTiporestricao() {
        return tiporestricao;
    }

    public void setTiporestricao(String tiporestricao) {
        this.tiporestricao = tiporestricao;
    }

    public Integer getCodrestricao() {
        return codrestricao;
    }

    public void setCodrestricao(Integer codrestricao) {
        this.codrestricao = codrestricao;
    }

    public String getCodplpagkraft() {
        return codplpagkraft;
    }

    public void setCodplpagkraft(String codplpagkraft) {
        this.codplpagkraft = codplpagkraft;
    }

    public String getEnviaplanofv() {
        return enviaplanofv;
    }

    public void setEnviaplanofv(String enviaplanofv) {
        this.enviaplanofv = enviaplanofv;
    }

    public String getPrazoponderado() {
        return prazoponderado;
    }

    public void setPrazoponderado(String prazoponderado) {
        this.prazoponderado = prazoponderado;
    }

    public String getUsaplpagautoservico() {
        return usaplpagautoservico;
    }

    public void setUsaplpagautoservico(String usaplpagautoservico) {
        this.usaplpagautoservico = usaplpagautoservico;
    }

    public String getUsadesclinhaprod() {
        return usadesclinhaprod;
    }

    public void setUsadesclinhaprod(String usadesclinhaprod) {
        this.usadesclinhaprod = usadesclinhaprod;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getFormaparcelamento() {
        return formaparcelamento;
    }

    public void setFormaparcelamento(String formaparcelamento) {
        this.formaparcelamento = formaparcelamento;
    }

    public Short getNumparcelas() {
        return numparcelas;
    }

    public void setNumparcelas(Short numparcelas) {
        this.numparcelas = numparcelas;
    }

    public Short getNumdiascarencia() {
        return numdiascarencia;
    }

    public void setNumdiascarencia(Short numdiascarencia) {
        this.numdiascarencia = numdiascarencia;
    }

    public Short getNumdiascartao() {
        return numdiascartao;
    }

    public void setNumdiascartao(Short numdiascartao) {
        this.numdiascartao = numdiascartao;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public String getUsaprazoadicionalpcclient() {
        return usaprazoadicionalpcclient;
    }

    public void setUsaprazoadicionalpcclient(String usaprazoadicionalpcclient) {
        this.usaprazoadicionalpcclient = usaprazoadicionalpcclient;
    }

    public BigDecimal getTxfator() {
        return txfator;
    }

    public void setTxfator(BigDecimal txfator) {
        this.txfator = txfator;
    }

    public BigDecimal getVltxcarne() {
        return vltxcarne;
    }

    public void setVltxcarne(BigDecimal vltxcarne) {
        this.vltxcarne = vltxcarne;
    }

    public String getDescricao2() {
        return descricao2;
    }

    public void setDescricao2(String descricao2) {
        this.descricao2 = descricao2;
    }

    public String getUsadescfinanceiro() {
        return usadescfinanceiro;
    }

    public void setUsadescfinanceiro(String usadescfinanceiro) {
        this.usadescfinanceiro = usadescfinanceiro;
    }

    public String getUsamultifilial() {
        return usamultifilial;
    }

    public void setUsamultifilial(String usamultifilial) {
        this.usamultifilial = usamultifilial;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Short getNumeroparcelasdiafixo() {
        return numeroparcelasdiafixo;
    }

    public void setNumeroparcelasdiafixo(Short numeroparcelasdiafixo) {
        this.numeroparcelasdiafixo = numeroparcelasdiafixo;
    }

    public Short getDiascarencia() {
        return diascarencia;
    }

    public void setDiascarencia(Short diascarencia) {
        this.diascarencia = diascarencia;
    }

    public Short getDiafixo() {
        return diafixo;
    }

    public void setDiafixo(Short diafixo) {
        this.diafixo = diafixo;
    }

    public Integer getCodfunc() {
        return codfunc;
    }

    public void setCodfunc(Integer codfunc) {
        this.codfunc = codfunc;
    }

    public Short getNumdiasatrasoini() {
        return numdiasatrasoini;
    }

    public void setNumdiasatrasoini(Short numdiasatrasoini) {
        this.numdiasatrasoini = numdiasatrasoini;
    }

    public Short getNumdiasatrasofim() {
        return numdiasatrasofim;
    }

    public void setNumdiasatrasofim(Short numdiasatrasofim) {
        this.numdiasatrasofim = numdiasatrasofim;
    }

    public BigDecimal getVlminparcela() {
        return vlminparcela;
    }

    public void setVlminparcela(BigDecimal vlminparcela) {
        this.vlminparcela = vlminparcela;
    }

    public Integer getDiasminparcela() {
        return diasminparcela;
    }

    public void setDiasminparcela(Integer diasminparcela) {
        this.diasminparcela = diasminparcela;
    }

    public Integer getDiasmaxparcela() {
        return diasmaxparcela;
    }

    public void setDiasmaxparcela(Integer diasmaxparcela) {
        this.diasmaxparcela = diasmaxparcela;
    }

    public String getDescentlimcredcli() {
        return descentlimcredcli;
    }

    public void setDescentlimcredcli(String descentlimcredcli) {
        this.descentlimcredcli = descentlimcredcli;
    }

    public String getNaocobrartxboleto() {
        return naocobrartxboleto;
    }

    public void setNaocobrartxboleto(String naocobrartxboleto) {
        this.naocobrartxboleto = naocobrartxboleto;
    }

    public String getUsasupplicard() {
        return usasupplicard;
    }

    public void setUsasupplicard(String usasupplicard) {
        this.usasupplicard = usasupplicard;
    }

    public String getCondfinanc() {
        return condfinanc;
    }

    public void setCondfinanc(String condfinanc) {
        this.condfinanc = condfinanc;
    }

    public String getCodsupplicard() {
        return codsupplicard;
    }

    public void setCodsupplicard(String codsupplicard) {
        this.codsupplicard = codsupplicard;
    }

    public String getDiafixocliprimparc() {
        return diafixocliprimparc;
    }

    public void setDiafixocliprimparc(String diafixocliprimparc) {
        this.diafixocliprimparc = diafixocliprimparc;
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