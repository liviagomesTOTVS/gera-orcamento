package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PCMOV")
public class Pcmov {
    @Column(name = "DTMOV")
    private LocalDate dtmov;

    @Column(name = "CODPROD", nullable = false)
    private Integer codprod;

    @Column(name = "NUMNOTA")
    private Long numnota;

    @Column(name = "CODOPER", nullable = false, length = 2)
    private String codoper;

    @Column(name = "QT", precision = 20, scale = 6)
    private BigDecimal qt;

    @Column(name = "PUNIT", precision = 18, scale = 6)
    private BigDecimal punit;

    @Column(name = "CODFILIAL", nullable = false, length = 2)
    private String codfilial;

    @Column(name = "STATUS", nullable = false, length = 2)
    private String status;

    @Column(name = "CODCLI")
    private Integer codcli;

    @Column(name = "CODUSUR")
    private Integer codusur;

    @Column(name = "CUSTOFIN", precision = 18, scale = 6)
    private BigDecimal custofin;

    @Column(name = "NUMCAR")
    private Integer numcar;

    @Column(name = "NUMPED")
    private Long numped;

    @Column(name = "PTABELA", precision = 18, scale = 6)
    private BigDecimal ptabela;

    @Column(name = "NUMREGIAO")
    private Short numregiao;

    @Column(name = "CUSTOCONT", precision = 18, scale = 6)
    private BigDecimal custocont;

    @Column(name = "ST", precision = 18, scale = 6)
    private BigDecimal st;

    @Column(name = "SITTRIBUT", length = 3)
    private String sittribut;

    @Column(name = "BASEICMS", precision = 18, scale = 6)
    private BigDecimal baseicms;

    @Column(name = "BASEICST", precision = 18, scale = 6)
    private BigDecimal baseicst;

    @Column(name = "ALIQICST", precision = 4, scale = 2)
    private BigDecimal aliqicst;

    @Column(name = "QTCONT", precision = 20, scale = 6)
    private BigDecimal qtcont;

    @Column(name = "PUNITCONT", precision = 18, scale = 6)
    private BigDecimal punitcont;

    @Column(name = "CUSTOREAL", precision = 18, scale = 6)
    private BigDecimal custoreal;

    @Column(name = "NUMNOTADEV")
    private Long numnotadev;

    @Column(name = "NUMTRANSVENDA")
    private Long numtransvenda;

    @Column(name = "CODEPTO")
    private Integer codepto;

    @Column(name = "CODSEC")
    private Integer codsec;

    @Column(name = "VLFRETE", precision = 18, scale = 6)
    private BigDecimal vlfrete;

    @Column(name = "VLOUTROS", precision = 18, scale = 6)
    private BigDecimal vloutros;

    @Column(name = "CUSTOCONTANT", precision = 18, scale = 6)
    private BigDecimal custocontant;

    @Column(name = "CUSTOREALANT", precision = 18, scale = 6)
    private BigDecimal custorealant;

    @Column(name = "CUSTOFINANT", precision = 18, scale = 6)
    private BigDecimal custofinant;

    @Column(name = "NUMBONUS")
    private Long numbonus;

    @Column(name = "NUMTRANSENT")
    private Long numtransent;

    @Column(name = "CODFORNEC")
    private Integer codfornec;

    @Column(name = "CODPLPAG")
    private Short codplpag;

    @Column(name = "PERCIPI", precision = 12, scale = 4)
    private BigDecimal percipi;

    @Column(name = "PERCICM", precision = 12, scale = 4)
    private BigDecimal percicm;

    @Column(name = "PERCST", precision = 12, scale = 4)
    private BigDecimal percst;

    @Column(name = "PERCBON", precision = 12, scale = 4)
    private BigDecimal percbon;

    @Column(name = "PERCFRETE", precision = 12, scale = 4)
    private BigDecimal percfrete;

    @Column(name = "PERCDESC", precision = 18, scale = 6)
    private BigDecimal percdesc;

    @Column(name = "NUMTRANSDEV")
    private Long numtransdev;

    @Column(name = "CUSTOULTENTANT", precision = 18, scale = 6)
    private BigDecimal custoultentant;

    @Column(name = "VALORULTENTANT", precision = 18, scale = 6)
    private BigDecimal valorultentant;

    @Column(name = "CUSTOULTENT", precision = 18, scale = 6)
    private BigDecimal custoultent;

    @Column(name = "VALORULTENT", precision = 18, scale = 6)
    private BigDecimal valorultent;

    @Column(name = "QTESTGERANT", precision = 16, scale = 3)
    private BigDecimal qtestgerant;

    @Column(name = "QTESTANT", precision = 16, scale = 3)
    private BigDecimal qtestant;

    @Column(name = "QTSALDOESTGER", precision = 16, scale = 3)
    private BigDecimal qtsaldoestger;

    @Column(name = "QTSALDOEST", precision = 16, scale = 3)
    private BigDecimal qtsaldoest;

    @Column(name = "VLBASEIPI", precision = 18, scale = 6)
    private BigDecimal vlbaseipi;

    @Column(name = "VLIPI", precision = 18, scale = 6)
    private BigDecimal vlipi;

    @Column(name = "CODMOTORISTA")
    private Integer codmotorista;

    @Column(name = "PERICMSANTECIPADO", precision = 12, scale = 4)
    private BigDecimal pericmsantecipado;

    @Column(name = "NUMLANCCP")
    private Integer numlanccp;

    @Column(name = "CODFISCAL")
    private Integer codfiscal;

    @Column(name = "CODST")
    private Short codst;

    @Column(name = "PUNITNF", precision = 18, scale = 6)
    private BigDecimal punitnf;

    @Column(name = "PERCOM", precision = 8, scale = 4)
    private BigDecimal percom;

    @Column(name = "CODFILIALNF", length = 2)
    private String codfilialnf;

    @Column(name = "VLDESCONTO", precision = 18, scale = 6)
    private BigDecimal vldesconto;

    @Column(name = "CODDEVOL")
    private Short coddevol;

    @Column(name = "ESTOQUEDESBLOQUEADO", length = 1)
    private String estoquedesbloqueado;

    @Column(name = "VLBONIFIC", precision = 18, scale = 6)
    private BigDecimal vlbonific;

    @Column(name = "PERCDESPADICIONAL", precision = 12, scale = 4)
    private BigDecimal percdespadicional;

    @Column(name = "PERCDESPFIN", precision = 12, scale = 4)
    private BigDecimal percdespfin;

    @Column(name = "PERCFRETEFOB", precision = 12, scale = 4)
    private BigDecimal percfretefob;

    @Column(name = "PERCOUTRASDESP", precision = 12, scale = 4)
    private BigDecimal percoutrasdesp;

    @Column(name = "VLOUTRASDESP", precision = 18, scale = 6)
    private BigDecimal vloutrasdesp;

    @Column(name = "PERCDESCFIN", precision = 12, scale = 4)
    private BigDecimal percdescfin;

    @Column(name = "VLDESCCUSTOCMV", precision = 12, scale = 4)
    private BigDecimal vldesccustocmv;

    @Column(name = "PERCIVA", precision = 12, scale = 4)
    private BigDecimal perciva;

    @Column(name = "PERCINTEIRO", precision = 6, scale = 3)
    private BigDecimal percinteiro;

    @Column(name = "PERCQUEBRADO", precision = 6, scale = 3)
    private BigDecimal percquebrado;

    @Column(name = "PERCIMPUREZA", precision = 6, scale = 3)
    private BigDecimal percimpureza;

    @Column(name = "PERCVERMELHO", precision = 6, scale = 3)
    private BigDecimal percvermelho;

    @Column(name = "PERCUMIDADE", precision = 6, scale = 3)
    private BigDecimal percumidade;

    @Column(name = "NUMBONO")
    private Integer numbono;

    @Column(name = "PERCICMRED", precision = 12, scale = 4)
    private BigDecimal percicmred;

    @Column(name = "QTVENDAEMB", precision = 12, scale = 3)
    private BigDecimal qtvendaemb;

    @Column(name = "PVENDAEMB", precision = 12, scale = 3)
    private BigDecimal pvendaemb;

    @Column(name = "NUMSEQ")
    private Long numseq;

    @Column(name = "QTEMBALAGEM", precision = 12, scale = 3)
    private BigDecimal qtembalagem;

    @Column(name = "PVENDAEMBALAGEM", precision = 18, scale = 6)
    private BigDecimal pvendaembalagem;

    @Column(name = "CUSTOREP", precision = 18, scale = 6)
    private BigDecimal custorep;

    @Column(name = "NUMIDF", length = 30)
    private String numidf;

    @Column(name = "NUMFORMULARIO")
    private Long numformulario;

    @Column(name = "CODCERTIFIC")
    private Integer codcertific;

    @Column(name = "CODAUXILIAR")
    private Long codauxiliar;

    @Column(name = "DTCANCEL")
    private LocalDate dtcancel;

    @Column(name = "DTMOVLOG")
    private LocalDate dtmovlog;

    @Column(name = "CODPRODPRINC")
    private Integer codprodprinc;

    @Column(name = "PERPIS", precision = 12, scale = 4)
    private BigDecimal perpis;

    @Column(name = "VLCREDPIS", precision = 18, scale = 6)
    private BigDecimal vlcredpis;

    @Column(name = "VLCREDICMS", precision = 18, scale = 6)
    private BigDecimal vlcredicms;

    @Column(name = "PERICMFRETE", precision = 6, scale = 2)
    private BigDecimal pericmfrete;

    @Column(name = "VLCREDICMSFRETE", precision = 18, scale = 6)
    private BigDecimal vlcredicmsfrete;

    @Column(name = "QTULTENTANT", precision = 16, scale = 3)
    private BigDecimal qtultentant;

    @Column(name = "DTULTENTANT")
    private LocalDate dtultentant;

    @Column(name = "CUSTOULTENTMED", precision = 18, scale = 6)
    private BigDecimal custoultentmed;

    @Column(name = "VALORULTENTMED", precision = 18, scale = 6)
    private BigDecimal valorultentmed;

    @Column(name = "CUSTOULTENTMEDANT", precision = 18, scale = 6)
    private BigDecimal custoultentmedant;

    @Column(name = "VALORULTENTMEDANT", precision = 18, scale = 6)
    private BigDecimal valorultentmedant;

    @Column(name = "PTABELA2", precision = 18, scale = 6)
    private BigDecimal ptabela2;

    @Column(name = "QTAVARIA", precision = 20, scale = 6)
    private BigDecimal qtavaria;

    @Column(name = "HORAPRODUCAO")
    private LocalDate horaproducao;

    @Column(name = "VLDESCSUFRAMA", precision = 18, scale = 6)
    private BigDecimal vldescsuframa;

    @Column(name = "PERCOUTROSCUSTOS", precision = 12, scale = 4)
    private BigDecimal percoutroscustos;

    @Column(name = "CODFUNCREQ")
    private Integer codfuncreq;

    @Column(name = "DATAFABRICACAO")
    private LocalDate datafabricacao;

    @Column(name = "DATAVALIDADE")
    private LocalDate datavalidade;

    @Column(name = "REFCOR", length = 20)
    private String refcor;

    @Column(name = "CODFUNCLANC")
    private Integer codfunclanc;

    @Column(name = "DATALIBQUARENTENA")
    private LocalDate datalibquarentena;

    @Column(name = "CODFUNCQUARENTENA")
    private Integer codfuncquarentena;

    @Column(name = "QTHORAS", precision = 6, scale = 2)
    private BigDecimal qthoras;

    @Column(name = "QTDEVOL", precision = 20, scale = 6)
    private BigDecimal qtdevol;

    @Column(name = "VLDESCICMISENCAO", precision = 18, scale = 6)
    private BigDecimal vldescicmisencao;

    @Column(name = "NUMLOTE", length = 15)
    private String numlote;

    @Column(name = "NUMOP")
    private Integer numop;

    @Column(name = "NUMTRANSOP")
    private Long numtransop;

    @Column(name = "CUSTOREALSEMSTANT", precision = 18, scale = 6)
    private BigDecimal custorealsemstant;

    @Column(name = "CUSTOREALSEMST", precision = 18, scale = 6)
    private BigDecimal custorealsemst;

    @Column(name = "VLINDENIZ", precision = 18, scale = 6)
    private BigDecimal vlindeniz;

    @Column(name = "PERCSUFRAMA", precision = 12, scale = 4)
    private BigDecimal percsuframa;

    @Column(name = "VLSUFRAMA", precision = 18, scale = 6)
    private BigDecimal vlsuframa;

    @Column(name = "TIPOTIS", length = 1)
    private String tipotis;

    @Column(name = "ALIQUOTATIS", precision = 5, scale = 2)
    private BigDecimal aliquotatis;

    @Column(name = "INDLOCAL", length = 1)
    private String indlocal;

    @Column(name = "PERICMGUIAPROPRIA", precision = 5, scale = 2)
    private BigDecimal pericmguiapropria;

    @Column(name = "CUSTOREPANT", precision = 18, scale = 6)
    private BigDecimal custorepant;

    @Column(name = "PERCICMCP", precision = 10, scale = 2)
    private BigDecimal percicmcp;

    @Column(name = "NUMTRANSAVULSA")
    private Long numtransavulsa;

    @Column(name = "IVA", precision = 8, scale = 4)
    private BigDecimal iva;

    @Column(name = "ALIQICMS1", precision = 12, scale = 4)
    private BigDecimal aliqicms1;

    @Column(name = "ALIQICMS2", precision = 12, scale = 4)
    private BigDecimal aliqicms2;

    @Column(name = "PAUTA", precision = 18, scale = 6)
    private BigDecimal pauta;

    @Column(name = "PERCBASERED", precision = 8, scale = 4)
    private BigDecimal percbasered;

    @Column(name = "VLDESCCOM", precision = 18, scale = 6)
    private BigDecimal vldesccom;

    @Column(name = "PERDESCCOM", precision = 12, scale = 4)
    private BigDecimal perdesccom;

    @Column(name = "VLDESCFIN", precision = 18, scale = 6)
    private BigDecimal vldescfin;

    @Column(name = "PERDESCFIN", precision = 12, scale = 4)
    private BigDecimal perdescfin;

    @Column(name = "PERBONIFIC", precision = 12, scale = 4)
    private BigDecimal perbonific;

    @Column(name = "HORALANC", length = 2)
    private String horalanc;

    @Column(name = "MINUTOLANC", length = 2)
    private String minutolanc;

    @Column(name = "ROTINALANC", length = 48)
    private String rotinalanc;

    @Column(name = "EQUIPLANC", length = 64)
    private String equiplanc;

    @Column(name = "FUNCLANC", length = 30)
    private String funclanc;

    @Column(name = "PERFRETECMV", precision = 8, scale = 4)
    private BigDecimal perfretecmv;

    @Column(name = "VLDESCRODAPE", precision = 18, scale = 6)
    private BigDecimal vldescrodape;

    @Column(name = "STCLIENTEGNRE", precision = 18, scale = 6)
    private BigDecimal stclientegnre;

