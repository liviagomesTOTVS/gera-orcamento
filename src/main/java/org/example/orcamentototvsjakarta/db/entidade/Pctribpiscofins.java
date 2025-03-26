package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PCTRIBPISCOFINS")
public class Pctribpiscofins {
    @Id
    @Column(name = "CODTRIBPISCOFINS", nullable = false)
    private Short id;

    @Column(name = "DESCRICAOTRIBPISCOFINS", length = 40)
    private String descricaotribpiscofins;

    @Column(name = "CONSIDERAVLFIXOLIT", length = 1)
    private String consideravlfixolit;

    @Column(name = "UTILIZAPERCPISCOFINSDIFCONS", length = 1)
    private String utilizapercpiscofinsdifcons;

    @Column(name = "CONSIDERAPRECOMERC", length = 1)
    private String consideraprecomerc;

    @Column(name = "CONSIDERAPAUTA", length = 1)
    private String considerapauta;

    @Column(name = "VLPAUTAPIS", precision = 18, scale = 6)
    private BigDecimal vlpautapis;

    @Column(name = "VLPAUTACOFINS", precision = 18, scale = 6)
    private BigDecimal vlpautacofins;

    @Column(name = "CONSIDERAIPI", length = 1)
    private String consideraipi;

    @Column(name = "CONSIDERAST", length = 1)
    private String considerast;

    @Column(name = "CONSIDERAOUTRASDESP", length = 1)
    private String consideraoutrasdesp;

    @Column(name = "CONSIDERAFRETE", length = 1)
    private String considerafrete;

    @Column(name = "CONSIDERASUFRAMA", length = 1)
    private String considerasuframa;

    @Column(name = "RETERPISCOFINS", length = 1)
    private String reterpiscofins;

    @Column(name = "PERCPIS", precision = 8, scale = 4)
    private BigDecimal percpis;

    @Column(name = "PERCCOFINS", precision = 8, scale = 4)
    private BigDecimal perccofins;

    @Column(name = "SITTRIBUT")
    private Integer sittribut;

    @Column(name = "PERCPISCALCDI", precision = 8, scale = 4)
    private BigDecimal percpiscalcdi;

    @Column(name = "PERCCOFINSCALCDI", precision = 6, scale = 2)
    private BigDecimal perccofinscalcdi;

    @Column(name = "BASEPISCOFINSLIT", precision = 18, scale = 6)
    private BigDecimal basepiscofinslit;

    @Column(name = "VLPISLIT", precision = 18, scale = 6)
    private BigDecimal vlpislit;

    @Column(name = "VLCOFINSLIT", precision = 18, scale = 6)
    private BigDecimal vlcofinslit;

    @Column(name = "MENSAGEMGERAL", length = 200)
    private String mensagemgeral;

    @Column(name = "PERCPISCONSUMO", precision = 8, scale = 4)
    private BigDecimal percpisconsumo;

    @Column(name = "PERCCOFINSCONSUMO", precision = 8, scale = 4)
    private BigDecimal perccofinsconsumo;

    @Column(name = "SITTRIBUTCONSUMO")
    private Integer sittributconsumo;

    @Column(name = "MENSAGEMCONSUMO", length = 200)
    private String mensagemconsumo;

    @Column(name = "CONSIDERADIFALIQUOTA", length = 1)
    private String consideradifaliquota;

    @Column(name = "SITTRIBUTDEV")
    private Short sittributdev;

    @Column(name = "SITTRIBUTCONSUMODEV")
    private Short sittributconsumodev;

    @Column(name = "CONSIDERADIFALIQ", length = 1)
    private String consideradifaliq;

    @Column(name = "GERABASEPISCOFINSSEMALIQ", length = 1)
    private String gerabasepiscofinssemaliq;

    @Column(name = "ALIQREDUCAOPIS", precision = 12, scale = 4)
    private BigDecimal aliqreducaopis;

    @Column(name = "ALIQREDUCAOCOFINS", precision = 12, scale = 4)
    private BigDecimal aliqreducaocofins;

    @Column(name = "CONSIDERAPAUTAMINIMA", length = 1)
    private String considerapautaminima;

    @Column(name = "SITTRIBUTPAUTAMIN")
    private Short sittributpautamin;

    @Column(name = "SITTRIBUTDEVPAUTAMIN")
    private Short sittributdevpautamin;

    @Column(name = "IDENTIFICARTRIB", length = 130)
    private String identificartrib;

    @Column(name = "ZERARBCCSTST", length = 1)
    private String zerarbccstst;

    @Column(name = "PERCREDBASCALPC", precision = 12, scale = 4)
    private BigDecimal percredbascalpc;

    @Column(name = "CODEXCTRIBPISCOFINS")
    private Short codexctribpiscofins;

    @Column(name = "EXCLUIRICMSBASEPISCOFINS", length = 1)
    private String excluiricmsbasepiscofins;

