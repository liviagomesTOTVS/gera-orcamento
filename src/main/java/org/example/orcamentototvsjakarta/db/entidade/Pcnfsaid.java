package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PCNFSAID")
public class Pcnfsaid {
    @EmbeddedId
    private PcnfsaidId id;

    @Column(name = "ESPECIE", length = 2)
    private String especie;

    @Column(name = "SERIE", length = 5)
    private String serie;

    @Column(name = "DTSAIDA", nullable = false)
    private LocalDate dtsaida;

    @Column(name = "VLTOTAL", precision = 12, scale = 2)
    private BigDecimal vltotal;

    @Column(name = "CODCONT", nullable = false, length = 8)
    private String codcont;

    @Column(name = "CODFISCAL", nullable = false)
    private Integer codfiscal;

    @Column(name = "CODCLI", nullable = false)
    private Integer codcli;

    @Column(name = "CAIXA", nullable = false)
    private Integer caixa;

    @Column(name = "CODUSUR", nullable = false)
    private Short codusur;

    @Column(name = "DTENTREGA")
    private LocalDate dtentrega;

    @Column(name = "COMISSAO", precision = 12, scale = 2)
    private BigDecimal comissao;

    @Column(name = "VLTOTGER", precision = 12, scale = 2)
    private BigDecimal vltotger;

    @Column(name = "VLTABELA", precision = 12, scale = 2)
    private BigDecimal vltabela;

    @Column(name = "CODFILIAL", nullable = false, length = 2)
    private String codfilial;

    @Column(name = "VLDESCONTO", precision = 12, scale = 2)
    private BigDecimal vldesconto;

    @Column(name = "TIPOVENDA", nullable = false, length = 2)
    private String tipovenda;

    @Column(name = "OBS", length = 120)
    private String obs;

    @Column(name = "VLCUSTOREAL", precision = 14, scale = 2)
    private BigDecimal vlcustoreal;

    @Column(name = "VLCUSTOFIN", precision = 14, scale = 2)
    private BigDecimal vlcustofin;

    @Column(name = "VLFRETE", precision = 14, scale = 2)
    private BigDecimal vlfrete;

    @Column(name = "VLOUTRASDESP", precision = 14, scale = 2)
    private BigDecimal vloutrasdesp;

    @Column(name = "TOTPESO", precision = 18, scale = 6)
    private BigDecimal totpeso;

    @Column(name = "TOTVOLUME", precision = 18, scale = 6)
    private BigDecimal totvolume;

    @Column(name = "CODPRACA", nullable = false)
    private Integer codpraca;

    @Column(name = "NUMITENS")
    private Short numitens;

    @Column(name = "CODEMITENTE")
    private Integer codemitente;

    @Column(name = "DTCANCEL")
    private LocalDate dtcancel;

    @Column(name = "NUMCAR")
    private Integer numcar;

    @Column(name = "CODCOB", length = 4)
    private String codcob;

    @Column(name = "NUMPED")
    private Long numped;

    @Column(name = "STRIBUT", precision = 14, scale = 2)
    private BigDecimal stribut;

    @Column(name = "ICMSRETIDO", precision = 14, scale = 2)
    private BigDecimal icmsretido;

    @Column(name = "BCST", precision = 14, scale = 2)
    private BigDecimal bcst;

    @Column(name = "CODDEVOL")
    private Short coddevol;

    @Column(name = "NFFORNEC")
    private Long nffornec;

    @Column(name = "CODFORNEC")
    private Integer codfornec;

    @Column(name = "CODDOC", length = 4)
    private String coddoc;

    @Column(name = "CODPLPAG")
    private Short codplpag;

    @Column(name = "CODFUNCCANCEL")
    private Integer codfunccancel;

    @Column(name = "NUMTAB")
    private Short numtab;

    @Column(name = "NUMSEQ")
    private Long numseq;

    @Column(name = "CODSUPERVISOR")
    private Short codsupervisor;

    @Column(name = "CONDVENDA")
    private Integer condvenda;

    @Column(name = "VLDEVOLUCAO", precision = 14, scale = 2)
    private BigDecimal vldevolucao;

    @Column(name = "VLBASEIPI", precision = 14, scale = 2)
    private BigDecimal vlbaseipi;

    @Column(name = "VLIPI", precision = 12, scale = 2)
    private BigDecimal vlipi;

    @Column(name = "VLICMSANTECIPADO", precision = 12, scale = 2)
    private BigDecimal vlicmsantecipado;

    @Column(name = "CODEPTO")
    private Integer codepto;

    @Column(name = "VLTOTALNF", precision = 12, scale = 2)
    private BigDecimal vltotalnf;

    @Column(name = "CODFILIALNF", length = 2)
    private String codfilialnf;

    @Column(name = "UF", length = 2)
    private String uf;

    @Column(name = "VLBASE", precision = 12, scale = 2)
    private BigDecimal vlbase;

    @Column(name = "VLICMS", precision = 12, scale = 2)
    private BigDecimal vlicms;

    @Column(name = "VLISENTAS", precision = 12, scale = 2)
    private BigDecimal vlisentas;

    @Column(name = "VLOUTRAS", precision = 12, scale = 2)
    private BigDecimal vloutras;

    @Column(name = "NUMIDF", length = 30)
    private String numidf;

    @Column(name = "NUMFORMULARIO")
    private Long numformulario;

    @Column(name = "VLCUSTOREP", precision = 14, scale = 2)
    private BigDecimal vlcustorep;

    @Column(name = "VLCUSTOCONT", precision = 14, scale = 2)
    private BigDecimal vlcustocont;

    @Column(name = "DTDEVOL")
    private LocalDate dtdevol;

    @Column(name = "NUMSELONF")
    private Long numselonf;

    @Column(name = "NUMSEQMONTAGEM")
    private Short numseqmontagem;

    @Column(name = "NUMVOLUME")
    private Integer numvolume;

    @Column(name = "NUMCUPOM")
    private Long numcupom;

    @Column(name = "VLRECEBIDODIN", precision = 10, scale = 2)
    private BigDecimal vlrecebidodin;

    @Column(name = "VLRECEBIDOCH", precision = 10, scale = 2)
    private BigDecimal vlrecebidoch;

    @Column(name = "VLRECEBIDOBOLETO", precision = 10, scale = 2)
    private BigDecimal vlrecebidoboleto;

    @Column(name = "VLTROCO", precision = 10, scale = 2)
    private BigDecimal vltroco;

    @Column(name = "CODFUNCLIBENT")
    private Integer codfunclibent;

    @Column(name = "DTLIBENT")
    private LocalDate dtlibent;

    @Column(name = "VLDESCPROM", precision = 12, scale = 2)
    private BigDecimal vldescprom;

    @Column(name = "NUMVIAS")
    private Short numvias;

    @Column(name = "CODCONTRATO")
    private Integer codcontrato;

    @Column(name = "FRETEDESPACHO", length = 1)
    private String fretedespacho;

    @Column(name = "FRETEREDESPACHO", length = 1)
    private String freteredespacho;

    @Column(name = "CODFORNECFRETE")
    private Integer codfornecfrete;

    @Column(name = "VLRECEBIDOCARTAO", precision = 12, scale = 2)
    private BigDecimal vlrecebidocartao;

    @Column(name = "NUMTRANSVENDAORIGEM")
    private Long numtransvendaorigem;

    @Column(name = "CODFUNCLANC")
    private Integer codfunclanc;

    @Column(name = "DTCANHOTO")
    private LocalDate dtcanhoto;

    @Column(name = "NUMTRANSVENDADESTINO")
    private Long numtransvendadestino;

    @Column(name = "CODUSUR3")
    private Short codusur3;

    @Column(name = "CODUSUR2")
    private Short codusur2;

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

    @Column(name = "DTWMS")
    private LocalDate dtwms;

    @Column(name = "PRAZOMEDIO")
    private Short prazomedio;

    @Column(name = "PRAZOADICIONAL")
    private Short prazoadicional;

    @Column(name = "VLFRETENF", precision = 12, scale = 2)
    private BigDecimal vlfretenf;

    @Column(name = "CODSUPERVISOR2")
    private Short codsupervisor2;

    @Column(name = "CODSUPERVISOR3")
    private Short codsupervisor3;

    @Column(name = "COMISSAO2", precision = 12, scale = 2)
    private BigDecimal comissao2;

    @Column(name = "COMISSAO3", precision = 12, scale = 2)
    private BigDecimal comissao3;

    @Column(name = "VLISS", precision = 18, scale = 6)
    private BigDecimal vliss;

    @Column(name = "NUMLANCCP")
    private Integer numlanccp;

    @ColumnDefault("'N'")
    @Column(name = "PRAZOPONDERADO", length = 1)
    private String prazoponderado;

    @Column(name = "NUMNFTRANSF")
    private Long numnftransf;

    @Column(name = "SERIEECF", length = 2)
    private String serieecf;

    @Column(name = "NUMSERIEEQUIP", length = 30)
    private String numserieequip;

    @Column(name = "VLBONIFIC", precision = 16, scale = 3)
    private BigDecimal vlbonific;

    @Column(name = "BCSTGNRE", precision = 14, scale = 2)
    private BigDecimal bcstgnre;

    @Column(name = "ICMSRETIDOGNRE", precision = 14, scale = 2)
    private BigDecimal icmsretidognre;

    @Column(name = "TIPODEVOL", length = 2)
    private String tipodevol;

    @Column(name = "CODCLINF")
    private Integer codclinf;

    @Column(name = "VLIR", precision = 18, scale = 6)
    private BigDecimal vlir;

    @Column(name = "PERCFRETE", precision = 8, scale = 4)
    private BigDecimal percfrete;

    @Column(name = "NUMREGIAOFRETE")
    private Short numregiaofrete;

    @Column(name = "CODCONDICAOVENDA")
    private Integer codcondicaovenda;

    @Column(name = "TOTVLDESCFIN", precision = 18, scale = 6)
    private BigDecimal totvldescfin;

    @Column(name = "TOTVLDESCCOM", precision = 18, scale = 6)
    private BigDecimal totvldesccom;

    @Column(name = "TOTVLBONIFIC", precision = 18, scale = 6)
    private BigDecimal totvlbonific;

    @Column(name = "TOTVLDESCFLEX", precision = 18, scale = 6)
    private BigDecimal totvldescflex;

    @Column(name = "TOTVLREDCOMISS", precision = 18, scale = 6)
    private BigDecimal totvlredcomiss;

    @Column(name = "NUMVIASPU")
    private Short numviaspu;

    @Column(name = "NUMORCA")
    private Long numorca;

    @Column(name = "COMISSAOSUP", precision = 18, scale = 6)
    private BigDecimal comissaosup;

    @Column(name = "TOTVLREDCOMISSSUP", precision = 18, scale = 6)
    private BigDecimal totvlredcomisssup;

    @Column(name = "DTEMISSAONFFORNEC")
    private LocalDate dtemissaonffornec;

    @Column(name = "TIPOFRETE", length = 1)
    private String tipofrete;

    @Column(name = "BROKER", length = 1)
    private String broker;

    @Column(name = "PERBASEREDOUTRASDESP", precision = 8, scale = 2)
    private BigDecimal perbaseredoutrasdesp;

    @Column(name = "NUMCAIXAFISCAL")
    private Short numcaixafiscal;

    @Column(name = "DTHORACHEGADA")
    private LocalDate dthorachegada;

    @Column(name = "DTHORASAIDA")
    private LocalDate dthorasaida;

    @Column(name = "KMFINALENTREGA", precision = 12, scale = 2)
    private BigDecimal kmfinalentrega;

    @Column(name = "VLPIS", precision = 18, scale = 6)
    private BigDecimal vlpis;

    @Column(name = "PERDESCFIN", precision = 12, scale = 6)
    private BigDecimal perdescfin;

    @Column(name = "CODCLIRECEBEDOR")
    private Integer codclirecebedor;

    @Column(name = "NUMREGIAO")
    private Short numregiao;

    @Column(name = "NUMORCAFILIAL")
    private Long numorcafilial;

    @Column(name = "APRESENTOUCUPOMPROMOCAO", length = 1)
    private String apresentoucupompromocao;

    @Column(name = "NSU")
    private Long nsu;

    @Column(name = "DTNSU")
    private LocalDate dtnsu;

    @Column(name = "RESERVARITENSTV7", length = 1)
    private String reservaritenstv7;

    @Column(name = "NUMPREVENDA")
    private Long numprevenda;

    @Column(name = "GERACAORAZAOAUXILIAR", length = 1)
    private String geracaorazaoauxiliar;

    @Column(name = "DTPGTOCAMPANHA")
    private LocalDate dtpgtocampanha;

    @Column(name = "NUMECF")
    private Long numecf;

    @ColumnDefault("'N'")
    @Column(name = "GERACP", length = 1)
    private String geracp;

    @Column(name = "VLVERBACMVCLI", precision = 18, scale = 6)
    private BigDecimal vlverbacmvcli;

    @Column(name = "DTEXPORTACAOSERVINT")
    private LocalDate dtexportacaoservint;

    @Column(name = "EXPORTADOSERVINT", length = 1)
    private String exportadoservint;

    @Column(name = "IMPORTADOSERVPRINC", length = 1)
    private String importadoservprinc;

    @Column(name = "DTIMPORTACAOSERVPRINC")
    private LocalDate dtimportacaoservprinc;

    @Column(name = "NUMTRANSVENDAECF")
    private Long numtransvendaecf;

    @Column(name = "CHAVENFE", length = 45)
    private String chavenfe;

    @Column(name = "SITUACAONFE")
    private Long situacaonfe;

    @Column(name = "PROTOCOLONFE", length = 16)
    private String protocolonfe;

    @Column(name = "DTHORANFE")
    private LocalDate dthoranfe;

    @Column(name = "IEENT", length = 15)
    private String ieent;

    @Column(name = "NUMLOTENFE", length = 15)
    private String numlotenfe;

    @Column(name = "PERCCOMPROFISSIONAL", precision = 8, scale = 4)
    private BigDecimal perccomprofissional;

    @ColumnDefault("'1'")
    @Column(name = "TIPOEMISSAO", length = 1)
    private String tipoemissao;

    @Column(name = "ENVIADA", length = 1)
    private String enviada;

    @Column(name = "CODCONSIGNATARIOFRETE")
    private Integer codconsignatariofrete;

    @Column(name = "CODEXPORTADOR")
    private Integer codexportador;

    @Column(name = "UFDESEMBARACO", length = 2)
    private String ufdesembaraco;

    @Column(name = "LOCALDESEMBARACO", length = 30)
    private String localdesembaraco;

    @Column(name = "CODREMETENTEFRETE")
    private Integer codremetentefrete;

    @Column(name = "CODDESTINATARIOFRETE")
    private Integer coddestinatariofrete;

    @Column(name = "CODVEICULO")
    private Short codveiculo;

    @Column(name = "CODMOTORISTA")
    private Integer codmotorista;

    @Column(name = "CODPRACADESTFRETE")
    private Integer codpracadestfrete;

    @Column(name = "OBSCONHECFRETE", length = 400)
    private String obsconhecfrete;

    @Column(name = "VLSECCAT", precision = 18, scale = 6)
    private BigDecimal vlseccat;

    @Column(name = "VLDESPACHO", precision = 18, scale = 6)
    private BigDecimal vldespacho;

    @Column(name = "VLLTR", precision = 18, scale = 6)
    private BigDecimal vlltr;

    @Column(name = "VLPEDAGIO", precision = 18, scale = 6)
    private BigDecimal vlpedagio;

    @Column(name = "VLSEGURO", precision = 18, scale = 6)
    private BigDecimal vlseguro;

    @Column(name = "TENTATIVAENVIONFE")
    private Short tentativaenvionfe;

    @Column(name = "CLIENTE", length = 60)
    private String cliente;

    @Column(name = "CGC", length = 18)
    private String cgc;

    @Column(name = "IE", length = 15)
    private String ie;

    @Column(name = "TIPOFJ", length = 1)
    private String tipofj;

    @Column(name = "CONSUMIDORFINAL", length = 1)
    private String consumidorfinal;

    @Column(name = "CODATV1")
    private Integer codatv1;

    @Column(name = "CODPAIS")
    private Integer codpais;

    @Column(name = "DESCPAIS", length = 60)
    private String descpais;

    @Column(name = "CGCFILIAL", length = 14)
    private String cgcfilial;

    @Column(name = "IEFILIAL", length = 20)
    private String iefilial;

    @Column(name = "UFFILIAL", length = 2)
    private String uffilial;

    @Column(name = "AGREGARSTPRODSINTEGRA", length = 1)
    private String agregarstprodsintegra;

    @Column(name = "TIPOALIQOUTRASDESP", length = 1)
    private String tipoaliqoutrasdesp;

    @Column(name = "IESUBSTTRIBUT", length = 20)
    private String iesubsttribut;

    @Column(name = "UFCODIGO", length = 2)
    private String ufcodigo;

    @Column(name = "HISTORICO", length = 1)
    private String historico;

    @Column(name = "SUBSERIE", length = 2)
    private String subserie;

    @Column(name = "ESPECIEVOLUME", length = 100)
    private String especievolume;

    @Column(name = "MARCARVOLUME", length = 100)
    private String marcarvolume;

    @Column(name = "USAINTEGRACAOWMS", length = 1)
    private String usaintegracaowms;

    @Column(name = "ENVIADANFE", length = 1)
    private String enviadanfe;

    @Column(name = "AUTENTPGTOGNRE", length = 200)
    private String autentpgtognre;

    @Column(name = "BANCOPGTOGNRE", length = 50)
    private String bancopgtognre;

    @Column(name = "AGENCIAPGTOGNRE", length = 30)
    private String agenciapgtognre;

    @Column(name = "VENDAASSISTIDA", length = 1)
    private String vendaassistida;

    @Column(name = "CODEMITENTEPEDIDO")
    private Integer codemitentepedido;

    @Column(name = "ALIQUOTA", precision = 7, scale = 2)
    private BigDecimal aliquota;

    @Column(name = "NUMOP")
    private Integer numop;

    @Column(name = "NUMCARANTERIOR")
    private Integer numcaranterior;

    @Column(name = "CODUSUR4")
    private Integer codusur4;

    @Column(name = "COMISSAO4", precision = 12, scale = 2)
    private BigDecimal comissao4;

    @Column(name = "CLIENTEFONTEST", length = 1)
    private String clientefontest;

    @Column(name = "ORGAOPUB", length = 1)
    private String orgaopub;

    @Column(name = "TRANSPORTADORA", length = 60)
    private String transportadora;

    @Column(name = "CODCLIFILIAL")
    private Integer codclifilial;

    @Column(name = "CGCFRETE", length = 18)
    private String cgcfrete;

    @Column(name = "IEFRETE", length = 15)
    private String iefrete;

    @Column(name = "UFFRETE", length = 2)
    private String uffrete;

    @Column(name = "VLPAUTAFRETE", precision = 12, scale = 2)
    private BigDecimal vlpautafrete;

    @Column(name = "COBRANCA", length = 30)
    private String cobranca;

    @Column(name = "ENDERECO", length = 40)
    private String endereco;

    @Column(name = "BAIRRO", length = 40)
    private String bairro;

    @Column(name = "MUNICIPIO", length = 30)
    private String municipio;

    @Column(name = "CEP", length = 10)
    private String cep;

    @Column(name = "SULFRAMA", length = 15)
    private String sulframa;

    @Column(name = "CODMUNICIPIO")
    private Long codmunicipio;

    @Column(name = "PLACAVEIC", length = 10)
    private String placaveic;

    @Column(name = "CODCONTCLI")
    private Long codcontcli;

    @Column(name = "CODIBGE")
    private Long codibge;

    @Column(name = "TIPOEMPRESA", length = 4)
    private String tipoempresa;

    @Column(name = "CODFISCALFRETE")
    private Short codfiscalfrete;

    @Column(name = "PERCICMFRETE", precision = 4, scale = 2)
    private BigDecimal percicmfrete;

    @Column(name = "CODFISCALOUTRASDESP")
    private Short codfiscaloutrasdesp;

    @Column(name = "ALIQICMOUTRASDESP", precision = 4, scale = 2)
    private BigDecimal aliqicmoutrasdesp;

    @Column(name = "ATACADISTA", length = 1)
    private String atacadista;

    @Column(name = "VLINSS", precision = 18, scale = 6)
    private BigDecimal vlinss;

    @Column(name = "PROTOCOLONFECAN", length = 16)
    private String protocolonfecan;

    @Column(name = "PROTOCOLONFEAUTO", length = 16)
    private String protocolonfeauto;

    @Column(name = "COMISSAOMOT", precision = 12, scale = 2)
    private BigDecimal comissaomot;

    @Column(name = "DTPAGCOMISSAOPROF")
    private LocalDate dtpagcomissaoprof;

    @Column(name = "DTLANCTO")
    private LocalDate dtlancto;

    @Column(name = "RECARGA", length = 1)
    private String recarga;

    @Column(name = "NUMCONTRATO")
    private Integer numcontrato;

    @Column(name = "DTFECHACCRCA")
    private LocalDate dtfechaccrca;

    @Column(name = "CONTRIBUINTE", length = 1)
    private String contribuinte;

