package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PCFORNEC")
public class Pcfornec {
    @Id
    @Column(name = "CODFORNEC", nullable = false)
    private Integer id;

    @Column(name = "FORNECEDOR", nullable = false, length = 60)
    private String fornecedor;

    @Column(name = "REPRES", length = 40)
    private String repres;

    @Column(name = "CONTATO", length = 40)
    private String contato;

    @Column(name = "ENDER", length = 40)
    private String ender;

    @Column(name = "CIDADE", length = 15)
    private String cidade;

    @Column(name = "ESTADO", length = 2)
    private String estado;

    @Column(name = "CEP", length = 9)
    private String cep;

    @Column(name = "TELREP", length = 20)
    private String telrep;

    @Column(name = "TELFAB", length = 20)
    private String telfab;

    @Column(name = "TELEXREP", length = 20)
    private String telexrep;

    @Column(name = "TELEXFAB", length = 20)
    private String telexfab;

    @Column(name = "IE", length = 15)
    private String ie;

    @Column(name = "CGC", length = 18)
    private String cgc;

    @Column(name = "FAXREP", length = 20)
    private String faxrep;

    @Column(name = "FAXFAB", length = 20)
    private String faxfab;

    @Column(name = "BAIRRO", length = 20)
    private String bairro;

    @Column(name = "PRAZOENTREGA")
    private Short prazoentrega;

    @Column(name = "BLOQUEIO", length = 1)
    private String bloqueio;

    @Column(name = "DTBLOQUEIO")
    private LocalDate dtbloqueio;

    @Column(name = "OBS", length = 20)
    private String obs;

    @Column(name = "REVENDA", length = 1)
    private String revenda;

    @Column(name = "CODCLI")
    private Integer codcli;

    @Column(name = "CODCOMPRADOR")
    private Integer codcomprador;

    @Column(name = "REP_CONTATO", length = 10)
    private String repContato;

    @Column(name = "REP_ENDERECO", length = 23)
    private String repEndereco;

    @Column(name = "REP_BAIRRO", length = 13)
    private String repBairro;

    @Column(name = "REP_CIDADE", length = 15)
    private String repCidade;

    @Column(name = "REP_UF", length = 2)
    private String repUf;

    @Column(name = "REP_CEP")
    private Integer repCep;

    @Column(name = "EXCLUIDO", length = 1)
    private String excluido;

    @Column(name = "LEDTIME")
    private Short ledtime;

    @Column(name = "COBERTURA")
    private Short cobertura;

    @Column(name = "REGIONAL", length = 1)
    private String regional;

    @Column(name = "CENTRALIZACAO", length = 1)
    private String centralizacao;

    @Column(name = "DTCADASTRO")
    private LocalDate dtcadastro;

    @Column(name = "DTEXCLUSAO")
    private LocalDate dtexclusao;

    @Column(name = "OBS2", length = 35)
    private String obs2;

    @Column(name = "PRAZOMIN")
    private Short prazomin;

    @Column(name = "DESCPAGTODUP", length = 1)
    private String descpagtodup;

    @Column(name = "ENDERCOB", length = 40)
    private String endercob;

    @Column(name = "BAIRROCOB", length = 40)
    private String bairrocob;

    @Column(name = "MUNICOB", length = 40)
    private String municob;

    @Column(name = "ESTCOB", length = 2)
    private String estcob;

    @Column(name = "CEPCOB", length = 9)
    private String cepcob;

    @Column(name = "TELCOB", length = 13)
    private String telcob;

    @Column(name = "ESTRATEGICO", length = 1)
    private String estrategico;

    @Column(name = "OBSERVACAO", length = 2000)
    private String observacao;

    @Column(name = "CODDEPTO")
    private Integer coddepto;

    @Column(name = "CODFORNECPRINC")
    private Integer codfornecprinc;

    @Column(name = "CONTATOCOM", length = 40)
    private String contatocom;

    @Column(name = "TELEFONECOM", length = 20)
    private String telefonecom;

    @Column(name = "CONTATOADM", length = 40)
    private String contatoadm;

    @Column(name = "TELEFONEADM", length = 20)
    private String telefoneadm;

    @Column(name = "DIASEMANAATEND")
    private Short diasemanaatend;

    @Column(name = "PERIOCIDADEATEND")
    private Short periocidadeatend;

    @Column(name = "DTPROXATEND")
    private LocalDate dtproxatend;

    @Column(name = "CLASSEVENDA", length = 1)
    private String classevenda;

    @Column(name = "CLASSEMC", length = 1)
    private String classemc;

    @Column(name = "CLASSEESTOQUE", length = 1)
    private String classeestoque;

    @Column(name = "CLASSECOMPRA", length = 1)
    private String classecompra;

    @Column(name = "EMAIL", length = 100)
    private String email;

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

    @Column(name = "PERCDESPFIN", precision = 12, scale = 4)
    private BigDecimal percdespfin;

    @Column(name = "PERCDESCFIN", precision = 12, scale = 4)
    private BigDecimal percdescfin;

    @Column(name = "NUMBANCODOC")
    private Short numbancodoc;

    @Column(name = "NUMAGENCIADOC")
    private Integer numagenciadoc;

    @Column(name = "NUMCCORRENTEDOC", length = 15)
    private String numccorrentedoc;

    @Column(name = "FANTASIA", length = 60)
    private String fantasia;

    @Column(name = "NUMDEPIRRF")
    private Short numdepirrf;

    @Column(name = "VALORDEDUCAOIRRF", precision = 14, scale = 2)
    private BigDecimal valordeducaoirrf;

    @Column(name = "RG", length = 20)
    private String rg;

    @Column(name = "CODDISTRIB", length = 4)
    private String coddistrib;

    @Column(name = "VLFRETEKG", precision = 12, scale = 4)
    private BigDecimal vlfretekg;

    @Column(name = "PERCOUTROSCUSTOSFRETE", precision = 5, scale = 2)
    private BigDecimal percoutroscustosfrete;

    @Column(name = "DISTRIB", length = 1)
    private String distrib;

    @Column(name = "INSCESTRANGEIRA")
    private Long inscestrangeira;

    @Column(name = "INDUSTRIALOCAL", length = 1)
    private String industrialocal;

    @Column(name = "GRUPOCAMPANHA")
    private Integer grupocampanha;

    @Column(name = "PERCMAXBONIFIC", precision = 5, scale = 2)
    private BigDecimal percmaxbonific;

    @Column(name = "PERCPISRED", precision = 5, scale = 2)
    private BigDecimal percpisred;

    @Column(name = "SUFRAMA", length = 1)
    private String suframa;

    @Column(name = "CODPRODUTORRURAL", length = 20)
    private String codprodutorrural;

    @Column(name = "DVAG", length = 2)
    private String dvag;

    @Column(name = "DVCC", length = 2)
    private String dvcc;

    @Column(name = "TIPOEMBALAGEMPEDIDO", length = 1)
    private String tipoembalagempedido;

    @Column(name = "SUPERVISORVERBA", length = 40)
    private String supervisorverba;

    @Column(name = "CONTATOVERBA", length = 40)
    private String contatoverba;

    @Column(name = "CPFCONTATOVERBA", length = 18)
    private String cpfcontatoverba;

    @Column(name = "RGCONTATOVERBA", length = 20)
    private String rgcontatoverba;

    @Column(name = "REP_DTANIVERSARIO")
    private LocalDate repDtaniversario;

    @Column(name = "ADM_CONTATO", length = 40)
    private String admContato;

    @Column(name = "ADM_DTANIVERSARIO")
    private LocalDate admDtaniversario;

    @Column(name = "ADM_ENDERECO", length = 40)
    private String admEndereco;

    @Column(name = "ADM_BAIRRO", length = 40)
    private String admBairro;

    @Column(name = "ADM_CIDADE", length = 40)
    private String admCidade;

    @Column(name = "ADM_UF", length = 2)
    private String admUf;

    @Column(name = "ADM_CEP")
    private Integer admCep;

    @Column(name = "COM_CONTATO", length = 40)
    private String comContato;

    @Column(name = "COM_DTANIVERSARIO")
    private LocalDate comDtaniversario;

    @Column(name = "COM_ENDERECO", length = 40)
    private String comEndereco;

    @Column(name = "COM_BAIRRO", length = 40)
    private String comBairro;

    @Column(name = "COM_CIDADE", length = 40)
    private String comCidade;

    @Column(name = "COM_UF", length = 2)
    private String comUf;

    @Column(name = "COM_CEP")
    private Integer comCep;

    @Column(name = "TRANSPORTEPROPRIO", length = 1)
    private String transporteproprio;

    @Column(name = "VLPEDAGIO", precision = 12, scale = 2)
    private BigDecimal vlpedagio;

    @Column(name = "PERGRIS", precision = 8, scale = 4)
    private BigDecimal pergris;

    @Column(name = "ICMSSOBRETXMINIMA", length = 1)
    private String icmssobretxminima;

    @Column(name = "GATILHO", precision = 12, scale = 4)
    private BigDecimal gatilho;

    @Column(name = "TIPOCALCFRETE")
    private Short tipocalcfrete;

    @Column(name = "TAXA0", precision = 8, scale = 4)
    private BigDecimal taxa0;

    @Column(name = "TAXA7", precision = 8, scale = 4)
    private BigDecimal taxa7;

    @Column(name = "TAXA14", precision = 8, scale = 4)
    private BigDecimal taxa14;

    @Column(name = "TAXA21", precision = 8, scale = 4)
    private BigDecimal taxa21;

    @Column(name = "TAXA28", precision = 8, scale = 4)
    private BigDecimal taxa28;

    @Column(name = "TAXA35", precision = 8, scale = 4)
    private BigDecimal taxa35;

    @Column(name = "TAXA42", precision = 8, scale = 4)
    private BigDecimal taxa42;

    @Column(name = "DTULTCONTATOCOB")
    private LocalDate dtultcontatocob;

    @Column(name = "CODFUNCULTCONTATOCOB")
    private Integer codfuncultcontatocob;

    @Column(name = "DTPROXCONTATOCOB")
    private LocalDate dtproxcontatocob;

    @Column(name = "CODMUNICIPIO")
    private Long codmunicipio;

    @Column(name = "COM_EMAIL", length = 100)
    private String comEmail;

    @Column(name = "REP_EMAIL", length = 100)
    private String repEmail;

    @Column(name = "SUP_EMAIL", length = 100)
    private String supEmail;

    @Column(name = "DTVALIDADE")
    private LocalDate dtvalidade;

    @Column(name = "TIPOFORNEC", length = 1)
    private String tipofornec;

    @Column(name = "UTILIZADESCCALCIPI", length = 1)
    private String utilizadesccalcipi;

    @Column(name = "UTILIZAFRETECALCIPI", length = 1)
    private String utilizafretecalcipi;

    @Column(name = "VLMINPEDCOMPRA", precision = 10, scale = 2)
    private BigDecimal vlminpedcompra;

    @Column(name = "SUP_CELULAR", length = 20)
    private String supCelular;

    @Column(name = "COM_CELULAR", length = 20)
    private String comCelular;

    @Column(name = "DEDUZIRSUFRAMACALCCREDICM", length = 1)
    private String deduzirsuframacalccredicm;

    @Column(name = "DEDUZIRSUFRAMACALCCREDPIS", length = 1)
    private String deduzirsuframacalccredpis;

    @Column(name = "UTILIZAOUTRASDESPCALCICMS", length = 1)
    private String utilizaoutrasdespcalcicms;

