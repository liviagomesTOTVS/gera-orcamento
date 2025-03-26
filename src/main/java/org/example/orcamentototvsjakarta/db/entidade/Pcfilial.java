package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PCFILIAL")
public class Pcfilial {
    @EmbeddedId
    private PcfilialId id;

    @Column(name = "RAZAOSOCIAL", nullable = false, length = 40)
    private String razaosocial;

    @Column(name = "ENDERECO", length = 40)
    private String endereco;

    @Column(name = "CIDADE", length = 30)
    private String cidade;

    @Column(name = "UF", length = 2)
    private String uf;

    @Column(name = "CEP", length = 11)
    private String cep;

    @Column(name = "TELEFONE", length = 18)
    private String telefone;

    @Column(name = "CGC", length = 14)
    private String cgc;

    @Column(name = "CODCLI")
    private Integer codcli;

    @Column(name = "CODFORNEC")
    private Integer codfornec;

    @Column(name = "PROXNUMNOTA")
    private Long proxnumnota;

    @Column(name = "NUMPROXVEND")
    private Long numproxvend;

    @Column(name = "RAZAOTRANSP", length = 40)
    private String razaotransp;

    @Column(name = "CGCTRANSP", length = 20)
    private String cgctransp;

    @Column(name = "IETRANSP", length = 20)
    private String ietransp;

    @Column(name = "ENDTRANSP", length = 40)
    private String endtransp;

    @Column(name = "CIDADETRANSP", length = 20)
    private String cidadetransp;

    @Column(name = "UFTRANSP", length = 2)
    private String uftransp;

    @Column(name = "NUMERO")
    private Integer numero;

    @Column(name = "BAIRRO", length = 20)
    private String bairro;

    @Column(name = "CONTATO", length = 30)
    private String contato;

    @Column(name = "IE", length = 20)
    private String ie;

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

    @Column(name = "CODDOCNF")
    private Integer coddocnf;

    @Column(name = "CODDOCDEVOL")
    private Integer coddocdevol;

    @Column(name = "CODDOCSR")
    private Integer coddocsr;

    @Column(name = "MENSNF", length = 60)
    private String mensnf;

    @Column(name = "PROXNUMAVERBACAO")
    private Long proxnumaverbacao;

    @Column(name = "PROXNUMNFDEVCLI")
    private Long proxnumnfdevcli;

    @Column(name = "NUMSEQENTR")
    private Short numseqentr;

    @Column(name = "NUMIDF", length = 30)
    private String numidf;

    @Column(name = "NUMIDFDEVCLI", length = 30)
    private String numidfdevcli;

    @Column(name = "PROXNUMNOTATRANSF")
    private Long proxnumnotatransf;

    @Column(name = "PROXNUMNOTAD")
    private Long proxnumnotad;

    @Column(name = "CODFILIALPREFESTBALCAO", length = 2)
    private String codfilialprefestbalcao;

    @Column(name = "CODFILIALPREFESTTLMK", length = 2)
    private String codfilialprefesttlmk;

    @Column(name = "MONTANDO", length = 1)
    private String montando;

    @Column(name = "INDUSTRIA", length = 1)
    private String industria;

    @Column(name = "NUMERO2", length = 6)
    private String numero2;

    @Column(name = "EANEMISSOR")
    private Long eanemissor;

    @Column(name = "CODDOCTRANSF")
    private Integer coddoctransf;

    @Column(name = "NUMREGIAO")
    private Short numregiao;

    @Column(name = "CODFILIALPRODUCAO", length = 2)
    private String codfilialproducao;

    @Column(name = "USAESTOQUEDEPFECHADO", length = 1)
    private String usaestoquedepfechado;

    @Column(name = "PROXNUMLOTE")
    private Short proxnumlote;

    @Column(name = "CODGRUPO", length = 2)
    private String codgrupo;

    @Column(name = "USANUMNFDEVCLI", length = 1)
    private String usanumnfdevcli;

    @Column(name = "CODDOCDEVFORNEC")
    private Integer coddocdevfornec;

    @Column(name = "AUTOSERVICO", length = 1)
    private String autoservico;

    @Column(name = "CAE", length = 30)
    private String cae;

    @Column(name = "CODDOCENTRADAMERC")
    private Integer coddocentradamerc;

    @Column(name = "PERFRETECONHEC", precision = 8, scale = 4)
    private BigDecimal perfreteconhec;

    @Column(name = "LIMPARBASECALCENTRADA", length = 1)
    private String limparbasecalcentrada;

    @Column(name = "USAWMS", length = 1)
    private String usawms;

    @Column(name = "OPISENTOSICMSALTOCUSTO", length = 1)
    private String opisentosicmsaltocusto;

    @Column(name = "ALIQICMOUTRASDESP", precision = 4, scale = 2)
    private BigDecimal aliqicmoutrasdesp;

    @Column(name = "ALIQICMINTEROUTRASDESP", precision = 4, scale = 2)
    private BigDecimal aliqicminteroutrasdesp;

    @Column(name = "CODFISCALOUTRASDESP")
    private Short codfiscaloutrasdesp;

    @Column(name = "CODFISCALINTEROUTRASDESP")
    private Short codfiscalinteroutrasdesp;

    @Column(name = "ACEITAVENDASEMEST", length = 1)
    private String aceitavendasemest;

    @Column(name = "CALCCREDICMS", length = 1)
    private String calccredicms;

    @Column(name = "CALCCREDPISCOFINS", length = 1)
    private String calccredpiscofins;

    @Column(name = "NUMREGIAOPADRAO")
    private Short numregiaopadrao;

    @Column(name = "PERVENDAPF", precision = 8, scale = 4)
    private BigDecimal pervendapf;

    @Column(name = "AREAVENDA", precision = 10, scale = 4)
    private BigDecimal areavenda;

    @Column(name = "CODFISCALDEVOUTRASDESP")
    private Long codfiscaldevoutrasdesp;

    @Column(name = "CODFISCALINTERDEVOUTRASDESP")
    private Long codfiscalinterdevoutrasdesp;

    @Column(name = "NUMDIASVENCFRETE")
    private Short numdiasvencfrete;

    @Column(name = "CALCCREDIPI", length = 1)
    private String calccredipi;

    @Column(name = "NUMCONTRATOCORREIO")
    private Integer numcontratocorreio;

    @Column(name = "CODMUN")
    private Long codmun;

    @Column(name = "CODESTADO")
    private Long codestado;

    @Column(name = "CODPAIS")
    private Short codpais;

    @Column(name = "NOMEPAIS", length = 40)
    private String nomepais;