    @Column(name = "DTCANCELWMS")
    private LocalDate dtcancelwms;

    @Column(name = "VLCOFINS", precision = 18, scale = 6)
    private BigDecimal vlcofins;

    @Column(name = "CODFISCALNF")
    private Integer codfiscalnf;

    @Column(name = "VLDESPDENTRONF", precision = 14, scale = 2)
    private BigDecimal vldespdentronf;

    @Column(name = "DTHORAAUTORIZACAOSEFAZ")
    private LocalDate dthoraautorizacaosefaz;

    @Column(name = "RECIBONFE", length = 20)
    private String recibonfe;

    @Column(name = "LOTEDPEC", length = 20)
    private String lotedpec;

    @Column(name = "RECIBODPEC", length = 20)
    private String recibodpec;

    @Column(name = "AMBIENTE", length = 1)
    private String ambiente;

    @Column(name = "PROTOCOLOCANCELAMENTO", length = 20)
    private String protocolocancelamento;

    @Column(name = "DTHORACANCELAMENTOSEFAZ")
    private LocalDate dthoracancelamentosefaz;

    @Column(name = "DTFECHA")
    private LocalDate dtfecha;

    @Column(name = "DTHORARECIBODPEC")
    private LocalDate dthorarecibodpec;

    @Column(name = "NUMTRANSVENDACONHEC", precision = 14, scale = 2)
    private BigDecimal numtransvendaconhec;

    @Lob
    @Column(name = "OBSNFE")
    private String obsnfe;

    @Column(name = "TOTDIFALIQUOTAS", precision = 14, scale = 2)
    private BigDecimal totdifaliquotas;

    @Column(name = "VLFRETERETIDO", precision = 14, scale = 2)
    private BigDecimal vlfreteretido;

    @Column(name = "VLSTFRETERETIDO", precision = 14, scale = 2)
    private BigDecimal vlstfreteretido;

    @Column(name = "PERCFRETERETIDO", precision = 8, scale = 4)
    private BigDecimal percfreteretido;

    @Column(name = "PERCSTFRETERETIDO", precision = 8, scale = 4)
    private BigDecimal percstfreteretido;

    @Column(name = "PRAZO1")
    private Short prazo1;

    @Column(name = "PRAZO2")
    private Short prazo2;

    @Column(name = "PRAZO3")
    private Short prazo3;

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

    @Column(name = "VENDATRIANGULAR", length = 1)
    private String vendatriangular;

    @Column(name = "SITUACAOCTE")
    private Long situacaocte;

    @Column(name = "RECIBOCTE", length = 20)
    private String recibocte;

    @Column(name = "PROTOCOLOCTE", length = 16)
    private String protocolocte;

    @Column(name = "CHAVECTE", length = 44)
    private String chavecte;

    @Column(name = "NUMLOTECTE", length = 15)
    private String numlotecte;

    @Column(name = "DTA_HORAENVIOSEFAZ")
    private LocalDate dtaHoraenviosefaz;

    @Column(name = "AMBIENTECTE", length = 1)
    private String ambientecte;

    @Column(name = "AMBIENTENFE", length = 1)
    private String ambientenfe;

    @Column(name = "NUMSEQENTREGA")
    private Long numseqentrega;

    @Column(name = "HORAEMISSAO", length = 8)
    private String horaemissao;

    @Column(name = "CONTADORCUPOMFISCAL")
    private Integer contadorcupomfiscal;

    @Column(name = "CODPRODPREDOMINANTE")
    private Integer codprodpredominante;

    @Column(name = "DTLIBERACAOENTREGA")
    private LocalDate dtliberacaoentrega;

    @Column(name = "CODFUNCLIBERACAOENTREGA")
    private Integer codfuncliberacaoentrega;

    @Column(name = "TOTPESOLIQ", precision = 18, scale = 6)
    private BigDecimal totpesoliq;

    @Column(name = "TOTPESOAGRUPADO", precision = 18, scale = 6)
    private BigDecimal totpesoagrupado;

    @Column(name = "TOTPESOLIQAGRUPADO", precision = 18, scale = 6)
    private BigDecimal totpesoliqagrupado;

    @Column(name = "TOTVOLUMEAGRUPADO", precision = 18, scale = 6)
    private BigDecimal totvolumeagrupado;

    @Column(name = "JUSTIFICATIVACONTIGENCIA", length = 256)
    private String justificativacontigencia;

    @Column(name = "DTAHORAENTRADACONTIGENCIA")
    private LocalDate dtahoraentradacontigencia;

    @Column(name = "CUSTOBONIFICACAO", length = 1)
    private String custobonificacao;

    @Column(name = "CODFORNECBONIFIC")
    private Integer codfornecbonific;

    @Column(name = "CODBNF")
    private Short codbnf;

    @Column(name = "TOTPESOBRUTO", precision = 18, scale = 6)
    private BigDecimal totpesobruto;

    @Column(name = "DTSAIDANF")
    private LocalDate dtsaidanf;

    @Column(name = "OBSEXP", length = 200)
    private String obsexp;

    @Column(name = "CONTAORDEM", length = 1)
    private String contaordem;

    @Column(name = "CNPJCISP", length = 8)
    private String cnpjcisp;

    @Column(name = "CONSUMIUNUMNFE", length = 1)
    private String consumiunumnfe;

    @Column(name = "DTHORACTE")
    private LocalDate dthoracte;

    @Column(name = "TENTATIVAENVIOCTE")
    private Long tentativaenviocte;

    @Column(name = "PROTOCOLOCANCELAMENTOCTE", length = 20)
    private String protocolocancelamentocte;

    @Column(name = "CODFORNECREDESPACHO")
    private Integer codfornecredespacho;

    @Column(name = "EMAILFRETE", length = 100)
    private String emailfrete;

    @Column(name = "EMAILFRETEREDESPACHO", length = 100)
    private String emailfreteredespacho;

    @ColumnDefault("'N'")
    @Column(name = "CONFERIDO", length = 1)
    private String conferido;

    @Column(name = "VALORST", precision = 12, scale = 2)
    private BigDecimal valorst;

    @Column(name = "MENSAGEMPISCOFINS", length = 4000)
    private String mensagempiscofins;

    @Column(name = "DATAEMPENHO")
    private LocalDate dataempenho;

    @Column(name = "CODUNIDADEEXECUTORA", length = 20)
    private String codunidadeexecutora;

    @Column(name = "VLDESCICMS", precision = 14, scale = 2)
    private BigDecimal vldescicms;

    @Column(name = "VLTOTALSEMDESCICMS", precision = 12, scale = 2)
    private BigDecimal vltotalsemdescicms;

    @Column(name = "NUMEMPENHO", length = 40)
    private String numempenho;

    @Column(name = "OBSPISCOFINS", length = 500)
    private String obspiscofins;

    @Column(name = "VLBASEPISCOFINS", precision = 12, scale = 2)
    private BigDecimal vlbasepiscofins;

    @Column(name = "PERPIS", precision = 8, scale = 4)
    private BigDecimal perpis;

    @Column(name = "PERCOFINS", precision = 8, scale = 4)
    private BigDecimal percofins;

    @Column(name = "CODSITTRIBPISCOFINS")
    private Short codsittribpiscofins;

    @Column(name = "SITDOC", length = 2)
    private String sitdoc;

    @Column(name = "DTEXPORTACAOWMS")
    private LocalDate dtexportacaowms;

    @Column(name = "DTIMPORTACAOWMS")
    private LocalDate dtimportacaowms;

    @Column(name = "NFATUALWMS", length = 1)
    private String nfatualwms;

    @Column(name = "FINALIDADENFE", length = 2)
    private String finalidadenfe;

    @Column(name = "EMAILDEST", length = 100)
    private String emaildest;

    @Column(name = "TELEFONE", length = 20)
    private String telefone;

    @Column(name = "NUMENDERECO", length = 6)
    private String numendereco;

    @Column(name = "SERIEORIGINAL", length = 3)
    private String serieoriginal;

    @Column(name = "DESPESASRATEADA", length = 1)
    private String despesasrateada;

    @Column(name = "NUMTRANSENTORIGEM")
    private Long numtransentorigem;

    @Column(name = "FORNECENTREGA", length = 1)
    private String fornecentrega;

    @Column(name = "UFPLACAVEIC", length = 2)
    private String ufplacaveic;

    @Column(name = "MOTORISTAVEICULO", length = 40)
    private String motoristaveiculo;

    @Column(name = "CONSUMIUNUMCTE", length = 1)
    private String consumiunumcte;

    @Column(name = "UTILIZAIPICALCICMS", length = 1)
    private String utilizaipicalcicms;

    @Column(name = "NUMOS")
    private Integer numos;

    @Column(name = "WMSCODFUNCIGNORA")
    private Integer wmscodfuncignora;

    @Column(name = "WMSIGNORADO", length = 1)
    private String wmsignorado;

    @Column(name = "PISRETIDO", length = 1)
    private String pisretido;

    @Column(name = "INSSRETIDO", length = 1)
    private String inssretido;

    @Column(name = "IRRRETIDO", length = 1)
    private String irrretido;

    @Column(name = "NUMTRANSENTDEST")
    private Long numtransentdest;

    @Column(name = "PROTOCOLO", length = 50)
    private String protocolo;

    @Column(name = "CODVEICULO1")
    private Short codveiculo1;

    @Column(name = "CODVEICULO2")
    private Short codveiculo2;

    @Column(name = "COFINSRETIDO", length = 1)
    private String cofinsretido;

    @Column(name = "CSLLRETIDO", length = 1)
    private String csllretido;

    @Column(name = "GERARBCRNFE", length = 1)
    private String gerarbcrnfe;

    @Column(name = "NUMCARGAEDI")
    private Integer numcargaedi;

    @Column(name = "DEPOSITOFECHADO", length = 1)
    private String depositofechado;

    @Column(name = "OBSNFCARREG")
    private String obsnfcarreg;

    @Column(name = "TIPOEMISSAOCTE", length = 2)
    private String tipoemissaocte;

    @Column(name = "DTEMISSAODECLARACAO")
    private LocalDate dtemissaodeclaracao;

    @Column(name = "DTDENEGADA")
    private LocalDate dtdenegada;

    @Column(name = "ENTREGA", length = 1)
    private String entrega;

    @Column(name = "TAXAENTREGA", precision = 14, scale = 2)
    private BigDecimal taxaentrega;

    @Column(name = "UFPLACAVEI", length = 2)
    private String ufplacavei;

    @Column(name = "NORMAREGESPECIAL", length = 250)
    private String normaregespecial;

    @Column(name = "DTFAT")
    private LocalDate dtfat;

    @Column(name = "CODGERENTE")
    private Short codgerente;

    @Column(name = "NUMPEDCLI", length = 15)
    private String numpedcli;

    @Column(name = "DEVSIMBOLICA", length = 1)
    private String devsimbolica;

    @Column(name = "VLIPIOUTRAS", precision = 18, scale = 6)
    private BigDecimal vlipioutras;

    @Column(name = "VLDESCABATIMENTO", precision = 18, scale = 6)
    private BigDecimal vldescabatimento;

    @Column(name = "MOTESTORNONFE", length = 250)
    private String motestornonfe;

    @Column(name = "NATOPERNFE", length = 60)
    private String natopernfe;

    @Column(name = "VENDAEXPORTACAO", length = 1)
    private String vendaexportacao;

    @Column(name = "ENVIADOEMAILCANCELADO", length = 1)
    private String enviadoemailcancelado;

    @Column(name = "GERANFVENDA", length = 1)
    private String geranfvenda;

    @Column(name = "NUMCONTRATOCARRETEIRO", length = 20)
    private String numcontratocarreteiro;

    @Column(name = "NUMLISTA")
    private Integer numlista;

    @ColumnDefault("SYS_GUID()")
    @Column(name = "IDINTEGRACAOMYFROTA")
    private byte[] idintegracaomyfrota;

    @Column(name = "NUMTRANSVENDATV13")
    private Long numtransvendatv13;

    @Column(name = "SITUACAONFEORIG")
    private Long situacaonfeorig;

    @Column(name = "CODMEDICOPRESCRIT")
    private Integer codmedicoprescrit;

    @Column(name = "NUMPEDVANXML", length = 20)
    private String numpedvanxml;

    @Column(name = "CNPJFORNEC", length = 18)
    private String cnpjfornec;

    @Column(name = "NUMCOMPROVANTE")
    private Long numcomprovante;

    @Column(name = "CNPJRESPONSAVEL", length = 18)
    private String cnpjresponsavel;

    @Column(name = "INUTILIZADA", length = 1)
    private String inutilizada;

    @Column(name = "AGREGASTVLMERC", length = 1)
    private String agregastvlmerc;

    @Column(name = "RESPSEGURO")
    private Boolean respseguro;

    @Column(name = "NOMESEGURADORA", length = 30)
    private String nomeseguradora;

    @Column(name = "NUMEROAPOLICE", length = 20)
    private String numeroapolice;

    @Column(name = "NUMEROAVERBACAO", length = 40)
    private String numeroaverbacao;

    @Column(name = "SIMPLESNACIONAL", length = 1)
    private String simplesnacional;

    @Column(name = "VLRAVERBACAO", precision = 13, scale = 2)
    private BigDecimal vlraverbacao;

    @Column(name = "VLTRIBUTOS", precision = 14, scale = 2)
    private BigDecimal vltributos;

    @Column(name = "CARTAODOTZ", length = 18)
    private String cartaodotz;

    @Column(name = "CNPJCOLETA", length = 18)
    private String cnpjcoleta;

    @Column(name = "RAZAOSOCIALCOLETA", length = 60)
    private String razaosocialcoleta;

    @Column(name = "LOGRADOUROCOLETA", length = 60)
    private String logradourocoleta;

    @Column(name = "NUMEROCOLETA", length = 60)
    private String numerocoleta;

    @Column(name = "COMPLEMENTOCOLETA", length = 60)
    private String complementocoleta;

    @Column(name = "BAIRROCOLETA", length = 60)
    private String bairrocoleta;

    @Column(name = "CODCIDADECOLETA")
    private Integer codcidadecoleta;

    @Column(name = "CNPJFORNECPEDAGIO", length = 18)
    private String cnpjfornecpedagio;

    @Column(name = "NUMVALEPEDAGIO", length = 20)
    private String numvalepedagio;

    @Column(name = "CPNJRESPONSAVELPEDAGIO", length = 18)
    private String cpnjresponsavelpedagio;

    @Column(name = "VALORPEDAGIO", precision = 13, scale = 2)
    private BigDecimal valorpedagio;

    @Column(name = "NUMTRANSCTEANUL")
    private Long numtranscteanul;

    @Column(name = "NUMTRANSCTESUBS")
    private Long numtransctesubs;

    @Column(name = "CHAVECTEREF", length = 45)
    private String chavecteref;

    @Column(name = "CNPJCPFCTEREF", length = 18)
    private String cnpjcpfcteref;

    @Column(name = "IECTEREF", length = 20)
    private String iecteref;

    @Column(name = "RAZAOSOCIALCTEREF", length = 60)
    private String razaosocialcteref;

    @Column(name = "TIPODOCCTEREF", length = 2)
    private String tipodoccteref;

    @Column(name = "SERIEDOCCTEREF", length = 3)
    private String seriedoccteref;

    @Column(name = "SUBSERIEDOCCTEREF", length = 2)
    private String subseriedoccteref;

    @Column(name = "NUMDOCCTEREF", length = 20)
    private String numdoccteref;

    @Column(name = "DTEMISSAOCTEREF")
    private LocalDate dtemissaocteref;

    @Column(name = "ORGAOPUBFEDERAL", length = 1)
    private String orgaopubfederal;

    @Column(name = "ORGAOPUBMUNICIPAL", length = 1)
    private String orgaopubmunicipal;

    @Column(name = "NSUSOCIOTORCEDOR", length = 15)
    private String nsusociotorcedor;

    @Column(name = "CNPJCPFEMITENTESUB", length = 14)
    private String cnpjcpfemitentesub;

    @Column(name = "MODELODOCSUB", length = 2)
    private String modelodocsub;

    @Column(name = "SERIEDOCSUB", length = 3)
    private String seriedocsub;

    @Column(name = "SUBSERIEDOCSUB", length = 3)
    private String subseriedocsub;

    @Column(name = "NUMERODOCSUB")
    private Long numerodocsub;

    @Column(name = "VALORDOCSUB", precision = 13, scale = 2)
    private BigDecimal valordocsub;

    @Column(name = "DTEMISSAODOCSUB")
    private LocalDate dtemissaodocsub;

    @Column(name = "CHAVECTETOMADORSUB", length = 45)
    private String chavectetomadorsub;

    @Column(name = "CHAVECTEANULACAO", length = 45)
    private String chavecteanulacao;

    @Column(name = "CHAVECTESUBSTITUICAO", length = 45)
    private String chavectesubstituicao;

    @Column(name = "CHAVENFETOMADORSUB", length = 45)
    private String chavenfetomadorsub;

    @Column(name = "TIPODOCUMENTOSUB", length = 3)
    private String tipodocumentosub;

    @Column(name = "UFCTEREF", length = 2)
    private String ufcteref;

    @Column(name = "VERSAOROTINA", length = 20)
    private String versaorotina;

    @Column(name = "VLDESCSOCIOTORCEDOR", precision = 18, scale = 2)
    private BigDecimal vldescsociotorcedor;

    @Column(name = "IDTIPOPRESENCA", length = 2)
    private String idtipopresenca;

    @Column(name = "DTPAGDOTZ")
    private LocalDate dtpagdotz;

    @Column(name = "ROTINACADCTE", length = 48)
    private String rotinacadcte;

    @Column(name = "VLBONIFICACERTO", precision = 14, scale = 2)
    private BigDecimal vlbonificacerto;

    @Column(name = "NUMREGEXP")
    private Long numregexp;

    @Column(name = "NUMCHAVEEXP", length = 44)
    private String numchaveexp;

    @Column(name = "NUMDRAWBACK")
    private Long numdrawback;

    @Column(name = "VLSUBTOTAL", precision = 18, scale = 2)
    private BigDecimal vlsubtotal;

    @Column(name = "IDLOCALDESTMERC", length = 1)
    private String idlocaldestmerc;

    @Column(name = "CODPRODNFAJUSTE", length = 60)
    private String codprodnfajuste;

    @Column(name = "DESCRICAOPRODNFAJUSTE", length = 120)
    private String descricaoprodnfajuste;

    @Column(name = "NCMNFAJUSTE", length = 8)
    private String ncmnfajuste;

    @Column(name = "UNIDADENFAJUSTE", length = 6)
    private String unidadenfajuste;

    @Column(name = "VLTOTBRUTOPRODAJUSTE", precision = 18, scale = 2)
    private BigDecimal vltotbrutoprodajuste;

    @Column(name = "OBSNFAJUSTE", length = 1000)
    private String obsnfajuste;

    @Column(name = "CTECODTRANSPSUBCONTRATANTE")
    private Integer ctecodtranspsubcontratante;

    @Column(name = "CTECODVEICULOSUBCONTRATANTE")
    private Integer ctecodveiculosubcontratante;

    @Column(name = "CTECODTOMADORSERVICO")
    private Integer ctecodtomadorservico;

    @Column(name = "CTECODTRANSPSUBCONTRATADO")
    private Integer ctecodtranspsubcontratado;

    @Column(name = "CTESUBCONTRATADOCHAVECTEREF", length = 45)
    private String ctesubcontratadochavecteref;

    @Column(name = "CODFORNECFRETECTEREF")
    private Integer codfornecfretecteref;

    @Column(name = "CODRECEBFRETECTEREF")
    private Integer codrecebfretecteref;

    @Column(name = "TIPOSERVICOCTE", length = 1)
    private String tiposervicocte;

    @Column(name = "TIPOSUBCONTRATACAOCTE", length = 1)
    private String tiposubcontratacaocte;

    @Column(name = "TIPOPRESENCAADQUIRINTE", length = 1)
    private String tipopresencaadquirinte;

    @Column(name = "DOCEMISSAO", length = 2)
    private String docemissao;

    @Column(name = "VLGRIS", precision = 12, scale = 2)
    private BigDecimal vlgris;

    @Column(name = "VLDESPPEDAGIO", precision = 12, scale = 2)
    private BigDecimal vldesppedagio;

    @Column(name = "VLTAS", precision = 12, scale = 2)
    private BigDecimal vltas;

    @Column(name = "NUMFECHAMENTOMOVCX")
    private Long numfechamentomovcx;

    @Column(name = "DTMOVIMENTOCX")
    private LocalDate dtmovimentocx;

    @Column(name = "IDENTIFICARCLIENTENFCE", length = 1)
    private String identificarclientenfce;

    @Column(name = "MD5LISTAARQ", length = 300)
    private String md5listaarq;

    @Column(name = "VENDANFSERIED", length = 1)
    private String vendanfseried;

    @Column(name = "SELO", length = 20)
    private String selo;

    @Column(name = "NUMREMESSA")
    private Long numremessa;

    @Column(name = "TIPOMOVGARANTIA")
    private Short tipomovgarantia;

    @Column(name = "FORMULARIO")
    private Long formulario;

    @Column(name = "NUMNOTAMANIF")
    private Long numnotamanif;