    @Column(name = "COMPLEMENTO", length = 40)
    private String complemento;

    @Column(name = "CUSTOFINEST", precision = 18, scale = 6)
    private BigDecimal custofinest;

    @Column(name = "PERCBASEREDSTFONTE", precision = 8, scale = 4)
    private BigDecimal percbaseredstfonte;

    @Column(name = "PERCBASEREDST", precision = 8, scale = 4)
    private BigDecimal percbaseredst;

    @Column(name = "PERDESCCUSTO", precision = 8, scale = 4)
    private BigDecimal perdesccusto;

    @Column(name = "CODICMTAB", precision = 8, scale = 4)
    private BigDecimal codicmtab;

    @Column(name = "TXVENDA", precision = 8, scale = 6)
    private BigDecimal txvenda;

    @Column(name = "NUMFORMULARIO2")
    private Long numformulario2;

    @Column(name = "PERCOM2", precision = 8, scale = 4)
    private BigDecimal percom2;

    @Column(name = "PERCOM3", precision = 8, scale = 4)
    private BigDecimal percom3;

    @Column(name = "PERCISS", precision = 8, scale = 4)
    private BigDecimal perciss;

    @Column(name = "VLISS", precision = 18, scale = 6)
    private BigDecimal vliss;

    @Column(name = "PERCCREDICMPRESUMIDO", precision = 8, scale = 4)
    private BigDecimal perccredicmpresumido;

    @Column(name = "CUSTOULTENTFIN", precision = 18, scale = 6)
    private BigDecimal custoultentfin;

    @Column(name = "CUSTOULTENTFINANT", precision = 18, scale = 6)
    private BigDecimal custoultentfinant;

    @Column(name = "BASEBCR", precision = 18, scale = 6)
    private BigDecimal basebcr;

    @Column(name = "STBCR", precision = 18, scale = 6)
    private BigDecimal stbcr;

    @Column(name = "CODPROMOCAO", length = 10)
    private String codpromocao;

    @Column(name = "PRAZOMEDIO")
    private Short prazomedio;

    @Column(name = "LOCALIZACAO", length = 40)
    private String localizacao;

    @Column(name = "VLCREDPRESUMIDO", precision = 18, scale = 6)
    private BigDecimal vlcredpresumido;

    @Column(name = "VLREPASSE", precision = 18, scale = 6)
    private BigDecimal vlrepasse;

    @Column(name = "PBONIFIC", precision = 18, scale = 6)
    private BigDecimal pbonific;

    @Column(name = "PERCVENDA", precision = 5, scale = 2)
    private BigDecimal percvenda;

    @Column(name = "NUMTRANSENTULTENT")
    private Long numtransentultent;

    @Column(name = "NUMTRANSENTULTENTANT")
    private Long numtransentultentant;

    @Column(name = "PERCIVA2", precision = 12, scale = 4)
    private BigDecimal perciva2;

    @Column(name = "PERCALIQINT2", precision = 12, scale = 4)
    private BigDecimal percaliqint2;

    @Column(name = "VLPAUTA2", precision = 12, scale = 4)
    private BigDecimal vlpauta2;

    @Column(name = "PERCALIQEXT2", precision = 12, scale = 4)
    private BigDecimal percaliqext2;

    @Column(name = "VLBASEGNRE", precision = 20, scale = 6)
    private BigDecimal vlbasegnre;

    @Column(name = "VLDESCPISSUFRAMA", precision = 18, scale = 6)
    private BigDecimal vldescpissuframa;

    @Column(name = "QTBLOQUEADA", precision = 20, scale = 6)
    private BigDecimal qtbloqueada;

    @Column(name = "BRINDE", length = 1)
    private String brinde;

    @Column(name = "ITEMDIVERGENTE", length = 1)
    private String itemdivergente;

    @Column(name = "PVENDABASE", precision = 18, scale = 6)
    private BigDecimal pvendabase;

    @Column(name = "QUALDIVERGENCIA", length = 6)
    private String qualdivergencia;

    @Column(name = "CUSTOULTENTANT2", precision = 18, scale = 6)
    private BigDecimal custoultentant2;

    @Column(name = "PRODBONIFICADO", length = 1)
    private String prodbonificado;

    @Column(name = "PERCMEXIVA", precision = 10, scale = 6)
    private BigDecimal percmexiva;

    @Column(name = "PERCMEXIEPS", precision = 10, scale = 6)
    private BigDecimal percmexieps;

    @Column(name = "PERCMEXFPGC", precision = 10, scale = 6)
    private BigDecimal percmexfpgc;

    @Column(name = "VLMEXIVA", precision = 10, scale = 6)
    private BigDecimal vlmexiva;

    @Column(name = "VLMEXIEPS", precision = 10, scale = 6)
    private BigDecimal vlmexieps;

    @Column(name = "VLMEXFPGC", precision = 10, scale = 6)
    private BigDecimal vlmexfpgc;

    @Column(name = "VLADICIONALBCST", precision = 18, scale = 6)
    private BigDecimal vladicionalbcst;

    @Column(name = "PERDESCFLEX", precision = 18, scale = 6)
    private BigDecimal perdescflex;

    @Column(name = "VLDESCFLEX", precision = 18, scale = 6)
    private BigDecimal vldescflex;

    @Column(name = "PERREDCOMISS", precision = 18, scale = 6)
    private BigDecimal perredcomiss;

    @Column(name = "VLREDCOMISS", precision = 18, scale = 6)
    private BigDecimal vlredcomiss;

    @Column(name = "TIPODESCAPLICADO", length = 2)
    private String tipodescaplicado;

    @Column(name = "PBASERCA", precision = 18, scale = 6)
    private BigDecimal pbaserca;

    @Column(name = "PESOBRUTO", precision = 18, scale = 6)
    private BigDecimal pesobruto;

    @Column(name = "VLFRETEPORKG", precision = 18, scale = 6)
    private BigDecimal vlfreteporkg;

    @Column(name = "VLFRETECONHEC", precision = 18, scale = 6)
    private BigDecimal vlfreteconhec;

    @Column(name = "VLVERBACMV", precision = 18, scale = 6)
    private BigDecimal vlverbacmv;

    @Column(name = "NUMVERBAREBCMV")
    private Integer numverbarebcmv;

    @Column(name = "CODEQUIPAMENTO")
    private Long codequipamento;

    @Column(name = "BASEICMSBCR", precision = 18, scale = 6)
    private BigDecimal baseicmsbcr;

    @Column(name = "VLICMSBCR", precision = 18, scale = 6)
    private BigDecimal vlicmsbcr;

    @Column(name = "PERCOMSUP", precision = 8, scale = 4)
    private BigDecimal percomsup;

    @Column(name = "PERREDCOMISSSUP", precision = 18, scale = 6)
    private BigDecimal perredcomisssup;

    @Column(name = "VLREDCOMISSSUP", precision = 18, scale = 6)
    private BigDecimal vlredcomisssup;

    @Column(name = "PERCICM2", precision = 10, scale = 2)
    private BigDecimal percicm2;

    @Column(name = "ALIQSTSAIDA", precision = 8, scale = 4)
    private BigDecimal aliqstsaida;

    @Column(name = "BASESTSAIDA", precision = 18, scale = 6)
    private BigDecimal basestsaida;

    @Column(name = "STSAIDA", precision = 18, scale = 6)
    private BigDecimal stsaida;

    @Column(name = "QTCX", precision = 14, scale = 6)
    private BigDecimal qtcx;

    @Column(name = "QTPECAS", precision = 14, scale = 6)
    private BigDecimal qtpecas;

    @Column(name = "CODECF", length = 4)
    private String codecf;

    @Column(name = "PERCIVAMEX", precision = 8, scale = 4)
    private BigDecimal percivamex;

    @Column(name = "BASEIVAMEX", precision = 18, scale = 6)
    private BigDecimal baseivamex;

    @Column(name = "VLIVAMEX", precision = 18, scale = 6)
    private BigDecimal vlivamex;

    @Column(name = "BASEICMS2", precision = 18, scale = 6)
    private BigDecimal baseicms2;

    @Column(name = "NUMSEQPED")
    private Integer numseqped;

    @Column(name = "PERACRESCIMOPF", precision = 8, scale = 4)
    private BigDecimal peracrescimopf;

    @Column(name = "BASEACRESCIMOPF", precision = 18, scale = 6)
    private BigDecimal baseacrescimopf;

    @Column(name = "VLACRESCIMOPF", precision = 18, scale = 6)
    private BigDecimal vlacrescimopf;

    @Column(name = "REDBASEIVA", precision = 18, scale = 6)
    private BigDecimal redbaseiva;

    @Column(name = "REDBASEALIQEXT", precision = 18, scale = 6)
    private BigDecimal redbasealiqext;

    @Column(name = "NUMNEGOCIACAO")
    private Long numnegociacao;

    @Column(name = "CODFILIALRETIRA", length = 2)
    private String codfilialretira;

    @Column(name = "NUMVERBAOUTRAS")
    private Integer numverbaoutras;

    @Column(name = "PERCBONOUTRAS", precision = 14, scale = 4)
    private BigDecimal percbonoutras;

    @Column(name = "VLBONIFICOUTRAS", precision = 18, scale = 6)
    private BigDecimal vlbonificoutras;

    @Column(name = "PERCIMPORTACAO", precision = 8, scale = 2)
    private BigDecimal percimportacao;

    @Column(name = "VLSISCOMEX", precision = 18, scale = 6)
    private BigDecimal vlsiscomex;

    @Column(name = "VLADUANEIRA", precision = 18, scale = 6)
    private BigDecimal vladuaneira;

    @Column(name = "VLIMPORTACAO", precision = 18, scale = 6)
    private BigDecimal vlimportacao;

    @Column(name = "PERCOFINS", precision = 12, scale = 4)
    private BigDecimal percofins;

    @Column(name = "VLCREDCOFINS", precision = 18, scale = 6)
    private BigDecimal vlcredcofins;

    @Column(name = "VLOUTRASDESPIMP", precision = 18, scale = 6)
    private BigDecimal vloutrasdespimp;

    @Column(name = "VLACRESCRODAPE", precision = 18, scale = 6)
    private BigDecimal vlacrescrodape;

    @Column(name = "VLPIS", precision = 18, scale = 6)
    private BigDecimal vlpis;

    @Column(name = "NUMTRANSDEVFOR")
    private Long numtransdevfor;

    @Column(name = "PERDESCISENTOICMS", precision = 4, scale = 2)
    private BigDecimal perdescisentoicms;

    @Column(name = "PLIQPED", precision = 18, scale = 6)
    private BigDecimal pliqped;

    @Column(name = "PROMOCAOBIRO", length = 1)
    private String promocaobiro;

    @Column(name = "CODFISCALOUTRASDESPENT")
    private Short codfiscaloutrasdespent;

    @Column(name = "ALIQICMOUTRASDESPENT", precision = 4, scale = 2)
    private BigDecimal aliqicmoutrasdespent;

    @Column(name = "CODFISCALFRETEENT")
    private Short codfiscalfreteent;

    @Column(name = "ALIQICMFRETEENT", precision = 4, scale = 2)
    private BigDecimal aliqicmfreteent;

    @Column(name = "FATORCUSTONATRANSF", precision = 18, scale = 6)
    private BigDecimal fatorcustonatransf;

    @Column(name = "TIPOITEM", length = 1)
    private String tipoitem;

    @Column(name = "VLBASESTFORANF", precision = 18, scale = 6)
    private BigDecimal vlbasestforanf;

    @Column(name = "VLDESPADICIONAL", precision = 18, scale = 6)
    private BigDecimal vldespadicional;

    @Column(name = "PVENDA1", precision = 18, scale = 6)
    private BigDecimal pvenda1;

    @Column(name = "PERCAGREGADORST", precision = 8, scale = 4)
    private BigDecimal percagregadorst;

    @Column(name = "PRECOPAUTA", precision = 18, scale = 6)
    private BigDecimal precopauta;

    @Column(name = "PERCBASEREDADICIONAL", precision = 18, scale = 6)
    private BigDecimal percbaseredadicional;

    @Column(name = "BASEICMSADICIONAL", precision = 18, scale = 6)
    private BigDecimal baseicmsadicional;

    @Column(name = "VLVERBACMVCLI", precision = 18, scale = 6)
    private BigDecimal vlverbacmvcli;

    @Column(name = "PERCICMORIGINAL", precision = 10, scale = 2)
    private BigDecimal percicmoriginal;

    @Column(name = "VLPERCBON", precision = 18, scale = 6)
    private BigDecimal vlpercbon;

    @Column(name = "PERCVLBONIFIC", precision = 12, scale = 4)
    private BigDecimal percvlbonific;

    @Column(name = "APROVEITACREDICMS", length = 1)
    private String aproveitacredicms;

    @Column(name = "DTEXPORTACAOSERVINT")
    private LocalDate dtexportacaoservint;

    @Column(name = "EXPORTADOSERVINT", length = 1)
    private String exportadoservint;

    @Column(name = "IMPORTADOSERVPRINC", length = 1)
    private String importadoservprinc;

    @Column(name = "DTIMPORTACAOSERVPRINC")
    private LocalDate dtimportacaoservprinc;

    @Column(name = "CODVASILHAME")
    private Integer codvasilhame;

    @Column(name = "APROVEITACREDPISCOFINS", length = 1)
    private String aproveitacredpiscofins;

    @Column(name = "VLULTENTCONTSEMST", precision = 18, scale = 6)
    private BigDecimal vlultentcontsemst;

    @Column(name = "VLULTENTCONTSEMSTANT", precision = 18, scale = 6)
    private BigDecimal vlultentcontsemstant;

    @Column(name = "TRUNCARITEM", length = 1)
    private String truncaritem;

    @Column(name = "VLBASEPISCOFINS", precision = 20, scale = 6)
    private BigDecimal vlbasepiscofins;

    @Column(name = "QTCONF", precision = 20, scale = 6)
    private BigDecimal qtconf;

    @Column(name = "DTINICIOCONF")
    private LocalDate dtinicioconf;

    @Column(name = "DTFIMCONF")
    private LocalDate dtfimconf;

    @Column(name = "CODFUNCCONF")
    private Integer codfuncconf;

    @Column(name = "CODFUNCEMBAL")
    private Integer codfuncembal;

    @Column(name = "QTUNITEMB", precision = 18, scale = 6)
    private BigDecimal qtunitemb;

    @Column(name = "VLFRETE_RATEIO", precision = 18, scale = 6)
    private BigDecimal vlfreteRateio;

    @Column(name = "VLOUTRAS_RATEIO", precision = 18, scale = 6)
    private BigDecimal vloutrasRateio;

    @Column(name = "NUMLOTEFAB", length = 20)
    private String numlotefab;

    @Column(name = "GERAICMSLIVROFISCAL", length = 1)
    private String geraicmslivrofiscal;

    @Column(name = "TRGPCLOTE", length = 1)
    private String trgpclote;

