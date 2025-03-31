package org.example.orcamentototvsjakarta;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PCEST")
public class Pcest {
    @EmbeddedId
    private PcestId id;

    @Column(name = "QTEST", precision = 22, scale = 8)
    private BigDecimal qtest;

    @Column(name = "ESTMIN", precision = 16, scale = 3)
    private BigDecimal estmin;

    @Column(name = "DTULTENT")
    private LocalDate dtultent;

    @Column(name = "DTULTSAIDA")
    private LocalDate dtultsaida;

    @Column(name = "QTVENDMES", precision = 16, scale = 3)
    private BigDecimal qtvendmes;

    @Column(name = "QTVENDMES1", precision = 16, scale = 3)
    private BigDecimal qtvendmes1;

    @Column(name = "QTVENDMES2", precision = 16, scale = 3)
    private BigDecimal qtvendmes2;

    @Column(name = "QTVENDMES3", precision = 16, scale = 3)
    private BigDecimal qtvendmes3;

    @Column(name = "QTPERDADIA", precision = 16, scale = 3)
    private BigDecimal qtperdadia;

    @Column(name = "QTPERDAMES", precision = 16, scale = 3)
    private BigDecimal qtperdames;

    @Column(name = "VLVENDMES", precision = 12, scale = 2)
    private BigDecimal vlvendmes;

    @Column(name = "QTVENDDIA", precision = 16, scale = 3)
    private BigDecimal qtvenddia;

    @Column(name = "VLVENDDIA", precision = 12, scale = 2)
    private BigDecimal vlvenddia;

    @Column(name = "QTPEDIDA", precision = 16, scale = 3)
    private BigDecimal qtpedida;

    @Column(name = "VLCUSTODIAREAL", precision = 12, scale = 2)
    private BigDecimal vlcustodiareal;

    @Column(name = "VLCUSTOMESREAL", precision = 12, scale = 2)
    private BigDecimal vlcustomesreal;

    @Column(name = "VLCUSTODIAFIN", precision = 12, scale = 2)
    private BigDecimal vlcustodiafin;

    @Column(name = "VLCUSTOMESFIN", precision = 12, scale = 2)
    private BigDecimal vlcustomesfin;

    @Column(name = "QTESTANT", precision = 16, scale = 3)
    private BigDecimal qtestant;

    @Column(name = "PCUSTOANT", precision = 18, scale = 6)
    private BigDecimal pcustoant;

    @Column(name = "QTRESERV", precision = 22, scale = 8)
    private BigDecimal qtreserv;

    @Column(name = "QTULTENT", precision = 16, scale = 3)
    private BigDecimal qtultent;

    @Column(name = "CUSTOULTENT", precision = 18, scale = 6)
    private BigDecimal custoultent;

    @Column(name = "QTESTGER", precision = 22, scale = 8)
    private BigDecimal qtestger;

    @Column(name = "QTENTDIA", precision = 16, scale = 3)
    private BigDecimal qtentdia;

    @Column(name = "QTENTMES", precision = 16, scale = 3)
    private BigDecimal qtentmes;

    @Column(name = "VLVENDDIAREAL", precision = 12, scale = 2)
    private BigDecimal vlvenddiareal;

    @Column(name = "VLVENDMESREAL", precision = 12, scale = 2)
    private BigDecimal vlvendmesreal;

    @Column(name = "CUSTOCONT", precision = 18, scale = 6)
    private BigDecimal custocont;

    @Column(name = "QTBLOQUEADA", precision = 20, scale = 6)
    private BigDecimal qtbloqueada;

    @Column(name = "FIMESTOQUE", length = 1)
    private String fimestoque;

    @Column(name = "QTINDENIZ", precision = 20, scale = 6)
    private BigDecimal qtindeniz;

    @Column(name = "QTULTINVENT", precision = 16, scale = 3)
    private BigDecimal qtultinvent;

    @Column(name = "QTVENDAPERDIDA", precision = 16, scale = 3)
    private BigDecimal qtvendaperdida;

    @Column(name = "CUSTOREAL", precision = 18, scale = 6)
    private BigDecimal custoreal;

    @Column(name = "CUSTOFIN", precision = 18, scale = 6)
    private BigDecimal custofin;

    @Column(name = "CUSTOREP", precision = 18, scale = 6)
    private BigDecimal custorep;

    @Column(name = "VALORULTENT", precision = 18, scale = 6)
    private BigDecimal valorultent;

    @Column(name = "QTBLOQTRANSF", precision = 16, scale = 3)
    private BigDecimal qtbloqtransf;

    @Column(name = "QTPENDENTE", precision = 16, scale = 3)
    private BigDecimal qtpendente;

    @Column(name = "QTVENDSEMANA", precision = 16, scale = 3)
    private BigDecimal qtvendsemana;

    @Column(name = "QTVENDSEMANA1", precision = 16, scale = 3)
    private BigDecimal qtvendsemana1;

    @Column(name = "QTVENDSEMANA2", precision = 16, scale = 3)
    private BigDecimal qtvendsemana2;

    @Column(name = "QTVENDSEMANA3", precision = 16, scale = 3)
    private BigDecimal qtvendsemana3;

    @Column(name = "QTGIRODIA", precision = 16, scale = 3)
    private BigDecimal qtgirodia;

    @Column(name = "PERCEVOLUCAOVENDA", precision = 12, scale = 4)
    private BigDecimal percevolucaovenda;

    @Column(name = "VLVENDMESANT", precision = 14, scale = 2)
    private BigDecimal vlvendmesant;

    @Column(name = "VLCUSTOMESFINANT", precision = 14, scale = 2)
    private BigDecimal vlcustomesfinant;

    @Column(name = "VLCUSTOMESREALANT", precision = 14, scale = 2)
    private BigDecimal vlcustomesrealant;

    @Column(name = "NUMNOTAULTENT")
    private Long numnotaultent;

    @Column(name = "PCOMPRAULTENT", precision = 18, scale = 6)
    private BigDecimal pcompraultent;

    @Column(name = "VLSTULTENT", precision = 18, scale = 6)
    private BigDecimal vlstultent;

    @Column(name = "MODULO")
    private Short modulo;

    @Column(name = "RUA")
    private Short rua;

    @Column(name = "APTO")
    private Short apto;

    @Column(name = "DTULTINVENT")
    private LocalDate dtultinvent;

    @ColumnDefault("'0'")
    @Column(name = "CUSTODOLAR", precision = 18, scale = 6)
    private BigDecimal custodolar;

    @Column(name = "CUSTOULTENTMED", precision = 18, scale = 6)
    private BigDecimal custoultentmed;

    @Column(name = "VALORULTENTMED", precision = 18, scale = 6)
    private BigDecimal valorultentmed;

    @Column(name = "QTRESERVMED", precision = 16, scale = 3)
    private BigDecimal qtreservmed;

    @Column(name = "QTREQUISICAO", precision = 16, scale = 3)
    private BigDecimal qtrequisicao;

    @Column(name = "CUSTOREALSEMST", precision = 18, scale = 6)
    private BigDecimal custorealsemst;

    @Column(name = "DTULTPEDCOMPRA")
    private LocalDate dtultpedcompra;

    @Column(name = "CUSTOULTPEDCOMPRA", precision = 18, scale = 6)
    private BigDecimal custoultpedcompra;

    @Column(name = "CUSTOULTENTFIN", precision = 18, scale = 6)
    private BigDecimal custoultentfin;

    @Column(name = "DTULTDESDOBRA")
    private LocalDate dtultdesdobra;

    @Column(name = "CORREDOR")
    private Short corredor;

    @Column(name = "QTLOJA", precision = 20, scale = 8)
    private BigDecimal qtloja;