    @Column(name = "ORIGEMFRETE", length = 1)
    private String origemfrete;

    @Column(name = "NUMCIRURGIA")
    private Long numcirurgia;

    @Column(name = "UTILIZAEXPDIVERSOS", length = 1)
    private String utilizaexpdiversos;

    @Column(name = "SITUACAONFEEPEC")
    private Short situacaonfeepec;

    @Column(name = "PROTOCOLONFEEPEC", length = 15)
    private String protocolonfeepec;

    @Column(name = "DATAHORAREGISTROEPEC")
    private LocalDate datahoraregistroepec;

    @Column(name = "NUMTRANSENTORIGCONSIG")
    private Long numtransentorigconsig;

    @Column(name = "NUMSERIESAT", length = 13)
    private String numseriesat;

    @Column(name = "CHAVESAT", length = 400)
    private String chavesat;

    @Column(name = "SITUACAOSAT", length = 2)
    private String situacaosat;

    @ColumnDefault("'S'")
    @Column(name = "EMISSNUMAUTOMATICO", length = 1)
    private String emissnumautomatico;

    @Column(name = "DATAHORAEMISSAOSAT")
    private LocalDate datahoraemissaosat;

    @Column(name = "QRCODESAT", length = 4000)
    private String qrcodesat;

    @Column(name = "QRCODENFCE", length = 500)
    private String qrcodenfce;

    @Column(name = "VLDESCFIN", precision = 18, scale = 6)
    private BigDecimal vldescfin;

    @Column(name = "PERDESCFINTOT", precision = 18, scale = 6)
    private BigDecimal perdescfintot;

    @Column(name = "HORAENTREGA")
    private Short horaentrega;

    @Column(name = "MINUTOENTREGA")
    private Short minutoentrega;

    @Column(name = "HORASAIDA")
    private Short horasaida;

    @Column(name = "MINUTOSAIDA")
    private Short minutosaida;

    @Column(name = "DTPAGCOMISSAO")
    private LocalDate dtpagcomissao;

    @Column(name = "VLBOLETO", precision = 14, scale = 2)
    private BigDecimal vlboleto;

    @Column(name = "NUMTRANSENTNFESTORNADA")
    private Long numtransentnfestornada;

    @Column(name = "NOTADUPLIQUESVC", length = 1)
    private String notadupliquesvc;

    @Column(name = "TIPOINSCPRESTSERV")
    private Boolean tipoinscprestserv;

    @Column(name = "INDICPRESTSERV")
    private Boolean indicprestserv;

    @Column(name = "NUMTRANSENTDEPENDENTE")
    private Long numtransentdependente;

    @Column(name = "NUMTRANSVENDADEPENDENTE")
    private Long numtransvendadependente;

    @Column(name = "ROTINACAD", length = 48)
    private String rotinacad;

    @Column(name = "NOMEARQUIVODOTZ", length = 100)
    private String nomearquivodotz;

    @Column(name = "NOMEARQUIVODOTZESTORNO", length = 100)
    private String nomearquivodotzestorno;

    @Column(name = "PONTOSDOTZ")
    private Integer pontosdotz;

    @Column(name = "VLBASERETENCAO", precision = 18, scale = 6)
    private BigDecimal vlbaseretencao;

    @Column(name = "CODRETENCAOCPRB")
    private Boolean codretencaocprb;

    @Column(name = "CODSTATUSSAT")
    private Long codstatussat;

    @Column(name = "NUMVIASGNRE")
    private Short numviasgnre;

    @Column(name = "QTDEREPROCNFE")
    private Integer qtdereprocnfe;

    @ColumnDefault("'N'")
    @Column(name = "CTEREGIMEESPECIAL", length = 1)
    private String cteregimeespecial;

    @Column(name = "NFDEVENTFUTURA", length = 1)
    private String nfdeventfutura;

    @Column(name = "TRANSFDEP", length = 1)
    private String transfdep;

    @Column(name = "TIPOTRANSFENTREDEPOSITO", length = 1)
    private String tipotransfentredeposito;

    @Column(name = "UIDREGISTRO")
    private Long uidregistro;

    @Column(name = "IDPARCEIRO", length = 15)
    private String idparceiro;

    @Column(name = "ASSINATURA", length = 100)
    private String assinatura;

    @Column(name = "IMPRIMIUDACTEJUNTODANFE", length = 1)
    private String imprimiudactejuntodanfe;

    @Column(name = "NUMNOTAVINCULADA")
    private Long numnotavinculada;

    @Column(name = "DTPAGCOMISSAOOP")
    private LocalDate dtpagcomissaoop;

    @Column(name = "TIPODOCARRECGNRE", length = 1)
    private String tipodocarrecgnre;

    @Column(name = "UFBENEFICIARIA", length = 2)
    private String ufbeneficiaria;

    @Column(name = "NUMDOCARREC")
    private String numdocarrec;

    @Column(name = "CODAUTENTICACAO")
    private String codautenticacao;

    @Column(name = "VLDOCARRECADACAO", precision = 20, scale = 6)
    private BigDecimal vldocarrecadacao;

    @Column(name = "DTVENCARREC")
    private LocalDate dtvencarrec;

    @Column(name = "DTPAGARREC")
    private LocalDate dtpagarrec;

    @Column(name = "VLOPERACAOFRETE", precision = 14, scale = 2)
    private BigDecimal vloperacaofrete;

    @Column(name = "VLBASESTFRETE", precision = 14, scale = 2)
    private BigDecimal vlbasestfrete;

    @Column(name = "VLICMSSTFRETE", precision = 14, scale = 2)
    private BigDecimal vlicmsstfrete;

    @Column(name = "CTEGLOBALIZADO", length = 1)
    private String cteglobalizado;

    @Column(name = "TOMADORCTE")
    private Boolean tomadorcte;

    @Column(name = "VLCSLL", precision = 18, scale = 6)
    private BigDecimal vlcsll;

    @Column(name = "CNPJSEGURADORA", length = 14)
    private String cnpjseguradora;

    @Column(name = "INFGLOBALIZADO", length = 256)
    private String infglobalizado;

    @ColumnDefault("'0'")
    @Column(name = "QTDEREPROCCTE")
    private Integer qtdereproccte;

    @Column(name = "PERCENTUALSTFRETE", precision = 14, scale = 2)
    private BigDecimal percentualstfrete;

    @Column(name = "CODEDITAL")
    private Integer codedital;

    @Column(name = "USAMULTUNIDITEM", length = 1)
    private String usamultuniditem;

    @Column(name = "CONDFINANC", length = 9)
    private String condfinanc;

    @Column(name = "FIL_MONTARKITAUTOMATICAMENTE", length = 1)
    private String filMontarkitautomaticamente;

    @Column(name = "NUMNOTAORIGEM")
    private Long numnotaorigem;

    @Column(name = "PLANOSUPPLI")
    private Short planosuppli;

    @Column(name = "PAGCHEQUEMORADIA", length = 1)
    private String pagchequemoradia;

    @Column(name = "TIPOREMESSA", length = 1)
    private String tiporemessa;

    @Column(name = "CODTRANSPAUTONOMO")
    private Long codtranspautonomo;

    @Column(name = "VLTRANSPAUTONOMO", precision = 18, scale = 6)
    private BigDecimal vltranspautonomo;

    @Column(name = "TRANSPAUTONOMO", length = 1)
    private String transpautonomo;

    @Column(name = "GERARCPTRANSPAUNOTOMO", length = 1)
    private String gerarcptranspaunotomo;

    @Column(name = "CODFORNECTRANSPAUTONOMO")
    private Long codfornectranspautonomo;

    @Column(name = "CODCOBSEFAZ", length = 4)
    private String codcobsefaz;

    @Column(name = "DIGITOVERIFICADORNFSE", length = 100)
    private String digitoverificadornfse;

    @Column(name = "LINKNFSE", length = 100)
    private String linknfse;

    @Column(name = "PROTOCOLONFSE", length = 16)
    private String protocolonfse;

    @Column(name = "SERIERPS", length = 3)
    private String serierps;

    @Column(name = "NUMERORPS")
    private Long numerorps;

    @Column(name = "SITUACAONFSE")
    private Long situacaonfse;

    @Column(name = "NUMNOTANFSE")
    private Long numnotanfse;

    @Column(name = "MD5PAF", length = 200)
    private String md5paf;

    @Column(name = "CODPLPAGETICO")
    private Short codplpagetico;

    @Column(name = "CODPLPAGGENERICO")
    private Short codplpaggenerico;

    @Column(name = "CODPROMOCAOMED")
    private Integer codpromocaomed;

    @Column(name = "VLPUNITMED", precision = 12, scale = 2)
    private BigDecimal vlpunitmed;

    @Column(name = "VLTOTALFCPST", precision = 18, scale = 6)
    private BigDecimal vltotalfcpst;

    @Column(name = "VLTOTALFCPICMS", precision = 18, scale = 6)
    private BigDecimal vltotalfcpicms;

    @Column(name = "VLFRETEOUTRASDESP", precision = 14, scale = 2)
    private BigDecimal vlfreteoutrasdesp;

    @Column(name = "VLTOTALNFCOMPOEMCTE", precision = 22, scale = 6)
    private BigDecimal vltotalnfcompoemcte;

    @Column(name = "DEDUZIRDESONERORGAOPUB", length = 1)
    private String deduzirdesonerorgaopub;

    @Column(name = "TIPOCONTACORRENTE", length = 1)
    private String tipocontacorrente;

    @Column(name = "NUMEROPROCESSO", length = 14)
    private String numeroprocesso;

    @Column(name = "TIPOPROCESSO", length = 1)
    private String tipoprocesso;

    @Column(name = "CODIGOINDICATIVOSUSPENSAO", length = 14)
    private String codigoindicativosuspensao;

    @Column(name = "MATERIALDECONSTRUCAO", length = 1)
    private String materialdeconstrucao;

    @Column(name = "DEDUZIRICMSBASEPISCOFINS", length = 1)
    private String deduziricmsbasepiscofins;

    @Column(name = "CODMUNINICTE")
    private Integer codmuninicte;

    @Column(name = "CODMUNFIMCTE")
    private Integer codmunfimcte;

    @Column(name = "VLCREDICMSPRESUMIDO", precision = 12, scale = 2)
    private BigDecimal vlcredicmspresumido;

    @Column(name = "DATACONSOLIDACAOPREFAT")
    private LocalDate dataconsolidacaoprefat;

    @Column(name = "VERSAOLAYOUTNFE", length = 5)
    private String versaolayoutnfe;

    @Lob
    @Column(name = "OBSNFEFISCO")
    private String obsnfefisco;

    @Column(name = "PCT_ESTOQUE", length = 1)
    private String pctEstoque;

    @Column(name = "PCT_CUSTO", length = 1)
    private String pctCusto;

    @Column(name = "CODDEVEDORCTE")
    private Integer coddevedorcte;

    @Column(name = "VLSERVICOFRETEAUTON", precision = 10, scale = 2)
    private BigDecimal vlservicofreteauton;

    @Column(name = "VLBASEFRETEAUTON", precision = 10, scale = 2)
    private BigDecimal vlbasefreteauton;

    @Column(name = "ALIQICMFRETEAUTON", precision = 10, scale = 2)
    private BigDecimal aliqicmfreteauton;

    @Column(name = "VLICMFRETEAUTON", precision = 10, scale = 2)
    private BigDecimal vlicmfreteauton;

    @Column(name = "CODFISCALFRETEAUTON")
    private Integer codfiscalfreteauton;

    @Column(name = "CODMUNICIPFATGERADOR")
    private Long codmunicipfatgerador;

    @Column(name = "NUMNOTAPREF")
    private Long numnotapref;

    @Column(name = "STBCR", precision = 18, scale = 6)
    private BigDecimal stbcr;

    @Column(name = "SOMAREPASSEOUTRASDESPNF", length = 1)
    private String somarepasseoutrasdespnf;

    @ColumnDefault("'N'")
    @Column(name = "NFIPIEMITIDA", length = 1)
    private String nfipiemitida;

    @Column(name = "APROVEITASTDEVFORNEC", length = 1)
    private String aproveitastdevfornec;

    @Column(name = "INDICADORDESCONTO", length = 1)
    private String indicadordesconto;

    @Column(name = "INDICADORACRESCIMO", length = 1)
    private String indicadoracrescimo;

    @Column(name = "CODCOORDENADOR")
    private Long codcoordenador;

    @Column(name = "CODGERENTENACIONAL")
    private Short codgerentenacional;

    @Column(name = "CODDIRETOR")
    private Short coddiretor;

    @Column(name = "CODGERENTEREGIONAL")
    private Short codgerenteregional;

    @Column(name = "USASRVTERCEIROS", length = 1)
    private String usasrvterceiros;

    @Column(name = "ENVIADASEMRESPOSTA", length = 1)
    private String enviadasemresposta;

    @Column(name = "PEDIDOAVARIA", length = 1)
    private String pedidoavaria;

    @Column(name = "NUMTRANSENTCROSSDOCK")
    private Long numtransentcrossdock;

    @Column(name = "IDSOFITVIEW", length = 10)
    private String idsofitview;

    @Column(name = "DTEXCLUSAOSOFITVIEW")
    private Instant dtexclusaosofitview;

    @Column(name = "QRCODE", length = 1000)
    private String qrcode;

    @Column(name = "CODPROFISSIONAL")
    private Integer codprofissional;

    @Column(name = "NUMTRANSENTORIGTV10")
    private Long numtransentorigtv10;

    @ColumnDefault("'N'")
    @Column(name = "REDUZICMSDOCTE", length = 1)
    private String reduzicmsdocte;

    @Column(name = "VLJUROSPARCELAMENTO", precision = 18, scale = 2)
    private BigDecimal vljurosparcelamento;

    @Column(name = "PCT_ESTOQUE_CANCELAMENTO", length = 1)
    private String pctEstoqueCancelamento;

    @Column(name = "PCT_CUSTO_CANCELAMENTO", length = 1)
    private String pctCustoCancelamento;

    @Column(name = "NUMCIOT", length = 20)
    private String numciot;

    @Column(name = "NFBRINDEZERADA", length = 1)
    private String nfbrindezerada;

    @Column(name = "NFBRINDE", length = 1)
    private String nfbrinde;

    @Column(name = "NUMSESSAOSAT")
    private Long numsessaosat;

    @Column(name = "QTPALETE")
    private Long qtpalete;

    @Column(name = "TOTPESOPALETE", precision = 12, scale = 6)
    private BigDecimal totpesopalete;

    @Column(name = "CODIGONUMERICOCHAVE", length = 8)
    private String codigonumericochave;

    @Column(name = "TIPOIMPRESSAO", length = 1)
    private String tipoimpressao;

    @Column(name = "DEDUZFUNCEPBASEPISCOFINS", length = 1)
    private String deduzfuncepbasepiscofins;

    @Column(name = "CNPJINTERMEDIADOR", length = 20)
    private String cnpjintermediador;

    @Column(name = "DESCINTERMEDIADOR", length = 60)
    private String descintermediador;

    @Column(name = "DESFEZKITCANC", length = 1)
    private String desfezkitcanc;

    @Column(name = "DTEXPWMSSAAS")
    private LocalDate dtexpwmssaas;

    @Column(name = "CALCDESONERACAOFATMEDICAM", length = 1)
    private String calcdesoneracaofatmedicam;

    @Column(name = "NUMTRANSPAGDIGITAL", length = 50)
    private String numtranspagdigital;

    @Column(name = "GERARCPCT", length = 1)
    private String gerarcpct;

    @Column(name = "GERARCRCT", length = 1)
    private String gerarcrct;

    @Column(name = "CODSEFAZSAT")
    private Long codsefazsat;

    @Column(name = "GEROUGRNE", length = 50)
    private String gerougrne;

    @Column(name = "VOLTARESTOQUEFILIALVIRTUAL", length = 1)
    private String voltarestoquefilialvirtual;

    @Column(name = "VOLTARESTOQUEFILIALRETIRA", length = 1)
    private String voltarestoquefilialretira;

    @Column(name = "TIPOPRESTACAO", length = 1)
    private String tipoprestacao;

    @Column(name = "NUMCOLETA", length = 20)
    private String numcoleta;

    @Column(name = "IDEXTERNOCOLETAENTREGA", length = 40)
    private String idexternocoletaentrega;

    @Column(name = "SITUACAOCOLETAENTREGA", length = 40)
    private String situacaocoletaentrega;

    @Column(name = "DTENTGACOLETAENTREGA")
    private LocalDate dtentgacoletaentrega;

    @Column(name = "DTULTALTOCOLETAENTREGA")
    private LocalDate dtultaltocoletaentrega;

    @Column(name = "CTESIMPLIFICADO", length = 1)
    private String ctesimplificado;

    @Column(name = "VLFRETETRANSPORTARNF", precision = 14, scale = 2)
    private BigDecimal vlfretetransportarnf;

    public PcnfsaidId getId() {
        return id;
    }

    public void setId(PcnfsaidId id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public LocalDate getDtsaida() {
        return dtsaida;
    }

    public void setDtsaida(LocalDate dtsaida) {
        this.dtsaida = dtsaida;
    }

    public BigDecimal getVltotal() {
        return vltotal;
    }

    public void setVltotal(BigDecimal vltotal) {
        this.vltotal = vltotal;
    }

    public String getCodcont() {
        return codcont;
    }

    public void setCodcont(String codcont) {
        this.codcont = codcont;
    }

    public Integer getCodfiscal() {
        return codfiscal;
    }

    public void setCodfiscal(Integer codfiscal) {
        this.codfiscal = codfiscal;
    }

    public Integer getCodcli() {
        return codcli;
    }

    public void setCodcli(Integer codcli) {
        this.codcli = codcli;
    }

    public Integer getCaixa() {
        return caixa;
    }

    public void setCaixa(Integer caixa) {
        this.caixa = caixa;
    }

    public Short getCodusur() {
        return codusur;
    }

    public void setCodusur(Short codusur) {
        this.codusur = codusur;
    }

    public LocalDate getDtentrega() {
        return dtentrega;
    }

    public void setDtentrega(LocalDate dtentrega) {
        this.dtentrega = dtentrega;
    }

    public BigDecimal getComissao() {
        return comissao;
    }

    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
    }

    public BigDecimal getVltotger() {
        return vltotger;
    }

    public void setVltotger(BigDecimal vltotger) {
        this.vltotger = vltotger;
    }

    public BigDecimal getVltabela() {
        return vltabela;
    }

