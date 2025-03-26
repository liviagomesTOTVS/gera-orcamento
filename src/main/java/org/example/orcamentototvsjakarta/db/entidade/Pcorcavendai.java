package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PCORCAVENDAI")
public class Pcorcavendai {
    @EmbeddedId
    private PcorcavendaiId id;

    @Column(name = "\"DATA\"")
    private LocalDate data;

    @Column(name = "CODCLI", nullable = false)
    private Integer codcli;


    @Column(name = "CODUSUR", nullable = false)
    private Short codusur;

    @Column(name = "QT", nullable = false, precision = 20, scale = 6)
    private BigDecimal qt;

    @Column(name = "PVENDA", nullable = false, precision = 19, scale = 6)
    private BigDecimal pvenda;

    @Column(name = "PTABELA", nullable = false, precision = 19, scale = 6)
    private BigDecimal ptabela;

    @Column(name = "NUMCAR")
    private Integer numcar;

    @Column(name = "POSICAO", nullable = false, length = 2)
    private String posicao;

    @Column(name = "ST", nullable = false, precision = 18, scale = 6)
    private BigDecimal st;

    @Column(name = "VLCUSTOFIN", nullable = false, precision = 18, scale = 6)
    private BigDecimal vlcustofin;

    @Column(name = "VLCUSTOREAL", nullable = false, precision = 18, scale = 6)
    private BigDecimal vlcustoreal;

    @Column(name = "PERCOM", nullable = false, precision = 8, scale = 4)
    private BigDecimal percom;

    @Column(name = "PERDESC", nullable = false, precision = 18, scale = 6)
    private BigDecimal perdesc;

    @Column(name = "QTFALTA", precision = 20, scale = 6)
    private BigDecimal qtfalta;

    @Column(name = "TIPOPESO", length = 1)
    private String tipopeso;

    @Column(name = "PERCOMTAB", precision = 8, scale = 4)
    private BigDecimal percomtab;

    @Column(name = "PERDESCTAB", precision = 8, scale = 4)
    private BigDecimal perdesctab;

    @Column(name = "NUMEROETIQIMPRESSA")
    private Boolean numeroetiqimpressa;

    @Column(name = "REFCOR", length = 20)
    private String refcor;

    @Column(name = "MARGEM", precision = 10, scale = 2)
    private BigDecimal margem;

    @Column(name = "PERDESCAUX", precision = 5, scale = 2)
    private BigDecimal perdescaux;

    @Column(name = "PVENDABASE", precision = 18, scale = 6)
    private BigDecimal pvendabase;

    @Column(name = "CODST")
    private Integer codst;

    @Column(name = "IVA", precision = 8, scale = 4)
    private BigDecimal iva;

    @Column(name = "ALIQICMS1", precision = 8, scale = 4)
    private BigDecimal aliqicms1;

    @Column(name = "ALIQICMS2", precision = 8, scale = 4)
    private BigDecimal aliqicms2;

    @Column(name = "PAUTA", precision = 8, scale = 4)
    private BigDecimal pauta;

    @Column(name = "PERCBASERED", precision = 8, scale = 4)
    private BigDecimal percbasered;

    @Column(name = "VLDESCCOM", precision = 18, scale = 6)
    private BigDecimal vldesccom;

    @Column(name = "PERDESCCOM", precision = 12, scale = 4)
    private BigDecimal perdesccom;

    @Column(name = "PERDESCFIN", precision = 12, scale = 4)
    private BigDecimal perdescfin;

    @Column(name = "VLBONIFIC", precision = 18, scale = 6)
    private BigDecimal vlbonific;

    @Column(name = "PERBONIFIC", precision = 12, scale = 4)
    private BigDecimal perbonific;

    @Column(name = "VLDESCFIN", precision = 18, scale = 6)
    private BigDecimal vldescfin;

    @Column(name = "CUSTOFINEST", precision = 18, scale = 6)
    private BigDecimal custofinest;

    @Column(name = "PERFRETECMV", precision = 8, scale = 4)
    private BigDecimal perfretecmv;

    @Column(name = "VLDESCRODAPE", precision = 18, scale = 6)
    private BigDecimal vldescrodape;

    @Column(name = "PERCBASEREDST", precision = 8, scale = 4)
    private BigDecimal percbaseredst;

    @Column(name = "PERCBASEREDSTFONTE", precision = 8, scale = 4)
    private BigDecimal percbaseredstfonte;

    @Column(name = "COMPLEMENTO", length = 40)
    private String complemento;

    @Column(name = "PERCISS", precision = 8, scale = 4)
    private BigDecimal perciss;

    @Column(name = "VLISS", precision = 18, scale = 6)
    private BigDecimal vliss;

    @Column(name = "PERCIPI", precision = 12, scale = 4)
    private BigDecimal percipi;

    @Column(name = "VLIPI", precision = 18, scale = 6)
    private BigDecimal vlipi;

    @Column(name = "CODAUXILIAR")
    private Long codauxiliar;

    @Column(name = "LOCALIZACAO", length = 40)
    private String localizacao;

    @Column(name = "CODPROMOCAO", length = 10)
    private String codpromocao;

    @Column(name = "PRAZOMEDIO")
    private Short prazomedio;

    @Column(name = "VLDESCICMISENCAO", precision = 18, scale = 6)
    private BigDecimal vldescicmisencao;

    @Column(name = "VLREPASSE", precision = 18, scale = 6)
    private BigDecimal vlrepasse;

    @Column(name = "CODFILIALRETIRA", length = 2)
    private String codfilialretira;

    @Column(name = "PERCVENDA", precision = 5, scale = 2)
    private BigDecimal percvenda;

    @Column(name = "VLDESCPISSUFRAMA", precision = 18, scale = 6)
    private BigDecimal vldescpissuframa;

    @Column(name = "PORIGINAL", precision = 18, scale = 6)
    private BigDecimal poriginal;

    @Column(name = "VLCUSTOCONT", precision = 18, scale = 6)
    private BigDecimal vlcustocont;

    @Column(name = "VLCUSTOREP", precision = 18, scale = 6)
    private BigDecimal vlcustorep;

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

    @Column(name = "PESOBRUTO", precision = 7, scale = 3)
    private BigDecimal pesobruto;

    @Column(name = "VLVERBACMV", precision = 18, scale = 6)
    private BigDecimal vlverbacmv;

    @Column(name = "NUMVERBAREBCMV")
    private Integer numverbarebcmv;

    @Column(name = "PERCOMSUP", precision = 8, scale = 4)
    private BigDecimal percomsup;

    @Column(name = "PERREDCOMISSSUP", precision = 18, scale = 6)
    private BigDecimal perredcomisssup;

    @Column(name = "VLREDCOMISSSUP", precision = 18, scale = 6)
    private BigDecimal vlredcomisssup;

    @Column(name = "QTCX", precision = 14, scale = 6)
    private BigDecimal qtcx;

    @Column(name = "QTPECAS", precision = 14, scale = 6)
    private BigDecimal qtpecas;

    @Column(name = "PERDESCCUSTO", precision = 8, scale = 4)
    private BigDecimal perdesccusto;

    @Column(name = "TXVENDA", precision = 8, scale = 6)
    private BigDecimal txvenda;

    @Column(name = "CODICMTAB", precision = 8, scale = 4)
    private BigDecimal codicmtab;

    @Column(name = "PERDESCISENTOICMS", precision = 4, scale = 2)
    private BigDecimal perdescisentoicms;

    @Column(name = "PERCOMPROF", precision = 6, scale = 2)
    private BigDecimal percomprof;

    @Column(name = "ESCANIADO")
    private Short escaniado;

    @Column(name = "NUMSEQFORMULA")
    private Long numseqformula;

    @Column(name = "CODMAQUINA")
    private Short codmaquina;

    @Column(name = "CHAVEPRINCIPAL", length = 40)
    private String chaveprincipal;

    @Column(name = "CODFORMULA", length = 20)
    private String codformula;

    @Column(name = "CODPRODTINTA", length = 40)
    private String codprodtinta;

    @Column(name = "CODBASE", length = 40)
    private String codbase;

    @Column(name = "VOLUMEDESEJADO", precision = 12, scale = 4)
    private BigDecimal volumedesejado;

    @Column(name = "SIGLAQUALIDADE", length = 10)
    private String siglaqualidade;

    @Column(name = "ALTERNATIVO", length = 10)
    private String alternativo;

    @Column(name = "PVENDA1", precision = 18, scale = 6)
    private BigDecimal pvenda1;

    @Column(name = "PERCAGREGADORST", precision = 8, scale = 4)
    private BigDecimal percagregadorst;

    @Column(name = "QTENTREGUE", precision = 16, scale = 3)
    private BigDecimal qtentregue;

    @Column(name = "QTENTREGUEAUX", precision = 16, scale = 3)
    private BigDecimal qtentregueaux;

    @Column(name = "QTUNITEMB", precision = 18, scale = 6)
    private BigDecimal qtunitemb;

    @Column(name = "TRUNCARITEM", length = 1)
    private String truncaritem;

    @Column(name = "EXPORTADO", length = 1)
    private String exportado;