    @Column(name = "CALCSUFRAMASOBREPLIQUIDO", length = 1)
    private String calcsuframasobrepliquido;

    @Column(name = "DEDUZIRSUFRAMABCSTALIQ1", length = 1)
    private String deduzirsuframabcstaliq1;

    @Column(name = "CALCIPICOMDESC", length = 1)
    private String calcipicomdesc;

    @Column(name = "CALCIPICOMFRETENF", length = 1)
    private String calcipicomfretenf;

    @Column(name = "SOMAFRETEFOBNOSTFORANF", length = 1)
    private String somafretefobnostforanf;

    @Column(name = "LOCALIZACAO", length = 20)
    private String localizacao;

    @Column(name = "CALCULAPISCOFINSCOMIPI", length = 1)
    private String calculapiscofinscomipi;

    @Column(name = "ACEITAENTREGAANCECIP", length = 1)
    private String aceitaentregaancecip;

    @Column(name = "CODCIDADE")
    private Integer codcidade;

    @Column(name = "UTILIZAFRETECALCICMS", length = 1)
    private String utilizafretecalcicms;

    @Column(name = "TIPOFRETECIFFOB", length = 1)
    private String tipofreteciffob;

    @Column(name = "DESTACASELONF", length = 1)
    private String destacaselonf;

    @Column(name = "UTILIZAPERCBON", length = 1)
    private String utilizapercbon;

    @Column(name = "PERCBONDIN", precision = 12, scale = 2)
    private BigDecimal percbondin;

    @Column(name = "PERCBONMERC", precision = 12, scale = 2)
    private BigDecimal percbonmerc;

    @Column(name = "PERCCOMISSAO", precision = 12, scale = 2)
    private BigDecimal perccomissao;

    @Column(name = "UTILIZAOUTRASDESPCALCIPI", length = 1)
    private String utilizaoutrasdespcalcipi;

    @Column(name = "VLLIMITEFRETEMIN", precision = 18, scale = 6)
    private BigDecimal vllimitefretemin;

    @Column(name = "PERCFLUVIAL", precision = 6, scale = 4)
    private BigDecimal percfluvial;

    @Column(name = "CODCONTALANCFRETE")
    private Integer codcontalancfrete;

    @Column(name = "PERCBONOUTRAS", precision = 12, scale = 2)
    private BigDecimal percbonoutras;

    @Column(name = "UTILIZADESCCALCST", length = 1)
    private String utilizadesccalcst;

    @Column(name = "UTILIZADESCCALCICMS", length = 1)
    private String utilizadesccalcicms;

    @Column(name = "CONSIPICALCBASEST", length = 1)
    private String consipicalcbasest;

    @Column(name = "CONSIPICALCBASECREPRES", length = 1)
    private String consipicalcbasecrepres;

    @Column(name = "CLASSE", length = 1)
    private String classe;

    @Column(name = "EREABASTECIMENTO", length = 1)
    private String ereabastecimento;

    @Column(name = "EREDESPACHO", length = 1)
    private String eredespacho;

    @Column(name = "CODPARCELA")
    private Integer codparcela;

    @Column(name = "REP_OBS", length = 2000)
    private String repObs;

    @Column(name = "CALCIPICOMFRETEFOB", length = 1)
    private String calcipicomfretefob;

    @Column(name = "DTIMPORTINTEGRACAO")
    private LocalDate dtimportintegracao;

    @Column(name = "DTULTALTER")
    private LocalDate dtultalter;

    @Column(name = "USAPERCALTERCUSTOENT", length = 1)
    private String usapercaltercustoent;

    @Column(name = "TIPOPESSOA", length = 1)
    private String tipopessoa;

    @Column(name = "PERCIRRF", precision = 4, scale = 2)
    private BigDecimal percirrf;

    @Column(name = "CODCONTAIRRF")
    private Long codcontairrf;

    @Column(name = "PERCISS", precision = 4, scale = 2)
    private BigDecimal perciss;

    @Column(name = "CODCONTAISS")
    private Long codcontaiss;

    @Column(name = "CODCONTACSRF")
    private Long codcontacsrf;

    @Column(name = "CODCONTAINSS")
    private Long codcontainss;

    @Column(name = "EXIGEREDESPACHO", length = 1)
    private String exigeredespacho;

    @Column(name = "CONSOLIDARDIFPRECOVERBA", length = 1)
    private String consolidardifprecoverba;

    @Column(name = "PERCIMPPRODUTORURAL", precision = 12, scale = 4)
    private BigDecimal percimpprodutorural;

    @Column(name = "COMPLEMENTOEND", length = 80)
    private String complementoend;

    @Column(name = "NUMEROEND", length = 6)
    private String numeroend;

    @Column(name = "PERFRETEVALOR", precision = 12, scale = 4)
    private BigDecimal perfretevalor;

    @Column(name = "SIMPLESNACIONAL", length = 1)
    private String simplesnacional;

    @Column(name = "CODFORNECFRETE")
    private Integer codfornecfrete;

    @Column(name = "CALCULARIPIPESOLIQ", length = 1)
    private String calcularipipesoliq;

    @Column(name = "CALCSTGUIAALIQEXT", length = 1)
    private String calcstguiaaliqext;

    @Column(name = "CODUSUARIOWINTHOR")
    private Integer codusuariowinthor;

    @Column(name = "DTULTALTERSRVPRC")
    private LocalDate dtultaltersrvprc;

    @Column(name = "ISENTOST", length = 1)
    private String isentost;

    @Column(name = "IEST", length = 15)
    private String iest;

    @Column(name = "CODFORNECSTGUIA")
    private Integer codfornecstguia;

    @Column(name = "USANUMNEGOCIACAO", length = 1)
    private String usanumnegociacao;

    @Column(name = "INSCMUNICIP", length = 15)
    private String inscmunicip;

    @Column(name = "USAPERCICMSNAALIQEXTST", length = 1)
    private String usapercicmsnaaliqextst;

    @Column(name = "CONSFRETEFOBCALCICMSANTECIP", length = 1)
    private String consfretefobcalcicmsantecip;

    @Column(name = "CAE", length = 30)
    private String cae;

    @Column(name = "GERACREDDIFPRECO", length = 1)
    private String geracreddifpreco;

    @Column(name = "CODPAIS")
    private Integer codpais;

    @Column(name = "CODPARCELASTGUIA")
    private Integer codparcelastguia;

    @Column(name = "CLASSIFICTIPOFORNEC", length = 1)
    private String classifictipofornec;

    @Column(name = "UTILIZAOUTDESPCALCSUFRAMA", length = 1)
    private String utilizaoutdespcalcsuframa;

    @Column(name = "CONSSTNFPISCOFINS", length = 1)
    private String consstnfpiscofins;

    @Column(name = "REP_NEXTELID", length = 18)
    private String repNextelid;

    @Column(name = "PERCPISNFSERVICO", precision = 6, scale = 2)
    private BigDecimal percpisnfservico;

    @Column(name = "PERCCOFINSNFSERVICO", precision = 6, scale = 2)
    private BigDecimal perccofinsnfservico;

    @Column(name = "CODCONTAPIS")
    private Long codcontapis;

    @Column(name = "CODCONTACOFINS")
    private Long codcontacofins;

    @Column(name = "TRANSPAUTONOMO", length = 1)
    private String transpautonomo;

    @Column(name = "EMITENFE", length = 1)
    private String emitenfe;

    @Column(name = "ATUALIZASTULTENT", length = 1)
    private String atualizastultent;

    @Column(name = "PESOMINTRANSP", precision = 12, scale = 4)
    private BigDecimal pesomintransp;

    @Column(name = "TAXAEMISSAOCT", precision = 12, scale = 4)
    private BigDecimal taxaemissaoct;

    @Column(name = "INSS")
    private Long inss;

    @Column(name = "FORNECIMPORTACAO")
    private Short fornecimportacao;

    @Column(name = "CGCAUX", length = 20)
    private String cgcaux;

    @Column(name = "CONTRIBUINTEICMS", length = 1)
    private String contribuinteicms;

    @Column(name = "RECALCTRIBENT", length = 1)
    private String recalctribent;

    @Column(name = "CONSMAIORICMSVLPAUTA", length = 1)
    private String consmaioricmsvlpauta;

    @Column(name = "BLOQUEIOSEFAZFORNEC", length = 1)
    private String bloqueiosefazfornec;

    @Column(name = "DTBLOQUEIOSEFAZFORNEC")
    private LocalDate dtbloqueiosefazfornec;

    @Column(name = "PERCINSS", precision = 5, scale = 2)
    private BigDecimal percinss;

    @Column(name = "PERCCSRF", precision = 5, scale = 2)
    private BigDecimal perccsrf;

    @Column(name = "DEDFRETECIFCREDPRESICMS", length = 1)
    private String dedfretecifcredpresicms;

    @Column(name = "PERPIS", precision = 6, scale = 2)
    private BigDecimal perpis;

    @Column(name = "PERCOFINS", precision = 6, scale = 2)
    private BigDecimal percofins;

    @Column(name = "CODSITTRIBPISCOFINSCONHEC")
    private Short codsittribpiscofinsconhec;

    @Column(name = "USACREDPISCOFINSENTBONIFIC", length = 1)
    private String usacredpiscofinsentbonific;

    @Column(name = "NUMALVARAANVISA", length = 30)
    private String numalvaraanvisa;

    @Column(name = "DTVENCALVARAANVISA")
    private LocalDate dtvencalvaraanvisa;

    @Column(name = "NUMALVARAFUNC", length = 30)
    private String numalvarafunc;

    @Column(name = "DTVENCALVARAFUNC")
    private LocalDate dtvencalvarafunc;

    @Column(name = "NUMALVARAPSICO", length = 30)
    private String numalvarapsico;

    @Column(name = "DTVENCALVARAPSICO")
    private LocalDate dtvencalvarapsico;

    @Column(name = "CRF", length = 30)
    private String crf;

    @Column(name = "DTVENCCRF")
    private LocalDate dtvenccrf;

    @Column(name = "CODCONTACONTABADIANTFOR")
    private Long codcontacontabadiantfor;

    @Column(name = "CALCDESPFINPRAZOPGTO", length = 1)
    private String calcdespfinprazopgto;

    @Column(name = "USAOUTRASDESPSEGUROPISCOFINS", length = 1)
    private String usaoutrasdespseguropiscofins;

    @Column(name = "CODCONTAB", length = 12)
    private String codcontab;

    @Column(name = "NUMCASASDECREDUCAOICMS")
    private Short numcasasdecreducaoicms;

    @Column(name = "UTILIZAIPICALCICMS", length = 1)
    private String utilizaipicalcicms;

    @Column(name = "CODGLN")
    private Long codgln;

    @Column(name = "CODSITTRIBPISCOFINSSERVICO")
    private Short codsittribpiscofinsservico;

    @Column(name = "AVALIACAOVENDA", length = 2)
    private String avaliacaovenda;

    @Column(name = "DTPROXCOMPRA")
    private LocalDate dtproxcompra;

    @Column(name = "DTULTCOMPRA")
    private LocalDate dtultcompra;

    @Column(name = "PERIODICIDADECOMPRA")
    private Short periodicidadecompra;

    @Column(name = "DIASAVALIACAOVENDA")
    private Short diasavaliacaovenda;

    @Column(name = "IDINTEGRACAOMYFROTA")
    private byte[] idintegracaomyfrota;

    @Column(name = "CONSSTGUIAPISCOFINS", length = 1)
    private String consstguiapiscofins;

    @Column(name = "CONCEDCREDPRES", length = 1)
    private String concedcredpres;