    public void setVltabela(BigDecimal vltabela) {
        this.vltabela = vltabela;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public BigDecimal getVldesconto() {
        return vldesconto;
    }

    public void setVldesconto(BigDecimal vldesconto) {
        this.vldesconto = vldesconto;
    }

    public String getTipovenda() {
        return tipovenda;
    }

    public void setTipovenda(String tipovenda) {
        this.tipovenda = tipovenda;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public BigDecimal getVlcustoreal() {
        return vlcustoreal;
    }

    public void setVlcustoreal(BigDecimal vlcustoreal) {
        this.vlcustoreal = vlcustoreal;
    }

    public BigDecimal getVlcustofin() {
        return vlcustofin;
    }

    public void setVlcustofin(BigDecimal vlcustofin) {
        this.vlcustofin = vlcustofin;
    }

    public BigDecimal getVlfrete() {
        return vlfrete;
    }

    public void setVlfrete(BigDecimal vlfrete) {
        this.vlfrete = vlfrete;
    }

    public BigDecimal getVloutrasdesp() {
        return vloutrasdesp;
    }

    public void setVloutrasdesp(BigDecimal vloutrasdesp) {
        this.vloutrasdesp = vloutrasdesp;
    }

    public BigDecimal getTotpeso() {
        return totpeso;
    }

    public void setTotpeso(BigDecimal totpeso) {
        this.totpeso = totpeso;
    }

    public BigDecimal getTotvolume() {
        return totvolume;
    }

    public void setTotvolume(BigDecimal totvolume) {
        this.totvolume = totvolume;
    }

    public Integer getCodpraca() {
        return codpraca;
    }

    public void setCodpraca(Integer codpraca) {
        this.codpraca = codpraca;
    }

    public Short getNumitens() {
        return numitens;
    }

    public void setNumitens(Short numitens) {
        this.numitens = numitens;
    }

    public Integer getCodemitente() {
        return codemitente;
    }

    public void setCodemitente(Integer codemitente) {
        this.codemitente = codemitente;
    }

    public LocalDate getDtcancel() {
        return dtcancel;
    }

    public void setDtcancel(LocalDate dtcancel) {
        this.dtcancel = dtcancel;
    }

    public Integer getNumcar() {
        return numcar;
    }

    public void setNumcar(Integer numcar) {
        this.numcar = numcar;
    }

    public String getCodcob() {
        return codcob;
    }

    public void setCodcob(String codcob) {
        this.codcob = codcob;
    }

    public Long getNumped() {
        return numped;
    }

    public void setNumped(Long numped) {
        this.numped = numped;
    }

    public BigDecimal getStribut() {
        return stribut;
    }

    public void setStribut(BigDecimal stribut) {
        this.stribut = stribut;
    }

    public BigDecimal getIcmsretido() {
        return icmsretido;
    }

    public void setIcmsretido(BigDecimal icmsretido) {
        this.icmsretido = icmsretido;
    }

    public BigDecimal getBcst() {
        return bcst;
    }

    public void setBcst(BigDecimal bcst) {
        this.bcst = bcst;
    }

    public Short getCoddevol() {
        return coddevol;
    }

    public void setCoddevol(Short coddevol) {
        this.coddevol = coddevol;
    }

    public Long getNffornec() {
        return nffornec;
    }

    public void setNffornec(Long nffornec) {
        this.nffornec = nffornec;
    }

    public Integer getCodfornec() {
        return codfornec;
    }

    public void setCodfornec(Integer codfornec) {
        this.codfornec = codfornec;
    }

    public String getCoddoc() {
        return coddoc;
    }

    public void setCoddoc(String coddoc) {
        this.coddoc = coddoc;
    }

    public Short getCodplpag() {
        return codplpag;
    }

    public void setCodplpag(Short codplpag) {
        this.codplpag = codplpag;
    }

    public Integer getCodfunccancel() {
        return codfunccancel;
    }

    public void setCodfunccancel(Integer codfunccancel) {
        this.codfunccancel = codfunccancel;
    }

    public Short getNumtab() {
        return numtab;
    }

    public void setNumtab(Short numtab) {
        this.numtab = numtab;
    }

    public Long getNumseq() {
        return numseq;
    }

    public void setNumseq(Long numseq) {
        this.numseq = numseq;
    }

    public Short getCodsupervisor() {
        return codsupervisor;
    }

    public void setCodsupervisor(Short codsupervisor) {
        this.codsupervisor = codsupervisor;
    }

    public Integer getCondvenda() {
        return condvenda;
    }

    public void setCondvenda(Integer condvenda) {
        this.condvenda = condvenda;
    }

    public BigDecimal getVldevolucao() {
        return vldevolucao;
    }

    public void setVldevolucao(BigDecimal vldevolucao) {
        this.vldevolucao = vldevolucao;
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

    public BigDecimal getVlicmsantecipado() {
        return vlicmsantecipado;
    }

    public void setVlicmsantecipado(BigDecimal vlicmsantecipado) {
        this.vlicmsantecipado = vlicmsantecipado;
    }

    public Integer getCodepto() {
        return codepto;
    }

    public void setCodepto(Integer codepto) {
        this.codepto = codepto;
    }

    public BigDecimal getVltotalnf() {
        return vltotalnf;
    }

    public void setVltotalnf(BigDecimal vltotalnf) {
        this.vltotalnf = vltotalnf;
    }

    public String getCodfilialnf() {
        return codfilialnf;
    }

    public void setCodfilialnf(String codfilialnf) {
        this.codfilialnf = codfilialnf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public BigDecimal getVlbase() {
        return vlbase;
    }

    public void setVlbase(BigDecimal vlbase) {
        this.vlbase = vlbase;
    }

    public BigDecimal getVlicms() {
        return vlicms;
    }

    public void setVlicms(BigDecimal vlicms) {
        this.vlicms = vlicms;
    }

    public BigDecimal getVlisentas() {
        return vlisentas;
    }

    public void setVlisentas(BigDecimal vlisentas) {
        this.vlisentas = vlisentas;
    }

    public BigDecimal getVloutras() {
        return vloutras;
    }

    public void setVloutras(BigDecimal vloutras) {
        this.vloutras = vloutras;
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

    public BigDecimal getVlcustorep() {
        return vlcustorep;
    }

    public void setVlcustorep(BigDecimal vlcustorep) {
        this.vlcustorep = vlcustorep;
    }

    public BigDecimal getVlcustocont() {
        return vlcustocont;
    }

    public void setVlcustocont(BigDecimal vlcustocont) {
        this.vlcustocont = vlcustocont;
    }

    public LocalDate getDtdevol() {
        return dtdevol;
    }

    public void setDtdevol(LocalDate dtdevol) {
        this.dtdevol = dtdevol;
    }

    public Long getNumselonf() {
        return numselonf;
    }

    public void setNumselonf(Long numselonf) {
        this.numselonf = numselonf;
    }

    public Short getNumseqmontagem() {
        return numseqmontagem;
    }

    public void setNumseqmontagem(Short numseqmontagem) {
        this.numseqmontagem = numseqmontagem;
    }

    public Integer getNumvolume() {
        return numvolume;
    }

    public void setNumvolume(Integer numvolume) {
        this.numvolume = numvolume;
    }

    public Long getNumcupom() {
        return numcupom;
    }

    public void setNumcupom(Long numcupom) {
        this.numcupom = numcupom;
    }

    public BigDecimal getVlrecebidodin() {
        return vlrecebidodin;
    }

    public void setVlrecebidodin(BigDecimal vlrecebidodin) {
        this.vlrecebidodin = vlrecebidodin;
    }

    public BigDecimal getVlrecebidoch() {
        return vlrecebidoch;
    }

    public void setVlrecebidoch(BigDecimal vlrecebidoch) {
        this.vlrecebidoch = vlrecebidoch;
    }

    public BigDecimal getVlrecebidoboleto() {
        return vlrecebidoboleto;
    }

    public void setVlrecebidoboleto(BigDecimal vlrecebidoboleto) {
        this.vlrecebidoboleto = vlrecebidoboleto;
    }

    public BigDecimal getVltroco() {
        return vltroco;
    }

    public void setVltroco(BigDecimal vltroco) {
        this.vltroco = vltroco;
    }

    public Integer getCodfunclibent() {
        return codfunclibent;
    }

    public void setCodfunclibent(Integer codfunclibent) {
        this.codfunclibent = codfunclibent;
    }

    public LocalDate getDtlibent() {
        return dtlibent;
    }

    public void setDtlibent(LocalDate dtlibent) {
        this.dtlibent = dtlibent;
    }

    public BigDecimal getVldescprom() {
        return vldescprom;
    }

    public void setVldescprom(BigDecimal vldescprom) {
        this.vldescprom = vldescprom;
    }

    public Short getNumvias() {
        return numvias;
    }

    public void setNumvias(Short numvias) {
        this.numvias = numvias;
    }

    public Integer getCodcontrato() {
        return codcontrato;
    }

    public void setCodcontrato(Integer codcontrato) {
        this.codcontrato = codcontrato;
    }

    public String getFretedespacho() {
        return fretedespacho;
    }

    public void setFretedespacho(String fretedespacho) {
        this.fretedespacho = fretedespacho;
    }

    public String getFreteredespacho() {
        return freteredespacho;
    }

    public void setFreteredespacho(String freteredespacho) {
        this.freteredespacho = freteredespacho;
    }

    public Integer getCodfornecfrete() {
        return codfornecfrete;
    }

    public void setCodfornecfrete(Integer codfornecfrete) {
        this.codfornecfrete = codfornecfrete;
    }

    public BigDecimal getVlrecebidocartao() {
        return vlrecebidocartao;
    }

    public void setVlrecebidocartao(BigDecimal vlrecebidocartao) {
        this.vlrecebidocartao = vlrecebidocartao;
    }

    public Long getNumtransvendaorigem() {
        return numtransvendaorigem;
    }

    public void setNumtransvendaorigem(Long numtransvendaorigem) {
        this.numtransvendaorigem = numtransvendaorigem;
    }

    public Integer getCodfunclanc() {
        return codfunclanc;
    }

    public void setCodfunclanc(Integer codfunclanc) {
        this.codfunclanc = codfunclanc;
    }

    public LocalDate getDtcanhoto() {
        return dtcanhoto;
    }

    public void setDtcanhoto(LocalDate dtcanhoto) {
        this.dtcanhoto = dtcanhoto;
    }

    public Long getNumtransvendadestino() {
        return numtransvendadestino;
    }

    public void setNumtransvendadestino(Long numtransvendadestino) {
        this.numtransvendadestino = numtransvendadestino;
    }

    public Short getCodusur3() {
        return codusur3;
    }

    public void setCodusur3(Short codusur3) {
        this.codusur3 = codusur3;
    }

    public Short getCodusur2() {
        return codusur2;
    }

    public void setCodusur2(Short codusur2) {
        this.codusur2 = codusur2;
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

    public LocalDate getDtwms() {
        return dtwms;
    }

    public void setDtwms(LocalDate dtwms) {
        this.dtwms = dtwms;
    }

    public Short getPrazomedio() {
        return prazomedio;
    }

    public void setPrazomedio(Short prazomedio) {
        this.prazomedio = prazomedio;
    }

    public Short getPrazoadicional() {
        return prazoadicional;
    }

    public void setPrazoadicional(Short prazoadicional) {
        this.prazoadicional = prazoadicional;
    }

    public BigDecimal getVlfretenf() {
        return vlfretenf;
    }

    public void setVlfretenf(BigDecimal vlfretenf) {
        this.vlfretenf = vlfretenf;
    }

    public Short getCodsupervisor2() {
        return codsupervisor2;
    }

    public void setCodsupervisor2(Short codsupervisor2) {
        this.codsupervisor2 = codsupervisor2;
    }

    public Short getCodsupervisor3() {
        return codsupervisor3;
    }

    public void setCodsupervisor3(Short codsupervisor3) {
        this.codsupervisor3 = codsupervisor3;
    }

    public BigDecimal getComissao2() {
        return comissao2;
    }

    public void setComissao2(BigDecimal comissao2) {
        this.comissao2 = comissao2;
    }

    public BigDecimal getComissao3() {
        return comissao3;
    }

    public void setComissao3(BigDecimal comissao3) {
        this.comissao3 = comissao3;
    }

    public BigDecimal getVliss() {
        return vliss;
    }

    public void setVliss(BigDecimal vliss) {
        this.vliss = vliss;
    }

    public Integer getNumlanccp() {
        return numlanccp;
    }

    public void setNumlanccp(Integer numlanccp) {
        this.numlanccp = numlanccp;
    }

    public String getPrazoponderado() {
        return prazoponderado;
    }

    public void setPrazoponderado(String prazoponderado) {
        this.prazoponderado = prazoponderado;
    }

    public Long getNumnftransf() {
        return numnftransf;
    }

    public void setNumnftransf(Long numnftransf) {
        this.numnftransf = numnftransf;
    }

    public String getSerieecf() {
        return serieecf;
    }

    public void setSerieecf(String serieecf) {
        this.serieecf = serieecf;
    }

    public String getNumserieequip() {
        return numserieequip;
    }

    public void setNumserieequip(String numserieequip) {
        this.numserieequip = numserieequip;
    }

    public BigDecimal getVlbonific() {
        return vlbonific;
    }

    public void setVlbonific(BigDecimal vlbonific) {
        this.vlbonific = vlbonific;
    }

    public BigDecimal getBcstgnre() {
        return bcstgnre;
    }

    public void setBcstgnre(BigDecimal bcstgnre) {
        this.bcstgnre = bcstgnre;
    }

    public BigDecimal getIcmsretidognre() {
        return icmsretidognre;
    }

    public void setIcmsretidognre(BigDecimal icmsretidognre) {
        this.icmsretidognre = icmsretidognre;
    }

    public String getTipodevol() {
        return tipodevol;
    }

    public void setTipodevol(String tipodevol) {
        this.tipodevol = tipodevol;
    }

    public Integer getCodclinf() {
        return codclinf;
    }

    public void setCodclinf(Integer codclinf) {
        this.codclinf = codclinf;
    }

    public BigDecimal getVlir() {
        return vlir;
    }

    public void setVlir(BigDecimal vlir) {
        this.vlir = vlir;
    }

    public BigDecimal getPercfrete() {
        return percfrete;
    }

    public void setPercfrete(BigDecimal percfrete) {
        this.percfrete = percfrete;
    }

    public Short getNumregiaofrete() {
        return numregiaofrete;
    }

    public void setNumregiaofrete(Short numregiaofrete) {
        this.numregiaofrete = numregiaofrete;
    }

    public Integer getCodcondicaovenda() {
        return codcondicaovenda;
    }

    public void setCodcondicaovenda(Integer codcondicaovenda) {
        this.codcondicaovenda = codcondicaovenda;
    }

    public BigDecimal getTotvldescfin() {
        return totvldescfin;
    }

    public void setTotvldescfin(BigDecimal totvldescfin) {
        this.totvldescfin = totvldescfin;
    }

    public BigDecimal getTotvldesccom() {
        return totvldesccom;
    }

    public void setTotvldesccom(BigDecimal totvldesccom) {
        this.totvldesccom = totvldesccom;
    }

    public BigDecimal getTotvlbonific() {
        return totvlbonific;
    }

    public void setTotvlbonific(BigDecimal totvlbonific) {
        this.totvlbonific = totvlbonific;
    }

    public BigDecimal getTotvldescflex() {
        return totvldescflex;
    }

    public void setTotvldescflex(BigDecimal totvldescflex) {
        this.totvldescflex = totvldescflex;
    }

    public BigDecimal getTotvlredcomiss() {
        return totvlredcomiss;
    }

    public void setTotvlredcomiss(BigDecimal totvlredcomiss) {
        this.totvlredcomiss = totvlredcomiss;
    }

    public Short getNumviaspu() {
        return numviaspu;
    }

    public void setNumviaspu(Short numviaspu) {
        this.numviaspu = numviaspu;
    }

    public Long getNumorca() {
        return numorca;
    }

    public void setNumorca(Long numorca) {
        this.numorca = numorca;
    }

    public BigDecimal getComissaosup() {
        return comissaosup;
    }

    public void setComissaosup(BigDecimal comissaosup) {
        this.comissaosup = comissaosup;
    }

    public BigDecimal getTotvlredcomisssup() {
        return totvlredcomisssup;
    }

    public void setTotvlredcomisssup(BigDecimal totvlredcomisssup) {
        this.totvlredcomisssup = totvlredcomisssup;
    }

    public LocalDate getDtemissaonffornec() {
        return dtemissaonffornec;
    }

    public void setDtemissaonffornec(LocalDate dtemissaonffornec) {
        this.dtemissaonffornec = dtemissaonffornec;
    }

    public String getTipofrete() {
        return tipofrete;
    }

    public void setTipofrete(String tipofrete) {
        this.tipofrete = tipofrete;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public BigDecimal getPerbaseredoutrasdesp() {
        return perbaseredoutrasdesp;
    }

    public void setPerbaseredoutrasdesp(BigDecimal perbaseredoutrasdesp) {
        this.perbaseredoutrasdesp = perbaseredoutrasdesp;
    }

    public Short getNumcaixafiscal() {
        return numcaixafiscal;
    }

    public void setNumcaixafiscal(Short numcaixafiscal) {
        this.numcaixafiscal = numcaixafiscal;
    }

    public LocalDate getDthorachegada() {
        return dthorachegada;
    }

    public void setDthorachegada(LocalDate dthorachegada) {
        this.dthorachegada = dthorachegada;
    }

    public LocalDate getDthorasaida() {
        return dthorasaida;
    }

    public void setDthorasaida(LocalDate dthorasaida) {
        this.dthorasaida = dthorasaida;
    }

    public BigDecimal getKmfinalentrega() {
        return kmfinalentrega;
    }

    public void setKmfinalentrega(BigDecimal kmfinalentrega) {
        this.kmfinalentrega = kmfinalentrega;
    }

    public BigDecimal getVlpis() {
        return vlpis;
    }

    public void setVlpis(BigDecimal vlpis) {
        this.vlpis = vlpis;
    }

    public BigDecimal getPerdescfin() {
        return perdescfin;
    }

    public void setPerdescfin(BigDecimal perdescfin) {
        this.perdescfin = perdescfin;
    }

    public Integer getCodclirecebedor() {
        return codclirecebedor;
    }

    public void setCodclirecebedor(Integer codclirecebedor) {
        this.codclirecebedor = codclirecebedor;
    }

    public Short getNumregiao() {
        return numregiao;
    }

    public void setNumregiao(Short numregiao) {
        this.numregiao = numregiao;
    }

    public Long getNumorcafilial() {
        return numorcafilial;
    }

    public void setNumorcafilial(Long numorcafilial) {
        this.numorcafilial = numorcafilial;
    }

    public String getApresentoucupompromocao() {
        return apresentoucupompromocao;
    }

    public void setApresentoucupompromocao(String apresentoucupompromocao) {
        this.apresentoucupompromocao = apresentoucupompromocao;
    }

    public Long getNsu() {
        return nsu;
    }

    public void setNsu(Long nsu) {
        this.nsu = nsu;
    }

    public LocalDate getDtnsu() {
        return dtnsu;
    }

    public void setDtnsu(LocalDate dtnsu) {
        this.dtnsu = dtnsu;
    }

    public String getReservaritenstv7() {
        return reservaritenstv7;
    }

    public void setReservaritenstv7(String reservaritenstv7) {
        this.reservaritenstv7 = reservaritenstv7;
    }

    public Long getNumprevenda() {
        return numprevenda;
    }

    public void setNumprevenda(Long numprevenda) {
        this.numprevenda = numprevenda;
    }

    public String getGeracaorazaoauxiliar() {
        return geracaorazaoauxiliar;
    }

    public void setGeracaorazaoauxiliar(String geracaorazaoauxiliar) {
        this.geracaorazaoauxiliar = geracaorazaoauxiliar;
    }

    public LocalDate getDtpgtocampanha() {
        return dtpgtocampanha;
    }

    public void setDtpgtocampanha(LocalDate dtpgtocampanha) {
        this.dtpgtocampanha = dtpgtocampanha;
    }

    public Long getNumecf() {
        return numecf;
    }

    public void setNumecf(Long numecf) {
        this.numecf = numecf;
    }

    public String getGeracp() {
        return geracp;
    }

    public void setGeracp(String geracp) {
        this.geracp = geracp;
    }

    public BigDecimal getVlverbacmvcli() {
        return vlverbacmvcli;
    }

    public void setVlverbacmvcli(BigDecimal vlverbacmvcli) {
        this.vlverbacmvcli = vlverbacmvcli;
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

    public Long getNumtransvendaecf() {
        return numtransvendaecf;
    }

    public void setNumtransvendaecf(Long numtransvendaecf) {
        this.numtransvendaecf = numtransvendaecf;
    }

    public String getChavenfe() {
        return chavenfe;
    }

    public void setChavenfe(String chavenfe) {
        this.chavenfe = chavenfe;
    }

    public Long getSituacaonfe() {
        return situacaonfe;
    }

    public void setSituacaonfe(Long situacaonfe) {
        this.situacaonfe = situacaonfe;
    }

    public String getProtocolonfe() {
        return protocolonfe;
    }

    public void setProtocolonfe(String protocolonfe) {
        this.protocolonfe = protocolonfe;
    }

    public LocalDate getDthoranfe() {
        return dthoranfe;
    }

    public void setDthoranfe(LocalDate dthoranfe) {
        this.dthoranfe = dthoranfe;
    }

    public String getIeent() {
        return ieent;
    }

    public void setIeent(String ieent) {
        this.ieent = ieent;
    }

    public String getNumlotenfe() {
        return numlotenfe;
    }

    public void setNumlotenfe(String numlotenfe) {
        this.numlotenfe = numlotenfe;
    }

    public BigDecimal getPerccomprofissional() {
        return perccomprofissional;
    }

    public void setPerccomprofissional(BigDecimal perccomprofissional) {
        this.perccomprofissional = perccomprofissional;
    }

    public String getTipoemissao() {
        return tipoemissao;
    }

    public void setTipoemissao(String tipoemissao) {
        this.tipoemissao = tipoemissao;
    }

    public String getEnviada() {
        return enviada;
    }

    public void setEnviada(String enviada) {
        this.enviada = enviada;
    }

    public Integer getCodconsignatariofrete() {
        return codconsignatariofrete;
    }

    public void setCodconsignatariofrete(Integer codconsignatariofrete) {
        this.codconsignatariofrete = codconsignatariofrete;
    }

    public Integer getCodexportador() {
        return codexportador;
    }

    public void setCodexportador(Integer codexportador) {
        this.codexportador = codexportador;
    }

    public String getUfdesembaraco() {
        return ufdesembaraco;
    }

    public void setUfdesembaraco(String ufdesembaraco) {
        this.ufdesembaraco = ufdesembaraco;
    }

    public String getLocaldesembaraco() {
        return localdesembaraco;
    }

    public void setLocaldesembaraco(String localdesembaraco) {
        this.localdesembaraco = localdesembaraco;
    }

    public Integer getCodremetentefrete() {
        return codremetentefrete;
    }

    public void setCodremetentefrete(Integer codremetentefrete) {
        this.codremetentefrete = codremetentefrete;
    }

    public Integer getCoddestinatariofrete() {
        return coddestinatariofrete;
    }

    public void setCoddestinatariofrete(Integer coddestinatariofrete) {
        this.coddestinatariofrete = coddestinatariofrete;
    }

    public Short getCodveiculo() {
        return codveiculo;
    }

    public void setCodveiculo(Short codveiculo) {
        this.codveiculo = codveiculo;
    }

    public Integer getCodmotorista() {
        return codmotorista;
    }

    public void setCodmotorista(Integer codmotorista) {
        this.codmotorista = codmotorista;
    }

    public Integer getCodpracadestfrete() {
        return codpracadestfrete;
    }

    public void setCodpracadestfrete(Integer codpracadestfrete) {
        this.codpracadestfrete = codpracadestfrete;
    }

    public String getObsconhecfrete() {
        return obsconhecfrete;
    }

    public void setObsconhecfrete(String obsconhecfrete) {
        this.obsconhecfrete = obsconhecfrete;
    }

    public BigDecimal getVlseccat() {
        return vlseccat;
    }

    public void setVlseccat(BigDecimal vlseccat) {
        this.vlseccat = vlseccat;
    }

    public BigDecimal getVldespacho() {
        return vldespacho;
    }

    public void setVldespacho(BigDecimal vldespacho) {
        this.vldespacho = vldespacho;
    }

    public BigDecimal getVlltr() {
        return vlltr;
    }

    public void setVlltr(BigDecimal vlltr) {
        this.vlltr = vlltr;
    }

    public BigDecimal getVlpedagio() {
        return vlpedagio;
    }

    public void setVlpedagio(BigDecimal vlpedagio) {
        this.vlpedagio = vlpedagio;
    }

    public BigDecimal getVlseguro() {
        return vlseguro;
    }

    public void setVlseguro(BigDecimal vlseguro) {
        this.vlseguro = vlseguro;
    }

    public Short getTentativaenvionfe() {
        return tentativaenvionfe;
    }

    public void setTentativaenvionfe(Short tentativaenvionfe) {
        this.tentativaenvionfe = tentativaenvionfe;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getTipofj() {
        return tipofj;
    }

    public void setTipofj(String tipofj) {
        this.tipofj = tipofj;
    }

    public String getConsumidorfinal() {
        return consumidorfinal;
    }

    public void setConsumidorfinal(String consumidorfinal) {
        this.consumidorfinal = consumidorfinal;
    }

    public Integer getCodatv1() {
        return codatv1;
    }

    public void setCodatv1(Integer codatv1) {
        this.codatv1 = codatv1;
    }

    public Integer getCodpais() {
        return codpais;
    }

    public void setCodpais(Integer codpais) {
        this.codpais = codpais;
    }

    public String getDescpais() {
        return descpais;
    }

    public void setDescpais(String descpais) {
        this.descpais = descpais;
    }

    public String getCgcfilial() {
        return cgcfilial;
    }

    public void setCgcfilial(String cgcfilial) {
        this.cgcfilial = cgcfilial;
    }

    public String getIefilial() {
        return iefilial;
    }

    public void setIefilial(String iefilial) {
        this.iefilial = iefilial;
    }

    public String getUffilial() {
        return uffilial;
    }

    public void setUffilial(String uffilial) {
        this.uffilial = uffilial;
    }

    public String getAgregarstprodsintegra() {
        return agregarstprodsintegra;
    }

    public void setAgregarstprodsintegra(String agregarstprodsintegra) {
        this.agregarstprodsintegra = agregarstprodsintegra;
    }

    public String getTipoaliqoutrasdesp() {
        return tipoaliqoutrasdesp;
    }

    public void setTipoaliqoutrasdesp(String tipoaliqoutrasdesp) {
        this.tipoaliqoutrasdesp = tipoaliqoutrasdesp;
    }

    public String getIesubsttribut() {
        return iesubsttribut;
    }

    public void setIesubsttribut(String iesubsttribut) {
        this.iesubsttribut = iesubsttribut;
    }

    public String getUfcodigo() {
        return ufcodigo;
    }

    public void setUfcodigo(String ufcodigo) {
        this.ufcodigo = ufcodigo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getSubserie() {
        return subserie;
    }

    public void setSubserie(String subserie) {
        this.subserie = subserie;
    }

    public String getEspecievolume() {
        return especievolume;
    }

    public void setEspecievolume(String especievolume) {
        this.especievolume = especievolume;
    }

    public String getMarcarvolume() {
        return marcarvolume;
    }

    public void setMarcarvolume(String marcarvolume) {
        this.marcarvolume = marcarvolume;
    }

    public String getUsaintegracaowms() {
        return usaintegracaowms;
    }

    public void setUsaintegracaowms(String usaintegracaowms) {
        this.usaintegracaowms = usaintegracaowms;
    }

    public String getEnviadanfe() {
        return enviadanfe;
    }

    public void setEnviadanfe(String enviadanfe) {
        this.enviadanfe = enviadanfe;
    }

    public String getAutentpgtognre() {
        return autentpgtognre;
    }

    public void setAutentpgtognre(String autentpgtognre) {
        this.autentpgtognre = autentpgtognre;
    }

    public String getBancopgtognre() {
        return bancopgtognre;
    }

    public void setBancopgtognre(String bancopgtognre) {
        this.bancopgtognre = bancopgtognre;
    }

    public String getAgenciapgtognre() {
        return agenciapgtognre;
    }

    public void setAgenciapgtognre(String agenciapgtognre) {
        this.agenciapgtognre = agenciapgtognre;
    }

    public String getVendaassistida() {
        return vendaassistida;
    }

    public void setVendaassistida(String vendaassistida) {
        this.vendaassistida = vendaassistida;
    }

    public Integer getCodemitentepedido() {
        return codemitentepedido;
    }

    public void setCodemitentepedido(Integer codemitentepedido) {
        this.codemitentepedido = codemitentepedido;
    }

    public BigDecimal getAliquota() {
        return aliquota;
    }

    public void setAliquota(BigDecimal aliquota) {
        this.aliquota = aliquota;
    }

    public Integer getNumop() {
        return numop;
    }

    public void setNumop(Integer numop) {
        this.numop = numop;
    }

    public Integer getNumcaranterior() {
        return numcaranterior;
    }

    public void setNumcaranterior(Integer numcaranterior) {
        this.numcaranterior = numcaranterior;
    }

    public Integer getCodusur4() {
        return codusur4;
    }

    public void setCodusur4(Integer codusur4) {
        this.codusur4 = codusur4;
    }

    public BigDecimal getComissao4() {
        return comissao4;
    }

    public void setComissao4(BigDecimal comissao4) {
        this.comissao4 = comissao4;
    }

    public String getClientefontest() {
        return clientefontest;
    }

    public void setClientefontest(String clientefontest) {
        this.clientefontest = clientefontest;
    }

    public String getOrgaopub() {
        return orgaopub;
    }

    public void setOrgaopub(String orgaopub) {
        this.orgaopub = orgaopub;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    public Integer getCodclifilial() {
        return codclifilial;
    }

    public void setCodclifilial(Integer codclifilial) {
        this.codclifilial = codclifilial;
    }

    public String getCgcfrete() {
        return cgcfrete;
    }

    public void setCgcfrete(String cgcfrete) {
        this.cgcfrete = cgcfrete;
    }

    public String getIefrete() {
        return iefrete;
    }

    public void setIefrete(String iefrete) {
        this.iefrete = iefrete;
    }

    public String getUffrete() {
        return uffrete;
    }

    public void setUffrete(String uffrete) {
        this.uffrete = uffrete;
    }

    public BigDecimal getVlpautafrete() {
        return vlpautafrete;
    }

    public void setVlpautafrete(BigDecimal vlpautafrete) {
        this.vlpautafrete = vlpautafrete;
    }

    public String getCobranca() {
        return cobranca;
    }

    public void setCobranca(String cobranca) {
        this.cobranca = cobranca;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSulframa() {
        return sulframa;
    }

    public void setSulframa(String sulframa) {
        this.sulframa = sulframa;
    }

    public Long getCodmunicipio() {
        return codmunicipio;
    }

    public void setCodmunicipio(Long codmunicipio) {
        this.codmunicipio = codmunicipio;
    }

    public String getPlacaveic() {
        return placaveic;
    }

    public void setPlacaveic(String placaveic) {
        this.placaveic = placaveic;
    }

    public Long getCodcontcli() {
        return codcontcli;
    }

    public void setCodcontcli(Long codcontcli) {
        this.codcontcli = codcontcli;
    }

    public Long getCodibge() {
        return codibge;
    }

    public void setCodibge(Long codibge) {
        this.codibge = codibge;
    }

    public String getTipoempresa() {
        return tipoempresa;
    }

    public void setTipoempresa(String tipoempresa) {
        this.tipoempresa = tipoempresa;
    }

    public Short getCodfiscalfrete() {
        return codfiscalfrete;
    }

    public void setCodfiscalfrete(Short codfiscalfrete) {
        this.codfiscalfrete = codfiscalfrete;
    }

    public BigDecimal getPercicmfrete() {
        return percicmfrete;
    }

    public void setPercicmfrete(BigDecimal percicmfrete) {
        this.percicmfrete = percicmfrete;
    }

    public Short getCodfiscaloutrasdesp() {
        return codfiscaloutrasdesp;
    }

    public void setCodfiscaloutrasdesp(Short codfiscaloutrasdesp) {
        this.codfiscaloutrasdesp = codfiscaloutrasdesp;
    }

    public BigDecimal getAliqicmoutrasdesp() {
        return aliqicmoutrasdesp;
    }

    public void setAliqicmoutrasdesp(BigDecimal aliqicmoutrasdesp) {
        this.aliqicmoutrasdesp = aliqicmoutrasdesp;
    }

    public String getAtacadista() {
        return atacadista;
    }

    public void setAtacadista(String atacadista) {
        this.atacadista = atacadista;
    }

    public BigDecimal getVlinss() {
        return vlinss;
    }

    public void setVlinss(BigDecimal vlinss) {
        this.vlinss = vlinss;
    }

    public String getProtocolonfecan() {
        return protocolonfecan;
    }

    public void setProtocolonfecan(String protocolonfecan) {
        this.protocolonfecan = protocolonfecan;
    }

    public String getProtocolonfeauto() {
        return protocolonfeauto;
    }

    public void setProtocolonfeauto(String protocolonfeauto) {
        this.protocolonfeauto = protocolonfeauto;
    }

    public BigDecimal getComissaomot() {
        return comissaomot;
    }

    public void setComissaomot(BigDecimal comissaomot) {
        this.comissaomot = comissaomot;
    }

    public LocalDate getDtpagcomissaoprof() {
        return dtpagcomissaoprof;
    }

    public void setDtpagcomissaoprof(LocalDate dtpagcomissaoprof) {
        this.dtpagcomissaoprof = dtpagcomissaoprof;
    }

    public LocalDate getDtlancto() {
        return dtlancto;
    }

    public void setDtlancto(LocalDate dtlancto) {
        this.dtlancto = dtlancto;
    }

    public String getRecarga() {
        return recarga;
    }

    public void setRecarga(String recarga) {
        this.recarga = recarga;
    }

    public Integer getNumcontrato() {
        return numcontrato;
    }

    public void setNumcontrato(Integer numcontrato) {
        this.numcontrato = numcontrato;
    }

    public LocalDate getDtfechaccrca() {
        return dtfechaccrca;
    }

    public void setDtfechaccrca(LocalDate dtfechaccrca) {
        this.dtfechaccrca = dtfechaccrca;
    }

    public String getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }

    public LocalDate getDtcancelwms() {
        return dtcancelwms;
    }

    public void setDtcancelwms(LocalDate dtcancelwms) {
        this.dtcancelwms = dtcancelwms;
    }

    public BigDecimal getVlcofins() {
        return vlcofins;
    }

    public void setVlcofins(BigDecimal vlcofins) {
        this.vlcofins = vlcofins;
    }

    public Integer getCodfiscalnf() {
        return codfiscalnf;
    }

    public void setCodfiscalnf(Integer codfiscalnf) {
        this.codfiscalnf = codfiscalnf;
    }

    public BigDecimal getVldespdentronf() {
        return vldespdentronf;
    }

    public void setVldespdentronf(BigDecimal vldespdentronf) {
        this.vldespdentronf = vldespdentronf;
    }

    public LocalDate getDthoraautorizacaosefaz() {
        return dthoraautorizacaosefaz;
    }

    public void setDthoraautorizacaosefaz(LocalDate dthoraautorizacaosefaz) {
        this.dthoraautorizacaosefaz = dthoraautorizacaosefaz;
    }

    public String getRecibonfe() {
        return recibonfe;
    }

    public void setRecibonfe(String recibonfe) {
        this.recibonfe = recibonfe;
    }

    public String getLotedpec() {
        return lotedpec;
    }

    public void setLotedpec(String lotedpec) {
        this.lotedpec = lotedpec;
    }

    public String getRecibodpec() {
        return recibodpec;
    }

    public void setRecibodpec(String recibodpec) {
        this.recibodpec = recibodpec;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getProtocolocancelamento() {
        return protocolocancelamento;
    }

    public void setProtocolocancelamento(String protocolocancelamento) {
        this.protocolocancelamento = protocolocancelamento;
    }

    public LocalDate getDthoracancelamentosefaz() {
        return dthoracancelamentosefaz;
    }

    public void setDthoracancelamentosefaz(LocalDate dthoracancelamentosefaz) {
        this.dthoracancelamentosefaz = dthoracancelamentosefaz;
    }

    public LocalDate getDtfecha() {
        return dtfecha;
    }

    public void setDtfecha(LocalDate dtfecha) {
        this.dtfecha = dtfecha;
    }

    public LocalDate getDthorarecibodpec() {
        return dthorarecibodpec;
    }

    public void setDthorarecibodpec(LocalDate dthorarecibodpec) {
        this.dthorarecibodpec = dthorarecibodpec;
    }

    public BigDecimal getNumtransvendaconhec() {
        return numtransvendaconhec;
    }

    public void setNumtransvendaconhec(BigDecimal numtransvendaconhec) {
        this.numtransvendaconhec = numtransvendaconhec;
    }

    public String getObsnfe() {
        return obsnfe;
    }

    public void setObsnfe(String obsnfe) {
        this.obsnfe = obsnfe;
    }

    public BigDecimal getTotdifaliquotas() {
        return totdifaliquotas;
    }

    public void setTotdifaliquotas(BigDecimal totdifaliquotas) {
        this.totdifaliquotas = totdifaliquotas;
    }

    public BigDecimal getVlfreteretido() {
        return vlfreteretido;
    }

    public void setVlfreteretido(BigDecimal vlfreteretido) {
        this.vlfreteretido = vlfreteretido;
    }

    public BigDecimal getVlstfreteretido() {
        return vlstfreteretido;
    }

    public void setVlstfreteretido(BigDecimal vlstfreteretido) {
        this.vlstfreteretido = vlstfreteretido;
    }

    public BigDecimal getPercfreteretido() {
        return percfreteretido;
    }

    public void setPercfreteretido(BigDecimal percfreteretido) {
        this.percfreteretido = percfreteretido;
    }

    public BigDecimal getPercstfreteretido() {
        return percstfreteretido;
    }

    public void setPercstfreteretido(BigDecimal percstfreteretido) {
        this.percstfreteretido = percstfreteretido;
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

    public String getVendatriangular() {
        return vendatriangular;
    }

    public void setVendatriangular(String vendatriangular) {
        this.vendatriangular = vendatriangular;
    }

    public Long getSituacaocte() {
        return situacaocte;
    }

    public void setSituacaocte(Long situacaocte) {
        this.situacaocte = situacaocte;
    }

    public String getRecibocte() {
        return recibocte;
    }

    public void setRecibocte(String recibocte) {
        this.recibocte = recibocte;
    }

    public String getProtocolocte() {
        return protocolocte;
    }

    public void setProtocolocte(String protocolocte) {
        this.protocolocte = protocolocte;
    }

    public String getChavecte() {
        return chavecte;
    }

    public void setChavecte(String chavecte) {
        this.chavecte = chavecte;
    }

    public String getNumlotecte() {
        return numlotecte;
    }

    public void setNumlotecte(String numlotecte) {
        this.numlotecte = numlotecte;
    }

    public LocalDate getDtaHoraenviosefaz() {
        return dtaHoraenviosefaz;
    }

    public void setDtaHoraenviosefaz(LocalDate dtaHoraenviosefaz) {
        this.dtaHoraenviosefaz = dtaHoraenviosefaz;
    }

    public String getAmbientecte() {
        return ambientecte;
    }

    public void setAmbientecte(String ambientecte) {
        this.ambientecte = ambientecte;
    }

    public String getAmbientenfe() {
        return ambientenfe;
    }

    public void setAmbientenfe(String ambientenfe) {
        this.ambientenfe = ambientenfe;
    }

    public Long getNumseqentrega() {
        return numseqentrega;
    }

    public void setNumseqentrega(Long numseqentrega) {
        this.numseqentrega = numseqentrega;
    }

    public String getHoraemissao() {
        return horaemissao;
    }

    public void setHoraemissao(String horaemissao) {
        this.horaemissao = horaemissao;
    }

    public Integer getContadorcupomfiscal() {
        return contadorcupomfiscal;
    }

    public void setContadorcupomfiscal(Integer contadorcupomfiscal) {
        this.contadorcupomfiscal = contadorcupomfiscal;
    }

    public Integer getCodprodpredominante() {
        return codprodpredominante;
    }

    public void setCodprodpredominante(Integer codprodpredominante) {
        this.codprodpredominante = codprodpredominante;
    }

    public LocalDate getDtliberacaoentrega() {
        return dtliberacaoentrega;
    }

    public void setDtliberacaoentrega(LocalDate dtliberacaoentrega) {
        this.dtliberacaoentrega = dtliberacaoentrega;
    }

    public Integer getCodfuncliberacaoentrega() {
        return codfuncliberacaoentrega;
    }

    public void setCodfuncliberacaoentrega(Integer codfuncliberacaoentrega) {
        this.codfuncliberacaoentrega = codfuncliberacaoentrega;
    }

    public BigDecimal getTotpesoliq() {
        return totpesoliq;
    }

    public void setTotpesoliq(BigDecimal totpesoliq) {
        this.totpesoliq = totpesoliq;
    }

    public BigDecimal getTotpesoagrupado() {
        return totpesoagrupado;
    }

    public void setTotpesoagrupado(BigDecimal totpesoagrupado) {
        this.totpesoagrupado = totpesoagrupado;
    }

    public BigDecimal getTotpesoliqagrupado() {
        return totpesoliqagrupado;
    }

    public void setTotpesoliqagrupado(BigDecimal totpesoliqagrupado) {
        this.totpesoliqagrupado = totpesoliqagrupado;
    }

    public BigDecimal getTotvolumeagrupado() {
        return totvolumeagrupado;
    }

    public void setTotvolumeagrupado(BigDecimal totvolumeagrupado) {
        this.totvolumeagrupado = totvolumeagrupado;
    }

    public String getJustificativacontigencia() {
        return justificativacontigencia;
    }

    public void setJustificativacontigencia(String justificativacontigencia) {
        this.justificativacontigencia = justificativacontigencia;
    }

    public LocalDate getDtahoraentradacontigencia() {
        return dtahoraentradacontigencia;
    }

    public void setDtahoraentradacontigencia(LocalDate dtahoraentradacontigencia) {
        this.dtahoraentradacontigencia = dtahoraentradacontigencia;
    }

    public String getCustobonificacao() {
        return custobonificacao;
    }

    public void setCustobonificacao(String custobonificacao) {
        this.custobonificacao = custobonificacao;
    }

    public Integer getCodfornecbonific() {
        return codfornecbonific;
    }

    public void setCodfornecbonific(Integer codfornecbonific) {
        this.codfornecbonific = codfornecbonific;
    }

    public Short getCodbnf() {
        return codbnf;
    }

    public void setCodbnf(Short codbnf) {
        this.codbnf = codbnf;
    }

    public BigDecimal getTotpesobruto() {
        return totpesobruto;
    }

    public void setTotpesobruto(BigDecimal totpesobruto) {
        this.totpesobruto = totpesobruto;
    }

    public LocalDate getDtsaidanf() {
        return dtsaidanf;
    }

    public void setDtsaidanf(LocalDate dtsaidanf) {
        this.dtsaidanf = dtsaidanf;
    }

    public String getObsexp() {
        return obsexp;
    }

    public void setObsexp(String obsexp) {
        this.obsexp = obsexp;
    }

    public String getContaordem() {
        return contaordem;
    }

    public void setContaordem(String contaordem) {
        this.contaordem = contaordem;
    }

    public String getCnpjcisp() {
        return cnpjcisp;
    }

    public void setCnpjcisp(String cnpjcisp) {
        this.cnpjcisp = cnpjcisp;
    }

    public String getConsumiunumnfe() {
        return consumiunumnfe;
    }

    public void setConsumiunumnfe(String consumiunumnfe) {
        this.consumiunumnfe = consumiunumnfe;
    }

    public LocalDate getDthoracte() {
        return dthoracte;
    }

    public void setDthoracte(LocalDate dthoracte) {
        this.dthoracte = dthoracte;
    }

    public Long getTentativaenviocte() {
        return tentativaenviocte;
    }

    public void setTentativaenviocte(Long tentativaenviocte) {
        this.tentativaenviocte = tentativaenviocte;
    }

    public String getProtocolocancelamentocte() {
        return protocolocancelamentocte;
    }

    public void setProtocolocancelamentocte(String protocolocancelamentocte) {
        this.protocolocancelamentocte = protocolocancelamentocte;
    }

    public Integer getCodfornecredespacho() {
        return codfornecredespacho;
    }

    public void setCodfornecredespacho(Integer codfornecredespacho) {
        this.codfornecredespacho = codfornecredespacho;
    }

    public String getEmailfrete() {
        return emailfrete;
    }

    public void setEmailfrete(String emailfrete) {
        this.emailfrete = emailfrete;
    }

    public String getEmailfreteredespacho() {
        return emailfreteredespacho;
    }

    public void setEmailfreteredespacho(String emailfreteredespacho) {
        this.emailfreteredespacho = emailfreteredespacho;
    }

    public String getConferido() {
        return conferido;
    }

    public void setConferido(String conferido) {
        this.conferido = conferido;
    }

    public BigDecimal getValorst() {
        return valorst;
    }

    public void setValorst(BigDecimal valorst) {
        this.valorst = valorst;
    }

    public String getMensagempiscofins() {
        return mensagempiscofins;
    }

    public void setMensagempiscofins(String mensagempiscofins) {
        this.mensagempiscofins = mensagempiscofins;
    }

    public LocalDate getDataempenho() {
        return dataempenho;
    }

    public void setDataempenho(LocalDate dataempenho) {
        this.dataempenho = dataempenho;
    }

    public String getCodunidadeexecutora() {
        return codunidadeexecutora;
    }

    public void setCodunidadeexecutora(String codunidadeexecutora) {
        this.codunidadeexecutora = codunidadeexecutora;
    }

    public BigDecimal getVldescicms() {
        return vldescicms;
    }

    public void setVldescicms(BigDecimal vldescicms) {
        this.vldescicms = vldescicms;
    }

    public BigDecimal getVltotalsemdescicms() {
        return vltotalsemdescicms;
    }

    public void setVltotalsemdescicms(BigDecimal vltotalsemdescicms) {
        this.vltotalsemdescicms = vltotalsemdescicms;
    }

    public String getNumempenho() {
        return numempenho;
    }

    public void setNumempenho(String numempenho) {
        this.numempenho = numempenho;
    }

    public String getObspiscofins() {
        return obspiscofins;
    }

    public void setObspiscofins(String obspiscofins) {
        this.obspiscofins = obspiscofins;
    }

    public BigDecimal getVlbasepiscofins() {
        return vlbasepiscofins;
    }

    public void setVlbasepiscofins(BigDecimal vlbasepiscofins) {
        this.vlbasepiscofins = vlbasepiscofins;
    }

    public BigDecimal getPerpis() {
        return perpis;
    }

    public void setPerpis(BigDecimal perpis) {
        this.perpis = perpis;
    }

    public BigDecimal getPercofins() {
        return percofins;
    }

    public void setPercofins(BigDecimal percofins) {
        this.percofins = percofins;
    }

    public Short getCodsittribpiscofins() {
        return codsittribpiscofins;
    }

    public void setCodsittribpiscofins(Short codsittribpiscofins) {
        this.codsittribpiscofins = codsittribpiscofins;
    }

    public String getSitdoc() {
        return sitdoc;
    }

    public void setSitdoc(String sitdoc) {
        this.sitdoc = sitdoc;
    }

    public LocalDate getDtexportacaowms() {
        return dtexportacaowms;
    }

    public void setDtexportacaowms(LocalDate dtexportacaowms) {
        this.dtexportacaowms = dtexportacaowms;
    }

    public LocalDate getDtimportacaowms() {
        return dtimportacaowms;
    }

    public void setDtimportacaowms(LocalDate dtimportacaowms) {
        this.dtimportacaowms = dtimportacaowms;
    }

    public String getNfatualwms() {
        return nfatualwms;
    }

    public void setNfatualwms(String nfatualwms) {
        this.nfatualwms = nfatualwms;
    }

    public String getFinalidadenfe() {
        return finalidadenfe;
    }

    public void setFinalidadenfe(String finalidadenfe) {
        this.finalidadenfe = finalidadenfe;
    }

    public String getEmaildest() {
        return emaildest;
    }

    public void setEmaildest(String emaildest) {
        this.emaildest = emaildest;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNumendereco() {
        return numendereco;
    }

    public void setNumendereco(String numendereco) {
        this.numendereco = numendereco;
    }

    public String getSerieoriginal() {
        return serieoriginal;
    }

    public void setSerieoriginal(String serieoriginal) {
        this.serieoriginal = serieoriginal;
    }

    public String getDespesasrateada() {
        return despesasrateada;
    }

    public void setDespesasrateada(String despesasrateada) {
        this.despesasrateada = despesasrateada;
    }

    public Long getNumtransentorigem() {
        return numtransentorigem;
    }

    public void setNumtransentorigem(Long numtransentorigem) {
        this.numtransentorigem = numtransentorigem;
    }

    public String getFornecentrega() {
        return fornecentrega;
    }

    public void setFornecentrega(String fornecentrega) {
        this.fornecentrega = fornecentrega;
    }

    public String getUfplacaveic() {
        return ufplacaveic;
    }

    public void setUfplacaveic(String ufplacaveic) {
        this.ufplacaveic = ufplacaveic;
    }

    public String getMotoristaveiculo() {
        return motoristaveiculo;
    }

    public void setMotoristaveiculo(String motoristaveiculo) {
        this.motoristaveiculo = motoristaveiculo;
    }

    public String getConsumiunumcte() {
        return consumiunumcte;
    }

    public void setConsumiunumcte(String consumiunumcte) {
        this.consumiunumcte = consumiunumcte;
    }

    public String getUtilizaipicalcicms() {
        return utilizaipicalcicms;
    }

    public void setUtilizaipicalcicms(String utilizaipicalcicms) {
        this.utilizaipicalcicms = utilizaipicalcicms;
    }

    public Integer getNumos() {
        return numos;
    }

    public void setNumos(Integer numos) {
        this.numos = numos;
    }

    public Integer getWmscodfuncignora() {
        return wmscodfuncignora;
    }

    public void setWmscodfuncignora(Integer wmscodfuncignora) {
        this.wmscodfuncignora = wmscodfuncignora;
    }

    public String getWmsignorado() {
        return wmsignorado;
    }

    public void setWmsignorado(String wmsignorado) {
        this.wmsignorado = wmsignorado;
    }

    public String getPisretido() {
        return pisretido;
    }

    public void setPisretido(String pisretido) {
        this.pisretido = pisretido;
    }

    public String getInssretido() {
        return inssretido;
    }

    public void setInssretido(String inssretido) {
        this.inssretido = inssretido;
    }

    public String getIrrretido() {
        return irrretido;
    }

    public void setIrrretido(String irrretido) {
        this.irrretido = irrretido;
    }

    public Long getNumtransentdest() {
        return numtransentdest;
    }

    public void setNumtransentdest(Long numtransentdest) {
        this.numtransentdest = numtransentdest;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public Short getCodveiculo1() {
        return codveiculo1;
    }

    public void setCodveiculo1(Short codveiculo1) {
        this.codveiculo1 = codveiculo1;
    }

    public Short getCodveiculo2() {
        return codveiculo2;
    }

    public void setCodveiculo2(Short codveiculo2) {
        this.codveiculo2 = codveiculo2;
    }

    public String getCofinsretido() {
        return cofinsretido;
    }

    public void setCofinsretido(String cofinsretido) {
        this.cofinsretido = cofinsretido;
    }

    public String getCsllretido() {
        return csllretido;
    }

    public void setCsllretido(String csllretido) {
        this.csllretido = csllretido;
    }

    public String getGerarbcrnfe() {
        return gerarbcrnfe;
    }

    public void setGerarbcrnfe(String gerarbcrnfe) {
        this.gerarbcrnfe = gerarbcrnfe;
    }

    public Integer getNumcargaedi() {
        return numcargaedi;
    }

    public void setNumcargaedi(Integer numcargaedi) {
        this.numcargaedi = numcargaedi;
    }

    public String getDepositofechado() {
        return depositofechado;
    }

    public void setDepositofechado(String depositofechado) {
        this.depositofechado = depositofechado;
    }

    public String getObsnfcarreg() {
        return obsnfcarreg;
    }

    public void setObsnfcarreg(String obsnfcarreg) {
        this.obsnfcarreg = obsnfcarreg;
    }

    public String getTipoemissaocte() {
        return tipoemissaocte;
    }

    public void setTipoemissaocte(String tipoemissaocte) {
        this.tipoemissaocte = tipoemissaocte;
    }

    public LocalDate getDtemissaodeclaracao() {
        return dtemissaodeclaracao;
    }

    public void setDtemissaodeclaracao(LocalDate dtemissaodeclaracao) {
        this.dtemissaodeclaracao = dtemissaodeclaracao;
    }

    public LocalDate getDtdenegada() {
        return dtdenegada;
    }

    public void setDtdenegada(LocalDate dtdenegada) {
        this.dtdenegada = dtdenegada;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public BigDecimal getTaxaentrega() {
        return taxaentrega;
    }

    public void setTaxaentrega(BigDecimal taxaentrega) {
        this.taxaentrega = taxaentrega;
    }

    public String getUfplacavei() {
        return ufplacavei;
    }

    public void setUfplacavei(String ufplacavei) {
        this.ufplacavei = ufplacavei;
    }

    public String getNormaregespecial() {
        return normaregespecial;
    }

    public void setNormaregespecial(String normaregespecial) {
        this.normaregespecial = normaregespecial;
    }

    public LocalDate getDtfat() {
        return dtfat;
    }

    public void setDtfat(LocalDate dtfat) {
        this.dtfat = dtfat;
    }

    public Short getCodgerente() {
        return codgerente;
    }

    public void setCodgerente(Short codgerente) {
        this.codgerente = codgerente;
    }

    public String getNumpedcli() {
        return numpedcli;
    }

    public void setNumpedcli(String numpedcli) {
        this.numpedcli = numpedcli;
    }

    public String getDevsimbolica() {
        return devsimbolica;
    }

    public void setDevsimbolica(String devsimbolica) {
        this.devsimbolica = devsimbolica;
    }

    public BigDecimal getVlipioutras() {
        return vlipioutras;
    }

    public void setVlipioutras(BigDecimal vlipioutras) {
        this.vlipioutras = vlipioutras;
    }

    public BigDecimal getVldescabatimento() {
        return vldescabatimento;
    }

    public void setVldescabatimento(BigDecimal vldescabatimento) {
        this.vldescabatimento = vldescabatimento;
    }

    public String getMotestornonfe() {
        return motestornonfe;
    }

    public void setMotestornonfe(String motestornonfe) {
        this.motestornonfe = motestornonfe;
    }

    public String getNatopernfe() {
        return natopernfe;
    }

    public void setNatopernfe(String natopernfe) {
        this.natopernfe = natopernfe;
    }

    public String getVendaexportacao() {
        return vendaexportacao;
    }

    public void setVendaexportacao(String vendaexportacao) {
        this.vendaexportacao = vendaexportacao;
    }

    public String getEnviadoemailcancelado() {
        return enviadoemailcancelado;
    }

    public void setEnviadoemailcancelado(String enviadoemailcancelado) {
        this.enviadoemailcancelado = enviadoemailcancelado;
    }

    public String getGeranfvenda() {
        return geranfvenda;
    }

    public void setGeranfvenda(String geranfvenda) {
        this.geranfvenda = geranfvenda;
    }

    public String getNumcontratocarreteiro() {
        return numcontratocarreteiro;
    }

    public void setNumcontratocarreteiro(String numcontratocarreteiro) {
        this.numcontratocarreteiro = numcontratocarreteiro;
    }

    public Integer getNumlista() {
        return numlista;
    }

    public void setNumlista(Integer numlista) {
        this.numlista = numlista;
    }

    public byte[] getIdintegracaomyfrota() {
        return idintegracaomyfrota;
    }

    public void setIdintegracaomyfrota(byte[] idintegracaomyfrota) {
        this.idintegracaomyfrota = idintegracaomyfrota;
    }

    public Long getNumtransvendatv13() {
        return numtransvendatv13;
    }

    public void setNumtransvendatv13(Long numtransvendatv13) {
        this.numtransvendatv13 = numtransvendatv13;
    }

    public Long getSituacaonfeorig() {
        return situacaonfeorig;
    }

    public void setSituacaonfeorig(Long situacaonfeorig) {
        this.situacaonfeorig = situacaonfeorig;
    }

    public Integer getCodmedicoprescrit() {
        return codmedicoprescrit;
    }

    public void setCodmedicoprescrit(Integer codmedicoprescrit) {
        this.codmedicoprescrit = codmedicoprescrit;
    }

    public String getNumpedvanxml() {
        return numpedvanxml;
    }

    public void setNumpedvanxml(String numpedvanxml) {
        this.numpedvanxml = numpedvanxml;
    }

    public String getCnpjfornec() {
        return cnpjfornec;
    }

    public void setCnpjfornec(String cnpjfornec) {
        this.cnpjfornec = cnpjfornec;
    }

    public Long getNumcomprovante() {
        return numcomprovante;
    }

    public void setNumcomprovante(Long numcomprovante) {
        this.numcomprovante = numcomprovante;
    }

    public String getCnpjresponsavel() {
        return cnpjresponsavel;
    }

    public void setCnpjresponsavel(String cnpjresponsavel) {
        this.cnpjresponsavel = cnpjresponsavel;
    }

    public String getInutilizada() {
        return inutilizada;
    }

    public void setInutilizada(String inutilizada) {
        this.inutilizada = inutilizada;
    }

    public String getAgregastvlmerc() {
        return agregastvlmerc;
    }

    public void setAgregastvlmerc(String agregastvlmerc) {
        this.agregastvlmerc = agregastvlmerc;
    }

    public Boolean getRespseguro() {
        return respseguro;
    }

    public void setRespseguro(Boolean respseguro) {
        this.respseguro = respseguro;
    }

    public String getNomeseguradora() {
        return nomeseguradora;
    }

    public void setNomeseguradora(String nomeseguradora) {
        this.nomeseguradora = nomeseguradora;
    }

    public String getNumeroapolice() {
        return numeroapolice;
    }

    public void setNumeroapolice(String numeroapolice) {
        this.numeroapolice = numeroapolice;
    }

    public String getNumeroaverbacao() {
        return numeroaverbacao;
    }

    public void setNumeroaverbacao(String numeroaverbacao) {
        this.numeroaverbacao = numeroaverbacao;
    }

    public String getSimplesnacional() {
        return simplesnacional;
    }

    public void setSimplesnacional(String simplesnacional) {
        this.simplesnacional = simplesnacional;
    }

    public BigDecimal getVlraverbacao() {
        return vlraverbacao;
    }

    public void setVlraverbacao(BigDecimal vlraverbacao) {
        this.vlraverbacao = vlraverbacao;
    }

    public BigDecimal getVltributos() {
        return vltributos;
    }

    public void setVltributos(BigDecimal vltributos) {
        this.vltributos = vltributos;
    }

    public String getCartaodotz() {
        return cartaodotz;
    }

    public void setCartaodotz(String cartaodotz) {
        this.cartaodotz = cartaodotz;
    }

    public String getCnpjcoleta() {
        return cnpjcoleta;
    }

    public void setCnpjcoleta(String cnpjcoleta) {
        this.cnpjcoleta = cnpjcoleta;
    }

    public String getRazaosocialcoleta() {
        return razaosocialcoleta;
    }

    public void setRazaosocialcoleta(String razaosocialcoleta) {
        this.razaosocialcoleta = razaosocialcoleta;
    }

    public String getLogradourocoleta() {
        return logradourocoleta;
    }

    public void setLogradourocoleta(String logradourocoleta) {
        this.logradourocoleta = logradourocoleta;
    }

    public String getNumerocoleta() {
        return numerocoleta;
    }

    public void setNumerocoleta(String numerocoleta) {
        this.numerocoleta = numerocoleta;
    }

    public String getComplementocoleta() {
        return complementocoleta;
    }

    public void setComplementocoleta(String complementocoleta) {
        this.complementocoleta = complementocoleta;
    }

    public String getBairrocoleta() {
        return bairrocoleta;
    }

    public void setBairrocoleta(String bairrocoleta) {
        this.bairrocoleta = bairrocoleta;
    }

    public Integer getCodcidadecoleta() {
        return codcidadecoleta;
    }

    public void setCodcidadecoleta(Integer codcidadecoleta) {
        this.codcidadecoleta = codcidadecoleta;
    }

    public String getCnpjfornecpedagio() {
        return cnpjfornecpedagio;
    }

    public void setCnpjfornecpedagio(String cnpjfornecpedagio) {
        this.cnpjfornecpedagio = cnpjfornecpedagio;
    }

    public String getNumvalepedagio() {
        return numvalepedagio;
    }

    public void setNumvalepedagio(String numvalepedagio) {
        this.numvalepedagio = numvalepedagio;
    }

    public String getCpnjresponsavelpedagio() {
        return cpnjresponsavelpedagio;
    }

    public void setCpnjresponsavelpedagio(String cpnjresponsavelpedagio) {
        this.cpnjresponsavelpedagio = cpnjresponsavelpedagio;
    }

    public BigDecimal getValorpedagio() {
        return valorpedagio;
    }

    public void setValorpedagio(BigDecimal valorpedagio) {
        this.valorpedagio = valorpedagio;
    }

    public Long getNumtranscteanul() {
        return numtranscteanul;
    }

    public void setNumtranscteanul(Long numtranscteanul) {
        this.numtranscteanul = numtranscteanul;
    }

    public Long getNumtransctesubs() {
        return numtransctesubs;
    }

    public void setNumtransctesubs(Long numtransctesubs) {
        this.numtransctesubs = numtransctesubs;
    }

    public String getChavecteref() {
        return chavecteref;
    }

    public void setChavecteref(String chavecteref) {
        this.chavecteref = chavecteref;
    }

    public String getCnpjcpfcteref() {
        return cnpjcpfcteref;
    }

    public void setCnpjcpfcteref(String cnpjcpfcteref) {
        this.cnpjcpfcteref = cnpjcpfcteref;
    }

    public String getIecteref() {
        return iecteref;
    }

    public void setIecteref(String iecteref) {
        this.iecteref = iecteref;
    }

    public String getRazaosocialcteref() {
        return razaosocialcteref;
    }

    public void setRazaosocialcteref(String razaosocialcteref) {
        this.razaosocialcteref = razaosocialcteref;
    }

    public String getTipodoccteref() {
        return tipodoccteref;
    }

    public void setTipodoccteref(String tipodoccteref) {
        this.tipodoccteref = tipodoccteref;
    }

    public String getSeriedoccteref() {
        return seriedoccteref;
    }

    public void setSeriedoccteref(String seriedoccteref) {
        this.seriedoccteref = seriedoccteref;
    }

    public String getSubseriedoccteref() {
        return subseriedoccteref;
    }

    public void setSubseriedoccteref(String subseriedoccteref) {
        this.subseriedoccteref = subseriedoccteref;
    }

    public String getNumdoccteref() {
        return numdoccteref;
    }

    public void setNumdoccteref(String numdoccteref) {
        this.numdoccteref = numdoccteref;
    }

    public LocalDate getDtemissaocteref() {
        return dtemissaocteref;
    }

    public void setDtemissaocteref(LocalDate dtemissaocteref) {
        this.dtemissaocteref = dtemissaocteref;
    }

    public String getOrgaopubfederal() {
        return orgaopubfederal;
    }

    public void setOrgaopubfederal(String orgaopubfederal) {
        this.orgaopubfederal = orgaopubfederal;
    }

    public String getOrgaopubmunicipal() {
        return orgaopubmunicipal;
    }

    public void setOrgaopubmunicipal(String orgaopubmunicipal) {
        this.orgaopubmunicipal = orgaopubmunicipal;
    }

    public String getNsusociotorcedor() {
        return nsusociotorcedor;
    }

    public void setNsusociotorcedor(String nsusociotorcedor) {
        this.nsusociotorcedor = nsusociotorcedor;
    }

    public String getCnpjcpfemitentesub() {
        return cnpjcpfemitentesub;
    }

    public void setCnpjcpfemitentesub(String cnpjcpfemitentesub) {
        this.cnpjcpfemitentesub = cnpjcpfemitentesub;
    }

    public String getModelodocsub() {
        return modelodocsub;
    }

    public void setModelodocsub(String modelodocsub) {
        this.modelodocsub = modelodocsub;
    }

    public String getSeriedocsub() {
        return seriedocsub;
    }

    public void setSeriedocsub(String seriedocsub) {
        this.seriedocsub = seriedocsub;
    }

    public String getSubseriedocsub() {
        return subseriedocsub;
    }

    public void setSubseriedocsub(String subseriedocsub) {
        this.subseriedocsub = subseriedocsub;
    }

    public Long getNumerodocsub() {
        return numerodocsub;
    }

    public void setNumerodocsub(Long numerodocsub) {
        this.numerodocsub = numerodocsub;
    }

    public BigDecimal getValordocsub() {
        return valordocsub;
    }

    public void setValordocsub(BigDecimal valordocsub) {
        this.valordocsub = valordocsub;
    }

    public LocalDate getDtemissaodocsub() {
        return dtemissaodocsub;
    }

    public void setDtemissaodocsub(LocalDate dtemissaodocsub) {
        this.dtemissaodocsub = dtemissaodocsub;
    }

    public String getChavectetomadorsub() {
        return chavectetomadorsub;
    }

    public void setChavectetomadorsub(String chavectetomadorsub) {
        this.chavectetomadorsub = chavectetomadorsub;
    }

    public String getChavecteanulacao() {
        return chavecteanulacao;
    }

    public void setChavecteanulacao(String chavecteanulacao) {
        this.chavecteanulacao = chavecteanulacao;
    }

    public String getChavectesubstituicao() {
        return chavectesubstituicao;
    }

    public void setChavectesubstituicao(String chavectesubstituicao) {
        this.chavectesubstituicao = chavectesubstituicao;
    }

    public String getChavenfetomadorsub() {
        return chavenfetomadorsub;
    }

    public void setChavenfetomadorsub(String chavenfetomadorsub) {
        this.chavenfetomadorsub = chavenfetomadorsub;
    }

    public String getTipodocumentosub() {
        return tipodocumentosub;
    }

    public void setTipodocumentosub(String tipodocumentosub) {
        this.tipodocumentosub = tipodocumentosub;
    }

    public String getUfcteref() {
        return ufcteref;
    }

    public void setUfcteref(String ufcteref) {
        this.ufcteref = ufcteref;
    }

    public String getVersaorotina() {
        return versaorotina;
    }

    public void setVersaorotina(String versaorotina) {
        this.versaorotina = versaorotina;
    }

    public BigDecimal getVldescsociotorcedor() {
        return vldescsociotorcedor;
    }

    public void setVldescsociotorcedor(BigDecimal vldescsociotorcedor) {
        this.vldescsociotorcedor = vldescsociotorcedor;
    }

    public String getIdtipopresenca() {
        return idtipopresenca;
    }

    public void setIdtipopresenca(String idtipopresenca) {
        this.idtipopresenca = idtipopresenca;
    }

    public LocalDate getDtpagdotz() {
        return dtpagdotz;
    }

    public void setDtpagdotz(LocalDate dtpagdotz) {
        this.dtpagdotz = dtpagdotz;
    }

    public String getRotinacadcte() {
        return rotinacadcte;
    }

    public void setRotinacadcte(String rotinacadcte) {
        this.rotinacadcte = rotinacadcte;
    }

    public BigDecimal getVlbonificacerto() {
        return vlbonificacerto;
    }

    public void setVlbonificacerto(BigDecimal vlbonificacerto) {
        this.vlbonificacerto = vlbonificacerto;
    }

    public Long getNumregexp() {
        return numregexp;
    }

    public void setNumregexp(Long numregexp) {
        this.numregexp = numregexp;
    }

    public String getNumchaveexp() {
        return numchaveexp;
    }

    public void setNumchaveexp(String numchaveexp) {
        this.numchaveexp = numchaveexp;
    }

    public Long getNumdrawback() {
        return numdrawback;
    }

    public void setNumdrawback(Long numdrawback) {
        this.numdrawback = numdrawback;
    }

    public BigDecimal getVlsubtotal() {
        return vlsubtotal;
    }

    public void setVlsubtotal(BigDecimal vlsubtotal) {
        this.vlsubtotal = vlsubtotal;
    }

    public String getIdlocaldestmerc() {
        return idlocaldestmerc;
    }

    public void setIdlocaldestmerc(String idlocaldestmerc) {
        this.idlocaldestmerc = idlocaldestmerc;
    }

    public String getCodprodnfajuste() {
        return codprodnfajuste;
    }

    public void setCodprodnfajuste(String codprodnfajuste) {
        this.codprodnfajuste = codprodnfajuste;
    }

    public String getDescricaoprodnfajuste() {
        return descricaoprodnfajuste;
    }

    public void setDescricaoprodnfajuste(String descricaoprodnfajuste) {
        this.descricaoprodnfajuste = descricaoprodnfajuste;
    }

    public String getNcmnfajuste() {
        return ncmnfajuste;
    }

    public void setNcmnfajuste(String ncmnfajuste) {
        this.ncmnfajuste = ncmnfajuste;
    }

    public String getUnidadenfajuste() {
        return unidadenfajuste;
    }

    public void setUnidadenfajuste(String unidadenfajuste) {
        this.unidadenfajuste = unidadenfajuste;
    }

    public BigDecimal getVltotbrutoprodajuste() {
        return vltotbrutoprodajuste;
    }

    public void setVltotbrutoprodajuste(BigDecimal vltotbrutoprodajuste) {
        this.vltotbrutoprodajuste = vltotbrutoprodajuste;
    }

    public String getObsnfajuste() {
        return obsnfajuste;
    }

    public void setObsnfajuste(String obsnfajuste) {
        this.obsnfajuste = obsnfajuste;
    }

    public Integer getCtecodtranspsubcontratante() {
        return ctecodtranspsubcontratante;
    }

    public void setCtecodtranspsubcontratante(Integer ctecodtranspsubcontratante) {
        this.ctecodtranspsubcontratante = ctecodtranspsubcontratante;
    }

    public Integer getCtecodveiculosubcontratante() {
        return ctecodveiculosubcontratante;
    }

    public void setCtecodveiculosubcontratante(Integer ctecodveiculosubcontratante) {
        this.ctecodveiculosubcontratante = ctecodveiculosubcontratante;
    }

    public Integer getCtecodtomadorservico() {
        return ctecodtomadorservico;
    }

    public void setCtecodtomadorservico(Integer ctecodtomadorservico) {
        this.ctecodtomadorservico = ctecodtomadorservico;
    }

    public Integer getCtecodtranspsubcontratado() {
        return ctecodtranspsubcontratado;
    }

    public void setCtecodtranspsubcontratado(Integer ctecodtranspsubcontratado) {
        this.ctecodtranspsubcontratado = ctecodtranspsubcontratado;
    }

    public String getCtesubcontratadochavecteref() {
        return ctesubcontratadochavecteref;
    }

    public void setCtesubcontratadochavecteref(String ctesubcontratadochavecteref) {
        this.ctesubcontratadochavecteref = ctesubcontratadochavecteref;
    }

    public Integer getCodfornecfretecteref() {
        return codfornecfretecteref;
    }

    public void setCodfornecfretecteref(Integer codfornecfretecteref) {
        this.codfornecfretecteref = codfornecfretecteref;
    }

    public Integer getCodrecebfretecteref() {
        return codrecebfretecteref;
    }

    public void setCodrecebfretecteref(Integer codrecebfretecteref) {
        this.codrecebfretecteref = codrecebfretecteref;
    }

    public String getTiposervicocte() {
        return tiposervicocte;
    }

    public void setTiposervicocte(String tiposervicocte) {
        this.tiposervicocte = tiposervicocte;
    }

    public String getTiposubcontratacaocte() {
        return tiposubcontratacaocte;
    }

    public void setTiposubcontratacaocte(String tiposubcontratacaocte) {
        this.tiposubcontratacaocte = tiposubcontratacaocte;
    }

    public String getTipopresencaadquirinte() {
        return tipopresencaadquirinte;
    }

    public void setTipopresencaadquirinte(String tipopresencaadquirinte) {
        this.tipopresencaadquirinte = tipopresencaadquirinte;
    }

    public String getDocemissao() {
        return docemissao;
    }

    public void setDocemissao(String docemissao) {
        this.docemissao = docemissao;
    }

    public BigDecimal getVlgris() {
        return vlgris;
    }

    public void setVlgris(BigDecimal vlgris) {
        this.vlgris = vlgris;
    }

    public BigDecimal getVldesppedagio() {
        return vldesppedagio;
    }

    public void setVldesppedagio(BigDecimal vldesppedagio) {
        this.vldesppedagio = vldesppedagio;
    }

    public BigDecimal getVltas() {
        return vltas;
    }

    public void setVltas(BigDecimal vltas) {
        this.vltas = vltas;
    }

    public Long getNumfechamentomovcx() {
        return numfechamentomovcx;
    }

    public void setNumfechamentomovcx(Long numfechamentomovcx) {
        this.numfechamentomovcx = numfechamentomovcx;
    }

    public LocalDate getDtmovimentocx() {
        return dtmovimentocx;
    }

    public void setDtmovimentocx(LocalDate dtmovimentocx) {
        this.dtmovimentocx = dtmovimentocx;
    }

    public String getIdentificarclientenfce() {
        return identificarclientenfce;
    }

    public void setIdentificarclientenfce(String identificarclientenfce) {
        this.identificarclientenfce = identificarclientenfce;
    }

    public String getMd5listaarq() {
        return md5listaarq;
    }

    public void setMd5listaarq(String md5listaarq) {
        this.md5listaarq = md5listaarq;
    }

    public String getVendanfseried() {
        return vendanfseried;
    }

    public void setVendanfseried(String vendanfseried) {
        this.vendanfseried = vendanfseried;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }

    public Long getNumremessa() {
        return numremessa;
    }

    public void setNumremessa(Long numremessa) {
        this.numremessa = numremessa;
    }

    public Short getTipomovgarantia() {
        return tipomovgarantia;
    }

    public void setTipomovgarantia(Short tipomovgarantia) {
        this.tipomovgarantia = tipomovgarantia;
    }

    public Long getFormulario() {
        return formulario;
    }

    public void setFormulario(Long formulario) {
        this.formulario = formulario;
    }

    public Long getNumnotamanif() {
        return numnotamanif;
    }

    public void setNumnotamanif(Long numnotamanif) {
        this.numnotamanif = numnotamanif;
    }

    public String getOrigemfrete() {
        return origemfrete;
    }

    public void setOrigemfrete(String origemfrete) {
        this.origemfrete = origemfrete;
    }

    public Long getNumcirurgia() {
        return numcirurgia;
    }

    public void setNumcirurgia(Long numcirurgia) {
        this.numcirurgia = numcirurgia;
    }

    public String getUtilizaexpdiversos() {
        return utilizaexpdiversos;
    }

    public void setUtilizaexpdiversos(String utilizaexpdiversos) {
        this.utilizaexpdiversos = utilizaexpdiversos;
    }

    public Short getSituacaonfeepec() {
        return situacaonfeepec;
    }

    public void setSituacaonfeepec(Short situacaonfeepec) {
        this.situacaonfeepec = situacaonfeepec;
    }

    public String getProtocolonfeepec() {
        return protocolonfeepec;
    }

    public void setProtocolonfeepec(String protocolonfeepec) {
        this.protocolonfeepec = protocolonfeepec;
    }

    public LocalDate getDatahoraregistroepec() {
        return datahoraregistroepec;
    }

    public void setDatahoraregistroepec(LocalDate datahoraregistroepec) {
        this.datahoraregistroepec = datahoraregistroepec;
    }

    public Long getNumtransentorigconsig() {
        return numtransentorigconsig;
    }

    public void setNumtransentorigconsig(Long numtransentorigconsig) {
        this.numtransentorigconsig = numtransentorigconsig;
    }

    public String getNumseriesat() {
        return numseriesat;
    }

    public void setNumseriesat(String numseriesat) {
        this.numseriesat = numseriesat;
    }

    public String getChavesat() {
        return chavesat;
    }

    public void setChavesat(String chavesat) {
        this.chavesat = chavesat;
    }

    public String getSituacaosat() {
        return situacaosat;
    }

    public void setSituacaosat(String situacaosat) {
        this.situacaosat = situacaosat;
    }

    public String getEmissnumautomatico() {
        return emissnumautomatico;
    }

    public void setEmissnumautomatico(String emissnumautomatico) {
        this.emissnumautomatico = emissnumautomatico;
    }

    public LocalDate getDatahoraemissaosat() {
        return datahoraemissaosat;
    }

    public void setDatahoraemissaosat(LocalDate datahoraemissaosat) {
        this.datahoraemissaosat = datahoraemissaosat;
    }

    public String getQrcodesat() {
        return qrcodesat;
    }

    public void setQrcodesat(String qrcodesat) {
        this.qrcodesat = qrcodesat;
    }

    public String getQrcodenfce() {
        return qrcodenfce;
    }

    public void setQrcodenfce(String qrcodenfce) {
        this.qrcodenfce = qrcodenfce;
    }

    public BigDecimal getVldescfin() {
        return vldescfin;
    }

    public void setVldescfin(BigDecimal vldescfin) {
        this.vldescfin = vldescfin;
    }

    public BigDecimal getPerdescfintot() {
        return perdescfintot;
    }

    public void setPerdescfintot(BigDecimal perdescfintot) {
        this.perdescfintot = perdescfintot;
    }

    public Short getHoraentrega() {
        return horaentrega;
    }

    public void setHoraentrega(Short horaentrega) {
        this.horaentrega = horaentrega;
    }

    public Short getMinutoentrega() {
        return minutoentrega;
    }

    public void setMinutoentrega(Short minutoentrega) {
        this.minutoentrega = minutoentrega;
    }

    public Short getHorasaida() {
        return horasaida;
    }

    public void setHorasaida(Short horasaida) {
        this.horasaida = horasaida;
    }

    public Short getMinutosaida() {
        return minutosaida;
    }

    public void setMinutosaida(Short minutosaida) {
        this.minutosaida = minutosaida;
    }

    public LocalDate getDtpagcomissao() {
        return dtpagcomissao;
    }

    public void setDtpagcomissao(LocalDate dtpagcomissao) {
        this.dtpagcomissao = dtpagcomissao;
    }

    public BigDecimal getVlboleto() {
        return vlboleto;
    }

    public void setVlboleto(BigDecimal vlboleto) {
        this.vlboleto = vlboleto;
    }

    public Long getNumtransentnfestornada() {
        return numtransentnfestornada;
    }

    public void setNumtransentnfestornada(Long numtransentnfestornada) {
        this.numtransentnfestornada = numtransentnfestornada;
    }

    public String getNotadupliquesvc() {
        return notadupliquesvc;
    }

    public void setNotadupliquesvc(String notadupliquesvc) {
        this.notadupliquesvc = notadupliquesvc;
    }

    public Boolean getTipoinscprestserv() {
        return tipoinscprestserv;
    }

    public void setTipoinscprestserv(Boolean tipoinscprestserv) {
        this.tipoinscprestserv = tipoinscprestserv;
    }

    public Boolean getIndicprestserv() {
        return indicprestserv;
    }

    public void setIndicprestserv(Boolean indicprestserv) {
        this.indicprestserv = indicprestserv;
    }

    public Long getNumtransentdependente() {
        return numtransentdependente;
    }

    public void setNumtransentdependente(Long numtransentdependente) {
        this.numtransentdependente = numtransentdependente;
    }

    public Long getNumtransvendadependente() {
        return numtransvendadependente;
    }

    public void setNumtransvendadependente(Long numtransvendadependente) {
        this.numtransvendadependente = numtransvendadependente;
    }

    public String getRotinacad() {
        return rotinacad;
    }

    public void setRotinacad(String rotinacad) {
        this.rotinacad = rotinacad;
    }

    public String getNomearquivodotz() {
        return nomearquivodotz;
    }

    public void setNomearquivodotz(String nomearquivodotz) {
        this.nomearquivodotz = nomearquivodotz;
    }

    public String getNomearquivodotzestorno() {
        return nomearquivodotzestorno;
    }

    public void setNomearquivodotzestorno(String nomearquivodotzestorno) {
        this.nomearquivodotzestorno = nomearquivodotzestorno;
    }

    public Integer getPontosdotz() {
        return pontosdotz;
    }

    public void setPontosdotz(Integer pontosdotz) {
        this.pontosdotz = pontosdotz;
    }

    public BigDecimal getVlbaseretencao() {
        return vlbaseretencao;
    }

    public void setVlbaseretencao(BigDecimal vlbaseretencao) {
        this.vlbaseretencao = vlbaseretencao;
    }

    public Boolean getCodretencaocprb() {
        return codretencaocprb;
    }

    public void setCodretencaocprb(Boolean codretencaocprb) {
        this.codretencaocprb = codretencaocprb;
    }

    public Long getCodstatussat() {
        return codstatussat;
    }

    public void setCodstatussat(Long codstatussat) {
        this.codstatussat = codstatussat;
    }

    public Short getNumviasgnre() {
        return numviasgnre;
    }

    public void setNumviasgnre(Short numviasgnre) {
        this.numviasgnre = numviasgnre;
    }

    public Integer getQtdereprocnfe() {
        return qtdereprocnfe;
    }

    public void setQtdereprocnfe(Integer qtdereprocnfe) {
        this.qtdereprocnfe = qtdereprocnfe;
    }

    public String getCteregimeespecial() {
        return cteregimeespecial;
    }

    public void setCteregimeespecial(String cteregimeespecial) {
        this.cteregimeespecial = cteregimeespecial;
    }

    public String getNfdeventfutura() {
        return nfdeventfutura;
    }

    public void setNfdeventfutura(String nfdeventfutura) {
        this.nfdeventfutura = nfdeventfutura;
    }

    public String getTransfdep() {
        return transfdep;
    }

    public void setTransfdep(String transfdep) {
        this.transfdep = transfdep;
    }

    public String getTipotransfentredeposito() {
        return tipotransfentredeposito;
    }

    public void setTipotransfentredeposito(String tipotransfentredeposito) {
        this.tipotransfentredeposito = tipotransfentredeposito;
    }

    public Long getUidregistro() {
        return uidregistro;
    }

    public void setUidregistro(Long uidregistro) {
        this.uidregistro = uidregistro;
    }

    public String getIdparceiro() {
        return idparceiro;
    }

    public void setIdparceiro(String idparceiro) {
        this.idparceiro = idparceiro;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public String getImprimiudactejuntodanfe() {
        return imprimiudactejuntodanfe;
    }

    public void setImprimiudactejuntodanfe(String imprimiudactejuntodanfe) {
        this.imprimiudactejuntodanfe = imprimiudactejuntodanfe;
    }

    public Long getNumnotavinculada() {
        return numnotavinculada;
    }

    public void setNumnotavinculada(Long numnotavinculada) {
        this.numnotavinculada = numnotavinculada;
    }

    public LocalDate getDtpagcomissaoop() {
        return dtpagcomissaoop;
    }

    public void setDtpagcomissaoop(LocalDate dtpagcomissaoop) {
        this.dtpagcomissaoop = dtpagcomissaoop;
    }

    public String getTipodocarrecgnre() {
        return tipodocarrecgnre;
    }

    public void setTipodocarrecgnre(String tipodocarrecgnre) {
        this.tipodocarrecgnre = tipodocarrecgnre;
    }

    public String getUfbeneficiaria() {
        return ufbeneficiaria;
    }

    public void setUfbeneficiaria(String ufbeneficiaria) {
        this.ufbeneficiaria = ufbeneficiaria;
    }

    public String getNumdocarrec() {
        return numdocarrec;
    }

    public void setNumdocarrec(String numdocarrec) {
        this.numdocarrec = numdocarrec;
    }

    public String getCodautenticacao() {
        return codautenticacao;
    }

    public void setCodautenticacao(String codautenticacao) {
        this.codautenticacao = codautenticacao;
    }

    public BigDecimal getVldocarrecadacao() {
        return vldocarrecadacao;
    }

    public void setVldocarrecadacao(BigDecimal vldocarrecadacao) {
        this.vldocarrecadacao = vldocarrecadacao;
    }

    public LocalDate getDtvencarrec() {
        return dtvencarrec;
    }

    public void setDtvencarrec(LocalDate dtvencarrec) {
        this.dtvencarrec = dtvencarrec;
    }

    public LocalDate getDtpagarrec() {
        return dtpagarrec;
    }

    public void setDtpagarrec(LocalDate dtpagarrec) {
        this.dtpagarrec = dtpagarrec;
    }

    public BigDecimal getVloperacaofrete() {
        return vloperacaofrete;
    }

    public void setVloperacaofrete(BigDecimal vloperacaofrete) {
        this.vloperacaofrete = vloperacaofrete;
    }

    public BigDecimal getVlbasestfrete() {
        return vlbasestfrete;
    }

    public void setVlbasestfrete(BigDecimal vlbasestfrete) {
        this.vlbasestfrete = vlbasestfrete;
    }

    public BigDecimal getVlicmsstfrete() {
        return vlicmsstfrete;
    }

    public void setVlicmsstfrete(BigDecimal vlicmsstfrete) {
        this.vlicmsstfrete = vlicmsstfrete;
    }

    public String getCteglobalizado() {
        return cteglobalizado;
    }

    public void setCteglobalizado(String cteglobalizado) {
        this.cteglobalizado = cteglobalizado;
    }

    public Boolean getTomadorcte() {
        return tomadorcte;
    }

    public void setTomadorcte(Boolean tomadorcte) {
        this.tomadorcte = tomadorcte;
    }

    public BigDecimal getVlcsll() {
        return vlcsll;
    }

    public void setVlcsll(BigDecimal vlcsll) {
        this.vlcsll = vlcsll;
    }

    public String getCnpjseguradora() {
        return cnpjseguradora;
    }

    public void setCnpjseguradora(String cnpjseguradora) {
        this.cnpjseguradora = cnpjseguradora;
    }

    public String getInfglobalizado() {
        return infglobalizado;
    }

    public void setInfglobalizado(String infglobalizado) {
        this.infglobalizado = infglobalizado;
    }

    public Integer getQtdereproccte() {
        return qtdereproccte;
    }

    public void setQtdereproccte(Integer qtdereproccte) {
        this.qtdereproccte = qtdereproccte;
    }

    public BigDecimal getPercentualstfrete() {
        return percentualstfrete;
    }

    public void setPercentualstfrete(BigDecimal percentualstfrete) {
        this.percentualstfrete = percentualstfrete;
    }

    public Integer getCodedital() {
        return codedital;
    }

    public void setCodedital(Integer codedital) {
        this.codedital = codedital;
    }

    public String getUsamultuniditem() {
        return usamultuniditem;
    }

    public void setUsamultuniditem(String usamultuniditem) {
        this.usamultuniditem = usamultuniditem;
    }

    public String getCondfinanc() {
        return condfinanc;
    }

    public void setCondfinanc(String condfinanc) {
        this.condfinanc = condfinanc;
    }

    public String getFilMontarkitautomaticamente() {
        return filMontarkitautomaticamente;
    }

    public void setFilMontarkitautomaticamente(String filMontarkitautomaticamente) {
        this.filMontarkitautomaticamente = filMontarkitautomaticamente;
    }

    public Long getNumnotaorigem() {
        return numnotaorigem;
    }

    public void setNumnotaorigem(Long numnotaorigem) {
        this.numnotaorigem = numnotaorigem;
    }

    public Short getPlanosuppli() {
        return planosuppli;
    }

    public void setPlanosuppli(Short planosuppli) {
        this.planosuppli = planosuppli;
    }

    public String getPagchequemoradia() {
        return pagchequemoradia;
    }

    public void setPagchequemoradia(String pagchequemoradia) {
        this.pagchequemoradia = pagchequemoradia;
    }

    public String getTiporemessa() {
        return tiporemessa;
    }

    public void setTiporemessa(String tiporemessa) {
        this.tiporemessa = tiporemessa;
    }

    public Long getCodtranspautonomo() {
        return codtranspautonomo;
    }

    public void setCodtranspautonomo(Long codtranspautonomo) {
        this.codtranspautonomo = codtranspautonomo;
    }

    public BigDecimal getVltranspautonomo() {
        return vltranspautonomo;
    }

    public void setVltranspautonomo(BigDecimal vltranspautonomo) {
        this.vltranspautonomo = vltranspautonomo;
    }

    public String getTranspautonomo() {
        return transpautonomo;
    }

    public void setTranspautonomo(String transpautonomo) {
        this.transpautonomo = transpautonomo;
    }

    public String getGerarcptranspaunotomo() {
        return gerarcptranspaunotomo;
    }

    public void setGerarcptranspaunotomo(String gerarcptranspaunotomo) {
        this.gerarcptranspaunotomo = gerarcptranspaunotomo;
    }

    public Long getCodfornectranspautonomo() {
        return codfornectranspautonomo;
    }

    public void setCodfornectranspautonomo(Long codfornectranspautonomo) {
        this.codfornectranspautonomo = codfornectranspautonomo;
    }

    public String getCodcobsefaz() {
        return codcobsefaz;
    }

    public void setCodcobsefaz(String codcobsefaz) {
        this.codcobsefaz = codcobsefaz;
    }

    public String getDigitoverificadornfse() {
        return digitoverificadornfse;
    }

    public void setDigitoverificadornfse(String digitoverificadornfse) {
        this.digitoverificadornfse = digitoverificadornfse;
    }

    public String getLinknfse() {
        return linknfse;
    }

    public void setLinknfse(String linknfse) {
        this.linknfse = linknfse;
    }

    public String getProtocolonfse() {
        return protocolonfse;
    }

    public void setProtocolonfse(String protocolonfse) {
        this.protocolonfse = protocolonfse;
    }

    public String getSerierps() {
        return serierps;
    }

    public void setSerierps(String serierps) {
        this.serierps = serierps;
    }

    public Long getNumerorps() {
        return numerorps;
    }

    public void setNumerorps(Long numerorps) {
        this.numerorps = numerorps;
    }

    public Long getSituacaonfse() {
        return situacaonfse;
    }

    public void setSituacaonfse(Long situacaonfse) {
        this.situacaonfse = situacaonfse;
    }

    public Long getNumnotanfse() {
        return numnotanfse;
    }

    public void setNumnotanfse(Long numnotanfse) {
        this.numnotanfse = numnotanfse;
    }

    public String getMd5paf() {
        return md5paf;
    }

    public void setMd5paf(String md5paf) {
        this.md5paf = md5paf;
    }

    public Short getCodplpagetico() {
        return codplpagetico;
    }

    public void setCodplpagetico(Short codplpagetico) {
        this.codplpagetico = codplpagetico;
    }

    public Short getCodplpaggenerico() {
        return codplpaggenerico;
    }

    public void setCodplpaggenerico(Short codplpaggenerico) {
        this.codplpaggenerico = codplpaggenerico;
    }

    public Integer getCodpromocaomed() {
        return codpromocaomed;
    }

    public void setCodpromocaomed(Integer codpromocaomed) {
        this.codpromocaomed = codpromocaomed;
    }

    public BigDecimal getVlpunitmed() {
        return vlpunitmed;
    }

    public void setVlpunitmed(BigDecimal vlpunitmed) {
        this.vlpunitmed = vlpunitmed;
    }

    public BigDecimal getVltotalfcpst() {
        return vltotalfcpst;
    }

    public void setVltotalfcpst(BigDecimal vltotalfcpst) {
        this.vltotalfcpst = vltotalfcpst;
    }

    public BigDecimal getVltotalfcpicms() {
        return vltotalfcpicms;
    }

    public void setVltotalfcpicms(BigDecimal vltotalfcpicms) {
        this.vltotalfcpicms = vltotalfcpicms;
    }

    public BigDecimal getVlfreteoutrasdesp() {
        return vlfreteoutrasdesp;
    }

    public void setVlfreteoutrasdesp(BigDecimal vlfreteoutrasdesp) {
        this.vlfreteoutrasdesp = vlfreteoutrasdesp;
    }

    public BigDecimal getVltotalnfcompoemcte() {
        return vltotalnfcompoemcte;
    }

    public void setVltotalnfcompoemcte(BigDecimal vltotalnfcompoemcte) {
        this.vltotalnfcompoemcte = vltotalnfcompoemcte;
    }

    public String getDeduzirdesonerorgaopub() {
        return deduzirdesonerorgaopub;
    }

    public void setDeduzirdesonerorgaopub(String deduzirdesonerorgaopub) {
        this.deduzirdesonerorgaopub = deduzirdesonerorgaopub;
    }

    public String getTipocontacorrente() {
        return tipocontacorrente;
    }

    public void setTipocontacorrente(String tipocontacorrente) {
        this.tipocontacorrente = tipocontacorrente;
    }

    public String getNumeroprocesso() {
        return numeroprocesso;
    }

    public void setNumeroprocesso(String numeroprocesso) {
        this.numeroprocesso = numeroprocesso;
    }

    public String getTipoprocesso() {
        return tipoprocesso;
    }

    public void setTipoprocesso(String tipoprocesso) {
        this.tipoprocesso = tipoprocesso;
    }

    public String getCodigoindicativosuspensao() {
        return codigoindicativosuspensao;
    }

    public void setCodigoindicativosuspensao(String codigoindicativosuspensao) {
        this.codigoindicativosuspensao = codigoindicativosuspensao;
    }

    public String getMaterialdeconstrucao() {
        return materialdeconstrucao;
    }

    public void setMaterialdeconstrucao(String materialdeconstrucao) {
        this.materialdeconstrucao = materialdeconstrucao;
    }

    public String getDeduziricmsbasepiscofins() {
        return deduziricmsbasepiscofins;
    }

    public void setDeduziricmsbasepiscofins(String deduziricmsbasepiscofins) {
        this.deduziricmsbasepiscofins = deduziricmsbasepiscofins;
    }

    public Integer getCodmuninicte() {
        return codmuninicte;
    }

    public void setCodmuninicte(Integer codmuninicte) {
        this.codmuninicte = codmuninicte;
    }

    public Integer getCodmunfimcte() {
        return codmunfimcte;
    }

    public void setCodmunfimcte(Integer codmunfimcte) {
        this.codmunfimcte = codmunfimcte;
    }

    public BigDecimal getVlcredicmspresumido() {
        return vlcredicmspresumido;
    }

    public void setVlcredicmspresumido(BigDecimal vlcredicmspresumido) {
        this.vlcredicmspresumido = vlcredicmspresumido;
    }

    public LocalDate getDataconsolidacaoprefat() {
        return dataconsolidacaoprefat;
    }

    public void setDataconsolidacaoprefat(LocalDate dataconsolidacaoprefat) {
        this.dataconsolidacaoprefat = dataconsolidacaoprefat;
    }

    public String getVersaolayoutnfe() {
        return versaolayoutnfe;
    }

    public void setVersaolayoutnfe(String versaolayoutnfe) {
        this.versaolayoutnfe = versaolayoutnfe;
    }

    public String getObsnfefisco() {
        return obsnfefisco;
    }

    public void setObsnfefisco(String obsnfefisco) {
        this.obsnfefisco = obsnfefisco;
    }

    public String getPctEstoque() {
        return pctEstoque;
    }

    public void setPctEstoque(String pctEstoque) {
        this.pctEstoque = pctEstoque;
    }

    public String getPctCusto() {
        return pctCusto;
    }

    public void setPctCusto(String pctCusto) {
        this.pctCusto = pctCusto;
    }

    public Integer getCoddevedorcte() {
        return coddevedorcte;
    }

    public void setCoddevedorcte(Integer coddevedorcte) {
        this.coddevedorcte = coddevedorcte;
    }

    public BigDecimal getVlservicofreteauton() {
        return vlservicofreteauton;
    }

    public void setVlservicofreteauton(BigDecimal vlservicofreteauton) {
        this.vlservicofreteauton = vlservicofreteauton;
    }

    public BigDecimal getVlbasefreteauton() {
        return vlbasefreteauton;
    }

    public void setVlbasefreteauton(BigDecimal vlbasefreteauton) {
        this.vlbasefreteauton = vlbasefreteauton;
    }

    public BigDecimal getAliqicmfreteauton() {
        return aliqicmfreteauton;
    }

    public void setAliqicmfreteauton(BigDecimal aliqicmfreteauton) {
        this.aliqicmfreteauton = aliqicmfreteauton;
    }

    public BigDecimal getVlicmfreteauton() {
        return vlicmfreteauton;
    }

    public void setVlicmfreteauton(BigDecimal vlicmfreteauton) {
        this.vlicmfreteauton = vlicmfreteauton;
    }

    public Integer getCodfiscalfreteauton() {
        return codfiscalfreteauton;
    }

    public void setCodfiscalfreteauton(Integer codfiscalfreteauton) {
        this.codfiscalfreteauton = codfiscalfreteauton;
    }

    public Long getCodmunicipfatgerador() {
        return codmunicipfatgerador;
    }

    public void setCodmunicipfatgerador(Long codmunicipfatgerador) {
        this.codmunicipfatgerador = codmunicipfatgerador;
    }

    public Long getNumnotapref() {
        return numnotapref;
    }

    public void setNumnotapref(Long numnotapref) {
        this.numnotapref = numnotapref;
    }

    public BigDecimal getStbcr() {
        return stbcr;
    }

    public void setStbcr(BigDecimal stbcr) {
        this.stbcr = stbcr;
    }

    public String getSomarepasseoutrasdespnf() {
        return somarepasseoutrasdespnf;
    }

    public void setSomarepasseoutrasdespnf(String somarepasseoutrasdespnf) {
        this.somarepasseoutrasdespnf = somarepasseoutrasdespnf;
    }

    public String getNfipiemitida() {
        return nfipiemitida;
    }

    public void setNfipiemitida(String nfipiemitida) {
        this.nfipiemitida = nfipiemitida;
    }

    public String getAproveitastdevfornec() {
        return aproveitastdevfornec;
    }

    public void setAproveitastdevfornec(String aproveitastdevfornec) {
        this.aproveitastdevfornec = aproveitastdevfornec;
    }

    public String getIndicadordesconto() {
        return indicadordesconto;
    }

    public void setIndicadordesconto(String indicadordesconto) {
        this.indicadordesconto = indicadordesconto;
    }

    public String getIndicadoracrescimo() {
        return indicadoracrescimo;
    }

    public void setIndicadoracrescimo(String indicadoracrescimo) {
        this.indicadoracrescimo = indicadoracrescimo;
    }

    public Long getCodcoordenador() {
        return codcoordenador;
    }

    public void setCodcoordenador(Long codcoordenador) {
        this.codcoordenador = codcoordenador;
    }

    public Short getCodgerentenacional() {
        return codgerentenacional;
    }

    public void setCodgerentenacional(Short codgerentenacional) {
        this.codgerentenacional = codgerentenacional;
    }

    public Short getCoddiretor() {
        return coddiretor;
    }

    public void setCoddiretor(Short coddiretor) {
        this.coddiretor = coddiretor;
    }

    public Short getCodgerenteregional() {
        return codgerenteregional;
    }

    public void setCodgerenteregional(Short codgerenteregional) {
        this.codgerenteregional = codgerenteregional;
    }

    public String getUsasrvterceiros() {
        return usasrvterceiros;
    }

    public void setUsasrvterceiros(String usasrvterceiros) {
        this.usasrvterceiros = usasrvterceiros;
    }

    public String getEnviadasemresposta() {
        return enviadasemresposta;
    }

    public void setEnviadasemresposta(String enviadasemresposta) {
        this.enviadasemresposta = enviadasemresposta;
    }

    public String getPedidoavaria() {
        return pedidoavaria;
    }

    public void setPedidoavaria(String pedidoavaria) {
        this.pedidoavaria = pedidoavaria;
    }

    public Long getNumtransentcrossdock() {
        return numtransentcrossdock;
    }

    public void setNumtransentcrossdock(Long numtransentcrossdock) {
        this.numtransentcrossdock = numtransentcrossdock;
    }

    public String getIdsofitview() {
        return idsofitview;
    }

    public void setIdsofitview(String idsofitview) {
        this.idsofitview = idsofitview;
    }

    public Instant getDtexclusaosofitview() {
        return dtexclusaosofitview;
    }

    public void setDtexclusaosofitview(Instant dtexclusaosofitview) {
        this.dtexclusaosofitview = dtexclusaosofitview;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public Integer getCodprofissional() {
        return codprofissional;
    }

    public void setCodprofissional(Integer codprofissional) {
        this.codprofissional = codprofissional;
    }

    public Long getNumtransentorigtv10() {
        return numtransentorigtv10;
    }

    public void setNumtransentorigtv10(Long numtransentorigtv10) {
        this.numtransentorigtv10 = numtransentorigtv10;
    }

    public String getReduzicmsdocte() {
        return reduzicmsdocte;
    }

    public void setReduzicmsdocte(String reduzicmsdocte) {
        this.reduzicmsdocte = reduzicmsdocte;
    }

    public BigDecimal getVljurosparcelamento() {
        return vljurosparcelamento;
    }

    public void setVljurosparcelamento(BigDecimal vljurosparcelamento) {
        this.vljurosparcelamento = vljurosparcelamento;
    }

    public String getPctEstoqueCancelamento() {
        return pctEstoqueCancelamento;
    }

    public void setPctEstoqueCancelamento(String pctEstoqueCancelamento) {
        this.pctEstoqueCancelamento = pctEstoqueCancelamento;
    }

    public String getPctCustoCancelamento() {
        return pctCustoCancelamento;
    }

    public void setPctCustoCancelamento(String pctCustoCancelamento) {
        this.pctCustoCancelamento = pctCustoCancelamento;
    }

    public String getNumciot() {
        return numciot;
    }

    public void setNumciot(String numciot) {
        this.numciot = numciot;
    }

    public String getNfbrindezerada() {
        return nfbrindezerada;
    }

    public void setNfbrindezerada(String nfbrindezerada) {
        this.nfbrindezerada = nfbrindezerada;
    }

    public String getNfbrinde() {
        return nfbrinde;
    }

    public void setNfbrinde(String nfbrinde) {
        this.nfbrinde = nfbrinde;
    }

    public Long getNumsessaosat() {
        return numsessaosat;
    }

    public void setNumsessaosat(Long numsessaosat) {
        this.numsessaosat = numsessaosat;
    }

    public Long getQtpalete() {
        return qtpalete;
    }

    public void setQtpalete(Long qtpalete) {
        this.qtpalete = qtpalete;
    }

    public BigDecimal getTotpesopalete() {
        return totpesopalete;
    }

    public void setTotpesopalete(BigDecimal totpesopalete) {
        this.totpesopalete = totpesopalete;
    }

    public String getCodigonumericochave() {
        return codigonumericochave;
    }

    public void setCodigonumericochave(String codigonumericochave) {
        this.codigonumericochave = codigonumericochave;
    }

    public String getTipoimpressao() {
        return tipoimpressao;
    }

    public void setTipoimpressao(String tipoimpressao) {
        this.tipoimpressao = tipoimpressao;
    }

    public String getDeduzfuncepbasepiscofins() {
        return deduzfuncepbasepiscofins;
    }

    public void setDeduzfuncepbasepiscofins(String deduzfuncepbasepiscofins) {
        this.deduzfuncepbasepiscofins = deduzfuncepbasepiscofins;
    }

    public String getCnpjintermediador() {
        return cnpjintermediador;
    }

    public void setCnpjintermediador(String cnpjintermediador) {
        this.cnpjintermediador = cnpjintermediador;
    }

    public String getDescintermediador() {
        return descintermediador;
    }

    public void setDescintermediador(String descintermediador) {
        this.descintermediador = descintermediador;
    }

    public String getDesfezkitcanc() {
        return desfezkitcanc;
    }

    public void setDesfezkitcanc(String desfezkitcanc) {
        this.desfezkitcanc = desfezkitcanc;
    }

    public LocalDate getDtexpwmssaas() {
        return dtexpwmssaas;
    }

    public void setDtexpwmssaas(LocalDate dtexpwmssaas) {
        this.dtexpwmssaas = dtexpwmssaas;
    }

    public String getCalcdesoneracaofatmedicam() {
        return calcdesoneracaofatmedicam;
    }

    public void setCalcdesoneracaofatmedicam(String calcdesoneracaofatmedicam) {
        this.calcdesoneracaofatmedicam = calcdesoneracaofatmedicam;
    }

    public String getNumtranspagdigital() {
        return numtranspagdigital;
    }

    public void setNumtranspagdigital(String numtranspagdigital) {
        this.numtranspagdigital = numtranspagdigital;
    }

    public String getGerarcpct() {
        return gerarcpct;
    }

    public void setGerarcpct(String gerarcpct) {
        this.gerarcpct = gerarcpct;
    }

    public String getGerarcrct() {
        return gerarcrct;
    }

    public void setGerarcrct(String gerarcrct) {
        this.gerarcrct = gerarcrct;
    }

    public Long getCodsefazsat() {
        return codsefazsat;
    }

    public void setCodsefazsat(Long codsefazsat) {
        this.codsefazsat = codsefazsat;
    }

    public String getGerougrne() {
        return gerougrne;
    }

    public void setGerougrne(String gerougrne) {
        this.gerougrne = gerougrne;
    }

    public String getVoltarestoquefilialvirtual() {
        return voltarestoquefilialvirtual;
    }

    public void setVoltarestoquefilialvirtual(String voltarestoquefilialvirtual) {
        this.voltarestoquefilialvirtual = voltarestoquefilialvirtual;
    }

    public String getVoltarestoquefilialretira() {
        return voltarestoquefilialretira;
    }

    public void setVoltarestoquefilialretira(String voltarestoquefilialretira) {
        this.voltarestoquefilialretira = voltarestoquefilialretira;
    }

    public String getTipoprestacao() {
        return tipoprestacao;
    }

    public void setTipoprestacao(String tipoprestacao) {
        this.tipoprestacao = tipoprestacao;
    }

    public String getNumcoleta() {
        return numcoleta;
    }

    public void setNumcoleta(String numcoleta) {
        this.numcoleta = numcoleta;
    }

    public String getIdexternocoletaentrega() {
        return idexternocoletaentrega;
    }

    public void setIdexternocoletaentrega(String idexternocoletaentrega) {
        this.idexternocoletaentrega = idexternocoletaentrega;
    }

    public String getSituacaocoletaentrega() {
        return situacaocoletaentrega;
    }

    public void setSituacaocoletaentrega(String situacaocoletaentrega) {
        this.situacaocoletaentrega = situacaocoletaentrega;
    }

    public LocalDate getDtentgacoletaentrega() {
        return dtentgacoletaentrega;
    }

    public void setDtentgacoletaentrega(LocalDate dtentgacoletaentrega) {
        this.dtentgacoletaentrega = dtentgacoletaentrega;
    }

    public LocalDate getDtultaltocoletaentrega() {
        return dtultaltocoletaentrega;
    }

    public void setDtultaltocoletaentrega(LocalDate dtultaltocoletaentrega) {
        this.dtultaltocoletaentrega = dtultaltocoletaentrega;
    }

    public String getCtesimplificado() {
        return ctesimplificado;
    }

    public void setCtesimplificado(String ctesimplificado) {
        this.ctesimplificado = ctesimplificado;
    }

    public BigDecimal getVlfretetransportarnf() {
        return vlfretetransportarnf;
    }

    public void setVlfretetransportarnf(BigDecimal vlfretetransportarnf) {
        this.vlfretetransportarnf = vlfretetransportarnf;
    }

}