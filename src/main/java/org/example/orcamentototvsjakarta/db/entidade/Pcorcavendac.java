package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PCORCAVENDAC")
public class Pcorcavendac {
    @Id
    @Column(name = "NUMORCA", nullable = false)
    private Long id;

    @Column(name = "\"DATA\"")
    private LocalDate data;

    @Column(name = "VLTOTAL", precision = 19, scale = 6)
    private BigDecimal vltotal;

    @Column(name = "CODCLI", nullable = false)
    private Integer codcli;

    @Column(name = "CODUSUR", nullable = false)
    private Short codusur;

    @Column(name = "DTENTREGA")
    private LocalDate dtentrega;

    @Column(name = "VLTABELA", precision = 19, scale = 6)
    private BigDecimal vltabela;

    @Column(name = "CODFILIAL", length = 2)
    private String codfilial;

    @Column(name = "VLDESCONTO", precision = 12, scale = 2)
    private BigDecimal vldesconto;

    @Column(name = "TIPOVENDA", length = 2)
    private String tipovenda;

    @Column(name = "OBS", length = 25)
    private String obs;

    @Column(name = "VLCUSTOREAL", precision = 14, scale = 2)
    private BigDecimal vlcustoreal;

    @Column(name = "VLCUSTOFIN", precision = 14, scale = 2)
    private BigDecimal vlcustofin;

    @Column(name = "VLFRETE", precision = 14, scale = 2)
    private BigDecimal vlfrete;

    @Column(name = "VLOUTRASDESP", precision = 14, scale = 2)
    private BigDecimal vloutrasdesp;

    @Column(name = "TOTPESO", precision = 10, scale = 2)
    private BigDecimal totpeso;

    @Column(name = "TOTVOLUME", precision = 18, scale = 6)
    private BigDecimal totvolume;

    @Column(name = "CODPRACA", nullable = false)
    private Short codpraca;

    @Column(name = "NUMITENS")
    private Short numitens;

    @Column(name = "CODEMITENTE")
    private Integer codemitente;

    @Column(name = "DTCANCEL")
    private LocalDate dtcancel;

    @Column(name = "POSICAO", nullable = false, length = 2)
    private String posicao;

    @Column(name = "VLATEND", precision = 16, scale = 3)
    private BigDecimal vlatend;

    @Column(name = "OPERACAO", length = 1)
    private String operacao;

    @Column(name = "NUMCAR", nullable = false)
    private Integer numcar;

    @Column(name = "CODCOB", length = 4)
    private String codcob;

    @Column(name = "HORA")
    private Short hora;

    @Column(name = "MINUTO")
    private Short minuto;

    @Column(name = "NUMSEQENTREGA")
    private Long numseqentrega;

    @Column(name = "CUSTOENTREGA", precision = 14, scale = 2)
    private BigDecimal custoentrega;

    @Column(name = "CODSUPERVISOR", nullable = false)
    private Short codsupervisor;

    @Column(name = "CAMPANHA", length = 2)
    private String campanha;

    @Column(name = "NUMPEDCLI", length = 15)
    private String numpedcli;

    @Column(name = "CONDVENDA")
    private Integer condvenda;

    @Column(name = "PERCVENDA", precision = 5, scale = 2)
    private BigDecimal percvenda;

    @Column(name = "OBS1", length = 50)
    private String obs1;

    @Column(name = "OBS2", length = 50)
    private String obs2;

    @Column(name = "PERDESC", precision = 18, scale = 6)
    private BigDecimal perdesc;

    @Column(name = "NEGOCIADO", length = 1)
    private String negociado;

    @Column(name = "CODPLPAG", nullable = false)
    private Short codplpag;

    @Column(name = "CODFUNCCANCEL")
    private Integer codfunccancel;

    @Column(name = "NUMTRANSVENDA")
    private Long numtransvenda;

    @Column(name = "MONTANDO", length = 1)
    private String montando;

    @Column(name = "NUMPEDRCA")
    private Long numpedrca;

    @Column(name = "FRETEDESPACHO", length = 1)
    private String fretedespacho;

    @Column(name = "FRETEREDESPACHO", length = 1)
    private String freteredespacho;

    @Column(name = "CODFORNECFRETE")
    private Integer codfornecfrete;

    @Column(name = "TIPOCARGA", length = 1)
    private String tipocarga;

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

    @Column(name = "PRAZOMEDIO")
    private Short prazomedio;

    @Column(name = "OBSENTREGA1", length = 75)
    private String obsentrega1;

    @Column(name = "OBSENTREGA2", length = 75)
    private String obsentrega2;

    @Column(name = "OBSENTREGA3", length = 75)
    private String obsentrega3;

    @Column(name = "TIPOEMBALAGEM", length = 1)
    private String tipoembalagem;

    @Column(name = "CODEPTO")
    private Integer codepto;

    @Column(name = "DTLIBERA")
    private LocalDate dtlibera;

    @Column(name = "CLIENTE", length = 60)
    private String cliente;

    @Column(name = "CNPJ", length = 18)
    private String cnpj;

    @Column(name = "ENDERECO", length = 40)
    private String endereco;

    @Column(name = "BAIRRO", length = 40)
    private String bairro;

    @Column(name = "UF", length = 2)
    private String uf;

    @Column(name = "TELEFONE", length = 13)
    private String telefone;

    @Column(name = "IE", length = 18)
    private String ie;

    @Column(name = "CODATV1")
    private Integer codatv1;

    @Column(name = "CIDADE", length = 80)
    private String cidade;

    @Column(name = "ORCAMENTOUTILIZADO", length = 1)
    private String orcamentoutilizado;

    @Column(name = "MARGEM", precision = 10, scale = 2)
    private BigDecimal margem;

    @Column(name = "VLDESCONTOTOTAL", precision = 12, scale = 2)
    private BigDecimal vldescontototal;

    @Column(name = "PERDESCTOTAL", precision = 18, scale = 6)
    private BigDecimal perdesctotal;

    @Column(name = "CODFILIALNF", length = 2)
    private String codfilialnf;

    @Column(name = "NUMPED")
    private Long numped;

    @Column(name = "ORCADOPOR", length = 60)
    private String orcadopor;

    @Column(name = "DTVALIDADE")
    private LocalDate dtvalidade;

    @Column(name = "VLCUSTOCONT", precision = 18, scale = 6)
    private BigDecimal vlcustocont;

    @Column(name = "VLCUSTOREP", precision = 18, scale = 6)
    private BigDecimal vlcustorep;

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

    @Column(name = "ORIGEMPED", length = 1)
    private String origemped;

    @Column(name = "TOTVLREDCOMISSSUP", precision = 18, scale = 6)
    private BigDecimal totvlredcomisssup;

    @Column(name = "NUMEROORCAMENTO")
    private Integer numeroorcamento;

    @Column(name = "NUMORCAFILIAL")
    private Long numorcafilial;

    @Column(name = "CODCLIRECEBEDOR")
    private Integer codclirecebedor;

    @Column(name = "NUMREGIAO")
    private Short numregiao;

    @Column(name = "SELECIONAREGIAOAVULSA", length = 1)
    private String selecionaregiaoavulsa;

    @Column(name = "NUMREGIAOAVULSA")
    private Short numregiaoavulsa;