    @Column(name = "USAFRETEFOBPORFORNEC", length = 1)
    private String usafretefobporfornec;

    @Column(name = "VLMINPEDREPOSICAO", precision = 15, scale = 2)
    private BigDecimal vlminpedreposicao;

    @Column(name = "GERAPEDBONIFIC", length = 1)
    private String gerapedbonific;

    @Column(name = "QTDIASVENCVERBAS")
    private Short qtdiasvencverbas;

    @Column(name = "TIPOFINANCDEVFORNEC")
    private Short tipofinancdevfornec;

    @Column(name = "CFOPENTADJUD")
    private Integer cfopentadjud;

    @Column(name = "SITTRIBENTADJUD", length = 3)
    private String sittribentadjud;

    @Column(name = "CFOPRESTITUICAO")
    private Integer cfoprestituicao;

    @Column(name = "SITTRIBRESTITUICAO", length = 3)
    private String sittribrestituicao;

    @Column(name = "UTILIZAOUTDESPNFBASEST", length = 1)
    private String utilizaoutdespnfbasest;

    @Column(name = "EQUIPINDUSTRIA", length = 1)
    private String equipindustria;

    @Column(name = "CONSFRETEFOBBASESTNF", length = 1)
    private String consfretefobbasestnf;

    @Column(name = "CODPARCELAFRETEFOB")
    private Integer codparcelafretefob;

    @Column(name = "CODPARCELAOUTDESP")
    private Integer codparcelaoutdesp;

    @Column(name = "CODPARCICMSANTECIP")
    private Integer codparcicmsantecip;

    @Column(name = "CODPARCELADIFALIQ")
    private Integer codparceladifaliq;

    @Column(name = "CODCONTAINSSTOMADOR")
    private Long codcontainsstomador;

    @Column(name = "PERCINSSTOMADOR", precision = 5, scale = 2)
    private BigDecimal percinsstomador;

    @Column(name = "RESSARCIMENTOSTNF", length = 1)
    private String ressarcimentostnf;

    @Column(name = "RESSARCIMENTOSTGUIA", length = 1)
    private String ressarcimentostguia;

    @Column(name = "ADJUDICACAO", length = 1)
    private String adjudicacao;

    @Column(name = "CFOPRESSARCIMENTOSTGUIA")
    private Integer cfopressarcimentostguia;

    @Column(name = "SITTRIBUTRESSARCIMENTOSTGUIA", length = 3)
    private String sittributressarcimentostguia;

    @Column(name = "USADRAWBACK", length = 1)
    private String usadrawback;

    @Column(name = "UTILIZAICMSDIFZERADO", length = 1)
    private String utilizaicmsdifzerado;

    @Column(name = "CALCPISCOFINSBASERED", length = 1)
    private String calcpiscofinsbasered;

    @Column(name = "PERCSESTSENAT", precision = 5, scale = 2)
    private BigDecimal percsestsenat;

    @Column(name = "CODCONTASESTSENAT")
    private Long codcontasestsenat;

    @Column(name = "CONSUMIDORFINAL", length = 1)
    private String consumidorfinal;

    @Column(name = "CODPARCELAFUNRURAL")
    private Integer codparcelafunrural;

    @Column(name = "CONSCAPATAZIAICMS", length = 1)
    private String conscapataziaicms;

    @Column(name = "DEDUZIRSUFRAMAALIQEXT", length = 1)
    private String deduzirsuframaaliqext;

    @Column(name = "CONSIPICALCICMSANT", length = 1)
    private String consipicalcicmsant;

    @Column(name = "EMAILNFE", length = 3500)
    private String emailnfe;

    @Column(name = "CREDITARSALDOESTVERBA", length = 1)
    private String creditarsaldoestverba;

    @Column(name = "TRANSPCREDENCIADOSEFAZ", length = 1)
    private String transpcredenciadosefaz;

    @Column(name = "NUMCREDENCIAMENTOSEFAZ", length = 30)
    private String numcredenciamentosefaz;

    @Column(name = "HORACOLETA")
    private Short horacoleta;

    @Column(name = "USAECOMMERCEUNILEVER", length = 1)
    private String usaecommerceunilever;

    @Column(name = "USADEBCREDOPERLOG", length = 1)
    private String usadebcredoperlog;

    @Column(name = "DIAPGVERBAOPERLOG")
    private Short diapgverbaoperlog;

    @Column(name = "PERCMARKUPCCMED", precision = 8, scale = 4)
    private BigDecimal percmarkupccmed;

    @Column(name = "CODCONFIGARQEXPLICIT")
    private Integer codconfigarqexplicit;

    @Column(name = "CODCONFIGARQIMPLICIT")
    private Integer codconfigarqimplicit;

    @Column(name = "CREDITADESCMENOROPERLOG", length = 1)
    private String creditadescmenoroperlog;

    @Column(name = "CODCOBSEFAZ", length = 4)
    private String codcobsefaz;

    @Column(name = "CONTRIBUINTEDOCPRB", length = 1)
    private String contribuintedocprb;

    @Column(name = "URLBASERASTREIO")
    private String urlbaserastreio;

    @Column(name = "DEDUZIRSUFRAMADIFALIQ", length = 1)
    private String deduzirsuframadifaliq;

    @Column(name = "CODLICITGRUPOFORNEC")
    private Short codlicitgrupofornec;

    @Column(name = "FORMAPGTO")
    private Long formapgto;

    @Column(name = "ASSOCIACAODESPORTIVA", length = 1)
    private String associacaodesportiva;

    @Column(name = "CODIGONACIONALOBRAS", length = 14)
    private String codigonacionalobras;

    @Column(name = "DETENTORREGESPECIAL")
    private Boolean detentorregespecial;

    @Column(name = "CONSIDERARPAUTAZEROSTGUIA", length = 1)
    private String considerarpautazerostguia;

    @Column(name = "CALCCREDICMSBASEREDUZIDA", length = 1)
    private String calccredicmsbasereduzida;

    @Column(name = "CODCENTROCUSTO", length = 40)
    private String codcentrocusto;

    @Column(name = "PERCMARGEMGARANTIDA", precision = 12, scale = 4)
    private BigDecimal percmargemgarantida;

    @Column(name = "DEDUZIRFCPICMSDOFCPST", length = 1)
    private String deduzirfcpicmsdofcpst;

    @Column(name = "IDSOFITVIEW", length = 10)
    private String idsofitview;

    @Column(name = "DTULTALTERSOFITVIEW")
    private LocalDate dtultaltersofitview;

    @Column(name = "DTEXCLUSAOSOFITVIEW")
    private LocalDate dtexclusaosofitview;

    @Column(name = "GERARRECEITARESTITUICAO", length = 1)
    private String gerarreceitarestituicao;

    @Column(name = "CONDCOMERCAUTORIZMED", length = 20)
    private String condcomercautorizmed;

    @Column(name = "MANIFESTACAOAUTOMATICA", length = 1)
    private String manifestacaoautomatica;

    @Column(name = "GERAPEDIDOCOMPRAXML", length = 1)
    private String gerapedidocompraxml;

    @Column(name = "USAREDICMSPARA", length = 1)
    private String usaredicmspara;

    @Column(name = "CONSDESONNOVESUFRAMA", length = 1)
    private String consdesonnovesuframa;

    @Column(name = "GRAVARCODFAB253", length = 1)
    private String gravarcodfab253;

    @Column(name = "UTILIZAFATOR253", length = 1)
    private String utilizafator253;

    @Column(name = "IMPORTAXMLAUTOMATICO", length = 1)
    private String importaxmlautomatico;

    @Column(name = "DEDUZIRIPIBASEDIFALIQ", length = 1)
    private String deduziripibasedifaliq;

    @Column(name = "CONSFRETEFOBBASEDIFALIQ", length = 1)
    private String consfretefobbasedifaliq;

    @Column(name = "ALIMENTAFUNDOMULTIFILIAL", length = 1)
    private String alimentafundomultifilial;

    @Column(name = "ORIGEMPARCFINANC", length = 1)
    private String origemparcfinanc;

    @Column(name = "APLICAVERBAREBCUSTO", length = 1)
    private String aplicaverbarebcusto;

    @Column(name = "TIPOFRETEDESPACHO", length = 1)
    private String tipofretedespacho;

    @Column(name = "TIPOVENCIMENTO", length = 1)
    private String tipovencimento;

    @Column(name = "FORMATRIBPRODRURAL", length = 1)
    private String formatribprodrural;

    @Column(name = "INDAQPRODRURAL", length = 1)
    private String indaqprodrural;

    @Column(name = "PRODUTORRURAL", length = 1)
    private String produtorrural;

    @Column(name = "CPFPRODUTORRURAL", length = 18)
    private String cpfprodutorrural;

    @Column(name = "PERCCONTRIBPREVDESC", precision = 12, scale = 4)
    private BigDecimal perccontribprevdesc;

    @Column(name = "PERCCONTRIBBEMCONC", precision = 12, scale = 4)
    private BigDecimal perccontribbemconc;

    @Column(name = "PERCCONTRIBSENAR", precision = 12, scale = 4)
    private BigDecimal perccontribsenar;

    @Column(name = "CODFORNECBAL", length = 4)
    private String codfornecbal;

    @Column(name = "UTILIZAPISCOFINSTRIBENT", length = 1)
    private String utilizapiscofinstribent;

    @Column(name = "UTILIZAICMSTRIBENT", length = 1)
    private String utilizaicmstribent;

    @Column(name = "JUROCAPITALPROP", length = 1)
    private String jurocapitalprop;

    @Column(name = "LIBERAENTIMPXML", length = 1)
    private String liberaentimpxml;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getRepres() {
        return repres;
    }

