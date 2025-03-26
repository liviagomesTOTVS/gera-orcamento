package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PCCONSUM")
public class Pcconsum {
    @Column(name = "TX", precision = 8, scale = 6)
    private BigDecimal tx;

    @Column(name = "DTPROXATU")
    private LocalDate dtproxatu;

    @Column(name = "CODCONTFOR")
    private Long codcontfor;

    @Column(name = "HISTFOR", length = 40)
    private String histfor;

    @Column(name = "CODCONTFRE")
    private Long codcontfre;

    @Column(name = "HISTFRE", length = 40)
    private String histfre;

    @Column(name = "CODCONTOUT")
    private Long codcontout;

    @Column(name = "HISTOUT", length = 40)
    private String histout;

    @Column(name = "CODCONTCLI")
    private Long codcontcli;

    @Column(name = "SUGVENDA")
    private Short sugvenda;

    @Column(name = "TXVENDA", precision = 8, scale = 6)
    private BigDecimal txvenda;

    @Column(name = "NUMDIASATU")
    private Short numdiasatu;

    @Column(name = "PROXNUMTROCA")
    private Integer proxnumtroca;

    @Column(name = "PROXNUMPED")
    private Integer proxnumped;

    @Column(name = "PROXNUMORC")
    private Long proxnumorc;

    @Column(name = "CGC", length = 20)
    private String cgc;

    @Column(name = "IE", length = 20)
    private String ie;

    @Column(name = "ENDERECO", length = 40)
    private String endereco;

    @Column(name = "TELEFONE", length = 13)
    private String telefone;

    @Column(name = "FAX", length = 13)
    private String fax;

    @Column(name = "CIDADE", length = 15)
    private String cidade;

    @Column(name = "ESTADO", length = 2)
    private String estado;

    @Column(name = "CEP", length = 9)
    private String cep;

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

    @Column(name = "PROXNUMCAR")
    private Integer proxnumcar;

    @Column(name = "PROXNUMCLI")
    private Integer proxnumcli;

    @Column(name = "VLDIFERENCA", precision = 10, scale = 2)
    private BigDecimal vldiferenca;

    @Column(name = "PROXNUMBONUS")
    private Long proxnumbonus;

    @Column(name = "TAXA35", precision = 8, scale = 4)
    private BigDecimal taxa35;

    @Column(name = "PROXNUMVALE")
    private Integer proxnumvale;

    @Column(name = "PERCJUROSMORA", precision = 8, scale = 4)
    private BigDecimal percjurosmora;

    @Column(name = "PROXNUMPEDTLMK")
    private Integer proxnumpedtlmk;

    @Column(name = "PROXNUMBORDERO")
    private Long proxnumbordero;

    @Column(name = "PROXNUMTRANS")
    private Long proxnumtrans;

    @Column(name = "PROXNUMLANC")
    private Integer proxnumlanc;

    @Column(name = "PROXNUMVERBA")
    private Integer proxnumverba;

    @Column(name = "PROXNUMTRANSVENDA")
    private Long proxnumtransvenda;

    @Column(name = "EMPRESA", length = 40)
    private String empresa;

    @Column(name = "IPTABPRECO", length = 15)
    private String iptabpreco;

    @Column(name = "VALOR_FRETE_PADRAO", precision = 10, scale = 2)
    private BigDecimal valorFretePadrao;

    @Column(name = "ACEITADESCTMK", length = 1)
    private String aceitadesctmk;

    @Column(name = "DIRWINTHOR", length = 40)
    private String dirwinthor;

    @Column(name = "DIRWINTHORREMOTO", length = 40)
    private String dirwinthorremoto;

    @Column(name = "PROXNUMTRANSENT")
    private Long proxnumtransent;

    @Column(name = "PROXNUMNEG")
    private Long proxnumneg;

    @Column(name = "TAXA42", precision = 8, scale = 4)
    private BigDecimal taxa42;

    @Column(name = "CODCONTANTPAG")
    private Long codcontantpag;

    @Column(name = "CODCONTRECJUR")
    private Long codcontrecjur;

    @Column(name = "CODCONTPAGJUR")
    private Long codcontpagjur;

    @Column(name = "CODCONTAJUSTEEST")
    private Long codcontajusteest;

    @Column(name = "DTVENCTT")
    private LocalDate dtvenctt;

    @Column(name = "DTVENCTK")
    private LocalDate dtvenctk;

    @Column(name = "NUMORDABAS")
    private Long numordabas;

    @Column(name = "PERCAPANHA", precision = 6, scale = 2)
    private BigDecimal percapanha;

    @Column(name = "VOLUMETRANSF", precision = 6, scale = 2)
    private BigDecimal volumetransf;

    @Column(name = "PESOTRANSF", precision = 6, scale = 2)
    private BigDecimal pesotransf;

    @Column(name = "ENTREGA_FUTURA", length = 1)
    private String entregaFutura;

    @Column(name = "USADVPRODUTO", length = 1)
    private String usadvproduto;

    @Column(name = "MARGEMMIN", precision = 4, scale = 2)
    private BigDecimal margemmin;

    @Column(name = "CALCJUROSDESD", length = 1)
    private String calcjurosdesd;

    @Column(name = "LEITURACH", length = 1)
    private String leiturach;

    @Column(name = "CODSETORMOTORISTA")
    private Integer codsetormotorista;

    @Column(name = "CODSETORCOMPRADOR")
    private Integer codsetorcomprador;

    @Column(name = "LIMCREDINICIAL", precision = 15, scale = 2)
    private BigDecimal limcredinicial;

    @Column(name = "USUARIOLOGON", length = 10)
    private String usuariologon;

    @Column(name = "SENHALOGON", length = 32)
    private String senhalogon;

    @Column(name = "CODCONTEMPREST")
    private Long codcontemprest;

    @Column(name = "CODSETOREXPED")
    private Integer codsetorexped;

    @Column(name = "CODCONTALP")
    private Long codcontalp;

    @Column(name = "MARGEMPREV", precision = 6, scale = 2)
    private BigDecimal margemprev;

    @Column(name = "VLMINTARIFABANC", precision = 18, scale = 6)
    private BigDecimal vlmintarifabanc;

    @Column(name = "VLTARIFA", precision = 8, scale = 2)
    private BigDecimal vltarifa;

    @Column(name = "CODCLICONSUMIDOR")
    private Long codcliconsumidor;

    @Column(name = "NUMAUTOMATICFOR", length = 1)
    private String numautomaticfor;

    @Column(name = "NUMAUTOMATICPROD", length = 1)
    private String numautomaticprod;

    @Column(name = "PROXNUMFORNEC")
    private Integer proxnumfornec;

    @Column(name = "PROXNUMPRODUT")
    private Integer proxnumprodut;

    @Column(name = "PRAZOENTREGA")
    private Short prazoentrega;

    @Column(name = "TEMREPOS")
    private Short temrepos;

    @Column(name = "CGCCLIEXCLUSIVO", length = 1)
    private String cgccliexclusivo;

    @Column(name = "NUMDIASBLOQAUTOMATIC")
    private Short numdiasbloqautomatic;

    @Column(name = "NUMDIASMINDESPPAG")
    private Short numdiasmindesppag;

    @Column(name = "IMPCARTACOBJUROS", length = 1)
    private String impcartacobjuros;

    @Column(name = "RATEIODESCBAIXACR", length = 1)
    private String rateiodescbaixacr;

    @Column(name = "PERMITIRDESDDEVCLI", length = 1)
    private String permitirdesddevcli;

    @Column(name = "PROXNUMTRANSVENDOR")
    private Integer proxnumtransvendor;

    @Column(name = "TXVENDORCLI", precision = 32, scale = 18)
    private BigDecimal txvendorcli;

    @Column(name = "CALCCREDICMS", length = 1)
    private String calccredicms;

    @Column(name = "PERBASEVEND", precision = 6, scale = 2)
    private BigDecimal perbasevend;

    @Column(name = "IMPQTBONUS", length = 1)
    private String impqtbonus;

    @Column(name = "NUMDIASCLIINATIV")
    private Short numdiascliinativ;

    @Column(name = "INDESPELHO", length = 1)
    private String indespelho;

    @Column(name = "NUMCASASDECCUSTO")
    private Short numcasasdeccusto;

    @Column(name = "CODCONTAREQMP")
    private Long codcontareqmp;

    @Column(name = "COLUNAFLUXOCXCR1", length = 8)
    private String colunafluxocxcr1;

    @Column(name = "COLUNAFLUXOCXCR2", length = 8)
    private String colunafluxocxcr2;

    @Column(name = "COLUNAFLUXOCXCR3", length = 8)
    private String colunafluxocxcr3;

    @Column(name = "COLUNAFLUXOCXCR4", length = 8)
    private String colunafluxocxcr4;

    @Column(name = "COLUNAFLUXOCXCR5", length = 8)
    private String colunafluxocxcr5;

    @Column(name = "CODCONTDEVCLI")
    private Long codcontdevcli;

    @Column(name = "CODCONTDEBV")
    private Long codcontdebv;

    @Column(name = "AVISAFALTAEST", length = 1)
    private String avisafaltaest;

    @Column(name = "PERMITIRDIVNFDUPLIC", length = 1)
    private String permitirdivnfduplic;

    @Column(name = "DTPROXFECHAMES")
    private LocalDate dtproxfechames;

    @Column(name = "DTVENCANTDESD", length = 1)
    private String dtvencantdesd;

    @Column(name = "INCDUPJUROSDESD", length = 1)
    private String incdupjurosdesd;

    @Column(name = "PEDVENDADEPTO", length = 1)
    private String pedvendadepto;

    @Column(name = "DESCVENDA", length = 1)
    private String descvenda;

    @Column(name = "ACEITAVENDASEMEST", length = 1)
    private String aceitavendasemest;

    @Column(name = "CODCONTDESCCONC")
    private Long codcontdescconc;

    @Column(name = "BLOQVENDATP1TPF", length = 1)
    private String bloqvendatp1tpf;

    @Column(name = "NUMAUTOMATICCLI", length = 1)
    private String numautomaticcli;

    @Column(name = "CODCONTICMSANTECIP")
    private Long codconticmsantecip;

    @Column(name = "ACEITAVENDAALTUSUR", length = 1)
    private String aceitavendaaltusur;

    @Column(name = "TIPOEMBALAGEM", length = 1)
    private String tipoembalagem;

    @Column(name = "EMITEPEDIDOVENDA", length = 2)
    private String emitepedidovenda;

    @Column(name = "SOMAICMSANTECIPDUPLIC", length = 1)
    private String somaicmsantecipduplic;

    @Column(name = "ACEITAVENDABLOQ", length = 1)
    private String aceitavendabloq;

    @Column(name = "NUMCASASDECESTOQUE")
    private Short numcasasdecestoque;

    @Column(name = "UTILIZAORCVENDA", length = 1)
    private String utilizaorcvenda;

    @Column(name = "PROXNUMTRANSCRFOR")
    private Integer proxnumtranscrfor;

    @Column(name = "PROXNUMAPLIC")
    private Integer proxnumaplic;

    @Column(name = "NUMVIASMAPASEP")
    private Short numviasmapasep;

    @Column(name = "CODCONTAREBAIXACUSTO")
    private Long codcontarebaixacusto;

    @Column(name = "NUMCASASDECVENDA")
    private Short numcasasdecvenda;

    @Column(name = "NUMDIASUTEISSEMANA")
    private Short numdiasuteissemana;

    @Column(name = "TIPOCALCGIRODIA", length = 1)
    private String tipocalcgirodia;

    @Column(name = "NUMDIASUTEISTRIMESTRE")
    private Short numdiasuteistrimestre;

    @Column(name = "PERCMAXDESCCR", precision = 5, scale = 2)
    private BigDecimal percmaxdesccr;

    @Column(name = "TIPOCUSTOTRANSF", length = 1)
    private String tipocustotransf;

    @Column(name = "INDICECUSTOTRANSF", precision = 8, scale = 4)
    private BigDecimal indicecustotransf;

    @Column(name = "TAXATABPR", length = 1)
    private String taxatabpr;

    @Column(name = "VLPESODESCARGA", precision = 10, scale = 2)
    private BigDecimal vlpesodescarga;

    @Column(name = "VLVOLDESCARGA", precision = 10, scale = 2)
    private BigDecimal vlvoldescarga;

    @Column(name = "CODCONTARECDESCARGA")
    private Long codcontarecdescarga;

    @Column(name = "PROXNUMCUSTODIA")
    private Integer proxnumcustodia;

    @Column(name = "VLMAXTARIFABANC", precision = 18, scale = 6)
    private BigDecimal vlmaxtarifabanc;

    @Column(name = "DTPROCESSAMENTO")
    private LocalDate dtprocessamento;

    @Column(name = "PROXNUMCONHEC")
    private Integer proxnumconhec;

    @Column(name = "MONTANDO", length = 1)
    private String montando;

    @Column(name = "USANUMCARVENDABALCAO", length = 1)
    private String usanumcarvendabalcao;

    @Column(name = "SOMATARIFABANCDUPLIC", length = 1)
    private String somatarifabancduplic;

    @Column(name = "CODCONTARESTCLI")
    private Long codcontarestcli;

    @Column(name = "USACREDRCA", length = 1)
    private String usacredrca;

    @Column(name = "BLOQPRAZOMDVENDA", length = 1)
    private String bloqprazomdvenda;

    @Column(name = "SOMATARIFABANCNF", length = 1)
    private String somatarifabancnf;

    @Column(name = "VLMINVENDA", precision = 12, scale = 2)
    private BigDecimal vlminvenda;

    @Column(name = "NUMDIASBLOQCHP")
    private Short numdiasbloqchp;

    @Column(name = "PERMAXVENDA", precision = 18, scale = 6)
    private BigDecimal permaxvenda;

    @Column(name = "PERMITEDESCCR", length = 1)
    private String permitedesccr;

    @Column(name = "CODCONTADESCCR")
    private Long codcontadesccr;

    @Column(name = "PERMAXDESCVENDA", precision = 5, scale = 2)
    private BigDecimal permaxdescvenda;

    @Column(name = "PERCMAXLIBESTOQUE", precision = 12, scale = 4)
    private BigDecimal percmaxlibestoque;

    @Column(name = "SALTARPAGINARUA", length = 1)
    private String saltarpaginarua;

    @Column(name = "UTILIZAEMBMASTER", length = 1)
    private String utilizaembmaster;

    @Column(name = "ORDEMMAPA")
    private Short ordemmapa;

    @Column(name = "FORMMAPA")
    private Short formmapa;

    @Column(name = "TIPORELMAPA", length = 1)
    private String tiporelmapa;

    @Column(name = "PERMITEALTCODCOBVENDA", length = 1)
    private String permitealtcodcobvenda;

    @Column(name = "PROXNUMINVENTROT")
    private Integer proxnuminventrot;

    @Column(name = "PROXNUMMANIF")
    private Integer proxnummanif;

    @Column(name = "QTMAXUNIDADEPF")
    private Short qtmaxunidadepf;

    @Column(name = "VLBLOQCHD3", precision = 12, scale = 2)
    private BigDecimal vlbloqchd3;

    @Column(name = "CODSETORCALLCENTER")
    private Integer codsetorcallcenter;

    @Column(name = "CODCOBINICIAL", length = 4)
    private String codcobinicial;

    @Column(name = "EMITINDOMAPA", length = 1)
    private String emitindomapa;

    @Column(name = "VLPESODESCARGAPAL", precision = 10, scale = 2)
    private BigDecimal vlpesodescargapal;

    @Column(name = "VLVOLUMEDESCARGAFD", precision = 10, scale = 2)
    private BigDecimal vlvolumedescargafd;

    @Column(name = "CODSETORDIRETORIA", precision = 4, scale = 2)
    private BigDecimal codsetordiretoria;

    @Column(name = "NUMDIASMAXDESD1210")
    private Short numdiasmaxdesd1210;

    @Column(name = "NUMDIASMAXDESD402")
    private Short numdiasmaxdesd402;

    @Column(name = "VLMINVENDABK", precision = 12, scale = 2)
    private BigDecimal vlminvendabk;

    @Column(name = "TXIOF", precision = 12, scale = 4)
    private BigDecimal txiof;

    @Column(name = "CODFILIALCX", length = 2)
    private String codfilialcx;

    @Column(name = "PERMITECOMPRAFORNECBLOQ", length = 1)
    private String permitecomprafornecbloq;

    @Column(name = "USACOMISSAOPORCLIENTE", length = 1)
    private String usacomissaoporcliente;

    @Column(name = "USACOMISSAOPORRCA", length = 1)
    private String usacomissaoporrca;

    @Column(name = "USANUMNFDEVCLI", length = 1)
    private String usanumnfdevcli;

    @Column(name = "USACRECLIVENDABALCAO", length = 1)
    private String usacreclivendabalcao;

    @Column(name = "GERARCRECLIDEVCLI", length = 1)
    private String gerarcreclidevcli;

    @Column(name = "ZERALIMCREDBLOQAUTOMATIC", length = 1)
    private String zeralimcredbloqautomatic;

    @Column(name = "MUDACOBCLIENTE", length = 1)
    private String mudacobcliente;

    @Column(name = "PERDESCMEDIOVENDA", precision = 5, scale = 2)
    private BigDecimal perdescmediovenda;

    @Column(name = "CODHISTADICOMIS")
    private Short codhistadicomis;

    @Column(name = "CODHISTFECHCOMIS")
    private Short codhistfechcomis;

    @Column(name = "CODHISTFECHCOMISNEG")
    private Short codhistfechcomisneg;

    @Column(name = "LIMCREDINICIALPF", precision = 15, scale = 2)
    private BigDecimal limcredinicialpf;

    @Column(name = "REBAIXACUSTOULTENT", length = 1)
    private String rebaixacustoultent;

    @Column(name = "USADESCPORQUANT", length = 1)
    private String usadescporquant;

    @Column(name = "NUMREGIAOPADRAO")
    private Short numregiaopadrao;

    @Column(name = "PERDESCMAXBALCAO", precision = 5, scale = 2)
    private BigDecimal perdescmaxbalcao;

    @Column(name = "CODCONTAADIANTFOR")
    private Long codcontaadiantfor;

    @Column(name = "PERMAXPCOMPRA", precision = 5, scale = 2)
    private BigDecimal permaxpcompra;

    @Column(name = "NUMDIASMAXCANCNFSAIDA")
    private Short numdiasmaxcancnfsaida;

    @Column(name = "NUMDIASMAXCANCNFENT")
    private Short numdiasmaxcancnfent;

    @Column(name = "CODSETOROPERCX")
    private Integer codsetoropercx;

    @Column(name = "CODSETORFISCALCX")
    private Integer codsetorfiscalcx;

    @Column(name = "CAMINHODIR", length = 30)
    private String caminhodir;

    @Column(name = "CONSOLIDANDO", length = 1)
    private String consolidando;

    @Column(name = "PERLIMVENDAPF", precision = 8, scale = 4)
    private BigDecimal perlimvendapf;

    @Column(name = "PERVENDAPF", precision = 8, scale = 4)
    private BigDecimal pervendapf;

    @Column(name = "EXIBIRPVENDA", length = 1)
    private String exibirpvenda;

    @Column(name = "USAICMSANTECIPPVENDA", length = 1)
    private String usaicmsantecippvenda;

    @Column(name = "CODCONTACOMISSAO")
    private Long codcontacomissao;

    @Column(name = "USAESTOQUEDEPFECHADO", length = 1)
    private String usaestoquedepfechado;

    @Column(name = "PRAZOVALIDADEPEDBALCAO")
    private Short prazovalidadepedbalcao;

    @Column(name = "VALIDAPRECOMINIMO", length = 1)
    private String validaprecominimo;

    @Column(name = "NUMDIASALTDTENTREGA")
    private Short numdiasaltdtentrega;

    @Column(name = "GERACONTASPAGARDEVCLI", length = 1)
    private String geracontaspagardevcli;

    @Column(name = "BLOQPEDLIMCRED", length = 1)
    private String bloqpedlimcred;

    @Column(name = "PROXNUMRCA")
    private Integer proxnumrca;

    @Column(name = "CODCONTAGUIAST")
    private Long codcontaguiast;

    @Column(name = "PROXNUMINDENIZ")
    private Long proxnumindeniz;

    @Column(name = "LIBERARPEDIDOPENDENTE", length = 1)
    private String liberarpedidopendente;

    @Column(name = "VERIFICALIMCREDCODCOBD", length = 1)
    private String verificalimcredcodcobd;

    @Column(name = "ABATEFRETEVENDABALCAO", length = 1)
    private String abatefretevendabalcao;

    @Column(name = "VLMAXVENDATLMKCODCOBD", precision = 12, scale = 2)
    private BigDecimal vlmaxvendatlmkcodcobd;

    @Column(name = "PERMAXDIFENTRADA", precision = 5, scale = 2)
    private BigDecimal permaxdifentrada;

    @Column(name = "PERMINDIFENTRADA", precision = 5, scale = 2)
    private BigDecimal permindifentrada;

    @Column(name = "VLMAXVENDA", precision = 16, scale = 3)
    private BigDecimal vlmaxvenda;

    @Column(name = "IMPRESSAOAUTOMATICA", length = 1)
    private String impressaoautomatica;

    @Column(name = "CONDVENDA1", length = 1)
    private String condvenda1;

    @Column(name = "CONDVENDA2", length = 1)
    private String condvenda2;

    @Column(name = "CONDVENDA3", length = 1)
    private String condvenda3;

    @Column(name = "CONDVENDA4", length = 1)
    private String condvenda4;

    @Column(name = "CONDVENDA5", length = 1)
    private String condvenda5;

    @Column(name = "CONDVENDA6", length = 1)
    private String condvenda6;

    @Column(name = "REBAIXACUSTOCOMDESCFIN", length = 1)
    private String rebaixacustocomdescfin;

    @Column(name = "USAVALORMEDIOENTRADA", length = 1)
    private String usavalormedioentrada;

    @Column(name = "PROXNUMSIMULACAOPCP")
    private Long proxnumsimulacaopcp;

    @Column(name = "PROXNUMTIRA")
    private Integer proxnumtira;

    @Column(name = "PROXNUMOP")
    private Integer proxnumop;

    @Column(name = "CODCONTACOMISSAO3")
    private Long codcontacomissao3;

    @Column(name = "PERDESCPROM", precision = 5, scale = 2)
    private BigDecimal perdescprom;

    @Column(name = "NDIASEXPIRASENHA")
    private Short ndiasexpirasenha;

    @Column(name = "MENSAGEM1NF", length = 80)
    private String mensagem1nf;

    @Column(name = "MENSAGEM2NF", length = 80)
    private String mensagem2nf;

    @Column(name = "PROXNUMPCP")
    private Long proxnumpcp;

    @Column(name = "PROXNUMOPI")
    private Long proxnumopi;

    @Column(name = "PERCMINJUROSMORA", precision = 8, scale = 4)
    private BigDecimal percminjurosmora;

    @Column(name = "PERCMAXJUROSMORA", precision = 8, scale = 4)
    private BigDecimal percmaxjurosmora;

    @Column(name = "IMPORTANDOPEDIDOS", length = 1)
    private String importandopedidos;

    @Column(name = "SOMADESCCLIDESCPROD", length = 1)
    private String somadescclidescprod;

    @Column(name = "PRAZOADICIONALMAX")
    private Integer prazoadicionalmax;

    @Column(name = "EXPORTANDODADOS", length = 1)
    private String exportandodados;

    @Column(name = "USACATEGORIA", length = 1)
    private String usacategoria;

    @Column(name = "PROXNUMTRANSOP")
    private Long proxnumtransop;

    @Column(name = "PERMITEINICIAROPSEMMP", length = 1)
    private String permiteiniciaropsemmp;

    @Column(name = "PROXNUMRPA")
    private Integer proxnumrpa;

    @Column(name = "VLMAXVENDAPF", precision = 16, scale = 3)
    private BigDecimal vlmaxvendapf;

    @Column(name = "PROXNUMCONTRATO")
    private Integer proxnumcontrato;

    @Column(name = "BAIXAMPNAENTPA", length = 1)
    private String baixampnaentpa;

    @Column(name = "MUDACOBCLIENTEDIAS")
    private Short mudacobclientedias;

    @Column(name = "ACEITABKTV3", length = 1)
    private String aceitabktv3;

    @Column(name = "ALTERARCONTAAJUSTEEST", length = 1)
    private String alterarcontaajusteest;

    @Column(name = "AREADEAPANHA", length = 1)
    private String areadeapanha;

    @Column(name = "CONDVENDA7", length = 1)
    private String condvenda7;

    @Column(name = "CONDVENDA8", length = 1)
    private String condvenda8;

    @Column(name = "CONDVENDA9", length = 1)
    private String condvenda9;

    @Column(name = "CONDVENDA10", length = 1)
    private String condvenda10;

    @Column(name = "CONDVENDA11", length = 1)
    private String condvenda11;

    @Column(name = "CONDVENDA12", length = 1)
    private String condvenda12;

    @Column(name = "CONDVENDA13", length = 1)
    private String condvenda13;

    @Column(name = "CONDVENDA14", length = 1)
    private String condvenda14;

    @Column(name = "CALCSTPF", length = 1)
    private String calcstpf;

    @Column(name = "UTILIZAPERCBASEREDPF", length = 1)
    private String utilizapercbaseredpf;

    @Column(name = "CODCONTAPRODUCAO")
    private Long codcontaproducao;

    @Column(name = "CODCONTAQUALIDADE")
    private Long codcontaqualidade;

    @Column(name = "NUMVIASFICHACP")
    private Short numviasfichacp;

    @Column(name = "PERCTOLERANCIAINTEIRO", precision = 6, scale = 3)
    private BigDecimal perctoleranciainteiro;

    @Column(name = "PERCTOLERANCIAQUEBRADO", precision = 6, scale = 3)
    private BigDecimal perctoleranciaquebrado;

    @Column(name = "PERCTOLERANCIAIMPUREZA", precision = 6, scale = 3)
    private BigDecimal perctoleranciaimpureza;

    @Column(name = "PERCTOLERANCIAVERMELHO", precision = 6, scale = 3)
    private BigDecimal perctoleranciavermelho;

    @Column(name = "PERCTOLERANCIAUMIDADE", precision = 6, scale = 3)
    private BigDecimal perctoleranciaumidade;

    @Column(name = "CONSIDERACMVDEVOLUCAO", length = 1)
    private String consideracmvdevolucao;

    @Column(name = "TIPOCUSTOAJUSTE", length = 1)
    private String tipocustoajuste;

    @Column(name = "CODCONTAMANUTCUSTO")
    private Long codcontamanutcusto;

    @Column(name = "PRAZOMINVALIDADE", precision = 5, scale = 2)
    private BigDecimal prazominvalidade;

    @Column(name = "PRAZOMAXVALIDADE", precision = 5, scale = 2)
    private BigDecimal prazomaxvalidade;

    @Column(name = "VALIDADVCODBARRA", length = 1)
    private String validadvcodbarra;

    @Column(name = "DESDOBRARCADIFERENTE", length = 1)
    private String desdobrarcadiferente;

    @Column(name = "CALCCREDPISCOFINS", length = 1)
    private String calccredpiscofins;

    @Column(name = "TIPOCALCST", length = 2)
    private String tipocalcst;

    @Column(name = "TIPOBAIXACOBMAG")
    private Short tipobaixacobmag;

    @Column(name = "NUMDIASMAXFATURA")
    private Short numdiasmaxfatura;

    @Column(name = "NUMCUSTODIAAUTOMATIC", length = 1)
    private String numcustodiaautomatic;

    @Column(name = "DIRIMPORTACAOFV", length = 100)
    private String dirimportacaofv;

    @Column(name = "DIREXPORTACAOFV", length = 100)
    private String direxportacaofv;

    @Column(name = "PRECOPOREMBALAGEM", length = 1)
    private String precoporembalagem;

    @Column(name = "UTILIZAAUTORCPAGAR", length = 1)
    private String utilizaautorcpagar;

    @Column(name = "USAPRZADICIONALVENDA", length = 1)
    private String usaprzadicionalvenda;

    @Column(name = "PROXNUMLOTE")
    private Integer proxnumlote;

    @Column(name = "PROXNUMLOTEMP")
    private Integer proxnumlotemp;

    @Column(name = "PROXNUMLOTEEM")
    private Integer proxnumloteem;

    @Column(name = "ACRESCIMOPFCOMIE", length = 1)
    private String acrescimopfcomie;

    @Column(name = "PERMITEPEDCOMPRAUNIDMASTER", length = 1)
    private String permitepedcompraunidmaster;

    @Column(name = "PERMITEALTPLPAGVENDA", length = 1)
    private String permitealtplpagvenda;

    @Column(name = "VALIDAPVENDABONIFIC", length = 1)
    private String validapvendabonific;

    @Column(name = "PERMITEALTDTVENCENTMERC", length = 1)
    private String permitealtdtvencentmerc;

    @Column(name = "CALCULACUSTOENTPA", length = 1)
    private String calculacustoentpa;

    @Column(name = "NUMCASASDECINVENTARIO")
    private Short numcasasdecinventario;

    @Column(name = "CODPLPAGINICIAL")
    private Short codplpaginicial;

    @Column(name = "CODCONTAPERDAESTOQUE")
    private Long codcontaperdaestoque;

    @Column(name = "BONIFICALTDEBCREDRCA", length = 1)
    private String bonificaltdebcredrca;

    @Column(name = "USANFCOMPLEMENTARBK", length = 1)
    private String usanfcomplementarbk;

    @Column(name = "CODFILIALFV", length = 2)
    private String codfilialfv;

    @Column(name = "PERMITEPEDCOMPRAMULTIPLO", length = 1)
    private String permitepedcompramultiplo;

    @Column(name = "CONDVENDA20", length = 1)
    private String condvenda20;

    @Column(name = "VLPALETEDESCARG", precision = 10, scale = 2)
    private BigDecimal vlpaletedescarg;

    @Column(name = "ALTERARFILIALENTPA", length = 1)
    private String alterarfilialentpa;