    @Column(name = "TIPOORCAMENTO", length = 1)
    private String tipoorcamento;

    @Column(name = "CODPROFISSIONAL")
    private Integer codprofissional;

    @Column(name = "TIPORETIRADA", length = 1)
    private String tiporetirada;

    @Column(name = "NUMORCAENTFUT")
    private Long numorcaentfut;

    @Column(name = "TRIBUTAPORREGIAOFILIAL", length = 1)
    private String tributaporregiaofilial;

    @Column(name = "ORCASALVO", length = 1)
    private String orcasalvo;

    @Column(name = "NUMORCAORIGEM")
    private Long numorcaorigem;

    @Column(name = "NUMNOTA")
    private Long numnota;

    @Column(name = "PERDESCFIN", precision = 12, scale = 6)
    private BigDecimal perdescfin;

    @Column(name = "RESERVARITENSTV7", length = 1)
    private String reservaritenstv7;

    @Column(name = "NUMPREVENDA")
    private Long numprevenda;

    @Column(name = "TIPOOPER", length = 1)
    private String tipooper;

    @Column(name = "GERACP", length = 1)
    private String geracp;

    @Column(name = "ESTOQUEVENDAVALERESERVADO", length = 1)
    private String estoquevendavalereservado;

    @Column(name = "ORCAGERADODEVALES", length = 1)
    private String orcageradodevales;

    @Column(name = "PERCCOMPROFISSIONAL", precision = 8, scale = 4)
    private BigDecimal perccomprofissional;

    @Column(name = "NUMSERIEEQUIP", length = 30)
    private String numserieequip;

    @Column(name = "EXPORTADO", length = 1)
    private String exportado;

    @Column(name = "DTEXPORTACAO")
    private LocalDate dtexportacao;

    @Column(name = "NUMCAIXA")
    private Short numcaixa;

    @Column(name = "NUMPEDECF")
    private Long numpedecf;

    @Column(name = "NUMORCAPRINC")
    private Long numorcaprinc;

    @Column(name = "CONDVENDADESTINO")
    private Integer condvendadestino;

    @Column(name = "TIPONFDESTINO", length = 2)
    private String tiponfdestino;

    @Column(name = "CODFILIALRETIRA1", length = 2)
    private String codfilialretira1;

    @Column(name = "CODFILIALRETIRA2", length = 2)
    private String codfilialretira2;

    @Column(name = "CODFILIALRETIRA3", length = 2)
    private String codfilialretira3;

    @Column(name = "CODENDENT")
    private Integer codendent;

    @Column(name = "DUPLICADO", length = 1)
    private String duplicado;

    @Column(name = "USACFOPVENDANATV10", length = 1)
    private String usacfopvendanatv10;

    @Lob
    @Column(name = "LOG")
    private String log;

    @Column(name = "USAINTEGRACAOWMS", length = 1)
    private String usaintegracaowms;

    @Column(name = "CODFORNECREDESPACHO")
    private Integer codfornecredespacho;

    @Column(name = "CODMOTIVO")
    private Integer codmotivo;

    @Column(name = "VENDAASSISTIDA", length = 1)
    private String vendaassistida;

    @Column(name = "CONVERTIDOPEDIDO", length = 1)
    private String convertidopedido;

    @Column(name = "ESPECIEMANIF", length = 2)
    private String especiemanif;

    @Column(name = "CODDISTRIB", length = 4)
    private String coddistrib;

    @Column(name = "NUMNOTAMANIF")
    private Long numnotamanif;

    @Column(name = "SERIEMANIF", length = 2)
    private String seriemanif;

    @Column(name = "NUMPEDENTFUT")
    private Long numpedentfut;

    @Column(name = "NUMCARMANIF")
    private Integer numcarmanif;

    @Column(name = "CODCONTRATO")
    private Integer codcontrato;

    @Column(name = "DATAPEDCLI")
    private LocalDate datapedcli;

    @Column(name = "NUMPEDBNF")
    private Long numpedbnf;

    @Column(name = "BROKER", length = 1)
    private String broker;

    @Column(name = "CODESTABELECIMENTO", length = 3)
    private String codestabelecimento;

    @Column(name = "NUMTABELA", length = 20)
    private String numtabela;

    @Column(name = "MOTIVOPOSICAO", length = 60)
    private String motivoposicao;

    @Column(name = "DTAGENDAENTREGA")
    private LocalDate dtagendaentrega;

    @Column(name = "CODMOTBLOQUEIO")
    private Integer codmotbloqueio;

    @Column(name = "SERIEECF", length = 2)
    private String serieecf;

    @Column(name = "NUMCUPOM")
    private Long numcupom;

    @Column(name = "CONCILIAIMPORTACAO", length = 1)
    private String conciliaimportacao;

    @Column(name = "RESTRICAOTRANSP", length = 1)
    private String restricaotransp;

    @Column(name = "TIPOPRIORIDADEENTREGA", length = 1)
    private String tipoprioridadeentrega;

    @Column(name = "DTCALCFRETE")
    private LocalDate dtcalcfrete;

    @Column(name = "CODFUNCCALCFRETE")
    private Integer codfunccalcfrete;

    @Column(name = "EANCOBRANCA")
    private Long eancobranca;

    @Column(name = "EANENTREGA")
    private Long eanentrega;

    @Column(name = "DTVENC1")
    private LocalDate dtvenc1;

    @Column(name = "DTVENC2")
    private LocalDate dtvenc2;

    @Column(name = "DTVENC3")
    private LocalDate dtvenc3;

    @Column(name = "CODUSUR2")
    private Integer codusur2;

    @Column(name = "CODUSUR3")
    private Integer codusur3;

    @Column(name = "CODUSUR4")
    private Integer codusur4;

    @Column(name = "CODPRACADESTINO")
    private Short codpracadestino;

    @Column(name = "GERARCONTROLEDEENTREGA", length = 1)
    private String gerarcontroledeentrega;

    @Column(name = "CODCLINF")
    private Integer codclinf;

    @Column(name = "CODTRANSP")
    private Integer codtransp;

    @Column(name = "NUMDAV")
    private Long numdav;

    @Column(name = "DTIMPORTACAO")
    private LocalDate dtimportacao;

    @Column(name = "TIPODOC", length = 1)
    private String tipodoc;

    @Column(name = "NUMCCF")
    private Integer numccf;

    @Column(name = "PERCDESCATIV", precision = 5, scale = 2)
    private BigDecimal percdescativ;

    @Column(name = "VLENTRADA", precision = 16, scale = 3)
    private BigDecimal vlentrada;

    @Column(name = "VENDATRIANGULAR", length = 1)
    private String vendatriangular;

    @Column(name = "CODVISITA")
    private Long codvisita;

    @Column(name = "TIPODOCUMENTO", length = 1)
    private String tipodocumento;

    @Column(name = "VALORDESCFIN", precision = 18, scale = 3)
    private BigDecimal valordescfin;

    @Column(name = "UFDESEMBARACO", length = 2)
    private String ufdesembaraco;

    @Column(name = "LOCALDESEMBARACO", length = 30)
    private String localdesembaraco;

    @Column(name = "PLACAVEICULO", length = 10)
    private String placaveiculo;