    @Column(name = "BASEBCR", precision = 18, scale = 6)
    private BigDecimal basebcr;

    @Column(name = "STBCR", precision = 18, scale = 6)
    private BigDecimal stbcr;

    @Column(name = "CUSTOPROXIMACOMPRA", precision = 18, scale = 6)
    private BigDecimal custoproximacompra;

    @Column(name = "NUMTRANSENTULTENT")
    private Long numtransentultent;

    @Column(name = "CUSTOULTENTANT", precision = 18, scale = 6)
    private BigDecimal custoultentant;

    @Column(name = "MOTIVOBLOQESTOQUE", length = 80)
    private String motivobloqestoque;

    @Column(name = "CODDEVOL")
    private Short coddevol;

    @ColumnDefault("'0'")
    @Column(name = "QTDEVOLMES", precision = 16, scale = 3)
    private BigDecimal qtdevolmes;

    @ColumnDefault("'0'")
    @Column(name = "QTDEVOLMES1", precision = 16, scale = 3)
    private BigDecimal qtdevolmes1;

    @ColumnDefault("'0'")
    @Column(name = "QTDEVOLMES2", precision = 16, scale = 3)
    private BigDecimal qtdevolmes2;

    @ColumnDefault("'0'")
    @Column(name = "QTDEVOLMES3", precision = 16, scale = 3)
    private BigDecimal qtdevolmes3;

    @Column(name = "ESTMAX", precision = 16, scale = 3)
    private BigDecimal estmax;

    @ColumnDefault("'0'")
    @Column(name = "VLULTENTCONTSEMST", precision = 18, scale = 6)
    private BigDecimal vlultentcontsemst;

    @ColumnDefault("'0'")
    @Column(name = "CUSTOULTENTLIQ", precision = 18, scale = 6)
    private BigDecimal custoultentliq;

    @ColumnDefault("'0'")
    @Column(name = "CUSTOREALLIQ", precision = 18, scale = 6)
    private BigDecimal custorealliq;

    @Column(name = "MODULOCX")
    private Short modulocx;

    @Column(name = "RUACX")
    private Short ruacx;

    @Column(name = "APTOCX")
    private Short aptocx;

    @Column(name = "DTPRIMCOMPRA")
    private LocalDate dtprimcompra;

    @Column(name = "DTULTALTERSRVPRC")
    private LocalDate dtultaltersrvprc;

    @Column(name = "ESTIDEAL", precision = 16, scale = 3)
    private BigDecimal estideal;

    @Column(name = "DTULTFAT")
    private LocalDate dtultfat;

    @Column(name = "VLULTPCOMPRA", precision = 18, scale = 6)
    private BigDecimal vlultpcompra;

    @Column(name = "CUSTONFSEMST", precision = 18, scale = 6)
    private BigDecimal custonfsemst;

    @Column(name = "BASEICMSULTENT", precision = 18, scale = 6)
    private BigDecimal baseicmsultent;

    @Column(name = "CUSTOULTENTCONT", precision = 18, scale = 6)
    private BigDecimal custoultentcont;

    @Column(name = "QTTRANSITO", precision = 22, scale = 8)
    private BigDecimal qttransito;

    @Column(name = "BASEICMSULTENTTAB", precision = 18, scale = 6)
    private BigDecimal baseicmsultenttab;

    @Column(name = "VLSTULTENTTAB", precision = 18, scale = 6)
    private BigDecimal vlstultenttab;

    @Column(name = "VLSTGUIAULTENTTAB", precision = 18, scale = 6)
    private BigDecimal vlstguiaultenttab;

    @Column(name = "CUSTONFSEMSTTAB", precision = 18, scale = 6)
    private BigDecimal custonfsemsttab;

    @Column(name = "CUSTONFSEMSTGUIAULTENTTAB", precision = 18, scale = 6)
    private BigDecimal custonfsemstguiaultenttab;

    @Column(name = "IVAULTENTTAB", precision = 8, scale = 4)
    private BigDecimal ivaultenttab;

    @Column(name = "ALIQICMS1ULTENTTAB", precision = 12, scale = 4)
    private BigDecimal aliqicms1ultenttab;

    @Column(name = "ALIQICMS2ULTENTTAB", precision = 12, scale = 4)
    private BigDecimal aliqicms2ultenttab;

    @Column(name = "REDBASEIVAULTENTTAB", precision = 18, scale = 6)
    private BigDecimal redbaseivaultenttab;

    @Column(name = "PERCICMSFRETEFOBSTULTENTTAB", precision = 12, scale = 4)
    private BigDecimal percicmsfretefobstultenttab;

    @Column(name = "VLFRETECONHECULTENTTAB", precision = 18, scale = 6)
    private BigDecimal vlfreteconhecultenttab;

    @Column(name = "PERCALIQEXTGUIAULTENTTAB", precision = 12, scale = 4)
    private BigDecimal percaliqextguiaultenttab;

    @Column(name = "VLSTGUIAULTENT", precision = 18, scale = 6)
    private BigDecimal vlstguiaultent;

    @Column(name = "CUSTONFSEMSTGUIAULTENT", precision = 18, scale = 6)
    private BigDecimal custonfsemstguiaultent;

    @Column(name = "IVAULTENT", precision = 8, scale = 4)
    private BigDecimal ivaultent;

    @Column(name = "ALIQICMS1ULTENT", precision = 12, scale = 4)
    private BigDecimal aliqicms1ultent;

    @Column(name = "ALIQICMS2ULTENT", precision = 12, scale = 4)
    private BigDecimal aliqicms2ultent;

    @Column(name = "REDBASEIVAULTENT", precision = 18, scale = 6)
    private BigDecimal redbaseivaultent;

    @Column(name = "PERCICMSFRETEFOBSTULTENT", precision = 12, scale = 4)
    private BigDecimal percicmsfretefobstultent;

    @Column(name = "VLFRETECONHECULTENT", precision = 18, scale = 6)
    private BigDecimal vlfreteconhecultent;

    @Column(name = "PERCALIQEXTGUIAULTENT", precision = 12, scale = 4)
    private BigDecimal percaliqextguiaultent;

    @Column(name = "ROTINALANC", length = 48)
    private String rotinalanc;

    @Column(name = "PERCMVAORIGULTENT", precision = 12, scale = 4)
    private BigDecimal percmvaorigultent;

    @Column(name = "PERCMVAORIGTAB", precision = 12, scale = 4)
    private BigDecimal percmvaorigtab;

    @Column(name = "ASSINATURA")
    private String assinatura;

    @Column(name = "QTESTORNOPRODUZDIA", precision = 22, scale = 8)
    private BigDecimal qtestornoproduzdia;

    @Column(name = "QTESTORNOPRODUZMES", precision = 22, scale = 8)
    private BigDecimal qtestornoproduzmes;

    @Column(name = "QTPRODUZIDADIA", precision = 22, scale = 8)
    private BigDecimal qtproduzidadia;

    @Column(name = "QTPRODUZIDAMES", precision = 22, scale = 8)
    private BigDecimal qtproduzidames;

    @Column(name = "DTALTERACAO1107")
    private LocalDate dtalteracao1107;

    @Column(name = "DTEMISSAOULTENT")
    private LocalDate dtemissaoultent;

    @Column(name = "CUSTOFORNEC", precision = 12, scale = 6)
    private BigDecimal custofornec;

    @Column(name = "QTGIROCURVATURA", precision = 16, scale = 3)
    private BigDecimal qtgirocurvatura;

    @Column(name = "QTGIROCURVATURAANT", precision = 16, scale = 3)
    private BigDecimal qtgirocurvaturaant;

    @Column(name = "QTFRENTELOJA", precision = 22, scale = 6)
    private BigDecimal qtfrenteloja;