    @Column(name = "BLOQUEARENTPA", length = 1)
    private String bloquearentpa;

    @Column(name = "PROXNUMORDEMTRANSF")
    private Integer proxnumordemtransf;

    @Column(name = "BLOQUEIO", length = 1)
    private String bloqueio;

    @Column(name = "PERMITEDEVOLREQNORMAL", length = 1)
    private String permitedevolreqnormal;

    @Column(name = "BLOQESTOQUETRANSF", length = 1)
    private String bloqestoquetransf;

    @Column(name = "USATRIBUTACAOPORUF", length = 1)
    private String usatributacaoporuf;

    @Column(name = "GERANFTIPO8", length = 1)
    private String geranftipo8;

    @Column(name = "PEREXCEDELIMCRED", precision = 6, scale = 2)
    private BigDecimal perexcedelimcred;

    @Column(name = "GERARNUMLOTEAUTOMATICPA", length = 1)
    private String gerarnumloteautomaticpa;

    @Column(name = "IMPRIMIRESPELHOENTMERC", length = 1)
    private String imprimirespelhoentmerc;

    @Column(name = "DIRARQUIVOINTEGRACAO", length = 80)
    private String dirarquivointegracao;

    @Column(name = "CODSETOREMBALADOR")
    private Integer codsetorembalador;

    @Column(name = "CODFISCALOUTRASDESP")
    private Short codfiscaloutrasdesp;

    @Column(name = "CODFISCALINTEROUTRASDESP")
    private Short codfiscalinteroutrasdesp;

    @Column(name = "ALIQICMOUTRASDESP", precision = 4, scale = 2)
    private BigDecimal aliqicmoutrasdesp;

    @Column(name = "ALIQICMINTEROUTRASDESP", precision = 4, scale = 2)
    private BigDecimal aliqicminteroutrasdesp;

    @Column(name = "USACOMISSAOPORLINHAPROD", length = 1)
    private String usacomissaoporlinhaprod;

    @Column(name = "USADESCPORLINHAPROD", length = 1)
    private String usadescporlinhaprod;

    @Column(name = "SOMAQTPEDVENDA", length = 1)
    private String somaqtpedvenda;

    @Column(name = "USAWMS", length = 1)
    private String usawms;

    @Column(name = "USAMAPSEPRUA", length = 1)
    private String usamapseprua;

    @Column(name = "USAOUTRASMOEDAS", length = 1)
    private String usaoutrasmoedas;

    @Column(name = "SOMENTECODBARRASCONFPED", length = 1)
    private String somentecodbarrasconfped;

    @Column(name = "SOMENTECODBARRASBONUS", length = 1)
    private String somentecodbarrasbonus;

    @Column(name = "TIPOGERACAODADOSPCAUXPRO", length = 1)
    private String tipogeracaodadospcauxpro;

    @Column(name = "CONTROLAEDICAOPEDIDOCOMPRA", length = 1)
    private String controlaedicaopedidocompra;

    @Column(name = "PRAZOEDICAOPEDIDOCOMPRA")
    private Short prazoedicaopedidocompra;

    @Column(name = "PROXNUMPESQUISA")
    private Long proxnumpesquisa;

    @Column(name = "ATUALIZACONDCOMPEDCOMPRA", length = 1)
    private String atualizacondcompedcompra;

    @Column(name = "PROXNUMTRANSWMS")
    private Long proxnumtranswms;

    @Column(name = "ACEITAVENDABALCAOESTNEG", length = 1)
    private String aceitavendabalcaoestneg;

    @Column(name = "UTILIZAGUIAPROPRIANFENT", length = 1)
    private String utilizaguiaproprianfent;

    @Column(name = "BLOQF6PEDVENDABALCAO", length = 1)
    private String bloqf6pedvendabalcao;

    @Column(name = "UTILIZAPERCFINPRECOPROM", length = 1)
    private String utilizapercfinprecoprom;

    @Column(name = "PERGUNTARSOMAQTPEDVENDA", length = 1)
    private String perguntarsomaqtpedvenda;

    @Column(name = "PROXCODPRACA")
    private Short proxcodpraca;

    @Column(name = "CODPRACAAUTOMATIC", length = 1)
    private String codpracaautomatic;

    @Column(name = "PROXCODUSUR")
    private Short proxcodusur;

    @Column(name = "CODUSURAUTOMATIC", length = 1)
    private String codusurautomatic;

    @Column(name = "CODSETORDIRETORIO")
    private Integer codsetordiretorio;

    @Column(name = "PROXNUMLOTECUSTODIA")
    private Integer proxnumlotecustodia;

    @Column(name = "INFNUMVERBAPEDBONIFIC", length = 1)
    private String infnumverbapedbonific;

    @Column(name = "QTDEMINIMAUSOASTERISCO936")
    private Integer qtdeminimausoasterisco936;

    @Column(name = "UTILIZACONTROLELOTE", length = 1)
    private String utilizacontrolelote;

    @Column(name = "PERMITEPLPAGTOSUPERIOR", length = 1)
    private String permiteplpagtosuperior;

    @Column(name = "PERMITEVARIOSPEDIDOSORCAMENTO", length = 1)
    private String permitevariospedidosorcamento;

    @Column(name = "UTILIZAPCUSURFORNEC", length = 1)
    private String utilizapcusurfornec;

    @Column(name = "TIPOCALCIPI", length = 2)
    private String tipocalcipi;

    @Column(name = "USACONTROLEEMISSAONF", length = 1)
    private String usacontroleemissaonf;

    @Column(name = "NUMDIASMAXEMISSAONF")
    private Short numdiasmaxemissaonf;

    @Column(name = "CHECKOUTMAPAEMITIDO", length = 1)
    private String checkoutmapaemitido;

    @Column(name = "PERMAXRODAPE", precision = 5, scale = 2)
    private BigDecimal permaxrodape;

    @Column(name = "TEMPOMAXCANCEL", length = 5)
    private String tempomaxcancel;

    @Column(name = "VALORSANGRIA1", precision = 12, scale = 2)
    private BigDecimal valorsangria1;

    @Column(name = "VALORSANGRIA2", precision = 12, scale = 2)
    private BigDecimal valorsangria2;

    @Column(name = "DEFINIRLOTEOP", length = 1)
    private String definirloteop;

    @Column(name = "DVOBRIGATORIO", length = 1)
    private String dvobrigatorio;

    @Column(name = "LIBERAESTFECHBONUS", length = 1)
    private String liberaestfechbonus;

    @Column(name = "CUSTOINDUSTRIA", length = 2)
    private String custoindustria;

    @Column(name = "PROXNUMTRANSAVULSA")
    private Long proxnumtransavulsa;

    @Column(name = "TIPONUMNFENTRADA", length = 1)
    private String tiponumnfentrada;

    @Column(name = "BLOQDESPVLRORC", length = 1)
    private String bloqdespvlrorc;

    @Column(name = "ATUALIZACUSTOULTENTRANSF", length = 1)
    private String atualizacustoultentransf;

    @Column(name = "VERIFICARCLIENTESREDE", length = 1)
    private String verificarclientesrede;

    @Column(name = "USARDESCONTOVENDACODBARRA", length = 1)
    private String usardescontovendacodbarra;

    @Column(name = "VLMAXPEDIDOPF", precision = 18, scale = 2)
    private BigDecimal vlmaxpedidopf;

    @Column(name = "UTILIZAFILIALREGIAOCX", length = 1)
    private String utilizafilialregiaocx;

    @Column(name = "RESTRINGENUMITENSNF", length = 1)
    private String restringenumitensnf;

    @Column(name = "VERIFICARLIMVENDAPF", length = 1)
    private String verificarlimvendapf;

    @Column(name = "ACEITAVENDAPF", length = 1)
    private String aceitavendapf;

    @Column(name = "VERIFICAESTOQUECONT", length = 1)
    private String verificaestoquecont;

    @Column(name = "MOSTRARPVENDASEMST", length = 1)
    private String mostrarpvendasemst;

    @Column(name = "TIPOENDERECAMENTO", length = 1)
    private String tipoenderecamento;

    @Column(name = "INICIAROPSEMEM", length = 1)
    private String iniciaropsemem;

    @Column(name = "CODCONTADESPESAPRODUCAO")
    private Long codcontadespesaproducao;

    @Column(name = "CODCONTADESENVOLVIMENTO")
    private Long codcontadesenvolvimento;

    @Column(name = "CODCONTAAMOSTRAS")
    private Long codcontaamostras;

    @Column(name = "NUMDIASMAXEMISSAOCP")
    private Short numdiasmaxemissaocp;

    @Column(name = "TIPOMAPAWMSVENDABALCAO", length = 1)
    private String tipomapawmsvendabalcao;

    @Column(name = "INSERIRREDUCAOZ", length = 1)
    private String inserirreducaoz;

    @Column(name = "NUMDIASALTERALIVRO")
    private Short numdiasalteralivro;

    @Column(name = "LIMPAROBSNFDEVOL", length = 1)
    private String limparobsnfdevol;

    @Column(name = "REDUCAOBCISENTA", length = 1)
    private String reducaobcisenta;

    @Column(name = "LIMITEARREDONDAMENTO", precision = 6, scale = 2)
    private BigDecimal limitearredondamento;

    @Column(name = "SIGLAESPECIE", length = 3)
    private String siglaespecie;

    @Column(name = "SIGLASERIE", length = 3)
    private String siglaserie;

    @Column(name = "CODCONTABILCF", length = 10)
    private String codcontabilcf;

    @Column(name = "INSERIRMAPA", length = 1)
    private String inserirmapa;

    @Column(name = "INSERIRCUPOM", length = 1)
    private String inserircupom;

    @Column(name = "NUMDIASMAXCANCBORDERO")
    private Short numdiasmaxcancbordero;

    @Column(name = "NUMDIASPAGTORETRO")
    private Short numdiaspagtoretro;

    @Column(name = "PROXNUMLOTEREAGENTE")
    private Integer proxnumlotereagente;

    @Column(name = "CONSIDERAISENTOSCOMOPF", length = 1)
    private String consideraisentoscomopf;

    @Column(name = "UTILIZAVENDAPOREMBALAGEM", length = 1)
    private String utilizavendaporembalagem;

    @Column(name = "APLICAACRESCPFTV3", length = 1)
    private String aplicaacrescpftv3;

    @Column(name = "APLICATXFIMAUTORIZACAO", length = 1)
    private String aplicatxfimautorizacao;

    @Column(name = "BASECREDDEBRCAAUTORI", length = 1)
    private String basecreddebrcaautori;

    @Column(name = "TARJAMAGNETICAOBRIGATORIA", length = 1)
    private String tarjamagneticaobrigatoria;

    @Column(name = "LIMPARBASECALCENTRADA", length = 1)
    private String limparbasecalcentrada;

    @Column(name = "BLOQLIBPEDMARGEMNEG", length = 1)
    private String bloqlibpedmargemneg;

    @Column(name = "BLOQLIBPEDCOMDESCONTO", length = 1)
    private String bloqlibpedcomdesconto;

    @Column(name = "AUTENTICARDOC", length = 1)
    private String autenticardoc;

    @Column(name = "VERIFICAMARGEMLIBPEDIDO", length = 1)
    private String verificamargemlibpedido;

    @Column(name = "PRAZOFATALMED")
    private Short prazofatalmed;

    @Column(name = "TIPOALIQOUTRASDESP", length = 1)
    private String tipoaliqoutrasdesp;

    @Column(name = "NUMDIASMAXACERTARCARGA")
    private Short numdiasmaxacertarcarga;

    @Column(name = "ABATEFRETEPRECOMINIMO", length = 1)
    private String abatefreteprecominimo;

    @Column(name = "VLMINVENDATV3", precision = 18, scale = 6)
    private BigDecimal vlminvendatv3;

    @Column(name = "DIVIDEPRZADICIONALPARCELAS", length = 1)
    private String divideprzadicionalparcelas;

    @Column(name = "SOMACOMISSAOCMV", length = 1)
    private String somacomissaocmv;

    @Column(name = "CODMOTVISITAPADRAOCALLCENTER")
    private Integer codmotvisitapadraocallcenter;

    @Column(name = "TIPOENTREGAPADRAOCALLCENTER", length = 1)
    private String tipoentregapadraocallcenter;

    @Column(name = "TIPOPERIODOGIRODIA", length = 1)
    private String tipoperiodogirodia;

    @Column(name = "CALCULARSTCOMIPI", length = 1)
    private String calcularstcomipi;

    @Column(name = "TIPOVALORGIRODIA", length = 1)
    private String tipovalorgirodia;

    @Column(name = "SOMADESPFINITEMCF", length = 1)
    private String somadespfinitemcf;

    @Column(name = "CFOP5929ISENTO", length = 1)
    private String cfop5929isento;

    @Column(name = "IECLIEXCLUSIVA", length = 1)
    private String iecliexclusiva;

    @Column(name = "PERCICMFRETE", precision = 4, scale = 2)
    private BigDecimal percicmfrete;

    @Column(name = "CODFISCALFRETE")
    private Integer codfiscalfrete;

    @Column(name = "PERCICMINTERFRETE", precision = 4, scale = 2)
    private BigDecimal percicminterfrete;

    @Column(name = "CODFISCALINTERFRETE")
    private Integer codfiscalinterfrete;

    @Column(name = "COBRARVLTARIFAPARC1", length = 1)
    private String cobrarvltarifaparc1;

    @Column(name = "GRAVAROBSCLIENTENOPEDIDO", length = 1)
    private String gravarobsclientenopedido;

    @Column(name = "SOMAVLTARIFAITENSNF", length = 1)
    private String somavltarifaitensnf;

    @Column(name = "RESTRINGENUMVIASNF", length = 1)
    private String restringenumviasnf;

    @Column(name = "TIPOABASPREV", length = 2)
    private String tipoabasprev;

    @Column(name = "PERCACRESCIMOCUSTOREAL", precision = 10, scale = 6)
    private BigDecimal percacrescimocustoreal;

    @Column(name = "PERCACRESCIMOCUSTOFIN", precision = 10, scale = 6)
    private BigDecimal percacrescimocustofin;

    @Column(name = "NUMDIASPAGCHQCANCEL")
    private Short numdiaspagchqcancel;

    @Column(name = "VERLANCTOBCOCHQ", length = 1)
    private String verlanctobcochq;

    @Column(name = "ATUALIZACLIULTALTER1203", length = 1)
    private String atualizacliultalter1203;

    @Column(name = "CODCONTAPERDA")
    private Long codcontaperda;

    @Column(name = "CODCONTARESTRCA")
    private Long codcontarestrca;

    @Column(name = "PERMITEVENDAECF402", length = 1)
    private String permitevendaecf402;

    @Column(name = "PCKABASTECIDO", length = 1)
    private String pckabastecido;

    @Column(name = "FAIXAINITEOR", precision = 6, scale = 2)
    private BigDecimal faixainiteor;

    @Column(name = "FAIXAFIMTEOR", precision = 6, scale = 2)
    private BigDecimal faixafimteor;

    @Column(name = "CHECARDIASUTEISTITPGNLIB", length = 1)
    private String checardiasuteistitpgnlib;

    @Column(name = "USACONVERSAOEMBALAGEM", length = 1)
    private String usaconversaoembalagem;

    @Column(name = "DTULTIMAGERACAOSERASA")
    private LocalDate dtultimageracaoserasa;

    @Column(name = "SEGMENTOSERASA")
    private Short segmentoserasa;

    @Column(name = "PRAZOVALIDADEORCAMENTO")
    private Short prazovalidadeorcamento;

    @Column(name = "PERCMAXDESCDESD", precision = 5, scale = 2)
    private BigDecimal percmaxdescdesd;

    @Column(name = "VERIFICAPESOMAXPALETE", length = 1)
    private String verificapesomaxpalete;

    @Column(name = "PESOMAXPALETE", precision = 10, scale = 2)
    private BigDecimal pesomaxpalete;

    @Column(name = "BLOQUEARENDINVENT", length = 1)
    private String bloquearendinvent;

    @Column(name = "BLOQUEAPRODENT", length = 1)
    private String bloqueaprodent;

    @Column(name = "TIPOVLMINVENDABK", length = 2)
    private String tipovlminvendabk;

    @Column(name = "DEPOSITOVIRTUAL")
    private Short depositovirtual;

    @Column(name = "ATUALIZARPCPRODUTBONIFIC", length = 1)
    private String atualizarpcprodutbonific;

    @Column(name = "PERMITIRDESDTITVENCSEMJUROS", length = 1)
    private String permitirdesdtitvencsemjuros;

    @Column(name = "UTILIZALIBERACAOPEDCOMPRA", length = 1)
    private String utilizaliberacaopedcompra;

    @Column(name = "USAPERCDIFQTENT", length = 1)
    private String usapercdifqtent;

    @Column(name = "PERCDIFQTENT")
    private Short percdifqtent;

    @Column(name = "MAXPRZMEDIODESDCP")
    private Short maxprzmediodesdcp;

    @Column(name = "BLOQITENSCORTE936", length = 1)
    private String bloqitenscorte936;

    @Column(name = "CODCONTAVERBAFORNEC")
    private Long codcontaverbafornec;

    @Column(name = "UTILIZACHECKOUT936", length = 1)
    private String utilizacheckout936;

    @Column(name = "VERIFICANIVELVENDA402", length = 1)
    private String verificanivelvenda402;

    @Column(name = "NUMDIASMAXPRORROG")
    private Short numdiasmaxprorrog;

    @Column(name = "VLMINCANCITEMCUPOM", precision = 18, scale = 6)
    private BigDecimal vlmincancitemcupom;

    @Column(name = "VLMINCANCCUPOM", precision = 18, scale = 6)
    private BigDecimal vlmincanccupom;

    @Column(name = "VALIDARUFFILIAL", length = 1)
    private String validaruffilial;

    @Column(name = "GERAPARCELAMENTOTEF", length = 1)
    private String geraparcelamentotef;

    @Column(name = "MANTEMNOSSONUMBCO402", length = 1)
    private String mantemnossonumbco402;

    @Column(name = "REPLICARPRECOPOREMBALAGEM", length = 1)
    private String replicarprecoporembalagem;

    @Column(name = "PERMITECODBARRADUPLICADO", length = 1)
    private String permitecodbarraduplicado;

    @Column(name = "PEDIDOCOMPRAPORPALETE", length = 1)
    private String pedidocompraporpalete;

    @Column(name = "FECHABONUSEMRECIBODESC", length = 1)
    private String fechabonusemrecibodesc;

    @Column(name = "NUMMAXNFTRANSF")
    private Short nummaxnftransf;

    @Column(name = "PERMITECRDEVFORNEC", length = 1)
    private String permitecrdevfornec;

    @Column(name = "CONTROLAPRODUTIVSEP", length = 1)
    private String controlaprodutivsep;

    @Column(name = "PROXNUMBORDEROCR")
    private Long proxnumborderocr;

    @Column(name = "INCLUIDESPRODAPENF", length = 1)
    private String incluidesprodapenf;

    @Column(name = "PERMAXINDENIZPEDIDO", precision = 8, scale = 4)
    private BigDecimal permaxindenizpedido;

    @Column(name = "VALIDAESTOQUEMAPASEP", length = 1)
    private String validaestoquemapasep;

    @Column(name = "DESBLOQUEARPRODFIMOS", length = 1)
    private String desbloquearprodfimos;

    @Column(name = "LANCARDESPVENDORAUTOMATICO", length = 1)
    private String lancardespvendorautomatico;

    @Column(name = "CALCULAGIROTRANSF", length = 1)
    private String calculagirotransf;

    @Column(name = "USATECLADOGERTEC", length = 1)
    private String usatecladogertec;

    @Column(name = "DTEXPIRACAOWINTHOR")
    private LocalDate dtexpiracaowinthor;

    @Column(name = "ABATERIMPOSTOSCOMISSAORCA", length = 1)
    private String abaterimpostoscomissaorca;

    @Column(name = "AUTENTICARACERTOCX", length = 1)
    private String autenticaracertocx;

    @Column(name = "IMPRIMEDESCONTOCF", length = 1)
    private String imprimedescontocf;

    @Column(name = "TIPOTAXAVENDOR", length = 1)
    private String tipotaxavendor;

    @Column(name = "SEPARACAOFLOWRACK", length = 1)
    private String separacaoflowrack;

    @Column(name = "NUMITENSOS")
    private Short numitensos;

    @Column(name = "FTP_IP", length = 40)
    private String ftpIp;

    @Column(name = "FTP_PORTA")
    private Integer ftpPorta;

    @Column(name = "FTP_CONEXAOPASSIVA", length = 1)
    private String ftpConexaopassiva;

    @Column(name = "MANTEMNOSSONUMBCO1210", length = 1)
    private String mantemnossonumbco1210;

    @Column(name = "CALCFRETEPORITEM", length = 1)
    private String calcfreteporitem;

    @Column(name = "CONSIDERARICMSANTECIPCUSTO", length = 1)
    private String consideraricmsantecipcusto;

    @Column(name = "USANEGFORNEC", length = 1)
    private String usanegfornec;

    @Column(name = "TIPOCALCSULFRAMA", length = 2)
    private String tipocalcsulframa;

    @Column(name = "ACEITACNPJEXCLUSIVOFORNEC", length = 1)
    private String aceitacnpjexclusivofornec;

    @Column(name = "LIBERAESTENTMERC", length = 1)
    private String liberaestentmerc;

    @Column(name = "CODFISCALDEVOUTRASDESP")
    private Integer codfiscaldevoutrasdesp;

    @Column(name = "CODFISCALINTERDEVOUTRASDESP")
    private Integer codfiscalinterdevoutrasdesp;

    @Column(name = "UTILIZABOLETOPREIMPR", length = 1)
    private String utilizaboletopreimpr;

    @Column(name = "VERIFICADATAHORAECF", length = 1)
    private String verificadatahoraecf;

    @Column(name = "UTILIZAQTFRACIONADACONF", length = 1)
    private String utilizaqtfracionadaconf;

    @Column(name = "SOMACOMPRAPREVFLUXOCX", length = 1)
    private String somacompraprevfluxocx;

    @Column(name = "OBTERPREFERENCIACLIECF", length = 1)
    private String obterpreferenciacliecf;

    @Column(name = "TIPOAPLICREPASSE", length = 2)
    private String tipoaplicrepasse;

    @Column(name = "PERMAXDESCITEMCF", precision = 5, scale = 2)
    private BigDecimal permaxdescitemcf;

    @Column(name = "CALCIOFVENDORCOMPOSTO", length = 1)
    private String calciofvendorcomposto;

    @Column(name = "GERARDADOSREDUCAOZ", length = 1)
    private String gerardadosreducaoz;

    @Column(name = "VERIFICAPICKINGARM", length = 1)
    private String verificapickingarm;

    @Column(name = "VALIDANUMSERIEEQUIPECF", length = 1)
    private String validanumserieequipecf;

    @Column(name = "DEDUZIRAVARIAESTCOMDEVCLI", length = 1)
    private String deduziravariaestcomdevcli;

    @Column(name = "ALTERARPRECOPLPAGAMENTO", length = 1)
    private String alterarprecoplpagamento;

    @Column(name = "DTVIRADAWMS")
    private LocalDate dtviradawms;

    @Column(name = "PRAZOMAXDTENTREGA")
    private Short prazomaxdtentrega;

    @Column(name = "COMISSAORCATIPOVENDA", length = 1)
    private String comissaorcatipovenda;

    @Column(name = "EXPEDEPALETEFECHADODIRETOBOX", length = 1)
    private String expedepaletefechadodiretobox;

    @Column(name = "USACONTROLEFORNECPEDCOMPRA", length = 1)
    private String usacontrolefornecpedcompra;

    @Column(name = "ENDERECACOMBONUSABERTO", length = 1)
    private String enderecacombonusaberto;

    @Column(name = "PESOSUPPALETE")
    private Short pesosuppalete;

    @Column(name = "TIPOTXBOLETO", length = 1)
    private String tipotxboleto;

    @Column(name = "UTILIZAREMBUNITSINTEGRA", length = 1)
    private String utilizarembunitsintegra;

    @Column(name = "EXIGEDTVALIDADEBONUSRM", length = 1)
    private String exigedtvalidadebonusrm;

    @Column(name = "USAREDUCAOCOMISSAORCA", length = 1)
    private String usareducaocomissaorca;

    @Column(name = "BLOQDEVCLI", length = 1)
    private String bloqdevcli;

    @Column(name = "QTDEGERLIVRO")
    private Short qtdegerlivro;

    @Column(name = "GRAVAPCMENSALTCADCLI", length = 1)
    private String gravapcmensaltcadcli;

    @Column(name = "ENVIAMENSRCALIBEST", length = 1)
    private String enviamensrcalibest;

    @Column(name = "USACHAVETRIPLAPCPEDI", length = 1)
    private String usachavetriplapcpedi;

    @Column(name = "ABATERDESCFINCOMISSAORCA", length = 1)
    private String abaterdescfincomissaorca;

    @Column(name = "TIPOAPLICINDICE", length = 2)
    private String tipoaplicindice;

    @Column(name = "APLICAREPASSEPERCBONIFIC", length = 1)
    private String aplicarepassepercbonific;

    @Column(name = "ACEITADESCFLEXPRODMONITORADO", length = 1)
    private String aceitadescflexprodmonitorado;

    @Column(name = "VERIFPERMISSAOCOBRNODESDOBR402", length = 1)
    private String verifpermissaocobrnodesdobr402;

    @Column(name = "DIROP", length = 3)
    private String dirop;

    @Column(name = "ABATERIMPOSTOSDESCFIN", length = 1)
    private String abaterimpostosdescfin;

    @Column(name = "USATRIBENTPORUF", length = 1)
    private String usatribentporuf;

    @Column(name = "SOMAIMPOSTOSTRANSF", length = 1)
    private String somaimpostostransf;

    @Column(name = "CODCONTASOBRAACERTO")
    private Long codcontasobraacerto;

    @Column(name = "APENASMIUDEZACHEKOUTCARREG", length = 1)
    private String apenasmiudezachekoutcarreg;

    @Column(name = "NUMDIASCADCLIBLOQCHDV")
    private Short numdiascadclibloqchdv;

    @Column(name = "NUMDIASCHDVBLOQCLI")
    private Short numdiaschdvbloqcli;

    @Column(name = "QTCHDVBLOQCLI")
    private Short qtchdvbloqcli;

    @Column(name = "RESTRINGENUMVIASPU", length = 1)
    private String restringenumviaspu;

    @Column(name = "VALIDARVLMINVENDAAPOSCORTE", length = 1)
    private String validarvlminvendaaposcorte;

    @Column(name = "CODCONTAREBAIXACMV")
    private Long codcontarebaixacmv;

    @Column(name = "ALTERARNUMSEQPEDIDO", length = 2)
    private String alterarnumseqpedido;

    @Column(name = "TIPOORDENACAONFSAIDA", length = 2)
    private String tipoordenacaonfsaida;

    @Column(name = "PERCACRESCIMOBALCAO", precision = 10, scale = 6)
    private BigDecimal percacrescimobalcao;

    @Column(name = "USARMOVIMENTAHORIZONTAL", length = 1)
    private String usarmovimentahorizontal;

    @Column(name = "VALIDAVLMINVENDABALCAO", length = 1)
    private String validavlminvendabalcao;

    @Column(name = "USABCRENT", length = 1)
    private String usabcrent;

    @Column(name = "FAZERINSERTPCEMBALAGEM", length = 1)
    private String fazerinsertpcembalagem;

    @Column(name = "VALIDARIECONSUMIDORFINAL", length = 1)
    private String validarieconsumidorfinal;

    @Column(name = "ACEITADESCPRECOFIXO", length = 1)
    private String aceitadescprecofixo;

    @Column(name = "TROCAALTDEBCREDRCA", length = 1)
    private String trocaaltdebcredrca;

    @Column(name = "CONTALANCPERDA")
    private Long contalancperda;

    @Column(name = "GERARBRINDEPEDBONIFIC", length = 1)
    private String gerarbrindepedbonific;

    @Column(name = "BLOQAPLICPERCMANUTINV", length = 1)
    private String bloqaplicpercmanutinv;

    @Column(name = "GERANUMLOTEAUTOMATICO")
    private Boolean geranumloteautomatico;

    @Column(name = "PADRAOCALLCENTER", length = 1)
    private String padraocallcenter;

    @Column(name = "DESBLOQCLIBXTITULO", length = 1)
    private String desbloqclibxtitulo;

    @Column(name = "ENDERECOAPANHAFILIAL", length = 1)
    private String enderecoapanhafilial;

    @Column(name = "PROXNUMLOTESA")
    private Integer proxnumlotesa;

    @Column(name = "VERIFICARENDEROCUPADO", length = 1)
    private String verificarenderocupado;

    @Column(name = "AGREGARSTPRODSINTEGRA", length = 1)
    private String agregarstprodsintegra;

    @Column(name = "ACEITADESDCONSUMIDOROUTROSCLI", length = 1)
    private String aceitadesdconsumidoroutroscli;

    @Column(name = "ABASTCORRETIVOAUTOMAT", length = 1)
    private String abastcorretivoautomat;

    @Column(name = "NAOUSARPICKINGCX", length = 1)
    private String naousarpickingcx;

    @Column(name = "USASEPARACAOCXFECHADA", length = 1)
    private String usaseparacaocxfechada;

    @Column(name = "DESDCARTAOFECHCARGA", length = 1)
    private String desdcartaofechcarga;

    @Column(name = "PERMAXDESCAUTOR", precision = 18, scale = 6)
    private BigDecimal permaxdescautor;

    @Column(name = "VLREMONTEDESCARGA", precision = 12, scale = 6)
    private BigDecimal vlremontedescarga;

    @Column(name = "FECHACARREGAUTVENDABALCAO", length = 1)
    private String fechacarregautvendabalcao;

    @Column(name = "GERANDOMAPA", length = 1)
    private String gerandomapa;

    @Column(name = "DTATUALIZACAOBD")
    private LocalDate dtatualizacaobd;

    @Column(name = "UTILIZAENDPORFILIAL", length = 1)
    private String utilizaendporfilial;