    @Column(name = "DESCRICAO", length = 40)
    private String descricao;

    @Column(name = "PERICM", precision = 12, scale = 4)
    private BigDecimal pericm;

    @Column(name = "ALIQICMSVIGENTE", precision = 5, scale = 2)
    private BigDecimal aliqicmsvigente;

    @Column(name = "UNIDADE", length = 2)
    private String unidade;

    @Column(name = "TIPOMERCDEPTO", length = 2)
    private String tipomercdepto;

    @Column(name = "NBM", length = 15)
    private String nbm;

    @Column(name = "DV")
    private Boolean dv;

    @Column(name = "IVATRIBUT", precision = 8, scale = 4)
    private BigDecimal ivatribut;

    @Column(name = "CODPRODSINTEGRA", length = 20)
    private String codprodsintegra;

    @Column(name = "IMPORTADO", length = 1)
    private String importado;

    @Column(name = "EMBALAGEM", length = 12)
    private String embalagem;

    @Column(name = "CLASSIFICFISCAL", length = 20)
    private String classificfiscal;

    @Column(name = "PESOLIQ", precision = 12, scale = 6)
    private BigDecimal pesoliq;

    @Column(name = "RUA")
    private Short rua;

    @Column(name = "UFFORNEC", length = 2)
    private String uffornec;

    @Column(name = "HISTORICO", length = 1)
    private String historico;

    @Column(name = "PISCOFINSRETIDO", length = 1)
    private String piscofinsretido;

    @Column(name = "PERCICMSFRETEFOBST", precision = 12, scale = 4)
    private BigDecimal percicmsfretefobst;

    @Column(name = "DTAPURACAO")
    private LocalDate dtapuracao;

    @Column(name = "DTEXPORTACAOWMS")
    private LocalDate dtexportacaowms;

    @Column(name = "CODFUNCEXPORTACAOWMS")
    private Integer codfuncexportacaowms;

    @Column(name = "DTIMPORTACAOWMS")
    private LocalDate dtimportacaowms;

    @Column(name = "CODFUNCIMPORTACAOWMS")
    private Integer codfuncimportacaowms;

    @Column(name = "PRODDESCRICAOCONTRATO", length = 300)
    private String proddescricaocontrato;

    @Column(name = "PERCDIREITOSADUANEIROS", precision = 8, scale = 4)
    private BigDecimal percdireitosaduaneiros;

    @Column(name = "PERCIMPOSTOCONSUMO", precision = 8, scale = 4)
    private BigDecimal percimpostoconsumo;

    @Column(name = "PERCIMPOSTOSELO", precision = 8, scale = 4)
    private BigDecimal percimpostoselo;

    @Column(name = "VALORDIREITOSADUANEIROS", precision = 18, scale = 6)
    private BigDecimal valordireitosaduaneiros;

    @Column(name = "VALORIMPOSTOCONSUMO", precision = 18, scale = 6)
    private BigDecimal valorimpostoconsumo;

    @Column(name = "VALORIMPOSTOSELO", precision = 18, scale = 6)
    private BigDecimal valorimpostoselo;

    @Column(name = "VLIPIPORKG", precision = 18, scale = 6)
    private BigDecimal vlipiporkg;

    @Column(name = "PERCREDICMS", precision = 12, scale = 4)
    private BigDecimal percredicms;

    @Column(name = "VLDIFALIQUOTAS", precision = 18, scale = 6)
    private BigDecimal vldifaliquotas;

    @Column(name = "BASEDIFALIQUOTAS", precision = 18, scale = 6)
    private BigDecimal basedifaliquotas;

    @Column(name = "PERCDIFALIQUOTAS", precision = 8, scale = 4)
    private BigDecimal percdifaliquotas;

    @Column(name = "GERAGNRE_CNPJCLIENTE", length = 1)
    private String geragnreCnpjcliente;

    @Column(name = "PERCIMPPRODUTORURAL", precision = 12, scale = 2)
    private BigDecimal percimpprodutorural;

    @Column(name = "PERCICMSDIFERIDO", precision = 8, scale = 4)
    private BigDecimal percicmsdiferido;

    @Column(name = "VLICMSDIFERIDO", precision = 14, scale = 4)
    private BigDecimal vlicmsdiferido;

    @Column(name = "NUMCARANTERIOR")
    private Integer numcaranterior;

    @Column(name = "VLCOFINS", precision = 24, scale = 6)
    private BigDecimal vlcofins;

    @Column(name = "PERCDESCPIS", precision = 12, scale = 4)
    private BigDecimal percdescpis;

    @Column(name = "PERCDESCCOFINS", precision = 12, scale = 4)
    private BigDecimal percdesccofins;

    @Column(name = "VLDESCREDUCAOPIS", precision = 24, scale = 6)
    private BigDecimal vldescreducaopis;

    @Column(name = "VLDESCREDUCAOCOFINS", precision = 24, scale = 6)
    private BigDecimal vldescreducaocofins;

    @Column(name = "PERCOM4", precision = 8, scale = 4)
    private BigDecimal percom4;

    @Column(name = "TIPOFORNEC", length = 1)
    private String tipofornec;

    @Column(name = "VOLUME", precision = 20, scale = 8)
    private BigDecimal volume;

    @Column(name = "DESCRICAO1", length = 45)
    private String descricao1;

    @Column(name = "IVARESSARC", precision = 10, scale = 2)
    private BigDecimal ivaressarc;

    @Column(name = "ICMSRESSARC", precision = 10, scale = 2)
    private BigDecimal icmsressarc;

    @Column(name = "CALCCREDIPI", length = 1)
    private String calccredipi;

    @Column(name = "ALIQAVULSADARE", precision = 5, scale = 2)
    private BigDecimal aliqavulsadare;

    @Column(name = "VLPAUTAICMSANTEC", precision = 18, scale = 6)
    private BigDecimal vlpautaicmsantec;

    @Column(name = "PERCIVAICMANTECIP", precision = 12, scale = 4)
    private BigDecimal percivaicmantecip;

    @Column(name = "PERCALIQINTICMANTECIP", precision = 12, scale = 4)
    private BigDecimal percaliqinticmantecip;

    @Column(name = "PERCALIQEXTICMANTECIP", precision = 12, scale = 4)
    private BigDecimal percaliqexticmantecip;

    @Column(name = "TRIBFEDERAL", length = 15)
    private String tribfederal;

    @Column(name = "QTUNIT", precision = 6, scale = 2)
    private BigDecimal qtunit;

    @Column(name = "QTUNITCX", precision = 8, scale = 2)
    private BigDecimal qtunitcx;

    @Column(name = "CODPASSEFISCAL")
    private Integer codpassefiscal;

    @Column(name = "PASSELIVRE", length = 1)
    private String passelivre;

    @Column(name = "TIPOTRIBUTMEDIC", length = 2)
    private String tipotributmedic;

    @Column(name = "CODFORNECPROD")
    private Integer codfornecprod;

    @Column(name = "CODGENEROFISCAL")
    private Integer codgenerofiscal;

    @Column(name = "TIPOMERC", length = 2)
    private String tipomerc;

    @Column(name = "PERCINSS", precision = 8, scale = 4)
    private BigDecimal percinss;

    @Column(name = "VLINSS", precision = 18, scale = 6)
    private BigDecimal vlinss;

    @Column(name = "DTWMS")
    private LocalDate dtwms;

    @Column(name = "PERCOMFILIALBROKER", precision = 8, scale = 4)
    private BigDecimal percomfilialbroker;

    @Column(name = "PERCOMMOT", precision = 8, scale = 4)
    private BigDecimal percommot;

    @Column(name = "TRANSACAOTRANSFERIDA", length = 1)
    private String transacaotransferida;

    @Column(name = "PERCDESPFORANF", precision = 12, scale = 4)
    private BigDecimal percdespforanf;

    @Column(name = "VLDESPFORANF", precision = 18, scale = 6)
    private BigDecimal vldespforanf;

    @Column(name = "CUSTOFORNEC", precision = 18, scale = 6)
    private BigDecimal custofornec;

    @Column(name = "PERACRESCIMOCUSTO", precision = 8, scale = 4)
    private BigDecimal peracrescimocusto;

    @Column(name = "VLPAUTAICMS", precision = 18, scale = 6)
    private BigDecimal vlpautaicms;

    @Column(name = "BCISS", precision = 18, scale = 6)
    private BigDecimal bciss;

    @Column(name = "COMPRACONSIGNADO", length = 1)
    private String compraconsignado;

    @Column(name = "CONTROLANUMSERIE", length = 1)
    private String controlanumserie;

    @Column(name = "TIPOSEPARACAO", length = 1)
    private String tiposeparacao;

    @Column(name = "NUMVOLUMESCONFERENCIA")
    private Short numvolumesconferencia;

    @Column(name = "PERCSEGURO", precision = 12, scale = 4)
    private BigDecimal percseguro;

    @Column(name = "VLSEGURO", precision = 18, scale = 6)
    private BigDecimal vlseguro;

    @Column(name = "PERCDESPDENTRONF", precision = 12, scale = 4)
    private BigDecimal percdespdentronf;

    @Column(name = "VLDESPDENTRONF", precision = 18, scale = 6)
    private BigDecimal vldespdentronf;

    @Column(name = "NUMADICAO")
    private Short numadicao;

    @Column(name = "NUMSEQADICAO")
    private Short numseqadicao;

    @Column(name = "PAGTOGNRENOMEDOREMETENTE", length = 1)
    private String pagtognrenomedoremetente;

    @Column(name = "PERCIISUSPENSO", precision = 8, scale = 4)
    private BigDecimal perciisuspenso;

    @Column(name = "FUNDAPIANO", length = 1)
    private String fundapiano;

    @Column(name = "CUSTONFSEMST", precision = 18, scale = 6)
    private BigDecimal custonfsemst;

    @Column(name = "BASEICMSULTENT", precision = 18, scale = 6)
    private BigDecimal baseicmsultent;

    @Column(name = "CUSTONFSEMSTANT", precision = 18, scale = 6)
    private BigDecimal custonfsemstant;

    @Column(name = "BASEICMSULTENTANT", precision = 18, scale = 6)
    private BigDecimal baseicmsultentant;

    @Column(name = "PERCDESCICMSDIF", precision = 8, scale = 4)
    private BigDecimal percdescicmsdif;

    @Column(name = "VLDESCICMSDIF", precision = 18, scale = 6)
    private BigDecimal vldescicmsdif;

    @Column(name = "ALTERNATIVO", length = 10)
    private String alternativo;

    @Column(name = "SIGLAQUALIDADE", length = 10)
    private String siglaqualidade;

    @Column(name = "VOLUMEDESEJADO", precision = 12, scale = 4)
    private BigDecimal volumedesejado;

    @Column(name = "CODBASE", length = 40)
    private String codbase;

    @Column(name = "CODFORMULA", length = 20)
    private String codformula;

    @Column(name = "USADEBCREDRCABRIND", length = 1)
    private String usadebcredrcabrind;

    @Column(name = "PERCICMOP", precision = 10, scale = 2)
    private BigDecimal percicmop;

    @Column(name = "CODDESCONTO")
    private Integer coddesconto;

    @Column(name = "ISSRETIDO", length = 1)
    private String issretido;

    @Column(name = "PERCALIQEXTGUIA", precision = 12, scale = 4)
    private BigDecimal percaliqextguia;

    @Column(name = "VLDIFPUNITCONT", precision = 18, scale = 6)
    private BigDecimal vldifpunitcont;

    @Column(name = "CODPRODRELEV")
    private Long codprodrelev;

    @Column(name = "CODSITTRIBPISCOFINS")
    private Short codsittribpiscofins;

    @Column(name = "CODPRODDNF")
    private Short codproddnf;

    @Column(name = "CAPVOLDNF")
    private Integer capvoldnf;

    @Column(name = "FATORCONVDNF", precision = 18, scale = 6)
    private BigDecimal fatorconvdnf;

    @Column(name = "NUMTRANSITEM")
    private Long numtransitem;

    @Column(name = "MOVIMENTACONTACORRENTERCA", length = 1)
    private String movimentacontacorrenterca;

    @Column(name = "APLICPERCIVAPAUTA", length = 1)
    private String aplicpercivapauta;

    @Column(name = "ROTINACAD", length = 48)
    private String rotinacad;

    @Column(name = "DTDENEGADA")
    private LocalDate dtdenegada;

    @Column(name = "SEQMOV")
    private Long seqmov;

    @Column(name = "TIPOEMBALAGEMPEDIDO", length = 1)
    private String tipoembalagempedido;

    @Column(name = "APROVEITACREDITOICMS", length = 1)
    private String aproveitacreditoicms;

    @Column(name = "CALCBCRMANUAL", length = 1)
    private String calcbcrmanual;

    @Column(name = "CODINTERNO", length = 20)
    private String codinterno;

    @Column(name = "MOVESTOQUEGERENCIAL", length = 1)
    private String movestoquegerencial;

    @Column(name = "MOVESTOQUECONTABIL", length = 1)
    private String movestoquecontabil;

    @Column(name = "NUMTRANSENTORIGDESDLOTE")
    private Long numtransentorigdesdlote;

    @Column(name = "NUMTRANSHISTORICO")
    private Long numtranshistorico;

    @Column(name = "DATACONSOLIDACAOPREFAT")
    private LocalDate dataconsolidacaoprefat;

    @Column(name = "CODDEPOSITO")
    private Long coddeposito;

    @Column(name = "CODPROMOCAOMED")
    private Integer codpromocaomed;

    @Column(name = "PCT_ESTOQUE", length = 1)
    private String pctEstoque;

    @Column(name = "DATAESTOQUE")
    private LocalDate dataestoque;

    @Column(name = "QTINDUSTRIA", precision = 20, scale = 6)
    private BigDecimal qtindustria;

    @Column(name = "DEVSIMBOLICA", length = 1)
    private String devsimbolica;

    @Column(name = "NUMLISTA")
    private Integer numlista;

    @Column(name = "CODMARCA")
    private Integer codmarca;

    @Column(name = "CUSTOULTENTFISCAL", precision = 18, scale = 3)
    private BigDecimal custoultentfiscal;
    @Id
    private Long id;

    public LocalDate getDtmov() {
        return dtmov;
    }

    public void setDtmov(LocalDate dtmov) {
        this.dtmov = dtmov;
    }

    public Integer getCodprod() {
        return codprod;
    }

    public void setCodprod(Integer codprod) {
        this.codprod = codprod;
    }

    public Long getNumnota() {
        return numnota;
    }

    public void setNumnota(Long numnota) {
        this.numnota = numnota;
    }

    public String getCodoper() {
        return codoper;
    }

    public void setCodoper(String codoper) {
        this.codoper = codoper;
    }

    public BigDecimal getQt() {
        return qt;
    }

    public void setQt(BigDecimal qt) {
        this.qt = qt;
    }

    public BigDecimal getPunit() {
        return punit;
    }

