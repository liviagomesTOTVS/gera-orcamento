package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PCPRODUT")
public class Pcprodut {
    @Id
    @Column(name = "CODPROD", nullable = false)
    private Integer id;

    @Column(name = "DESCRICAO", nullable = false, length = 40)
    private String descricao;

    @Column(name = "EMBALAGEM", nullable = false, length = 12)
    private String embalagem;

    @Column(name = "UNIDADE", length = 2)
    private String unidade;

    @Column(name = "PESOLIQ", precision = 12, scale = 6)
    private BigDecimal pesoliq;

    @Column(name = "PESOBRUTO", precision = 12, scale = 6)
    private BigDecimal pesobruto;

    @Column(name = "CODEPTO", nullable = false)
    private Integer codepto;

    @Column(name = "CODSEC", nullable = false)
    private Integer codsec;

    @Column(name = "PCOMINT1", precision = 6, scale = 2)
    private BigDecimal pcomint1;

    @Column(name = "TEMREPOS")
    private Short temrepos;

    @Column(name = "QTUNIT", precision = 6, scale = 2)
    private BigDecimal qtunit;

    @Column(name = "OBS", length = 2)
    private String obs;

    @Column(name = "PCOMREP1", precision = 6, scale = 2)
    private BigDecimal pcomrep1;

    @Column(name = "PCOMEXT1", precision = 6, scale = 2)
    private BigDecimal pcomext1;

    @Column(name = "CODFORNEC", nullable = false)
    private Integer codfornec;

    @Column(name = "DTCADASTRO")
    private LocalDate dtcadastro;

    @Column(name = "VOLUME", precision = 20, scale = 8)
    private BigDecimal volume;

    @Column(name = "CODAUXILIAR")
    private Long codauxiliar;

    @Column(name = "CLASSE", length = 1)
    private String classe;

    @Column(name = "LASTROPAL", precision = 10, scale = 4)
    private BigDecimal lastropal;

    @Column(name = "ALTURAPAL", precision = 10, scale = 4)
    private BigDecimal alturapal;

    @Column(name = "QTTOTPAL", precision = 8, scale = 2)
    private BigDecimal qttotpal;

    @Column(name = "PRAZOVAL")
    private Short prazoval;

    @Column(name = "QTUNITCX", precision = 8, scale = 2)
    private BigDecimal qtunitcx;

    @Column(name = "REVENDA", length = 1)
    private String revenda;

    @Column(name = "IMPORTADO", length = 1)
    private String importado;

    @Column(name = "FOLHAROSTO", length = 1)
    private String folharosto;

    @Column(name = "DTEXCLUSAO")
    private LocalDate dtexclusao;

    @Column(name = "MODULO")
    private Short modulo;

    @Column(name = "RUA")
    private Short rua;

    @Column(name = "APTO")
    private Short apto;

    @Column(name = "DTULTALTCOM")
    private LocalDate dtultaltcom;

    @Column(name = "CAMPANHA", length = 1)
    private String campanha;

    @Column(name = "CODPRODPRINC")
    private Integer codprodprinc;

    @Column(name = "OBS2", length = 2)
    private String obs2;

    @Column(name = "PERCIPI", precision = 14, scale = 4)
    private BigDecimal percipi;

    @Column(name = "UNIDADEMASTER", length = 2)
    private String unidademaster;

    @Column(name = "CORREDOR", length = 4)
    private String corredor;

    @Column(name = "LARGURAM3", precision = 10, scale = 6)
    private BigDecimal larguram3;

    @Column(name = "ALTURAM3", precision = 10, scale = 6)
    private BigDecimal alturam3;

    @Column(name = "COMPRIMENTOM3", precision = 10, scale = 6)
    private BigDecimal comprimentom3;

    @Column(name = "TIPORESTRICAO", length = 1)
    private String tiporestricao;

    @Column(name = "QTTOTPALFRAC", precision = 6, scale = 2)
    private BigDecimal qttotpalfrac;

    @Column(name = "DV")
    private Boolean dv;

    @Column(name = "CLASSEVENDA", length = 1)
    private String classevenda;

    @Column(name = "CLASSEMC", length = 1)
    private String classemc;

    @Column(name = "CLASSEESTOQUE", length = 1)
    private String classeestoque;

    @Column(name = "CLASSECOMPRA", length = 1)
    private String classecompra;

    @Column(name = "PERICM", precision = 12, scale = 4)
    private BigDecimal pericm;

    @Column(name = "PERCDESC", precision = 12, scale = 4)
    private BigDecimal percdesc;

    @Column(name = "PERCST", precision = 12, scale = 4)
    private BigDecimal percst;

    @Column(name = "PERCBON", precision = 14, scale = 4)
    private BigDecimal percbon;

    @Column(name = "PERCFRETE", precision = 14, scale = 4)
    private BigDecimal percfrete;

    @Column(name = "MOEDA", length = 1)
    private String moeda;

    @Column(name = "DTDOLAR", length = 1)
    private String dtdolar;

    @Column(name = "DESCRICAO1", length = 45)
    private String descricao1;

    @Column(name = "DESCRICAO2", length = 45)
    private String descricao2;

    @Column(name = "DESCRICAO3", length = 45)
    private String descricao3;

    @Column(name = "DESCRICAO4", length = 45)
    private String descricao4;

    @Column(name = "CLASSIFICFISCAL", length = 20)
    private String classificfiscal;

    @Column(name = "CUSTOREP", precision = 18, scale = 6)
    private BigDecimal custorep;

    @Column(name = "DTULTALTCUSTOREP")
    private LocalDate dtultaltcustorep;

    @Column(name = "NBM", length = 15)
    private String nbm;

    @Column(name = "CODFAB", length = 30)
    private String codfab;

    @Column(name = "TRIBFEDERAL", length = 15)
    private String tribfederal;

    @Column(name = "PERCIPIVENDA", precision = 10, scale = 2)
    private BigDecimal percipivenda;

    @Column(name = "PERCDESC1", precision = 12, scale = 4)
    private BigDecimal percdesc1;

    @Column(name = "PERCDESC2", precision = 12, scale = 4)
    private BigDecimal percdesc2;

    @Column(name = "PERCDESC3", precision = 12, scale = 4)
    private BigDecimal percdesc3;

    @Column(name = "PERCDESC4", precision = 12, scale = 4)
    private BigDecimal percdesc4;

    @Column(name = "PERICMSANTECIPADO", precision = 14, scale = 4)
    private BigDecimal pericmsantecipado;

    @Column(name = "CODPRODSIMILAR")
    private Integer codprodsimilar;

    @Column(name = "CODCATEGORIA")
    private Integer codcategoria;

    @Column(name = "CODSUBCATEGORIA")
    private Integer codsubcategoria;

    @Column(name = "CODFILIAL", length = 2)
    private String codfilial;

    @Column(name = "TIPODESCARGA", length = 1)
    private String tipodescarga;

    @Column(name = "STATUS", length = 1)
    private String status;

    @Column(name = "PERCOUTRASDESP", precision = 14, scale = 4)
    private BigDecimal percoutrasdesp;

    @Column(name = "PERCFRETEFOB", precision = 18, scale = 6)
    private BigDecimal percfretefob;

    @Column(name = "PERCDESPADICIONAL", precision = 14, scale = 4)
    private BigDecimal percdespadicional;

    @Column(name = "PERCDESPFIN", precision = 14, scale = 4)
    private BigDecimal percdespfin;

    @Column(name = "VLBONIFIC", precision = 18, scale = 6)
    private BigDecimal vlbonific;

    @Column(name = "PRECOFIXO", length = 1)
    private String precofixo;

    @Column(name = "PISCOFINSRETIDO", length = 1)
    private String piscofinsretido;

    @Column(name = "PERCCOMMOT", precision = 8, scale = 2)
    private BigDecimal perccommot;

    @Column(name = "IVARESSARC", precision = 10, scale = 2)
    private BigDecimal ivaressarc;

    @Column(name = "ICMSRESSARC", precision = 10, scale = 2)
    private BigDecimal icmsressarc;

    @Column(name = "TIPOVOLUMEDESCARGA", length = 2)
    private String tipovolumedescarga;

    @Column(name = "COMISSAOFIXA", length = 1)
    private String comissaofixa;

    @Column(name = "USACLASSIFICACAO", length = 1)
    private String usaclassificacao;

    @Column(name = "PERCIVAICMANTECIP", precision = 10, scale = 2)
    private BigDecimal percivaicmantecip;

    @Column(name = "PERCALIQINTICMANTECIP", precision = 12, scale = 4)
    private BigDecimal percaliqinticmantecip;

    @Column(name = "PERCALIQEXTICMANTECIP", precision = 12, scale = 4)
    private BigDecimal percaliqexticmantecip;

    @Column(name = "PERCICMRED", precision = 12, scale = 4)
    private BigDecimal percicmred;

    @Column(name = "PERCIVA", precision = 12, scale = 4)
    private BigDecimal perciva;

    @Column(name = "PERCALIQINT", precision = 12, scale = 4)
    private BigDecimal percaliqint;

    @Column(name = "PERCALIQEXT", precision = 12, scale = 4)
    private BigDecimal percaliqext;

    @Column(name = "CODAUXILIAR2")
    private Long codauxiliar2;

    @Column(name = "VENDADIRETA", length = 1)
    private String vendadireta;

    @Column(name = "PASSELIVRE", length = 1)
    private String passelivre;

    @Column(name = "MODULO2")
    private Short modulo2;

    @Column(name = "RUA2")
    private Short rua2;

    @Column(name = "NUMERO2", precision = 6, scale = 2)
    private BigDecimal numero2;

    @Column(name = "APTO2")
    private Short apto2;

    @Column(name = "CODPASSEFISCAL")
    private Integer codpassefiscal;

    @Column(name = "TIPOALTURAPALETE")
    private Short tipoalturapalete;

    @Column(name = "NUMLOTE", length = 20)
    private String numlote;

    @Column(name = "DTVENC")
    private LocalDate dtvenc;

    @Column(name = "PERINDENIZ", precision = 5, scale = 2)
    private BigDecimal perindeniz;

    @Column(name = "PERPIS", precision = 12, scale = 4)
    private BigDecimal perpis;

    @Column(name = "MULTIPLO", precision = 18, scale = 6)
    private BigDecimal multiplo;

    @Column(name = "VLVENDATEMP", precision = 16, scale = 2)
    private BigDecimal vlvendatemp;

    @Column(name = "TIPOMERC", length = 2)
    private String tipomerc;

    @Column(name = "NORMAFORNECEDOR", length = 10)
    private String normafornecedor;

    @Column(name = "TIPOCALCST", length = 1)
    private String tipocalcst;

    @Column(name = "PERICMFRETE", precision = 8, scale = 4)
    private BigDecimal pericmfrete;

    @Column(name = "LOTEMINCOMPRA", precision = 14, scale = 2)
    private BigDecimal lotemincompra;

    @Column(name = "TIPOSUGCOMPRA", length = 2)
    private String tiposugcompra;

    @Column(name = "LOTEINCCOMPRA", precision = 14, scale = 2)
    private BigDecimal loteinccompra;

    @Column(name = "LOTEPRODUCAO", precision = 14, scale = 2)
    private BigDecimal loteproducao;

    @Column(name = "AUTORIZATIPO4", length = 1)
    private String autorizatipo4;

    @Column(name = "ACEITAVENDAFRACAO", length = 1)
    private String aceitavendafracao;

    @Column(name = "CODFUNCCADASTRO")
    private Integer codfunccadastro;

    @Column(name = "CODFUNCULTALTER")
    private Integer codfuncultalter;

    @Column(name = "CODFISCAL")
    private Long codfiscal;

    @Column(name = "SITTRIBUT", length = 3)
    private String sittribut;

    @Column(name = "MARGEMMIN", precision = 4, scale = 2)
    private BigDecimal margemmin;

    @Column(name = "FLAGS", length = 1)
    private String flags;

    @Column(name = "FLAG0", length = 2)
    private String flag0;

    @Column(name = "FLAG1", length = 2)
    private String flag1;

    @Column(name = "FLAG2", length = 2)
    private String flag2;

    @Column(name = "LARGURAARM", precision = 10, scale = 6)
    private BigDecimal larguraarm;

    @Column(name = "COMPRIMENTOARM", precision = 10, scale = 6)
    private BigDecimal comprimentoarm;

    @Column(name = "ALTURAARM", precision = 10, scale = 6)
    private BigDecimal alturaarm;

    @Column(name = "VOLUMEARM", precision = 20, scale = 8)
    private BigDecimal volumearm;

    @Column(name = "CAMAPAPAL", precision = 10, scale = 4)
    private BigDecimal camapapal;

    @Column(name = "TIPOPROD")
    private Short tipoprod;

    @Column(name = "TIPOPAL")
    private Short tipopal;

    @Column(name = "TIPOARM")
    private Short tipoarm;

    @Column(name = "CAPACIDADEPICKING", precision = 8, scale = 2)
    private BigDecimal capacidadepicking;

    @Column(name = "CODCARACPROD")
    private Short codcaracprod;

    @Column(name = "CODTIPOESTRUTURA")
    private Short codtipoestrutura;

    @Column(name = "RESTRICAOBLOCADO")
    private Short restricaoblocado;

    @Column(name = "PONTOREPOSICAO", precision = 8, scale = 2)
    private BigDecimal pontoreposicao;

    @Column(name = "TIPOPALPUL")
    private Short tipopalpul;

    @Column(name = "CODTIPOESTRUTURAPUL")
    private Short codtipoestruturapul;

    @Column(name = "CODPRODMASTER")
    private Integer codprodmaster;

    @Column(name = "QTUNITCT", precision = 6, scale = 2)
    private BigDecimal qtunitct;

    @Column(name = "RUACT")
    private Short ruact;

    @Column(name = "NUMEROCT", precision = 6, scale = 2)
    private BigDecimal numeroct;

    @Column(name = "APTOCT")
    private Short aptoct;

    @Column(name = "MODULOCT")
    private Short moduloct;

    @Column(name = "RUACX")
    private Short ruacx;

    @Column(name = "APTOCX")
    private Short aptocx;

    @Column(name = "MODULOCX")
    private Short modulocx;

    @Column(name = "UNIDADECT", length = 2)
    private String unidadect;

    @Column(name = "VLPAUTA", precision = 18, scale = 6)
    private BigDecimal vlpauta;

    @Column(name = "VLPAUTAIPI", precision = 18, scale = 6)
    private BigDecimal vlpautaipi;

    @Column(name = "EMBALAGEMMASTER", length = 12)
    private String embalagemmaster;

    @Column(name = "EMBALAGEMCT", length = 12)
    private String embalagemct;

    @Column(name = "NUMDIASMAXVENDA")
    private Short numdiasmaxvenda;

    @Column(name = "USAALIQCREDICMSDIFER", length = 1)
    private String usaaliqcredicmsdifer;

    @Column(name = "PERCALIQCREDICMSDIFEREST", precision = 5, scale = 2)
    private BigDecimal percaliqcredicmsdiferest;

    @Column(name = "PERCALIQCREDICMSDIFERINTER", precision = 5, scale = 2)
    private BigDecimal percaliqcredicmsdiferinter;

    @Column(name = "PSICOTROPICO", length = 1)
    private String psicotropico;

    @Column(name = "CODLINHAPROD")
    private Integer codlinhaprod;

    @Column(name = "CUSTOREPTAB", precision = 18, scale = 6)
    private BigDecimal custoreptab;

    @Column(name = "PRECOMAXCONSUM", precision = 18, scale = 6)
    private BigDecimal precomaxconsum;

    @Column(name = "PRECOMAXCONSUMTAB", precision = 18, scale = 6)
    private BigDecimal precomaxconsumtab;

    @Column(name = "PERCDESC5", precision = 12, scale = 4)
    private BigDecimal percdesc5;

    @Column(name = "NUMLISTAINVENTROT")
    private Integer numlistainventrot;

    @Column(name = "NUMSEQINVENTROT")
    private Integer numseqinventrot;

    @Column(name = "MEDICAMENTOHOSPITALAR", length = 1)
    private String medicamentohospitalar;

    @Column(name = "PERCBONIFICVENDA", precision = 5, scale = 2)
    private BigDecimal percbonificvenda;

    @Column(name = "PRINCIPIOATIVO", length = 100)
    private String principioativo;

    @Column(name = "TIPOTRIBUTMEDIC", length = 2)
    private String tipotributmedic;

    @Column(name = "DEPOSITO")
    private Short deposito;

    @Column(name = "PREDIO")
    private Short predio;

    @Column(name = "NIVEL")
    private Short nivel;

    @Column(name = "CODEQUIPE")
    private Short codequipe;

    @Column(name = "PERCSUFRAMA", precision = 12, scale = 4)
    private BigDecimal percsuframa;

    @Column(name = "EXPORTABALANCA", length = 1)
    private String exportabalanca;

    @Column(name = "CODINFNUTRI")
    private Long codinfnutri;

    @Column(name = "SOMENTETV3", length = 1)
    private String somentetv3;

    @Column(name = "PCOMTLMKT", precision = 6, scale = 2)
    private BigDecimal pcomtlmkt;

    @Column(name = "SEQTABPRECO")
    private Short seqtabpreco;

    @Column(name = "QTPONTOPEDIDO", precision = 20, scale = 8)
    private BigDecimal qtpontopedido;

    @Column(name = "QTMINPRODUZIR", precision = 20, scale = 8)
    private BigDecimal qtminproduzir;

    @Column(name = "PRAZOMEDIOPRODUCAO")
    private Integer prazomedioproducao;

    @Column(name = "NOMECOMERCIAL", length = 100)
    private String nomecomercial;

    @Column(name = "FRACAOSEPARACAO", precision = 20, scale = 8)
    private BigDecimal fracaoseparacao;

    @Column(name = "FATORTRANSF", precision = 18, scale = 6)
    private BigDecimal fatortransf;

    @Column(name = "TAMANHOLOTEFAB", precision = 18, scale = 6)
    private BigDecimal tamanholotefab;

    @Column(name = "VELOCIDADEESP", precision = 18, scale = 6)
    private BigDecimal velocidadeesp;

    @Column(name = "VELOCIDADEOPERACIONAL", precision = 18, scale = 6)
    private BigDecimal velocidadeoperacional;

    @Column(name = "EFICIENCIAOPERACIONAL", precision = 10, scale = 2)
    private BigDecimal eficienciaoperacional;

    @Column(name = "CODFILIALPRODUTORA", length = 2)
    private String codfilialprodutora;

    @Column(name = "FATORUNFARM")
    private Long fatorunfarm;

    @Column(name = "VOLUMEREC", precision = 20, scale = 8)
    private BigDecimal volumerec;

    @Column(name = "PRAZO")
    private Short prazo;

    @Column(name = "PRAZOENTR")
    private Short prazoentr;

    @Column(name = "CODPRINCIPATIVO")
    private Long codprincipativo;

    @Column(name = "CODPRODSINTEGRA", length = 20)
    private String codprodsintegra;

    @Column(name = "TIPORESTRICAOMED", length = 2)
    private String tiporestricaomed;

    @Column(name = "INFORMACOESTECNICAS", length = 500)
    private String informacoestecnicas;

    @Column(name = "FRETEESPECIAL", length = 1)
    private String freteespecial;

    @Column(name = "DIRFOTOPROD", length = 100)
    private String dirfotoprod;

    @Column(name = "CUSTOREPMC", precision = 18, scale = 6)
    private BigDecimal custorepmc;

    @Column(name = "TIPOMP", length = 2)
    private String tipomp;

    @Column(name = "PESOBRUTOMASTER", precision = 10, scale = 3)
    private BigDecimal pesobrutomaster;

    @Column(name = "PESOLIQMASTER", precision = 10, scale = 3)
    private BigDecimal pesoliqmaster;

    @Column(name = "PCKROTATIVO", length = 1)
    private String pckrotativo;

    @Column(name = "PRAZOEXPURGO")
    private Short prazoexpurgo;

    @Column(name = "NUMULTEXPURGO")
    private Long numultexpurgo;

    @Column(name = "DTULTEXPURGO")
    private LocalDate dtultexpurgo;

    @Column(name = "DTPROXEXPURGO")
    private LocalDate dtproxexpurgo;

    @Column(name = "PERCDESC6", precision = 12, scale = 4)
    private BigDecimal percdesc6;

    @Column(name = "PERCDESC7", precision = 12, scale = 4)
    private BigDecimal percdesc7;

    @Column(name = "PERCDESC8", precision = 12, scale = 4)
    private BigDecimal percdesc8;

    @Column(name = "PERCDESC9", precision = 12, scale = 4)
    private BigDecimal percdesc9;

    @Column(name = "PERCDESC10", precision = 12, scale = 4)
    private BigDecimal percdesc10;

    @Column(name = "NUMORIGINAL", length = 20)
    private String numoriginal;

    @Column(name = "DEPOSITOCX")
    private Short depositocx;

    @Column(name = "PREDIOCX")
    private Short prediocx;

    @Column(name = "NIVELCX")
    private Short nivelcx;

    @Column(name = "PONTOREPOSICAOCX", precision = 8, scale = 2)
    private BigDecimal pontoreposicaocx;

    @Column(name = "CAPACIDADEPICKINGCX", precision = 8, scale = 2)
    private BigDecimal capacidadepickingcx;

    @Column(name = "DENOMINACAOCOMUNBRASILEIRA", length = 10)
    private String denominacaocomunbrasileira;

    @Column(name = "PERCTOLERANCIAVAL", precision = 6, scale = 3)
    private BigDecimal perctoleranciaval;

    @Column(name = "DESCRICAO5", length = 45)
    private String descricao5;

    @Column(name = "DESCRICAO6", length = 45)
    private String descricao6;

    @Column(name = "DESCRICAO7", length = 45)
    private String descricao7;

    @Column(name = "CUSTOPROXIMACOMPRA", precision = 18, scale = 6)
    private BigDecimal custoproximacompra;

    @Column(name = "CODDISTRIB", length = 4)
    private String coddistrib;

    @Column(name = "ABASTEPALETE", length = 1)
    private String abastepalete;

    @Column(name = "ABASTEPALETECX", length = 1)
    private String abastepaletecx;

    @Column(name = "FRACIONADO", length = 1)
    private String fracionado;

    @Column(name = "MEDCODFUNCLIBVENDA")
    private Integer medcodfunclibvenda;

    @Column(name = "MEDDTLIBVENDA")
    private LocalDate meddtlibvenda;

    @Column(name = "CODNESTLETERCEIROS", length = 15)
    private String codnestleterceiros;

    @Column(name = "FATORCONVERSAONESTLE", precision = 10, scale = 6)
    private BigDecimal fatorconversaonestle;

    @Column(name = "PERCVENDA", precision = 5, scale = 2)
    private BigDecimal percvenda;

    @Column(name = "CONFAZ", length = 1)
    private String confaz;

    @Column(name = "MULTIPLO2", precision = 18, scale = 6)
    private BigDecimal multiplo2;

    @Column(name = "ANVISANUMREGMED", length = 20)
    private String anvisanumregmed;

    @Column(name = "ANVISAQTEMBALAGEM")
    private Integer anvisaqtembalagem;

    @Column(name = "ANVISAFORMAFARM", length = 20)
    private String anvisaformafarm;

    @Column(name = "ANVISAVIAADM", length = 20)
    private String anvisaviaadm;

    @Column(name = "ANVISACLASTERAPEUTICA", length = 40)
    private String anvisaclasterapeutica;

    @Column(name = "ANVISAUSOCONTINUO", length = 1)
    private String anvisausocontinuo;

    @Column(name = "ANVISACAPINSTAL")
    private Long anvisacapinstal;

    @Column(name = "ANVISACONCEN", precision = 10, scale = 2)
    private BigDecimal anvisaconcen;

    @Column(name = "ANVISAUNDOSAG", length = 3)
    private String anvisaundosag;

    @Column(name = "ANVISANUMPRINCAT")
    private Short anvisanumprincat;

    @Column(name = "ANVISADESCPRINCAT1", length = 100)
    private String anvisadescprincat1;

    @Column(name = "ANVISADESCPRINCAT2", length = 100)
    private String anvisadescprincat2;

    @Column(name = "ANVISADESCPRINCAT3", length = 100)
    private String anvisadescprincat3;

    @Column(name = "ANVISADESCPRINCAT4", length = 100)
    private String anvisadescprincat4;

    @Column(name = "ANVISACOEFTEC", length = 20)
    private String anvisacoeftec;

    @Column(name = "ANVISAUNCOEFTEC", length = 3)
    private String anvisauncoeftec;

    @Column(name = "PAISORIGEM", length = 40)
    private String paisorigem;

    @Column(name = "TIPOEMBALAGEMNESTLE")
    private Short tipoembalagemnestle;

    @Column(name = "CODENDERECOAP")
    private Long codenderecoap;

    @Column(name = "CODENDERECOCX")
    private Long codenderecocx;

    @Column(name = "CUSTOREPZFM", precision = 18, scale = 6)
    private BigDecimal custorepzfm;

    @Column(name = "CUSTOREPZFMTAB", precision = 18, scale = 6)
    private BigDecimal custorepzfmtab;

    @Column(name = "PRECOMAXCONSUMZFM", precision = 18, scale = 6)
    private BigDecimal precomaxconsumzfm;

    @Column(name = "PRECOMAXCONSUMZFMTAB", precision = 18, scale = 6)
    private BigDecimal precomaxconsumzfmtab;

    @Column(name = "MEXIVA", precision = 10, scale = 6)
    private BigDecimal mexiva;

    @Column(name = "MEXIEPS", precision = 10, scale = 6)
    private BigDecimal mexieps;

    @Column(name = "MEXFPGC", precision = 10, scale = 6)
    private BigDecimal mexfpgc;

    @Column(name = "USACROSS", length = 1)
    private String usacross;

    @Column(name = "USAWMS", length = 1)
    private String usawms;

    @Column(name = "CODGENEROFISCAL")
    private Integer codgenerofiscal;

    @Column(name = "QTMAXGONDULA")
    private Integer qtmaxgondula;

    @Column(name = "QTMINGONDULA")
    private Integer qtmingondula;

    @Column(name = "UTILIZARVASILHAME", length = 1)
    private String utilizarvasilhame;

    @Column(name = "CODVASILHAME")
    private Integer codvasilhame;

    @Column(name = "NUMSEQATU")
    private Long numseqatu;

    @Column(name = "TIPOEMBALAGE", length = 2)
    private String tipoembalage;

    @Column(name = "TIPOCARGA")
    private Short tipocarga;

    @Column(name = "ALIQAVULSADARE", precision = 5, scale = 2)
    private BigDecimal aliqavulsadare;

    @Column(name = "PERCBASEREDENT", precision = 10, scale = 4)
    private BigDecimal percbaseredent;

    @Column(name = "VLIPIPORKG", precision = 18, scale = 6)
    private BigDecimal vlipiporkg;

    @Column(name = "TIPOPISCOFINSRETIDO")
    private Short tipopiscofinsretido;

    @Column(name = "ESPECIFICOATIVIDADEPR", length = 1)
    private String especificoatividadepr;

    @Column(name = "CODROTINAULTALTER")
    private Integer codrotinaultalter;

    @Column(name = "COMISSAOPORLUCRATIVIDADE", length = 1)
    private String comissaoporlucratividade;

    @Column(name = "VLIPIPESO", precision = 12, scale = 4)
    private BigDecimal vlipipeso;

    @Column(name = "TIPOCOMISSAO", length = 1)
    private String tipocomissao;

    @Column(name = "TIPOESTOQUE", length = 2)
    private String tipoestoque;

