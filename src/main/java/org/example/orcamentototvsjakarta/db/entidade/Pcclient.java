package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PCCLIENT")
public class Pcclient {
    @EmbeddedId
    private PcclientId id;

    @Column(name = "CLIENTE", length = 60)
    private String cliente;

    @Column(name = "ENDERCOB", length = 40)
    private String endercob;

    @Column(name = "BAIRROCOB", length = 40)
    private String bairrocob;

    @Column(name = "TELCOB", length = 13)
    private String telcob;

    @Column(name = "MUNICCOB", length = 15)
    private String municcob;

    @Column(name = "ESTCOB", length = 2)
    private String estcob;

    @Column(name = "CEPCOB", length = 9)
    private String cepcob;

    @Column(name = "ENDERENT", length = 40)
    private String enderent;

    @Column(name = "BAIRROENT", length = 40)
    private String bairroent;

    @Column(name = "TELENT", length = 13)
    private String telent;

    @Column(name = "MUNICENT", length = 15)
    private String municent;

    @Column(name = "ESTENT", length = 2)
    private String estent;

    @Column(name = "CEPENT", length = 9)
    private String cepent;

    @Column(name = "CGCENT", length = 18)
    private String cgcent;

    @Column(name = "IEENT", length = 15)
    private String ieent;

    @Column(name = "DTULTCOMP")
    private LocalDate dtultcomp;

    @Column(name = "CODATV1")
    private Integer codatv1;

    @Column(name = "BLOQUEIO", length = 1)
    private String bloqueio;

    @Column(name = "FAXCLI", length = 15)
    private String faxcli;

    @Column(name = "LIMCRED", precision = 12, scale = 2)
    private BigDecimal limcred;

    @Column(name = "OBS", length = 40)
    private String obs;

    @Column(name = "DTPRIMCOMPRA")
    private LocalDate dtprimcompra;

    @Column(name = "CODCLIPRINC")
    private Integer codcliprinc;

    @Column(name = "CODCOB", length = 4)
    private String codcob;

    @Column(name = "DTREGLIM")
    private LocalDate dtreglim;

    @Column(name = "DTVENCLIMCRED")
    private LocalDate dtvenclimcred;

    @Column(name = "DTBLOQ")
    private LocalDate dtbloq;

    @Column(name = "CODPRACA", nullable = false)
    private Integer codpraca;

    @Column(name = "FANTASIA", length = 40)
    private String fantasia;

    @Column(name = "EMITEDUP", length = 1)
    private String emitedup;

    @Column(name = "OBS2", length = 40)
    private String obs2;

    @Column(name = "VIP", length = 1)
    private String vip;

    @Column(name = "PONTOREFER", length = 40)
    private String pontorefer;

    @Column(name = "HORARIORECEB", length = 5)
    private String horarioreceb;

    @Column(name = "PREDIOPROPRIO", length = 1)
    private String predioproprio;

    @Column(name = "INICIOATIV")
    private LocalDate inicioativ;

    @Column(name = "DTULTALTER")
    private LocalDate dtultalter;

    @Column(name = "TIPOULTALTER", length = 1)
    private String tipoultalter;

    @Column(name = "OBSCREDITO", length = 30)
    private String obscredito;

    @Column(name = "TIPOFJ", length = 1)
    private String tipofj;

    @Column(name = "ISENTAJUROS", length = 1)
    private String isentajuros;