    public void setPunit(BigDecimal punit) {
        this.punit = punit;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCodcli() {
        return codcli;
    }

    public void setCodcli(Integer codcli) {
        this.codcli = codcli;
    }

    public Integer getCodusur() {
        return codusur;
    }

    public void setCodusur(Integer codusur) {
        this.codusur = codusur;
    }

    public BigDecimal getCustofin() {
        return custofin;
    }

    public void setCustofin(BigDecimal custofin) {
        this.custofin = custofin;
    }

    public Integer getNumcar() {
        return numcar;
    }

    public void setNumcar(Integer numcar) {
        this.numcar = numcar;
    }

    public Long getNumped() {
        return numped;
    }

    public void setNumped(Long numped) {
        this.numped = numped;
    }

    public BigDecimal getPtabela() {
        return ptabela;
    }

    public void setPtabela(BigDecimal ptabela) {
        this.ptabela = ptabela;
    }

    public Short getNumregiao() {
        return numregiao;
    }

    public void setNumregiao(Short numregiao) {
        this.numregiao = numregiao;
    }

    public BigDecimal getCustocont() {
        return custocont;
    }

    public void setCustocont(BigDecimal custocont) {
        this.custocont = custocont;
    }

    public BigDecimal getSt() {
        return st;
    }

    public void setSt(BigDecimal st) {
        this.st = st;
    }

    public String getSittribut() {
        return sittribut;
    }

    public void setSittribut(String sittribut) {
        this.sittribut = sittribut;
    }

    public BigDecimal getBaseicms() {
        return baseicms;
    }

    public void setBaseicms(BigDecimal baseicms) {
        this.baseicms = baseicms;
    }

    public BigDecimal getBaseicst() {
        return baseicst;
    }

    public void setBaseicst(BigDecimal baseicst) {
        this.baseicst = baseicst;
    }

    public BigDecimal getAliqicst() {
        return aliqicst;
    }

    public void setAliqicst(BigDecimal aliqicst) {
        this.aliqicst = aliqicst;
    }

    public BigDecimal getQtcont() {
        return qtcont;
    }

    public void setQtcont(BigDecimal qtcont) {
        this.qtcont = qtcont;
    }

    public BigDecimal getPunitcont() {
        return punitcont;
    }

    public void setPunitcont(BigDecimal punitcont) {
        this.punitcont = punitcont;
    }

    public BigDecimal getCustoreal() {
        return custoreal;
    }

    public void setCustoreal(BigDecimal custoreal) {
        this.custoreal = custoreal;
    }

    public Long getNumnotadev() {
        return numnotadev;
    }

    public void setNumnotadev(Long numnotadev) {
        this.numnotadev = numnotadev;
    }

    public Long getNumtransvenda() {
        return numtransvenda;
    }

    public void setNumtransvenda(Long numtransvenda) {
        this.numtransvenda = numtransvenda;
    }

    public Integer getCodepto() {
        return codepto;
    }

    public void setCodepto(Integer codepto) {
        this.codepto = codepto;
    }

    public Integer getCodsec() {
        return codsec;
    }

    public void setCodsec(Integer codsec) {
        this.codsec = codsec;
    }

    public BigDecimal getVlfrete() {
        return vlfrete;
    }

    public void setVlfrete(BigDecimal vlfrete) {
        this.vlfrete = vlfrete;
    }

    public BigDecimal getVloutros() {
        return vloutros;
    }

    public void setVloutros(BigDecimal vloutros) {
        this.vloutros = vloutros;
    }

    public BigDecimal getCustocontant() {
        return custocontant;
    }

    public void setCustocontant(BigDecimal custocontant) {
        this.custocontant = custocontant;
    }

    public BigDecimal getCustorealant() {
        return custorealant;
    }

    public void setCustorealant(BigDecimal custorealant) {
        this.custorealant = custorealant;
    }

    public BigDecimal getCustofinant() {
        return custofinant;
    }

    public void setCustofinant(BigDecimal custofinant) {
        this.custofinant = custofinant;
    }

    public Long getNumbonus() {
        return numbonus;
    }

    public void setNumbonus(Long numbonus) {
        this.numbonus = numbonus;
    }

    public Long getNumtransent() {
        return numtransent;
    }

    public void setNumtransent(Long numtransent) {
        this.numtransent = numtransent;
    }

    public Integer getCodfornec() {
        return codfornec;
    }

    public void setCodfornec(Integer codfornec) {
        this.codfornec = codfornec;
    }

    public Short getCodplpag() {
        return codplpag;
    }

    public void setCodplpag(Short codplpag) {
        this.codplpag = codplpag;
    }

    public BigDecimal getPercipi() {
        return percipi;
    }

    public void setPercipi(BigDecimal percipi) {
        this.percipi = percipi;
    }

    public BigDecimal getPercicm() {
        return percicm;
    }

    public void setPercicm(BigDecimal percicm) {
        this.percicm = percicm;
    }

    public BigDecimal getPercst() {
        return percst;
    }

    public void setPercst(BigDecimal percst) {
        this.percst = percst;
    }

    public BigDecimal getPercbon() {
        return percbon;
    }

    public void setPercbon(BigDecimal percbon) {
        this.percbon = percbon;
    }

    public BigDecimal getPercfrete() {
        return percfrete;
    }

    public void setPercfrete(BigDecimal percfrete) {
        this.percfrete = percfrete;
    }

    public BigDecimal getPercdesc() {
        return percdesc;
    }

    public void setPercdesc(BigDecimal percdesc) {
        this.percdesc = percdesc;
    }

    public Long getNumtransdev() {
        return numtransdev;
    }

    public void setNumtransdev(Long numtransdev) {
        this.numtransdev = numtransdev;
    }

    public BigDecimal getCustoultentant() {
        return custoultentant;
    }

    public void setCustoultentant(BigDecimal custoultentant) {
        this.custoultentant = custoultentant;
    }

    public BigDecimal getValorultentant() {
        return valorultentant;
    }

    public void setValorultentant(BigDecimal valorultentant) {
        this.valorultentant = valorultentant;
    }

    public BigDecimal getCustoultent() {
        return custoultent;
    }

    public void setCustoultent(BigDecimal custoultent) {
        this.custoultent = custoultent;
    }

    public BigDecimal getValorultent() {
        return valorultent;
    }

    public void setValorultent(BigDecimal valorultent) {
        this.valorultent = valorultent;
    }

    public BigDecimal getQtestgerant() {
        return qtestgerant;
    }

    public void setQtestgerant(BigDecimal qtestgerant) {
        this.qtestgerant = qtestgerant;
    }

    public BigDecimal getQtestant() {
        return qtestant;
    }

    public void setQtestant(BigDecimal qtestant) {
        this.qtestant = qtestant;
    }

    public BigDecimal getQtsaldoestger() {
        return qtsaldoestger;
    }

    public void setQtsaldoestger(BigDecimal qtsaldoestger) {
        this.qtsaldoestger = qtsaldoestger;
    }

    public BigDecimal getQtsaldoest() {
        return qtsaldoest;
    }

    public void setQtsaldoest(BigDecimal qtsaldoest) {
        this.qtsaldoest = qtsaldoest;
    }

    public BigDecimal getVlbaseipi() {
        return vlbaseipi;
    }

    public void setVlbaseipi(BigDecimal vlbaseipi) {
        this.vlbaseipi = vlbaseipi;
    }

    public BigDecimal getVlipi() {
        return vlipi;
    }

    public void setVlipi(BigDecimal vlipi) {
        this.vlipi = vlipi;
    }

    public Integer getCodmotorista() {
        return codmotorista;
    }

    public void setCodmotorista(Integer codmotorista) {
        this.codmotorista = codmotorista;
    }

    public BigDecimal getPericmsantecipado() {
        return pericmsantecipado;
    }

    public void setPericmsantecipado(BigDecimal pericmsantecipado) {
        this.pericmsantecipado = pericmsantecipado;
    }

    public Integer getNumlanccp() {
        return numlanccp;
    }

    public void setNumlanccp(Integer numlanccp) {
        this.numlanccp = numlanccp;
    }

    public Integer getCodfiscal() {
        return codfiscal;
    }

    public void setCodfiscal(Integer codfiscal) {
        this.codfiscal = codfiscal;
    }

    public Short getCodst() {
        return codst;
    }

    public void setCodst(Short codst) {
        this.codst = codst;
    }

    public BigDecimal getPunitnf() {
        return punitnf;
    }

    public void setPunitnf(BigDecimal punitnf) {
        this.punitnf = punitnf;
    }

    public BigDecimal getPercom() {
        return percom;
    }

    public void setPercom(BigDecimal percom) {
        this.percom = percom;
    }

    public String getCodfilialnf() {
        return codfilialnf;
    }

    public void setCodfilialnf(String codfilialnf) {
        this.codfilialnf = codfilialnf;
    }

    public BigDecimal getVldesconto() {
        return vldesconto;
    }

    public void setVldesconto(BigDecimal vldesconto) {
        this.vldesconto = vldesconto;
    }

    public Short getCoddevol() {
        return coddevol;
    }

    public void setCoddevol(Short coddevol) {
        this.coddevol = coddevol;
    }

    public String getEstoquedesbloqueado() {
        return estoquedesbloqueado;
    }

    public void setEstoquedesbloqueado(String estoquedesbloqueado) {
        this.estoquedesbloqueado = estoquedesbloqueado;
    }

    public BigDecimal getVlbonific() {
        return vlbonific;
    }

    public void setVlbonific(BigDecimal vlbonific) {
        this.vlbonific = vlbonific;
    }

    public BigDecimal getPercdespadicional() {
        return percdespadicional;
    }

    public void setPercdespadicional(BigDecimal percdespadicional) {
        this.percdespadicional = percdespadicional;
    }

    public BigDecimal getPercdespfin() {
        return percdespfin;
    }

    public void setPercdespfin(BigDecimal percdespfin) {
        this.percdespfin = percdespfin;
    }

    public BigDecimal getPercfretefob() {
        return percfretefob;
    }

    public void setPercfretefob(BigDecimal percfretefob) {
        this.percfretefob = percfretefob;
    }

    public BigDecimal getPercoutrasdesp() {
        return percoutrasdesp;
    }

    public void setPercoutrasdesp(BigDecimal percoutrasdesp) {
        this.percoutrasdesp = percoutrasdesp;
    }

    public BigDecimal getVloutrasdesp() {
        return vloutrasdesp;
    }

    public void setVloutrasdesp(BigDecimal vloutrasdesp) {
        this.vloutrasdesp = vloutrasdesp;
    }

    public BigDecimal getPercdescfin() {
        return percdescfin;
    }

    public void setPercdescfin(BigDecimal percdescfin) {
        this.percdescfin = percdescfin;
    }

    public BigDecimal getVldesccustocmv() {
        return vldesccustocmv;
    }

    public void setVldesccustocmv(BigDecimal vldesccustocmv) {
        this.vldesccustocmv = vldesccustocmv;
    }

    public BigDecimal getPerciva() {
        return perciva;
    }

    public void setPerciva(BigDecimal perciva) {
        this.perciva = perciva;
    }

    public BigDecimal getPercinteiro() {
        return percinteiro;
    }

    public void setPercinteiro(BigDecimal percinteiro) {
        this.percinteiro = percinteiro;
    }

    public BigDecimal getPercquebrado() {
        return percquebrado;
    }

    public void setPercquebrado(BigDecimal percquebrado) {
        this.percquebrado = percquebrado;
    }

    public BigDecimal getPercimpureza() {
        return percimpureza;
    }

    public void setPercimpureza(BigDecimal percimpureza) {
        this.percimpureza = percimpureza;
    }

    public BigDecimal getPercvermelho() {
        return percvermelho;
    }

    public void setPercvermelho(BigDecimal percvermelho) {
        this.percvermelho = percvermelho;
    }

    public BigDecimal getPercumidade() {
        return percumidade;
    }

    public void setPercumidade(BigDecimal percumidade) {
        this.percumidade = percumidade;
    }

    public Integer getNumbono() {
        return numbono;
    }

    public void setNumbono(Integer numbono) {
        this.numbono = numbono;
    }

    public BigDecimal getPercicmred() {
        return percicmred;
    }

    public void setPercicmred(BigDecimal percicmred) {
        this.percicmred = percicmred;
    }

    public BigDecimal getQtvendaemb() {
        return qtvendaemb;
    }

    public void setQtvendaemb(BigDecimal qtvendaemb) {
        this.qtvendaemb = qtvendaemb;
    }

    public BigDecimal getPvendaemb() {
        return pvendaemb;
    }

    public void setPvendaemb(BigDecimal pvendaemb) {
        this.pvendaemb = pvendaemb;
    }

    public Long getNumseq() {
        return numseq;
    }

    public void setNumseq(Long numseq) {
        this.numseq = numseq;
    }

    public BigDecimal getQtembalagem() {
        return qtembalagem;
    }

    public void setQtembalagem(BigDecimal qtembalagem) {
        this.qtembalagem = qtembalagem;
    }

    public BigDecimal getPvendaembalagem() {
        return pvendaembalagem;
    }

    public void setPvendaembalagem(BigDecimal pvendaembalagem) {
        this.pvendaembalagem = pvendaembalagem;
    }

    public BigDecimal getCustorep() {
        return custorep;
    }

    public void setCustorep(BigDecimal custorep) {
        this.custorep = custorep;
    }

    public String getNumidf() {
        return numidf;
    }

    public void setNumidf(String numidf) {
        this.numidf = numidf;
    }

    public Long getNumformulario() {
        return numformulario;
    }

    public void setNumformulario(Long numformulario) {
        this.numformulario = numformulario;
    }

    public Integer getCodcertific() {
        return codcertific;
    }

    public void setCodcertific(Integer codcertific) {
        this.codcertific = codcertific;
    }

    public Long getCodauxiliar() {
        return codauxiliar;
    }

    public void setCodauxiliar(Long codauxiliar) {
        this.codauxiliar = codauxiliar;
    }

    public LocalDate getDtcancel() {
        return dtcancel;
    }

    public void setDtcancel(LocalDate dtcancel) {
        this.dtcancel = dtcancel;
    }

    public LocalDate getDtmovlog() {
        return dtmovlog;
    }

    public void setDtmovlog(LocalDate dtmovlog) {
        this.dtmovlog = dtmovlog;
    }

    public Integer getCodprodprinc() {
        return codprodprinc;
    }

    public void setCodprodprinc(Integer codprodprinc) {
        this.codprodprinc = codprodprinc;
    }

    public BigDecimal getPerpis() {
        return perpis;
    }

    public void setPerpis(BigDecimal perpis) {
        this.perpis = perpis;
    }

    public BigDecimal getVlcredpis() {
        return vlcredpis;
    }

    public void setVlcredpis(BigDecimal vlcredpis) {
        this.vlcredpis = vlcredpis;
    }

    public BigDecimal getVlcredicms() {
        return vlcredicms;
    }

    public void setVlcredicms(BigDecimal vlcredicms) {
        this.vlcredicms = vlcredicms;
    }

    public BigDecimal getPericmfrete() {
        return pericmfrete;
    }

    public void setPericmfrete(BigDecimal pericmfrete) {
        this.pericmfrete = pericmfrete;
    }

    public BigDecimal getVlcredicmsfrete() {
        return vlcredicmsfrete;
    }

    public void setVlcredicmsfrete(BigDecimal vlcredicmsfrete) {
        this.vlcredicmsfrete = vlcredicmsfrete;
    }

    public BigDecimal getQtultentant() {
        return qtultentant;
    }

    public void setQtultentant(BigDecimal qtultentant) {
        this.qtultentant = qtultentant;
    }

    public LocalDate getDtultentant() {
        return dtultentant;
    }

    public void setDtultentant(LocalDate dtultentant) {
        this.dtultentant = dtultentant;
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

    public BigDecimal getCustoultentmedant() {
        return custoultentmedant;
    }

    public void setCustoultentmedant(BigDecimal custoultentmedant) {
        this.custoultentmedant = custoultentmedant;
    }

    public BigDecimal getValorultentmedant() {
        return valorultentmedant;
    }

    public void setValorultentmedant(BigDecimal valorultentmedant) {
        this.valorultentmedant = valorultentmedant;
    }

    public BigDecimal getPtabela2() {
        return ptabela2;
    }

    public void setPtabela2(BigDecimal ptabela2) {
        this.ptabela2 = ptabela2;
    }

    public BigDecimal getQtavaria() {
        return qtavaria;
    }

    public void setQtavaria(BigDecimal qtavaria) {
        this.qtavaria = qtavaria;
    }

    public LocalDate getHoraproducao() {
        return horaproducao;
    }

    public void setHoraproducao(LocalDate horaproducao) {
        this.horaproducao = horaproducao;
    }

    public BigDecimal getVldescsuframa() {
        return vldescsuframa;
    }

    public void setVldescsuframa(BigDecimal vldescsuframa) {
        this.vldescsuframa = vldescsuframa;
    }

    public BigDecimal getPercoutroscustos() {
        return percoutroscustos;
    }

    public void setPercoutroscustos(BigDecimal percoutroscustos) {
        this.percoutroscustos = percoutroscustos;
    }

    public Integer getCodfuncreq() {
        return codfuncreq;
    }

    public void setCodfuncreq(Integer codfuncreq) {
        this.codfuncreq = codfuncreq;
    }

    public LocalDate getDatafabricacao() {
        return datafabricacao;
    }

    public void setDatafabricacao(LocalDate datafabricacao) {
        this.datafabricacao = datafabricacao;
    }

    public LocalDate getDatavalidade() {
        return datavalidade;
    }

    public void setDatavalidade(LocalDate datavalidade) {
        this.datavalidade = datavalidade;
    }

    public String getRefcor() {
        return refcor;
    }

    public void setRefcor(String refcor) {
        this.refcor = refcor;
    }

    public Integer getCodfunclanc() {
        return codfunclanc;
    }

    public void setCodfunclanc(Integer codfunclanc) {
        this.codfunclanc = codfunclanc;
    }

    public LocalDate getDatalibquarentena() {
        return datalibquarentena;
    }

    public void setDatalibquarentena(LocalDate datalibquarentena) {
        this.datalibquarentena = datalibquarentena;
    }

    public Integer getCodfuncquarentena() {
        return codfuncquarentena;
    }

    public void setCodfuncquarentena(Integer codfuncquarentena) {
        this.codfuncquarentena = codfuncquarentena;
    }

    public BigDecimal getQthoras() {
        return qthoras;
    }

    public void setQthoras(BigDecimal qthoras) {
        this.qthoras = qthoras;
    }

    public BigDecimal getQtdevol() {
        return qtdevol;
    }

    public void setQtdevol(BigDecimal qtdevol) {
        this.qtdevol = qtdevol;
    }

    public BigDecimal getVldescicmisencao() {
        return vldescicmisencao;
    }

    public void setVldescicmisencao(BigDecimal vldescicmisencao) {
        this.vldescicmisencao = vldescicmisencao;
    }

    public String getNumlote() {
        return numlote;
    }

    public void setNumlote(String numlote) {
        this.numlote = numlote;
    }

    public Integer getNumop() {
        return numop;
    }

    public void setNumop(Integer numop) {
        this.numop = numop;
    }

    public Long getNumtransop() {
        return numtransop;
    }

    public void setNumtransop(Long numtransop) {
        this.numtransop = numtransop;
    }

    public BigDecimal getCustorealsemstant() {
        return custorealsemstant;
    }

    public void setCustorealsemstant(BigDecimal custorealsemstant) {
        this.custorealsemstant = custorealsemstant;
    }

    public BigDecimal getCustorealsemst() {
        return custorealsemst;
    }

    public void setCustorealsemst(BigDecimal custorealsemst) {
        this.custorealsemst = custorealsemst;
    }

    public BigDecimal getVlindeniz() {
        return vlindeniz;
    }

    public void setVlindeniz(BigDecimal vlindeniz) {
        this.vlindeniz = vlindeniz;
    }

    public BigDecimal getPercsuframa() {
        return percsuframa;
    }

    public void setPercsuframa(BigDecimal percsuframa) {
        this.percsuframa = percsuframa;
    }

    public BigDecimal getVlsuframa() {
        return vlsuframa;
    }

    public void setVlsuframa(BigDecimal vlsuframa) {
        this.vlsuframa = vlsuframa;
    }

    public String getTipotis() {
        return tipotis;
    }

    public void setTipotis(String tipotis) {
        this.tipotis = tipotis;
    }

    public BigDecimal getAliquotatis() {
        return aliquotatis;
    }

    public void setAliquotatis(BigDecimal aliquotatis) {
        this.aliquotatis = aliquotatis;
    }

    public String getIndlocal() {
        return indlocal;
    }

    public void setIndlocal(String indlocal) {
        this.indlocal = indlocal;
    }

    public BigDecimal getPericmguiapropria() {
        return pericmguiapropria;
    }

    public void setPericmguiapropria(BigDecimal pericmguiapropria) {
        this.pericmguiapropria = pericmguiapropria;
    }

    public BigDecimal getCustorepant() {
        return custorepant;
    }

    public void setCustorepant(BigDecimal custorepant) {
        this.custorepant = custorepant;
    }

    public BigDecimal getPercicmcp() {
        return percicmcp;
    }

    public void setPercicmcp(BigDecimal percicmcp) {
        this.percicmcp = percicmcp;
    }

    public Long getNumtransavulsa() {
        return numtransavulsa;
    }

    public void setNumtransavulsa(Long numtransavulsa) {
        this.numtransavulsa = numtransavulsa;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getAliqicms1() {
        return aliqicms1;
    }

    public void setAliqicms1(BigDecimal aliqicms1) {
        this.aliqicms1 = aliqicms1;
    }

    public BigDecimal getAliqicms2() {
        return aliqicms2;
    }

    public void setAliqicms2(BigDecimal aliqicms2) {
        this.aliqicms2 = aliqicms2;
    }

    public BigDecimal getPauta() {
        return pauta;
    }

    public void setPauta(BigDecimal pauta) {
        this.pauta = pauta;
    }

    public BigDecimal getPercbasered() {
        return percbasered;
    }

    public void setPercbasered(BigDecimal percbasered) {
        this.percbasered = percbasered;
    }

    public BigDecimal getVldesccom() {
        return vldesccom;
    }

    public void setVldesccom(BigDecimal vldesccom) {
        this.vldesccom = vldesccom;
    }

    public BigDecimal getPerdesccom() {
        return perdesccom;
    }

    public void setPerdesccom(BigDecimal perdesccom) {
        this.perdesccom = perdesccom;
    }

    public BigDecimal getVldescfin() {
        return vldescfin;
    }

    public void setVldescfin(BigDecimal vldescfin) {
        this.vldescfin = vldescfin;
    }

    public BigDecimal getPerdescfin() {
        return perdescfin;
    }

    public void setPerdescfin(BigDecimal perdescfin) {
        this.perdescfin = perdescfin;
    }

    public BigDecimal getPerbonific() {
        return perbonific;
    }

    public void setPerbonific(BigDecimal perbonific) {
        this.perbonific = perbonific;
    }

    public String getHoralanc() {
        return horalanc;
    }

    public void setHoralanc(String horalanc) {
        this.horalanc = horalanc;
    }

    public String getMinutolanc() {
        return minutolanc;
    }

    public void setMinutolanc(String minutolanc) {
        this.minutolanc = minutolanc;
    }

    public String getRotinalanc() {
        return rotinalanc;
    }

    public void setRotinalanc(String rotinalanc) {
        this.rotinalanc = rotinalanc;
    }

    public String getEquiplanc() {
        return equiplanc;
    }

    public void setEquiplanc(String equiplanc) {
        this.equiplanc = equiplanc;
    }

    public String getFunclanc() {
        return funclanc;
    }

    public void setFunclanc(String funclanc) {
        this.funclanc = funclanc;
    }

    public BigDecimal getPerfretecmv() {
        return perfretecmv;
    }

    public void setPerfretecmv(BigDecimal perfretecmv) {
        this.perfretecmv = perfretecmv;
    }

    public BigDecimal getVldescrodape() {
        return vldescrodape;
    }

    public void setVldescrodape(BigDecimal vldescrodape) {
        this.vldescrodape = vldescrodape;
    }

    public BigDecimal getStclientegnre() {
        return stclientegnre;
    }

    public void setStclientegnre(BigDecimal stclientegnre) {
        this.stclientegnre = stclientegnre;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public BigDecimal getCustofinest() {
        return custofinest;
    }

    public void setCustofinest(BigDecimal custofinest) {
        this.custofinest = custofinest;
    }

    public BigDecimal getPercbaseredstfonte() {
        return percbaseredstfonte;
    }

    public void setPercbaseredstfonte(BigDecimal percbaseredstfonte) {
        this.percbaseredstfonte = percbaseredstfonte;
    }

    public BigDecimal getPercbaseredst() {
        return percbaseredst;
    }

    public void setPercbaseredst(BigDecimal percbaseredst) {
        this.percbaseredst = percbaseredst;
    }

    public BigDecimal getPerdesccusto() {
        return perdesccusto;
    }

    public void setPerdesccusto(BigDecimal perdesccusto) {
        this.perdesccusto = perdesccusto;
    }

    public BigDecimal getCodicmtab() {
        return codicmtab;
    }

    public void setCodicmtab(BigDecimal codicmtab) {
        this.codicmtab = codicmtab;
    }

    public BigDecimal getTxvenda() {
        return txvenda;
    }

    public void setTxvenda(BigDecimal txvenda) {
        this.txvenda = txvenda;
    }

    public Long getNumformulario2() {
        return numformulario2;
    }

    public void setNumformulario2(Long numformulario2) {
        this.numformulario2 = numformulario2;
    }

    public BigDecimal getPercom2() {
        return percom2;
    }

    public void setPercom2(BigDecimal percom2) {
        this.percom2 = percom2;
    }

    public BigDecimal getPercom3() {
        return percom3;
    }

    public void setPercom3(BigDecimal percom3) {
        this.percom3 = percom3;
    }

    public BigDecimal getPerciss() {
        return perciss;
    }

    public void setPerciss(BigDecimal perciss) {
        this.perciss = perciss;
    }

    public BigDecimal getVliss() {
        return vliss;
    }

    public void setVliss(BigDecimal vliss) {
        this.vliss = vliss;
    }

    public BigDecimal getPerccredicmpresumido() {
        return perccredicmpresumido;
    }

    public void setPerccredicmpresumido(BigDecimal perccredicmpresumido) {
        this.perccredicmpresumido = perccredicmpresumido;
    }

    public BigDecimal getCustoultentfin() {
        return custoultentfin;
    }

    public void setCustoultentfin(BigDecimal custoultentfin) {
        this.custoultentfin = custoultentfin;
    }

    public BigDecimal getCustoultentfinant() {
        return custoultentfinant;
    }

    public void setCustoultentfinant(BigDecimal custoultentfinant) {
        this.custoultentfinant = custoultentfinant;
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

    public String getCodpromocao() {
        return codpromocao;
    }

    public void setCodpromocao(String codpromocao) {
        this.codpromocao = codpromocao;
    }

    public Short getPrazomedio() {
        return prazomedio;
    }

    public void setPrazomedio(Short prazomedio) {
        this.prazomedio = prazomedio;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public BigDecimal getVlcredpresumido() {
        return vlcredpresumido;
    }

    public void setVlcredpresumido(BigDecimal vlcredpresumido) {
        this.vlcredpresumido = vlcredpresumido;
    }

    public BigDecimal getVlrepasse() {
        return vlrepasse;
    }

    public void setVlrepasse(BigDecimal vlrepasse) {
        this.vlrepasse = vlrepasse;
    }

    public BigDecimal getPbonific() {
        return pbonific;
    }

    public void setPbonific(BigDecimal pbonific) {
        this.pbonific = pbonific;
    }

    public BigDecimal getPercvenda() {
        return percvenda;
    }

    public void setPercvenda(BigDecimal percvenda) {
        this.percvenda = percvenda;
    }

    public Long getNumtransentultent() {
        return numtransentultent;
    }

    public void setNumtransentultent(Long numtransentultent) {
        this.numtransentultent = numtransentultent;
    }

    public Long getNumtransentultentant() {
        return numtransentultentant;
    }

    public void setNumtransentultentant(Long numtransentultentant) {
        this.numtransentultentant = numtransentultentant;
    }

    public BigDecimal getPerciva2() {
        return perciva2;
    }

    public void setPerciva2(BigDecimal perciva2) {
        this.perciva2 = perciva2;
    }

    public BigDecimal getPercaliqint2() {
        return percaliqint2;
    }

    public void setPercaliqint2(BigDecimal percaliqint2) {
        this.percaliqint2 = percaliqint2;
    }

    public BigDecimal getVlpauta2() {
        return vlpauta2;
    }

    public void setVlpauta2(BigDecimal vlpauta2) {
        this.vlpauta2 = vlpauta2;
    }

    public BigDecimal getPercaliqext2() {
        return percaliqext2;
    }

    public void setPercaliqext2(BigDecimal percaliqext2) {
        this.percaliqext2 = percaliqext2;
    }

    public BigDecimal getVlbasegnre() {
        return vlbasegnre;
    }

    public void setVlbasegnre(BigDecimal vlbasegnre) {
        this.vlbasegnre = vlbasegnre;
    }

    public BigDecimal getVldescpissuframa() {
        return vldescpissuframa;
    }

    public void setVldescpissuframa(BigDecimal vldescpissuframa) {
        this.vldescpissuframa = vldescpissuframa;
    }

    public BigDecimal getQtbloqueada() {
        return qtbloqueada;
    }

    public void setQtbloqueada(BigDecimal qtbloqueada) {
        this.qtbloqueada = qtbloqueada;
    }

    public String getBrinde() {
        return brinde;
    }

    public void setBrinde(String brinde) {
        this.brinde = brinde;
    }

    public String getItemdivergente() {
        return itemdivergente;
    }

    public void setItemdivergente(String itemdivergente) {
        this.itemdivergente = itemdivergente;
    }

    public BigDecimal getPvendabase() {
        return pvendabase;
    }

    public void setPvendabase(BigDecimal pvendabase) {
        this.pvendabase = pvendabase;
    }

    public String getQualdivergencia() {
        return qualdivergencia;
    }

    public void setQualdivergencia(String qualdivergencia) {
        this.qualdivergencia = qualdivergencia;
    }

    public BigDecimal getCustoultentant2() {
        return custoultentant2;
    }

    public void setCustoultentant2(BigDecimal custoultentant2) {
        this.custoultentant2 = custoultentant2;
    }

    public String getProdbonificado() {
        return prodbonificado;
    }

    public void setProdbonificado(String prodbonificado) {
        this.prodbonificado = prodbonificado;
    }

    public BigDecimal getPercmexiva() {
        return percmexiva;
    }

    public void setPercmexiva(BigDecimal percmexiva) {
        this.percmexiva = percmexiva;
    }

    public BigDecimal getPercmexieps() {
        return percmexieps;
    }

    public void setPercmexieps(BigDecimal percmexieps) {
        this.percmexieps = percmexieps;
    }

    public BigDecimal getPercmexfpgc() {
        return percmexfpgc;
    }

    public void setPercmexfpgc(BigDecimal percmexfpgc) {
        this.percmexfpgc = percmexfpgc;
    }

    public BigDecimal getVlmexiva() {
        return vlmexiva;
    }

    public void setVlmexiva(BigDecimal vlmexiva) {
        this.vlmexiva = vlmexiva;
    }

    public BigDecimal getVlmexieps() {
        return vlmexieps;
    }

    public void setVlmexieps(BigDecimal vlmexieps) {
        this.vlmexieps = vlmexieps;
    }

    public BigDecimal getVlmexfpgc() {
        return vlmexfpgc;
    }

    public void setVlmexfpgc(BigDecimal vlmexfpgc) {
        this.vlmexfpgc = vlmexfpgc;
    }

    public BigDecimal getVladicionalbcst() {
        return vladicionalbcst;
    }

    public void setVladicionalbcst(BigDecimal vladicionalbcst) {
        this.vladicionalbcst = vladicionalbcst;
    }

    public BigDecimal getPerdescflex() {
        return perdescflex;
    }

    public void setPerdescflex(BigDecimal perdescflex) {
        this.perdescflex = perdescflex;
    }

    public BigDecimal getVldescflex() {
        return vldescflex;
    }

    public void setVldescflex(BigDecimal vldescflex) {
        this.vldescflex = vldescflex;
    }

    public BigDecimal getPerredcomiss() {
        return perredcomiss;
    }

    public void setPerredcomiss(BigDecimal perredcomiss) {
        this.perredcomiss = perredcomiss;
    }

    public BigDecimal getVlredcomiss() {
        return vlredcomiss;
    }

    public void setVlredcomiss(BigDecimal vlredcomiss) {
        this.vlredcomiss = vlredcomiss;
    }

    public String getTipodescaplicado() {
        return tipodescaplicado;
    }

    public void setTipodescaplicado(String tipodescaplicado) {
        this.tipodescaplicado = tipodescaplicado;
    }

    public BigDecimal getPbaserca() {
        return pbaserca;
    }

    public void setPbaserca(BigDecimal pbaserca) {
        this.pbaserca = pbaserca;
    }

    public BigDecimal getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(BigDecimal pesobruto) {
        this.pesobruto = pesobruto;
    }

    public BigDecimal getVlfreteporkg() {
        return vlfreteporkg;
    }

    public void setVlfreteporkg(BigDecimal vlfreteporkg) {
        this.vlfreteporkg = vlfreteporkg;
    }

    public BigDecimal getVlfreteconhec() {
        return vlfreteconhec;
    }

    public void setVlfreteconhec(BigDecimal vlfreteconhec) {
        this.vlfreteconhec = vlfreteconhec;
    }

    public BigDecimal getVlverbacmv() {
        return vlverbacmv;
    }

    public void setVlverbacmv(BigDecimal vlverbacmv) {
        this.vlverbacmv = vlverbacmv;
    }

    public Integer getNumverbarebcmv() {
        return numverbarebcmv;
    }

    public void setNumverbarebcmv(Integer numverbarebcmv) {
        this.numverbarebcmv = numverbarebcmv;
    }

    public Long getCodequipamento() {
        return codequipamento;
    }

    public void setCodequipamento(Long codequipamento) {
        this.codequipamento = codequipamento;
    }

    public BigDecimal getBaseicmsbcr() {
        return baseicmsbcr;
    }

    public void setBaseicmsbcr(BigDecimal baseicmsbcr) {
        this.baseicmsbcr = baseicmsbcr;
    }

    public BigDecimal getVlicmsbcr() {
        return vlicmsbcr;
    }

    public void setVlicmsbcr(BigDecimal vlicmsbcr) {
        this.vlicmsbcr = vlicmsbcr;
    }

    public BigDecimal getPercomsup() {
        return percomsup;
    }

    public void setPercomsup(BigDecimal percomsup) {
        this.percomsup = percomsup;
    }

    public BigDecimal getPerredcomisssup() {
        return perredcomisssup;
    }

    public void setPerredcomisssup(BigDecimal perredcomisssup) {
        this.perredcomisssup = perredcomisssup;
    }

    public BigDecimal getVlredcomisssup() {
        return vlredcomisssup;
    }

    public void setVlredcomisssup(BigDecimal vlredcomisssup) {
        this.vlredcomisssup = vlredcomisssup;
    }

    public BigDecimal getPercicm2() {
        return percicm2;
    }

    public void setPercicm2(BigDecimal percicm2) {
        this.percicm2 = percicm2;
    }

    public BigDecimal getAliqstsaida() {
        return aliqstsaida;
    }

    public void setAliqstsaida(BigDecimal aliqstsaida) {
        this.aliqstsaida = aliqstsaida;
    }

    public BigDecimal getBasestsaida() {
        return basestsaida;
    }

    public void setBasestsaida(BigDecimal basestsaida) {
        this.basestsaida = basestsaida;
    }

    public BigDecimal getStsaida() {
        return stsaida;
    }

    public void setStsaida(BigDecimal stsaida) {
        this.stsaida = stsaida;
    }

    public BigDecimal getQtcx() {
        return qtcx;
    }

    public void setQtcx(BigDecimal qtcx) {
        this.qtcx = qtcx;
    }

    public BigDecimal getQtpecas() {
        return qtpecas;
    }

    public void setQtpecas(BigDecimal qtpecas) {
        this.qtpecas = qtpecas;
    }

    public String getCodecf() {
        return codecf;
    }

    public void setCodecf(String codecf) {
        this.codecf = codecf;
    }

    public BigDecimal getPercivamex() {
        return percivamex;
    }

    public void setPercivamex(BigDecimal percivamex) {
        this.percivamex = percivamex;
    }

    public BigDecimal getBaseivamex() {
        return baseivamex;
    }

    public void setBaseivamex(BigDecimal baseivamex) {
        this.baseivamex = baseivamex;
    }

    public BigDecimal getVlivamex() {
        return vlivamex;
    }

    public void setVlivamex(BigDecimal vlivamex) {
        this.vlivamex = vlivamex;
    }

    public BigDecimal getBaseicms2() {
        return baseicms2;
    }

    public void setBaseicms2(BigDecimal baseicms2) {
        this.baseicms2 = baseicms2;
    }

    public Integer getNumseqped() {
        return numseqped;
    }

    public void setNumseqped(Integer numseqped) {
        this.numseqped = numseqped;
    }

    public BigDecimal getPeracrescimopf() {
        return peracrescimopf;
    }

    public void setPeracrescimopf(BigDecimal peracrescimopf) {
        this.peracrescimopf = peracrescimopf;
    }

    public BigDecimal getBaseacrescimopf() {
        return baseacrescimopf;
    }

    public void setBaseacrescimopf(BigDecimal baseacrescimopf) {
        this.baseacrescimopf = baseacrescimopf;
    }

    public BigDecimal getVlacrescimopf() {
        return vlacrescimopf;
    }

    public void setVlacrescimopf(BigDecimal vlacrescimopf) {
        this.vlacrescimopf = vlacrescimopf;
    }

    public BigDecimal getRedbaseiva() {
        return redbaseiva;
    }

    public void setRedbaseiva(BigDecimal redbaseiva) {
        this.redbaseiva = redbaseiva;
    }

    public BigDecimal getRedbasealiqext() {
        return redbasealiqext;
    }

    public void setRedbasealiqext(BigDecimal redbasealiqext) {
        this.redbasealiqext = redbasealiqext;
    }

    public Long getNumnegociacao() {
        return numnegociacao;
    }

    public void setNumnegociacao(Long numnegociacao) {
        this.numnegociacao = numnegociacao;
    }

    public String getCodfilialretira() {
        return codfilialretira;
    }

    public void setCodfilialretira(String codfilialretira) {
        this.codfilialretira = codfilialretira;
    }

    public Integer getNumverbaoutras() {
        return numverbaoutras;
    }

    public void setNumverbaoutras(Integer numverbaoutras) {
        this.numverbaoutras = numverbaoutras;
    }

    public BigDecimal getPercbonoutras() {
        return percbonoutras;
    }

    public void setPercbonoutras(BigDecimal percbonoutras) {
        this.percbonoutras = percbonoutras;
    }

    public BigDecimal getVlbonificoutras() {
        return vlbonificoutras;
    }

    public void setVlbonificoutras(BigDecimal vlbonificoutras) {
        this.vlbonificoutras = vlbonificoutras;
    }

    public BigDecimal getPercimportacao() {
        return percimportacao;
    }

    public void setPercimportacao(BigDecimal percimportacao) {
        this.percimportacao = percimportacao;
    }

    public BigDecimal getVlsiscomex() {
        return vlsiscomex;
    }

    public void setVlsiscomex(BigDecimal vlsiscomex) {
        this.vlsiscomex = vlsiscomex;
    }

    public BigDecimal getVladuaneira() {
        return vladuaneira;
    }

    public void setVladuaneira(BigDecimal vladuaneira) {
        this.vladuaneira = vladuaneira;
    }

    public BigDecimal getVlimportacao() {
        return vlimportacao;
    }

    public void setVlimportacao(BigDecimal vlimportacao) {
        this.vlimportacao = vlimportacao;
    }

    public BigDecimal getPercofins() {
        return percofins;
    }

    public void setPercofins(BigDecimal percofins) {
        this.percofins = percofins;
    }

    public BigDecimal getVlcredcofins() {
        return vlcredcofins;
    }

    public void setVlcredcofins(BigDecimal vlcredcofins) {
        this.vlcredcofins = vlcredcofins;
    }

    public BigDecimal getVloutrasdespimp() {
        return vloutrasdespimp;
    }

    public void setVloutrasdespimp(BigDecimal vloutrasdespimp) {
        this.vloutrasdespimp = vloutrasdespimp;
    }

    public BigDecimal getVlacrescrodape() {
        return vlacrescrodape;
    }

    public void setVlacrescrodape(BigDecimal vlacrescrodape) {
        this.vlacrescrodape = vlacrescrodape;
    }

    public BigDecimal getVlpis() {
        return vlpis;
    }

    public void setVlpis(BigDecimal vlpis) {
        this.vlpis = vlpis;
    }

    public Long getNumtransdevfor() {
        return numtransdevfor;
    }

    public void setNumtransdevfor(Long numtransdevfor) {
        this.numtransdevfor = numtransdevfor;
    }

    public BigDecimal getPerdescisentoicms() {
        return perdescisentoicms;
    }

    public void setPerdescisentoicms(BigDecimal perdescisentoicms) {
        this.perdescisentoicms = perdescisentoicms;
    }

    public BigDecimal getPliqped() {
        return pliqped;
    }

    public void setPliqped(BigDecimal pliqped) {
        this.pliqped = pliqped;
    }

    public String getPromocaobiro() {
        return promocaobiro;
    }

    public void setPromocaobiro(String promocaobiro) {
        this.promocaobiro = promocaobiro;
    }

    public Short getCodfiscaloutrasdespent() {
        return codfiscaloutrasdespent;
    }

    public void setCodfiscaloutrasdespent(Short codfiscaloutrasdespent) {
        this.codfiscaloutrasdespent = codfiscaloutrasdespent;
    }

    public BigDecimal getAliqicmoutrasdespent() {
        return aliqicmoutrasdespent;
    }

    public void setAliqicmoutrasdespent(BigDecimal aliqicmoutrasdespent) {
        this.aliqicmoutrasdespent = aliqicmoutrasdespent;
    }

    public Short getCodfiscalfreteent() {
        return codfiscalfreteent;
    }

    public void setCodfiscalfreteent(Short codfiscalfreteent) {
        this.codfiscalfreteent = codfiscalfreteent;
    }

    public BigDecimal getAliqicmfreteent() {
        return aliqicmfreteent;
    }

    public void setAliqicmfreteent(BigDecimal aliqicmfreteent) {
        this.aliqicmfreteent = aliqicmfreteent;
    }

    public BigDecimal getFatorcustonatransf() {
        return fatorcustonatransf;
    }

    public void setFatorcustonatransf(BigDecimal fatorcustonatransf) {
        this.fatorcustonatransf = fatorcustonatransf;
    }

    public String getTipoitem() {
        return tipoitem;
    }

    public void setTipoitem(String tipoitem) {
        this.tipoitem = tipoitem;
    }

    public BigDecimal getVlbasestforanf() {
        return vlbasestforanf;
    }

    public void setVlbasestforanf(BigDecimal vlbasestforanf) {
        this.vlbasestforanf = vlbasestforanf;
    }

    public BigDecimal getVldespadicional() {
        return vldespadicional;
    }

    public void setVldespadicional(BigDecimal vldespadicional) {
        this.vldespadicional = vldespadicional;
    }

    public BigDecimal getPvenda1() {
        return pvenda1;
    }

    public void setPvenda1(BigDecimal pvenda1) {
        this.pvenda1 = pvenda1;
    }

    public BigDecimal getPercagregadorst() {
        return percagregadorst;
    }

    public void setPercagregadorst(BigDecimal percagregadorst) {
        this.percagregadorst = percagregadorst;
    }

    public BigDecimal getPrecopauta() {
        return precopauta;
    }

    public void setPrecopauta(BigDecimal precopauta) {
        this.precopauta = precopauta;
    }

    public BigDecimal getPercbaseredadicional() {
        return percbaseredadicional;
    }

    public void setPercbaseredadicional(BigDecimal percbaseredadicional) {
        this.percbaseredadicional = percbaseredadicional;
    }

    public BigDecimal getBaseicmsadicional() {
        return baseicmsadicional;
    }

    public void setBaseicmsadicional(BigDecimal baseicmsadicional) {
        this.baseicmsadicional = baseicmsadicional;
    }

    public BigDecimal getVlverbacmvcli() {
        return vlverbacmvcli;
    }

    public void setVlverbacmvcli(BigDecimal vlverbacmvcli) {
        this.vlverbacmvcli = vlverbacmvcli;
    }

    public BigDecimal getPercicmoriginal() {
        return percicmoriginal;
    }

    public void setPercicmoriginal(BigDecimal percicmoriginal) {
        this.percicmoriginal = percicmoriginal;
    }

    public BigDecimal getVlpercbon() {
        return vlpercbon;
    }

    public void setVlpercbon(BigDecimal vlpercbon) {
        this.vlpercbon = vlpercbon;
    }

    public BigDecimal getPercvlbonific() {
        return percvlbonific;
    }

    public void setPercvlbonific(BigDecimal percvlbonific) {
        this.percvlbonific = percvlbonific;
    }

    public String getAproveitacredicms() {
        return aproveitacredicms;
    }

    public void setAproveitacredicms(String aproveitacredicms) {
        this.aproveitacredicms = aproveitacredicms;
    }

    public LocalDate getDtexportacaoservint() {
        return dtexportacaoservint;
    }

    public void setDtexportacaoservint(LocalDate dtexportacaoservint) {
        this.dtexportacaoservint = dtexportacaoservint;
    }

    public String getExportadoservint() {
        return exportadoservint;
    }

    public void setExportadoservint(String exportadoservint) {
        this.exportadoservint = exportadoservint;
    }

    public String getImportadoservprinc() {
        return importadoservprinc;
    }

    public void setImportadoservprinc(String importadoservprinc) {
        this.importadoservprinc = importadoservprinc;
    }

    public LocalDate getDtimportacaoservprinc() {
        return dtimportacaoservprinc;
    }

    public void setDtimportacaoservprinc(LocalDate dtimportacaoservprinc) {
        this.dtimportacaoservprinc = dtimportacaoservprinc;
    }

    public Integer getCodvasilhame() {
        return codvasilhame;
    }

    public void setCodvasilhame(Integer codvasilhame) {
        this.codvasilhame = codvasilhame;
    }

    public String getAproveitacredpiscofins() {
        return aproveitacredpiscofins;
    }

    public void setAproveitacredpiscofins(String aproveitacredpiscofins) {
        this.aproveitacredpiscofins = aproveitacredpiscofins;
    }

    public BigDecimal getVlultentcontsemst() {
        return vlultentcontsemst;
    }

    public void setVlultentcontsemst(BigDecimal vlultentcontsemst) {
        this.vlultentcontsemst = vlultentcontsemst;
    }

    public BigDecimal getVlultentcontsemstant() {
        return vlultentcontsemstant;
    }

    public void setVlultentcontsemstant(BigDecimal vlultentcontsemstant) {
        this.vlultentcontsemstant = vlultentcontsemstant;
    }

    public String getTruncaritem() {
        return truncaritem;
    }

    public void setTruncaritem(String truncaritem) {
        this.truncaritem = truncaritem;
    }

    public BigDecimal getVlbasepiscofins() {
        return vlbasepiscofins;
    }

    public void setVlbasepiscofins(BigDecimal vlbasepiscofins) {
        this.vlbasepiscofins = vlbasepiscofins;
    }

    public BigDecimal getQtconf() {
        return qtconf;
    }

    public void setQtconf(BigDecimal qtconf) {
        this.qtconf = qtconf;
    }

    public LocalDate getDtinicioconf() {
        return dtinicioconf;
    }

    public void setDtinicioconf(LocalDate dtinicioconf) {
        this.dtinicioconf = dtinicioconf;
    }

    public LocalDate getDtfimconf() {
        return dtfimconf;
    }

    public void setDtfimconf(LocalDate dtfimconf) {
        this.dtfimconf = dtfimconf;
    }

    public Integer getCodfuncconf() {
        return codfuncconf;
    }

    public void setCodfuncconf(Integer codfuncconf) {
        this.codfuncconf = codfuncconf;
    }

    public Integer getCodfuncembal() {
        return codfuncembal;
    }

    public void setCodfuncembal(Integer codfuncembal) {
        this.codfuncembal = codfuncembal;
    }

    public BigDecimal getQtunitemb() {
        return qtunitemb;
    }

    public void setQtunitemb(BigDecimal qtunitemb) {
        this.qtunitemb = qtunitemb;
    }

    public BigDecimal getVlfreteRateio() {
        return vlfreteRateio;
    }

    public void setVlfreteRateio(BigDecimal vlfreteRateio) {
        this.vlfreteRateio = vlfreteRateio;
    }

    public BigDecimal getVloutrasRateio() {
        return vloutrasRateio;
    }

    public void setVloutrasRateio(BigDecimal vloutrasRateio) {
        this.vloutrasRateio = vloutrasRateio;
    }

    public String getNumlotefab() {
        return numlotefab;
    }

    public void setNumlotefab(String numlotefab) {
        this.numlotefab = numlotefab;
    }

    public String getGeraicmslivrofiscal() {
        return geraicmslivrofiscal;
    }

    public void setGeraicmslivrofiscal(String geraicmslivrofiscal) {
        this.geraicmslivrofiscal = geraicmslivrofiscal;
    }

    public String getTrgpclote() {
        return trgpclote;
    }

    public void setTrgpclote(String trgpclote) {
        this.trgpclote = trgpclote;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPericm() {
        return pericm;
    }

    public void setPericm(BigDecimal pericm) {
        this.pericm = pericm;
    }

    public BigDecimal getAliqicmsvigente() {
        return aliqicmsvigente;
    }

    public void setAliqicmsvigente(BigDecimal aliqicmsvigente) {
        this.aliqicmsvigente = aliqicmsvigente;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getTipomercdepto() {
        return tipomercdepto;
    }

    public void setTipomercdepto(String tipomercdepto) {
        this.tipomercdepto = tipomercdepto;
    }

    public String getNbm() {
        return nbm;
    }

    public void setNbm(String nbm) {
        this.nbm = nbm;
    }

    public Boolean getDv() {
        return dv;
    }

    public void setDv(Boolean dv) {
        this.dv = dv;
    }

    public BigDecimal getIvatribut() {
        return ivatribut;
    }

    public void setIvatribut(BigDecimal ivatribut) {
        this.ivatribut = ivatribut;
    }

    public String getCodprodsintegra() {
        return codprodsintegra;
    }

    public void setCodprodsintegra(String codprodsintegra) {
        this.codprodsintegra = codprodsintegra;
    }

    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public String getClassificfiscal() {
        return classificfiscal;
    }

    public void setClassificfiscal(String classificfiscal) {
        this.classificfiscal = classificfiscal;
    }

    public BigDecimal getPesoliq() {
        return pesoliq;
    }

    public void setPesoliq(BigDecimal pesoliq) {
        this.pesoliq = pesoliq;
    }

    public Short getRua() {
        return rua;
    }

    public void setRua(Short rua) {
        this.rua = rua;
    }

    public String getUffornec() {
        return uffornec;
    }

    public void setUffornec(String uffornec) {
        this.uffornec = uffornec;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getPiscofinsretido() {
        return piscofinsretido;
    }

    public void setPiscofinsretido(String piscofinsretido) {
        this.piscofinsretido = piscofinsretido;
    }

    public BigDecimal getPercicmsfretefobst() {
        return percicmsfretefobst;
    }

    public void setPercicmsfretefobst(BigDecimal percicmsfretefobst) {
        this.percicmsfretefobst = percicmsfretefobst;
    }

    public LocalDate getDtapuracao() {
        return dtapuracao;
    }

    public void setDtapuracao(LocalDate dtapuracao) {
        this.dtapuracao = dtapuracao;
    }

    public LocalDate getDtexportacaowms() {
        return dtexportacaowms;
    }

    public void setDtexportacaowms(LocalDate dtexportacaowms) {
        this.dtexportacaowms = dtexportacaowms;
    }

    public Integer getCodfuncexportacaowms() {
        return codfuncexportacaowms;
    }

    public void setCodfuncexportacaowms(Integer codfuncexportacaowms) {
        this.codfuncexportacaowms = codfuncexportacaowms;
    }

    public LocalDate getDtimportacaowms() {
        return dtimportacaowms;
    }

    public void setDtimportacaowms(LocalDate dtimportacaowms) {
        this.dtimportacaowms = dtimportacaowms;
    }

    public Integer getCodfuncimportacaowms() {
        return codfuncimportacaowms;
    }

    public void setCodfuncimportacaowms(Integer codfuncimportacaowms) {
        this.codfuncimportacaowms = codfuncimportacaowms;
    }

    public String getProddescricaocontrato() {
        return proddescricaocontrato;
    }

    public void setProddescricaocontrato(String proddescricaocontrato) {
        this.proddescricaocontrato = proddescricaocontrato;
    }

    public BigDecimal getPercdireitosaduaneiros() {
        return percdireitosaduaneiros;
    }

    public void setPercdireitosaduaneiros(BigDecimal percdireitosaduaneiros) {
        this.percdireitosaduaneiros = percdireitosaduaneiros;
    }

    public BigDecimal getPercimpostoconsumo() {
        return percimpostoconsumo;
    }

    public void setPercimpostoconsumo(BigDecimal percimpostoconsumo) {
        this.percimpostoconsumo = percimpostoconsumo;
    }

    public BigDecimal getPercimpostoselo() {
        return percimpostoselo;
    }

    public void setPercimpostoselo(BigDecimal percimpostoselo) {
        this.percimpostoselo = percimpostoselo;
    }

    public BigDecimal getValordireitosaduaneiros() {
        return valordireitosaduaneiros;
    }

    public void setValordireitosaduaneiros(BigDecimal valordireitosaduaneiros) {
        this.valordireitosaduaneiros = valordireitosaduaneiros;
    }

    public BigDecimal getValorimpostoconsumo() {
        return valorimpostoconsumo;
    }

    public void setValorimpostoconsumo(BigDecimal valorimpostoconsumo) {
        this.valorimpostoconsumo = valorimpostoconsumo;
    }

    public BigDecimal getValorimpostoselo() {
        return valorimpostoselo;
    }

    public void setValorimpostoselo(BigDecimal valorimpostoselo) {
        this.valorimpostoselo = valorimpostoselo;
    }

    public BigDecimal getVlipiporkg() {
        return vlipiporkg;
    }

    public void setVlipiporkg(BigDecimal vlipiporkg) {
        this.vlipiporkg = vlipiporkg;
    }

    public BigDecimal getPercredicms() {
        return percredicms;
    }

    public void setPercredicms(BigDecimal percredicms) {
        this.percredicms = percredicms;
    }

    public BigDecimal getVldifaliquotas() {
        return vldifaliquotas;
    }

    public void setVldifaliquotas(BigDecimal vldifaliquotas) {
        this.vldifaliquotas = vldifaliquotas;
    }

    public BigDecimal getBasedifaliquotas() {
        return basedifaliquotas;
    }

    public void setBasedifaliquotas(BigDecimal basedifaliquotas) {
        this.basedifaliquotas = basedifaliquotas;
    }

    public BigDecimal getPercdifaliquotas() {
        return percdifaliquotas;
    }

    public void setPercdifaliquotas(BigDecimal percdifaliquotas) {
        this.percdifaliquotas = percdifaliquotas;
    }

    public String getGeragnreCnpjcliente() {
        return geragnreCnpjcliente;
    }

    public void setGeragnreCnpjcliente(String geragnreCnpjcliente) {
        this.geragnreCnpjcliente = geragnreCnpjcliente;
    }

    public BigDecimal getPercimpprodutorural() {
        return percimpprodutorural;
    }

    public void setPercimpprodutorural(BigDecimal percimpprodutorural) {
        this.percimpprodutorural = percimpprodutorural;
    }

    public BigDecimal getPercicmsdiferido() {
        return percicmsdiferido;
    }

    public void setPercicmsdiferido(BigDecimal percicmsdiferido) {
        this.percicmsdiferido = percicmsdiferido;
    }

    public BigDecimal getVlicmsdiferido() {
        return vlicmsdiferido;
    }

    public void setVlicmsdiferido(BigDecimal vlicmsdiferido) {
        this.vlicmsdiferido = vlicmsdiferido;
    }

    public Integer getNumcaranterior() {
        return numcaranterior;
    }

    public void setNumcaranterior(Integer numcaranterior) {
        this.numcaranterior = numcaranterior;
    }

    public BigDecimal getVlcofins() {
        return vlcofins;
    }

    public void setVlcofins(BigDecimal vlcofins) {
        this.vlcofins = vlcofins;
    }

    public BigDecimal getPercdescpis() {
        return percdescpis;
    }

    public void setPercdescpis(BigDecimal percdescpis) {
        this.percdescpis = percdescpis;
    }

    public BigDecimal getPercdesccofins() {
        return percdesccofins;
    }

    public void setPercdesccofins(BigDecimal percdesccofins) {
        this.percdesccofins = percdesccofins;
    }

    public BigDecimal getVldescreducaopis() {
        return vldescreducaopis;
    }

    public void setVldescreducaopis(BigDecimal vldescreducaopis) {
        this.vldescreducaopis = vldescreducaopis;
    }

    public BigDecimal getVldescreducaocofins() {
        return vldescreducaocofins;
    }

    public void setVldescreducaocofins(BigDecimal vldescreducaocofins) {
        this.vldescreducaocofins = vldescreducaocofins;
    }

    public BigDecimal getPercom4() {
        return percom4;
    }

    public void setPercom4(BigDecimal percom4) {
        this.percom4 = percom4;
    }

    public String getTipofornec() {
        return tipofornec;
    }

    public void setTipofornec(String tipofornec) {
        this.tipofornec = tipofornec;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getDescricao1() {
        return descricao1;
    }

    public void setDescricao1(String descricao1) {
        this.descricao1 = descricao1;
    }

    public BigDecimal getIvaressarc() {
        return ivaressarc;
    }

    public void setIvaressarc(BigDecimal ivaressarc) {
        this.ivaressarc = ivaressarc;
    }

    public BigDecimal getIcmsressarc() {
        return icmsressarc;
    }

    public void setIcmsressarc(BigDecimal icmsressarc) {
        this.icmsressarc = icmsressarc;
    }

    public String getCalccredipi() {
        return calccredipi;
    }

    public void setCalccredipi(String calccredipi) {
        this.calccredipi = calccredipi;
    }

    public BigDecimal getAliqavulsadare() {
        return aliqavulsadare;
    }

    public void setAliqavulsadare(BigDecimal aliqavulsadare) {
        this.aliqavulsadare = aliqavulsadare;
    }

    public BigDecimal getVlpautaicmsantec() {
        return vlpautaicmsantec;
    }

    public void setVlpautaicmsantec(BigDecimal vlpautaicmsantec) {
        this.vlpautaicmsantec = vlpautaicmsantec;
    }

    public BigDecimal getPercivaicmantecip() {
        return percivaicmantecip;
    }

    public void setPercivaicmantecip(BigDecimal percivaicmantecip) {
        this.percivaicmantecip = percivaicmantecip;
    }

    public BigDecimal getPercaliqinticmantecip() {
        return percaliqinticmantecip;
    }

    public void setPercaliqinticmantecip(BigDecimal percaliqinticmantecip) {
        this.percaliqinticmantecip = percaliqinticmantecip;
    }

    public BigDecimal getPercaliqexticmantecip() {
        return percaliqexticmantecip;
    }

    public void setPercaliqexticmantecip(BigDecimal percaliqexticmantecip) {
        this.percaliqexticmantecip = percaliqexticmantecip;
    }

    public String getTribfederal() {
        return tribfederal;
    }

    public void setTribfederal(String tribfederal) {
        this.tribfederal = tribfederal;
    }

    public BigDecimal getQtunit() {
        return qtunit;
    }

    public void setQtunit(BigDecimal qtunit) {
        this.qtunit = qtunit;
    }

    public BigDecimal getQtunitcx() {
        return qtunitcx;
    }

    public void setQtunitcx(BigDecimal qtunitcx) {
        this.qtunitcx = qtunitcx;
    }

    public Integer getCodpassefiscal() {
        return codpassefiscal;
    }

    public void setCodpassefiscal(Integer codpassefiscal) {
        this.codpassefiscal = codpassefiscal;
    }

    public String getPasselivre() {
        return passelivre;
    }

    public void setPasselivre(String passelivre) {
        this.passelivre = passelivre;
    }

    public String getTipotributmedic() {
        return tipotributmedic;
    }

    public void setTipotributmedic(String tipotributmedic) {
        this.tipotributmedic = tipotributmedic;
    }

    public Integer getCodfornecprod() {
        return codfornecprod;
    }

    public void setCodfornecprod(Integer codfornecprod) {
        this.codfornecprod = codfornecprod;
    }

    public Integer getCodgenerofiscal() {
        return codgenerofiscal;
    }

    public void setCodgenerofiscal(Integer codgenerofiscal) {
        this.codgenerofiscal = codgenerofiscal;
    }

    public String getTipomerc() {
        return tipomerc;
    }

    public void setTipomerc(String tipomerc) {
        this.tipomerc = tipomerc;
    }

    public BigDecimal getPercinss() {
        return percinss;
    }

    public void setPercinss(BigDecimal percinss) {
        this.percinss = percinss;
    }

    public BigDecimal getVlinss() {
        return vlinss;
    }

    public void setVlinss(BigDecimal vlinss) {
        this.vlinss = vlinss;
    }

    public LocalDate getDtwms() {
        return dtwms;
    }

    public void setDtwms(LocalDate dtwms) {
        this.dtwms = dtwms;
    }

    public BigDecimal getPercomfilialbroker() {
        return percomfilialbroker;
    }

    public void setPercomfilialbroker(BigDecimal percomfilialbroker) {
        this.percomfilialbroker = percomfilialbroker;
    }

    public BigDecimal getPercommot() {
        return percommot;
    }

    public void setPercommot(BigDecimal percommot) {
        this.percommot = percommot;
    }

    public String getTransacaotransferida() {
        return transacaotransferida;
    }

    public void setTransacaotransferida(String transacaotransferida) {
        this.transacaotransferida = transacaotransferida;
    }

    public BigDecimal getPercdespforanf() {
        return percdespforanf;
    }

    public void setPercdespforanf(BigDecimal percdespforanf) {
        this.percdespforanf = percdespforanf;
    }

    public BigDecimal getVldespforanf() {
        return vldespforanf;
    }

    public void setVldespforanf(BigDecimal vldespforanf) {
        this.vldespforanf = vldespforanf;
    }

    public BigDecimal getCustofornec() {
        return custofornec;
    }

    public void setCustofornec(BigDecimal custofornec) {
        this.custofornec = custofornec;
    }

    public BigDecimal getPeracrescimocusto() {
        return peracrescimocusto;
    }

    public void setPeracrescimocusto(BigDecimal peracrescimocusto) {
        this.peracrescimocusto = peracrescimocusto;
    }

    public BigDecimal getVlpautaicms() {
        return vlpautaicms;
    }

    public void setVlpautaicms(BigDecimal vlpautaicms) {
        this.vlpautaicms = vlpautaicms;
    }

    public BigDecimal getBciss() {
        return bciss;
    }

    public void setBciss(BigDecimal bciss) {
        this.bciss = bciss;
    }

    public String getCompraconsignado() {
        return compraconsignado;
    }

    public void setCompraconsignado(String compraconsignado) {
        this.compraconsignado = compraconsignado;
    }

    public String getControlanumserie() {
        return controlanumserie;
    }

    public void setControlanumserie(String controlanumserie) {
        this.controlanumserie = controlanumserie;
    }

    public String getTiposeparacao() {
        return tiposeparacao;
    }

    public void setTiposeparacao(String tiposeparacao) {
        this.tiposeparacao = tiposeparacao;
    }

    public Short getNumvolumesconferencia() {
        return numvolumesconferencia;
    }

    public void setNumvolumesconferencia(Short numvolumesconferencia) {
        this.numvolumesconferencia = numvolumesconferencia;
    }

    public BigDecimal getPercseguro() {
        return percseguro;
    }

    public void setPercseguro(BigDecimal percseguro) {
        this.percseguro = percseguro;
    }

    public BigDecimal getVlseguro() {
        return vlseguro;
    }

    public void setVlseguro(BigDecimal vlseguro) {
        this.vlseguro = vlseguro;
    }

    public BigDecimal getPercdespdentronf() {
        return percdespdentronf;
    }

    public void setPercdespdentronf(BigDecimal percdespdentronf) {
        this.percdespdentronf = percdespdentronf;
    }

    public BigDecimal getVldespdentronf() {
        return vldespdentronf;
    }

    public void setVldespdentronf(BigDecimal vldespdentronf) {
        this.vldespdentronf = vldespdentronf;
    }

    public Short getNumadicao() {
        return numadicao;
    }

    public void setNumadicao(Short numadicao) {
        this.numadicao = numadicao;
    }

    public Short getNumseqadicao() {
        return numseqadicao;
    }

    public void setNumseqadicao(Short numseqadicao) {
        this.numseqadicao = numseqadicao;
    }

    public String getPagtognrenomedoremetente() {
        return pagtognrenomedoremetente;
    }

    public void setPagtognrenomedoremetente(String pagtognrenomedoremetente) {
        this.pagtognrenomedoremetente = pagtognrenomedoremetente;
    }

    public BigDecimal getPerciisuspenso() {
        return perciisuspenso;
    }

    public void setPerciisuspenso(BigDecimal perciisuspenso) {
        this.perciisuspenso = perciisuspenso;
    }

    public String getFundapiano() {
        return fundapiano;
    }

    public void setFundapiano(String fundapiano) {
        this.fundapiano = fundapiano;
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

    public BigDecimal getCustonfsemstant() {
        return custonfsemstant;
    }

    public void setCustonfsemstant(BigDecimal custonfsemstant) {
        this.custonfsemstant = custonfsemstant;
    }

    public BigDecimal getBaseicmsultentant() {
        return baseicmsultentant;
    }

    public void setBaseicmsultentant(BigDecimal baseicmsultentant) {
        this.baseicmsultentant = baseicmsultentant;
    }

    public BigDecimal getPercdescicmsdif() {
        return percdescicmsdif;
    }

    public void setPercdescicmsdif(BigDecimal percdescicmsdif) {
        this.percdescicmsdif = percdescicmsdif;
    }

    public BigDecimal getVldescicmsdif() {
        return vldescicmsdif;
    }

    public void setVldescicmsdif(BigDecimal vldescicmsdif) {
        this.vldescicmsdif = vldescicmsdif;
    }

    public String getAlternativo() {
        return alternativo;
    }

    public void setAlternativo(String alternativo) {
        this.alternativo = alternativo;
    }

    public String getSiglaqualidade() {
        return siglaqualidade;
    }

    public void setSiglaqualidade(String siglaqualidade) {
        this.siglaqualidade = siglaqualidade;
    }

    public BigDecimal getVolumedesejado() {
        return volumedesejado;
    }

    public void setVolumedesejado(BigDecimal volumedesejado) {
        this.volumedesejado = volumedesejado;
    }

    public String getCodbase() {
        return codbase;
    }

    public void setCodbase(String codbase) {
        this.codbase = codbase;
    }

    public String getCodformula() {
        return codformula;
    }

    public void setCodformula(String codformula) {
        this.codformula = codformula;
    }

    public String getUsadebcredrcabrind() {
        return usadebcredrcabrind;
    }

    public void setUsadebcredrcabrind(String usadebcredrcabrind) {
        this.usadebcredrcabrind = usadebcredrcabrind;
    }

    public BigDecimal getPercicmop() {
        return percicmop;
    }

    public void setPercicmop(BigDecimal percicmop) {
        this.percicmop = percicmop;
    }

    public Integer getCoddesconto() {
        return coddesconto;
    }

    public void setCoddesconto(Integer coddesconto) {
        this.coddesconto = coddesconto;
    }

    public String getIssretido() {
        return issretido;
    }

    public void setIssretido(String issretido) {
        this.issretido = issretido;
    }

    public BigDecimal getPercaliqextguia() {
        return percaliqextguia;
    }

    public void setPercaliqextguia(BigDecimal percaliqextguia) {
        this.percaliqextguia = percaliqextguia;
    }

    public BigDecimal getVldifpunitcont() {
        return vldifpunitcont;
    }

    public void setVldifpunitcont(BigDecimal vldifpunitcont) {
        this.vldifpunitcont = vldifpunitcont;
    }

    public Long getCodprodrelev() {
        return codprodrelev;
    }

    public void setCodprodrelev(Long codprodrelev) {
        this.codprodrelev = codprodrelev;
    }

    public Short getCodsittribpiscofins() {
        return codsittribpiscofins;
    }

    public void setCodsittribpiscofins(Short codsittribpiscofins) {
        this.codsittribpiscofins = codsittribpiscofins;
    }

    public Short getCodproddnf() {
        return codproddnf;
    }

    public void setCodproddnf(Short codproddnf) {
        this.codproddnf = codproddnf;
    }

    public Integer getCapvoldnf() {
        return capvoldnf;
    }

    public void setCapvoldnf(Integer capvoldnf) {
        this.capvoldnf = capvoldnf;
    }

    public BigDecimal getFatorconvdnf() {
        return fatorconvdnf;
    }

    public void setFatorconvdnf(BigDecimal fatorconvdnf) {
        this.fatorconvdnf = fatorconvdnf;
    }

    public Long getNumtransitem() {
        return numtransitem;
    }

    public void setNumtransitem(Long numtransitem) {
        this.numtransitem = numtransitem;
    }

    public String getMovimentacontacorrenterca() {
        return movimentacontacorrenterca;
    }

    public void setMovimentacontacorrenterca(String movimentacontacorrenterca) {
        this.movimentacontacorrenterca = movimentacontacorrenterca;
    }

    public String getAplicpercivapauta() {
        return aplicpercivapauta;
    }

    public void setAplicpercivapauta(String aplicpercivapauta) {
        this.aplicpercivapauta = aplicpercivapauta;
    }

    public String getRotinacad() {
        return rotinacad;
    }

    public void setRotinacad(String rotinacad) {
        this.rotinacad = rotinacad;
    }

    public LocalDate getDtdenegada() {
        return dtdenegada;
    }

    public void setDtdenegada(LocalDate dtdenegada) {
        this.dtdenegada = dtdenegada;
    }

    public Long getSeqmov() {
        return seqmov;
    }

    public void setSeqmov(Long seqmov) {
        this.seqmov = seqmov;
    }

    public String getTipoembalagempedido() {
        return tipoembalagempedido;
    }

    public void setTipoembalagempedido(String tipoembalagempedido) {
        this.tipoembalagempedido = tipoembalagempedido;
    }

    public String getAproveitacreditoicms() {
        return aproveitacreditoicms;
    }

    public void setAproveitacreditoicms(String aproveitacreditoicms) {
        this.aproveitacreditoicms = aproveitacreditoicms;
    }

    public String getCalcbcrmanual() {
        return calcbcrmanual;
    }

    public void setCalcbcrmanual(String calcbcrmanual) {
        this.calcbcrmanual = calcbcrmanual;
    }

    public String getCodinterno() {
        return codinterno;
    }

    public void setCodinterno(String codinterno) {
        this.codinterno = codinterno;
    }

    public String getMovestoquegerencial() {
        return movestoquegerencial;
    }

    public void setMovestoquegerencial(String movestoquegerencial) {
        this.movestoquegerencial = movestoquegerencial;
    }

    public String getMovestoquecontabil() {
        return movestoquecontabil;
    }

    public void setMovestoquecontabil(String movestoquecontabil) {
        this.movestoquecontabil = movestoquecontabil;
    }

    public Long getNumtransentorigdesdlote() {
        return numtransentorigdesdlote;
    }

    public void setNumtransentorigdesdlote(Long numtransentorigdesdlote) {
        this.numtransentorigdesdlote = numtransentorigdesdlote;
    }

    public Long getNumtranshistorico() {
        return numtranshistorico;
    }

    public void setNumtranshistorico(Long numtranshistorico) {
        this.numtranshistorico = numtranshistorico;
    }

    public LocalDate getDataconsolidacaoprefat() {
        return dataconsolidacaoprefat;
    }

    public void setDataconsolidacaoprefat(LocalDate dataconsolidacaoprefat) {
        this.dataconsolidacaoprefat = dataconsolidacaoprefat;
    }

    public Long getCoddeposito() {
        return coddeposito;
    }

    public void setCoddeposito(Long coddeposito) {
        this.coddeposito = coddeposito;
    }

    public Integer getCodpromocaomed() {
        return codpromocaomed;
    }

    public void setCodpromocaomed(Integer codpromocaomed) {
        this.codpromocaomed = codpromocaomed;
    }

    public String getPctEstoque() {
        return pctEstoque;
    }

    public void setPctEstoque(String pctEstoque) {
        this.pctEstoque = pctEstoque;
    }

    public LocalDate getDataestoque() {
        return dataestoque;
    }

    public void setDataestoque(LocalDate dataestoque) {
        this.dataestoque = dataestoque;
    }

    public BigDecimal getQtindustria() {
        return qtindustria;
    }

    public void setQtindustria(BigDecimal qtindustria) {
        this.qtindustria = qtindustria;
    }

    public String getDevsimbolica() {
        return devsimbolica;
    }

    public void setDevsimbolica(String devsimbolica) {
        this.devsimbolica = devsimbolica;
    }

    public Integer getNumlista() {
        return numlista;
    }

    public void setNumlista(Integer numlista) {
        this.numlista = numlista;
    }

    public Integer getCodmarca() {
        return codmarca;
    }

    public void setCodmarca(Integer codmarca) {
        this.codmarca = codmarca;
    }

    public BigDecimal getCustoultentfiscal() {
        return custoultentfiscal;
    }

    public void setCustoultentfiscal(BigDecimal custoultentfiscal) {
        this.custoultentfiscal = custoultentfiscal;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}