    @Column(name = "PESOPECA", precision = 20, scale = 8)
    private BigDecimal pesopeca;

    @Column(name = "RESTRICAOTRANSP", length = 1)
    private String restricaotransp;

    @Column(name = "CODPRAZOENT", length = 4)
    private String codprazoent;

    @Column(name = "QTMETROS", precision = 18, scale = 6)
    private BigDecimal qtmetros;

    @Column(name = "PESOPALETE", precision = 10, scale = 6)
    private BigDecimal pesopalete;

    @Column(name = "CODENDERECOAL")
    private Long codenderecoal;

    @Column(name = "VALIDARLOTE", length = 1)
    private String validarlote;

    @Column(name = "CODGRADE")
    private Long codgrade;

    @Column(name = "CODCOR")
    private Long codcor;

    @Column(name = "COLUNAGRADE")
    private Short colunagrade;

    @Column(name = "ISENTOREGMS", length = 2)
    private String isentoregms;

    @Column(name = "REGMS", length = 20)
    private String regms;

    @Column(name = "CODFISCALBONIFIC")
    private Long codfiscalbonific;

    @Column(name = "CODFISCALSR")
    private Long codfiscalsr;

    @Column(name = "CUSTOREPANT", precision = 18, scale = 6)
    private BigDecimal custorepant;

    @Column(name = "ESTOQUEPORLOTE", length = 1)
    private String estoqueporlote;

    @Column(name = "PROXNUMLOTE")
    private Integer proxnumlote;

    @Column(name = "CONTROLAVALIDADEDOLOTE", length = 1)
    private String controlavalidadedolote;

    @Column(name = "PREFIXOLOTE", length = 5)
    private String prefixolote;

    @Column(name = "PRAZOMEDIOVENDA")
    private Integer prazomediovenda;

    @Column(name = "PERCCREDICMPRESUMIDO", precision = 12, scale = 4)
    private BigDecimal perccredicmpresumido;

    @Column(name = "PONTOREPOSICAOAL", precision = 8, scale = 2)
    private BigDecimal pontoreposicaoal;

    @Column(name = "CAPACIDADEPICKINGAL", precision = 8, scale = 2)
    private BigDecimal capacidadepickingal;

    @Column(name = "TIPONORMA", length = 1)
    private String tiponorma;

    @Column(name = "RECMINARM")
    private Short recminarm;

    @Column(name = "REDBASEIVA", precision = 18, scale = 6)
    private BigDecimal redbaseiva;

    @Column(name = "REDBASEALIQEXT", precision = 18, scale = 6)
    private BigDecimal redbasealiqext;

    @Column(name = "QTMINIMAATACADO")
    private Integer qtminimaatacado;

    @Column(name = "QTMINIMAATACADOF")
    private Integer qtminimaatacadof;

    @Column(name = "CONCILIAIMPORTACAO", length = 1)
    private String conciliaimportacao;

    @Column(name = "PERCBONOUTRAS", precision = 18, scale = 6)
    private BigDecimal percbonoutras;

    @Column(name = "PERCIMPORTACAO", precision = 12, scale = 4)
    private BigDecimal percimportacao;

    @Column(name = "PERCOFINSIMP", precision = 8, scale = 2)
    private BigDecimal percofinsimp;

    @Column(name = "PERPISIMP", precision = 8, scale = 2)
    private BigDecimal perpisimp;

    @Column(name = "VLMAODEOBRA", precision = 12, scale = 6)
    private BigDecimal vlmaodeobra;

    @Column(name = "PCOMPROF1", precision = 6, scale = 2)
    private BigDecimal pcomprof1;

    @Column(name = "CODRISCO", length = 4)
    private String codrisco;

    @Column(name = "CODACONDICIONAMENTO", length = 4)
    private String codacondicionamento;

    @Column(name = "CONFERENOCHECKOUT", length = 1)
    private String conferenocheckout;

    @Column(name = "VLCALORICO", length = 100)
    private String vlcalorico;

    @Column(name = "PROTEINA", length = 100)
    private String proteina;

    @Column(name = "LIPIDEO", length = 100)
    private String lipideo;

    @Column(name = "UMIDADE", length = 100)
    private String umidade;

    @Column(name = "COL95", length = 100)
    private String col95;

    @Column(name = "SALMONELA", length = 100)
    private String salmonela;

    @Column(name = "BOLORESLEVEDURAS", length = 100)
    private String boloresleveduras;

    @Column(name = "ESTFAUREAUS", length = 100)
    private String estfaureaus;

    @Column(name = "MOFADO", length = 100)
    private String mofado;

    @Column(name = "TOTDEFEITO", length = 100)
    private String totdefeito;

    @Column(name = "CODAGRUPMAPASEP", length = 2)
    private String codagrupmapasep;

    @Column(name = "PERCPERDAKG", precision = 12, scale = 4)
    private BigDecimal percperdakg;

    @Column(name = "APROVEITACREDICMS", length = 1)
    private String aproveitacredicms;

    @Column(name = "APROVEITACREDPISCOFINS", length = 1)
    private String aproveitacredpiscofins;

    @Column(name = "CUSTOFORNEC", precision = 12, scale = 6)
    private BigDecimal custofornec;

    @Column(name = "PERCDESCICMS", precision = 12, scale = 6)
    private BigDecimal percdescicms;

    @Column(name = "PERCACRES", precision = 12, scale = 6)
    private BigDecimal percacres;

    @Column(name = "PTABELAFORNEC", precision = 12, scale = 6)
    private BigDecimal ptabelafornec;

    @Column(name = "CHECARMULTIPLOVENDABNF", length = 1)
    private String checarmultiplovendabnf;

    @Column(name = "VLICMSANTECIPADO", precision = 18, scale = 6)
    private BigDecimal vlicmsantecipado;

    @Column(name = "CLASSECOMISSAO", length = 2)
    private String classecomissao;

    @Column(name = "FRACAOCIPA")
    private Integer fracaocipa;

    @Column(name = "ANALISEDESC", length = 100)
    private String analisedesc;

    @Column(name = "VOLPESMED", length = 100)
    private String volpesmed;

    @Column(name = "PH", length = 100)
    private String ph;

    @Column(name = "DENSIDADE", length = 100)
    private String densidade;

    @Column(name = "DOSEAMENTO", length = 100)
    private String doseamento;

    @Column(name = "CONTMICROBIANA", length = 100)
    private String contmicrobiana;

    @Column(name = "IDENTIFICACAO", length = 100)
    private String identificacao;

    @Column(name = "IMPUREZA", length = 100)
    private String impureza;

    @Column(name = "FRIABILIDADE", length = 100)
    private String friabilidade;

    @Column(name = "DESINTEGRACAO", length = 100)
    private String desintegracao;

    @Column(name = "DISSOLUCAO", length = 100)
    private String dissolucao;

    @Column(name = "UNIFORMIDADE", length = 100)
    private String uniformidade;

    @Column(name = "DIRASSINATURA", length = 140)
    private String dirassinatura;

    @Column(name = "VERSANALISE")
    private Integer versanalise;

    @Column(name = "CONTLOGANALISE")
    private Integer contloganalise;

    @Column(name = "PESQPATOGENOS", length = 100)
    private String pesqpatogenos;

    @Column(name = "USAPULMAOREGULADOR", length = 1)
    private String usapulmaoregulador;

    @Column(name = "QTPULMAOREGULADOR")
    private Short qtpulmaoregulador;

    @Column(name = "CODENDERECOPA")
    private Long codenderecopa;

    @Column(name = "CAPACIDADEPA", precision = 8, scale = 2)
    private BigDecimal capacidadepa;

    @Column(name = "PONTOREPOSICAOPA", precision = 8, scale = 2)
    private BigDecimal pontoreposicaopa;

    @Column(name = "DESTAQUEFICHATECNICA", length = 1)
    private String destaquefichatecnica;

    @Column(name = "NUMPAG")
    private Short numpag;

    @Column(name = "LETRAPAGINA", length = 1)
    private String letrapagina;

    @Column(name = "SEQPAGINA")
    private Short seqpagina;

    @Column(name = "CODONU", length = 4)
    private String codonu;

    @Column(name = "NATUREZAPRODUTO", length = 2)
    private String naturezaproduto;

    @Column(name = "DATAVOCOLLECT")
    private LocalDate datavocollect;

    @Column(name = "PERCICMSFRETEFOBST", precision = 12, scale = 4)
    private BigDecimal percicmsfretefobst;

    @Column(name = "PERCICMSFRETEFOBSTBCR", precision = 12, scale = 4)
    private BigDecimal percicmsfretefobstbcr;

    @Column(name = "PERCIPIVENDATAB", precision = 10, scale = 2)
    private BigDecimal percipivendatab;

    @Column(name = "VLPAUTAIPIVENDA", precision = 18, scale = 6)
    private BigDecimal vlpautaipivenda;

    @Column(name = "VLPAUTAIPIVENDATAB", precision = 18, scale = 6)
    private BigDecimal vlpautaipivendatab;

    @Column(name = "VLIPIPORKGVENDA", precision = 18, scale = 6)
    private BigDecimal vlipiporkgvenda;

    @Column(name = "VLIPIPORKGVENDATAB", precision = 18, scale = 6)
    private BigDecimal vlipiporkgvendatab;

    @Column(name = "CODFISCALENTTRANSF")
    private Short codfiscalenttransf;

    @Column(name = "PRAZOMINVALIDADE", precision = 5, scale = 2)
    private BigDecimal prazominvalidade;

    @Column(name = "PRAZOMAXVALIDADE", precision = 5, scale = 2)
    private BigDecimal prazomaxvalidade;

    @Column(name = "CODPRODEMBALAGEM")
    private Integer codprodembalagem;

    @Column(name = "CONSIDERARICMSANTECIPCUSTO", length = 1)
    private String consideraricmsantecipcusto;

    @Column(name = "PERCOFINS", precision = 12, scale = 4)
    private BigDecimal percofins;

    @Column(name = "PERCREDICMS", precision = 12, scale = 4)
    private BigDecimal percredicms;

    @Column(name = "DTIMPORTINTEGRACAO")
    private LocalDate dtimportintegracao;

    @Column(name = "DTULTALTER")
    private LocalDate dtultalter;

    @Column(name = "UMIDADEANALISE", length = 100)
    private String umidadeanalise;

    @Column(name = "PERCDIFERENCAKGFRIO", precision = 12, scale = 4)
    private BigDecimal percdiferencakgfrio;

    @Column(name = "REDBASEALIQEXTBCR", precision = 18, scale = 6)
    private BigDecimal redbasealiqextbcr;

    @Column(name = "PERCALIQEXTBCR", precision = 12, scale = 4)
    private BigDecimal percaliqextbcr;

    @Column(name = "PERCALIQINTBCR", precision = 12, scale = 4)
    private BigDecimal percaliqintbcr;

    @Column(name = "VLADICIONALBCSTBCR", precision = 18, scale = 6)
    private BigDecimal vladicionalbcstbcr;

    @Column(name = "VLPAUTABCR", precision = 18, scale = 6)
    private BigDecimal vlpautabcr;

    @Column(name = "REDBASEIVABCR", precision = 18, scale = 6)
    private BigDecimal redbaseivabcr;

    @Column(name = "PERCIVABCR", precision = 10, scale = 2)
    private BigDecimal percivabcr;

    @Column(name = "CALCCREDIPI", length = 1)
    private String calccredipi;

    @Column(name = "ENVIARFORCAVENDAS", length = 1)
    private String enviarforcavendas;

    @Lob
    @Column(name = "DADOSTECNICOS")
    private String dadostecnicos;

    @Column(name = "PERCIMPPRODUTORURAL", precision = 12, scale = 4)
    private BigDecimal percimpprodutorural;

    @Column(name = "UTILIZAPRECOMAXCONSUMIDOR", length = 1)
    private String utilizaprecomaxconsumidor;

    @Column(name = "PERCICMSDIFERIDO", precision = 8, scale = 4)
    private BigDecimal percicmsdiferido;

    @Column(name = "PESOEMBALAGEM", precision = 14, scale = 7)
    private BigDecimal pesoembalagem;

    @Column(name = "EX_DOSEAMENTO", length = 1)
    private String exDoseamento;

    @Column(name = "EX_IMPUREZA", length = 1)
    private String exImpureza;

    @Column(name = "MARCA", length = 20)
    private String marca;

    @Column(name = "PRAZOGARANTIA")
    private Integer prazogarantia;

    @Column(name = "CONTROLANUMSERIA", length = 1)
    private String controlanumseria;

    @Column(name = "PVENDA", precision = 24, scale = 6)
    private BigDecimal pvenda;

    @Column(name = "DTULTALTERSRVPRC")
    private LocalDate dtultaltersrvprc;

    @Column(name = "EX_UMIDADE", length = 1)
    private String exUmidade;

    @Column(name = "EX_COL95", length = 1)
    private String exCol95;

    @Column(name = "EX_SALMONELA", length = 1)
    private String exSalmonela;

    @Column(name = "EX_BOLORESLEVEDURAS", length = 1)
    private String exBoloresleveduras;

    @Column(name = "EX_ESTFAUREAUS", length = 1)
    private String exEstfaureaus;

    @Column(name = "EX_MOFADO", length = 1)
    private String exMofado;

    @Column(name = "EX_TOTDEFEITO", length = 1)
    private String exTotdefeito;

    @Column(name = "EX_VLCALORICO", length = 1)
    private String exVlcalorico;

    @Column(name = "EX_PROTEINA", length = 1)
    private String exProteina;

    @Column(name = "EX_LIPIDEO", length = 1)
    private String exLipideo;

    @Column(name = "EX_VOLPESMED", length = 1)
    private String exVolpesmed;

    @Column(name = "EX_ANALISEDESC", length = 1)
    private String exAnalisedesc;

    @Column(name = "EX_UNIFORMIDADE", length = 1)
    private String exUniformidade;

    @Column(name = "EX_DISSOLUCAO", length = 1)
    private String exDissolucao;

    @Column(name = "EX_DESINTEGRACAO", length = 1)
    private String exDesintegracao;

    @Column(name = "EX_FRIABILIDADE", length = 1)
    private String exFriabilidade;

    @Column(name = "EX_IDENTIFICACAO", length = 1)
    private String exIdentificacao;

    @Column(name = "EX_PESQPATOGENOS", length = 1)
    private String exPesqpatogenos;

    @Column(name = "EX_CONTMICROBIANA", length = 1)
    private String exContmicrobiana;

    @Column(name = "EX_DENSIDADE", length = 1)
    private String exDensidade;

    @Column(name = "EX_PH", length = 1)
    private String exPh;

    @Column(name = "UNDPOREMBALAGEM", precision = 8, scale = 2)
    private BigDecimal undporembalagem;

    @Column(name = "PERCDESPFORANF", precision = 12, scale = 4)
    private BigDecimal percdespforanf;

    @Column(name = "PRAZOMAXINDENIZACAO")
    private Short prazomaxindenizacao;

    @Column(name = "CODFILIALRETIRA", length = 2)
    private String codfilialretira;

    @Column(name = "CODMARCA")
    private Integer codmarca;

    @Column(name = "CODFISCALCONSIGFAT")
    private Long codfiscalconsigfat;

    @Column(name = "PERCDIFALIQUOTAS", precision = 8, scale = 4)
    private BigDecimal percdifaliquotas;

    @Column(name = "VLDIFALIQUOTAS", precision = 18, scale = 6)
    private BigDecimal vldifaliquotas;

    @Column(name = "PESOVARIAVEL", length = 1)
    private String pesovariavel;

    @Column(name = "VLPAUTAICMS", precision = 18, scale = 6)
    private BigDecimal vlpautaicms;

    @Column(name = "VLADICIONALBCST", precision = 18, scale = 6)
    private BigDecimal vladicionalbcst;

    @Column(name = "COMPRACONSIGNADO", length = 1)
    private String compraconsignado;

    @Column(name = "CODFISCALCONSIG")
    private Long codfiscalconsig;

    @Column(name = "CONTROLANUMSERIE", length = 1)
    private String controlanumserie;

    @Column(name = "QTDEMAXSEPARPEDIDO")
    private Short qtdemaxseparpedido;

    @Column(name = "IMUNETRIB", length = 1)
    private String imunetrib;

    @Column(name = "CODFORMATOPAPEL")
    private Integer codformatopapel;

    @Column(name = "GRAMATURA", precision = 7, scale = 3)
    private BigDecimal gramatura;

    @Column(name = "CODUNIDMEDIDANF")
    private Short codunidmedidanf;

    @Column(name = "FATORCONVERSAOKG", precision = 14, scale = 3)
    private BigDecimal fatorconversaokg;

    @Column(name = "DESCPAPEL", length = 60)
    private String descpapel;

    @Column(name = "PRECIFICESTRANGEIRA", length = 1)
    private String precificestrangeira;

    @Column(name = "PERCSEGURO", precision = 14, scale = 4)
    private BigDecimal percseguro;

    @Column(name = "PERCDESPDENTRONF", precision = 14, scale = 4)
    private BigDecimal percdespdentronf;

    @Column(name = "QTDMAXSEPARARPEDIDO")
    private Short qtdmaxsepararpedido;

    @Column(name = "NUMDIASVALIDADEMIN")
    private Integer numdiasvalidademin;

    @Column(name = "CODPRODRELEV")
    private Long codprodrelev;

    @Column(name = "DTALTCUSTOFORNEC")
    private LocalDate dtaltcustofornec;

    @Column(name = "CONTROLAPATRIMONIO", length = 1)
    private String controlapatrimonio;

    @Column(name = "FUNDAPIANO", length = 1)
    private String fundapiano;

    @Column(name = "PERCDESCICMSDIF", precision = 8, scale = 4)
    private BigDecimal percdescicmsdif;

    @Column(name = "CODPRODDNF")
    private Short codproddnf;

    @Column(name = "CAPVOLDNF")
    private Integer capvoldnf;

    @Column(name = "FATORCONVDNF", precision = 18, scale = 6)
    private BigDecimal fatorconvdnf;

    @Column(name = "PERCALIQEXTGUIA", precision = 12, scale = 4)
    private BigDecimal percaliqextguia;

    @Column(name = "PISRETIDO", precision = 5, scale = 2)
    private BigDecimal pisretido;

    @Column(name = "COFINSRETIDO", precision = 5, scale = 2)
    private BigDecimal cofinsretido;

    @Column(name = "IRRETIDO", precision = 5, scale = 2)
    private BigDecimal irretido;

    @Column(name = "CSLLRETIDO", precision = 5, scale = 2)
    private BigDecimal csllretido;

    @Column(name = "EXTIPI", length = 3)
    private String extipi;

    @Column(name = "BASEPISCOFINSLITRAGEM", precision = 18, scale = 6)
    private BigDecimal basepiscofinslitragem;

    @Column(name = "VALORPISLITRAGEM", precision = 18, scale = 6)
    private BigDecimal valorpislitragem;

    @Column(name = "VALORCOFINSLITRAGEM", precision = 18, scale = 6)
    private BigDecimal valorcofinslitragem;

    @Column(name = "INVENTARIOPARCIAL", length = 1)
    private String inventarioparcial;

    @Column(name = "ANVISA", length = 20)
    private String anvisa;

    @Column(name = "SIMPRO", length = 20)
    private String simpro;

    @Column(name = "VLRAPLICINT", precision = 18, scale = 6)
    private BigDecimal vlraplicint;

    @Column(name = "SUGVENDA")
    private Short sugvenda;

    @Column(name = "VLPAUTAPISCOFINS", precision = 18, scale = 6)
    private BigDecimal vlpautapiscofins;

    @Column(name = "USAPISCOFINSLIT", length = 1)
    private String usapiscofinslit;

    @Column(name = "BASEPISCOFINSLIT", precision = 18, scale = 6)
    private BigDecimal basepiscofinslit;

    @Column(name = "VLPISLIT", precision = 18, scale = 6)
    private BigDecimal vlpislit;

    @Column(name = "VLCOFINSLIT", precision = 18, scale = 6)
    private BigDecimal vlcofinslit;

    @Column(name = "VLPAUTAPISCOFINSIMP", precision = 18, scale = 6)
    private BigDecimal vlpautapiscofinsimp;

    @Column(name = "USAPISCOFINSLITIMP", length = 1)
    private String usapiscofinslitimp;

    @Column(name = "BASEPISCOFINSLITIMP", precision = 18, scale = 6)
    private BigDecimal basepiscofinslitimp;

    @Column(name = "VLPISLITIMP", precision = 18, scale = 6)
    private BigDecimal vlpislitimp;

    @Column(name = "VLCOFINSLITIMP", precision = 18, scale = 6)
    private BigDecimal vlcofinslitimp;

    @Column(name = "CODSITTRIBPISCOFINS")
    private Short codsittribpiscofins;

    @Column(name = "ROTINALANC", length = 48)
    private String rotinalanc;

    @Column(name = "VLFRETEPORKG", precision = 18, scale = 6)
    private BigDecimal vlfreteporkg;

    @Column(name = "CODTRIBPISCOFINS")
    private Short codtribpiscofins;

    @Column(name = "PERCMVAORIG", precision = 12, scale = 4)
    private BigDecimal percmvaorig;

    @Column(name = "ASSINATURA")
    private String assinatura;

    @Column(name = "APLICREDBASEIVAPLIQ", length = 1)
    private String aplicredbaseivapliq;

    @Column(name = "APLICREDBASEIVAPLIQBCR", length = 1)
    private String aplicredbaseivapliqbcr;

    @Column(name = "DTINICONTLOTE")
    private LocalDate dtinicontlote;

    @Column(name = "CLASSEFLOW", length = 6)
    private String classeflow;

    @Column(name = "CONCENTRACAO")
    private Integer concentracao;

    @Column(name = "VLIPI", precision = 18, scale = 6)
    private BigDecimal vlipi;

    @Column(name = "SITTRIBUTDEVFORNEC", length = 3)
    private String sittributdevfornec;

    @Column(name = "CODFISCALDEVFORNEC")
    private Integer codfiscaldevfornec;

    @Column(name = "PRAZOMAXVENDA")
    private Integer prazomaxvenda;

    @Column(name = "CATERGORIA", length = 2)
    private String catergoria;

    @Column(name = "CODLINHA")
    private Integer codlinha;

    @Column(name = "PERCQUEBRAPRODUCAO", precision = 18, scale = 6)
    private BigDecimal percquebraproducao;

    @Column(name = "PERMITEPRODUCAO", length = 1)
    private String permiteproducao;

    @Column(name = "LINHAPROD")
    private Integer linhaprod;

    @Column(name = "QTPRODUZIR", precision = 18, scale = 6)
    private BigDecimal qtproduzir;

    @Column(name = "APLICPERCIVAPAUTA", length = 1)
    private String aplicpercivapauta;

    @Column(name = "CODFISCALENTTV9")
    private Integer codfiscalenttv9;

    @Column(name = "LITRAGEM", precision = 18, scale = 6)
    private BigDecimal litragem;

    @Column(name = "NOMEECOMMERCE", length = 200)
    private String nomeecommerce;

    @Column(name = "TITULOECOMMERCE", length = 200)
    private String tituloecommerce;

    @Column(name = "SUBTITULOECOMMERCE", length = 200)
    private String subtituloecommerce;

    @Column(name = "DIRETORIOFOTOS", length = 200)
    private String diretoriofotos;

    @Column(name = "DTEXPORTACAOWMS")
    private LocalDate dtexportacaowms;

    @Column(name = "DTIMPORTACAOWMS")
    private LocalDate dtimportacaowms;

    @Column(name = "CODNCMEX", length = 20)
    private String codncmex;

    @Column(name = "CODLINHANESTLE")
    private Short codlinhanestle;

    @Column(name = "GTINCODAUXILIAR")
    private Short gtincodauxiliar;

    @Column(name = "GTINCODAUXILIAR2")
    private Short gtincodauxiliar2;

    @Column(name = "CODSITTRIBPISCOFINSDEV")
    private Short codsittribpiscofinsdev;

    @Column(name = "SITTRIBUTENT", length = 3)
    private String sittributent;

    @Column(name = "SITTRIBUTDEV", length = 3)
    private String sittributdev;

    @Column(name = "GERAICMSLIVROFISCALDEVFORNEC", length = 1)
    private String geraicmslivrofiscaldevfornec;

    @Column(name = "SUBSTANCIA", length = 10)
    private String substancia;

    @Column(name = "CODTABLIT", length = 2)
    private String codtablit;

    @Column(name = "CODGRULIT", length = 2)
    private String codgrulit;

    @Column(name = "IPIPORVALOR", length = 1)
    private String ipiporvalor;

    @Column(name = "PERCCARGATRIBMEDIA", precision = 18, scale = 6)
    private BigDecimal perccargatribmedia;

    @Column(name = "CODLINHAPRAZO")
    private Integer codlinhaprazo;

    @Column(name = "VLPAUTAICMSANTEC", precision = 18, scale = 6)
    private BigDecimal vlpautaicmsantec;

    @Column(name = "ATUPESOMASTERENT", length = 1)
    private String atupesomasterent;

    @Column(name = "NUMCASASDECREDUCAOICMS")
    private Short numcasasdecreducaoicms;

    @Column(name = "CODDEPTOWEB")
    private Long coddeptoweb;

    @Column(name = "CODSECAOWEB")
    private Long codsecaoweb;

    @Column(name = "CODCATEGORIAWEB")
    private Long codcategoriaweb;

    @Column(name = "CODSUBCATEGORIAWEB")
    private Long codsubcategoriaweb;

    @Column(name = "CUSTOREPTABANT", precision = 18, scale = 6)
    private BigDecimal custoreptabant;

    @Column(name = "CUSTOREPZFMANT", precision = 18, scale = 6)
    private BigDecimal custorepzfmant;

    @Column(name = "PRECOMAXCONSUMTABANT", precision = 18, scale = 6)
    private BigDecimal precomaxconsumtabant;

    @Column(name = "PRECOMAXCONSUMZFMANT", precision = 18, scale = 6)
    private BigDecimal precomaxconsumzfmant;

    @Column(name = "OSCOMODATO", length = 1)
    private String oscomodato;

    @Column(name = "OBRIGAPREENCCONTRATO", length = 1)
    private String obrigapreenccontrato;

    @Column(name = "GERAOSAUTOMATIC", length = 1)
    private String geraosautomatic;

    @Column(name = "NUMSERVICO")
    private Integer numservico;

    @Column(name = "RESTRINGECOTACAO", length = 1)
    private String restringecotacao;

    @Column(name = "TIPOMEDICAMENTO", length = 1)
    private String tipomedicamento;

    @Column(name = "GRUPOFATURAMENTO", length = 1)
    private String grupofaturamento;

    @Column(name = "USAPMCBASEST", length = 1)
    private String usapmcbasest;

    @Column(name = "PERCREDPMC", precision = 12, scale = 4)
    private BigDecimal percredpmc;

    @Column(name = "ENVIAINFTECNICANFE", length = 1)
    private String enviainftecnicanfe;

    @Column(name = "CONTROLADOIBAMA", length = 1)
    private String controladoibama;

    @Column(name = "CESTABASICALEGIS", length = 1)
    private String cestabasicalegis;

    @Column(name = "CODINTERNO", length = 20)
    private String codinterno;

    @Column(name = "APLICACOES", length = 500)
    private String aplicacoes;

    @Column(name = "CODUSUULTALTCOM")
    private Integer codusuultaltcom;

    @Column(name = "UTILIZASELO", length = 1)
    private String utilizaselo;

    @Column(name = "CALCCREDIPICONT", length = 1)
    private String calccredipicont;

    @Column(name = "APROVEITACREDICMSCONT", length = 1)
    private String aproveitacredicmscont;