    @Column(name = "DTEXPORTACAO")
    private LocalDate dtexportacao;

    @Column(name = "QTIMEDIATA", precision = 16, scale = 3)
    private BigDecimal qtimediata;

    @Column(name = "QTPOSTERIOR", precision = 16, scale = 3)
    private BigDecimal qtposterior;

    @Column(name = "QTENTREGAR", precision = 16, scale = 3)
    private BigDecimal qtentregar;

    @Column(name = "QTRETIRA1", precision = 16, scale = 3)
    private BigDecimal qtretira1;

    @Column(name = "QTRETIRA2", precision = 16, scale = 3)
    private BigDecimal qtretira2;

    @Column(name = "QTRETIRA3", precision = 16, scale = 3)
    private BigDecimal qtretira3;

    @Column(name = "PRODDESCRICAOCONTRATO", length = 300)
    private String proddescricaocontrato;

    @Column(name = "GERAGNRE_CNPJCLIENTE", length = 1)
    private String geragnreCnpjcliente;

    @Column(name = "VLDIFALIQUOTAS", precision = 18, scale = 6)
    private BigDecimal vldifaliquotas;

    @Column(name = "BASEDIFALIQUOTAS", precision = 18, scale = 6)
    private BigDecimal basedifaliquotas;

    @Column(name = "PERCDIFALIQUOTAS", precision = 8, scale = 4)
    private BigDecimal percdifaliquotas;

    @Column(name = "TIPOENTREGA", length = 2)
    private String tipoentrega;

    @Column(name = "PVENDAANTERIOR", precision = 18, scale = 6)
    private BigDecimal pvendaanterior;

    @Column(name = "PERDESCPOLITICA", precision = 8, scale = 2)
    private BigDecimal perdescpolitica;

    @Column(name = "VLDESCCUSTOCMV", precision = 12, scale = 4)
    private BigDecimal vldesccustocmv;

    @Column(name = "VLDESCSUFRAMA", precision = 18, scale = 6)
    private BigDecimal vldescsuframa;

    @Column(name = "STCLIENTEGNRE", precision = 18, scale = 6)
    private BigDecimal stclientegnre;

    @Column(name = "BRINDE", length = 1)
    private String brinde;

    @Column(name = "BASEICST", precision = 18, scale = 6)
    private BigDecimal baseicst;

    @Column(name = "LETRACOMISS", length = 2)
    private String letracomiss;

    @Column(name = "EANCODPROD")
    private Long eancodprod;

    @Column(name = "VLVERBACMVCLI", precision = 18, scale = 6)
    private BigDecimal vlverbacmvcli;

    @Column(name = "POLITICAPRIORITARIA", length = 1)
    private String politicaprioritaria;

    @Column(name = "PERCOM2", precision = 8, scale = 4)
    private BigDecimal percom2;

    @Column(name = "PERCOM3", precision = 8, scale = 4)
    private BigDecimal percom3;

    @Column(name = "PERCOM4", precision = 8, scale = 4)
    private BigDecimal percom4;

    @Column(name = "TIPOMERC", length = 2)
    private String tipomerc;

    @Column(name = "FATORPRECO", precision = 20, scale = 8)
    private BigDecimal fatorpreco;

    @Column(name = "PVENDAATAC", precision = 12, scale = 3)
    private BigDecimal pvendaatac;

    @Column(name = "QTMINIMAATACADO", precision = 18, scale = 6)
    private BigDecimal qtminimaatacado;

    @Column(name = "PERCDESCQUANT", precision = 6, scale = 2)
    private BigDecimal percdescquant;

    @Column(name = "PERCDESC_POLITICA", precision = 10, scale = 4)
    private BigDecimal percdescPolitica;

    @Column(name = "PRECOFIXO", precision = 18, scale = 6)
    private BigDecimal precofixo;

    @Column(name = "CODCOMBO")
    private Integer codcombo;

    @Column(name = "NUMSEQCESTA")
    private Long numseqcesta;

    @Column(name = "CODDESCONTO")
    private Integer coddesconto;

    @Column(name = "VLREDPVENDASIMPLESNA", precision = 18, scale = 6)
    private BigDecimal vlredpvendasimplesna;

    @Column(name = "VLREDCMVSIMPLESNAC", precision = 18, scale = 6)
    private BigDecimal vlredcmvsimplesnac;

    @Column(name = "CODOFERTAORIG")
    private Integer codofertaorig;

    @Column(name = "STPBASERCA", precision = 18, scale = 6)
    private BigDecimal stpbaserca;

    @Column(name = "STPTABELA", precision = 18, scale = 6)
    private BigDecimal stptabela;

    @Column(name = "NUMSEQITEMCONTRATO")
    private Integer numseqitemcontrato;

    @Column(name = "NUMLISTA")
    private Integer numlista;

    @Column(name = "GRUPOFATURAMENTO", length = 1)
    private String grupofaturamento;

    @Column(name = "DTENTREGA")
    private LocalDate dtentrega;

    @Column(name = "RP_IMEDIATA", length = 1)
    private String rpImediata;

    @Column(name = "PERDESCNEGOCIADO", precision = 18, scale = 6)
    private BigDecimal perdescnegociado;

    @Column(name = "FORMANEGOCIACAO", length = 1)
    private String formanegociacao;

    @Column(name = "PERDESCAVISTA", precision = 18, scale = 6)
    private BigDecimal perdescavista;

    @Column(name = "NEGOCIACAOPOSTERIOR", length = 1)
    private String negociacaoposterior;

    @Column(name = "CODEMITENTEITEMPEDIDO")
    private Integer codemitenteitempedido;

    @Column(name = "CODPRECOFIXO", precision = 18, scale = 6)
    private BigDecimal codprecofixo;

    @Column(name = "VLACRESFRETEKG", precision = 12, scale = 6)
    private BigDecimal vlacresfretekg;

    @Column(name = "STATUSSUCATA")
    private Boolean statussucata;

    @Column(name = "PTABELAAUTPECAS", precision = 18, scale = 6)
    private BigDecimal ptabelaautpecas;

    @Column(name = "NUMORCAORIG")
    private Long numorcaorig;

    @Column(name = "NUMFICHAORIG")
    private Long numfichaorig;

    @Column(name = "MATRICULA")
    private Integer matricula;

    @Column(name = "DTULTALTER")
    private LocalDate dtultalter;

    @Column(name = "NUMLOTE", length = 15)
    private String numlote;

    @Column(name = "OBSERVACAO", length = 300)
    private String observacao;

    @Column(name = "BAIXADO", length = 1)
    private String baixado;

    @Column(name = "PERDESCPAUTA", precision = 18, scale = 6)
    private BigDecimal perdescpauta;

    @Column(name = "ORIGEMST", length = 1)
    private String origemst;

    @Column(name = "UNIDADE", length = 2)
    private String unidade;

    @Column(name = "AMBIENTE", length = 50)
    private String ambiente;

    @Column(name = "TAXACASOMOEDAREAL", precision = 12, scale = 6)
    private BigDecimal taxacasomoedareal;

    @Column(name = "CODMOEDAESTRAGEIRA")
    private Integer codmoedaestrageira;

    @Column(name = "VLRMOEDAESTRAGEIRA", precision = 18, scale = 6)
    private BigDecimal vlrmoedaestrageira;

    @Column(name = "QTDIASENTREGAITEM")
    private Short qtdiasentregaitem;

    @Column(name = "IMPRIMERESTAURANTE", length = 1)
    private String imprimerestaurante;

    @Column(name = "IMPRESSORESTAURANTE", length = 1)
    private String impressorestaurante;

    @Column(name = "CODIMP")
    private Long codimp;

    @Column(name = "NUMSEQIMPRESSAO")
    private Integer numseqimpressao;

    @Column(name = "NUMITEMORCA")
    private Integer numitemorca;

    @Column(name = "VLACRESCCOMPLEMENTO", precision = 18, scale = 6)
    private BigDecimal vlacresccomplemento;

    @Column(name = "PERCREDALIQIPI", precision = 18, scale = 6)
    private BigDecimal percredaliqipi;

    @Column(name = "CODPRODCESTA")
    private Integer codprodcesta;

    @Column(name = "BONIFIC", length = 1)
    private String bonific;

    @Column(name = "CODINDICEMULTIPLICADOR")
    private Integer codindicemultiplicador;

    @Column(name = "OBS1", length = 400)
    private String obs1;

    @Column(name = "OBS2", length = 400)
    private String obs2;

    @Column(name = "PBONIFIC", precision = 18, scale = 6)
    private BigDecimal pbonific;

    @Column(name = "PVENDALIQ", precision = 18, scale = 6)
    private BigDecimal pvendaliq;

    @Column(name = "ROTINALANC", length = 48)
    private String rotinalanc;

    @Column(name = "VLBASEPARTDEST", precision = 18, scale = 6)
    private BigDecimal vlbasepartdest;

    @Column(name = "ALIQFCP", precision = 18, scale = 6)
    private BigDecimal aliqfcp;