    @Column(name = "NUMFCI", length = 36)
    private String numfci;

    @Column(name = "VLPARCELAIMPFCI", precision = 18, scale = 6)
    private BigDecimal vlparcelaimpfci;

    @Column(name = "PERCCONTEUDOIMPFCI", precision = 5, scale = 2)
    private BigDecimal percconteudoimpfci;

    @Column(name = "VLIMPORTACAOFCI", precision = 18, scale = 6)
    private BigDecimal vlimportacaofci;

    @Column(name = "CUSTOFORNECSEMST", precision = 18, scale = 6)
    private BigDecimal custofornecsemst;

    @Column(name = "CUSTOPROXIMACOMPRASEMST", precision = 18, scale = 6)
    private BigDecimal custoproximacomprasemst;

    @Column(name = "CUSTOFINSEMST", precision = 18, scale = 6)
    private BigDecimal custofinsemst;

    @Column(name = "CUSTOULTENTFINSEMST", precision = 18, scale = 6)
    private BigDecimal custoultentfinsemst;

    @Column(name = "CUSTOULTENTSEMST", precision = 18, scale = 6)
    private BigDecimal custoultentsemst;

    @Column(name = "CUSTOULTPEDCOMPRASEMST", precision = 18, scale = 6)
    private BigDecimal custoultpedcomprasemst;

    @Column(name = "BASEIPIULTENT", precision = 18, scale = 6)
    private BigDecimal baseipiultent;

    @Column(name = "VLIPIULTENT", precision = 18, scale = 6)
    private BigDecimal vlipiultent;

    @Column(name = "PERCIPIULTENT", precision = 18, scale = 6)
    private BigDecimal percipiultent;

    @Column(name = "QTTRANSITOTV13", precision = 22, scale = 8)
    private BigDecimal qttransitotv13;

    @Column(name = "CODCEST", length = 7)
    private String codcest;

    @Column(name = "IDENTIFICADOR")
    private Long identificador;

    @Column(name = "TEMESTOQUEECOMMERCE", length = 1)
    private String temestoqueecommerce;

    @ColumnDefault("'0'")
    @Column(name = "QTINDUSTRIA", precision = 20, scale = 6)
    private BigDecimal qtindustria;

    @Column(name = "VLVENDMESMED", precision = 12, scale = 2)
    private BigDecimal vlvendmesmed;

    @Column(name = "VLVENDMESMED1", precision = 12, scale = 2)
    private BigDecimal vlvendmesmed1;

    @Column(name = "VLVENDMESMED2", precision = 12, scale = 2)
    private BigDecimal vlvendmesmed2;

    @Column(name = "VLVENDMESMED3", precision = 12, scale = 2)
    private BigDecimal vlvendmesmed3;

    @Column(name = "VLFCPICMSULTENTTAB", precision = 18, scale = 6)
    private BigDecimal vlfcpicmsultenttab;

    @Column(name = "VLFCPSTULTENTTAB", precision = 18, scale = 6)
    private BigDecimal vlfcpstultenttab;

    @Column(name = "VLBASEFCPSTULTENTTAB", precision = 18, scale = 6)
    private BigDecimal vlbasefcpstultenttab;

    @Column(name = "VLBCFCPSTRET", precision = 18, scale = 6)
    private BigDecimal vlbcfcpstret;

    @Column(name = "PERFCPSTRET", precision = 12, scale = 4)
    private BigDecimal perfcpstret;

    @Column(name = "VLFCPSTRET", precision = 18, scale = 6)
    private BigDecimal vlfcpstret;

    @Column(name = "PERCREDBASEEFET", precision = 8, scale = 4)
    private BigDecimal percredbaseefet;

    @Column(name = "VLBASEEFET", precision = 18, scale = 6)
    private BigDecimal vlbaseefet;

    @Column(name = "PERCICMSEFET", precision = 8, scale = 4)
    private BigDecimal percicmsefet;

    @Column(name = "VLICMSEFET", precision = 18, scale = 6)
    private BigDecimal vlicmsefet;

    @Column(name = "NUMTRANSULTENTET")
    private Long numtransultentet;

    @Column(name = "NUMTRANSULTENTED")
    private Long numtransultented;

    @Column(name = "ALIQICMS1", precision = 12, scale = 4)
    private BigDecimal aliqicms1;

    @Column(name = "NUMTRANSULTENTST")
    private Long numtransultentst;

    @Column(name = "ESTBONIFIC", length = 1)
    private String estbonific;

    @Column(name = "VLICMSBCR", precision = 18, scale = 6)
    private BigDecimal vlicmsbcr;

    @Column(name = "BASEICMSBCR", precision = 18, scale = 6)
    private BigDecimal baseicmsbcr;

    @Column(name = "TIPOCURVA", length = 1)
    private String tipocurva;

    @Column(name = "CURVA", length = 250)
    private String curva;

    @Column(name = "SUBCURVA", length = 250)
    private String subcurva;

    @Column(name = "FREQUENCIA", length = 250)
    private String frequencia;

    @Column(name = "NUMTRANSENTULTENTBNF")
    private Long numtransentultentbnf;

    @Column(name = "QTCROSSDOCK", precision = 22, scale = 8)
    private BigDecimal qtcrossdock;

    @Column(name = "QTESTOQUEEMTERCEIRO", precision = 22, scale = 8)
    private BigDecimal qtestoqueemterceiro;

    @Column(name = "QTESTOQUEDETERCEIRO", precision = 22, scale = 8)
    private BigDecimal qtestoquedeterceiro;

    @Column(name = "QTTRANSITOTV10", precision = 22, scale = 8)
    private BigDecimal qttransitotv10;

    @Column(name = "DTHORAULTSAIDA")
    private LocalDate dthoraultsaida;

    @Column(name = "DTHORAULTALTDISP")
    private LocalDate dthoraultaltdisp;

    @Column(name = "QBCMONORET", precision = 21, scale = 10)
    private BigDecimal qbcmonoret;

    @Column(name = "ADREMICMSRET", precision = 7, scale = 4)
    private BigDecimal adremicmsret;

    @Column(name = "VICMSMONORET", precision = 23, scale = 10)
    private BigDecimal vicmsmonoret;

    @ColumnDefault("NULL")
    @Column(name = "CUSTOULTENTFISCAL", precision = 18, scale = 6)
    private BigDecimal custoultentfiscal;

    @ColumnDefault("NULL")
    @Column(name = "CUSTOFISCAL", precision = 18, scale = 6)
    private BigDecimal custofiscal;

    @Column(name = "VLIPISUSPENSOULTENT", precision = 18, scale = 6)
    private BigDecimal vlipisuspensoultent;

    @Column(name = "VLIISUSPENSOULTENT", precision = 18, scale = 6)
    private BigDecimal vliisuspensoultent;

    @Column(name = "PLIQULTENT", precision = 18, scale = 6)
    private BigDecimal pliqultent;

    @Column(name = "PERICMSANTECIPADOULTENT", precision = 12, scale = 4)
    private BigDecimal pericmsantecipadoultent;

    @Column(name = "PERICMULTENT", precision = 12, scale = 4)
    private BigDecimal pericmultent;

    @Column(name = "NUMERO", precision = 9, scale = 2)
    private BigDecimal numero;

    @Column(name = "NUMEROCX", precision = 9, scale = 2)
    private BigDecimal numerocx;

    public PcestId getId() {
        return id;
    }

    public void setId(PcestId id) {
        this.id = id;
    }

    public BigDecimal getQtest() {
        return qtest;
    }

    public void setQtest(BigDecimal qtest) {
        this.qtest = qtest;
    }

    public BigDecimal getEstmin() {
        return estmin;
    }

    public void setEstmin(BigDecimal estmin) {
        this.estmin = estmin;
    }