    @Column(name = "EXCLUIRDIFALBASEPISCOFINS", length = 1)
    private String excluirdifalbasepiscofins;

    @Column(name = "DTULTALTER")
    private LocalDate dtultalter;

    @Column(name = "DTCADASTRO")
    private LocalDate dtcadastro;

    @Column(name = "DTALTERC5")
    private Instant dtalterc5;

    @Column(name = "EXCLUIRICMSSTBCRBASEPISCOFINS", length = 1)
    private String excluiricmsstbcrbasepiscofins;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getDescricaotribpiscofins() {
        return descricaotribpiscofins;
    }

    public void setDescricaotribpiscofins(String descricaotribpiscofins) {
        this.descricaotribpiscofins = descricaotribpiscofins;
    }

    public String getConsideravlfixolit() {
        return consideravlfixolit;
    }

    public void setConsideravlfixolit(String consideravlfixolit) {
        this.consideravlfixolit = consideravlfixolit;
    }

    public String getUtilizapercpiscofinsdifcons() {
        return utilizapercpiscofinsdifcons;
    }

    public void setUtilizapercpiscofinsdifcons(String utilizapercpiscofinsdifcons) {
        this.utilizapercpiscofinsdifcons = utilizapercpiscofinsdifcons;
    }

    public String getConsideraprecomerc() {
        return consideraprecomerc;
    }

    public void setConsideraprecomerc(String consideraprecomerc) {
        this.consideraprecomerc = consideraprecomerc;
    }

    public String getConsiderapauta() {
        return considerapauta;
    }

    public void setConsiderapauta(String considerapauta) {
        this.considerapauta = considerapauta;
    }

    public BigDecimal getVlpautapis() {
        return vlpautapis;
    }

    public void setVlpautapis(BigDecimal vlpautapis) {
        this.vlpautapis = vlpautapis;
    }

    public BigDecimal getVlpautacofins() {
        return vlpautacofins;
    }

    public void setVlpautacofins(BigDecimal vlpautacofins) {
        this.vlpautacofins = vlpautacofins;
    }

    public String getConsideraipi() {
        return consideraipi;
    }

    public void setConsideraipi(String consideraipi) {
        this.consideraipi = consideraipi;
    }

    public String getConsiderast() {
        return considerast;
    }

    public void setConsiderast(String considerast) {
        this.considerast = considerast;
    }

    public String getConsideraoutrasdesp() {
        return consideraoutrasdesp;
    }

    public void setConsideraoutrasdesp(String consideraoutrasdesp) {
        this.consideraoutrasdesp = consideraoutrasdesp;
    }

    public String getConsiderafrete() {
        return considerafrete;
    }

    public void setConsiderafrete(String considerafrete) {
        this.considerafrete = considerafrete;
    }

    public String getConsiderasuframa() {
        return considerasuframa;
    }

    public void setConsiderasuframa(String considerasuframa) {
        this.considerasuframa = considerasuframa;
    }

    public String getReterpiscofins() {
        return reterpiscofins;
    }

    public void setReterpiscofins(String reterpiscofins) {
        this.reterpiscofins = reterpiscofins;
    }

    public BigDecimal getPercpis() {
        return percpis;
    }

    public void setPercpis(BigDecimal percpis) {
        this.percpis = percpis;
    }

    public BigDecimal getPerccofins() {
        return perccofins;
    }

    public void setPerccofins(BigDecimal perccofins) {
        this.perccofins = perccofins;
    }

    public Integer getSittribut() {
        return sittribut;
    }

    public void setSittribut(Integer sittribut) {
        this.sittribut = sittribut;
    }

    public BigDecimal getPercpiscalcdi() {
        return percpiscalcdi;
    }

    public void setPercpiscalcdi(BigDecimal percpiscalcdi) {
        this.percpiscalcdi = percpiscalcdi;
    }

    public BigDecimal getPerccofinscalcdi() {
        return perccofinscalcdi;
    }

    public void setPerccofinscalcdi(BigDecimal perccofinscalcdi) {
        this.perccofinscalcdi = perccofinscalcdi;
    }

    public BigDecimal getBasepiscofinslit() {
        return basepiscofinslit;
    }

    public void setBasepiscofinslit(BigDecimal basepiscofinslit) {
        this.basepiscofinslit = basepiscofinslit;
    }

    public BigDecimal getVlpislit() {
        return vlpislit;
    }

    public void setVlpislit(BigDecimal vlpislit) {
        this.vlpislit = vlpislit;
    }

    public BigDecimal getVlcofinslit() {
        return vlcofinslit;
    }

    public void setVlcofinslit(BigDecimal vlcofinslit) {
        this.vlcofinslit = vlcofinslit;
    }

    public String getMensagemgeral() {
        return mensagemgeral;
    }