    @Column(name = "APROVEITACREDPISCOFINSCONT", length = 1)
    private String aproveitacredpiscofinscont;

    @Column(name = "QTMINSUGCOMPRA", precision = 22, scale = 8)
    private BigDecimal qtminsugcompra;

    @Column(name = "SITTRIBUT_SERVICO", length = 3)
    private String sittributServico;

    @Column(name = "PERCOFINS_SERVICO", precision = 12, scale = 4)
    private BigDecimal percofinsServico;

    @Column(name = "PERPIS_SERVICO", precision = 12, scale = 4)
    private BigDecimal perpisServico;

    @Column(name = "FATORCONVTRIB", precision = 12, scale = 6)
    private BigDecimal fatorconvtrib;

    @Column(name = "UNIDADETRIB", length = 6)
    private String unidadetrib;

    @Column(name = "VLIPISUSPENSO", precision = 18, scale = 6)
    private BigDecimal vlipisuspenso;

    @Column(name = "PERCIPISUSPENSO", precision = 12, scale = 4)
    private BigDecimal percipisuspenso;

    @Column(name = "STATUSSUCATA")
    private Boolean statussucata;

    @Column(name = "MYFROTA", length = 1)
    private String myfrota;

    @Column(name = "CODSITTRIBST", length = 2)
    private String codsittribst;

    @Column(name = "PERCICMSBASEICMSANTECIPADO", precision = 12, scale = 4)
    private BigDecimal percicmsbaseicmsantecipado;

    @Column(name = "PERCDESC1TAB", precision = 12, scale = 4)
    private BigDecimal percdesc1tab;

    @Column(name = "PERCDESC2TAB", precision = 12, scale = 4)
    private BigDecimal percdesc2tab;

    @Column(name = "PERCDESC3TAB", precision = 12, scale = 4)
    private BigDecimal percdesc3tab;

    @Column(name = "PERCDESC4TAB", precision = 12, scale = 4)
    private BigDecimal percdesc4tab;

    @Column(name = "PERCDESC5TAB", precision = 12, scale = 4)
    private BigDecimal percdesc5tab;

    @Column(name = "PERCDESC6TAB", precision = 12, scale = 4)
    private BigDecimal percdesc6tab;

    @Column(name = "PERCDESC7TAB", precision = 12, scale = 4)
    private BigDecimal percdesc7tab;

    @Column(name = "PERCDESC8TAB", precision = 12, scale = 4)
    private BigDecimal percdesc8tab;

    @Column(name = "PERCDESC9TAB", precision = 12, scale = 4)
    private BigDecimal percdesc9tab;

    @Column(name = "PERCDESC10TAB", precision = 12, scale = 4)
    private BigDecimal percdesc10tab;

    @Column(name = "DTVIGENCIAPOLITICA")
    private LocalDate dtvigenciapolitica;

    @Column(name = "GERABASEPISCOFINSSEMALIQ", length = 1)
    private String gerabasepiscofinssemaliq;

    @Column(name = "USALICENCAIMPORTACAO", length = 1)
    private String usalicencaimportacao;

    @Column(name = "MULTIPLOCOMPRAS", precision = 18, scale = 6)
    private BigDecimal multiplocompras;

    @Column(name = "ENVIASNGPC", length = 1)
    private String enviasngpc;

    @Column(name = "REGISTROMSMED", length = 13)
    private String registromsmed;

    @Column(name = "RETINOICO", length = 1)
    private String retinoico;

    @Column(name = "IDINTEGRACAOMYFROTA")
    private byte[] idintegracaomyfrota;

    @Column(name = "DTULTATUPCOMPRA")
    private LocalDate dtultatupcompra;

    @Column(name = "ANP")
    private Integer anp;

    @Column(name = "CONSIISUSPENSOBASEICMS", length = 1)
    private String consiisuspensobaseicms;

    @Column(name = "CONSIPISUSPENSOBASEICMS", length = 1)
    private String consipisuspensobaseicms;

    @Column(name = "CODUSUULTALTCOMTAB")
    private Integer codusuultaltcomtab;

    @Column(name = "CODROTINAULTALTCOM")
    private Integer codrotinaultaltcom;

    @Column(name = "CODROTINAULTALTCOMTAB")
    private Integer codrotinaultaltcomtab;

    @Column(name = "COMISSAOSERVICOPRESTADO", precision = 12, scale = 2)
    private BigDecimal comissaoservicoprestado;

    @Column(name = "CODPRODFORNEC")
    private Integer codprodfornec;

    @Column(name = "PRECIFICACAOAUTOMATICA", length = 2)
    private String precificacaoautomatica;

    @Column(name = "CODFISCALCOCOMPRA")
    private Integer codfiscalcocompra;

    @Column(name = "CODFISCALCOREMESSA")
    private Integer codfiscalcoremessa;

    @Column(name = "CODTIPOUSOMED")
    private Boolean codtipousomed;

    @Column(name = "CODTIPORECEIT")
    private Boolean codtiporeceit;

    @Column(name = "CUSTOFORNECSEMST", precision = 18, scale = 6)
    private BigDecimal custofornecsemst;

    @Column(name = "CUSTOPROXIMACOMPRASEMST", precision = 18, scale = 6)
    private BigDecimal custoproximacomprasemst;

    @Column(name = "TIPOCUSTOTRANSF", length = 1)
    private String tipocustotransf;

    @Column(name = "CODCLASSETERAPEUTSNGPC")
    private Short codclasseterapeutsngpc;

    @Column(name = "USOPROLONGADOSNGPC", length = 1)
    private String usoprolongadosngpc;

    @Column(name = "CODSUBMARCA")
    private Integer codsubmarca;

    @Column(name = "ALTURA", precision = 10, scale = 4)
    private BigDecimal altura;

    @Column(name = "ALTURATOTAL", precision = 10, scale = 4)
    private BigDecimal alturatotal;

    @Column(name = "IECTEREF", precision = 10, scale = 4)
    private BigDecimal iecteref;

    @Column(name = "DIAMETROINTERNO", precision = 10, scale = 4)
    private BigDecimal diametrointerno;

    @Column(name = "DIAMETROEXTERNO", precision = 10, scale = 4)
    private BigDecimal diametroexterno;

    @Column(name = "DIASCONSECENT")
    private Short diasconsecent;

    @Column(name = "NUMEROSSERIECONTROLADOS")
    private Long numerosseriecontrolados;

    @Column(name = "VALORTARAPORPECA", precision = 18, scale = 6)
    private BigDecimal valortaraporpeca;

    @Column(name = "TARAPORPECA", precision = 18, scale = 6)
    private BigDecimal taraporpeca;

    @Column(name = "FARMACIAPOPULAR", length = 1)
    private String farmaciapopular;

    @Column(name = "PERCPRODEIC", precision = 18, scale = 2)
    private BigDecimal percprodeic;

    @Column(name = "CODPRODANTUTICAD", length = 20)
    private String codprodantuticad;

    @Column(name = "DTINICODPRODANTUTICAD")
    private LocalDate dtinicodprodantuticad;

    @Column(name = "DTPRIMOVNOVCODPROD")
    private LocalDate dtprimovnovcodprod;

    @Column(name = "NUMREGAGRMAP", length = 10)
    private String numregagrmap;

    @Column(name = "IDEMBALAGEM")
    private Long idembalagem;

    @Column(name = "TAMANHOPECA", precision = 10, scale = 4)
    private BigDecimal tamanhopeca;

    @Column(name = "PESOMINIMO", precision = 12, scale = 6)
    private BigDecimal pesominimo;

    @Column(name = "PESOMAXIMO", precision = 12, scale = 6)
    private BigDecimal pesomaximo;

    @Column(name = "DTFINUTICODPRODANTUTICAD")
    private LocalDate dtfinuticodprodantuticad;

    @Column(name = "DSCPRODANTUTICAD", length = 60)
    private String dscprodantuticad;

    @Column(name = "INDUZLOTE", length = 1)
    private String induzlote;

    @Column(name = "NORMAPALETE", length = 10)
    private String normapalete;

    @Column(name = "CODFISCALDEVOPLOG")
    private Integer codfiscaldevoplog;

    @Column(name = "CODFISCALENTOPLOG")
    private Integer codfiscalentoplog;

    @Column(name = "IDDESTAQUE", length = 8)
    private String iddestaque;

    @Column(name = "TIPOEMBARQUEIMP", length = 50)
    private String tipoembarqueimp;

    @Column(name = "PERCBONIFIC", precision = 18, scale = 6)
    private BigDecimal percbonific;

    @Column(name = "VERBADINPORPERC", length = 1)
    private String verbadinporperc;

    @Column(name = "PERCBONTAB", precision = 14, scale = 4)
    private BigDecimal percbontab;

    @Column(name = "VLBONIFICTAB", precision = 18, scale = 6)
    private BigDecimal vlbonifictab;

    @Column(name = "PERCBONIFICTAB", precision = 18, scale = 6)
    private BigDecimal percbonifictab;

    @Column(name = "PERCBONOUTRASTAB", precision = 18, scale = 6)
    private BigDecimal percbonoutrastab;

    @Column(name = "VLADICIONALBCICMSANTECIP", precision = 18, scale = 6)
    private BigDecimal vladicionalbcicmsantecip;

    @Column(name = "APLICPERCIVAPAUTAICMSANTECIP", length = 1)
    private String aplicpercivapautaicmsantecip;

    @Column(name = "PERCICMSFRETEFOBICMSANTECIP", precision = 12, scale = 4)
    private BigDecimal percicmsfretefobicmsantecip;

    @Column(name = "PERCMVAORIGICMSANTECIP", precision = 12, scale = 4)
    private BigDecimal percmvaorigicmsantecip;

    @Column(name = "PERCCARGATRIBMEDIAICMSANTECIP", precision = 18, scale = 6)
    private BigDecimal perccargatribmediaicmsantecip;

    @Column(name = "REDBASEIVAICMSANTECIP", precision = 18, scale = 6)
    private BigDecimal redbaseivaicmsantecip;

    @Column(name = "REDBASEALIQEXTICMSANTECIP", precision = 18, scale = 6)
    private BigDecimal redbasealiqexticmsantecip;

    @Column(name = "CODSALMED")
    private Integer codsalmed;

    @Column(name = "FORMAESTERILIZACAO", length = 500)
    private String formaesterilizacao;

    @Column(name = "CONSIDERARICMSANTECIPCUSTOCONT", length = 1)
    private String consideraricmsantecipcustocont;

    @Column(name = "APLICAPERCREDALIQIPI", length = 1)
    private String aplicapercredaliqipi;

    @Column(name = "GTINCODAUXILIARTRIB")
    private Short gtincodauxiliartrib;

    @Column(name = "CODAUXILIARTRIB")
    private Long codauxiliartrib;

    @Column(name = "VERIFCRAMOATIVCALCST", length = 1)
    private String verifcramoativcalcst;

    @Column(name = "COMODATO", length = 1)
    private String comodato;

    @Column(name = "LINKFABRICANTE", length = 100)
    private String linkfabricante;

    @Column(name = "PERCIISUSPENSO", precision = 8, scale = 4)
    private BigDecimal perciisuspenso;

    @Column(name = "PERPISCALCDI", precision = 8, scale = 4)
    private BigDecimal perpiscalcdi;

    @Column(name = "PERCOFINSCALCDI", precision = 8, scale = 4)
    private BigDecimal percofinscalcdi;

    @Column(name = "ESTOQUEPORDTVALIDADE", length = 1)
    private String estoquepordtvalidade;

    @Column(name = "PESOLIQDI", precision = 12, scale = 6)
    private BigDecimal pesoliqdi;

    @Column(name = "IDINTEGRACAOCIASHOP", length = 250)
    private String idintegracaociashop;

    @Column(name = "ENVIAECOMMERCE", length = 1)
    private String enviaecommerce;

    @Column(name = "COMISSAOSERVICOFUNCIONARIO", precision = 12, scale = 2)
    private BigDecimal comissaoservicofuncionario;

    @Column(name = "REGISTROPECA", length = 15)
    private String registropeca;

    @Column(name = "GERAICMSLIVROFISCALENT", length = 1)
    private String geraicmslivrofiscalent;

    @Column(name = "UTILIZACREDREDPISCOFINS", length = 1)
    private String utilizacredredpiscofins;

    @Column(name = "PRODUSAENGRADADO", length = 1)
    private String produsaengradado;

    @Column(name = "CODPRODENGRADADO")
    private Integer codprodengradado;

    @Column(name = "FATCONVPRODENGRAD", precision = 18, scale = 6)
    private BigDecimal fatconvprodengrad;

    @Column(name = "CODCEST", length = 7)
    private String codcest;

    @Column(name = "CODCESTDEV", length = 7)
    private String codcestdev;

    @Column(name = "PERCENTUALCPRB", precision = 26, scale = 6)
    private BigDecimal percentualcprb;

    @Column(name = "CODIGOCNAE")
    private Long codigocnae;

    @Column(name = "TEMPOSERVICO")
    private Long temposervico;

    @Column(name = "PERCENTUALINCIDENCIA", precision = 26, scale = 6)
    private BigDecimal percentualincidencia;

    @Column(name = "TIPOSERVICOVINCULADORECEITA", length = 9)
    private String tiposervicovinculadoreceita;

    @Column(name = "INCIDENCIACPRB", length = 8)
    private String incidenciacprb;

    @Column(name = "CFOPORIG")
    private Integer cfoporig;

    @Column(name = "MODBCST")
    private Boolean modbcst;

    @Column(name = "MODBCSTGUIA")
    private Boolean modbcstguia;

    @Column(name = "PERMITIRBROKERTV5", length = 1)
    private String permitirbrokertv5;

    @Column(name = "VLFRETE", precision = 18, scale = 6)
    private BigDecimal vlfrete;

    @Column(name = "ANTIDUMPING", length = 1)
    private String antidumping;

    @Column(name = "ENDERECAMENTOCUBAGEM", length = 1)
    private String enderecamentocubagem;

    @Column(name = "DTULTALTCAD")
    private LocalDate dtultaltcad;

    @Column(name = "CODFUNCULTALTCAD")
    private Integer codfuncultaltcad;

    @Column(name = "PERCFUNCEP", precision = 18, scale = 6)
    private BigDecimal percfuncep;

    @Column(name = "PERCFECP", precision = 18, scale = 6)
    private BigDecimal percfecp;

    @Column(name = "PERCCSLL", precision = 18, scale = 6)
    private BigDecimal perccsll;

    @Column(name = "VLIPIPAUTATV10", precision = 18, scale = 6)
    private BigDecimal vlipipautatv10;

    @Column(name = "VLIPIPAUTATV10TAB", precision = 18, scale = 6)
    private BigDecimal vlipipautatv10tab;

    @Column(name = "PESOBRUTOFRETE", precision = 18, scale = 6)
    private BigDecimal pesobrutofrete;

    @Column(name = "CODFISCALREMENTFUT")
    private Long codfiscalrementfut;

    @Column(name = "CODFISCALENTENTFUT")
    private Long codfiscalententfut;

    @Column(name = "SITTRIBUTENTFUT", length = 3)
    private String sittributentfut;

    @Column(name = "LICITUSARCAP", length = 1)
    private String licitusarcap;

    @Column(name = "LICITPERCDESONERACAP", precision = 18, scale = 6)
    private BigDecimal licitpercdesoneracap;

    @Column(name = "USAECOMMERCEUNILEVER", length = 1)
    private String usaecommerceunilever;

    @Column(name = "LICITUSARDESONERAICM", length = 1)
    private String licitusardesoneraicm;

    @Column(name = "LICITPERCDESONERAICM", precision = 18, scale = 6)
    private BigDecimal licitpercdesoneraicm;

    @Column(name = "PERCIVA2", precision = 12, scale = 4)
    private BigDecimal perciva2;

    @Column(name = "LICITCONVENIOISENCAOICMS", length = 40)
    private String licitconvenioisencaoicms;

    @Column(name = "PERCENTUALISS", precision = 26, scale = 6)
    private BigDecimal percentualiss;

    @Column(name = "EMBVENDAECOMMERCEUNILEVER", length = 1)
    private String embvendaecommerceunilever;

    @Column(name = "CODFISCALBENEFICSAIDA")
    private Long codfiscalbeneficsaida;

    @Column(name = "CODFISCALBENEFICRETORNO")
    private Long codfiscalbeneficretorno;

    @Column(name = "CODFISCALBENEFICENTRADA")
    private Long codfiscalbeneficentrada;

    @Column(name = "SITTRIBUTBENEFICSAIDA", length = 3)
    private String sittributbeneficsaida;

    @Column(name = "SITTRIBUTBENEFICRETORNO", length = 3)
    private String sittributbeneficretorno;

    @Column(name = "SITTRIBUTBENEFICENTRADA", length = 3)
    private String sittributbeneficentrada;

    @Column(name = "PERCICMSDESONERACAO", precision = 12, scale = 4)
    private BigDecimal percicmsdesoneracao;

    @Column(name = "ACEITATROCAINSERVIVEL", length = 1)
    private String aceitatrocainservivel;

    @Column(name = "CODINSERVIVEL")
    private Integer codinservivel;

    @Column(name = "CARCACABATERIA", length = 1)
    private String carcacabateria;

    @Column(name = "UTILIZAPRECOFABRICA", length = 1)
    private String utilizaprecofabrica;

    @Column(name = "ISENTOTCIF", length = 1)
    private String isentotcif;

    @Column(name = "UNIDADETRIBEX", length = 6)
    private String unidadetribex;

    @Column(name = "FATORCONVTRIBEX", precision = 12, scale = 6)
    private BigDecimal fatorconvtribex;

    @Column(name = "DESCANP", length = 95)
    private String descanp;

    @Column(name = "BLOQUEIOACORDOPARCERIA", length = 1)
    private String bloqueioacordoparceria;

    @Column(name = "PERACRESCIMOIPI", precision = 18, scale = 6)
    private BigDecimal peracrescimoipi;

    @Column(name = "CODAGREGACAO", length = 20)
    private String codagregacao;

    @Column(name = "USACODAGREGACAO", length = 1)
    private String usacodagregacao;

    @Column(name = "ISENTOSTCOZINHAINDUSTRIAL", length = 1)
    private String isentostcozinhaindustrial;

    @Column(name = "DTIMPORTPRECOMED")
    private LocalDate dtimportprecomed;

    @Column(name = "CTRABCFARMAMED", length = 1)
    private String ctrabcfarmamed;

    @Column(name = "CODGRUPOPRODCOMISSMED")
    private Integer codgrupoprodcomissmed;

    @Column(name = "CLASSEVENDAQT", length = 1)
    private String classevendaqt;

    @Column(name = "CODUNIDADEMEDIDASNGPC")
    private Short codunidademedidasngpc;

    @Column(name = "VERIFCDESCCAIXAFECHADA", length = 1)
    private String verifcdesccaixafechada;

    @Column(name = "PERCDESCCAIXAFECHADA", precision = 16, scale = 8)
    private BigDecimal percdesccaixafechada;

    @Column(name = "CODPRINCIPATIVO2")
    private Long codprincipativo2;

    @Column(name = "UTILIZAMULTIPLICADOR", length = 1)
    private String utilizamultiplicador;

    @Column(name = "PGLP", precision = 7, scale = 4)
    private BigDecimal pglp;

    @Column(name = "PGNN", precision = 7, scale = 4)
    private BigDecimal pgnn;

    @Column(name = "PGNI", precision = 7, scale = 4)
    private BigDecimal pgni;

    @Column(name = "VPART", precision = 23, scale = 10)
    private BigDecimal vpart;

    @Column(name = "FATORCONVERSAOBIONEXO", precision = 6, scale = 2)
    private BigDecimal fatorconversaobionexo;

    @Column(name = "PGLI", precision = 7, scale = 4)
    private BigDecimal pgli;

    @Column(name = "PGLN", precision = 7, scale = 4)
    private BigDecimal pgln;

    @Column(name = "USAMAIORVALORPARACALCULOICMS", length = 1)
    private String usamaiorvalorparacalculoicms;

    @Column(name = "USABASESTNOFCP", length = 1)
    private String usabasestnofcp;

    @Column(name = "UNIDADEPADRAO", length = 2)
    private String unidadepadrao;

    @Column(name = "DESCRICAODINAMICA", length = 1000)
    private String descricaodinamica;

    @Column(name = "TIPOINTEGRACAOB2B")
    private Short tipointegracaob2b;

    @Column(name = "GRAMATURALICIT", precision = 30, scale = 16)
    private BigDecimal gramaturalicit;

    @Column(name = "IDSOFITVIEW", length = 10)
    private String idsofitview;

    @Column(name = "DTULTALTERSOFITVIEW")
    private LocalDate dtultaltersofitview;

    @Column(name = "DTEXCLUSAOSOFITVIEW")
    private LocalDate dtexclusaosofitview;

    @Column(name = "CODMOTISENCAOANVISA")
    private String codmotisencaoanvisa;

    @Column(name = "USAICMSDESONERACAO", length = 1)
    private String usaicmsdesoneracao;

    @Column(name = "CODSAZONALIDADEMED")
    private Short codsazonalidademed;

    @Column(name = "CODADWORDS", length = 200)
    private String codadwords;

    @Column(name = "EXIBESEMESTOQUEECOMMERCE", length = 1)
    private String exibesemestoqueecommerce;

    @Column(name = "LINKID")
    private String linkid;

    @Column(name = "CODCAMPLOMADEE", length = 200)
    private String codcamplomadee;

    @Column(name = "UTILIZAINTEGRACAOKIBON", length = 1)
    private String utilizaintegracaokibon;

    @Column(name = "NUMERO", precision = 9, scale = 2)
    private BigDecimal numero;

    @Column(name = "NUMEROCX", precision = 9, scale = 2)
    private BigDecimal numerocx;

    @Column(name = "PREDOMINANCIA", length = 2)
    private String predominancia;

    @Column(name = "USABASEREDICMSPRESUMIDO", length = 1)
    private String usabaseredicmspresumido;

    @Column(name = "ALIQUOTATCIF", precision = 18, scale = 6)
    private BigDecimal aliquotatcif;

    @Column(name = "OBSCONTXCAMPO", length = 20)
    private String obscontxcampo;

    @Column(name = "OBSCONTXTEXTO", length = 60)
    private String obscontxtexto;

    @Column(name = "OBSFISCOXCAMPO", length = 20)
    private String obsfiscoxcampo;

    @Column(name = "OBSFISCOXTEXTO", length = 60)
    private String obsfiscoxtexto;

    @Column(name = "PMPFMEDICAMENTO", precision = 18, scale = 6)
    private BigDecimal pmpfmedicamento;

    @Column(name = "PRECOFABRICA", precision = 18, scale = 6)
    private BigDecimal precofabrica;

    @Column(name = "USAPMPFBASEST", length = 1)
    private String usapmpfbasest;

    @Column(name = "USAPFABBASEST", length = 1)
    private String usapfabbasest;

    @Column(name = "PERCREDPMPF", precision = 12, scale = 4)
    private BigDecimal percredpmpf;

    @Column(name = "PERCREDPFAB", precision = 12, scale = 4)
    private BigDecimal percredpfab;

    @Column(name = "CONVENIOISENCAOICMSMED", length = 1)
    private String convenioisencaoicmsmed;

    @Column(name = "USACALCULADORAQTDE", nullable = false, length = 1)
    private String usacalculadoraqtde;

    @Column(name = "PESOPORMETROQUADRADO", nullable = false, precision = 18, scale = 6)
    private BigDecimal pesopormetroquadrado;

    @Column(name = "USAMAIORVALORPARACALCULOIPI", length = 1)
    private String usamaiorvalorparacalculoipi;

    @Column(name = "DTALTERC5")
    private Instant dtalterc5;

    @Column(name = "PERMITEMULTIPLICACAOPDV", length = 1)
    private String permitemultiplicacaopdv;

    @Column(name = "CUSTOREPANT2", precision = 18, scale = 6)
    private BigDecimal custorepant2;

    @Column(name = "CUSTOREPANT3", precision = 18, scale = 6)
    private BigDecimal custorepant3;

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

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public BigDecimal getPesoliq() {
        return pesoliq;
    }

    public void setPesoliq(BigDecimal pesoliq) {
        this.pesoliq = pesoliq;
    }