    @Column(name = "ALIQINTERNADEST", precision = 18, scale = 6)
    private BigDecimal aliqinternadest;

    @Column(name = "VLFCPPART", precision = 18, scale = 6)
    private BigDecimal vlfcppart;

    @Column(name = "VLICMSPARTDEST", precision = 18, scale = 6)
    private BigDecimal vlicmspartdest;

    @Column(name = "VLICMSPART", precision = 18, scale = 6)
    private BigDecimal vlicmspart;

    @Column(name = "PERCPROVPART", precision = 5, scale = 2)
    private BigDecimal percprovpart;

    @Column(name = "VLICMSDIFALIQPART", precision = 22, scale = 6)
    private BigDecimal vlicmsdifaliqpart;

    @Column(name = "PERCBASEREDPART", precision = 5, scale = 2)
    private BigDecimal percbaseredpart;

    @Column(name = "VLICMSPARTREM", precision = 18, scale = 6)
    private BigDecimal vlicmspartrem;

    @Column(name = "ALIQINTERORIGPART", precision = 18, scale = 6)
    private BigDecimal aliqinterorigpart;

    @Column(name = "VLIPIPTABELA", precision = 18, scale = 6)
    private BigDecimal vlipiptabela;

    @Column(name = "VLIPIPBASERCA", precision = 18, scale = 6)
    private BigDecimal vlipipbaserca;

    @Column(name = "VLICMSPARTPTABELA", precision = 18, scale = 6)
    private BigDecimal vlicmspartptabela;

    @Column(name = "VLICMSPARTPBASERCA", precision = 18, scale = 6)
    private BigDecimal vlicmspartpbaserca;

    @Column(name = "NUMITEMPED")
    private Long numitemped;

    @Column(name = "CODMOTIVONAOATENDPROD")
    private Short codmotivonaoatendprod;

    @Column(name = "PERCDESCPIS", precision = 12, scale = 4)
    private BigDecimal percdescpis;

    @Column(name = "VLDESCREDUCAOPIS", precision = 24, scale = 6)
    private BigDecimal vldescreducaopis;

    @Column(name = "PERCDESCCOFINS", precision = 12, scale = 4)
    private BigDecimal percdesccofins;

    @Column(name = "VLDESCREDUCAOCOFINS", precision = 24, scale = 6)
    private BigDecimal vldescreducaocofins;

    @Column(name = "CODFIGVENDATRIANGULAR")
    private Short codfigvendatriangular;

    @Column(name = "CODDESCONTOSIMULADOR")
    private Integer coddescontosimulador;

    @Column(name = "CODFISCAL")
    private Integer codfiscal;

    @Column(name = "SITTRIBUT", length = 3)
    private String sittribut;

    @Column(name = "VERSAOSERVICOPARTILHA", length = 10)
    private String versaoservicopartilha;

    @Column(name = "DTENTREGAMESA")
    private LocalDate dtentregamesa;

    @Column(name = "CODFUNCENTREGAMESA")
    private Integer codfuncentregamesa;

    @Column(name = "PRODIMPORTADOPEPS", length = 1)
    private String prodimportadopeps;

    @Column(name = "NUMTRANSENTPEPS")
    private Long numtransentpeps;

    @Column(name = "PTABELAFABRICAZFM", precision = 18, scale = 6)
    private BigDecimal ptabelafabricazfm;

    @Column(name = "SERVIMP")
    private Long servimp;

    @Column(name = "ORIGMERCTRIB", length = 1)
    private String origmerctrib;

    @Column(name = "CODIMPSERVIMP")
    private Long codimpservimp;

    @Column(name = "DTENVIOSERVCARGA")
    private LocalDate dtenvioservcarga;

    @Column(name = "DESCONSIDERARDESCATACADO", length = 1)
    private String desconsiderardescatacado;

    @Column(name = "VLTOTSERVICO", precision = 22, scale = 6)
    private BigDecimal vltotservico;

    @Column(name = "PRODUZIR_TINTA", length = 1)
    private String produzirTinta;

    @Column(name = "PROMOCAO", length = 1)
    private String promocao;

    @Column(name = "DESCRICAOPAF", length = 200)
    private String descricaopaf;

    @Column(name = "MD5PAF", length = 200)
    private String md5paf;

    @Column(name = "DTINICIOPROMOLOTE")
    private LocalDate dtiniciopromolote;

    @Column(name = "DTFIMPROMOLOTE")
    private LocalDate dtfimpromolote;

    @Column(name = "LOTECONTRATO", length = 10)
    private String lotecontrato;

    @Column(name = "PERCDESCBASERCA", precision = 10, scale = 4)
    private BigDecimal percdescbaserca;

    @Column(name = "TIPOCOMISSAOMED", length = 3)
    private String tipocomissaomed;

    @Column(name = "CODPLPAG")
    private Short codplpag;

    @Column(name = "CODLINHAPRAZO")
    private Integer codlinhaprazo;

    @Column(name = "VLDESCBOLETOCMV", precision = 18, scale = 6)
    private BigDecimal vldescboletocmv;

    @Column(name = "PERCTAXAPRAZOMEDCMV", precision = 18, scale = 6)
    private BigDecimal perctaxaprazomedcmv;

    @Column(name = "VLTAXAPRAZOMEDCMV", precision = 18, scale = 6)
    private BigDecimal vltaxaprazomedcmv;

    @Column(name = "CODEDITAL")
    private Integer codedital;

    @Column(name = "TIPOCONVERSAOPEDLICIT")
    private Short tipoconversaopedlicit;

    @Column(name = "UNIDADECONVERSAOPEDLICIT", length = 2)
    private String unidadeconversaopedlicit;

    @Column(name = "FATORCONVERSAOPEDLICIT", precision = 30, scale = 16)
    private BigDecimal fatorconversaopedlicit;

    @Column(name = "QTPEDLICIT", precision = 20, scale = 6)
    private BigDecimal qtpedlicit;

    @Column(name = "NUMEMPENHO", length = 20)
    private String numempenho;

    @Column(name = "CODPRODEQUIPCOMODLOC")
    private Integer codprodequipcomodloc;

    @Column(name = "CODEQUIPAMENTOCOMODLOC")
    private Long codequipamentocomodloc;

    @Column(name = "PRECOMAXCONSUM", precision = 18, scale = 6)
    private BigDecimal precomaxconsum;

    @Column(name = "CODPROMOCAOMED")
    private Integer codpromocaomed;

    @Column(name = "INICIOINTERVALODESCQUANT", precision = 10, scale = 4)
    private BigDecimal iniciointervalodescquant;

    @Column(name = "VLBASEFCPICMS", precision = 18, scale = 6)
    private BigDecimal vlbasefcpicms;

    @Column(name = "VLBASEFCPST", precision = 18, scale = 6)
    private BigDecimal vlbasefcpst;

    @Column(name = "VLBCFCPSTRET", precision = 18, scale = 6)
    private BigDecimal vlbcfcpstret;

    @Column(name = "PERFCPSTRET", precision = 12, scale = 4)
    private BigDecimal perfcpstret;

    @Column(name = "VLFCPSTRET", precision = 18, scale = 6)
    private BigDecimal vlfcpstret;

    @Column(name = "PERFCPSN", precision = 12, scale = 4)
    private BigDecimal perfcpsn;

    @Column(name = "VLCREDFCPICMSSN", precision = 18, scale = 6)
    private BigDecimal vlcredfcpicmssn;

    @Column(name = "VLFECP", precision = 18, scale = 6)
    private BigDecimal vlfecp;

    @Column(name = "VLACRESCIMOFUNCEP", precision = 18, scale = 6)
    private BigDecimal vlacrescimofuncep;

    @Column(name = "PERACRESCIMOFUNCEP", precision = 12, scale = 4)
    private BigDecimal peracrescimofuncep;

    @Column(name = "ALIQICMSFECP", precision = 12, scale = 4)
    private BigDecimal aliqicmsfecp;

    @Column(name = "UTILIZOUMOTORCALCULO", length = 1)
    private String utilizoumotorcalculo;

    @Column(name = "BAIXAQTFRENTELOJA", length = 1)
    private String baixaqtfrenteloja;

    @Column(name = "CODECF", length = 6)
    private String codecf;

    @Column(name = "NUMVERBACAMPANHA")
    private Integer numverbacampanha;

    @Column(name = "PERCCUSTFORNEC", precision = 12, scale = 4)
    private BigDecimal perccustfornec;

    @Column(name = "VLCUSTFORNEC", precision = 18, scale = 6)
    private BigDecimal vlcustfornec;

    @Column(name = "VLOUTRASDESP", precision = 18, scale = 6)
    private BigDecimal vloutrasdesp;

    @Column(name = "VLACRESCRODAPE", precision = 18, scale = 6)
    private BigDecimal vlacrescrodape;

    @Column(name = "CODIGOINTEGRACAOWMS", length = 15)
    private String codigointegracaowms;

    @Column(name = "NUMLOTEPROMOCAOMED", length = 20)
    private String numlotepromocaomed;

    @Column(name = "CODDEPOSITO")
    private Long coddeposito;