    @Column(name = "ROTINALANC", length = 48)
    private String rotinalanc;

    @Column(name = "CARTAOFIDELIDADE", length = 1)
    private String cartaofidelidade;

    @Column(name = "ASSINATURA")
    private String assinatura;

    @Column(name = "NUMFICHA")
    private Long numficha;

    @Column(name = "LISTA_MD5_2030MG", length = 40)
    private String listaMd52030mg;

    @Column(name = "DATAHORA_PRIMEIRODOCUMENTO_ECF", length = 19)
    private String datahoraPrimeirodocumentoEcf;

    @Column(name = "NUMLISTA")
    private Integer numlista;

    @Column(name = "CODPLPAGETICO")
    private Short codplpagetico;

    @Column(name = "CODPLPAGGENERICO")
    private Short codplpaggenerico;

    @Column(name = "PERDESCAVISTA", precision = 18, scale = 6)
    private BigDecimal perdescavista;

    @Column(name = "PLPAGAAVISTA", length = 1)
    private String plpagaavista;

    @Column(name = "PLPAGAVISTA", length = 1)
    private String plpagavista;

    @Column(name = "COOCONF", length = 10)
    private String cooconf;

    @Column(name = "GNFCONF", length = 6)
    private String gnfconf;

    @Column(name = "DTABERTURA")
    private LocalDate dtabertura;

    @Column(name = "DTFECHAMENTO")
    private LocalDate dtfechamento;

    @Column(name = "EDITANDOORCA", length = 1)
    private String editandoorca;

    @Column(name = "VLTROCO", precision = 19, scale = 6)
    private BigDecimal vltroco;

    @Column(name = "NUMNOTATRANSF")
    private Long numnotatransf;

    @Column(name = "CODMOTIVONAOATENDORCA")
    private Short codmotivonaoatendorca;

    @Column(name = "CODCONTATO")
    private Integer codcontato;

    @Column(name = "TIPOIMPR", length = 1)
    private String tipoimpr;

    @Column(name = "CARTAOCRM", length = 19)
    private String cartaocrm;

    @Column(name = "CODCRECLI")
    private Integer codcrecli;

    @Column(name = "CODCRED")
    private Integer codcred;

    @Column(name = "NUMTRANSENTORIGEM")
    private Long numtransentorigem;

    @Column(name = "NFCE", length = 1)
    private String nfce;

    @Column(name = "CODFRETE")
    private Long codfrete;

    @Column(name = "COLUNAFRETE")
    private Short colunafrete;

    @Column(name = "CONTAORDEM", length = 1)
    private String contaordem;

    @Column(name = "VLBONIFIC", precision = 16, scale = 3)
    private BigDecimal vlbonific;

    @Column(name = "HORAENTREGA")
    private Short horaentrega;

    @Column(name = "MINUTOENTREGA")
    private Short minutoentrega;

    @Column(name = "ACAOSOLICITADA", length = 2)
    private String acaosolicitada;

    @Column(name = "PERCDESCONTORODAPE", precision = 18, scale = 6)
    private BigDecimal percdescontorodape;

    @Column(name = "BLOQUEARALTERACAO", length = 1)
    private String bloquearalteracao;

    @Column(name = "PERCACRESCRODAPE", precision = 18, scale = 6)
    private BigDecimal percacrescrodape;

    @Column(name = "TRIBVENDATRIANGULAR", length = 1)
    private String tribvendatriangular;

    @Column(name = "CODEDITAL")
    private Integer codedital;

    @Column(name = "AGRUPAMENTO", length = 1)
    private String agrupamento;

    @Column(name = "DTENVIOSERVCARGA")
    private LocalDate dtenvioservcarga;

    @Column(name = "PAGCHEQUEMORADIA", length = 1)
    private String pagchequemoradia;

    @Column(name = "QTPARCELAS")
    private Short qtparcelas;

    @Column(name = "NSU", length = 15)
    private String nsu;

    @Column(name = "CODAUTORIZACAO")
    private Long codautorizacao;

    @Column(name = "TIPOOPERACAOTEF", length = 4)
    private String tipooperacaotef;

    @Column(name = "CODBANDEIRATEF", length = 5)
    private String codbandeiratef;

    @Column(name = "CODADMCARTAO", length = 6)
    private String codadmcartao;

    @Column(name = "DATAHORA")
    private LocalDate datahora;

    @Column(name = "NUMNFPAF")
    private Long numnfpaf;

    @Column(name = "MD5PAF", length = 200)
    private String md5paf;

    @Column(name = "BLOQUEIO_PAF", length = 1)
    private String bloqueioPaf;

    @Column(name = "VENDALOCESTRANG", length = 1)
    private String vendalocestrang;

    @Column(name = "CODACORDOPARCERIA")
    private Long codacordoparceria;

    @Column(name = "USADEBCREDRCA", length = 1)
    private String usadebcredrca;

    @Column(name = "NUMCONTRATOCOMODLOC")
    private Integer numcontratocomodloc;

    @Column(name = "UIDREGISTRO")
    private Long uidregistro;

    @Column(name = "IDPARCEIRO", length = 15)
    private String idparceiro;

    @Column(name = "CODPROMOCAOMED")
    private Integer codpromocaomed;

    @Column(name = "NUMVIASORCA")
    private Short numviasorca;

    @Column(name = "MENSAGEM", length = 3000)
    private String mensagem;

    @Column(name = "SITUACAOENTREGA", length = 2)
    private String situacaoentrega;

    @Column(name = "CODMOTORISTA")
    private Integer codmotorista;

    @Column(name = "DTENTREGAENVIO")
    private LocalDate dtentregaenvio;

    @Column(name = "DTENTREGARETORNO")
    private LocalDate dtentregaretorno;

    @Column(name = "CODENTREGA")
    private Integer codentrega;

    @Column(name = "VLEMDINHEIRO", precision = 22, scale = 6)
    private BigDecimal vlemdinheiro;

    @Column(name = "CODCLITV8")
    private Integer codclitv8;

    @Column(name = "TIPOCONTACORRENTE", length = 1)
    private String tipocontacorrente;

    @Column(name = "EMAILENVIADO", length = 1)
    private String emailenviado;

    @Column(name = "INDICADORDESCONTO", length = 1)
    private String indicadordesconto;

    @Column(name = "INDICADORACRESCIMO", length = 1)
    private String indicadoracrescimo;

    @Column(name = "PERMITEPRODSEMDISTRIBUICAO", length = 1)
    private String permiteprodsemdistribuicao;

    @Column(name = "TIPOFV", length = 2)
    private String tipofv;

    @Column(name = "JSONCRM_CLIENTE")
    private byte[] jsoncrmCliente;

    @Column(name = "JSONCRM_PROCESSAVENDA")
    private byte[] jsoncrmProcessavenda;

    @Column(name = "JSONTPD_PAGAMENTO")
    private byte[] jsontpdPagamento;

    @Column(name = "ENVIAEMAIL", length = 1)
    private String enviaemail;

    @Column(name = "CNPJINTERMEDIADOR", length = 20)
    private String cnpjintermediador;

    @Column(name = "DESCINTERMEDIADOR", length = 60)
    private String descintermediador;

    @Column(name = "OPERVENDAEXPINDIRETA", length = 1)
    private String opervendaexpindireta;