    @Column(name = "VERIFICAPEDBONIFICENTNORMAL", length = 1)
    private String verificapedbonificentnormal;

    @Column(name = "NAOUSAENDERECOMISTO", length = 1)
    private String naousaenderecomisto;

    @Column(name = "TRAVAVENDAPF", length = 1)
    private String travavendapf;

    @Column(name = "USARSENHAEXPIRADA", length = 1)
    private String usarsenhaexpirada;

    @Column(name = "GERARPCLANCICMSANTECIP", length = 1)
    private String gerarpclancicmsantecip;

    @Column(name = "TRATARRESTRICAOACRESCIMO", length = 1)
    private String tratarrestricaoacrescimo;

    @Column(name = "USACONTROLEDERECIBOS", length = 1)
    private String usacontrolederecibos;

    @Column(name = "NUMDIASMAXBAIXARECIBO")
    private Short numdiasmaxbaixarecibo;

    @Column(name = "NUMMAXTITULOSPORRECIBO")
    private Short nummaxtitulosporrecibo;

    @Column(name = "FATURAFILIALBROKER", length = 1)
    private String faturafilialbroker;

    @Column(name = "PERBASEREDOUTRASDESP", precision = 8, scale = 4)
    private BigDecimal perbaseredoutrasdesp;

    @Column(name = "GERARPCAUXLANCONTASORCAM", length = 1)
    private String gerarpcauxlancontasorcam;

    @Column(name = "TIPOCALCDESCARGAPAL", length = 1)
    private String tipocalcdescargapal;

    @Column(name = "PERCICMFRETEENT", precision = 4, scale = 2)
    private BigDecimal percicmfreteent;

    @Column(name = "CODFISCALFRETEENT")
    private Integer codfiscalfreteent;

    @Column(name = "PERCICMINTERFRETEENT", precision = 4, scale = 2)
    private BigDecimal percicminterfreteent;

    @Column(name = "CODFISCALINTERFRETEENT")
    private Integer codfiscalinterfreteent;

    @Column(name = "PERCLANCCREDCLI", precision = 8, scale = 4)
    private BigDecimal perclanccredcli;

    @Column(name = "BLOQUEARPEDBONIFIC", length = 1)
    private String bloquearpedbonific;

    @Column(name = "USAPRECIFMENORMARGEMM", length = 1)
    private String usaprecifmenormargemm;

    @Column(name = "TIPOCUSTO1322", length = 1)
    private String tipocusto1322;

    @Column(name = "PEDIDOPORDISTRIB", length = 1)
    private String pedidopordistrib;

    @Column(name = "BLOQUEIAVENDAESTPENDENTE", length = 1)
    private String bloqueiavendaestpendente;

    @Column(name = "PROXNUMCODBARRALOTE")
    private Integer proxnumcodbarralote;

    @Column(name = "BLOQCONSISTENUMMAPA", length = 1)
    private String bloqconsistenummapa;

    @Column(name = "USACESTABASICACF", length = 1)
    private String usacestabasicacf;

    @Column(name = "USAPRODFRACUNITARIO", length = 1)
    private String usaprodfracunitario;

    @Column(name = "ATUALIZAENT1122", length = 1)
    private String atualizaent1122;

    @Column(name = "USARENDERFORNEC", length = 1)
    private String usarenderfornec;

    @Column(name = "APLICARINDICECMV", length = 1)
    private String aplicarindicecmv;

    @Column(name = "CODCONTACUSTOSCARTORIO")
    private Long codcontacustoscartorio;

    @Column(name = "MAXDIASSEMVENDA")
    private Integer maxdiassemvenda;

    @Column(name = "USATROCACOMPRECOVENDA", length = 1)
    private String usatrocacomprecovenda;

    @Column(name = "CODCONTPAGDIARIA")
    private Long codcontpagdiaria;

    @Column(name = "NUMDIASMAXVENDACLIINADIMPLENTE")
    private Integer numdiasmaxvendacliinadimplente;

    @Column(name = "ORDEMAVALIACAOCOMISSAORCA")
    private Short ordemavaliacaocomissaorca;

    @Column(name = "PERMITIRDESCRODAPECHECKOUT", length = 1)
    private String permitirdescrodapecheckout;

    @Column(name = "PERMAXRODAPECHECKOUT", precision = 8, scale = 4)
    private BigDecimal permaxrodapecheckout;

    @Column(name = "USARTRIBUTACAOTRANSFTV10", length = 1)
    private String usartributacaotransftv10;

    @Column(name = "GERAVALERCADEVMANIF", length = 1)
    private String geravalercadevmanif;

    @Column(name = "USASALDOCONTACORRENTEDESCFIN", length = 1)
    private String usasaldocontacorrentedescfin;

    @Column(name = "BLOQFORNECVERBASVENCIDAS", length = 1)
    private String bloqfornecverbasvencidas;

    @Column(name = "DIASBLOQFORNECVERBASVENCIDAS")
    private Short diasbloqfornecverbasvencidas;

    @Column(name = "USADTDESBLOQUEIOBLOQCLIINATIV", length = 1)
    private String usadtdesbloqueiobloqcliinativ;

    @Column(name = "USAPTABELACOMOBASE", length = 1)
    private String usaptabelacomobase;

    @Column(name = "PROCNUMLISTA")
    private Integer procnumlista;

    @Column(name = "TEMPMENFLOW")
    private Long tempmenflow;

    @Column(name = "GERARTROCOCOBDIN", length = 1)
    private String gerartrococobdin;

    @Column(name = "INFORMARECEBEDORVENDA", length = 1)
    private String informarecebedorvenda;

    @Column(name = "GRAVARCOTACAO", length = 1)
    private String gravarcotacao;

    @Column(name = "CODCONTABENEFIC")
    private Long codcontabenefic;

    @Column(name = "UPDATEAUTMENU", length = 31)
    private String updateautmenu;

    @Column(name = "MERCADOALVO", length = 6)
    private String mercadoalvo;

    @Column(name = "ATUALIZAESTCONTCONVEMBALAGEM", length = 1)
    private String atualizaestcontconvembalagem;

    @Column(name = "ACEITAPFCONTRIBUINTE", length = 1)
    private String aceitapfcontribuinte;

    @Column(name = "UTILIZARATEIODESPESAS", length = 1)
    private String utilizarateiodespesas;

    @Column(name = "VERIFICADESCFINBAIXACM", length = 1)
    private String verificadescfinbaixacm;

    @Column(name = "VALORMAXFALTACAIXA", precision = 12, scale = 2)
    private BigDecimal valormaxfaltacaixa;

    @Column(name = "CODCONTAFALTACAIXA")
    private Long codcontafaltacaixa;

    @Column(name = "VERCOBRANCABLOQCLI504_16_17", length = 1)
    private String vercobrancabloqcli5041617;

    @Column(name = "NUMDIASMINVENDABK")
    private Short numdiasminvendabk;

    @Column(name = "CODCONTASOBRACAIXA")
    private Long codcontasobracaixa;

    @Column(name = "TIPOMASCARAENDERWMS")
    private Short tipomascaraenderwms;

    @Column(name = "CALCICMSFOMEZERO", length = 1)
    private String calcicmsfomezero;

    @Column(name = "VOLUMEPALETE", precision = 16, scale = 6)
    private BigDecimal volumepalete;

    @Column(name = "ENVIARMSGRCACORTE", length = 1)
    private String enviarmsgrcacorte;

    @Column(name = "QTMESESCLASSESTRELAS")
    private Short qtmesesclassestrelas;

    @Column(name = "QTMESESGRUPOS")
    private Short qtmesesgrupos;

    @Column(name = "CONSQTRESERVREBAIXACUSTO", length = 1)
    private String consqtreservrebaixacusto;

    @Column(name = "CODCONTASOBRAMERC")
    private Long codcontasobramerc;

    @Column(name = "HABILITARLANCTODADOSFROTA", length = 1)
    private String habilitarlanctodadosfrota;

    @Column(name = "CODCONTAVERBACMV")
    private Long codcontaverbacmv;

    @Column(name = "NUMCASASDECPRODUCAO")
    private Short numcasasdecproducao;

    @Column(name = "GERARPCFRETE", length = 1)
    private String gerarpcfrete;

    @Column(name = "LANCARSTAPENASPARC1", length = 1)
    private String lancarstapenasparc1;

    @Column(name = "CODCOBRANCADESCFINANCEIRO", length = 4)
    private String codcobrancadescfinanceiro;

    @Column(name = "INCLUIRCOMISSAOSUGPVENDACMV", length = 1)
    private String incluircomissaosugpvendacmv;

    @Column(name = "USACOMISSAOECF", length = 1)
    private String usacomissaoecf;

    @Column(name = "USACANCELAMENTOAUTOMATICOECF", length = 1)
    private String usacancelamentoautomaticoecf;

    @Column(name = "UTILIZACONTROLEMEDICAMENTOS", length = 1)
    private String utilizacontrolemedicamentos;

    @Column(name = "QTMESESCLASSGRUPOCARTAO")
    private Short qtmesesclassgrupocartao;

    @Column(name = "BIOMETRIAPARTICIPASORTEIOBIRO", length = 1)
    private String biometriaparticipasorteiobiro;

    @Column(name = "CARTAOPARTICIPASORTEIOBIRO", length = 1)
    private String cartaoparticipasorteiobiro;

    @Column(name = "CREDENCIALPARTICIPASORTEIOBIRO", length = 1)
    private String credencialparticipasorteiobiro;

    @Column(name = "VALIDARESTRICOESVENDAPORRCA", length = 1)
    private String validarestricoesvendaporrca;

    @Column(name = "DTVALIDASEFAZ")
    private LocalDate dtvalidasefaz;

    @Column(name = "DIRIMPORTACAOFV2", length = 100)
    private String dirimportacaofv2;

    @Column(name = "USAFECHAMENTOCXCEGO", length = 1)
    private String usafechamentocxcego;

    @Column(name = "CODCONTATRANSFTV10")
    private Long codcontatransftv10;

    @Column(name = "CALCSTFONTEPF", length = 1)
    private String calcstfontepf;

    @Column(name = "PERMITEVENDAPRODUTOPV", length = 1)
    private String permitevendaprodutopv;

    @Column(name = "VALIDARESTOQUEAUTOSERVICO", length = 1)
    private String validarestoqueautoservico;

    @Column(name = "CONSISTECNPJFORNEC", length = 1)
    private String consistecnpjfornec;

    @Column(name = "USACRECLIVENDATLMKT", length = 1)
    private String usacreclivendatlmkt;

    @Column(name = "NUMMAXPARCENT")
    private Integer nummaxparcent;

    @Column(name = "VIASDANFE")
    private Short viasdanfe;

    @Column(name = "USACOMISSAOPORCLASSE", length = 1)
    private String usacomissaoporclasse;

    @Column(name = "CLASSECOMISPADRAO", length = 2)
    private String classecomispadrao;

    @Column(name = "CODCONTACAMBIAL")
    private Long codcontacambial;

    @Column(name = "SEMPREATUALIZAQTESTCONVEMB", length = 1)
    private String sempreatualizaqtestconvemb;

    @Column(name = "IPNFE", length = 15)
    private String ipnfe;

    @Column(name = "PORTANFE")
    private Long portanfe;

    @Column(name = "PROXNUMLOTENFE")
    private Long proxnumlotenfe;

    @Column(name = "LANCARVALECOMODESPESANA1268", length = 1)
    private String lancarvalecomodespesana1268;

    @Column(name = "SEPARARPRODCOMRESTRICAOTRANSP", length = 1)
    private String separarprodcomrestricaotransp;

    @Column(name = "QTDEPARCELASIMPOSTOSFRETE")
    private Short qtdeparcelasimpostosfrete;

    @Column(name = "LANCARFRETEXPARCELAS", length = 1)
    private String lancarfretexparcelas;

    @Column(name = "BAIXARDNICOMLANCAMENTO", length = 1)
    private String baixardnicomlancamento;

    @Column(name = "FILIALPADRAO", length = 2)
    private String filialpadrao;

    @Column(name = "FRETENAOTRIBCOMOOUTRAS", length = 1)
    private String fretenaotribcomooutras;

    @Column(name = "ROTINA2562EMUSO")
    private Boolean rotina2562emuso;

    @Column(name = "PERCCSRF", precision = 6, scale = 2)
    private BigDecimal perccsrf;

    @Column(name = "VALORMINIMOCSRF", precision = 16, scale = 4)
    private BigDecimal valorminimocsrf;

    @Column(name = "VALORMINIMOIRRF", precision = 16, scale = 4)
    private BigDecimal valorminimoirrf;

    @Column(name = "PERCINSS", precision = 6, scale = 2)
    private BigDecimal percinss;

    @Column(name = "VALORMINIMOINSS", precision = 16, scale = 4)
    private BigDecimal valorminimoinss;

    @Column(name = "QTMESESCREDCIAP")
    private Short qtmesescredciap;

    @Column(name = "SOMATXBOLETO", length = 1)
    private String somatxboleto;

    @Column(name = "INCLUIRCOMISSAOCMVVENDA", length = 1)
    private String incluircomissaocmvvenda;

    @Column(name = "ACERTOCARGAFILIALDIFERENTE", length = 1)
    private String acertocargafilialdiferente;

    @Column(name = "CODCONTAREBAIXACMVAAPURAR")
    private Long codcontarebaixacmvaapurar;

    @Column(name = "NUMDIASMAXDESDCPAGAR")
    private Short numdiasmaxdesdcpagar;

    @Column(name = "NAOUSARPCCRECLICONSFINAL", length = 1)
    private String naousarpccrecliconsfinal;

    @Column(name = "CODCONTAADIANTFOROUTROS")
    private Long codcontaadiantforoutros;

    @Column(name = "BROKERALTDEBCREDRCA", length = 1)
    private String brokeraltdebcredrca;

    @Column(name = "CRMALTDEBCREDRCA", length = 1)
    private String crmaltdebcredrca;

    @Column(name = "TIPOMOVCCRCA", length = 2)
    private String tipomovccrca;

    @Column(name = "USACREDCLITODASFILIAIS", length = 1)
    private String usacredclitodasfiliais;

    @Column(name = "UTILIZACONTROLECAIXA", length = 1)
    private String utilizacontrolecaixa;

    @Column(name = "BLOQHISTORICOFIN", length = 1)
    private String bloqhistoricofin;

    @Column(name = "NUMDIASDESBLOQCHD1")
    private Short numdiasdesbloqchd1;

    @Column(name = "TRIBUTAFRETERATEADO", length = 1)
    private String tributafreterateado;

    @Column(name = "USACONTROLETIPOVERBA", length = 1)
    private String usacontroletipoverba;

    @Column(name = "USALIMCREDCPF", length = 1)
    private String usalimcredcpf;

    @Column(name = "BLOQCLIAUT", length = 1)
    private String bloqcliaut;

    @Column(name = "ACEITAACRESCIMOPRECOFIXO", length = 1)
    private String aceitaacrescimoprecofixo;

    @Column(name = "USAPOSICAOCPAGAR", length = 1)
    private String usaposicaocpagar;

    @Column(name = "VLMINVENDABNF", precision = 12, scale = 2)
    private BigDecimal vlminvendabnf;

    @Column(name = "VLMAXVENDABNF", precision = 12, scale = 2)
    private BigDecimal vlmaxvendabnf;

    @Column(name = "ACEITADESCBALCAORESERVA", length = 1)
    private String aceitadescbalcaoreserva;

    @Column(name = "CLIIBGEOBRG", length = 1)
    private String cliibgeobrg;

    @Column(name = "CLIIPIOBRG", length = 1)
    private String cliipiobrg;

    @Column(name = "USAPISCOFINSPORFILIAL", length = 1)
    private String usapiscofinsporfilial;

    @Column(name = "PASTA_RELATORIO", length = 60)
    private String pastaRelatorio;

    @Column(name = "NAOGRAVARSALDOESTOQUEINVENTROT", length = 1)
    private String naogravarsaldoestoqueinventrot;

    @Column(name = "ULTNUMDATACHEQ")
    private LocalDate ultnumdatacheq;

    @Column(name = "DTINICIONFP")
    private LocalDate dtinicionfp;

    @Column(name = "CONSEDERACESSOPROPRIO530", length = 1)
    private String consederacessoproprio530;

    @Column(name = "TIPOINTEGRACAO", length = 1)
    private String tipointegracao;

    @Column(name = "CODCONTADESPOS")
    private Long codcontadespos;

    @Column(name = "SITUACAOINICIALBLOQUEIO", length = 1)
    private String situacaoinicialbloqueio;

    @Column(name = "CODCONTDESPORDEMSERVICO")
    private Long codcontdespordemservico;

    @Column(name = "CODPLPAGAUTOMATIC", length = 1)
    private String codplpagautomatic;

    @Column(name = "PROXCODPLPAG")
    private Short proxcodplpag;

    @Column(name = "CONFERINDOCARGAPEDIDO", length = 1)
    private String conferindocargapedido;

    @Column(name = "TIMERMSGAGENDA")
    private Short timermsgagenda;

    @Column(name = "USAMARCAPRODUTOS", length = 1)
    private String usamarcaprodutos;

    @Column(name = "CODCONTAGNRE")
    private Long codcontagnre;

    @Column(name = "USARREDUCAOICMSABATRANSF", length = 1)
    private String usarreducaoicmsabatransf;

    @Column(name = "USAVENDABALCAOCLIFILIALVIRTUAL", length = 1)
    private String usavendabalcaoclifilialvirtual;

    @Column(name = "CODCONTADEVCLI")
    private Long codcontadevcli;

    @Column(name = "ACEITADESCPRECOFIXOCESTA", length = 1)
    private String aceitadescprecofixocesta;

    @Column(name = "NUMDIASVENCTITULOCOBINT")
    private Integer numdiasvenctitulocobint;

    @Column(name = "NUMDIASVENCTITULOCOBEXT")
    private Integer numdiasvenctitulocobext;

    @Column(name = "CODSETORCOBRANCA")
    private Integer codsetorcobranca;

    @Column(name = "USAPOLITICADESENHA", length = 1)
    private String usapoliticadesenha;

    @Column(name = "BLOQCLIENTEEXCDEVOL", length = 1)
    private String bloqclienteexcdevol;

    @Column(name = "PERCEXCESSODEVOL", precision = 7, scale = 4)
    private BigDecimal percexcessodevol;

    @Column(name = "DIASANALISEDEVOL")
    private Short diasanalisedevol;

    @Column(name = "USAVENDEDORNATROCA", length = 1)
    private String usavendedornatroca;

    @Column(name = "OSRESERVANAEXECUCAO", length = 1)
    private String osreservanaexecucao;

    @Column(name = "PROXNUMLOTENFEDPEC")
    private Long proxnumlotenfedpec;

    @Column(name = "RESTRINGIRCONFERENCIALOTE", length = 1)
    private String restringirconferencialote;

    @Column(name = "TIPOTITULOSECF402", length = 1)
    private String tipotitulosecf402;

    @Column(name = "TIPOTITULOSECF409", length = 1)
    private String tipotitulosecf409;

    @Column(name = "BLOQCODCLIPRINC", length = 1)
    private String bloqcodcliprinc;

    @Column(name = "ARREDONDAQTEMBALFRIOS", length = 1)
    private String arredondaqtembalfrios;

    @Column(name = "CODCLIPC")
    private Integer codclipc;

    @Column(name = "TXIOFCOMPLEMENTAR", precision = 12, scale = 4)
    private BigDecimal txiofcomplementar;

    @Column(name = "HASHSISTEMA", length = 40)
    private String hashsistema;

    @Column(name = "USAFLUIG", length = 1)
    private String usafluig;

    @Column(name = "PRO1CNUMLISTA")
    private Integer pro1cnumlista;

    @Column(name = "AUTOMATIC", length = 1)
    private String automatic;

    @Column(name = "VLTARIFABOLEPIX", precision = 8, scale = 2)
    private BigDecimal vltarifabolepix;
    @Id
    private Long id;

    public BigDecimal getTx() {
        return tx;
    }

    public void setTx(BigDecimal tx) {
        this.tx = tx;
    }

    public LocalDate getDtproxatu() {
        return dtproxatu;
    }

    public void setDtproxatu(LocalDate dtproxatu) {
        this.dtproxatu = dtproxatu;
    }

    public Long getCodcontfor() {
        return codcontfor;
    }

    public void setCodcontfor(Long codcontfor) {
        this.codcontfor = codcontfor;
    }

    public String getHistfor() {
        return histfor;
    }

    public void setHistfor(String histfor) {
        this.histfor = histfor;
    }

    public Long getCodcontfre() {
        return codcontfre;
    }

    public void setCodcontfre(Long codcontfre) {
        this.codcontfre = codcontfre;
    }

    public String getHistfre() {
        return histfre;
    }

    public void setHistfre(String histfre) {
        this.histfre = histfre;
    }

    public Long getCodcontout() {
        return codcontout;
    }

    public void setCodcontout(Long codcontout) {
        this.codcontout = codcontout;
    }

    public String getHistout() {
        return histout;
    }

    public void setHistout(String histout) {
        this.histout = histout;
    }

    public Long getCodcontcli() {
        return codcontcli;
    }

    public void setCodcontcli(Long codcontcli) {
        this.codcontcli = codcontcli;
    }

    public Short getSugvenda() {
        return sugvenda;
    }

    public void setSugvenda(Short sugvenda) {
        this.sugvenda = sugvenda;
    }

    public BigDecimal getTxvenda() {
        return txvenda;
    }

    public void setTxvenda(BigDecimal txvenda) {
        this.txvenda = txvenda;
    }

    public Short getNumdiasatu() {
        return numdiasatu;
    }

    public void setNumdiasatu(Short numdiasatu) {
        this.numdiasatu = numdiasatu;
    }

    public Integer getProxnumtroca() {
        return proxnumtroca;
    }

    public void setProxnumtroca(Integer proxnumtroca) {
        this.proxnumtroca = proxnumtroca;
    }

    public Integer getProxnumped() {
        return proxnumped;
    }

    public void setProxnumped(Integer proxnumped) {
        this.proxnumped = proxnumped;
    }

    public Long getProxnumorc() {
        return proxnumorc;
    }