    @Column(name = "TELENT1", length = 13)
    private String telent1;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "SENHA_WEB", length = 18)
    private String senhaWeb;

    @Column(name = "FREQVISITA")
    private Boolean freqvisita;

    @Column(name = "CODPLPAG")
    private Short codplpag;

    @Column(name = "PRAZOADICIONAL")
    private Short prazoadicional;

    @Column(name = "OBS3", length = 60)
    private String obs3;

    @Column(name = "OBS4", length = 60)
    private String obs4;

    @Column(name = "PERDESC", precision = 6, scale = 2)
    private BigDecimal perdesc;

    @Column(name = "NUMSEQ")
    private Long numseq;

    @Column(name = "PLPAGNEG", length = 1)
    private String plpagneg;

    @Column(name = "PAISENT", length = 18)
    private String paisent;

    @Column(name = "CAIXAPOSTAL")
    private Integer caixapostal;

    @Column(name = "CEPCXPOSTAL")
    private Integer cepcxpostal;

    @Column(name = "REGJUNTACOMERCIAL", length = 15)
    private String regjuntacomercial;

    @Column(name = "MICROEMPRESA", length = 2)
    private String microempresa;

    @Column(name = "DDDINTERNACIONAL")
    private Short dddinternacional;

    @Column(name = "CLASSEVENDA", length = 1)
    private String classevenda;

    @Column(name = "CLASSEMC", length = 1)
    private String classemc;

    @Column(name = "ENDERCOM", length = 40)
    private String endercom;

    @Column(name = "BAIRROCOM", length = 40)
    private String bairrocom;

    @Column(name = "MUNICCOM", length = 15)
    private String municcom;

    @Column(name = "ESTCOM", length = 2)
    private String estcom;

    @Column(name = "CEPCOM", length = 9)
    private String cepcom;

    @Column(name = "TELCOM", length = 13)
    private String telcom;

    @Column(name = "FAXCOM", length = 15)
    private String faxcom;

    @Column(name = "SULFRAMA", length = 15)
    private String sulframa;

    @Column(name = "CODBARRA")
    private Long codbarra;

    @Column(name = "ICMSANTECIP", length = 1)
    private String icmsantecip;

    @Column(name = "CACEX", length = 15)
    private String cacex;

    @Column(name = "OBSENTREGA1", length = 75)
    private String obsentrega1;

    @Column(name = "OBSENTREGA2", length = 75)
    private String obsentrega2;

    @Column(name = "OBSENTREGA3", length = 75)
    private String obsentrega3;

    @Column(name = "PERDESC2", precision = 6, scale = 2)
    private BigDecimal perdesc2;

    @Column(name = "PERDESC3", precision = 6, scale = 2)
    private BigDecimal perdesc3;

    @Column(name = "PERDESC4", precision = 6, scale = 2)
    private BigDecimal perdesc4;

    @Column(name = "PERDESC5", precision = 6, scale = 2)
    private BigDecimal perdesc5;

    @Column(name = "PERDESCFIN", precision = 4, scale = 2)
    private BigDecimal perdescfin;

    @Column(name = "ISENTOICMS", length = 1)
    private String isentoicms;

    @Column(name = "PERDESCISENTOICMS", precision = 4, scale = 2)
    private BigDecimal perdescisentoicms;

    @Column(name = "CODNILSEN", length = 4)
    private String codnilsen;

    @Column(name = "IMENT", length = 15)
    private String iment;

    @Column(name = "CODFILIALNF", length = 2)
    private String codfilialnf;

    @Column(name = "ISENTOTXBOLETO", length = 1)
    private String isentotxboleto;

    @Column(name = "NUMTRANSVENDADESC")
    private Long numtransvendadesc;

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

    @Column(name = "DTCAPITALSOCIAL")
    private LocalDate dtcapitalsocial;

    @Column(name = "CAPITALSOCIAL", precision = 14, scale = 2)
    private BigDecimal capitalsocial;

    @Column(name = "NUMBANCO1")
    private Short numbanco1;

    @Column(name = "NUMAGENCIA1")
    private Integer numagencia1;

    @Column(name = "NUMCCORRENTE1", length = 15)
    private String numccorrente1;

    @Column(name = "NUMBANCO2")
    private Short numbanco2;

    @Column(name = "NUMAGENCIA2")
    private Integer numagencia2;

    @Column(name = "NUMCCORRENTE2", length = 15)
    private String numccorrente2;

    @Column(name = "DTULTVISITA")
    private LocalDate dtultvisita;

    @Column(name = "CODFUNCCADASTRO")
    private Integer codfunccadastro;

    @Column(name = "EMPFIXA", length = 1)
    private String empfixa;

    @Column(name = "LIMITEAUTORI", length = 40)
    private String limiteautori;

    @Column(name = "PERCOMCLI", precision = 5, scale = 2)
    private BigDecimal percomcli;

    @Column(name = "NUMSEQROTARCA")
    private Short numseqrotarca;

    @Column(name = "DIASEMANA", length = 10)
    private String diasemana;

    @Column(name = "PERBASEVEND", precision = 5, scale = 2)
    private BigDecimal perbasevend;

    @Column(name = "RG", length = 20)
    private String rg;

    @Column(name = "ORGAORG", length = 10)
    private String orgaorg;

    @Column(name = "DESCPRODUTO", length = 1)
    private String descproduto;

    @Column(name = "CODFUNCCAD")
    private Integer codfunccad;

    @Column(name = "CODFUNCULTALTER")
    private Integer codfuncultalter;

    @Column(name = "VLESTOQUE", precision = 14, scale = 2)
    private BigDecimal vlestoque;

    @Column(name = "VLMEDIACOMPRAMESFORNEC", precision = 14, scale = 2)
    private BigDecimal vlmediacompramesfornec;

    @Column(name = "OBS5", length = 60)
    private String obs5;

    @Column(name = "DTULTCONSULTASERASA")
    private LocalDate dtultconsultaserasa;

    @Column(name = "DTULTCONSULTASCI")
    private LocalDate dtultconsultasci;

    @Column(name = "CONSUMIDORFINAL", length = 1)
    private String consumidorfinal;

    @Column(name = "CODCANAL")
    private Integer codcanal;

    @Column(name = "CLASSECOMERCIAL", length = 1)
    private String classecomercial;

    @Column(name = "EMITENTECH", length = 40)
    private String emitentech;

    @Column(name = "EMITENTECH2", length = 40)
    private String emitentech2;

    @Column(name = "VALORALUGUEL", precision = 14, scale = 2)
    private BigDecimal valoraluguel;

    @Column(name = "EMPRESA", length = 40)
    private String empresa;

    @Column(name = "ENDEREMPR", length = 40)
    private String enderempr;

    @Column(name = "MUNICEMPR", length = 15)
    private String municempr;

    @Column(name = "ESTEMPR", length = 2)
    private String estempr;

    @Column(name = "TELEMPR", length = 13)
    private String telempr;

    @Column(name = "CARGO", length = 30)
    private String cargo;

    @Column(name = "DTADMISSAO")
    private LocalDate dtadmissao;

    @Column(name = "RENDAMENSAL", precision = 14, scale = 2)
    private BigDecimal rendamensal;

    @Column(name = "NOMECONJUGE", length = 40)
    private String nomeconjuge;

    @Column(name = "CPFCONJUGE", length = 15)
    private String cpfconjuge;

    @Column(name = "EMPRESACONJUGE", length = 40)
    private String empresaconjuge;

    @Column(name = "ENDERCONJUGE", length = 40)
    private String enderconjuge;

    @Column(name = "MUNICCONJUGE", length = 15)
    private String municconjuge;

    @Column(name = "ESTCONJUGE", length = 2)
    private String estconjuge;

    @Column(name = "TELCONJUGE", length = 13)
    private String telconjuge;

    @Column(name = "CARGOCONJUGE", length = 30)
    private String cargoconjuge;

    @Column(name = "DTADMISSAOCONJUGE")
    private LocalDate dtadmissaoconjuge;

    @Column(name = "RENDAMENSALCONJUGE", precision = 14, scale = 2)
    private BigDecimal rendamensalconjuge;

    @Column(name = "VLOUTRASRENDAS", precision = 14, scale = 2)
    private BigDecimal vloutrasrendas;

    @Column(name = "CLIENTEELETRO", length = 1)
    private String clienteeletro;

    @Column(name = "GERENCIAMENTO", length = 1)
    private String gerenciamento;

    @Column(name = "CALCULAST", length = 1)
    private String calculast;

    @Column(name = "DTULTCONTATOCOB")
    private LocalDate dtultcontatocob;

    @Column(name = "CODFUNCULTCONTATOCOB")
    private Integer codfuncultcontatocob;

    @Column(name = "DTPROXCONTATOCOB")
    private LocalDate dtproxcontatocob;

    @Column(name = "ACEITACHTERCEIROS", length = 1)
    private String aceitachterceiros;

    @Column(name = "CLIENTEFONTEST", length = 1)
    private String clientefontest;

    @Column(name = "RATINGSCI", length = 2)
    private String ratingsci;

    @Column(name = "OBSTESOURARIA", length = 4000)
    private String obstesouraria;

    @Column(name = "OBSCALLCENTER", length = 4000)
    private String obscallcenter;

    @Column(name = "OBSRECEPCAO", length = 4000)
    private String obsrecepcao;

    @Column(name = "LISTAPLPAG", length = 20)
    private String listaplpag;

    @Column(name = "TELCELENT", length = 13)
    private String telcelent;

    @Column(name = "NUMCONCESSAO", length = 12)
    private String numconcessao;

    @Column(name = "ULTCODPLPAG")
    private Short ultcodplpag;

    @Column(name = "NUMREGIAOCLI")
    private Short numregiaocli;

    @Column(name = "EANENTREGA")
    private Long eanentrega;

    @Column(name = "EANCOBRANCA")
    private Long eancobranca;

    @Column(name = "QTCHECKOUT")
    private Integer qtcheckout;

    @Column(name = "FREQDIAVISITA")
    private Short freqdiavisita;

    @Column(name = "SITE", length = 80)
    private String site;

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

    @Column(name = "PERCBONIFIC", precision = 5, scale = 2)
    private BigDecimal percbonific;

    @Column(name = "CODSUFRAMA", length = 30)
    private String codsuframa;

    @Column(name = "CODPLPAG2")
    private Short codplpag2;

    @Column(name = "TIPOCUSTOTRANSF", length = 1)
    private String tipocustotransf;

    @Column(name = "PERACRESTRANSF", precision = 4, scale = 2)
    private BigDecimal peracrestransf;

    @Column(name = "ANALISECRED", length = 1)
    private String analisecred;

    @Column(name = "PLPAGNEG2", length = 1)
    private String plpagneg2;

    @Column(name = "CODFUNCULTALTERCLIESP")
    private Integer codfuncultaltercliesp;

    @Column(name = "DTULTALTERCLIESP")
    private LocalDate dtultaltercliesp;

    @Column(name = "DESTACAFRETE", length = 1)
    private String destacafrete;

    @Column(name = "PERCBASEVENDQT", precision = 5, scale = 2)
    private BigDecimal percbasevendqt;

    @Column(name = "CODFILIALESTOQUE", length = 1)
    private String codfilialestoque;

    @Column(name = "TIPOCONVERSAOTV4", length = 2)
    private String tipoconversaotv4;

    @Column(name = "APLICADESCNF", length = 1)
    private String aplicadescnf;

    @Column(name = "CODBARRACOB")
    private Long codbarracob;

    @Column(name = "CODBARRAENT")
    private Long codbarraent;

    @Column(name = "USAVLMINVENDABK", length = 1)
    private String usavlminvendabk;

    @Column(name = "UTILIZAIESIMPLIFICADA", length = 1)
    private String utilizaiesimplificada;

    @Column(name = "PRAZOADICIONAL2")
    private Short prazoadicional2;

    @Column(name = "PRAZOADICIONAL3")
    private Short prazoadicional3;

    @Column(name = "PRAZOADICIONAL4")
    private Short prazoadicional4;

    @Column(name = "PRAZOADICIONAL5")
    private Short prazoadicional5;

    @Column(name = "PRAZOADICIONAL6")
    private Short prazoadicional6;

    @Column(name = "PRAZOADICIONAL7")
    private Short prazoadicional7;

    @Column(name = "DTABERTCC1")
    private LocalDate dtabertcc1;

    @Column(name = "DTABERTCC2")
    private LocalDate dtabertcc2;

    @Column(name = "CONDVENDA20", length = 1)
    private String condvenda20;

    @Column(name = "CLIENTEMONITORADO", length = 1)
    private String clientemonitorado;

    @Column(name = "NUMALVARA", length = 30)
    private String numalvara;

    @Column(name = "DTVENCALVARA")
    private LocalDate dtvencalvara;

    @Column(name = "TIPOEMPRESA", length = 4)
    private String tipoempresa;

    @Column(name = "CGCENTREGA", length = 18)
    private String cgcentrega;

    @Column(name = "CODUSUR3")
    private Short codusur3;

    @Column(name = "PARAIBASIM", length = 1)
    private String paraibasim;

    @Column(name = "DTENQUADRAMENTOMICROEMPRESA")
    private LocalDate dtenquadramentomicroempresa;

    @Column(name = "ALIQICMS1", precision = 8, scale = 4)
    private BigDecimal aliqicms1;

    @Column(name = "DTVENCSUFRAMA")
    private LocalDate dtvencsuframa;

    @Column(name = "CONTRIBUINTE", length = 1)
    private String contribuinte;

    @Column(name = "ORIGEMPRECO", length = 1)
    private String origempreco;

    @Column(name = "ACEITAVENDAFRACAO", length = 1)
    private String aceitavendafracao;

    @Column(name = "CODPLPAGPADRAO")
    private Short codplpagpadrao;

    @Column(name = "EMITEDAE", length = 1)
    private String emitedae;

    @Column(name = "CONDVENDA98", length = 1)
    private String condvenda98;

    @Column(name = "CONDVENDA99", length = 1)
    private String condvenda99;

    @Column(name = "ISENTOIPI", length = 1)
    private String isentoipi;

    @Column(name = "OBSERVACAO", length = 2000)
    private String observacao;

    @Column(name = "DTNASC")
    private LocalDate dtnasc;

    @Column(name = "FILIACAOPAI", length = 40)
    private String filiacaopai;

    @Column(name = "FILIACAOMAE", length = 40)
    private String filiacaomae;

    @Column(name = "SEXO", length = 1)
    private String sexo;

    @Column(name = "DTNASCCONJ")
    private LocalDate dtnascconj;

    @Column(name = "FILIACAOPAICONJ", length = 40)
    private String filiacaopaiconj;

    @Column(name = "FILIACAOMAECONJ", length = 40)
    private String filiacaomaeconj;

    @Column(name = "RGCONJ", length = 20)
    private String rgconj;

    @Column(name = "ORGAORGCONJ", length = 4)
    private String orgaorgconj;

    @Column(name = "CODMUNICIPIO")
    private Long codmunicipio;

    @Column(name = "INCLUINOARQSCI", length = 1)
    private String incluinoarqsci;

    @Column(name = "OBSGERENCIAL1", length = 80)
    private String obsgerencial1;

    @Column(name = "OBSGERENCIAL2", length = 80)
    private String obsgerencial2;

    @Column(name = "OBSGERENCIAL3", length = 80)
    private String obsgerencial3;

    @Column(name = "TIPOCLIMED", length = 2)
    private String tipoclimed;

    @Column(name = "HORAPROXCONTATO")
    private Short horaproxcontato;

    @Column(name = "MINUTOPROXCONTATO")
    private Short minutoproxcontato;

    @Column(name = "EXPORTARDADOSIMS", length = 1)
    private String exportardadosims;

    @Column(name = "COMPLEMENTOENT", length = 80)
    private String complementoent;

    @Column(name = "RESSARCIMENTOST", length = 1)
    private String ressarcimentost;

    @Column(name = "REPASSE", length = 1)
    private String repasse;

    @Column(name = "DTULTCONSULTASINTEGRA")
    private LocalDate dtultconsultasintegra;

    @Column(name = "MEDDTLIBTRIBUT")
    private LocalDate meddtlibtribut;

    @Column(name = "MEDCODFUNCLIBTRIBUT")
    private Integer medcodfunclibtribut;

    @Column(name = "RATINGSCI1", length = 2)
    private String ratingsci1;

    @Column(name = "RATINGSCI2", length = 2)
    private String ratingsci2;

    @Column(name = "PRAZOVALIDADE")
    private Short prazovalidade;

    @Column(name = "DTULTCOMPNESTLE")
    private LocalDate dtultcompnestle;

    @Column(name = "DIRETORIOCLIENTE", length = 100)
    private String diretoriocliente;

    @Column(name = "CODCLIPALM")
    private Integer codclipalm;

    @Column(name = "NUMALVARAFUNC", length = 30)
    private String numalvarafunc;

    @Column(name = "DTVENCALVARAFUNC")
    private LocalDate dtvencalvarafunc;

    @Column(name = "DTVENCPRAZOADICIONAL")
    private LocalDate dtvencprazoadicional;

    @Column(name = "CLIENTEDAN", length = 1)
    private String clientedan;

    @Column(name = "IEST", length = 15)
    private String iest;

    @Column(name = "NUMTARE", length = 20)
    private String numtare;

    @Column(name = "CODSTATUSCOB")
    private Short codstatuscob;

    @Column(name = "USACROSS", length = 1)
    private String usacross;

    @Column(name = "VALIDAMAXVENDAPF", length = 1)
    private String validamaxvendapf;

    @Column(name = "DIGAGENCIA2", length = 1)
    private String digagencia2;

    @Column(name = "CODCONDICAOVENDA")
    private Integer codcondicaovenda;

    @Column(name = "ROTEIROMASTERFOODS", length = 20)
    private String roteiromasterfoods;

    @Column(name = "CODCIDADE")
    private Integer codcidade;

    @Column(name = "ORGAOPUB", length = 1)
    private String orgaopub;

    @Column(name = "NUMSEQATU")
    private Long numseqatu;

    @Column(name = "UFRG", length = 2)
    private String ufrg;

    @Column(name = "PRAZOMAXVALIDADE")
    private Integer prazomaxvalidade;

    @Column(name = "VALIDARMULTIPLOVENDA", length = 1)
    private String validarmultiplovenda;

    @Column(name = "CLIENTPROTESTO", length = 1)
    private String clientprotesto;

    @Column(name = "RFC", length = 20)
    private String rfc;

    @Column(name = "IVA", precision = 8, scale = 4)
    private BigDecimal iva;

    @Column(name = "IEPS", precision = 8, scale = 4)
    private BigDecimal ieps;

    @Column(name = "EDOENT", length = 3)
    private String edoent;

    @Column(name = "EDOCOB", length = 3)
    private String edocob;

    @Column(name = "EDOCOM", length = 3)
    private String edocom;

    @Column(name = "SIGLADEC", length = 5)
    private String sigladec;

    @Column(name = "CODFUNCLANCPOTENCIALLIMCRED")
    private Integer codfunclancpotenciallimcred;

    @Column(name = "VLPOTENCIALLIMCRED", precision = 14, scale = 2)
    private BigDecimal vlpotenciallimcred;

    @Column(name = "DTLANCPOTENCIALLIMCRED")
    private LocalDate dtlancpotenciallimcred;

    @Column(name = "VALIDARCAMPANHABRINDE", length = 1)
    private String validarcampanhabrinde;

    @Column(name = "MOTIVOEXCLUSAO", length = 40)
    private String motivoexclusao;

    @Column(name = "USABKCNPJCODCLIPRINC", length = 1)
    private String usabkcnpjcodcliprinc;

    @Column(name = "DTDESBLOQUEIO")
    private LocalDate dtdesbloqueio;

    @Column(name = "ACEITATROCANEGATIVA", length = 1)
    private String aceitatrocanegativa;

    @Column(name = "CLIENTE2", length = 100)
    private String cliente2;

    @Column(name = "MUNICENT2", length = 100)
    private String municent2;

    @Column(name = "MUNICCOB2", length = 100)
    private String municcob2;

    @Column(name = "MUNICCOM2", length = 100)
    private String municcom2;

    @Column(name = "QTESTRELA")
    private Short qtestrela;

    @Column(name = "GRUPORAMOATIVI", length = 2)
    private String gruporamoativi;

    @Column(name = "DTCLASSIFICAESTRELA")
    private LocalDate dtclassificaestrela;

    @Column(name = "DTCLASSIFICAGRUPO")
    private LocalDate dtclassificagrupo;

    @Column(name = "INSCESTADUAL", length = 20)
    private String inscestadual;

    @Column(name = "TIPODESCISENCAO", length = 1)
    private String tipodescisencao;

    @Column(name = "SUPRIMIDO", length = 1)
    private String suprimido;

    @Column(name = "CGEENTAUX", length = 18)
    private String cgeentaux;

    @Column(name = "ENVIADADOSSERASA", length = 1)
    private String enviadadosserasa;

    @Column(name = "BLOQUEIOSEFAZ", length = 1)
    private String bloqueiosefaz;

    @Column(name = "DTVALIDASEFAZ")
    private LocalDate dtvalidasefaz;

    @Column(name = "USAIVAFONTEDIFERENCIADO", length = 1)
    private String usaivafontediferenciado;

    @Column(name = "IVAFONTE", precision = 8, scale = 4)
    private BigDecimal ivafonte;

    @Column(name = "CODPRACACOB")
    private Integer codpracacob;

    @Column(name = "CODFORNECFRETE")
    private Integer codfornecfrete;

    @Column(name = "GEOTIPOPRECOST", length = 2)
    private String geotipoprecost;

    @Column(name = "GEOTIPOEMBALAGEM", length = 2)
    private String geotipoembalagem;

    @Lob
    @Column(name = "OBS_ADIC")
    private String obsAdic;

    @Column(name = "LIMCREDCPF", precision = 14, scale = 2)
    private BigDecimal limcredcpf;

    @Column(name = "BLOQUEIODEFINITIVO", length = 1)
    private String bloqueiodefinitivo;

    @Column(name = "VLFRETE", precision = 16, scale = 3)
    private BigDecimal vlfrete;

    @Column(name = "VLMAXCOBFRETE", precision = 12, scale = 2)
    private BigDecimal vlmaxcobfrete;

    @Column(name = "CODREDE")
    private Short codrede;

    @Column(name = "TIPOCUSTOTRANSF_FILIAIS", length = 1)
    private String tipocustotransfFiliais;

    @Column(name = "ORGAOPUBFEDERAL", length = 1)
    private String orgaopubfederal;

    @Column(name = "CODHIST")
    private Integer codhist;

    @Column(name = "CODCOBTV1", length = 4)
    private String codcobtv1;

    @Column(name = "CODCOBTV3", length = 4)
    private String codcobtv3;

    @Column(name = "TIPODOCUMENTO", length = 1)
    private String tipodocumento;

    @Column(name = "DTIMPORTINTEGRACAO")
    private LocalDate dtimportintegracao;

    @Column(name = "ISENTODIFALIQUOTAS", length = 1)
    private String isentodifaliquotas;

    @Column(name = "FRETEDESPACHO", length = 1)
    private String fretedespacho;

    @Column(name = "OBSSUFRAMA", length = 80)
    private String obssuframa;

    @Column(name = "COMPLEMENTOCOB", length = 80)
    private String complementocob;

    @Column(name = "NUMEROENT", length = 6)
    private String numeroent;

    @Column(name = "NUMEROCOB", length = 6)
    private String numerocob;

    @Column(name = "ATUALIZASALDOCCDESCFIN", length = 1)
    private String atualizasaldoccdescfin;

    @Column(name = "COMPLEMENTOCOM", length = 80)
    private String complementocom;

    @Column(name = "NUMEROCOM", length = 6)
    private String numerocom;

    @Column(name = "PERMITEALTERCOBRANCACR", length = 1)
    private String permitealtercobrancacr;

    @Column(name = "DTVALIDADECONV")
    private LocalDate dtvalidadeconv;

    @Column(name = "BLOQUEIODATACHEQ", length = 1)
    private String bloqueiodatacheq;

    @Column(name = "DTULTALTERSRVPRC")
    private LocalDate dtultaltersrvprc;

    @Column(name = "USACRECLIFAT", length = 1)
    private String usacreclifat;

    @Column(name = "PERCOMFILIALBROKER", precision = 8, scale = 4)
    private BigDecimal percomfilialbroker;

    @Column(name = "PERFRETEBROKER", precision = 8, scale = 4)
    private BigDecimal perfretebroker;

    @Column(name = "BLOQVENDAPF", length = 1)
    private String bloqvendapf;

    @Column(name = "AREALOJAM2")
    private Integer arealojam2;

    @Column(name = "PARTICIPAFUNCEP", length = 1)
    private String participafuncep;

    @Column(name = "CODPROFISSIONAL")
    private Integer codprofissional;

    @Column(name = "ATENDEDOMINGO", length = 1)
    private String atendedomingo;

    @Column(name = "ATENDESEGUNDA", length = 1)
    private String atendesegunda;

    @Column(name = "ATENDETERCA", length = 1)
    private String atendeterca;

    @Column(name = "ATENDEQUARTA", length = 1)
    private String atendequarta;

    @Column(name = "ATENDEQUINTA", length = 1)
    private String atendequinta;

    @Column(name = "ATENDESEXTA", length = 1)
    private String atendesexta;

    @Column(name = "ATENDESABADO", length = 1)
    private String atendesabado;

    @Column(name = "EMITEPVENDANFSEMDESC", length = 1)
    private String emitepvendanfsemdesc;

    @Column(name = "CODCLIWEB")
    private Long codcliweb;

    @Column(name = "INVESTIMENTO", length = 1)
    private String investimento;

    @Column(name = "FOCO", length = 1)
    private String foco;

    @Column(name = "FOTOGRAFIASUCESSO", length = 1)
    private String fotografiasucesso;

    @Column(name = "PDVINVESTIMENTO", length = 1)
    private String pdvinvestimento;

    @Column(name = "CONTAGEMESTOQUE", length = 1)
    private String contagemestoque;

    @Column(name = "NUMREGISTROIMUNE", length = 20)
    private String numregistroimune;

    @Column(name = "SACADOELETRONICO", length = 1)
    private String sacadoeletronico;

    @Column(name = "PERMINVALIDADE", precision = 7, scale = 4)
    private BigDecimal perminvalidade;

    @Column(name = "DATACOLETA")
    private LocalDate datacoleta;

    @Column(name = "LONGITUDE", length = 20)
    private String longitude;

    @Column(name = "LATITUDE", length = 20)
    private String latitude;

    @Column(name = "CODCLIINT")
    private Long codcliint;

    @Column(name = "STATUSCONSULTASINTEGRA", length = 1)
    private String statusconsultasintegra;

    @Column(name = "DATACONSULTASINTEGRA")
    private LocalDate dataconsultasintegra;

    @Column(name = "PRAZOMEDIOPLPAG")
    private Short prazomedioplpag;

    @Column(name = "UTILIZAPRAZOMEDIOPLPAG", length = 1)
    private String utilizaprazomedioplpag;

    @Column(name = "PERCTOLVALIDADEPRODWMS", precision = 10, scale = 4)
    private BigDecimal perctolvalidadeprodwms;

    @Column(name = "ANVISA", length = 1)
    private String anvisa;

    @Column(name = "SUS", length = 1)
    private String sus;

    @Column(name = "TIPOCUSTOTRANSF_FILIALVIRTUAL", length = 1)
    private String tipocustotransfFilialvirtual;

    @Column(name = "GERARCREDITODEVCLI", length = 1)
    private String gerarcreditodevcli;

    @Column(name = "RETENCAOISS", length = 1)
    private String retencaoiss;

    @Column(name = "HORACADASTRO")
    private LocalDate horacadastro;

    @Column(name = "ZONA")
    private Short zona;

    @Column(name = "NUMALVARASUS", length = 30)
    private String numalvarasus;

    @Column(name = "DTVENCALVARASUS")
    private LocalDate dtvencalvarasus;

    @Column(name = "CODBAIRROENT")
    private Integer codbairroent;

    @Column(name = "CODBAIRROCOM")
    private Integer codbairrocom;

    @Column(name = "CODBAIRROCOB")
    private Integer codbairrocob;

    @Column(name = "NUMCARTAOFIDELIDADE", length = 20)
    private String numcartaofidelidade;

    @Column(name = "CNPJCISP", length = 8)
    private String cnpjcisp;

    @Column(name = "OBSENTREGA4", length = 75)
    private String obsentrega4;

    @Column(name = "IMPORTADOCRM", length = 1)
    private String importadocrm;

    @Column(name = "SIMPLESNACIONAL", length = 1)
    private String simplesnacional;

    @Column(name = "BLOQUEIOSEFAZPED", length = 1)
    private String bloqueiosefazped;

    @Column(name = "GERATITULOST", length = 1)
    private String geratitulost;

    @Column(name = "PRAZOVENCST")
    private Short prazovencst;

    @Column(name = "AGREGARVALORSTDESCFIN", length = 1)
    private String agregarvalorstdescfin;

    @Column(name = "ENVIOPDFNFE", length = 1)
    private String enviopdfnfe;

    @Column(name = "DTVENCALVARAANVISA")
    private LocalDate dtvencalvaraanvisa;

    @Column(name = "DTVENCCRF")
    private LocalDate dtvenccrf;

    @Column(name = "NUMALVARAANVISA", length = 20)
    private String numalvaraanvisa;

    @Column(name = "NUMCRF", length = 20)
    private String numcrf;

    @Column(name = "VLMINIMOST", precision = 18, scale = 6)
    private BigDecimal vlminimost;

    @Column(name = "TIPOTRATAMENTODESCFIN", length = 2)
    private String tipotratamentodescfin;

    @Column(name = "QTDDIASAPLICDESCFIN")
    private Short qtddiasaplicdescfin;

    @Column(name = "ACEITASIMILAR", length = 1)
    private String aceitasimilar;

    @Column(name = "PISCOFINSCUMULATIVO", length = 1)
    private String piscofinscumulativo;

    @Column(name = "ENVIONFEEMAILCOM", length = 1)
    private String envionfeemailcom;

    @Column(name = "CODCONTAB", length = 12)
    private String codcontab;

    @Column(name = "DIRETORIOCONTRATO", length = 100)
    private String diretoriocontrato;

    @Column(name = "DTINIVISTORIA")
    private LocalDate dtinivistoria;

    @Column(name = "PERIODVISTORIA")
    private Integer periodvistoria;

    @Column(name = "DTPROXVISTORIA")
    private LocalDate dtproxvistoria;

    @Column(name = "CODPLPAGETICO")
    private Short codplpagetico;

    @Column(name = "CODPLPAGGENERICO")
    private Short codplpaggenerico;

    @Column(name = "UTILIZAPLPAGMEDICAMENTO", length = 1)
    private String utilizaplpagmedicamento;

    @Column(name = "PRECOUTILIZADONFE", length = 2)
    private String precoutilizadonfe;

    @Column(name = "NUMCRM", length = 10)
    private String numcrm;

    @Column(name = "ISENCAOSUFRAMA", length = 1)
    private String isencaosuframa;

    @Column(name = "REGISTROIBAMA", length = 30)
    private String registroibama;

    @Column(name = "DTVALIDADEIBAMA")
    private LocalDate dtvalidadeibama;

    @Column(name = "USADESCONTOICMS", length = 1)
    private String usadescontoicms;

    @Column(name = "CODGLN")
    private Long codgln;

    @Column(name = "TIPOATIVCLI", length = 1)
    private String tipoativcli;

    @Column(name = "CODPAIS")
    private Integer codpais;

    @Column(name = "USADESCFINSEPARADODESCCOM", length = 1)
    private String usadescfinseparadodesccom;

    @Column(name = "UTILIZAPEDCLINFE", length = 1)
    private String utilizapedclinfe;

    @Column(name = "SENHACONVECF", length = 25)
    private String senhaconvecf;

    @Column(name = "CODPLPAGAGRUPAUTOMATIC")
    private Short codplpagagrupautomatic;

    @Column(name = "PERIODICIDADEAGRUP")
    private Short periodicidadeagrup;

    @Column(name = "DTULTAGRUPAMENTO")
    private LocalDate dtultagrupamento;

    @Column(name = "TIPOVENDA", length = 1)
    private String tipovenda;

    @Column(name = "NUMALVARARETINOICO", length = 30)
    private String numalvararetinoico;

    @Column(name = "DTVENCALVARARETINOICO")
    private LocalDate dtvencalvararetinoico;

    @Column(name = "USAVENDAEXPORTACAO", length = 1)
    private String usavendaexportacao;

    @Column(name = "BLOQREMCOB", length = 1)
    private String bloqremcob;

    @Column(name = "CLIATACADO", length = 1)
    private String cliatacado;

    @Column(name = "TAXABOLETONF", length = 1)
    private String taxaboletonf;

    @Column(name = "TURNOENTREGA", length = 5)
    private String turnoentrega;

    @Column(name = "NOMEFARMACEUTICO", length = 40)
    private String nomefarmaceutico;

    @Column(name = "NUMALVARAESPEC", length = 30)
    private String numalvaraespec;

    @Column(name = "IDINTEGRACAOMYFROTA")
    private byte[] idintegracaomyfrota;

    @Column(name = "PERDESMAXPONDERADO", precision = 18, scale = 6)
    private BigDecimal perdesmaxponderado;

    @Column(name = "EMPRESACONVENIADA", length = 1)
    private String empresaconveniada;

    @Column(name = "DIAFECHACONVENIO")
    private Short diafechaconvenio;

    @Column(name = "QTDIASCARENCIACONV")
    private Short qtdiascarenciaconv;

    @Column(name = "APLICREDBASEICMSTRANSP", length = 1)
    private String aplicredbaseicmstransp;

    @Column(name = "DTPROXDESDAGENDADO")
    private LocalDate dtproxdesdagendado;

    @Column(name = "UTILIZACALCULOSTMT", length = 1)
    private String utilizacalculostmt;

    @Column(name = "TPCOMUNICADOSERASA", length = 1)
    private String tpcomunicadoserasa;

    @Column(name = "SERASAGERENCIE", length = 1)
    private String serasagerencie;

    @Column(name = "DTSERASAGERENCIE")
    private LocalDate dtserasagerencie;

    @Column(name = "PRAZOSERASAGERENCIE")
    private Short prazoserasagerencie;

    @Column(name = "DESCONSVALIDASEFAZ", length = 1)
    private String desconsvalidasefaz;

    @Column(name = "CODBAIRRODELIV")
    private Integer codbairrodeliv;

    @Column(name = "USADEBCREDRCA", length = 1)
    private String usadebcredrca;

    @Column(name = "ORGAOPUBMUNICIPAL", length = 1)
    private String orgaopubmunicipal;

    @Column(name = "CODCIDADECOM")
    private Integer codcidadecom;

    @Column(name = "CODPROMOCAOMED")
    private Integer codpromocaomed;

    @Column(name = "RECEBERBOLETOPOREMAIL", length = 1)
    private String receberboletoporemail;

    @Column(name = "DIAFATURAR")
    private Short diafaturar;

    @Column(name = "NILPLPAGSOBREPOEPLPAGDISTRIB", length = 1)
    private String nilplpagsobrepoeplpagdistrib;

    @Column(name = "DTULTALTER1203")
    private LocalDate dtultalter1203;

    @Column(name = "CODFUNCULTALTER1203")
    private Integer codfuncultalter1203;

    @Column(name = "CLICRM", length = 1)
    private String clicrm;

    @Column(name = "PARTICIPAFARMACIAPOPULAR", length = 1)
    private String participafarmaciapopular;

    @Column(name = "TV10USACUSTOPRODUTO", length = 1)
    private String tv10usacustoproduto;

    @Column(name = "USASEGURO", length = 1)
    private String usaseguro;

    @Column(name = "TIPOSEGURO", length = 1)
    private String tiposeguro;

    @Column(name = "USAREGIMEESPISENSTFONTE", length = 1)
    private String usaregimeespisenstfonte;

    @Column(name = "EMAILCOB", length = 100)
    private String emailcob;

    @Column(name = "NOTIFICACAOTGI", length = 2)
    private String notificacaotgi;

    @Column(name = "ACIONAMENTOCLIENTE", length = 2)
    private String acionamentocliente;

    @Column(name = "DTALTDADOSBANCARIOS")
    private LocalDate dtaltdadosbancarios;

    @Column(name = "DTULTALTERCLASSE")
    private LocalDate dtultalterclasse;

    @Column(name = "MELDTABERTCC1")
    private LocalDate meldtabertcc1;

    @Column(name = "MELDTABERTCC2")
    private LocalDate meldtabertcc2;

    @Column(name = "MELDTABERTCC3")
    private LocalDate meldtabertcc3;

    @Column(name = "VALPESOVARMAPAWMS")
    private Boolean valpesovarmapawms;

    @Column(name = "PERMITEAGRUPAMENTO", length = 1)
    private String permiteagrupamento;

    @Column(name = "BLOQUEIOINATIVIDADE", length = 1)
    private String bloqueioinatividade;

    @Column(name = "UTILIZATXDIFENTREGA", length = 1)
    private String utilizatxdifentrega;

    @Column(name = "ISENTOTXENTREGA", length = 1)
    private String isentotxentrega;

    @Column(name = "CODFUNCANALISECRED")
    private Integer codfuncanalisecred;

    @Column(name = "RIOLOG", length = 1)
    private String riolog;

    @Column(name = "VENDALOCESTRANG", length = 1)
    private String vendalocestrang;

    @Column(name = "IDENTIFICESTRANG", length = 20)
    private String identificestrang;

    @Column(name = "VALIDARLIMBONIFIC", length = 1)
    private String validarlimbonific;

    @Column(name = "TIPOCUSTOMANIF", length = 2)
    private String tipocustomanif;

    @Column(name = "DIALIMITFATU")
    private Short dialimitfatu;

    @Column(name = "FORCECLIPF")
    private Boolean forceclipf;

    @Column(name = "FORCACLIPJ")
    private Boolean forcaclipj;

    @Column(name = "CODCNES", length = 10)
    private String codcnes;

    @Column(name = "PERMITIRAGRUPARTITULO", length = 1)
    private String permitiragrupartitulo;

    @Column(name = "NUMDIASPROTESTO")
    private Short numdiasprotesto;

    @Column(name = "TIPODIAUTILROTA", length = 1)
    private String tipodiautilrota;

    @Column(name = "LIMITECREDSUPPLI", precision = 12, scale = 2)
    private BigDecimal limitecredsuppli;

    @Column(name = "USACMVDIFERENCIADO", length = 1)
    private String usacmvdiferenciado;

    @Column(name = "SITUACAOECOMMERCEUNILEVER", length = 3)
    private String situacaoecommerceunilever;

    @Column(name = "PAGCHEQUEMORADIA", length = 1)
    private String pagchequemoradia;

    @Column(name = "USATDE", length = 1)
    private String usatde;

    @Column(name = "CODROTAINSERVIVEL")
    private Integer codrotainservivel;

    @Column(name = "PRAZOENTREGACARCACA")
    private Short prazoentregacarcaca;

    @Column(name = "CODUSURECOMMERCE")
    private Short codusurecommerce;

    @Column(name = "COZINHAINDUSTRIAL", length = 1)
    private String cozinhaindustrial;


    @Column(name = "CODGRUPOCLICOMISSMED")
    private Integer codgrupoclicomissmed;

    @Column(name = "TIPOCUSTOTRANSFTV9", length = 1)
    private String tipocustotransftv9;

    @Column(name = "SALDOLIMCREDBROKER", precision = 18, scale = 6)
    private BigDecimal saldolimcredbroker;

    @Column(name = "VLLIMCREDBROKER", precision = 18, scale = 6)
    private BigDecimal vllimcredbroker;

    @Column(name = "IDENTVALERIODOCE", length = 40)
    private String identvaleriodoce;

    @Column(name = "PROXNUMSEQEND")
    private Integer proxnumseqend;

    @Column(name = "DTSYNCPATHFIND")
    private LocalDate dtsyncpathfind;

    @Column(name = "ACEITAPEDMONTPATHFIND", length = 1)
    private String aceitapedmontpathfind;

    @Column(name = "ACEITAINSERIRPRODUTOAUT", length = 1)
    private String aceitainserirprodutoaut;

    @Column(name = "TV1OBRIGATORIOTV5", length = 1)
    private String tv1obrigatoriotv5;

    @Column(name = "TIPODOCUMENTOENTREGAFUTURA", length = 1)
    private String tipodocumentoentregafutura;

    @Column(name = "INCIDENCIACPRB", length = 1)
    private String incidenciacprb;

    @Column(name = "PERCREDICMS", precision = 18, scale = 6)
    private BigDecimal percredicms;

    @Column(name = "CODCLASSE_DMS", length = 30)
    private String codclasseDms;

    @Column(name = "CLIEXCLUSIVO_DMS", length = 5)
    private String cliexclusivoDms;

    @Column(name = "CODGRUPO_DMS", length = 40)
    private String codgrupoDms;

    @Column(name = "CODCANAL_DMS", length = 50)
    private String codcanalDms;

    @Column(name = "CODSEGMENTACAO_DMS", length = 50)
    private String codsegmentacaoDms;

    @Column(name = "CODTIPONEGOCIO_DMS", length = 50)
    private String codtiponegocioDms;

    @Column(name = "ENVIARCADINTEGRA_DMS", length = 1)
    private String enviarcadintegraDms;

    @Column(name = "CODHOLDIN_DMS", length = 20)
    private String codholdinDms;

    @Column(name = "CODBANDEIRA_DMS", length = 20)
    private String codbandeiraDms;

    @Column(name = "FREQVISITA_DMS", length = 10)
    private String freqvisitaDms;

    @Column(name = "CODTIPOVENDA_DMS", length = 20)
    private String codtipovendaDms;

    @Column(name = "CLIMEIOPTANTESN", length = 1)
    private String climeioptantesn;

    @Lob
    @Column(name = "MOTIVOBLOQ")
    private String motivobloq;

    @Column(name = "PERCFRETEAUTON", precision = 6, scale = 2)
    private BigDecimal percfreteauton;

    @Column(name = "POSSUIBENFFISCAL", length = 1)
    private String possuibenffiscal;

    @Column(name = "USAREGIMEESPISENREDICMS", length = 1)
    private String usaregimeespisenredicms;

    @Column(name = "CHECKINAPP")
    private LocalDate checkinapp;

    @Column(name = "IDSOFITVIEW", length = 10)
    private String idsofitview;

    @Column(name = "DTULTALTERSOFITVIEW")
    private LocalDate dtultaltersofitview;

    @Column(name = "DTEXCLUSAOSOFITVIEW")
    private LocalDate dtexclusaosofitview;

    @Column(name = "RAZAORECEBEDORENDENT", length = 60)
    private String razaorecebedorendent;

    @Column(name = "CEPRECEBEDORENDENT")
    private Integer ceprecebedorendent;

    @Column(name = "IERECEBEDORENDENT")
    private Long ierecebedorendent;

    @Column(name = "FONERECEBEDORENDENT")
    private Long fonerecebedorendent;

    @Column(name = "CODPAISRECEBEDORENDENT")
    private Integer codpaisrecebedorendent;

    @Column(name = "EMAILRECEBEDORENDENT", length = 60)
    private String emailrecebedorendent;

    @Column(name = "QTDIASAVENCERPRODUTO")
    private Short qtdiasavencerproduto;

    @Column(name = "CODCONDCOMERCIAL", length = 20)
    private String codcondcomercial;

    @Column(name = "CODGRUPOCOMERCIALMED")
    private Short codgrupocomercialmed;

    @Column(name = "CODCAMINHOENTREGAMED")
    private Short codcaminhoentregamed;

    @Column(name = "CODMOTIVO_DMS", length = 3)
    private String codmotivoDms;

    @Column(name = "AGREGARIPIBASEICMS", length = 1)
    private String agregaripibaseicms;

    @Column(name = "CLIENTEMAISNEGOCIOS", length = 1)
    private String clientemaisnegocios;

    @Column(name = "DATAHORACONSULTAMAISNEGOCIOS")
    private LocalDate datahoraconsultamaisnegocios;

    @Column(name = "PERMITEFATURARAPRAZOMAISNEG", length = 1)
    private String permitefaturaraprazomaisneg;

    @Column(name = "LIMITELIBERADOMAISNEG", precision = 22, scale = 6)
    private BigDecimal limiteliberadomaisneg;

    @Column(name = "STATUSMAISNEG", length = 1)
    private String statusmaisneg;

    @Column(name = "CODROTINAALT", length = 40)
    private String codrotinaalt;

    @Column(name = "RETECAOIRORGPUB", length = 1)
    private String retecaoirorgpub;

    @Column(name = "RETECAOCSORGPUB", length = 1)
    private String retecaocsorgpub;

    @Column(name = "RETECAOPISORGPUB", length = 1)
    private String retecaopisorgpub;

    @Column(name = "RETECAOCOFINSORGPUB", length = 1)
    private String retecaocofinsorgpub;

    @Column(name = "RETECAOICMSSTORGPUB", length = 1)
    private String retecaoicmsstorgpub;

    @Column(name = "RETECAOOUTDEDORGPUB", length = 1)
    private String retecaooutdedorgpub;


    @Column(name = "GERAGRPRETTRIB", length = 1)
    private String geragrprettrib;


    @Column(name = "PRAZOVENDA")
    private Short prazovenda;

    @Column(name = "DTALTERC5")
    private Instant dtalterc5;

    @Column(name = "CRF", length = 30)
    private String crf;

    @Column(name = "DIGAGENCIA1", length = 2)
    private String digagencia1;

    @Column(name = "EMAILNFE", length = 3500)
    private String emailnfe;

    @Column(name = "QTDIASVENCLIMCRED")
    private Short qtdiasvenclimcred;

    public PcclientId getId() {
        return id;
    }

    public void setId(PcclientId id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
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

    public String getTelcob() {
        return telcob;
    }

    public void setTelcob(String telcob) {
        this.telcob = telcob;
    }

    public String getMuniccob() {
        return municcob;
    }

    public void setMuniccob(String municcob) {
        this.municcob = municcob;
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

    public String getEnderent() {
        return enderent;
    }

    public void setEnderent(String enderent) {
        this.enderent = enderent;
    }

    public String getBairroent() {
        return bairroent;
    }

    public void setBairroent(String bairroent) {
        this.bairroent = bairroent;
    }

    public String getTelent() {
        return telent;
    }

    public void setTelent(String telent) {
        this.telent = telent;
    }

    public String getMunicent() {
        return municent;
    }

    public void setMunicent(String municent) {
        this.municent = municent;
    }

    public String getEstent() {
        return estent;
    }

    public void setEstent(String estent) {
        this.estent = estent;
    }

    public String getCepent() {
        return cepent;
    }

    public void setCepent(String cepent) {
        this.cepent = cepent;
    }

    public String getCgcent() {
        return cgcent;
    }

    public void setCgcent(String cgcent) {
        this.cgcent = cgcent;
    }

    public String getIeent() {
        return ieent;
    }

    public void setIeent(String ieent) {
        this.ieent = ieent;
    }

    public LocalDate getDtultcomp() {
        return dtultcomp;
    }

    public void setDtultcomp(LocalDate dtultcomp) {
        this.dtultcomp = dtultcomp;
    }

    public Integer getCodatv1() {
        return codatv1;
    }

    public void setCodatv1(Integer codatv1) {
        this.codatv1 = codatv1;
    }

    public String getBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(String bloqueio) {
        this.bloqueio = bloqueio;
    }

    public String getFaxcli() {
        return faxcli;
    }

    public void setFaxcli(String faxcli) {
        this.faxcli = faxcli;
    }

    public BigDecimal getLimcred() {
        return limcred;
    }

    public void setLimcred(BigDecimal limcred) {
        this.limcred = limcred;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public LocalDate getDtprimcompra() {
        return dtprimcompra;
    }

    public void setDtprimcompra(LocalDate dtprimcompra) {
        this.dtprimcompra = dtprimcompra;
    }

    public Integer getCodcliprinc() {
        return codcliprinc;
    }

    public void setCodcliprinc(Integer codcliprinc) {
        this.codcliprinc = codcliprinc;
    }

    public String getCodcob() {
        return codcob;
    }

    public void setCodcob(String codcob) {
        this.codcob = codcob;
    }

    public LocalDate getDtreglim() {
        return dtreglim;
    }

    public void setDtreglim(LocalDate dtreglim) {
        this.dtreglim = dtreglim;
    }

    public LocalDate getDtvenclimcred() {
        return dtvenclimcred;
    }

    public void setDtvenclimcred(LocalDate dtvenclimcred) {
        this.dtvenclimcred = dtvenclimcred;
    }

    public LocalDate getDtbloq() {
        return dtbloq;
    }

    public void setDtbloq(LocalDate dtbloq) {
        this.dtbloq = dtbloq;
    }

    public Integer getCodpraca() {
        return codpraca;
    }

    public void setCodpraca(Integer codpraca) {
        this.codpraca = codpraca;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getEmitedup() {
        return emitedup;
    }

    public void setEmitedup(String emitedup) {
        this.emitedup = emitedup;
    }

    public String getObs2() {
        return obs2;
    }

    public void setObs2(String obs2) {
        this.obs2 = obs2;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getPontorefer() {
        return pontorefer;
    }

    public void setPontorefer(String pontorefer) {
        this.pontorefer = pontorefer;
    }

    public String getHorarioreceb() {
        return horarioreceb;
    }

    public void setHorarioreceb(String horarioreceb) {
        this.horarioreceb = horarioreceb;
    }

    public String getPredioproprio() {
        return predioproprio;
    }

    public void setPredioproprio(String predioproprio) {
        this.predioproprio = predioproprio;
    }

    public LocalDate getInicioativ() {
        return inicioativ;
    }

    public void setInicioativ(LocalDate inicioativ) {
        this.inicioativ = inicioativ;
    }

    public LocalDate getDtultalter() {
        return dtultalter;
    }

    public void setDtultalter(LocalDate dtultalter) {
        this.dtultalter = dtultalter;
    }

    public String getTipoultalter() {
        return tipoultalter;
    }

    public void setTipoultalter(String tipoultalter) {
        this.tipoultalter = tipoultalter;
    }

    public String getObscredito() {
        return obscredito;
    }

    public void setObscredito(String obscredito) {
        this.obscredito = obscredito;
    }

    public String getTipofj() {
        return tipofj;
    }

    public void setTipofj(String tipofj) {
        this.tipofj = tipofj;
    }

    public String getIsentajuros() {
        return isentajuros;
    }

    public void setIsentajuros(String isentajuros) {
        this.isentajuros = isentajuros;
    }

    public String getTelent1() {
        return telent1;
    }

    public void setTelent1(String telent1) {
        this.telent1 = telent1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhaWeb() {
        return senhaWeb;
    }

    public void setSenhaWeb(String senhaWeb) {
        this.senhaWeb = senhaWeb;
    }

    public Boolean getFreqvisita() {
        return freqvisita;
    }

    public void setFreqvisita(Boolean freqvisita) {
        this.freqvisita = freqvisita;
    }

    public Short getCodplpag() {
        return codplpag;
    }

    public void setCodplpag(Short codplpag) {
        this.codplpag = codplpag;
    }

    public Short getPrazoadicional() {
        return prazoadicional;
    }

    public void setPrazoadicional(Short prazoadicional) {
        this.prazoadicional = prazoadicional;
    }

    public String getObs3() {
        return obs3;
    }

    public void setObs3(String obs3) {
        this.obs3 = obs3;
    }

    public String getObs4() {
        return obs4;
    }

    public void setObs4(String obs4) {
        this.obs4 = obs4;
    }

    public BigDecimal getPerdesc() {
        return perdesc;
    }

    public void setPerdesc(BigDecimal perdesc) {
        this.perdesc = perdesc;
    }

    public Long getNumseq() {
        return numseq;
    }

    public void setNumseq(Long numseq) {
        this.numseq = numseq;
    }

    public String getPlpagneg() {
        return plpagneg;
    }

    public void setPlpagneg(String plpagneg) {
        this.plpagneg = plpagneg;
    }

    public String getPaisent() {
        return paisent;
    }

    public void setPaisent(String paisent) {
        this.paisent = paisent;
    }

    public Integer getCaixapostal() {
        return caixapostal;
    }

    public void setCaixapostal(Integer caixapostal) {
        this.caixapostal = caixapostal;
    }

    public Integer getCepcxpostal() {
        return cepcxpostal;
    }

    public void setCepcxpostal(Integer cepcxpostal) {
        this.cepcxpostal = cepcxpostal;
    }

    public String getRegjuntacomercial() {
        return regjuntacomercial;
    }

    public void setRegjuntacomercial(String regjuntacomercial) {
        this.regjuntacomercial = regjuntacomercial;
    }

    public String getMicroempresa() {
        return microempresa;
    }

    public void setMicroempresa(String microempresa) {
        this.microempresa = microempresa;
    }

    public Short getDddinternacional() {
        return dddinternacional;
    }

    public void setDddinternacional(Short dddinternacional) {
        this.dddinternacional = dddinternacional;
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

    public String getEndercom() {
        return endercom;
    }

    public void setEndercom(String endercom) {
        this.endercom = endercom;
    }

    public String getBairrocom() {
        return bairrocom;
    }

    public void setBairrocom(String bairrocom) {
        this.bairrocom = bairrocom;
    }

    public String getMuniccom() {
        return municcom;
    }

    public void setMuniccom(String municcom) {
        this.municcom = municcom;
    }

    public String getEstcom() {
        return estcom;
    }

    public void setEstcom(String estcom) {
        this.estcom = estcom;
    }

    public String getCepcom() {
        return cepcom;
    }

    public void setCepcom(String cepcom) {
        this.cepcom = cepcom;
    }

    public String getTelcom() {
        return telcom;
    }

    public void setTelcom(String telcom) {
        this.telcom = telcom;
    }

    public String getFaxcom() {
        return faxcom;
    }

    public void setFaxcom(String faxcom) {
        this.faxcom = faxcom;
    }

    public String getSulframa() {
        return sulframa;
    }

    public void setSulframa(String sulframa) {
        this.sulframa = sulframa;
    }

    public Long getCodbarra() {
        return codbarra;
    }

    public void setCodbarra(Long codbarra) {
        this.codbarra = codbarra;
    }

    public String getIcmsantecip() {
        return icmsantecip;
    }

    public void setIcmsantecip(String icmsantecip) {
        this.icmsantecip = icmsantecip;
    }

    public String getCacex() {
        return cacex;
    }

    public void setCacex(String cacex) {
        this.cacex = cacex;
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

    public BigDecimal getPerdesc2() {
        return perdesc2;
    }

    public void setPerdesc2(BigDecimal perdesc2) {
        this.perdesc2 = perdesc2;
    }

    public BigDecimal getPerdesc3() {
        return perdesc3;
    }

    public void setPerdesc3(BigDecimal perdesc3) {
        this.perdesc3 = perdesc3;
    }

    public BigDecimal getPerdesc4() {
        return perdesc4;
    }

    public void setPerdesc4(BigDecimal perdesc4) {
        this.perdesc4 = perdesc4;
    }

    public BigDecimal getPerdesc5() {
        return perdesc5;
    }

    public void setPerdesc5(BigDecimal perdesc5) {
        this.perdesc5 = perdesc5;
    }

    public BigDecimal getPerdescfin() {
        return perdescfin;
    }

    public void setPerdescfin(BigDecimal perdescfin) {
        this.perdescfin = perdescfin;
    }

    public String getIsentoicms() {
        return isentoicms;
    }

    public void setIsentoicms(String isentoicms) {
        this.isentoicms = isentoicms;
    }

    public BigDecimal getPerdescisentoicms() {
        return perdescisentoicms;
    }

    public void setPerdescisentoicms(BigDecimal perdescisentoicms) {
        this.perdescisentoicms = perdescisentoicms;
    }

    public String getCodnilsen() {
        return codnilsen;
    }

    public void setCodnilsen(String codnilsen) {
        this.codnilsen = codnilsen;
    }

    public String getIment() {
        return iment;
    }

    public void setIment(String iment) {
        this.iment = iment;
    }

    public String getCodfilialnf() {
        return codfilialnf;
    }

    public void setCodfilialnf(String codfilialnf) {
        this.codfilialnf = codfilialnf;
    }

    public String getIsentotxboleto() {
        return isentotxboleto;
    }

    public void setIsentotxboleto(String isentotxboleto) {
        this.isentotxboleto = isentotxboleto;
    }

    public Long getNumtransvendadesc() {
        return numtransvendadesc;
    }

    public void setNumtransvendadesc(Long numtransvendadesc) {
        this.numtransvendadesc = numtransvendadesc;
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

    public LocalDate getDtcapitalsocial() {
        return dtcapitalsocial;
    }

    public void setDtcapitalsocial(LocalDate dtcapitalsocial) {
        this.dtcapitalsocial = dtcapitalsocial;
    }

    public BigDecimal getCapitalsocial() {
        return capitalsocial;
    }

    public void setCapitalsocial(BigDecimal capitalsocial) {
        this.capitalsocial = capitalsocial;
    }

    public Short getNumbanco1() {
        return numbanco1;
    }

    public void setNumbanco1(Short numbanco1) {
        this.numbanco1 = numbanco1;
    }

    public Integer getNumagencia1() {
        return numagencia1;
    }

    public void setNumagencia1(Integer numagencia1) {
        this.numagencia1 = numagencia1;
    }

    public String getNumccorrente1() {
        return numccorrente1;
    }

    public void setNumccorrente1(String numccorrente1) {
        this.numccorrente1 = numccorrente1;
    }

    public Short getNumbanco2() {
        return numbanco2;
    }

    public void setNumbanco2(Short numbanco2) {
        this.numbanco2 = numbanco2;
    }

    public Integer getNumagencia2() {
        return numagencia2;
    }

    public void setNumagencia2(Integer numagencia2) {
        this.numagencia2 = numagencia2;
    }

    public String getNumccorrente2() {
        return numccorrente2;
    }

    public void setNumccorrente2(String numccorrente2) {
        this.numccorrente2 = numccorrente2;
    }

    public LocalDate getDtultvisita() {
        return dtultvisita;
    }

    public void setDtultvisita(LocalDate dtultvisita) {
        this.dtultvisita = dtultvisita;
    }

    public Integer getCodfunccadastro() {
        return codfunccadastro;
    }

    public void setCodfunccadastro(Integer codfunccadastro) {
        this.codfunccadastro = codfunccadastro;
    }

    public String getEmpfixa() {
        return empfixa;
    }

    public void setEmpfixa(String empfixa) {
        this.empfixa = empfixa;
    }

    public String getLimiteautori() {
        return limiteautori;
    }

    public void setLimiteautori(String limiteautori) {
        this.limiteautori = limiteautori;
    }

    public BigDecimal getPercomcli() {
        return percomcli;
    }

    public void setPercomcli(BigDecimal percomcli) {
        this.percomcli = percomcli;
    }

    public Short getNumseqrotarca() {
        return numseqrotarca;
    }

    public void setNumseqrotarca(Short numseqrotarca) {
        this.numseqrotarca = numseqrotarca;
    }

    public String getDiasemana() {
        return diasemana;
    }

    public void setDiasemana(String diasemana) {
        this.diasemana = diasemana;
    }

    public BigDecimal getPerbasevend() {
        return perbasevend;
    }

    public void setPerbasevend(BigDecimal perbasevend) {
        this.perbasevend = perbasevend;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaorg() {
        return orgaorg;
    }

    public void setOrgaorg(String orgaorg) {
        this.orgaorg = orgaorg;
    }

    public String getDescproduto() {
        return descproduto;
    }

    public void setDescproduto(String descproduto) {
        this.descproduto = descproduto;
    }

    public Integer getCodfunccad() {
        return codfunccad;
    }

    public void setCodfunccad(Integer codfunccad) {
        this.codfunccad = codfunccad;
    }

    public Integer getCodfuncultalter() {
        return codfuncultalter;
    }

    public void setCodfuncultalter(Integer codfuncultalter) {
        this.codfuncultalter = codfuncultalter;
    }

    public BigDecimal getVlestoque() {
        return vlestoque;
    }

    public void setVlestoque(BigDecimal vlestoque) {
        this.vlestoque = vlestoque;
    }

    public BigDecimal getVlmediacompramesfornec() {
        return vlmediacompramesfornec;
    }

    public void setVlmediacompramesfornec(BigDecimal vlmediacompramesfornec) {
        this.vlmediacompramesfornec = vlmediacompramesfornec;
    }

    public String getObs5() {
        return obs5;
    }

    public void setObs5(String obs5) {
        this.obs5 = obs5;
    }

    public LocalDate getDtultconsultaserasa() {
        return dtultconsultaserasa;
    }

    public void setDtultconsultaserasa(LocalDate dtultconsultaserasa) {
        this.dtultconsultaserasa = dtultconsultaserasa;
    }

    public LocalDate getDtultconsultasci() {
        return dtultconsultasci;
    }

    public void setDtultconsultasci(LocalDate dtultconsultasci) {
        this.dtultconsultasci = dtultconsultasci;
    }

    public String getConsumidorfinal() {
        return consumidorfinal;
    }

    public void setConsumidorfinal(String consumidorfinal) {
        this.consumidorfinal = consumidorfinal;
    }

    public Integer getCodcanal() {
        return codcanal;
    }

    public void setCodcanal(Integer codcanal) {
        this.codcanal = codcanal;
    }

    public String getClassecomercial() {
        return classecomercial;
    }

    public void setClassecomercial(String classecomercial) {
        this.classecomercial = classecomercial;
    }

    public String getEmitentech() {
        return emitentech;
    }

    public void setEmitentech(String emitentech) {
        this.emitentech = emitentech;
    }

    public String getEmitentech2() {
        return emitentech2;
    }

    public void setEmitentech2(String emitentech2) {
        this.emitentech2 = emitentech2;
    }

    public BigDecimal getValoraluguel() {
        return valoraluguel;
    }

    public void setValoraluguel(BigDecimal valoraluguel) {
        this.valoraluguel = valoraluguel;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEnderempr() {
        return enderempr;
    }

    public void setEnderempr(String enderempr) {
        this.enderempr = enderempr;
    }

    public String getMunicempr() {
        return municempr;
    }

    public void setMunicempr(String municempr) {
        this.municempr = municempr;
    }

    public String getEstempr() {
        return estempr;
    }

    public void setEstempr(String estempr) {
        this.estempr = estempr;
    }

    public String getTelempr() {
        return telempr;
    }

    public void setTelempr(String telempr) {
        this.telempr = telempr;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDtadmissao() {
        return dtadmissao;
    }

    public void setDtadmissao(LocalDate dtadmissao) {
        this.dtadmissao = dtadmissao;
    }

    public BigDecimal getRendamensal() {
        return rendamensal;
    }

    public void setRendamensal(BigDecimal rendamensal) {
        this.rendamensal = rendamensal;
    }

    public String getNomeconjuge() {
        return nomeconjuge;
    }

    public void setNomeconjuge(String nomeconjuge) {
        this.nomeconjuge = nomeconjuge;
    }

    public String getCpfconjuge() {
        return cpfconjuge;
    }

    public void setCpfconjuge(String cpfconjuge) {
        this.cpfconjuge = cpfconjuge;
    }

    public String getEmpresaconjuge() {
        return empresaconjuge;
    }

    public void setEmpresaconjuge(String empresaconjuge) {
        this.empresaconjuge = empresaconjuge;
    }

    public String getEnderconjuge() {
        return enderconjuge;
    }

    public void setEnderconjuge(String enderconjuge) {
        this.enderconjuge = enderconjuge;
    }

    public String getMunicconjuge() {
        return municconjuge;
    }

    public void setMunicconjuge(String municconjuge) {
        this.municconjuge = municconjuge;
    }

    public String getEstconjuge() {
        return estconjuge;
    }

    public void setEstconjuge(String estconjuge) {
        this.estconjuge = estconjuge;
    }

    public String getTelconjuge() {
        return telconjuge;
    }

    public void setTelconjuge(String telconjuge) {
        this.telconjuge = telconjuge;
    }

    public String getCargoconjuge() {
        return cargoconjuge;
    }

    public void setCargoconjuge(String cargoconjuge) {
        this.cargoconjuge = cargoconjuge;
    }

    public LocalDate getDtadmissaoconjuge() {
        return dtadmissaoconjuge;
    }

    public void setDtadmissaoconjuge(LocalDate dtadmissaoconjuge) {
        this.dtadmissaoconjuge = dtadmissaoconjuge;
    }

    public BigDecimal getRendamensalconjuge() {
        return rendamensalconjuge;
    }

    public void setRendamensalconjuge(BigDecimal rendamensalconjuge) {
        this.rendamensalconjuge = rendamensalconjuge;
    }

    public BigDecimal getVloutrasrendas() {
        return vloutrasrendas;
    }

    public void setVloutrasrendas(BigDecimal vloutrasrendas) {
        this.vloutrasrendas = vloutrasrendas;
    }

    public String getClienteeletro() {
        return clienteeletro;
    }

    public void setClienteeletro(String clienteeletro) {
        this.clienteeletro = clienteeletro;
    }

    public String getGerenciamento() {
        return gerenciamento;
    }

    public void setGerenciamento(String gerenciamento) {
        this.gerenciamento = gerenciamento;
    }

    public String getCalculast() {
        return calculast;
    }

    public void setCalculast(String calculast) {
        this.calculast = calculast;
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

    public String getAceitachterceiros() {
        return aceitachterceiros;
    }

    public void setAceitachterceiros(String aceitachterceiros) {
        this.aceitachterceiros = aceitachterceiros;
    }

    public String getClientefontest() {
        return clientefontest;
    }

    public void setClientefontest(String clientefontest) {
        this.clientefontest = clientefontest;
    }

    public String getRatingsci() {
        return ratingsci;
    }

    public void setRatingsci(String ratingsci) {
        this.ratingsci = ratingsci;
    }

    public String getObstesouraria() {
        return obstesouraria;
    }

    public void setObstesouraria(String obstesouraria) {
        this.obstesouraria = obstesouraria;
    }

    public String getObscallcenter() {
        return obscallcenter;
    }

    public void setObscallcenter(String obscallcenter) {
        this.obscallcenter = obscallcenter;
    }

    public String getObsrecepcao() {
        return obsrecepcao;
    }

    public void setObsrecepcao(String obsrecepcao) {
        this.obsrecepcao = obsrecepcao;
    }

    public String getListaplpag() {
        return listaplpag;
    }

    public void setListaplpag(String listaplpag) {
        this.listaplpag = listaplpag;
    }

    public String getTelcelent() {
        return telcelent;
    }

    public void setTelcelent(String telcelent) {
        this.telcelent = telcelent;
    }

    public String getNumconcessao() {
        return numconcessao;
    }

    public void setNumconcessao(String numconcessao) {
        this.numconcessao = numconcessao;
    }

    public Short getUltcodplpag() {
        return ultcodplpag;
    }

    public void setUltcodplpag(Short ultcodplpag) {
        this.ultcodplpag = ultcodplpag;
    }

    public Short getNumregiaocli() {
        return numregiaocli;
    }

    public void setNumregiaocli(Short numregiaocli) {
        this.numregiaocli = numregiaocli;
    }

    public Long getEanentrega() {
        return eanentrega;
    }

    public void setEanentrega(Long eanentrega) {
        this.eanentrega = eanentrega;
    }

    public Long getEancobranca() {
        return eancobranca;
    }

    public void setEancobranca(Long eancobranca) {
        this.eancobranca = eancobranca;
    }

    public Integer getQtcheckout() {
        return qtcheckout;
    }

    public void setQtcheckout(Integer qtcheckout) {
        this.qtcheckout = qtcheckout;
    }

    public Short getFreqdiavisita() {
        return freqdiavisita;
    }

    public void setFreqdiavisita(Short freqdiavisita) {
        this.freqdiavisita = freqdiavisita;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
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

    public BigDecimal getPercbonific() {
        return percbonific;
    }

    public void setPercbonific(BigDecimal percbonific) {
        this.percbonific = percbonific;
    }

    public String getCodsuframa() {
        return codsuframa;
    }

    public void setCodsuframa(String codsuframa) {
        this.codsuframa = codsuframa;
    }

    public Short getCodplpag2() {
        return codplpag2;
    }

    public void setCodplpag2(Short codplpag2) {
        this.codplpag2 = codplpag2;
    }

    public String getTipocustotransf() {
        return tipocustotransf;
    }

    public void setTipocustotransf(String tipocustotransf) {
        this.tipocustotransf = tipocustotransf;
    }

    public BigDecimal getPeracrestransf() {
        return peracrestransf;
    }

    public void setPeracrestransf(BigDecimal peracrestransf) {
        this.peracrestransf = peracrestransf;
    }

    public String getAnalisecred() {
        return analisecred;
    }

    public void setAnalisecred(String analisecred) {
        this.analisecred = analisecred;
    }

    public String getPlpagneg2() {
        return plpagneg2;
    }

    public void setPlpagneg2(String plpagneg2) {
        this.plpagneg2 = plpagneg2;
    }

    public Integer getCodfuncultaltercliesp() {
        return codfuncultaltercliesp;
    }

    public void setCodfuncultaltercliesp(Integer codfuncultaltercliesp) {
        this.codfuncultaltercliesp = codfuncultaltercliesp;
    }

    public LocalDate getDtultaltercliesp() {
        return dtultaltercliesp;
    }

    public void setDtultaltercliesp(LocalDate dtultaltercliesp) {
        this.dtultaltercliesp = dtultaltercliesp;
    }

    public String getDestacafrete() {
        return destacafrete;
    }

    public void setDestacafrete(String destacafrete) {
        this.destacafrete = destacafrete;
    }

    public BigDecimal getPercbasevendqt() {
        return percbasevendqt;
    }

    public void setPercbasevendqt(BigDecimal percbasevendqt) {
        this.percbasevendqt = percbasevendqt;
    }

    public String getCodfilialestoque() {
        return codfilialestoque;
    }

    public void setCodfilialestoque(String codfilialestoque) {
        this.codfilialestoque = codfilialestoque;
    }

    public String getTipoconversaotv4() {
        return tipoconversaotv4;
    }

    public void setTipoconversaotv4(String tipoconversaotv4) {
        this.tipoconversaotv4 = tipoconversaotv4;
    }

    public String getAplicadescnf() {
        return aplicadescnf;
    }

    public void setAplicadescnf(String aplicadescnf) {
        this.aplicadescnf = aplicadescnf;
    }

    public Long getCodbarracob() {
        return codbarracob;
    }

    public void setCodbarracob(Long codbarracob) {
        this.codbarracob = codbarracob;
    }

    public Long getCodbarraent() {
        return codbarraent;
    }

    public void setCodbarraent(Long codbarraent) {
        this.codbarraent = codbarraent;
    }

    public String getUsavlminvendabk() {
        return usavlminvendabk;
    }

    public void setUsavlminvendabk(String usavlminvendabk) {
        this.usavlminvendabk = usavlminvendabk;
    }

    public String getUtilizaiesimplificada() {
        return utilizaiesimplificada;
    }

    public void setUtilizaiesimplificada(String utilizaiesimplificada) {
        this.utilizaiesimplificada = utilizaiesimplificada;
    }

    public Short getPrazoadicional2() {
        return prazoadicional2;
    }

    public void setPrazoadicional2(Short prazoadicional2) {
        this.prazoadicional2 = prazoadicional2;
    }

    public Short getPrazoadicional3() {
        return prazoadicional3;
    }

    public void setPrazoadicional3(Short prazoadicional3) {
        this.prazoadicional3 = prazoadicional3;
    }

    public Short getPrazoadicional4() {
        return prazoadicional4;
    }

    public void setPrazoadicional4(Short prazoadicional4) {
        this.prazoadicional4 = prazoadicional4;
    }

    public Short getPrazoadicional5() {
        return prazoadicional5;
    }

    public void setPrazoadicional5(Short prazoadicional5) {
        this.prazoadicional5 = prazoadicional5;
    }

    public Short getPrazoadicional6() {
        return prazoadicional6;
    }

    public void setPrazoadicional6(Short prazoadicional6) {
        this.prazoadicional6 = prazoadicional6;
    }

    public Short getPrazoadicional7() {
        return prazoadicional7;
    }

    public void setPrazoadicional7(Short prazoadicional7) {
        this.prazoadicional7 = prazoadicional7;
    }

    public LocalDate getDtabertcc1() {
        return dtabertcc1;
    }

    public void setDtabertcc1(LocalDate dtabertcc1) {
        this.dtabertcc1 = dtabertcc1;
    }

    public LocalDate getDtabertcc2() {
        return dtabertcc2;
    }

    public void setDtabertcc2(LocalDate dtabertcc2) {
        this.dtabertcc2 = dtabertcc2;
    }

    public String getCondvenda20() {
        return condvenda20;
    }

    public void setCondvenda20(String condvenda20) {
        this.condvenda20 = condvenda20;
    }

    public String getClientemonitorado() {
        return clientemonitorado;
    }

    public void setClientemonitorado(String clientemonitorado) {
        this.clientemonitorado = clientemonitorado;
    }

    public String getNumalvara() {
        return numalvara;
    }

    public void setNumalvara(String numalvara) {
        this.numalvara = numalvara;
    }

    public LocalDate getDtvencalvara() {
        return dtvencalvara;
    }

    public void setDtvencalvara(LocalDate dtvencalvara) {
        this.dtvencalvara = dtvencalvara;
    }

    public String getTipoempresa() {
        return tipoempresa;
    }

    public void setTipoempresa(String tipoempresa) {
        this.tipoempresa = tipoempresa;
    }

    public String getCgcentrega() {
        return cgcentrega;
    }

    public void setCgcentrega(String cgcentrega) {
        this.cgcentrega = cgcentrega;
    }

    public Short getCodusur3() {
        return codusur3;
    }

    public void setCodusur3(Short codusur3) {
        this.codusur3 = codusur3;
    }

    public String getParaibasim() {
        return paraibasim;
    }

    public void setParaibasim(String paraibasim) {
        this.paraibasim = paraibasim;
    }

    public LocalDate getDtenquadramentomicroempresa() {
        return dtenquadramentomicroempresa;
    }

    public void setDtenquadramentomicroempresa(LocalDate dtenquadramentomicroempresa) {
        this.dtenquadramentomicroempresa = dtenquadramentomicroempresa;
    }

    public BigDecimal getAliqicms1() {
        return aliqicms1;
    }

    public void setAliqicms1(BigDecimal aliqicms1) {
        this.aliqicms1 = aliqicms1;
    }

    public LocalDate getDtvencsuframa() {
        return dtvencsuframa;
    }

    public void setDtvencsuframa(LocalDate dtvencsuframa) {
        this.dtvencsuframa = dtvencsuframa;
    }

    public String getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }

    public String getOrigempreco() {
        return origempreco;
    }

    public void setOrigempreco(String origempreco) {
        this.origempreco = origempreco;
    }

    public String getAceitavendafracao() {
        return aceitavendafracao;
    }

    public void setAceitavendafracao(String aceitavendafracao) {
        this.aceitavendafracao = aceitavendafracao;
    }

    public Short getCodplpagpadrao() {
        return codplpagpadrao;
    }

    public void setCodplpagpadrao(Short codplpagpadrao) {
        this.codplpagpadrao = codplpagpadrao;
    }

    public String getEmitedae() {
        return emitedae;
    }

    public void setEmitedae(String emitedae) {
        this.emitedae = emitedae;
    }

    public String getCondvenda98() {
        return condvenda98;
    }

    public void setCondvenda98(String condvenda98) {
        this.condvenda98 = condvenda98;
    }

    public String getCondvenda99() {
        return condvenda99;
    }

    public void setCondvenda99(String condvenda99) {
        this.condvenda99 = condvenda99;
    }

    public String getIsentoipi() {
        return isentoipi;
    }

    public void setIsentoipi(String isentoipi) {
        this.isentoipi = isentoipi;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public LocalDate getDtnasc() {
        return dtnasc;
    }

    public void setDtnasc(LocalDate dtnasc) {
        this.dtnasc = dtnasc;
    }

    public String getFiliacaopai() {
        return filiacaopai;
    }

    public void setFiliacaopai(String filiacaopai) {
        this.filiacaopai = filiacaopai;
    }

    public String getFiliacaomae() {
        return filiacaomae;
    }

    public void setFiliacaomae(String filiacaomae) {
        this.filiacaomae = filiacaomae;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDtnascconj() {
        return dtnascconj;
    }

    public void setDtnascconj(LocalDate dtnascconj) {
        this.dtnascconj = dtnascconj;
    }

    public String getFiliacaopaiconj() {
        return filiacaopaiconj;
    }

    public void setFiliacaopaiconj(String filiacaopaiconj) {
        this.filiacaopaiconj = filiacaopaiconj;
    }

    public String getFiliacaomaeconj() {
        return filiacaomaeconj;
    }

    public void setFiliacaomaeconj(String filiacaomaeconj) {
        this.filiacaomaeconj = filiacaomaeconj;
    }

    public String getRgconj() {
        return rgconj;
    }

    public void setRgconj(String rgconj) {
        this.rgconj = rgconj;
    }

    public String getOrgaorgconj() {
        return orgaorgconj;
    }

    public void setOrgaorgconj(String orgaorgconj) {
        this.orgaorgconj = orgaorgconj;
    }

    public Long getCodmunicipio() {
        return codmunicipio;
    }

    public void setCodmunicipio(Long codmunicipio) {
        this.codmunicipio = codmunicipio;
    }

    public String getIncluinoarqsci() {
        return incluinoarqsci;
    }

    public void setIncluinoarqsci(String incluinoarqsci) {
        this.incluinoarqsci = incluinoarqsci;
    }

    public String getObsgerencial1() {
        return obsgerencial1;
    }

    public void setObsgerencial1(String obsgerencial1) {
        this.obsgerencial1 = obsgerencial1;
    }

    public String getObsgerencial2() {
        return obsgerencial2;
    }

    public void setObsgerencial2(String obsgerencial2) {
        this.obsgerencial2 = obsgerencial2;
    }

    public String getObsgerencial3() {
        return obsgerencial3;
    }

    public void setObsgerencial3(String obsgerencial3) {
        this.obsgerencial3 = obsgerencial3;
    }

    public String getTipoclimed() {
        return tipoclimed;
    }

    public void setTipoclimed(String tipoclimed) {
        this.tipoclimed = tipoclimed;
    }

    public Short getHoraproxcontato() {
        return horaproxcontato;
    }

    public void setHoraproxcontato(Short horaproxcontato) {
        this.horaproxcontato = horaproxcontato;
    }

    public Short getMinutoproxcontato() {
        return minutoproxcontato;
    }

    public void setMinutoproxcontato(Short minutoproxcontato) {
        this.minutoproxcontato = minutoproxcontato;
    }

    public String getExportardadosims() {
        return exportardadosims;
    }

    public void setExportardadosims(String exportardadosims) {
        this.exportardadosims = exportardadosims;
    }

    public String getComplementoent() {
        return complementoent;
    }

    public void setComplementoent(String complementoent) {
        this.complementoent = complementoent;
    }

    public String getRessarcimentost() {
        return ressarcimentost;
    }

    public void setRessarcimentost(String ressarcimentost) {
        this.ressarcimentost = ressarcimentost;
    }

    public String getRepasse() {
        return repasse;
    }

    public void setRepasse(String repasse) {
        this.repasse = repasse;
    }

    public LocalDate getDtultconsultasintegra() {
        return dtultconsultasintegra;
    }

    public void setDtultconsultasintegra(LocalDate dtultconsultasintegra) {
        this.dtultconsultasintegra = dtultconsultasintegra;
    }

    public LocalDate getMeddtlibtribut() {
        return meddtlibtribut;
    }

    public void setMeddtlibtribut(LocalDate meddtlibtribut) {
        this.meddtlibtribut = meddtlibtribut;
    }

    public Integer getMedcodfunclibtribut() {
        return medcodfunclibtribut;
    }

    public void setMedcodfunclibtribut(Integer medcodfunclibtribut) {
        this.medcodfunclibtribut = medcodfunclibtribut;
    }

    public String getRatingsci1() {
        return ratingsci1;
    }

    public void setRatingsci1(String ratingsci1) {
        this.ratingsci1 = ratingsci1;
    }

    public String getRatingsci2() {
        return ratingsci2;
    }

    public void setRatingsci2(String ratingsci2) {
        this.ratingsci2 = ratingsci2;
    }

    public Short getPrazovalidade() {
        return prazovalidade;
    }

    public void setPrazovalidade(Short prazovalidade) {
        this.prazovalidade = prazovalidade;
    }

    public LocalDate getDtultcompnestle() {
        return dtultcompnestle;
    }

    public void setDtultcompnestle(LocalDate dtultcompnestle) {
        this.dtultcompnestle = dtultcompnestle;
    }

    public String getDiretoriocliente() {
        return diretoriocliente;
    }

    public void setDiretoriocliente(String diretoriocliente) {
        this.diretoriocliente = diretoriocliente;
    }

    public Integer getCodclipalm() {
        return codclipalm;
    }

    public void setCodclipalm(Integer codclipalm) {
        this.codclipalm = codclipalm;
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

    public LocalDate getDtvencprazoadicional() {
        return dtvencprazoadicional;
    }

    public void setDtvencprazoadicional(LocalDate dtvencprazoadicional) {
        this.dtvencprazoadicional = dtvencprazoadicional;
    }

    public String getClientedan() {
        return clientedan;
    }

    public void setClientedan(String clientedan) {
        this.clientedan = clientedan;
    }

    public String getIest() {
        return iest;
    }

    public void setIest(String iest) {
        this.iest = iest;
    }

    public String getNumtare() {
        return numtare;
    }

    public void setNumtare(String numtare) {
        this.numtare = numtare;
    }

    public Short getCodstatuscob() {
        return codstatuscob;
    }

    public void setCodstatuscob(Short codstatuscob) {
        this.codstatuscob = codstatuscob;
    }

    public String getUsacross() {
        return usacross;
    }

    public void setUsacross(String usacross) {
        this.usacross = usacross;
    }

    public String getValidamaxvendapf() {
        return validamaxvendapf;
    }

    public void setValidamaxvendapf(String validamaxvendapf) {
        this.validamaxvendapf = validamaxvendapf;
    }

    public String getDigagencia2() {
        return digagencia2;
    }

    public void setDigagencia2(String digagencia2) {
        this.digagencia2 = digagencia2;
    }

    public Integer getCodcondicaovenda() {
        return codcondicaovenda;
    }

    public void setCodcondicaovenda(Integer codcondicaovenda) {
        this.codcondicaovenda = codcondicaovenda;
    }

    public String getRoteiromasterfoods() {
        return roteiromasterfoods;
    }

    public void setRoteiromasterfoods(String roteiromasterfoods) {
        this.roteiromasterfoods = roteiromasterfoods;
    }

    public Integer getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(Integer codcidade) {
        this.codcidade = codcidade;
    }

    public String getOrgaopub() {
        return orgaopub;
    }

    public void setOrgaopub(String orgaopub) {
        this.orgaopub = orgaopub;
    }

    public Long getNumseqatu() {
        return numseqatu;
    }

    public void setNumseqatu(Long numseqatu) {
        this.numseqatu = numseqatu;
    }

    public String getUfrg() {
        return ufrg;
    }

    public void setUfrg(String ufrg) {
        this.ufrg = ufrg;
    }

    public Integer getPrazomaxvalidade() {
        return prazomaxvalidade;
    }

    public void setPrazomaxvalidade(Integer prazomaxvalidade) {
        this.prazomaxvalidade = prazomaxvalidade;
    }

    public String getValidarmultiplovenda() {
        return validarmultiplovenda;
    }

    public void setValidarmultiplovenda(String validarmultiplovenda) {
        this.validarmultiplovenda = validarmultiplovenda;
    }

    public String getClientprotesto() {
        return clientprotesto;
    }

    public void setClientprotesto(String clientprotesto) {
        this.clientprotesto = clientprotesto;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getIeps() {
        return ieps;
    }

    public void setIeps(BigDecimal ieps) {
        this.ieps = ieps;
    }

    public String getEdoent() {
        return edoent;
    }

    public void setEdoent(String edoent) {
        this.edoent = edoent;
    }

    public String getEdocob() {
        return edocob;
    }

    public void setEdocob(String edocob) {
        this.edocob = edocob;
    }

    public String getEdocom() {
        return edocom;
    }

    public void setEdocom(String edocom) {
        this.edocom = edocom;
    }

    public String getSigladec() {
        return sigladec;
    }

    public void setSigladec(String sigladec) {
        this.sigladec = sigladec;
    }

    public Integer getCodfunclancpotenciallimcred() {
        return codfunclancpotenciallimcred;
    }

    public void setCodfunclancpotenciallimcred(Integer codfunclancpotenciallimcred) {
        this.codfunclancpotenciallimcred = codfunclancpotenciallimcred;
    }

    public BigDecimal getVlpotenciallimcred() {
        return vlpotenciallimcred;
    }

    public void setVlpotenciallimcred(BigDecimal vlpotenciallimcred) {
        this.vlpotenciallimcred = vlpotenciallimcred;
    }

    public LocalDate getDtlancpotenciallimcred() {
        return dtlancpotenciallimcred;
    }

    public void setDtlancpotenciallimcred(LocalDate dtlancpotenciallimcred) {
        this.dtlancpotenciallimcred = dtlancpotenciallimcred;
    }

    public String getValidarcampanhabrinde() {
        return validarcampanhabrinde;
    }

    public void setValidarcampanhabrinde(String validarcampanhabrinde) {
        this.validarcampanhabrinde = validarcampanhabrinde;
    }

    public String getMotivoexclusao() {
        return motivoexclusao;
    }

    public void setMotivoexclusao(String motivoexclusao) {
        this.motivoexclusao = motivoexclusao;
    }

    public String getUsabkcnpjcodcliprinc() {
        return usabkcnpjcodcliprinc;
    }

    public void setUsabkcnpjcodcliprinc(String usabkcnpjcodcliprinc) {
        this.usabkcnpjcodcliprinc = usabkcnpjcodcliprinc;
    }

    public LocalDate getDtdesbloqueio() {
        return dtdesbloqueio;
    }

    public void setDtdesbloqueio(LocalDate dtdesbloqueio) {
        this.dtdesbloqueio = dtdesbloqueio;
    }

    public String getAceitatrocanegativa() {
        return aceitatrocanegativa;
    }

    public void setAceitatrocanegativa(String aceitatrocanegativa) {
        this.aceitatrocanegativa = aceitatrocanegativa;
    }

    public String getCliente2() {
        return cliente2;
    }

    public void setCliente2(String cliente2) {
        this.cliente2 = cliente2;
    }

    public String getMunicent2() {
        return municent2;
    }

    public void setMunicent2(String municent2) {
        this.municent2 = municent2;
    }

    public String getMuniccob2() {
        return municcob2;
    }

    public void setMuniccob2(String municcob2) {
        this.municcob2 = municcob2;
    }

    public String getMuniccom2() {
        return municcom2;
    }

    public void setMuniccom2(String municcom2) {
        this.municcom2 = municcom2;
    }

    public Short getQtestrela() {
        return qtestrela;
    }

    public void setQtestrela(Short qtestrela) {
        this.qtestrela = qtestrela;
    }

    public String getGruporamoativi() {
        return gruporamoativi;
    }

    public void setGruporamoativi(String gruporamoativi) {
        this.gruporamoativi = gruporamoativi;
    }

    public LocalDate getDtclassificaestrela() {
        return dtclassificaestrela;
    }

    public void setDtclassificaestrela(LocalDate dtclassificaestrela) {
        this.dtclassificaestrela = dtclassificaestrela;
    }

    public LocalDate getDtclassificagrupo() {
        return dtclassificagrupo;
    }

    public void setDtclassificagrupo(LocalDate dtclassificagrupo) {
        this.dtclassificagrupo = dtclassificagrupo;
    }

    public String getInscestadual() {
        return inscestadual;
    }

    public void setInscestadual(String inscestadual) {
        this.inscestadual = inscestadual;
    }

    public String getTipodescisencao() {
        return tipodescisencao;
    }

    public void setTipodescisencao(String tipodescisencao) {
        this.tipodescisencao = tipodescisencao;
    }

    public String getSuprimido() {
        return suprimido;
    }

    public void setSuprimido(String suprimido) {
        this.suprimido = suprimido;
    }

    public String getCgeentaux() {
        return cgeentaux;
    }

    public void setCgeentaux(String cgeentaux) {
        this.cgeentaux = cgeentaux;
    }

    public String getEnviadadosserasa() {
        return enviadadosserasa;
    }

    public void setEnviadadosserasa(String enviadadosserasa) {
        this.enviadadosserasa = enviadadosserasa;
    }

    public String getBloqueiosefaz() {
        return bloqueiosefaz;
    }

    public void setBloqueiosefaz(String bloqueiosefaz) {
        this.bloqueiosefaz = bloqueiosefaz;
    }

    public LocalDate getDtvalidasefaz() {
        return dtvalidasefaz;
    }

    public void setDtvalidasefaz(LocalDate dtvalidasefaz) {
        this.dtvalidasefaz = dtvalidasefaz;
    }

    public String getUsaivafontediferenciado() {
        return usaivafontediferenciado;
    }

    public void setUsaivafontediferenciado(String usaivafontediferenciado) {
        this.usaivafontediferenciado = usaivafontediferenciado;
    }

    public BigDecimal getIvafonte() {
        return ivafonte;
    }

    public void setIvafonte(BigDecimal ivafonte) {
        this.ivafonte = ivafonte;
    }

    public Integer getCodpracacob() {
        return codpracacob;
    }

    public void setCodpracacob(Integer codpracacob) {
        this.codpracacob = codpracacob;
    }

    public Integer getCodfornecfrete() {
        return codfornecfrete;
    }

    public void setCodfornecfrete(Integer codfornecfrete) {
        this.codfornecfrete = codfornecfrete;
    }

    public String getGeotipoprecost() {
        return geotipoprecost;
    }

    public void setGeotipoprecost(String geotipoprecost) {
        this.geotipoprecost = geotipoprecost;
    }

    public String getGeotipoembalagem() {
        return geotipoembalagem;
    }

    public void setGeotipoembalagem(String geotipoembalagem) {
        this.geotipoembalagem = geotipoembalagem;
    }

    public String getObsAdic() {
        return obsAdic;
    }

    public void setObsAdic(String obsAdic) {
        this.obsAdic = obsAdic;
    }

    public BigDecimal getLimcredcpf() {
        return limcredcpf;
    }

    public void setLimcredcpf(BigDecimal limcredcpf) {
        this.limcredcpf = limcredcpf;
    }

    public String getBloqueiodefinitivo() {
        return bloqueiodefinitivo;
    }

    public void setBloqueiodefinitivo(String bloqueiodefinitivo) {
        this.bloqueiodefinitivo = bloqueiodefinitivo;
    }

    public BigDecimal getVlfrete() {
        return vlfrete;
    }

    public void setVlfrete(BigDecimal vlfrete) {
        this.vlfrete = vlfrete;
    }

    public BigDecimal getVlmaxcobfrete() {
        return vlmaxcobfrete;
    }

    public void setVlmaxcobfrete(BigDecimal vlmaxcobfrete) {
        this.vlmaxcobfrete = vlmaxcobfrete;
    }

    public Short getCodrede() {
        return codrede;
    }

    public void setCodrede(Short codrede) {
        this.codrede = codrede;
    }

    public String getTipocustotransfFiliais() {
        return tipocustotransfFiliais;
    }

    public void setTipocustotransfFiliais(String tipocustotransfFiliais) {
        this.tipocustotransfFiliais = tipocustotransfFiliais;
    }

    public String getOrgaopubfederal() {
        return orgaopubfederal;
    }

    public void setOrgaopubfederal(String orgaopubfederal) {
        this.orgaopubfederal = orgaopubfederal;
    }

    public Integer getCodhist() {
        return codhist;
    }

    public void setCodhist(Integer codhist) {
        this.codhist = codhist;
    }

    public String getCodcobtv1() {
        return codcobtv1;
    }

    public void setCodcobtv1(String codcobtv1) {
        this.codcobtv1 = codcobtv1;
    }

    public String getCodcobtv3() {
        return codcobtv3;
    }

    public void setCodcobtv3(String codcobtv3) {
        this.codcobtv3 = codcobtv3;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public LocalDate getDtimportintegracao() {
        return dtimportintegracao;
    }

    public void setDtimportintegracao(LocalDate dtimportintegracao) {
        this.dtimportintegracao = dtimportintegracao;
    }

    public String getIsentodifaliquotas() {
        return isentodifaliquotas;
    }

    public void setIsentodifaliquotas(String isentodifaliquotas) {
        this.isentodifaliquotas = isentodifaliquotas;
    }

    public String getFretedespacho() {
        return fretedespacho;
    }

    public void setFretedespacho(String fretedespacho) {
        this.fretedespacho = fretedespacho;
    }

    public String getObssuframa() {
        return obssuframa;
    }

    public void setObssuframa(String obssuframa) {
        this.obssuframa = obssuframa;
    }

    public String getComplementocob() {
        return complementocob;
    }

    public void setComplementocob(String complementocob) {
        this.complementocob = complementocob;
    }

    public String getNumeroent() {
        return numeroent;
    }

    public void setNumeroent(String numeroent) {
        this.numeroent = numeroent;
    }

    public String getNumerocob() {
        return numerocob;
    }

    public void setNumerocob(String numerocob) {
        this.numerocob = numerocob;
    }

    public String getAtualizasaldoccdescfin() {
        return atualizasaldoccdescfin;
    }

    public void setAtualizasaldoccdescfin(String atualizasaldoccdescfin) {
        this.atualizasaldoccdescfin = atualizasaldoccdescfin;
    }

    public String getComplementocom() {
        return complementocom;
    }

    public void setComplementocom(String complementocom) {
        this.complementocom = complementocom;
    }

    public String getNumerocom() {
        return numerocom;
    }

    public void setNumerocom(String numerocom) {
        this.numerocom = numerocom;
    }

    public String getPermitealtercobrancacr() {
        return permitealtercobrancacr;
    }

    public void setPermitealtercobrancacr(String permitealtercobrancacr) {
        this.permitealtercobrancacr = permitealtercobrancacr;
    }

    public LocalDate getDtvalidadeconv() {
        return dtvalidadeconv;
    }

    public void setDtvalidadeconv(LocalDate dtvalidadeconv) {
        this.dtvalidadeconv = dtvalidadeconv;
    }

    public String getBloqueiodatacheq() {
        return bloqueiodatacheq;
    }

    public void setBloqueiodatacheq(String bloqueiodatacheq) {
        this.bloqueiodatacheq = bloqueiodatacheq;
    }

    public LocalDate getDtultaltersrvprc() {
        return dtultaltersrvprc;
    }

    public void setDtultaltersrvprc(LocalDate dtultaltersrvprc) {
        this.dtultaltersrvprc = dtultaltersrvprc;
    }

    public String getUsacreclifat() {
        return usacreclifat;
    }

    public void setUsacreclifat(String usacreclifat) {
        this.usacreclifat = usacreclifat;
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

    public Integer getArealojam2() {
        return arealojam2;
    }

    public void setArealojam2(Integer arealojam2) {
        this.arealojam2 = arealojam2;
    }

    public String getParticipafuncep() {
        return participafuncep;
    }

    public void setParticipafuncep(String participafuncep) {
        this.participafuncep = participafuncep;
    }

    public Integer getCodprofissional() {
        return codprofissional;
    }

    public void setCodprofissional(Integer codprofissional) {
        this.codprofissional = codprofissional;
    }

    public String getAtendedomingo() {
        return atendedomingo;
    }

    public void setAtendedomingo(String atendedomingo) {
        this.atendedomingo = atendedomingo;
    }

    public String getAtendesegunda() {
        return atendesegunda;
    }

    public void setAtendesegunda(String atendesegunda) {
        this.atendesegunda = atendesegunda;
    }

    public String getAtendeterca() {
        return atendeterca;
    }

    public void setAtendeterca(String atendeterca) {
        this.atendeterca = atendeterca;
    }

    public String getAtendequarta() {
        return atendequarta;
    }

    public void setAtendequarta(String atendequarta) {
        this.atendequarta = atendequarta;
    }

    public String getAtendequinta() {
        return atendequinta;
    }

    public void setAtendequinta(String atendequinta) {
        this.atendequinta = atendequinta;
    }

    public String getAtendesexta() {
        return atendesexta;
    }

    public void setAtendesexta(String atendesexta) {
        this.atendesexta = atendesexta;
    }

    public String getAtendesabado() {
        return atendesabado;
    }

    public void setAtendesabado(String atendesabado) {
        this.atendesabado = atendesabado;
    }

    public String getEmitepvendanfsemdesc() {
        return emitepvendanfsemdesc;
    }

    public void setEmitepvendanfsemdesc(String emitepvendanfsemdesc) {
        this.emitepvendanfsemdesc = emitepvendanfsemdesc;
    }

    public Long getCodcliweb() {
        return codcliweb;
    }

    public void setCodcliweb(Long codcliweb) {
        this.codcliweb = codcliweb;
    }

    public String getInvestimento() {
        return investimento;
    }

    public void setInvestimento(String investimento) {
        this.investimento = investimento;
    }

    public String getFoco() {
        return foco;
    }

    public void setFoco(String foco) {
        this.foco = foco;
    }

    public String getFotografiasucesso() {
        return fotografiasucesso;
    }

    public void setFotografiasucesso(String fotografiasucesso) {
        this.fotografiasucesso = fotografiasucesso;
    }

    public String getPdvinvestimento() {
        return pdvinvestimento;
    }

    public void setPdvinvestimento(String pdvinvestimento) {
        this.pdvinvestimento = pdvinvestimento;
    }

    public String getContagemestoque() {
        return contagemestoque;
    }

    public void setContagemestoque(String contagemestoque) {
        this.contagemestoque = contagemestoque;
    }

    public String getNumregistroimune() {
        return numregistroimune;
    }

    public void setNumregistroimune(String numregistroimune) {
        this.numregistroimune = numregistroimune;
    }

    public String getSacadoeletronico() {
        return sacadoeletronico;
    }

    public void setSacadoeletronico(String sacadoeletronico) {
        this.sacadoeletronico = sacadoeletronico;
    }

    public BigDecimal getPerminvalidade() {
        return perminvalidade;
    }

    public void setPerminvalidade(BigDecimal perminvalidade) {
        this.perminvalidade = perminvalidade;
    }

    public LocalDate getDatacoleta() {
        return datacoleta;
    }

    public void setDatacoleta(LocalDate datacoleta) {
        this.datacoleta = datacoleta;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Long getCodcliint() {
        return codcliint;
    }

    public void setCodcliint(Long codcliint) {
        this.codcliint = codcliint;
    }

    public String getStatusconsultasintegra() {
        return statusconsultasintegra;
    }

    public void setStatusconsultasintegra(String statusconsultasintegra) {
        this.statusconsultasintegra = statusconsultasintegra;
    }

    public LocalDate getDataconsultasintegra() {
        return dataconsultasintegra;
    }

    public void setDataconsultasintegra(LocalDate dataconsultasintegra) {
        this.dataconsultasintegra = dataconsultasintegra;
    }

    public Short getPrazomedioplpag() {
        return prazomedioplpag;
    }

    public void setPrazomedioplpag(Short prazomedioplpag) {
        this.prazomedioplpag = prazomedioplpag;
    }

    public String getUtilizaprazomedioplpag() {
        return utilizaprazomedioplpag;
    }

    public void setUtilizaprazomedioplpag(String utilizaprazomedioplpag) {
        this.utilizaprazomedioplpag = utilizaprazomedioplpag;
    }

    public BigDecimal getPerctolvalidadeprodwms() {
        return perctolvalidadeprodwms;
    }

    public void setPerctolvalidadeprodwms(BigDecimal perctolvalidadeprodwms) {
        this.perctolvalidadeprodwms = perctolvalidadeprodwms;
    }

    public String getAnvisa() {
        return anvisa;
    }

    public void setAnvisa(String anvisa) {
        this.anvisa = anvisa;
    }

    public String getSus() {
        return sus;
    }

    public void setSus(String sus) {
        this.sus = sus;
    }

    public String getTipocustotransfFilialvirtual() {
        return tipocustotransfFilialvirtual;
    }

    public void setTipocustotransfFilialvirtual(String tipocustotransfFilialvirtual) {
        this.tipocustotransfFilialvirtual = tipocustotransfFilialvirtual;
    }

    public String getGerarcreditodevcli() {
        return gerarcreditodevcli;
    }

    public void setGerarcreditodevcli(String gerarcreditodevcli) {
        this.gerarcreditodevcli = gerarcreditodevcli;
    }

    public String getRetencaoiss() {
        return retencaoiss;
    }

    public void setRetencaoiss(String retencaoiss) {
        this.retencaoiss = retencaoiss;
    }

    public LocalDate getHoracadastro() {
        return horacadastro;
    }

    public void setHoracadastro(LocalDate horacadastro) {
        this.horacadastro = horacadastro;
    }

    public Short getZona() {
        return zona;
    }

    public void setZona(Short zona) {
        this.zona = zona;
    }

    public String getNumalvarasus() {
        return numalvarasus;
    }

    public void setNumalvarasus(String numalvarasus) {
        this.numalvarasus = numalvarasus;
    }

    public LocalDate getDtvencalvarasus() {
        return dtvencalvarasus;
    }

    public void setDtvencalvarasus(LocalDate dtvencalvarasus) {
        this.dtvencalvarasus = dtvencalvarasus;
    }

    public Integer getCodbairroent() {
        return codbairroent;
    }

    public void setCodbairroent(Integer codbairroent) {
        this.codbairroent = codbairroent;
    }

    public Integer getCodbairrocom() {
        return codbairrocom;
    }

    public void setCodbairrocom(Integer codbairrocom) {
        this.codbairrocom = codbairrocom;
    }

    public Integer getCodbairrocob() {
        return codbairrocob;
    }

    public void setCodbairrocob(Integer codbairrocob) {
        this.codbairrocob = codbairrocob;
    }

    public String getNumcartaofidelidade() {
        return numcartaofidelidade;
    }

    public void setNumcartaofidelidade(String numcartaofidelidade) {
        this.numcartaofidelidade = numcartaofidelidade;
    }

    public String getCnpjcisp() {
        return cnpjcisp;
    }

    public void setCnpjcisp(String cnpjcisp) {
        this.cnpjcisp = cnpjcisp;
    }

    public String getObsentrega4() {
        return obsentrega4;
    }

    public void setObsentrega4(String obsentrega4) {
        this.obsentrega4 = obsentrega4;
    }

    public String getImportadocrm() {
        return importadocrm;
    }

    public void setImportadocrm(String importadocrm) {
        this.importadocrm = importadocrm;
    }

    public String getSimplesnacional() {
        return simplesnacional;
    }

    public void setSimplesnacional(String simplesnacional) {
        this.simplesnacional = simplesnacional;
    }

    public String getBloqueiosefazped() {
        return bloqueiosefazped;
    }

    public void setBloqueiosefazped(String bloqueiosefazped) {
        this.bloqueiosefazped = bloqueiosefazped;
    }

    public String getGeratitulost() {
        return geratitulost;
    }

    public void setGeratitulost(String geratitulost) {
        this.geratitulost = geratitulost;
    }

    public Short getPrazovencst() {
        return prazovencst;
    }

    public void setPrazovencst(Short prazovencst) {
        this.prazovencst = prazovencst;
    }

    public String getAgregarvalorstdescfin() {
        return agregarvalorstdescfin;
    }

    public void setAgregarvalorstdescfin(String agregarvalorstdescfin) {
        this.agregarvalorstdescfin = agregarvalorstdescfin;
    }

    public String getEnviopdfnfe() {
        return enviopdfnfe;
    }

    public void setEnviopdfnfe(String enviopdfnfe) {
        this.enviopdfnfe = enviopdfnfe;
    }

    public LocalDate getDtvencalvaraanvisa() {
        return dtvencalvaraanvisa;
    }

    public void setDtvencalvaraanvisa(LocalDate dtvencalvaraanvisa) {
        this.dtvencalvaraanvisa = dtvencalvaraanvisa;
    }

    public LocalDate getDtvenccrf() {
        return dtvenccrf;
    }

    public void setDtvenccrf(LocalDate dtvenccrf) {
        this.dtvenccrf = dtvenccrf;
    }

    public String getNumalvaraanvisa() {
        return numalvaraanvisa;
    }

    public void setNumalvaraanvisa(String numalvaraanvisa) {
        this.numalvaraanvisa = numalvaraanvisa;
    }

    public String getNumcrf() {
        return numcrf;
    }

    public void setNumcrf(String numcrf) {
        this.numcrf = numcrf;
    }

    public BigDecimal getVlminimost() {
        return vlminimost;
    }

    public void setVlminimost(BigDecimal vlminimost) {
        this.vlminimost = vlminimost;
    }

    public String getTipotratamentodescfin() {
        return tipotratamentodescfin;
    }

    public void setTipotratamentodescfin(String tipotratamentodescfin) {
        this.tipotratamentodescfin = tipotratamentodescfin;
    }

    public Short getQtddiasaplicdescfin() {
        return qtddiasaplicdescfin;
    }

    public void setQtddiasaplicdescfin(Short qtddiasaplicdescfin) {
        this.qtddiasaplicdescfin = qtddiasaplicdescfin;
    }

    public String getAceitasimilar() {
        return aceitasimilar;
    }

    public void setAceitasimilar(String aceitasimilar) {
        this.aceitasimilar = aceitasimilar;
    }

    public String getPiscofinscumulativo() {
        return piscofinscumulativo;
    }

    public void setPiscofinscumulativo(String piscofinscumulativo) {
        this.piscofinscumulativo = piscofinscumulativo;
    }

    public String getEnvionfeemailcom() {
        return envionfeemailcom;
    }

    public void setEnvionfeemailcom(String envionfeemailcom) {
        this.envionfeemailcom = envionfeemailcom;
    }

    public String getCodcontab() {
        return codcontab;
    }

    public void setCodcontab(String codcontab) {
        this.codcontab = codcontab;
    }

    public String getDiretoriocontrato() {
        return diretoriocontrato;
    }

    public void setDiretoriocontrato(String diretoriocontrato) {
        this.diretoriocontrato = diretoriocontrato;
    }

    public LocalDate getDtinivistoria() {
        return dtinivistoria;
    }

    public void setDtinivistoria(LocalDate dtinivistoria) {
        this.dtinivistoria = dtinivistoria;
    }

    public Integer getPeriodvistoria() {
        return periodvistoria;
    }

    public void setPeriodvistoria(Integer periodvistoria) {
        this.periodvistoria = periodvistoria;
    }

    public LocalDate getDtproxvistoria() {
        return dtproxvistoria;
    }

    public void setDtproxvistoria(LocalDate dtproxvistoria) {
        this.dtproxvistoria = dtproxvistoria;
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

    public String getUtilizaplpagmedicamento() {
        return utilizaplpagmedicamento;
    }

    public void setUtilizaplpagmedicamento(String utilizaplpagmedicamento) {
        this.utilizaplpagmedicamento = utilizaplpagmedicamento;
    }

    public String getPrecoutilizadonfe() {
        return precoutilizadonfe;
    }

    public void setPrecoutilizadonfe(String precoutilizadonfe) {
        this.precoutilizadonfe = precoutilizadonfe;
    }

    public String getNumcrm() {
        return numcrm;
    }

    public void setNumcrm(String numcrm) {
        this.numcrm = numcrm;
    }

    public String getIsencaosuframa() {
        return isencaosuframa;
    }

    public void setIsencaosuframa(String isencaosuframa) {
        this.isencaosuframa = isencaosuframa;
    }

    public String getRegistroibama() {
        return registroibama;
    }

    public void setRegistroibama(String registroibama) {
        this.registroibama = registroibama;
    }

    public LocalDate getDtvalidadeibama() {
        return dtvalidadeibama;
    }

    public void setDtvalidadeibama(LocalDate dtvalidadeibama) {
        this.dtvalidadeibama = dtvalidadeibama;
    }

    public String getUsadescontoicms() {
        return usadescontoicms;
    }

    public void setUsadescontoicms(String usadescontoicms) {
        this.usadescontoicms = usadescontoicms;
    }

    public Long getCodgln() {
        return codgln;
    }

    public void setCodgln(Long codgln) {
        this.codgln = codgln;
    }

    public String getTipoativcli() {
        return tipoativcli;
    }

    public void setTipoativcli(String tipoativcli) {
        this.tipoativcli = tipoativcli;
    }

    public Integer getCodpais() {
        return codpais;
    }

    public void setCodpais(Integer codpais) {
        this.codpais = codpais;
    }

    public String getUsadescfinseparadodesccom() {
        return usadescfinseparadodesccom;
    }

    public void setUsadescfinseparadodesccom(String usadescfinseparadodesccom) {
        this.usadescfinseparadodesccom = usadescfinseparadodesccom;
    }

    public String getUtilizapedclinfe() {
        return utilizapedclinfe;
    }

    public void setUtilizapedclinfe(String utilizapedclinfe) {
        this.utilizapedclinfe = utilizapedclinfe;
    }

    public String getSenhaconvecf() {
        return senhaconvecf;
    }

    public void setSenhaconvecf(String senhaconvecf) {
        this.senhaconvecf = senhaconvecf;
    }

    public Short getCodplpagagrupautomatic() {
        return codplpagagrupautomatic;
    }

    public void setCodplpagagrupautomatic(Short codplpagagrupautomatic) {
        this.codplpagagrupautomatic = codplpagagrupautomatic;
    }

    public Short getPeriodicidadeagrup() {
        return periodicidadeagrup;
    }

    public void setPeriodicidadeagrup(Short periodicidadeagrup) {
        this.periodicidadeagrup = periodicidadeagrup;
    }

    public LocalDate getDtultagrupamento() {
        return dtultagrupamento;
    }

    public void setDtultagrupamento(LocalDate dtultagrupamento) {
        this.dtultagrupamento = dtultagrupamento;
    }

    public String getTipovenda() {
        return tipovenda;
    }

    public void setTipovenda(String tipovenda) {
        this.tipovenda = tipovenda;
    }

    public String getNumalvararetinoico() {
        return numalvararetinoico;
    }

    public void setNumalvararetinoico(String numalvararetinoico) {
        this.numalvararetinoico = numalvararetinoico;
    }

    public LocalDate getDtvencalvararetinoico() {
        return dtvencalvararetinoico;
    }

    public void setDtvencalvararetinoico(LocalDate dtvencalvararetinoico) {
        this.dtvencalvararetinoico = dtvencalvararetinoico;
    }

    public String getUsavendaexportacao() {
        return usavendaexportacao;
    }

    public void setUsavendaexportacao(String usavendaexportacao) {
        this.usavendaexportacao = usavendaexportacao;
    }

    public String getBloqremcob() {
        return bloqremcob;
    }

    public void setBloqremcob(String bloqremcob) {
        this.bloqremcob = bloqremcob;
    }

    public String getCliatacado() {
        return cliatacado;
    }

    public void setCliatacado(String cliatacado) {
        this.cliatacado = cliatacado;
    }

    public String getTaxaboletonf() {
        return taxaboletonf;
    }

    public void setTaxaboletonf(String taxaboletonf) {
        this.taxaboletonf = taxaboletonf;
    }

    public String getTurnoentrega() {
        return turnoentrega;
    }

    public void setTurnoentrega(String turnoentrega) {
        this.turnoentrega = turnoentrega;
    }

    public String getNomefarmaceutico() {
        return nomefarmaceutico;
    }

    public void setNomefarmaceutico(String nomefarmaceutico) {
        this.nomefarmaceutico = nomefarmaceutico;
    }

    public String getNumalvaraespec() {
        return numalvaraespec;
    }

    public void setNumalvaraespec(String numalvaraespec) {
        this.numalvaraespec = numalvaraespec;
    }

    public byte[] getIdintegracaomyfrota() {
        return idintegracaomyfrota;
    }

    public void setIdintegracaomyfrota(byte[] idintegracaomyfrota) {
        this.idintegracaomyfrota = idintegracaomyfrota;
    }

    public BigDecimal getPerdesmaxponderado() {
        return perdesmaxponderado;
    }

    public void setPerdesmaxponderado(BigDecimal perdesmaxponderado) {
        this.perdesmaxponderado = perdesmaxponderado;
    }

    public String getEmpresaconveniada() {
        return empresaconveniada;
    }

    public void setEmpresaconveniada(String empresaconveniada) {
        this.empresaconveniada = empresaconveniada;
    }

    public Short getDiafechaconvenio() {
        return diafechaconvenio;
    }

    public void setDiafechaconvenio(Short diafechaconvenio) {
        this.diafechaconvenio = diafechaconvenio;
    }

    public Short getQtdiascarenciaconv() {
        return qtdiascarenciaconv;
    }

    public void setQtdiascarenciaconv(Short qtdiascarenciaconv) {
        this.qtdiascarenciaconv = qtdiascarenciaconv;
    }

    public String getAplicredbaseicmstransp() {
        return aplicredbaseicmstransp;
    }

    public void setAplicredbaseicmstransp(String aplicredbaseicmstransp) {
        this.aplicredbaseicmstransp = aplicredbaseicmstransp;
    }

    public LocalDate getDtproxdesdagendado() {
        return dtproxdesdagendado;
    }

    public void setDtproxdesdagendado(LocalDate dtproxdesdagendado) {
        this.dtproxdesdagendado = dtproxdesdagendado;
    }

    public String getUtilizacalculostmt() {
        return utilizacalculostmt;
    }

    public void setUtilizacalculostmt(String utilizacalculostmt) {
        this.utilizacalculostmt = utilizacalculostmt;
    }

    public String getTpcomunicadoserasa() {
        return tpcomunicadoserasa;
    }

    public void setTpcomunicadoserasa(String tpcomunicadoserasa) {
        this.tpcomunicadoserasa = tpcomunicadoserasa;
    }

    public String getSerasagerencie() {
        return serasagerencie;
    }

    public void setSerasagerencie(String serasagerencie) {
        this.serasagerencie = serasagerencie;
    }

    public LocalDate getDtserasagerencie() {
        return dtserasagerencie;
    }

    public void setDtserasagerencie(LocalDate dtserasagerencie) {
        this.dtserasagerencie = dtserasagerencie;
    }

    public Short getPrazoserasagerencie() {
        return prazoserasagerencie;
    }

    public void setPrazoserasagerencie(Short prazoserasagerencie) {
        this.prazoserasagerencie = prazoserasagerencie;
    }

    public String getDesconsvalidasefaz() {
        return desconsvalidasefaz;
    }

    public void setDesconsvalidasefaz(String desconsvalidasefaz) {
        this.desconsvalidasefaz = desconsvalidasefaz;
    }

    public Integer getCodbairrodeliv() {
        return codbairrodeliv;
    }

    public void setCodbairrodeliv(Integer codbairrodeliv) {
        this.codbairrodeliv = codbairrodeliv;
    }

    public String getUsadebcredrca() {
        return usadebcredrca;
    }

    public void setUsadebcredrca(String usadebcredrca) {
        this.usadebcredrca = usadebcredrca;
    }

    public String getOrgaopubmunicipal() {
        return orgaopubmunicipal;
    }

    public void setOrgaopubmunicipal(String orgaopubmunicipal) {
        this.orgaopubmunicipal = orgaopubmunicipal;
    }

    public Integer getCodcidadecom() {
        return codcidadecom;
    }

    public void setCodcidadecom(Integer codcidadecom) {
        this.codcidadecom = codcidadecom;
    }

    public Integer getCodpromocaomed() {
        return codpromocaomed;
    }

    public void setCodpromocaomed(Integer codpromocaomed) {
        this.codpromocaomed = codpromocaomed;
    }

    public String getReceberboletoporemail() {
        return receberboletoporemail;
    }

    public void setReceberboletoporemail(String receberboletoporemail) {
        this.receberboletoporemail = receberboletoporemail;
    }

    public Short getDiafaturar() {
        return diafaturar;
    }

    public void setDiafaturar(Short diafaturar) {
        this.diafaturar = diafaturar;
    }

    public String getNilplpagsobrepoeplpagdistrib() {
        return nilplpagsobrepoeplpagdistrib;
    }

    public void setNilplpagsobrepoeplpagdistrib(String nilplpagsobrepoeplpagdistrib) {
        this.nilplpagsobrepoeplpagdistrib = nilplpagsobrepoeplpagdistrib;
    }

    public LocalDate getDtultalter1203() {
        return dtultalter1203;
    }

    public void setDtultalter1203(LocalDate dtultalter1203) {
        this.dtultalter1203 = dtultalter1203;
    }

    public Integer getCodfuncultalter1203() {
        return codfuncultalter1203;
    }

    public void setCodfuncultalter1203(Integer codfuncultalter1203) {
        this.codfuncultalter1203 = codfuncultalter1203;
    }

    public String getClicrm() {
        return clicrm;
    }

    public void setClicrm(String clicrm) {
        this.clicrm = clicrm;
    }

    public String getParticipafarmaciapopular() {
        return participafarmaciapopular;
    }

    public void setParticipafarmaciapopular(String participafarmaciapopular) {
        this.participafarmaciapopular = participafarmaciapopular;
    }

    public String getTv10usacustoproduto() {
        return tv10usacustoproduto;
    }

    public void setTv10usacustoproduto(String tv10usacustoproduto) {
        this.tv10usacustoproduto = tv10usacustoproduto;
    }

    public String getUsaseguro() {
        return usaseguro;
    }

    public void setUsaseguro(String usaseguro) {
        this.usaseguro = usaseguro;
    }

    public String getTiposeguro() {
        return tiposeguro;
    }

    public void setTiposeguro(String tiposeguro) {
        this.tiposeguro = tiposeguro;
    }

    public String getUsaregimeespisenstfonte() {
        return usaregimeespisenstfonte;
    }

    public void setUsaregimeespisenstfonte(String usaregimeespisenstfonte) {
        this.usaregimeespisenstfonte = usaregimeespisenstfonte;
    }

    public String getEmailcob() {
        return emailcob;
    }

    public void setEmailcob(String emailcob) {
        this.emailcob = emailcob;
    }

    public String getNotificacaotgi() {
        return notificacaotgi;
    }

    public void setNotificacaotgi(String notificacaotgi) {
        this.notificacaotgi = notificacaotgi;
    }

    public String getAcionamentocliente() {
        return acionamentocliente;
    }

    public void setAcionamentocliente(String acionamentocliente) {
        this.acionamentocliente = acionamentocliente;
    }

    public LocalDate getDtaltdadosbancarios() {
        return dtaltdadosbancarios;
    }

    public void setDtaltdadosbancarios(LocalDate dtaltdadosbancarios) {
        this.dtaltdadosbancarios = dtaltdadosbancarios;
    }

    public LocalDate getDtultalterclasse() {
        return dtultalterclasse;
    }

    public void setDtultalterclasse(LocalDate dtultalterclasse) {
        this.dtultalterclasse = dtultalterclasse;
    }

    public LocalDate getMeldtabertcc1() {
        return meldtabertcc1;
    }

    public void setMeldtabertcc1(LocalDate meldtabertcc1) {
        this.meldtabertcc1 = meldtabertcc1;
    }

    public LocalDate getMeldtabertcc2() {
        return meldtabertcc2;
    }

    public void setMeldtabertcc2(LocalDate meldtabertcc2) {
        this.meldtabertcc2 = meldtabertcc2;
    }

    public LocalDate getMeldtabertcc3() {
        return meldtabertcc3;
    }

    public void setMeldtabertcc3(LocalDate meldtabertcc3) {
        this.meldtabertcc3 = meldtabertcc3;
    }

    public Boolean getValpesovarmapawms() {
        return valpesovarmapawms;
    }

    public void setValpesovarmapawms(Boolean valpesovarmapawms) {
        this.valpesovarmapawms = valpesovarmapawms;
    }

    public String getPermiteagrupamento() {
        return permiteagrupamento;
    }

    public void setPermiteagrupamento(String permiteagrupamento) {
        this.permiteagrupamento = permiteagrupamento;
    }

    public String getBloqueioinatividade() {
        return bloqueioinatividade;
    }

    public void setBloqueioinatividade(String bloqueioinatividade) {
        this.bloqueioinatividade = bloqueioinatividade;
    }

    public String getUtilizatxdifentrega() {
        return utilizatxdifentrega;
    }

    public void setUtilizatxdifentrega(String utilizatxdifentrega) {
        this.utilizatxdifentrega = utilizatxdifentrega;
    }

    public String getIsentotxentrega() {
        return isentotxentrega;
    }

    public void setIsentotxentrega(String isentotxentrega) {
        this.isentotxentrega = isentotxentrega;
    }

    public Integer getCodfuncanalisecred() {
        return codfuncanalisecred;
    }

    public void setCodfuncanalisecred(Integer codfuncanalisecred) {
        this.codfuncanalisecred = codfuncanalisecred;
    }

    public String getRiolog() {
        return riolog;
    }

    public void setRiolog(String riolog) {
        this.riolog = riolog;
    }

    public String getVendalocestrang() {
        return vendalocestrang;
    }

    public void setVendalocestrang(String vendalocestrang) {
        this.vendalocestrang = vendalocestrang;
    }

    public String getIdentificestrang() {
        return identificestrang;
    }

    public void setIdentificestrang(String identificestrang) {
        this.identificestrang = identificestrang;
    }

    public String getValidarlimbonific() {
        return validarlimbonific;
    }

    public void setValidarlimbonific(String validarlimbonific) {
        this.validarlimbonific = validarlimbonific;
    }

    public String getTipocustomanif() {
        return tipocustomanif;
    }

    public void setTipocustomanif(String tipocustomanif) {
        this.tipocustomanif = tipocustomanif;
    }

    public Short getDialimitfatu() {
        return dialimitfatu;
    }

    public void setDialimitfatu(Short dialimitfatu) {
        this.dialimitfatu = dialimitfatu;
    }

    public Boolean getForceclipf() {
        return forceclipf;
    }

    public void setForceclipf(Boolean forceclipf) {
        this.forceclipf = forceclipf;
    }

    public Boolean getForcaclipj() {
        return forcaclipj;
    }

    public void setForcaclipj(Boolean forcaclipj) {
        this.forcaclipj = forcaclipj;
    }

    public String getCodcnes() {
        return codcnes;
    }

    public void setCodcnes(String codcnes) {
        this.codcnes = codcnes;
    }

    public String getPermitiragrupartitulo() {
        return permitiragrupartitulo;
    }

    public void setPermitiragrupartitulo(String permitiragrupartitulo) {
        this.permitiragrupartitulo = permitiragrupartitulo;
    }

    public Short getNumdiasprotesto() {
        return numdiasprotesto;
    }

    public void setNumdiasprotesto(Short numdiasprotesto) {
        this.numdiasprotesto = numdiasprotesto;
    }

    public String getTipodiautilrota() {
        return tipodiautilrota;
    }

    public void setTipodiautilrota(String tipodiautilrota) {
        this.tipodiautilrota = tipodiautilrota;
    }

    public BigDecimal getLimitecredsuppli() {
        return limitecredsuppli;
    }

    public void setLimitecredsuppli(BigDecimal limitecredsuppli) {
        this.limitecredsuppli = limitecredsuppli;
    }

    public String getUsacmvdiferenciado() {
        return usacmvdiferenciado;
    }

    public void setUsacmvdiferenciado(String usacmvdiferenciado) {
        this.usacmvdiferenciado = usacmvdiferenciado;
    }

    public String getSituacaoecommerceunilever() {
        return situacaoecommerceunilever;
    }

    public void setSituacaoecommerceunilever(String situacaoecommerceunilever) {
        this.situacaoecommerceunilever = situacaoecommerceunilever;
    }

    public String getPagchequemoradia() {
        return pagchequemoradia;
    }

    public void setPagchequemoradia(String pagchequemoradia) {
        this.pagchequemoradia = pagchequemoradia;
    }

    public String getUsatde() {
        return usatde;
    }

    public void setUsatde(String usatde) {
        this.usatde = usatde;
    }

    public Integer getCodrotainservivel() {
        return codrotainservivel;
    }

    public void setCodrotainservivel(Integer codrotainservivel) {
        this.codrotainservivel = codrotainservivel;
    }

    public Short getPrazoentregacarcaca() {
        return prazoentregacarcaca;
    }

    public void setPrazoentregacarcaca(Short prazoentregacarcaca) {
        this.prazoentregacarcaca = prazoentregacarcaca;
    }

    public Short getCodusurecommerce() {
        return codusurecommerce;
    }

    public void setCodusurecommerce(Short codusurecommerce) {
        this.codusurecommerce = codusurecommerce;
    }

    public String getCozinhaindustrial() {
        return cozinhaindustrial;
    }

    public void setCozinhaindustrial(String cozinhaindustrial) {
        this.cozinhaindustrial = cozinhaindustrial;
    }


    public Integer getCodgrupoclicomissmed() {
        return codgrupoclicomissmed;
    }

    public void setCodgrupoclicomissmed(Integer codgrupoclicomissmed) {
        this.codgrupoclicomissmed = codgrupoclicomissmed;
    }

    public String getTipocustotransftv9() {
        return tipocustotransftv9;
    }

    public void setTipocustotransftv9(String tipocustotransftv9) {
        this.tipocustotransftv9 = tipocustotransftv9;
    }

    public BigDecimal getSaldolimcredbroker() {
        return saldolimcredbroker;
    }

    public void setSaldolimcredbroker(BigDecimal saldolimcredbroker) {
        this.saldolimcredbroker = saldolimcredbroker;
    }

    public BigDecimal getVllimcredbroker() {
        return vllimcredbroker;
    }

    public void setVllimcredbroker(BigDecimal vllimcredbroker) {
        this.vllimcredbroker = vllimcredbroker;
    }


    public String getIdentvaleriodoce() {
        return identvaleriodoce;
    }

    public void setIdentvaleriodoce(String identvaleriodoce) {
        this.identvaleriodoce = identvaleriodoce;
    }

    public Integer getProxnumseqend() {
        return proxnumseqend;
    }

    public void setProxnumseqend(Integer proxnumseqend) {
        this.proxnumseqend = proxnumseqend;
    }

    public LocalDate getDtsyncpathfind() {
        return dtsyncpathfind;
    }

    public void setDtsyncpathfind(LocalDate dtsyncpathfind) {
        this.dtsyncpathfind = dtsyncpathfind;
    }

    public String getAceitapedmontpathfind() {
        return aceitapedmontpathfind;
    }

    public void setAceitapedmontpathfind(String aceitapedmontpathfind) {
        this.aceitapedmontpathfind = aceitapedmontpathfind;
    }

    public String getAceitainserirprodutoaut() {
        return aceitainserirprodutoaut;
    }

    public void setAceitainserirprodutoaut(String aceitainserirprodutoaut) {
        this.aceitainserirprodutoaut = aceitainserirprodutoaut;
    }

    public String getTv1obrigatoriotv5() {
        return tv1obrigatoriotv5;
    }

    public void setTv1obrigatoriotv5(String tv1obrigatoriotv5) {
        this.tv1obrigatoriotv5 = tv1obrigatoriotv5;
    }

    public String getTipodocumentoentregafutura() {
        return tipodocumentoentregafutura;
    }

    public void setTipodocumentoentregafutura(String tipodocumentoentregafutura) {
        this.tipodocumentoentregafutura = tipodocumentoentregafutura;
    }

    public String getIncidenciacprb() {
        return incidenciacprb;
    }

    public void setIncidenciacprb(String incidenciacprb) {
        this.incidenciacprb = incidenciacprb;
    }

    public BigDecimal getPercredicms() {
        return percredicms;
    }

    public void setPercredicms(BigDecimal percredicms) {
        this.percredicms = percredicms;
    }

    public String getCodclasseDms() {
        return codclasseDms;
    }

    public void setCodclasseDms(String codclasseDms) {
        this.codclasseDms = codclasseDms;
    }

    public String getCliexclusivoDms() {
        return cliexclusivoDms;
    }

    public void setCliexclusivoDms(String cliexclusivoDms) {
        this.cliexclusivoDms = cliexclusivoDms;
    }

    public String getCodgrupoDms() {
        return codgrupoDms;
    }

    public void setCodgrupoDms(String codgrupoDms) {
        this.codgrupoDms = codgrupoDms;
    }

    public String getCodcanalDms() {
        return codcanalDms;
    }

    public void setCodcanalDms(String codcanalDms) {
        this.codcanalDms = codcanalDms;
    }

    public String getCodsegmentacaoDms() {
        return codsegmentacaoDms;
    }

    public void setCodsegmentacaoDms(String codsegmentacaoDms) {
        this.codsegmentacaoDms = codsegmentacaoDms;
    }

    public String getCodtiponegocioDms() {
        return codtiponegocioDms;
    }

    public void setCodtiponegocioDms(String codtiponegocioDms) {
        this.codtiponegocioDms = codtiponegocioDms;
    }

    public String getEnviarcadintegraDms() {
        return enviarcadintegraDms;
    }

    public void setEnviarcadintegraDms(String enviarcadintegraDms) {
        this.enviarcadintegraDms = enviarcadintegraDms;
    }

    public String getCodholdinDms() {
        return codholdinDms;
    }

    public void setCodholdinDms(String codholdinDms) {
        this.codholdinDms = codholdinDms;
    }

    public String getCodbandeiraDms() {
        return codbandeiraDms;
    }

    public void setCodbandeiraDms(String codbandeiraDms) {
        this.codbandeiraDms = codbandeiraDms;
    }

    public String getFreqvisitaDms() {
        return freqvisitaDms;
    }

    public void setFreqvisitaDms(String freqvisitaDms) {
        this.freqvisitaDms = freqvisitaDms;
    }

    public String getCodtipovendaDms() {
        return codtipovendaDms;
    }

    public void setCodtipovendaDms(String codtipovendaDms) {
        this.codtipovendaDms = codtipovendaDms;
    }

    public String getClimeioptantesn() {
        return climeioptantesn;
    }

    public void setClimeioptantesn(String climeioptantesn) {
        this.climeioptantesn = climeioptantesn;
    }

    public String getMotivobloq() {
        return motivobloq;
    }

    public void setMotivobloq(String motivobloq) {
        this.motivobloq = motivobloq;
    }

    public BigDecimal getPercfreteauton() {
        return percfreteauton;
    }

    public void setPercfreteauton(BigDecimal percfreteauton) {
        this.percfreteauton = percfreteauton;
    }

    public String getPossuibenffiscal() {
        return possuibenffiscal;
    }

    public void setPossuibenffiscal(String possuibenffiscal) {
        this.possuibenffiscal = possuibenffiscal;
    }

    public String getUsaregimeespisenredicms() {
        return usaregimeespisenredicms;
    }

    public void setUsaregimeespisenredicms(String usaregimeespisenredicms) {
        this.usaregimeespisenredicms = usaregimeespisenredicms;
    }

    public LocalDate getCheckinapp() {
        return checkinapp;
    }

    public void setCheckinapp(LocalDate checkinapp) {
        this.checkinapp = checkinapp;
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

    public String getRazaorecebedorendent() {
        return razaorecebedorendent;
    }

    public void setRazaorecebedorendent(String razaorecebedorendent) {
        this.razaorecebedorendent = razaorecebedorendent;
    }

    public Integer getCeprecebedorendent() {
        return ceprecebedorendent;
    }

    public void setCeprecebedorendent(Integer ceprecebedorendent) {
        this.ceprecebedorendent = ceprecebedorendent;
    }

    public Long getIerecebedorendent() {
        return ierecebedorendent;
    }

    public void setIerecebedorendent(Long ierecebedorendent) {
        this.ierecebedorendent = ierecebedorendent;
    }

    public Long getFonerecebedorendent() {
        return fonerecebedorendent;
    }

    public void setFonerecebedorendent(Long fonerecebedorendent) {
        this.fonerecebedorendent = fonerecebedorendent;
    }

    public Integer getCodpaisrecebedorendent() {
        return codpaisrecebedorendent;
    }

    public void setCodpaisrecebedorendent(Integer codpaisrecebedorendent) {
        this.codpaisrecebedorendent = codpaisrecebedorendent;
    }

    public String getEmailrecebedorendent() {
        return emailrecebedorendent;
    }

    public void setEmailrecebedorendent(String emailrecebedorendent) {
        this.emailrecebedorendent = emailrecebedorendent;
    }

    public Short getQtdiasavencerproduto() {
        return qtdiasavencerproduto;
    }

    public void setQtdiasavencerproduto(Short qtdiasavencerproduto) {
        this.qtdiasavencerproduto = qtdiasavencerproduto;
    }

    public String getCodcondcomercial() {
        return codcondcomercial;
    }

    public void setCodcondcomercial(String codcondcomercial) {
        this.codcondcomercial = codcondcomercial;
    }

    public Short getCodgrupocomercialmed() {
        return codgrupocomercialmed;
    }

    public void setCodgrupocomercialmed(Short codgrupocomercialmed) {
        this.codgrupocomercialmed = codgrupocomercialmed;
    }

    public Short getCodcaminhoentregamed() {
        return codcaminhoentregamed;
    }

    public void setCodcaminhoentregamed(Short codcaminhoentregamed) {
        this.codcaminhoentregamed = codcaminhoentregamed;
    }

    public String getCodmotivoDms() {
        return codmotivoDms;
    }

    public void setCodmotivoDms(String codmotivoDms) {
        this.codmotivoDms = codmotivoDms;
    }

    public String getAgregaripibaseicms() {
        return agregaripibaseicms;
    }

    public void setAgregaripibaseicms(String agregaripibaseicms) {
        this.agregaripibaseicms = agregaripibaseicms;
    }

    public String getClientemaisnegocios() {
        return clientemaisnegocios;
    }

    public void setClientemaisnegocios(String clientemaisnegocios) {
        this.clientemaisnegocios = clientemaisnegocios;
    }

    public LocalDate getDatahoraconsultamaisnegocios() {
        return datahoraconsultamaisnegocios;
    }

    public void setDatahoraconsultamaisnegocios(LocalDate datahoraconsultamaisnegocios) {
        this.datahoraconsultamaisnegocios = datahoraconsultamaisnegocios;
    }

    public String getPermitefaturaraprazomaisneg() {
        return permitefaturaraprazomaisneg;
    }

    public void setPermitefaturaraprazomaisneg(String permitefaturaraprazomaisneg) {
        this.permitefaturaraprazomaisneg = permitefaturaraprazomaisneg;
    }

    public BigDecimal getLimiteliberadomaisneg() {
        return limiteliberadomaisneg;
    }

    public void setLimiteliberadomaisneg(BigDecimal limiteliberadomaisneg) {
        this.limiteliberadomaisneg = limiteliberadomaisneg;
    }

    public String getStatusmaisneg() {
        return statusmaisneg;
    }

    public void setStatusmaisneg(String statusmaisneg) {
        this.statusmaisneg = statusmaisneg;
    }

    public String getCodrotinaalt() {
        return codrotinaalt;
    }

    public void setCodrotinaalt(String codrotinaalt) {
        this.codrotinaalt = codrotinaalt;
    }

    public String getRetecaoirorgpub() {
        return retecaoirorgpub;
    }

    public void setRetecaoirorgpub(String retecaoirorgpub) {
        this.retecaoirorgpub = retecaoirorgpub;
    }

    public String getRetecaocsorgpub() {
        return retecaocsorgpub;
    }

    public void setRetecaocsorgpub(String retecaocsorgpub) {
        this.retecaocsorgpub = retecaocsorgpub;
    }

    public String getRetecaopisorgpub() {
        return retecaopisorgpub;
    }

    public void setRetecaopisorgpub(String retecaopisorgpub) {
        this.retecaopisorgpub = retecaopisorgpub;
    }

    public String getRetecaocofinsorgpub() {
        return retecaocofinsorgpub;
    }

    public void setRetecaocofinsorgpub(String retecaocofinsorgpub) {
        this.retecaocofinsorgpub = retecaocofinsorgpub;
    }

    public String getRetecaoicmsstorgpub() {
        return retecaoicmsstorgpub;
    }

    public void setRetecaoicmsstorgpub(String retecaoicmsstorgpub) {
        this.retecaoicmsstorgpub = retecaoicmsstorgpub;
    }

    public String getRetecaooutdedorgpub() {
        return retecaooutdedorgpub;
    }

    public void setRetecaooutdedorgpub(String retecaooutdedorgpub) {
        this.retecaooutdedorgpub = retecaooutdedorgpub;
    }


    public String getGeragrprettrib() {
        return geragrprettrib;
    }

    public void setGeragrprettrib(String geragrprettrib) {
        this.geragrprettrib = geragrprettrib;
    }


    public Short getPrazovenda() {
        return prazovenda;
    }

    public void setPrazovenda(Short prazovenda) {
        this.prazovenda = prazovenda;
    }

    public Instant getDtalterc5() {
        return dtalterc5;
    }

    public void setDtalterc5(Instant dtalterc5) {
        this.dtalterc5 = dtalterc5;
    }


    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

    public String getDigagencia1() {
        return digagencia1;
    }

    public void setDigagencia1(String digagencia1) {
        this.digagencia1 = digagencia1;
    }

    public String getEmailnfe() {
        return emailnfe;
    }

    public void setEmailnfe(String emailnfe) {
        this.emailnfe = emailnfe;
    }

    public Short getQtdiasvenclimcred() {
        return qtdiasvenclimcred;
    }

    public void setQtdiasvenclimcred(Short qtdiasvenclimcred) {
        this.qtdiasvenclimcred = qtdiasvenclimcred;
    }

    public Integer getCodcli() {
        return this.id != null ? this.id.getCodcli() : null;
    }
}