    public void setMensagemgeral(String mensagemgeral) {
        this.mensagemgeral = mensagemgeral;
    }

    public BigDecimal getPercpisconsumo() {
        return percpisconsumo;
    }

    public void setPercpisconsumo(BigDecimal percpisconsumo) {
        this.percpisconsumo = percpisconsumo;
    }

    public BigDecimal getPerccofinsconsumo() {
        return perccofinsconsumo;
    }

    public void setPerccofinsconsumo(BigDecimal perccofinsconsumo) {
        this.perccofinsconsumo = perccofinsconsumo;
    }

    public Integer getSittributconsumo() {
        return sittributconsumo;
    }

    public void setSittributconsumo(Integer sittributconsumo) {
        this.sittributconsumo = sittributconsumo;
    }

    public String getMensagemconsumo() {
        return mensagemconsumo;
    }

    public void setMensagemconsumo(String mensagemconsumo) {
        this.mensagemconsumo = mensagemconsumo;
    }

    public String getConsideradifaliquota() {
        return consideradifaliquota;
    }

    public void setConsideradifaliquota(String consideradifaliquota) {
        this.consideradifaliquota = consideradifaliquota;
    }

    public Short getSittributdev() {
        return sittributdev;
    }

    public void setSittributdev(Short sittributdev) {
        this.sittributdev = sittributdev;
    }

    public Short getSittributconsumodev() {
        return sittributconsumodev;
    }

    public void setSittributconsumodev(Short sittributconsumodev) {
        this.sittributconsumodev = sittributconsumodev;
    }

    public String getConsideradifaliq() {
        return consideradifaliq;
    }

    public void setConsideradifaliq(String consideradifaliq) {
        this.consideradifaliq = consideradifaliq;
    }

    public String getGerabasepiscofinssemaliq() {
        return gerabasepiscofinssemaliq;
    }

    public void setGerabasepiscofinssemaliq(String gerabasepiscofinssemaliq) {
        this.gerabasepiscofinssemaliq = gerabasepiscofinssemaliq;
    }

    public BigDecimal getAliqreducaopis() {
        return aliqreducaopis;
    }

    public void setAliqreducaopis(BigDecimal aliqreducaopis) {
        this.aliqreducaopis = aliqreducaopis;
    }

    public BigDecimal getAliqreducaocofins() {
        return aliqreducaocofins;
    }

    public void setAliqreducaocofins(BigDecimal aliqreducaocofins) {
        this.aliqreducaocofins = aliqreducaocofins;
    }

    public String getConsiderapautaminima() {
        return considerapautaminima;
    }

    public void setConsiderapautaminima(String considerapautaminima) {
        this.considerapautaminima = considerapautaminima;
    }

    public Short getSittributpautamin() {
        return sittributpautamin;
    }

    public void setSittributpautamin(Short sittributpautamin) {
        this.sittributpautamin = sittributpautamin;
    }

    public Short getSittributdevpautamin() {
        return sittributdevpautamin;
    }

    public void setSittributdevpautamin(Short sittributdevpautamin) {
        this.sittributdevpautamin = sittributdevpautamin;
    }

    public String getIdentificartrib() {
        return identificartrib;
    }

    public void setIdentificartrib(String identificartrib) {
        this.identificartrib = identificartrib;
    }

    public String getZerarbccstst() {
        return zerarbccstst;
    }

    public void setZerarbccstst(String zerarbccstst) {
        this.zerarbccstst = zerarbccstst;
    }

    public BigDecimal getPercredbascalpc() {
        return percredbascalpc;
    }

    public void setPercredbascalpc(BigDecimal percredbascalpc) {
        this.percredbascalpc = percredbascalpc;
    }

    public Short getCodexctribpiscofins() {
        return codexctribpiscofins;
    }

    public void setCodexctribpiscofins(Short codexctribpiscofins) {
        this.codexctribpiscofins = codexctribpiscofins;
    }

    public String getExcluiricmsbasepiscofins() {
        return excluiricmsbasepiscofins;
    }

    public void setExcluiricmsbasepiscofins(String excluiricmsbasepiscofins) {
        this.excluiricmsbasepiscofins = excluiricmsbasepiscofins;
    }

    public String getExcluirdifalbasepiscofins() {
        return excluirdifalbasepiscofins;
    }

    public void setExcluirdifalbasepiscofins(String excluirdifalbasepiscofins) {
        this.excluirdifalbasepiscofins = excluirdifalbasepiscofins;
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

    public String getExcluiricmsstbcrbasepiscofins() {
        return excluiricmsstbcrbasepiscofins;
    }

    public void setExcluiricmsstbcrbasepiscofins(String excluiricmsstbcrbasepiscofins) {
        this.excluiricmsstbcrbasepiscofins = excluiricmsstbcrbasepiscofins;
    }

}