    public void setProxnumorc(Long proxnumorc) {
        this.proxnumorc = proxnumorc;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public Integer getProxnumcar() {
        return proxnumcar;
    }

    public void setProxnumcar(Integer proxnumcar) {
        this.proxnumcar = proxnumcar;
    }

    public Integer getProxnumcli() {
        return proxnumcli;
    }

    public void setProxnumcli(Integer proxnumcli) {
        this.proxnumcli = proxnumcli;
    }

    public BigDecimal getVldiferenca() {
        return vldiferenca;
    }

    public void setVldiferenca(BigDecimal vldiferenca) {
        this.vldiferenca = vldiferenca;
    }

    public Long getProxnumbonus() {
        return proxnumbonus;
    }

    public void setProxnumbonus(Long proxnumbonus) {
        this.proxnumbonus = proxnumbonus;
    }

    public BigDecimal getTaxa35() {
        return taxa35;
    }

    public void setTaxa35(BigDecimal taxa35) {
        this.taxa35 = taxa35;
    }

    public Integer getProxnumvale() {
        return proxnumvale;
    }

    public void setProxnumvale(Integer proxnumvale) {
        this.proxnumvale = proxnumvale;
    }

    public BigDecimal getPercjurosmora() {
        return percjurosmora;
    }

    public void setPercjurosmora(BigDecimal percjurosmora) {
        this.percjurosmora = percjurosmora;
    }

    public Integer getProxnumpedtlmk() {
        return proxnumpedtlmk;
    }

    public void setProxnumpedtlmk(Integer proxnumpedtlmk) {
        this.proxnumpedtlmk = proxnumpedtlmk;
    }

    public Long getProxnumbordero() {
        return proxnumbordero;
    }

    public void setProxnumbordero(Long proxnumbordero) {
        this.proxnumbordero = proxnumbordero;
    }

    public Long getProxnumtrans() {
        return proxnumtrans;
    }

    public void setProxnumtrans(Long proxnumtrans) {
        this.proxnumtrans = proxnumtrans;
    }

    public Integer getProxnumlanc() {
        return proxnumlanc;
    }

    public void setProxnumlanc(Integer proxnumlanc) {
        this.proxnumlanc = proxnumlanc;
    }

    public Integer getProxnumverba() {
        return proxnumverba;
    }

    public void setProxnumverba(Integer proxnumverba) {
        this.proxnumverba = proxnumverba;
    }

    public Long getProxnumtransvenda() {
        return proxnumtransvenda;
    }

    public void setProxnumtransvenda(Long proxnumtransvenda) {
        this.proxnumtransvenda = proxnumtransvenda;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getIptabpreco() {
        return iptabpreco;
    }

    public void setIptabpreco(String iptabpreco) {
        this.iptabpreco = iptabpreco;
    }

    public BigDecimal getValorFretePadrao() {
        return valorFretePadrao;
    }

    public void setValorFretePadrao(BigDecimal valorFretePadrao) {
        this.valorFretePadrao = valorFretePadrao;
    }

    public String getAceitadesctmk() {
        return aceitadesctmk;
    }

    public void setAceitadesctmk(String aceitadesctmk) {
        this.aceitadesctmk = aceitadesctmk;
    }

    public String getDirwinthor() {
        return dirwinthor;
    }

    public void setDirwinthor(String dirwinthor) {
        this.dirwinthor = dirwinthor;
    }

    public String getDirwinthorremoto() {
        return dirwinthorremoto;
    }

    public void setDirwinthorremoto(String dirwinthorremoto) {
        this.dirwinthorremoto = dirwinthorremoto;
    }

    public Long getProxnumtransent() {
        return proxnumtransent;
    }

    public void setProxnumtransent(Long proxnumtransent) {
        this.proxnumtransent = proxnumtransent;
    }

    public Long getProxnumneg() {
        return proxnumneg;
    }

    public void setProxnumneg(Long proxnumneg) {
        this.proxnumneg = proxnumneg;
    }

    public BigDecimal getTaxa42() {
        return taxa42;
    }

    public void setTaxa42(BigDecimal taxa42) {
        this.taxa42 = taxa42;
    }

    public Long getCodcontantpag() {
        return codcontantpag;
    }

    public void setCodcontantpag(Long codcontantpag) {
        this.codcontantpag = codcontantpag;
    }

    public Long getCodcontrecjur() {
        return codcontrecjur;
    }

    public void setCodcontrecjur(Long codcontrecjur) {
        this.codcontrecjur = codcontrecjur;
    }

    public Long getCodcontpagjur() {
        return codcontpagjur;
    }

    public void setCodcontpagjur(Long codcontpagjur) {
        this.codcontpagjur = codcontpagjur;
    }

    public Long getCodcontajusteest() {
        return codcontajusteest;
    }

    public void setCodcontajusteest(Long codcontajusteest) {
        this.codcontajusteest = codcontajusteest;
    }

    public LocalDate getDtvenctt() {
        return dtvenctt;
    }

    public void setDtvenctt(LocalDate dtvenctt) {
        this.dtvenctt = dtvenctt;
    }

    public LocalDate getDtvenctk() {
        return dtvenctk;
    }

    public void setDtvenctk(LocalDate dtvenctk) {
        this.dtvenctk = dtvenctk;
    }

    public Long getNumordabas() {
        return numordabas;
    }

    public void setNumordabas(Long numordabas) {
        this.numordabas = numordabas;
    }

    public BigDecimal getPercapanha() {
        return percapanha;
    }

    public void setPercapanha(BigDecimal percapanha) {
        this.percapanha = percapanha;
    }

    public BigDecimal getVolumetransf() {
        return volumetransf;
    }

    public void setVolumetransf(BigDecimal volumetransf) {
        this.volumetransf = volumetransf;
    }

    public BigDecimal getPesotransf() {
        return pesotransf;
    }

    public void setPesotransf(BigDecimal pesotransf) {
        this.pesotransf = pesotransf;
    }

    public String getEntregaFutura() {
        return entregaFutura;
    }

    public void setEntregaFutura(String entregaFutura) {
        this.entregaFutura = entregaFutura;
    }

    public String getUsadvproduto() {
        return usadvproduto;
    }

    public void setUsadvproduto(String usadvproduto) {
        this.usadvproduto = usadvproduto;
    }

    public BigDecimal getMargemmin() {
        return margemmin;
    }

    public void setMargemmin(BigDecimal margemmin) {
        this.margemmin = margemmin;
    }

    public String getCalcjurosdesd() {
        return calcjurosdesd;
    }

    public void setCalcjurosdesd(String calcjurosdesd) {
        this.calcjurosdesd = calcjurosdesd;
    }

    public String getLeiturach() {
        return leiturach;
    }

    public void setLeiturach(String leiturach) {
        this.leiturach = leiturach;
    }

    public Integer getCodsetormotorista() {
        return codsetormotorista;
    }

    public void setCodsetormotorista(Integer codsetormotorista) {
        this.codsetormotorista = codsetormotorista;
    }

    public Integer getCodsetorcomprador() {
        return codsetorcomprador;
    }

    public void setCodsetorcomprador(Integer codsetorcomprador) {
        this.codsetorcomprador = codsetorcomprador;
    }

    public BigDecimal getLimcredinicial() {
        return limcredinicial;
    }

    public void setLimcredinicial(BigDecimal limcredinicial) {
        this.limcredinicial = limcredinicial;
    }

    public String getUsuariologon() {
        return usuariologon;
    }

    public void setUsuariologon(String usuariologon) {
        this.usuariologon = usuariologon;
    }

    public String getSenhalogon() {
        return senhalogon;
    }

    public void setSenhalogon(String senhalogon) {
        this.senhalogon = senhalogon;
    }

    public Long getCodcontemprest() {
        return codcontemprest;
    }

    public void setCodcontemprest(Long codcontemprest) {
        this.codcontemprest = codcontemprest;
    }

    public Integer getCodsetorexped() {
        return codsetorexped;
    }

    public void setCodsetorexped(Integer codsetorexped) {
        this.codsetorexped = codsetorexped;
    }

    public Long getCodcontalp() {
        return codcontalp;
    }

    public void setCodcontalp(Long codcontalp) {
        this.codcontalp = codcontalp;
    }

    public BigDecimal getMargemprev() {
        return margemprev;
    }

    public void setMargemprev(BigDecimal margemprev) {
        this.margemprev = margemprev;
    }

    public BigDecimal getVlmintarifabanc() {
        return vlmintarifabanc;
    }

    public void setVlmintarifabanc(BigDecimal vlmintarifabanc) {
        this.vlmintarifabanc = vlmintarifabanc;
    }

    public BigDecimal getVltarifa() {
        return vltarifa;
    }

    public void setVltarifa(BigDecimal vltarifa) {
        this.vltarifa = vltarifa;
    }

    public Long getCodcliconsumidor() {
        return codcliconsumidor;
    }

    public void setCodcliconsumidor(Long codcliconsumidor) {
        this.codcliconsumidor = codcliconsumidor;
    }

    public String getNumautomaticfor() {
        return numautomaticfor;
    }

    public void setNumautomaticfor(String numautomaticfor) {
        this.numautomaticfor = numautomaticfor;
    }

    public String getNumautomaticprod() {
        return numautomaticprod;
    }

    public void setNumautomaticprod(String numautomaticprod) {
        this.numautomaticprod = numautomaticprod;
    }

    public Integer getProxnumfornec() {
        return proxnumfornec;
    }

    public void setProxnumfornec(Integer proxnumfornec) {
        this.proxnumfornec = proxnumfornec;
    }

    public Integer getProxnumprodut() {
        return proxnumprodut;
    }

    public void setProxnumprodut(Integer proxnumprodut) {
        this.proxnumprodut = proxnumprodut;
    }

    public Short getPrazoentrega() {
        return prazoentrega;
    }

    public void setPrazoentrega(Short prazoentrega) {
        this.prazoentrega = prazoentrega;
    }

    public Short getTemrepos() {
        return temrepos;
    }

    public void setTemrepos(Short temrepos) {
        this.temrepos = temrepos;
    }

    public String getCgccliexclusivo() {
        return cgccliexclusivo;
    }

    public void setCgccliexclusivo(String cgccliexclusivo) {
        this.cgccliexclusivo = cgccliexclusivo;
    }

    public Short getNumdiasbloqautomatic() {
        return numdiasbloqautomatic;
    }

    public void setNumdiasbloqautomatic(Short numdiasbloqautomatic) {
        this.numdiasbloqautomatic = numdiasbloqautomatic;
    }

    public Short getNumdiasmindesppag() {
        return numdiasmindesppag;
    }

    public void setNumdiasmindesppag(Short numdiasmindesppag) {
        this.numdiasmindesppag = numdiasmindesppag;
    }

    public String getImpcartacobjuros() {
        return impcartacobjuros;
    }

    public void setImpcartacobjuros(String impcartacobjuros) {
        this.impcartacobjuros = impcartacobjuros;
    }

    public String getRateiodescbaixacr() {
        return rateiodescbaixacr;
    }

    public void setRateiodescbaixacr(String rateiodescbaixacr) {
        this.rateiodescbaixacr = rateiodescbaixacr;
    }

    public String getPermitirdesddevcli() {
        return permitirdesddevcli;
    }

    public void setPermitirdesddevcli(String permitirdesddevcli) {
        this.permitirdesddevcli = permitirdesddevcli;
    }

    public Integer getProxnumtransvendor() {
        return proxnumtransvendor;
    }

    public void setProxnumtransvendor(Integer proxnumtransvendor) {
        this.proxnumtransvendor = proxnumtransvendor;
    }

    public BigDecimal getTxvendorcli() {
        return txvendorcli;
    }

    public void setTxvendorcli(BigDecimal txvendorcli) {
        this.txvendorcli = txvendorcli;
    }

    public String getCalccredicms() {
        return calccredicms;
    }

    public void setCalccredicms(String calccredicms) {
        this.calccredicms = calccredicms;
    }

    public BigDecimal getPerbasevend() {
        return perbasevend;
    }

    public void setPerbasevend(BigDecimal perbasevend) {
        this.perbasevend = perbasevend;
    }

    public String getImpqtbonus() {
        return impqtbonus;
    }

    public void setImpqtbonus(String impqtbonus) {
        this.impqtbonus = impqtbonus;
    }

    public Short getNumdiascliinativ() {
        return numdiascliinativ;
    }

    public void setNumdiascliinativ(Short numdiascliinativ) {
        this.numdiascliinativ = numdiascliinativ;
    }

    public String getIndespelho() {
        return indespelho;
    }

    public void setIndespelho(String indespelho) {
        this.indespelho = indespelho;
    }

    public Short getNumcasasdeccusto() {
        return numcasasdeccusto;
    }

    public void setNumcasasdeccusto(Short numcasasdeccusto) {
        this.numcasasdeccusto = numcasasdeccusto;
    }

    public Long getCodcontareqmp() {
        return codcontareqmp;
    }

    public void setCodcontareqmp(Long codcontareqmp) {
        this.codcontareqmp = codcontareqmp;
    }

    public String getColunafluxocxcr1() {
        return colunafluxocxcr1;
    }

    public void setColunafluxocxcr1(String colunafluxocxcr1) {
        this.colunafluxocxcr1 = colunafluxocxcr1;
    }

    public String getColunafluxocxcr2() {
        return colunafluxocxcr2;
    }

    public void setColunafluxocxcr2(String colunafluxocxcr2) {
        this.colunafluxocxcr2 = colunafluxocxcr2;
    }

    public String getColunafluxocxcr3() {
        return colunafluxocxcr3;
    }

    public void setColunafluxocxcr3(String colunafluxocxcr3) {
        this.colunafluxocxcr3 = colunafluxocxcr3;
    }

    public String getColunafluxocxcr4() {
        return colunafluxocxcr4;
    }

    public void setColunafluxocxcr4(String colunafluxocxcr4) {
        this.colunafluxocxcr4 = colunafluxocxcr4;
    }

    public String getColunafluxocxcr5() {
        return colunafluxocxcr5;
    }

    public void setColunafluxocxcr5(String colunafluxocxcr5) {
        this.colunafluxocxcr5 = colunafluxocxcr5;
    }

    public Long getCodcontdevcli() {
        return codcontdevcli;
    }

    public void setCodcontdevcli(Long codcontdevcli) {
        this.codcontdevcli = codcontdevcli;
    }

    public Long getCodcontdebv() {
        return codcontdebv;
    }

    public void setCodcontdebv(Long codcontdebv) {
        this.codcontdebv = codcontdebv;
    }

    public String getAvisafaltaest() {
        return avisafaltaest;
    }

    public void setAvisafaltaest(String avisafaltaest) {
        this.avisafaltaest = avisafaltaest;
    }

    public String getPermitirdivnfduplic() {
        return permitirdivnfduplic;
    }

    public void setPermitirdivnfduplic(String permitirdivnfduplic) {
        this.permitirdivnfduplic = permitirdivnfduplic;
    }

    public LocalDate getDtproxfechames() {
        return dtproxfechames;
    }

    public void setDtproxfechames(LocalDate dtproxfechames) {
        this.dtproxfechames = dtproxfechames;
    }

    public String getDtvencantdesd() {
        return dtvencantdesd;
    }

    public void setDtvencantdesd(String dtvencantdesd) {
        this.dtvencantdesd = dtvencantdesd;
    }

    public String getIncdupjurosdesd() {
        return incdupjurosdesd;
    }

    public void setIncdupjurosdesd(String incdupjurosdesd) {
        this.incdupjurosdesd = incdupjurosdesd;
    }

    public String getPedvendadepto() {
        return pedvendadepto;
    }

    public void setPedvendadepto(String pedvendadepto) {
        this.pedvendadepto = pedvendadepto;
    }

    public String getDescvenda() {
        return descvenda;
    }

    public void setDescvenda(String descvenda) {
        this.descvenda = descvenda;
    }

    public String getAceitavendasemest() {
        return aceitavendasemest;
    }

    public void setAceitavendasemest(String aceitavendasemest) {
        this.aceitavendasemest = aceitavendasemest;
    }

    public Long getCodcontdescconc() {
        return codcontdescconc;
    }

    public void setCodcontdescconc(Long codcontdescconc) {
        this.codcontdescconc = codcontdescconc;
    }

    public String getBloqvendatp1tpf() {
        return bloqvendatp1tpf;
    }

    public void setBloqvendatp1tpf(String bloqvendatp1tpf) {
        this.bloqvendatp1tpf = bloqvendatp1tpf;
    }

    public String getNumautomaticcli() {
        return numautomaticcli;
    }

    public void setNumautomaticcli(String numautomaticcli) {
        this.numautomaticcli = numautomaticcli;
    }

    public Long getCodconticmsantecip() {
        return codconticmsantecip;
    }

    public void setCodconticmsantecip(Long codconticmsantecip) {
        this.codconticmsantecip = codconticmsantecip;
    }

    public String getAceitavendaaltusur() {
        return aceitavendaaltusur;
    }

    public void setAceitavendaaltusur(String aceitavendaaltusur) {
        this.aceitavendaaltusur = aceitavendaaltusur;
    }

    public String getTipoembalagem() {
        return tipoembalagem;
    }

    public void setTipoembalagem(String tipoembalagem) {
        this.tipoembalagem = tipoembalagem;
    }

    public String getEmitepedidovenda() {
        return emitepedidovenda;
    }

    public void setEmitepedidovenda(String emitepedidovenda) {
        this.emitepedidovenda = emitepedidovenda;
    }

    public String getSomaicmsantecipduplic() {
        return somaicmsantecipduplic;
    }

    public void setSomaicmsantecipduplic(String somaicmsantecipduplic) {
        this.somaicmsantecipduplic = somaicmsantecipduplic;
    }

    public String getAceitavendabloq() {
        return aceitavendabloq;
    }

    public void setAceitavendabloq(String aceitavendabloq) {
        this.aceitavendabloq = aceitavendabloq;
    }

    public Short getNumcasasdecestoque() {
        return numcasasdecestoque;
    }

    public void setNumcasasdecestoque(Short numcasasdecestoque) {
        this.numcasasdecestoque = numcasasdecestoque;
    }

    public String getUtilizaorcvenda() {
        return utilizaorcvenda;
    }

    public void setUtilizaorcvenda(String utilizaorcvenda) {
        this.utilizaorcvenda = utilizaorcvenda;
    }

    public Integer getProxnumtranscrfor() {
        return proxnumtranscrfor;
    }

    public void setProxnumtranscrfor(Integer proxnumtranscrfor) {
        this.proxnumtranscrfor = proxnumtranscrfor;
    }

    public Integer getProxnumaplic() {
        return proxnumaplic;
    }

    public void setProxnumaplic(Integer proxnumaplic) {
        this.proxnumaplic = proxnumaplic;
    }

    public Short getNumviasmapasep() {
        return numviasmapasep;
    }

    public void setNumviasmapasep(Short numviasmapasep) {
        this.numviasmapasep = numviasmapasep;
    }

    public Long getCodcontarebaixacusto() {
        return codcontarebaixacusto;
    }

    public void setCodcontarebaixacusto(Long codcontarebaixacusto) {
        this.codcontarebaixacusto = codcontarebaixacusto;
    }

    public Short getNumcasasdecvenda() {
        return numcasasdecvenda;
    }

    public void setNumcasasdecvenda(Short numcasasdecvenda) {
        this.numcasasdecvenda = numcasasdecvenda;
    }

    public Short getNumdiasuteissemana() {
        return numdiasuteissemana;
    }

    public void setNumdiasuteissemana(Short numdiasuteissemana) {
        this.numdiasuteissemana = numdiasuteissemana;
    }

    public String getTipocalcgirodia() {
        return tipocalcgirodia;
    }

    public void setTipocalcgirodia(String tipocalcgirodia) {
        this.tipocalcgirodia = tipocalcgirodia;
    }

    public Short getNumdiasuteistrimestre() {
        return numdiasuteistrimestre;
    }

    public void setNumdiasuteistrimestre(Short numdiasuteistrimestre) {
        this.numdiasuteistrimestre = numdiasuteistrimestre;
    }

    public BigDecimal getPercmaxdesccr() {
        return percmaxdesccr;
    }

    public void setPercmaxdesccr(BigDecimal percmaxdesccr) {
        this.percmaxdesccr = percmaxdesccr;
    }

    public String getTipocustotransf() {
        return tipocustotransf;
    }

    public void setTipocustotransf(String tipocustotransf) {
        this.tipocustotransf = tipocustotransf;
    }

    public BigDecimal getIndicecustotransf() {
        return indicecustotransf;
    }

    public void setIndicecustotransf(BigDecimal indicecustotransf) {
        this.indicecustotransf = indicecustotransf;
    }

    public String getTaxatabpr() {
        return taxatabpr;
    }

    public void setTaxatabpr(String taxatabpr) {
        this.taxatabpr = taxatabpr;
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

    public Long getCodcontarecdescarga() {
        return codcontarecdescarga;
    }

    public void setCodcontarecdescarga(Long codcontarecdescarga) {
        this.codcontarecdescarga = codcontarecdescarga;
    }

    public Integer getProxnumcustodia() {
        return proxnumcustodia;
    }

    public void setProxnumcustodia(Integer proxnumcustodia) {
        this.proxnumcustodia = proxnumcustodia;
    }

    public BigDecimal getVlmaxtarifabanc() {
        return vlmaxtarifabanc;
    }

    public void setVlmaxtarifabanc(BigDecimal vlmaxtarifabanc) {
        this.vlmaxtarifabanc = vlmaxtarifabanc;
    }

    public LocalDate getDtprocessamento() {
        return dtprocessamento;
    }

    public void setDtprocessamento(LocalDate dtprocessamento) {
        this.dtprocessamento = dtprocessamento;
    }

    public Integer getProxnumconhec() {
        return proxnumconhec;
    }

    public void setProxnumconhec(Integer proxnumconhec) {
        this.proxnumconhec = proxnumconhec;
    }

    public String getMontando() {
        return montando;
    }

    public void setMontando(String montando) {
        this.montando = montando;
    }

    public String getUsanumcarvendabalcao() {
        return usanumcarvendabalcao;
    }

    public void setUsanumcarvendabalcao(String usanumcarvendabalcao) {
        this.usanumcarvendabalcao = usanumcarvendabalcao;
    }

    public String getSomatarifabancduplic() {
        return somatarifabancduplic;
    }

    public void setSomatarifabancduplic(String somatarifabancduplic) {
        this.somatarifabancduplic = somatarifabancduplic;
    }

    public Long getCodcontarestcli() {
        return codcontarestcli;
    }

    public void setCodcontarestcli(Long codcontarestcli) {
        this.codcontarestcli = codcontarestcli;
    }

    public String getUsacredrca() {
        return usacredrca;
    }

    public void setUsacredrca(String usacredrca) {
        this.usacredrca = usacredrca;
    }

    public String getBloqprazomdvenda() {
        return bloqprazomdvenda;
    }

    public void setBloqprazomdvenda(String bloqprazomdvenda) {
        this.bloqprazomdvenda = bloqprazomdvenda;
    }

    public String getSomatarifabancnf() {
        return somatarifabancnf;
    }

    public void setSomatarifabancnf(String somatarifabancnf) {
        this.somatarifabancnf = somatarifabancnf;
    }

    public BigDecimal getVlminvenda() {
        return vlminvenda;
    }

    public void setVlminvenda(BigDecimal vlminvenda) {
        this.vlminvenda = vlminvenda;
    }

    public Short getNumdiasbloqchp() {
        return numdiasbloqchp;
    }

    public void setNumdiasbloqchp(Short numdiasbloqchp) {
        this.numdiasbloqchp = numdiasbloqchp;
    }

    public BigDecimal getPermaxvenda() {
        return permaxvenda;
    }

    public void setPermaxvenda(BigDecimal permaxvenda) {
        this.permaxvenda = permaxvenda;
    }

    public String getPermitedesccr() {
        return permitedesccr;
    }

    public void setPermitedesccr(String permitedesccr) {
        this.permitedesccr = permitedesccr;
    }

    public Long getCodcontadesccr() {
        return codcontadesccr;
    }

    public void setCodcontadesccr(Long codcontadesccr) {
        this.codcontadesccr = codcontadesccr;
    }

    public BigDecimal getPermaxdescvenda() {
        return permaxdescvenda;
    }

    public void setPermaxdescvenda(BigDecimal permaxdescvenda) {
        this.permaxdescvenda = permaxdescvenda;
    }

    public BigDecimal getPercmaxlibestoque() {
        return percmaxlibestoque;
    }

    public void setPercmaxlibestoque(BigDecimal percmaxlibestoque) {
        this.percmaxlibestoque = percmaxlibestoque;
    }

    public String getSaltarpaginarua() {
        return saltarpaginarua;
    }

    public void setSaltarpaginarua(String saltarpaginarua) {
        this.saltarpaginarua = saltarpaginarua;
    }

    public String getUtilizaembmaster() {
        return utilizaembmaster;
    }

    public void setUtilizaembmaster(String utilizaembmaster) {
        this.utilizaembmaster = utilizaembmaster;
    }

    public Short getOrdemmapa() {
        return ordemmapa;
    }

    public void setOrdemmapa(Short ordemmapa) {
        this.ordemmapa = ordemmapa;
    }

    public Short getFormmapa() {
        return formmapa;
    }

    public void setFormmapa(Short formmapa) {
        this.formmapa = formmapa;
    }

    public String getTiporelmapa() {
        return tiporelmapa;
    }

    public void setTiporelmapa(String tiporelmapa) {
        this.tiporelmapa = tiporelmapa;
    }

    public String getPermitealtcodcobvenda() {
        return permitealtcodcobvenda;
    }

    public void setPermitealtcodcobvenda(String permitealtcodcobvenda) {
        this.permitealtcodcobvenda = permitealtcodcobvenda;
    }

    public Integer getProxnuminventrot() {
        return proxnuminventrot;
    }

    public void setProxnuminventrot(Integer proxnuminventrot) {
        this.proxnuminventrot = proxnuminventrot;
    }

    public Integer getProxnummanif() {
        return proxnummanif;
    }

    public void setProxnummanif(Integer proxnummanif) {
        this.proxnummanif = proxnummanif;
    }

    public Short getQtmaxunidadepf() {
        return qtmaxunidadepf;
    }

    public void setQtmaxunidadepf(Short qtmaxunidadepf) {
        this.qtmaxunidadepf = qtmaxunidadepf;
    }

    public BigDecimal getVlbloqchd3() {
        return vlbloqchd3;
    }

    public void setVlbloqchd3(BigDecimal vlbloqchd3) {
        this.vlbloqchd3 = vlbloqchd3;
    }

    public Integer getCodsetorcallcenter() {
        return codsetorcallcenter;
    }

    public void setCodsetorcallcenter(Integer codsetorcallcenter) {
        this.codsetorcallcenter = codsetorcallcenter;
    }

    public String getCodcobinicial() {
        return codcobinicial;
    }

    public void setCodcobinicial(String codcobinicial) {
        this.codcobinicial = codcobinicial;
    }

    public String getEmitindomapa() {
        return emitindomapa;
    }

    public void setEmitindomapa(String emitindomapa) {
        this.emitindomapa = emitindomapa;
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

    public BigDecimal getCodsetordiretoria() {
        return codsetordiretoria;
    }

    public void setCodsetordiretoria(BigDecimal codsetordiretoria) {
        this.codsetordiretoria = codsetordiretoria;
    }

    public Short getNumdiasmaxdesd1210() {
        return numdiasmaxdesd1210;
    }

    public void setNumdiasmaxdesd1210(Short numdiasmaxdesd1210) {
        this.numdiasmaxdesd1210 = numdiasmaxdesd1210;
    }

    public Short getNumdiasmaxdesd402() {
        return numdiasmaxdesd402;
    }

    public void setNumdiasmaxdesd402(Short numdiasmaxdesd402) {
        this.numdiasmaxdesd402 = numdiasmaxdesd402;
    }

    public BigDecimal getVlminvendabk() {
        return vlminvendabk;
    }

    public void setVlminvendabk(BigDecimal vlminvendabk) {
        this.vlminvendabk = vlminvendabk;
    }

    public BigDecimal getTxiof() {
        return txiof;
    }

    public void setTxiof(BigDecimal txiof) {
        this.txiof = txiof;
    }

    public String getCodfilialcx() {
        return codfilialcx;
    }

    public void setCodfilialcx(String codfilialcx) {
        this.codfilialcx = codfilialcx;
    }

    public String getPermitecomprafornecbloq() {
        return permitecomprafornecbloq;
    }

    public void setPermitecomprafornecbloq(String permitecomprafornecbloq) {
        this.permitecomprafornecbloq = permitecomprafornecbloq;
    }

    public String getUsacomissaoporcliente() {
        return usacomissaoporcliente;
    }

    public void setUsacomissaoporcliente(String usacomissaoporcliente) {
        this.usacomissaoporcliente = usacomissaoporcliente;
    }

    public String getUsacomissaoporrca() {
        return usacomissaoporrca;
    }

    public void setUsacomissaoporrca(String usacomissaoporrca) {
        this.usacomissaoporrca = usacomissaoporrca;
    }

    public String getUsanumnfdevcli() {
        return usanumnfdevcli;
    }

    public void setUsanumnfdevcli(String usanumnfdevcli) {
        this.usanumnfdevcli = usanumnfdevcli;
    }

    public String getUsacreclivendabalcao() {
        return usacreclivendabalcao;
    }

    public void setUsacreclivendabalcao(String usacreclivendabalcao) {
        this.usacreclivendabalcao = usacreclivendabalcao;
    }

    public String getGerarcreclidevcli() {
        return gerarcreclidevcli;
    }

    public void setGerarcreclidevcli(String gerarcreclidevcli) {
        this.gerarcreclidevcli = gerarcreclidevcli;
    }

    public String getZeralimcredbloqautomatic() {
        return zeralimcredbloqautomatic;
    }

    public void setZeralimcredbloqautomatic(String zeralimcredbloqautomatic) {
        this.zeralimcredbloqautomatic = zeralimcredbloqautomatic;
    }

    public String getMudacobcliente() {
        return mudacobcliente;
    }

    public void setMudacobcliente(String mudacobcliente) {
        this.mudacobcliente = mudacobcliente;
    }

    public BigDecimal getPerdescmediovenda() {
        return perdescmediovenda;
    }

    public void setPerdescmediovenda(BigDecimal perdescmediovenda) {
        this.perdescmediovenda = perdescmediovenda;
    }

    public Short getCodhistadicomis() {
        return codhistadicomis;
    }

    public void setCodhistadicomis(Short codhistadicomis) {
        this.codhistadicomis = codhistadicomis;
    }

    public Short getCodhistfechcomis() {
        return codhistfechcomis;
    }

    public void setCodhistfechcomis(Short codhistfechcomis) {
        this.codhistfechcomis = codhistfechcomis;
    }

    public Short getCodhistfechcomisneg() {
        return codhistfechcomisneg;
    }

    public void setCodhistfechcomisneg(Short codhistfechcomisneg) {
        this.codhistfechcomisneg = codhistfechcomisneg;
    }

    public BigDecimal getLimcredinicialpf() {
        return limcredinicialpf;
    }

    public void setLimcredinicialpf(BigDecimal limcredinicialpf) {
        this.limcredinicialpf = limcredinicialpf;
    }

    public String getRebaixacustoultent() {
        return rebaixacustoultent;
    }

    public void setRebaixacustoultent(String rebaixacustoultent) {
        this.rebaixacustoultent = rebaixacustoultent;
    }

    public String getUsadescporquant() {
        return usadescporquant;
    }

    public void setUsadescporquant(String usadescporquant) {
        this.usadescporquant = usadescporquant;
    }

    public Short getNumregiaopadrao() {
        return numregiaopadrao;
    }

    public void setNumregiaopadrao(Short numregiaopadrao) {
        this.numregiaopadrao = numregiaopadrao;
    }

    public BigDecimal getPerdescmaxbalcao() {
        return perdescmaxbalcao;
    }

    public void setPerdescmaxbalcao(BigDecimal perdescmaxbalcao) {
        this.perdescmaxbalcao = perdescmaxbalcao;
    }

    public Long getCodcontaadiantfor() {
        return codcontaadiantfor;
    }

    public void setCodcontaadiantfor(Long codcontaadiantfor) {
        this.codcontaadiantfor = codcontaadiantfor;
    }

    public BigDecimal getPermaxpcompra() {
        return permaxpcompra;
    }

    public void setPermaxpcompra(BigDecimal permaxpcompra) {
        this.permaxpcompra = permaxpcompra;
    }

    public Short getNumdiasmaxcancnfsaida() {
        return numdiasmaxcancnfsaida;
    }

    public void setNumdiasmaxcancnfsaida(Short numdiasmaxcancnfsaida) {
        this.numdiasmaxcancnfsaida = numdiasmaxcancnfsaida;
    }

    public Short getNumdiasmaxcancnfent() {
        return numdiasmaxcancnfent;
    }

    public void setNumdiasmaxcancnfent(Short numdiasmaxcancnfent) {
        this.numdiasmaxcancnfent = numdiasmaxcancnfent;
    }

    public Integer getCodsetoropercx() {
        return codsetoropercx;
    }

    public void setCodsetoropercx(Integer codsetoropercx) {
        this.codsetoropercx = codsetoropercx;
    }

    public Integer getCodsetorfiscalcx() {
        return codsetorfiscalcx;
    }

    public void setCodsetorfiscalcx(Integer codsetorfiscalcx) {
        this.codsetorfiscalcx = codsetorfiscalcx;
    }

    public String getCaminhodir() {
        return caminhodir;
    }

    public void setCaminhodir(String caminhodir) {
        this.caminhodir = caminhodir;
    }

    public String getConsolidando() {
        return consolidando;
    }

    public void setConsolidando(String consolidando) {
        this.consolidando = consolidando;
    }

    public BigDecimal getPerlimvendapf() {
        return perlimvendapf;
    }

    public void setPerlimvendapf(BigDecimal perlimvendapf) {
        this.perlimvendapf = perlimvendapf;
    }

    public BigDecimal getPervendapf() {
        return pervendapf;
    }

    public void setPervendapf(BigDecimal pervendapf) {
        this.pervendapf = pervendapf;
    }

    public String getExibirpvenda() {
        return exibirpvenda;
    }

    public void setExibirpvenda(String exibirpvenda) {
        this.exibirpvenda = exibirpvenda;
    }

    public String getUsaicmsantecippvenda() {
        return usaicmsantecippvenda;
    }

    public void setUsaicmsantecippvenda(String usaicmsantecippvenda) {
        this.usaicmsantecippvenda = usaicmsantecippvenda;
    }

    public Long getCodcontacomissao() {
        return codcontacomissao;
    }

    public void setCodcontacomissao(Long codcontacomissao) {
        this.codcontacomissao = codcontacomissao;
    }

    public String getUsaestoquedepfechado() {
        return usaestoquedepfechado;
    }

    public void setUsaestoquedepfechado(String usaestoquedepfechado) {
        this.usaestoquedepfechado = usaestoquedepfechado;
    }

    public Short getPrazovalidadepedbalcao() {
        return prazovalidadepedbalcao;
    }

    public void setPrazovalidadepedbalcao(Short prazovalidadepedbalcao) {
        this.prazovalidadepedbalcao = prazovalidadepedbalcao;
    }

    public String getValidaprecominimo() {
        return validaprecominimo;
    }

    public void setValidaprecominimo(String validaprecominimo) {
        this.validaprecominimo = validaprecominimo;
    }

    public Short getNumdiasaltdtentrega() {
        return numdiasaltdtentrega;
    }

    public void setNumdiasaltdtentrega(Short numdiasaltdtentrega) {
        this.numdiasaltdtentrega = numdiasaltdtentrega;
    }

    public String getGeracontaspagardevcli() {
        return geracontaspagardevcli;
    }

    public void setGeracontaspagardevcli(String geracontaspagardevcli) {
        this.geracontaspagardevcli = geracontaspagardevcli;
    }

    public String getBloqpedlimcred() {
        return bloqpedlimcred;
    }

    public void setBloqpedlimcred(String bloqpedlimcred) {
        this.bloqpedlimcred = bloqpedlimcred;
    }

    public Integer getProxnumrca() {
        return proxnumrca;
    }

    public void setProxnumrca(Integer proxnumrca) {
        this.proxnumrca = proxnumrca;
    }

    public Long getCodcontaguiast() {
        return codcontaguiast;
    }

    public void setCodcontaguiast(Long codcontaguiast) {
        this.codcontaguiast = codcontaguiast;
    }

    public Long getProxnumindeniz() {
        return proxnumindeniz;
    }

    public void setProxnumindeniz(Long proxnumindeniz) {
        this.proxnumindeniz = proxnumindeniz;
    }

    public String getLiberarpedidopendente() {
        return liberarpedidopendente;
    }

    public void setLiberarpedidopendente(String liberarpedidopendente) {
        this.liberarpedidopendente = liberarpedidopendente;
    }

    public String getVerificalimcredcodcobd() {
        return verificalimcredcodcobd;
    }

    public void setVerificalimcredcodcobd(String verificalimcredcodcobd) {
        this.verificalimcredcodcobd = verificalimcredcodcobd;
    }

    public String getAbatefretevendabalcao() {
        return abatefretevendabalcao;
    }

    public void setAbatefretevendabalcao(String abatefretevendabalcao) {
        this.abatefretevendabalcao = abatefretevendabalcao;
    }

    public BigDecimal getVlmaxvendatlmkcodcobd() {
        return vlmaxvendatlmkcodcobd;
    }

    public void setVlmaxvendatlmkcodcobd(BigDecimal vlmaxvendatlmkcodcobd) {
        this.vlmaxvendatlmkcodcobd = vlmaxvendatlmkcodcobd;
    }

    public BigDecimal getPermaxdifentrada() {
        return permaxdifentrada;
    }

    public void setPermaxdifentrada(BigDecimal permaxdifentrada) {
        this.permaxdifentrada = permaxdifentrada;
    }

    public BigDecimal getPermindifentrada() {
        return permindifentrada;
    }

    public void setPermindifentrada(BigDecimal permindifentrada) {
        this.permindifentrada = permindifentrada;
    }

    public BigDecimal getVlmaxvenda() {
        return vlmaxvenda;
    }

    public void setVlmaxvenda(BigDecimal vlmaxvenda) {
        this.vlmaxvenda = vlmaxvenda;
    }

    public String getImpressaoautomatica() {
        return impressaoautomatica;
    }

    public void setImpressaoautomatica(String impressaoautomatica) {
        this.impressaoautomatica = impressaoautomatica;
    }

    public String getCondvenda1() {
        return condvenda1;
    }

    public void setCondvenda1(String condvenda1) {
        this.condvenda1 = condvenda1;
    }

    public String getCondvenda2() {
        return condvenda2;
    }

    public void setCondvenda2(String condvenda2) {
        this.condvenda2 = condvenda2;
    }

    public String getCondvenda3() {
        return condvenda3;
    }

    public void setCondvenda3(String condvenda3) {
        this.condvenda3 = condvenda3;
    }

    public String getCondvenda4() {
        return condvenda4;
    }

    public void setCondvenda4(String condvenda4) {
        this.condvenda4 = condvenda4;
    }

    public String getCondvenda5() {
        return condvenda5;
    }

    public void setCondvenda5(String condvenda5) {
        this.condvenda5 = condvenda5;
    }

    public String getCondvenda6() {
        return condvenda6;
    }

    public void setCondvenda6(String condvenda6) {
        this.condvenda6 = condvenda6;
    }

    public String getRebaixacustocomdescfin() {
        return rebaixacustocomdescfin;
    }

    public void setRebaixacustocomdescfin(String rebaixacustocomdescfin) {
        this.rebaixacustocomdescfin = rebaixacustocomdescfin;
    }

    public String getUsavalormedioentrada() {
        return usavalormedioentrada;
    }

    public void setUsavalormedioentrada(String usavalormedioentrada) {
        this.usavalormedioentrada = usavalormedioentrada;
    }

    public Long getProxnumsimulacaopcp() {
        return proxnumsimulacaopcp;
    }

    public void setProxnumsimulacaopcp(Long proxnumsimulacaopcp) {
        this.proxnumsimulacaopcp = proxnumsimulacaopcp;
    }

    public Integer getProxnumtira() {
        return proxnumtira;
    }

    public void setProxnumtira(Integer proxnumtira) {
        this.proxnumtira = proxnumtira;
    }

    public Integer getProxnumop() {
        return proxnumop;
    }

    public void setProxnumop(Integer proxnumop) {
        this.proxnumop = proxnumop;
    }

    public Long getCodcontacomissao3() {
        return codcontacomissao3;
    }

    public void setCodcontacomissao3(Long codcontacomissao3) {
        this.codcontacomissao3 = codcontacomissao3;
    }

    public BigDecimal getPerdescprom() {
        return perdescprom;
    }

    public void setPerdescprom(BigDecimal perdescprom) {
        this.perdescprom = perdescprom;
    }

    public Short getNdiasexpirasenha() {
        return ndiasexpirasenha;
    }

    public void setNdiasexpirasenha(Short ndiasexpirasenha) {
        this.ndiasexpirasenha = ndiasexpirasenha;
    }

    public String getMensagem1nf() {
        return mensagem1nf;
    }

    public void setMensagem1nf(String mensagem1nf) {
        this.mensagem1nf = mensagem1nf;
    }

    public String getMensagem2nf() {
        return mensagem2nf;
    }

    public void setMensagem2nf(String mensagem2nf) {
        this.mensagem2nf = mensagem2nf;
    }

    public Long getProxnumpcp() {
        return proxnumpcp;
    }

    public void setProxnumpcp(Long proxnumpcp) {
        this.proxnumpcp = proxnumpcp;
    }

    public Long getProxnumopi() {
        return proxnumopi;
    }

    public void setProxnumopi(Long proxnumopi) {
        this.proxnumopi = proxnumopi;
    }

    public BigDecimal getPercminjurosmora() {
        return percminjurosmora;
    }

    public void setPercminjurosmora(BigDecimal percminjurosmora) {
        this.percminjurosmora = percminjurosmora;
    }

    public BigDecimal getPercmaxjurosmora() {
        return percmaxjurosmora;
    }

    public void setPercmaxjurosmora(BigDecimal percmaxjurosmora) {
        this.percmaxjurosmora = percmaxjurosmora;
    }

    public String getImportandopedidos() {
        return importandopedidos;
    }

    public void setImportandopedidos(String importandopedidos) {
        this.importandopedidos = importandopedidos;
    }

    public String getSomadescclidescprod() {
        return somadescclidescprod;
    }

    public void setSomadescclidescprod(String somadescclidescprod) {
        this.somadescclidescprod = somadescclidescprod;
    }

    public Integer getPrazoadicionalmax() {
        return prazoadicionalmax;
    }

    public void setPrazoadicionalmax(Integer prazoadicionalmax) {
        this.prazoadicionalmax = prazoadicionalmax;
    }

    public String getExportandodados() {
        return exportandodados;
    }

    public void setExportandodados(String exportandodados) {
        this.exportandodados = exportandodados;
    }

    public String getUsacategoria() {
        return usacategoria;
    }

    public void setUsacategoria(String usacategoria) {
        this.usacategoria = usacategoria;
    }

    public Long getProxnumtransop() {
        return proxnumtransop;
    }

    public void setProxnumtransop(Long proxnumtransop) {
        this.proxnumtransop = proxnumtransop;
    }

    public String getPermiteiniciaropsemmp() {
        return permiteiniciaropsemmp;
    }

    public void setPermiteiniciaropsemmp(String permiteiniciaropsemmp) {
        this.permiteiniciaropsemmp = permiteiniciaropsemmp;
    }

    public Integer getProxnumrpa() {
        return proxnumrpa;
    }

    public void setProxnumrpa(Integer proxnumrpa) {
        this.proxnumrpa = proxnumrpa;
    }

    public BigDecimal getVlmaxvendapf() {
        return vlmaxvendapf;
    }

    public void setVlmaxvendapf(BigDecimal vlmaxvendapf) {
        this.vlmaxvendapf = vlmaxvendapf;
    }

    public Integer getProxnumcontrato() {
        return proxnumcontrato;
    }

    public void setProxnumcontrato(Integer proxnumcontrato) {
        this.proxnumcontrato = proxnumcontrato;
    }

    public String getBaixampnaentpa() {
        return baixampnaentpa;
    }

    public void setBaixampnaentpa(String baixampnaentpa) {
        this.baixampnaentpa = baixampnaentpa;
    }

    public Short getMudacobclientedias() {
        return mudacobclientedias;
    }

    public void setMudacobclientedias(Short mudacobclientedias) {
        this.mudacobclientedias = mudacobclientedias;
    }

    public String getAceitabktv3() {
        return aceitabktv3;
    }

    public void setAceitabktv3(String aceitabktv3) {
        this.aceitabktv3 = aceitabktv3;
    }

    public String getAlterarcontaajusteest() {
        return alterarcontaajusteest;
    }

    public void setAlterarcontaajusteest(String alterarcontaajusteest) {
        this.alterarcontaajusteest = alterarcontaajusteest;
    }

    public String getAreadeapanha() {
        return areadeapanha;
    }

    public void setAreadeapanha(String areadeapanha) {
        this.areadeapanha = areadeapanha;
    }

    public String getCondvenda7() {
        return condvenda7;
    }

    public void setCondvenda7(String condvenda7) {
        this.condvenda7 = condvenda7;
    }

    public String getCondvenda8() {
        return condvenda8;
    }

    public void setCondvenda8(String condvenda8) {
        this.condvenda8 = condvenda8;
    }

    public String getCondvenda9() {
        return condvenda9;
    }

    public void setCondvenda9(String condvenda9) {
        this.condvenda9 = condvenda9;
    }

    public String getCondvenda10() {
        return condvenda10;
    }

    public void setCondvenda10(String condvenda10) {
        this.condvenda10 = condvenda10;
    }

    public String getCondvenda11() {
        return condvenda11;
    }

    public void setCondvenda11(String condvenda11) {
        this.condvenda11 = condvenda11;
    }

    public String getCondvenda12() {
        return condvenda12;
    }

    public void setCondvenda12(String condvenda12) {
        this.condvenda12 = condvenda12;
    }

    public String getCondvenda13() {
        return condvenda13;
    }

    public void setCondvenda13(String condvenda13) {
        this.condvenda13 = condvenda13;
    }

    public String getCondvenda14() {
        return condvenda14;
    }

    public void setCondvenda14(String condvenda14) {
        this.condvenda14 = condvenda14;
    }

    public String getCalcstpf() {
        return calcstpf;
    }

    public void setCalcstpf(String calcstpf) {
        this.calcstpf = calcstpf;
    }

    public String getUtilizapercbaseredpf() {
        return utilizapercbaseredpf;
    }

    public void setUtilizapercbaseredpf(String utilizapercbaseredpf) {
        this.utilizapercbaseredpf = utilizapercbaseredpf;
    }

    public Long getCodcontaproducao() {
        return codcontaproducao;
    }

    public void setCodcontaproducao(Long codcontaproducao) {
        this.codcontaproducao = codcontaproducao;
    }

    public Long getCodcontaqualidade() {
        return codcontaqualidade;
    }

    public void setCodcontaqualidade(Long codcontaqualidade) {
        this.codcontaqualidade = codcontaqualidade;
    }

    public Short getNumviasfichacp() {
        return numviasfichacp;
    }

    public void setNumviasfichacp(Short numviasfichacp) {
        this.numviasfichacp = numviasfichacp;
    }

    public BigDecimal getPerctoleranciainteiro() {
        return perctoleranciainteiro;
    }

    public void setPerctoleranciainteiro(BigDecimal perctoleranciainteiro) {
        this.perctoleranciainteiro = perctoleranciainteiro;
    }

    public BigDecimal getPerctoleranciaquebrado() {
        return perctoleranciaquebrado;
    }

    public void setPerctoleranciaquebrado(BigDecimal perctoleranciaquebrado) {
        this.perctoleranciaquebrado = perctoleranciaquebrado;
    }

    public BigDecimal getPerctoleranciaimpureza() {
        return perctoleranciaimpureza;
    }

    public void setPerctoleranciaimpureza(BigDecimal perctoleranciaimpureza) {
        this.perctoleranciaimpureza = perctoleranciaimpureza;
    }

    public BigDecimal getPerctoleranciavermelho() {
        return perctoleranciavermelho;
    }

    public void setPerctoleranciavermelho(BigDecimal perctoleranciavermelho) {
        this.perctoleranciavermelho = perctoleranciavermelho;
    }

    public BigDecimal getPerctoleranciaumidade() {
        return perctoleranciaumidade;
    }

    public void setPerctoleranciaumidade(BigDecimal perctoleranciaumidade) {
        this.perctoleranciaumidade = perctoleranciaumidade;
    }

    public String getConsideracmvdevolucao() {
        return consideracmvdevolucao;
    }

    public void setConsideracmvdevolucao(String consideracmvdevolucao) {
        this.consideracmvdevolucao = consideracmvdevolucao;
    }

    public String getTipocustoajuste() {
        return tipocustoajuste;
    }

    public void setTipocustoajuste(String tipocustoajuste) {
        this.tipocustoajuste = tipocustoajuste;
    }

    public Long getCodcontamanutcusto() {
        return codcontamanutcusto;
    }

    public void setCodcontamanutcusto(Long codcontamanutcusto) {
        this.codcontamanutcusto = codcontamanutcusto;
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

    public String getValidadvcodbarra() {
        return validadvcodbarra;
    }

    public void setValidadvcodbarra(String validadvcodbarra) {
        this.validadvcodbarra = validadvcodbarra;
    }

    public String getDesdobrarcadiferente() {
        return desdobrarcadiferente;
    }

    public void setDesdobrarcadiferente(String desdobrarcadiferente) {
        this.desdobrarcadiferente = desdobrarcadiferente;
    }

    public String getCalccredpiscofins() {
        return calccredpiscofins;
    }

    public void setCalccredpiscofins(String calccredpiscofins) {
        this.calccredpiscofins = calccredpiscofins;
    }

    public String getTipocalcst() {
        return tipocalcst;
    }

    public void setTipocalcst(String tipocalcst) {
        this.tipocalcst = tipocalcst;
    }

    public Short getTipobaixacobmag() {
        return tipobaixacobmag;
    }

    public void setTipobaixacobmag(Short tipobaixacobmag) {
        this.tipobaixacobmag = tipobaixacobmag;
    }

    public Short getNumdiasmaxfatura() {
        return numdiasmaxfatura;
    }

    public void setNumdiasmaxfatura(Short numdiasmaxfatura) {
        this.numdiasmaxfatura = numdiasmaxfatura;
    }

    public String getNumcustodiaautomatic() {
        return numcustodiaautomatic;
    }

    public void setNumcustodiaautomatic(String numcustodiaautomatic) {
        this.numcustodiaautomatic = numcustodiaautomatic;
    }

    public String getDirimportacaofv() {
        return dirimportacaofv;
    }

    public void setDirimportacaofv(String dirimportacaofv) {
        this.dirimportacaofv = dirimportacaofv;
    }

    public String getDirexportacaofv() {
        return direxportacaofv;
    }

    public void setDirexportacaofv(String direxportacaofv) {
        this.direxportacaofv = direxportacaofv;
    }

    public String getPrecoporembalagem() {
        return precoporembalagem;
    }

    public void setPrecoporembalagem(String precoporembalagem) {
        this.precoporembalagem = precoporembalagem;
    }

    public String getUtilizaautorcpagar() {
        return utilizaautorcpagar;
    }

    public void setUtilizaautorcpagar(String utilizaautorcpagar) {
        this.utilizaautorcpagar = utilizaautorcpagar;
    }

    public String getUsaprzadicionalvenda() {
        return usaprzadicionalvenda;
    }

    public void setUsaprzadicionalvenda(String usaprzadicionalvenda) {
        this.usaprzadicionalvenda = usaprzadicionalvenda;
    }

    public Integer getProxnumlote() {
        return proxnumlote;
    }

    public void setProxnumlote(Integer proxnumlote) {
        this.proxnumlote = proxnumlote;
    }

    public Integer getProxnumlotemp() {
        return proxnumlotemp;
    }

    public void setProxnumlotemp(Integer proxnumlotemp) {
        this.proxnumlotemp = proxnumlotemp;
    }

    public Integer getProxnumloteem() {
        return proxnumloteem;
    }

    public void setProxnumloteem(Integer proxnumloteem) {
        this.proxnumloteem = proxnumloteem;
    }

    public String getAcrescimopfcomie() {
        return acrescimopfcomie;
    }

    public void setAcrescimopfcomie(String acrescimopfcomie) {
        this.acrescimopfcomie = acrescimopfcomie;
    }

    public String getPermitepedcompraunidmaster() {
        return permitepedcompraunidmaster;
    }

    public void setPermitepedcompraunidmaster(String permitepedcompraunidmaster) {
        this.permitepedcompraunidmaster = permitepedcompraunidmaster;
    }

    public String getPermitealtplpagvenda() {
        return permitealtplpagvenda;
    }

    public void setPermitealtplpagvenda(String permitealtplpagvenda) {
        this.permitealtplpagvenda = permitealtplpagvenda;
    }

    public String getValidapvendabonific() {
        return validapvendabonific;
    }

    public void setValidapvendabonific(String validapvendabonific) {
        this.validapvendabonific = validapvendabonific;
    }

    public String getPermitealtdtvencentmerc() {
        return permitealtdtvencentmerc;
    }

    public void setPermitealtdtvencentmerc(String permitealtdtvencentmerc) {
        this.permitealtdtvencentmerc = permitealtdtvencentmerc;
    }

    public String getCalculacustoentpa() {
        return calculacustoentpa;
    }

    public void setCalculacustoentpa(String calculacustoentpa) {
        this.calculacustoentpa = calculacustoentpa;
    }

    public Short getNumcasasdecinventario() {
        return numcasasdecinventario;
    }

    public void setNumcasasdecinventario(Short numcasasdecinventario) {
        this.numcasasdecinventario = numcasasdecinventario;
    }

    public Short getCodplpaginicial() {
        return codplpaginicial;
    }

    public void setCodplpaginicial(Short codplpaginicial) {
        this.codplpaginicial = codplpaginicial;
    }

    public Long getCodcontaperdaestoque() {
        return codcontaperdaestoque;
    }

    public void setCodcontaperdaestoque(Long codcontaperdaestoque) {
        this.codcontaperdaestoque = codcontaperdaestoque;
    }

    public String getBonificaltdebcredrca() {
        return bonificaltdebcredrca;
    }

    public void setBonificaltdebcredrca(String bonificaltdebcredrca) {
        this.bonificaltdebcredrca = bonificaltdebcredrca;
    }

    public String getUsanfcomplementarbk() {
        return usanfcomplementarbk;
    }

    public void setUsanfcomplementarbk(String usanfcomplementarbk) {
        this.usanfcomplementarbk = usanfcomplementarbk;
    }

    public String getCodfilialfv() {
        return codfilialfv;
    }

    public void setCodfilialfv(String codfilialfv) {
        this.codfilialfv = codfilialfv;
    }

    public String getPermitepedcompramultiplo() {
        return permitepedcompramultiplo;
    }

    public void setPermitepedcompramultiplo(String permitepedcompramultiplo) {
        this.permitepedcompramultiplo = permitepedcompramultiplo;
    }

    public String getCondvenda20() {
        return condvenda20;
    }

    public void setCondvenda20(String condvenda20) {
        this.condvenda20 = condvenda20;
    }

    public BigDecimal getVlpaletedescarg() {
        return vlpaletedescarg;
    }

    public void setVlpaletedescarg(BigDecimal vlpaletedescarg) {
        this.vlpaletedescarg = vlpaletedescarg;
    }

    public String getAlterarfilialentpa() {
        return alterarfilialentpa;
    }

    public void setAlterarfilialentpa(String alterarfilialentpa) {
        this.alterarfilialentpa = alterarfilialentpa;
    }

    public String getBloquearentpa() {
        return bloquearentpa;
    }

    public void setBloquearentpa(String bloquearentpa) {
        this.bloquearentpa = bloquearentpa;
    }

    public Integer getProxnumordemtransf() {
        return proxnumordemtransf;
    }

    public void setProxnumordemtransf(Integer proxnumordemtransf) {
        this.proxnumordemtransf = proxnumordemtransf;
    }

    public String getBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(String bloqueio) {
        this.bloqueio = bloqueio;
    }

    public String getPermitedevolreqnormal() {
        return permitedevolreqnormal;
    }

    public void setPermitedevolreqnormal(String permitedevolreqnormal) {
        this.permitedevolreqnormal = permitedevolreqnormal;
    }

    public String getBloqestoquetransf() {
        return bloqestoquetransf;
    }

    public void setBloqestoquetransf(String bloqestoquetransf) {
        this.bloqestoquetransf = bloqestoquetransf;
    }

    public String getUsatributacaoporuf() {
        return usatributacaoporuf;
    }

    public void setUsatributacaoporuf(String usatributacaoporuf) {
        this.usatributacaoporuf = usatributacaoporuf;
    }

    public String getGeranftipo8() {
        return geranftipo8;
    }

    public void setGeranftipo8(String geranftipo8) {
        this.geranftipo8 = geranftipo8;
    }

    public BigDecimal getPerexcedelimcred() {
        return perexcedelimcred;
    }

    public void setPerexcedelimcred(BigDecimal perexcedelimcred) {
        this.perexcedelimcred = perexcedelimcred;
    }

    public String getGerarnumloteautomaticpa() {
        return gerarnumloteautomaticpa;
    }

    public void setGerarnumloteautomaticpa(String gerarnumloteautomaticpa) {
        this.gerarnumloteautomaticpa = gerarnumloteautomaticpa;
    }

    public String getImprimirespelhoentmerc() {
        return imprimirespelhoentmerc;
    }

    public void setImprimirespelhoentmerc(String imprimirespelhoentmerc) {
        this.imprimirespelhoentmerc = imprimirespelhoentmerc;
    }

    public String getDirarquivointegracao() {
        return dirarquivointegracao;
    }

    public void setDirarquivointegracao(String dirarquivointegracao) {
        this.dirarquivointegracao = dirarquivointegracao;
    }

    public Integer getCodsetorembalador() {
        return codsetorembalador;
    }

    public void setCodsetorembalador(Integer codsetorembalador) {
        this.codsetorembalador = codsetorembalador;
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

    public String getUsacomissaoporlinhaprod() {
        return usacomissaoporlinhaprod;
    }

    public void setUsacomissaoporlinhaprod(String usacomissaoporlinhaprod) {
        this.usacomissaoporlinhaprod = usacomissaoporlinhaprod;
    }

    public String getUsadescporlinhaprod() {
        return usadescporlinhaprod;
    }

    public void setUsadescporlinhaprod(String usadescporlinhaprod) {
        this.usadescporlinhaprod = usadescporlinhaprod;
    }

    public String getSomaqtpedvenda() {
        return somaqtpedvenda;
    }

    public void setSomaqtpedvenda(String somaqtpedvenda) {
        this.somaqtpedvenda = somaqtpedvenda;
    }

    public String getUsawms() {
        return usawms;
    }

    public void setUsawms(String usawms) {
        this.usawms = usawms;
    }

    public String getUsamapseprua() {
        return usamapseprua;
    }

    public void setUsamapseprua(String usamapseprua) {
        this.usamapseprua = usamapseprua;
    }

    public String getUsaoutrasmoedas() {
        return usaoutrasmoedas;
    }

    public void setUsaoutrasmoedas(String usaoutrasmoedas) {
        this.usaoutrasmoedas = usaoutrasmoedas;
    }

    public String getSomentecodbarrasconfped() {
        return somentecodbarrasconfped;
    }

    public void setSomentecodbarrasconfped(String somentecodbarrasconfped) {
        this.somentecodbarrasconfped = somentecodbarrasconfped;
    }

    public String getSomentecodbarrasbonus() {
        return somentecodbarrasbonus;
    }

    public void setSomentecodbarrasbonus(String somentecodbarrasbonus) {
        this.somentecodbarrasbonus = somentecodbarrasbonus;
    }

    public String getTipogeracaodadospcauxpro() {
        return tipogeracaodadospcauxpro;
    }

    public void setTipogeracaodadospcauxpro(String tipogeracaodadospcauxpro) {
        this.tipogeracaodadospcauxpro = tipogeracaodadospcauxpro;
    }

    public String getControlaedicaopedidocompra() {
        return controlaedicaopedidocompra;
    }

    public void setControlaedicaopedidocompra(String controlaedicaopedidocompra) {
        this.controlaedicaopedidocompra = controlaedicaopedidocompra;
    }

    public Short getPrazoedicaopedidocompra() {
        return prazoedicaopedidocompra;
    }

    public void setPrazoedicaopedidocompra(Short prazoedicaopedidocompra) {
        this.prazoedicaopedidocompra = prazoedicaopedidocompra;
    }

    public Long getProxnumpesquisa() {
        return proxnumpesquisa;
    }

    public void setProxnumpesquisa(Long proxnumpesquisa) {
        this.proxnumpesquisa = proxnumpesquisa;
    }

    public String getAtualizacondcompedcompra() {
        return atualizacondcompedcompra;
    }

    public void setAtualizacondcompedcompra(String atualizacondcompedcompra) {
        this.atualizacondcompedcompra = atualizacondcompedcompra;
    }

    public Long getProxnumtranswms() {
        return proxnumtranswms;
    }

    public void setProxnumtranswms(Long proxnumtranswms) {
        this.proxnumtranswms = proxnumtranswms;
    }

    public String getAceitavendabalcaoestneg() {
        return aceitavendabalcaoestneg;
    }

    public void setAceitavendabalcaoestneg(String aceitavendabalcaoestneg) {
        this.aceitavendabalcaoestneg = aceitavendabalcaoestneg;
    }

    public String getUtilizaguiaproprianfent() {
        return utilizaguiaproprianfent;
    }

    public void setUtilizaguiaproprianfent(String utilizaguiaproprianfent) {
        this.utilizaguiaproprianfent = utilizaguiaproprianfent;
    }

    public String getBloqf6pedvendabalcao() {
        return bloqf6pedvendabalcao;
    }

    public void setBloqf6pedvendabalcao(String bloqf6pedvendabalcao) {
        this.bloqf6pedvendabalcao = bloqf6pedvendabalcao;
    }

    public String getUtilizapercfinprecoprom() {
        return utilizapercfinprecoprom;
    }

    public void setUtilizapercfinprecoprom(String utilizapercfinprecoprom) {
        this.utilizapercfinprecoprom = utilizapercfinprecoprom;
    }

    public String getPerguntarsomaqtpedvenda() {
        return perguntarsomaqtpedvenda;
    }

    public void setPerguntarsomaqtpedvenda(String perguntarsomaqtpedvenda) {
        this.perguntarsomaqtpedvenda = perguntarsomaqtpedvenda;
    }

    public Short getProxcodpraca() {
        return proxcodpraca;
    }

    public void setProxcodpraca(Short proxcodpraca) {
        this.proxcodpraca = proxcodpraca;
    }

    public String getCodpracaautomatic() {
        return codpracaautomatic;
    }

    public void setCodpracaautomatic(String codpracaautomatic) {
        this.codpracaautomatic = codpracaautomatic;
    }

    public Short getProxcodusur() {
        return proxcodusur;
    }

    public void setProxcodusur(Short proxcodusur) {
        this.proxcodusur = proxcodusur;
    }

    public String getCodusurautomatic() {
        return codusurautomatic;
    }

    public void setCodusurautomatic(String codusurautomatic) {
        this.codusurautomatic = codusurautomatic;
    }

    public Integer getCodsetordiretorio() {
        return codsetordiretorio;
    }

    public void setCodsetordiretorio(Integer codsetordiretorio) {
        this.codsetordiretorio = codsetordiretorio;
    }

    public Integer getProxnumlotecustodia() {
        return proxnumlotecustodia;
    }

    public void setProxnumlotecustodia(Integer proxnumlotecustodia) {
        this.proxnumlotecustodia = proxnumlotecustodia;
    }

    public String getInfnumverbapedbonific() {
        return infnumverbapedbonific;
    }

    public void setInfnumverbapedbonific(String infnumverbapedbonific) {
        this.infnumverbapedbonific = infnumverbapedbonific;
    }

    public Integer getQtdeminimausoasterisco936() {
        return qtdeminimausoasterisco936;
    }

    public void setQtdeminimausoasterisco936(Integer qtdeminimausoasterisco936) {
        this.qtdeminimausoasterisco936 = qtdeminimausoasterisco936;
    }

    public String getUtilizacontrolelote() {
        return utilizacontrolelote;
    }

    public void setUtilizacontrolelote(String utilizacontrolelote) {
        this.utilizacontrolelote = utilizacontrolelote;
    }

    public String getPermiteplpagtosuperior() {
        return permiteplpagtosuperior;
    }

    public void setPermiteplpagtosuperior(String permiteplpagtosuperior) {
        this.permiteplpagtosuperior = permiteplpagtosuperior;
    }

    public String getPermitevariospedidosorcamento() {
        return permitevariospedidosorcamento;
    }

    public void setPermitevariospedidosorcamento(String permitevariospedidosorcamento) {
        this.permitevariospedidosorcamento = permitevariospedidosorcamento;
    }

    public String getUtilizapcusurfornec() {
        return utilizapcusurfornec;
    }

    public void setUtilizapcusurfornec(String utilizapcusurfornec) {
        this.utilizapcusurfornec = utilizapcusurfornec;
    }

    public String getTipocalcipi() {
        return tipocalcipi;
    }

    public void setTipocalcipi(String tipocalcipi) {
        this.tipocalcipi = tipocalcipi;
    }

    public String getUsacontroleemissaonf() {
        return usacontroleemissaonf;
    }

    public void setUsacontroleemissaonf(String usacontroleemissaonf) {
        this.usacontroleemissaonf = usacontroleemissaonf;
    }

    public Short getNumdiasmaxemissaonf() {
        return numdiasmaxemissaonf;
    }

    public void setNumdiasmaxemissaonf(Short numdiasmaxemissaonf) {
        this.numdiasmaxemissaonf = numdiasmaxemissaonf;
    }

    public String getCheckoutmapaemitido() {
        return checkoutmapaemitido;
    }

    public void setCheckoutmapaemitido(String checkoutmapaemitido) {
        this.checkoutmapaemitido = checkoutmapaemitido;
    }

    public BigDecimal getPermaxrodape() {
        return permaxrodape;
    }

    public void setPermaxrodape(BigDecimal permaxrodape) {
        this.permaxrodape = permaxrodape;
    }

    public String getTempomaxcancel() {
        return tempomaxcancel;
    }

    public void setTempomaxcancel(String tempomaxcancel) {
        this.tempomaxcancel = tempomaxcancel;
    }

    public BigDecimal getValorsangria1() {
        return valorsangria1;
    }

    public void setValorsangria1(BigDecimal valorsangria1) {
        this.valorsangria1 = valorsangria1;
    }

    public BigDecimal getValorsangria2() {
        return valorsangria2;
    }

    public void setValorsangria2(BigDecimal valorsangria2) {
        this.valorsangria2 = valorsangria2;
    }

    public String getDefinirloteop() {
        return definirloteop;
    }

    public void setDefinirloteop(String definirloteop) {
        this.definirloteop = definirloteop;
    }

    public String getDvobrigatorio() {
        return dvobrigatorio;
    }

    public void setDvobrigatorio(String dvobrigatorio) {
        this.dvobrigatorio = dvobrigatorio;
    }

    public String getLiberaestfechbonus() {
        return liberaestfechbonus;
    }

    public void setLiberaestfechbonus(String liberaestfechbonus) {
        this.liberaestfechbonus = liberaestfechbonus;
    }

    public String getCustoindustria() {
        return custoindustria;
    }

    public void setCustoindustria(String custoindustria) {
        this.custoindustria = custoindustria;
    }

    public Long getProxnumtransavulsa() {
        return proxnumtransavulsa;
    }

    public void setProxnumtransavulsa(Long proxnumtransavulsa) {
        this.proxnumtransavulsa = proxnumtransavulsa;
    }

    public String getTiponumnfentrada() {
        return tiponumnfentrada;
    }

    public void setTiponumnfentrada(String tiponumnfentrada) {
        this.tiponumnfentrada = tiponumnfentrada;
    }

    public String getBloqdespvlrorc() {
        return bloqdespvlrorc;
    }

    public void setBloqdespvlrorc(String bloqdespvlrorc) {
        this.bloqdespvlrorc = bloqdespvlrorc;
    }

    public String getAtualizacustoultentransf() {
        return atualizacustoultentransf;
    }

    public void setAtualizacustoultentransf(String atualizacustoultentransf) {
        this.atualizacustoultentransf = atualizacustoultentransf;
    }

    public String getVerificarclientesrede() {
        return verificarclientesrede;
    }

    public void setVerificarclientesrede(String verificarclientesrede) {
        this.verificarclientesrede = verificarclientesrede;
    }

    public String getUsardescontovendacodbarra() {
        return usardescontovendacodbarra;
    }

    public void setUsardescontovendacodbarra(String usardescontovendacodbarra) {
        this.usardescontovendacodbarra = usardescontovendacodbarra;
    }

    public BigDecimal getVlmaxpedidopf() {
        return vlmaxpedidopf;
    }

    public void setVlmaxpedidopf(BigDecimal vlmaxpedidopf) {
        this.vlmaxpedidopf = vlmaxpedidopf;
    }

    public String getUtilizafilialregiaocx() {
        return utilizafilialregiaocx;
    }

    public void setUtilizafilialregiaocx(String utilizafilialregiaocx) {
        this.utilizafilialregiaocx = utilizafilialregiaocx;
    }

    public String getRestringenumitensnf() {
        return restringenumitensnf;
    }

    public void setRestringenumitensnf(String restringenumitensnf) {
        this.restringenumitensnf = restringenumitensnf;
    }

    public String getVerificarlimvendapf() {
        return verificarlimvendapf;
    }

    public void setVerificarlimvendapf(String verificarlimvendapf) {
        this.verificarlimvendapf = verificarlimvendapf;
    }

    public String getAceitavendapf() {
        return aceitavendapf;
    }

    public void setAceitavendapf(String aceitavendapf) {
        this.aceitavendapf = aceitavendapf;
    }

    public String getVerificaestoquecont() {
        return verificaestoquecont;
    }

    public void setVerificaestoquecont(String verificaestoquecont) {
        this.verificaestoquecont = verificaestoquecont;
    }

    public String getMostrarpvendasemst() {
        return mostrarpvendasemst;
    }

    public void setMostrarpvendasemst(String mostrarpvendasemst) {
        this.mostrarpvendasemst = mostrarpvendasemst;
    }

    public String getTipoenderecamento() {
        return tipoenderecamento;
    }

    public void setTipoenderecamento(String tipoenderecamento) {
        this.tipoenderecamento = tipoenderecamento;
    }

    public String getIniciaropsemem() {
        return iniciaropsemem;
    }

    public void setIniciaropsemem(String iniciaropsemem) {
        this.iniciaropsemem = iniciaropsemem;
    }

    public Long getCodcontadespesaproducao() {
        return codcontadespesaproducao;
    }

    public void setCodcontadespesaproducao(Long codcontadespesaproducao) {
        this.codcontadespesaproducao = codcontadespesaproducao;
    }

    public Long getCodcontadesenvolvimento() {
        return codcontadesenvolvimento;
    }

    public void setCodcontadesenvolvimento(Long codcontadesenvolvimento) {
        this.codcontadesenvolvimento = codcontadesenvolvimento;
    }

    public Long getCodcontaamostras() {
        return codcontaamostras;
    }

    public void setCodcontaamostras(Long codcontaamostras) {
        this.codcontaamostras = codcontaamostras;
    }

    public Short getNumdiasmaxemissaocp() {
        return numdiasmaxemissaocp;
    }

    public void setNumdiasmaxemissaocp(Short numdiasmaxemissaocp) {
        this.numdiasmaxemissaocp = numdiasmaxemissaocp;
    }

    public String getTipomapawmsvendabalcao() {
        return tipomapawmsvendabalcao;
    }

    public void setTipomapawmsvendabalcao(String tipomapawmsvendabalcao) {
        this.tipomapawmsvendabalcao = tipomapawmsvendabalcao;
    }

    public String getInserirreducaoz() {
        return inserirreducaoz;
    }

    public void setInserirreducaoz(String inserirreducaoz) {
        this.inserirreducaoz = inserirreducaoz;
    }

    public Short getNumdiasalteralivro() {
        return numdiasalteralivro;
    }

    public void setNumdiasalteralivro(Short numdiasalteralivro) {
        this.numdiasalteralivro = numdiasalteralivro;
    }

    public String getLimparobsnfdevol() {
        return limparobsnfdevol;
    }

    public void setLimparobsnfdevol(String limparobsnfdevol) {
        this.limparobsnfdevol = limparobsnfdevol;
    }

    public String getReducaobcisenta() {
        return reducaobcisenta;
    }

    public void setReducaobcisenta(String reducaobcisenta) {
        this.reducaobcisenta = reducaobcisenta;
    }

    public BigDecimal getLimitearredondamento() {
        return limitearredondamento;
    }

    public void setLimitearredondamento(BigDecimal limitearredondamento) {
        this.limitearredondamento = limitearredondamento;
    }

    public String getSiglaespecie() {
        return siglaespecie;
    }

    public void setSiglaespecie(String siglaespecie) {
        this.siglaespecie = siglaespecie;
    }

    public String getSiglaserie() {
        return siglaserie;
    }

    public void setSiglaserie(String siglaserie) {
        this.siglaserie = siglaserie;
    }

    public String getCodcontabilcf() {
        return codcontabilcf;
    }

    public void setCodcontabilcf(String codcontabilcf) {
        this.codcontabilcf = codcontabilcf;
    }

    public String getInserirmapa() {
        return inserirmapa;
    }

    public void setInserirmapa(String inserirmapa) {
        this.inserirmapa = inserirmapa;
    }

    public String getInserircupom() {
        return inserircupom;
    }

    public void setInserircupom(String inserircupom) {
        this.inserircupom = inserircupom;
    }

    public Short getNumdiasmaxcancbordero() {
        return numdiasmaxcancbordero;
    }

    public void setNumdiasmaxcancbordero(Short numdiasmaxcancbordero) {
        this.numdiasmaxcancbordero = numdiasmaxcancbordero;
    }

    public Short getNumdiaspagtoretro() {
        return numdiaspagtoretro;
    }

    public void setNumdiaspagtoretro(Short numdiaspagtoretro) {
        this.numdiaspagtoretro = numdiaspagtoretro;
    }

    public Integer getProxnumlotereagente() {
        return proxnumlotereagente;
    }

    public void setProxnumlotereagente(Integer proxnumlotereagente) {
        this.proxnumlotereagente = proxnumlotereagente;
    }

    public String getConsideraisentoscomopf() {
        return consideraisentoscomopf;
    }

    public void setConsideraisentoscomopf(String consideraisentoscomopf) {
        this.consideraisentoscomopf = consideraisentoscomopf;
    }

    public String getUtilizavendaporembalagem() {
        return utilizavendaporembalagem;
    }

    public void setUtilizavendaporembalagem(String utilizavendaporembalagem) {
        this.utilizavendaporembalagem = utilizavendaporembalagem;
    }

    public String getAplicaacrescpftv3() {
        return aplicaacrescpftv3;
    }

    public void setAplicaacrescpftv3(String aplicaacrescpftv3) {
        this.aplicaacrescpftv3 = aplicaacrescpftv3;
    }

    public String getAplicatxfimautorizacao() {
        return aplicatxfimautorizacao;
    }

    public void setAplicatxfimautorizacao(String aplicatxfimautorizacao) {
        this.aplicatxfimautorizacao = aplicatxfimautorizacao;
    }

    public String getBasecreddebrcaautori() {
        return basecreddebrcaautori;
    }

    public void setBasecreddebrcaautori(String basecreddebrcaautori) {
        this.basecreddebrcaautori = basecreddebrcaautori;
    }

    public String getTarjamagneticaobrigatoria() {
        return tarjamagneticaobrigatoria;
    }

    public void setTarjamagneticaobrigatoria(String tarjamagneticaobrigatoria) {
        this.tarjamagneticaobrigatoria = tarjamagneticaobrigatoria;
    }

    public String getLimparbasecalcentrada() {
        return limparbasecalcentrada;
    }

    public void setLimparbasecalcentrada(String limparbasecalcentrada) {
        this.limparbasecalcentrada = limparbasecalcentrada;
    }

    public String getBloqlibpedmargemneg() {
        return bloqlibpedmargemneg;
    }

    public void setBloqlibpedmargemneg(String bloqlibpedmargemneg) {
        this.bloqlibpedmargemneg = bloqlibpedmargemneg;
    }

    public String getBloqlibpedcomdesconto() {
        return bloqlibpedcomdesconto;
    }

    public void setBloqlibpedcomdesconto(String bloqlibpedcomdesconto) {
        this.bloqlibpedcomdesconto = bloqlibpedcomdesconto;
    }

    public String getAutenticardoc() {
        return autenticardoc;
    }

    public void setAutenticardoc(String autenticardoc) {
        this.autenticardoc = autenticardoc;
    }

    public String getVerificamargemlibpedido() {
        return verificamargemlibpedido;
    }

    public void setVerificamargemlibpedido(String verificamargemlibpedido) {
        this.verificamargemlibpedido = verificamargemlibpedido;
    }

    public Short getPrazofatalmed() {
        return prazofatalmed;
    }

    public void setPrazofatalmed(Short prazofatalmed) {
        this.prazofatalmed = prazofatalmed;
    }

    public String getTipoaliqoutrasdesp() {
        return tipoaliqoutrasdesp;
    }

    public void setTipoaliqoutrasdesp(String tipoaliqoutrasdesp) {
        this.tipoaliqoutrasdesp = tipoaliqoutrasdesp;
    }

    public Short getNumdiasmaxacertarcarga() {
        return numdiasmaxacertarcarga;
    }

    public void setNumdiasmaxacertarcarga(Short numdiasmaxacertarcarga) {
        this.numdiasmaxacertarcarga = numdiasmaxacertarcarga;
    }

    public String getAbatefreteprecominimo() {
        return abatefreteprecominimo;
    }

    public void setAbatefreteprecominimo(String abatefreteprecominimo) {
        this.abatefreteprecominimo = abatefreteprecominimo;
    }

    public BigDecimal getVlminvendatv3() {
        return vlminvendatv3;
    }

    public void setVlminvendatv3(BigDecimal vlminvendatv3) {
        this.vlminvendatv3 = vlminvendatv3;
    }

    public String getDivideprzadicionalparcelas() {
        return divideprzadicionalparcelas;
    }

    public void setDivideprzadicionalparcelas(String divideprzadicionalparcelas) {
        this.divideprzadicionalparcelas = divideprzadicionalparcelas;
    }

    public String getSomacomissaocmv() {
        return somacomissaocmv;
    }

    public void setSomacomissaocmv(String somacomissaocmv) {
        this.somacomissaocmv = somacomissaocmv;
    }

    public Integer getCodmotvisitapadraocallcenter() {
        return codmotvisitapadraocallcenter;
    }

    public void setCodmotvisitapadraocallcenter(Integer codmotvisitapadraocallcenter) {
        this.codmotvisitapadraocallcenter = codmotvisitapadraocallcenter;
    }

    public String getTipoentregapadraocallcenter() {
        return tipoentregapadraocallcenter;
    }

    public void setTipoentregapadraocallcenter(String tipoentregapadraocallcenter) {
        this.tipoentregapadraocallcenter = tipoentregapadraocallcenter;
    }

    public String getTipoperiodogirodia() {
        return tipoperiodogirodia;
    }

    public void setTipoperiodogirodia(String tipoperiodogirodia) {
        this.tipoperiodogirodia = tipoperiodogirodia;
    }

    public String getCalcularstcomipi() {
        return calcularstcomipi;
    }

    public void setCalcularstcomipi(String calcularstcomipi) {
        this.calcularstcomipi = calcularstcomipi;
    }

    public String getTipovalorgirodia() {
        return tipovalorgirodia;
    }

    public void setTipovalorgirodia(String tipovalorgirodia) {
        this.tipovalorgirodia = tipovalorgirodia;
    }

    public String getSomadespfinitemcf() {
        return somadespfinitemcf;
    }

    public void setSomadespfinitemcf(String somadespfinitemcf) {
        this.somadespfinitemcf = somadespfinitemcf;
    }

    public String getCfop5929isento() {
        return cfop5929isento;
    }

    public void setCfop5929isento(String cfop5929isento) {
        this.cfop5929isento = cfop5929isento;
    }

    public String getIecliexclusiva() {
        return iecliexclusiva;
    }

    public void setIecliexclusiva(String iecliexclusiva) {
        this.iecliexclusiva = iecliexclusiva;
    }

    public BigDecimal getPercicmfrete() {
        return percicmfrete;
    }

    public void setPercicmfrete(BigDecimal percicmfrete) {
        this.percicmfrete = percicmfrete;
    }

    public Integer getCodfiscalfrete() {
        return codfiscalfrete;
    }

    public void setCodfiscalfrete(Integer codfiscalfrete) {
        this.codfiscalfrete = codfiscalfrete;
    }

    public BigDecimal getPercicminterfrete() {
        return percicminterfrete;
    }

    public void setPercicminterfrete(BigDecimal percicminterfrete) {
        this.percicminterfrete = percicminterfrete;
    }

    public Integer getCodfiscalinterfrete() {
        return codfiscalinterfrete;
    }

    public void setCodfiscalinterfrete(Integer codfiscalinterfrete) {
        this.codfiscalinterfrete = codfiscalinterfrete;
    }

    public String getCobrarvltarifaparc1() {
        return cobrarvltarifaparc1;
    }

    public void setCobrarvltarifaparc1(String cobrarvltarifaparc1) {
        this.cobrarvltarifaparc1 = cobrarvltarifaparc1;
    }

    public String getGravarobsclientenopedido() {
        return gravarobsclientenopedido;
    }

    public void setGravarobsclientenopedido(String gravarobsclientenopedido) {
        this.gravarobsclientenopedido = gravarobsclientenopedido;
    }

    public String getSomavltarifaitensnf() {
        return somavltarifaitensnf;
    }

    public void setSomavltarifaitensnf(String somavltarifaitensnf) {
        this.somavltarifaitensnf = somavltarifaitensnf;
    }

    public String getRestringenumviasnf() {
        return restringenumviasnf;
    }

    public void setRestringenumviasnf(String restringenumviasnf) {
        this.restringenumviasnf = restringenumviasnf;
    }

    public String getTipoabasprev() {
        return tipoabasprev;
    }

    public void setTipoabasprev(String tipoabasprev) {
        this.tipoabasprev = tipoabasprev;
    }

    public BigDecimal getPercacrescimocustoreal() {
        return percacrescimocustoreal;
    }

    public void setPercacrescimocustoreal(BigDecimal percacrescimocustoreal) {
        this.percacrescimocustoreal = percacrescimocustoreal;
    }

    public BigDecimal getPercacrescimocustofin() {
        return percacrescimocustofin;
    }

    public void setPercacrescimocustofin(BigDecimal percacrescimocustofin) {
        this.percacrescimocustofin = percacrescimocustofin;
    }

    public Short getNumdiaspagchqcancel() {
        return numdiaspagchqcancel;
    }

    public void setNumdiaspagchqcancel(Short numdiaspagchqcancel) {
        this.numdiaspagchqcancel = numdiaspagchqcancel;
    }

    public String getVerlanctobcochq() {
        return verlanctobcochq;
    }

    public void setVerlanctobcochq(String verlanctobcochq) {
        this.verlanctobcochq = verlanctobcochq;
    }

    public String getAtualizacliultalter1203() {
        return atualizacliultalter1203;
    }

    public void setAtualizacliultalter1203(String atualizacliultalter1203) {
        this.atualizacliultalter1203 = atualizacliultalter1203;
    }

    public Long getCodcontaperda() {
        return codcontaperda;
    }

    public void setCodcontaperda(Long codcontaperda) {
        this.codcontaperda = codcontaperda;
    }

    public Long getCodcontarestrca() {
        return codcontarestrca;
    }

    public void setCodcontarestrca(Long codcontarestrca) {
        this.codcontarestrca = codcontarestrca;
    }

    public String getPermitevendaecf402() {
        return permitevendaecf402;
    }

    public void setPermitevendaecf402(String permitevendaecf402) {
        this.permitevendaecf402 = permitevendaecf402;
    }

    public String getPckabastecido() {
        return pckabastecido;
    }

    public void setPckabastecido(String pckabastecido) {
        this.pckabastecido = pckabastecido;
    }

    public BigDecimal getFaixainiteor() {
        return faixainiteor;
    }

    public void setFaixainiteor(BigDecimal faixainiteor) {
        this.faixainiteor = faixainiteor;
    }

    public BigDecimal getFaixafimteor() {
        return faixafimteor;
    }

    public void setFaixafimteor(BigDecimal faixafimteor) {
        this.faixafimteor = faixafimteor;
    }

    public String getChecardiasuteistitpgnlib() {
        return checardiasuteistitpgnlib;
    }

    public void setChecardiasuteistitpgnlib(String checardiasuteistitpgnlib) {
        this.checardiasuteistitpgnlib = checardiasuteistitpgnlib;
    }

    public String getUsaconversaoembalagem() {
        return usaconversaoembalagem;
    }

    public void setUsaconversaoembalagem(String usaconversaoembalagem) {
        this.usaconversaoembalagem = usaconversaoembalagem;
    }

    public LocalDate getDtultimageracaoserasa() {
        return dtultimageracaoserasa;
    }

    public void setDtultimageracaoserasa(LocalDate dtultimageracaoserasa) {
        this.dtultimageracaoserasa = dtultimageracaoserasa;
    }

    public Short getSegmentoserasa() {
        return segmentoserasa;
    }

    public void setSegmentoserasa(Short segmentoserasa) {
        this.segmentoserasa = segmentoserasa;
    }

    public Short getPrazovalidadeorcamento() {
        return prazovalidadeorcamento;
    }

    public void setPrazovalidadeorcamento(Short prazovalidadeorcamento) {
        this.prazovalidadeorcamento = prazovalidadeorcamento;
    }

    public BigDecimal getPercmaxdescdesd() {
        return percmaxdescdesd;
    }

    public void setPercmaxdescdesd(BigDecimal percmaxdescdesd) {
        this.percmaxdescdesd = percmaxdescdesd;
    }

    public String getVerificapesomaxpalete() {
        return verificapesomaxpalete;
    }

    public void setVerificapesomaxpalete(String verificapesomaxpalete) {
        this.verificapesomaxpalete = verificapesomaxpalete;
    }

    public BigDecimal getPesomaxpalete() {
        return pesomaxpalete;
    }

    public void setPesomaxpalete(BigDecimal pesomaxpalete) {
        this.pesomaxpalete = pesomaxpalete;
    }

    public String getBloquearendinvent() {
        return bloquearendinvent;
    }

    public void setBloquearendinvent(String bloquearendinvent) {
        this.bloquearendinvent = bloquearendinvent;
    }

    public String getBloqueaprodent() {
        return bloqueaprodent;
    }

    public void setBloqueaprodent(String bloqueaprodent) {
        this.bloqueaprodent = bloqueaprodent;
    }

    public String getTipovlminvendabk() {
        return tipovlminvendabk;
    }

    public void setTipovlminvendabk(String tipovlminvendabk) {
        this.tipovlminvendabk = tipovlminvendabk;
    }

    public Short getDepositovirtual() {
        return depositovirtual;
    }

    public void setDepositovirtual(Short depositovirtual) {
        this.depositovirtual = depositovirtual;
    }

    public String getAtualizarpcprodutbonific() {
        return atualizarpcprodutbonific;
    }

    public void setAtualizarpcprodutbonific(String atualizarpcprodutbonific) {
        this.atualizarpcprodutbonific = atualizarpcprodutbonific;
    }

    public String getPermitirdesdtitvencsemjuros() {
        return permitirdesdtitvencsemjuros;
    }

    public void setPermitirdesdtitvencsemjuros(String permitirdesdtitvencsemjuros) {
        this.permitirdesdtitvencsemjuros = permitirdesdtitvencsemjuros;
    }

    public String getUtilizaliberacaopedcompra() {
        return utilizaliberacaopedcompra;
    }

    public void setUtilizaliberacaopedcompra(String utilizaliberacaopedcompra) {
        this.utilizaliberacaopedcompra = utilizaliberacaopedcompra;
    }

    public String getUsapercdifqtent() {
        return usapercdifqtent;
    }

    public void setUsapercdifqtent(String usapercdifqtent) {
        this.usapercdifqtent = usapercdifqtent;
    }

    public Short getPercdifqtent() {
        return percdifqtent;
    }

    public void setPercdifqtent(Short percdifqtent) {
        this.percdifqtent = percdifqtent;
    }

    public Short getMaxprzmediodesdcp() {
        return maxprzmediodesdcp;
    }

    public void setMaxprzmediodesdcp(Short maxprzmediodesdcp) {
        this.maxprzmediodesdcp = maxprzmediodesdcp;
    }

    public String getBloqitenscorte936() {
        return bloqitenscorte936;
    }

    public void setBloqitenscorte936(String bloqitenscorte936) {
        this.bloqitenscorte936 = bloqitenscorte936;
    }

    public Long getCodcontaverbafornec() {
        return codcontaverbafornec;
    }

    public void setCodcontaverbafornec(Long codcontaverbafornec) {
        this.codcontaverbafornec = codcontaverbafornec;
    }

    public String getUtilizacheckout936() {
        return utilizacheckout936;
    }

    public void setUtilizacheckout936(String utilizacheckout936) {
        this.utilizacheckout936 = utilizacheckout936;
    }

    public String getVerificanivelvenda402() {
        return verificanivelvenda402;
    }

    public void setVerificanivelvenda402(String verificanivelvenda402) {
        this.verificanivelvenda402 = verificanivelvenda402;
    }

    public Short getNumdiasmaxprorrog() {
        return numdiasmaxprorrog;
    }

    public void setNumdiasmaxprorrog(Short numdiasmaxprorrog) {
        this.numdiasmaxprorrog = numdiasmaxprorrog;
    }

    public BigDecimal getVlmincancitemcupom() {
        return vlmincancitemcupom;
    }

    public void setVlmincancitemcupom(BigDecimal vlmincancitemcupom) {
        this.vlmincancitemcupom = vlmincancitemcupom;
    }

    public BigDecimal getVlmincanccupom() {
        return vlmincanccupom;
    }

    public void setVlmincanccupom(BigDecimal vlmincanccupom) {
        this.vlmincanccupom = vlmincanccupom;
    }

    public String getValidaruffilial() {
        return validaruffilial;
    }

    public void setValidaruffilial(String validaruffilial) {
        this.validaruffilial = validaruffilial;
    }

    public String getGeraparcelamentotef() {
        return geraparcelamentotef;
    }

    public void setGeraparcelamentotef(String geraparcelamentotef) {
        this.geraparcelamentotef = geraparcelamentotef;
    }

    public String getMantemnossonumbco402() {
        return mantemnossonumbco402;
    }

    public void setMantemnossonumbco402(String mantemnossonumbco402) {
        this.mantemnossonumbco402 = mantemnossonumbco402;
    }

    public String getReplicarprecoporembalagem() {
        return replicarprecoporembalagem;
    }

    public void setReplicarprecoporembalagem(String replicarprecoporembalagem) {
        this.replicarprecoporembalagem = replicarprecoporembalagem;
    }

    public String getPermitecodbarraduplicado() {
        return permitecodbarraduplicado;
    }

    public void setPermitecodbarraduplicado(String permitecodbarraduplicado) {
        this.permitecodbarraduplicado = permitecodbarraduplicado;
    }

    public String getPedidocompraporpalete() {
        return pedidocompraporpalete;
    }

    public void setPedidocompraporpalete(String pedidocompraporpalete) {
        this.pedidocompraporpalete = pedidocompraporpalete;
    }

    public String getFechabonusemrecibodesc() {
        return fechabonusemrecibodesc;
    }

    public void setFechabonusemrecibodesc(String fechabonusemrecibodesc) {
        this.fechabonusemrecibodesc = fechabonusemrecibodesc;
    }

    public Short getNummaxnftransf() {
        return nummaxnftransf;
    }

    public void setNummaxnftransf(Short nummaxnftransf) {
        this.nummaxnftransf = nummaxnftransf;
    }

    public String getPermitecrdevfornec() {
        return permitecrdevfornec;
    }

    public void setPermitecrdevfornec(String permitecrdevfornec) {
        this.permitecrdevfornec = permitecrdevfornec;
    }

    public String getControlaprodutivsep() {
        return controlaprodutivsep;
    }

    public void setControlaprodutivsep(String controlaprodutivsep) {
        this.controlaprodutivsep = controlaprodutivsep;
    }

    public Long getProxnumborderocr() {
        return proxnumborderocr;
    }

    public void setProxnumborderocr(Long proxnumborderocr) {
        this.proxnumborderocr = proxnumborderocr;
    }

    public String getIncluidesprodapenf() {
        return incluidesprodapenf;
    }

    public void setIncluidesprodapenf(String incluidesprodapenf) {
        this.incluidesprodapenf = incluidesprodapenf;
    }

    public BigDecimal getPermaxindenizpedido() {
        return permaxindenizpedido;
    }

    public void setPermaxindenizpedido(BigDecimal permaxindenizpedido) {
        this.permaxindenizpedido = permaxindenizpedido;
    }

    public String getValidaestoquemapasep() {
        return validaestoquemapasep;
    }

    public void setValidaestoquemapasep(String validaestoquemapasep) {
        this.validaestoquemapasep = validaestoquemapasep;
    }

    public String getDesbloquearprodfimos() {
        return desbloquearprodfimos;
    }

    public void setDesbloquearprodfimos(String desbloquearprodfimos) {
        this.desbloquearprodfimos = desbloquearprodfimos;
    }

    public String getLancardespvendorautomatico() {
        return lancardespvendorautomatico;
    }

    public void setLancardespvendorautomatico(String lancardespvendorautomatico) {
        this.lancardespvendorautomatico = lancardespvendorautomatico;
    }

    public String getCalculagirotransf() {
        return calculagirotransf;
    }

    public void setCalculagirotransf(String calculagirotransf) {
        this.calculagirotransf = calculagirotransf;
    }

    public String getUsatecladogertec() {
        return usatecladogertec;
    }

    public void setUsatecladogertec(String usatecladogertec) {
        this.usatecladogertec = usatecladogertec;
    }

    public LocalDate getDtexpiracaowinthor() {
        return dtexpiracaowinthor;
    }

    public void setDtexpiracaowinthor(LocalDate dtexpiracaowinthor) {
        this.dtexpiracaowinthor = dtexpiracaowinthor;
    }

    public String getAbaterimpostoscomissaorca() {
        return abaterimpostoscomissaorca;
    }

    public void setAbaterimpostoscomissaorca(String abaterimpostoscomissaorca) {
        this.abaterimpostoscomissaorca = abaterimpostoscomissaorca;
    }

    public String getAutenticaracertocx() {
        return autenticaracertocx;
    }

    public void setAutenticaracertocx(String autenticaracertocx) {
        this.autenticaracertocx = autenticaracertocx;
    }

    public String getImprimedescontocf() {
        return imprimedescontocf;
    }

    public void setImprimedescontocf(String imprimedescontocf) {
        this.imprimedescontocf = imprimedescontocf;
    }

    public String getTipotaxavendor() {
        return tipotaxavendor;
    }

    public void setTipotaxavendor(String tipotaxavendor) {
        this.tipotaxavendor = tipotaxavendor;
    }

    public String getSeparacaoflowrack() {
        return separacaoflowrack;
    }

    public void setSeparacaoflowrack(String separacaoflowrack) {
        this.separacaoflowrack = separacaoflowrack;
    }

    public Short getNumitensos() {
        return numitensos;
    }

    public void setNumitensos(Short numitensos) {
        this.numitensos = numitensos;
    }

    public String getFtpIp() {
        return ftpIp;
    }

    public void setFtpIp(String ftpIp) {
        this.ftpIp = ftpIp;
    }

    public Integer getFtpPorta() {
        return ftpPorta;
    }

    public void setFtpPorta(Integer ftpPorta) {
        this.ftpPorta = ftpPorta;
    }

    public String getFtpConexaopassiva() {
        return ftpConexaopassiva;
    }

    public void setFtpConexaopassiva(String ftpConexaopassiva) {
        this.ftpConexaopassiva = ftpConexaopassiva;
    }

    public String getMantemnossonumbco1210() {
        return mantemnossonumbco1210;
    }

    public void setMantemnossonumbco1210(String mantemnossonumbco1210) {
        this.mantemnossonumbco1210 = mantemnossonumbco1210;
    }

    public String getCalcfreteporitem() {
        return calcfreteporitem;
    }

    public void setCalcfreteporitem(String calcfreteporitem) {
        this.calcfreteporitem = calcfreteporitem;
    }

    public String getConsideraricmsantecipcusto() {
        return consideraricmsantecipcusto;
    }

    public void setConsideraricmsantecipcusto(String consideraricmsantecipcusto) {
        this.consideraricmsantecipcusto = consideraricmsantecipcusto;
    }

    public String getUsanegfornec() {
        return usanegfornec;
    }

    public void setUsanegfornec(String usanegfornec) {
        this.usanegfornec = usanegfornec;
    }

    public String getTipocalcsulframa() {
        return tipocalcsulframa;
    }

    public void setTipocalcsulframa(String tipocalcsulframa) {
        this.tipocalcsulframa = tipocalcsulframa;
    }

    public String getAceitacnpjexclusivofornec() {
        return aceitacnpjexclusivofornec;
    }

    public void setAceitacnpjexclusivofornec(String aceitacnpjexclusivofornec) {
        this.aceitacnpjexclusivofornec = aceitacnpjexclusivofornec;
    }

    public String getLiberaestentmerc() {
        return liberaestentmerc;
    }

    public void setLiberaestentmerc(String liberaestentmerc) {
        this.liberaestentmerc = liberaestentmerc;
    }

    public Integer getCodfiscaldevoutrasdesp() {
        return codfiscaldevoutrasdesp;
    }

    public void setCodfiscaldevoutrasdesp(Integer codfiscaldevoutrasdesp) {
        this.codfiscaldevoutrasdesp = codfiscaldevoutrasdesp;
    }

    public Integer getCodfiscalinterdevoutrasdesp() {
        return codfiscalinterdevoutrasdesp;
    }

    public void setCodfiscalinterdevoutrasdesp(Integer codfiscalinterdevoutrasdesp) {
        this.codfiscalinterdevoutrasdesp = codfiscalinterdevoutrasdesp;
    }

    public String getUtilizaboletopreimpr() {
        return utilizaboletopreimpr;
    }

    public void setUtilizaboletopreimpr(String utilizaboletopreimpr) {
        this.utilizaboletopreimpr = utilizaboletopreimpr;
    }

    public String getVerificadatahoraecf() {
        return verificadatahoraecf;
    }

    public void setVerificadatahoraecf(String verificadatahoraecf) {
        this.verificadatahoraecf = verificadatahoraecf;
    }

    public String getUtilizaqtfracionadaconf() {
        return utilizaqtfracionadaconf;
    }

    public void setUtilizaqtfracionadaconf(String utilizaqtfracionadaconf) {
        this.utilizaqtfracionadaconf = utilizaqtfracionadaconf;
    }

    public String getSomacompraprevfluxocx() {
        return somacompraprevfluxocx;
    }

    public void setSomacompraprevfluxocx(String somacompraprevfluxocx) {
        this.somacompraprevfluxocx = somacompraprevfluxocx;
    }

    public String getObterpreferenciacliecf() {
        return obterpreferenciacliecf;
    }

    public void setObterpreferenciacliecf(String obterpreferenciacliecf) {
        this.obterpreferenciacliecf = obterpreferenciacliecf;
    }

    public String getTipoaplicrepasse() {
        return tipoaplicrepasse;
    }

    public void setTipoaplicrepasse(String tipoaplicrepasse) {
        this.tipoaplicrepasse = tipoaplicrepasse;
    }

    public BigDecimal getPermaxdescitemcf() {
        return permaxdescitemcf;
    }

    public void setPermaxdescitemcf(BigDecimal permaxdescitemcf) {
        this.permaxdescitemcf = permaxdescitemcf;
    }

    public String getCalciofvendorcomposto() {
        return calciofvendorcomposto;
    }

    public void setCalciofvendorcomposto(String calciofvendorcomposto) {
        this.calciofvendorcomposto = calciofvendorcomposto;
    }

    public String getGerardadosreducaoz() {
        return gerardadosreducaoz;
    }

    public void setGerardadosreducaoz(String gerardadosreducaoz) {
        this.gerardadosreducaoz = gerardadosreducaoz;
    }

    public String getVerificapickingarm() {
        return verificapickingarm;
    }

    public void setVerificapickingarm(String verificapickingarm) {
        this.verificapickingarm = verificapickingarm;
    }

    public String getValidanumserieequipecf() {
        return validanumserieequipecf;
    }

    public void setValidanumserieequipecf(String validanumserieequipecf) {
        this.validanumserieequipecf = validanumserieequipecf;
    }

    public String getDeduziravariaestcomdevcli() {
        return deduziravariaestcomdevcli;
    }

    public void setDeduziravariaestcomdevcli(String deduziravariaestcomdevcli) {
        this.deduziravariaestcomdevcli = deduziravariaestcomdevcli;
    }

    public String getAlterarprecoplpagamento() {
        return alterarprecoplpagamento;
    }

    public void setAlterarprecoplpagamento(String alterarprecoplpagamento) {
        this.alterarprecoplpagamento = alterarprecoplpagamento;
    }

    public LocalDate getDtviradawms() {
        return dtviradawms;
    }

    public void setDtviradawms(LocalDate dtviradawms) {
        this.dtviradawms = dtviradawms;
    }

    public Short getPrazomaxdtentrega() {
        return prazomaxdtentrega;
    }

    public void setPrazomaxdtentrega(Short prazomaxdtentrega) {
        this.prazomaxdtentrega = prazomaxdtentrega;
    }

    public String getComissaorcatipovenda() {
        return comissaorcatipovenda;
    }

    public void setComissaorcatipovenda(String comissaorcatipovenda) {
        this.comissaorcatipovenda = comissaorcatipovenda;
    }

    public String getExpedepaletefechadodiretobox() {
        return expedepaletefechadodiretobox;
    }

    public void setExpedepaletefechadodiretobox(String expedepaletefechadodiretobox) {
        this.expedepaletefechadodiretobox = expedepaletefechadodiretobox;
    }

    public String getUsacontrolefornecpedcompra() {
        return usacontrolefornecpedcompra;
    }

    public void setUsacontrolefornecpedcompra(String usacontrolefornecpedcompra) {
        this.usacontrolefornecpedcompra = usacontrolefornecpedcompra;
    }

    public String getEnderecacombonusaberto() {
        return enderecacombonusaberto;
    }

    public void setEnderecacombonusaberto(String enderecacombonusaberto) {
        this.enderecacombonusaberto = enderecacombonusaberto;
    }

    public Short getPesosuppalete() {
        return pesosuppalete;
    }

    public void setPesosuppalete(Short pesosuppalete) {
        this.pesosuppalete = pesosuppalete;
    }

    public String getTipotxboleto() {
        return tipotxboleto;
    }

    public void setTipotxboleto(String tipotxboleto) {
        this.tipotxboleto = tipotxboleto;
    }

    public String getUtilizarembunitsintegra() {
        return utilizarembunitsintegra;
    }

    public void setUtilizarembunitsintegra(String utilizarembunitsintegra) {
        this.utilizarembunitsintegra = utilizarembunitsintegra;
    }

    public String getExigedtvalidadebonusrm() {
        return exigedtvalidadebonusrm;
    }

    public void setExigedtvalidadebonusrm(String exigedtvalidadebonusrm) {
        this.exigedtvalidadebonusrm = exigedtvalidadebonusrm;
    }

    public String getUsareducaocomissaorca() {
        return usareducaocomissaorca;
    }

    public void setUsareducaocomissaorca(String usareducaocomissaorca) {
        this.usareducaocomissaorca = usareducaocomissaorca;
    }

    public String getBloqdevcli() {
        return bloqdevcli;
    }

    public void setBloqdevcli(String bloqdevcli) {
        this.bloqdevcli = bloqdevcli;
    }

    public Short getQtdegerlivro() {
        return qtdegerlivro;
    }

    public void setQtdegerlivro(Short qtdegerlivro) {
        this.qtdegerlivro = qtdegerlivro;
    }

    public String getGravapcmensaltcadcli() {
        return gravapcmensaltcadcli;
    }

    public void setGravapcmensaltcadcli(String gravapcmensaltcadcli) {
        this.gravapcmensaltcadcli = gravapcmensaltcadcli;
    }

    public String getEnviamensrcalibest() {
        return enviamensrcalibest;
    }

    public void setEnviamensrcalibest(String enviamensrcalibest) {
        this.enviamensrcalibest = enviamensrcalibest;
    }

    public String getUsachavetriplapcpedi() {
        return usachavetriplapcpedi;
    }

    public void setUsachavetriplapcpedi(String usachavetriplapcpedi) {
        this.usachavetriplapcpedi = usachavetriplapcpedi;
    }

    public String getAbaterdescfincomissaorca() {
        return abaterdescfincomissaorca;
    }

    public void setAbaterdescfincomissaorca(String abaterdescfincomissaorca) {
        this.abaterdescfincomissaorca = abaterdescfincomissaorca;
    }

    public String getTipoaplicindice() {
        return tipoaplicindice;
    }

    public void setTipoaplicindice(String tipoaplicindice) {
        this.tipoaplicindice = tipoaplicindice;
    }

    public String getAplicarepassepercbonific() {
        return aplicarepassepercbonific;
    }

    public void setAplicarepassepercbonific(String aplicarepassepercbonific) {
        this.aplicarepassepercbonific = aplicarepassepercbonific;
    }

    public String getAceitadescflexprodmonitorado() {
        return aceitadescflexprodmonitorado;
    }

    public void setAceitadescflexprodmonitorado(String aceitadescflexprodmonitorado) {
        this.aceitadescflexprodmonitorado = aceitadescflexprodmonitorado;
    }

    public String getVerifpermissaocobrnodesdobr402() {
        return verifpermissaocobrnodesdobr402;
    }

    public void setVerifpermissaocobrnodesdobr402(String verifpermissaocobrnodesdobr402) {
        this.verifpermissaocobrnodesdobr402 = verifpermissaocobrnodesdobr402;
    }

    public String getDirop() {
        return dirop;
    }

    public void setDirop(String dirop) {
        this.dirop = dirop;
    }

    public String getAbaterimpostosdescfin() {
        return abaterimpostosdescfin;
    }

    public void setAbaterimpostosdescfin(String abaterimpostosdescfin) {
        this.abaterimpostosdescfin = abaterimpostosdescfin;
    }

    public String getUsatribentporuf() {
        return usatribentporuf;
    }

    public void setUsatribentporuf(String usatribentporuf) {
        this.usatribentporuf = usatribentporuf;
    }

    public String getSomaimpostostransf() {
        return somaimpostostransf;
    }

    public void setSomaimpostostransf(String somaimpostostransf) {
        this.somaimpostostransf = somaimpostostransf;
    }

    public Long getCodcontasobraacerto() {
        return codcontasobraacerto;
    }

    public void setCodcontasobraacerto(Long codcontasobraacerto) {
        this.codcontasobraacerto = codcontasobraacerto;
    }

    public String getApenasmiudezachekoutcarreg() {
        return apenasmiudezachekoutcarreg;
    }

    public void setApenasmiudezachekoutcarreg(String apenasmiudezachekoutcarreg) {
        this.apenasmiudezachekoutcarreg = apenasmiudezachekoutcarreg;
    }

    public Short getNumdiascadclibloqchdv() {
        return numdiascadclibloqchdv;
    }

    public void setNumdiascadclibloqchdv(Short numdiascadclibloqchdv) {
        this.numdiascadclibloqchdv = numdiascadclibloqchdv;
    }

    public Short getNumdiaschdvbloqcli() {
        return numdiaschdvbloqcli;
    }

    public void setNumdiaschdvbloqcli(Short numdiaschdvbloqcli) {
        this.numdiaschdvbloqcli = numdiaschdvbloqcli;
    }

    public Short getQtchdvbloqcli() {
        return qtchdvbloqcli;
    }

    public void setQtchdvbloqcli(Short qtchdvbloqcli) {
        this.qtchdvbloqcli = qtchdvbloqcli;
    }

    public String getRestringenumviaspu() {
        return restringenumviaspu;
    }

    public void setRestringenumviaspu(String restringenumviaspu) {
        this.restringenumviaspu = restringenumviaspu;
    }

    public String getValidarvlminvendaaposcorte() {
        return validarvlminvendaaposcorte;
    }

    public void setValidarvlminvendaaposcorte(String validarvlminvendaaposcorte) {
        this.validarvlminvendaaposcorte = validarvlminvendaaposcorte;
    }

    public Long getCodcontarebaixacmv() {
        return codcontarebaixacmv;
    }

    public void setCodcontarebaixacmv(Long codcontarebaixacmv) {
        this.codcontarebaixacmv = codcontarebaixacmv;
    }

    public String getAlterarnumseqpedido() {
        return alterarnumseqpedido;
    }

    public void setAlterarnumseqpedido(String alterarnumseqpedido) {
        this.alterarnumseqpedido = alterarnumseqpedido;
    }

    public String getTipoordenacaonfsaida() {
        return tipoordenacaonfsaida;
    }

    public void setTipoordenacaonfsaida(String tipoordenacaonfsaida) {
        this.tipoordenacaonfsaida = tipoordenacaonfsaida;
    }

    public BigDecimal getPercacrescimobalcao() {
        return percacrescimobalcao;
    }

    public void setPercacrescimobalcao(BigDecimal percacrescimobalcao) {
        this.percacrescimobalcao = percacrescimobalcao;
    }

    public String getUsarmovimentahorizontal() {
        return usarmovimentahorizontal;
    }

    public void setUsarmovimentahorizontal(String usarmovimentahorizontal) {
        this.usarmovimentahorizontal = usarmovimentahorizontal;
    }

    public String getValidavlminvendabalcao() {
        return validavlminvendabalcao;
    }

    public void setValidavlminvendabalcao(String validavlminvendabalcao) {
        this.validavlminvendabalcao = validavlminvendabalcao;
    }

    public String getUsabcrent() {
        return usabcrent;
    }

    public void setUsabcrent(String usabcrent) {
        this.usabcrent = usabcrent;
    }

    public String getFazerinsertpcembalagem() {
        return fazerinsertpcembalagem;
    }

    public void setFazerinsertpcembalagem(String fazerinsertpcembalagem) {
        this.fazerinsertpcembalagem = fazerinsertpcembalagem;
    }

    public String getValidarieconsumidorfinal() {
        return validarieconsumidorfinal;
    }

    public void setValidarieconsumidorfinal(String validarieconsumidorfinal) {
        this.validarieconsumidorfinal = validarieconsumidorfinal;
    }

    public String getAceitadescprecofixo() {
        return aceitadescprecofixo;
    }

    public void setAceitadescprecofixo(String aceitadescprecofixo) {
        this.aceitadescprecofixo = aceitadescprecofixo;
    }

    public String getTrocaaltdebcredrca() {
        return trocaaltdebcredrca;
    }

    public void setTrocaaltdebcredrca(String trocaaltdebcredrca) {
        this.trocaaltdebcredrca = trocaaltdebcredrca;
    }

    public Long getContalancperda() {
        return contalancperda;
    }

    public void setContalancperda(Long contalancperda) {
        this.contalancperda = contalancperda;
    }

    public String getGerarbrindepedbonific() {
        return gerarbrindepedbonific;
    }

    public void setGerarbrindepedbonific(String gerarbrindepedbonific) {
        this.gerarbrindepedbonific = gerarbrindepedbonific;
    }

    public String getBloqaplicpercmanutinv() {
        return bloqaplicpercmanutinv;
    }

    public void setBloqaplicpercmanutinv(String bloqaplicpercmanutinv) {
        this.bloqaplicpercmanutinv = bloqaplicpercmanutinv;
    }

    public Boolean getGeranumloteautomatico() {
        return geranumloteautomatico;
    }

    public void setGeranumloteautomatico(Boolean geranumloteautomatico) {
        this.geranumloteautomatico = geranumloteautomatico;
    }

    public String getPadraocallcenter() {
        return padraocallcenter;
    }

    public void setPadraocallcenter(String padraocallcenter) {
        this.padraocallcenter = padraocallcenter;
    }

    public String getDesbloqclibxtitulo() {
        return desbloqclibxtitulo;
    }

    public void setDesbloqclibxtitulo(String desbloqclibxtitulo) {
        this.desbloqclibxtitulo = desbloqclibxtitulo;
    }

    public String getEnderecoapanhafilial() {
        return enderecoapanhafilial;
    }

    public void setEnderecoapanhafilial(String enderecoapanhafilial) {
        this.enderecoapanhafilial = enderecoapanhafilial;
    }

    public Integer getProxnumlotesa() {
        return proxnumlotesa;
    }

    public void setProxnumlotesa(Integer proxnumlotesa) {
        this.proxnumlotesa = proxnumlotesa;
    }

    public String getVerificarenderocupado() {
        return verificarenderocupado;
    }

    public void setVerificarenderocupado(String verificarenderocupado) {
        this.verificarenderocupado = verificarenderocupado;
    }

    public String getAgregarstprodsintegra() {
        return agregarstprodsintegra;
    }

    public void setAgregarstprodsintegra(String agregarstprodsintegra) {
        this.agregarstprodsintegra = agregarstprodsintegra;
    }

    public String getAceitadesdconsumidoroutroscli() {
        return aceitadesdconsumidoroutroscli;
    }

    public void setAceitadesdconsumidoroutroscli(String aceitadesdconsumidoroutroscli) {
        this.aceitadesdconsumidoroutroscli = aceitadesdconsumidoroutroscli;
    }

    public String getAbastcorretivoautomat() {
        return abastcorretivoautomat;
    }

    public void setAbastcorretivoautomat(String abastcorretivoautomat) {
        this.abastcorretivoautomat = abastcorretivoautomat;
    }

    public String getNaousarpickingcx() {
        return naousarpickingcx;
    }

    public void setNaousarpickingcx(String naousarpickingcx) {
        this.naousarpickingcx = naousarpickingcx;
    }

    public String getUsaseparacaocxfechada() {
        return usaseparacaocxfechada;
    }

    public void setUsaseparacaocxfechada(String usaseparacaocxfechada) {
        this.usaseparacaocxfechada = usaseparacaocxfechada;
    }

    public String getDesdcartaofechcarga() {
        return desdcartaofechcarga;
    }

    public void setDesdcartaofechcarga(String desdcartaofechcarga) {
        this.desdcartaofechcarga = desdcartaofechcarga;
    }

    public BigDecimal getPermaxdescautor() {
        return permaxdescautor;
    }

    public void setPermaxdescautor(BigDecimal permaxdescautor) {
        this.permaxdescautor = permaxdescautor;
    }

    public BigDecimal getVlremontedescarga() {
        return vlremontedescarga;
    }

    public void setVlremontedescarga(BigDecimal vlremontedescarga) {
        this.vlremontedescarga = vlremontedescarga;
    }

    public String getFechacarregautvendabalcao() {
        return fechacarregautvendabalcao;
    }

    public void setFechacarregautvendabalcao(String fechacarregautvendabalcao) {
        this.fechacarregautvendabalcao = fechacarregautvendabalcao;
    }

    public String getGerandomapa() {
        return gerandomapa;
    }

    public void setGerandomapa(String gerandomapa) {
        this.gerandomapa = gerandomapa;
    }

    public LocalDate getDtatualizacaobd() {
        return dtatualizacaobd;
    }

    public void setDtatualizacaobd(LocalDate dtatualizacaobd) {
        this.dtatualizacaobd = dtatualizacaobd;
    }

    public String getUtilizaendporfilial() {
        return utilizaendporfilial;
    }

    public void setUtilizaendporfilial(String utilizaendporfilial) {
        this.utilizaendporfilial = utilizaendporfilial;
    }

    public String getVerificapedbonificentnormal() {
        return verificapedbonificentnormal;
    }

    public void setVerificapedbonificentnormal(String verificapedbonificentnormal) {
        this.verificapedbonificentnormal = verificapedbonificentnormal;
    }

    public String getNaousaenderecomisto() {
        return naousaenderecomisto;
    }

    public void setNaousaenderecomisto(String naousaenderecomisto) {
        this.naousaenderecomisto = naousaenderecomisto;
    }

    public String getTravavendapf() {
        return travavendapf;
    }

    public void setTravavendapf(String travavendapf) {
        this.travavendapf = travavendapf;
    }

    public String getUsarsenhaexpirada() {
        return usarsenhaexpirada;
    }

    public void setUsarsenhaexpirada(String usarsenhaexpirada) {
        this.usarsenhaexpirada = usarsenhaexpirada;
    }

    public String getGerarpclancicmsantecip() {
        return gerarpclancicmsantecip;
    }

    public void setGerarpclancicmsantecip(String gerarpclancicmsantecip) {
        this.gerarpclancicmsantecip = gerarpclancicmsantecip;
    }

    public String getTratarrestricaoacrescimo() {
        return tratarrestricaoacrescimo;
    }

    public void setTratarrestricaoacrescimo(String tratarrestricaoacrescimo) {
        this.tratarrestricaoacrescimo = tratarrestricaoacrescimo;
    }

    public String getUsacontrolederecibos() {
        return usacontrolederecibos;
    }

    public void setUsacontrolederecibos(String usacontrolederecibos) {
        this.usacontrolederecibos = usacontrolederecibos;
    }

    public Short getNumdiasmaxbaixarecibo() {
        return numdiasmaxbaixarecibo;
    }

    public void setNumdiasmaxbaixarecibo(Short numdiasmaxbaixarecibo) {
        this.numdiasmaxbaixarecibo = numdiasmaxbaixarecibo;
    }

    public Short getNummaxtitulosporrecibo() {
        return nummaxtitulosporrecibo;
    }

    public void setNummaxtitulosporrecibo(Short nummaxtitulosporrecibo) {
        this.nummaxtitulosporrecibo = nummaxtitulosporrecibo;
    }

    public String getFaturafilialbroker() {
        return faturafilialbroker;
    }

    public void setFaturafilialbroker(String faturafilialbroker) {
        this.faturafilialbroker = faturafilialbroker;
    }

    public BigDecimal getPerbaseredoutrasdesp() {
        return perbaseredoutrasdesp;
    }

    public void setPerbaseredoutrasdesp(BigDecimal perbaseredoutrasdesp) {
        this.perbaseredoutrasdesp = perbaseredoutrasdesp;
    }

    public String getGerarpcauxlancontasorcam() {
        return gerarpcauxlancontasorcam;
    }

    public void setGerarpcauxlancontasorcam(String gerarpcauxlancontasorcam) {
        this.gerarpcauxlancontasorcam = gerarpcauxlancontasorcam;
    }

    public String getTipocalcdescargapal() {
        return tipocalcdescargapal;
    }

    public void setTipocalcdescargapal(String tipocalcdescargapal) {
        this.tipocalcdescargapal = tipocalcdescargapal;
    }

    public BigDecimal getPercicmfreteent() {
        return percicmfreteent;
    }

    public void setPercicmfreteent(BigDecimal percicmfreteent) {
        this.percicmfreteent = percicmfreteent;
    }

    public Integer getCodfiscalfreteent() {
        return codfiscalfreteent;
    }

    public void setCodfiscalfreteent(Integer codfiscalfreteent) {
        this.codfiscalfreteent = codfiscalfreteent;
    }

    public BigDecimal getPercicminterfreteent() {
        return percicminterfreteent;
    }

    public void setPercicminterfreteent(BigDecimal percicminterfreteent) {
        this.percicminterfreteent = percicminterfreteent;
    }

    public Integer getCodfiscalinterfreteent() {
        return codfiscalinterfreteent;
    }

    public void setCodfiscalinterfreteent(Integer codfiscalinterfreteent) {
        this.codfiscalinterfreteent = codfiscalinterfreteent;
    }

    public BigDecimal getPerclanccredcli() {
        return perclanccredcli;
    }

    public void setPerclanccredcli(BigDecimal perclanccredcli) {
        this.perclanccredcli = perclanccredcli;
    }

    public String getBloquearpedbonific() {
        return bloquearpedbonific;
    }

    public void setBloquearpedbonific(String bloquearpedbonific) {
        this.bloquearpedbonific = bloquearpedbonific;
    }

    public String getUsaprecifmenormargemm() {
        return usaprecifmenormargemm;
    }

    public void setUsaprecifmenormargemm(String usaprecifmenormargemm) {
        this.usaprecifmenormargemm = usaprecifmenormargemm;
    }

    public String getTipocusto1322() {
        return tipocusto1322;
    }

    public void setTipocusto1322(String tipocusto1322) {
        this.tipocusto1322 = tipocusto1322;
    }

    public String getPedidopordistrib() {
        return pedidopordistrib;
    }

    public void setPedidopordistrib(String pedidopordistrib) {
        this.pedidopordistrib = pedidopordistrib;
    }

    public String getBloqueiavendaestpendente() {
        return bloqueiavendaestpendente;
    }

    public void setBloqueiavendaestpendente(String bloqueiavendaestpendente) {
        this.bloqueiavendaestpendente = bloqueiavendaestpendente;
    }

    public Integer getProxnumcodbarralote() {
        return proxnumcodbarralote;
    }

    public void setProxnumcodbarralote(Integer proxnumcodbarralote) {
        this.proxnumcodbarralote = proxnumcodbarralote;
    }

    public String getBloqconsistenummapa() {
        return bloqconsistenummapa;
    }

    public void setBloqconsistenummapa(String bloqconsistenummapa) {
        this.bloqconsistenummapa = bloqconsistenummapa;
    }

    public String getUsacestabasicacf() {
        return usacestabasicacf;
    }

    public void setUsacestabasicacf(String usacestabasicacf) {
        this.usacestabasicacf = usacestabasicacf;
    }

    public String getUsaprodfracunitario() {
        return usaprodfracunitario;
    }

    public void setUsaprodfracunitario(String usaprodfracunitario) {
        this.usaprodfracunitario = usaprodfracunitario;
    }

    public String getAtualizaent1122() {
        return atualizaent1122;
    }

    public void setAtualizaent1122(String atualizaent1122) {
        this.atualizaent1122 = atualizaent1122;
    }

    public String getUsarenderfornec() {
        return usarenderfornec;
    }

    public void setUsarenderfornec(String usarenderfornec) {
        this.usarenderfornec = usarenderfornec;
    }

    public String getAplicarindicecmv() {
        return aplicarindicecmv;
    }

    public void setAplicarindicecmv(String aplicarindicecmv) {
        this.aplicarindicecmv = aplicarindicecmv;
    }

    public Long getCodcontacustoscartorio() {
        return codcontacustoscartorio;
    }

    public void setCodcontacustoscartorio(Long codcontacustoscartorio) {
        this.codcontacustoscartorio = codcontacustoscartorio;
    }

    public Integer getMaxdiassemvenda() {
        return maxdiassemvenda;
    }

    public void setMaxdiassemvenda(Integer maxdiassemvenda) {
        this.maxdiassemvenda = maxdiassemvenda;
    }

    public String getUsatrocacomprecovenda() {
        return usatrocacomprecovenda;
    }

    public void setUsatrocacomprecovenda(String usatrocacomprecovenda) {
        this.usatrocacomprecovenda = usatrocacomprecovenda;
    }

    public Long getCodcontpagdiaria() {
        return codcontpagdiaria;
    }

    public void setCodcontpagdiaria(Long codcontpagdiaria) {
        this.codcontpagdiaria = codcontpagdiaria;
    }

    public Integer getNumdiasmaxvendacliinadimplente() {
        return numdiasmaxvendacliinadimplente;
    }

    public void setNumdiasmaxvendacliinadimplente(Integer numdiasmaxvendacliinadimplente) {
        this.numdiasmaxvendacliinadimplente = numdiasmaxvendacliinadimplente;
    }

    public Short getOrdemavaliacaocomissaorca() {
        return ordemavaliacaocomissaorca;
    }

    public void setOrdemavaliacaocomissaorca(Short ordemavaliacaocomissaorca) {
        this.ordemavaliacaocomissaorca = ordemavaliacaocomissaorca;
    }

    public String getPermitirdescrodapecheckout() {
        return permitirdescrodapecheckout;
    }

    public void setPermitirdescrodapecheckout(String permitirdescrodapecheckout) {
        this.permitirdescrodapecheckout = permitirdescrodapecheckout;
    }

    public BigDecimal getPermaxrodapecheckout() {
        return permaxrodapecheckout;
    }

    public void setPermaxrodapecheckout(BigDecimal permaxrodapecheckout) {
        this.permaxrodapecheckout = permaxrodapecheckout;
    }

    public String getUsartributacaotransftv10() {
        return usartributacaotransftv10;
    }

    public void setUsartributacaotransftv10(String usartributacaotransftv10) {
        this.usartributacaotransftv10 = usartributacaotransftv10;
    }

    public String getGeravalercadevmanif() {
        return geravalercadevmanif;
    }

    public void setGeravalercadevmanif(String geravalercadevmanif) {
        this.geravalercadevmanif = geravalercadevmanif;
    }

    public String getUsasaldocontacorrentedescfin() {
        return usasaldocontacorrentedescfin;
    }

    public void setUsasaldocontacorrentedescfin(String usasaldocontacorrentedescfin) {
        this.usasaldocontacorrentedescfin = usasaldocontacorrentedescfin;
    }

    public String getBloqfornecverbasvencidas() {
        return bloqfornecverbasvencidas;
    }

    public void setBloqfornecverbasvencidas(String bloqfornecverbasvencidas) {
        this.bloqfornecverbasvencidas = bloqfornecverbasvencidas;
    }

    public Short getDiasbloqfornecverbasvencidas() {
        return diasbloqfornecverbasvencidas;
    }

    public void setDiasbloqfornecverbasvencidas(Short diasbloqfornecverbasvencidas) {
        this.diasbloqfornecverbasvencidas = diasbloqfornecverbasvencidas;
    }

    public String getUsadtdesbloqueiobloqcliinativ() {
        return usadtdesbloqueiobloqcliinativ;
    }

    public void setUsadtdesbloqueiobloqcliinativ(String usadtdesbloqueiobloqcliinativ) {
        this.usadtdesbloqueiobloqcliinativ = usadtdesbloqueiobloqcliinativ;
    }

    public String getUsaptabelacomobase() {
        return usaptabelacomobase;
    }

    public void setUsaptabelacomobase(String usaptabelacomobase) {
        this.usaptabelacomobase = usaptabelacomobase;
    }

    public Integer getProcnumlista() {
        return procnumlista;
    }

    public void setProcnumlista(Integer procnumlista) {
        this.procnumlista = procnumlista;
    }

    public Long getTempmenflow() {
        return tempmenflow;
    }

    public void setTempmenflow(Long tempmenflow) {
        this.tempmenflow = tempmenflow;
    }

    public String getGerartrococobdin() {
        return gerartrococobdin;
    }

    public void setGerartrococobdin(String gerartrococobdin) {
        this.gerartrococobdin = gerartrococobdin;
    }

    public String getInformarecebedorvenda() {
        return informarecebedorvenda;
    }

    public void setInformarecebedorvenda(String informarecebedorvenda) {
        this.informarecebedorvenda = informarecebedorvenda;
    }

    public String getGravarcotacao() {
        return gravarcotacao;
    }

    public void setGravarcotacao(String gravarcotacao) {
        this.gravarcotacao = gravarcotacao;
    }

    public Long getCodcontabenefic() {
        return codcontabenefic;
    }

    public void setCodcontabenefic(Long codcontabenefic) {
        this.codcontabenefic = codcontabenefic;
    }

    public String getUpdateautmenu() {
        return updateautmenu;
    }

    public void setUpdateautmenu(String updateautmenu) {
        this.updateautmenu = updateautmenu;
    }

    public String getMercadoalvo() {
        return mercadoalvo;
    }

    public void setMercadoalvo(String mercadoalvo) {
        this.mercadoalvo = mercadoalvo;
    }

    public String getAtualizaestcontconvembalagem() {
        return atualizaestcontconvembalagem;
    }

    public void setAtualizaestcontconvembalagem(String atualizaestcontconvembalagem) {
        this.atualizaestcontconvembalagem = atualizaestcontconvembalagem;
    }

    public String getAceitapfcontribuinte() {
        return aceitapfcontribuinte;
    }

    public void setAceitapfcontribuinte(String aceitapfcontribuinte) {
        this.aceitapfcontribuinte = aceitapfcontribuinte;
    }

    public String getUtilizarateiodespesas() {
        return utilizarateiodespesas;
    }

    public void setUtilizarateiodespesas(String utilizarateiodespesas) {
        this.utilizarateiodespesas = utilizarateiodespesas;
    }

    public String getVerificadescfinbaixacm() {
        return verificadescfinbaixacm;
    }

    public void setVerificadescfinbaixacm(String verificadescfinbaixacm) {
        this.verificadescfinbaixacm = verificadescfinbaixacm;
    }

    public BigDecimal getValormaxfaltacaixa() {
        return valormaxfaltacaixa;
    }

    public void setValormaxfaltacaixa(BigDecimal valormaxfaltacaixa) {
        this.valormaxfaltacaixa = valormaxfaltacaixa;
    }

    public Long getCodcontafaltacaixa() {
        return codcontafaltacaixa;
    }

    public void setCodcontafaltacaixa(Long codcontafaltacaixa) {
        this.codcontafaltacaixa = codcontafaltacaixa;
    }

    public String getVercobrancabloqcli5041617() {
        return vercobrancabloqcli5041617;
    }

    public void setVercobrancabloqcli5041617(String vercobrancabloqcli5041617) {
        this.vercobrancabloqcli5041617 = vercobrancabloqcli5041617;
    }

    public Short getNumdiasminvendabk() {
        return numdiasminvendabk;
    }

    public void setNumdiasminvendabk(Short numdiasminvendabk) {
        this.numdiasminvendabk = numdiasminvendabk;
    }

    public Long getCodcontasobracaixa() {
        return codcontasobracaixa;
    }

    public void setCodcontasobracaixa(Long codcontasobracaixa) {
        this.codcontasobracaixa = codcontasobracaixa;
    }

    public Short getTipomascaraenderwms() {
        return tipomascaraenderwms;
    }

    public void setTipomascaraenderwms(Short tipomascaraenderwms) {
        this.tipomascaraenderwms = tipomascaraenderwms;
    }

    public String getCalcicmsfomezero() {
        return calcicmsfomezero;
    }

    public void setCalcicmsfomezero(String calcicmsfomezero) {
        this.calcicmsfomezero = calcicmsfomezero;
    }

    public BigDecimal getVolumepalete() {
        return volumepalete;
    }

    public void setVolumepalete(BigDecimal volumepalete) {
        this.volumepalete = volumepalete;
    }

    public String getEnviarmsgrcacorte() {
        return enviarmsgrcacorte;
    }

    public void setEnviarmsgrcacorte(String enviarmsgrcacorte) {
        this.enviarmsgrcacorte = enviarmsgrcacorte;
    }

    public Short getQtmesesclassestrelas() {
        return qtmesesclassestrelas;
    }

    public void setQtmesesclassestrelas(Short qtmesesclassestrelas) {
        this.qtmesesclassestrelas = qtmesesclassestrelas;
    }

    public Short getQtmesesgrupos() {
        return qtmesesgrupos;
    }

    public void setQtmesesgrupos(Short qtmesesgrupos) {
        this.qtmesesgrupos = qtmesesgrupos;
    }

    public String getConsqtreservrebaixacusto() {
        return consqtreservrebaixacusto;
    }

    public void setConsqtreservrebaixacusto(String consqtreservrebaixacusto) {
        this.consqtreservrebaixacusto = consqtreservrebaixacusto;
    }

    public Long getCodcontasobramerc() {
        return codcontasobramerc;
    }

    public void setCodcontasobramerc(Long codcontasobramerc) {
        this.codcontasobramerc = codcontasobramerc;
    }

    public String getHabilitarlanctodadosfrota() {
        return habilitarlanctodadosfrota;
    }

    public void setHabilitarlanctodadosfrota(String habilitarlanctodadosfrota) {
        this.habilitarlanctodadosfrota = habilitarlanctodadosfrota;
    }

    public Long getCodcontaverbacmv() {
        return codcontaverbacmv;
    }

    public void setCodcontaverbacmv(Long codcontaverbacmv) {
        this.codcontaverbacmv = codcontaverbacmv;
    }

    public Short getNumcasasdecproducao() {
        return numcasasdecproducao;
    }

    public void setNumcasasdecproducao(Short numcasasdecproducao) {
        this.numcasasdecproducao = numcasasdecproducao;
    }

    public String getGerarpcfrete() {
        return gerarpcfrete;
    }

    public void setGerarpcfrete(String gerarpcfrete) {
        this.gerarpcfrete = gerarpcfrete;
    }

    public String getLancarstapenasparc1() {
        return lancarstapenasparc1;
    }

    public void setLancarstapenasparc1(String lancarstapenasparc1) {
        this.lancarstapenasparc1 = lancarstapenasparc1;
    }

    public String getCodcobrancadescfinanceiro() {
        return codcobrancadescfinanceiro;
    }

    public void setCodcobrancadescfinanceiro(String codcobrancadescfinanceiro) {
        this.codcobrancadescfinanceiro = codcobrancadescfinanceiro;
    }

    public String getIncluircomissaosugpvendacmv() {
        return incluircomissaosugpvendacmv;
    }

    public void setIncluircomissaosugpvendacmv(String incluircomissaosugpvendacmv) {
        this.incluircomissaosugpvendacmv = incluircomissaosugpvendacmv;
    }

    public String getUsacomissaoecf() {
        return usacomissaoecf;
    }

    public void setUsacomissaoecf(String usacomissaoecf) {
        this.usacomissaoecf = usacomissaoecf;
    }

    public String getUsacancelamentoautomaticoecf() {
        return usacancelamentoautomaticoecf;
    }

    public void setUsacancelamentoautomaticoecf(String usacancelamentoautomaticoecf) {
        this.usacancelamentoautomaticoecf = usacancelamentoautomaticoecf;
    }

    public String getUtilizacontrolemedicamentos() {
        return utilizacontrolemedicamentos;
    }

    public void setUtilizacontrolemedicamentos(String utilizacontrolemedicamentos) {
        this.utilizacontrolemedicamentos = utilizacontrolemedicamentos;
    }

    public Short getQtmesesclassgrupocartao() {
        return qtmesesclassgrupocartao;
    }

    public void setQtmesesclassgrupocartao(Short qtmesesclassgrupocartao) {
        this.qtmesesclassgrupocartao = qtmesesclassgrupocartao;
    }

    public String getBiometriaparticipasorteiobiro() {
        return biometriaparticipasorteiobiro;
    }

    public void setBiometriaparticipasorteiobiro(String biometriaparticipasorteiobiro) {
        this.biometriaparticipasorteiobiro = biometriaparticipasorteiobiro;
    }

    public String getCartaoparticipasorteiobiro() {
        return cartaoparticipasorteiobiro;
    }

    public void setCartaoparticipasorteiobiro(String cartaoparticipasorteiobiro) {
        this.cartaoparticipasorteiobiro = cartaoparticipasorteiobiro;
    }

    public String getCredencialparticipasorteiobiro() {
        return credencialparticipasorteiobiro;
    }

    public void setCredencialparticipasorteiobiro(String credencialparticipasorteiobiro) {
        this.credencialparticipasorteiobiro = credencialparticipasorteiobiro;
    }

    public String getValidarestricoesvendaporrca() {
        return validarestricoesvendaporrca;
    }

    public void setValidarestricoesvendaporrca(String validarestricoesvendaporrca) {
        this.validarestricoesvendaporrca = validarestricoesvendaporrca;
    }

    public LocalDate getDtvalidasefaz() {
        return dtvalidasefaz;
    }

    public void setDtvalidasefaz(LocalDate dtvalidasefaz) {
        this.dtvalidasefaz = dtvalidasefaz;
    }

    public String getDirimportacaofv2() {
        return dirimportacaofv2;
    }

    public void setDirimportacaofv2(String dirimportacaofv2) {
        this.dirimportacaofv2 = dirimportacaofv2;
    }

    public String getUsafechamentocxcego() {
        return usafechamentocxcego;
    }

    public void setUsafechamentocxcego(String usafechamentocxcego) {
        this.usafechamentocxcego = usafechamentocxcego;
    }

    public Long getCodcontatransftv10() {
        return codcontatransftv10;
    }

    public void setCodcontatransftv10(Long codcontatransftv10) {
        this.codcontatransftv10 = codcontatransftv10;
    }

    public String getCalcstfontepf() {
        return calcstfontepf;
    }

    public void setCalcstfontepf(String calcstfontepf) {
        this.calcstfontepf = calcstfontepf;
    }

    public String getPermitevendaprodutopv() {
        return permitevendaprodutopv;
    }

    public void setPermitevendaprodutopv(String permitevendaprodutopv) {
        this.permitevendaprodutopv = permitevendaprodutopv;
    }

    public String getValidarestoqueautoservico() {
        return validarestoqueautoservico;
    }

    public void setValidarestoqueautoservico(String validarestoqueautoservico) {
        this.validarestoqueautoservico = validarestoqueautoservico;
    }

    public String getConsistecnpjfornec() {
        return consistecnpjfornec;
    }

    public void setConsistecnpjfornec(String consistecnpjfornec) {
        this.consistecnpjfornec = consistecnpjfornec;
    }

    public String getUsacreclivendatlmkt() {
        return usacreclivendatlmkt;
    }

    public void setUsacreclivendatlmkt(String usacreclivendatlmkt) {
        this.usacreclivendatlmkt = usacreclivendatlmkt;
    }

    public Integer getNummaxparcent() {
        return nummaxparcent;
    }

    public void setNummaxparcent(Integer nummaxparcent) {
        this.nummaxparcent = nummaxparcent;
    }

    public Short getViasdanfe() {
        return viasdanfe;
    }

    public void setViasdanfe(Short viasdanfe) {
        this.viasdanfe = viasdanfe;
    }

    public String getUsacomissaoporclasse() {
        return usacomissaoporclasse;
    }

    public void setUsacomissaoporclasse(String usacomissaoporclasse) {
        this.usacomissaoporclasse = usacomissaoporclasse;
    }

    public String getClassecomispadrao() {
        return classecomispadrao;
    }

    public void setClassecomispadrao(String classecomispadrao) {
        this.classecomispadrao = classecomispadrao;
    }

    public Long getCodcontacambial() {
        return codcontacambial;
    }

    public void setCodcontacambial(Long codcontacambial) {
        this.codcontacambial = codcontacambial;
    }

    public String getSempreatualizaqtestconvemb() {
        return sempreatualizaqtestconvemb;
    }

    public void setSempreatualizaqtestconvemb(String sempreatualizaqtestconvemb) {
        this.sempreatualizaqtestconvemb = sempreatualizaqtestconvemb;
    }

    public String getIpnfe() {
        return ipnfe;
    }

    public void setIpnfe(String ipnfe) {
        this.ipnfe = ipnfe;
    }

    public Long getPortanfe() {
        return portanfe;
    }

    public void setPortanfe(Long portanfe) {
        this.portanfe = portanfe;
    }

    public Long getProxnumlotenfe() {
        return proxnumlotenfe;
    }

    public void setProxnumlotenfe(Long proxnumlotenfe) {
        this.proxnumlotenfe = proxnumlotenfe;
    }

    public String getLancarvalecomodespesana1268() {
        return lancarvalecomodespesana1268;
    }

    public void setLancarvalecomodespesana1268(String lancarvalecomodespesana1268) {
        this.lancarvalecomodespesana1268 = lancarvalecomodespesana1268;
    }

    public String getSepararprodcomrestricaotransp() {
        return separarprodcomrestricaotransp;
    }

    public void setSepararprodcomrestricaotransp(String separarprodcomrestricaotransp) {
        this.separarprodcomrestricaotransp = separarprodcomrestricaotransp;
    }

    public Short getQtdeparcelasimpostosfrete() {
        return qtdeparcelasimpostosfrete;
    }

    public void setQtdeparcelasimpostosfrete(Short qtdeparcelasimpostosfrete) {
        this.qtdeparcelasimpostosfrete = qtdeparcelasimpostosfrete;
    }

    public String getLancarfretexparcelas() {
        return lancarfretexparcelas;
    }

    public void setLancarfretexparcelas(String lancarfretexparcelas) {
        this.lancarfretexparcelas = lancarfretexparcelas;
    }

    public String getBaixardnicomlancamento() {
        return baixardnicomlancamento;
    }

    public void setBaixardnicomlancamento(String baixardnicomlancamento) {
        this.baixardnicomlancamento = baixardnicomlancamento;
    }

    public String getFilialpadrao() {
        return filialpadrao;
    }

    public void setFilialpadrao(String filialpadrao) {
        this.filialpadrao = filialpadrao;
    }

    public String getFretenaotribcomooutras() {
        return fretenaotribcomooutras;
    }

    public void setFretenaotribcomooutras(String fretenaotribcomooutras) {
        this.fretenaotribcomooutras = fretenaotribcomooutras;
    }

    public Boolean getRotina2562emuso() {
        return rotina2562emuso;
    }

    public void setRotina2562emuso(Boolean rotina2562emuso) {
        this.rotina2562emuso = rotina2562emuso;
    }

    public BigDecimal getPerccsrf() {
        return perccsrf;
    }

    public void setPerccsrf(BigDecimal perccsrf) {
        this.perccsrf = perccsrf;
    }

    public BigDecimal getValorminimocsrf() {
        return valorminimocsrf;
    }

    public void setValorminimocsrf(BigDecimal valorminimocsrf) {
        this.valorminimocsrf = valorminimocsrf;
    }

    public BigDecimal getValorminimoirrf() {
        return valorminimoirrf;
    }

    public void setValorminimoirrf(BigDecimal valorminimoirrf) {
        this.valorminimoirrf = valorminimoirrf;
    }

    public BigDecimal getPercinss() {
        return percinss;
    }

    public void setPercinss(BigDecimal percinss) {
        this.percinss = percinss;
    }

    public BigDecimal getValorminimoinss() {
        return valorminimoinss;
    }

    public void setValorminimoinss(BigDecimal valorminimoinss) {
        this.valorminimoinss = valorminimoinss;
    }

    public Short getQtmesescredciap() {
        return qtmesescredciap;
    }

    public void setQtmesescredciap(Short qtmesescredciap) {
        this.qtmesescredciap = qtmesescredciap;
    }

    public String getSomatxboleto() {
        return somatxboleto;
    }

    public void setSomatxboleto(String somatxboleto) {
        this.somatxboleto = somatxboleto;
    }

    public String getIncluircomissaocmvvenda() {
        return incluircomissaocmvvenda;
    }

    public void setIncluircomissaocmvvenda(String incluircomissaocmvvenda) {
        this.incluircomissaocmvvenda = incluircomissaocmvvenda;
    }

    public String getAcertocargafilialdiferente() {
        return acertocargafilialdiferente;
    }

    public void setAcertocargafilialdiferente(String acertocargafilialdiferente) {
        this.acertocargafilialdiferente = acertocargafilialdiferente;
    }

    public Long getCodcontarebaixacmvaapurar() {
        return codcontarebaixacmvaapurar;
    }

    public void setCodcontarebaixacmvaapurar(Long codcontarebaixacmvaapurar) {
        this.codcontarebaixacmvaapurar = codcontarebaixacmvaapurar;
    }

    public Short getNumdiasmaxdesdcpagar() {
        return numdiasmaxdesdcpagar;
    }

    public void setNumdiasmaxdesdcpagar(Short numdiasmaxdesdcpagar) {
        this.numdiasmaxdesdcpagar = numdiasmaxdesdcpagar;
    }

    public String getNaousarpccrecliconsfinal() {
        return naousarpccrecliconsfinal;
    }

    public void setNaousarpccrecliconsfinal(String naousarpccrecliconsfinal) {
        this.naousarpccrecliconsfinal = naousarpccrecliconsfinal;
    }

    public Long getCodcontaadiantforoutros() {
        return codcontaadiantforoutros;
    }

    public void setCodcontaadiantforoutros(Long codcontaadiantforoutros) {
        this.codcontaadiantforoutros = codcontaadiantforoutros;
    }

    public String getBrokeraltdebcredrca() {
        return brokeraltdebcredrca;
    }

    public void setBrokeraltdebcredrca(String brokeraltdebcredrca) {
        this.brokeraltdebcredrca = brokeraltdebcredrca;
    }

    public String getCrmaltdebcredrca() {
        return crmaltdebcredrca;
    }

    public void setCrmaltdebcredrca(String crmaltdebcredrca) {
        this.crmaltdebcredrca = crmaltdebcredrca;
    }

    public String getTipomovccrca() {
        return tipomovccrca;
    }

    public void setTipomovccrca(String tipomovccrca) {
        this.tipomovccrca = tipomovccrca;
    }

    public String getUsacredclitodasfiliais() {
        return usacredclitodasfiliais;
    }

    public void setUsacredclitodasfiliais(String usacredclitodasfiliais) {
        this.usacredclitodasfiliais = usacredclitodasfiliais;
    }

    public String getUtilizacontrolecaixa() {
        return utilizacontrolecaixa;
    }

    public void setUtilizacontrolecaixa(String utilizacontrolecaixa) {
        this.utilizacontrolecaixa = utilizacontrolecaixa;
    }

    public String getBloqhistoricofin() {
        return bloqhistoricofin;
    }

    public void setBloqhistoricofin(String bloqhistoricofin) {
        this.bloqhistoricofin = bloqhistoricofin;
    }

    public Short getNumdiasdesbloqchd1() {
        return numdiasdesbloqchd1;
    }

    public void setNumdiasdesbloqchd1(Short numdiasdesbloqchd1) {
        this.numdiasdesbloqchd1 = numdiasdesbloqchd1;
    }

    public String getTributafreterateado() {
        return tributafreterateado;
    }

    public void setTributafreterateado(String tributafreterateado) {
        this.tributafreterateado = tributafreterateado;
    }

    public String getUsacontroletipoverba() {
        return usacontroletipoverba;
    }

    public void setUsacontroletipoverba(String usacontroletipoverba) {
        this.usacontroletipoverba = usacontroletipoverba;
    }

    public String getUsalimcredcpf() {
        return usalimcredcpf;
    }

    public void setUsalimcredcpf(String usalimcredcpf) {
        this.usalimcredcpf = usalimcredcpf;
    }

    public String getBloqcliaut() {
        return bloqcliaut;
    }

    public void setBloqcliaut(String bloqcliaut) {
        this.bloqcliaut = bloqcliaut;
    }

    public String getAceitaacrescimoprecofixo() {
        return aceitaacrescimoprecofixo;
    }

    public void setAceitaacrescimoprecofixo(String aceitaacrescimoprecofixo) {
        this.aceitaacrescimoprecofixo = aceitaacrescimoprecofixo;
    }

    public String getUsaposicaocpagar() {
        return usaposicaocpagar;
    }

    public void setUsaposicaocpagar(String usaposicaocpagar) {
        this.usaposicaocpagar = usaposicaocpagar;
    }

    public BigDecimal getVlminvendabnf() {
        return vlminvendabnf;
    }

    public void setVlminvendabnf(BigDecimal vlminvendabnf) {
        this.vlminvendabnf = vlminvendabnf;
    }

    public BigDecimal getVlmaxvendabnf() {
        return vlmaxvendabnf;
    }

    public void setVlmaxvendabnf(BigDecimal vlmaxvendabnf) {
        this.vlmaxvendabnf = vlmaxvendabnf;
    }

    public String getAceitadescbalcaoreserva() {
        return aceitadescbalcaoreserva;
    }

    public void setAceitadescbalcaoreserva(String aceitadescbalcaoreserva) {
        this.aceitadescbalcaoreserva = aceitadescbalcaoreserva;
    }

    public String getCliibgeobrg() {
        return cliibgeobrg;
    }

    public void setCliibgeobrg(String cliibgeobrg) {
        this.cliibgeobrg = cliibgeobrg;
    }

    public String getCliipiobrg() {
        return cliipiobrg;
    }

    public void setCliipiobrg(String cliipiobrg) {
        this.cliipiobrg = cliipiobrg;
    }

    public String getUsapiscofinsporfilial() {
        return usapiscofinsporfilial;
    }

    public void setUsapiscofinsporfilial(String usapiscofinsporfilial) {
        this.usapiscofinsporfilial = usapiscofinsporfilial;
    }

    public String getPastaRelatorio() {
        return pastaRelatorio;
    }

    public void setPastaRelatorio(String pastaRelatorio) {
        this.pastaRelatorio = pastaRelatorio;
    }

    public String getNaogravarsaldoestoqueinventrot() {
        return naogravarsaldoestoqueinventrot;
    }

    public void setNaogravarsaldoestoqueinventrot(String naogravarsaldoestoqueinventrot) {
        this.naogravarsaldoestoqueinventrot = naogravarsaldoestoqueinventrot;
    }

    public LocalDate getUltnumdatacheq() {
        return ultnumdatacheq;
    }

    public void setUltnumdatacheq(LocalDate ultnumdatacheq) {
        this.ultnumdatacheq = ultnumdatacheq;
    }

    public LocalDate getDtinicionfp() {
        return dtinicionfp;
    }

    public void setDtinicionfp(LocalDate dtinicionfp) {
        this.dtinicionfp = dtinicionfp;
    }

    public String getConsederacessoproprio530() {
        return consederacessoproprio530;
    }

    public void setConsederacessoproprio530(String consederacessoproprio530) {
        this.consederacessoproprio530 = consederacessoproprio530;
    }

    public String getTipointegracao() {
        return tipointegracao;
    }

    public void setTipointegracao(String tipointegracao) {
        this.tipointegracao = tipointegracao;
    }

    public Long getCodcontadespos() {
        return codcontadespos;
    }

    public void setCodcontadespos(Long codcontadespos) {
        this.codcontadespos = codcontadespos;
    }

    public String getSituacaoinicialbloqueio() {
        return situacaoinicialbloqueio;
    }

    public void setSituacaoinicialbloqueio(String situacaoinicialbloqueio) {
        this.situacaoinicialbloqueio = situacaoinicialbloqueio;
    }

    public Long getCodcontdespordemservico() {
        return codcontdespordemservico;
    }

    public void setCodcontdespordemservico(Long codcontdespordemservico) {
        this.codcontdespordemservico = codcontdespordemservico;
    }

    public String getCodplpagautomatic() {
        return codplpagautomatic;
    }

    public void setCodplpagautomatic(String codplpagautomatic) {
        this.codplpagautomatic = codplpagautomatic;
    }

    public Short getProxcodplpag() {
        return proxcodplpag;
    }

    public void setProxcodplpag(Short proxcodplpag) {
        this.proxcodplpag = proxcodplpag;
    }

    public String getConferindocargapedido() {
        return conferindocargapedido;
    }

    public void setConferindocargapedido(String conferindocargapedido) {
        this.conferindocargapedido = conferindocargapedido;
    }

    public Short getTimermsgagenda() {
        return timermsgagenda;
    }

    public void setTimermsgagenda(Short timermsgagenda) {
        this.timermsgagenda = timermsgagenda;
    }

    public String getUsamarcaprodutos() {
        return usamarcaprodutos;
    }

    public void setUsamarcaprodutos(String usamarcaprodutos) {
        this.usamarcaprodutos = usamarcaprodutos;
    }

    public Long getCodcontagnre() {
        return codcontagnre;
    }

    public void setCodcontagnre(Long codcontagnre) {
        this.codcontagnre = codcontagnre;
    }

    public String getUsarreducaoicmsabatransf() {
        return usarreducaoicmsabatransf;
    }

    public void setUsarreducaoicmsabatransf(String usarreducaoicmsabatransf) {
        this.usarreducaoicmsabatransf = usarreducaoicmsabatransf;
    }

    public String getUsavendabalcaoclifilialvirtual() {
        return usavendabalcaoclifilialvirtual;
    }

    public void setUsavendabalcaoclifilialvirtual(String usavendabalcaoclifilialvirtual) {
        this.usavendabalcaoclifilialvirtual = usavendabalcaoclifilialvirtual;
    }

    public Long getCodcontadevcli() {
        return codcontadevcli;
    }

    public void setCodcontadevcli(Long codcontadevcli) {
        this.codcontadevcli = codcontadevcli;
    }

    public String getAceitadescprecofixocesta() {
        return aceitadescprecofixocesta;
    }

    public void setAceitadescprecofixocesta(String aceitadescprecofixocesta) {
        this.aceitadescprecofixocesta = aceitadescprecofixocesta;
    }

    public Integer getNumdiasvenctitulocobint() {
        return numdiasvenctitulocobint;
    }

    public void setNumdiasvenctitulocobint(Integer numdiasvenctitulocobint) {
        this.numdiasvenctitulocobint = numdiasvenctitulocobint;
    }

    public Integer getNumdiasvenctitulocobext() {
        return numdiasvenctitulocobext;
    }

    public void setNumdiasvenctitulocobext(Integer numdiasvenctitulocobext) {
        this.numdiasvenctitulocobext = numdiasvenctitulocobext;
    }

    public Integer getCodsetorcobranca() {
        return codsetorcobranca;
    }

    public void setCodsetorcobranca(Integer codsetorcobranca) {
        this.codsetorcobranca = codsetorcobranca;
    }

    public String getUsapoliticadesenha() {
        return usapoliticadesenha;
    }

    public void setUsapoliticadesenha(String usapoliticadesenha) {
        this.usapoliticadesenha = usapoliticadesenha;
    }

    public String getBloqclienteexcdevol() {
        return bloqclienteexcdevol;
    }

    public void setBloqclienteexcdevol(String bloqclienteexcdevol) {
        this.bloqclienteexcdevol = bloqclienteexcdevol;
    }

    public BigDecimal getPercexcessodevol() {
        return percexcessodevol;
    }

    public void setPercexcessodevol(BigDecimal percexcessodevol) {
        this.percexcessodevol = percexcessodevol;
    }

    public Short getDiasanalisedevol() {
        return diasanalisedevol;
    }

    public void setDiasanalisedevol(Short diasanalisedevol) {
        this.diasanalisedevol = diasanalisedevol;
    }

    public String getUsavendedornatroca() {
        return usavendedornatroca;
    }

    public void setUsavendedornatroca(String usavendedornatroca) {
        this.usavendedornatroca = usavendedornatroca;
    }

    public String getOsreservanaexecucao() {
        return osreservanaexecucao;
    }

    public void setOsreservanaexecucao(String osreservanaexecucao) {
        this.osreservanaexecucao = osreservanaexecucao;
    }

    public Long getProxnumlotenfedpec() {
        return proxnumlotenfedpec;
    }

    public void setProxnumlotenfedpec(Long proxnumlotenfedpec) {
        this.proxnumlotenfedpec = proxnumlotenfedpec;
    }

    public String getRestringirconferencialote() {
        return restringirconferencialote;
    }

    public void setRestringirconferencialote(String restringirconferencialote) {
        this.restringirconferencialote = restringirconferencialote;
    }

    public String getTipotitulosecf402() {
        return tipotitulosecf402;
    }

    public void setTipotitulosecf402(String tipotitulosecf402) {
        this.tipotitulosecf402 = tipotitulosecf402;
    }

    public String getTipotitulosecf409() {
        return tipotitulosecf409;
    }

    public void setTipotitulosecf409(String tipotitulosecf409) {
        this.tipotitulosecf409 = tipotitulosecf409;
    }

    public String getBloqcodcliprinc() {
        return bloqcodcliprinc;
    }

    public void setBloqcodcliprinc(String bloqcodcliprinc) {
        this.bloqcodcliprinc = bloqcodcliprinc;
    }

    public String getArredondaqtembalfrios() {
        return arredondaqtembalfrios;
    }

    public void setArredondaqtembalfrios(String arredondaqtembalfrios) {
        this.arredondaqtembalfrios = arredondaqtembalfrios;
    }

    public Integer getCodclipc() {
        return codclipc;
    }

    public void setCodclipc(Integer codclipc) {
        this.codclipc = codclipc;
    }

    public BigDecimal getTxiofcomplementar() {
        return txiofcomplementar;
    }

    public void setTxiofcomplementar(BigDecimal txiofcomplementar) {
        this.txiofcomplementar = txiofcomplementar;
    }

    public String getHashsistema() {
        return hashsistema;
    }

    public void setHashsistema(String hashsistema) {
        this.hashsistema = hashsistema;
    }

    public String getUsafluig() {
        return usafluig;
    }

    public void setUsafluig(String usafluig) {
        this.usafluig = usafluig;
    }

    public Integer getPro1cnumlista() {
        return pro1cnumlista;
    }

    public void setPro1cnumlista(Integer pro1cnumlista) {
        this.pro1cnumlista = pro1cnumlista;
    }

    public String getAutomatic() {
        return automatic;
    }

    public void setAutomatic(String automatic) {
        this.automatic = automatic;
    }

    public BigDecimal getVltarifabolepix() {
        return vltarifabolepix;
    }

    public void setVltarifabolepix(BigDecimal vltarifabolepix) {
        this.vltarifabolepix = vltarifabolepix;
    }

    // criado
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}