    @Column(name = "DTINITRANSACAODIG")
    private LocalDate dtinitransacaodig;

    @Column(name = "DTITERACAOTRANSACAODIG")
    private LocalDate dtiteracaotransacaodig;

    @Column(name = "STATUSTRANSACAODIG", length = 25)
    private String statustransacaodig;

    @Column(name = "DATAEMPENHO")
    private LocalDate dataempenho;

    @Column(name = "NUMEMPENHO", length = 20)
    private String numempenho;

    @Column(name = "CODUNIDADEEXECUTORA", length = 20)
    private String codunidadeexecutora;

    @Column(name = "CODCLIPALM")
    private Integer codclipalm;

    @Column(name = "CODBNF")
    private Short codbnf;

    @Column(name = "CUSTOBONIFICACAO", length = 1)
    private String custobonificacao;

    @Column(name = "CODFORNECBONIFIC")
    private Integer codfornecbonific;

    @Column(name = "MESASERVIR", precision = 18, scale = 6)
    private BigDecimal mesaservir;

    @Column(name = "FUT_DATACRIACAO")
    private LocalDate futDatacriacao;

    @Column(name = "ATUALIZADO", length = 1)
    private String atualizado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getVltotal() {
        return vltotal;
    }

    public void setVltotal(BigDecimal vltotal) {
        this.vltotal = vltotal;
    }

    public Integer getCodcli() {
        return codcli;
    }