    public LocalDate getDtultent() {
        return dtultent;
    }

    public void setDtultent(LocalDate dtultent) {
        this.dtultent = dtultent;
    }

    public LocalDate getDtultsaida() {
        return dtultsaida;
    }

    public void setDtultsaida(LocalDate dtultsaida) {
        this.dtultsaida = dtultsaida;
    }

    public BigDecimal getQtvendmes() {
        return qtvendmes;
    }

    public void setQtvendmes(BigDecimal qtvendmes) {
        this.qtvendmes = qtvendmes;
    }

    public BigDecimal getQtvendmes1() {
        return qtvendmes1;
    }

    public void setQtvendmes1(BigDecimal qtvendmes1) {
        this.qtvendmes1 = qtvendmes1;
    }

    public BigDecimal getQtvendmes2() {
        return qtvendmes2;
    }

    public void setQtvendmes2(BigDecimal qtvendmes2) {
        this.qtvendmes2 = qtvendmes2;
    }

    public BigDecimal getQtvendmes3() {
        return qtvendmes3;
    }

    public void setQtvendmes3(BigDecimal qtvendmes3) {
        this.qtvendmes3 = qtvendmes3;
    }

    public BigDecimal getQtperdadia() {
        return qtperdadia;
    }

    public void setQtperdadia(BigDecimal qtperdadia) {
        this.qtperdadia = qtperdadia;
    }

    public BigDecimal getQtperdames() {
        return qtperdames;
    }

    public void setQtperdames(BigDecimal qtperdames) {
        this.qtperdames = qtperdames;
    }

    public BigDecimal getVlvendmes() {
        return vlvendmes;
    }

    public void setVlvendmes(BigDecimal vlvendmes) {
        this.vlvendmes = vlvendmes;
    }

    public BigDecimal getQtvenddia() {
        return qtvenddia;
    }

    public void setQtvenddia(BigDecimal qtvenddia) {
        this.qtvenddia = qtvenddia;
    }

    public BigDecimal getVlvenddia() {
        return vlvenddia;
    }

    public void setVlvenddia(BigDecimal vlvenddia) {
        this.vlvenddia = vlvenddia;
    }

    public BigDecimal getQtpedida() {
        return qtpedida;
    }

    public void setQtpedida(BigDecimal qtpedida) {
        this.qtpedida = qtpedida;
    }

    public BigDecimal getVlcustodiareal() {
        return vlcustodiareal;
    }

    public void setVlcustodiareal(BigDecimal vlcustodiareal) {
        this.vlcustodiareal = vlcustodiareal;
    }

    public BigDecimal getVlcustomesreal() {
        return vlcustomesreal;
    }

    public void setVlcustomesreal(BigDecimal vlcustomesreal) {
        this.vlcustomesreal = vlcustomesreal;
    }

    public BigDecimal getVlcustodiafin() {
        return vlcustodiafin;
    }

    public void setVlcustodiafin(BigDecimal vlcustodiafin) {
        this.vlcustodiafin = vlcustodiafin;
    }

    public BigDecimal getVlcustomesfin() {
        return vlcustomesfin;
    }

    public void setVlcustomesfin(BigDecimal vlcustomesfin) {
        this.vlcustomesfin = vlcustomesfin;
    }

    public BigDecimal getQtestant() {
        return qtestant;
    }

    public void setQtestant(BigDecimal qtestant) {
        this.qtestant = qtestant;
    }

    public BigDecimal getPcustoant() {
        return pcustoant;
    }

    public void setPcustoant(BigDecimal pcustoant) {
        this.pcustoant = pcustoant;
    }

    public BigDecimal getQtreserv() {
        return qtreserv;
    }

    public void setQtreserv(BigDecimal qtreserv) {
        this.qtreserv = qtreserv;
    }

    public BigDecimal getQtultent() {
        return qtultent;
    }

    public void setQtultent(BigDecimal qtultent) {
        this.qtultent = qtultent;
    }

    public BigDecimal getCustoultent() {
        return custoultent;
    }

    public void setCustoultent(BigDecimal custoultent) {
        this.custoultent = custoultent;
    }

    public BigDecimal getQtestger() {
        return qtestger;
    }

    public void setQtestger(BigDecimal qtestger) {
        this.qtestger = qtestger;
    }

    public BigDecimal getQtentdia() {
        return qtentdia;
    }

    public void setQtentdia(BigDecimal qtentdia) {
        this.qtentdia = qtentdia;
    }

    public BigDecimal getQtentmes() {
        return qtentmes;
    }

    public void setQtentmes(BigDecimal qtentmes) {
        this.qtentmes = qtentmes;
    }

    public BigDecimal getVlvenddiareal() {
        return vlvenddiareal;
    }

    public void setVlvenddiareal(BigDecimal vlvenddiareal) {
        this.vlvenddiareal = vlvenddiareal;
    }

    public BigDecimal getVlvendmesreal() {
        return vlvendmesreal;
    }

    public void setVlvendmesreal(BigDecimal vlvendmesreal) {
        this.vlvendmesreal = vlvendmesreal;
    }

    public BigDecimal getCustocont() {
        return custocont;
    }

    public void setCustocont(BigDecimal custocont) {
        this.custocont = custocont;
    }

    public BigDecimal getQtbloqueada() {
        return qtbloqueada;
    }

    public void setQtbloqueada(BigDecimal qtbloqueada) {
        this.qtbloqueada = qtbloqueada;
    }

    public String getFimestoque() {
        return fimestoque;
    }

    public void setFimestoque(String fimestoque) {
        this.fimestoque = fimestoque;
    }

    public BigDecimal getQtindeniz() {
        return qtindeniz;
    }

    public void setQtindeniz(BigDecimal qtindeniz) {
        this.qtindeniz = qtindeniz;
    }

    public BigDecimal getQtultinvent() {
        return qtultinvent;
    }

    public void setQtultinvent(BigDecimal qtultinvent) {
        this.qtultinvent = qtultinvent;
    }

    public BigDecimal getQtvendaperdida() {
        return qtvendaperdida;
    }

    public void setQtvendaperdida(BigDecimal qtvendaperdida) {
        this.qtvendaperdida = qtvendaperdida;
    }

    public BigDecimal getCustoreal() {
        return custoreal;
    }

    public void setCustoreal(BigDecimal custoreal) {
        this.custoreal = custoreal;
    }

    public BigDecimal getCustofin() {
        return custofin;
    }

    public void setCustofin(BigDecimal custofin) {
        this.custofin = custofin;
    }

    public BigDecimal getCustorep() {
        return custorep;
    }

    public void setCustorep(BigDecimal custorep) {
        this.custorep = custorep;
    }

    public BigDecimal getValorultent() {
        return valorultent;
    }

    public void setValorultent(BigDecimal valorultent) {
        this.valorultent = valorultent;
    }

    public BigDecimal getQtbloqtransf() {
        return qtbloqtransf;
    }

    public void setQtbloqtransf(BigDecimal qtbloqtransf) {
        this.qtbloqtransf = qtbloqtransf;
    }

    public BigDecimal getQtpendente() {
        return qtpendente;
    }

    public void setQtpendente(BigDecimal qtpendente) {
        this.qtpendente = qtpendente;
    }

    public BigDecimal getQtvendsemana() {
        return qtvendsemana;
    }

    public void setQtvendsemana(BigDecimal qtvendsemana) {
        this.qtvendsemana = qtvendsemana;
    }

    public BigDecimal getQtvendsemana1() {
        return qtvendsemana1;
    }

    public void setQtvendsemana1(BigDecimal qtvendsemana1) {
        this.qtvendsemana1 = qtvendsemana1;
    }

    public BigDecimal getQtvendsemana2() {
        return qtvendsemana2;
    }