    public void setRepres(String repres) {
        this.repres = repres;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelrep() {
        return telrep;
    }

    public void setTelrep(String telrep) {
        this.telrep = telrep;
    }

    public String getTelfab() {
        return telfab;
    }

    public void setTelfab(String telfab) {
        this.telfab = telfab;
    }

    public String getTelexrep() {
        return telexrep;
    }

    public void setTelexrep(String telexrep) {
        this.telexrep = telexrep;
    }

    public String getTelexfab() {
        return telexfab;
    }

    public void setTelexfab(String telexfab) {
        this.telexfab = telexfab;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    public String getFaxrep() {
        return faxrep;
    }

    public void setFaxrep(String faxrep) {
        this.faxrep = faxrep;
    }

    public String getFaxfab() {
        return faxfab;
    }

    public void setFaxfab(String faxfab) {
        this.faxfab = faxfab;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Short getPrazoentrega() {
        return prazoentrega;
    }

    public void setPrazoentrega(Short prazoentrega) {
        this.prazoentrega = prazoentrega;
    }

    public String getBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(String bloqueio) {
        this.bloqueio = bloqueio;
    }

    public LocalDate getDtbloqueio() {
        return dtbloqueio;
    }

    public void setDtbloqueio(LocalDate dtbloqueio) {
        this.dtbloqueio = dtbloqueio;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getRevenda() {
        return revenda;
    }

    public void setRevenda(String revenda) {
        this.revenda = revenda;
    }

    public Integer getCodcli() {
        return codcli;
    }

    public void setCodcli(Integer codcli) {
        this.codcli = codcli;
    }

    public Integer getCodcomprador() {
        return codcomprador;
    }

    public void setCodcomprador(Integer codcomprador) {
        this.codcomprador = codcomprador;
    }

    public String getRepContato() {
        return repContato;
    }

    public void setRepContato(String repContato) {
        this.repContato = repContato;
    }

    public String getRepEndereco() {
        return repEndereco;
    }

    public void setRepEndereco(String repEndereco) {
        this.repEndereco = repEndereco;
    }

    public String getRepBairro() {
        return repBairro;
    }

    public void setRepBairro(String repBairro) {
        this.repBairro = repBairro;
    }

    public String getRepCidade() {
        return repCidade;
    }

    public void setRepCidade(String repCidade) {
        this.repCidade = repCidade;
    }

    public String getRepUf() {
        return repUf;
    }

    public void setRepUf(String repUf) {
        this.repUf = repUf;
    }

    public Integer getRepCep() {
        return repCep;
    }

    public void setRepCep(Integer repCep) {
        this.repCep = repCep;
    }

    public String getExcluido() {
        return excluido;
    }

    public void setExcluido(String excluido) {
        this.excluido = excluido;
    }

    public Short getLedtime() {
        return ledtime;
    }

    public void setLedtime(Short ledtime) {
        this.ledtime = ledtime;
    }

    public Short getCobertura() {
        return cobertura;
    }

    public void setCobertura(Short cobertura) {
        this.cobertura = cobertura;
    }

    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }

    public String getCentralizacao() {
        return centralizacao;
    }

    public void setCentralizacao(String centralizacao) {
        this.centralizacao = centralizacao;
    }

    public LocalDate getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(LocalDate dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public LocalDate getDtexclusao() {
        return dtexclusao;
    }

    public void setDtexclusao(LocalDate dtexclusao) {
        this.dtexclusao = dtexclusao;
    }

    public String getObs2() {
        return obs2;
    }

    public void setObs2(String obs2) {
        this.obs2 = obs2;
    }

    public Short getPrazomin() {
        return prazomin;
    }

    public void setPrazomin(Short prazomin) {
        this.prazomin = prazomin;
    }

    public String getDescpagtodup() {
        return descpagtodup;
    }

    public void setDescpagtodup(String descpagtodup) {
        this.descpagtodup = descpagtodup;
    }

    public String getEndercob() {
        return endercob;
    }

    public void setEndercob(String endercob) {
        this.endercob = endercob;
    }

    public String getBairrocob() {
        return bairrocob;
    }

    public void setBairrocob(String bairrocob) {
        this.bairrocob = bairrocob;
    }

    public String getMunicob() {
        return municob;
    }

    public void setMunicob(String municob) {
        this.municob = municob;
    }

    public String getEstcob() {
        return estcob;
    }

    public void setEstcob(String estcob) {
        this.estcob = estcob;
    }

    public String getCepcob() {
        return cepcob;
    }

    public void setCepcob(String cepcob) {
        this.cepcob = cepcob;
    }

    public String getTelcob() {
        return telcob;
    }

    public void setTelcob(String telcob) {
        this.telcob = telcob;
    }

    public String getEstrategico() {
        return estrategico;
    }

    public void setEstrategico(String estrategico) {
        this.estrategico = estrategico;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getCoddepto() {
        return coddepto;
    }

    public void setCoddepto(Integer coddepto) {
        this.coddepto = coddepto;
    }

    public Integer getCodfornecprinc() {
        return codfornecprinc;
    }

    public void setCodfornecprinc(Integer codfornecprinc) {
        this.codfornecprinc = codfornecprinc;
    }

    public String getContatocom() {
        return contatocom;
    }

    public void setContatocom(String contatocom) {
        this.contatocom = contatocom;
    }

    public String getTelefonecom() {
        return telefonecom;
    }

    public void setTelefonecom(String telefonecom) {
        this.telefonecom = telefonecom;
    }

    public String getContatoadm() {
        return contatoadm;
    }

    public void setContatoadm(String contatoadm) {
        this.contatoadm = contatoadm;
    }

    public String getTelefoneadm() {
        return telefoneadm;
    }

    public void setTelefoneadm(String telefoneadm) {
        this.telefoneadm = telefoneadm;
    }

    public Short getDiasemanaatend() {
        return diasemanaatend;
    }

    public void setDiasemanaatend(Short diasemanaatend) {
        this.diasemanaatend = diasemanaatend;
    }

    public Short getPeriocidadeatend() {
        return periocidadeatend;
    }

    public void setPeriocidadeatend(Short periocidadeatend) {
        this.periocidadeatend = periocidadeatend;
    }

    public LocalDate getDtproxatend() {
        return dtproxatend;
    }

    public void setDtproxatend(LocalDate dtproxatend) {
        this.dtproxatend = dtproxatend;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public BigDecimal getPercdespfin() {
        return percdespfin;
    }

    public void setPercdespfin(BigDecimal percdespfin) {
        this.percdespfin = percdespfin;
    }

    public BigDecimal getPercdescfin() {
        return percdescfin;
    }

    public void setPercdescfin(BigDecimal percdescfin) {
        this.percdescfin = percdescfin;
    }

    public Short getNumbancodoc() {
        return numbancodoc;
    }

    public void setNumbancodoc(Short numbancodoc) {
        this.numbancodoc = numbancodoc;
    }

    public Integer getNumagenciadoc() {
        return numagenciadoc;
    }

    public void setNumagenciadoc(Integer numagenciadoc) {
        this.numagenciadoc = numagenciadoc;
    }

    public String getNumccorrentedoc() {
        return numccorrentedoc;
    }

    public void setNumccorrentedoc(String numccorrentedoc) {
        this.numccorrentedoc = numccorrentedoc;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public Short getNumdepirrf() {
        return numdepirrf;
    }

    public void setNumdepirrf(Short numdepirrf) {
        this.numdepirrf = numdepirrf;
    }

    public BigDecimal getValordeducaoirrf() {
        return valordeducaoirrf;
    }

    public void setValordeducaoirrf(BigDecimal valordeducaoirrf) {
        this.valordeducaoirrf = valordeducaoirrf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCoddistrib() {
        return coddistrib;
    }

    public void setCoddistrib(String coddistrib) {
        this.coddistrib = coddistrib;
    }

    public BigDecimal getVlfretekg() {
        return vlfretekg;
    }

    public void setVlfretekg(BigDecimal vlfretekg) {
        this.vlfretekg = vlfretekg;
    }

    public BigDecimal getPercoutroscustosfrete() {
        return percoutroscustosfrete;
    }

    public void setPercoutroscustosfrete(BigDecimal percoutroscustosfrete) {
        this.percoutroscustosfrete = percoutroscustosfrete;
    }

    public String getDistrib() {
        return distrib;
    }

    public void setDistrib(String distrib) {
        this.distrib = distrib;
    }

    public Long getInscestrangeira() {
        return inscestrangeira;
    }

    public void setInscestrangeira(Long inscestrangeira) {
        this.inscestrangeira = inscestrangeira;
    }

    public String getIndustrialocal() {
        return industrialocal;
    }

    public void setIndustrialocal(String industrialocal) {
        this.industrialocal = industrialocal;
    }

    public Integer getGrupocampanha() {
        return grupocampanha;
    }

    public void setGrupocampanha(Integer grupocampanha) {
        this.grupocampanha = grupocampanha;
    }

    public BigDecimal getPercmaxbonific() {
        return percmaxbonific;
    }

    public void setPercmaxbonific(BigDecimal percmaxbonific) {
        this.percmaxbonific = percmaxbonific;
    }

    public BigDecimal getPercpisred() {
        return percpisred;
    }

    public void setPercpisred(BigDecimal percpisred) {
        this.percpisred = percpisred;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public String getCodprodutorrural() {
        return codprodutorrural;
    }

    public void setCodprodutorrural(String codprodutorrural) {
        this.codprodutorrural = codprodutorrural;
    }

    public String getDvag() {
        return dvag;
    }

    public void setDvag(String dvag) {
        this.dvag = dvag;
    }

    public String getDvcc() {
        return dvcc;
    }

    public void setDvcc(String dvcc) {
        this.dvcc = dvcc;
    }

    public String getTipoembalagempedido() {
        return tipoembalagempedido;
    }

    public void setTipoembalagempedido(String tipoembalagempedido) {
        this.tipoembalagempedido = tipoembalagempedido;
    }

    public String getSupervisorverba() {
        return supervisorverba;
    }

    public void setSupervisorverba(String supervisorverba) {
        this.supervisorverba = supervisorverba;
    }

    public String getContatoverba() {
        return contatoverba;
    }

    public void setContatoverba(String contatoverba) {
        this.contatoverba = contatoverba;
    }

    public String getCpfcontatoverba() {
        return cpfcontatoverba;
    }

    public void setCpfcontatoverba(String cpfcontatoverba) {
        this.cpfcontatoverba = cpfcontatoverba;
    }

    public String getRgcontatoverba() {
        return rgcontatoverba;
    }

    public void setRgcontatoverba(String rgcontatoverba) {
        this.rgcontatoverba = rgcontatoverba;
    }

    public LocalDate getRepDtaniversario() {
        return repDtaniversario;
    }

    public void setRepDtaniversario(LocalDate repDtaniversario) {
        this.repDtaniversario = repDtaniversario;
    }

    public String getAdmContato() {
        return admContato;
    }

    public void setAdmContato(String admContato) {
        this.admContato = admContato;
    }

    public LocalDate getAdmDtaniversario() {
        return admDtaniversario;
    }

    public void setAdmDtaniversario(LocalDate admDtaniversario) {
        this.admDtaniversario = admDtaniversario;
    }

    public String getAdmEndereco() {
        return admEndereco;
    }

    public void setAdmEndereco(String admEndereco) {
        this.admEndereco = admEndereco;
    }

    public String getAdmBairro() {
        return admBairro;
    }

    public void setAdmBairro(String admBairro) {
        this.admBairro = admBairro;
    }

    public String getAdmCidade() {
        return admCidade;
    }

    public void setAdmCidade(String admCidade) {
        this.admCidade = admCidade;
    }

    public String getAdmUf() {
        return admUf;
    }

    public void setAdmUf(String admUf) {
        this.admUf = admUf;
    }

    public Integer getAdmCep() {
        return admCep;
    }

    public void setAdmCep(Integer admCep) {
        this.admCep = admCep;
    }

    public String getComContato() {
        return comContato;
    }

    public void setComContato(String comContato) {
        this.comContato = comContato;
    }

    public LocalDate getComDtaniversario() {
        return comDtaniversario;
    }

    public void setComDtaniversario(LocalDate comDtaniversario) {
        this.comDtaniversario = comDtaniversario;
    }

    public String getComEndereco() {
        return comEndereco;
    }

    public void setComEndereco(String comEndereco) {
        this.comEndereco = comEndereco;
    }

    public String getComBairro() {
        return comBairro;
    }

    public void setComBairro(String comBairro) {
        this.comBairro = comBairro;
    }

    public String getComCidade() {
        return comCidade;
    }

    public void setComCidade(String comCidade) {
        this.comCidade = comCidade;
    }

    public String getComUf() {
        return comUf;
    }

    public void setComUf(String comUf) {
        this.comUf = comUf;
    }

    public Integer getComCep() {
        return comCep;
    }

    public void setComCep(Integer comCep) {
        this.comCep = comCep;
    }

    public String getTransporteproprio() {
        return transporteproprio;
    }

    public void setTransporteproprio(String transporteproprio) {
        this.transporteproprio = transporteproprio;
    }

    public BigDecimal getVlpedagio() {
        return vlpedagio;
    }

    public void setVlpedagio(BigDecimal vlpedagio) {
        this.vlpedagio = vlpedagio;
    }

    public BigDecimal getPergris() {
        return pergris;
    }

    public void setPergris(BigDecimal pergris) {
        this.pergris = pergris;
    }

    public String getIcmssobretxminima() {
        return icmssobretxminima;
    }

    public void setIcmssobretxminima(String icmssobretxminima) {
        this.icmssobretxminima = icmssobretxminima;
    }

    public BigDecimal getGatilho() {
        return gatilho;
    }

    public void setGatilho(BigDecimal gatilho) {
        this.gatilho = gatilho;
    }

    public Short getTipocalcfrete() {
        return tipocalcfrete;
    }

    public void setTipocalcfrete(Short tipocalcfrete) {
        this.tipocalcfrete = tipocalcfrete;
    }

    public BigDecimal getTaxa0() {
        return taxa0;
    }

    public void setTaxa0(BigDecimal taxa0) {
        this.taxa0 = taxa0;
    }

    public BigDecimal getTaxa7() {
        return taxa7;
    }

    public void setTaxa7(BigDecimal taxa7) {
        this.taxa7 = taxa7;
    }

    public BigDecimal getTaxa14() {
        return taxa14;
    }

    public void setTaxa14(BigDecimal taxa14) {
        this.taxa14 = taxa14;
    }

    public BigDecimal getTaxa21() {
        return taxa21;
    }

    public void setTaxa21(BigDecimal taxa21) {
        this.taxa21 = taxa21;
    }

    public BigDecimal getTaxa28() {
        return taxa28;
    }

    public void setTaxa28(BigDecimal taxa28) {
        this.taxa28 = taxa28;
    }

    public BigDecimal getTaxa35() {
        return taxa35;
    }

    public void setTaxa35(BigDecimal taxa35) {
        this.taxa35 = taxa35;
    }

    public BigDecimal getTaxa42() {
        return taxa42;
    }

    public void setTaxa42(BigDecimal taxa42) {
        this.taxa42 = taxa42;
    }

    public LocalDate getDtultcontatocob() {
        return dtultcontatocob;
    }

    public void setDtultcontatocob(LocalDate dtultcontatocob) {
        this.dtultcontatocob = dtultcontatocob;
    }

    public Integer getCodfuncultcontatocob() {
        return codfuncultcontatocob;
    }

    public void setCodfuncultcontatocob(Integer codfuncultcontatocob) {
        this.codfuncultcontatocob = codfuncultcontatocob;
    }

    public LocalDate getDtproxcontatocob() {
        return dtproxcontatocob;
    }

    public void setDtproxcontatocob(LocalDate dtproxcontatocob) {
        this.dtproxcontatocob = dtproxcontatocob;
    }

    public Long getCodmunicipio() {
        return codmunicipio;
    }

    public void setCodmunicipio(Long codmunicipio) {
        this.codmunicipio = codmunicipio;
    }

    public String getComEmail() {
        return comEmail;
    }

    public void setComEmail(String comEmail) {
        this.comEmail = comEmail;
    }

    public String getRepEmail() {
        return repEmail;
    }

    public void setRepEmail(String repEmail) {
        this.repEmail = repEmail;
    }

    public String getSupEmail() {
        return supEmail;
    }

    public void setSupEmail(String supEmail) {
        this.supEmail = supEmail;
    }

    public LocalDate getDtvalidade() {
        return dtvalidade;
    }

    public void setDtvalidade(LocalDate dtvalidade) {
        this.dtvalidade = dtvalidade;
    }

    public String getTipofornec() {
        return tipofornec;
    }

    public void setTipofornec(String tipofornec) {
        this.tipofornec = tipofornec;
    }

    public String getUtilizadesccalcipi() {
        return utilizadesccalcipi;
    }

    public void setUtilizadesccalcipi(String utilizadesccalcipi) {
        this.utilizadesccalcipi = utilizadesccalcipi;
    }

    public String getUtilizafretecalcipi() {
        return utilizafretecalcipi;
    }

    public void setUtilizafretecalcipi(String utilizafretecalcipi) {
        this.utilizafretecalcipi = utilizafretecalcipi;
    }

    public BigDecimal getVlminpedcompra() {
        return vlminpedcompra;
    }

    public void setVlminpedcompra(BigDecimal vlminpedcompra) {
        this.vlminpedcompra = vlminpedcompra;
    }

    public String getSupCelular() {
        return supCelular;
    }

    public void setSupCelular(String supCelular) {
        this.supCelular = supCelular;
    }

    public String getComCelular() {
        return comCelular;
    }

    public void setComCelular(String comCelular) {
        this.comCelular = comCelular;
    }

    public String getDeduzirsuframacalccredicm() {
        return deduzirsuframacalccredicm;
    }

    public void setDeduzirsuframacalccredicm(String deduzirsuframacalccredicm) {
        this.deduzirsuframacalccredicm = deduzirsuframacalccredicm;
    }

    public String getDeduzirsuframacalccredpis() {
        return deduzirsuframacalccredpis;
    }

    public void setDeduzirsuframacalccredpis(String deduzirsuframacalccredpis) {
        this.deduzirsuframacalccredpis = deduzirsuframacalccredpis;
    }

    public String getUtilizaoutrasdespcalcicms() {
        return utilizaoutrasdespcalcicms;
    }

    public void setUtilizaoutrasdespcalcicms(String utilizaoutrasdespcalcicms) {
        this.utilizaoutrasdespcalcicms = utilizaoutrasdespcalcicms;
    }

    public String getCalcsuframasobrepliquido() {
        return calcsuframasobrepliquido;
    }

    public void setCalcsuframasobrepliquido(String calcsuframasobrepliquido) {
        this.calcsuframasobrepliquido = calcsuframasobrepliquido;
    }

    public String getDeduzirsuframabcstaliq1() {
        return deduzirsuframabcstaliq1;
    }

    public void setDeduzirsuframabcstaliq1(String deduzirsuframabcstaliq1) {
        this.deduzirsuframabcstaliq1 = deduzirsuframabcstaliq1;
    }

    public String getCalcipicomdesc() {
        return calcipicomdesc;
    }

    public void setCalcipicomdesc(String calcipicomdesc) {
        this.calcipicomdesc = calcipicomdesc;
    }

    public String getCalcipicomfretenf() {
        return calcipicomfretenf;
    }

    public void setCalcipicomfretenf(String calcipicomfretenf) {
        this.calcipicomfretenf = calcipicomfretenf;
    }

    public String getSomafretefobnostforanf() {
        return somafretefobnostforanf;
    }

    public void setSomafretefobnostforanf(String somafretefobnostforanf) {
        this.somafretefobnostforanf = somafretefobnostforanf;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getCalculapiscofinscomipi() {
        return calculapiscofinscomipi;
    }

    public void setCalculapiscofinscomipi(String calculapiscofinscomipi) {
        this.calculapiscofinscomipi = calculapiscofinscomipi;
    }

    public String getAceitaentregaancecip() {
        return aceitaentregaancecip;
    }

    public void setAceitaentregaancecip(String aceitaentregaancecip) {
        this.aceitaentregaancecip = aceitaentregaancecip;
    }

    public Integer getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(Integer codcidade) {
        this.codcidade = codcidade;
    }

    public String getUtilizafretecalcicms() {
        return utilizafretecalcicms;
    }

    public void setUtilizafretecalcicms(String utilizafretecalcicms) {
        this.utilizafretecalcicms = utilizafretecalcicms;
    }

    public String getTipofreteciffob() {
        return tipofreteciffob;
    }

    public void setTipofreteciffob(String tipofreteciffob) {
        this.tipofreteciffob = tipofreteciffob;
    }

    public String getDestacaselonf() {
        return destacaselonf;
    }

    public void setDestacaselonf(String destacaselonf) {
        this.destacaselonf = destacaselonf;
    }

    public String getUtilizapercbon() {
        return utilizapercbon;
    }

    public void setUtilizapercbon(String utilizapercbon) {
        this.utilizapercbon = utilizapercbon;
    }

    public BigDecimal getPercbondin() {
        return percbondin;
    }

    public void setPercbondin(BigDecimal percbondin) {
        this.percbondin = percbondin;
    }

    public BigDecimal getPercbonmerc() {
        return percbonmerc;
    }

    public void setPercbonmerc(BigDecimal percbonmerc) {
        this.percbonmerc = percbonmerc;
    }

    public BigDecimal getPerccomissao() {
        return perccomissao;
    }

    public void setPerccomissao(BigDecimal perccomissao) {
        this.perccomissao = perccomissao;
    }

    public String getUtilizaoutrasdespcalcipi() {
        return utilizaoutrasdespcalcipi;
    }

    public void setUtilizaoutrasdespcalcipi(String utilizaoutrasdespcalcipi) {
        this.utilizaoutrasdespcalcipi = utilizaoutrasdespcalcipi;
    }

    public BigDecimal getVllimitefretemin() {
        return vllimitefretemin;
    }

    public void setVllimitefretemin(BigDecimal vllimitefretemin) {
        this.vllimitefretemin = vllimitefretemin;
    }

    public BigDecimal getPercfluvial() {
        return percfluvial;
    }

    public void setPercfluvial(BigDecimal percfluvial) {
        this.percfluvial = percfluvial;
    }

    public Integer getCodcontalancfrete() {
        return codcontalancfrete;
    }

    public void setCodcontalancfrete(Integer codcontalancfrete) {
        this.codcontalancfrete = codcontalancfrete;
    }

    public BigDecimal getPercbonoutras() {
        return percbonoutras;
    }

    public void setPercbonoutras(BigDecimal percbonoutras) {
        this.percbonoutras = percbonoutras;
    }

    public String getUtilizadesccalcst() {
        return utilizadesccalcst;
    }

    public void setUtilizadesccalcst(String utilizadesccalcst) {
        this.utilizadesccalcst = utilizadesccalcst;
    }

    public String getUtilizadesccalcicms() {
        return utilizadesccalcicms;
    }

    public void setUtilizadesccalcicms(String utilizadesccalcicms) {
        this.utilizadesccalcicms = utilizadesccalcicms;
    }

    public String getConsipicalcbasest() {
        return consipicalcbasest;
    }

    public void setConsipicalcbasest(String consipicalcbasest) {
        this.consipicalcbasest = consipicalcbasest;
    }

    public String getConsipicalcbasecrepres() {
        return consipicalcbasecrepres;
    }

    public void setConsipicalcbasecrepres(String consipicalcbasecrepres) {
        this.consipicalcbasecrepres = consipicalcbasecrepres;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getEreabastecimento() {
        return ereabastecimento;
    }

    public void setEreabastecimento(String ereabastecimento) {
        this.ereabastecimento = ereabastecimento;
    }

    public String getEredespacho() {
        return eredespacho;
    }

    public void setEredespacho(String eredespacho) {
        this.eredespacho = eredespacho;
    }

    public Integer getCodparcela() {
        return codparcela;
    }

    public void setCodparcela(Integer codparcela) {
        this.codparcela = codparcela;
    }

    public String getRepObs() {
        return repObs;
    }

    public void setRepObs(String repObs) {
        this.repObs = repObs;
    }

    public String getCalcipicomfretefob() {
        return calcipicomfretefob;
    }

    public void setCalcipicomfretefob(String calcipicomfretefob) {
        this.calcipicomfretefob = calcipicomfretefob;
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

    public String getUsapercaltercustoent() {
        return usapercaltercustoent;
    }

    public void setUsapercaltercustoent(String usapercaltercustoent) {
        this.usapercaltercustoent = usapercaltercustoent;
    }

    public String getTipopessoa() {
        return tipopessoa;
    }

    public void setTipopessoa(String tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

    public BigDecimal getPercirrf() {
        return percirrf;
    }

    public void setPercirrf(BigDecimal percirrf) {
        this.percirrf = percirrf;
    }

    public Long getCodcontairrf() {
        return codcontairrf;
    }

    public void setCodcontairrf(Long codcontairrf) {
        this.codcontairrf = codcontairrf;
    }

    public BigDecimal getPerciss() {
        return perciss;
    }

    public void setPerciss(BigDecimal perciss) {
        this.perciss = perciss;
    }

    public Long getCodcontaiss() {
        return codcontaiss;
    }

    public void setCodcontaiss(Long codcontaiss) {
        this.codcontaiss = codcontaiss;
    }

    public Long getCodcontacsrf() {
        return codcontacsrf;
    }

    public void setCodcontacsrf(Long codcontacsrf) {
        this.codcontacsrf = codcontacsrf;
    }

    public Long getCodcontainss() {
        return codcontainss;
    }

    public void setCodcontainss(Long codcontainss) {
        this.codcontainss = codcontainss;
    }

    public String getExigeredespacho() {
        return exigeredespacho;
    }

    public void setExigeredespacho(String exigeredespacho) {
        this.exigeredespacho = exigeredespacho;
    }

    public String getConsolidardifprecoverba() {
        return consolidardifprecoverba;
    }

    public void setConsolidardifprecoverba(String consolidardifprecoverba) {
        this.consolidardifprecoverba = consolidardifprecoverba;
    }

    public BigDecimal getPercimpprodutorural() {
        return percimpprodutorural;
    }

    public void setPercimpprodutorural(BigDecimal percimpprodutorural) {
        this.percimpprodutorural = percimpprodutorural;
    }

    public String getComplementoend() {
        return complementoend;
    }

    public void setComplementoend(String complementoend) {
        this.complementoend = complementoend;
    }

    public String getNumeroend() {
        return numeroend;
    }

    public void setNumeroend(String numeroend) {
        this.numeroend = numeroend;
    }

    public BigDecimal getPerfretevalor() {
        return perfretevalor;
    }

    public void setPerfretevalor(BigDecimal perfretevalor) {
        this.perfretevalor = perfretevalor;
    }

    public String getSimplesnacional() {
        return simplesnacional;
    }

    public void setSimplesnacional(String simplesnacional) {
        this.simplesnacional = simplesnacional;
    }

    public Integer getCodfornecfrete() {
        return codfornecfrete;
    }

    public void setCodfornecfrete(Integer codfornecfrete) {
        this.codfornecfrete = codfornecfrete;
    }

    public String getCalcularipipesoliq() {
        return calcularipipesoliq;
    }

    public void setCalcularipipesoliq(String calcularipipesoliq) {
        this.calcularipipesoliq = calcularipipesoliq;
    }

    public String getCalcstguiaaliqext() {
        return calcstguiaaliqext;
    }

    public void setCalcstguiaaliqext(String calcstguiaaliqext) {
        this.calcstguiaaliqext = calcstguiaaliqext;
    }

    public Integer getCodusuariowinthor() {
        return codusuariowinthor;
    }

    public void setCodusuariowinthor(Integer codusuariowinthor) {
        this.codusuariowinthor = codusuariowinthor;
    }

    public LocalDate getDtultaltersrvprc() {
        return dtultaltersrvprc;
    }

    public void setDtultaltersrvprc(LocalDate dtultaltersrvprc) {
        this.dtultaltersrvprc = dtultaltersrvprc;
    }

    public String getIsentost() {
        return isentost;
    }

    public void setIsentost(String isentost) {
        this.isentost = isentost;
    }

    public String getIest() {
        return iest;
    }

    public void setIest(String iest) {
        this.iest = iest;
    }

    public Integer getCodfornecstguia() {
        return codfornecstguia;
    }

    public void setCodfornecstguia(Integer codfornecstguia) {
        this.codfornecstguia = codfornecstguia;
    }

    public String getUsanumnegociacao() {
        return usanumnegociacao;
    }

    public void setUsanumnegociacao(String usanumnegociacao) {
        this.usanumnegociacao = usanumnegociacao;
    }

    public String getInscmunicip() {
        return inscmunicip;
    }

    public void setInscmunicip(String inscmunicip) {
        this.inscmunicip = inscmunicip;
    }

    public String getUsapercicmsnaaliqextst() {
        return usapercicmsnaaliqextst;
    }

    public void setUsapercicmsnaaliqextst(String usapercicmsnaaliqextst) {
        this.usapercicmsnaaliqextst = usapercicmsnaaliqextst;
    }

    public String getConsfretefobcalcicmsantecip() {
        return consfretefobcalcicmsantecip;
    }

    public void setConsfretefobcalcicmsantecip(String consfretefobcalcicmsantecip) {
        this.consfretefobcalcicmsantecip = consfretefobcalcicmsantecip;
    }

    public String getCae() {
        return cae;
    }

    public void setCae(String cae) {
        this.cae = cae;
    }

    public String getGeracreddifpreco() {
        return geracreddifpreco;
    }

    public void setGeracreddifpreco(String geracreddifpreco) {
        this.geracreddifpreco = geracreddifpreco;
    }

    public Integer getCodpais() {
        return codpais;
    }

    public void setCodpais(Integer codpais) {
        this.codpais = codpais;
    }

    public Integer getCodparcelastguia() {
        return codparcelastguia;
    }

    public void setCodparcelastguia(Integer codparcelastguia) {
        this.codparcelastguia = codparcelastguia;
    }

    public String getClassifictipofornec() {
        return classifictipofornec;
    }

    public void setClassifictipofornec(String classifictipofornec) {
        this.classifictipofornec = classifictipofornec;
    }

    public String getUtilizaoutdespcalcsuframa() {
        return utilizaoutdespcalcsuframa;
    }

    public void setUtilizaoutdespcalcsuframa(String utilizaoutdespcalcsuframa) {
        this.utilizaoutdespcalcsuframa = utilizaoutdespcalcsuframa;
    }

    public String getConsstnfpiscofins() {
        return consstnfpiscofins;
    }

    public void setConsstnfpiscofins(String consstnfpiscofins) {
        this.consstnfpiscofins = consstnfpiscofins;
    }

    public String getRepNextelid() {
        return repNextelid;
    }

    public void setRepNextelid(String repNextelid) {
        this.repNextelid = repNextelid;
    }

    public BigDecimal getPercpisnfservico() {
        return percpisnfservico;
    }

    public void setPercpisnfservico(BigDecimal percpisnfservico) {
        this.percpisnfservico = percpisnfservico;
    }

    public BigDecimal getPerccofinsnfservico() {
        return perccofinsnfservico;
    }

    public void setPerccofinsnfservico(BigDecimal perccofinsnfservico) {
        this.perccofinsnfservico = perccofinsnfservico;
    }

    public Long getCodcontapis() {
        return codcontapis;
    }

    public void setCodcontapis(Long codcontapis) {
        this.codcontapis = codcontapis;
    }

    public Long getCodcontacofins() {
        return codcontacofins;
    }

    public void setCodcontacofins(Long codcontacofins) {
        this.codcontacofins = codcontacofins;
    }

    public String getTranspautonomo() {
        return transpautonomo;
    }

    public void setTranspautonomo(String transpautonomo) {
        this.transpautonomo = transpautonomo;
    }

    public String getEmitenfe() {
        return emitenfe;
    }

    public void setEmitenfe(String emitenfe) {
        this.emitenfe = emitenfe;
    }

    public String getAtualizastultent() {
        return atualizastultent;
    }

    public void setAtualizastultent(String atualizastultent) {
        this.atualizastultent = atualizastultent;
    }

    public BigDecimal getPesomintransp() {
        return pesomintransp;
    }

    public void setPesomintransp(BigDecimal pesomintransp) {
        this.pesomintransp = pesomintransp;
    }

    public BigDecimal getTaxaemissaoct() {
        return taxaemissaoct;
    }

    public void setTaxaemissaoct(BigDecimal taxaemissaoct) {
        this.taxaemissaoct = taxaemissaoct;
    }

    public Long getInss() {
        return inss;
    }

    public void setInss(Long inss) {
        this.inss = inss;
    }

    public Short getFornecimportacao() {
        return fornecimportacao;
    }

    public void setFornecimportacao(Short fornecimportacao) {
        this.fornecimportacao = fornecimportacao;
    }

    public String getCgcaux() {
        return cgcaux;
    }

    public void setCgcaux(String cgcaux) {
        this.cgcaux = cgcaux;
    }

    public String getContribuinteicms() {
        return contribuinteicms;
    }

    public void setContribuinteicms(String contribuinteicms) {
        this.contribuinteicms = contribuinteicms;
    }

    public String getRecalctribent() {
        return recalctribent;
    }

    public void setRecalctribent(String recalctribent) {
        this.recalctribent = recalctribent;
    }

    public String getConsmaioricmsvlpauta() {
        return consmaioricmsvlpauta;
    }

    public void setConsmaioricmsvlpauta(String consmaioricmsvlpauta) {
        this.consmaioricmsvlpauta = consmaioricmsvlpauta;
    }

    public String getBloqueiosefazfornec() {
        return bloqueiosefazfornec;
    }

    public void setBloqueiosefazfornec(String bloqueiosefazfornec) {
        this.bloqueiosefazfornec = bloqueiosefazfornec;
    }

    public LocalDate getDtbloqueiosefazfornec() {
        return dtbloqueiosefazfornec;
    }

    public void setDtbloqueiosefazfornec(LocalDate dtbloqueiosefazfornec) {
        this.dtbloqueiosefazfornec = dtbloqueiosefazfornec;
    }

    public BigDecimal getPercinss() {
        return percinss;
    }

    public void setPercinss(BigDecimal percinss) {
        this.percinss = percinss;
    }

    public BigDecimal getPerccsrf() {
        return perccsrf;
    }

    public void setPerccsrf(BigDecimal perccsrf) {
        this.perccsrf = perccsrf;
    }

    public String getDedfretecifcredpresicms() {
        return dedfretecifcredpresicms;
    }

    public void setDedfretecifcredpresicms(String dedfretecifcredpresicms) {
        this.dedfretecifcredpresicms = dedfretecifcredpresicms;
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

    public Short getCodsittribpiscofinsconhec() {
        return codsittribpiscofinsconhec;
    }

    public void setCodsittribpiscofinsconhec(Short codsittribpiscofinsconhec) {
        this.codsittribpiscofinsconhec = codsittribpiscofinsconhec;
    }

    public String getUsacredpiscofinsentbonific() {
        return usacredpiscofinsentbonific;
    }

    public void setUsacredpiscofinsentbonific(String usacredpiscofinsentbonific) {
        this.usacredpiscofinsentbonific = usacredpiscofinsentbonific;
    }

    public String getNumalvaraanvisa() {
        return numalvaraanvisa;
    }

    public void setNumalvaraanvisa(String numalvaraanvisa) {
        this.numalvaraanvisa = numalvaraanvisa;
    }

    public LocalDate getDtvencalvaraanvisa() {
        return dtvencalvaraanvisa;
    }

    public void setDtvencalvaraanvisa(LocalDate dtvencalvaraanvisa) {
        this.dtvencalvaraanvisa = dtvencalvaraanvisa;
    }

    public String getNumalvarafunc() {
        return numalvarafunc;
    }

    public void setNumalvarafunc(String numalvarafunc) {
        this.numalvarafunc = numalvarafunc;
    }

    public LocalDate getDtvencalvarafunc() {
        return dtvencalvarafunc;
    }

    public void setDtvencalvarafunc(LocalDate dtvencalvarafunc) {
        this.dtvencalvarafunc = dtvencalvarafunc;
    }

    public String getNumalvarapsico() {
        return numalvarapsico;
    }

    public void setNumalvarapsico(String numalvarapsico) {
        this.numalvarapsico = numalvarapsico;
    }

    public LocalDate getDtvencalvarapsico() {
        return dtvencalvarapsico;
    }

    public void setDtvencalvarapsico(LocalDate dtvencalvarapsico) {
        this.dtvencalvarapsico = dtvencalvarapsico;
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

    public LocalDate getDtvenccrf() {
        return dtvenccrf;
    }

    public void setDtvenccrf(LocalDate dtvenccrf) {
        this.dtvenccrf = dtvenccrf;
    }

    public Long getCodcontacontabadiantfor() {
        return codcontacontabadiantfor;
    }

    public void setCodcontacontabadiantfor(Long codcontacontabadiantfor) {
        this.codcontacontabadiantfor = codcontacontabadiantfor;
    }

    public String getCalcdespfinprazopgto() {
        return calcdespfinprazopgto;
    }

    public void setCalcdespfinprazopgto(String calcdespfinprazopgto) {
        this.calcdespfinprazopgto = calcdespfinprazopgto;
    }

    public String getUsaoutrasdespseguropiscofins() {
        return usaoutrasdespseguropiscofins;
    }

    public void setUsaoutrasdespseguropiscofins(String usaoutrasdespseguropiscofins) {
        this.usaoutrasdespseguropiscofins = usaoutrasdespseguropiscofins;
    }

    public String getCodcontab() {
        return codcontab;
    }

    public void setCodcontab(String codcontab) {
        this.codcontab = codcontab;
    }

    public Short getNumcasasdecreducaoicms() {
        return numcasasdecreducaoicms;
    }

    public void setNumcasasdecreducaoicms(Short numcasasdecreducaoicms) {
        this.numcasasdecreducaoicms = numcasasdecreducaoicms;
    }

    public String getUtilizaipicalcicms() {
        return utilizaipicalcicms;
    }

    public void setUtilizaipicalcicms(String utilizaipicalcicms) {
        this.utilizaipicalcicms = utilizaipicalcicms;
    }

    public Long getCodgln() {
        return codgln;
    }

    public void setCodgln(Long codgln) {
        this.codgln = codgln;
    }

    public Short getCodsittribpiscofinsservico() {
        return codsittribpiscofinsservico;
    }

    public void setCodsittribpiscofinsservico(Short codsittribpiscofinsservico) {
        this.codsittribpiscofinsservico = codsittribpiscofinsservico;
    }

    public String getAvaliacaovenda() {
        return avaliacaovenda;
    }

    public void setAvaliacaovenda(String avaliacaovenda) {
        this.avaliacaovenda = avaliacaovenda;
    }

    public LocalDate getDtproxcompra() {
        return dtproxcompra;
    }

    public void setDtproxcompra(LocalDate dtproxcompra) {
        this.dtproxcompra = dtproxcompra;
    }

    public LocalDate getDtultcompra() {
        return dtultcompra;
    }

    public void setDtultcompra(LocalDate dtultcompra) {
        this.dtultcompra = dtultcompra;
    }

    public Short getPeriodicidadecompra() {
        return periodicidadecompra;
    }

    public void setPeriodicidadecompra(Short periodicidadecompra) {
        this.periodicidadecompra = periodicidadecompra;
    }

    public Short getDiasavaliacaovenda() {
        return diasavaliacaovenda;
    }

    public void setDiasavaliacaovenda(Short diasavaliacaovenda) {
        this.diasavaliacaovenda = diasavaliacaovenda;
    }

    public byte[] getIdintegracaomyfrota() {
        return idintegracaomyfrota;
    }

    public void setIdintegracaomyfrota(byte[] idintegracaomyfrota) {
        this.idintegracaomyfrota = idintegracaomyfrota;
    }

    public String getConsstguiapiscofins() {
        return consstguiapiscofins;
    }

    public void setConsstguiapiscofins(String consstguiapiscofins) {
        this.consstguiapiscofins = consstguiapiscofins;
    }

    public String getConcedcredpres() {
        return concedcredpres;
    }

    public void setConcedcredpres(String concedcredpres) {
        this.concedcredpres = concedcredpres;
    }

    public String getUsafretefobporfornec() {
        return usafretefobporfornec;
    }

    public void setUsafretefobporfornec(String usafretefobporfornec) {
        this.usafretefobporfornec = usafretefobporfornec;
    }

    public BigDecimal getVlminpedreposicao() {
        return vlminpedreposicao;
    }

    public void setVlminpedreposicao(BigDecimal vlminpedreposicao) {
        this.vlminpedreposicao = vlminpedreposicao;
    }

    public String getGerapedbonific() {
        return gerapedbonific;
    }

    public void setGerapedbonific(String gerapedbonific) {
        this.gerapedbonific = gerapedbonific;
    }

    public Short getQtdiasvencverbas() {
        return qtdiasvencverbas;
    }

    public void setQtdiasvencverbas(Short qtdiasvencverbas) {
        this.qtdiasvencverbas = qtdiasvencverbas;
    }

    public Short getTipofinancdevfornec() {
        return tipofinancdevfornec;
    }

    public void setTipofinancdevfornec(Short tipofinancdevfornec) {
        this.tipofinancdevfornec = tipofinancdevfornec;
    }

    public Integer getCfopentadjud() {
        return cfopentadjud;
    }

    public void setCfopentadjud(Integer cfopentadjud) {
        this.cfopentadjud = cfopentadjud;
    }

    public String getSittribentadjud() {
        return sittribentadjud;
    }

    public void setSittribentadjud(String sittribentadjud) {
        this.sittribentadjud = sittribentadjud;
    }

    public Integer getCfoprestituicao() {
        return cfoprestituicao;
    }

    public void setCfoprestituicao(Integer cfoprestituicao) {
        this.cfoprestituicao = cfoprestituicao;
    }

    public String getSittribrestituicao() {
        return sittribrestituicao;
    }

    public void setSittribrestituicao(String sittribrestituicao) {
        this.sittribrestituicao = sittribrestituicao;
    }

    public String getUtilizaoutdespnfbasest() {
        return utilizaoutdespnfbasest;
    }

    public void setUtilizaoutdespnfbasest(String utilizaoutdespnfbasest) {
        this.utilizaoutdespnfbasest = utilizaoutdespnfbasest;
    }

    public String getEquipindustria() {
        return equipindustria;
    }

    public void setEquipindustria(String equipindustria) {
        this.equipindustria = equipindustria;
    }

    public String getConsfretefobbasestnf() {
        return consfretefobbasestnf;
    }

    public void setConsfretefobbasestnf(String consfretefobbasestnf) {
        this.consfretefobbasestnf = consfretefobbasestnf;
    }

    public Integer getCodparcelafretefob() {
        return codparcelafretefob;
    }

    public void setCodparcelafretefob(Integer codparcelafretefob) {
        this.codparcelafretefob = codparcelafretefob;
    }

    public Integer getCodparcelaoutdesp() {
        return codparcelaoutdesp;
    }

    public void setCodparcelaoutdesp(Integer codparcelaoutdesp) {
        this.codparcelaoutdesp = codparcelaoutdesp;
    }

    public Integer getCodparcicmsantecip() {
        return codparcicmsantecip;
    }

    public void setCodparcicmsantecip(Integer codparcicmsantecip) {
        this.codparcicmsantecip = codparcicmsantecip;
    }

    public Integer getCodparceladifaliq() {
        return codparceladifaliq;
    }

    public void setCodparceladifaliq(Integer codparceladifaliq) {
        this.codparceladifaliq = codparceladifaliq;
    }

    public Long getCodcontainsstomador() {
        return codcontainsstomador;
    }

    public void setCodcontainsstomador(Long codcontainsstomador) {
        this.codcontainsstomador = codcontainsstomador;
    }

    public BigDecimal getPercinsstomador() {
        return percinsstomador;
    }

    public void setPercinsstomador(BigDecimal percinsstomador) {
        this.percinsstomador = percinsstomador;
    }

    public String getRessarcimentostnf() {
        return ressarcimentostnf;
    }

    public void setRessarcimentostnf(String ressarcimentostnf) {
        this.ressarcimentostnf = ressarcimentostnf;
    }

    public String getRessarcimentostguia() {
        return ressarcimentostguia;
    }

    public void setRessarcimentostguia(String ressarcimentostguia) {
        this.ressarcimentostguia = ressarcimentostguia;
    }

    public String getAdjudicacao() {
        return adjudicacao;
    }

    public void setAdjudicacao(String adjudicacao) {
        this.adjudicacao = adjudicacao;
    }

    public Integer getCfopressarcimentostguia() {
        return cfopressarcimentostguia;
    }

    public void setCfopressarcimentostguia(Integer cfopressarcimentostguia) {
        this.cfopressarcimentostguia = cfopressarcimentostguia;
    }

    public String getSittributressarcimentostguia() {
        return sittributressarcimentostguia;
    }

    public void setSittributressarcimentostguia(String sittributressarcimentostguia) {
        this.sittributressarcimentostguia = sittributressarcimentostguia;
    }

    public String getUsadrawback() {
        return usadrawback;
    }

    public void setUsadrawback(String usadrawback) {
        this.usadrawback = usadrawback;
    }

    public String getUtilizaicmsdifzerado() {
        return utilizaicmsdifzerado;
    }

    public void setUtilizaicmsdifzerado(String utilizaicmsdifzerado) {
        this.utilizaicmsdifzerado = utilizaicmsdifzerado;
    }

    public String getCalcpiscofinsbasered() {
        return calcpiscofinsbasered;
    }

    public void setCalcpiscofinsbasered(String calcpiscofinsbasered) {
        this.calcpiscofinsbasered = calcpiscofinsbasered;
    }

    public BigDecimal getPercsestsenat() {
        return percsestsenat;
    }

    public void setPercsestsenat(BigDecimal percsestsenat) {
        this.percsestsenat = percsestsenat;
    }

    public Long getCodcontasestsenat() {
        return codcontasestsenat;
    }

    public void setCodcontasestsenat(Long codcontasestsenat) {
        this.codcontasestsenat = codcontasestsenat;
    }

    public String getConsumidorfinal() {
        return consumidorfinal;
    }

    public void setConsumidorfinal(String consumidorfinal) {
        this.consumidorfinal = consumidorfinal;
    }

    public Integer getCodparcelafunrural() {
        return codparcelafunrural;
    }

    public void setCodparcelafunrural(Integer codparcelafunrural) {
        this.codparcelafunrural = codparcelafunrural;
    }

    public String getConscapataziaicms() {
        return conscapataziaicms;
    }

    public void setConscapataziaicms(String conscapataziaicms) {
        this.conscapataziaicms = conscapataziaicms;
    }

    public String getDeduzirsuframaaliqext() {
        return deduzirsuframaaliqext;
    }

    public void setDeduzirsuframaaliqext(String deduzirsuframaaliqext) {
        this.deduzirsuframaaliqext = deduzirsuframaaliqext;
    }

    public String getConsipicalcicmsant() {
        return consipicalcicmsant;
    }

    public void setConsipicalcicmsant(String consipicalcicmsant) {
        this.consipicalcicmsant = consipicalcicmsant;
    }

    public String getEmailnfe() {
        return emailnfe;
    }

    public void setEmailnfe(String emailnfe) {
        this.emailnfe = emailnfe;
    }

    public String getCreditarsaldoestverba() {
        return creditarsaldoestverba;
    }

    public void setCreditarsaldoestverba(String creditarsaldoestverba) {
        this.creditarsaldoestverba = creditarsaldoestverba;
    }

    public String getTranspcredenciadosefaz() {
        return transpcredenciadosefaz;
    }

    public void setTranspcredenciadosefaz(String transpcredenciadosefaz) {
        this.transpcredenciadosefaz = transpcredenciadosefaz;
    }

    public String getNumcredenciamentosefaz() {
        return numcredenciamentosefaz;
    }

    public void setNumcredenciamentosefaz(String numcredenciamentosefaz) {
        this.numcredenciamentosefaz = numcredenciamentosefaz;
    }

    public Short getHoracoleta() {
        return horacoleta;
    }

    public void setHoracoleta(Short horacoleta) {
        this.horacoleta = horacoleta;
    }

    public String getUsaecommerceunilever() {
        return usaecommerceunilever;
    }

    public void setUsaecommerceunilever(String usaecommerceunilever) {
        this.usaecommerceunilever = usaecommerceunilever;
    }

    public String getUsadebcredoperlog() {
        return usadebcredoperlog;
    }

    public void setUsadebcredoperlog(String usadebcredoperlog) {
        this.usadebcredoperlog = usadebcredoperlog;
    }

    public Short getDiapgverbaoperlog() {
        return diapgverbaoperlog;
    }

    public void setDiapgverbaoperlog(Short diapgverbaoperlog) {
        this.diapgverbaoperlog = diapgverbaoperlog;
    }

    public BigDecimal getPercmarkupccmed() {
        return percmarkupccmed;
    }

    public void setPercmarkupccmed(BigDecimal percmarkupccmed) {
        this.percmarkupccmed = percmarkupccmed;
    }

    public Integer getCodconfigarqexplicit() {
        return codconfigarqexplicit;
    }

    public void setCodconfigarqexplicit(Integer codconfigarqexplicit) {
        this.codconfigarqexplicit = codconfigarqexplicit;
    }

    public Integer getCodconfigarqimplicit() {
        return codconfigarqimplicit;
    }

    public void setCodconfigarqimplicit(Integer codconfigarqimplicit) {
        this.codconfigarqimplicit = codconfigarqimplicit;
    }

    public String getCreditadescmenoroperlog() {
        return creditadescmenoroperlog;
    }

    public void setCreditadescmenoroperlog(String creditadescmenoroperlog) {
        this.creditadescmenoroperlog = creditadescmenoroperlog;
    }

    public String getCodcobsefaz() {
        return codcobsefaz;
    }

    public void setCodcobsefaz(String codcobsefaz) {
        this.codcobsefaz = codcobsefaz;
    }

    public String getContribuintedocprb() {
        return contribuintedocprb;
    }

    public void setContribuintedocprb(String contribuintedocprb) {
        this.contribuintedocprb = contribuintedocprb;
    }

    public String getUrlbaserastreio() {
        return urlbaserastreio;
    }

    public void setUrlbaserastreio(String urlbaserastreio) {
        this.urlbaserastreio = urlbaserastreio;
    }

    public String getDeduzirsuframadifaliq() {
        return deduzirsuframadifaliq;
    }

    public void setDeduzirsuframadifaliq(String deduzirsuframadifaliq) {
        this.deduzirsuframadifaliq = deduzirsuframadifaliq;
    }

    public Short getCodlicitgrupofornec() {
        return codlicitgrupofornec;
    }

    public void setCodlicitgrupofornec(Short codlicitgrupofornec) {
        this.codlicitgrupofornec = codlicitgrupofornec;
    }

    public Long getFormapgto() {
        return formapgto;
    }

    public void setFormapgto(Long formapgto) {
        this.formapgto = formapgto;
    }

    public String getAssociacaodesportiva() {
        return associacaodesportiva;
    }

    public void setAssociacaodesportiva(String associacaodesportiva) {
        this.associacaodesportiva = associacaodesportiva;
    }

    public String getCodigonacionalobras() {
        return codigonacionalobras;
    }

    public void setCodigonacionalobras(String codigonacionalobras) {
        this.codigonacionalobras = codigonacionalobras;
    }

    public Boolean getDetentorregespecial() {
        return detentorregespecial;
    }

    public void setDetentorregespecial(Boolean detentorregespecial) {
        this.detentorregespecial = detentorregespecial;
    }

    public String getConsiderarpautazerostguia() {
        return considerarpautazerostguia;
    }

    public void setConsiderarpautazerostguia(String considerarpautazerostguia) {
        this.considerarpautazerostguia = considerarpautazerostguia;
    }

    public String getCalccredicmsbasereduzida() {
        return calccredicmsbasereduzida;
    }

    public void setCalccredicmsbasereduzida(String calccredicmsbasereduzida) {
        this.calccredicmsbasereduzida = calccredicmsbasereduzida;
    }

    public String getCodcentrocusto() {
        return codcentrocusto;
    }

    public void setCodcentrocusto(String codcentrocusto) {
        this.codcentrocusto = codcentrocusto;
    }

    public BigDecimal getPercmargemgarantida() {
        return percmargemgarantida;
    }

    public void setPercmargemgarantida(BigDecimal percmargemgarantida) {
        this.percmargemgarantida = percmargemgarantida;
    }

    public String getDeduzirfcpicmsdofcpst() {
        return deduzirfcpicmsdofcpst;
    }

    public void setDeduzirfcpicmsdofcpst(String deduzirfcpicmsdofcpst) {
        this.deduzirfcpicmsdofcpst = deduzirfcpicmsdofcpst;
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

    public String getGerarreceitarestituicao() {
        return gerarreceitarestituicao;
    }

    public void setGerarreceitarestituicao(String gerarreceitarestituicao) {
        this.gerarreceitarestituicao = gerarreceitarestituicao;
    }

    public String getCondcomercautorizmed() {
        return condcomercautorizmed;
    }

    public void setCondcomercautorizmed(String condcomercautorizmed) {
        this.condcomercautorizmed = condcomercautorizmed;
    }

    public String getManifestacaoautomatica() {
        return manifestacaoautomatica;
    }

    public void setManifestacaoautomatica(String manifestacaoautomatica) {
        this.manifestacaoautomatica = manifestacaoautomatica;
    }

    public String getGerapedidocompraxml() {
        return gerapedidocompraxml;
    }

    public void setGerapedidocompraxml(String gerapedidocompraxml) {
        this.gerapedidocompraxml = gerapedidocompraxml;
    }

    public String getUsaredicmspara() {
        return usaredicmspara;
    }

    public void setUsaredicmspara(String usaredicmspara) {
        this.usaredicmspara = usaredicmspara;
    }

    public String getConsdesonnovesuframa() {
        return consdesonnovesuframa;
    }

    public void setConsdesonnovesuframa(String consdesonnovesuframa) {
        this.consdesonnovesuframa = consdesonnovesuframa;
    }

    public String getGravarcodfab253() {
        return gravarcodfab253;
    }

    public void setGravarcodfab253(String gravarcodfab253) {
        this.gravarcodfab253 = gravarcodfab253;
    }

    public String getUtilizafator253() {
        return utilizafator253;
    }

    public void setUtilizafator253(String utilizafator253) {
        this.utilizafator253 = utilizafator253;
    }

    public String getImportaxmlautomatico() {
        return importaxmlautomatico;
    }

    public void setImportaxmlautomatico(String importaxmlautomatico) {
        this.importaxmlautomatico = importaxmlautomatico;
    }

    public String getDeduziripibasedifaliq() {
        return deduziripibasedifaliq;
    }

    public void setDeduziripibasedifaliq(String deduziripibasedifaliq) {
        this.deduziripibasedifaliq = deduziripibasedifaliq;
    }

    public String getConsfretefobbasedifaliq() {
        return consfretefobbasedifaliq;
    }

    public void setConsfretefobbasedifaliq(String consfretefobbasedifaliq) {
        this.consfretefobbasedifaliq = consfretefobbasedifaliq;
    }

    public String getAlimentafundomultifilial() {
        return alimentafundomultifilial;
    }

    public void setAlimentafundomultifilial(String alimentafundomultifilial) {
        this.alimentafundomultifilial = alimentafundomultifilial;
    }

    public String getOrigemparcfinanc() {
        return origemparcfinanc;
    }

    public void setOrigemparcfinanc(String origemparcfinanc) {
        this.origemparcfinanc = origemparcfinanc;
    }

    public String getAplicaverbarebcusto() {
        return aplicaverbarebcusto;
    }

    public void setAplicaverbarebcusto(String aplicaverbarebcusto) {
        this.aplicaverbarebcusto = aplicaverbarebcusto;
    }

    public String getTipofretedespacho() {
        return tipofretedespacho;
    }

    public void setTipofretedespacho(String tipofretedespacho) {
        this.tipofretedespacho = tipofretedespacho;
    }

    public String getTipovencimento() {
        return tipovencimento;
    }

    public void setTipovencimento(String tipovencimento) {
        this.tipovencimento = tipovencimento;
    }

    public String getFormatribprodrural() {
        return formatribprodrural;
    }

    public void setFormatribprodrural(String formatribprodrural) {
        this.formatribprodrural = formatribprodrural;
    }

    public String getIndaqprodrural() {
        return indaqprodrural;
    }

    public void setIndaqprodrural(String indaqprodrural) {
        this.indaqprodrural = indaqprodrural;
    }

    public String getProdutorrural() {
        return produtorrural;
    }

    public void setProdutorrural(String produtorrural) {
        this.produtorrural = produtorrural;
    }

    public String getCpfprodutorrural() {
        return cpfprodutorrural;
    }

    public void setCpfprodutorrural(String cpfprodutorrural) {
        this.cpfprodutorrural = cpfprodutorrural;
    }

    public BigDecimal getPerccontribprevdesc() {
        return perccontribprevdesc;
    }

    public void setPerccontribprevdesc(BigDecimal perccontribprevdesc) {
        this.perccontribprevdesc = perccontribprevdesc;
    }

    public BigDecimal getPerccontribbemconc() {
        return perccontribbemconc;
    }

    public void setPerccontribbemconc(BigDecimal perccontribbemconc) {
        this.perccontribbemconc = perccontribbemconc;
    }

    public BigDecimal getPerccontribsenar() {
        return perccontribsenar;
    }

    public void setPerccontribsenar(BigDecimal perccontribsenar) {
        this.perccontribsenar = perccontribsenar;
    }

    public String getCodfornecbal() {
        return codfornecbal;
    }

    public void setCodfornecbal(String codfornecbal) {
        this.codfornecbal = codfornecbal;
    }

    public String getUtilizapiscofinstribent() {
        return utilizapiscofinstribent;
    }

    public void setUtilizapiscofinstribent(String utilizapiscofinstribent) {
        this.utilizapiscofinstribent = utilizapiscofinstribent;
    }

    public String getUtilizaicmstribent() {
        return utilizaicmstribent;
    }

    public void setUtilizaicmstribent(String utilizaicmstribent) {
        this.utilizaicmstribent = utilizaicmstribent;
    }

    public String getJurocapitalprop() {
        return jurocapitalprop;
    }

    public void setJurocapitalprop(String jurocapitalprop) {
        this.jurocapitalprop = jurocapitalprop;
    }

    public String getLiberaentimpxml() {
        return liberaentimpxml;
    }

    public void setLiberaentimpxml(String liberaentimpxml) {
        this.liberaentimpxml = liberaentimpxml;
    }

}