    @Column(name = "NUMPEDCLI", length = 15)
    private String numpedcli;

    @Column(name = "VLDESCCMVPROMOCAOMED", precision = 18, scale = 6)
    private BigDecimal vldesccmvpromocaomed;

    @Column(name = "CODCONTRATO")
    private Integer codcontrato;

    @Column(name = "BCSTRETANTERIOR", precision = 18, scale = 6)
    private BigDecimal bcstretanterior;

    @Column(name = "VLICMSSUBSTITUTOANTERIOR", precision = 18, scale = 6)
    private BigDecimal vlicmssubstitutoanterior;

    @Column(name = "VLICMSSTRETANTERIOR", precision = 18, scale = 6)
    private BigDecimal vlicmsstretanterior;

    @Column(name = "PMPFMEDICAMENTO", precision = 18, scale = 6)
    private BigDecimal pmpfmedicamento;

    @Column(name = "CODPROSPECTO")
    private Integer codprospecto;

    @Column(name = "CODPRODCLI")
    private Long codprodcli;

    @Column(name = "PSUGERIDO", precision = 22, scale = 6)
    private BigDecimal psugerido;

    @Column(name = "CODFORNECSUGESTAO")
    private Integer codfornecsugestao;

    @Column(name = "NUMSEQORIG")
    private Long numseqorig;

    @Column(name = "NUMCCF")
    private Integer numccf;

    @Column(name = "QBCMONORET", precision = 18, scale = 6)
    private BigDecimal qbcmonoret;

    @Column(name = "ADREMICMSRET", precision = 18, scale = 6)
    private BigDecimal adremicmsret;

    @Column(name = "VICMSMONORET", precision = 18, scale = 6)
    private BigDecimal vicmsmonoret;

    @Column(name = "VLIPISUSPENSO", precision = 18, scale = 6)
    private BigDecimal vlipisuspenso;

    @Column(name = "VLIISUSPENSO", precision = 18, scale = 6)
    private BigDecimal vliisuspenso;

    public PcorcavendaiId getId() {
        return id;
    }