    public void setQtvendsemana2(BigDecimal qtvendsemana2) {
        this.qtvendsemana2 = qtvendsemana2;
    }

    public BigDecimal getQtvendsemana3() {
        return qtvendsemana3;
    }

    public void setQtvendsemana3(BigDecimal qtvendsemana3) {
        this.qtvendsemana3 = qtvendsemana3;
    }

    public BigDecimal getQtgirodia() {
        return qtgirodia;
    }

    public void setQtgirodia(BigDecimal qtgirodia) {
        this.qtgirodia = qtgirodia;
    }

    public BigDecimal getPercevolucaovenda() {
        return percevolucaovenda;
    }

    public void setPercevolucaovenda(BigDecimal percevolucaovenda) {
        this.percevolucaovenda = percevolucaovenda;
    }

    public BigDecimal getVlvendmesant() {
        return vlvendmesant;
    }

    public void setVlvendmesant(BigDecimal vlvendmesant) {
        this.vlvendmesant = vlvendmesant;
    }

    public BigDecimal getVlcustomesfinant() {
        return vlcustomesfinant;
    }

    public void setVlcustomesfinant(BigDecimal vlcustomesfinant) {
        this.vlcustomesfinant = vlcustomesfinant;
    }

    public BigDecimal getVlcustomesrealant() {
        return vlcustomesrealant;
    }

    public void setVlcustomesrealant(BigDecimal vlcustomesrealant) {
        this.vlcustomesrealant = vlcustomesrealant;
    }

    public Long getNumnotaultent() {
        return numnotaultent;
    }

    public void setNumnotaultent(Long numnotaultent) {
        this.numnotaultent = numnotaultent;
    }

    public BigDecimal getPcompraultent() {
        return pcompraultent;
    }

    public void setPcompraultent(BigDecimal pcompraultent) {
        this.pcompraultent = pcompraultent;
    }

    public BigDecimal getVlstultent() {
        return vlstultent;
    }

    public void setVlstultent(BigDecimal vlstultent) {
        this.vlstultent = vlstultent;
    }

    public Short getModulo() {
        return modulo;
    }

    public void setModulo(Short modulo) {
        this.modulo = modulo;
    }

    public Short getRua() {
        return rua;
    }

    public void setRua(Short rua) {
        this.rua = rua;
    }

    public Short getApto() {
        return apto;
    }

    public void setApto(Short apto) {
        this.apto = apto;
    }

    public LocalDate getDtultinvent() {
        return dtultinvent;
    }

    public void setDtultinvent(LocalDate dtultinvent) {
        this.dtultinvent = dtultinvent;
    }

    public BigDecimal getCustodolar() {
        return custodolar;
    }

    public void setCustodolar(BigDecimal custodolar) {
        this.custodolar = custodolar;
    }

    public BigDecimal getCustoultentmed() {
        return custoultentmed;
    }

    public void setCustoultentmed(BigDecimal custoultentmed) {
        this.custoultentmed = custoultentmed;
    }

    public BigDecimal getValorultentmed() {
        return valorultentmed;
    }

    public void setValorultentmed(BigDecimal valorultentmed) {
        this.valorultentmed = valorultentmed;
    }

    public BigDecimal getQtreservmed() {
        return qtreservmed;
    }

    public void setQtreservmed(BigDecimal qtreservmed) {
        this.qtreservmed = qtreservmed;
    }

    public BigDecimal getQtrequisicao() {
        return qtrequisicao;
    }

    public void setQtrequisicao(BigDecimal qtrequisicao) {
        this.qtrequisicao = qtrequisicao;
    }

    public BigDecimal getCustorealsemst() {
        return custorealsemst;
    }

    public void setCustorealsemst(BigDecimal custorealsemst) {
        this.custorealsemst = custorealsemst;
    }

    public LocalDate getDtultpedcompra() {
        return dtultpedcompra;
    }

    public void setDtultpedcompra(LocalDate dtultpedcompra) {
        this.dtultpedcompra = dtultpedcompra;
    }

    public BigDecimal getCustoultpedcompra() {
        return custoultpedcompra;
    }

    public void setCustoultpedcompra(BigDecimal custoultpedcompra) {
        this.custoultpedcompra = custoultpedcompra;
    }

    public BigDecimal getCustoultentfin() {
        return custoultentfin;
    }

    public void setCustoultentfin(BigDecimal custoultentfin) {
        this.custoultentfin = custoultentfin;
    }

    public LocalDate getDtultdesdobra() {
        return dtultdesdobra;
    }

    public void setDtultdesdobra(LocalDate dtultdesdobra) {
        this.dtultdesdobra = dtultdesdobra;
    }

    public Short getCorredor() {
        return corredor;
    }

    public void setCorredor(Short corredor) {
        this.corredor = corredor;
    }

    public BigDecimal getQtloja() {
        return qtloja;
    }

    public void setQtloja(BigDecimal qtloja) {
        this.qtloja = qtloja;
    }

    public BigDecimal getBasebcr() {
        return basebcr;
    }

    public void setBasebcr(BigDecimal basebcr) {
        this.basebcr = basebcr;
    }

    public BigDecimal getStbcr() {
        return stbcr;
    }

    public void setStbcr(BigDecimal stbcr) {
        this.stbcr = stbcr;
    }

    public BigDecimal getCustoproximacompra() {
        return custoproximacompra;
    }

    public void setCustoproximacompra(BigDecimal custoproximacompra) {
        this.custoproximacompra = custoproximacompra;
    }

    public Long getNumtransentultent() {
        return numtransentultent;
    }

    public void setNumtransentultent(Long numtransentultent) {
        this.numtransentultent = numtransentultent;
    }

    public BigDecimal getCustoultentant() {
        return custoultentant;
    }

    public void setCustoultentant(BigDecimal custoultentant) {
        this.custoultentant = custoultentant;
    }

    public String getMotivobloqestoque() {
        return motivobloqestoque;
    }

    public void setMotivobloqestoque(String motivobloqestoque) {
        this.motivobloqestoque = motivobloqestoque;
    }

    public Short getCoddevol() {
        return coddevol;
    }

    public void setCoddevol(Short coddevol) {
        this.coddevol = coddevol;
    }

    public BigDecimal getQtdevolmes() {
        return qtdevolmes;
    }

    public void setQtdevolmes(BigDecimal qtdevolmes) {
        this.qtdevolmes = qtdevolmes;
    }

    public BigDecimal getQtdevolmes1() {
        return qtdevolmes1;
    }

    public void setQtdevolmes1(BigDecimal qtdevolmes1) {
        this.qtdevolmes1 = qtdevolmes1;
    }

    public BigDecimal getQtdevolmes2() {
        return qtdevolmes2;
    }

    public void setQtdevolmes2(BigDecimal qtdevolmes2) {
        this.qtdevolmes2 = qtdevolmes2;
    }

    public BigDecimal getQtdevolmes3() {
        return qtdevolmes3;
    }

    public void setQtdevolmes3(BigDecimal qtdevolmes3) {
        this.qtdevolmes3 = qtdevolmes3;
    }

    public BigDecimal getEstmax() {
        return estmax;
    }

    public void setEstmax(BigDecimal estmax) {
        this.estmax = estmax;
    }

    public BigDecimal getVlultentcontsemst() {
        return vlultentcontsemst;
    }

    public void setVlultentcontsemst(BigDecimal vlultentcontsemst) {
        this.vlultentcontsemst = vlultentcontsemst;
    }

    public BigDecimal getCustoultentliq() {
        return custoultentliq;
    }

    public void setCustoultentliq(BigDecimal custoultentliq) {
        this.custoultentliq = custoultentliq;
    }

    public BigDecimal getCustorealliq() {
        return custorealliq;
    }