    public void setCodcli(Integer codcli) {
        this.codcli = codcli;
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

    public Short getCodpraca() {
        return codpraca;
    }

    public void setCodpraca(Short codpraca) {
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

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public BigDecimal getVlatend() {
        return vlatend;
    }

    public void setVlatend(BigDecimal vlatend) {
        this.vlatend = vlatend;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
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

    public Short getHora() {
        return hora;
    }

    public void setHora(Short hora) {
        this.hora = hora;
    }

    public Short getMinuto() {
        return minuto;
    }

    public void setMinuto(Short minuto) {
        this.minuto = minuto;
    }

    public Long getNumseqentrega() {
        return numseqentrega;
    }

    public void setNumseqentrega(Long numseqentrega) {
        this.numseqentrega = numseqentrega;
    }

    public BigDecimal getCustoentrega() {
        return custoentrega;
    }

    public void setCustoentrega(BigDecimal custoentrega) {
        this.custoentrega = custoentrega;
    }

    public Short getCodsupervisor() {
        return codsupervisor;
    }

    public void setCodsupervisor(Short codsupervisor) {
        this.codsupervisor = codsupervisor;
    }

    public String getCampanha() {
        return campanha;
    }

    public void setCampanha(String campanha) {
        this.campanha = campanha;
    }

    public String getNumpedcli() {
        return numpedcli;
    }

    public void setNumpedcli(String numpedcli) {
        this.numpedcli = numpedcli;
    }

    public Integer getCondvenda() {
        return condvenda;
    }

    public void setCondvenda(Integer condvenda) {
        this.condvenda = condvenda;
    }

    public BigDecimal getPercvenda() {
        return percvenda;
    }

    public void setPercvenda(BigDecimal percvenda) {
        this.percvenda = percvenda;
    }

    public String getObs1() {
        return obs1;
    }

    public void setObs1(String obs1) {
        this.obs1 = obs1;
    }

    public String getObs2() {
        return obs2;
    }

    public void setObs2(String obs2) {
        this.obs2 = obs2;
    }

    public BigDecimal getPerdesc() {
        return perdesc;
    }

    public void setPerdesc(BigDecimal perdesc) {
        this.perdesc = perdesc;
    }

    public String getNegociado() {
        return negociado;
    }

    public void setNegociado(String negociado) {
        this.negociado = negociado;
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

    public Long getNumtransvenda() {
        return numtransvenda;
    }

    public void setNumtransvenda(Long numtransvenda) {
        this.numtransvenda = numtransvenda;
    }

    public String getMontando() {
        return montando;
    }

    public void setMontando(String montando) {
        this.montando = montando;
    }

    public Long getNumpedrca() {
        return numpedrca;
    }

    public void setNumpedrca(Long numpedrca) {
        this.numpedrca = numpedrca;
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

    public String getTipocarga() {
        return tipocarga;
    }

    public void setTipocarga(String tipocarga) {
        this.tipocarga = tipocarga;
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

    public Short getPrazomedio() {
        return prazomedio;
    }

    public void setPrazomedio(Short prazomedio) {
        this.prazomedio = prazomedio;
    }

    public String getObsentrega1() {
        return obsentrega1;
    }

    public void setObsentrega1(String obsentrega1) {
        this.obsentrega1 = obsentrega1;
    }

    public String getObsentrega2() {
        return obsentrega2;
    }

    public void setObsentrega2(String obsentrega2) {
        this.obsentrega2 = obsentrega2;
    }

    public String getObsentrega3() {
        return obsentrega3;
    }

    public void setObsentrega3(String obsentrega3) {
        this.obsentrega3 = obsentrega3;
    }

    public String getTipoembalagem() {
        return tipoembalagem;
    }

    public void setTipoembalagem(String tipoembalagem) {
        this.tipoembalagem = tipoembalagem;
    }

    public Integer getCodepto() {
        return codepto;
    }

    public void setCodepto(Integer codepto) {
        this.codepto = codepto;
    }

    public LocalDate getDtlibera() {
        return dtlibera;
    }

    public void setDtlibera(LocalDate dtlibera) {
        this.dtlibera = dtlibera;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Integer getCodatv1() {
        return codatv1;
    }

    public void setCodatv1(Integer codatv1) {
        this.codatv1 = codatv1;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getOrcamentoutilizado() {
        return orcamentoutilizado;
    }

    public void setOrcamentoutilizado(String orcamentoutilizado) {
        this.orcamentoutilizado = orcamentoutilizado;
    }

    public BigDecimal getMargem() {
        return margem;
    }

    public void setMargem(BigDecimal margem) {
        this.margem = margem;
    }

    public BigDecimal getVldescontototal() {
        return vldescontototal;
    }

    public void setVldescontototal(BigDecimal vldescontototal) {
        this.vldescontototal = vldescontototal;
    }

    public BigDecimal getPerdesctotal() {
        return perdesctotal;
    }

    public void setPerdesctotal(BigDecimal perdesctotal) {
        this.perdesctotal = perdesctotal;
    }

    public String getCodfilialnf() {
        return codfilialnf;
    }

    public void setCodfilialnf(String codfilialnf) {
        this.codfilialnf = codfilialnf;
    }

    public Long getNumped() {
        return numped;
    }

    public void setNumped(Long numped) {
        this.numped = numped;
    }

    public String getOrcadopor() {
        return orcadopor;
    }

    public void setOrcadopor(String orcadopor) {
        this.orcadopor = orcadopor;
    }

    public LocalDate getDtvalidade() {
        return dtvalidade;
    }

    public void setDtvalidade(LocalDate dtvalidade) {
        this.dtvalidade = dtvalidade;
    }

    public BigDecimal getVlcustocont() {
        return vlcustocont;
    }

    public void setVlcustocont(BigDecimal vlcustocont) {
        this.vlcustocont = vlcustocont;
    }

    public BigDecimal getVlcustorep() {
        return vlcustorep;
    }

    public void setVlcustorep(BigDecimal vlcustorep) {
        this.vlcustorep = vlcustorep;
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

    public String getOrigemped() {
        return origemped;
    }

    public void setOrigemped(String origemped) {
        this.origemped = origemped;
    }

    public BigDecimal getTotvlredcomisssup() {
        return totvlredcomisssup;
    }

    public void setTotvlredcomisssup(BigDecimal totvlredcomisssup) {
        this.totvlredcomisssup = totvlredcomisssup;
    }

    public Integer getNumeroorcamento() {
        return numeroorcamento;
    }

    public void setNumeroorcamento(Integer numeroorcamento) {
        this.numeroorcamento = numeroorcamento;
    }

    public Long getNumorcafilial() {
        return numorcafilial;
    }

    public void setNumorcafilial(Long numorcafilial) {
        this.numorcafilial = numorcafilial;
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

    public String getSelecionaregiaoavulsa() {
        return selecionaregiaoavulsa;
    }

    public void setSelecionaregiaoavulsa(String selecionaregiaoavulsa) {
        this.selecionaregiaoavulsa = selecionaregiaoavulsa;
    }

    public Short getNumregiaoavulsa() {
        return numregiaoavulsa;
    }

    public void setNumregiaoavulsa(Short numregiaoavulsa) {
        this.numregiaoavulsa = numregiaoavulsa;
    }

    public String getTipoorcamento() {
        return tipoorcamento;
    }

    public void setTipoorcamento(String tipoorcamento) {
        this.tipoorcamento = tipoorcamento;
    }

    public Integer getCodprofissional() {
        return codprofissional;
    }

    public void setCodprofissional(Integer codprofissional) {
        this.codprofissional = codprofissional;
    }

    public String getTiporetirada() {
        return tiporetirada;
    }

    public void setTiporetirada(String tiporetirada) {
        this.tiporetirada = tiporetirada;
    }

    public Long getNumorcaentfut() {
        return numorcaentfut;
    }

    public void setNumorcaentfut(Long numorcaentfut) {
        this.numorcaentfut = numorcaentfut;
    }

    public String getTributaporregiaofilial() {
        return tributaporregiaofilial;
    }

    public void setTributaporregiaofilial(String tributaporregiaofilial) {
        this.tributaporregiaofilial = tributaporregiaofilial;
    }

    public String getOrcasalvo() {
        return orcasalvo;
    }

    public void setOrcasalvo(String orcasalvo) {
        this.orcasalvo = orcasalvo;
    }

    public Long getNumorcaorigem() {
        return numorcaorigem;
    }

    public void setNumorcaorigem(Long numorcaorigem) {
        this.numorcaorigem = numorcaorigem;
    }

    public Long getNumnota() {
        return numnota;
    }

    public void setNumnota(Long numnota) {
        this.numnota = numnota;
    }

    public BigDecimal getPerdescfin() {
        return perdescfin;
    }

    public void setPerdescfin(BigDecimal perdescfin) {
        this.perdescfin = perdescfin;
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

    public String getTipooper() {
        return tipooper;
    }

    public void setTipooper(String tipooper) {
        this.tipooper = tipooper;
    }

    public String getGeracp() {
        return geracp;
    }

    public void setGeracp(String geracp) {
        this.geracp = geracp;
    }

    public String getEstoquevendavalereservado() {
        return estoquevendavalereservado;
    }

    public void setEstoquevendavalereservado(String estoquevendavalereservado) {
        this.estoquevendavalereservado = estoquevendavalereservado;
    }

    public String getOrcageradodevales() {
        return orcageradodevales;
    }

    public void setOrcageradodevales(String orcageradodevales) {
        this.orcageradodevales = orcageradodevales;
    }

    public BigDecimal getPerccomprofissional() {
        return perccomprofissional;
    }

    public void setPerccomprofissional(BigDecimal perccomprofissional) {
        this.perccomprofissional = perccomprofissional;
    }

    public String getNumserieequip() {
        return numserieequip;
    }

    public void setNumserieequip(String numserieequip) {
        this.numserieequip = numserieequip;
    }

    public String getExportado() {
        return exportado;
    }

    public void setExportado(String exportado) {
        this.exportado = exportado;
    }

    public LocalDate getDtexportacao() {
        return dtexportacao;
    }

    public void setDtexportacao(LocalDate dtexportacao) {
        this.dtexportacao = dtexportacao;
    }

    public Short getNumcaixa() {
        return numcaixa;
    }

    public void setNumcaixa(Short numcaixa) {
        this.numcaixa = numcaixa;
    }

    public Long getNumpedecf() {
        return numpedecf;
    }

    public void setNumpedecf(Long numpedecf) {
        this.numpedecf = numpedecf;
    }

    public Long getNumorcaprinc() {
        return numorcaprinc;
    }

    public void setNumorcaprinc(Long numorcaprinc) {
        this.numorcaprinc = numorcaprinc;
    }

    public Integer getCondvendadestino() {
        return condvendadestino;
    }

    public void setCondvendadestino(Integer condvendadestino) {
        this.condvendadestino = condvendadestino;
    }

    public String getTiponfdestino() {
        return tiponfdestino;
    }

    public void setTiponfdestino(String tiponfdestino) {
        this.tiponfdestino = tiponfdestino;
    }

    public String getCodfilialretira1() {
        return codfilialretira1;
    }

    public void setCodfilialretira1(String codfilialretira1) {
        this.codfilialretira1 = codfilialretira1;
    }

    public String getCodfilialretira2() {
        return codfilialretira2;
    }

    public void setCodfilialretira2(String codfilialretira2) {
        this.codfilialretira2 = codfilialretira2;
    }

    public String getCodfilialretira3() {
        return codfilialretira3;
    }

    public void setCodfilialretira3(String codfilialretira3) {
        this.codfilialretira3 = codfilialretira3;
    }

    public Integer getCodendent() {
        return codendent;
    }

    public void setCodendent(Integer codendent) {
        this.codendent = codendent;
    }

    public String getDuplicado() {
        return duplicado;
    }

    public void setDuplicado(String duplicado) {
        this.duplicado = duplicado;
    }

    public String getUsacfopvendanatv10() {
        return usacfopvendanatv10;
    }

    public void setUsacfopvendanatv10(String usacfopvendanatv10) {
        this.usacfopvendanatv10 = usacfopvendanatv10;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getUsaintegracaowms() {
        return usaintegracaowms;
    }

    public void setUsaintegracaowms(String usaintegracaowms) {
        this.usaintegracaowms = usaintegracaowms;
    }

    public Integer getCodfornecredespacho() {
        return codfornecredespacho;
    }

    public void setCodfornecredespacho(Integer codfornecredespacho) {
        this.codfornecredespacho = codfornecredespacho;
    }

    public Integer getCodmotivo() {
        return codmotivo;
    }

    public void setCodmotivo(Integer codmotivo) {
        this.codmotivo = codmotivo;
    }

    public String getVendaassistida() {
        return vendaassistida;
    }

    public void setVendaassistida(String vendaassistida) {
        this.vendaassistida = vendaassistida;
    }

    public String getConvertidopedido() {
        return convertidopedido;
    }

    public void setConvertidopedido(String convertidopedido) {
        this.convertidopedido = convertidopedido;
    }

    public String getEspeciemanif() {
        return especiemanif;
    }

    public void setEspeciemanif(String especiemanif) {
        this.especiemanif = especiemanif;
    }

    public String getCoddistrib() {
        return coddistrib;
    }

    public void setCoddistrib(String coddistrib) {
        this.coddistrib = coddistrib;
    }

    public Long getNumnotamanif() {
        return numnotamanif;
    }

    public void setNumnotamanif(Long numnotamanif) {
        this.numnotamanif = numnotamanif;
    }

    public String getSeriemanif() {
        return seriemanif;
    }

    public void setSeriemanif(String seriemanif) {
        this.seriemanif = seriemanif;
    }

    public Long getNumpedentfut() {
        return numpedentfut;
    }

    public void setNumpedentfut(Long numpedentfut) {
        this.numpedentfut = numpedentfut;
    }

    public Integer getNumcarmanif() {
        return numcarmanif;
    }

    public void setNumcarmanif(Integer numcarmanif) {
        this.numcarmanif = numcarmanif;
    }

    public Integer getCodcontrato() {
        return codcontrato;
    }

    public void setCodcontrato(Integer codcontrato) {
        this.codcontrato = codcontrato;
    }

    public LocalDate getDatapedcli() {
        return datapedcli;
    }

    public void setDatapedcli(LocalDate datapedcli) {
        this.datapedcli = datapedcli;
    }

    public Long getNumpedbnf() {
        return numpedbnf;
    }

    public void setNumpedbnf(Long numpedbnf) {
        this.numpedbnf = numpedbnf;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public String getCodestabelecimento() {
        return codestabelecimento;
    }

    public void setCodestabelecimento(String codestabelecimento) {
        this.codestabelecimento = codestabelecimento;
    }

    public String getNumtabela() {
        return numtabela;
    }

    public void setNumtabela(String numtabela) {
        this.numtabela = numtabela;
    }

    public String getMotivoposicao() {
        return motivoposicao;
    }

    public void setMotivoposicao(String motivoposicao) {
        this.motivoposicao = motivoposicao;
    }

    public LocalDate getDtagendaentrega() {
        return dtagendaentrega;
    }

    public void setDtagendaentrega(LocalDate dtagendaentrega) {
        this.dtagendaentrega = dtagendaentrega;
    }

    public Integer getCodmotbloqueio() {
        return codmotbloqueio;
    }

    public void setCodmotbloqueio(Integer codmotbloqueio) {
        this.codmotbloqueio = codmotbloqueio;
    }

    public String getSerieecf() {
        return serieecf;
    }

    public void setSerieecf(String serieecf) {
        this.serieecf = serieecf;
    }

    public Long getNumcupom() {
        return numcupom;
    }

    public void setNumcupom(Long numcupom) {
        this.numcupom = numcupom;
    }

    public String getConciliaimportacao() {
        return conciliaimportacao;
    }

    public void setConciliaimportacao(String conciliaimportacao) {
        this.conciliaimportacao = conciliaimportacao;
    }

    public String getRestricaotransp() {
        return restricaotransp;
    }

    public void setRestricaotransp(String restricaotransp) {
        this.restricaotransp = restricaotransp;
    }

    public String getTipoprioridadeentrega() {
        return tipoprioridadeentrega;
    }

    public void setTipoprioridadeentrega(String tipoprioridadeentrega) {
        this.tipoprioridadeentrega = tipoprioridadeentrega;
    }

    public LocalDate getDtcalcfrete() {
        return dtcalcfrete;
    }

    public void setDtcalcfrete(LocalDate dtcalcfrete) {
        this.dtcalcfrete = dtcalcfrete;
    }

    public Integer getCodfunccalcfrete() {
        return codfunccalcfrete;
    }

    public void setCodfunccalcfrete(Integer codfunccalcfrete) {
        this.codfunccalcfrete = codfunccalcfrete;
    }

    public Long getEancobranca() {
        return eancobranca;
    }

    public void setEancobranca(Long eancobranca) {
        this.eancobranca = eancobranca;
    }

    public Long getEanentrega() {
        return eanentrega;
    }

    public void setEanentrega(Long eanentrega) {
        this.eanentrega = eanentrega;
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

    public Integer getCodusur2() {
        return codusur2;
    }

    public void setCodusur2(Integer codusur2) {
        this.codusur2 = codusur2;
    }

    public Integer getCodusur3() {
        return codusur3;
    }

    public void setCodusur3(Integer codusur3) {
        this.codusur3 = codusur3;
    }

    public Integer getCodusur4() {
        return codusur4;
    }

    public void setCodusur4(Integer codusur4) {
        this.codusur4 = codusur4;
    }

    public Short getCodpracadestino() {
        return codpracadestino;
    }

    public void setCodpracadestino(Short codpracadestino) {
        this.codpracadestino = codpracadestino;
    }

    public String getGerarcontroledeentrega() {
        return gerarcontroledeentrega;
    }

    public void setGerarcontroledeentrega(String gerarcontroledeentrega) {
        this.gerarcontroledeentrega = gerarcontroledeentrega;
    }

    public Integer getCodclinf() {
        return codclinf;
    }

    public void setCodclinf(Integer codclinf) {
        this.codclinf = codclinf;
    }

    public Integer getCodtransp() {
        return codtransp;
    }

    public void setCodtransp(Integer codtransp) {
        this.codtransp = codtransp;
    }

    public Long getNumdav() {
        return numdav;
    }

    public void setNumdav(Long numdav) {
        this.numdav = numdav;
    }

    public LocalDate getDtimportacao() {
        return dtimportacao;
    }

    public void setDtimportacao(LocalDate dtimportacao) {
        this.dtimportacao = dtimportacao;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public Integer getNumccf() {
        return numccf;
    }

    public void setNumccf(Integer numccf) {
        this.numccf = numccf;
    }

    public BigDecimal getPercdescativ() {
        return percdescativ;
    }

    public void setPercdescativ(BigDecimal percdescativ) {
        this.percdescativ = percdescativ;
    }

    public BigDecimal getVlentrada() {
        return vlentrada;
    }

    public void setVlentrada(BigDecimal vlentrada) {
        this.vlentrada = vlentrada;
    }

    public String getVendatriangular() {
        return vendatriangular;
    }

    public void setVendatriangular(String vendatriangular) {
        this.vendatriangular = vendatriangular;
    }

    public Long getCodvisita() {
        return codvisita;
    }

    public void setCodvisita(Long codvisita) {
        this.codvisita = codvisita;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public BigDecimal getValordescfin() {
        return valordescfin;
    }

    public void setValordescfin(BigDecimal valordescfin) {
        this.valordescfin = valordescfin;
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

    public String getPlacaveiculo() {
        return placaveiculo;
    }

    public void setPlacaveiculo(String placaveiculo) {
        this.placaveiculo = placaveiculo;
    }

    public String getRotinalanc() {
        return rotinalanc;
    }

    public void setRotinalanc(String rotinalanc) {
        this.rotinalanc = rotinalanc;
    }

    public String getCartaofidelidade() {
        return cartaofidelidade;
    }

    public void setCartaofidelidade(String cartaofidelidade) {
        this.cartaofidelidade = cartaofidelidade;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public Long getNumficha() {
        return numficha;
    }

    public void setNumficha(Long numficha) {
        this.numficha = numficha;
    }

    public String getListaMd52030mg() {
        return listaMd52030mg;
    }

    public void setListaMd52030mg(String listaMd52030mg) {
        this.listaMd52030mg = listaMd52030mg;
    }

    public String getDatahoraPrimeirodocumentoEcf() {
        return datahoraPrimeirodocumentoEcf;
    }

    public void setDatahoraPrimeirodocumentoEcf(String datahoraPrimeirodocumentoEcf) {
        this.datahoraPrimeirodocumentoEcf = datahoraPrimeirodocumentoEcf;
    }

    public Integer getNumlista() {
        return numlista;
    }

    public void setNumlista(Integer numlista) {
        this.numlista = numlista;
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

    public BigDecimal getPerdescavista() {
        return perdescavista;
    }

    public void setPerdescavista(BigDecimal perdescavista) {
        this.perdescavista = perdescavista;
    }

    public String getPlpagaavista() {
        return plpagaavista;
    }

    public void setPlpagaavista(String plpagaavista) {
        this.plpagaavista = plpagaavista;
    }

    public String getPlpagavista() {
        return plpagavista;
    }

    public void setPlpagavista(String plpagavista) {
        this.plpagavista = plpagavista;
    }

    public String getCooconf() {
        return cooconf;
    }

    public void setCooconf(String cooconf) {
        this.cooconf = cooconf;
    }

    public String getGnfconf() {
        return gnfconf;
    }

    public void setGnfconf(String gnfconf) {
        this.gnfconf = gnfconf;
    }

    public LocalDate getDtabertura() {
        return dtabertura;
    }

    public void setDtabertura(LocalDate dtabertura) {
        this.dtabertura = dtabertura;
    }

    public LocalDate getDtfechamento() {
        return dtfechamento;
    }

    public void setDtfechamento(LocalDate dtfechamento) {
        this.dtfechamento = dtfechamento;
    }

    public String getEditandoorca() {
        return editandoorca;
    }

    public void setEditandoorca(String editandoorca) {
        this.editandoorca = editandoorca;
    }

    public BigDecimal getVltroco() {
        return vltroco;
    }

    public void setVltroco(BigDecimal vltroco) {
        this.vltroco = vltroco;
    }

    public Long getNumnotatransf() {
        return numnotatransf;
    }

    public void setNumnotatransf(Long numnotatransf) {
        this.numnotatransf = numnotatransf;
    }

    public Short getCodmotivonaoatendorca() {
        return codmotivonaoatendorca;
    }

    public void setCodmotivonaoatendorca(Short codmotivonaoatendorca) {
        this.codmotivonaoatendorca = codmotivonaoatendorca;
    }

    public Integer getCodcontato() {
        return codcontato;
    }

    public void setCodcontato(Integer codcontato) {
        this.codcontato = codcontato;
    }

    public String getTipoimpr() {
        return tipoimpr;
    }

    public void setTipoimpr(String tipoimpr) {
        this.tipoimpr = tipoimpr;
    }

    public String getCartaocrm() {
        return cartaocrm;
    }

    public void setCartaocrm(String cartaocrm) {
        this.cartaocrm = cartaocrm;
    }

    public Integer getCodcrecli() {
        return codcrecli;
    }

    public void setCodcrecli(Integer codcrecli) {
        this.codcrecli = codcrecli;
    }

    public Integer getCodcred() {
        return codcred;
    }

    public void setCodcred(Integer codcred) {
        this.codcred = codcred;
    }

    public Long getNumtransentorigem() {
        return numtransentorigem;
    }

    public void setNumtransentorigem(Long numtransentorigem) {
        this.numtransentorigem = numtransentorigem;
    }

    public String getNfce() {
        return nfce;
    }

    public void setNfce(String nfce) {
        this.nfce = nfce;
    }

    public Long getCodfrete() {
        return codfrete;
    }

    public void setCodfrete(Long codfrete) {
        this.codfrete = codfrete;
    }

    public Short getColunafrete() {
        return colunafrete;
    }

    public void setColunafrete(Short colunafrete) {
        this.colunafrete = colunafrete;
    }

    public String getContaordem() {
        return contaordem;
    }

    public void setContaordem(String contaordem) {
        this.contaordem = contaordem;
    }

    public BigDecimal getVlbonific() {
        return vlbonific;
    }

    public void setVlbonific(BigDecimal vlbonific) {
        this.vlbonific = vlbonific;
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

    public String getAcaosolicitada() {
        return acaosolicitada;
    }

    public void setAcaosolicitada(String acaosolicitada) {
        this.acaosolicitada = acaosolicitada;
    }

    public BigDecimal getPercdescontorodape() {
        return percdescontorodape;
    }

    public void setPercdescontorodape(BigDecimal percdescontorodape) {
        this.percdescontorodape = percdescontorodape;
    }

    public String getBloquearalteracao() {
        return bloquearalteracao;
    }

    public void setBloquearalteracao(String bloquearalteracao) {
        this.bloquearalteracao = bloquearalteracao;
    }

    public BigDecimal getPercacrescrodape() {
        return percacrescrodape;
    }

    public void setPercacrescrodape(BigDecimal percacrescrodape) {
        this.percacrescrodape = percacrescrodape;
    }

    public String getTribvendatriangular() {
        return tribvendatriangular;
    }

    public void setTribvendatriangular(String tribvendatriangular) {
        this.tribvendatriangular = tribvendatriangular;
    }

    public Integer getCodedital() {
        return codedital;
    }

    public void setCodedital(Integer codedital) {
        this.codedital = codedital;
    }

    public String getAgrupamento() {
        return agrupamento;
    }

    public void setAgrupamento(String agrupamento) {
        this.agrupamento = agrupamento;
    }

    public LocalDate getDtenvioservcarga() {
        return dtenvioservcarga;
    }

    public void setDtenvioservcarga(LocalDate dtenvioservcarga) {
        this.dtenvioservcarga = dtenvioservcarga;
    }

    public String getPagchequemoradia() {
        return pagchequemoradia;
    }

    public void setPagchequemoradia(String pagchequemoradia) {
        this.pagchequemoradia = pagchequemoradia;
    }

    public Short getQtparcelas() {
        return qtparcelas;
    }

    public void setQtparcelas(Short qtparcelas) {
        this.qtparcelas = qtparcelas;
    }

    public String getNsu() {
        return nsu;
    }

    public void setNsu(String nsu) {
        this.nsu = nsu;
    }

    public Long getCodautorizacao() {
        return codautorizacao;
    }

    public void setCodautorizacao(Long codautorizacao) {
        this.codautorizacao = codautorizacao;
    }

    public String getTipooperacaotef() {
        return tipooperacaotef;
    }

    public void setTipooperacaotef(String tipooperacaotef) {
        this.tipooperacaotef = tipooperacaotef;
    }

    public String getCodbandeiratef() {
        return codbandeiratef;
    }

    public void setCodbandeiratef(String codbandeiratef) {
        this.codbandeiratef = codbandeiratef;
    }

    public String getCodadmcartao() {
        return codadmcartao;
    }

    public void setCodadmcartao(String codadmcartao) {
        this.codadmcartao = codadmcartao;
    }

    public LocalDate getDatahora() {
        return datahora;
    }

    public void setDatahora(LocalDate datahora) {
        this.datahora = datahora;
    }

    public Long getNumnfpaf() {
        return numnfpaf;
    }

    public void setNumnfpaf(Long numnfpaf) {
        this.numnfpaf = numnfpaf;
    }

    public String getMd5paf() {
        return md5paf;
    }

    public void setMd5paf(String md5paf) {
        this.md5paf = md5paf;
    }

    public String getBloqueioPaf() {
        return bloqueioPaf;
    }

    public void setBloqueioPaf(String bloqueioPaf) {
        this.bloqueioPaf = bloqueioPaf;
    }

    public String getVendalocestrang() {
        return vendalocestrang;
    }

    public void setVendalocestrang(String vendalocestrang) {
        this.vendalocestrang = vendalocestrang;
    }

    public Long getCodacordoparceria() {
        return codacordoparceria;
    }

    public void setCodacordoparceria(Long codacordoparceria) {
        this.codacordoparceria = codacordoparceria;
    }

    public String getUsadebcredrca() {
        return usadebcredrca;
    }

    public void setUsadebcredrca(String usadebcredrca) {
        this.usadebcredrca = usadebcredrca;
    }

    public Integer getNumcontratocomodloc() {
        return numcontratocomodloc;
    }

    public void setNumcontratocomodloc(Integer numcontratocomodloc) {
        this.numcontratocomodloc = numcontratocomodloc;
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

    public Integer getCodpromocaomed() {
        return codpromocaomed;
    }

    public void setCodpromocaomed(Integer codpromocaomed) {
        this.codpromocaomed = codpromocaomed;
    }

    public Short getNumviasorca() {
        return numviasorca;
    }

    public void setNumviasorca(Short numviasorca) {
        this.numviasorca = numviasorca;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getSituacaoentrega() {
        return situacaoentrega;
    }

    public void setSituacaoentrega(String situacaoentrega) {
        this.situacaoentrega = situacaoentrega;
    }

    public Integer getCodmotorista() {
        return codmotorista;
    }

    public void setCodmotorista(Integer codmotorista) {
        this.codmotorista = codmotorista;
    }

    public LocalDate getDtentregaenvio() {
        return dtentregaenvio;
    }

    public void setDtentregaenvio(LocalDate dtentregaenvio) {
        this.dtentregaenvio = dtentregaenvio;
    }

    public LocalDate getDtentregaretorno() {
        return dtentregaretorno;
    }

    public void setDtentregaretorno(LocalDate dtentregaretorno) {
        this.dtentregaretorno = dtentregaretorno;
    }

    public Integer getCodentrega() {
        return codentrega;
    }

    public void setCodentrega(Integer codentrega) {
        this.codentrega = codentrega;
    }

    public BigDecimal getVlemdinheiro() {
        return vlemdinheiro;
    }

    public void setVlemdinheiro(BigDecimal vlemdinheiro) {
        this.vlemdinheiro = vlemdinheiro;
    }

    public Integer getCodclitv8() {
        return codclitv8;
    }

    public void setCodclitv8(Integer codclitv8) {
        this.codclitv8 = codclitv8;
    }

    public String getTipocontacorrente() {
        return tipocontacorrente;
    }

    public void setTipocontacorrente(String tipocontacorrente) {
        this.tipocontacorrente = tipocontacorrente;
    }

    public String getEmailenviado() {
        return emailenviado;
    }

    public void setEmailenviado(String emailenviado) {
        this.emailenviado = emailenviado;
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

    public String getPermiteprodsemdistribuicao() {
        return permiteprodsemdistribuicao;
    }

    public void setPermiteprodsemdistribuicao(String permiteprodsemdistribuicao) {
        this.permiteprodsemdistribuicao = permiteprodsemdistribuicao;
    }

    public String getTipofv() {
        return tipofv;
    }

    public void setTipofv(String tipofv) {
        this.tipofv = tipofv;
    }

    public byte[] getJsoncrmCliente() {
        return jsoncrmCliente;
    }

    public void setJsoncrmCliente(byte[] jsoncrmCliente) {
        this.jsoncrmCliente = jsoncrmCliente;
    }

    public byte[] getJsoncrmProcessavenda() {
        return jsoncrmProcessavenda;
    }

    public void setJsoncrmProcessavenda(byte[] jsoncrmProcessavenda) {
        this.jsoncrmProcessavenda = jsoncrmProcessavenda;
    }

    public byte[] getJsontpdPagamento() {
        return jsontpdPagamento;
    }

    public void setJsontpdPagamento(byte[] jsontpdPagamento) {
        this.jsontpdPagamento = jsontpdPagamento;
    }

    public String getEnviaemail() {
        return enviaemail;
    }

    public void setEnviaemail(String enviaemail) {
        this.enviaemail = enviaemail;
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

    public String getOpervendaexpindireta() {
        return opervendaexpindireta;
    }

    public void setOpervendaexpindireta(String opervendaexpindireta) {
        this.opervendaexpindireta = opervendaexpindireta;
    }

    public LocalDate getDtinitransacaodig() {
        return dtinitransacaodig;
    }

    public void setDtinitransacaodig(LocalDate dtinitransacaodig) {
        this.dtinitransacaodig = dtinitransacaodig;
    }

    public LocalDate getDtiteracaotransacaodig() {
        return dtiteracaotransacaodig;
    }

    public void setDtiteracaotransacaodig(LocalDate dtiteracaotransacaodig) {
        this.dtiteracaotransacaodig = dtiteracaotransacaodig;
    }

    public String getStatustransacaodig() {
        return statustransacaodig;
    }

    public void setStatustransacaodig(String statustransacaodig) {
        this.statustransacaodig = statustransacaodig;
    }

    public LocalDate getDataempenho() {
        return dataempenho;
    }

    public void setDataempenho(LocalDate dataempenho) {
        this.dataempenho = dataempenho;
    }

    public String getNumempenho() {
        return numempenho;
    }

    public void setNumempenho(String numempenho) {
        this.numempenho = numempenho;
    }

    public String getCodunidadeexecutora() {
        return codunidadeexecutora;
    }

    public void setCodunidadeexecutora(String codunidadeexecutora) {
        this.codunidadeexecutora = codunidadeexecutora;
    }

    public Integer getCodclipalm() {
        return codclipalm;
    }

    public void setCodclipalm(Integer codclipalm) {
        this.codclipalm = codclipalm;
    }

    public Short getCodbnf() {
        return codbnf;
    }

    public void setCodbnf(Short codbnf) {
        this.codbnf = codbnf;
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

    public BigDecimal getMesaservir() {
        return mesaservir;
    }

    public void setMesaservir(BigDecimal mesaservir) {
        this.mesaservir = mesaservir;
    }

    public LocalDate getFutDatacriacao() {
        return futDatacriacao;
    }

    public void setFutDatacriacao(LocalDate futDatacriacao) {
        this.futDatacriacao = futDatacriacao;
    }

    public String getAtualizado() {
        return atualizado;
    }

    public void setAtualizado(String atualizado) {
        this.atualizado = atualizado;
    }

}