    public BigDecimal getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(BigDecimal pesobruto) {
        this.pesobruto = pesobruto;
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

    public BigDecimal getPcomint1() {
        return pcomint1;
    }

    public void setPcomint1(BigDecimal pcomint1) {
        this.pcomint1 = pcomint1;
    }

    public Short getTemrepos() {
        return temrepos;
    }

    public void setTemrepos(Short temrepos) {
        this.temrepos = temrepos;
    }

    public BigDecimal getQtunit() {
        return qtunit;
    }

    public void setQtunit(BigDecimal qtunit) {
        this.qtunit = qtunit;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public BigDecimal getPcomrep1() {
        return pcomrep1;
    }

    public void setPcomrep1(BigDecimal pcomrep1) {
        this.pcomrep1 = pcomrep1;
    }

    public BigDecimal getPcomext1() {
        return pcomext1;
    }

    public void setPcomext1(BigDecimal pcomext1) {
        this.pcomext1 = pcomext1;
    }

    public Integer getCodfornec() {
        return codfornec;
    }

    public void setCodfornec(Integer codfornec) {
        this.codfornec = codfornec;
    }

    public LocalDate getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(LocalDate dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Long getCodauxiliar() {
        return codauxiliar;
    }

    public void setCodauxiliar(Long codauxiliar) {
        this.codauxiliar = codauxiliar;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public BigDecimal getLastropal() {
        return lastropal;
    }

    public void setLastropal(BigDecimal lastropal) {
        this.lastropal = lastropal;
    }

    public BigDecimal getAlturapal() {
        return alturapal;
    }

    public void setAlturapal(BigDecimal alturapal) {
        this.alturapal = alturapal;
    }

    public BigDecimal getQttotpal() {
        return qttotpal;
    }

    public void setQttotpal(BigDecimal qttotpal) {
        this.qttotpal = qttotpal;
    }

    public Short getPrazoval() {
        return prazoval;
    }

    public void setPrazoval(Short prazoval) {
        this.prazoval = prazoval;
    }

    public BigDecimal getQtunitcx() {
        return qtunitcx;
    }

    public void setQtunitcx(BigDecimal qtunitcx) {
        this.qtunitcx = qtunitcx;
    }

    public String getRevenda() {
        return revenda;
    }

    public void setRevenda(String revenda) {
        this.revenda = revenda;
    }

    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }

    public String getFolharosto() {
        return folharosto;
    }

    public void setFolharosto(String folharosto) {
        this.folharosto = folharosto;
    }

    public LocalDate getDtexclusao() {
        return dtexclusao;
    }

    public void setDtexclusao(LocalDate dtexclusao) {
        this.dtexclusao = dtexclusao;
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

    public LocalDate getDtultaltcom() {
        return dtultaltcom;
    }

    public void setDtultaltcom(LocalDate dtultaltcom) {
        this.dtultaltcom = dtultaltcom;
    }

    public String getCampanha() {
        return campanha;
    }

    public void setCampanha(String campanha) {
        this.campanha = campanha;
    }

    public Integer getCodprodprinc() {
        return codprodprinc;
    }

    public void setCodprodprinc(Integer codprodprinc) {
        this.codprodprinc = codprodprinc;
    }

    public String getObs2() {
        return obs2;
    }

    public void setObs2(String obs2) {
        this.obs2 = obs2;
    }

    public BigDecimal getPercipi() {
        return percipi;
    }

    public void setPercipi(BigDecimal percipi) {
        this.percipi = percipi;
    }

    public String getUnidademaster() {
        return unidademaster;
    }

    public void setUnidademaster(String unidademaster) {
        this.unidademaster = unidademaster;
    }

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public BigDecimal getLarguram3() {
        return larguram3;
    }

    public void setLarguram3(BigDecimal larguram3) {
        this.larguram3 = larguram3;
    }

    public BigDecimal getAlturam3() {
        return alturam3;
    }

    public void setAlturam3(BigDecimal alturam3) {
        this.alturam3 = alturam3;
    }

    public BigDecimal getComprimentom3() {
        return comprimentom3;
    }

    public void setComprimentom3(BigDecimal comprimentom3) {
        this.comprimentom3 = comprimentom3;
    }

    public String getTiporestricao() {
        return tiporestricao;
    }

    public void setTiporestricao(String tiporestricao) {
        this.tiporestricao = tiporestricao;
    }

    public BigDecimal getQttotpalfrac() {
        return qttotpalfrac;
    }

    public void setQttotpalfrac(BigDecimal qttotpalfrac) {
        this.qttotpalfrac = qttotpalfrac;
    }

    public Boolean getDv() {
        return dv;
    }

    public void setDv(Boolean dv) {
        this.dv = dv;
    }

    public String getClassevenda() {
        return classevenda;
    }

    public void setClassevenda(String classevenda) {
        this.classevenda = classevenda;
    }

    public String getClassemc() {
        return classemc;
    }

    public void setClassemc(String classemc) {
        this.classemc = classemc;
    }

    public String getClasseestoque() {
        return classeestoque;
    }

    public void setClasseestoque(String classeestoque) {
        this.classeestoque = classeestoque;
    }

    public String getClassecompra() {
        return classecompra;
    }

    public void setClassecompra(String classecompra) {
        this.classecompra = classecompra;
    }

    public BigDecimal getPericm() {
        return pericm;
    }

    public void setPericm(BigDecimal pericm) {
        this.pericm = pericm;
    }

    public BigDecimal getPercdesc() {
        return percdesc;
    }

    public void setPercdesc(BigDecimal percdesc) {
        this.percdesc = percdesc;
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

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public String getDtdolar() {
        return dtdolar;
    }

    public void setDtdolar(String dtdolar) {
        this.dtdolar = dtdolar;
    }

    public String getDescricao1() {
        return descricao1;
    }

    public void setDescricao1(String descricao1) {
        this.descricao1 = descricao1;
    }

    public String getDescricao2() {
        return descricao2;
    }

    public void setDescricao2(String descricao2) {
        this.descricao2 = descricao2;
    }

    public String getDescricao3() {
        return descricao3;
    }

    public void setDescricao3(String descricao3) {
        this.descricao3 = descricao3;
    }

    public String getDescricao4() {
        return descricao4;
    }

    public void setDescricao4(String descricao4) {
        this.descricao4 = descricao4;
    }

    public String getClassificfiscal() {
        return classificfiscal;
    }

    public void setClassificfiscal(String classificfiscal) {
        this.classificfiscal = classificfiscal;
    }

    public BigDecimal getCustorep() {
        return custorep;
    }

    public void setCustorep(BigDecimal custorep) {
        this.custorep = custorep;
    }

    public LocalDate getDtultaltcustorep() {
        return dtultaltcustorep;
    }

    public void setDtultaltcustorep(LocalDate dtultaltcustorep) {
        this.dtultaltcustorep = dtultaltcustorep;
    }

    public String getNbm() {
        return nbm;
    }

    public void setNbm(String nbm) {
        this.nbm = nbm;
    }

    public String getCodfab() {
        return codfab;
    }

    public void setCodfab(String codfab) {
        this.codfab = codfab;
    }

    public String getTribfederal() {
        return tribfederal;
    }

    public void setTribfederal(String tribfederal) {
        this.tribfederal = tribfederal;
    }

    public BigDecimal getPercipivenda() {
        return percipivenda;
    }

    public void setPercipivenda(BigDecimal percipivenda) {
        this.percipivenda = percipivenda;
    }

    public BigDecimal getPercdesc1() {
        return percdesc1;
    }

    public void setPercdesc1(BigDecimal percdesc1) {
        this.percdesc1 = percdesc1;
    }

    public BigDecimal getPercdesc2() {
        return percdesc2;
    }

    public void setPercdesc2(BigDecimal percdesc2) {
        this.percdesc2 = percdesc2;
    }

    public BigDecimal getPercdesc3() {
        return percdesc3;
    }

    public void setPercdesc3(BigDecimal percdesc3) {
        this.percdesc3 = percdesc3;
    }

    public BigDecimal getPercdesc4() {
        return percdesc4;
    }

    public void setPercdesc4(BigDecimal percdesc4) {
        this.percdesc4 = percdesc4;
    }

    public BigDecimal getPericmsantecipado() {
        return pericmsantecipado;
    }

    public void setPericmsantecipado(BigDecimal pericmsantecipado) {
        this.pericmsantecipado = pericmsantecipado;
    }

    public Integer getCodprodsimilar() {
        return codprodsimilar;
    }

    public void setCodprodsimilar(Integer codprodsimilar) {
        this.codprodsimilar = codprodsimilar;
    }

    public Integer getCodcategoria() {
        return codcategoria;
    }

    public void setCodcategoria(Integer codcategoria) {
        this.codcategoria = codcategoria;
    }

    public Integer getCodsubcategoria() {
        return codsubcategoria;
    }

    public void setCodsubcategoria(Integer codsubcategoria) {
        this.codsubcategoria = codsubcategoria;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public String getTipodescarga() {
        return tipodescarga;
    }

    public void setTipodescarga(String tipodescarga) {
        this.tipodescarga = tipodescarga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getPercoutrasdesp() {
        return percoutrasdesp;
    }

    public void setPercoutrasdesp(BigDecimal percoutrasdesp) {
        this.percoutrasdesp = percoutrasdesp;
    }

    public BigDecimal getPercfretefob() {
        return percfretefob;
    }

    public void setPercfretefob(BigDecimal percfretefob) {
        this.percfretefob = percfretefob;
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

    public BigDecimal getVlbonific() {
        return vlbonific;
    }

    public void setVlbonific(BigDecimal vlbonific) {
        this.vlbonific = vlbonific;
    }

    public String getPrecofixo() {
        return precofixo;
    }

    public void setPrecofixo(String precofixo) {
        this.precofixo = precofixo;
    }

    public String getPiscofinsretido() {
        return piscofinsretido;
    }

    public void setPiscofinsretido(String piscofinsretido) {
        this.piscofinsretido = piscofinsretido;
    }

    public BigDecimal getPerccommot() {
        return perccommot;
    }

    public void setPerccommot(BigDecimal perccommot) {
        this.perccommot = perccommot;
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

    public String getTipovolumedescarga() {
        return tipovolumedescarga;
    }

    public void setTipovolumedescarga(String tipovolumedescarga) {
        this.tipovolumedescarga = tipovolumedescarga;
    }

    public String getComissaofixa() {
        return comissaofixa;
    }

    public void setComissaofixa(String comissaofixa) {
        this.comissaofixa = comissaofixa;
    }

    public String getUsaclassificacao() {
        return usaclassificacao;
    }

    public void setUsaclassificacao(String usaclassificacao) {
        this.usaclassificacao = usaclassificacao;
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

    public BigDecimal getPercicmred() {
        return percicmred;
    }

    public void setPercicmred(BigDecimal percicmred) {
        this.percicmred = percicmred;
    }

    public BigDecimal getPerciva() {
        return perciva;
    }

    public void setPerciva(BigDecimal perciva) {
        this.perciva = perciva;
    }

    public BigDecimal getPercaliqint() {
        return percaliqint;
    }

    public void setPercaliqint(BigDecimal percaliqint) {
        this.percaliqint = percaliqint;
    }

    public BigDecimal getPercaliqext() {
        return percaliqext;
    }

    public void setPercaliqext(BigDecimal percaliqext) {
        this.percaliqext = percaliqext;
    }

    public Long getCodauxiliar2() {
        return codauxiliar2;
    }

    public void setCodauxiliar2(Long codauxiliar2) {
        this.codauxiliar2 = codauxiliar2;
    }

    public String getVendadireta() {
        return vendadireta;
    }

    public void setVendadireta(String vendadireta) {
        this.vendadireta = vendadireta;
    }

    public String getPasselivre() {
        return passelivre;
    }

    public void setPasselivre(String passelivre) {
        this.passelivre = passelivre;
    }

    public Short getModulo2() {
        return modulo2;
    }

    public void setModulo2(Short modulo2) {
        this.modulo2 = modulo2;
    }

    public Short getRua2() {
        return rua2;
    }

    public void setRua2(Short rua2) {
        this.rua2 = rua2;
    }

    public BigDecimal getNumero2() {
        return numero2;
    }

    public void setNumero2(BigDecimal numero2) {
        this.numero2 = numero2;
    }

    public Short getApto2() {
        return apto2;
    }

    public void setApto2(Short apto2) {
        this.apto2 = apto2;
    }

    public Integer getCodpassefiscal() {
        return codpassefiscal;
    }

    public void setCodpassefiscal(Integer codpassefiscal) {
        this.codpassefiscal = codpassefiscal;
    }

    public Short getTipoalturapalete() {
        return tipoalturapalete;
    }

    public void setTipoalturapalete(Short tipoalturapalete) {
        this.tipoalturapalete = tipoalturapalete;
    }

    public String getNumlote() {
        return numlote;
    }

    public void setNumlote(String numlote) {
        this.numlote = numlote;
    }

    public LocalDate getDtvenc() {
        return dtvenc;
    }

    public void setDtvenc(LocalDate dtvenc) {
        this.dtvenc = dtvenc;
    }

    public BigDecimal getPerindeniz() {
        return perindeniz;
    }

    public void setPerindeniz(BigDecimal perindeniz) {
        this.perindeniz = perindeniz;
    }

    public BigDecimal getPerpis() {
        return perpis;
    }

    public void setPerpis(BigDecimal perpis) {
        this.perpis = perpis;
    }

    public BigDecimal getMultiplo() {
        return multiplo;
    }

    public void setMultiplo(BigDecimal multiplo) {
        this.multiplo = multiplo;
    }

    public BigDecimal getVlvendatemp() {
        return vlvendatemp;
    }

    public void setVlvendatemp(BigDecimal vlvendatemp) {
        this.vlvendatemp = vlvendatemp;
    }

    public String getTipomerc() {
        return tipomerc;
    }

    public void setTipomerc(String tipomerc) {
        this.tipomerc = tipomerc;
    }

    public String getNormafornecedor() {
        return normafornecedor;
    }

    public void setNormafornecedor(String normafornecedor) {
        this.normafornecedor = normafornecedor;
    }

    public String getTipocalcst() {
        return tipocalcst;
    }

    public void setTipocalcst(String tipocalcst) {
        this.tipocalcst = tipocalcst;
    }

    public BigDecimal getPericmfrete() {
        return pericmfrete;
    }

    public void setPericmfrete(BigDecimal pericmfrete) {
        this.pericmfrete = pericmfrete;
    }

    public BigDecimal getLotemincompra() {
        return lotemincompra;
    }

    public void setLotemincompra(BigDecimal lotemincompra) {
        this.lotemincompra = lotemincompra;
    }

    public String getTiposugcompra() {
        return tiposugcompra;
    }

    public void setTiposugcompra(String tiposugcompra) {
        this.tiposugcompra = tiposugcompra;
    }

    public BigDecimal getLoteinccompra() {
        return loteinccompra;
    }

    public void setLoteinccompra(BigDecimal loteinccompra) {
        this.loteinccompra = loteinccompra;
    }

    public BigDecimal getLoteproducao() {
        return loteproducao;
    }

    public void setLoteproducao(BigDecimal loteproducao) {
        this.loteproducao = loteproducao;
    }

    public String getAutorizatipo4() {
        return autorizatipo4;
    }

    public void setAutorizatipo4(String autorizatipo4) {
        this.autorizatipo4 = autorizatipo4;
    }

    public String getAceitavendafracao() {
        return aceitavendafracao;
    }

    public void setAceitavendafracao(String aceitavendafracao) {
        this.aceitavendafracao = aceitavendafracao;
    }

    public Integer getCodfunccadastro() {
        return codfunccadastro;
    }

    public void setCodfunccadastro(Integer codfunccadastro) {
        this.codfunccadastro = codfunccadastro;
    }

    public Integer getCodfuncultalter() {
        return codfuncultalter;
    }

    public void setCodfuncultalter(Integer codfuncultalter) {
        this.codfuncultalter = codfuncultalter;
    }

    public Long getCodfiscal() {
        return codfiscal;
    }

    public void setCodfiscal(Long codfiscal) {
        this.codfiscal = codfiscal;
    }

    public String getSittribut() {
        return sittribut;
    }

    public void setSittribut(String sittribut) {
        this.sittribut = sittribut;
    }

    public BigDecimal getMargemmin() {
        return margemmin;
    }

    public void setMargemmin(BigDecimal margemmin) {
        this.margemmin = margemmin;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getFlag0() {
        return flag0;
    }

    public void setFlag0(String flag0) {
        this.flag0 = flag0;
    }

    public String getFlag1() {
        return flag1;
    }

    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }

    public String getFlag2() {
        return flag2;
    }

    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    public BigDecimal getLarguraarm() {
        return larguraarm;
    }

    public void setLarguraarm(BigDecimal larguraarm) {
        this.larguraarm = larguraarm;
    }

    public BigDecimal getComprimentoarm() {
        return comprimentoarm;
    }

    public void setComprimentoarm(BigDecimal comprimentoarm) {
        this.comprimentoarm = comprimentoarm;
    }

    public BigDecimal getAlturaarm() {
        return alturaarm;
    }

    public void setAlturaarm(BigDecimal alturaarm) {
        this.alturaarm = alturaarm;
    }

    public BigDecimal getVolumearm() {
        return volumearm;
    }

    public void setVolumearm(BigDecimal volumearm) {
        this.volumearm = volumearm;
    }

    public BigDecimal getCamapapal() {
        return camapapal;
    }

    public void setCamapapal(BigDecimal camapapal) {
        this.camapapal = camapapal;
    }

    public Short getTipoprod() {
        return tipoprod;
    }

    public void setTipoprod(Short tipoprod) {
        this.tipoprod = tipoprod;
    }

    public Short getTipopal() {
        return tipopal;
    }

    public void setTipopal(Short tipopal) {
        this.tipopal = tipopal;
    }

    public Short getTipoarm() {
        return tipoarm;
    }

    public void setTipoarm(Short tipoarm) {
        this.tipoarm = tipoarm;
    }

    public BigDecimal getCapacidadepicking() {
        return capacidadepicking;
    }

    public void setCapacidadepicking(BigDecimal capacidadepicking) {
        this.capacidadepicking = capacidadepicking;
    }

    public Short getCodcaracprod() {
        return codcaracprod;
    }

    public void setCodcaracprod(Short codcaracprod) {
        this.codcaracprod = codcaracprod;
    }

    public Short getCodtipoestrutura() {
        return codtipoestrutura;
    }

    public void setCodtipoestrutura(Short codtipoestrutura) {
        this.codtipoestrutura = codtipoestrutura;
    }

    public Short getRestricaoblocado() {
        return restricaoblocado;
    }

    public void setRestricaoblocado(Short restricaoblocado) {
        this.restricaoblocado = restricaoblocado;
    }

    public BigDecimal getPontoreposicao() {
        return pontoreposicao;
    }

    public void setPontoreposicao(BigDecimal pontoreposicao) {
        this.pontoreposicao = pontoreposicao;
    }

    public Short getTipopalpul() {
        return tipopalpul;
    }

    public void setTipopalpul(Short tipopalpul) {
        this.tipopalpul = tipopalpul;
    }

    public Short getCodtipoestruturapul() {
        return codtipoestruturapul;
    }

    public void setCodtipoestruturapul(Short codtipoestruturapul) {
        this.codtipoestruturapul = codtipoestruturapul;
    }

    public Integer getCodprodmaster() {
        return codprodmaster;
    }

    public void setCodprodmaster(Integer codprodmaster) {
        this.codprodmaster = codprodmaster;
    }

    public BigDecimal getQtunitct() {
        return qtunitct;
    }

    public void setQtunitct(BigDecimal qtunitct) {
        this.qtunitct = qtunitct;
    }

    public Short getRuact() {
        return ruact;
    }

    public void setRuact(Short ruact) {
        this.ruact = ruact;
    }

    public BigDecimal getNumeroct() {
        return numeroct;
    }

    public void setNumeroct(BigDecimal numeroct) {
        this.numeroct = numeroct;
    }

    public Short getAptoct() {
        return aptoct;
    }

    public void setAptoct(Short aptoct) {
        this.aptoct = aptoct;
    }

    public Short getModuloct() {
        return moduloct;
    }

    public void setModuloct(Short moduloct) {
        this.moduloct = moduloct;
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

    public Short getModulocx() {
        return modulocx;
    }

    public void setModulocx(Short modulocx) {
        this.modulocx = modulocx;
    }

    public String getUnidadect() {
        return unidadect;
    }

    public void setUnidadect(String unidadect) {
        this.unidadect = unidadect;
    }

    public BigDecimal getVlpauta() {
        return vlpauta;
    }

    public void setVlpauta(BigDecimal vlpauta) {
        this.vlpauta = vlpauta;
    }

    public BigDecimal getVlpautaipi() {
        return vlpautaipi;
    }

    public void setVlpautaipi(BigDecimal vlpautaipi) {
        this.vlpautaipi = vlpautaipi;
    }

    public String getEmbalagemmaster() {
        return embalagemmaster;
    }

    public void setEmbalagemmaster(String embalagemmaster) {
        this.embalagemmaster = embalagemmaster;
    }

    public String getEmbalagemct() {
        return embalagemct;
    }

    public void setEmbalagemct(String embalagemct) {
        this.embalagemct = embalagemct;
    }

    public Short getNumdiasmaxvenda() {
        return numdiasmaxvenda;
    }

    public void setNumdiasmaxvenda(Short numdiasmaxvenda) {
        this.numdiasmaxvenda = numdiasmaxvenda;
    }

    public String getUsaaliqcredicmsdifer() {
        return usaaliqcredicmsdifer;
    }

    public void setUsaaliqcredicmsdifer(String usaaliqcredicmsdifer) {
        this.usaaliqcredicmsdifer = usaaliqcredicmsdifer;
    }

    public BigDecimal getPercaliqcredicmsdiferest() {
        return percaliqcredicmsdiferest;
    }

    public void setPercaliqcredicmsdiferest(BigDecimal percaliqcredicmsdiferest) {
        this.percaliqcredicmsdiferest = percaliqcredicmsdiferest;
    }

    public BigDecimal getPercaliqcredicmsdiferinter() {
        return percaliqcredicmsdiferinter;
    }

    public void setPercaliqcredicmsdiferinter(BigDecimal percaliqcredicmsdiferinter) {
        this.percaliqcredicmsdiferinter = percaliqcredicmsdiferinter;
    }

    public String getPsicotropico() {
        return psicotropico;
    }

    public void setPsicotropico(String psicotropico) {
        this.psicotropico = psicotropico;
    }

    public Integer getCodlinhaprod() {
        return codlinhaprod;
    }

    public void setCodlinhaprod(Integer codlinhaprod) {
        this.codlinhaprod = codlinhaprod;
    }

    public BigDecimal getCustoreptab() {
        return custoreptab;
    }

    public void setCustoreptab(BigDecimal custoreptab) {
        this.custoreptab = custoreptab;
    }

    public BigDecimal getPrecomaxconsum() {
        return precomaxconsum;
    }

    public void setPrecomaxconsum(BigDecimal precomaxconsum) {
        this.precomaxconsum = precomaxconsum;
    }

    public BigDecimal getPrecomaxconsumtab() {
        return precomaxconsumtab;
    }

    public void setPrecomaxconsumtab(BigDecimal precomaxconsumtab) {
        this.precomaxconsumtab = precomaxconsumtab;
    }

    public BigDecimal getPercdesc5() {
        return percdesc5;
    }

    public void setPercdesc5(BigDecimal percdesc5) {
        this.percdesc5 = percdesc5;
    }

    public Integer getNumlistainventrot() {
        return numlistainventrot;
    }

    public void setNumlistainventrot(Integer numlistainventrot) {
        this.numlistainventrot = numlistainventrot;
    }

    public Integer getNumseqinventrot() {
        return numseqinventrot;
    }

    public void setNumseqinventrot(Integer numseqinventrot) {
        this.numseqinventrot = numseqinventrot;
    }

    public String getMedicamentohospitalar() {
        return medicamentohospitalar;
    }

    public void setMedicamentohospitalar(String medicamentohospitalar) {
        this.medicamentohospitalar = medicamentohospitalar;
    }

    public BigDecimal getPercbonificvenda() {
        return percbonificvenda;
    }

    public void setPercbonificvenda(BigDecimal percbonificvenda) {
        this.percbonificvenda = percbonificvenda;
    }

    public String getPrincipioativo() {
        return principioativo;
    }

    public void setPrincipioativo(String principioativo) {
        this.principioativo = principioativo;
    }

    public String getTipotributmedic() {
        return tipotributmedic;
    }

    public void setTipotributmedic(String tipotributmedic) {
        this.tipotributmedic = tipotributmedic;
    }

    public Short getDeposito() {
        return deposito;
    }

    public void setDeposito(Short deposito) {
        this.deposito = deposito;
    }

    public Short getPredio() {
        return predio;
    }

    public void setPredio(Short predio) {
        this.predio = predio;
    }

    public Short getNivel() {
        return nivel;
    }

    public void setNivel(Short nivel) {
        this.nivel = nivel;
    }

    public Short getCodequipe() {
        return codequipe;
    }

    public void setCodequipe(Short codequipe) {
        this.codequipe = codequipe;
    }

    public BigDecimal getPercsuframa() {
        return percsuframa;
    }

    public void setPercsuframa(BigDecimal percsuframa) {
        this.percsuframa = percsuframa;
    }

    public String getExportabalanca() {
        return exportabalanca;
    }

    public void setExportabalanca(String exportabalanca) {
        this.exportabalanca = exportabalanca;
    }

    public Long getCodinfnutri() {
        return codinfnutri;
    }

    public void setCodinfnutri(Long codinfnutri) {
        this.codinfnutri = codinfnutri;
    }

    public String getSomentetv3() {
        return somentetv3;
    }

    public void setSomentetv3(String somentetv3) {
        this.somentetv3 = somentetv3;
    }

    public BigDecimal getPcomtlmkt() {
        return pcomtlmkt;
    }

    public void setPcomtlmkt(BigDecimal pcomtlmkt) {
        this.pcomtlmkt = pcomtlmkt;
    }

    public Short getSeqtabpreco() {
        return seqtabpreco;
    }

    public void setSeqtabpreco(Short seqtabpreco) {
        this.seqtabpreco = seqtabpreco;
    }

    public BigDecimal getQtpontopedido() {
        return qtpontopedido;
    }

    public void setQtpontopedido(BigDecimal qtpontopedido) {
        this.qtpontopedido = qtpontopedido;
    }

    public BigDecimal getQtminproduzir() {
        return qtminproduzir;
    }

    public void setQtminproduzir(BigDecimal qtminproduzir) {
        this.qtminproduzir = qtminproduzir;
    }

    public Integer getPrazomedioproducao() {
        return prazomedioproducao;
    }

    public void setPrazomedioproducao(Integer prazomedioproducao) {
        this.prazomedioproducao = prazomedioproducao;
    }

    public String getNomecomercial() {
        return nomecomercial;
    }

    public void setNomecomercial(String nomecomercial) {
        this.nomecomercial = nomecomercial;
    }

    public BigDecimal getFracaoseparacao() {
        return fracaoseparacao;
    }

    public void setFracaoseparacao(BigDecimal fracaoseparacao) {
        this.fracaoseparacao = fracaoseparacao;
    }

    public BigDecimal getFatortransf() {
        return fatortransf;
    }

    public void setFatortransf(BigDecimal fatortransf) {
        this.fatortransf = fatortransf;
    }

    public BigDecimal getTamanholotefab() {
        return tamanholotefab;
    }

    public void setTamanholotefab(BigDecimal tamanholotefab) {
        this.tamanholotefab = tamanholotefab;
    }

    public BigDecimal getVelocidadeesp() {
        return velocidadeesp;
    }

    public void setVelocidadeesp(BigDecimal velocidadeesp) {
        this.velocidadeesp = velocidadeesp;
    }

    public BigDecimal getVelocidadeoperacional() {
        return velocidadeoperacional;
    }

    public void setVelocidadeoperacional(BigDecimal velocidadeoperacional) {
        this.velocidadeoperacional = velocidadeoperacional;
    }

    public BigDecimal getEficienciaoperacional() {
        return eficienciaoperacional;
    }

    public void setEficienciaoperacional(BigDecimal eficienciaoperacional) {
        this.eficienciaoperacional = eficienciaoperacional;
    }

    public String getCodfilialprodutora() {
        return codfilialprodutora;
    }

    public void setCodfilialprodutora(String codfilialprodutora) {
        this.codfilialprodutora = codfilialprodutora;
    }

    public Long getFatorunfarm() {
        return fatorunfarm;
    }

    public void setFatorunfarm(Long fatorunfarm) {
        this.fatorunfarm = fatorunfarm;
    }

    public BigDecimal getVolumerec() {
        return volumerec;
    }

    public void setVolumerec(BigDecimal volumerec) {
        this.volumerec = volumerec;
    }

    public Short getPrazo() {
        return prazo;
    }

    public void setPrazo(Short prazo) {
        this.prazo = prazo;
    }

    public Short getPrazoentr() {
        return prazoentr;
    }

    public void setPrazoentr(Short prazoentr) {
        this.prazoentr = prazoentr;
    }

    public Long getCodprincipativo() {
        return codprincipativo;
    }

    public void setCodprincipativo(Long codprincipativo) {
        this.codprincipativo = codprincipativo;
    }

    public String getCodprodsintegra() {
        return codprodsintegra;
    }

    public void setCodprodsintegra(String codprodsintegra) {
        this.codprodsintegra = codprodsintegra;
    }

    public String getTiporestricaomed() {
        return tiporestricaomed;
    }

    public void setTiporestricaomed(String tiporestricaomed) {
        this.tiporestricaomed = tiporestricaomed;
    }

    public String getInformacoestecnicas() {
        return informacoestecnicas;
    }

    public void setInformacoestecnicas(String informacoestecnicas) {
        this.informacoestecnicas = informacoestecnicas;
    }

    public String getFreteespecial() {
        return freteespecial;
    }

    public void setFreteespecial(String freteespecial) {
        this.freteespecial = freteespecial;
    }

    public String getDirfotoprod() {
        return dirfotoprod;
    }

    public void setDirfotoprod(String dirfotoprod) {
        this.dirfotoprod = dirfotoprod;
    }

    public BigDecimal getCustorepmc() {
        return custorepmc;
    }

    public void setCustorepmc(BigDecimal custorepmc) {
        this.custorepmc = custorepmc;
    }

    public String getTipomp() {
        return tipomp;
    }

    public void setTipomp(String tipomp) {
        this.tipomp = tipomp;
    }

    public BigDecimal getPesobrutomaster() {
        return pesobrutomaster;
    }

    public void setPesobrutomaster(BigDecimal pesobrutomaster) {
        this.pesobrutomaster = pesobrutomaster;
    }

    public BigDecimal getPesoliqmaster() {
        return pesoliqmaster;
    }

    public void setPesoliqmaster(BigDecimal pesoliqmaster) {
        this.pesoliqmaster = pesoliqmaster;
    }

    public String getPckrotativo() {
        return pckrotativo;
    }

    public void setPckrotativo(String pckrotativo) {
        this.pckrotativo = pckrotativo;
    }

    public Short getPrazoexpurgo() {
        return prazoexpurgo;
    }

    public void setPrazoexpurgo(Short prazoexpurgo) {
        this.prazoexpurgo = prazoexpurgo;
    }

    public Long getNumultexpurgo() {
        return numultexpurgo;
    }

    public void setNumultexpurgo(Long numultexpurgo) {
        this.numultexpurgo = numultexpurgo;
    }

    public LocalDate getDtultexpurgo() {
        return dtultexpurgo;
    }

    public void setDtultexpurgo(LocalDate dtultexpurgo) {
        this.dtultexpurgo = dtultexpurgo;
    }

    public LocalDate getDtproxexpurgo() {
        return dtproxexpurgo;
    }

    public void setDtproxexpurgo(LocalDate dtproxexpurgo) {
        this.dtproxexpurgo = dtproxexpurgo;
    }

    public BigDecimal getPercdesc6() {
        return percdesc6;
    }

    public void setPercdesc6(BigDecimal percdesc6) {
        this.percdesc6 = percdesc6;
    }

    public BigDecimal getPercdesc7() {
        return percdesc7;
    }

    public void setPercdesc7(BigDecimal percdesc7) {
        this.percdesc7 = percdesc7;
    }

    public BigDecimal getPercdesc8() {
        return percdesc8;
    }

    public void setPercdesc8(BigDecimal percdesc8) {
        this.percdesc8 = percdesc8;
    }

    public BigDecimal getPercdesc9() {
        return percdesc9;
    }

    public void setPercdesc9(BigDecimal percdesc9) {
        this.percdesc9 = percdesc9;
    }

    public BigDecimal getPercdesc10() {
        return percdesc10;
    }

    public void setPercdesc10(BigDecimal percdesc10) {
        this.percdesc10 = percdesc10;
    }

    public String getNumoriginal() {
        return numoriginal;
    }

    public void setNumoriginal(String numoriginal) {
        this.numoriginal = numoriginal;
    }

    public Short getDepositocx() {
        return depositocx;
    }

    public void setDepositocx(Short depositocx) {
        this.depositocx = depositocx;
    }

    public Short getPrediocx() {
        return prediocx;
    }

    public void setPrediocx(Short prediocx) {
        this.prediocx = prediocx;
    }

    public Short getNivelcx() {
        return nivelcx;
    }

    public void setNivelcx(Short nivelcx) {
        this.nivelcx = nivelcx;
    }

    public BigDecimal getPontoreposicaocx() {
        return pontoreposicaocx;
    }

    public void setPontoreposicaocx(BigDecimal pontoreposicaocx) {
        this.pontoreposicaocx = pontoreposicaocx;
    }

    public BigDecimal getCapacidadepickingcx() {
        return capacidadepickingcx;
    }

    public void setCapacidadepickingcx(BigDecimal capacidadepickingcx) {
        this.capacidadepickingcx = capacidadepickingcx;
    }

    public String getDenominacaocomunbrasileira() {
        return denominacaocomunbrasileira;
    }

    public void setDenominacaocomunbrasileira(String denominacaocomunbrasileira) {
        this.denominacaocomunbrasileira = denominacaocomunbrasileira;
    }

    public BigDecimal getPerctoleranciaval() {
        return perctoleranciaval;
    }

    public void setPerctoleranciaval(BigDecimal perctoleranciaval) {
        this.perctoleranciaval = perctoleranciaval;
    }

    public String getDescricao5() {
        return descricao5;
    }

    public void setDescricao5(String descricao5) {
        this.descricao5 = descricao5;
    }

    public String getDescricao6() {
        return descricao6;
    }

    public void setDescricao6(String descricao6) {
        this.descricao6 = descricao6;
    }

    public String getDescricao7() {
        return descricao7;
    }

    public void setDescricao7(String descricao7) {
        this.descricao7 = descricao7;
    }

    public BigDecimal getCustoproximacompra() {
        return custoproximacompra;
    }

    public void setCustoproximacompra(BigDecimal custoproximacompra) {
        this.custoproximacompra = custoproximacompra;
    }

    public String getCoddistrib() {
        return coddistrib;
    }

    public void setCoddistrib(String coddistrib) {
        this.coddistrib = coddistrib;
    }

    public String getAbastepalete() {
        return abastepalete;
    }

    public void setAbastepalete(String abastepalete) {
        this.abastepalete = abastepalete;
    }

    public String getAbastepaletecx() {
        return abastepaletecx;
    }

    public void setAbastepaletecx(String abastepaletecx) {
        this.abastepaletecx = abastepaletecx;
    }

    public String getFracionado() {
        return fracionado;
    }

    public void setFracionado(String fracionado) {
        this.fracionado = fracionado;
    }

    public Integer getMedcodfunclibvenda() {
        return medcodfunclibvenda;
    }

    public void setMedcodfunclibvenda(Integer medcodfunclibvenda) {
        this.medcodfunclibvenda = medcodfunclibvenda;
    }

    public LocalDate getMeddtlibvenda() {
        return meddtlibvenda;
    }

    public void setMeddtlibvenda(LocalDate meddtlibvenda) {
        this.meddtlibvenda = meddtlibvenda;
    }

    public String getCodnestleterceiros() {
        return codnestleterceiros;
    }

    public void setCodnestleterceiros(String codnestleterceiros) {
        this.codnestleterceiros = codnestleterceiros;
    }

    public BigDecimal getFatorconversaonestle() {
        return fatorconversaonestle;
    }

    public void setFatorconversaonestle(BigDecimal fatorconversaonestle) {
        this.fatorconversaonestle = fatorconversaonestle;
    }

    public BigDecimal getPercvenda() {
        return percvenda;
    }

    public void setPercvenda(BigDecimal percvenda) {
        this.percvenda = percvenda;
    }

    public String getConfaz() {
        return confaz;
    }

    public void setConfaz(String confaz) {
        this.confaz = confaz;
    }

    public BigDecimal getMultiplo2() {
        return multiplo2;
    }

    public void setMultiplo2(BigDecimal multiplo2) {
        this.multiplo2 = multiplo2;
    }

    public String getAnvisanumregmed() {
        return anvisanumregmed;
    }

    public void setAnvisanumregmed(String anvisanumregmed) {
        this.anvisanumregmed = anvisanumregmed;
    }

    public Integer getAnvisaqtembalagem() {
        return anvisaqtembalagem;
    }

    public void setAnvisaqtembalagem(Integer anvisaqtembalagem) {
        this.anvisaqtembalagem = anvisaqtembalagem;
    }

    public String getAnvisaformafarm() {
        return anvisaformafarm;
    }

    public void setAnvisaformafarm(String anvisaformafarm) {
        this.anvisaformafarm = anvisaformafarm;
    }

    public String getAnvisaviaadm() {
        return anvisaviaadm;
    }

    public void setAnvisaviaadm(String anvisaviaadm) {
        this.anvisaviaadm = anvisaviaadm;
    }

    public String getAnvisaclasterapeutica() {
        return anvisaclasterapeutica;
    }

    public void setAnvisaclasterapeutica(String anvisaclasterapeutica) {
        this.anvisaclasterapeutica = anvisaclasterapeutica;
    }

    public String getAnvisausocontinuo() {
        return anvisausocontinuo;
    }

    public void setAnvisausocontinuo(String anvisausocontinuo) {
        this.anvisausocontinuo = anvisausocontinuo;
    }

    public Long getAnvisacapinstal() {
        return anvisacapinstal;
    }

    public void setAnvisacapinstal(Long anvisacapinstal) {
        this.anvisacapinstal = anvisacapinstal;
    }

    public BigDecimal getAnvisaconcen() {
        return anvisaconcen;
    }

    public void setAnvisaconcen(BigDecimal anvisaconcen) {
        this.anvisaconcen = anvisaconcen;
    }

    public String getAnvisaundosag() {
        return anvisaundosag;
    }

    public void setAnvisaundosag(String anvisaundosag) {
        this.anvisaundosag = anvisaundosag;
    }

    public Short getAnvisanumprincat() {
        return anvisanumprincat;
    }

    public void setAnvisanumprincat(Short anvisanumprincat) {
        this.anvisanumprincat = anvisanumprincat;
    }

    public String getAnvisadescprincat1() {
        return anvisadescprincat1;
    }

    public void setAnvisadescprincat1(String anvisadescprincat1) {
        this.anvisadescprincat1 = anvisadescprincat1;
    }

    public String getAnvisadescprincat2() {
        return anvisadescprincat2;
    }

    public void setAnvisadescprincat2(String anvisadescprincat2) {
        this.anvisadescprincat2 = anvisadescprincat2;
    }

    public String getAnvisadescprincat3() {
        return anvisadescprincat3;
    }

    public void setAnvisadescprincat3(String anvisadescprincat3) {
        this.anvisadescprincat3 = anvisadescprincat3;
    }

    public String getAnvisadescprincat4() {
        return anvisadescprincat4;
    }

    public void setAnvisadescprincat4(String anvisadescprincat4) {
        this.anvisadescprincat4 = anvisadescprincat4;
    }

    public String getAnvisacoeftec() {
        return anvisacoeftec;
    }

    public void setAnvisacoeftec(String anvisacoeftec) {
        this.anvisacoeftec = anvisacoeftec;
    }

    public String getAnvisauncoeftec() {
        return anvisauncoeftec;
    }

    public void setAnvisauncoeftec(String anvisauncoeftec) {
        this.anvisauncoeftec = anvisauncoeftec;
    }

    public String getPaisorigem() {
        return paisorigem;
    }

    public void setPaisorigem(String paisorigem) {
        this.paisorigem = paisorigem;
    }

    public Short getTipoembalagemnestle() {
        return tipoembalagemnestle;
    }

    public void setTipoembalagemnestle(Short tipoembalagemnestle) {
        this.tipoembalagemnestle = tipoembalagemnestle;
    }

    public Long getCodenderecoap() {
        return codenderecoap;
    }

    public void setCodenderecoap(Long codenderecoap) {
        this.codenderecoap = codenderecoap;
    }

    public Long getCodenderecocx() {
        return codenderecocx;
    }

    public void setCodenderecocx(Long codenderecocx) {
        this.codenderecocx = codenderecocx;
    }

    public BigDecimal getCustorepzfm() {
        return custorepzfm;
    }

    public void setCustorepzfm(BigDecimal custorepzfm) {
        this.custorepzfm = custorepzfm;
    }

    public BigDecimal getCustorepzfmtab() {
        return custorepzfmtab;
    }

    public void setCustorepzfmtab(BigDecimal custorepzfmtab) {
        this.custorepzfmtab = custorepzfmtab;
    }

    public BigDecimal getPrecomaxconsumzfm() {
        return precomaxconsumzfm;
    }

    public void setPrecomaxconsumzfm(BigDecimal precomaxconsumzfm) {
        this.precomaxconsumzfm = precomaxconsumzfm;
    }

    public BigDecimal getPrecomaxconsumzfmtab() {
        return precomaxconsumzfmtab;
    }

    public void setPrecomaxconsumzfmtab(BigDecimal precomaxconsumzfmtab) {
        this.precomaxconsumzfmtab = precomaxconsumzfmtab;
    }

    public BigDecimal getMexiva() {
        return mexiva;
    }

    public void setMexiva(BigDecimal mexiva) {
        this.mexiva = mexiva;
    }

    public BigDecimal getMexieps() {
        return mexieps;
    }

    public void setMexieps(BigDecimal mexieps) {
        this.mexieps = mexieps;
    }

    public BigDecimal getMexfpgc() {
        return mexfpgc;
    }

    public void setMexfpgc(BigDecimal mexfpgc) {
        this.mexfpgc = mexfpgc;
    }

    public String getUsacross() {
        return usacross;
    }

    public void setUsacross(String usacross) {
        this.usacross = usacross;
    }

    public String getUsawms() {
        return usawms;
    }

    public void setUsawms(String usawms) {
        this.usawms = usawms;
    }

    public Integer getCodgenerofiscal() {
        return codgenerofiscal;
    }

    public void setCodgenerofiscal(Integer codgenerofiscal) {
        this.codgenerofiscal = codgenerofiscal;
    }

    public Integer getQtmaxgondula() {
        return qtmaxgondula;
    }

    public void setQtmaxgondula(Integer qtmaxgondula) {
        this.qtmaxgondula = qtmaxgondula;
    }

    public Integer getQtmingondula() {
        return qtmingondula;
    }

    public void setQtmingondula(Integer qtmingondula) {
        this.qtmingondula = qtmingondula;
    }

    public String getUtilizarvasilhame() {
        return utilizarvasilhame;
    }

    public void setUtilizarvasilhame(String utilizarvasilhame) {
        this.utilizarvasilhame = utilizarvasilhame;
    }

    public Integer getCodvasilhame() {
        return codvasilhame;
    }

    public void setCodvasilhame(Integer codvasilhame) {
        this.codvasilhame = codvasilhame;
    }

    public Long getNumseqatu() {
        return numseqatu;
    }

    public void setNumseqatu(Long numseqatu) {
        this.numseqatu = numseqatu;
    }

    public String getTipoembalage() {
        return tipoembalage;
    }

    public void setTipoembalage(String tipoembalage) {
        this.tipoembalage = tipoembalage;
    }

    public Short getTipocarga() {
        return tipocarga;
    }

    public void setTipocarga(Short tipocarga) {
        this.tipocarga = tipocarga;
    }

    public BigDecimal getAliqavulsadare() {
        return aliqavulsadare;
    }

    public void setAliqavulsadare(BigDecimal aliqavulsadare) {
        this.aliqavulsadare = aliqavulsadare;
    }

    public BigDecimal getPercbaseredent() {
        return percbaseredent;
    }

    public void setPercbaseredent(BigDecimal percbaseredent) {
        this.percbaseredent = percbaseredent;
    }

    public BigDecimal getVlipiporkg() {
        return vlipiporkg;
    }

    public void setVlipiporkg(BigDecimal vlipiporkg) {
        this.vlipiporkg = vlipiporkg;
    }

    public Short getTipopiscofinsretido() {
        return tipopiscofinsretido;
    }

    public void setTipopiscofinsretido(Short tipopiscofinsretido) {
        this.tipopiscofinsretido = tipopiscofinsretido;
    }

    public String getEspecificoatividadepr() {
        return especificoatividadepr;
    }

    public void setEspecificoatividadepr(String especificoatividadepr) {
        this.especificoatividadepr = especificoatividadepr;
    }

    public Integer getCodrotinaultalter() {
        return codrotinaultalter;
    }

    public void setCodrotinaultalter(Integer codrotinaultalter) {
        this.codrotinaultalter = codrotinaultalter;
    }

    public String getComissaoporlucratividade() {
        return comissaoporlucratividade;
    }

    public void setComissaoporlucratividade(String comissaoporlucratividade) {
        this.comissaoporlucratividade = comissaoporlucratividade;
    }

    public BigDecimal getVlipipeso() {
        return vlipipeso;
    }

    public void setVlipipeso(BigDecimal vlipipeso) {
        this.vlipipeso = vlipipeso;
    }

    public String getTipocomissao() {
        return tipocomissao;
    }

    public void setTipocomissao(String tipocomissao) {
        this.tipocomissao = tipocomissao;
    }

    public String getTipoestoque() {
        return tipoestoque;
    }

    public void setTipoestoque(String tipoestoque) {
        this.tipoestoque = tipoestoque;
    }

    public BigDecimal getPesopeca() {
        return pesopeca;
    }

    public void setPesopeca(BigDecimal pesopeca) {
        this.pesopeca = pesopeca;
    }

    public String getRestricaotransp() {
        return restricaotransp;
    }

    public void setRestricaotransp(String restricaotransp) {
        this.restricaotransp = restricaotransp;
    }

    public String getCodprazoent() {
        return codprazoent;
    }

    public void setCodprazoent(String codprazoent) {
        this.codprazoent = codprazoent;
    }

    public BigDecimal getQtmetros() {
        return qtmetros;
    }

    public void setQtmetros(BigDecimal qtmetros) {
        this.qtmetros = qtmetros;
    }

    public BigDecimal getPesopalete() {
        return pesopalete;
    }

    public void setPesopalete(BigDecimal pesopalete) {
        this.pesopalete = pesopalete;
    }

    public Long getCodenderecoal() {
        return codenderecoal;
    }

    public void setCodenderecoal(Long codenderecoal) {
        this.codenderecoal = codenderecoal;
    }

    public String getValidarlote() {
        return validarlote;
    }

    public void setValidarlote(String validarlote) {
        this.validarlote = validarlote;
    }

    public Long getCodgrade() {
        return codgrade;
    }

    public void setCodgrade(Long codgrade) {
        this.codgrade = codgrade;
    }

    public Long getCodcor() {
        return codcor;
    }

    public void setCodcor(Long codcor) {
        this.codcor = codcor;
    }

    public Short getColunagrade() {
        return colunagrade;
    }

    public void setColunagrade(Short colunagrade) {
        this.colunagrade = colunagrade;
    }

    public String getIsentoregms() {
        return isentoregms;
    }

    public void setIsentoregms(String isentoregms) {
        this.isentoregms = isentoregms;
    }

    public String getRegms() {
        return regms;
    }

    public void setRegms(String regms) {
        this.regms = regms;
    }

    public Long getCodfiscalbonific() {
        return codfiscalbonific;
    }

    public void setCodfiscalbonific(Long codfiscalbonific) {
        this.codfiscalbonific = codfiscalbonific;
    }

    public Long getCodfiscalsr() {
        return codfiscalsr;
    }

    public void setCodfiscalsr(Long codfiscalsr) {
        this.codfiscalsr = codfiscalsr;
    }

    public BigDecimal getCustorepant() {
        return custorepant;
    }

    public void setCustorepant(BigDecimal custorepant) {
        this.custorepant = custorepant;
    }

    public String getEstoqueporlote() {
        return estoqueporlote;
    }

    public void setEstoqueporlote(String estoqueporlote) {
        this.estoqueporlote = estoqueporlote;
    }

    public Integer getProxnumlote() {
        return proxnumlote;
    }

    public void setProxnumlote(Integer proxnumlote) {
        this.proxnumlote = proxnumlote;
    }

    public String getControlavalidadedolote() {
        return controlavalidadedolote;
    }

    public void setControlavalidadedolote(String controlavalidadedolote) {
        this.controlavalidadedolote = controlavalidadedolote;
    }

    public String getPrefixolote() {
        return prefixolote;
    }

    public void setPrefixolote(String prefixolote) {
        this.prefixolote = prefixolote;
    }

    public Integer getPrazomediovenda() {
        return prazomediovenda;
    }

    public void setPrazomediovenda(Integer prazomediovenda) {
        this.prazomediovenda = prazomediovenda;
    }

    public BigDecimal getPerccredicmpresumido() {
        return perccredicmpresumido;
    }

    public void setPerccredicmpresumido(BigDecimal perccredicmpresumido) {
        this.perccredicmpresumido = perccredicmpresumido;
    }

    public BigDecimal getPontoreposicaoal() {
        return pontoreposicaoal;
    }

    public void setPontoreposicaoal(BigDecimal pontoreposicaoal) {
        this.pontoreposicaoal = pontoreposicaoal;
    }

    public BigDecimal getCapacidadepickingal() {
        return capacidadepickingal;
    }

    public void setCapacidadepickingal(BigDecimal capacidadepickingal) {
        this.capacidadepickingal = capacidadepickingal;
    }

    public String getTiponorma() {
        return tiponorma;
    }

    public void setTiponorma(String tiponorma) {
        this.tiponorma = tiponorma;
    }

    public Short getRecminarm() {
        return recminarm;
    }

    public void setRecminarm(Short recminarm) {
        this.recminarm = recminarm;
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

    public Integer getQtminimaatacado() {
        return qtminimaatacado;
    }

    public void setQtminimaatacado(Integer qtminimaatacado) {
        this.qtminimaatacado = qtminimaatacado;
    }

    public Integer getQtminimaatacadof() {
        return qtminimaatacadof;
    }

    public void setQtminimaatacadof(Integer qtminimaatacadof) {
        this.qtminimaatacadof = qtminimaatacadof;
    }

    public String getConciliaimportacao() {
        return conciliaimportacao;
    }

    public void setConciliaimportacao(String conciliaimportacao) {
        this.conciliaimportacao = conciliaimportacao;
    }

    public BigDecimal getPercbonoutras() {
        return percbonoutras;
    }

    public void setPercbonoutras(BigDecimal percbonoutras) {
        this.percbonoutras = percbonoutras;
    }

    public BigDecimal getPercimportacao() {
        return percimportacao;
    }

    public void setPercimportacao(BigDecimal percimportacao) {
        this.percimportacao = percimportacao;
    }

    public BigDecimal getPercofinsimp() {
        return percofinsimp;
    }

    public void setPercofinsimp(BigDecimal percofinsimp) {
        this.percofinsimp = percofinsimp;
    }

    public BigDecimal getPerpisimp() {
        return perpisimp;
    }

    public void setPerpisimp(BigDecimal perpisimp) {
        this.perpisimp = perpisimp;
    }

    public BigDecimal getVlmaodeobra() {
        return vlmaodeobra;
    }

    public void setVlmaodeobra(BigDecimal vlmaodeobra) {
        this.vlmaodeobra = vlmaodeobra;
    }

    public BigDecimal getPcomprof1() {
        return pcomprof1;
    }

    public void setPcomprof1(BigDecimal pcomprof1) {
        this.pcomprof1 = pcomprof1;
    }

    public String getCodrisco() {
        return codrisco;
    }

    public void setCodrisco(String codrisco) {
        this.codrisco = codrisco;
    }

    public String getCodacondicionamento() {
        return codacondicionamento;
    }

    public void setCodacondicionamento(String codacondicionamento) {
        this.codacondicionamento = codacondicionamento;
    }

    public String getConferenocheckout() {
        return conferenocheckout;
    }

    public void setConferenocheckout(String conferenocheckout) {
        this.conferenocheckout = conferenocheckout;
    }

    public String getVlcalorico() {
        return vlcalorico;
    }

    public void setVlcalorico(String vlcalorico) {
        this.vlcalorico = vlcalorico;
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public String getLipideo() {
        return lipideo;
    }

    public void setLipideo(String lipideo) {
        this.lipideo = lipideo;
    }

    public String getUmidade() {
        return umidade;
    }

    public void setUmidade(String umidade) {
        this.umidade = umidade;
    }

    public String getCol95() {
        return col95;
    }

    public void setCol95(String col95) {
        this.col95 = col95;
    }

    public String getSalmonela() {
        return salmonela;
    }

    public void setSalmonela(String salmonela) {
        this.salmonela = salmonela;
    }

    public String getBoloresleveduras() {
        return boloresleveduras;
    }

    public void setBoloresleveduras(String boloresleveduras) {
        this.boloresleveduras = boloresleveduras;
    }

    public String getEstfaureaus() {
        return estfaureaus;
    }

    public void setEstfaureaus(String estfaureaus) {
        this.estfaureaus = estfaureaus;
    }

    public String getMofado() {
        return mofado;
    }

    public void setMofado(String mofado) {
        this.mofado = mofado;
    }

    public String getTotdefeito() {
        return totdefeito;
    }

    public void setTotdefeito(String totdefeito) {
        this.totdefeito = totdefeito;
    }

    public String getCodagrupmapasep() {
        return codagrupmapasep;
    }

    public void setCodagrupmapasep(String codagrupmapasep) {
        this.codagrupmapasep = codagrupmapasep;
    }

    public BigDecimal getPercperdakg() {
        return percperdakg;
    }

    public void setPercperdakg(BigDecimal percperdakg) {
        this.percperdakg = percperdakg;
    }

    public String getAproveitacredicms() {
        return aproveitacredicms;
    }

    public void setAproveitacredicms(String aproveitacredicms) {
        this.aproveitacredicms = aproveitacredicms;
    }

    public String getAproveitacredpiscofins() {
        return aproveitacredpiscofins;
    }

    public void setAproveitacredpiscofins(String aproveitacredpiscofins) {
        this.aproveitacredpiscofins = aproveitacredpiscofins;
    }

    public BigDecimal getCustofornec() {
        return custofornec;
    }

    public void setCustofornec(BigDecimal custofornec) {
        this.custofornec = custofornec;
    }

    public BigDecimal getPercdescicms() {
        return percdescicms;
    }

    public void setPercdescicms(BigDecimal percdescicms) {
        this.percdescicms = percdescicms;
    }

    public BigDecimal getPercacres() {
        return percacres;
    }

    public void setPercacres(BigDecimal percacres) {
        this.percacres = percacres;
    }

    public BigDecimal getPtabelafornec() {
        return ptabelafornec;
    }

    public void setPtabelafornec(BigDecimal ptabelafornec) {
        this.ptabelafornec = ptabelafornec;
    }

    public String getChecarmultiplovendabnf() {
        return checarmultiplovendabnf;
    }

    public void setChecarmultiplovendabnf(String checarmultiplovendabnf) {
        this.checarmultiplovendabnf = checarmultiplovendabnf;
    }

    public BigDecimal getVlicmsantecipado() {
        return vlicmsantecipado;
    }

    public void setVlicmsantecipado(BigDecimal vlicmsantecipado) {
        this.vlicmsantecipado = vlicmsantecipado;
    }

    public String getClassecomissao() {
        return classecomissao;
    }

    public void setClassecomissao(String classecomissao) {
        this.classecomissao = classecomissao;
    }

    public Integer getFracaocipa() {
        return fracaocipa;
    }

    public void setFracaocipa(Integer fracaocipa) {
        this.fracaocipa = fracaocipa;
    }

    public String getAnalisedesc() {
        return analisedesc;
    }

    public void setAnalisedesc(String analisedesc) {
        this.analisedesc = analisedesc;
    }

    public String getVolpesmed() {
        return volpesmed;
    }

    public void setVolpesmed(String volpesmed) {
        this.volpesmed = volpesmed;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getDensidade() {
        return densidade;
    }

    public void setDensidade(String densidade) {
        this.densidade = densidade;
    }

    public String getDoseamento() {
        return doseamento;
    }

    public void setDoseamento(String doseamento) {
        this.doseamento = doseamento;
    }

    public String getContmicrobiana() {
        return contmicrobiana;
    }

    public void setContmicrobiana(String contmicrobiana) {
        this.contmicrobiana = contmicrobiana;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getImpureza() {
        return impureza;
    }

    public void setImpureza(String impureza) {
        this.impureza = impureza;
    }

    public String getFriabilidade() {
        return friabilidade;
    }

    public void setFriabilidade(String friabilidade) {
        this.friabilidade = friabilidade;
    }

    public String getDesintegracao() {
        return desintegracao;
    }

    public void setDesintegracao(String desintegracao) {
        this.desintegracao = desintegracao;
    }

    public String getDissolucao() {
        return dissolucao;
    }

    public void setDissolucao(String dissolucao) {
        this.dissolucao = dissolucao;
    }

    public String getUniformidade() {
        return uniformidade;
    }

    public void setUniformidade(String uniformidade) {
        this.uniformidade = uniformidade;
    }

    public String getDirassinatura() {
        return dirassinatura;
    }

    public void setDirassinatura(String dirassinatura) {
        this.dirassinatura = dirassinatura;
    }

    public Integer getVersanalise() {
        return versanalise;
    }

    public void setVersanalise(Integer versanalise) {
        this.versanalise = versanalise;
    }

    public Integer getContloganalise() {
        return contloganalise;
    }

    public void setContloganalise(Integer contloganalise) {
        this.contloganalise = contloganalise;
    }

    public String getPesqpatogenos() {
        return pesqpatogenos;
    }

    public void setPesqpatogenos(String pesqpatogenos) {
        this.pesqpatogenos = pesqpatogenos;
    }

    public String getUsapulmaoregulador() {
        return usapulmaoregulador;
    }

    public void setUsapulmaoregulador(String usapulmaoregulador) {
        this.usapulmaoregulador = usapulmaoregulador;
    }

    public Short getQtpulmaoregulador() {
        return qtpulmaoregulador;
    }

    public void setQtpulmaoregulador(Short qtpulmaoregulador) {
        this.qtpulmaoregulador = qtpulmaoregulador;
    }

    public Long getCodenderecopa() {
        return codenderecopa;
    }

    public void setCodenderecopa(Long codenderecopa) {
        this.codenderecopa = codenderecopa;
    }

    public BigDecimal getCapacidadepa() {
        return capacidadepa;
    }

    public void setCapacidadepa(BigDecimal capacidadepa) {
        this.capacidadepa = capacidadepa;
    }

    public BigDecimal getPontoreposicaopa() {
        return pontoreposicaopa;
    }

    public void setPontoreposicaopa(BigDecimal pontoreposicaopa) {
        this.pontoreposicaopa = pontoreposicaopa;
    }

    public String getDestaquefichatecnica() {
        return destaquefichatecnica;
    }

    public void setDestaquefichatecnica(String destaquefichatecnica) {
        this.destaquefichatecnica = destaquefichatecnica;
    }

    public Short getNumpag() {
        return numpag;
    }

    public void setNumpag(Short numpag) {
        this.numpag = numpag;
    }

    public String getLetrapagina() {
        return letrapagina;
    }

    public void setLetrapagina(String letrapagina) {
        this.letrapagina = letrapagina;
    }

    public Short getSeqpagina() {
        return seqpagina;
    }

    public void setSeqpagina(Short seqpagina) {
        this.seqpagina = seqpagina;
    }

    public String getCodonu() {
        return codonu;
    }

    public void setCodonu(String codonu) {
        this.codonu = codonu;
    }

    public String getNaturezaproduto() {
        return naturezaproduto;
    }

    public void setNaturezaproduto(String naturezaproduto) {
        this.naturezaproduto = naturezaproduto;
    }

    public LocalDate getDatavocollect() {
        return datavocollect;
    }

    public void setDatavocollect(LocalDate datavocollect) {
        this.datavocollect = datavocollect;
    }

    public BigDecimal getPercicmsfretefobst() {
        return percicmsfretefobst;
    }

    public void setPercicmsfretefobst(BigDecimal percicmsfretefobst) {
        this.percicmsfretefobst = percicmsfretefobst;
    }

    public BigDecimal getPercicmsfretefobstbcr() {
        return percicmsfretefobstbcr;
    }

    public void setPercicmsfretefobstbcr(BigDecimal percicmsfretefobstbcr) {
        this.percicmsfretefobstbcr = percicmsfretefobstbcr;
    }

    public BigDecimal getPercipivendatab() {
        return percipivendatab;
    }

    public void setPercipivendatab(BigDecimal percipivendatab) {
        this.percipivendatab = percipivendatab;
    }

    public BigDecimal getVlpautaipivenda() {
        return vlpautaipivenda;
    }

    public void setVlpautaipivenda(BigDecimal vlpautaipivenda) {
        this.vlpautaipivenda = vlpautaipivenda;
    }

    public BigDecimal getVlpautaipivendatab() {
        return vlpautaipivendatab;
    }

    public void setVlpautaipivendatab(BigDecimal vlpautaipivendatab) {
        this.vlpautaipivendatab = vlpautaipivendatab;
    }

    public BigDecimal getVlipiporkgvenda() {
        return vlipiporkgvenda;
    }

    public void setVlipiporkgvenda(BigDecimal vlipiporkgvenda) {
        this.vlipiporkgvenda = vlipiporkgvenda;
    }

    public BigDecimal getVlipiporkgvendatab() {
        return vlipiporkgvendatab;
    }

    public void setVlipiporkgvendatab(BigDecimal vlipiporkgvendatab) {
        this.vlipiporkgvendatab = vlipiporkgvendatab;
    }

    public Short getCodfiscalenttransf() {
        return codfiscalenttransf;
    }

    public void setCodfiscalenttransf(Short codfiscalenttransf) {
        this.codfiscalenttransf = codfiscalenttransf;
    }

    public BigDecimal getPrazominvalidade() {
        return prazominvalidade;
    }

    public void setPrazominvalidade(BigDecimal prazominvalidade) {
        this.prazominvalidade = prazominvalidade;
    }

    public BigDecimal getPrazomaxvalidade() {
        return prazomaxvalidade;
    }

    public void setPrazomaxvalidade(BigDecimal prazomaxvalidade) {
        this.prazomaxvalidade = prazomaxvalidade;
    }

    public Integer getCodprodembalagem() {
        return codprodembalagem;
    }

    public void setCodprodembalagem(Integer codprodembalagem) {
        this.codprodembalagem = codprodembalagem;
    }

    public String getConsideraricmsantecipcusto() {
        return consideraricmsantecipcusto;
    }

    public void setConsideraricmsantecipcusto(String consideraricmsantecipcusto) {
        this.consideraricmsantecipcusto = consideraricmsantecipcusto;
    }

    public BigDecimal getPercofins() {
        return percofins;
    }

    public void setPercofins(BigDecimal percofins) {
        this.percofins = percofins;
    }

    public BigDecimal getPercredicms() {
        return percredicms;
    }

    public void setPercredicms(BigDecimal percredicms) {
        this.percredicms = percredicms;
    }

    public LocalDate getDtimportintegracao() {
        return dtimportintegracao;
    }

    public void setDtimportintegracao(LocalDate dtimportintegracao) {
        this.dtimportintegracao = dtimportintegracao;
    }

    public LocalDate getDtultalter() {
        return dtultalter;
    }

    public void setDtultalter(LocalDate dtultalter) {
        this.dtultalter = dtultalter;
    }

    public String getUmidadeanalise() {
        return umidadeanalise;
    }

    public void setUmidadeanalise(String umidadeanalise) {
        this.umidadeanalise = umidadeanalise;
    }

    public BigDecimal getPercdiferencakgfrio() {
        return percdiferencakgfrio;
    }

    public void setPercdiferencakgfrio(BigDecimal percdiferencakgfrio) {
        this.percdiferencakgfrio = percdiferencakgfrio;
    }

    public BigDecimal getRedbasealiqextbcr() {
        return redbasealiqextbcr;
    }

    public void setRedbasealiqextbcr(BigDecimal redbasealiqextbcr) {
        this.redbasealiqextbcr = redbasealiqextbcr;
    }

    public BigDecimal getPercaliqextbcr() {
        return percaliqextbcr;
    }

    public void setPercaliqextbcr(BigDecimal percaliqextbcr) {
        this.percaliqextbcr = percaliqextbcr;
    }

    public BigDecimal getPercaliqintbcr() {
        return percaliqintbcr;
    }

    public void setPercaliqintbcr(BigDecimal percaliqintbcr) {
        this.percaliqintbcr = percaliqintbcr;
    }

    public BigDecimal getVladicionalbcstbcr() {
        return vladicionalbcstbcr;
    }

    public void setVladicionalbcstbcr(BigDecimal vladicionalbcstbcr) {
        this.vladicionalbcstbcr = vladicionalbcstbcr;
    }

    public BigDecimal getVlpautabcr() {
        return vlpautabcr;
    }

    public void setVlpautabcr(BigDecimal vlpautabcr) {
        this.vlpautabcr = vlpautabcr;
    }

    public BigDecimal getRedbaseivabcr() {
        return redbaseivabcr;
    }

    public void setRedbaseivabcr(BigDecimal redbaseivabcr) {
        this.redbaseivabcr = redbaseivabcr;
    }

    public BigDecimal getPercivabcr() {
        return percivabcr;
    }

    public void setPercivabcr(BigDecimal percivabcr) {
        this.percivabcr = percivabcr;
    }

    public String getCalccredipi() {
        return calccredipi;
    }

    public void setCalccredipi(String calccredipi) {
        this.calccredipi = calccredipi;
    }

    public String getEnviarforcavendas() {
        return enviarforcavendas;
    }

    public void setEnviarforcavendas(String enviarforcavendas) {
        this.enviarforcavendas = enviarforcavendas;
    }

    public String getDadostecnicos() {
        return dadostecnicos;
    }

    public void setDadostecnicos(String dadostecnicos) {
        this.dadostecnicos = dadostecnicos;
    }

    public BigDecimal getPercimpprodutorural() {
        return percimpprodutorural;
    }

    public void setPercimpprodutorural(BigDecimal percimpprodutorural) {
        this.percimpprodutorural = percimpprodutorural;
    }

    public String getUtilizaprecomaxconsumidor() {
        return utilizaprecomaxconsumidor;
    }

    public void setUtilizaprecomaxconsumidor(String utilizaprecomaxconsumidor) {
        this.utilizaprecomaxconsumidor = utilizaprecomaxconsumidor;
    }

    public BigDecimal getPercicmsdiferido() {
        return percicmsdiferido;
    }

    public void setPercicmsdiferido(BigDecimal percicmsdiferido) {
        this.percicmsdiferido = percicmsdiferido;
    }

    public BigDecimal getPesoembalagem() {
        return pesoembalagem;
    }

    public void setPesoembalagem(BigDecimal pesoembalagem) {
        this.pesoembalagem = pesoembalagem;
    }

    public String getExDoseamento() {
        return exDoseamento;
    }

    public void setExDoseamento(String exDoseamento) {
        this.exDoseamento = exDoseamento;
    }

    public String getExImpureza() {
        return exImpureza;
    }

    public void setExImpureza(String exImpureza) {
        this.exImpureza = exImpureza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPrazogarantia() {
        return prazogarantia;
    }

    public void setPrazogarantia(Integer prazogarantia) {
        this.prazogarantia = prazogarantia;
    }

    public String getControlanumseria() {
        return controlanumseria;
    }

    public void setControlanumseria(String controlanumseria) {
        this.controlanumseria = controlanumseria;
    }

    public BigDecimal getPvenda() {
        return pvenda;
    }

    public void setPvenda(BigDecimal pvenda) {
        this.pvenda = pvenda;
    }

    public LocalDate getDtultaltersrvprc() {
        return dtultaltersrvprc;
    }

    public void setDtultaltersrvprc(LocalDate dtultaltersrvprc) {
        this.dtultaltersrvprc = dtultaltersrvprc;
    }

    public String getExUmidade() {
        return exUmidade;
    }

    public void setExUmidade(String exUmidade) {
        this.exUmidade = exUmidade;
    }

    public String getExCol95() {
        return exCol95;
    }

    public void setExCol95(String exCol95) {
        this.exCol95 = exCol95;
    }

    public String getExSalmonela() {
        return exSalmonela;
    }

    public void setExSalmonela(String exSalmonela) {
        this.exSalmonela = exSalmonela;
    }

    public String getExBoloresleveduras() {
        return exBoloresleveduras;
    }

    public void setExBoloresleveduras(String exBoloresleveduras) {
        this.exBoloresleveduras = exBoloresleveduras;
    }

    public String getExEstfaureaus() {
        return exEstfaureaus;
    }

    public void setExEstfaureaus(String exEstfaureaus) {
        this.exEstfaureaus = exEstfaureaus;
    }

    public String getExMofado() {
        return exMofado;
    }

    public void setExMofado(String exMofado) {
        this.exMofado = exMofado;
    }

    public String getExTotdefeito() {
        return exTotdefeito;
    }

    public void setExTotdefeito(String exTotdefeito) {
        this.exTotdefeito = exTotdefeito;
    }

    public String getExVlcalorico() {
        return exVlcalorico;
    }

    public void setExVlcalorico(String exVlcalorico) {
        this.exVlcalorico = exVlcalorico;
    }

    public String getExProteina() {
        return exProteina;
    }

    public void setExProteina(String exProteina) {
        this.exProteina = exProteina;
    }

    public String getExLipideo() {
        return exLipideo;
    }

    public void setExLipideo(String exLipideo) {
        this.exLipideo = exLipideo;
    }

    public String getExVolpesmed() {
        return exVolpesmed;
    }

    public void setExVolpesmed(String exVolpesmed) {
        this.exVolpesmed = exVolpesmed;
    }

    public String getExAnalisedesc() {
        return exAnalisedesc;
    }

    public void setExAnalisedesc(String exAnalisedesc) {
        this.exAnalisedesc = exAnalisedesc;
    }

    public String getExUniformidade() {
        return exUniformidade;
    }

    public void setExUniformidade(String exUniformidade) {
        this.exUniformidade = exUniformidade;
    }

    public String getExDissolucao() {
        return exDissolucao;
    }

    public void setExDissolucao(String exDissolucao) {
        this.exDissolucao = exDissolucao;
    }

    public String getExDesintegracao() {
        return exDesintegracao;
    }

    public void setExDesintegracao(String exDesintegracao) {
        this.exDesintegracao = exDesintegracao;
    }

    public String getExFriabilidade() {
        return exFriabilidade;
    }

    public void setExFriabilidade(String exFriabilidade) {
        this.exFriabilidade = exFriabilidade;
    }

    public String getExIdentificacao() {
        return exIdentificacao;
    }

    public void setExIdentificacao(String exIdentificacao) {
        this.exIdentificacao = exIdentificacao;
    }

    public String getExPesqpatogenos() {
        return exPesqpatogenos;
    }

    public void setExPesqpatogenos(String exPesqpatogenos) {
        this.exPesqpatogenos = exPesqpatogenos;
    }

    public String getExContmicrobiana() {
        return exContmicrobiana;
    }

    public void setExContmicrobiana(String exContmicrobiana) {
        this.exContmicrobiana = exContmicrobiana;
    }

    public String getExDensidade() {
        return exDensidade;
    }

    public void setExDensidade(String exDensidade) {
        this.exDensidade = exDensidade;
    }

    public String getExPh() {
        return exPh;
    }

    public void setExPh(String exPh) {
        this.exPh = exPh;
    }

    public BigDecimal getUndporembalagem() {
        return undporembalagem;
    }

    public void setUndporembalagem(BigDecimal undporembalagem) {
        this.undporembalagem = undporembalagem;
    }

    public BigDecimal getPercdespforanf() {
        return percdespforanf;
    }

    public void setPercdespforanf(BigDecimal percdespforanf) {
        this.percdespforanf = percdespforanf;
    }

    public Short getPrazomaxindenizacao() {
        return prazomaxindenizacao;
    }

    public void setPrazomaxindenizacao(Short prazomaxindenizacao) {
        this.prazomaxindenizacao = prazomaxindenizacao;
    }

    public String getCodfilialretira() {
        return codfilialretira;
    }

    public void setCodfilialretira(String codfilialretira) {
        this.codfilialretira = codfilialretira;
    }

    public Integer getCodmarca() {
        return codmarca;
    }

    public void setCodmarca(Integer codmarca) {
        this.codmarca = codmarca;
    }

    public Long getCodfiscalconsigfat() {
        return codfiscalconsigfat;
    }

    public void setCodfiscalconsigfat(Long codfiscalconsigfat) {
        this.codfiscalconsigfat = codfiscalconsigfat;
    }

    public BigDecimal getPercdifaliquotas() {
        return percdifaliquotas;
    }

    public void setPercdifaliquotas(BigDecimal percdifaliquotas) {
        this.percdifaliquotas = percdifaliquotas;
    }

    public BigDecimal getVldifaliquotas() {
        return vldifaliquotas;
    }

    public void setVldifaliquotas(BigDecimal vldifaliquotas) {
        this.vldifaliquotas = vldifaliquotas;
    }

    public String getPesovariavel() {
        return pesovariavel;
    }

    public void setPesovariavel(String pesovariavel) {
        this.pesovariavel = pesovariavel;
    }

    public BigDecimal getVlpautaicms() {
        return vlpautaicms;
    }

    public void setVlpautaicms(BigDecimal vlpautaicms) {
        this.vlpautaicms = vlpautaicms;
    }

    public BigDecimal getVladicionalbcst() {
        return vladicionalbcst;
    }

    public void setVladicionalbcst(BigDecimal vladicionalbcst) {
        this.vladicionalbcst = vladicionalbcst;
    }

    public String getCompraconsignado() {
        return compraconsignado;
    }

    public void setCompraconsignado(String compraconsignado) {
        this.compraconsignado = compraconsignado;
    }

    public Long getCodfiscalconsig() {
        return codfiscalconsig;
    }

    public void setCodfiscalconsig(Long codfiscalconsig) {
        this.codfiscalconsig = codfiscalconsig;
    }

    public String getControlanumserie() {
        return controlanumserie;
    }

    public void setControlanumserie(String controlanumserie) {
        this.controlanumserie = controlanumserie;
    }

    public Short getQtdemaxseparpedido() {
        return qtdemaxseparpedido;
    }

    public void setQtdemaxseparpedido(Short qtdemaxseparpedido) {
        this.qtdemaxseparpedido = qtdemaxseparpedido;
    }

    public String getImunetrib() {
        return imunetrib;
    }

    public void setImunetrib(String imunetrib) {
        this.imunetrib = imunetrib;
    }

    public Integer getCodformatopapel() {
        return codformatopapel;
    }

    public void setCodformatopapel(Integer codformatopapel) {
        this.codformatopapel = codformatopapel;
    }

    public BigDecimal getGramatura() {
        return gramatura;
    }

    public void setGramatura(BigDecimal gramatura) {
        this.gramatura = gramatura;
    }

    public Short getCodunidmedidanf() {
        return codunidmedidanf;
    }

    public void setCodunidmedidanf(Short codunidmedidanf) {
        this.codunidmedidanf = codunidmedidanf;
    }

    public BigDecimal getFatorconversaokg() {
        return fatorconversaokg;
    }

    public void setFatorconversaokg(BigDecimal fatorconversaokg) {
        this.fatorconversaokg = fatorconversaokg;
    }

    public String getDescpapel() {
        return descpapel;
    }

    public void setDescpapel(String descpapel) {
        this.descpapel = descpapel;
    }

    public String getPrecificestrangeira() {
        return precificestrangeira;
    }

    public void setPrecificestrangeira(String precificestrangeira) {
        this.precificestrangeira = precificestrangeira;
    }

    public BigDecimal getPercseguro() {
        return percseguro;
    }

    public void setPercseguro(BigDecimal percseguro) {
        this.percseguro = percseguro;
    }

    public BigDecimal getPercdespdentronf() {
        return percdespdentronf;
    }

    public void setPercdespdentronf(BigDecimal percdespdentronf) {
        this.percdespdentronf = percdespdentronf;
    }

    public Short getQtdmaxsepararpedido() {
        return qtdmaxsepararpedido;
    }

    public void setQtdmaxsepararpedido(Short qtdmaxsepararpedido) {
        this.qtdmaxsepararpedido = qtdmaxsepararpedido;
    }

    public Integer getNumdiasvalidademin() {
        return numdiasvalidademin;
    }

    public void setNumdiasvalidademin(Integer numdiasvalidademin) {
        this.numdiasvalidademin = numdiasvalidademin;
    }

    public Long getCodprodrelev() {
        return codprodrelev;
    }

    public void setCodprodrelev(Long codprodrelev) {
        this.codprodrelev = codprodrelev;
    }

    public LocalDate getDtaltcustofornec() {
        return dtaltcustofornec;
    }

    public void setDtaltcustofornec(LocalDate dtaltcustofornec) {
        this.dtaltcustofornec = dtaltcustofornec;
    }

    public String getControlapatrimonio() {
        return controlapatrimonio;
    }

    public void setControlapatrimonio(String controlapatrimonio) {
        this.controlapatrimonio = controlapatrimonio;
    }

    public String getFundapiano() {
        return fundapiano;
    }

    public void setFundapiano(String fundapiano) {
        this.fundapiano = fundapiano;
    }

    public BigDecimal getPercdescicmsdif() {
        return percdescicmsdif;
    }

    public void setPercdescicmsdif(BigDecimal percdescicmsdif) {
        this.percdescicmsdif = percdescicmsdif;
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

    public BigDecimal getPercaliqextguia() {
        return percaliqextguia;
    }

    public void setPercaliqextguia(BigDecimal percaliqextguia) {
        this.percaliqextguia = percaliqextguia;
    }

    public BigDecimal getPisretido() {
        return pisretido;
    }

    public void setPisretido(BigDecimal pisretido) {
        this.pisretido = pisretido;
    }

    public BigDecimal getCofinsretido() {
        return cofinsretido;
    }

    public void setCofinsretido(BigDecimal cofinsretido) {
        this.cofinsretido = cofinsretido;
    }

    public BigDecimal getIrretido() {
        return irretido;
    }

    public void setIrretido(BigDecimal irretido) {
        this.irretido = irretido;
    }

    public BigDecimal getCsllretido() {
        return csllretido;
    }

    public void setCsllretido(BigDecimal csllretido) {
        this.csllretido = csllretido;
    }

    public String getExtipi() {
        return extipi;
    }

    public void setExtipi(String extipi) {
        this.extipi = extipi;
    }

    public BigDecimal getBasepiscofinslitragem() {
        return basepiscofinslitragem;
    }

    public void setBasepiscofinslitragem(BigDecimal basepiscofinslitragem) {
        this.basepiscofinslitragem = basepiscofinslitragem;
    }

    public BigDecimal getValorpislitragem() {
        return valorpislitragem;
    }

    public void setValorpislitragem(BigDecimal valorpislitragem) {
        this.valorpislitragem = valorpislitragem;
    }

    public BigDecimal getValorcofinslitragem() {
        return valorcofinslitragem;
    }

    public void setValorcofinslitragem(BigDecimal valorcofinslitragem) {
        this.valorcofinslitragem = valorcofinslitragem;
    }

    public String getInventarioparcial() {
        return inventarioparcial;
    }

    public void setInventarioparcial(String inventarioparcial) {
        this.inventarioparcial = inventarioparcial;
    }

    public String getAnvisa() {
        return anvisa;
    }

    public void setAnvisa(String anvisa) {
        this.anvisa = anvisa;
    }

    public String getSimpro() {
        return simpro;
    }

    public void setSimpro(String simpro) {
        this.simpro = simpro;
    }

    public BigDecimal getVlraplicint() {
        return vlraplicint;
    }

    public void setVlraplicint(BigDecimal vlraplicint) {
        this.vlraplicint = vlraplicint;
    }

    public Short getSugvenda() {
        return sugvenda;
    }

    public void setSugvenda(Short sugvenda) {
        this.sugvenda = sugvenda;
    }

    public BigDecimal getVlpautapiscofins() {
        return vlpautapiscofins;
    }

    public void setVlpautapiscofins(BigDecimal vlpautapiscofins) {
        this.vlpautapiscofins = vlpautapiscofins;
    }

    public String getUsapiscofinslit() {
        return usapiscofinslit;
    }

    public void setUsapiscofinslit(String usapiscofinslit) {
        this.usapiscofinslit = usapiscofinslit;
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

    public BigDecimal getVlpautapiscofinsimp() {
        return vlpautapiscofinsimp;
    }

    public void setVlpautapiscofinsimp(BigDecimal vlpautapiscofinsimp) {
        this.vlpautapiscofinsimp = vlpautapiscofinsimp;
    }

    public String getUsapiscofinslitimp() {
        return usapiscofinslitimp;
    }

    public void setUsapiscofinslitimp(String usapiscofinslitimp) {
        this.usapiscofinslitimp = usapiscofinslitimp;
    }

    public BigDecimal getBasepiscofinslitimp() {
        return basepiscofinslitimp;
    }

    public void setBasepiscofinslitimp(BigDecimal basepiscofinslitimp) {
        this.basepiscofinslitimp = basepiscofinslitimp;
    }

    public BigDecimal getVlpislitimp() {
        return vlpislitimp;
    }

    public void setVlpislitimp(BigDecimal vlpislitimp) {
        this.vlpislitimp = vlpislitimp;
    }

    public BigDecimal getVlcofinslitimp() {
        return vlcofinslitimp;
    }

    public void setVlcofinslitimp(BigDecimal vlcofinslitimp) {
        this.vlcofinslitimp = vlcofinslitimp;
    }

    public Short getCodsittribpiscofins() {
        return codsittribpiscofins;
    }

    public void setCodsittribpiscofins(Short codsittribpiscofins) {
        this.codsittribpiscofins = codsittribpiscofins;
    }

    public String getRotinalanc() {
        return rotinalanc;
    }

    public void setRotinalanc(String rotinalanc) {
        this.rotinalanc = rotinalanc;
    }

    public BigDecimal getVlfreteporkg() {
        return vlfreteporkg;
    }

    public void setVlfreteporkg(BigDecimal vlfreteporkg) {
        this.vlfreteporkg = vlfreteporkg;
    }

    public Short getCodtribpiscofins() {
        return codtribpiscofins;
    }

    public void setCodtribpiscofins(Short codtribpiscofins) {
        this.codtribpiscofins = codtribpiscofins;
    }

    public BigDecimal getPercmvaorig() {
        return percmvaorig;
    }

    public void setPercmvaorig(BigDecimal percmvaorig) {
        this.percmvaorig = percmvaorig;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public String getAplicredbaseivapliq() {
        return aplicredbaseivapliq;
    }

    public void setAplicredbaseivapliq(String aplicredbaseivapliq) {
        this.aplicredbaseivapliq = aplicredbaseivapliq;
    }

    public String getAplicredbaseivapliqbcr() {
        return aplicredbaseivapliqbcr;
    }

    public void setAplicredbaseivapliqbcr(String aplicredbaseivapliqbcr) {
        this.aplicredbaseivapliqbcr = aplicredbaseivapliqbcr;
    }

    public LocalDate getDtinicontlote() {
        return dtinicontlote;
    }

    public void setDtinicontlote(LocalDate dtinicontlote) {
        this.dtinicontlote = dtinicontlote;
    }

    public String getClasseflow() {
        return classeflow;
    }

    public void setClasseflow(String classeflow) {
        this.classeflow = classeflow;
    }

    public Integer getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(Integer concentracao) {
        this.concentracao = concentracao;
    }

    public BigDecimal getVlipi() {
        return vlipi;
    }

    public void setVlipi(BigDecimal vlipi) {
        this.vlipi = vlipi;
    }

    public String getSittributdevfornec() {
        return sittributdevfornec;
    }

    public void setSittributdevfornec(String sittributdevfornec) {
        this.sittributdevfornec = sittributdevfornec;
    }

    public Integer getCodfiscaldevfornec() {
        return codfiscaldevfornec;
    }

    public void setCodfiscaldevfornec(Integer codfiscaldevfornec) {
        this.codfiscaldevfornec = codfiscaldevfornec;
    }

    public Integer getPrazomaxvenda() {
        return prazomaxvenda;
    }

    public void setPrazomaxvenda(Integer prazomaxvenda) {
        this.prazomaxvenda = prazomaxvenda;
    }

    public String getCatergoria() {
        return catergoria;
    }

    public void setCatergoria(String catergoria) {
        this.catergoria = catergoria;
    }

    public Integer getCodlinha() {
        return codlinha;
    }

    public void setCodlinha(Integer codlinha) {
        this.codlinha = codlinha;
    }

    public BigDecimal getPercquebraproducao() {
        return percquebraproducao;
    }

    public void setPercquebraproducao(BigDecimal percquebraproducao) {
        this.percquebraproducao = percquebraproducao;
    }

    public String getPermiteproducao() {
        return permiteproducao;
    }

    public void setPermiteproducao(String permiteproducao) {
        this.permiteproducao = permiteproducao;
    }

    public Integer getLinhaprod() {
        return linhaprod;
    }

    public void setLinhaprod(Integer linhaprod) {
        this.linhaprod = linhaprod;
    }

    public BigDecimal getQtproduzir() {
        return qtproduzir;
    }

    public void setQtproduzir(BigDecimal qtproduzir) {
        this.qtproduzir = qtproduzir;
    }

    public String getAplicpercivapauta() {
        return aplicpercivapauta;
    }

    public void setAplicpercivapauta(String aplicpercivapauta) {
        this.aplicpercivapauta = aplicpercivapauta;
    }

    public Integer getCodfiscalenttv9() {
        return codfiscalenttv9;
    }

    public void setCodfiscalenttv9(Integer codfiscalenttv9) {
        this.codfiscalenttv9 = codfiscalenttv9;
    }

    public BigDecimal getLitragem() {
        return litragem;
    }

    public void setLitragem(BigDecimal litragem) {
        this.litragem = litragem;
    }

    public String getNomeecommerce() {
        return nomeecommerce;
    }

    public void setNomeecommerce(String nomeecommerce) {
        this.nomeecommerce = nomeecommerce;
    }

    public String getTituloecommerce() {
        return tituloecommerce;
    }

    public void setTituloecommerce(String tituloecommerce) {
        this.tituloecommerce = tituloecommerce;
    }

    public String getSubtituloecommerce() {
        return subtituloecommerce;
    }

    public void setSubtituloecommerce(String subtituloecommerce) {
        this.subtituloecommerce = subtituloecommerce;
    }

    public String getDiretoriofotos() {
        return diretoriofotos;
    }

    public void setDiretoriofotos(String diretoriofotos) {
        this.diretoriofotos = diretoriofotos;
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

    public String getCodncmex() {
        return codncmex;
    }

    public void setCodncmex(String codncmex) {
        this.codncmex = codncmex;
    }

    public Short getCodlinhanestle() {
        return codlinhanestle;
    }

    public void setCodlinhanestle(Short codlinhanestle) {
        this.codlinhanestle = codlinhanestle;
    }

    public Short getGtincodauxiliar() {
        return gtincodauxiliar;
    }

    public void setGtincodauxiliar(Short gtincodauxiliar) {
        this.gtincodauxiliar = gtincodauxiliar;
    }

    public Short getGtincodauxiliar2() {
        return gtincodauxiliar2;
    }

    public void setGtincodauxiliar2(Short gtincodauxiliar2) {
        this.gtincodauxiliar2 = gtincodauxiliar2;
    }

    public Short getCodsittribpiscofinsdev() {
        return codsittribpiscofinsdev;
    }

    public void setCodsittribpiscofinsdev(Short codsittribpiscofinsdev) {
        this.codsittribpiscofinsdev = codsittribpiscofinsdev;
    }

    public String getSittributent() {
        return sittributent;
    }

    public void setSittributent(String sittributent) {
        this.sittributent = sittributent;
    }

    public String getSittributdev() {
        return sittributdev;
    }

    public void setSittributdev(String sittributdev) {
        this.sittributdev = sittributdev;
    }

    public String getGeraicmslivrofiscaldevfornec() {
        return geraicmslivrofiscaldevfornec;
    }

    public void setGeraicmslivrofiscaldevfornec(String geraicmslivrofiscaldevfornec) {
        this.geraicmslivrofiscaldevfornec = geraicmslivrofiscaldevfornec;
    }

    public String getSubstancia() {
        return substancia;
    }

    public void setSubstancia(String substancia) {
        this.substancia = substancia;
    }

    public String getCodtablit() {
        return codtablit;
    }

    public void setCodtablit(String codtablit) {
        this.codtablit = codtablit;
    }

    public String getCodgrulit() {
        return codgrulit;
    }

    public void setCodgrulit(String codgrulit) {
        this.codgrulit = codgrulit;
    }

    public String getIpiporvalor() {
        return ipiporvalor;
    }

    public void setIpiporvalor(String ipiporvalor) {
        this.ipiporvalor = ipiporvalor;
    }

    public BigDecimal getPerccargatribmedia() {
        return perccargatribmedia;
    }

    public void setPerccargatribmedia(BigDecimal perccargatribmedia) {
        this.perccargatribmedia = perccargatribmedia;
    }

    public Integer getCodlinhaprazo() {
        return codlinhaprazo;
    }

    public void setCodlinhaprazo(Integer codlinhaprazo) {
        this.codlinhaprazo = codlinhaprazo;
    }

    public BigDecimal getVlpautaicmsantec() {
        return vlpautaicmsantec;
    }

    public void setVlpautaicmsantec(BigDecimal vlpautaicmsantec) {
        this.vlpautaicmsantec = vlpautaicmsantec;
    }

    public String getAtupesomasterent() {
        return atupesomasterent;
    }

    public void setAtupesomasterent(String atupesomasterent) {
        this.atupesomasterent = atupesomasterent;
    }

    public Short getNumcasasdecreducaoicms() {
        return numcasasdecreducaoicms;
    }

    public void setNumcasasdecreducaoicms(Short numcasasdecreducaoicms) {
        this.numcasasdecreducaoicms = numcasasdecreducaoicms;
    }

    public Long getCoddeptoweb() {
        return coddeptoweb;
    }

    public void setCoddeptoweb(Long coddeptoweb) {
        this.coddeptoweb = coddeptoweb;
    }

    public Long getCodsecaoweb() {
        return codsecaoweb;
    }

    public void setCodsecaoweb(Long codsecaoweb) {
        this.codsecaoweb = codsecaoweb;
    }

    public Long getCodcategoriaweb() {
        return codcategoriaweb;
    }

    public void setCodcategoriaweb(Long codcategoriaweb) {
        this.codcategoriaweb = codcategoriaweb;
    }

    public Long getCodsubcategoriaweb() {
        return codsubcategoriaweb;
    }

    public void setCodsubcategoriaweb(Long codsubcategoriaweb) {
        this.codsubcategoriaweb = codsubcategoriaweb;
    }

    public BigDecimal getCustoreptabant() {
        return custoreptabant;
    }

    public void setCustoreptabant(BigDecimal custoreptabant) {
        this.custoreptabant = custoreptabant;
    }

    public BigDecimal getCustorepzfmant() {
        return custorepzfmant;
    }

    public void setCustorepzfmant(BigDecimal custorepzfmant) {
        this.custorepzfmant = custorepzfmant;
    }

    public BigDecimal getPrecomaxconsumtabant() {
        return precomaxconsumtabant;
    }

    public void setPrecomaxconsumtabant(BigDecimal precomaxconsumtabant) {
        this.precomaxconsumtabant = precomaxconsumtabant;
    }

    public BigDecimal getPrecomaxconsumzfmant() {
        return precomaxconsumzfmant;
    }

    public void setPrecomaxconsumzfmant(BigDecimal precomaxconsumzfmant) {
        this.precomaxconsumzfmant = precomaxconsumzfmant;
    }

    public String getOscomodato() {
        return oscomodato;
    }

    public void setOscomodato(String oscomodato) {
        this.oscomodato = oscomodato;
    }

    public String getObrigapreenccontrato() {
        return obrigapreenccontrato;
    }

    public void setObrigapreenccontrato(String obrigapreenccontrato) {
        this.obrigapreenccontrato = obrigapreenccontrato;
    }

    public String getGeraosautomatic() {
        return geraosautomatic;
    }

    public void setGeraosautomatic(String geraosautomatic) {
        this.geraosautomatic = geraosautomatic;
    }

    public Integer getNumservico() {
        return numservico;
    }

    public void setNumservico(Integer numservico) {
        this.numservico = numservico;
    }

    public String getRestringecotacao() {
        return restringecotacao;
    }

    public void setRestringecotacao(String restringecotacao) {
        this.restringecotacao = restringecotacao;
    }

    public String getTipomedicamento() {
        return tipomedicamento;
    }

    public void setTipomedicamento(String tipomedicamento) {
        this.tipomedicamento = tipomedicamento;
    }

    public String getGrupofaturamento() {
        return grupofaturamento;
    }

    public void setGrupofaturamento(String grupofaturamento) {
        this.grupofaturamento = grupofaturamento;
    }

    public String getUsapmcbasest() {
        return usapmcbasest;
    }

    public void setUsapmcbasest(String usapmcbasest) {
        this.usapmcbasest = usapmcbasest;
    }

    public BigDecimal getPercredpmc() {
        return percredpmc;
    }

    public void setPercredpmc(BigDecimal percredpmc) {
        this.percredpmc = percredpmc;
    }

    public String getEnviainftecnicanfe() {
        return enviainftecnicanfe;
    }

    public void setEnviainftecnicanfe(String enviainftecnicanfe) {
        this.enviainftecnicanfe = enviainftecnicanfe;
    }

    public String getControladoibama() {
        return controladoibama;
    }

    public void setControladoibama(String controladoibama) {
        this.controladoibama = controladoibama;
    }

    public String getCestabasicalegis() {
        return cestabasicalegis;
    }

    public void setCestabasicalegis(String cestabasicalegis) {
        this.cestabasicalegis = cestabasicalegis;
    }

    public String getCodinterno() {
        return codinterno;
    }

    public void setCodinterno(String codinterno) {
        this.codinterno = codinterno;
    }

    public String getAplicacoes() {
        return aplicacoes;
    }

    public void setAplicacoes(String aplicacoes) {
        this.aplicacoes = aplicacoes;
    }

    public Integer getCodusuultaltcom() {
        return codusuultaltcom;
    }

    public void setCodusuultaltcom(Integer codusuultaltcom) {
        this.codusuultaltcom = codusuultaltcom;
    }

    public String getUtilizaselo() {
        return utilizaselo;
    }

    public void setUtilizaselo(String utilizaselo) {
        this.utilizaselo = utilizaselo;
    }

    public String getCalccredipicont() {
        return calccredipicont;
    }

    public void setCalccredipicont(String calccredipicont) {
        this.calccredipicont = calccredipicont;
    }

    public String getAproveitacredicmscont() {
        return aproveitacredicmscont;
    }

    public void setAproveitacredicmscont(String aproveitacredicmscont) {
        this.aproveitacredicmscont = aproveitacredicmscont;
    }

    public String getAproveitacredpiscofinscont() {
        return aproveitacredpiscofinscont;
    }

    public void setAproveitacredpiscofinscont(String aproveitacredpiscofinscont) {
        this.aproveitacredpiscofinscont = aproveitacredpiscofinscont;
    }

    public BigDecimal getQtminsugcompra() {
        return qtminsugcompra;
    }

    public void setQtminsugcompra(BigDecimal qtminsugcompra) {
        this.qtminsugcompra = qtminsugcompra;
    }

    public String getSittributServico() {
        return sittributServico;
    }

    public void setSittributServico(String sittributServico) {
        this.sittributServico = sittributServico;
    }

    public BigDecimal getPercofinsServico() {
        return percofinsServico;
    }

    public void setPercofinsServico(BigDecimal percofinsServico) {
        this.percofinsServico = percofinsServico;
    }

    public BigDecimal getPerpisServico() {
        return perpisServico;
    }

    public void setPerpisServico(BigDecimal perpisServico) {
        this.perpisServico = perpisServico;
    }

    public BigDecimal getFatorconvtrib() {
        return fatorconvtrib;
    }

    public void setFatorconvtrib(BigDecimal fatorconvtrib) {
        this.fatorconvtrib = fatorconvtrib;
    }

    public String getUnidadetrib() {
        return unidadetrib;
    }

    public void setUnidadetrib(String unidadetrib) {
        this.unidadetrib = unidadetrib;
    }

    public BigDecimal getVlipisuspenso() {
        return vlipisuspenso;
    }

    public void setVlipisuspenso(BigDecimal vlipisuspenso) {
        this.vlipisuspenso = vlipisuspenso;
    }

    public BigDecimal getPercipisuspenso() {
        return percipisuspenso;
    }

    public void setPercipisuspenso(BigDecimal percipisuspenso) {
        this.percipisuspenso = percipisuspenso;
    }

    public Boolean getStatussucata() {
        return statussucata;
    }

    public void setStatussucata(Boolean statussucata) {
        this.statussucata = statussucata;
    }

    public String getMyfrota() {
        return myfrota;
    }

    public void setMyfrota(String myfrota) {
        this.myfrota = myfrota;
    }

    public String getCodsittribst() {
        return codsittribst;
    }

    public void setCodsittribst(String codsittribst) {
        this.codsittribst = codsittribst;
    }

    public BigDecimal getPercicmsbaseicmsantecipado() {
        return percicmsbaseicmsantecipado;
    }

    public void setPercicmsbaseicmsantecipado(BigDecimal percicmsbaseicmsantecipado) {
        this.percicmsbaseicmsantecipado = percicmsbaseicmsantecipado;
    }

    public BigDecimal getPercdesc1tab() {
        return percdesc1tab;
    }

    public void setPercdesc1tab(BigDecimal percdesc1tab) {
        this.percdesc1tab = percdesc1tab;
    }

    public BigDecimal getPercdesc2tab() {
        return percdesc2tab;
    }

    public void setPercdesc2tab(BigDecimal percdesc2tab) {
        this.percdesc2tab = percdesc2tab;
    }

    public BigDecimal getPercdesc3tab() {
        return percdesc3tab;
    }

    public void setPercdesc3tab(BigDecimal percdesc3tab) {
        this.percdesc3tab = percdesc3tab;
    }

    public BigDecimal getPercdesc4tab() {
        return percdesc4tab;
    }

    public void setPercdesc4tab(BigDecimal percdesc4tab) {
        this.percdesc4tab = percdesc4tab;
    }

    public BigDecimal getPercdesc5tab() {
        return percdesc5tab;
    }

    public void setPercdesc5tab(BigDecimal percdesc5tab) {
        this.percdesc5tab = percdesc5tab;
    }

    public BigDecimal getPercdesc6tab() {
        return percdesc6tab;
    }

    public void setPercdesc6tab(BigDecimal percdesc6tab) {
        this.percdesc6tab = percdesc6tab;
    }

    public BigDecimal getPercdesc7tab() {
        return percdesc7tab;
    }

    public void setPercdesc7tab(BigDecimal percdesc7tab) {
        this.percdesc7tab = percdesc7tab;
    }

    public BigDecimal getPercdesc8tab() {
        return percdesc8tab;
    }

    public void setPercdesc8tab(BigDecimal percdesc8tab) {
        this.percdesc8tab = percdesc8tab;
    }

    public BigDecimal getPercdesc9tab() {
        return percdesc9tab;
    }

    public void setPercdesc9tab(BigDecimal percdesc9tab) {
        this.percdesc9tab = percdesc9tab;
    }

    public BigDecimal getPercdesc10tab() {
        return percdesc10tab;
    }

    public void setPercdesc10tab(BigDecimal percdesc10tab) {
        this.percdesc10tab = percdesc10tab;
    }

    public LocalDate getDtvigenciapolitica() {
        return dtvigenciapolitica;
    }

    public void setDtvigenciapolitica(LocalDate dtvigenciapolitica) {
        this.dtvigenciapolitica = dtvigenciapolitica;
    }

    public String getGerabasepiscofinssemaliq() {
        return gerabasepiscofinssemaliq;
    }

    public void setGerabasepiscofinssemaliq(String gerabasepiscofinssemaliq) {
        this.gerabasepiscofinssemaliq = gerabasepiscofinssemaliq;
    }

    public String getUsalicencaimportacao() {
        return usalicencaimportacao;
    }

    public void setUsalicencaimportacao(String usalicencaimportacao) {
        this.usalicencaimportacao = usalicencaimportacao;
    }

    public BigDecimal getMultiplocompras() {
        return multiplocompras;
    }

    public void setMultiplocompras(BigDecimal multiplocompras) {
        this.multiplocompras = multiplocompras;
    }

    public String getEnviasngpc() {
        return enviasngpc;
    }

    public void setEnviasngpc(String enviasngpc) {
        this.enviasngpc = enviasngpc;
    }

    public String getRegistromsmed() {
        return registromsmed;
    }

    public void setRegistromsmed(String registromsmed) {
        this.registromsmed = registromsmed;
    }

    public String getRetinoico() {
        return retinoico;
    }

    public void setRetinoico(String retinoico) {
        this.retinoico = retinoico;
    }

    public byte[] getIdintegracaomyfrota() {
        return idintegracaomyfrota;
    }

    public void setIdintegracaomyfrota(byte[] idintegracaomyfrota) {
        this.idintegracaomyfrota = idintegracaomyfrota;
    }

    public LocalDate getDtultatupcompra() {
        return dtultatupcompra;
    }

    public void setDtultatupcompra(LocalDate dtultatupcompra) {
        this.dtultatupcompra = dtultatupcompra;
    }

    public Integer getAnp() {
        return anp;
    }

    public void setAnp(Integer anp) {
        this.anp = anp;
    }

    public String getConsiisuspensobaseicms() {
        return consiisuspensobaseicms;
    }

    public void setConsiisuspensobaseicms(String consiisuspensobaseicms) {
        this.consiisuspensobaseicms = consiisuspensobaseicms;
    }

    public String getConsipisuspensobaseicms() {
        return consipisuspensobaseicms;
    }

    public void setConsipisuspensobaseicms(String consipisuspensobaseicms) {
        this.consipisuspensobaseicms = consipisuspensobaseicms;
    }

    public Integer getCodusuultaltcomtab() {
        return codusuultaltcomtab;
    }

    public void setCodusuultaltcomtab(Integer codusuultaltcomtab) {
        this.codusuultaltcomtab = codusuultaltcomtab;
    }

    public Integer getCodrotinaultaltcom() {
        return codrotinaultaltcom;
    }

    public void setCodrotinaultaltcom(Integer codrotinaultaltcom) {
        this.codrotinaultaltcom = codrotinaultaltcom;
    }

    public Integer getCodrotinaultaltcomtab() {
        return codrotinaultaltcomtab;
    }

    public void setCodrotinaultaltcomtab(Integer codrotinaultaltcomtab) {
        this.codrotinaultaltcomtab = codrotinaultaltcomtab;
    }

    public BigDecimal getComissaoservicoprestado() {
        return comissaoservicoprestado;
    }

    public void setComissaoservicoprestado(BigDecimal comissaoservicoprestado) {
        this.comissaoservicoprestado = comissaoservicoprestado;
    }

    public Integer getCodprodfornec() {
        return codprodfornec;
    }

    public void setCodprodfornec(Integer codprodfornec) {
        this.codprodfornec = codprodfornec;
    }

    public String getPrecificacaoautomatica() {
        return precificacaoautomatica;
    }

    public void setPrecificacaoautomatica(String precificacaoautomatica) {
        this.precificacaoautomatica = precificacaoautomatica;
    }

    public Integer getCodfiscalcocompra() {
        return codfiscalcocompra;
    }

    public void setCodfiscalcocompra(Integer codfiscalcocompra) {
        this.codfiscalcocompra = codfiscalcocompra;
    }

    public Integer getCodfiscalcoremessa() {
        return codfiscalcoremessa;
    }

    public void setCodfiscalcoremessa(Integer codfiscalcoremessa) {
        this.codfiscalcoremessa = codfiscalcoremessa;
    }

    public Boolean getCodtipousomed() {
        return codtipousomed;
    }

    public void setCodtipousomed(Boolean codtipousomed) {
        this.codtipousomed = codtipousomed;
    }

    public Boolean getCodtiporeceit() {
        return codtiporeceit;
    }

    public void setCodtiporeceit(Boolean codtiporeceit) {
        this.codtiporeceit = codtiporeceit;
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

    public String getTipocustotransf() {
        return tipocustotransf;
    }

    public void setTipocustotransf(String tipocustotransf) {
        this.tipocustotransf = tipocustotransf;
    }

    public Short getCodclasseterapeutsngpc() {
        return codclasseterapeutsngpc;
    }

    public void setCodclasseterapeutsngpc(Short codclasseterapeutsngpc) {
        this.codclasseterapeutsngpc = codclasseterapeutsngpc;
    }

    public String getUsoprolongadosngpc() {
        return usoprolongadosngpc;
    }

    public void setUsoprolongadosngpc(String usoprolongadosngpc) {
        this.usoprolongadosngpc = usoprolongadosngpc;
    }

    public Integer getCodsubmarca() {
        return codsubmarca;
    }

    public void setCodsubmarca(Integer codsubmarca) {
        this.codsubmarca = codsubmarca;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getAlturatotal() {
        return alturatotal;
    }

    public void setAlturatotal(BigDecimal alturatotal) {
        this.alturatotal = alturatotal;
    }

    public BigDecimal getIecteref() {
        return iecteref;
    }

    public void setIecteref(BigDecimal iecteref) {
        this.iecteref = iecteref;
    }

    public BigDecimal getDiametrointerno() {
        return diametrointerno;
    }

    public void setDiametrointerno(BigDecimal diametrointerno) {
        this.diametrointerno = diametrointerno;
    }

    public BigDecimal getDiametroexterno() {
        return diametroexterno;
    }

    public void setDiametroexterno(BigDecimal diametroexterno) {
        this.diametroexterno = diametroexterno;
    }

    public Short getDiasconsecent() {
        return diasconsecent;
    }

    public void setDiasconsecent(Short diasconsecent) {
        this.diasconsecent = diasconsecent;
    }

    public Long getNumerosseriecontrolados() {
        return numerosseriecontrolados;
    }

    public void setNumerosseriecontrolados(Long numerosseriecontrolados) {
        this.numerosseriecontrolados = numerosseriecontrolados;
    }

    public BigDecimal getValortaraporpeca() {
        return valortaraporpeca;
    }

    public void setValortaraporpeca(BigDecimal valortaraporpeca) {
        this.valortaraporpeca = valortaraporpeca;
    }

    public BigDecimal getTaraporpeca() {
        return taraporpeca;
    }

    public void setTaraporpeca(BigDecimal taraporpeca) {
        this.taraporpeca = taraporpeca;
    }

    public String getFarmaciapopular() {
        return farmaciapopular;
    }

    public void setFarmaciapopular(String farmaciapopular) {
        this.farmaciapopular = farmaciapopular;
    }

    public BigDecimal getPercprodeic() {
        return percprodeic;
    }

    public void setPercprodeic(BigDecimal percprodeic) {
        this.percprodeic = percprodeic;
    }

    public String getCodprodantuticad() {
        return codprodantuticad;
    }

    public void setCodprodantuticad(String codprodantuticad) {
        this.codprodantuticad = codprodantuticad;
    }

    public LocalDate getDtinicodprodantuticad() {
        return dtinicodprodantuticad;
    }

    public void setDtinicodprodantuticad(LocalDate dtinicodprodantuticad) {
        this.dtinicodprodantuticad = dtinicodprodantuticad;
    }

    public LocalDate getDtprimovnovcodprod() {
        return dtprimovnovcodprod;
    }

    public void setDtprimovnovcodprod(LocalDate dtprimovnovcodprod) {
        this.dtprimovnovcodprod = dtprimovnovcodprod;
    }

    public String getNumregagrmap() {
        return numregagrmap;
    }

    public void setNumregagrmap(String numregagrmap) {
        this.numregagrmap = numregagrmap;
    }

    public Long getIdembalagem() {
        return idembalagem;
    }

    public void setIdembalagem(Long idembalagem) {
        this.idembalagem = idembalagem;
    }

    public BigDecimal getTamanhopeca() {
        return tamanhopeca;
    }

    public void setTamanhopeca(BigDecimal tamanhopeca) {
        this.tamanhopeca = tamanhopeca;
    }

    public BigDecimal getPesominimo() {
        return pesominimo;
    }

    public void setPesominimo(BigDecimal pesominimo) {
        this.pesominimo = pesominimo;
    }

    public BigDecimal getPesomaximo() {
        return pesomaximo;
    }

    public void setPesomaximo(BigDecimal pesomaximo) {
        this.pesomaximo = pesomaximo;
    }

    public LocalDate getDtfinuticodprodantuticad() {
        return dtfinuticodprodantuticad;
    }

    public void setDtfinuticodprodantuticad(LocalDate dtfinuticodprodantuticad) {
        this.dtfinuticodprodantuticad = dtfinuticodprodantuticad;
    }

    public String getDscprodantuticad() {
        return dscprodantuticad;
    }

    public void setDscprodantuticad(String dscprodantuticad) {
        this.dscprodantuticad = dscprodantuticad;
    }

    public String getInduzlote() {
        return induzlote;
    }

    public void setInduzlote(String induzlote) {
        this.induzlote = induzlote;
    }

    public String getNormapalete() {
        return normapalete;
    }

    public void setNormapalete(String normapalete) {
        this.normapalete = normapalete;
    }

    public Integer getCodfiscaldevoplog() {
        return codfiscaldevoplog;
    }

    public void setCodfiscaldevoplog(Integer codfiscaldevoplog) {
        this.codfiscaldevoplog = codfiscaldevoplog;
    }

    public Integer getCodfiscalentoplog() {
        return codfiscalentoplog;
    }

    public void setCodfiscalentoplog(Integer codfiscalentoplog) {
        this.codfiscalentoplog = codfiscalentoplog;
    }

    public String getIddestaque() {
        return iddestaque;
    }

    public void setIddestaque(String iddestaque) {
        this.iddestaque = iddestaque;
    }

    public String getTipoembarqueimp() {
        return tipoembarqueimp;
    }

    public void setTipoembarqueimp(String tipoembarqueimp) {
        this.tipoembarqueimp = tipoembarqueimp;
    }

    public BigDecimal getPercbonific() {
        return percbonific;
    }

    public void setPercbonific(BigDecimal percbonific) {
        this.percbonific = percbonific;
    }

    public String getVerbadinporperc() {
        return verbadinporperc;
    }

    public void setVerbadinporperc(String verbadinporperc) {
        this.verbadinporperc = verbadinporperc;
    }

    public BigDecimal getPercbontab() {
        return percbontab;
    }

    public void setPercbontab(BigDecimal percbontab) {
        this.percbontab = percbontab;
    }

    public BigDecimal getVlbonifictab() {
        return vlbonifictab;
    }

    public void setVlbonifictab(BigDecimal vlbonifictab) {
        this.vlbonifictab = vlbonifictab;
    }

    public BigDecimal getPercbonifictab() {
        return percbonifictab;
    }

    public void setPercbonifictab(BigDecimal percbonifictab) {
        this.percbonifictab = percbonifictab;
    }

    public BigDecimal getPercbonoutrastab() {
        return percbonoutrastab;
    }

    public void setPercbonoutrastab(BigDecimal percbonoutrastab) {
        this.percbonoutrastab = percbonoutrastab;
    }

    public BigDecimal getVladicionalbcicmsantecip() {
        return vladicionalbcicmsantecip;
    }

    public void setVladicionalbcicmsantecip(BigDecimal vladicionalbcicmsantecip) {
        this.vladicionalbcicmsantecip = vladicionalbcicmsantecip;
    }

    public String getAplicpercivapautaicmsantecip() {
        return aplicpercivapautaicmsantecip;
    }

    public void setAplicpercivapautaicmsantecip(String aplicpercivapautaicmsantecip) {
        this.aplicpercivapautaicmsantecip = aplicpercivapautaicmsantecip;
    }

    public BigDecimal getPercicmsfretefobicmsantecip() {
        return percicmsfretefobicmsantecip;
    }

    public void setPercicmsfretefobicmsantecip(BigDecimal percicmsfretefobicmsantecip) {
        this.percicmsfretefobicmsantecip = percicmsfretefobicmsantecip;
    }

    public BigDecimal getPercmvaorigicmsantecip() {
        return percmvaorigicmsantecip;
    }

    public void setPercmvaorigicmsantecip(BigDecimal percmvaorigicmsantecip) {
        this.percmvaorigicmsantecip = percmvaorigicmsantecip;
    }

    public BigDecimal getPerccargatribmediaicmsantecip() {
        return perccargatribmediaicmsantecip;
    }

    public void setPerccargatribmediaicmsantecip(BigDecimal perccargatribmediaicmsantecip) {
        this.perccargatribmediaicmsantecip = perccargatribmediaicmsantecip;
    }

    public BigDecimal getRedbaseivaicmsantecip() {
        return redbaseivaicmsantecip;
    }

    public void setRedbaseivaicmsantecip(BigDecimal redbaseivaicmsantecip) {
        this.redbaseivaicmsantecip = redbaseivaicmsantecip;
    }

    public BigDecimal getRedbasealiqexticmsantecip() {
        return redbasealiqexticmsantecip;
    }

    public void setRedbasealiqexticmsantecip(BigDecimal redbasealiqexticmsantecip) {
        this.redbasealiqexticmsantecip = redbasealiqexticmsantecip;
    }

    public Integer getCodsalmed() {
        return codsalmed;
    }

    public void setCodsalmed(Integer codsalmed) {
        this.codsalmed = codsalmed;
    }

    public String getFormaesterilizacao() {
        return formaesterilizacao;
    }

    public void setFormaesterilizacao(String formaesterilizacao) {
        this.formaesterilizacao = formaesterilizacao;
    }

    public String getConsideraricmsantecipcustocont() {
        return consideraricmsantecipcustocont;
    }

    public void setConsideraricmsantecipcustocont(String consideraricmsantecipcustocont) {
        this.consideraricmsantecipcustocont = consideraricmsantecipcustocont;
    }

    public String getAplicapercredaliqipi() {
        return aplicapercredaliqipi;
    }

    public void setAplicapercredaliqipi(String aplicapercredaliqipi) {
        this.aplicapercredaliqipi = aplicapercredaliqipi;
    }

    public Short getGtincodauxiliartrib() {
        return gtincodauxiliartrib;
    }

    public void setGtincodauxiliartrib(Short gtincodauxiliartrib) {
        this.gtincodauxiliartrib = gtincodauxiliartrib;
    }

    public Long getCodauxiliartrib() {
        return codauxiliartrib;
    }

    public void setCodauxiliartrib(Long codauxiliartrib) {
        this.codauxiliartrib = codauxiliartrib;
    }

    public String getVerifcramoativcalcst() {
        return verifcramoativcalcst;
    }

    public void setVerifcramoativcalcst(String verifcramoativcalcst) {
        this.verifcramoativcalcst = verifcramoativcalcst;
    }

    public String getComodato() {
        return comodato;
    }

    public void setComodato(String comodato) {
        this.comodato = comodato;
    }

    public String getLinkfabricante() {
        return linkfabricante;
    }

    public void setLinkfabricante(String linkfabricante) {
        this.linkfabricante = linkfabricante;
    }

    public BigDecimal getPerciisuspenso() {
        return perciisuspenso;
    }

    public void setPerciisuspenso(BigDecimal perciisuspenso) {
        this.perciisuspenso = perciisuspenso;
    }

    public BigDecimal getPerpiscalcdi() {
        return perpiscalcdi;
    }

    public void setPerpiscalcdi(BigDecimal perpiscalcdi) {
        this.perpiscalcdi = perpiscalcdi;
    }

    public BigDecimal getPercofinscalcdi() {
        return percofinscalcdi;
    }

    public void setPercofinscalcdi(BigDecimal percofinscalcdi) {
        this.percofinscalcdi = percofinscalcdi;
    }

    public String getEstoquepordtvalidade() {
        return estoquepordtvalidade;
    }

    public void setEstoquepordtvalidade(String estoquepordtvalidade) {
        this.estoquepordtvalidade = estoquepordtvalidade;
    }

    public BigDecimal getPesoliqdi() {
        return pesoliqdi;
    }

    public void setPesoliqdi(BigDecimal pesoliqdi) {
        this.pesoliqdi = pesoliqdi;
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

    public BigDecimal getComissaoservicofuncionario() {
        return comissaoservicofuncionario;
    }

    public void setComissaoservicofuncionario(BigDecimal comissaoservicofuncionario) {
        this.comissaoservicofuncionario = comissaoservicofuncionario;
    }

    public String getRegistropeca() {
        return registropeca;
    }

    public void setRegistropeca(String registropeca) {
        this.registropeca = registropeca;
    }

    public String getGeraicmslivrofiscalent() {
        return geraicmslivrofiscalent;
    }

    public void setGeraicmslivrofiscalent(String geraicmslivrofiscalent) {
        this.geraicmslivrofiscalent = geraicmslivrofiscalent;
    }

    public String getUtilizacredredpiscofins() {
        return utilizacredredpiscofins;
    }

    public void setUtilizacredredpiscofins(String utilizacredredpiscofins) {
        this.utilizacredredpiscofins = utilizacredredpiscofins;
    }

    public String getProdusaengradado() {
        return produsaengradado;
    }

    public void setProdusaengradado(String produsaengradado) {
        this.produsaengradado = produsaengradado;
    }

    public Integer getCodprodengradado() {
        return codprodengradado;
    }

    public void setCodprodengradado(Integer codprodengradado) {
        this.codprodengradado = codprodengradado;
    }

    public BigDecimal getFatconvprodengrad() {
        return fatconvprodengrad;
    }

    public void setFatconvprodengrad(BigDecimal fatconvprodengrad) {
        this.fatconvprodengrad = fatconvprodengrad;
    }

    public String getCodcest() {
        return codcest;
    }

    public void setCodcest(String codcest) {
        this.codcest = codcest;
    }

    public String getCodcestdev() {
        return codcestdev;
    }

    public void setCodcestdev(String codcestdev) {
        this.codcestdev = codcestdev;
    }

    public BigDecimal getPercentualcprb() {
        return percentualcprb;
    }

    public void setPercentualcprb(BigDecimal percentualcprb) {
        this.percentualcprb = percentualcprb;
    }

    public Long getCodigocnae() {
        return codigocnae;
    }

    public void setCodigocnae(Long codigocnae) {
        this.codigocnae = codigocnae;
    }

    public Long getTemposervico() {
        return temposervico;
    }

    public void setTemposervico(Long temposervico) {
        this.temposervico = temposervico;
    }

    public BigDecimal getPercentualincidencia() {
        return percentualincidencia;
    }

    public void setPercentualincidencia(BigDecimal percentualincidencia) {
        this.percentualincidencia = percentualincidencia;
    }

    public String getTiposervicovinculadoreceita() {
        return tiposervicovinculadoreceita;
    }

    public void setTiposervicovinculadoreceita(String tiposervicovinculadoreceita) {
        this.tiposervicovinculadoreceita = tiposervicovinculadoreceita;
    }

    public String getIncidenciacprb() {
        return incidenciacprb;
    }

    public void setIncidenciacprb(String incidenciacprb) {
        this.incidenciacprb = incidenciacprb;
    }

    public Integer getCfoporig() {
        return cfoporig;
    }

    public void setCfoporig(Integer cfoporig) {
        this.cfoporig = cfoporig;
    }

    public Boolean getModbcst() {
        return modbcst;
    }

    public void setModbcst(Boolean modbcst) {
        this.modbcst = modbcst;
    }

    public Boolean getModbcstguia() {
        return modbcstguia;
    }

    public void setModbcstguia(Boolean modbcstguia) {
        this.modbcstguia = modbcstguia;
    }

    public String getPermitirbrokertv5() {
        return permitirbrokertv5;
    }

    public void setPermitirbrokertv5(String permitirbrokertv5) {
        this.permitirbrokertv5 = permitirbrokertv5;
    }

    public BigDecimal getVlfrete() {
        return vlfrete;
    }

    public void setVlfrete(BigDecimal vlfrete) {
        this.vlfrete = vlfrete;
    }

    public String getAntidumping() {
        return antidumping;
    }

    public void setAntidumping(String antidumping) {
        this.antidumping = antidumping;
    }

    public String getEnderecamentocubagem() {
        return enderecamentocubagem;
    }

    public void setEnderecamentocubagem(String enderecamentocubagem) {
        this.enderecamentocubagem = enderecamentocubagem;
    }

    public LocalDate getDtultaltcad() {
        return dtultaltcad;
    }

    public void setDtultaltcad(LocalDate dtultaltcad) {
        this.dtultaltcad = dtultaltcad;
    }

    public Integer getCodfuncultaltcad() {
        return codfuncultaltcad;
    }

    public void setCodfuncultaltcad(Integer codfuncultaltcad) {
        this.codfuncultaltcad = codfuncultaltcad;
    }

    public BigDecimal getPercfuncep() {
        return percfuncep;
    }

    public void setPercfuncep(BigDecimal percfuncep) {
        this.percfuncep = percfuncep;
    }

    public BigDecimal getPercfecp() {
        return percfecp;
    }

    public void setPercfecp(BigDecimal percfecp) {
        this.percfecp = percfecp;
    }

    public BigDecimal getPerccsll() {
        return perccsll;
    }

    public void setPerccsll(BigDecimal perccsll) {
        this.perccsll = perccsll;
    }

    public BigDecimal getVlipipautatv10() {
        return vlipipautatv10;
    }

    public void setVlipipautatv10(BigDecimal vlipipautatv10) {
        this.vlipipautatv10 = vlipipautatv10;
    }

    public BigDecimal getVlipipautatv10tab() {
        return vlipipautatv10tab;
    }

    public void setVlipipautatv10tab(BigDecimal vlipipautatv10tab) {
        this.vlipipautatv10tab = vlipipautatv10tab;
    }

    public BigDecimal getPesobrutofrete() {
        return pesobrutofrete;
    }

    public void setPesobrutofrete(BigDecimal pesobrutofrete) {
        this.pesobrutofrete = pesobrutofrete;
    }

    public Long getCodfiscalrementfut() {
        return codfiscalrementfut;
    }

    public void setCodfiscalrementfut(Long codfiscalrementfut) {
        this.codfiscalrementfut = codfiscalrementfut;
    }

    public Long getCodfiscalententfut() {
        return codfiscalententfut;
    }

    public void setCodfiscalententfut(Long codfiscalententfut) {
        this.codfiscalententfut = codfiscalententfut;
    }

    public String getSittributentfut() {
        return sittributentfut;
    }

    public void setSittributentfut(String sittributentfut) {
        this.sittributentfut = sittributentfut;
    }

    public String getLicitusarcap() {
        return licitusarcap;
    }

    public void setLicitusarcap(String licitusarcap) {
        this.licitusarcap = licitusarcap;
    }

    public BigDecimal getLicitpercdesoneracap() {
        return licitpercdesoneracap;
    }

    public void setLicitpercdesoneracap(BigDecimal licitpercdesoneracap) {
        this.licitpercdesoneracap = licitpercdesoneracap;
    }

    public String getUsaecommerceunilever() {
        return usaecommerceunilever;
    }

    public void setUsaecommerceunilever(String usaecommerceunilever) {
        this.usaecommerceunilever = usaecommerceunilever;
    }

    public String getLicitusardesoneraicm() {
        return licitusardesoneraicm;
    }

    public void setLicitusardesoneraicm(String licitusardesoneraicm) {
        this.licitusardesoneraicm = licitusardesoneraicm;
    }

    public BigDecimal getLicitpercdesoneraicm() {
        return licitpercdesoneraicm;
    }

    public void setLicitpercdesoneraicm(BigDecimal licitpercdesoneraicm) {
        this.licitpercdesoneraicm = licitpercdesoneraicm;
    }

    public BigDecimal getPerciva2() {
        return perciva2;
    }

    public void setPerciva2(BigDecimal perciva2) {
        this.perciva2 = perciva2;
    }

    public String getLicitconvenioisencaoicms() {
        return licitconvenioisencaoicms;
    }

    public void setLicitconvenioisencaoicms(String licitconvenioisencaoicms) {
        this.licitconvenioisencaoicms = licitconvenioisencaoicms;
    }

    public BigDecimal getPercentualiss() {
        return percentualiss;
    }

    public void setPercentualiss(BigDecimal percentualiss) {
        this.percentualiss = percentualiss;
    }

    public String getEmbvendaecommerceunilever() {
        return embvendaecommerceunilever;
    }

    public void setEmbvendaecommerceunilever(String embvendaecommerceunilever) {
        this.embvendaecommerceunilever = embvendaecommerceunilever;
    }

    public Long getCodfiscalbeneficsaida() {
        return codfiscalbeneficsaida;
    }

    public void setCodfiscalbeneficsaida(Long codfiscalbeneficsaida) {
        this.codfiscalbeneficsaida = codfiscalbeneficsaida;
    }

    public Long getCodfiscalbeneficretorno() {
        return codfiscalbeneficretorno;
    }

    public void setCodfiscalbeneficretorno(Long codfiscalbeneficretorno) {
        this.codfiscalbeneficretorno = codfiscalbeneficretorno;
    }

    public Long getCodfiscalbeneficentrada() {
        return codfiscalbeneficentrada;
    }

    public void setCodfiscalbeneficentrada(Long codfiscalbeneficentrada) {
        this.codfiscalbeneficentrada = codfiscalbeneficentrada;
    }

    public String getSittributbeneficsaida() {
        return sittributbeneficsaida;
    }

    public void setSittributbeneficsaida(String sittributbeneficsaida) {
        this.sittributbeneficsaida = sittributbeneficsaida;
    }

    public String getSittributbeneficretorno() {
        return sittributbeneficretorno;
    }

    public void setSittributbeneficretorno(String sittributbeneficretorno) {
        this.sittributbeneficretorno = sittributbeneficretorno;
    }

    public String getSittributbeneficentrada() {
        return sittributbeneficentrada;
    }

    public void setSittributbeneficentrada(String sittributbeneficentrada) {
        this.sittributbeneficentrada = sittributbeneficentrada;
    }

    public BigDecimal getPercicmsdesoneracao() {
        return percicmsdesoneracao;
    }

    public void setPercicmsdesoneracao(BigDecimal percicmsdesoneracao) {
        this.percicmsdesoneracao = percicmsdesoneracao;
    }

    public String getAceitatrocainservivel() {
        return aceitatrocainservivel;
    }

    public void setAceitatrocainservivel(String aceitatrocainservivel) {
        this.aceitatrocainservivel = aceitatrocainservivel;
    }

    public Integer getCodinservivel() {
        return codinservivel;
    }

    public void setCodinservivel(Integer codinservivel) {
        this.codinservivel = codinservivel;
    }

    public String getCarcacabateria() {
        return carcacabateria;
    }

    public void setCarcacabateria(String carcacabateria) {
        this.carcacabateria = carcacabateria;
    }

    public String getUtilizaprecofabrica() {
        return utilizaprecofabrica;
    }

    public void setUtilizaprecofabrica(String utilizaprecofabrica) {
        this.utilizaprecofabrica = utilizaprecofabrica;
    }

    public String getIsentotcif() {
        return isentotcif;
    }

    public void setIsentotcif(String isentotcif) {
        this.isentotcif = isentotcif;
    }

    public String getUnidadetribex() {
        return unidadetribex;
    }

    public void setUnidadetribex(String unidadetribex) {
        this.unidadetribex = unidadetribex;
    }

    public BigDecimal getFatorconvtribex() {
        return fatorconvtribex;
    }

    public void setFatorconvtribex(BigDecimal fatorconvtribex) {
        this.fatorconvtribex = fatorconvtribex;
    }

    public String getDescanp() {
        return descanp;
    }

    public void setDescanp(String descanp) {
        this.descanp = descanp;
    }

    public String getBloqueioacordoparceria() {
        return bloqueioacordoparceria;
    }

    public void setBloqueioacordoparceria(String bloqueioacordoparceria) {
        this.bloqueioacordoparceria = bloqueioacordoparceria;
    }

    public BigDecimal getPeracrescimoipi() {
        return peracrescimoipi;
    }

    public void setPeracrescimoipi(BigDecimal peracrescimoipi) {
        this.peracrescimoipi = peracrescimoipi;
    }

    public String getCodagregacao() {
        return codagregacao;
    }

    public void setCodagregacao(String codagregacao) {
        this.codagregacao = codagregacao;
    }

    public String getUsacodagregacao() {
        return usacodagregacao;
    }

    public void setUsacodagregacao(String usacodagregacao) {
        this.usacodagregacao = usacodagregacao;
    }

    public String getIsentostcozinhaindustrial() {
        return isentostcozinhaindustrial;
    }

    public void setIsentostcozinhaindustrial(String isentostcozinhaindustrial) {
        this.isentostcozinhaindustrial = isentostcozinhaindustrial;
    }

    public LocalDate getDtimportprecomed() {
        return dtimportprecomed;
    }

    public void setDtimportprecomed(LocalDate dtimportprecomed) {
        this.dtimportprecomed = dtimportprecomed;
    }

    public String getCtrabcfarmamed() {
        return ctrabcfarmamed;
    }

    public void setCtrabcfarmamed(String ctrabcfarmamed) {
        this.ctrabcfarmamed = ctrabcfarmamed;
    }

    public Integer getCodgrupoprodcomissmed() {
        return codgrupoprodcomissmed;
    }

    public void setCodgrupoprodcomissmed(Integer codgrupoprodcomissmed) {
        this.codgrupoprodcomissmed = codgrupoprodcomissmed;
    }

    public String getClassevendaqt() {
        return classevendaqt;
    }

    public void setClassevendaqt(String classevendaqt) {
        this.classevendaqt = classevendaqt;
    }

    public Short getCodunidademedidasngpc() {
        return codunidademedidasngpc;
    }

    public void setCodunidademedidasngpc(Short codunidademedidasngpc) {
        this.codunidademedidasngpc = codunidademedidasngpc;
    }

    public String getVerifcdesccaixafechada() {
        return verifcdesccaixafechada;
    }

    public void setVerifcdesccaixafechada(String verifcdesccaixafechada) {
        this.verifcdesccaixafechada = verifcdesccaixafechada;
    }

    public BigDecimal getPercdesccaixafechada() {
        return percdesccaixafechada;
    }

    public void setPercdesccaixafechada(BigDecimal percdesccaixafechada) {
        this.percdesccaixafechada = percdesccaixafechada;
    }

    public Long getCodprincipativo2() {
        return codprincipativo2;
    }

    public void setCodprincipativo2(Long codprincipativo2) {
        this.codprincipativo2 = codprincipativo2;
    }

    public String getUtilizamultiplicador() {
        return utilizamultiplicador;
    }

    public void setUtilizamultiplicador(String utilizamultiplicador) {
        this.utilizamultiplicador = utilizamultiplicador;
    }

    public BigDecimal getPglp() {
        return pglp;
    }

    public void setPglp(BigDecimal pglp) {
        this.pglp = pglp;
    }

    public BigDecimal getPgnn() {
        return pgnn;
    }

    public void setPgnn(BigDecimal pgnn) {
        this.pgnn = pgnn;
    }

    public BigDecimal getPgni() {
        return pgni;
    }

    public void setPgni(BigDecimal pgni) {
        this.pgni = pgni;
    }

    public BigDecimal getVpart() {
        return vpart;
    }

    public void setVpart(BigDecimal vpart) {
        this.vpart = vpart;
    }

    public BigDecimal getFatorconversaobionexo() {
        return fatorconversaobionexo;
    }

    public void setFatorconversaobionexo(BigDecimal fatorconversaobionexo) {
        this.fatorconversaobionexo = fatorconversaobionexo;
    }

    public BigDecimal getPgli() {
        return pgli;
    }

    public void setPgli(BigDecimal pgli) {
        this.pgli = pgli;
    }

    public BigDecimal getPgln() {
        return pgln;
    }

    public void setPgln(BigDecimal pgln) {
        this.pgln = pgln;
    }

    public String getUsamaiorvalorparacalculoicms() {
        return usamaiorvalorparacalculoicms;
    }

    public void setUsamaiorvalorparacalculoicms(String usamaiorvalorparacalculoicms) {
        this.usamaiorvalorparacalculoicms = usamaiorvalorparacalculoicms;
    }

    public String getUsabasestnofcp() {
        return usabasestnofcp;
    }

    public void setUsabasestnofcp(String usabasestnofcp) {
        this.usabasestnofcp = usabasestnofcp;
    }

    public String getUnidadepadrao() {
        return unidadepadrao;
    }

    public void setUnidadepadrao(String unidadepadrao) {
        this.unidadepadrao = unidadepadrao;
    }

    public String getDescricaodinamica() {
        return descricaodinamica;
    }

    public void setDescricaodinamica(String descricaodinamica) {
        this.descricaodinamica = descricaodinamica;
    }

    public Short getTipointegracaob2b() {
        return tipointegracaob2b;
    }

    public void setTipointegracaob2b(Short tipointegracaob2b) {
        this.tipointegracaob2b = tipointegracaob2b;
    }

    public BigDecimal getGramaturalicit() {
        return gramaturalicit;
    }

    public void setGramaturalicit(BigDecimal gramaturalicit) {
        this.gramaturalicit = gramaturalicit;
    }

    public String getIdsofitview() {
        return idsofitview;
    }

    public void setIdsofitview(String idsofitview) {
        this.idsofitview = idsofitview;
    }

    public LocalDate getDtultaltersofitview() {
        return dtultaltersofitview;
    }

    public void setDtultaltersofitview(LocalDate dtultaltersofitview) {
        this.dtultaltersofitview = dtultaltersofitview;
    }

    public LocalDate getDtexclusaosofitview() {
        return dtexclusaosofitview;
    }

    public void setDtexclusaosofitview(LocalDate dtexclusaosofitview) {
        this.dtexclusaosofitview = dtexclusaosofitview;
    }

    public String getCodmotisencaoanvisa() {
        return codmotisencaoanvisa;
    }

    public void setCodmotisencaoanvisa(String codmotisencaoanvisa) {
        this.codmotisencaoanvisa = codmotisencaoanvisa;
    }

    public String getUsaicmsdesoneracao() {
        return usaicmsdesoneracao;
    }

    public void setUsaicmsdesoneracao(String usaicmsdesoneracao) {
        this.usaicmsdesoneracao = usaicmsdesoneracao;
    }

    public Short getCodsazonalidademed() {
        return codsazonalidademed;
    }

    public void setCodsazonalidademed(Short codsazonalidademed) {
        this.codsazonalidademed = codsazonalidademed;
    }

    public String getCodadwords() {
        return codadwords;
    }

    public void setCodadwords(String codadwords) {
        this.codadwords = codadwords;
    }

    public String getExibesemestoqueecommerce() {
        return exibesemestoqueecommerce;
    }

    public void setExibesemestoqueecommerce(String exibesemestoqueecommerce) {
        this.exibesemestoqueecommerce = exibesemestoqueecommerce;
    }

    public String getLinkid() {
        return linkid;
    }

    public void setLinkid(String linkid) {
        this.linkid = linkid;
    }

    public String getCodcamplomadee() {
        return codcamplomadee;
    }

    public void setCodcamplomadee(String codcamplomadee) {
        this.codcamplomadee = codcamplomadee;
    }

    public String getUtilizaintegracaokibon() {
        return utilizaintegracaokibon;
    }

    public void setUtilizaintegracaokibon(String utilizaintegracaokibon) {
        this.utilizaintegracaokibon = utilizaintegracaokibon;
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

    public String getPredominancia() {
        return predominancia;
    }

    public void setPredominancia(String predominancia) {
        this.predominancia = predominancia;
    }

    public String getUsabaseredicmspresumido() {
        return usabaseredicmspresumido;
    }

    public void setUsabaseredicmspresumido(String usabaseredicmspresumido) {
        this.usabaseredicmspresumido = usabaseredicmspresumido;
    }

    public BigDecimal getAliquotatcif() {
        return aliquotatcif;
    }

    public void setAliquotatcif(BigDecimal aliquotatcif) {
        this.aliquotatcif = aliquotatcif;
    }

    public String getObscontxcampo() {
        return obscontxcampo;
    }

    public void setObscontxcampo(String obscontxcampo) {
        this.obscontxcampo = obscontxcampo;
    }

    public String getObscontxtexto() {
        return obscontxtexto;
    }

    public void setObscontxtexto(String obscontxtexto) {
        this.obscontxtexto = obscontxtexto;
    }

    public String getObsfiscoxcampo() {
        return obsfiscoxcampo;
    }

    public void setObsfiscoxcampo(String obsfiscoxcampo) {
        this.obsfiscoxcampo = obsfiscoxcampo;
    }

    public String getObsfiscoxtexto() {
        return obsfiscoxtexto;
    }

    public void setObsfiscoxtexto(String obsfiscoxtexto) {
        this.obsfiscoxtexto = obsfiscoxtexto;
    }

    public BigDecimal getPmpfmedicamento() {
        return pmpfmedicamento;
    }

    public void setPmpfmedicamento(BigDecimal pmpfmedicamento) {
        this.pmpfmedicamento = pmpfmedicamento;
    }

    public BigDecimal getPrecofabrica() {
        return precofabrica;
    }

    public void setPrecofabrica(BigDecimal precofabrica) {
        this.precofabrica = precofabrica;
    }

    public String getUsapmpfbasest() {
        return usapmpfbasest;
    }

    public void setUsapmpfbasest(String usapmpfbasest) {
        this.usapmpfbasest = usapmpfbasest;
    }

    public String getUsapfabbasest() {
        return usapfabbasest;
    }

    public void setUsapfabbasest(String usapfabbasest) {
        this.usapfabbasest = usapfabbasest;
    }

    public BigDecimal getPercredpmpf() {
        return percredpmpf;
    }

    public void setPercredpmpf(BigDecimal percredpmpf) {
        this.percredpmpf = percredpmpf;
    }

    public BigDecimal getPercredpfab() {
        return percredpfab;
    }

    public void setPercredpfab(BigDecimal percredpfab) {
        this.percredpfab = percredpfab;
    }

    public String getConvenioisencaoicmsmed() {
        return convenioisencaoicmsmed;
    }

    public void setConvenioisencaoicmsmed(String convenioisencaoicmsmed) {
        this.convenioisencaoicmsmed = convenioisencaoicmsmed;
    }

    public String getUsacalculadoraqtde() {
        return usacalculadoraqtde;
    }

    public void setUsacalculadoraqtde(String usacalculadoraqtde) {
        this.usacalculadoraqtde = usacalculadoraqtde;
    }

    public BigDecimal getPesopormetroquadrado() {
        return pesopormetroquadrado;
    }

    public void setPesopormetroquadrado(BigDecimal pesopormetroquadrado) {
        this.pesopormetroquadrado = pesopormetroquadrado;
    }

    public String getUsamaiorvalorparacalculoipi() {
        return usamaiorvalorparacalculoipi;
    }

    public void setUsamaiorvalorparacalculoipi(String usamaiorvalorparacalculoipi) {
        this.usamaiorvalorparacalculoipi = usamaiorvalorparacalculoipi;
    }

    public Instant getDtalterc5() {
        return dtalterc5;
    }

    public void setDtalterc5(Instant dtalterc5) {
        this.dtalterc5 = dtalterc5;
    }

    public String getPermitemultiplicacaopdv() {
        return permitemultiplicacaopdv;
    }

    public void setPermitemultiplicacaopdv(String permitemultiplicacaopdv) {
        this.permitemultiplicacaopdv = permitemultiplicacaopdv;
    }

    public BigDecimal getCustorepant2() {
        return custorepant2;
    }

    public void setCustorepant2(BigDecimal custorepant2) {
        this.custorepant2 = custorepant2;
    }

    public BigDecimal getCustorepant3() {
        return custorepant3;
    }

    public void setCustorepant3(BigDecimal custorepant3) {
        this.custorepant3 = custorepant3;
    }

}