    public void setCustorealliq(BigDecimal custorealliq) {
        this.custorealliq = custorealliq;
    }

    public Short getModulocx() {
        return modulocx;
    }

    public void setModulocx(Short modulocx) {
        this.modulocx = modulocx;
    }

    public Short getRuacx() {
        return ruacx;
    }

    public void setRuacx(Short ruacx) {
        this.ruacx = ruacx;
    }

    public Short getAptocx() {
        return aptocx;
    }

    public void setAptocx(Short aptocx) {
        this.aptocx = aptocx;
    }

    public LocalDate getDtprimcompra() {
        return dtprimcompra;
    }

    public void setDtprimcompra(LocalDate dtprimcompra) {
        this.dtprimcompra = dtprimcompra;
    }

    public LocalDate getDtultaltersrvprc() {
        return dtultaltersrvprc;
    }

    public void setDtultaltersrvprc(LocalDate dtultaltersrvprc) {
        this.dtultaltersrvprc = dtultaltersrvprc;
    }

    public BigDecimal getEstideal() {
        return estideal;
    }

    public void setEstideal(BigDecimal estideal) {
        this.estideal = estideal;
    }

    public LocalDate getDtultfat() {
        return dtultfat;
    }

    public void setDtultfat(LocalDate dtultfat) {
        this.dtultfat = dtultfat;
    }

    public BigDecimal getVlultpcompra() {
        return vlultpcompra;
    }

    public void setVlultpcompra(BigDecimal vlultpcompra) {
        this.vlultpcompra = vlultpcompra;
    }

    public BigDecimal getCustonfsemst() {
        return custonfsemst;
    }

    public void setCustonfsemst(BigDecimal custonfsemst) {
        this.custonfsemst = custonfsemst;
    }

    public BigDecimal getBaseicmsultent() {
        return baseicmsultent;
    }

    public void setBaseicmsultent(BigDecimal baseicmsultent) {
        this.baseicmsultent = baseicmsultent;
    }

    public BigDecimal getCustoultentcont() {
        return custoultentcont;
    }

    public void setCustoultentcont(BigDecimal custoultentcont) {
        this.custoultentcont = custoultentcont;
    }

    public BigDecimal getQttransito() {
        return qttransito;
    }

    public void setQttransito(BigDecimal qttransito) {
        this.qttransito = qttransito;
    }

    public BigDecimal getBaseicmsultenttab() {
        return baseicmsultenttab;
    }

    public void setBaseicmsultenttab(BigDecimal baseicmsultenttab) {
        this.baseicmsultenttab = baseicmsultenttab;
    }

    public BigDecimal getVlstultenttab() {
        return vlstultenttab;
    }

    public void setVlstultenttab(BigDecimal vlstultenttab) {
        this.vlstultenttab = vlstultenttab;
    }

    public BigDecimal getVlstguiaultenttab() {
        return vlstguiaultenttab;
    }

    public void setVlstguiaultenttab(BigDecimal vlstguiaultenttab) {
        this.vlstguiaultenttab = vlstguiaultenttab;
    }

    public BigDecimal getCustonfsemsttab() {
        return custonfsemsttab;
    }

    public void setCustonfsemsttab(BigDecimal custonfsemsttab) {
        this.custonfsemsttab = custonfsemsttab;
    }

    public BigDecimal getCustonfsemstguiaultenttab() {
        return custonfsemstguiaultenttab;
    }

    public void setCustonfsemstguiaultenttab(BigDecimal custonfsemstguiaultenttab) {
        this.custonfsemstguiaultenttab = custonfsemstguiaultenttab;
    }

    public BigDecimal getIvaultenttab() {
        return ivaultenttab;
    }

    public void setIvaultenttab(BigDecimal ivaultenttab) {
        this.ivaultenttab = ivaultenttab;
    }

    public BigDecimal getAliqicms1ultenttab() {
        return aliqicms1ultenttab;
    }

    public void setAliqicms1ultenttab(BigDecimal aliqicms1ultenttab) {
        this.aliqicms1ultenttab = aliqicms1ultenttab;
    }

    public BigDecimal getAliqicms2ultenttab() {
        return aliqicms2ultenttab;
    }

    public void setAliqicms2ultenttab(BigDecimal aliqicms2ultenttab) {
        this.aliqicms2ultenttab = aliqicms2ultenttab;
    }

    public BigDecimal getRedbaseivaultenttab() {
        return redbaseivaultenttab;
    }

    public void setRedbaseivaultenttab(BigDecimal redbaseivaultenttab) {
        this.redbaseivaultenttab = redbaseivaultenttab;
    }

    public BigDecimal getPercicmsfretefobstultenttab() {
        return percicmsfretefobstultenttab;
    }

    public void setPercicmsfretefobstultenttab(BigDecimal percicmsfretefobstultenttab) {
        this.percicmsfretefobstultenttab = percicmsfretefobstultenttab;
    }

    public BigDecimal getVlfreteconhecultenttab() {
        return vlfreteconhecultenttab;
    }

    public void setVlfreteconhecultenttab(BigDecimal vlfreteconhecultenttab) {
        this.vlfreteconhecultenttab = vlfreteconhecultenttab;
    }

    public BigDecimal getPercaliqextguiaultenttab() {
        return percaliqextguiaultenttab;
    }

    public void setPercaliqextguiaultenttab(BigDecimal percaliqextguiaultenttab) {
        this.percaliqextguiaultenttab = percaliqextguiaultenttab;
    }

    public BigDecimal getVlstguiaultent() {
        return vlstguiaultent;
    }

    public void setVlstguiaultent(BigDecimal vlstguiaultent) {
        this.vlstguiaultent = vlstguiaultent;
    }

    public BigDecimal getCustonfsemstguiaultent() {
        return custonfsemstguiaultent;
    }

    public void setCustonfsemstguiaultent(BigDecimal custonfsemstguiaultent) {
        this.custonfsemstguiaultent = custonfsemstguiaultent;
    }

    public BigDecimal getIvaultent() {
        return ivaultent;
    }

    public void setIvaultent(BigDecimal ivaultent) {
        this.ivaultent = ivaultent;
    }

    public BigDecimal getAliqicms1ultent() {
        return aliqicms1ultent;
    }

    public void setAliqicms1ultent(BigDecimal aliqicms1ultent) {
        this.aliqicms1ultent = aliqicms1ultent;
    }

    public BigDecimal getAliqicms2ultent() {
        return aliqicms2ultent;
    }

    public void setAliqicms2ultent(BigDecimal aliqicms2ultent) {
        this.aliqicms2ultent = aliqicms2ultent;
    }

    public BigDecimal getRedbaseivaultent() {
        return redbaseivaultent;
    }

    public void setRedbaseivaultent(BigDecimal redbaseivaultent) {
        this.redbaseivaultent = redbaseivaultent;
    }

    public BigDecimal getPercicmsfretefobstultent() {
        return percicmsfretefobstultent;
    }

    public void setPercicmsfretefobstultent(BigDecimal percicmsfretefobstultent) {
        this.percicmsfretefobstultent = percicmsfretefobstultent;
    }

    public BigDecimal getVlfreteconhecultent() {
        return vlfreteconhecultent;
    }

    public void setVlfreteconhecultent(BigDecimal vlfreteconhecultent) {
        this.vlfreteconhecultent = vlfreteconhecultent;
    }

    public BigDecimal getPercaliqextguiaultent() {
        return percaliqextguiaultent;
    }

    public void setPercaliqextguiaultent(BigDecimal percaliqextguiaultent) {
        this.percaliqextguiaultent = percaliqextguiaultent;
    }

    public String getRotinalanc() {
        return rotinalanc;
    }