    @Column(name = "FAX", length = 18)
    private String fax;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "VLTARIFA", precision = 8, scale = 2)
    private BigDecimal vltarifa;

    @Column(name = "VLMINTARIFABANC", precision = 18, scale = 6)
    private BigDecimal vlmintarifabanc;

    @Column(name = "VLMAXTARIFABANC", precision = 18, scale = 6)
    private BigDecimal vlmaxtarifabanc;

    @Column(name = "SOMATARIFABANCDUPLIC", length = 1)
    private String somatarifabancduplic;

    @Column(name = "CODDOCNFC")
    private Integer coddocnfc;

    @Column(name = "PRODPORETAPA")
    private String prodporetapa;

    @Column(name = "PROXNUMORC")
    private Long proxnumorc;

    @Column(name = "GERARNUMLOTEAUTOMATICPA", length = 1)
    private String gerarnumloteautomaticpa;

    @Column(name = "PROXNUMETAPA")
    private Long proxnumetapa;

    @Column(name = "ATACADISTA", length = 1)
    private String atacadista;

    @Column(name = "PERMITECREDICMCOMST", length = 1)
    private String permitecredicmcomst;

    @Column(name = "CALCCREDICMCUSTOCONT")
    private String calccredicmcustocont;

    @Column(name = "CALCCREDPISCUSTOCONT")
    private String calccredpiscustocont;

    @Column(name = "USAENDERECOFILIAL", length = 1)
    private String usaenderecofilial;

    @Column(name = "CODCLICONSUMIDOR")
    private Integer codcliconsumidor;

    @Column(name = "FANTASIA", length = 25)
    private String fantasia;

    @Column(name = "PERCDESPADM", precision = 10, scale = 4)
    private BigDecimal percdespadm;

    @Column(name = "TIPONUMNFENTRADA", length = 1)
    private String tiponumnfentrada;

    @Column(name = "PERMITIRVENDAINTERESTADUALPF", length = 1)
    private String permitirvendainterestadualpf;

    @Column(name = "PERMITIRVENDAESTADUALPFCOMIE", length = 1)
    private String permitirvendaestadualpfcomie;

    @Column(name = "PERMITIRVENDAESTADUALPFSEMIE", length = 1)
    private String permitirvendaestadualpfsemie;

    @Column(name = "INCLUIRITEMPCEMBALAGEM", length = 1)
    private String incluiritempcembalagem;

    @Column(name = "ALIQUOTAFRETEEST")
    private Short aliquotafreteest;

    @Column(name = "BROKER", length = 1)
    private String broker;

    @Column(name = "TIPOBROKER", length = 3)
    private String tipobroker;

    @Column(name = "PROXNUMEROORCAMENTO")
    private Integer proxnumeroorcamento;

    @Column(name = "PERBASEREDOUTRASDESP", precision = 8, scale = 4)
    private BigDecimal perbaseredoutrasdesp;

    @Column(name = "CALCREDPISFRETE", length = 1)
    private String calcredpisfrete;

    @Column(name = "CALCREDPISFRETECONT", length = 1)
    private String calcredpisfretecont;

    @Column(name = "TIPONUMMAPA", length = 1)
    private String tiponummapa;

    @Column(name = "IESUBSTTRIB", length = 15)
    private String iesubsttrib;

    @Column(name = "UTILIZAPERCBASEREDOUTRASDESPPF", length = 1)
    private String utilizapercbaseredoutrasdesppf;

    @Column(name = "EXIGIREMISSAOMAPABALCAO", length = 1)
    private String exigiremissaomapabalcao;

    @Column(name = "CODDOCSS")
    private Integer coddocss;

    @Column(name = "PROXNUMORCAFILIAL")
    private Long proxnumorcafilial;

    @Column(name = "PROXNUMENTMEX")
    private Long proxnumentmex;

    @Column(name = "PROXNSU")
    private Long proxnsu;

    @Column(name = "GERARNSU", length = 1)
    private String gerarnsu;

    @Column(name = "USACONTROLELOCALIZACAOVEICULO", length = 1)
    private String usacontrolelocalizacaoveiculo;

    @Column(name = "PROXNUMPREVENDA")
    private Long proxnumprevenda;

    @Column(name = "OPERADORLOGISTICO", length = 1)
    private String operadorlogistico;

    @Column(name = "CONSIDERARICMSANTECIPCUSTO", length = 1)
    private String consideraricmsantecipcusto;

    @Column(name = "CODGRUPOFILIAL")
    private Integer codgrupofilial;

    @Column(name = "CODCONTADOR")
    private Integer codcontador;

    @Column(name = "CODSOCIO")
    private Integer codsocio;

    @Column(name = "ATIVIDADE", length = 50)
    private String atividade;

    @Column(name = "IM", length = 20)
    private String im;

    @Column(name = "VALORCAPITAL", precision = 18, scale = 2)
    private BigDecimal valorcapital;

    @Column(name = "DTINIATIVIDADE")
    private LocalDate dtiniatividade;

    @Column(name = "DTFIMATIVIDADE")
    private LocalDate dtfimatividade;

    @Column(name = "ORGAO", length = 20)
    private String orgao;

    @Column(name = "CODREGISTRO", length = 20)
    private String codregistro;

    @Column(name = "DTREGISTRO")
    private LocalDate dtregistro;

    @Column(name = "PERCALTERCUSTOENT", precision = 8, scale = 4)
    private BigDecimal percaltercustoent;

    @Column(name = "PROXNUMTRANSCONHEC")
    private Long proxnumtransconhec;

    @Column(name = "PROXNUMCONHEC")
    private Long proxnumconhec;

    @Column(name = "CALCULARCOMISSAOPVENDA1", length = 1)
    private String calcularcomissaopvenda1;

    @Column(name = "USADISTRIB", length = 1)
    private String usadistrib;

    @Column(name = "IPISOMENTEVLCONT", length = 1)
    private String ipisomentevlcont;

    @Column(name = "CODCONTAENTIMPORTACAO")
    private Long codcontaentimportacao;

    @Column(name = "GERABASENORMALQUANDOST", length = 1)
    private String gerabasenormalquandost;

    @Column(name = "VALIDAVLMAXISENCAOSTPF", length = 1)
    private String validavlmaxisencaostpf;

    @Column(name = "VLMAXISENCAOSTPF", precision = 12, scale = 2)
    private BigDecimal vlmaxisencaostpf;

    @Column(name = "UTILIZAVENDAPOREMBALAGEM", length = 1)
    private String utilizavendaporembalagem;

    @Column(name = "PRECOPOREMBALAGEM", length = 1)
    private String precoporembalagem;

    @Column(name = "VALIDAENDPICKINGPEDCOMPRA", length = 1)
    private String validaendpickingpedcompra;

    @Column(name = "USASERVINTERMEDIARIO", length = 1)
    private String usaservintermediario;

    @Column(name = "USANUMNOTAECF", length = 1)
    private String usanumnotaecf;

    @Column(name = "PROXNUMNOTAECF")
    private Long proxnumnotaecf;

    @Column(name = "PROXNUMTRANSVENDAECF")
    private Long proxnumtransvendaecf;

    @Column(name = "PROXNUMCARECF")
    private Long proxnumcarecf;

    @Column(name = "PROXNUMTRANSECF")
    private Long proxnumtransecf;

    @Column(name = "USAPRECOETIQPRODPESADO", length = 1)
    private String usaprecoetiqprodpesado;

    @Column(name = "CODDOCSE")
    private Integer coddocse;

    @Column(name = "UTILIZANFE", length = 1)
    private String utilizanfe;

    @Column(name = "SERIENFE", length = 3)
    private String serienfe;

    @Column(name = "SERIENFESCAN", length = 3)
    private String serienfescan;

    @Column(name = "TIPODANFE", length = 1)
    private String tipodanfe;

    @Column(name = "PROXNUMNFE")
    private Long proxnumnfe;

    @Column(name = "INCLUIFRETEOUTRASDESPBASEST", length = 1)
    private String incluifreteoutrasdespbasest;

    @Column(name = "CODCONTAPERCACRESCENT")
    private Long codcontapercacrescent;

    @Column(name = "PRECIFICAAUTOMATICO", length = 1)
    private String precificaautomatico;

    @Column(name = "TIPOPRECIFICACAO", length = 1)
    private String tipoprecificacao;

    @Column(name = "DESTACARIMPOSTOSVENDATV14", length = 1)
    private String destacarimpostosvendatv14;

    @Column(name = "PERMITEAGRUPARBOLETOS", length = 1)
    private String permiteagruparboletos;

    @Column(name = "BLOQDEVCLI", length = 1)
    private String bloqdevcli;

    @Column(name = "USAPVENDAATACCONFQTMULTIPLA", length = 1)
    private String usapvendaatacconfqtmultipla;

    @Column(name = "DTUTILIZANFE")
    private LocalDate dtutilizanfe;

    @Column(name = "GERARPEDCONSIGNACAOVASILHAME", length = 1)
    private String gerarpedconsignacaovasilhame;

    @Column(name = "TIPOAVALIACAOCOMISSAO")
    private Short tipoavaliacaocomissao;

    @Column(name = "CONSIDERARCOMISSAOZERO", length = 1)
    private String considerarcomissaozero;

    @Column(name = "LANCARFRETEPESOAUTFAT", length = 1)
    private String lancarfretepesoautfat;

    @Column(name = "BLOQDESDEMITENTEDIF", length = 1)
    private String bloqdesdemitentedif;

    @Column(name = "SOMAICMSTRANSF", length = 1)
    private String somaicmstransf;

    @Column(name = "CODCONTACREDFORNEC")
    private Long codcontacredfornec;

    @Column(name = "GERAPEDIDOCOMITENSSEMEST", length = 1)
    private String gerapedidocomitenssemest;

    @Column(name = "CONFERIRSOMENTEPEDACERTADOCX", length = 1)
    private String conferirsomentepedacertadocx;

    @Column(name = "MONTARKITAUTOMATICAMENTE", length = 1)
    private String montarkitautomaticamente;

    @Column(name = "APLICAPERCVARNAOCONTRIB", length = 1)
    private String aplicapercvarnaocontrib;

    @Column(name = "APLICAPERCATACNAOCONTRIB", length = 1)
    private String aplicapercatacnaocontrib;

    @Column(name = "UTILIZAORIGEMVENDANF", length = 1)
    private String utilizaorigemvendanf;

    @Column(name = "ORIGEMVENDANF", length = 1)
    private String origemvendanf;

    @Column(name = "PROXNUMNOTAORIGVENDA")
    private Long proxnumnotaorigvenda;

    @Column(name = "CODDOCORIGEMNF")
    private Integer coddocorigemnf;

    @Column(name = "CLICREPENDENTE", length = 1)
    private String clicrependente;

    @Column(name = "PERMITECANCELARNFENTWMS", length = 1)
    private String permitecancelarnfentwms;

    @Column(name = "ARREDVLITENSNFSAIDA", length = 1)
    private String arredvlitensnfsaida;

    @Column(name = "APROVEITAIPI_PISCOFINS", length = 1)
    private String aproveitaipiPiscofins;

    @Column(name = "APROVEITAFRETE_PISCOFINS", length = 1)
    private String aproveitafretePiscofins;

    @Column(name = "APROVEITADESP_PISCOFINS", length = 1)
    private String aproveitadespPiscofins;

    @Column(name = "QTMULTIPLAINICIALECF")
    private Short qtmultiplainicialecf;

    @Column(name = "TIPOMONTAGEM", length = 1)
    private String tipomontagem;

    @Column(name = "CALCULARIPIVENDA", length = 1)
    private String calcularipivenda;

    @Column(name = "USAORCAMENTOECF", length = 1)
    private String usaorcamentoecf;

    @Column(name = "VALIDARENDAPANHAAUTOSERVICO", length = 1)
    private String validarendapanhaautoservico;

    @Column(name = "USADIAUTILFILIAL", length = 1)
    private String usadiautilfilial;

    @Column(name = "REDUZIRICMSPROPRIOTRANSF", length = 1)
    private String reduziricmspropriotransf;

    @Column(name = "NAOGERARCREDITOENTRADATRANSF", length = 1)
    private String naogerarcreditoentradatransf;

    @Column(name = "IMPEDETIPO14_LIVROFISCAL", length = 1)
    private String impedetipo14Livrofiscal;

    @Column(name = "CORTEAUTOMATICOPEDVENDAWMS", length = 1)
    private String corteautomaticopedvendawms;

    @Column(name = "PRAZOMAXIMPPEDPENDECF")
    private Short prazomaximppedpendecf;

    @Column(name = "USACONSULTACHEQUE", length = 1)
    private String usaconsultacheque;

    @Column(name = "TIPOIDENTIFICACAOECF", length = 2)
    private String tipoidentificacaoecf;

    @Column(name = "CONSIDERAMONTAGEMGIROMERC", length = 1)
    private String consideramontagemgiromerc;

    @Column(name = "MONTACARGAWINTHOR", length = 1)
    private String montacargawinthor;

    @Column(name = "DEVFORNECESTOQUEAVARIA", length = 1)
    private String devfornecestoqueavaria;

    @Column(name = "ALTERAPEDIDORETORNADOWMS", length = 1)
    private String alterapedidoretornadowms;

    @Column(name = "CANCELAPEDIDORETORNADOWMS", length = 1)
    private String cancelapedidoretornadowms;

    @Column(name = "CANCELANFENTRADACOMWMS", length = 1)
    private String cancelanfentradacomwms;

    @Column(name = "CANCELANFDEVCLICOMWMS", length = 1)
    private String cancelanfdevclicomwms;

    @Column(name = "CANCELANFVENDACOMWMS", length = 1)
    private String cancelanfvendacomwms;

    @Column(name = "INTEGRADORAWMS")
    private Short integradorawms;

    @Column(name = "USUARIOBANCODADOSWMS", length = 40)
    private String usuariobancodadoswms;

    @Column(name = "SENHABANCODADOSWMS", length = 40)
    private String senhabancodadoswms;

    @Column(name = "NOMEBANCODADOSWMS", length = 40)
    private String nomebancodadoswms;

    @Column(name = "GERARPCHISTEST", length = 1)
    private String gerarpchistest;

    @Column(name = "INDICECUSTOTRANSF", precision = 8, scale = 4)
    private BigDecimal indicecustotransf;

    @Column(name = "BLOQESTOQUETRANSF", length = 1)
    private String bloqestoquetransf;

    @Column(name = "ATUALIZACUSTOULTENTRANSF", length = 1)
    private String atualizacustoultentransf;

    @Column(name = "PONDCUSNOTATRANSF", length = 1)
    private String pondcusnotatransf;

    @Column(name = "PROXNUMOS")
    private Long proxnumos;

    @Column(name = "EXIBIRIMPOSTOSFORANFIMPORTACAO", length = 1)
    private String exibirimpostosforanfimportacao;

    @Column(name = "CODFISCALOPCIONALNFIMPORTACAO", length = 1)
    private String codfiscalopcionalnfimportacao;

    @Column(name = "SITTRIBUTOPCIONALNFIMPORTACAO", length = 1)
    private String sittributopcionalnfimportacao;

    @Column(name = "PESOLIMITEOS", precision = 8, scale = 2)
    private BigDecimal pesolimiteos;

    @Column(name = "QTDMAXITENSOS")
    private Integer qtdmaxitensos;

    @Column(name = "QTDMINITENSMODULOOS", precision = 8, scale = 2)
    private BigDecimal qtdminitensmoduloos;

    @Column(name = "TEMPOSEPPRODOS")
    private Integer temposepprodos;

    @Column(name = "TEMPOSEPCAIXAOS")
    private Integer temposepcaixaos;

    @Column(name = "TEMPOSEPINICIALOS")
    private Integer temposepinicialos;

    @Column(name = "DESTACARIMPOSTOSVENDATV13", length = 1)
    private String destacarimpostosvendatv13;

    @Column(name = "TIPOFRETEAUTO", length = 1)
    private String tipofreteauto;

    @Column(name = "BLOQUEARPEDIDOSABAIXOVLMINIMO", length = 1)
    private String bloquearpedidosabaixovlminimo;

    @Column(name = "ORDEMAGRUPDESD", length = 900)
    private String ordemagrupdesd;

    @Column(name = "USAINTEGRACAOWMS", length = 1)
    private String usaintegracaowms;

    @Column(name = "CALCESTDISPCOMQTMINAUTOSERV", length = 1)
    private String calcestdispcomqtminautoserv;

    @Column(name = "USAPOLITICADESCVALOR", length = 1)
    private String usapoliticadescvalor;

    @Column(name = "UTILIZAVENDAASSISTIDA", length = 1)
    private String utilizavendaassistida;

    @Column(name = "CODCONTAVENDAENTREGAFUT")
    private Long codcontavendaentregafut;

    @Column(name = "DTULTATUALIZACAODRVINTER")
    private LocalDate dtultatualizacaodrvinter;

    @Column(name = "USAINTEGRACAOOPERLOG", length = 1)
    private String usaintegracaooperlog;

    @Column(name = "CGC_OPERADORLOGISTICO", length = 14)
    private String cgcOperadorlogistico;

    @Column(name = "PERCICMSSIMPLESNAC", precision = 6, scale = 2)
    private BigDecimal percicmssimplesnac;

    @Column(name = "OPTANTESIMPLESNAC", length = 1)
    private String optantesimplesnac;

    @Column(name = "RECALCDVPRODUTO", length = 1)
    private String recalcdvproduto;

    @Column(name = "DTEXCLUSAO")
    private LocalDate dtexclusao;

    @Column(name = "USACODBARRAEMBALAGEM", length = 1)
    private String usacodbarraembalagem;

    @Column(name = "REGRAARREDONDAMENTOECF", length = 1)
    private String regraarredondamentoecf;

    @Column(name = "RETIRARDESCNABAIXA", length = 1)
    private String retirardescnabaixa;

    @Column(name = "HRINICIOEXPEDIENTE")
    private LocalDate hrinicioexpediente;

    @Column(name = "HRINICIOALMOCO")
    private LocalDate hrinicioalmoco;

    @Column(name = "HRFIMALMOCO")
    private LocalDate hrfimalmoco;

    @Column(name = "HRFIMEXPEDIENTE")
    private LocalDate hrfimexpediente;

    @Column(name = "INFORMARPROFISSIONALVENDA", length = 1)
    private String informarprofissionalvenda;

    @Column(name = "PERMITIRDESDDIFPROF", length = 1)
    private String permitirdesddifprof;

    @Column(name = "CONCEDERDESCISENCAOSTPF", length = 1)
    private String concederdescisencaostpf;

    @Column(name = "VALIDARPRECOVENDATV8", length = 1)
    private String validarprecovendatv8;

    @Column(name = "VERSAOWMS")
    private Short versaowms;

    @Column(name = "VALIDARPRECOVENDATV20", length = 1)
    private String validarprecovendatv20;

    @Column(name = "TIPOEXPORTACAO", length = 1)
    private String tipoexportacao;

    @Column(name = "CONSIDERAESTPENDSUGCOMPRA", length = 1)
    private String consideraestpendsugcompra;

    @Column(name = "USACONTABIL", length = 1)
    private String usacontabil;

    @Column(name = "PERCOMFILIALBROKER", precision = 8, scale = 4)
    private BigDecimal percomfilialbroker;

    @Column(name = "PERFRETEBROKER", precision = 8, scale = 4)
    private BigDecimal perfretebroker;

    @Column(name = "BLOQVENDAPF", length = 1)
    private String bloqvendapf;

    @Column(name = "PERMITEFATURAR", length = 1)
    private String permitefaturar;

    @Column(name = "PERCOMRCABROKER", precision = 6, scale = 2)
    private BigDecimal percomrcabroker;

    @Column(name = "PERCOMMOTBROKER", precision = 6, scale = 2)
    private BigDecimal percommotbroker;

    @Column(name = "DIAVENCICMSANTECIP")
    private Short diavencicmsantecip;

    @Column(name = "ESTORNACUSTODEVFORNEC", length = 1)
    private String estornacustodevfornec;

    @Column(name = "CONTROLAGARANTIASERVICO", length = 1)
    private String controlagarantiaservico;

    @Column(name = "USADADOSEMBALAGEMNFE", length = 1)
    private String usadadosembalagemnfe;

    @Column(name = "NUMDIASMAXIMOLIBERARPEDIDO")
    private Short numdiasmaximoliberarpedido;

    @Column(name = "NUMMAXDIASRETRODTCOMPENSACAO")
    private Short nummaxdiasretrodtcompensacao;

    @Column(name = "NUMMAXITENSNFE")
    private Short nummaxitensnfe;

    @Column(name = "USABRINDEECF", length = 1)
    private String usabrindeecf;

    @Column(name = "HORAINICIALDIGITACAOPED")
    private LocalDate horainicialdigitacaoped;

    @Column(name = "HORAFINALDIGITACAOPED")
    private LocalDate horafinaldigitacaoped;

    @Column(name = "HORAINICIALIMPORTACAOPED")
    private LocalDate horainicialimportacaoped;

    @Column(name = "HORAFINALIMPORTACAOPED")
    private LocalDate horafinalimportacaoped;

    @Column(name = "PERCMAXDIFPRODSIMIL", precision = 8, scale = 4)
    private BigDecimal percmaxdifprodsimil;

    @Column(name = "ALTERARCOBBKCHAUTOMATICO", length = 1)
    private String alterarcobbkchautomatico;

    @Column(name = "ACEITAVENDAAVISTACLIBLOQ", length = 1)
    private String aceitavendaavistaclibloq;

    @Column(name = "CODCONTARECARGA")
    private Long codcontarecarga;

    @Column(name = "ORIGEMCUSTOFILIALRETIRA", length = 1)
    private String origemcustofilialretira;

    @Column(name = "UTILIZACONTROLEBIOMETRICO", length = 1)
    private String utilizacontrolebiometrico;

    @Column(name = "NUMREGIAOBALCAOINTER")
    private Short numregiaobalcaointer;

    @Column(name = "USAREGIAOFILIALVENDAESTADUAL", length = 1)
    private String usaregiaofilialvendaestadual;

    @Column(name = "USAREGIAOFILIALVENDAINTEREST", length = 1)
    private String usaregiaofilialvendainterest;

    @Column(name = "VALIDARDESCFLEXAUTOSERV", length = 1)
    private String validardescflexautoserv;

    @Column(name = "CODDOCSRAUTO")
    private Integer coddocsrauto;

    @Column(name = "USACODCLIVENDA", length = 1)
    private String usacodclivenda;

    @Column(name = "PROXNUMNOTACOBRANCA")
    private Long proxnumnotacobranca;

    @Column(name = "CODDOCNOTACOBRANCA")
    private Integer coddocnotacobranca;

    @Column(name = "BLOQUEIARISKSCORING", length = 1)
    private String bloqueiariskscoring;

    @Column(name = "LIMRISKSCORING")
    private Integer limriskscoring;

    @Column(name = "STSOMENTEVLCONT", length = 1)
    private String stsomentevlcont;

    @Column(name = "USATRANSPORTADOPADRAONFE", length = 1)
    private String usatransportadopadraonfe;

    @Column(name = "OSPRODMANUTOBRIG", length = 1)
    private String osprodmanutobrig;

    @Column(name = "LIBPEDCOMPRASEMDIVERG", length = 1)
    private String libpedcomprasemdiverg;

    @Column(name = "MENSNFIMUNIDADETRIB", length = 300)
    private String mensnfimunidadetrib;

    @Column(name = "TRANSFEREVLSTBASESTNATRANSF", length = 1)
    private String transferevlstbasestnatransf;

    @Column(name = "USAMULTIPLOPORDESCONTO", length = 1)
    private String usamultiplopordesconto;

    @Column(name = "USAINVENTLOCAL", length = 1)
    private String usainventlocal;

    @Column(name = "ENVIACONTASPAGARNFE", length = 1)
    private String enviacontaspagarnfe;

    @Column(name = "ENVIACONTASRECEBERNFE", length = 1)
    private String enviacontasrecebernfe;

    @Column(name = "UTILIZACREDICMSESTCUSTOCONT", length = 1)
    private String utilizacredicmsestcustocont;

    @Column(name = "QTDEMAXDIASVENCVERBAS")
    private Short qtdemaxdiasvencverbas;

    @Column(name = "PERBASEREDOUTRASDESPPF", precision = 8, scale = 4)
    private BigDecimal perbaseredoutrasdesppf;

    @Column(name = "PERLIMVENDAPF", precision = 8, scale = 4)
    private BigDecimal perlimvendapf;

    @Column(name = "USAPVENDATRANSF", length = 1)
    private String usapvendatransf;

    @Column(name = "PERCACRESCIMOBALCAO", precision = 10, scale = 6)
    private BigDecimal percacrescimobalcao;

    @Column(name = "AMBIENTE", length = 1)
    private String ambiente;

    @Column(name = "VLPESODESCARGA", precision = 10, scale = 2)
    private BigDecimal vlpesodescarga;

    @Column(name = "VLVOLDESCARGA", precision = 10, scale = 2)
    private BigDecimal vlvoldescarga;

    @Column(name = "VLPESODESCARGAPAL", precision = 10, scale = 2)
    private BigDecimal vlpesodescargapal;

    @Column(name = "VLVOLUMEDESCARGAFD", precision = 10, scale = 2)
    private BigDecimal vlvolumedescargafd;

    @Column(name = "VLREMONTEDESCARGA", precision = 12, scale = 6)
    private BigDecimal vlremontedescarga;

    @Column(name = "VLPALETEDESCARG", precision = 10, scale = 2)
    private BigDecimal vlpaletedescarg;

    @Column(name = "OBRIGACONSFINALDEV", length = 1)
    private String obrigaconsfinaldev;

    @Column(name = "UTILIZASEQNFENT", length = 1)
    private String utilizaseqnfent;

    @Column(name = "TIPOCNPJ", length = 1)
    private String tipocnpj;

    @Column(name = "LOGOMARCA")
    private byte[] logomarca;

    @Column(name = "GRAVARVALORDESCFIN", length = 1)
    private String gravarvalordescfin;

    @Column(name = "USUARIOSERV", length = 40)
    private String usuarioserv;

    @Column(name = "SENHASERV", length = 10)
    private String senhaserv;

    @Column(name = "DOMINIOSERV", length = 150)
    private String dominioserv;

    @Column(name = "NOMEREMETENTE", length = 150)
    private String nomeremetente;

    @Column(name = "EMAILREMETENTE", length = 150)
    private String emailremetente;

    @Column(name = "SERVIDORSMTP", length = 150)
    private String servidorsmtp;

    @Column(name = "EMAILRESPOSTA", length = 150)
    private String emailresposta;

    @Column(name = "EMAILCOPIARESPOSTA", length = 150)
    private String emailcopiaresposta;

    @Column(name = "PORTASERV")
    private Integer portaserv;

    @Column(name = "USUARIOPROXY", length = 40)
    private String usuarioproxy;

    @Column(name = "SENHAPROXY", length = 10)
    private String senhaproxy;

    @Column(name = "ENDERECOPROXY", length = 150)
    private String enderecoproxy;

    @Column(name = "PORTAPROXY")
    private Integer portaproxy;

    @Column(name = "DTUTILIZACTE")
    private LocalDate dtutilizacte;

    @Column(name = "UTILIZACTE", length = 1)
    private String utilizacte;

    @Column(name = "CONTROLENFEPORSERIE", length = 2)
    private String controlenfeporserie;

    @Column(name = "PROXNUMNFEENTRADA")
    private Integer proxnumnfeentrada;

    @Column(name = "PROXNUMNFESCAN")
    private Integer proxnumnfescan;

    @Column(name = "SERIENFEENTRADA", length = 3)
    private String serienfeentrada;

    @Column(name = "PROXNUMNFESCANENTRADA")
    private Integer proxnumnfescanentrada;

    @Column(name = "SERIENFESCANENTRADA", length = 3)
    private String serienfescanentrada;

    @Column(name = "CNPJ_PAF", length = 14)
    private String cnpjPaf;

    @Column(name = "NOME_PAF", length = 40)
    private String nomePaf;

    @Column(name = "ROTINALANC", length = 48)
    private String rotinalanc;

    @Column(name = "CODMD5_PAF", length = 40)
    private String codmd5Paf;

    @Column(name = "PROXNUMNFS")
    private Long proxnumnfs;

    @Column(name = "SERIENFS", length = 3)
    private String serienfs;

    @Column(name = "SERIENFEREMMANISFESTOSCAN", length = 3)
    private String serienferemmanisfestoscan;

    @Column(name = "PROXNUMNFEREMMANISFESTOSCAN")
    private Integer proxnumnferemmanisfestoscan;

    @Column(name = "SERIENFEDEVMANIFESTOSCAN", length = 3)
    private String serienfedevmanifestoscan;

    @Column(name = "PROXNUMNFEDEVMANISFESTOSCAN")
    private Integer proxnumnfedevmanisfestoscan;

    @Column(name = "SERIENFEREMMANISFESTO", length = 3)
    private String serienferemmanisfesto;

    @Column(name = "PROXNUMNFEREMMANISFESTO")
    private Integer proxnumnferemmanisfesto;

    @Column(name = "SERIENFEDEVMANIFESTO", length = 3)
    private String serienfedevmanifesto;

    @Column(name = "PROXNUMNFEDEVMANISFESTO")
    private Integer proxnumnfedevmanisfesto;

    @Column(name = "PROXNUMCTE")
    private Long proxnumcte;

    @Column(name = "SERIECTE", length = 3)
    private String seriecte;

    @Column(name = "PROXNUMNFEIMPORTACAO")
    private Integer proxnumnfeimportacao;

    @Column(name = "SERIENFEIMPORTACAO", length = 3)
    private String serienfeimportacao;

    @Column(name = "PROXNUMNFESCANIMPORTACAO")
    private Integer proxnumnfescanimportacao;

    @Column(name = "SERIENFESCANIMPORTACAO", length = 3)
    private String serienfescanimportacao;

    @Column(name = "DEPFECHADO", length = 1)
    private String depfechado;

    @Column(name = "CODGLN")
    private Long codgln;

    @Column(name = "CODGRUPOLOJA")
    private Integer codgrupoloja;

    @Column(name = "DATAHORA_PRIMEIRODOCUMENTO_ECF", length = 19)
    private String datahoraPrimeirodocumentoEcf;

    @Column(name = "TIPOFILIAL", length = 1)
    private String tipofilial;

    @Column(name = "DIASCURVATURA")
    private Integer diascurvatura;

    @Column(name = "PERCEVOLUCAOABC")
    private Integer percevolucaoabc;

    @Column(name = "PERCDECLINIOABC")
    private Integer percdeclinioabc;

    @Column(name = "MIXMINIMO")
    private Integer mixminimo;

    @Column(name = "MIXMAXIMO")
    private Integer mixmaximo;

    @Column(name = "QTMAXPEDIDO")
    private Integer qtmaxpedido;

    @Column(name = "ARREDONDAQTGIRODIA", length = 1)
    private String arredondaqtgirodia;

    @Column(name = "PERCPARTICIPACLASSEA", precision = 5, scale = 2)
    private BigDecimal percparticipaclassea;

    @Column(name = "PERCPARTICIPACLASSEB", precision = 5, scale = 2)
    private BigDecimal percparticipaclasseb;

    @Column(name = "PERCPARTICIPASUBCLASSEA1", precision = 5, scale = 2)
    private BigDecimal percparticipasubclassea1;

    @Column(name = "PERCPARTICIPASUBCLASSEB1", precision = 5, scale = 2)
    private BigDecimal percparticipasubclasseb1;

    @Column(name = "PERCPARTICIPASUBCLASSEA2", precision = 5, scale = 2)
    private BigDecimal percparticipasubclassea2;

    @Column(name = "PERCPARTICIPASUBCLASSEB2", precision = 5, scale = 2)
    private BigDecimal percparticipasubclasseb2;

    @Column(name = "PERCPARTICIPASUBCLASSEA3", precision = 5, scale = 2)
    private BigDecimal percparticipasubclassea3;

    @Column(name = "PERCPARTICIPASUBCLASSEB3", precision = 5, scale = 2)
    private BigDecimal percparticipasubclasseb3;

    @Column(name = "PERCPARTICIPASUBCLASSEC1", precision = 5, scale = 2)
    private BigDecimal percparticipasubclassec1;

    @Column(name = "PERCPARTICIPASUBCLASSEC2", precision = 5, scale = 2)
    private BigDecimal percparticipasubclassec2;

    @Column(name = "DIASPRAZOTRANSF")
    private Short diasprazotransf;

    @Column(name = "MATRICULASNGPC")
    private Integer matriculasngpc;

    @Column(name = "MATRICULASNGPCANT")
    private Integer matriculasngpcant;

    @Column(name = "DTALTMATRICSNGPC")
    private LocalDate dtaltmatricsngpc;

    @Column(name = "DIREXPXMLSNGPC", length = 200)
    private String direxpxmlsngpc;

    @Column(name = "NSU")
    private Long nsu;

    @Column(name = "DTULTCONSULTAMANIF")
    private LocalDate dtultconsultamanif;

    @Column(name = "PROXNUMMDFE")
    private Long proxnummdfe;

    @Column(name = "SERIEMDFE", length = 3)
    private String seriemdfe;

    @Column(name = "CONTROLENFEPORROTA", length = 1)
    private String controlenfeporrota;

    @Column(name = "PERCMINDIFPRODSIMIL", precision = 8, scale = 4)
    private BigDecimal percmindifprodsimil;

    @Column(name = "EMPRESAGRANDEPORTE", length = 1)
    private String empresagrandeporte;

    @Column(name = "ENDERECOCOMP", length = 60)
    private String enderecocomp;

    @Column(name = "FIID", length = 50)
    private String fiid;

    @Column(name = "CODNATUREZAJURIDICA")
    private Short codnaturezajuridica;

    @Column(name = "CODCNAEFISCAL")
    private Integer codcnaefiscal;

    @Column(name = "COMPLEMENTOENDERECO", length = 50)
    private String complementoendereco;

    @Column(name = "UTILIZAKITABERTO", length = 1)
    private String utilizakitaberto;

    @Column(name = "FILIALCONTRATANTESERASA", length = 1)
    private String filialcontratanteserasa;

    @Column(name = "CGCAUTORIZAXML", length = 14)
    private String cgcautorizaxml;

    @Column(name = "CONTROLENFEPORSERIEDEPOFECHADO", length = 1)
    private String controlenfeporseriedepofechado;

    @Column(name = "PROXNUMNOTAREMDEP")
    private Long proxnumnotaremdep;

    @Column(name = "SERIEREMDEP", length = 3)
    private String serieremdep;

    @Column(name = "USARFWINTHOR", length = 1)
    private String usarfwinthor;

    @Column(name = "DTVIRADARF")
    private LocalDate dtviradarf;

    @Column(name = "SEQUENCIACRC", length = 20)
    private String sequenciacrc;

    @Column(name = "DTVALIDADEDHPC")
    private LocalDate dtvalidadedhpc;

    @Column(name = "PROXNUMRPS")
    private Long proxnumrps;

    @Column(name = "SERIERPS", length = 3)
    private String serierps;

    @Column(name = "CODIGOTSS", length = 20)
    private String codigotss;

    @Column(name = "UTILIZATSS", length = 1)
    private String utilizatss;

    @Column(name = "INFOAMBIENTEINTEGRADOTSS", length = 1)
    private String infoambienteintegradotss;

    @Column(name = "INFOCERTIFICADOINTEGRADOTSS", length = 1)
    private String infocertificadointegradotss;

    @Column(name = "SENHACERTIFICADO", length = 50)
    private String senhacertificado;


    @Column(name = "LOJAREALIZAREPOSICAO", length = 1)
    private String lojarealizareposicao;


    @Column(name = "CODFILIALENTRADA", length = 2)
    private String codfilialentrada;

    @Column(name = "CODFILIALENTCUSTO", length = 2)
    private String codfilialentcusto;

    @Column(name = "IDTOKENCERTIFICADOA1", length = 50)
    private String idtokencertificadoa1;

    @Column(name = "TOKENCERTIFICADOA1", length = 50)
    private String tokencertificadoa1;

    @Column(name = "CERTIFICADOA1")
    private byte[] certificadoa1;

    @Column(name = "VERSAOLAYOUTNFCE", length = 4)
    private String versaolayoutnfce;

    @Column(name = "UTILIZARECALCULOSTCHECKOUT", length = 1)
    private String utilizarecalculostcheckout;

    @Column(name = "CODIGONACIONALOBRAS", length = 14)
    private String codigonacionalobras;

    @Column(name = "VERSAOQRCODE", length = 4)
    private String versaoqrcode;

    @Column(name = "CODFILIALCIASHOP")
    private Long codfilialciashop;

    @Column(name = "CODFILIALRETIRAREPLOJA", length = 2)
    private String codfilialretirareploja;

    @Column(name = "PROXCODDEPOSITO")
    private Long proxcoddeposito;

    @Column(name = "CONTRATANTESERASA", length = 1)
    private String contratanteserasa;

    @Column(name = "CODIGORNTRC", length = 30)
    private String codigorntrc;

    @Column(name = "PROXNUMNOTAAJUSTE")
    private Long proxnumnotaajuste;

    @Column(name = "SERIENFEAJUSTE", length = 3)
    private String serienfeajuste;

    @Column(name = "UTILIZACONCENTRADORPDV", length = 1)
    private String utilizaconcentradorpdv;

    @Column(name = "UTILIZAPAYMENTHUB", length = 1)
    private String utilizapaymenthub;

    @Column(name = "HUBUSERNAME", length = 50)
    private String hubusername;

    @Column(name = "HUBPASSWORD", length = 50)
    private String hubpassword;

    @Column(name = "HUBCLIENTID", length = 100)
    private String hubclientid;

    @Column(name = "HUBCLIENTSECRET", length = 100)
    private String hubclientsecret;

    @Column(name = "HUBAPI", length = 200)
    private String hubapi;

    @Column(name = "HUBTOKEN", length = 200)
    private String hubtoken;

    @Column(name = "HUBNUMCAIXAPADRAO")
    private Short hubnumcaixapadrao;

    @Column(name = "MAXNSUSEFAZ")
    private Long maxnsusefaz;

    @Column(name = "STATUSULTCONSULTANSUSEFAZ", length = 4)
    private String statusultconsultansusefaz;

    @Column(name = "ESTOQUEHASH", length = 64)
    private String estoquehash;

    @Column(name = "DTINICIOLICENCAPDV")
    private LocalDate dtiniciolicencapdv;

    @Column(name = "IRREGULARIDADECADSEFAZ", length = 3)
    private String irregularidadecadsefaz;

    @Column(name = "DTCADASTRO")
    private LocalDate dtcadastro;

    @Column(name = "DTULTALTER")
    private LocalDate dtultalter;

    @Column(name = "CODFILIALINTEGRACAO")
    private Short codfilialintegracao;

    @Column(name = "CONTRATOSERASA", nullable = false, length = 1)
    private String contratoserasa;

    @Column(name = "DTALTERC5")
    private Instant dtalterc5;

    @Column(name = "RAZAOSOCIALRESPTEC", length = 60)
    private String razaosocialresptec;

    @Column(name = "CNPJRESPTEC", length = 14)
    private String cnpjresptec;

    @Column(name = "TELEFONERESPTEC", length = 14)
    private String telefoneresptec;

    @Column(name = "EMAILRESPTEC", length = 60)
    private String emailresptec;

    public PcfilialId getId() {
        return id;
    }

    public void setId(PcfilialId id) {
        this.id = id;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    public Integer getCodcli() {
        return codcli;
    }

    public void setCodcli(Integer codcli) {
        this.codcli = codcli;
    }

    public Integer getCodfornec() {
        return codfornec;
    }

    public void setCodfornec(Integer codfornec) {
        this.codfornec = codfornec;
    }

    public Long getProxnumnota() {
        return proxnumnota;
    }

    public void setProxnumnota(Long proxnumnota) {
        this.proxnumnota = proxnumnota;
    }

    public Long getNumproxvend() {
        return numproxvend;
    }

    public void setNumproxvend(Long numproxvend) {
        this.numproxvend = numproxvend;
    }

    public String getRazaotransp() {
        return razaotransp;
    }

    public void setRazaotransp(String razaotransp) {
        this.razaotransp = razaotransp;
    }

    public String getCgctransp() {
        return cgctransp;
    }

    public void setCgctransp(String cgctransp) {
        this.cgctransp = cgctransp;
    }

    public String getIetransp() {
        return ietransp;
    }

    public void setIetransp(String ietransp) {
        this.ietransp = ietransp;
    }

    public String getEndtransp() {
        return endtransp;
    }

    public void setEndtransp(String endtransp) {
        this.endtransp = endtransp;
    }

    public String getCidadetransp() {
        return cidadetransp;
    }

    public void setCidadetransp(String cidadetransp) {
        this.cidadetransp = cidadetransp;
    }

    public String getUftransp() {
        return uftransp;
    }

    public void setUftransp(String uftransp) {
        this.uftransp = uftransp;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
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

    public Integer getCoddocnf() {
        return coddocnf;
    }

    public void setCoddocnf(Integer coddocnf) {
        this.coddocnf = coddocnf;
    }

    public Integer getCoddocdevol() {
        return coddocdevol;
    }

    public void setCoddocdevol(Integer coddocdevol) {
        this.coddocdevol = coddocdevol;
    }

    public Integer getCoddocsr() {
        return coddocsr;
    }

    public void setCoddocsr(Integer coddocsr) {
        this.coddocsr = coddocsr;
    }

    public String getMensnf() {
        return mensnf;
    }

    public void setMensnf(String mensnf) {
        this.mensnf = mensnf;
    }

    public Long getProxnumaverbacao() {
        return proxnumaverbacao;
    }

    public void setProxnumaverbacao(Long proxnumaverbacao) {
        this.proxnumaverbacao = proxnumaverbacao;
    }

    public Long getProxnumnfdevcli() {
        return proxnumnfdevcli;
    }

    public void setProxnumnfdevcli(Long proxnumnfdevcli) {
        this.proxnumnfdevcli = proxnumnfdevcli;
    }

    public Short getNumseqentr() {
        return numseqentr;
    }

    public void setNumseqentr(Short numseqentr) {
        this.numseqentr = numseqentr;
    }

    public String getNumidf() {
        return numidf;
    }

    public void setNumidf(String numidf) {
        this.numidf = numidf;
    }

    public String getNumidfdevcli() {
        return numidfdevcli;
    }

    public void setNumidfdevcli(String numidfdevcli) {
        this.numidfdevcli = numidfdevcli;
    }

    public Long getProxnumnotatransf() {
        return proxnumnotatransf;
    }

    public void setProxnumnotatransf(Long proxnumnotatransf) {
        this.proxnumnotatransf = proxnumnotatransf;
    }

    public Long getProxnumnotad() {
        return proxnumnotad;
    }

    public void setProxnumnotad(Long proxnumnotad) {
        this.proxnumnotad = proxnumnotad;
    }

    public String getCodfilialprefestbalcao() {
        return codfilialprefestbalcao;
    }

    public void setCodfilialprefestbalcao(String codfilialprefestbalcao) {
        this.codfilialprefestbalcao = codfilialprefestbalcao;
    }

    public String getCodfilialprefesttlmk() {
        return codfilialprefesttlmk;
    }

    public void setCodfilialprefesttlmk(String codfilialprefesttlmk) {
        this.codfilialprefesttlmk = codfilialprefesttlmk;
    }

    public String getMontando() {
        return montando;
    }

    public void setMontando(String montando) {
        this.montando = montando;
    }

    public String getIndustria() {
        return industria;
    }

    public void setIndustria(String industria) {
        this.industria = industria;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public Long getEanemissor() {
        return eanemissor;
    }

    public void setEanemissor(Long eanemissor) {
        this.eanemissor = eanemissor;
    }

    public Integer getCoddoctransf() {
        return coddoctransf;
    }

    public void setCoddoctransf(Integer coddoctransf) {
        this.coddoctransf = coddoctransf;
    }

    public Short getNumregiao() {
        return numregiao;
    }

    public void setNumregiao(Short numregiao) {
        this.numregiao = numregiao;
    }

    public String getCodfilialproducao() {
        return codfilialproducao;
    }

    public void setCodfilialproducao(String codfilialproducao) {
        this.codfilialproducao = codfilialproducao;
    }

    public String getUsaestoquedepfechado() {
        return usaestoquedepfechado;
    }

    public void setUsaestoquedepfechado(String usaestoquedepfechado) {
        this.usaestoquedepfechado = usaestoquedepfechado;
    }

    public Short getProxnumlote() {
        return proxnumlote;
    }

    public void setProxnumlote(Short proxnumlote) {
        this.proxnumlote = proxnumlote;
    }

    public String getCodgrupo() {
        return codgrupo;
    }

    public void setCodgrupo(String codgrupo) {
        this.codgrupo = codgrupo;
    }

    public String getUsanumnfdevcli() {
        return usanumnfdevcli;
    }

    public void setUsanumnfdevcli(String usanumnfdevcli) {
        this.usanumnfdevcli = usanumnfdevcli;
    }

    public Integer getCoddocdevfornec() {
        return coddocdevfornec;
    }

    public void setCoddocdevfornec(Integer coddocdevfornec) {
        this.coddocdevfornec = coddocdevfornec;
    }

    public String getAutoservico() {
        return autoservico;
    }

    public void setAutoservico(String autoservico) {
        this.autoservico = autoservico;
    }

    public String getCae() {
        return cae;
    }

    public void setCae(String cae) {
        this.cae = cae;
    }

    public Integer getCoddocentradamerc() {
        return coddocentradamerc;
    }

    public void setCoddocentradamerc(Integer coddocentradamerc) {
        this.coddocentradamerc = coddocentradamerc;
    }

    public BigDecimal getPerfreteconhec() {
        return perfreteconhec;
    }

    public void setPerfreteconhec(BigDecimal perfreteconhec) {
        this.perfreteconhec = perfreteconhec;
    }

    public String getLimparbasecalcentrada() {
        return limparbasecalcentrada;
    }

    public void setLimparbasecalcentrada(String limparbasecalcentrada) {
        this.limparbasecalcentrada = limparbasecalcentrada;
    }

    public String getUsawms() {
        return usawms;
    }

    public void setUsawms(String usawms) {
        this.usawms = usawms;
    }

    public String getOpisentosicmsaltocusto() {
        return opisentosicmsaltocusto;
    }

    public void setOpisentosicmsaltocusto(String opisentosicmsaltocusto) {
        this.opisentosicmsaltocusto = opisentosicmsaltocusto;
    }

    public BigDecimal getAliqicmoutrasdesp() {
        return aliqicmoutrasdesp;
    }

    public void setAliqicmoutrasdesp(BigDecimal aliqicmoutrasdesp) {
        this.aliqicmoutrasdesp = aliqicmoutrasdesp;
    }

    public BigDecimal getAliqicminteroutrasdesp() {
        return aliqicminteroutrasdesp;
    }

    public void setAliqicminteroutrasdesp(BigDecimal aliqicminteroutrasdesp) {
        this.aliqicminteroutrasdesp = aliqicminteroutrasdesp;
    }

    public Short getCodfiscaloutrasdesp() {
        return codfiscaloutrasdesp;
    }

    public void setCodfiscaloutrasdesp(Short codfiscaloutrasdesp) {
        this.codfiscaloutrasdesp = codfiscaloutrasdesp;
    }

    public Short getCodfiscalinteroutrasdesp() {
        return codfiscalinteroutrasdesp;
    }

    public void setCodfiscalinteroutrasdesp(Short codfiscalinteroutrasdesp) {
        this.codfiscalinteroutrasdesp = codfiscalinteroutrasdesp;
    }

    public String getAceitavendasemest() {
        return aceitavendasemest;
    }

    public void setAceitavendasemest(String aceitavendasemest) {
        this.aceitavendasemest = aceitavendasemest;
    }

    public String getCalccredicms() {
        return calccredicms;
    }

    public void setCalccredicms(String calccredicms) {
        this.calccredicms = calccredicms;
    }

    public String getCalccredpiscofins() {
        return calccredpiscofins;
    }

    public void setCalccredpiscofins(String calccredpiscofins) {
        this.calccredpiscofins = calccredpiscofins;
    }

    public Short getNumregiaopadrao() {
        return numregiaopadrao;
    }

    public void setNumregiaopadrao(Short numregiaopadrao) {
        this.numregiaopadrao = numregiaopadrao;
    }

    public BigDecimal getPervendapf() {
        return pervendapf;
    }

    public void setPervendapf(BigDecimal pervendapf) {
        this.pervendapf = pervendapf;
    }

    public BigDecimal getAreavenda() {
        return areavenda;
    }

    public void setAreavenda(BigDecimal areavenda) {
        this.areavenda = areavenda;
    }

    public Long getCodfiscaldevoutrasdesp() {
        return codfiscaldevoutrasdesp;
    }

    public void setCodfiscaldevoutrasdesp(Long codfiscaldevoutrasdesp) {
        this.codfiscaldevoutrasdesp = codfiscaldevoutrasdesp;
    }

    public Long getCodfiscalinterdevoutrasdesp() {
        return codfiscalinterdevoutrasdesp;
    }

    public void setCodfiscalinterdevoutrasdesp(Long codfiscalinterdevoutrasdesp) {
        this.codfiscalinterdevoutrasdesp = codfiscalinterdevoutrasdesp;
    }

    public Short getNumdiasvencfrete() {
        return numdiasvencfrete;
    }

    public void setNumdiasvencfrete(Short numdiasvencfrete) {
        this.numdiasvencfrete = numdiasvencfrete;
    }

    public String getCalccredipi() {
        return calccredipi;
    }

    public void setCalccredipi(String calccredipi) {
        this.calccredipi = calccredipi;
    }

    public Integer getNumcontratocorreio() {
        return numcontratocorreio;
    }

    public void setNumcontratocorreio(Integer numcontratocorreio) {
        this.numcontratocorreio = numcontratocorreio;
    }

    public Long getCodmun() {
        return codmun;
    }

    public void setCodmun(Long codmun) {
        this.codmun = codmun;
    }

    public Long getCodestado() {
        return codestado;
    }

    public void setCodestado(Long codestado) {
        this.codestado = codestado;
    }

    public Short getCodpais() {
        return codpais;
    }

    public void setCodpais(Short codpais) {
        this.codpais = codpais;
    }

    public String getNomepais() {
        return nomepais;
    }

    public void setNomepais(String nomepais) {
        this.nomepais = nomepais;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getVltarifa() {
        return vltarifa;
    }

    public void setVltarifa(BigDecimal vltarifa) {
        this.vltarifa = vltarifa;
    }

    public BigDecimal getVlmintarifabanc() {
        return vlmintarifabanc;
    }

    public void setVlmintarifabanc(BigDecimal vlmintarifabanc) {
        this.vlmintarifabanc = vlmintarifabanc;
    }

    public BigDecimal getVlmaxtarifabanc() {
        return vlmaxtarifabanc;
    }

    public void setVlmaxtarifabanc(BigDecimal vlmaxtarifabanc) {
        this.vlmaxtarifabanc = vlmaxtarifabanc;
    }

    public String getSomatarifabancduplic() {
        return somatarifabancduplic;
    }

    public void setSomatarifabancduplic(String somatarifabancduplic) {
        this.somatarifabancduplic = somatarifabancduplic;
    }

    public Integer getCoddocnfc() {
        return coddocnfc;
    }

    public void setCoddocnfc(Integer coddocnfc) {
        this.coddocnfc = coddocnfc;
    }

    public String getProdporetapa() {
        return prodporetapa;
    }

    public void setProdporetapa(String prodporetapa) {
        this.prodporetapa = prodporetapa;
    }

    public Long getProxnumorc() {
        return proxnumorc;
    }

    public void setProxnumorc(Long proxnumorc) {
        this.proxnumorc = proxnumorc;
    }

    public String getGerarnumloteautomaticpa() {
        return gerarnumloteautomaticpa;
    }

    public void setGerarnumloteautomaticpa(String gerarnumloteautomaticpa) {
        this.gerarnumloteautomaticpa = gerarnumloteautomaticpa;
    }

    public Long getProxnumetapa() {
        return proxnumetapa;
    }

    public void setProxnumetapa(Long proxnumetapa) {
        this.proxnumetapa = proxnumetapa;
    }

    public String getAtacadista() {
        return atacadista;
    }

    public void setAtacadista(String atacadista) {
        this.atacadista = atacadista;
    }

    public String getPermitecredicmcomst() {
        return permitecredicmcomst;
    }

    public void setPermitecredicmcomst(String permitecredicmcomst) {
        this.permitecredicmcomst = permitecredicmcomst;
    }

    public String getCalccredicmcustocont() {
        return calccredicmcustocont;
    }

    public void setCalccredicmcustocont(String calccredicmcustocont) {
        this.calccredicmcustocont = calccredicmcustocont;
    }

    public String getCalccredpiscustocont() {
        return calccredpiscustocont;
    }

    public void setCalccredpiscustocont(String calccredpiscustocont) {
        this.calccredpiscustocont = calccredpiscustocont;
    }

    public String getUsaenderecofilial() {
        return usaenderecofilial;
    }

    public void setUsaenderecofilial(String usaenderecofilial) {
        this.usaenderecofilial = usaenderecofilial;
    }

    public Integer getCodcliconsumidor() {
        return codcliconsumidor;
    }

    public void setCodcliconsumidor(Integer codcliconsumidor) {
        this.codcliconsumidor = codcliconsumidor;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public BigDecimal getPercdespadm() {
        return percdespadm;
    }

    public void setPercdespadm(BigDecimal percdespadm) {
        this.percdespadm = percdespadm;
    }

    public String getTiponumnfentrada() {
        return tiponumnfentrada;
    }

    public void setTiponumnfentrada(String tiponumnfentrada) {
        this.tiponumnfentrada = tiponumnfentrada;
    }

    public String getPermitirvendainterestadualpf() {
        return permitirvendainterestadualpf;
    }

    public void setPermitirvendainterestadualpf(String permitirvendainterestadualpf) {
        this.permitirvendainterestadualpf = permitirvendainterestadualpf;
    }

    public String getPermitirvendaestadualpfcomie() {
        return permitirvendaestadualpfcomie;
    }

    public void setPermitirvendaestadualpfcomie(String permitirvendaestadualpfcomie) {
        this.permitirvendaestadualpfcomie = permitirvendaestadualpfcomie;
    }

    public String getPermitirvendaestadualpfsemie() {
        return permitirvendaestadualpfsemie;
    }

    public void setPermitirvendaestadualpfsemie(String permitirvendaestadualpfsemie) {
        this.permitirvendaestadualpfsemie = permitirvendaestadualpfsemie;
    }

    public String getIncluiritempcembalagem() {
        return incluiritempcembalagem;
    }

    public void setIncluiritempcembalagem(String incluiritempcembalagem) {
        this.incluiritempcembalagem = incluiritempcembalagem;
    }

    public Short getAliquotafreteest() {
        return aliquotafreteest;
    }

    public void setAliquotafreteest(Short aliquotafreteest) {
        this.aliquotafreteest = aliquotafreteest;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public String getTipobroker() {
        return tipobroker;
    }

    public void setTipobroker(String tipobroker) {
        this.tipobroker = tipobroker;
    }

    public Integer getProxnumeroorcamento() {
        return proxnumeroorcamento;
    }

    public void setProxnumeroorcamento(Integer proxnumeroorcamento) {
        this.proxnumeroorcamento = proxnumeroorcamento;
    }

    public BigDecimal getPerbaseredoutrasdesp() {
        return perbaseredoutrasdesp;
    }

    public void setPerbaseredoutrasdesp(BigDecimal perbaseredoutrasdesp) {
        this.perbaseredoutrasdesp = perbaseredoutrasdesp;
    }

    public String getCalcredpisfrete() {
        return calcredpisfrete;
    }

    public void setCalcredpisfrete(String calcredpisfrete) {
        this.calcredpisfrete = calcredpisfrete;
    }

    public String getCalcredpisfretecont() {
        return calcredpisfretecont;
    }

    public void setCalcredpisfretecont(String calcredpisfretecont) {
        this.calcredpisfretecont = calcredpisfretecont;
    }

    public String getTiponummapa() {
        return tiponummapa;
    }

    public void setTiponummapa(String tiponummapa) {
        this.tiponummapa = tiponummapa;
    }

    public String getIesubsttrib() {
        return iesubsttrib;
    }

    public void setIesubsttrib(String iesubsttrib) {
        this.iesubsttrib = iesubsttrib;
    }

    public String getUtilizapercbaseredoutrasdesppf() {
        return utilizapercbaseredoutrasdesppf;
    }

    public void setUtilizapercbaseredoutrasdesppf(String utilizapercbaseredoutrasdesppf) {
        this.utilizapercbaseredoutrasdesppf = utilizapercbaseredoutrasdesppf;
    }

    public String getExigiremissaomapabalcao() {
        return exigiremissaomapabalcao;
    }

    public void setExigiremissaomapabalcao(String exigiremissaomapabalcao) {
        this.exigiremissaomapabalcao = exigiremissaomapabalcao;
    }

    public Integer getCoddocss() {
        return coddocss;
    }

    public void setCoddocss(Integer coddocss) {
        this.coddocss = coddocss;
    }

    public Long getProxnumorcafilial() {
        return proxnumorcafilial;
    }

    public void setProxnumorcafilial(Long proxnumorcafilial) {
        this.proxnumorcafilial = proxnumorcafilial;
    }

    public Long getProxnumentmex() {
        return proxnumentmex;
    }

    public void setProxnumentmex(Long proxnumentmex) {
        this.proxnumentmex = proxnumentmex;
    }

    public Long getProxnsu() {
        return proxnsu;
    }

    public void setProxnsu(Long proxnsu) {
        this.proxnsu = proxnsu;
    }

    public String getGerarnsu() {
        return gerarnsu;
    }

    public void setGerarnsu(String gerarnsu) {
        this.gerarnsu = gerarnsu;
    }

    public String getUsacontrolelocalizacaoveiculo() {
        return usacontrolelocalizacaoveiculo;
    }

    public void setUsacontrolelocalizacaoveiculo(String usacontrolelocalizacaoveiculo) {
        this.usacontrolelocalizacaoveiculo = usacontrolelocalizacaoveiculo;
    }

    public Long getProxnumprevenda() {
        return proxnumprevenda;
    }

    public void setProxnumprevenda(Long proxnumprevenda) {
        this.proxnumprevenda = proxnumprevenda;
    }

    public String getOperadorlogistico() {
        return operadorlogistico;
    }

    public void setOperadorlogistico(String operadorlogistico) {
        this.operadorlogistico = operadorlogistico;
    }

    public String getConsideraricmsantecipcusto() {
        return consideraricmsantecipcusto;
    }

    public void setConsideraricmsantecipcusto(String consideraricmsantecipcusto) {
        this.consideraricmsantecipcusto = consideraricmsantecipcusto;
    }

    public Integer getCodgrupofilial() {
        return codgrupofilial;
    }

    public void setCodgrupofilial(Integer codgrupofilial) {
        this.codgrupofilial = codgrupofilial;
    }

    public Integer getCodcontador() {
        return codcontador;
    }

    public void setCodcontador(Integer codcontador) {
        this.codcontador = codcontador;
    }

    public Integer getCodsocio() {
        return codsocio;
    }

    public void setCodsocio(Integer codsocio) {
        this.codsocio = codsocio;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public BigDecimal getValorcapital() {
        return valorcapital;
    }

    public void setValorcapital(BigDecimal valorcapital) {
        this.valorcapital = valorcapital;
    }

    public LocalDate getDtiniatividade() {
        return dtiniatividade;
    }

    public void setDtiniatividade(LocalDate dtiniatividade) {
        this.dtiniatividade = dtiniatividade;
    }

    public LocalDate getDtfimatividade() {
        return dtfimatividade;
    }

    public void setDtfimatividade(LocalDate dtfimatividade) {
        this.dtfimatividade = dtfimatividade;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getCodregistro() {
        return codregistro;
    }

    public void setCodregistro(String codregistro) {
        this.codregistro = codregistro;
    }

    public LocalDate getDtregistro() {
        return dtregistro;
    }

    public void setDtregistro(LocalDate dtregistro) {
        this.dtregistro = dtregistro;
    }

    public BigDecimal getPercaltercustoent() {
        return percaltercustoent;
    }

    public void setPercaltercustoent(BigDecimal percaltercustoent) {
        this.percaltercustoent = percaltercustoent;
    }

    public Long getProxnumtransconhec() {
        return proxnumtransconhec;
    }

    public void setProxnumtransconhec(Long proxnumtransconhec) {
        this.proxnumtransconhec = proxnumtransconhec;
    }

    public Long getProxnumconhec() {
        return proxnumconhec;
    }

    public void setProxnumconhec(Long proxnumconhec) {
        this.proxnumconhec = proxnumconhec;
    }

    public String getCalcularcomissaopvenda1() {
        return calcularcomissaopvenda1;
    }

    public void setCalcularcomissaopvenda1(String calcularcomissaopvenda1) {
        this.calcularcomissaopvenda1 = calcularcomissaopvenda1;
    }

    public String getUsadistrib() {
        return usadistrib;
    }

    public void setUsadistrib(String usadistrib) {
        this.usadistrib = usadistrib;
    }

    public String getIpisomentevlcont() {
        return ipisomentevlcont;
    }

    public void setIpisomentevlcont(String ipisomentevlcont) {
        this.ipisomentevlcont = ipisomentevlcont;
    }

    public Long getCodcontaentimportacao() {
        return codcontaentimportacao;
    }

    public void setCodcontaentimportacao(Long codcontaentimportacao) {
        this.codcontaentimportacao = codcontaentimportacao;
    }

    public String getGerabasenormalquandost() {
        return gerabasenormalquandost;
    }

    public void setGerabasenormalquandost(String gerabasenormalquandost) {
        this.gerabasenormalquandost = gerabasenormalquandost;
    }

    public String getValidavlmaxisencaostpf() {
        return validavlmaxisencaostpf;
    }

    public void setValidavlmaxisencaostpf(String validavlmaxisencaostpf) {
        this.validavlmaxisencaostpf = validavlmaxisencaostpf;
    }

    public BigDecimal getVlmaxisencaostpf() {
        return vlmaxisencaostpf;
    }

    public void setVlmaxisencaostpf(BigDecimal vlmaxisencaostpf) {
        this.vlmaxisencaostpf = vlmaxisencaostpf;
    }

    public String getUtilizavendaporembalagem() {
        return utilizavendaporembalagem;
    }

    public void setUtilizavendaporembalagem(String utilizavendaporembalagem) {
        this.utilizavendaporembalagem = utilizavendaporembalagem;
    }

    public String getPrecoporembalagem() {
        return precoporembalagem;
    }

    public void setPrecoporembalagem(String precoporembalagem) {
        this.precoporembalagem = precoporembalagem;
    }

    public String getValidaendpickingpedcompra() {
        return validaendpickingpedcompra;
    }

    public void setValidaendpickingpedcompra(String validaendpickingpedcompra) {
        this.validaendpickingpedcompra = validaendpickingpedcompra;
    }

    public String getUsaservintermediario() {
        return usaservintermediario;
    }

    public void setUsaservintermediario(String usaservintermediario) {
        this.usaservintermediario = usaservintermediario;
    }

    public String getUsanumnotaecf() {
        return usanumnotaecf;
    }

    public void setUsanumnotaecf(String usanumnotaecf) {
        this.usanumnotaecf = usanumnotaecf;
    }

    public Long getProxnumnotaecf() {
        return proxnumnotaecf;
    }

    public void setProxnumnotaecf(Long proxnumnotaecf) {
        this.proxnumnotaecf = proxnumnotaecf;
    }

    public Long getProxnumtransvendaecf() {
        return proxnumtransvendaecf;
    }

    public void setProxnumtransvendaecf(Long proxnumtransvendaecf) {
        this.proxnumtransvendaecf = proxnumtransvendaecf;
    }

    public Long getProxnumcarecf() {
        return proxnumcarecf;
    }

    public void setProxnumcarecf(Long proxnumcarecf) {
        this.proxnumcarecf = proxnumcarecf;
    }

    public Long getProxnumtransecf() {
        return proxnumtransecf;
    }

    public void setProxnumtransecf(Long proxnumtransecf) {
        this.proxnumtransecf = proxnumtransecf;
    }

    public String getUsaprecoetiqprodpesado() {
        return usaprecoetiqprodpesado;
    }

    public void setUsaprecoetiqprodpesado(String usaprecoetiqprodpesado) {
        this.usaprecoetiqprodpesado = usaprecoetiqprodpesado;
    }

    public Integer getCoddocse() {
        return coddocse;
    }

    public void setCoddocse(Integer coddocse) {
        this.coddocse = coddocse;
    }

    public String getUtilizanfe() {
        return utilizanfe;
    }

    public void setUtilizanfe(String utilizanfe) {
        this.utilizanfe = utilizanfe;
    }

    public String getSerienfe() {
        return serienfe;
    }

    public void setSerienfe(String serienfe) {
        this.serienfe = serienfe;
    }

    public String getSerienfescan() {
        return serienfescan;
    }

    public void setSerienfescan(String serienfescan) {
        this.serienfescan = serienfescan;
    }

    public String getTipodanfe() {
        return tipodanfe;
    }

    public void setTipodanfe(String tipodanfe) {
        this.tipodanfe = tipodanfe;
    }

    public Long getProxnumnfe() {
        return proxnumnfe;
    }

    public void setProxnumnfe(Long proxnumnfe) {
        this.proxnumnfe = proxnumnfe;
    }

    public String getIncluifreteoutrasdespbasest() {
        return incluifreteoutrasdespbasest;
    }

    public void setIncluifreteoutrasdespbasest(String incluifreteoutrasdespbasest) {
        this.incluifreteoutrasdespbasest = incluifreteoutrasdespbasest;
    }

    public Long getCodcontapercacrescent() {
        return codcontapercacrescent;
    }

    public void setCodcontapercacrescent(Long codcontapercacrescent) {
        this.codcontapercacrescent = codcontapercacrescent;
    }

    public String getPrecificaautomatico() {
        return precificaautomatico;
    }

    public void setPrecificaautomatico(String precificaautomatico) {
        this.precificaautomatico = precificaautomatico;
    }

    public String getTipoprecificacao() {
        return tipoprecificacao;
    }

    public void setTipoprecificacao(String tipoprecificacao) {
        this.tipoprecificacao = tipoprecificacao;
    }

    public String getDestacarimpostosvendatv14() {
        return destacarimpostosvendatv14;
    }

    public void setDestacarimpostosvendatv14(String destacarimpostosvendatv14) {
        this.destacarimpostosvendatv14 = destacarimpostosvendatv14;
    }

    public String getPermiteagruparboletos() {
        return permiteagruparboletos;
    }

    public void setPermiteagruparboletos(String permiteagruparboletos) {
        this.permiteagruparboletos = permiteagruparboletos;
    }

    public String getBloqdevcli() {
        return bloqdevcli;
    }

    public void setBloqdevcli(String bloqdevcli) {
        this.bloqdevcli = bloqdevcli;
    }

    public String getUsapvendaatacconfqtmultipla() {
        return usapvendaatacconfqtmultipla;
    }

    public void setUsapvendaatacconfqtmultipla(String usapvendaatacconfqtmultipla) {
        this.usapvendaatacconfqtmultipla = usapvendaatacconfqtmultipla;
    }

    public LocalDate getDtutilizanfe() {
        return dtutilizanfe;
    }

    public void setDtutilizanfe(LocalDate dtutilizanfe) {
        this.dtutilizanfe = dtutilizanfe;
    }

    public String getGerarpedconsignacaovasilhame() {
        return gerarpedconsignacaovasilhame;
    }

    public void setGerarpedconsignacaovasilhame(String gerarpedconsignacaovasilhame) {
        this.gerarpedconsignacaovasilhame = gerarpedconsignacaovasilhame;
    }

    public Short getTipoavaliacaocomissao() {
        return tipoavaliacaocomissao;
    }

    public void setTipoavaliacaocomissao(Short tipoavaliacaocomissao) {
        this.tipoavaliacaocomissao = tipoavaliacaocomissao;
    }

    public String getConsiderarcomissaozero() {
        return considerarcomissaozero;
    }

    public void setConsiderarcomissaozero(String considerarcomissaozero) {
        this.considerarcomissaozero = considerarcomissaozero;
    }

    public String getLancarfretepesoautfat() {
        return lancarfretepesoautfat;
    }

    public void setLancarfretepesoautfat(String lancarfretepesoautfat) {
        this.lancarfretepesoautfat = lancarfretepesoautfat;
    }

    public String getBloqdesdemitentedif() {
        return bloqdesdemitentedif;
    }

    public void setBloqdesdemitentedif(String bloqdesdemitentedif) {
        this.bloqdesdemitentedif = bloqdesdemitentedif;
    }

    public String getSomaicmstransf() {
        return somaicmstransf;
    }

    public void setSomaicmstransf(String somaicmstransf) {
        this.somaicmstransf = somaicmstransf;
    }

    public Long getCodcontacredfornec() {
        return codcontacredfornec;
    }

    public void setCodcontacredfornec(Long codcontacredfornec) {
        this.codcontacredfornec = codcontacredfornec;
    }

    public String getGerapedidocomitenssemest() {
        return gerapedidocomitenssemest;
    }

    public void setGerapedidocomitenssemest(String gerapedidocomitenssemest) {
        this.gerapedidocomitenssemest = gerapedidocomitenssemest;
    }

    public String getConferirsomentepedacertadocx() {
        return conferirsomentepedacertadocx;
    }

    public void setConferirsomentepedacertadocx(String conferirsomentepedacertadocx) {
        this.conferirsomentepedacertadocx = conferirsomentepedacertadocx;
    }

    public String getMontarkitautomaticamente() {
        return montarkitautomaticamente;
    }

    public void setMontarkitautomaticamente(String montarkitautomaticamente) {
        this.montarkitautomaticamente = montarkitautomaticamente;
    }

    public String getAplicapercvarnaocontrib() {
        return aplicapercvarnaocontrib;
    }

    public void setAplicapercvarnaocontrib(String aplicapercvarnaocontrib) {
        this.aplicapercvarnaocontrib = aplicapercvarnaocontrib;
    }

    public String getAplicapercatacnaocontrib() {
        return aplicapercatacnaocontrib;
    }

    public void setAplicapercatacnaocontrib(String aplicapercatacnaocontrib) {
        this.aplicapercatacnaocontrib = aplicapercatacnaocontrib;
    }

    public String getUtilizaorigemvendanf() {
        return utilizaorigemvendanf;
    }

    public void setUtilizaorigemvendanf(String utilizaorigemvendanf) {
        this.utilizaorigemvendanf = utilizaorigemvendanf;
    }

    public String getOrigemvendanf() {
        return origemvendanf;
    }

    public void setOrigemvendanf(String origemvendanf) {
        this.origemvendanf = origemvendanf;
    }

    public Long getProxnumnotaorigvenda() {
        return proxnumnotaorigvenda;
    }

    public void setProxnumnotaorigvenda(Long proxnumnotaorigvenda) {
        this.proxnumnotaorigvenda = proxnumnotaorigvenda;
    }

    public Integer getCoddocorigemnf() {
        return coddocorigemnf;
    }

    public void setCoddocorigemnf(Integer coddocorigemnf) {
        this.coddocorigemnf = coddocorigemnf;
    }

    public String getClicrependente() {
        return clicrependente;
    }

    public void setClicrependente(String clicrependente) {
        this.clicrependente = clicrependente;
    }

    public String getPermitecancelarnfentwms() {
        return permitecancelarnfentwms;
    }

    public void setPermitecancelarnfentwms(String permitecancelarnfentwms) {
        this.permitecancelarnfentwms = permitecancelarnfentwms;
    }

    public String getArredvlitensnfsaida() {
        return arredvlitensnfsaida;
    }

    public void setArredvlitensnfsaida(String arredvlitensnfsaida) {
        this.arredvlitensnfsaida = arredvlitensnfsaida;
    }

    public String getAproveitaipiPiscofins() {
        return aproveitaipiPiscofins;
    }

    public void setAproveitaipiPiscofins(String aproveitaipiPiscofins) {
        this.aproveitaipiPiscofins = aproveitaipiPiscofins;
    }

    public String getAproveitafretePiscofins() {
        return aproveitafretePiscofins;
    }

    public void setAproveitafretePiscofins(String aproveitafretePiscofins) {
        this.aproveitafretePiscofins = aproveitafretePiscofins;
    }

    public String getAproveitadespPiscofins() {
        return aproveitadespPiscofins;
    }

    public void setAproveitadespPiscofins(String aproveitadespPiscofins) {
        this.aproveitadespPiscofins = aproveitadespPiscofins;
    }

    public Short getQtmultiplainicialecf() {
        return qtmultiplainicialecf;
    }

    public void setQtmultiplainicialecf(Short qtmultiplainicialecf) {
        this.qtmultiplainicialecf = qtmultiplainicialecf;
    }

    public String getTipomontagem() {
        return tipomontagem;
    }

    public void setTipomontagem(String tipomontagem) {
        this.tipomontagem = tipomontagem;
    }

    public String getCalcularipivenda() {
        return calcularipivenda;
    }

    public void setCalcularipivenda(String calcularipivenda) {
        this.calcularipivenda = calcularipivenda;
    }

    public String getUsaorcamentoecf() {
        return usaorcamentoecf;
    }

    public void setUsaorcamentoecf(String usaorcamentoecf) {
        this.usaorcamentoecf = usaorcamentoecf;
    }

    public String getValidarendapanhaautoservico() {
        return validarendapanhaautoservico;
    }

    public void setValidarendapanhaautoservico(String validarendapanhaautoservico) {
        this.validarendapanhaautoservico = validarendapanhaautoservico;
    }

    public String getUsadiautilfilial() {
        return usadiautilfilial;
    }

    public void setUsadiautilfilial(String usadiautilfilial) {
        this.usadiautilfilial = usadiautilfilial;
    }

    public String getReduziricmspropriotransf() {
        return reduziricmspropriotransf;
    }

    public void setReduziricmspropriotransf(String reduziricmspropriotransf) {
        this.reduziricmspropriotransf = reduziricmspropriotransf;
    }

    public String getNaogerarcreditoentradatransf() {
        return naogerarcreditoentradatransf;
    }

    public void setNaogerarcreditoentradatransf(String naogerarcreditoentradatransf) {
        this.naogerarcreditoentradatransf = naogerarcreditoentradatransf;
    }

    public String getImpedetipo14Livrofiscal() {
        return impedetipo14Livrofiscal;
    }

    public void setImpedetipo14Livrofiscal(String impedetipo14Livrofiscal) {
        this.impedetipo14Livrofiscal = impedetipo14Livrofiscal;
    }

    public String getCorteautomaticopedvendawms() {
        return corteautomaticopedvendawms;
    }

    public void setCorteautomaticopedvendawms(String corteautomaticopedvendawms) {
        this.corteautomaticopedvendawms = corteautomaticopedvendawms;
    }

    public Short getPrazomaximppedpendecf() {
        return prazomaximppedpendecf;
    }

    public void setPrazomaximppedpendecf(Short prazomaximppedpendecf) {
        this.prazomaximppedpendecf = prazomaximppedpendecf;
    }

    public String getUsaconsultacheque() {
        return usaconsultacheque;
    }

    public void setUsaconsultacheque(String usaconsultacheque) {
        this.usaconsultacheque = usaconsultacheque;
    }

    public String getTipoidentificacaoecf() {
        return tipoidentificacaoecf;
    }

    public void setTipoidentificacaoecf(String tipoidentificacaoecf) {
        this.tipoidentificacaoecf = tipoidentificacaoecf;
    }

    public String getConsideramontagemgiromerc() {
        return consideramontagemgiromerc;
    }

    public void setConsideramontagemgiromerc(String consideramontagemgiromerc) {
        this.consideramontagemgiromerc = consideramontagemgiromerc;
    }

    public String getMontacargawinthor() {
        return montacargawinthor;
    }

    public void setMontacargawinthor(String montacargawinthor) {
        this.montacargawinthor = montacargawinthor;
    }

    public String getDevfornecestoqueavaria() {
        return devfornecestoqueavaria;
    }

    public void setDevfornecestoqueavaria(String devfornecestoqueavaria) {
        this.devfornecestoqueavaria = devfornecestoqueavaria;
    }

    public String getAlterapedidoretornadowms() {
        return alterapedidoretornadowms;
    }

    public void setAlterapedidoretornadowms(String alterapedidoretornadowms) {
        this.alterapedidoretornadowms = alterapedidoretornadowms;
    }

    public String getCancelapedidoretornadowms() {
        return cancelapedidoretornadowms;
    }

    public void setCancelapedidoretornadowms(String cancelapedidoretornadowms) {
        this.cancelapedidoretornadowms = cancelapedidoretornadowms;
    }

    public String getCancelanfentradacomwms() {
        return cancelanfentradacomwms;
    }

    public void setCancelanfentradacomwms(String cancelanfentradacomwms) {
        this.cancelanfentradacomwms = cancelanfentradacomwms;
    }

    public String getCancelanfdevclicomwms() {
        return cancelanfdevclicomwms;
    }

    public void setCancelanfdevclicomwms(String cancelanfdevclicomwms) {
        this.cancelanfdevclicomwms = cancelanfdevclicomwms;
    }

    public String getCancelanfvendacomwms() {
        return cancelanfvendacomwms;
    }

    public void setCancelanfvendacomwms(String cancelanfvendacomwms) {
        this.cancelanfvendacomwms = cancelanfvendacomwms;
    }

    public Short getIntegradorawms() {
        return integradorawms;
    }

    public void setIntegradorawms(Short integradorawms) {
        this.integradorawms = integradorawms;
    }

    public String getUsuariobancodadoswms() {
        return usuariobancodadoswms;
    }

    public void setUsuariobancodadoswms(String usuariobancodadoswms) {
        this.usuariobancodadoswms = usuariobancodadoswms;
    }

    public String getSenhabancodadoswms() {
        return senhabancodadoswms;
    }

    public void setSenhabancodadoswms(String senhabancodadoswms) {
        this.senhabancodadoswms = senhabancodadoswms;
    }

    public String getNomebancodadoswms() {
        return nomebancodadoswms;
    }

    public void setNomebancodadoswms(String nomebancodadoswms) {
        this.nomebancodadoswms = nomebancodadoswms;
    }

    public String getGerarpchistest() {
        return gerarpchistest;
    }

    public void setGerarpchistest(String gerarpchistest) {
        this.gerarpchistest = gerarpchistest;
    }

    public BigDecimal getIndicecustotransf() {
        return indicecustotransf;
    }

    public void setIndicecustotransf(BigDecimal indicecustotransf) {
        this.indicecustotransf = indicecustotransf;
    }

    public String getBloqestoquetransf() {
        return bloqestoquetransf;
    }

    public void setBloqestoquetransf(String bloqestoquetransf) {
        this.bloqestoquetransf = bloqestoquetransf;
    }

    public String getAtualizacustoultentransf() {
        return atualizacustoultentransf;
    }

    public void setAtualizacustoultentransf(String atualizacustoultentransf) {
        this.atualizacustoultentransf = atualizacustoultentransf;
    }

    public String getPondcusnotatransf() {
        return pondcusnotatransf;
    }

    public void setPondcusnotatransf(String pondcusnotatransf) {
        this.pondcusnotatransf = pondcusnotatransf;
    }

    public Long getProxnumos() {
        return proxnumos;
    }

    public void setProxnumos(Long proxnumos) {
        this.proxnumos = proxnumos;
    }

    public String getExibirimpostosforanfimportacao() {
        return exibirimpostosforanfimportacao;
    }

    public void setExibirimpostosforanfimportacao(String exibirimpostosforanfimportacao) {
        this.exibirimpostosforanfimportacao = exibirimpostosforanfimportacao;
    }

    public String getCodfiscalopcionalnfimportacao() {
        return codfiscalopcionalnfimportacao;
    }

    public void setCodfiscalopcionalnfimportacao(String codfiscalopcionalnfimportacao) {
        this.codfiscalopcionalnfimportacao = codfiscalopcionalnfimportacao;
    }

    public String getSittributopcionalnfimportacao() {
        return sittributopcionalnfimportacao;
    }

    public void setSittributopcionalnfimportacao(String sittributopcionalnfimportacao) {
        this.sittributopcionalnfimportacao = sittributopcionalnfimportacao;
    }

    public BigDecimal getPesolimiteos() {
        return pesolimiteos;
    }

    public void setPesolimiteos(BigDecimal pesolimiteos) {
        this.pesolimiteos = pesolimiteos;
    }

    public Integer getQtdmaxitensos() {
        return qtdmaxitensos;
    }

    public void setQtdmaxitensos(Integer qtdmaxitensos) {
        this.qtdmaxitensos = qtdmaxitensos;
    }

    public BigDecimal getQtdminitensmoduloos() {
        return qtdminitensmoduloos;
    }

    public void setQtdminitensmoduloos(BigDecimal qtdminitensmoduloos) {
        this.qtdminitensmoduloos = qtdminitensmoduloos;
    }

    public Integer getTemposepprodos() {
        return temposepprodos;
    }

    public void setTemposepprodos(Integer temposepprodos) {
        this.temposepprodos = temposepprodos;
    }

    public Integer getTemposepcaixaos() {
        return temposepcaixaos;
    }

    public void setTemposepcaixaos(Integer temposepcaixaos) {
        this.temposepcaixaos = temposepcaixaos;
    }

    public Integer getTemposepinicialos() {
        return temposepinicialos;
    }

    public void setTemposepinicialos(Integer temposepinicialos) {
        this.temposepinicialos = temposepinicialos;
    }

    public String getDestacarimpostosvendatv13() {
        return destacarimpostosvendatv13;
    }

    public void setDestacarimpostosvendatv13(String destacarimpostosvendatv13) {
        this.destacarimpostosvendatv13 = destacarimpostosvendatv13;
    }

    public String getTipofreteauto() {
        return tipofreteauto;
    }

    public void setTipofreteauto(String tipofreteauto) {
        this.tipofreteauto = tipofreteauto;
    }

    public String getBloquearpedidosabaixovlminimo() {
        return bloquearpedidosabaixovlminimo;
    }

    public void setBloquearpedidosabaixovlminimo(String bloquearpedidosabaixovlminimo) {
        this.bloquearpedidosabaixovlminimo = bloquearpedidosabaixovlminimo;
    }

    public String getOrdemagrupdesd() {
        return ordemagrupdesd;
    }

    public void setOrdemagrupdesd(String ordemagrupdesd) {
        this.ordemagrupdesd = ordemagrupdesd;
    }

    public String getUsaintegracaowms() {
        return usaintegracaowms;
    }

    public void setUsaintegracaowms(String usaintegracaowms) {
        this.usaintegracaowms = usaintegracaowms;
    }

    public String getCalcestdispcomqtminautoserv() {
        return calcestdispcomqtminautoserv;
    }

    public void setCalcestdispcomqtminautoserv(String calcestdispcomqtminautoserv) {
        this.calcestdispcomqtminautoserv = calcestdispcomqtminautoserv;
    }

    public String getUsapoliticadescvalor() {
        return usapoliticadescvalor;
    }

    public void setUsapoliticadescvalor(String usapoliticadescvalor) {
        this.usapoliticadescvalor = usapoliticadescvalor;
    }

    public String getUtilizavendaassistida() {
        return utilizavendaassistida;
    }

    public void setUtilizavendaassistida(String utilizavendaassistida) {
        this.utilizavendaassistida = utilizavendaassistida;
    }

    public Long getCodcontavendaentregafut() {
        return codcontavendaentregafut;
    }

    public void setCodcontavendaentregafut(Long codcontavendaentregafut) {
        this.codcontavendaentregafut = codcontavendaentregafut;
    }

    public LocalDate getDtultatualizacaodrvinter() {
        return dtultatualizacaodrvinter;
    }

    public void setDtultatualizacaodrvinter(LocalDate dtultatualizacaodrvinter) {
        this.dtultatualizacaodrvinter = dtultatualizacaodrvinter;
    }

    public String getUsaintegracaooperlog() {
        return usaintegracaooperlog;
    }

    public void setUsaintegracaooperlog(String usaintegracaooperlog) {
        this.usaintegracaooperlog = usaintegracaooperlog;
    }

    public String getCgcOperadorlogistico() {
        return cgcOperadorlogistico;
    }

    public void setCgcOperadorlogistico(String cgcOperadorlogistico) {
        this.cgcOperadorlogistico = cgcOperadorlogistico;
    }

    public BigDecimal getPercicmssimplesnac() {
        return percicmssimplesnac;
    }

    public void setPercicmssimplesnac(BigDecimal percicmssimplesnac) {
        this.percicmssimplesnac = percicmssimplesnac;
    }

    public String getOptantesimplesnac() {
        return optantesimplesnac;
    }

    public void setOptantesimplesnac(String optantesimplesnac) {
        this.optantesimplesnac = optantesimplesnac;
    }

    public String getRecalcdvproduto() {
        return recalcdvproduto;
    }

    public void setRecalcdvproduto(String recalcdvproduto) {
        this.recalcdvproduto = recalcdvproduto;
    }

    public LocalDate getDtexclusao() {
        return dtexclusao;
    }

    public void setDtexclusao(LocalDate dtexclusao) {
        this.dtexclusao = dtexclusao;
    }

    public String getUsacodbarraembalagem() {
        return usacodbarraembalagem;
    }

    public void setUsacodbarraembalagem(String usacodbarraembalagem) {
        this.usacodbarraembalagem = usacodbarraembalagem;
    }

    public String getRegraarredondamentoecf() {
        return regraarredondamentoecf;
    }

    public void setRegraarredondamentoecf(String regraarredondamentoecf) {
        this.regraarredondamentoecf = regraarredondamentoecf;
    }

    public String getRetirardescnabaixa() {
        return retirardescnabaixa;
    }

    public void setRetirardescnabaixa(String retirardescnabaixa) {
        this.retirardescnabaixa = retirardescnabaixa;
    }

    public LocalDate getHrinicioexpediente() {
        return hrinicioexpediente;
    }

    public void setHrinicioexpediente(LocalDate hrinicioexpediente) {
        this.hrinicioexpediente = hrinicioexpediente;
    }

    public LocalDate getHrinicioalmoco() {
        return hrinicioalmoco;
    }

    public void setHrinicioalmoco(LocalDate hrinicioalmoco) {
        this.hrinicioalmoco = hrinicioalmoco;
    }

    public LocalDate getHrfimalmoco() {
        return hrfimalmoco;
    }

    public void setHrfimalmoco(LocalDate hrfimalmoco) {
        this.hrfimalmoco = hrfimalmoco;
    }

    public LocalDate getHrfimexpediente() {
        return hrfimexpediente;
    }

    public void setHrfimexpediente(LocalDate hrfimexpediente) {
        this.hrfimexpediente = hrfimexpediente;
    }

    public String getInformarprofissionalvenda() {
        return informarprofissionalvenda;
    }

    public void setInformarprofissionalvenda(String informarprofissionalvenda) {
        this.informarprofissionalvenda = informarprofissionalvenda;
    }

    public String getPermitirdesddifprof() {
        return permitirdesddifprof;
    }

    public void setPermitirdesddifprof(String permitirdesddifprof) {
        this.permitirdesddifprof = permitirdesddifprof;
    }

    public String getConcederdescisencaostpf() {
        return concederdescisencaostpf;
    }

    public void setConcederdescisencaostpf(String concederdescisencaostpf) {
        this.concederdescisencaostpf = concederdescisencaostpf;
    }

    public String getValidarprecovendatv8() {
        return validarprecovendatv8;
    }

    public void setValidarprecovendatv8(String validarprecovendatv8) {
        this.validarprecovendatv8 = validarprecovendatv8;
    }

    public Short getVersaowms() {
        return versaowms;
    }

    public void setVersaowms(Short versaowms) {
        this.versaowms = versaowms;
    }

    public String getValidarprecovendatv20() {
        return validarprecovendatv20;
    }

    public void setValidarprecovendatv20(String validarprecovendatv20) {
        this.validarprecovendatv20 = validarprecovendatv20;
    }

    public String getTipoexportacao() {
        return tipoexportacao;
    }

    public void setTipoexportacao(String tipoexportacao) {
        this.tipoexportacao = tipoexportacao;
    }

    public String getConsideraestpendsugcompra() {
        return consideraestpendsugcompra;
    }

    public void setConsideraestpendsugcompra(String consideraestpendsugcompra) {
        this.consideraestpendsugcompra = consideraestpendsugcompra;
    }

    public String getUsacontabil() {
        return usacontabil;
    }

    public void setUsacontabil(String usacontabil) {
        this.usacontabil = usacontabil;
    }

    public BigDecimal getPercomfilialbroker() {
        return percomfilialbroker;
    }

    public void setPercomfilialbroker(BigDecimal percomfilialbroker) {
        this.percomfilialbroker = percomfilialbroker;
    }

    public BigDecimal getPerfretebroker() {
        return perfretebroker;
    }

    public void setPerfretebroker(BigDecimal perfretebroker) {
        this.perfretebroker = perfretebroker;
    }

    public String getBloqvendapf() {
        return bloqvendapf;
    }

    public void setBloqvendapf(String bloqvendapf) {
        this.bloqvendapf = bloqvendapf;
    }

    public String getPermitefaturar() {
        return permitefaturar;
    }

    public void setPermitefaturar(String permitefaturar) {
        this.permitefaturar = permitefaturar;
    }

    public BigDecimal getPercomrcabroker() {
        return percomrcabroker;
    }

    public void setPercomrcabroker(BigDecimal percomrcabroker) {
        this.percomrcabroker = percomrcabroker;
    }

    public BigDecimal getPercommotbroker() {
        return percommotbroker;
    }

    public void setPercommotbroker(BigDecimal percommotbroker) {
        this.percommotbroker = percommotbroker;
    }

    public Short getDiavencicmsantecip() {
        return diavencicmsantecip;
    }

    public void setDiavencicmsantecip(Short diavencicmsantecip) {
        this.diavencicmsantecip = diavencicmsantecip;
    }

    public String getEstornacustodevfornec() {
        return estornacustodevfornec;
    }

    public void setEstornacustodevfornec(String estornacustodevfornec) {
        this.estornacustodevfornec = estornacustodevfornec;
    }

    public String getControlagarantiaservico() {
        return controlagarantiaservico;
    }

    public void setControlagarantiaservico(String controlagarantiaservico) {
        this.controlagarantiaservico = controlagarantiaservico;
    }

    public String getUsadadosembalagemnfe() {
        return usadadosembalagemnfe;
    }

    public void setUsadadosembalagemnfe(String usadadosembalagemnfe) {
        this.usadadosembalagemnfe = usadadosembalagemnfe;
    }

    public Short getNumdiasmaximoliberarpedido() {
        return numdiasmaximoliberarpedido;
    }

    public void setNumdiasmaximoliberarpedido(Short numdiasmaximoliberarpedido) {
        this.numdiasmaximoliberarpedido = numdiasmaximoliberarpedido;
    }

    public Short getNummaxdiasretrodtcompensacao() {
        return nummaxdiasretrodtcompensacao;
    }

    public void setNummaxdiasretrodtcompensacao(Short nummaxdiasretrodtcompensacao) {
        this.nummaxdiasretrodtcompensacao = nummaxdiasretrodtcompensacao;
    }

    public Short getNummaxitensnfe() {
        return nummaxitensnfe;
    }

    public void setNummaxitensnfe(Short nummaxitensnfe) {
        this.nummaxitensnfe = nummaxitensnfe;
    }

    public String getUsabrindeecf() {
        return usabrindeecf;
    }

    public void setUsabrindeecf(String usabrindeecf) {
        this.usabrindeecf = usabrindeecf;
    }

    public LocalDate getHorainicialdigitacaoped() {
        return horainicialdigitacaoped;
    }

    public void setHorainicialdigitacaoped(LocalDate horainicialdigitacaoped) {
        this.horainicialdigitacaoped = horainicialdigitacaoped;
    }

    public LocalDate getHorafinaldigitacaoped() {
        return horafinaldigitacaoped;
    }

    public void setHorafinaldigitacaoped(LocalDate horafinaldigitacaoped) {
        this.horafinaldigitacaoped = horafinaldigitacaoped;
    }

    public LocalDate getHorainicialimportacaoped() {
        return horainicialimportacaoped;
    }

    public void setHorainicialimportacaoped(LocalDate horainicialimportacaoped) {
        this.horainicialimportacaoped = horainicialimportacaoped;
    }

    public LocalDate getHorafinalimportacaoped() {
        return horafinalimportacaoped;
    }

    public void setHorafinalimportacaoped(LocalDate horafinalimportacaoped) {
        this.horafinalimportacaoped = horafinalimportacaoped;
    }

    public BigDecimal getPercmaxdifprodsimil() {
        return percmaxdifprodsimil;
    }

    public void setPercmaxdifprodsimil(BigDecimal percmaxdifprodsimil) {
        this.percmaxdifprodsimil = percmaxdifprodsimil;
    }

    public String getAlterarcobbkchautomatico() {
        return alterarcobbkchautomatico;
    }

    public void setAlterarcobbkchautomatico(String alterarcobbkchautomatico) {
        this.alterarcobbkchautomatico = alterarcobbkchautomatico;
    }

    public String getAceitavendaavistaclibloq() {
        return aceitavendaavistaclibloq;
    }

    public void setAceitavendaavistaclibloq(String aceitavendaavistaclibloq) {
        this.aceitavendaavistaclibloq = aceitavendaavistaclibloq;
    }

    public Long getCodcontarecarga() {
        return codcontarecarga;
    }

    public void setCodcontarecarga(Long codcontarecarga) {
        this.codcontarecarga = codcontarecarga;
    }

    public String getOrigemcustofilialretira() {
        return origemcustofilialretira;
    }

    public void setOrigemcustofilialretira(String origemcustofilialretira) {
        this.origemcustofilialretira = origemcustofilialretira;
    }

    public String getUtilizacontrolebiometrico() {
        return utilizacontrolebiometrico;
    }

    public void setUtilizacontrolebiometrico(String utilizacontrolebiometrico) {
        this.utilizacontrolebiometrico = utilizacontrolebiometrico;
    }

    public Short getNumregiaobalcaointer() {
        return numregiaobalcaointer;
    }

    public void setNumregiaobalcaointer(Short numregiaobalcaointer) {
        this.numregiaobalcaointer = numregiaobalcaointer;
    }

    public String getUsaregiaofilialvendaestadual() {
        return usaregiaofilialvendaestadual;
    }

    public void setUsaregiaofilialvendaestadual(String usaregiaofilialvendaestadual) {
        this.usaregiaofilialvendaestadual = usaregiaofilialvendaestadual;
    }

    public String getUsaregiaofilialvendainterest() {
        return usaregiaofilialvendainterest;
    }

    public void setUsaregiaofilialvendainterest(String usaregiaofilialvendainterest) {
        this.usaregiaofilialvendainterest = usaregiaofilialvendainterest;
    }

    public String getValidardescflexautoserv() {
        return validardescflexautoserv;
    }

    public void setValidardescflexautoserv(String validardescflexautoserv) {
        this.validardescflexautoserv = validardescflexautoserv;
    }

    public Integer getCoddocsrauto() {
        return coddocsrauto;
    }

    public void setCoddocsrauto(Integer coddocsrauto) {
        this.coddocsrauto = coddocsrauto;
    }

    public String getUsacodclivenda() {
        return usacodclivenda;
    }

    public void setUsacodclivenda(String usacodclivenda) {
        this.usacodclivenda = usacodclivenda;
    }

    public Long getProxnumnotacobranca() {
        return proxnumnotacobranca;
    }

    public void setProxnumnotacobranca(Long proxnumnotacobranca) {
        this.proxnumnotacobranca = proxnumnotacobranca;
    }

    public Integer getCoddocnotacobranca() {
        return coddocnotacobranca;
    }

    public void setCoddocnotacobranca(Integer coddocnotacobranca) {
        this.coddocnotacobranca = coddocnotacobranca;
    }

    public String getBloqueiariskscoring() {
        return bloqueiariskscoring;
    }

    public void setBloqueiariskscoring(String bloqueiariskscoring) {
        this.bloqueiariskscoring = bloqueiariskscoring;
    }

    public Integer getLimriskscoring() {
        return limriskscoring;
    }

    public void setLimriskscoring(Integer limriskscoring) {
        this.limriskscoring = limriskscoring;
    }

    public String getStsomentevlcont() {
        return stsomentevlcont;
    }

    public void setStsomentevlcont(String stsomentevlcont) {
        this.stsomentevlcont = stsomentevlcont;
    }

    public String getUsatransportadopadraonfe() {
        return usatransportadopadraonfe;
    }

    public void setUsatransportadopadraonfe(String usatransportadopadraonfe) {
        this.usatransportadopadraonfe = usatransportadopadraonfe;
    }

    public String getOsprodmanutobrig() {
        return osprodmanutobrig;
    }

    public void setOsprodmanutobrig(String osprodmanutobrig) {
        this.osprodmanutobrig = osprodmanutobrig;
    }

    public String getLibpedcomprasemdiverg() {
        return libpedcomprasemdiverg;
    }

    public void setLibpedcomprasemdiverg(String libpedcomprasemdiverg) {
        this.libpedcomprasemdiverg = libpedcomprasemdiverg;
    }

    public String getMensnfimunidadetrib() {
        return mensnfimunidadetrib;
    }

    public void setMensnfimunidadetrib(String mensnfimunidadetrib) {
        this.mensnfimunidadetrib = mensnfimunidadetrib;
    }

    public String getTransferevlstbasestnatransf() {
        return transferevlstbasestnatransf;
    }

    public void setTransferevlstbasestnatransf(String transferevlstbasestnatransf) {
        this.transferevlstbasestnatransf = transferevlstbasestnatransf;
    }

    public String getUsamultiplopordesconto() {
        return usamultiplopordesconto;
    }

    public void setUsamultiplopordesconto(String usamultiplopordesconto) {
        this.usamultiplopordesconto = usamultiplopordesconto;
    }

    public String getUsainventlocal() {
        return usainventlocal;
    }

    public void setUsainventlocal(String usainventlocal) {
        this.usainventlocal = usainventlocal;
    }

    public String getEnviacontaspagarnfe() {
        return enviacontaspagarnfe;
    }

    public void setEnviacontaspagarnfe(String enviacontaspagarnfe) {
        this.enviacontaspagarnfe = enviacontaspagarnfe;
    }

    public String getEnviacontasrecebernfe() {
        return enviacontasrecebernfe;
    }

    public void setEnviacontasrecebernfe(String enviacontasrecebernfe) {
        this.enviacontasrecebernfe = enviacontasrecebernfe;
    }

    public String getUtilizacredicmsestcustocont() {
        return utilizacredicmsestcustocont;
    }

    public void setUtilizacredicmsestcustocont(String utilizacredicmsestcustocont) {
        this.utilizacredicmsestcustocont = utilizacredicmsestcustocont;
    }

    public Short getQtdemaxdiasvencverbas() {
        return qtdemaxdiasvencverbas;
    }

    public void setQtdemaxdiasvencverbas(Short qtdemaxdiasvencverbas) {
        this.qtdemaxdiasvencverbas = qtdemaxdiasvencverbas;
    }

    public BigDecimal getPerbaseredoutrasdesppf() {
        return perbaseredoutrasdesppf;
    }

    public void setPerbaseredoutrasdesppf(BigDecimal perbaseredoutrasdesppf) {
        this.perbaseredoutrasdesppf = perbaseredoutrasdesppf;
    }

    public BigDecimal getPerlimvendapf() {
        return perlimvendapf;
    }

    public void setPerlimvendapf(BigDecimal perlimvendapf) {
        this.perlimvendapf = perlimvendapf;
    }

    public String getUsapvendatransf() {
        return usapvendatransf;
    }

    public void setUsapvendatransf(String usapvendatransf) {
        this.usapvendatransf = usapvendatransf;
    }

    public BigDecimal getPercacrescimobalcao() {
        return percacrescimobalcao;
    }

    public void setPercacrescimobalcao(BigDecimal percacrescimobalcao) {
        this.percacrescimobalcao = percacrescimobalcao;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public BigDecimal getVlpesodescarga() {
        return vlpesodescarga;
    }

    public void setVlpesodescarga(BigDecimal vlpesodescarga) {
        this.vlpesodescarga = vlpesodescarga;
    }

    public BigDecimal getVlvoldescarga() {
        return vlvoldescarga;
    }

    public void setVlvoldescarga(BigDecimal vlvoldescarga) {
        this.vlvoldescarga = vlvoldescarga;
    }

    public BigDecimal getVlpesodescargapal() {
        return vlpesodescargapal;
    }

    public void setVlpesodescargapal(BigDecimal vlpesodescargapal) {
        this.vlpesodescargapal = vlpesodescargapal;
    }

    public BigDecimal getVlvolumedescargafd() {
        return vlvolumedescargafd;
    }

    public void setVlvolumedescargafd(BigDecimal vlvolumedescargafd) {
        this.vlvolumedescargafd = vlvolumedescargafd;
    }

    public BigDecimal getVlremontedescarga() {
        return vlremontedescarga;
    }

    public void setVlremontedescarga(BigDecimal vlremontedescarga) {
        this.vlremontedescarga = vlremontedescarga;
    }

    public BigDecimal getVlpaletedescarg() {
        return vlpaletedescarg;
    }

    public void setVlpaletedescarg(BigDecimal vlpaletedescarg) {
        this.vlpaletedescarg = vlpaletedescarg;
    }

    public String getObrigaconsfinaldev() {
        return obrigaconsfinaldev;
    }

    public void setObrigaconsfinaldev(String obrigaconsfinaldev) {
        this.obrigaconsfinaldev = obrigaconsfinaldev;
    }

    public String getUtilizaseqnfent() {
        return utilizaseqnfent;
    }

    public void setUtilizaseqnfent(String utilizaseqnfent) {
        this.utilizaseqnfent = utilizaseqnfent;
    }

    public String getTipocnpj() {
        return tipocnpj;
    }

    public void setTipocnpj(String tipocnpj) {
        this.tipocnpj = tipocnpj;
    }

    public byte[] getLogomarca() {
        return logomarca;
    }

    public void setLogomarca(byte[] logomarca) {
        this.logomarca = logomarca;
    }

    public String getGravarvalordescfin() {
        return gravarvalordescfin;
    }

    public void setGravarvalordescfin(String gravarvalordescfin) {
        this.gravarvalordescfin = gravarvalordescfin;
    }

    public String getUsuarioserv() {
        return usuarioserv;
    }

    public void setUsuarioserv(String usuarioserv) {
        this.usuarioserv = usuarioserv;
    }

    public String getSenhaserv() {
        return senhaserv;
    }

    public void setSenhaserv(String senhaserv) {
        this.senhaserv = senhaserv;
    }

    public String getDominioserv() {
        return dominioserv;
    }

    public void setDominioserv(String dominioserv) {
        this.dominioserv = dominioserv;
    }

    public String getNomeremetente() {
        return nomeremetente;
    }

    public void setNomeremetente(String nomeremetente) {
        this.nomeremetente = nomeremetente;
    }

    public String getEmailremetente() {
        return emailremetente;
    }

    public void setEmailremetente(String emailremetente) {
        this.emailremetente = emailremetente;
    }

    public String getServidorsmtp() {
        return servidorsmtp;
    }

    public void setServidorsmtp(String servidorsmtp) {
        this.servidorsmtp = servidorsmtp;
    }

    public String getEmailresposta() {
        return emailresposta;
    }

    public void setEmailresposta(String emailresposta) {
        this.emailresposta = emailresposta;
    }

    public String getEmailcopiaresposta() {
        return emailcopiaresposta;
    }

    public void setEmailcopiaresposta(String emailcopiaresposta) {
        this.emailcopiaresposta = emailcopiaresposta;
    }

    public Integer getPortaserv() {
        return portaserv;
    }

    public void setPortaserv(Integer portaserv) {
        this.portaserv = portaserv;
    }

    public String getUsuarioproxy() {
        return usuarioproxy;
    }

    public void setUsuarioproxy(String usuarioproxy) {
        this.usuarioproxy = usuarioproxy;
    }

    public String getSenhaproxy() {
        return senhaproxy;
    }

    public void setSenhaproxy(String senhaproxy) {
        this.senhaproxy = senhaproxy;
    }

    public String getEnderecoproxy() {
        return enderecoproxy;
    }

    public void setEnderecoproxy(String enderecoproxy) {
        this.enderecoproxy = enderecoproxy;
    }

    public Integer getPortaproxy() {
        return portaproxy;
    }

    public void setPortaproxy(Integer portaproxy) {
        this.portaproxy = portaproxy;
    }

    public LocalDate getDtutilizacte() {
        return dtutilizacte;
    }

    public void setDtutilizacte(LocalDate dtutilizacte) {
        this.dtutilizacte = dtutilizacte;
    }

    public String getUtilizacte() {
        return utilizacte;
    }

    public void setUtilizacte(String utilizacte) {
        this.utilizacte = utilizacte;
    }

    public String getControlenfeporserie() {
        return controlenfeporserie;
    }

    public void setControlenfeporserie(String controlenfeporserie) {
        this.controlenfeporserie = controlenfeporserie;
    }

    public Integer getProxnumnfeentrada() {
        return proxnumnfeentrada;
    }

    public void setProxnumnfeentrada(Integer proxnumnfeentrada) {
        this.proxnumnfeentrada = proxnumnfeentrada;
    }

    public Integer getProxnumnfescan() {
        return proxnumnfescan;
    }

    public void setProxnumnfescan(Integer proxnumnfescan) {
        this.proxnumnfescan = proxnumnfescan;
    }

    public String getSerienfeentrada() {
        return serienfeentrada;
    }

    public void setSerienfeentrada(String serienfeentrada) {
        this.serienfeentrada = serienfeentrada;
    }

    public Integer getProxnumnfescanentrada() {
        return proxnumnfescanentrada;
    }

    public void setProxnumnfescanentrada(Integer proxnumnfescanentrada) {
        this.proxnumnfescanentrada = proxnumnfescanentrada;
    }

    public String getSerienfescanentrada() {
        return serienfescanentrada;
    }

    public void setSerienfescanentrada(String serienfescanentrada) {
        this.serienfescanentrada = serienfescanentrada;
    }

    public String getCnpjPaf() {
        return cnpjPaf;
    }

    public void setCnpjPaf(String cnpjPaf) {
        this.cnpjPaf = cnpjPaf;
    }

    public String getNomePaf() {
        return nomePaf;
    }

    public void setNomePaf(String nomePaf) {
        this.nomePaf = nomePaf;
    }

    public String getRotinalanc() {
        return rotinalanc;
    }

    public void setRotinalanc(String rotinalanc) {
        this.rotinalanc = rotinalanc;
    }

    public String getCodmd5Paf() {
        return codmd5Paf;
    }

    public void setCodmd5Paf(String codmd5Paf) {
        this.codmd5Paf = codmd5Paf;
    }

    public Long getProxnumnfs() {
        return proxnumnfs;
    }

    public void setProxnumnfs(Long proxnumnfs) {
        this.proxnumnfs = proxnumnfs;
    }

    public String getSerienfs() {
        return serienfs;
    }

    public void setSerienfs(String serienfs) {
        this.serienfs = serienfs;
    }

    public String getSerienferemmanisfestoscan() {
        return serienferemmanisfestoscan;
    }

    public void setSerienferemmanisfestoscan(String serienferemmanisfestoscan) {
        this.serienferemmanisfestoscan = serienferemmanisfestoscan;
    }

    public Integer getProxnumnferemmanisfestoscan() {
        return proxnumnferemmanisfestoscan;
    }

    public void setProxnumnferemmanisfestoscan(Integer proxnumnferemmanisfestoscan) {
        this.proxnumnferemmanisfestoscan = proxnumnferemmanisfestoscan;
    }

    public String getSerienfedevmanifestoscan() {
        return serienfedevmanifestoscan;
    }

    public void setSerienfedevmanifestoscan(String serienfedevmanifestoscan) {
        this.serienfedevmanifestoscan = serienfedevmanifestoscan;
    }

    public Integer getProxnumnfedevmanisfestoscan() {
        return proxnumnfedevmanisfestoscan;
    }

    public void setProxnumnfedevmanisfestoscan(Integer proxnumnfedevmanisfestoscan) {
        this.proxnumnfedevmanisfestoscan = proxnumnfedevmanisfestoscan;
    }

    public String getSerienferemmanisfesto() {
        return serienferemmanisfesto;
    }

    public void setSerienferemmanisfesto(String serienferemmanisfesto) {
        this.serienferemmanisfesto = serienferemmanisfesto;
    }

    public Integer getProxnumnferemmanisfesto() {
        return proxnumnferemmanisfesto;
    }

    public void setProxnumnferemmanisfesto(Integer proxnumnferemmanisfesto) {
        this.proxnumnferemmanisfesto = proxnumnferemmanisfesto;
    }

    public String getSerienfedevmanifesto() {
        return serienfedevmanifesto;
    }

    public void setSerienfedevmanifesto(String serienfedevmanifesto) {
        this.serienfedevmanifesto = serienfedevmanifesto;
    }

    public Integer getProxnumnfedevmanisfesto() {
        return proxnumnfedevmanisfesto;
    }

    public void setProxnumnfedevmanisfesto(Integer proxnumnfedevmanisfesto) {
        this.proxnumnfedevmanisfesto = proxnumnfedevmanisfesto;
    }

    public Long getProxnumcte() {
        return proxnumcte;
    }

    public void setProxnumcte(Long proxnumcte) {
        this.proxnumcte = proxnumcte;
    }

    public String getSeriecte() {
        return seriecte;
    }

    public void setSeriecte(String seriecte) {
        this.seriecte = seriecte;
    }

    public Integer getProxnumnfeimportacao() {
        return proxnumnfeimportacao;
    }

    public void setProxnumnfeimportacao(Integer proxnumnfeimportacao) {
        this.proxnumnfeimportacao = proxnumnfeimportacao;
    }

    public String getSerienfeimportacao() {
        return serienfeimportacao;
    }

    public void setSerienfeimportacao(String serienfeimportacao) {
        this.serienfeimportacao = serienfeimportacao;
    }

    public Integer getProxnumnfescanimportacao() {
        return proxnumnfescanimportacao;
    }

    public void setProxnumnfescanimportacao(Integer proxnumnfescanimportacao) {
        this.proxnumnfescanimportacao = proxnumnfescanimportacao;
    }

    public String getSerienfescanimportacao() {
        return serienfescanimportacao;
    }

    public void setSerienfescanimportacao(String serienfescanimportacao) {
        this.serienfescanimportacao = serienfescanimportacao;
    }

    public String getDepfechado() {
        return depfechado;
    }

    public void setDepfechado(String depfechado) {
        this.depfechado = depfechado;
    }

    public Long getCodgln() {
        return codgln;
    }

    public void setCodgln(Long codgln) {
        this.codgln = codgln;
    }

    public Integer getCodgrupoloja() {
        return codgrupoloja;
    }

    public void setCodgrupoloja(Integer codgrupoloja) {
        this.codgrupoloja = codgrupoloja;
    }

    public String getDatahoraPrimeirodocumentoEcf() {
        return datahoraPrimeirodocumentoEcf;
    }

    public void setDatahoraPrimeirodocumentoEcf(String datahoraPrimeirodocumentoEcf) {
        this.datahoraPrimeirodocumentoEcf = datahoraPrimeirodocumentoEcf;
    }

    public String getTipofilial() {
        return tipofilial;
    }

    public void setTipofilial(String tipofilial) {
        this.tipofilial = tipofilial;
    }

    public Integer getDiascurvatura() {
        return diascurvatura;
    }

    public void setDiascurvatura(Integer diascurvatura) {
        this.diascurvatura = diascurvatura;
    }

    public Integer getPercevolucaoabc() {
        return percevolucaoabc;
    }

    public void setPercevolucaoabc(Integer percevolucaoabc) {
        this.percevolucaoabc = percevolucaoabc;
    }

    public Integer getPercdeclinioabc() {
        return percdeclinioabc;
    }

    public void setPercdeclinioabc(Integer percdeclinioabc) {
        this.percdeclinioabc = percdeclinioabc;
    }

    public Integer getMixminimo() {
        return mixminimo;
    }

    public void setMixminimo(Integer mixminimo) {
        this.mixminimo = mixminimo;
    }

    public Integer getMixmaximo() {
        return mixmaximo;
    }

    public void setMixmaximo(Integer mixmaximo) {
        this.mixmaximo = mixmaximo;
    }

    public Integer getQtmaxpedido() {
        return qtmaxpedido;
    }

    public void setQtmaxpedido(Integer qtmaxpedido) {
        this.qtmaxpedido = qtmaxpedido;
    }

    public String getArredondaqtgirodia() {
        return arredondaqtgirodia;
    }

    public void setArredondaqtgirodia(String arredondaqtgirodia) {
        this.arredondaqtgirodia = arredondaqtgirodia;
    }

    public BigDecimal getPercparticipaclassea() {
        return percparticipaclassea;
    }

    public void setPercparticipaclassea(BigDecimal percparticipaclassea) {
        this.percparticipaclassea = percparticipaclassea;
    }

    public BigDecimal getPercparticipaclasseb() {
        return percparticipaclasseb;
    }

    public void setPercparticipaclasseb(BigDecimal percparticipaclasseb) {
        this.percparticipaclasseb = percparticipaclasseb;
    }

    public BigDecimal getPercparticipasubclassea1() {
        return percparticipasubclassea1;
    }

    public void setPercparticipasubclassea1(BigDecimal percparticipasubclassea1) {
        this.percparticipasubclassea1 = percparticipasubclassea1;
    }

    public BigDecimal getPercparticipasubclasseb1() {
        return percparticipasubclasseb1;
    }

    public void setPercparticipasubclasseb1(BigDecimal percparticipasubclasseb1) {
        this.percparticipasubclasseb1 = percparticipasubclasseb1;
    }

    public BigDecimal getPercparticipasubclassea2() {
        return percparticipasubclassea2;
    }

    public void setPercparticipasubclassea2(BigDecimal percparticipasubclassea2) {
        this.percparticipasubclassea2 = percparticipasubclassea2;
    }

    public BigDecimal getPercparticipasubclasseb2() {
        return percparticipasubclasseb2;
    }

    public void setPercparticipasubclasseb2(BigDecimal percparticipasubclasseb2) {
        this.percparticipasubclasseb2 = percparticipasubclasseb2;
    }

    public BigDecimal getPercparticipasubclassea3() {
        return percparticipasubclassea3;
    }

    public void setPercparticipasubclassea3(BigDecimal percparticipasubclassea3) {
        this.percparticipasubclassea3 = percparticipasubclassea3;
    }

    public BigDecimal getPercparticipasubclasseb3() {
        return percparticipasubclasseb3;
    }

    public void setPercparticipasubclasseb3(BigDecimal percparticipasubclasseb3) {
        this.percparticipasubclasseb3 = percparticipasubclasseb3;
    }

    public BigDecimal getPercparticipasubclassec1() {
        return percparticipasubclassec1;
    }

    public void setPercparticipasubclassec1(BigDecimal percparticipasubclassec1) {
        this.percparticipasubclassec1 = percparticipasubclassec1;
    }

    public BigDecimal getPercparticipasubclassec2() {
        return percparticipasubclassec2;
    }

    public void setPercparticipasubclassec2(BigDecimal percparticipasubclassec2) {
        this.percparticipasubclassec2 = percparticipasubclassec2;
    }

    public Short getDiasprazotransf() {
        return diasprazotransf;
    }

    public void setDiasprazotransf(Short diasprazotransf) {
        this.diasprazotransf = diasprazotransf;
    }

    public Integer getMatriculasngpc() {
        return matriculasngpc;
    }

    public void setMatriculasngpc(Integer matriculasngpc) {
        this.matriculasngpc = matriculasngpc;
    }

    public Integer getMatriculasngpcant() {
        return matriculasngpcant;
    }

    public void setMatriculasngpcant(Integer matriculasngpcant) {
        this.matriculasngpcant = matriculasngpcant;
    }

    public LocalDate getDtaltmatricsngpc() {
        return dtaltmatricsngpc;
    }

    public void setDtaltmatricsngpc(LocalDate dtaltmatricsngpc) {
        this.dtaltmatricsngpc = dtaltmatricsngpc;
    }

    public String getDirexpxmlsngpc() {
        return direxpxmlsngpc;
    }

    public void setDirexpxmlsngpc(String direxpxmlsngpc) {
        this.direxpxmlsngpc = direxpxmlsngpc;
    }

    public Long getNsu() {
        return nsu;
    }

    public void setNsu(Long nsu) {
        this.nsu = nsu;
    }

    public LocalDate getDtultconsultamanif() {
        return dtultconsultamanif;
    }

    public void setDtultconsultamanif(LocalDate dtultconsultamanif) {
        this.dtultconsultamanif = dtultconsultamanif;
    }

    public Long getProxnummdfe() {
        return proxnummdfe;
    }

    public void setProxnummdfe(Long proxnummdfe) {
        this.proxnummdfe = proxnummdfe;
    }

    public String getSeriemdfe() {
        return seriemdfe;
    }

    public void setSeriemdfe(String seriemdfe) {
        this.seriemdfe = seriemdfe;
    }

    public String getControlenfeporrota() {
        return controlenfeporrota;
    }

    public void setControlenfeporrota(String controlenfeporrota) {
        this.controlenfeporrota = controlenfeporrota;
    }

    public BigDecimal getPercmindifprodsimil() {
        return percmindifprodsimil;
    }

    public void setPercmindifprodsimil(BigDecimal percmindifprodsimil) {
        this.percmindifprodsimil = percmindifprodsimil;
    }

    public String getEmpresagrandeporte() {
        return empresagrandeporte;
    }

    public void setEmpresagrandeporte(String empresagrandeporte) {
        this.empresagrandeporte = empresagrandeporte;
    }

    public String getEnderecocomp() {
        return enderecocomp;
    }

    public void setEnderecocomp(String enderecocomp) {
        this.enderecocomp = enderecocomp;
    }

    public String getFiid() {
        return fiid;
    }

    public void setFiid(String fiid) {
        this.fiid = fiid;
    }

    public Short getCodnaturezajuridica() {
        return codnaturezajuridica;
    }

    public void setCodnaturezajuridica(Short codnaturezajuridica) {
        this.codnaturezajuridica = codnaturezajuridica;
    }

    public Integer getCodcnaefiscal() {
        return codcnaefiscal;
    }

    public void setCodcnaefiscal(Integer codcnaefiscal) {
        this.codcnaefiscal = codcnaefiscal;
    }

    public String getComplementoendereco() {
        return complementoendereco;
    }

    public void setComplementoendereco(String complementoendereco) {
        this.complementoendereco = complementoendereco;
    }

    public String getUtilizakitaberto() {
        return utilizakitaberto;
    }

    public void setUtilizakitaberto(String utilizakitaberto) {
        this.utilizakitaberto = utilizakitaberto;
    }

    public String getFilialcontratanteserasa() {
        return filialcontratanteserasa;
    }

    public void setFilialcontratanteserasa(String filialcontratanteserasa) {
        this.filialcontratanteserasa = filialcontratanteserasa;
    }

    public String getCgcautorizaxml() {
        return cgcautorizaxml;
    }

    public void setCgcautorizaxml(String cgcautorizaxml) {
        this.cgcautorizaxml = cgcautorizaxml;
    }

    public String getControlenfeporseriedepofechado() {
        return controlenfeporseriedepofechado;
    }

    public void setControlenfeporseriedepofechado(String controlenfeporseriedepofechado) {
        this.controlenfeporseriedepofechado = controlenfeporseriedepofechado;
    }

    public Long getProxnumnotaremdep() {
        return proxnumnotaremdep;
    }

    public void setProxnumnotaremdep(Long proxnumnotaremdep) {
        this.proxnumnotaremdep = proxnumnotaremdep;
    }

    public String getSerieremdep() {
        return serieremdep;
    }

    public void setSerieremdep(String serieremdep) {
        this.serieremdep = serieremdep;
    }

    public String getUsarfwinthor() {
        return usarfwinthor;
    }

    public void setUsarfwinthor(String usarfwinthor) {
        this.usarfwinthor = usarfwinthor;
    }

    public LocalDate getDtviradarf() {
        return dtviradarf;
    }

    public void setDtviradarf(LocalDate dtviradarf) {
        this.dtviradarf = dtviradarf;
    }

    public String getSequenciacrc() {
        return sequenciacrc;
    }

    public void setSequenciacrc(String sequenciacrc) {
        this.sequenciacrc = sequenciacrc;
    }

    public LocalDate getDtvalidadedhpc() {
        return dtvalidadedhpc;
    }

    public void setDtvalidadedhpc(LocalDate dtvalidadedhpc) {
        this.dtvalidadedhpc = dtvalidadedhpc;
    }

    public Long getProxnumrps() {
        return proxnumrps;
    }

    public void setProxnumrps(Long proxnumrps) {
        this.proxnumrps = proxnumrps;
    }

    public String getSerierps() {
        return serierps;
    }

    public void setSerierps(String serierps) {
        this.serierps = serierps;
    }

    public String getCodigotss() {
        return codigotss;
    }

    public void setCodigotss(String codigotss) {
        this.codigotss = codigotss;
    }

    public String getUtilizatss() {
        return utilizatss;
    }

    public void setUtilizatss(String utilizatss) {
        this.utilizatss = utilizatss;
    }

    public String getInfoambienteintegradotss() {
        return infoambienteintegradotss;
    }

    public void setInfoambienteintegradotss(String infoambienteintegradotss) {
        this.infoambienteintegradotss = infoambienteintegradotss;
    }

    public String getInfocertificadointegradotss() {
        return infocertificadointegradotss;
    }

    public void setInfocertificadointegradotss(String infocertificadointegradotss) {
        this.infocertificadointegradotss = infocertificadointegradotss;
    }

    public String getSenhacertificado() {
        return senhacertificado;
    }

    public void setSenhacertificado(String senhacertificado) {
        this.senhacertificado = senhacertificado;
    }



    public String getLojarealizareposicao() {
        return lojarealizareposicao;
    }

    public void setLojarealizareposicao(String lojarealizareposicao) {
        this.lojarealizareposicao = lojarealizareposicao;
    }


    public String getCodfilialentrada() {
        return codfilialentrada;
    }

    public void setCodfilialentrada(String codfilialentrada) {
        this.codfilialentrada = codfilialentrada;
    }

    public String getCodfilialentcusto() {
        return codfilialentcusto;
    }

    public void setCodfilialentcusto(String codfilialentcusto) {
        this.codfilialentcusto = codfilialentcusto;
    }

    public String getIdtokencertificadoa1() {
        return idtokencertificadoa1;
    }

    public void setIdtokencertificadoa1(String idtokencertificadoa1) {
        this.idtokencertificadoa1 = idtokencertificadoa1;
    }

    public String getTokencertificadoa1() {
        return tokencertificadoa1;
    }

    public void setTokencertificadoa1(String tokencertificadoa1) {
        this.tokencertificadoa1 = tokencertificadoa1;
    }

    public byte[] getCertificadoa1() {
        return certificadoa1;
    }

    public void setCertificadoa1(byte[] certificadoa1) {
        this.certificadoa1 = certificadoa1;
    }

    public String getVersaolayoutnfce() {
        return versaolayoutnfce;
    }

    public void setVersaolayoutnfce(String versaolayoutnfce) {
        this.versaolayoutnfce = versaolayoutnfce;
    }

    public String getUtilizarecalculostcheckout() {
        return utilizarecalculostcheckout;
    }

    public void setUtilizarecalculostcheckout(String utilizarecalculostcheckout) {
        this.utilizarecalculostcheckout = utilizarecalculostcheckout;
    }

    public String getCodigonacionalobras() {
        return codigonacionalobras;
    }

    public void setCodigonacionalobras(String codigonacionalobras) {
        this.codigonacionalobras = codigonacionalobras;
    }

    public String getVersaoqrcode() {
        return versaoqrcode;
    }

    public void setVersaoqrcode(String versaoqrcode) {
        this.versaoqrcode = versaoqrcode;
    }

    public Long getCodfilialciashop() {
        return codfilialciashop;
    }

    public void setCodfilialciashop(Long codfilialciashop) {
        this.codfilialciashop = codfilialciashop;
    }

    public String getCodfilialretirareploja() {
        return codfilialretirareploja;
    }

    public void setCodfilialretirareploja(String codfilialretirareploja) {
        this.codfilialretirareploja = codfilialretirareploja;
    }

    public Long getProxcoddeposito() {
        return proxcoddeposito;
    }

    public void setProxcoddeposito(Long proxcoddeposito) {
        this.proxcoddeposito = proxcoddeposito;
    }

    public String getContratanteserasa() {
        return contratanteserasa;
    }

    public void setContratanteserasa(String contratanteserasa) {
        this.contratanteserasa = contratanteserasa;
    }

    public String getCodigorntrc() {
        return codigorntrc;
    }

    public void setCodigorntrc(String codigorntrc) {
        this.codigorntrc = codigorntrc;
    }

    public Long getProxnumnotaajuste() {
        return proxnumnotaajuste;
    }

    public void setProxnumnotaajuste(Long proxnumnotaajuste) {
        this.proxnumnotaajuste = proxnumnotaajuste;
    }

    public String getSerienfeajuste() {
        return serienfeajuste;
    }

    public void setSerienfeajuste(String serienfeajuste) {
        this.serienfeajuste = serienfeajuste;
    }

    public String getUtilizaconcentradorpdv() {
        return utilizaconcentradorpdv;
    }

    public void setUtilizaconcentradorpdv(String utilizaconcentradorpdv) {
        this.utilizaconcentradorpdv = utilizaconcentradorpdv;
    }

    public String getUtilizapaymenthub() {
        return utilizapaymenthub;
    }

    public void setUtilizapaymenthub(String utilizapaymenthub) {
        this.utilizapaymenthub = utilizapaymenthub;
    }

    public String getHubusername() {
        return hubusername;
    }

    public void setHubusername(String hubusername) {
        this.hubusername = hubusername;
    }

    public String getHubpassword() {
        return hubpassword;
    }

    public void setHubpassword(String hubpassword) {
        this.hubpassword = hubpassword;
    }

    public String getHubclientid() {
        return hubclientid;
    }

    public void setHubclientid(String hubclientid) {
        this.hubclientid = hubclientid;
    }

    public String getHubclientsecret() {
        return hubclientsecret;
    }

    public void setHubclientsecret(String hubclientsecret) {
        this.hubclientsecret = hubclientsecret;
    }

    public String getHubapi() {
        return hubapi;
    }

    public void setHubapi(String hubapi) {
        this.hubapi = hubapi;
    }

    public String getHubtoken() {
        return hubtoken;
    }

    public void setHubtoken(String hubtoken) {
        this.hubtoken = hubtoken;
    }

    public Short getHubnumcaixapadrao() {
        return hubnumcaixapadrao;
    }

    public void setHubnumcaixapadrao(Short hubnumcaixapadrao) {
        this.hubnumcaixapadrao = hubnumcaixapadrao;
    }

    public Long getMaxnsusefaz() {
        return maxnsusefaz;
    }

    public void setMaxnsusefaz(Long maxnsusefaz) {
        this.maxnsusefaz = maxnsusefaz;
    }

    public String getStatusultconsultansusefaz() {
        return statusultconsultansusefaz;
    }

    public void setStatusultconsultansusefaz(String statusultconsultansusefaz) {
        this.statusultconsultansusefaz = statusultconsultansusefaz;
    }

    public String getEstoquehash() {
        return estoquehash;
    }

    public void setEstoquehash(String estoquehash) {
        this.estoquehash = estoquehash;
    }

    public LocalDate getDtiniciolicencapdv() {
        return dtiniciolicencapdv;
    }

    public void setDtiniciolicencapdv(LocalDate dtiniciolicencapdv) {
        this.dtiniciolicencapdv = dtiniciolicencapdv;
    }

    public String getIrregularidadecadsefaz() {
        return irregularidadecadsefaz;
    }

    public void setIrregularidadecadsefaz(String irregularidadecadsefaz) {
        this.irregularidadecadsefaz = irregularidadecadsefaz;
    }

    public LocalDate getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(LocalDate dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public LocalDate getDtultalter() {
        return dtultalter;
    }

    public void setDtultalter(LocalDate dtultalter) {
        this.dtultalter = dtultalter;
    }

    public Short getCodfilialintegracao() {
        return codfilialintegracao;
    }

    public void setCodfilialintegracao(Short codfilialintegracao) {
        this.codfilialintegracao = codfilialintegracao;
    }

    public String getContratoserasa() {
        return contratoserasa;
    }

    public void setContratoserasa(String contratoserasa) {
        this.contratoserasa = contratoserasa;
    }

    public Instant getDtalterc5() {
        return dtalterc5;
    }

    public void setDtalterc5(Instant dtalterc5) {
        this.dtalterc5 = dtalterc5;
    }

    public String getRazaosocialresptec() {
        return razaosocialresptec;
    }

    public void setRazaosocialresptec(String razaosocialresptec) {
        this.razaosocialresptec = razaosocialresptec;
    }

    public String getCnpjresptec() {
        return cnpjresptec;
    }

    public void setCnpjresptec(String cnpjresptec) {
        this.cnpjresptec = cnpjresptec;
    }

    public String getTelefoneresptec() {
        return telefoneresptec;
    }

    public void setTelefoneresptec(String telefoneresptec) {
        this.telefoneresptec = telefoneresptec;
    }

    public String getEmailresptec() {
        return emailresptec;
    }

    public void setEmailresptec(String emailresptec) {
        this.emailresptec = emailresptec;
    }

}