    public void setId(PcorcavendaiId id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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

    public BigDecimal getQt() {
        return qt;
    }

    public void setQt(BigDecimal qt) {
        this.qt = qt;
    }

    public BigDecimal getPvenda() {
        return pvenda;
    }

    public void setPvenda(BigDecimal pvenda) {
        this.pvenda = pvenda;
    }

    public BigDecimal getPtabela() {
        return ptabela;
    }

    public void setPtabela(BigDecimal ptabela) {
        this.ptabela = ptabela;
    }

    public Integer getNumcar() {
        return numcar;
    }

    public void setNumcar(Integer numcar) {
        this.numcar = numcar;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public BigDecimal getSt() {
        return st;
    }

    public void setSt(BigDecimal st) {
        this.st = st;
    }

    public BigDecimal getVlcustofin() {
        return vlcustofin;
    }

    public void setVlcustofin(BigDecimal vlcustofin) {
        this.vlcustofin = vlcustofin;
    }

    public BigDecimal getVlcustoreal() {
        return vlcustoreal;
    }

    public void setVlcustoreal(BigDecimal vlcustoreal) {
        this.vlcustoreal = vlcustoreal;
    }

    public BigDecimal getPercom() {
        return percom;
    }

    public void setPercom(BigDecimal percom) {
        this.percom = percom;
    }

    public BigDecimal getPerdesc() {
        return perdesc;
    }

    public void setPerdesc(BigDecimal perdesc) {
        this.perdesc = perdesc;
    }

    public BigDecimal getQtfalta() {
        return qtfalta;
    }

    public void setQtfalta(BigDecimal qtfalta) {
        this.qtfalta = qtfalta;
    }

    public String getTipopeso() {
        return tipopeso;
    }

    public void setTipopeso(String tipopeso) {
        this.tipopeso = tipopeso;
    }

    public BigDecimal getPercomtab() {
        return percomtab;
    }

    public void setPercomtab(BigDecimal percomtab) {
        this.percomtab = percomtab;
    }

    public BigDecimal getPerdesctab() {
        return perdesctab;
    }

    public void setPerdesctab(BigDecimal perdesctab) {
        this.perdesctab = perdesctab;
    }

    public Boolean getNumeroetiqimpressa() {
        return numeroetiqimpressa;
    }

    public void setNumeroetiqimpressa(Boolean numeroetiqimpressa) {
        this.numeroetiqimpressa = numeroetiqimpressa;
    }

    public String getRefcor() {
        return refcor;
    }

    public void setRefcor(String refcor) {
        this.refcor = refcor;
    }

    public BigDecimal getMargem() {
        return margem;
    }

    public void setMargem(BigDecimal margem) {
        this.margem = margem;
    }

    public BigDecimal getPerdescaux() {
        return perdescaux;
    }

    public void setPerdescaux(BigDecimal perdescaux) {
        this.perdescaux = perdescaux;
    }

    public BigDecimal getPvendabase() {
        return pvendabase;
    }

    public void setPvendabase(BigDecimal pvendabase) {
        this.pvendabase = pvendabase;
    }

    public Integer getCodst() {
        return codst;
    }

    public void setCodst(Integer codst) {
        this.codst = codst;
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

    public BigDecimal getPerdescfin() {
        return perdescfin;
    }

    public void setPerdescfin(BigDecimal perdescfin) {
        this.perdescfin = perdescfin;
    }

    public BigDecimal getVlbonific() {
        return vlbonific;
    }

    public void setVlbonific(BigDecimal vlbonific) {
        this.vlbonific = vlbonific;
    }

    public BigDecimal getPerbonific() {
        return perbonific;
    }

    public void setPerbonific(BigDecimal perbonific) {
        this.perbonific = perbonific;
    }

    public BigDecimal getVldescfin() {
        return vldescfin;
    }

    public void setVldescfin(BigDecimal vldescfin) {
        this.vldescfin = vldescfin;
    }

    public BigDecimal getCustofinest() {
        return custofinest;
    }

    public void setCustofinest(BigDecimal custofinest) {
        this.custofinest = custofinest;
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

    public BigDecimal getPercbaseredst() {
        return percbaseredst;
    }

    public void setPercbaseredst(BigDecimal percbaseredst) {
        this.percbaseredst = percbaseredst;
    }

    public BigDecimal getPercbaseredstfonte() {
        return percbaseredstfonte;
    }

    public void setPercbaseredstfonte(BigDecimal percbaseredstfonte) {
        this.percbaseredstfonte = percbaseredstfonte;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public BigDecimal getPercipi() {
        return percipi;
    }

    public void setPercipi(BigDecimal percipi) {
        this.percipi = percipi;
    }

    public BigDecimal getVlipi() {
        return vlipi;
    }

    public void setVlipi(BigDecimal vlipi) {
        this.vlipi = vlipi;
    }

    public Long getCodauxiliar() {
        return codauxiliar;
    }

    public void setCodauxiliar(Long codauxiliar) {
        this.codauxiliar = codauxiliar;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
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

    public BigDecimal getVldescicmisencao() {
        return vldescicmisencao;
    }

    public void setVldescicmisencao(BigDecimal vldescicmisencao) {
        this.vldescicmisencao = vldescicmisencao;
    }

    public BigDecimal getVlrepasse() {
        return vlrepasse;
    }

    public void setVlrepasse(BigDecimal vlrepasse) {
        this.vlrepasse = vlrepasse;
    }

    public String getCodfilialretira() {
        return codfilialretira;
    }

    public void setCodfilialretira(String codfilialretira) {
        this.codfilialretira = codfilialretira;
    }

    public BigDecimal getPercvenda() {
        return percvenda;
    }

    public void setPercvenda(BigDecimal percvenda) {
        this.percvenda = percvenda;
    }

    public BigDecimal getVldescpissuframa() {
        return vldescpissuframa;
    }

    public void setVldescpissuframa(BigDecimal vldescpissuframa) {
        this.vldescpissuframa = vldescpissuframa;
    }

    public BigDecimal getPoriginal() {
        return poriginal;
    }

    public void setPoriginal(BigDecimal poriginal) {
        this.poriginal = poriginal;
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

    public BigDecimal getPerdesccusto() {
        return perdesccusto;
    }

    public void setPerdesccusto(BigDecimal perdesccusto) {
        this.perdesccusto = perdesccusto;
    }

    public BigDecimal getTxvenda() {
        return txvenda;
    }

    public void setTxvenda(BigDecimal txvenda) {
        this.txvenda = txvenda;
    }

    public BigDecimal getCodicmtab() {
        return codicmtab;
    }

    public void setCodicmtab(BigDecimal codicmtab) {
        this.codicmtab = codicmtab;
    }

    public BigDecimal getPerdescisentoicms() {
        return perdescisentoicms;
    }

    public void setPerdescisentoicms(BigDecimal perdescisentoicms) {
        this.perdescisentoicms = perdescisentoicms;
    }

    public BigDecimal getPercomprof() {
        return percomprof;
    }

    public void setPercomprof(BigDecimal percomprof) {
        this.percomprof = percomprof;
    }

    public Short getEscaniado() {
        return escaniado;
    }

    public void setEscaniado(Short escaniado) {
        this.escaniado = escaniado;
    }

    public Long getNumseqformula() {
        return numseqformula;
    }

    public void setNumseqformula(Long numseqformula) {
        this.numseqformula = numseqformula;
    }

    public Short getCodmaquina() {
        return codmaquina;
    }

    public void setCodmaquina(Short codmaquina) {
        this.codmaquina = codmaquina;
    }

    public String getChaveprincipal() {
        return chaveprincipal;
    }

    public void setChaveprincipal(String chaveprincipal) {
        this.chaveprincipal = chaveprincipal;
    }

    public String getCodformula() {
        return codformula;
    }

    public void setCodformula(String codformula) {
        this.codformula = codformula;
    }

    public String getCodprodtinta() {
        return codprodtinta;
    }

    public void setCodprodtinta(String codprodtinta) {
        this.codprodtinta = codprodtinta;
    }

    public String getCodbase() {
        return codbase;
    }

    public void setCodbase(String codbase) {
        this.codbase = codbase;
    }

    public BigDecimal getVolumedesejado() {
        return volumedesejado;
    }

    public void setVolumedesejado(BigDecimal volumedesejado) {
        this.volumedesejado = volumedesejado;
    }

    public String getSiglaqualidade() {
        return siglaqualidade;
    }

    public void setSiglaqualidade(String siglaqualidade) {
        this.siglaqualidade = siglaqualidade;
    }

    public String getAlternativo() {
        return alternativo;
    }

    public void setAlternativo(String alternativo) {
        this.alternativo = alternativo;
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

    public BigDecimal getQtentregue() {
        return qtentregue;
    }

    public void setQtentregue(BigDecimal qtentregue) {
        this.qtentregue = qtentregue;
    }

    public BigDecimal getQtentregueaux() {
        return qtentregueaux;
    }

    public void setQtentregueaux(BigDecimal qtentregueaux) {
        this.qtentregueaux = qtentregueaux;
    }

    public BigDecimal getQtunitemb() {
        return qtunitemb;
    }

    public void setQtunitemb(BigDecimal qtunitemb) {
        this.qtunitemb = qtunitemb;
    }

    public String getTruncaritem() {
        return truncaritem;
    }

    public void setTruncaritem(String truncaritem) {
        this.truncaritem = truncaritem;
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

    public BigDecimal getQtimediata() {
        return qtimediata;
    }

    public void setQtimediata(BigDecimal qtimediata) {
        this.qtimediata = qtimediata;
    }

    public BigDecimal getQtposterior() {
        return qtposterior;
    }

    public void setQtposterior(BigDecimal qtposterior) {
        this.qtposterior = qtposterior;
    }

    public BigDecimal getQtentregar() {
        return qtentregar;
    }

    public void setQtentregar(BigDecimal qtentregar) {
        this.qtentregar = qtentregar;
    }

    public BigDecimal getQtretira1() {
        return qtretira1;
    }

    public void setQtretira1(BigDecimal qtretira1) {
        this.qtretira1 = qtretira1;
    }

    public BigDecimal getQtretira2() {
        return qtretira2;
    }

    public void setQtretira2(BigDecimal qtretira2) {
        this.qtretira2 = qtretira2;
    }

    public BigDecimal getQtretira3() {
        return qtretira3;
    }

    public void setQtretira3(BigDecimal qtretira3) {
        this.qtretira3 = qtretira3;
    }

    public String getProddescricaocontrato() {
        return proddescricaocontrato;
    }

    public void setProddescricaocontrato(String proddescricaocontrato) {
        this.proddescricaocontrato = proddescricaocontrato;
    }

    public String getGeragnreCnpjcliente() {
        return geragnreCnpjcliente;
    }

    public void setGeragnreCnpjcliente(String geragnreCnpjcliente) {
        this.geragnreCnpjcliente = geragnreCnpjcliente;
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

    public String getTipoentrega() {
        return tipoentrega;
    }

    public void setTipoentrega(String tipoentrega) {
        this.tipoentrega = tipoentrega;
    }

    public BigDecimal getPvendaanterior() {
        return pvendaanterior;
    }

    public void setPvendaanterior(BigDecimal pvendaanterior) {
        this.pvendaanterior = pvendaanterior;
    }

    public BigDecimal getPerdescpolitica() {
        return perdescpolitica;
    }

    public void setPerdescpolitica(BigDecimal perdescpolitica) {
        this.perdescpolitica = perdescpolitica;
    }

    public BigDecimal getVldesccustocmv() {
        return vldesccustocmv;
    }

    public void setVldesccustocmv(BigDecimal vldesccustocmv) {
        this.vldesccustocmv = vldesccustocmv;
    }

    public BigDecimal getVldescsuframa() {
        return vldescsuframa;
    }

    public void setVldescsuframa(BigDecimal vldescsuframa) {
        this.vldescsuframa = vldescsuframa;
    }

    public BigDecimal getStclientegnre() {
        return stclientegnre;
    }

    public void setStclientegnre(BigDecimal stclientegnre) {
        this.stclientegnre = stclientegnre;
    }

    public String getBrinde() {
        return brinde;
    }

    public void setBrinde(String brinde) {
        this.brinde = brinde;
    }

    public BigDecimal getBaseicst() {
        return baseicst;
    }

    public void setBaseicst(BigDecimal baseicst) {
        this.baseicst = baseicst;
    }

    public String getLetracomiss() {
        return letracomiss;
    }

    public void setLetracomiss(String letracomiss) {
        this.letracomiss = letracomiss;
    }

    public Long getEancodprod() {
        return eancodprod;
    }

    public void setEancodprod(Long eancodprod) {
        this.eancodprod = eancodprod;
    }

    public BigDecimal getVlverbacmvcli() {
        return vlverbacmvcli;
    }

    public void setVlverbacmvcli(BigDecimal vlverbacmvcli) {
        this.vlverbacmvcli = vlverbacmvcli;
    }

    public String getPoliticaprioritaria() {
        return politicaprioritaria;
    }

    public void setPoliticaprioritaria(String politicaprioritaria) {
        this.politicaprioritaria = politicaprioritaria;
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

    public BigDecimal getPercom4() {
        return percom4;
    }

    public void setPercom4(BigDecimal percom4) {
        this.percom4 = percom4;
    }

    public String getTipomerc() {
        return tipomerc;
    }

    public void setTipomerc(String tipomerc) {
        this.tipomerc = tipomerc;
    }

    public BigDecimal getFatorpreco() {
        return fatorpreco;
    }

    public void setFatorpreco(BigDecimal fatorpreco) {
        this.fatorpreco = fatorpreco;
    }

    public BigDecimal getPvendaatac() {
        return pvendaatac;
    }

    public void setPvendaatac(BigDecimal pvendaatac) {
        this.pvendaatac = pvendaatac;
    }

    public BigDecimal getQtminimaatacado() {
        return qtminimaatacado;
    }

    public void setQtminimaatacado(BigDecimal qtminimaatacado) {
        this.qtminimaatacado = qtminimaatacado;
    }

    public BigDecimal getPercdescquant() {
        return percdescquant;
    }

    public void setPercdescquant(BigDecimal percdescquant) {
        this.percdescquant = percdescquant;
    }

    public BigDecimal getPercdescPolitica() {
        return percdescPolitica;
    }

    public void setPercdescPolitica(BigDecimal percdescPolitica) {
        this.percdescPolitica = percdescPolitica;
    }

    public BigDecimal getPrecofixo() {
        return precofixo;
    }

    public void setPrecofixo(BigDecimal precofixo) {
        this.precofixo = precofixo;
    }

    public Integer getCodcombo() {
        return codcombo;
    }

    public void setCodcombo(Integer codcombo) {
        this.codcombo = codcombo;
    }

    public Long getNumseqcesta() {
        return numseqcesta;
    }

    public void setNumseqcesta(Long numseqcesta) {
        this.numseqcesta = numseqcesta;
    }

    public Integer getCoddesconto() {
        return coddesconto;
    }

    public void setCoddesconto(Integer coddesconto) {
        this.coddesconto = coddesconto;
    }

    public BigDecimal getVlredpvendasimplesna() {
        return vlredpvendasimplesna;
    }

    public void setVlredpvendasimplesna(BigDecimal vlredpvendasimplesna) {
        this.vlredpvendasimplesna = vlredpvendasimplesna;
    }

    public BigDecimal getVlredcmvsimplesnac() {
        return vlredcmvsimplesnac;
    }

    public void setVlredcmvsimplesnac(BigDecimal vlredcmvsimplesnac) {
        this.vlredcmvsimplesnac = vlredcmvsimplesnac;
    }

    public Integer getCodofertaorig() {
        return codofertaorig;
    }

    public void setCodofertaorig(Integer codofertaorig) {
        this.codofertaorig = codofertaorig;
    }

    public BigDecimal getStpbaserca() {
        return stpbaserca;
    }

    public void setStpbaserca(BigDecimal stpbaserca) {
        this.stpbaserca = stpbaserca;
    }

    public BigDecimal getStptabela() {
        return stptabela;
    }

    public void setStptabela(BigDecimal stptabela) {
        this.stptabela = stptabela;
    }

    public Integer getNumseqitemcontrato() {
        return numseqitemcontrato;
    }

    public void setNumseqitemcontrato(Integer numseqitemcontrato) {
        this.numseqitemcontrato = numseqitemcontrato;
    }

    public Integer getNumlista() {
        return numlista;
    }

    public void setNumlista(Integer numlista) {
        this.numlista = numlista;
    }

    public String getGrupofaturamento() {
        return grupofaturamento;
    }

    public void setGrupofaturamento(String grupofaturamento) {
        this.grupofaturamento = grupofaturamento;
    }

    public LocalDate getDtentrega() {
        return dtentrega;
    }

    public void setDtentrega(LocalDate dtentrega) {
        this.dtentrega = dtentrega;
    }

    public String getRpImediata() {
        return rpImediata;
    }

    public void setRpImediata(String rpImediata) {
        this.rpImediata = rpImediata;
    }

    public BigDecimal getPerdescnegociado() {
        return perdescnegociado;
    }

    public void setPerdescnegociado(BigDecimal perdescnegociado) {
        this.perdescnegociado = perdescnegociado;
    }

    public String getFormanegociacao() {
        return formanegociacao;
    }

    public void setFormanegociacao(String formanegociacao) {
        this.formanegociacao = formanegociacao;
    }

    public BigDecimal getPerdescavista() {
        return perdescavista;
    }

    public void setPerdescavista(BigDecimal perdescavista) {
        this.perdescavista = perdescavista;
    }

    public String getNegociacaoposterior() {
        return negociacaoposterior;
    }

    public void setNegociacaoposterior(String negociacaoposterior) {
        this.negociacaoposterior = negociacaoposterior;
    }

    public Integer getCodemitenteitempedido() {
        return codemitenteitempedido;
    }

    public void setCodemitenteitempedido(Integer codemitenteitempedido) {
        this.codemitenteitempedido = codemitenteitempedido;
    }

    public BigDecimal getCodprecofixo() {
        return codprecofixo;
    }

    public void setCodprecofixo(BigDecimal codprecofixo) {
        this.codprecofixo = codprecofixo;
    }

    public BigDecimal getVlacresfretekg() {
        return vlacresfretekg;
    }

    public void setVlacresfretekg(BigDecimal vlacresfretekg) {
        this.vlacresfretekg = vlacresfretekg;
    }

    public Boolean getStatussucata() {
        return statussucata;
    }

    public void setStatussucata(Boolean statussucata) {
        this.statussucata = statussucata;
    }

    public BigDecimal getPtabelaautpecas() {
        return ptabelaautpecas;
    }

    public void setPtabelaautpecas(BigDecimal ptabelaautpecas) {
        this.ptabelaautpecas = ptabelaautpecas;
    }

    public Long getNumorcaorig() {
        return numorcaorig;
    }

    public void setNumorcaorig(Long numorcaorig) {
        this.numorcaorig = numorcaorig;
    }

    public Long getNumfichaorig() {
        return numfichaorig;
    }

    public void setNumfichaorig(Long numfichaorig) {
        this.numfichaorig = numfichaorig;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDtultalter() {
        return dtultalter;
    }

    public void setDtultalter(LocalDate dtultalter) {
        this.dtultalter = dtultalter;
    }

    public String getNumlote() {
        return numlote;
    }

    public void setNumlote(String numlote) {
        this.numlote = numlote;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getBaixado() {
        return baixado;
    }

    public void setBaixado(String baixado) {
        this.baixado = baixado;
    }

    public BigDecimal getPerdescpauta() {
        return perdescpauta;
    }

    public void setPerdescpauta(BigDecimal perdescpauta) {
        this.perdescpauta = perdescpauta;
    }

    public String getOrigemst() {
        return origemst;
    }

    public void setOrigemst(String origemst) {
        this.origemst = origemst;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public BigDecimal getTaxacasomoedareal() {
        return taxacasomoedareal;
    }

    public void setTaxacasomoedareal(BigDecimal taxacasomoedareal) {
        this.taxacasomoedareal = taxacasomoedareal;
    }

    public Integer getCodmoedaestrageira() {
        return codmoedaestrageira;
    }

    public void setCodmoedaestrageira(Integer codmoedaestrageira) {
        this.codmoedaestrageira = codmoedaestrageira;
    }

    public BigDecimal getVlrmoedaestrageira() {
        return vlrmoedaestrageira;
    }

    public void setVlrmoedaestrageira(BigDecimal vlrmoedaestrageira) {
        this.vlrmoedaestrageira = vlrmoedaestrageira;
    }

    public Short getQtdiasentregaitem() {
        return qtdiasentregaitem;
    }

    public void setQtdiasentregaitem(Short qtdiasentregaitem) {
        this.qtdiasentregaitem = qtdiasentregaitem;
    }

    public String getImprimerestaurante() {
        return imprimerestaurante;
    }

    public void setImprimerestaurante(String imprimerestaurante) {
        this.imprimerestaurante = imprimerestaurante;
    }

    public String getImpressorestaurante() {
        return impressorestaurante;
    }

    public void setImpressorestaurante(String impressorestaurante) {
        this.impressorestaurante = impressorestaurante;
    }

    public Long getCodimp() {
        return codimp;
    }

    public void setCodimp(Long codimp) {
        this.codimp = codimp;
    }

    public Integer getNumseqimpressao() {
        return numseqimpressao;
    }

    public void setNumseqimpressao(Integer numseqimpressao) {
        this.numseqimpressao = numseqimpressao;
    }

    public Integer getNumitemorca() {
        return numitemorca;
    }

    public void setNumitemorca(Integer numitemorca) {
        this.numitemorca = numitemorca;
    }

    public BigDecimal getVlacresccomplemento() {
        return vlacresccomplemento;
    }

    public void setVlacresccomplemento(BigDecimal vlacresccomplemento) {
        this.vlacresccomplemento = vlacresccomplemento;
    }

    public BigDecimal getPercredaliqipi() {
        return percredaliqipi;
    }

    public void setPercredaliqipi(BigDecimal percredaliqipi) {
        this.percredaliqipi = percredaliqipi;
    }

    public Integer getCodprodcesta() {
        return codprodcesta;
    }

    public void setCodprodcesta(Integer codprodcesta) {
        this.codprodcesta = codprodcesta;
    }

    public String getBonific() {
        return bonific;
    }

    public void setBonific(String bonific) {
        this.bonific = bonific;
    }

    public Integer getCodindicemultiplicador() {
        return codindicemultiplicador;
    }

    public void setCodindicemultiplicador(Integer codindicemultiplicador) {
        this.codindicemultiplicador = codindicemultiplicador;
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

    public BigDecimal getPbonific() {
        return pbonific;
    }

    public void setPbonific(BigDecimal pbonific) {
        this.pbonific = pbonific;
    }

    public BigDecimal getPvendaliq() {
        return pvendaliq;
    }

    public void setPvendaliq(BigDecimal pvendaliq) {
        this.pvendaliq = pvendaliq;
    }

    public String getRotinalanc() {
        return rotinalanc;
    }

    public void setRotinalanc(String rotinalanc) {
        this.rotinalanc = rotinalanc;
    }

    public BigDecimal getVlbasepartdest() {
        return vlbasepartdest;
    }

    public void setVlbasepartdest(BigDecimal vlbasepartdest) {
        this.vlbasepartdest = vlbasepartdest;
    }

    public BigDecimal getAliqfcp() {
        return aliqfcp;
    }

    public void setAliqfcp(BigDecimal aliqfcp) {
        this.aliqfcp = aliqfcp;
    }

    public BigDecimal getAliqinternadest() {
        return aliqinternadest;
    }

    public void setAliqinternadest(BigDecimal aliqinternadest) {
        this.aliqinternadest = aliqinternadest;
    }

    public BigDecimal getVlfcppart() {
        return vlfcppart;
    }

    public void setVlfcppart(BigDecimal vlfcppart) {
        this.vlfcppart = vlfcppart;
    }

    public BigDecimal getVlicmspartdest() {
        return vlicmspartdest;
    }

    public void setVlicmspartdest(BigDecimal vlicmspartdest) {
        this.vlicmspartdest = vlicmspartdest;
    }

    public BigDecimal getVlicmspart() {
        return vlicmspart;
    }

    public void setVlicmspart(BigDecimal vlicmspart) {
        this.vlicmspart = vlicmspart;
    }

    public BigDecimal getPercprovpart() {
        return percprovpart;
    }

    public void setPercprovpart(BigDecimal percprovpart) {
        this.percprovpart = percprovpart;
    }

    public BigDecimal getVlicmsdifaliqpart() {
        return vlicmsdifaliqpart;
    }

    public void setVlicmsdifaliqpart(BigDecimal vlicmsdifaliqpart) {
        this.vlicmsdifaliqpart = vlicmsdifaliqpart;
    }

    public BigDecimal getPercbaseredpart() {
        return percbaseredpart;
    }

    public void setPercbaseredpart(BigDecimal percbaseredpart) {
        this.percbaseredpart = percbaseredpart;
    }

    public BigDecimal getVlicmspartrem() {
        return vlicmspartrem;
    }

    public void setVlicmspartrem(BigDecimal vlicmspartrem) {
        this.vlicmspartrem = vlicmspartrem;
    }

    public BigDecimal getAliqinterorigpart() {
        return aliqinterorigpart;
    }

    public void setAliqinterorigpart(BigDecimal aliqinterorigpart) {
        this.aliqinterorigpart = aliqinterorigpart;
    }

    public BigDecimal getVlipiptabela() {
        return vlipiptabela;
    }

    public void setVlipiptabela(BigDecimal vlipiptabela) {
        this.vlipiptabela = vlipiptabela;
    }

    public BigDecimal getVlipipbaserca() {
        return vlipipbaserca;
    }

    public void setVlipipbaserca(BigDecimal vlipipbaserca) {
        this.vlipipbaserca = vlipipbaserca;
    }

    public BigDecimal getVlicmspartptabela() {
        return vlicmspartptabela;
    }

    public void setVlicmspartptabela(BigDecimal vlicmspartptabela) {
        this.vlicmspartptabela = vlicmspartptabela;
    }

    public BigDecimal getVlicmspartpbaserca() {
        return vlicmspartpbaserca;
    }

    public void setVlicmspartpbaserca(BigDecimal vlicmspartpbaserca) {
        this.vlicmspartpbaserca = vlicmspartpbaserca;
    }

    public Long getNumitemped() {
        return numitemped;
    }

    public void setNumitemped(Long numitemped) {
        this.numitemped = numitemped;
    }

    public Short getCodmotivonaoatendprod() {
        return codmotivonaoatendprod;
    }

    public void setCodmotivonaoatendprod(Short codmotivonaoatendprod) {
        this.codmotivonaoatendprod = codmotivonaoatendprod;
    }

    public BigDecimal getPercdescpis() {
        return percdescpis;
    }

    public void setPercdescpis(BigDecimal percdescpis) {
        this.percdescpis = percdescpis;
    }

    public BigDecimal getVldescreducaopis() {
        return vldescreducaopis;
    }

    public void setVldescreducaopis(BigDecimal vldescreducaopis) {
        this.vldescreducaopis = vldescreducaopis;
    }

    public BigDecimal getPercdesccofins() {
        return percdesccofins;
    }

    public void setPercdesccofins(BigDecimal percdesccofins) {
        this.percdesccofins = percdesccofins;
    }

    public BigDecimal getVldescreducaocofins() {
        return vldescreducaocofins;
    }

    public void setVldescreducaocofins(BigDecimal vldescreducaocofins) {
        this.vldescreducaocofins = vldescreducaocofins;
    }

    public Short getCodfigvendatriangular() {
        return codfigvendatriangular;
    }

    public void setCodfigvendatriangular(Short codfigvendatriangular) {
        this.codfigvendatriangular = codfigvendatriangular;
    }

    public Integer getCoddescontosimulador() {
        return coddescontosimulador;
    }

    public void setCoddescontosimulador(Integer coddescontosimulador) {
        this.coddescontosimulador = coddescontosimulador;
    }

    public Integer getCodfiscal() {
        return codfiscal;
    }

    public void setCodfiscal(Integer codfiscal) {
        this.codfiscal = codfiscal;
    }

    public String getSittribut() {
        return sittribut;
    }

    public void setSittribut(String sittribut) {
        this.sittribut = sittribut;
    }

    public String getVersaoservicopartilha() {
        return versaoservicopartilha;
    }

    public void setVersaoservicopartilha(String versaoservicopartilha) {
        this.versaoservicopartilha = versaoservicopartilha;
    }

    public LocalDate getDtentregamesa() {
        return dtentregamesa;
    }

    public void setDtentregamesa(LocalDate dtentregamesa) {
        this.dtentregamesa = dtentregamesa;
    }

    public Integer getCodfuncentregamesa() {
        return codfuncentregamesa;
    }

    public void setCodfuncentregamesa(Integer codfuncentregamesa) {
        this.codfuncentregamesa = codfuncentregamesa;
    }

    public String getProdimportadopeps() {
        return prodimportadopeps;
    }

    public void setProdimportadopeps(String prodimportadopeps) {
        this.prodimportadopeps = prodimportadopeps;
    }

    public Long getNumtransentpeps() {
        return numtransentpeps;
    }

    public void setNumtransentpeps(Long numtransentpeps) {
        this.numtransentpeps = numtransentpeps;
    }

    public BigDecimal getPtabelafabricazfm() {
        return ptabelafabricazfm;
    }

    public void setPtabelafabricazfm(BigDecimal ptabelafabricazfm) {
        this.ptabelafabricazfm = ptabelafabricazfm;
    }

    public Long getServimp() {
        return servimp;
    }

    public void setServimp(Long servimp) {
        this.servimp = servimp;
    }

    public String getOrigmerctrib() {
        return origmerctrib;
    }

    public void setOrigmerctrib(String origmerctrib) {
        this.origmerctrib = origmerctrib;
    }

    public Long getCodimpservimp() {
        return codimpservimp;
    }

    public void setCodimpservimp(Long codimpservimp) {
        this.codimpservimp = codimpservimp;
    }

    public LocalDate getDtenvioservcarga() {
        return dtenvioservcarga;
    }

    public void setDtenvioservcarga(LocalDate dtenvioservcarga) {
        this.dtenvioservcarga = dtenvioservcarga;
    }

    public String getDesconsiderardescatacado() {
        return desconsiderardescatacado;
    }

    public void setDesconsiderardescatacado(String desconsiderardescatacado) {
        this.desconsiderardescatacado = desconsiderardescatacado;
    }

    public BigDecimal getVltotservico() {
        return vltotservico;
    }

    public void setVltotservico(BigDecimal vltotservico) {
        this.vltotservico = vltotservico;
    }

    public String getProduzirTinta() {
        return produzirTinta;
    }

    public void setProduzirTinta(String produzirTinta) {
        this.produzirTinta = produzirTinta;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }

    public String getDescricaopaf() {
        return descricaopaf;
    }

    public void setDescricaopaf(String descricaopaf) {
        this.descricaopaf = descricaopaf;
    }

    public String getMd5paf() {
        return md5paf;
    }

    public void setMd5paf(String md5paf) {
        this.md5paf = md5paf;
    }

    public LocalDate getDtiniciopromolote() {
        return dtiniciopromolote;
    }

    public void setDtiniciopromolote(LocalDate dtiniciopromolote) {
        this.dtiniciopromolote = dtiniciopromolote;
    }

    public LocalDate getDtfimpromolote() {
        return dtfimpromolote;
    }

    public void setDtfimpromolote(LocalDate dtfimpromolote) {
        this.dtfimpromolote = dtfimpromolote;
    }

    public String getLotecontrato() {
        return lotecontrato;
    }

    public void setLotecontrato(String lotecontrato) {
        this.lotecontrato = lotecontrato;
    }

    public BigDecimal getPercdescbaserca() {
        return percdescbaserca;
    }

    public void setPercdescbaserca(BigDecimal percdescbaserca) {
        this.percdescbaserca = percdescbaserca;
    }

    public String getTipocomissaomed() {
        return tipocomissaomed;
    }

    public void setTipocomissaomed(String tipocomissaomed) {
        this.tipocomissaomed = tipocomissaomed;
    }

    public Short getCodplpag() {
        return codplpag;
    }

    public void setCodplpag(Short codplpag) {
        this.codplpag = codplpag;
    }

    public Integer getCodlinhaprazo() {
        return codlinhaprazo;
    }

    public void setCodlinhaprazo(Integer codlinhaprazo) {
        this.codlinhaprazo = codlinhaprazo;
    }

    public BigDecimal getVldescboletocmv() {
        return vldescboletocmv;
    }

    public void setVldescboletocmv(BigDecimal vldescboletocmv) {
        this.vldescboletocmv = vldescboletocmv;
    }

    public BigDecimal getPerctaxaprazomedcmv() {
        return perctaxaprazomedcmv;
    }

    public void setPerctaxaprazomedcmv(BigDecimal perctaxaprazomedcmv) {
        this.perctaxaprazomedcmv = perctaxaprazomedcmv;
    }

    public BigDecimal getVltaxaprazomedcmv() {
        return vltaxaprazomedcmv;
    }

    public void setVltaxaprazomedcmv(BigDecimal vltaxaprazomedcmv) {
        this.vltaxaprazomedcmv = vltaxaprazomedcmv;
    }

    public Integer getCodedital() {
        return codedital;
    }

    public void setCodedital(Integer codedital) {
        this.codedital = codedital;
    }

    public Short getTipoconversaopedlicit() {
        return tipoconversaopedlicit;
    }

    public void setTipoconversaopedlicit(Short tipoconversaopedlicit) {
        this.tipoconversaopedlicit = tipoconversaopedlicit;
    }

    public String getUnidadeconversaopedlicit() {
        return unidadeconversaopedlicit;
    }

    public void setUnidadeconversaopedlicit(String unidadeconversaopedlicit) {
        this.unidadeconversaopedlicit = unidadeconversaopedlicit;
    }

    public BigDecimal getFatorconversaopedlicit() {
        return fatorconversaopedlicit;
    }

    public void setFatorconversaopedlicit(BigDecimal fatorconversaopedlicit) {
        this.fatorconversaopedlicit = fatorconversaopedlicit;
    }

    public BigDecimal getQtpedlicit() {
        return qtpedlicit;
    }

    public void setQtpedlicit(BigDecimal qtpedlicit) {
        this.qtpedlicit = qtpedlicit;
    }

    public String getNumempenho() {
        return numempenho;
    }

    public void setNumempenho(String numempenho) {
        this.numempenho = numempenho;
    }

    public Integer getCodprodequipcomodloc() {
        return codprodequipcomodloc;
    }

    public void setCodprodequipcomodloc(Integer codprodequipcomodloc) {
        this.codprodequipcomodloc = codprodequipcomodloc;
    }

    public Long getCodequipamentocomodloc() {
        return codequipamentocomodloc;
    }

    public void setCodequipamentocomodloc(Long codequipamentocomodloc) {
        this.codequipamentocomodloc = codequipamentocomodloc;
    }

    public BigDecimal getPrecomaxconsum() {
        return precomaxconsum;
    }

    public void setPrecomaxconsum(BigDecimal precomaxconsum) {
        this.precomaxconsum = precomaxconsum;
    }

    public Integer getCodpromocaomed() {
        return codpromocaomed;
    }

    public void setCodpromocaomed(Integer codpromocaomed) {
        this.codpromocaomed = codpromocaomed;
    }

    public BigDecimal getIniciointervalodescquant() {
        return iniciointervalodescquant;
    }

    public void setIniciointervalodescquant(BigDecimal iniciointervalodescquant) {
        this.iniciointervalodescquant = iniciointervalodescquant;
    }

    public BigDecimal getVlbasefcpicms() {
        return vlbasefcpicms;
    }

    public void setVlbasefcpicms(BigDecimal vlbasefcpicms) {
        this.vlbasefcpicms = vlbasefcpicms;
    }

    public BigDecimal getVlbasefcpst() {
        return vlbasefcpst;
    }

    public void setVlbasefcpst(BigDecimal vlbasefcpst) {
        this.vlbasefcpst = vlbasefcpst;
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

    public BigDecimal getPerfcpsn() {
        return perfcpsn;
    }

    public void setPerfcpsn(BigDecimal perfcpsn) {
        this.perfcpsn = perfcpsn;
    }

    public BigDecimal getVlcredfcpicmssn() {
        return vlcredfcpicmssn;
    }

    public void setVlcredfcpicmssn(BigDecimal vlcredfcpicmssn) {
        this.vlcredfcpicmssn = vlcredfcpicmssn;
    }

    public BigDecimal getVlfecp() {
        return vlfecp;
    }

    public void setVlfecp(BigDecimal vlfecp) {
        this.vlfecp = vlfecp;
    }

    public BigDecimal getVlacrescimofuncep() {
        return vlacrescimofuncep;
    }

    public void setVlacrescimofuncep(BigDecimal vlacrescimofuncep) {
        this.vlacrescimofuncep = vlacrescimofuncep;
    }

    public BigDecimal getPeracrescimofuncep() {
        return peracrescimofuncep;
    }

    public void setPeracrescimofuncep(BigDecimal peracrescimofuncep) {
        this.peracrescimofuncep = peracrescimofuncep;
    }

    public BigDecimal getAliqicmsfecp() {
        return aliqicmsfecp;
    }

    public void setAliqicmsfecp(BigDecimal aliqicmsfecp) {
        this.aliqicmsfecp = aliqicmsfecp;
    }

    public String getUtilizoumotorcalculo() {
        return utilizoumotorcalculo;
    }

    public void setUtilizoumotorcalculo(String utilizoumotorcalculo) {
        this.utilizoumotorcalculo = utilizoumotorcalculo;
    }

    public String getBaixaqtfrenteloja() {
        return baixaqtfrenteloja;
    }

    public void setBaixaqtfrenteloja(String baixaqtfrenteloja) {
        this.baixaqtfrenteloja = baixaqtfrenteloja;
    }

    public String getCodecf() {
        return codecf;
    }

    public void setCodecf(String codecf) {
        this.codecf = codecf;
    }

    public Integer getNumverbacampanha() {
        return numverbacampanha;
    }

    public void setNumverbacampanha(Integer numverbacampanha) {
        this.numverbacampanha = numverbacampanha;
    }

    public BigDecimal getPerccustfornec() {
        return perccustfornec;
    }

    public void setPerccustfornec(BigDecimal perccustfornec) {
        this.perccustfornec = perccustfornec;
    }

    public BigDecimal getVlcustfornec() {
        return vlcustfornec;
    }

    public void setVlcustfornec(BigDecimal vlcustfornec) {
        this.vlcustfornec = vlcustfornec;
    }

    public BigDecimal getVloutrasdesp() {
        return vloutrasdesp;
    }

    public void setVloutrasdesp(BigDecimal vloutrasdesp) {
        this.vloutrasdesp = vloutrasdesp;
    }

    public BigDecimal getVlacrescrodape() {
        return vlacrescrodape;
    }

    public void setVlacrescrodape(BigDecimal vlacrescrodape) {
        this.vlacrescrodape = vlacrescrodape;
    }

    public String getCodigointegracaowms() {
        return codigointegracaowms;
    }

    public void setCodigointegracaowms(String codigointegracaowms) {
        this.codigointegracaowms = codigointegracaowms;
    }

    public String getNumlotepromocaomed() {
        return numlotepromocaomed;
    }

    public void setNumlotepromocaomed(String numlotepromocaomed) {
        this.numlotepromocaomed = numlotepromocaomed;
    }

    public Long getCoddeposito() {
        return coddeposito;
    }

    public void setCoddeposito(Long coddeposito) {
        this.coddeposito = coddeposito;
    }

    public String getNumpedcli() {
        return numpedcli;
    }

    public void setNumpedcli(String numpedcli) {
        this.numpedcli = numpedcli;
    }

    public BigDecimal getVldesccmvpromocaomed() {
        return vldesccmvpromocaomed;
    }

    public void setVldesccmvpromocaomed(BigDecimal vldesccmvpromocaomed) {
        this.vldesccmvpromocaomed = vldesccmvpromocaomed;
    }

    public Integer getCodcontrato() {
        return codcontrato;
    }

    public void setCodcontrato(Integer codcontrato) {
        this.codcontrato = codcontrato;
    }

    public BigDecimal getBcstretanterior() {
        return bcstretanterior;
    }

    public void setBcstretanterior(BigDecimal bcstretanterior) {
        this.bcstretanterior = bcstretanterior;
    }

    public BigDecimal getVlicmssubstitutoanterior() {
        return vlicmssubstitutoanterior;
    }

    public void setVlicmssubstitutoanterior(BigDecimal vlicmssubstitutoanterior) {
        this.vlicmssubstitutoanterior = vlicmssubstitutoanterior;
    }

    public BigDecimal getVlicmsstretanterior() {
        return vlicmsstretanterior;
    }

    public void setVlicmsstretanterior(BigDecimal vlicmsstretanterior) {
        this.vlicmsstretanterior = vlicmsstretanterior;
    }

    public BigDecimal getPmpfmedicamento() {
        return pmpfmedicamento;
    }

    public void setPmpfmedicamento(BigDecimal pmpfmedicamento) {
        this.pmpfmedicamento = pmpfmedicamento;
    }

    public Integer getCodprospecto() {
        return codprospecto;
    }

    public void setCodprospecto(Integer codprospecto) {
        this.codprospecto = codprospecto;
    }

    public Long getCodprodcli() {
        return codprodcli;
    }

    public void setCodprodcli(Long codprodcli) {
        this.codprodcli = codprodcli;
    }

    public BigDecimal getPsugerido() {
        return psugerido;
    }

    public void setPsugerido(BigDecimal psugerido) {
        this.psugerido = psugerido;
    }

    public Integer getCodfornecsugestao() {
        return codfornecsugestao;
    }

    public void setCodfornecsugestao(Integer codfornecsugestao) {
        this.codfornecsugestao = codfornecsugestao;
    }

    public Long getNumseqorig() {
        return numseqorig;
    }

    public void setNumseqorig(Long numseqorig) {
        this.numseqorig = numseqorig;
    }

    public Integer getNumccf() {
        return numccf;
    }

    public void setNumccf(Integer numccf) {
        this.numccf = numccf;
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

    public BigDecimal getVlipisuspenso() {
        return vlipisuspenso;
    }

    public void setVlipisuspenso(BigDecimal vlipisuspenso) {
        this.vlipisuspenso = vlipisuspenso;
    }

    public BigDecimal getVliisuspenso() {
        return vliisuspenso;
    }

    public void setVliisuspenso(BigDecimal vliisuspenso) {
        this.vliisuspenso = vliisuspenso;
    }

}