    public void setRotinalanc(String rotinalanc) {
        this.rotinalanc = rotinalanc;
    }

    public BigDecimal getPercmvaorigultent() {
        return percmvaorigultent;
    }

    public void setPercmvaorigultent(BigDecimal percmvaorigultent) {
        this.percmvaorigultent = percmvaorigultent;
    }

    public BigDecimal getPercmvaorigtab() {
        return percmvaorigtab;
    }

    public void setPercmvaorigtab(BigDecimal percmvaorigtab) {
        this.percmvaorigtab = percmvaorigtab;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public BigDecimal getQtestornoproduzdia() {
        return qtestornoproduzdia;
    }

    public void setQtestornoproduzdia(BigDecimal qtestornoproduzdia) {
        this.qtestornoproduzdia = qtestornoproduzdia;
    }

    public BigDecimal getQtestornoproduzmes() {
        return qtestornoproduzmes;
    }

    public void setQtestornoproduzmes(BigDecimal qtestornoproduzmes) {
        this.qtestornoproduzmes = qtestornoproduzmes;
    }

    public BigDecimal getQtproduzidadia() {
        return qtproduzidadia;
    }

    public void setQtproduzidadia(BigDecimal qtproduzidadia) {
        this.qtproduzidadia = qtproduzidadia;
    }

    public BigDecimal getQtproduzidames() {
        return qtproduzidames;
    }

    public void setQtproduzidames(BigDecimal qtproduzidames) {
        this.qtproduzidames = qtproduzidames;
    }

    public LocalDate getDtalteracao1107() {
        return dtalteracao1107;
    }

    public void setDtalteracao1107(LocalDate dtalteracao1107) {
        this.dtalteracao1107 = dtalteracao1107;
    }

    public LocalDate getDtemissaoultent() {
        return dtemissaoultent;
    }

    public void setDtemissaoultent(LocalDate dtemissaoultent) {
        this.dtemissaoultent = dtemissaoultent;
    }

    public BigDecimal getCustofornec() {
        return custofornec;
    }

    public void setCustofornec(BigDecimal custofornec) {
        this.custofornec = custofornec;
    }

    public BigDecimal getQtgirocurvatura() {
        return qtgirocurvatura;
    }

    public void setQtgirocurvatura(BigDecimal qtgirocurvatura) {
        this.qtgirocurvatura = qtgirocurvatura;
    }

    public BigDecimal getQtgirocurvaturaant() {
        return qtgirocurvaturaant;
    }

    public void setQtgirocurvaturaant(BigDecimal qtgirocurvaturaant) {
        this.qtgirocurvaturaant = qtgirocurvaturaant;
    }

    public BigDecimal getQtfrenteloja() {
        return qtfrenteloja;
    }

    public void setQtfrenteloja(BigDecimal qtfrenteloja) {
        this.qtfrenteloja = qtfrenteloja;
    }

    public String getNumfci() {
        return numfci;
    }

    public void setNumfci(String numfci) {
        this.numfci = numfci;
    }

    public BigDecimal getVlparcelaimpfci() {
        return vlparcelaimpfci;
    }

    public void setVlparcelaimpfci(BigDecimal vlparcelaimpfci) {
        this.vlparcelaimpfci = vlparcelaimpfci;
    }

    public BigDecimal getPercconteudoimpfci() {
        return percconteudoimpfci;
    }

    public void setPercconteudoimpfci(BigDecimal percconteudoimpfci) {
        this.percconteudoimpfci = percconteudoimpfci;
    }

    public BigDecimal getVlimportacaofci() {
        return vlimportacaofci;
    }

    public void setVlimportacaofci(BigDecimal vlimportacaofci) {
        this.vlimportacaofci = vlimportacaofci;
    }

    public BigDecimal getCustofornecsemst() {
        return custofornecsemst;
    }

    public void setCustofornecsemst(BigDecimal custofornecsemst) {
        this.custofornecsemst = custofornecsemst;
    }

    public BigDecimal getCustoproximacomprasemst() {
        return custoproximacomprasemst;
    }

    public void setCustoproximacomprasemst(BigDecimal custoproximacomprasemst) {
        this.custoproximacomprasemst = custoproximacomprasemst;
    }

    public BigDecimal getCustofinsemst() {
        return custofinsemst;
    }

    public void setCustofinsemst(BigDecimal custofinsemst) {
        this.custofinsemst = custofinsemst;
    }

    public BigDecimal getCustoultentfinsemst() {
        return custoultentfinsemst;
    }

    public void setCustoultentfinsemst(BigDecimal custoultentfinsemst) {
        this.custoultentfinsemst = custoultentfinsemst;
    }

    public BigDecimal getCustoultentsemst() {
        return custoultentsemst;
    }

    public void setCustoultentsemst(BigDecimal custoultentsemst) {
        this.custoultentsemst = custoultentsemst;
    }

    public BigDecimal getCustoultpedcomprasemst() {
        return custoultpedcomprasemst;
    }

    public void setCustoultpedcomprasemst(BigDecimal custoultpedcomprasemst) {
        this.custoultpedcomprasemst = custoultpedcomprasemst;
    }

    public BigDecimal getBaseipiultent() {
        return baseipiultent;
    }

    public void setBaseipiultent(BigDecimal baseipiultent) {
        this.baseipiultent = baseipiultent;
    }

    public BigDecimal getVlipiultent() {
        return vlipiultent;
    }

    public void setVlipiultent(BigDecimal vlipiultent) {
        this.vlipiultent = vlipiultent;
    }

    public BigDecimal getPercipiultent() {
        return percipiultent;
    }

    public void setPercipiultent(BigDecimal percipiultent) {
        this.percipiultent = percipiultent;
    }

    public BigDecimal getQttransitotv13() {
        return qttransitotv13;
    }

    public void setQttransitotv13(BigDecimal qttransitotv13) {
        this.qttransitotv13 = qttransitotv13;
    }

    public String getCodcest() {
        return codcest;
    }

    public void setCodcest(String codcest) {
        this.codcest = codcest;
    }

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public String getTemestoqueecommerce() {
        return temestoqueecommerce;
    }

    public void setTemestoqueecommerce(String temestoqueecommerce) {
        this.temestoqueecommerce = temestoqueecommerce;
    }

    public BigDecimal getQtindustria() {
        return qtindustria;
    }

    public void setQtindustria(BigDecimal qtindustria) {
        this.qtindustria = qtindustria;
    }

    public BigDecimal getVlvendmesmed() {
        return vlvendmesmed;
    }

    public void setVlvendmesmed(BigDecimal vlvendmesmed) {
        this.vlvendmesmed = vlvendmesmed;
    }

    public BigDecimal getVlvendmesmed1() {
        return vlvendmesmed1;
    }

    public void setVlvendmesmed1(BigDecimal vlvendmesmed1) {
        this.vlvendmesmed1 = vlvendmesmed1;
    }

    public BigDecimal getVlvendmesmed2() {
        return vlvendmesmed2;
    }

    public void setVlvendmesmed2(BigDecimal vlvendmesmed2) {
        this.vlvendmesmed2 = vlvendmesmed2;
    }

    public BigDecimal getVlvendmesmed3() {
        return vlvendmesmed3;
    }

    public void setVlvendmesmed3(BigDecimal vlvendmesmed3) {
        this.vlvendmesmed3 = vlvendmesmed3;
    }

    public BigDecimal getVlfcpicmsultenttab() {
        return vlfcpicmsultenttab;
    }

    public void setVlfcpicmsultenttab(BigDecimal vlfcpicmsultenttab) {
        this.vlfcpicmsultenttab = vlfcpicmsultenttab;
    }

    public BigDecimal getVlfcpstultenttab() {
        return vlfcpstultenttab;
    }

    public void setVlfcpstultenttab(BigDecimal vlfcpstultenttab) {
        this.vlfcpstultenttab = vlfcpstultenttab;
    }

    public BigDecimal getVlbasefcpstultenttab() {
        return vlbasefcpstultenttab;
    }

    public void setVlbasefcpstultenttab(BigDecimal vlbasefcpstultenttab) {
        this.vlbasefcpstultenttab = vlbasefcpstultenttab;
    }

    public BigDecimal getVlbcfcpstret() {
        return vlbcfcpstret;
    }

    public void setVlbcfcpstret(BigDecimal vlbcfcpstret) {
        this.vlbcfcpstret = vlbcfcpstret;
    }

    public BigDecimal getPerfcpstret() {
        return perfcpstret;
    }

    public void setPerfcpstret(BigDecimal perfcpstret) {
        this.perfcpstret = perfcpstret;
    }

    public BigDecimal getVlfcpstret() {
        return vlfcpstret;
    }

    public void setVlfcpstret(BigDecimal vlfcpstret) {
        this.vlfcpstret = vlfcpstret;
    }

    public BigDecimal getPercredbaseefet() {
        return percredbaseefet;
    }

    public void setPercredbaseefet(BigDecimal percredbaseefet) {
        this.percredbaseefet = percredbaseefet;
    }

    public BigDecimal getVlbaseefet() {
        return vlbaseefet;
    }

    public void setVlbaseefet(BigDecimal vlbaseefet) {
        this.vlbaseefet = vlbaseefet;
    }

    public BigDecimal getPercicmsefet() {
        return percicmsefet;
    }

    public void setPercicmsefet(BigDecimal percicmsefet) {
        this.percicmsefet = percicmsefet;
    }

    public BigDecimal getVlicmsefet() {
        return vlicmsefet;
    }

    public void setVlicmsefet(BigDecimal vlicmsefet) {
        this.vlicmsefet = vlicmsefet;
    }

    public Long getNumtransultentet() {
        return numtransultentet;
    }

    public void setNumtransultentet(Long numtransultentet) {
        this.numtransultentet = numtransultentet;
    }

    public Long getNumtransultented() {
        return numtransultented;
    }

    public void setNumtransultented(Long numtransultented) {
        this.numtransultented = numtransultented;
    }

    public BigDecimal getAliqicms1() {
        return aliqicms1;
    }

    public void setAliqicms1(BigDecimal aliqicms1) {
        this.aliqicms1 = aliqicms1;
    }

    public Long getNumtransultentst() {
        return numtransultentst;
    }

    public void setNumtransultentst(Long numtransultentst) {
        this.numtransultentst = numtransultentst;
    }

    public String getEstbonific() {
        return estbonific;
    }

    public void setEstbonific(String estbonific) {
        this.estbonific = estbonific;
    }

    public BigDecimal getVlicmsbcr() {
        return vlicmsbcr;
    }

    public void setVlicmsbcr(BigDecimal vlicmsbcr) {
        this.vlicmsbcr = vlicmsbcr;
    }

    public BigDecimal getBaseicmsbcr() {
        return baseicmsbcr;
    }

    public void setBaseicmsbcr(BigDecimal baseicmsbcr) {
        this.baseicmsbcr = baseicmsbcr;
    }

    public String getTipocurva() {
        return tipocurva;
    }

    public void setTipocurva(String tipocurva) {
        this.tipocurva = tipocurva;
    }

    public String getCurva() {
        return curva;
    }

    public void setCurva(String curva) {
        this.curva = curva;
    }

    public String getSubcurva() {
        return subcurva;
    }

    public void setSubcurva(String subcurva) {
        this.subcurva = subcurva;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public Long getNumtransentultentbnf() {
        return numtransentultentbnf;
    }

    public void setNumtransentultentbnf(Long numtransentultentbnf) {
        this.numtransentultentbnf = numtransentultentbnf;
    }

    public BigDecimal getQtcrossdock() {
        return qtcrossdock;
    }

    public void setQtcrossdock(BigDecimal qtcrossdock) {
        this.qtcrossdock = qtcrossdock;
    }

    public BigDecimal getQtestoqueemterceiro() {
        return qtestoqueemterceiro;
    }

    public void setQtestoqueemterceiro(BigDecimal qtestoqueemterceiro) {
        this.qtestoqueemterceiro = qtestoqueemterceiro;
    }

    public BigDecimal getQtestoquedeterceiro() {
        return qtestoquedeterceiro;
    }

    public void setQtestoquedeterceiro(BigDecimal qtestoquedeterceiro) {
        this.qtestoquedeterceiro = qtestoquedeterceiro;
    }

    public BigDecimal getQttransitotv10() {
        return qttransitotv10;
    }

    public void setQttransitotv10(BigDecimal qttransitotv10) {
        this.qttransitotv10 = qttransitotv10;
    }

    public LocalDate getDthoraultsaida() {
        return dthoraultsaida;
    }

    public void setDthoraultsaida(LocalDate dthoraultsaida) {
        this.dthoraultsaida = dthoraultsaida;
    }

    public LocalDate getDthoraultaltdisp() {
        return dthoraultaltdisp;
    }

    public void setDthoraultaltdisp(LocalDate dthoraultaltdisp) {
        this.dthoraultaltdisp = dthoraultaltdisp;
    }

    public BigDecimal getQbcmonoret() {
        return qbcmonoret;
    }

    public void setQbcmonoret(BigDecimal qbcmonoret) {
        this.qbcmonoret = qbcmonoret;
    }

    public BigDecimal getAdremicmsret() {
        return adremicmsret;
    }

    public void setAdremicmsret(BigDecimal adremicmsret) {
        this.adremicmsret = adremicmsret;
    }

    public BigDecimal getVicmsmonoret() {
        return vicmsmonoret;
    }

    public void setVicmsmonoret(BigDecimal vicmsmonoret) {
        this.vicmsmonoret = vicmsmonoret;
    }

    public BigDecimal getCustoultentfiscal() {
        return custoultentfiscal;
    }

    public void setCustoultentfiscal(BigDecimal custoultentfiscal) {
        this.custoultentfiscal = custoultentfiscal;
    }

    public BigDecimal getCustofiscal() {
        return custofiscal;
    }

    public void setCustofiscal(BigDecimal custofiscal) {
        this.custofiscal = custofiscal;
    }

    public BigDecimal getVlipisuspensoultent() {
        return vlipisuspensoultent;
    }

    public void setVlipisuspensoultent(BigDecimal vlipisuspensoultent) {
        this.vlipisuspensoultent = vlipisuspensoultent;
    }

    public BigDecimal getVliisuspensoultent() {
        return vliisuspensoultent;
    }

    public void setVliisuspensoultent(BigDecimal vliisuspensoultent) {
        this.vliisuspensoultent = vliisuspensoultent;
    }

    public BigDecimal getPliqultent() {
        return pliqultent;
    }

    public void setPliqultent(BigDecimal pliqultent) {
        this.pliqultent = pliqultent;
    }

    public BigDecimal getPericmsantecipadoultent() {
        return pericmsantecipadoultent;
    }

    public void setPericmsantecipadoultent(BigDecimal pericmsantecipadoultent) {
        this.pericmsantecipadoultent = pericmsantecipadoultent;
    }

    public BigDecimal getPericmultent() {
        return pericmultent;
    }

    public void setPericmultent(BigDecimal pericmultent) {
        this.pericmultent = pericmultent;
    }

    public BigDecimal getNumero() {
        return numero;
    }

    public void setNumero(BigDecimal numero) {
        this.numero = numero;
    }

    public BigDecimal getNumerocx() {
        return numerocx;
    }

    public void setNumerocx(BigDecimal numerocx) {
        this.numerocx = numerocx;
    }

}