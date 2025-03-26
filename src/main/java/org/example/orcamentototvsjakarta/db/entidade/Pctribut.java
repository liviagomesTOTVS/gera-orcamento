package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PCTRIBUT")
public class Pctribut {
    @Id
    @Column(name = "CODST", nullable = false)
    private Short id;

    @Column(name = "IVA", precision = 8, scale = 4)
    private BigDecimal iva;

    @Column(name = "ALIQICMS1", precision = 8, scale = 4)
    private BigDecimal aliqicms1;

    @Column(name = "ALIQICMS2", precision = 8, scale = 4)
    private BigDecimal aliqicms2;

    @Column(name = "IVATAB", precision = 8, scale = 4)
    private BigDecimal ivatab;

    @Column(name = "ALIQICMS1TAB", precision = 8, scale = 4)
    private BigDecimal aliqicms1tab;

    @Column(name = "ALIQICMS2TAB", precision = 8, scale = 4)
    private BigDecimal aliqicms2tab;

    @Column(name = "PERDESTAB", precision = 8, scale = 4)
    private BigDecimal perdestab;

    @Column(name = "PERDESCCUSTO", precision = 8, scale = 4)
    private BigDecimal perdesccusto;

    @Column(name = "PAUTA", precision = 18, scale = 6)
    private BigDecimal pauta;

    @Column(name = "PAUTATAB", precision = 18, scale = 6)
    private BigDecimal pautatab;

    @Column(name = "SITTRIBUT", length = 3)
    private String sittribut;

    @Column(name = "INDICEST", precision = 8, scale = 4)
    private BigDecimal indicest;

    @Column(name = "CODICM", precision = 8, scale = 4)
    private BigDecimal codicm;

    @Column(name = "CODICMTAB", precision = 8, scale = 4)
    private BigDecimal codicmtab;

    @Column(name = "PERCBASERED", precision = 8, scale = 4)
    private BigDecimal percbasered;

    @Column(name = "MENSAGEM", length = 40)
    private String mensagem;

    @Column(name = "CODICMANTECIPADO", precision = 8, scale = 4)
    private BigDecimal codicmantecipado;

    @Column(name = "OBS", length = 100)
    private String obs;

    @Column(name = "CALCBCICMSNF", length = 1)
    private String calcbcicmsnf;

    @Column(name = "CODFISCAL")
    private Integer codfiscal;

    @Column(name = "CODFISCALINTER")
    private Integer codfiscalinter;

    @Column(name = "CODICMTRANSF", precision = 8, scale = 4)
    private BigDecimal codicmtransf;

    @Column(name = "SITTRIBUTTRANSF", length = 3)
    private String sittributtransf;

    @Column(name = "CALCSTTRANSF", length = 1)
    private String calcsttransf;

    @Column(name = "IVATRANSF", precision = 8, scale = 4)
    private BigDecimal ivatransf;

    @Column(name = "PAUTATRANSF", precision = 8, scale = 4)
    private BigDecimal pautatransf;

    @Column(name = "ALIQICMS1TRANSF", precision = 8, scale = 4)
    private BigDecimal aliqicms1transf;

    @Column(name = "ALIQICMS2TRANSF", precision = 8, scale = 4)
    private BigDecimal aliqicms2transf;

    @Column(name = "CODICMPF", precision = 8, scale = 4)
    private BigDecimal codicmpf;

    @Column(name = "CODICMPRODRURAL", precision = 10, scale = 4)
    private BigDecimal codicmprodrural;

    @Column(name = "CODICMCONSUMIDOR", precision = 8, scale = 2)
    private BigDecimal codicmconsumidor;

    @Column(name = "PERACRESCISMOPF", precision = 8, scale = 4)
    private BigDecimal peracrescismopf;

    @Column(name = "CODECF", length = 4)
    private String codecf;

    @Column(name = "CODFISCALPF")
    private Integer codfiscalpf;

    @Column(name = "CODFISCALINTERPF")
    private Integer codfiscalinterpf;

    @Column(name = "CODFISCALDEVCLI")
    private Integer codfiscaldevcli;

    @Column(name = "CODFISCALDEVCLIINTER")
    private Integer codfiscaldevcliinter;

    @Column(name = "CODFISCALTRANSF")
    private Integer codfiscaltransf;

    @Column(name = "CODFISCALTRANSFINTER")
    private Integer codfiscaltransfinter;

    @Column(name = "CODFISCALBONIFIC")
    private Integer codfiscalbonific;

    @Column(name = "CODFISCALBONIFICINTER")
    private Integer codfiscalbonificinter;

    @Column(name = "CODFISCALDEVCLIBONIFIC")
    private Integer codfiscaldevclibonific;

    @Column(name = "CODFISCALDEVCLIBONIFICINTER")
    private Integer codfiscaldevclibonificinter;

    @Column(name = "CODFISCALDEVCLIPRONTAENT")
    private Integer codfiscaldevcliprontaent;

    @Column(name = "CODFISCALDEVCLIPRONTAENTINTER")
    private Integer codfiscaldevcliprontaentinter;

    @Column(name = "CODFISCALPRONTAENT")
    private Integer codfiscalprontaent;

    @Column(name = "CODFISCALPRONTAENTINTER")
    private Integer codfiscalprontaentinter;

    @Column(name = "IVAFONTE", precision = 8, scale = 4)
    private BigDecimal ivafonte;

    @Column(name = "ALIQICMS1FONTE", precision = 8, scale = 4)
    private BigDecimal aliqicms1fonte;

    @Column(name = "ALIQICMS2FONTE", precision = 8, scale = 4)
    private BigDecimal aliqicms2fonte;

    @Column(name = "OBSPF", length = 100)
    private String obspf;

    @Column(name = "CALCBASEREDICMSTRANSF", length = 1)
    private String calcbaseredicmstransf;

    @Column(name = "PERDESCSUFRAMA", precision = 8, scale = 4)
    private BigDecimal perdescsuframa;

    @Column(name = "SITTRIBUTTRANSFENT", length = 3)
    private String sittributtransfent;

    @Column(name = "PERBASEREDTRANSFENT", precision = 8, scale = 4)
    private BigDecimal perbaseredtransfent;

    @Column(name = "CODFISCALINTERNASC")
    private Integer codfiscalinternasc;

    @Column(name = "CODFISCALINTERNASCPF")
    private Integer codfiscalinternascpf;

    @Column(name = "CODFISCALDEVCLIINTERNASC")
    private Integer codfiscaldevcliinternasc;

    @Column(name = "CODFISCALTRANSFINTERNASC")
    private Integer codfiscaltransfinternasc;

    @Column(name = "CODFISCALBONIFICINTERNASC")
    private Integer codfiscalbonificinternasc;

    @Column(name = "CODFISCALDEVCLIBONINTERNASC")
    private Integer codfiscaldevcliboninternasc;

    @Column(name = "CODFISCALDEVCLIPROENTINTERNASC")
    private Integer codfiscaldevcliproentinternasc;

    @Column(name = "CODFISCALPRONTAENTINTERNASC")
    private Integer codfiscalprontaentinternasc;

    @Column(name = "SITTRIBUTPF", length = 3)
    private String sittributpf;

    @Column(name = "PERDESCICMISENCAO", precision = 8, scale = 4)
    private BigDecimal perdescicmisencao;

    @Column(name = "CODFUNCULTALTER")
    private Integer codfuncultalter;

    @Column(name = "DTULTALTER")
    private LocalDate dtultalter;

    @Column(name = "CODFISCALVENDACONSIG")
    private Long codfiscalvendaconsig;

    @Column(name = "CODFISCALVENDACONSIGINTER")
    private Long codfiscalvendaconsiginter;

    @Column(name = "CODFISCALVENDACONSIGINTERNASC")
    private Long codfiscalvendaconsiginternasc;

    @Column(name = "OBSTRANSF", length = 100)
    private String obstransf;

    @Column(name = "CODFISCALVENDAENTFUT")
    private Integer codfiscalvendaentfut;

    @Column(name = "CODFISCALVENDAENTFUTINTER")
    private Integer codfiscalvendaentfutinter;

    @Column(name = "CODFISCALSIMPENTFUT")
    private Integer codfiscalsimpentfut;

    @Column(name = "CODFISCALSIMPENTFUTINTER")
    private Integer codfiscalsimpentfutinter;

    @Column(name = "CODFISCALMERCCONSIG")
    private Integer codfiscalmercconsig;

    @Column(name = "CODFISCALMERCCONSIGINTER")
    private Integer codfiscalmercconsiginter;

    @Column(name = "CODFISCALMERCCONSIGINTERNASC")
    private Integer codfiscalmercconsiginternasc;

    @Column(name = "PERCBASEREDCONSUMIDOR", precision = 8, scale = 4)
    private BigDecimal percbaseredconsumidor;

    @Column(name = "OBS2", length = 100)
    private String obs2;

    @Column(name = "OBSPF2", length = 100)
    private String obspf2;

    @Column(name = "PERBASEREDNRPA", precision = 8, scale = 4)
    private BigDecimal perbaserednrpa;

    @Column(name = "SITTRIBUTNRPA", length = 3)
    private String sittributnrpa;

    @Column(name = "CODICMNRPA", precision = 8, scale = 4)
    private BigDecimal codicmnrpa;

    @Column(name = "CODICMTABNRPA", precision = 8, scale = 4)
    private BigDecimal codicmtabnrpa;

    @Column(name = "PERACRESCIMONRPA", precision = 8, scale = 4)
    private BigDecimal peracrescimonrpa;

    @Column(name = "CODFISCALDEVTRANSF")
    private Integer codfiscaldevtransf;

    @Column(name = "CODFISCALDEVTRANSFINTER")
    private Integer codfiscaldevtransfinter;

    @Column(name = "UTILIZAPERCBASEREDPF", length = 1)
    private String utilizapercbaseredpf;

    @Column(name = "USAREDBASEICMSFONTEST", length = 1)
    private String usaredbaseicmsfontest;

    @Column(name = "APLICAACRESCPJISENTA", length = 1)
    private String aplicaacrescpjisenta;

    @Column(name = "TIPOCALCULOGNRE", length = 1)
    private String tipocalculognre;

    @Column(name = "TIPOCALCULOGNRETAB", length = 1)
    private String tipocalculognretab;

    @Column(name = "PERCBASEREDST", precision = 8, scale = 4)
    private BigDecimal percbaseredst;

    @Column(name = "PERCBASEREDSTFONTE", precision = 8, scale = 4)
    private BigDecimal percbaseredstfonte;

    @Column(name = "PERCBASEREDSTTRANSF", precision = 8, scale = 4)
    private BigDecimal percbaseredsttransf;

    @Column(name = "CODFISCALVENDAPRONTAENT")
    private Integer codfiscalvendaprontaent;

    @Column(name = "CODFISCALVENDAPRONTAENTINTER")
    private Integer codfiscalvendaprontaentinter;

    @Column(name = "ALIQISS", precision = 8, scale = 4)
    private BigDecimal aliqiss;

    @Column(name = "CODFISCALDEVMERCCONSIG")
    private Integer codfiscaldevmercconsig;

    @Column(name = "CODFISCALDEVMERCCONSIGINTER")
    private Integer codfiscaldevmercconsiginter;

    @Column(name = "PERDESCREPASSE", precision = 8, scale = 4)
    private BigDecimal perdescrepasse;

    @Column(name = "CODICMTABPF", precision = 8, scale = 4)
    private BigDecimal codicmtabpf;

    @Column(name = "CODFISCALISENTOST")
    private Integer codfiscalisentost;

    @Column(name = "CODFISCALISENTOSTINTER")
    private Integer codfiscalisentostinter;

    @Column(name = "CODFISCALISENTOSTINTERNASC")
    private Integer codfiscalisentostinternasc;

    @Column(name = "SITTRIBUTISENTOST", length = 3)
    private String sittributisentost;

    @Column(name = "PERCACRESCBASEPFEST", precision = 8, scale = 4)
    private BigDecimal percacrescbasepfest;

    @Column(name = "CODFISCALDEVISENTOST")
    private Integer codfiscaldevisentost;

    @Column(name = "CODFISCALDEVISENTOSTINTER")
    private Integer codfiscaldevisentostinter;

    @Column(name = "CODFISCALDEVISENTOSTINTERNASC")
    private Integer codfiscaldevisentostinternasc;

    @Column(name = "USAPERCBASEREDHOSP", length = 1)
    private String usapercbaseredhosp;

    @Column(name = "USAPERCBASEREDFARMA", length = 1)
    private String usapercbaseredfarma;

    @Column(name = "USAPERCBASEREDOPF", length = 1)
    private String usapercbaseredopf;

    @Column(name = "USAPERCBASEREDOPE", length = 1)
    private String usapercbaseredope;

    @Column(name = "USAPERCBASEREDOPM", length = 1)
    private String usapercbaseredopm;

    @Column(name = "USAPERCBASEREDASSOC", length = 1)
    private String usapercbaseredassoc;

    @Column(name = "USAPERCBASEREDDIST", length = 1)
    private String usapercbasereddist;

    @Column(name = "PERDESCPISSUFRAMA", precision = 8, scale = 4)
    private BigDecimal perdescpissuframa;

    @Column(name = "USAPERCBASEREDMEDICO", length = 1)
    private String usapercbaseredmedico;

    @Column(name = "NUMSEQATU")
    private Long numseqatu;

    @Column(name = "CODFISCALTRANSFENT")
    private Integer codfiscaltransfent;

    @Column(name = "CODFISCALTRANSFENTINTER")
    private Integer codfiscaltransfentinter;

    @Column(name = "USAVALORULTENTBASEST", length = 1)
    private String usavalorultentbasest;

    @Column(name = "CODFISCALTROCA")
    private Integer codfiscaltroca;

    @Column(name = "CODFISCALTROCAINTER")
    private Integer codfiscaltrocainter;

    @Column(name = "CODFISCALTROCAINTERNASC")
    private Integer codfiscaltrocainternasc;

    @Column(name = "CODFISCALSRESTSR")
    private Integer codfiscalsrestsr;

    @Column(name = "CODFISCALSRINTE")
    private Integer codfiscalsrinte;

    @Column(name = "CODFISCALSREXT")
    private Integer codfiscalsrext;

    @Column(name = "ALIQSTSAIDA", precision = 8, scale = 4)
    private BigDecimal aliqstsaida;

    @Column(name = "ALIQSTSAIDAPF", precision = 8, scale = 4)
    private BigDecimal aliqstsaidapf;

    @Column(name = "PERCIVAMEX", precision = 8, scale = 4)
    private BigDecimal percivamex;

    @Column(name = "MENSAGEMNRPA", length = 100)
    private String mensagemnrpa;

    @Column(name = "PERCBASECALCREPASSE", precision = 18, scale = 6)
    private BigDecimal percbasecalcrepasse;

    @Column(name = "PERCBASEREDTRANFSAID", precision = 8, scale = 4)
    private BigDecimal percbaseredtranfsaid;

    @Column(name = "DESCICMSREDUZBASEICMS", length = 1)
    private String descicmsreduzbaseicms;

    @Column(name = "PERCAGREGADORST", precision = 8, scale = 4)
    private BigDecimal percagregadorst;

    @Column(name = "PERPAUTAICMS", precision = 18, scale = 6)
    private BigDecimal perpautaicms;

    @Column(name = "PERPAUTAICMSINTER", precision = 18, scale = 6)
    private BigDecimal perpautaicmsinter;

    @Column(name = "PERCBASEREDADICIONAL", precision = 18, scale = 6)
    private BigDecimal percbaseredadicional;

    @Column(name = "PERCBASEREDADICIONALINTER", precision = 18, scale = 6)
    private BigDecimal percbaseredadicionalinter;

    @Column(name = "USACFOPBNFPARABRINDE", length = 1)
    private String usacfopbnfparabrinde;

    @Column(name = "PERDESCCUSTOTRANSF", precision = 8, scale = 4)
    private BigDecimal perdesccustotransf;

    @Column(name = "PAGTONOMEDOCLIENTE", length = 1)
    private String pagtonomedocliente;

    @Column(name = "CODFISCALTRANSFF")
    private Integer codfiscaltransff;

    @Column(name = "CODFISCALTRANSFFINTER")
    private Integer codfiscaltransffinter;

    @Column(name = "CODFISCALTRANSFFINTERNASC")
    private Integer codfiscaltransffinternasc;

    @Column(name = "CODFISCALDEVTRANSFENTINTER")
    private Integer codfiscaldevtransfentinter;

    @Column(name = "CODFISCALDEVTRANSFENT")
    private Integer codfiscaldevtransfent;

    @Column(name = "USAVALORULTENTBASEST2", length = 1)
    private String usavalorultentbasest2;

    @Column(name = "OBSTRIBUT_GNRE", length = 80)
    private String obstributGnre;

    @Column(name = "MOSTRARPVENDASEMST", length = 1)
    private String mostrarpvendasemst;

    @Column(name = "PERCDIFALIQUOTAS", precision = 8, scale = 4)
    private BigDecimal percdifaliquotas;

    @Column(name = "OBSSUFRAMA", length = 80)
    private String obssuframa;

    @Column(name = "CODFISCALBROKERENT")
    private Integer codfiscalbrokerent;

    @Column(name = "CODFISCALBROKERSAID")
    private Integer codfiscalbrokersaid;

    @Column(name = "CODFISCALBROKERDEVENT")
    private Integer codfiscalbrokerdevent;

    @Column(name = "CODFISCALBROKERDEVSAID")
    private Integer codfiscalbrokerdevsaid;

    @Column(name = "CALCULARICMSSITTRIBUT060", length = 1)
    private String calcularicmssittribut060;

    @Column(name = "PERCDESCPIS", precision = 12, scale = 4)
    private BigDecimal percdescpis;

    @Column(name = "PERCDESCCOFINS", precision = 12, scale = 4)
    private BigDecimal percdesccofins;

    @Column(name = "CODFISCALTV9")
    private Integer codfiscaltv9;

    @Column(name = "CODFISCALINTERTV9")
    private Integer codfiscalintertv9;

    @Column(name = "CODFISCALINTERNASCTV9")
    private Integer codfiscalinternasctv9;

    @Column(name = "PERACRESCIMOFUNCEP", precision = 8, scale = 4)
    private BigDecimal peracrescimofuncep;

    @Column(name = "PERACRESCIMOCUSTO", precision = 8, scale = 4)
    private BigDecimal peracrescimocusto;

    @Column(name = "CODFISCALCONSIG")
    private Integer codfiscalconsig;

    @Column(name = "CODFISCALCONSIGINTER")
    private Integer codfiscalconsiginter;

    @Column(name = "CODFISCALCONSIGINTERNAC")
    private Integer codfiscalconsiginternac;

    @Column(name = "PERACRESCIMOPF", precision = 6, scale = 2)
    private BigDecimal peracrescimopf;

    @Column(name = "PERCACRESCBASEPFINT", precision = 8, scale = 4)
    private BigDecimal percacrescbasepfint;

    @Column(name = "CODFISCALTRANSFSAIDAEST")
    private Integer codfiscaltransfsaidaest;

    @Column(name = "CODFISCALTRANSFSAIDAINT")
    private Integer codfiscaltransfsaidaint;

    @Column(name = "PAGTONOMEDOREMETENTE", length = 1)
    private String pagtonomedoremetente;

    @Column(name = "PERCDIFALIQUOTASTAB", precision = 8, scale = 4)
    private BigDecimal percdifaliquotastab;

    @Column(name = "PERCICMSCOMPLEMENTAR", precision = 8, scale = 4)
    private BigDecimal percicmscomplementar;

    @Column(name = "PERCACREPFVLACIMAPERMITIDO", precision = 6, scale = 2)
    private BigDecimal percacrepfvlacimapermitido;

    @Column(name = "ALIQUOTAICMSENTTRANSF", precision = 8, scale = 4)
    private BigDecimal aliquotaicmsenttransf;

    @Column(name = "CODFISCALTRIANGULAR")
    private Integer codfiscaltriangular;

    @Column(name = "CODFISCALTRIANGULARINTER")
    private Integer codfiscaltriangularinter;

    @Column(name = "CODFISCALTRIANGULARINTERNASC")
    private Integer codfiscaltriangularinternasc;

    @Column(name = "OBS_INFORMATIVO", length = 2000)
    private String obsInformativo;

    @Column(name = "CODECFFUNCEP", length = 4)
    private String codecffuncep;

    @Column(name = "VLPAUTASEMIVA", precision = 8, scale = 4)
    private BigDecimal vlpautasemiva;

    @Column(name = "PERCIVAPAUTA", precision = 8, scale = 4)
    private BigDecimal percivapauta;

    @Column(name = "USAPAUTASEMIVA", length = 1)
    private String usapautasemiva;

    @Column(name = "CODFISCALCONTAORDEM")
    private Integer codfiscalcontaordem;

    @Column(name = "CODFISCALCONTAORDEMINTER")
    private Integer codfiscalcontaordeminter;

    @Column(name = "CODFISCALCONTAORDEMSIMPENT")
    private Integer codfiscalcontaordemsimpent;

    @Column(name = "CODFISCALCONTAORDEMSIMPENTINTE")
    private Integer codfiscalcontaordemsimpentinte;

    @Column(name = "ZERARBASEICMSORGPUBSUFRAMA", length = 1)
    private String zerarbaseicmsorgpubsuframa;

    @Column(name = "CODFISCALTRIANGULARPF")
    private Integer codfiscaltriangularpf;

    @Column(name = "CODFISCALTRIANGULARINTERPF")
    private Integer codfiscaltriangularinterpf;

    @Column(name = "CODFISCALTRIANGULARINTERNASCPF")
    private Integer codfiscaltriangularinternascpf;

    @Column(name = "PERDIFEREIMENTOICMS", precision = 8, scale = 4)
    private BigDecimal perdifereimentoicms;

    @Column(name = "MENSAGEM2", length = 200)
    private String mensagem2;

    @Column(name = "PERCREDPVENDASIMPLESNAC", precision = 8, scale = 4)
    private BigDecimal percredpvendasimplesnac;

    @Column(name = "OBSSIMPLES", length = 100)
    private String obssimples;

    @Column(name = "PAGTONOMEDESTTRANSFTAB", length = 1)
    private String pagtonomedesttransftab;

    @Column(name = "PAGTONOMEDESTTRANSF", length = 1)
    private String pagtonomedesttransf;

    @Column(name = "PAGTONOMEREMETTRANSFTAB", length = 1)
    private String pagtonomeremettransftab;

    @Column(name = "PAGTONOMEREMETTRANSF", length = 1)
    private String pagtonomeremettransf;

    @Column(name = "TIPOCALCULOGNRETRANSFTAB", length = 1)
    private String tipocalculognretransftab;

    @Column(name = "TIPOCALCULOGNRETRANSF", length = 1)
    private String tipocalculognretransf;

    @Column(name = "ASSINATURA")
    private String assinatura;

    @Column(name = "CODFISCALSAIDBENEFEST")
    private Integer codfiscalsaidbenefest;

    @Column(name = "CODFISCALSAIDBENEFINTEREST")
    private Integer codfiscalsaidbenefinterest;

    @Column(name = "CODFISCALSAIDBENEFINTERNAC")
    private Integer codfiscalsaidbenefinternac;

    @Column(name = "CODFISCALENTBENEFICEST")
    private Integer codfiscalentbeneficest;

    @Column(name = "CODFISCALENTBENEFICINTEREST")
    private Integer codfiscalentbeneficinterest;

    @Column(name = "CODFISCALENTBENEFINTERNAC")
    private Integer codfiscalentbenefinternac;

    @Column(name = "REDUZBASEICMDECRETOMARANHAO", length = 1)
    private String reduzbaseicmdecretomaranhao;

    @Column(name = "USABASEICMSREDUZIDA", length = 1)
    private String usabaseicmsreduzida;

    @Column(name = "CODFISCALDEVCLIPFINTER")
    private Integer codfiscaldevclipfinter;

    @Column(name = "CODFISCALDEVCLIPFINTERNASC")
    private Integer codfiscaldevclipfinternasc;

    @Column(name = "USAPMCBASEST", length = 1)
    private String usapmcbasest;

    @Column(name = "CODFISCALDEVCLIPF")
    private Integer codfiscaldevclipf;

    @Column(name = "SITTRIBUTTV7", length = 3)
    private String sittributtv7;

    @Column(name = "UTILIZAPARCADICFECP", length = 1)
    private String utilizaparcadicfecp;

    @Column(name = "ALIQICMSFECP", precision = 8, scale = 4)
    private BigDecimal aliqicmsfecp;

    @Column(name = "ISENTAICMSBONIFIC", length = 1)
    private String isentaicmsbonific;

    @Column(name = "SITTRIBUTTV8", length = 3)
    private String sittributtv8;

    @Column(name = "SITTRIBUTBONIFIC", length = 3)
    private String sittributbonific;

    @Column(name = "CODFISCALENVCOMODATOEST")
    private Integer codfiscalenvcomodatoest;

    @Column(name = "CODFISCALENVCOMODATOINTER")
    private Integer codfiscalenvcomodatointer;

    @Column(name = "CODFISCALDEVCOMODATOEST")
    private Integer codfiscaldevcomodatoest;

    @Column(name = "CODFISCALDEVCOMODATOINTER")
    private Integer codfiscaldevcomodatointer;

    @Column(name = "CODICMTABTRANSF", precision = 8, scale = 4)
    private BigDecimal codicmtabtransf;

    @Column(name = "SITTRIBUTECF", length = 3)
    private String sittributecf;

    @Column(name = "CODFISCALSUFRAMAINTER")
    private Integer codfiscalsuframainter;

    @Column(name = "USAISENCAOICMSVP", length = 1)
    private String usaisencaoicmsvp;

    @Column(name = "ALIQICMSTV9", precision = 8, scale = 4)
    private BigDecimal aliqicmstv9;

    @Column(name = "SITTRIBUTSUFRAMA", length = 3)
    private String sittributsuframa;

    @Column(name = "CODFISCALSUFRAMA")
    private Integer codfiscalsuframa;

    @Column(name = "ISENCAOSTORGAOPUB", length = 1)
    private String isencaostorgaopub;

    @Column(name = "CODFISCALVENISEORGAOPUBEST")
    private Integer codfiscalveniseorgaopubest;

    @Column(name = "CODFISCALVENISEORGAOPUBINTER")
    private Integer codfiscalveniseorgaopubinter;

    @Column(name = "CODFISCALDEVISEORGAOPUBEST")
    private Integer codfiscaldeviseorgaopubest;

    @Column(name = "CODFISCALDEVISEORGAOPUBINTER")
    private Integer codfiscaldeviseorgaopubinter;

    @Column(name = "SITTRIBUTISEORGAOPUB", length = 3)
    private String sittributiseorgaopub;

    @Column(name = "OBSISEORGAOPUB1", length = 100)
    private String obsiseorgaopub1;

    @Column(name = "OBSISEORGAOPUB2", length = 100)
    private String obsiseorgaopub2;

    @Column(name = "CODECFNRPA", length = 4)
    private String codecfnrpa;

    @Column(name = "USAALIQICMSSIMPLESNACIONAL", length = 1)
    private String usaaliqicmssimplesnacional;

    @Column(name = "ALIQICMSSIMPLESNACIONAL", precision = 8, scale = 4)
    private BigDecimal aliqicmssimplesnacional;

    @Column(name = "ALIQSTSIMPLESNACIONAL", precision = 8, scale = 4)
    private BigDecimal aliqstsimplesnacional;

    @Column(name = "APLICAREDICMSSEMIPIBA", length = 1)
    private String aplicaredicmssemipiba;

    @Column(name = "VLPAUTAICMSINTEREST", precision = 8, scale = 4)
    private BigDecimal vlpautaicmsinterest;

    @Column(name = "SITTRIBUTPAUTAICMS", length = 3)
    private String sittributpautaicms;

    @Column(name = "CODFISCALINTER_MC")
    private Integer codfiscalinterMc;

    @Column(name = "CODFISCAL_MC")
    private Integer codfiscalMc;

    @Column(name = "SITTRIBUT_MC", length = 3)
    private String sittributMc;

    @Column(name = "ALIQICMS2_MC", precision = 8, scale = 4)
    private BigDecimal aliqicms2Mc;

    @Column(name = "ALIQICMS1_MC", precision = 8, scale = 4)
    private BigDecimal aliqicms1Mc;

    @Column(name = "PAUTA_MC", precision = 8, scale = 4)
    private BigDecimal pautaMc;

    @Column(name = "IVA_MC", precision = 8, scale = 4)
    private BigDecimal ivaMc;

    @Column(name = "PERCBASERED_MC", precision = 8, scale = 4)
    private BigDecimal percbaseredMc;

    @Column(name = "PERCBASEREDST_MC", precision = 8, scale = 4)
    private BigDecimal percbaseredstMc;

    @Column(name = "CODICM_MC", precision = 8, scale = 4)
    private BigDecimal codicmMc;

    @Column(name = "AGREGARIPICALCULOST", length = 1)
    private String agregaripicalculost;

    @Column(name = "SITTRIBUTPAUTAICMSPF", length = 3)
    private String sittributpautaicmspf;

    @Column(name = "CODFISCALSAIDDEVTRANSFVIRINTER")
    private Integer codfiscalsaiddevtransfvirinter;

    @Column(name = "CODFISCALSAIDDEVTRANSFVIR")
    private Integer codfiscalsaiddevtransfvir;

    @Column(name = "CODFISCALSAIDTRANSFVIRINTER")
    private Integer codfiscalsaidtransfvirinter;

    @Column(name = "CODFISCALSAIDTRANSFVIR")
    private Integer codfiscalsaidtransfvir;

    @Column(name = "CODFISCALENTDEVTRANSFVIRINTER")
    private Integer codfiscalentdevtransfvirinter;

    @Column(name = "CODFISCALENTDEVTRANSFVIR")
    private Integer codfiscalentdevtransfvir;

    @Column(name = "CODFISCALENTTRANSFVIRINTER")
    private Integer codfiscalenttransfvirinter;

    @Column(name = "CODFISCALENTTRANSFVIR")
    private Integer codfiscalenttransfvir;

    @Column(name = "MOSTRARPVENDASEMIPI", length = 1)
    private String mostrarpvendasemipi;

    @Column(name = "PERBASEREDSIMPLESNAC", precision = 8, scale = 4)
    private BigDecimal perbaseredsimplesnac;

    @Column(name = "CODFISCALENTTRFFILRET")
    private Integer codfiscalenttrffilret;

    @Column(name = "CODFISCALSAIDTRFFILRET")
    private Integer codfiscalsaidtrffilret;

    @Column(name = "CODFISCALENTTRFFILRETINTER")
    private Integer codfiscalenttrffilretinter;

    @Column(name = "CODFISCALSAIDTRFFILRETINTER")
    private Integer codfiscalsaidtrffilretinter;

    @Column(name = "CODFISCALENTDEVTRFFILRET")
    private Integer codfiscalentdevtrffilret;

    @Column(name = "CODFISCALSAIDDEVTRFFILRET")
    private Integer codfiscalsaiddevtrffilret;

    @Column(name = "CODFISCENTDEVTRFFILRETINTER")
    private Integer codfiscentdevtrffilretinter;

    @Column(name = "CODFISCSAIDDEVTRFFILRETINTER")
    private Integer codfiscsaiddevtrffilretinter;

    @Column(name = "SITTRIBUTSIMPLESNAC", length = 3)
    private String sittributsimplesnac;

    @Column(name = "CODICMSIMPLESNAC", precision = 8, scale = 4)
    private BigDecimal codicmsimplesnac;

    @Column(name = "UTILIZAPERCBASEREDVENCONSIGN", length = 1)
    private String utilizapercbaseredvenconsign;

    @Column(name = "CODPRODGNRE")
    private Integer codprodgnre;

    @Column(name = "PERCTRIBUTOS", precision = 4, scale = 2)
    private BigDecimal perctributos;

    @Column(name = "ISENCAOICMSORGAOPUB", length = 1)
    private String isencaoicmsorgaopub;

    @Column(name = "SITTRIBUTORGAOPUB", length = 3)
    private String sittributorgaopub;

    @Column(name = "USAVLULTENTMEDIOBASEST", length = 1)
    private String usavlultentmediobasest;

    @Column(name = "PERCBASESTRJ", precision = 8, scale = 4)
    private BigDecimal percbasestrj;

    @Column(name = "PAUTAFONTE", precision = 18, scale = 6)
    private BigDecimal pautafonte;

    @Column(name = "ISENTNUMEMPENHO", length = 1)
    private String isentnumempenho;

    @Column(name = "CODECFREDUZIDO", length = 4)
    private String codecfreduzido;

    @Column(name = "GERACODFISCALSAIDTRANSFVIR", length = 1)
    private String geracodfiscalsaidtransfvir;

    @Column(name = "GERACODFISCALSAIDDEVTRANSFVIR", length = 1)
    private String geracodfiscalsaiddevtransfvir;

    @Column(name = "GERACODFISCALENTTRANSFVIR", length = 1)
    private String geracodfiscalenttransfvir;

    @Column(name = "GERACODFISCALENTDEVTRANSFVIR", length = 1)
    private String geracodfiscalentdevtransfvir;

    @Column(name = "GERACODFISCALENTTRFFILRET", length = 1)
    private String geracodfiscalenttrffilret;

    @Column(name = "GERACODFISCENTDEVTRFFILRET", length = 1)
    private String geracodfiscentdevtrffilret;

    @Column(name = "GERACODFISCALSAIDTRFFILRET", length = 1)
    private String geracodfiscalsaidtrffilret;

    @Column(name = "GERACODFISCSAIDDEVTRFFILRET", length = 1)
    private String geracodfiscsaiddevtrffilret;

    @Column(name = "PRODTRANSFTRIBRJ", length = 1)
    private String prodtransftribrj;

    @Column(name = "COMPARARPAUTACOMST", length = 1)
    private String compararpautacomst;

    @Column(name = "DTINICIOVIGENCIA")
    private LocalDate dtiniciovigencia;

    @Column(name = "DTFIMVIGENCIA")
    private LocalDate dtfimvigencia;

    @Column(name = "PERCACRESICMSPF_PI", precision = 8, scale = 4)
    private BigDecimal percacresicmspfPi;

    @Column(name = "ALTERAFATORAJUSTEIVASN", length = 1)
    private String alterafatorajusteivasn;

    @Column(name = "SITTRIBSTFONTEPF", length = 3)
    private String sittribstfontepf;

    @Column(name = "SITTRIBSTFONTEPJ", length = 3)
    private String sittribstfontepj;

    @Column(name = "CODFISCALSTFONTEEST")
    private Integer codfiscalstfonteest;

    @Column(name = "CODFISCALSTFONTEINTEREST")
    private Integer codfiscalstfonteinterest;

    @Column(name = "CODFISCALSTFONTEINTERNAC")
    private Integer codfiscalstfonteinternac;

    @Column(name = "CODFISCALESTORNO")
    private Integer codfiscalestorno;

    @Column(name = "CODFISCALESTORNOSAIDAINTER")
    private Integer codfiscalestornosaidainter;

    @Column(name = "SITTRIBUTBNFTV1", length = 3)
    private String sittributbnftv1;

    @Column(name = "USAVALORULTENTBASESTFONTE", length = 1)
    private String usavalorultentbasestfonte;

    @Column(name = "BNFNAOCALCULAICMS", length = 1)
    private String bnfnaocalculaicms;

    @Column(name = "USAVALORSTFONTE", length = 1)
    private String usavalorstfonte;

    @Column(name = "USAVALORULTENTBASEICMS", length = 1)
    private String usavalorultentbaseicms;

    @Column(name = "USAVALORULTENTBASEICMSFONTE", length = 1)
    private String usavalorultentbaseicmsfonte;

    @Column(name = "UTILIZANATOPSRTV20", length = 1)
    private String utilizanatopsrtv20;

    @Column(name = "AGREGASUFRAMAST2", length = 1)
    private String agregasuframast2;

    @Column(name = "AGREGAICMSISENCAOST2", length = 1)
    private String agregaicmsisencaost2;

    @Column(name = "AGREGAPISCOFINSST2", length = 1)
    private String agregapiscofinsst2;

    @Column(name = "CODFISCALSIMPLESNACEST")
    private Integer codfiscalsimplesnacest;

    @Column(name = "CODFISCALSIMPLESNACNAC")
    private Integer codfiscalsimplesnacnac;

    @Column(name = "PERDIFERIMENTOCMSTRANSF", precision = 8, scale = 4)
    private BigDecimal perdiferimentocmstransf;

    @Column(name = "CODFISCALSRVASILHAME")
    private Integer codfiscalsrvasilhame;

    @Column(name = "CODFISCALSRVASILHAMEINTERES")
    private Integer codfiscalsrvasilhameinteres;

    @Column(name = "SITTRIBUTSRVASILHAME", length = 3)
    private String sittributsrvasilhame;

    @Column(name = "GERARICMSLIVROFISCAL", length = 2)
    private String geraricmslivrofiscal;

    @Column(name = "CODCEST", length = 7)
    private String codcest;

    @Column(name = "PERISS", precision = 8, scale = 4)
    private BigDecimal periss;

    @Column(name = "PERDIFERENCIALTRANSF", precision = 8, scale = 4)
    private BigDecimal perdiferencialtransf;

    @Column(name = "RIOLOGISENTOST", length = 1)
    private String riologisentost;

    @Column(name = "SITTRIBUTTV9", length = 3)
    private String sittributtv9;

    @Column(name = "TV9ISENTOST", length = 1)
    private String tv9isentost;

    @Column(name = "SITTRIBUTPRIORIT", length = 3)
    private String sittributpriorit;

    @Column(name = "FIGURAPARTILHA", length = 1)
    private String figurapartilha;

    @Column(name = "ISENTAICMSUFDEST", length = 1)
    private String isentaicmsufdest;

    @Column(name = "PERCPISRETORGPUB", precision = 18, scale = 6)
    private BigDecimal percpisretorgpub;

    @Column(name = "PERCCOFINSRETORGPUB", precision = 18, scale = 6)
    private BigDecimal perccofinsretorgpub;

    @Column(name = "PERCIRPJRETORGPUB", precision = 18, scale = 6)
    private BigDecimal percirpjretorgpub;

    @Column(name = "PERCCSLLRETORGPUB", precision = 18, scale = 6)
    private BigDecimal perccsllretorgpub;

    @Column(name = "UTILIZARSTFONTEPRECIFIC", length = 1)
    private String utilizarstfonteprecific;

    @Column(name = "IVAFONTESIMPLESNAC", precision = 8, scale = 4)
    private BigDecimal ivafontesimplesnac;

    @Column(name = "ALIQICMS1FONTESIMPLESNAC", precision = 8, scale = 4)
    private BigDecimal aliqicms1fontesimplesnac;

    @Column(name = "ALIQICMS2FONTESIMPLESNAC", precision = 8, scale = 4)
    private BigDecimal aliqicms2fontesimplesnac;

    @Column(name = "PERCBASEREDSTFONTESIMPLESNAC", precision = 8, scale = 4)
    private BigDecimal percbaseredstfontesimplesnac;

    @Column(name = "PAUTAFONTESIMPLESNAC", precision = 18, scale = 6)
    private BigDecimal pautafontesimplesnac;

    @Column(name = "CODFISCALSRENVIODEPFECH")
    private Integer codfiscalsrenviodepfech;

    @Column(name = "CODFISSRENVIODEPFECHINTERES")
    private Integer codfissrenviodepfechinteres;

    @Column(name = "CODFISSRRETORNODEPFECH")
    private Integer codfissrretornodepfech;

    @Column(name = "CODFISSRRETORNODEPFECHINTERES")
    private Integer codfissrretornodepfechinteres;

    @Column(name = "SITTRIBENVIODEPFEC", length = 3)
    private String sittribenviodepfec;

    @Column(name = "SITTRIBRETORNODEPFEC", length = 3)
    private String sittribretornodepfec;

    @Column(name = "AGREGAPISCOFINSST1", length = 1)
    private String agregapiscofinsst1;

    @Column(name = "AGREGAICMSISENCAOST1", length = 1)
    private String agregaicmsisencaost1;

    @Column(name = "GREGASUFRAMAST1", length = 1)
    private String gregasuframast1;

    @Column(name = "AGREGASUFRAMAST1", length = 1)
    private String agregasuframast1;

    @Column(name = "AGREGADESCST1", length = 1)
    private String agregadescst1;

    @Column(name = "CODICMTABPFBONIF", precision = 8, scale = 4)
    private BigDecimal codicmtabpfbonif;

    @Column(name = "CODICMTABBONIF", precision = 8, scale = 4)
    private BigDecimal codicmtabbonif;

    @Column(name = "CODFISCALSERV")
    private Integer codfiscalserv;

    @Column(name = "SITTRIBUTTRIANG", length = 3)
    private String sittributtriang;

    @Column(name = "CODFISCALTRANSFDEPFECHEST")
    private Integer codfiscaltransfdepfechest;

    @Column(name = "CODFISCALTRANSFDEPFECHINTEREST")
    private Integer codfiscaltransfdepfechinterest;

    @Column(name = "IVATRANSFVIRT", precision = 8, scale = 4)
    private BigDecimal ivatransfvirt;

    @Column(name = "ALIQICMS1TRANSFVIRT", precision = 8, scale = 4)
    private BigDecimal aliqicms1transfvirt;

    @Column(name = "ALIQICMS2TRANSFVIRT", precision = 8, scale = 4)
    private BigDecimal aliqicms2transfvirt;

    @Column(name = "PAUTATRANSFVIRT", precision = 8, scale = 4)
    private BigDecimal pautatransfvirt;

    @Column(name = "PERCBASEREDSTTRANSFVIRT", precision = 8, scale = 4)
    private BigDecimal percbaseredsttransfvirt;

    @Column(name = "CODICMTRANSFVIRT", precision = 8, scale = 4)
    private BigDecimal codicmtransfvirt;

    @Column(name = "PERDIFERENCIALTRANSFVIRT", precision = 8, scale = 4)
    private BigDecimal perdiferencialtransfvirt;

    @Column(name = "PERBASEREDTRANSFVIRTENT", precision = 8, scale = 4)
    private BigDecimal perbaseredtransfvirtent;

    @Column(name = "PERCBASEREDTRANFVIRTSAID", precision = 8, scale = 4)
    private BigDecimal percbaseredtranfvirtsaid;

    @Column(name = "SITTRIBUTTRANSFVIRT", length = 3)
    private String sittributtransfvirt;

    @Column(name = "SITTRIBUTTRANSVFVIRTENT", length = 3)
    private String sittributtransvfvirtent;

    @Column(name = "APLICAACRESPFJURIDICA", length = 1)
    private String aplicaacrespfjuridica;

    @Column(name = "CODFISCALISENTOSTRAMO")
    private Integer codfiscalisentostramo;

    @Column(name = "CODFISCALISENTOSTRAMOINTER")
    private Integer codfiscalisentostramointer;

    @Column(name = "SITTRIBUTISENTOSTRAMO", length = 3)
    private String sittributisentostramo;

    @Column(name = "CALCULAFECPCLIMEI", length = 1)
    private String calculafecpclimei;

    @Column(name = "CODFIGVENDATRIANGULAR")
    private Short codfigvendatriangular;

    @Column(name = "ACRESCALIQDESTICMSPART", length = 1)
    private String acrescaliqdesticmspart;

    @Column(name = "CONSIDERARCONTRIBICMSPART", length = 1)
    private String considerarcontribicmspart;

    @Column(name = "CODICMTABSIMPNASC", precision = 8, scale = 4)
    private BigDecimal codicmtabsimpnasc;

    @Column(name = "PERACRESCISMOSIMPNAC", precision = 18, scale = 6)
    private BigDecimal peracrescismosimpnac;

    @Column(name = "CODFISCSUFRAMAISENTICMSINTER")
    private Integer codfiscsuframaisenticmsinter;

    @Column(name = "CALCULARFECPISENTOIE", length = 1)
    private String calcularfecpisentoie;

    @Column(name = "CALCBASEICMSMEDIAENT", length = 1)
    private String calcbaseicmsmediaent;

    @Column(name = "CALCPARTISENTOICMS", length = 1)
    private String calcpartisentoicms;

    @Column(name = "USAALIQDESTPART", length = 1)
    private String usaaliqdestpart;

    @Column(name = "MEINAOCALCDIF", length = 1)
    private String meinaocalcdif;

    @Column(name = "SITTRIBUTMEI", length = 3)
    private String sittributmei;

    @Column(name = "CODFISCALISENTOSTCONT")
    private Integer codfiscalisentostcont;

    @Column(name = "CODFISCALISENTOSTCONTINTER")
    private Integer codfiscalisentostcontinter;

    @Column(name = "CODFISCALISENTOSTCONTINTERNASC")
    private Integer codfiscalisentostcontinternasc;

    @Column(name = "CODFISCALCONSUFINAL")
    private Integer codfiscalconsufinal;

    @Column(name = "CODFISCALCONSUFINALINTER")
    private Integer codfiscalconsufinalinter;

    @Column(name = "CODFISCALCONSUFINALINTERNASC")
    private Integer codfiscalconsufinalinternasc;

    @Column(name = "CALCULARFUNCEPISENTOIE", length = 1)
    private String calcularfuncepisentoie;

    @Column(name = "PERCPISRETORGPUBEST", precision = 18, scale = 6)
    private BigDecimal percpisretorgpubest;

    @Column(name = "PERCCOFINSRETORGPUBEST", precision = 18, scale = 6)
    private BigDecimal perccofinsretorgpubest;

    @Column(name = "PERCIRPJRETORGPUBEST", precision = 18, scale = 6)
    private BigDecimal percirpjretorgpubest;

    @Column(name = "PERCCSLLRETORGPUBEST", precision = 18, scale = 6)
    private BigDecimal perccsllretorgpubest;

    @Column(name = "PERCPISRETORGPUBMUN", precision = 18, scale = 6)
    private BigDecimal percpisretorgpubmun;

    @Column(name = "PERCCOFINSRETORGPUBMUN", precision = 18, scale = 6)
    private BigDecimal perccofinsretorgpubmun;

    @Column(name = "PERCIRPJRETORGPUBMUN", precision = 18, scale = 6)
    private BigDecimal percirpjretorgpubmun;

    @Column(name = "PERCCSLLRETORGPUBMUN", precision = 18, scale = 6)
    private BigDecimal perccsllretorgpubmun;

    @Column(name = "PERICMTRANSVIRTENT", precision = 18, scale = 6)
    private BigDecimal pericmtransvirtent;

    @Column(name = "CODICMTABINTERNAC", precision = 8, scale = 4)
    private BigDecimal codicmtabinternac;

    @Column(name = "CODICMINTERNAC", precision = 8, scale = 4)
    private BigDecimal codicminternac;

    @Column(name = "SITTRIBUTSIMPNACDEVFILNF", length = 3)
    private String sittributsimpnacdevfilnf;

    @Column(name = "IDENTIFICARTRIB", length = 200)
    private String identificartrib;

    @Column(name = "CODICMTABISENCAOICMS", precision = 8, scale = 4)
    private BigDecimal codicmtabisencaoicms;

    @Column(name = "PERCBASEREDST2TRANSF", precision = 18, scale = 6)
    private BigDecimal percbaseredst2transf;

    @Column(name = "PERCBASEREDST2TRANSFVIRT", precision = 18, scale = 6)
    private BigDecimal percbaseredst2transfvirt;

    @Column(name = "CODICMDIFER", precision = 18, scale = 6)
    private BigDecimal codicmdifer;

    @Column(name = "INDICECOMPBASESTMT", precision = 18, scale = 6)
    private BigDecimal indicecompbasestmt;

    @Column(name = "PERCREDBCSTCLISN", precision = 18, scale = 6)
    private BigDecimal percredbcstclisn;

    @Column(name = "APLICAMVABASEICMS", length = 1)
    private String aplicamvabaseicms;

    @Column(name = "INDICECOMPBASESTMG", precision = 18, scale = 6)
    private BigDecimal indicecompbasestmg;

    @Column(name = "CALCMEDIAPONDSTMG", length = 1)
    private String calcmediapondstmg;

    @Column(name = "GERAICMSLIVROFISCALTRANSFVIRT", length = 2)
    private String geraicmslivrofiscaltransfvirt;

    @Column(name = "GRUPONFTRIBUT")
    private Boolean gruponftribut;

    @Column(name = "SITTRIBUTCONSFINAL", length = 3)
    private String sittributconsfinal;

    @Column(name = "CALCULASTMT", length = 1)
    private String calculastmt;

    @Column(name = "SITTRIBUTTV7ORDEM", length = 3)
    private String sittributtv7ordem;

    @Column(name = "SITTRIBUTTV8ORDEM", length = 3)
    private String sittributtv8ordem;

    @Column(name = "UTILIZAMOTORCALCULO", length = 2)
    private String utilizamotorcalculo;

    @Column(name = "FORMULAPVENDA", length = 200)
    private String formulapvenda;

    @Column(name = "FORMULAPVENDATRANSF", length = 200)
    private String formulapvendatransf;

    @Column(name = "FORMULAPVENDATRANSFVIRT", length = 200)
    private String formulapvendatransfvirt;

    @Column(name = "PERDIFEREIMENTOICMSTV9", precision = 8, scale = 4)
    private BigDecimal perdifereimentoicmstv9;

    @Column(name = "SITTRIBUTBNFTV14", length = 3)
    private String sittributbnftv14;

    @Column(name = "BNFNAOCALCULAICMSTV14", length = 1)
    private String bnfnaocalculaicmstv14;

    @Column(name = "FORMULAFUNCEPICMS", length = 200)
    private String formulafuncepicms;

    @Column(name = "VLPAUTAICMSEST", precision = 8, scale = 4)
    private BigDecimal vlpautaicmsest;

    @Column(name = "FORMULAFUNCEPTRANSFRETIRA", length = 200)
    private String formulafunceptransfretira;

    @Column(name = "FORMULAFUNCEPTRANSFVIRT", length = 200)
    private String formulafunceptransfvirt;

    @Column(name = "AGREGARICMSNOVLTRANSF", length = 1)
    private String agregaricmsnovltransf;

    @Column(name = "SITTRIBUTTRANSFVIRREGESPSAI", length = 3)
    private String sittributtransfvirregespsai;

    @Column(name = "SITTRIBUTTRANSFVIRREGESPENT", length = 3)
    private String sittributtransfvirregespent;

    @Column(name = "SITTRIBUTTRANSFVIROPSAI", length = 3)
    private String sittributtransfviropsai;

    @Column(name = "SITTRIBUTTRANSFVIROPENT", length = 3)
    private String sittributtransfviropent;

    @Column(name = "SITTRIBUTTRANSFVIRSNSAI", length = 3)
    private String sittributtransfvirsnsai;

    @Column(name = "SITTRIBUTTRANSFVIRSNENT", length = 3)
    private String sittributtransfvirsnent;

    @Column(name = "CODFISCALTRANSFVIROPSAIEST")
    private Integer codfiscaltransfviropsaiest;

    @Column(name = "CODFISCALTRANSFVIROPENTEST")
    private Integer codfiscaltransfviropentest;

    @Column(name = "CODFISCALTRANSFVIRSNSAIEST")
    private Integer codfiscaltransfvirsnsaiest;

    @Column(name = "CODFISCALTRANSFVIRSNENTEST")
    private Integer codfiscaltransfvirsnentest;

    @Column(name = "CODFISCALTRANSFVIROPSAIINTER")
    private Integer codfiscaltransfviropsaiinter;

    @Column(name = "CODFISCALTRANSFVIROPENTINTER")
    private Integer codfiscaltransfviropentinter;

    @Column(name = "CODFISCALTRANSFVIRSNSAIINTER")
    private Integer codfiscaltransfvirsnsaiinter;

    @Column(name = "CODFISCALTRANSFVIRSNENTINTER")
    private Integer codfiscaltransfvirsnentinter;

    @Column(name = "SITTRIBUTMERCCONSIG", length = 3)
    private String sittributmercconsig;

    @Column(name = "PERCACRESCBENFFIS", precision = 18, scale = 6)
    private BigDecimal percacrescbenffis;

    @Column(name = "USAREGIMEESPISENREDICMS", length = 1)
    private String usaregimeespisenredicms;

    @Column(name = "ALIQICMSEFETIVO", precision = 18, scale = 6)
    private BigDecimal aliqicmsefetivo;

    @Column(name = "PERCREDICMSEFETIVO", precision = 18, scale = 6)
    private BigDecimal percredicmsefetivo;

    @Column(name = "FORUMAICMSEFETIVO", length = 200)
    private String forumaicmsefetivo;

    @Column(name = "FORMULAICMSEFETIVO", length = 100)
    private String formulaicmsefetivo;

    @Column(name = "SNNAOCALCDIF", length = 1)
    private String snnaocalcdif;

    @Column(name = "PRODRURALCALCDIFER", length = 1)
    private String prodruralcalcdifer;

    @Column(name = "SITTRIBUTPRODRURALCALCDIFER", length = 3)
    private String sittributprodruralcalcdifer;

    @Column(name = "SITTRIBUTBONIFICINT", length = 3)
    private String sittributbonificint;

    @Column(name = "ISENTAICMSBONIFICINT", length = 1)
    private String isentaicmsbonificint;

    @Column(name = "FORMULACMV", length = 200)
    private String formulacmv;

    @Column(name = "NAOPERSISTEIVAPCMOV", length = 1)
    private String naopersisteivapcmov;

    @Column(name = "CODFISCALDEVCONTAORDEM")
    private Integer codfiscaldevcontaordem;

    @Column(name = "CODFISCALDEVCONTORDINTERNASC")
    private Integer codfiscaldevcontordinternasc;

    @Column(name = "ISENTAICMSPARTUFDESTORGAOPUB", length = 1)
    private String isentaicmspartufdestorgaopub;

    @Column(name = "ZERARPERCBASEREDSTFONTEDANFE", length = 1)
    private String zerarpercbaseredstfontedanfe;

    @Column(name = "CODFISCALDEVCONTAORDEMINTER")
    private Integer codfiscaldevcontaordeminter;

    @Column(name = "PERDIFERIMENTOCMSTRANSFVIRT", precision = 8, scale = 4)
    private BigDecimal perdiferimentocmstransfvirt;

    @Column(name = "CODFISCALVENDAEXPINDIRETA")
    private Integer codfiscalvendaexpindireta;

    @Column(name = "CODFISCALVENDAEXPINDIRETAINTER")
    private Integer codfiscalvendaexpindiretainter;

    @Column(name = "SITTRIBUTVENDAEXPINDIRETA", length = 3)
    private String sittributvendaexpindireta;

    @Column(name = "ISENTAICMSSITTRIBUT041", length = 1)
    private String isentaicmssittribut041;

    @Column(name = "USAFORMULAPVENDAFILRET", length = 1)
    private String usaformulapvendafilret;

    @Column(name = "CODFISCALTRANSFVENDENT")
    private Integer codfiscaltransfvendent;

    @Column(name = "CODFISCALINTERTRANSFVENDENT")
    private Integer codfiscalintertransfvendent;

    @Column(name = "CODFISCALFILRETDEPTERCENTRADA")
    private Integer codfiscalfilretdeptercentrada;

    @Column(name = "CODFISCALFILRETDEPTERCENTRADAI")
    private Integer codfiscalfilretdeptercentradai;

    @Column(name = "NAOCALCULAFUNCEPAJUSTEESTOQUE", length = 1)
    private String naocalculafuncepajusteestoque;

    @Column(name = "USARMEDULTENTBASICMSNFSR", length = 1)
    private String usarmedultentbasicmsnfsr;

    @Column(name = "SOMARVALORDIFBCICMS", length = 1)
    private String somarvalordifbcicms;

    @Column(name = "SITTRIBUTSEMIMPOSTO_MC", length = 3)
    private String sittributsemimpostoMc;

    @Column(name = "PERDIFEREIMENTOICMS_MC", precision = 8, scale = 4)
    private BigDecimal perdifereimentoicmsMc;

    @Column(name = "REPLICADESONERACAOCOMERCIAL", length = 1)
    private String replicadesoneracaocomercial;

    @Column(name = "DESTACICMSSTANTERIOR", length = 1)
    private String destacicmsstanterior;

    @Column(name = "COMPARARBASEICMSMEDULTENTMES", length = 1)
    private String compararbaseicmsmedultentmes;

    @Column(name = "SITTRIBUTOPERLOGISTICOENTRADA", length = 3)
    private String sittributoperlogisticoentrada;

    @Column(name = "SITTRIBUTOPERLOGISTICOSAIDA", length = 3)
    private String sittributoperlogisticosaida;

    @Column(name = "APLICARDIFVALORFUNCEP", length = 1)
    private String aplicardifvalorfuncep;

    @Column(name = "USAVLSTMAIORPERCMINPMC", length = 1)
    private String usavlstmaiorpercminpmc;

    @Column(name = "PERVLSTMAIORPERCMINPMC", precision = 8, scale = 2)
    private BigDecimal pervlstmaiorpercminpmc;

    @Column(name = "DTALTERC5")
    private Instant dtalterc5;

    @Column(name = "CODFISCALESTNFEVENDA")
    private Integer codfiscalestnfevenda;

    @Column(name = "CODFISCALESTNFEVENDAINTER")
    private Integer codfiscalestnfevendainter;

    @Column(name = "CODFISCALESTNFEVENDAINTERNASC")
    private Integer codfiscalestnfevendainternasc;

    @Column(name = "CODFISCALDEVCLISUFRAMAEST")
    private Integer codfiscaldevclisuframaest;

    @Column(name = "CODFISCALDEVCLISUFRAMAINTE")
    private Integer codfiscaldevclisuframainte;

    @Column(name = "DESVINCULARFECPSTFUNCEPICMS", length = 1)
    private String desvincularfecpstfuncepicms;

    @Column(name = "UTILIZAICMTABFLEX", length = 1)
    private String utilizaicmtabflex;

    @Column(name = "FORMULAICMTAB", length = 200)
    private String formulaicmtab;

    @Column(name = "CODCOLECAOVAR")
    private Short codcolecaovar;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
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

    public BigDecimal getIvatab() {
        return ivatab;
    }

    public void setIvatab(BigDecimal ivatab) {
        this.ivatab = ivatab;
    }

    public BigDecimal getAliqicms1tab() {
        return aliqicms1tab;
    }

    public void setAliqicms1tab(BigDecimal aliqicms1tab) {
        this.aliqicms1tab = aliqicms1tab;
    }

    public BigDecimal getAliqicms2tab() {
        return aliqicms2tab;
    }

    public void setAliqicms2tab(BigDecimal aliqicms2tab) {
        this.aliqicms2tab = aliqicms2tab;
    }

    public BigDecimal getPerdestab() {
        return perdestab;
    }

    public void setPerdestab(BigDecimal perdestab) {
        this.perdestab = perdestab;
    }

    public BigDecimal getPerdesccusto() {
        return perdesccusto;
    }

    public void setPerdesccusto(BigDecimal perdesccusto) {
        this.perdesccusto = perdesccusto;
    }

    public BigDecimal getPauta() {
        return pauta;
    }

    public void setPauta(BigDecimal pauta) {
        this.pauta = pauta;
    }

    public BigDecimal getPautatab() {
        return pautatab;
    }

    public void setPautatab(BigDecimal pautatab) {
        this.pautatab = pautatab;
    }

    public String getSittribut() {
        return sittribut;
    }

    public void setSittribut(String sittribut) {
        this.sittribut = sittribut;
    }

    public BigDecimal getIndicest() {
        return indicest;
    }

    public void setIndicest(BigDecimal indicest) {
        this.indicest = indicest;
    }

    public BigDecimal getCodicm() {
        return codicm;
    }

    public void setCodicm(BigDecimal codicm) {
        this.codicm = codicm;
    }

    public BigDecimal getCodicmtab() {
        return codicmtab;
    }

    public void setCodicmtab(BigDecimal codicmtab) {
        this.codicmtab = codicmtab;
    }

    public BigDecimal getPercbasered() {
        return percbasered;
    }

    public void setPercbasered(BigDecimal percbasered) {
        this.percbasered = percbasered;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public BigDecimal getCodicmantecipado() {
        return codicmantecipado;
    }

    public void setCodicmantecipado(BigDecimal codicmantecipado) {
        this.codicmantecipado = codicmantecipado;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getCalcbcicmsnf() {
        return calcbcicmsnf;
    }

    public void setCalcbcicmsnf(String calcbcicmsnf) {
        this.calcbcicmsnf = calcbcicmsnf;
    }

    public Integer getCodfiscal() {
        return codfiscal;
    }

    public void setCodfiscal(Integer codfiscal) {
        this.codfiscal = codfiscal;
    }

    public Integer getCodfiscalinter() {
        return codfiscalinter;
    }

    public void setCodfiscalinter(Integer codfiscalinter) {
        this.codfiscalinter = codfiscalinter;
    }

    public BigDecimal getCodicmtransf() {
        return codicmtransf;
    }

    public void setCodicmtransf(BigDecimal codicmtransf) {
        this.codicmtransf = codicmtransf;
    }

    public String getSittributtransf() {
        return sittributtransf;
    }

    public void setSittributtransf(String sittributtransf) {
        this.sittributtransf = sittributtransf;
    }

    public String getCalcsttransf() {
        return calcsttransf;
    }

    public void setCalcsttransf(String calcsttransf) {
        this.calcsttransf = calcsttransf;
    }

    public BigDecimal getIvatransf() {
        return ivatransf;
    }

    public void setIvatransf(BigDecimal ivatransf) {
        this.ivatransf = ivatransf;
    }

    public BigDecimal getPautatransf() {
        return pautatransf;
    }

    public void setPautatransf(BigDecimal pautatransf) {
        this.pautatransf = pautatransf;
    }

    public BigDecimal getAliqicms1transf() {
        return aliqicms1transf;
    }

    public void setAliqicms1transf(BigDecimal aliqicms1transf) {
        this.aliqicms1transf = aliqicms1transf;
    }

    public BigDecimal getAliqicms2transf() {
        return aliqicms2transf;
    }

    public void setAliqicms2transf(BigDecimal aliqicms2transf) {
        this.aliqicms2transf = aliqicms2transf;
    }

    public BigDecimal getCodicmpf() {
        return codicmpf;
    }

    public void setCodicmpf(BigDecimal codicmpf) {
        this.codicmpf = codicmpf;
    }

    public BigDecimal getCodicmprodrural() {
        return codicmprodrural;
    }

    public void setCodicmprodrural(BigDecimal codicmprodrural) {
        this.codicmprodrural = codicmprodrural;
    }

    public BigDecimal getCodicmconsumidor() {
        return codicmconsumidor;
    }

    public void setCodicmconsumidor(BigDecimal codicmconsumidor) {
        this.codicmconsumidor = codicmconsumidor;
    }

    public BigDecimal getPeracrescismopf() {
        return peracrescismopf;
    }

    public void setPeracrescismopf(BigDecimal peracrescismopf) {
        this.peracrescismopf = peracrescismopf;
    }

    public String getCodecf() {
        return codecf;
    }

    public void setCodecf(String codecf) {
        this.codecf = codecf;
    }

    public Integer getCodfiscalpf() {
        return codfiscalpf;
    }

    public void setCodfiscalpf(Integer codfiscalpf) {
        this.codfiscalpf = codfiscalpf;
    }

    public Integer getCodfiscalinterpf() {
        return codfiscalinterpf;
    }

    public void setCodfiscalinterpf(Integer codfiscalinterpf) {
        this.codfiscalinterpf = codfiscalinterpf;
    }

    public Integer getCodfiscaldevcli() {
        return codfiscaldevcli;
    }

    public void setCodfiscaldevcli(Integer codfiscaldevcli) {
        this.codfiscaldevcli = codfiscaldevcli;
    }

    public Integer getCodfiscaldevcliinter() {
        return codfiscaldevcliinter;
    }

    public void setCodfiscaldevcliinter(Integer codfiscaldevcliinter) {
        this.codfiscaldevcliinter = codfiscaldevcliinter;
    }

    public Integer getCodfiscaltransf() {
        return codfiscaltransf;
    }

    public void setCodfiscaltransf(Integer codfiscaltransf) {
        this.codfiscaltransf = codfiscaltransf;
    }

    public Integer getCodfiscaltransfinter() {
        return codfiscaltransfinter;
    }

    public void setCodfiscaltransfinter(Integer codfiscaltransfinter) {
        this.codfiscaltransfinter = codfiscaltransfinter;
    }

    public Integer getCodfiscalbonific() {
        return codfiscalbonific;
    }

    public void setCodfiscalbonific(Integer codfiscalbonific) {
        this.codfiscalbonific = codfiscalbonific;
    }

    public Integer getCodfiscalbonificinter() {
        return codfiscalbonificinter;
    }

    public void setCodfiscalbonificinter(Integer codfiscalbonificinter) {
        this.codfiscalbonificinter = codfiscalbonificinter;
    }

    public Integer getCodfiscaldevclibonific() {
        return codfiscaldevclibonific;
    }

    public void setCodfiscaldevclibonific(Integer codfiscaldevclibonific) {
        this.codfiscaldevclibonific = codfiscaldevclibonific;
    }

    public Integer getCodfiscaldevclibonificinter() {
        return codfiscaldevclibonificinter;
    }

    public void setCodfiscaldevclibonificinter(Integer codfiscaldevclibonificinter) {
        this.codfiscaldevclibonificinter = codfiscaldevclibonificinter;
    }

    public Integer getCodfiscaldevcliprontaent() {
        return codfiscaldevcliprontaent;
    }

    public void setCodfiscaldevcliprontaent(Integer codfiscaldevcliprontaent) {
        this.codfiscaldevcliprontaent = codfiscaldevcliprontaent;
    }

    public Integer getCodfiscaldevcliprontaentinter() {
        return codfiscaldevcliprontaentinter;
    }

    public void setCodfiscaldevcliprontaentinter(Integer codfiscaldevcliprontaentinter) {
        this.codfiscaldevcliprontaentinter = codfiscaldevcliprontaentinter;
    }

    public Integer getCodfiscalprontaent() {
        return codfiscalprontaent;
    }

    public void setCodfiscalprontaent(Integer codfiscalprontaent) {
        this.codfiscalprontaent = codfiscalprontaent;
    }

    public Integer getCodfiscalprontaentinter() {
        return codfiscalprontaentinter;
    }

    public void setCodfiscalprontaentinter(Integer codfiscalprontaentinter) {
        this.codfiscalprontaentinter = codfiscalprontaentinter;
    }

    public BigDecimal getIvafonte() {
        return ivafonte;
    }

    public void setIvafonte(BigDecimal ivafonte) {
        this.ivafonte = ivafonte;
    }

    public BigDecimal getAliqicms1fonte() {
        return aliqicms1fonte;
    }

    public void setAliqicms1fonte(BigDecimal aliqicms1fonte) {
        this.aliqicms1fonte = aliqicms1fonte;
    }

    public BigDecimal getAliqicms2fonte() {
        return aliqicms2fonte;
    }

    public void setAliqicms2fonte(BigDecimal aliqicms2fonte) {
        this.aliqicms2fonte = aliqicms2fonte;
    }

    public String getObspf() {
        return obspf;
    }

    public void setObspf(String obspf) {
        this.obspf = obspf;
    }

    public String getCalcbaseredicmstransf() {
        return calcbaseredicmstransf;
    }

    public void setCalcbaseredicmstransf(String calcbaseredicmstransf) {
        this.calcbaseredicmstransf = calcbaseredicmstransf;
    }

    public BigDecimal getPerdescsuframa() {
        return perdescsuframa;
    }

    public void setPerdescsuframa(BigDecimal perdescsuframa) {
        this.perdescsuframa = perdescsuframa;
    }

    public String getSittributtransfent() {
        return sittributtransfent;
    }

    public void setSittributtransfent(String sittributtransfent) {
        this.sittributtransfent = sittributtransfent;
    }

    public BigDecimal getPerbaseredtransfent() {
        return perbaseredtransfent;
    }

    public void setPerbaseredtransfent(BigDecimal perbaseredtransfent) {
        this.perbaseredtransfent = perbaseredtransfent;
    }

    public Integer getCodfiscalinternasc() {
        return codfiscalinternasc;
    }

    public void setCodfiscalinternasc(Integer codfiscalinternasc) {
        this.codfiscalinternasc = codfiscalinternasc;
    }

    public Integer getCodfiscalinternascpf() {
        return codfiscalinternascpf;
    }

    public void setCodfiscalinternascpf(Integer codfiscalinternascpf) {
        this.codfiscalinternascpf = codfiscalinternascpf;
    }

    public Integer getCodfiscaldevcliinternasc() {
        return codfiscaldevcliinternasc;
    }

    public void setCodfiscaldevcliinternasc(Integer codfiscaldevcliinternasc) {
        this.codfiscaldevcliinternasc = codfiscaldevcliinternasc;
    }

    public Integer getCodfiscaltransfinternasc() {
        return codfiscaltransfinternasc;
    }

    public void setCodfiscaltransfinternasc(Integer codfiscaltransfinternasc) {
        this.codfiscaltransfinternasc = codfiscaltransfinternasc;
    }

    public Integer getCodfiscalbonificinternasc() {
        return codfiscalbonificinternasc;
    }

    public void setCodfiscalbonificinternasc(Integer codfiscalbonificinternasc) {
        this.codfiscalbonificinternasc = codfiscalbonificinternasc;
    }

    public Integer getCodfiscaldevcliboninternasc() {
        return codfiscaldevcliboninternasc;
    }

    public void setCodfiscaldevcliboninternasc(Integer codfiscaldevcliboninternasc) {
        this.codfiscaldevcliboninternasc = codfiscaldevcliboninternasc;
    }

    public Integer getCodfiscaldevcliproentinternasc() {
        return codfiscaldevcliproentinternasc;
    }

    public void setCodfiscaldevcliproentinternasc(Integer codfiscaldevcliproentinternasc) {
        this.codfiscaldevcliproentinternasc = codfiscaldevcliproentinternasc;
    }

    public Integer getCodfiscalprontaentinternasc() {
        return codfiscalprontaentinternasc;
    }

    public void setCodfiscalprontaentinternasc(Integer codfiscalprontaentinternasc) {
        this.codfiscalprontaentinternasc = codfiscalprontaentinternasc;
    }

    public String getSittributpf() {
        return sittributpf;
    }

    public void setSittributpf(String sittributpf) {
        this.sittributpf = sittributpf;
    }

    public BigDecimal getPerdescicmisencao() {
        return perdescicmisencao;
    }

    public void setPerdescicmisencao(BigDecimal perdescicmisencao) {
        this.perdescicmisencao = perdescicmisencao;
    }

    public Integer getCodfuncultalter() {
        return codfuncultalter;
    }

    public void setCodfuncultalter(Integer codfuncultalter) {
        this.codfuncultalter = codfuncultalter;
    }

    public LocalDate getDtultalter() {
        return dtultalter;
    }

    public void setDtultalter(LocalDate dtultalter) {
        this.dtultalter = dtultalter;
    }

    public Long getCodfiscalvendaconsig() {
        return codfiscalvendaconsig;
    }

    public void setCodfiscalvendaconsig(Long codfiscalvendaconsig) {
        this.codfiscalvendaconsig = codfiscalvendaconsig;
    }

    public Long getCodfiscalvendaconsiginter() {
        return codfiscalvendaconsiginter;
    }

    public void setCodfiscalvendaconsiginter(Long codfiscalvendaconsiginter) {
        this.codfiscalvendaconsiginter = codfiscalvendaconsiginter;
    }

    public Long getCodfiscalvendaconsiginternasc() {
        return codfiscalvendaconsiginternasc;
    }

    public void setCodfiscalvendaconsiginternasc(Long codfiscalvendaconsiginternasc) {
        this.codfiscalvendaconsiginternasc = codfiscalvendaconsiginternasc;
    }

    public String getObstransf() {
        return obstransf;
    }

    public void setObstransf(String obstransf) {
        this.obstransf = obstransf;
    }

    public Integer getCodfiscalvendaentfut() {
        return codfiscalvendaentfut;
    }

    public void setCodfiscalvendaentfut(Integer codfiscalvendaentfut) {
        this.codfiscalvendaentfut = codfiscalvendaentfut;
    }

    public Integer getCodfiscalvendaentfutinter() {
        return codfiscalvendaentfutinter;
    }

    public void setCodfiscalvendaentfutinter(Integer codfiscalvendaentfutinter) {
        this.codfiscalvendaentfutinter = codfiscalvendaentfutinter;
    }

    public Integer getCodfiscalsimpentfut() {
        return codfiscalsimpentfut;
    }

    public void setCodfiscalsimpentfut(Integer codfiscalsimpentfut) {
        this.codfiscalsimpentfut = codfiscalsimpentfut;
    }

    public Integer getCodfiscalsimpentfutinter() {
        return codfiscalsimpentfutinter;
    }

    public void setCodfiscalsimpentfutinter(Integer codfiscalsimpentfutinter) {
        this.codfiscalsimpentfutinter = codfiscalsimpentfutinter;
    }

    public Integer getCodfiscalmercconsig() {
        return codfiscalmercconsig;
    }

    public void setCodfiscalmercconsig(Integer codfiscalmercconsig) {
        this.codfiscalmercconsig = codfiscalmercconsig;
    }

    public Integer getCodfiscalmercconsiginter() {
        return codfiscalmercconsiginter;
    }

    public void setCodfiscalmercconsiginter(Integer codfiscalmercconsiginter) {
        this.codfiscalmercconsiginter = codfiscalmercconsiginter;
    }

    public Integer getCodfiscalmercconsiginternasc() {
        return codfiscalmercconsiginternasc;
    }

    public void setCodfiscalmercconsiginternasc(Integer codfiscalmercconsiginternasc) {
        this.codfiscalmercconsiginternasc = codfiscalmercconsiginternasc;
    }

    public BigDecimal getPercbaseredconsumidor() {
        return percbaseredconsumidor;
    }

    public void setPercbaseredconsumidor(BigDecimal percbaseredconsumidor) {
        this.percbaseredconsumidor = percbaseredconsumidor;
    }

    public String getObs2() {
        return obs2;
    }

    public void setObs2(String obs2) {
        this.obs2 = obs2;
    }

    public String getObspf2() {
        return obspf2;
    }

    public void setObspf2(String obspf2) {
        this.obspf2 = obspf2;
    }

    public BigDecimal getPerbaserednrpa() {
        return perbaserednrpa;
    }

    public void setPerbaserednrpa(BigDecimal perbaserednrpa) {
        this.perbaserednrpa = perbaserednrpa;
    }

    public String getSittributnrpa() {
        return sittributnrpa;
    }

    public void setSittributnrpa(String sittributnrpa) {
        this.sittributnrpa = sittributnrpa;
    }

    public BigDecimal getCodicmnrpa() {
        return codicmnrpa;
    }

    public void setCodicmnrpa(BigDecimal codicmnrpa) {
        this.codicmnrpa = codicmnrpa;
    }

    public BigDecimal getCodicmtabnrpa() {
        return codicmtabnrpa;
    }

    public void setCodicmtabnrpa(BigDecimal codicmtabnrpa) {
        this.codicmtabnrpa = codicmtabnrpa;
    }

    public BigDecimal getPeracrescimonrpa() {
        return peracrescimonrpa;
    }

    public void setPeracrescimonrpa(BigDecimal peracrescimonrpa) {
        this.peracrescimonrpa = peracrescimonrpa;
    }

    public Integer getCodfiscaldevtransf() {
        return codfiscaldevtransf;
    }

    public void setCodfiscaldevtransf(Integer codfiscaldevtransf) {
        this.codfiscaldevtransf = codfiscaldevtransf;
    }

    public Integer getCodfiscaldevtransfinter() {
        return codfiscaldevtransfinter;
    }

    public void setCodfiscaldevtransfinter(Integer codfiscaldevtransfinter) {
        this.codfiscaldevtransfinter = codfiscaldevtransfinter;
    }

    public String getUtilizapercbaseredpf() {
        return utilizapercbaseredpf;
    }

    public void setUtilizapercbaseredpf(String utilizapercbaseredpf) {
        this.utilizapercbaseredpf = utilizapercbaseredpf;
    }

    public String getUsaredbaseicmsfontest() {
        return usaredbaseicmsfontest;
    }

    public void setUsaredbaseicmsfontest(String usaredbaseicmsfontest) {
        this.usaredbaseicmsfontest = usaredbaseicmsfontest;
    }

    public String getAplicaacrescpjisenta() {
        return aplicaacrescpjisenta;
    }

    public void setAplicaacrescpjisenta(String aplicaacrescpjisenta) {
        this.aplicaacrescpjisenta = aplicaacrescpjisenta;
    }

    public String getTipocalculognre() {
        return tipocalculognre;
    }

    public void setTipocalculognre(String tipocalculognre) {
        this.tipocalculognre = tipocalculognre;
    }

    public String getTipocalculognretab() {
        return tipocalculognretab;
    }

    public void setTipocalculognretab(String tipocalculognretab) {
        this.tipocalculognretab = tipocalculognretab;
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

    public BigDecimal getPercbaseredsttransf() {
        return percbaseredsttransf;
    }

    public void setPercbaseredsttransf(BigDecimal percbaseredsttransf) {
        this.percbaseredsttransf = percbaseredsttransf;
    }

    public Integer getCodfiscalvendaprontaent() {
        return codfiscalvendaprontaent;
    }

    public void setCodfiscalvendaprontaent(Integer codfiscalvendaprontaent) {
        this.codfiscalvendaprontaent = codfiscalvendaprontaent;
    }

    public Integer getCodfiscalvendaprontaentinter() {
        return codfiscalvendaprontaentinter;
    }

    public void setCodfiscalvendaprontaentinter(Integer codfiscalvendaprontaentinter) {
        this.codfiscalvendaprontaentinter = codfiscalvendaprontaentinter;
    }

    public BigDecimal getAliqiss() {
        return aliqiss;
    }

    public void setAliqiss(BigDecimal aliqiss) {
        this.aliqiss = aliqiss;
    }

    public Integer getCodfiscaldevmercconsig() {
        return codfiscaldevmercconsig;
    }

    public void setCodfiscaldevmercconsig(Integer codfiscaldevmercconsig) {
        this.codfiscaldevmercconsig = codfiscaldevmercconsig;
    }

    public Integer getCodfiscaldevmercconsiginter() {
        return codfiscaldevmercconsiginter;
    }

    public void setCodfiscaldevmercconsiginter(Integer codfiscaldevmercconsiginter) {
        this.codfiscaldevmercconsiginter = codfiscaldevmercconsiginter;
    }

    public BigDecimal getPerdescrepasse() {
        return perdescrepasse;
    }

    public void setPerdescrepasse(BigDecimal perdescrepasse) {
        this.perdescrepasse = perdescrepasse;
    }

    public BigDecimal getCodicmtabpf() {
        return codicmtabpf;
    }

    public void setCodicmtabpf(BigDecimal codicmtabpf) {
        this.codicmtabpf = codicmtabpf;
    }

    public Integer getCodfiscalisentost() {
        return codfiscalisentost;
    }

    public void setCodfiscalisentost(Integer codfiscalisentost) {
        this.codfiscalisentost = codfiscalisentost;
    }

    public Integer getCodfiscalisentostinter() {
        return codfiscalisentostinter;
    }

    public void setCodfiscalisentostinter(Integer codfiscalisentostinter) {
        this.codfiscalisentostinter = codfiscalisentostinter;
    }

    public Integer getCodfiscalisentostinternasc() {
        return codfiscalisentostinternasc;
    }

    public void setCodfiscalisentostinternasc(Integer codfiscalisentostinternasc) {
        this.codfiscalisentostinternasc = codfiscalisentostinternasc;
    }

    public String getSittributisentost() {
        return sittributisentost;
    }

    public void setSittributisentost(String sittributisentost) {
        this.sittributisentost = sittributisentost;
    }

    public BigDecimal getPercacrescbasepfest() {
        return percacrescbasepfest;
    }

    public void setPercacrescbasepfest(BigDecimal percacrescbasepfest) {
        this.percacrescbasepfest = percacrescbasepfest;
    }

    public Integer getCodfiscaldevisentost() {
        return codfiscaldevisentost;
    }

    public void setCodfiscaldevisentost(Integer codfiscaldevisentost) {
        this.codfiscaldevisentost = codfiscaldevisentost;
    }

    public Integer getCodfiscaldevisentostinter() {
        return codfiscaldevisentostinter;
    }

    public void setCodfiscaldevisentostinter(Integer codfiscaldevisentostinter) {
        this.codfiscaldevisentostinter = codfiscaldevisentostinter;
    }

    public Integer getCodfiscaldevisentostinternasc() {
        return codfiscaldevisentostinternasc;
    }

    public void setCodfiscaldevisentostinternasc(Integer codfiscaldevisentostinternasc) {
        this.codfiscaldevisentostinternasc = codfiscaldevisentostinternasc;
    }

    public String getUsapercbaseredhosp() {
        return usapercbaseredhosp;
    }

    public void setUsapercbaseredhosp(String usapercbaseredhosp) {
        this.usapercbaseredhosp = usapercbaseredhosp;
    }

    public String getUsapercbaseredfarma() {
        return usapercbaseredfarma;
    }

    public void setUsapercbaseredfarma(String usapercbaseredfarma) {
        this.usapercbaseredfarma = usapercbaseredfarma;
    }

    public String getUsapercbaseredopf() {
        return usapercbaseredopf;
    }

    public void setUsapercbaseredopf(String usapercbaseredopf) {
        this.usapercbaseredopf = usapercbaseredopf;
    }

    public String getUsapercbaseredope() {
        return usapercbaseredope;
    }

    public void setUsapercbaseredope(String usapercbaseredope) {
        this.usapercbaseredope = usapercbaseredope;
    }

    public String getUsapercbaseredopm() {
        return usapercbaseredopm;
    }

    public void setUsapercbaseredopm(String usapercbaseredopm) {
        this.usapercbaseredopm = usapercbaseredopm;
    }

    public String getUsapercbaseredassoc() {
        return usapercbaseredassoc;
    }

    public void setUsapercbaseredassoc(String usapercbaseredassoc) {
        this.usapercbaseredassoc = usapercbaseredassoc;
    }

    public String getUsapercbasereddist() {
        return usapercbasereddist;
    }

    public void setUsapercbasereddist(String usapercbasereddist) {
        this.usapercbasereddist = usapercbasereddist;
    }

    public BigDecimal getPerdescpissuframa() {
        return perdescpissuframa;
    }

    public void setPerdescpissuframa(BigDecimal perdescpissuframa) {
        this.perdescpissuframa = perdescpissuframa;
    }

    public String getUsapercbaseredmedico() {
        return usapercbaseredmedico;
    }

    public void setUsapercbaseredmedico(String usapercbaseredmedico) {
        this.usapercbaseredmedico = usapercbaseredmedico;
    }

    public Long getNumseqatu() {
        return numseqatu;
    }

    public void setNumseqatu(Long numseqatu) {
        this.numseqatu = numseqatu;
    }

    public Integer getCodfiscaltransfent() {
        return codfiscaltransfent;
    }

    public void setCodfiscaltransfent(Integer codfiscaltransfent) {
        this.codfiscaltransfent = codfiscaltransfent;
    }

    public Integer getCodfiscaltransfentinter() {
        return codfiscaltransfentinter;
    }

    public void setCodfiscaltransfentinter(Integer codfiscaltransfentinter) {
        this.codfiscaltransfentinter = codfiscaltransfentinter;
    }

    public String getUsavalorultentbasest() {
        return usavalorultentbasest;
    }

    public void setUsavalorultentbasest(String usavalorultentbasest) {
        this.usavalorultentbasest = usavalorultentbasest;
    }

    public Integer getCodfiscaltroca() {
        return codfiscaltroca;
    }

    public void setCodfiscaltroca(Integer codfiscaltroca) {
        this.codfiscaltroca = codfiscaltroca;
    }

    public Integer getCodfiscaltrocainter() {
        return codfiscaltrocainter;
    }

    public void setCodfiscaltrocainter(Integer codfiscaltrocainter) {
        this.codfiscaltrocainter = codfiscaltrocainter;
    }

    public Integer getCodfiscaltrocainternasc() {
        return codfiscaltrocainternasc;
    }

    public void setCodfiscaltrocainternasc(Integer codfiscaltrocainternasc) {
        this.codfiscaltrocainternasc = codfiscaltrocainternasc;
    }

    public Integer getCodfiscalsrestsr() {
        return codfiscalsrestsr;
    }

    public void setCodfiscalsrestsr(Integer codfiscalsrestsr) {
        this.codfiscalsrestsr = codfiscalsrestsr;
    }

    public Integer getCodfiscalsrinte() {
        return codfiscalsrinte;
    }

    public void setCodfiscalsrinte(Integer codfiscalsrinte) {
        this.codfiscalsrinte = codfiscalsrinte;
    }

    public Integer getCodfiscalsrext() {
        return codfiscalsrext;
    }

    public void setCodfiscalsrext(Integer codfiscalsrext) {
        this.codfiscalsrext = codfiscalsrext;
    }

    public BigDecimal getAliqstsaida() {
        return aliqstsaida;
    }

    public void setAliqstsaida(BigDecimal aliqstsaida) {
        this.aliqstsaida = aliqstsaida;
    }

    public BigDecimal getAliqstsaidapf() {
        return aliqstsaidapf;
    }

    public void setAliqstsaidapf(BigDecimal aliqstsaidapf) {
        this.aliqstsaidapf = aliqstsaidapf;
    }

    public BigDecimal getPercivamex() {
        return percivamex;
    }

    public void setPercivamex(BigDecimal percivamex) {
        this.percivamex = percivamex;
    }

    public String getMensagemnrpa() {
        return mensagemnrpa;
    }

    public void setMensagemnrpa(String mensagemnrpa) {
        this.mensagemnrpa = mensagemnrpa;
    }

    public BigDecimal getPercbasecalcrepasse() {
        return percbasecalcrepasse;
    }

    public void setPercbasecalcrepasse(BigDecimal percbasecalcrepasse) {
        this.percbasecalcrepasse = percbasecalcrepasse;
    }

    public BigDecimal getPercbaseredtranfsaid() {
        return percbaseredtranfsaid;
    }

    public void setPercbaseredtranfsaid(BigDecimal percbaseredtranfsaid) {
        this.percbaseredtranfsaid = percbaseredtranfsaid;
    }

    public String getDescicmsreduzbaseicms() {
        return descicmsreduzbaseicms;
    }

    public void setDescicmsreduzbaseicms(String descicmsreduzbaseicms) {
        this.descicmsreduzbaseicms = descicmsreduzbaseicms;
    }

    public BigDecimal getPercagregadorst() {
        return percagregadorst;
    }

    public void setPercagregadorst(BigDecimal percagregadorst) {
        this.percagregadorst = percagregadorst;
    }

    public BigDecimal getPerpautaicms() {
        return perpautaicms;
    }

    public void setPerpautaicms(BigDecimal perpautaicms) {
        this.perpautaicms = perpautaicms;
    }

    public BigDecimal getPerpautaicmsinter() {
        return perpautaicmsinter;
    }

    public void setPerpautaicmsinter(BigDecimal perpautaicmsinter) {
        this.perpautaicmsinter = perpautaicmsinter;
    }

    public BigDecimal getPercbaseredadicional() {
        return percbaseredadicional;
    }

    public void setPercbaseredadicional(BigDecimal percbaseredadicional) {
        this.percbaseredadicional = percbaseredadicional;
    }

    public BigDecimal getPercbaseredadicionalinter() {
        return percbaseredadicionalinter;
    }

    public void setPercbaseredadicionalinter(BigDecimal percbaseredadicionalinter) {
        this.percbaseredadicionalinter = percbaseredadicionalinter;
    }

    public String getUsacfopbnfparabrinde() {
        return usacfopbnfparabrinde;
    }

    public void setUsacfopbnfparabrinde(String usacfopbnfparabrinde) {
        this.usacfopbnfparabrinde = usacfopbnfparabrinde;
    }

    public BigDecimal getPerdesccustotransf() {
        return perdesccustotransf;
    }

    public void setPerdesccustotransf(BigDecimal perdesccustotransf) {
        this.perdesccustotransf = perdesccustotransf;
    }

    public String getPagtonomedocliente() {
        return pagtonomedocliente;
    }

    public void setPagtonomedocliente(String pagtonomedocliente) {
        this.pagtonomedocliente = pagtonomedocliente;
    }

    public Integer getCodfiscaltransff() {
        return codfiscaltransff;
    }

    public void setCodfiscaltransff(Integer codfiscaltransff) {
        this.codfiscaltransff = codfiscaltransff;
    }

    public Integer getCodfiscaltransffinter() {
        return codfiscaltransffinter;
    }

    public void setCodfiscaltransffinter(Integer codfiscaltransffinter) {
        this.codfiscaltransffinter = codfiscaltransffinter;
    }

    public Integer getCodfiscaltransffinternasc() {
        return codfiscaltransffinternasc;
    }

    public void setCodfiscaltransffinternasc(Integer codfiscaltransffinternasc) {
        this.codfiscaltransffinternasc = codfiscaltransffinternasc;
    }

    public Integer getCodfiscaldevtransfentinter() {
        return codfiscaldevtransfentinter;
    }

    public void setCodfiscaldevtransfentinter(Integer codfiscaldevtransfentinter) {
        this.codfiscaldevtransfentinter = codfiscaldevtransfentinter;
    }

    public Integer getCodfiscaldevtransfent() {
        return codfiscaldevtransfent;
    }

    public void setCodfiscaldevtransfent(Integer codfiscaldevtransfent) {
        this.codfiscaldevtransfent = codfiscaldevtransfent;
    }

    public String getUsavalorultentbasest2() {
        return usavalorultentbasest2;
    }

    public void setUsavalorultentbasest2(String usavalorultentbasest2) {
        this.usavalorultentbasest2 = usavalorultentbasest2;
    }

    public String getObstributGnre() {
        return obstributGnre;
    }

    public void setObstributGnre(String obstributGnre) {
        this.obstributGnre = obstributGnre;
    }

    public String getMostrarpvendasemst() {
        return mostrarpvendasemst;
    }

    public void setMostrarpvendasemst(String mostrarpvendasemst) {
        this.mostrarpvendasemst = mostrarpvendasemst;
    }

    public BigDecimal getPercdifaliquotas() {
        return percdifaliquotas;
    }

    public void setPercdifaliquotas(BigDecimal percdifaliquotas) {
        this.percdifaliquotas = percdifaliquotas;
    }

    public String getObssuframa() {
        return obssuframa;
    }

    public void setObssuframa(String obssuframa) {
        this.obssuframa = obssuframa;
    }

    public Integer getCodfiscalbrokerent() {
        return codfiscalbrokerent;
    }

    public void setCodfiscalbrokerent(Integer codfiscalbrokerent) {
        this.codfiscalbrokerent = codfiscalbrokerent;
    }

    public Integer getCodfiscalbrokersaid() {
        return codfiscalbrokersaid;
    }

    public void setCodfiscalbrokersaid(Integer codfiscalbrokersaid) {
        this.codfiscalbrokersaid = codfiscalbrokersaid;
    }

    public Integer getCodfiscalbrokerdevent() {
        return codfiscalbrokerdevent;
    }

    public void setCodfiscalbrokerdevent(Integer codfiscalbrokerdevent) {
        this.codfiscalbrokerdevent = codfiscalbrokerdevent;
    }

    public Integer getCodfiscalbrokerdevsaid() {
        return codfiscalbrokerdevsaid;
    }

    public void setCodfiscalbrokerdevsaid(Integer codfiscalbrokerdevsaid) {
        this.codfiscalbrokerdevsaid = codfiscalbrokerdevsaid;
    }

    public String getCalcularicmssittribut060() {
        return calcularicmssittribut060;
    }

    public void setCalcularicmssittribut060(String calcularicmssittribut060) {
        this.calcularicmssittribut060 = calcularicmssittribut060;
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

    public Integer getCodfiscaltv9() {
        return codfiscaltv9;
    }

    public void setCodfiscaltv9(Integer codfiscaltv9) {
        this.codfiscaltv9 = codfiscaltv9;
    }

    public Integer getCodfiscalintertv9() {
        return codfiscalintertv9;
    }

    public void setCodfiscalintertv9(Integer codfiscalintertv9) {
        this.codfiscalintertv9 = codfiscalintertv9;
    }

    public Integer getCodfiscalinternasctv9() {
        return codfiscalinternasctv9;
    }

    public void setCodfiscalinternasctv9(Integer codfiscalinternasctv9) {
        this.codfiscalinternasctv9 = codfiscalinternasctv9;
    }

    public BigDecimal getPeracrescimofuncep() {
        return peracrescimofuncep;
    }

    public void setPeracrescimofuncep(BigDecimal peracrescimofuncep) {
        this.peracrescimofuncep = peracrescimofuncep;
    }

    public BigDecimal getPeracrescimocusto() {
        return peracrescimocusto;
    }

    public void setPeracrescimocusto(BigDecimal peracrescimocusto) {
        this.peracrescimocusto = peracrescimocusto;
    }

    public Integer getCodfiscalconsig() {
        return codfiscalconsig;
    }

    public void setCodfiscalconsig(Integer codfiscalconsig) {
        this.codfiscalconsig = codfiscalconsig;
    }

    public Integer getCodfiscalconsiginter() {
        return codfiscalconsiginter;
    }

    public void setCodfiscalconsiginter(Integer codfiscalconsiginter) {
        this.codfiscalconsiginter = codfiscalconsiginter;
    }

    public Integer getCodfiscalconsiginternac() {
        return codfiscalconsiginternac;
    }

    public void setCodfiscalconsiginternac(Integer codfiscalconsiginternac) {
        this.codfiscalconsiginternac = codfiscalconsiginternac;
    }

    public BigDecimal getPeracrescimopf() {
        return peracrescimopf;
    }

    public void setPeracrescimopf(BigDecimal peracrescimopf) {
        this.peracrescimopf = peracrescimopf;
    }

    public BigDecimal getPercacrescbasepfint() {
        return percacrescbasepfint;
    }

    public void setPercacrescbasepfint(BigDecimal percacrescbasepfint) {
        this.percacrescbasepfint = percacrescbasepfint;
    }

    public Integer getCodfiscaltransfsaidaest() {
        return codfiscaltransfsaidaest;
    }

    public void setCodfiscaltransfsaidaest(Integer codfiscaltransfsaidaest) {
        this.codfiscaltransfsaidaest = codfiscaltransfsaidaest;
    }

    public Integer getCodfiscaltransfsaidaint() {
        return codfiscaltransfsaidaint;
    }

    public void setCodfiscaltransfsaidaint(Integer codfiscaltransfsaidaint) {
        this.codfiscaltransfsaidaint = codfiscaltransfsaidaint;
    }

    public String getPagtonomedoremetente() {
        return pagtonomedoremetente;
    }

    public void setPagtonomedoremetente(String pagtonomedoremetente) {
        this.pagtonomedoremetente = pagtonomedoremetente;
    }

    public BigDecimal getPercdifaliquotastab() {
        return percdifaliquotastab;
    }

    public void setPercdifaliquotastab(BigDecimal percdifaliquotastab) {
        this.percdifaliquotastab = percdifaliquotastab;
    }

    public BigDecimal getPercicmscomplementar() {
        return percicmscomplementar;
    }

    public void setPercicmscomplementar(BigDecimal percicmscomplementar) {
        this.percicmscomplementar = percicmscomplementar;
    }

    public BigDecimal getPercacrepfvlacimapermitido() {
        return percacrepfvlacimapermitido;
    }

    public void setPercacrepfvlacimapermitido(BigDecimal percacrepfvlacimapermitido) {
        this.percacrepfvlacimapermitido = percacrepfvlacimapermitido;
    }

    public BigDecimal getAliquotaicmsenttransf() {
        return aliquotaicmsenttransf;
    }

    public void setAliquotaicmsenttransf(BigDecimal aliquotaicmsenttransf) {
        this.aliquotaicmsenttransf = aliquotaicmsenttransf;
    }

    public Integer getCodfiscaltriangular() {
        return codfiscaltriangular;
    }

    public void setCodfiscaltriangular(Integer codfiscaltriangular) {
        this.codfiscaltriangular = codfiscaltriangular;
    }

    public Integer getCodfiscaltriangularinter() {
        return codfiscaltriangularinter;
    }

    public void setCodfiscaltriangularinter(Integer codfiscaltriangularinter) {
        this.codfiscaltriangularinter = codfiscaltriangularinter;
    }

    public Integer getCodfiscaltriangularinternasc() {
        return codfiscaltriangularinternasc;
    }

    public void setCodfiscaltriangularinternasc(Integer codfiscaltriangularinternasc) {
        this.codfiscaltriangularinternasc = codfiscaltriangularinternasc;
    }

    public String getObsInformativo() {
        return obsInformativo;
    }

    public void setObsInformativo(String obsInformativo) {
        this.obsInformativo = obsInformativo;
    }

    public String getCodecffuncep() {
        return codecffuncep;
    }

    public void setCodecffuncep(String codecffuncep) {
        this.codecffuncep = codecffuncep;
    }

    public BigDecimal getVlpautasemiva() {
        return vlpautasemiva;
    }

    public void setVlpautasemiva(BigDecimal vlpautasemiva) {
        this.vlpautasemiva = vlpautasemiva;
    }

    public BigDecimal getPercivapauta() {
        return percivapauta;
    }

    public void setPercivapauta(BigDecimal percivapauta) {
        this.percivapauta = percivapauta;
    }

    public String getUsapautasemiva() {
        return usapautasemiva;
    }

    public void setUsapautasemiva(String usapautasemiva) {
        this.usapautasemiva = usapautasemiva;
    }

    public Integer getCodfiscalcontaordem() {
        return codfiscalcontaordem;
    }

    public void setCodfiscalcontaordem(Integer codfiscalcontaordem) {
        this.codfiscalcontaordem = codfiscalcontaordem;
    }

    public Integer getCodfiscalcontaordeminter() {
        return codfiscalcontaordeminter;
    }

    public void setCodfiscalcontaordeminter(Integer codfiscalcontaordeminter) {
        this.codfiscalcontaordeminter = codfiscalcontaordeminter;
    }

    public Integer getCodfiscalcontaordemsimpent() {
        return codfiscalcontaordemsimpent;
    }

    public void setCodfiscalcontaordemsimpent(Integer codfiscalcontaordemsimpent) {
        this.codfiscalcontaordemsimpent = codfiscalcontaordemsimpent;
    }

    public Integer getCodfiscalcontaordemsimpentinte() {
        return codfiscalcontaordemsimpentinte;
    }

    public void setCodfiscalcontaordemsimpentinte(Integer codfiscalcontaordemsimpentinte) {
        this.codfiscalcontaordemsimpentinte = codfiscalcontaordemsimpentinte;
    }

    public String getZerarbaseicmsorgpubsuframa() {
        return zerarbaseicmsorgpubsuframa;
    }

    public void setZerarbaseicmsorgpubsuframa(String zerarbaseicmsorgpubsuframa) {
        this.zerarbaseicmsorgpubsuframa = zerarbaseicmsorgpubsuframa;
    }

    public Integer getCodfiscaltriangularpf() {
        return codfiscaltriangularpf;
    }

    public void setCodfiscaltriangularpf(Integer codfiscaltriangularpf) {
        this.codfiscaltriangularpf = codfiscaltriangularpf;
    }

    public Integer getCodfiscaltriangularinterpf() {
        return codfiscaltriangularinterpf;
    }

    public void setCodfiscaltriangularinterpf(Integer codfiscaltriangularinterpf) {
        this.codfiscaltriangularinterpf = codfiscaltriangularinterpf;
    }

    public Integer getCodfiscaltriangularinternascpf() {
        return codfiscaltriangularinternascpf;
    }

    public void setCodfiscaltriangularinternascpf(Integer codfiscaltriangularinternascpf) {
        this.codfiscaltriangularinternascpf = codfiscaltriangularinternascpf;
    }

    public BigDecimal getPerdifereimentoicms() {
        return perdifereimentoicms;
    }

    public void setPerdifereimentoicms(BigDecimal perdifereimentoicms) {
        this.perdifereimentoicms = perdifereimentoicms;
    }

    public String getMensagem2() {
        return mensagem2;
    }

    public void setMensagem2(String mensagem2) {
        this.mensagem2 = mensagem2;
    }

    public BigDecimal getPercredpvendasimplesnac() {
        return percredpvendasimplesnac;
    }

    public void setPercredpvendasimplesnac(BigDecimal percredpvendasimplesnac) {
        this.percredpvendasimplesnac = percredpvendasimplesnac;
    }

    public String getObssimples() {
        return obssimples;
    }

    public void setObssimples(String obssimples) {
        this.obssimples = obssimples;
    }

    public String getPagtonomedesttransftab() {
        return pagtonomedesttransftab;
    }

    public void setPagtonomedesttransftab(String pagtonomedesttransftab) {
        this.pagtonomedesttransftab = pagtonomedesttransftab;
    }

    public String getPagtonomedesttransf() {
        return pagtonomedesttransf;
    }

    public void setPagtonomedesttransf(String pagtonomedesttransf) {
        this.pagtonomedesttransf = pagtonomedesttransf;
    }

    public String getPagtonomeremettransftab() {
        return pagtonomeremettransftab;
    }

    public void setPagtonomeremettransftab(String pagtonomeremettransftab) {
        this.pagtonomeremettransftab = pagtonomeremettransftab;
    }

    public String getPagtonomeremettransf() {
        return pagtonomeremettransf;
    }

    public void setPagtonomeremettransf(String pagtonomeremettransf) {
        this.pagtonomeremettransf = pagtonomeremettransf;
    }

    public String getTipocalculognretransftab() {
        return tipocalculognretransftab;
    }

    public void setTipocalculognretransftab(String tipocalculognretransftab) {
        this.tipocalculognretransftab = tipocalculognretransftab;
    }

    public String getTipocalculognretransf() {
        return tipocalculognretransf;
    }

    public void setTipocalculognretransf(String tipocalculognretransf) {
        this.tipocalculognretransf = tipocalculognretransf;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public Integer getCodfiscalsaidbenefest() {
        return codfiscalsaidbenefest;
    }

    public void setCodfiscalsaidbenefest(Integer codfiscalsaidbenefest) {
        this.codfiscalsaidbenefest = codfiscalsaidbenefest;
    }

    public Integer getCodfiscalsaidbenefinterest() {
        return codfiscalsaidbenefinterest;
    }

    public void setCodfiscalsaidbenefinterest(Integer codfiscalsaidbenefinterest) {
        this.codfiscalsaidbenefinterest = codfiscalsaidbenefinterest;
    }

    public Integer getCodfiscalsaidbenefinternac() {
        return codfiscalsaidbenefinternac;
    }

    public void setCodfiscalsaidbenefinternac(Integer codfiscalsaidbenefinternac) {
        this.codfiscalsaidbenefinternac = codfiscalsaidbenefinternac;
    }

    public Integer getCodfiscalentbeneficest() {
        return codfiscalentbeneficest;
    }

    public void setCodfiscalentbeneficest(Integer codfiscalentbeneficest) {
        this.codfiscalentbeneficest = codfiscalentbeneficest;
    }

    public Integer getCodfiscalentbeneficinterest() {
        return codfiscalentbeneficinterest;
    }

    public void setCodfiscalentbeneficinterest(Integer codfiscalentbeneficinterest) {
        this.codfiscalentbeneficinterest = codfiscalentbeneficinterest;
    }

    public Integer getCodfiscalentbenefinternac() {
        return codfiscalentbenefinternac;
    }

    public void setCodfiscalentbenefinternac(Integer codfiscalentbenefinternac) {
        this.codfiscalentbenefinternac = codfiscalentbenefinternac;
    }

    public String getReduzbaseicmdecretomaranhao() {
        return reduzbaseicmdecretomaranhao;
    }

    public void setReduzbaseicmdecretomaranhao(String reduzbaseicmdecretomaranhao) {
        this.reduzbaseicmdecretomaranhao = reduzbaseicmdecretomaranhao;
    }

    public String getUsabaseicmsreduzida() {
        return usabaseicmsreduzida;
    }

    public void setUsabaseicmsreduzida(String usabaseicmsreduzida) {
        this.usabaseicmsreduzida = usabaseicmsreduzida;
    }

    public Integer getCodfiscaldevclipfinter() {
        return codfiscaldevclipfinter;
    }

    public void setCodfiscaldevclipfinter(Integer codfiscaldevclipfinter) {
        this.codfiscaldevclipfinter = codfiscaldevclipfinter;
    }

    public Integer getCodfiscaldevclipfinternasc() {
        return codfiscaldevclipfinternasc;
    }

    public void setCodfiscaldevclipfinternasc(Integer codfiscaldevclipfinternasc) {
        this.codfiscaldevclipfinternasc = codfiscaldevclipfinternasc;
    }

    public String getUsapmcbasest() {
        return usapmcbasest;
    }

    public void setUsapmcbasest(String usapmcbasest) {
        this.usapmcbasest = usapmcbasest;
    }

    public Integer getCodfiscaldevclipf() {
        return codfiscaldevclipf;
    }

    public void setCodfiscaldevclipf(Integer codfiscaldevclipf) {
        this.codfiscaldevclipf = codfiscaldevclipf;
    }

    public String getSittributtv7() {
        return sittributtv7;
    }

    public void setSittributtv7(String sittributtv7) {
        this.sittributtv7 = sittributtv7;
    }

    public String getUtilizaparcadicfecp() {
        return utilizaparcadicfecp;
    }

    public void setUtilizaparcadicfecp(String utilizaparcadicfecp) {
        this.utilizaparcadicfecp = utilizaparcadicfecp;
    }

    public BigDecimal getAliqicmsfecp() {
        return aliqicmsfecp;
    }

    public void setAliqicmsfecp(BigDecimal aliqicmsfecp) {
        this.aliqicmsfecp = aliqicmsfecp;
    }

    public String getIsentaicmsbonific() {
        return isentaicmsbonific;
    }

    public void setIsentaicmsbonific(String isentaicmsbonific) {
        this.isentaicmsbonific = isentaicmsbonific;
    }

    public String getSittributtv8() {
        return sittributtv8;
    }

    public void setSittributtv8(String sittributtv8) {
        this.sittributtv8 = sittributtv8;
    }

    public String getSittributbonific() {
        return sittributbonific;
    }

    public void setSittributbonific(String sittributbonific) {
        this.sittributbonific = sittributbonific;
    }

    public Integer getCodfiscalenvcomodatoest() {
        return codfiscalenvcomodatoest;
    }

    public void setCodfiscalenvcomodatoest(Integer codfiscalenvcomodatoest) {
        this.codfiscalenvcomodatoest = codfiscalenvcomodatoest;
    }

    public Integer getCodfiscalenvcomodatointer() {
        return codfiscalenvcomodatointer;
    }

    public void setCodfiscalenvcomodatointer(Integer codfiscalenvcomodatointer) {
        this.codfiscalenvcomodatointer = codfiscalenvcomodatointer;
    }

    public Integer getCodfiscaldevcomodatoest() {
        return codfiscaldevcomodatoest;
    }

    public void setCodfiscaldevcomodatoest(Integer codfiscaldevcomodatoest) {
        this.codfiscaldevcomodatoest = codfiscaldevcomodatoest;
    }

    public Integer getCodfiscaldevcomodatointer() {
        return codfiscaldevcomodatointer;
    }

    public void setCodfiscaldevcomodatointer(Integer codfiscaldevcomodatointer) {
        this.codfiscaldevcomodatointer = codfiscaldevcomodatointer;
    }

    public BigDecimal getCodicmtabtransf() {
        return codicmtabtransf;
    }

    public void setCodicmtabtransf(BigDecimal codicmtabtransf) {
        this.codicmtabtransf = codicmtabtransf;
    }

    public String getSittributecf() {
        return sittributecf;
    }

    public void setSittributecf(String sittributecf) {
        this.sittributecf = sittributecf;
    }

    public Integer getCodfiscalsuframainter() {
        return codfiscalsuframainter;
    }

    public void setCodfiscalsuframainter(Integer codfiscalsuframainter) {
        this.codfiscalsuframainter = codfiscalsuframainter;
    }

    public String getUsaisencaoicmsvp() {
        return usaisencaoicmsvp;
    }

    public void setUsaisencaoicmsvp(String usaisencaoicmsvp) {
        this.usaisencaoicmsvp = usaisencaoicmsvp;
    }

    public BigDecimal getAliqicmstv9() {
        return aliqicmstv9;
    }

    public void setAliqicmstv9(BigDecimal aliqicmstv9) {
        this.aliqicmstv9 = aliqicmstv9;
    }

    public String getSittributsuframa() {
        return sittributsuframa;
    }

    public void setSittributsuframa(String sittributsuframa) {
        this.sittributsuframa = sittributsuframa;
    }

    public Integer getCodfiscalsuframa() {
        return codfiscalsuframa;
    }

    public void setCodfiscalsuframa(Integer codfiscalsuframa) {
        this.codfiscalsuframa = codfiscalsuframa;
    }

    public String getIsencaostorgaopub() {
        return isencaostorgaopub;
    }

    public void setIsencaostorgaopub(String isencaostorgaopub) {
        this.isencaostorgaopub = isencaostorgaopub;
    }

    public Integer getCodfiscalveniseorgaopubest() {
        return codfiscalveniseorgaopubest;
    }

    public void setCodfiscalveniseorgaopubest(Integer codfiscalveniseorgaopubest) {
        this.codfiscalveniseorgaopubest = codfiscalveniseorgaopubest;
    }

    public Integer getCodfiscalveniseorgaopubinter() {
        return codfiscalveniseorgaopubinter;
    }

    public void setCodfiscalveniseorgaopubinter(Integer codfiscalveniseorgaopubinter) {
        this.codfiscalveniseorgaopubinter = codfiscalveniseorgaopubinter;
    }

    public Integer getCodfiscaldeviseorgaopubest() {
        return codfiscaldeviseorgaopubest;
    }

    public void setCodfiscaldeviseorgaopubest(Integer codfiscaldeviseorgaopubest) {
        this.codfiscaldeviseorgaopubest = codfiscaldeviseorgaopubest;
    }

    public Integer getCodfiscaldeviseorgaopubinter() {
        return codfiscaldeviseorgaopubinter;
    }

    public void setCodfiscaldeviseorgaopubinter(Integer codfiscaldeviseorgaopubinter) {
        this.codfiscaldeviseorgaopubinter = codfiscaldeviseorgaopubinter;
    }

    public String getSittributiseorgaopub() {
        return sittributiseorgaopub;
    }

    public void setSittributiseorgaopub(String sittributiseorgaopub) {
        this.sittributiseorgaopub = sittributiseorgaopub;
    }

    public String getObsiseorgaopub1() {
        return obsiseorgaopub1;
    }

    public void setObsiseorgaopub1(String obsiseorgaopub1) {
        this.obsiseorgaopub1 = obsiseorgaopub1;
    }

    public String getObsiseorgaopub2() {
        return obsiseorgaopub2;
    }

    public void setObsiseorgaopub2(String obsiseorgaopub2) {
        this.obsiseorgaopub2 = obsiseorgaopub2;
    }

    public String getCodecfnrpa() {
        return codecfnrpa;
    }

    public void setCodecfnrpa(String codecfnrpa) {
        this.codecfnrpa = codecfnrpa;
    }

    public String getUsaaliqicmssimplesnacional() {
        return usaaliqicmssimplesnacional;
    }

    public void setUsaaliqicmssimplesnacional(String usaaliqicmssimplesnacional) {
        this.usaaliqicmssimplesnacional = usaaliqicmssimplesnacional;
    }

    public BigDecimal getAliqicmssimplesnacional() {
        return aliqicmssimplesnacional;
    }

    public void setAliqicmssimplesnacional(BigDecimal aliqicmssimplesnacional) {
        this.aliqicmssimplesnacional = aliqicmssimplesnacional;
    }

    public BigDecimal getAliqstsimplesnacional() {
        return aliqstsimplesnacional;
    }

    public void setAliqstsimplesnacional(BigDecimal aliqstsimplesnacional) {
        this.aliqstsimplesnacional = aliqstsimplesnacional;
    }

    public String getAplicaredicmssemipiba() {
        return aplicaredicmssemipiba;
    }

    public void setAplicaredicmssemipiba(String aplicaredicmssemipiba) {
        this.aplicaredicmssemipiba = aplicaredicmssemipiba;
    }

    public BigDecimal getVlpautaicmsinterest() {
        return vlpautaicmsinterest;
    }

    public void setVlpautaicmsinterest(BigDecimal vlpautaicmsinterest) {
        this.vlpautaicmsinterest = vlpautaicmsinterest;
    }

    public String getSittributpautaicms() {
        return sittributpautaicms;
    }

    public void setSittributpautaicms(String sittributpautaicms) {
        this.sittributpautaicms = sittributpautaicms;
    }

    public Integer getCodfiscalinterMc() {
        return codfiscalinterMc;
    }

    public void setCodfiscalinterMc(Integer codfiscalinterMc) {
        this.codfiscalinterMc = codfiscalinterMc;
    }

    public Integer getCodfiscalMc() {
        return codfiscalMc;
    }

    public void setCodfiscalMc(Integer codfiscalMc) {
        this.codfiscalMc = codfiscalMc;
    }

    public String getSittributMc() {
        return sittributMc;
    }

    public void setSittributMc(String sittributMc) {
        this.sittributMc = sittributMc;
    }

    public BigDecimal getAliqicms2Mc() {
        return aliqicms2Mc;
    }

    public void setAliqicms2Mc(BigDecimal aliqicms2Mc) {
        this.aliqicms2Mc = aliqicms2Mc;
    }

    public BigDecimal getAliqicms1Mc() {
        return aliqicms1Mc;
    }

    public void setAliqicms1Mc(BigDecimal aliqicms1Mc) {
        this.aliqicms1Mc = aliqicms1Mc;
    }

    public BigDecimal getPautaMc() {
        return pautaMc;
    }

    public void setPautaMc(BigDecimal pautaMc) {
        this.pautaMc = pautaMc;
    }

    public BigDecimal getIvaMc() {
        return ivaMc;
    }

    public void setIvaMc(BigDecimal ivaMc) {
        this.ivaMc = ivaMc;
    }

    public BigDecimal getPercbaseredMc() {
        return percbaseredMc;
    }

    public void setPercbaseredMc(BigDecimal percbaseredMc) {
        this.percbaseredMc = percbaseredMc;
    }

    public BigDecimal getPercbaseredstMc() {
        return percbaseredstMc;
    }

    public void setPercbaseredstMc(BigDecimal percbaseredstMc) {
        this.percbaseredstMc = percbaseredstMc;
    }

    public BigDecimal getCodicmMc() {
        return codicmMc;
    }

    public void setCodicmMc(BigDecimal codicmMc) {
        this.codicmMc = codicmMc;
    }

    public String getAgregaripicalculost() {
        return agregaripicalculost;
    }

    public void setAgregaripicalculost(String agregaripicalculost) {
        this.agregaripicalculost = agregaripicalculost;
    }

    public String getSittributpautaicmspf() {
        return sittributpautaicmspf;
    }

    public void setSittributpautaicmspf(String sittributpautaicmspf) {
        this.sittributpautaicmspf = sittributpautaicmspf;
    }

    public Integer getCodfiscalsaiddevtransfvirinter() {
        return codfiscalsaiddevtransfvirinter;
    }

    public void setCodfiscalsaiddevtransfvirinter(Integer codfiscalsaiddevtransfvirinter) {
        this.codfiscalsaiddevtransfvirinter = codfiscalsaiddevtransfvirinter;
    }

    public Integer getCodfiscalsaiddevtransfvir() {
        return codfiscalsaiddevtransfvir;
    }

    public void setCodfiscalsaiddevtransfvir(Integer codfiscalsaiddevtransfvir) {
        this.codfiscalsaiddevtransfvir = codfiscalsaiddevtransfvir;
    }

    public Integer getCodfiscalsaidtransfvirinter() {
        return codfiscalsaidtransfvirinter;
    }

    public void setCodfiscalsaidtransfvirinter(Integer codfiscalsaidtransfvirinter) {
        this.codfiscalsaidtransfvirinter = codfiscalsaidtransfvirinter;
    }

    public Integer getCodfiscalsaidtransfvir() {
        return codfiscalsaidtransfvir;
    }

    public void setCodfiscalsaidtransfvir(Integer codfiscalsaidtransfvir) {
        this.codfiscalsaidtransfvir = codfiscalsaidtransfvir;
    }

    public Integer getCodfiscalentdevtransfvirinter() {
        return codfiscalentdevtransfvirinter;
    }

    public void setCodfiscalentdevtransfvirinter(Integer codfiscalentdevtransfvirinter) {
        this.codfiscalentdevtransfvirinter = codfiscalentdevtransfvirinter;
    }

    public Integer getCodfiscalentdevtransfvir() {
        return codfiscalentdevtransfvir;
    }

    public void setCodfiscalentdevtransfvir(Integer codfiscalentdevtransfvir) {
        this.codfiscalentdevtransfvir = codfiscalentdevtransfvir;
    }

    public Integer getCodfiscalenttransfvirinter() {
        return codfiscalenttransfvirinter;
    }

    public void setCodfiscalenttransfvirinter(Integer codfiscalenttransfvirinter) {
        this.codfiscalenttransfvirinter = codfiscalenttransfvirinter;
    }

    public Integer getCodfiscalenttransfvir() {
        return codfiscalenttransfvir;
    }

    public void setCodfiscalenttransfvir(Integer codfiscalenttransfvir) {
        this.codfiscalenttransfvir = codfiscalenttransfvir;
    }

    public String getMostrarpvendasemipi() {
        return mostrarpvendasemipi;
    }

    public void setMostrarpvendasemipi(String mostrarpvendasemipi) {
        this.mostrarpvendasemipi = mostrarpvendasemipi;
    }

    public BigDecimal getPerbaseredsimplesnac() {
        return perbaseredsimplesnac;
    }

    public void setPerbaseredsimplesnac(BigDecimal perbaseredsimplesnac) {
        this.perbaseredsimplesnac = perbaseredsimplesnac;
    }

    public Integer getCodfiscalenttrffilret() {
        return codfiscalenttrffilret;
    }

    public void setCodfiscalenttrffilret(Integer codfiscalenttrffilret) {
        this.codfiscalenttrffilret = codfiscalenttrffilret;
    }

    public Integer getCodfiscalsaidtrffilret() {
        return codfiscalsaidtrffilret;
    }

    public void setCodfiscalsaidtrffilret(Integer codfiscalsaidtrffilret) {
        this.codfiscalsaidtrffilret = codfiscalsaidtrffilret;
    }

    public Integer getCodfiscalenttrffilretinter() {
        return codfiscalenttrffilretinter;
    }

    public void setCodfiscalenttrffilretinter(Integer codfiscalenttrffilretinter) {
        this.codfiscalenttrffilretinter = codfiscalenttrffilretinter;
    }

    public Integer getCodfiscalsaidtrffilretinter() {
        return codfiscalsaidtrffilretinter;
    }

    public void setCodfiscalsaidtrffilretinter(Integer codfiscalsaidtrffilretinter) {
        this.codfiscalsaidtrffilretinter = codfiscalsaidtrffilretinter;
    }

    public Integer getCodfiscalentdevtrffilret() {
        return codfiscalentdevtrffilret;
    }

    public void setCodfiscalentdevtrffilret(Integer codfiscalentdevtrffilret) {
        this.codfiscalentdevtrffilret = codfiscalentdevtrffilret;
    }

    public Integer getCodfiscalsaiddevtrffilret() {
        return codfiscalsaiddevtrffilret;
    }

    public void setCodfiscalsaiddevtrffilret(Integer codfiscalsaiddevtrffilret) {
        this.codfiscalsaiddevtrffilret = codfiscalsaiddevtrffilret;
    }

    public Integer getCodfiscentdevtrffilretinter() {
        return codfiscentdevtrffilretinter;
    }

    public void setCodfiscentdevtrffilretinter(Integer codfiscentdevtrffilretinter) {
        this.codfiscentdevtrffilretinter = codfiscentdevtrffilretinter;
    }

    public Integer getCodfiscsaiddevtrffilretinter() {
        return codfiscsaiddevtrffilretinter;
    }

    public void setCodfiscsaiddevtrffilretinter(Integer codfiscsaiddevtrffilretinter) {
        this.codfiscsaiddevtrffilretinter = codfiscsaiddevtrffilretinter;
    }

    public String getSittributsimplesnac() {
        return sittributsimplesnac;
    }

    public void setSittributsimplesnac(String sittributsimplesnac) {
        this.sittributsimplesnac = sittributsimplesnac;
    }

    public BigDecimal getCodicmsimplesnac() {
        return codicmsimplesnac;
    }

    public void setCodicmsimplesnac(BigDecimal codicmsimplesnac) {
        this.codicmsimplesnac = codicmsimplesnac;
    }

    public String getUtilizapercbaseredvenconsign() {
        return utilizapercbaseredvenconsign;
    }

    public void setUtilizapercbaseredvenconsign(String utilizapercbaseredvenconsign) {
        this.utilizapercbaseredvenconsign = utilizapercbaseredvenconsign;
    }

    public Integer getCodprodgnre() {
        return codprodgnre;
    }

    public void setCodprodgnre(Integer codprodgnre) {
        this.codprodgnre = codprodgnre;
    }

    public BigDecimal getPerctributos() {
        return perctributos;
    }

    public void setPerctributos(BigDecimal perctributos) {
        this.perctributos = perctributos;
    }

    public String getIsencaoicmsorgaopub() {
        return isencaoicmsorgaopub;
    }

    public void setIsencaoicmsorgaopub(String isencaoicmsorgaopub) {
        this.isencaoicmsorgaopub = isencaoicmsorgaopub;
    }

    public String getSittributorgaopub() {
        return sittributorgaopub;
    }

    public void setSittributorgaopub(String sittributorgaopub) {
        this.sittributorgaopub = sittributorgaopub;
    }

    public String getUsavlultentmediobasest() {
        return usavlultentmediobasest;
    }

    public void setUsavlultentmediobasest(String usavlultentmediobasest) {
        this.usavlultentmediobasest = usavlultentmediobasest;
    }

    public BigDecimal getPercbasestrj() {
        return percbasestrj;
    }

    public void setPercbasestrj(BigDecimal percbasestrj) {
        this.percbasestrj = percbasestrj;
    }

    public BigDecimal getPautafonte() {
        return pautafonte;
    }

    public void setPautafonte(BigDecimal pautafonte) {
        this.pautafonte = pautafonte;
    }

    public String getIsentnumempenho() {
        return isentnumempenho;
    }

    public void setIsentnumempenho(String isentnumempenho) {
        this.isentnumempenho = isentnumempenho;
    }

    public String getCodecfreduzido() {
        return codecfreduzido;
    }

    public void setCodecfreduzido(String codecfreduzido) {
        this.codecfreduzido = codecfreduzido;
    }

    public String getGeracodfiscalsaidtransfvir() {
        return geracodfiscalsaidtransfvir;
    }

    public void setGeracodfiscalsaidtransfvir(String geracodfiscalsaidtransfvir) {
        this.geracodfiscalsaidtransfvir = geracodfiscalsaidtransfvir;
    }

    public String getGeracodfiscalsaiddevtransfvir() {
        return geracodfiscalsaiddevtransfvir;
    }

    public void setGeracodfiscalsaiddevtransfvir(String geracodfiscalsaiddevtransfvir) {
        this.geracodfiscalsaiddevtransfvir = geracodfiscalsaiddevtransfvir;
    }

    public String getGeracodfiscalenttransfvir() {
        return geracodfiscalenttransfvir;
    }

    public void setGeracodfiscalenttransfvir(String geracodfiscalenttransfvir) {
        this.geracodfiscalenttransfvir = geracodfiscalenttransfvir;
    }

    public String getGeracodfiscalentdevtransfvir() {
        return geracodfiscalentdevtransfvir;
    }

    public void setGeracodfiscalentdevtransfvir(String geracodfiscalentdevtransfvir) {
        this.geracodfiscalentdevtransfvir = geracodfiscalentdevtransfvir;
    }

    public String getGeracodfiscalenttrffilret() {
        return geracodfiscalenttrffilret;
    }

    public void setGeracodfiscalenttrffilret(String geracodfiscalenttrffilret) {
        this.geracodfiscalenttrffilret = geracodfiscalenttrffilret;
    }

    public String getGeracodfiscentdevtrffilret() {
        return geracodfiscentdevtrffilret;
    }

    public void setGeracodfiscentdevtrffilret(String geracodfiscentdevtrffilret) {
        this.geracodfiscentdevtrffilret = geracodfiscentdevtrffilret;
    }

    public String getGeracodfiscalsaidtrffilret() {
        return geracodfiscalsaidtrffilret;
    }

    public void setGeracodfiscalsaidtrffilret(String geracodfiscalsaidtrffilret) {
        this.geracodfiscalsaidtrffilret = geracodfiscalsaidtrffilret;
    }

    public String getGeracodfiscsaiddevtrffilret() {
        return geracodfiscsaiddevtrffilret;
    }

    public void setGeracodfiscsaiddevtrffilret(String geracodfiscsaiddevtrffilret) {
        this.geracodfiscsaiddevtrffilret = geracodfiscsaiddevtrffilret;
    }

    public String getProdtransftribrj() {
        return prodtransftribrj;
    }

    public void setProdtransftribrj(String prodtransftribrj) {
        this.prodtransftribrj = prodtransftribrj;
    }

    public String getCompararpautacomst() {
        return compararpautacomst;
    }

    public void setCompararpautacomst(String compararpautacomst) {
        this.compararpautacomst = compararpautacomst;
    }

    public LocalDate getDtiniciovigencia() {
        return dtiniciovigencia;
    }

    public void setDtiniciovigencia(LocalDate dtiniciovigencia) {
        this.dtiniciovigencia = dtiniciovigencia;
    }

    public LocalDate getDtfimvigencia() {
        return dtfimvigencia;
    }

    public void setDtfimvigencia(LocalDate dtfimvigencia) {
        this.dtfimvigencia = dtfimvigencia;
    }

    public BigDecimal getPercacresicmspfPi() {
        return percacresicmspfPi;
    }

    public void setPercacresicmspfPi(BigDecimal percacresicmspfPi) {
        this.percacresicmspfPi = percacresicmspfPi;
    }

    public String getAlterafatorajusteivasn() {
        return alterafatorajusteivasn;
    }

    public void setAlterafatorajusteivasn(String alterafatorajusteivasn) {
        this.alterafatorajusteivasn = alterafatorajusteivasn;
    }

    public String getSittribstfontepf() {
        return sittribstfontepf;
    }

    public void setSittribstfontepf(String sittribstfontepf) {
        this.sittribstfontepf = sittribstfontepf;
    }

    public String getSittribstfontepj() {
        return sittribstfontepj;
    }

    public void setSittribstfontepj(String sittribstfontepj) {
        this.sittribstfontepj = sittribstfontepj;
    }

    public Integer getCodfiscalstfonteest() {
        return codfiscalstfonteest;
    }

    public void setCodfiscalstfonteest(Integer codfiscalstfonteest) {
        this.codfiscalstfonteest = codfiscalstfonteest;
    }

    public Integer getCodfiscalstfonteinterest() {
        return codfiscalstfonteinterest;
    }

    public void setCodfiscalstfonteinterest(Integer codfiscalstfonteinterest) {
        this.codfiscalstfonteinterest = codfiscalstfonteinterest;
    }

    public Integer getCodfiscalstfonteinternac() {
        return codfiscalstfonteinternac;
    }

    public void setCodfiscalstfonteinternac(Integer codfiscalstfonteinternac) {
        this.codfiscalstfonteinternac = codfiscalstfonteinternac;
    }

    public Integer getCodfiscalestorno() {
        return codfiscalestorno;
    }

    public void setCodfiscalestorno(Integer codfiscalestorno) {
        this.codfiscalestorno = codfiscalestorno;
    }

    public Integer getCodfiscalestornosaidainter() {
        return codfiscalestornosaidainter;
    }

    public void setCodfiscalestornosaidainter(Integer codfiscalestornosaidainter) {
        this.codfiscalestornosaidainter = codfiscalestornosaidainter;
    }

    public String getSittributbnftv1() {
        return sittributbnftv1;
    }

    public void setSittributbnftv1(String sittributbnftv1) {
        this.sittributbnftv1 = sittributbnftv1;
    }

    public String getUsavalorultentbasestfonte() {
        return usavalorultentbasestfonte;
    }

    public void setUsavalorultentbasestfonte(String usavalorultentbasestfonte) {
        this.usavalorultentbasestfonte = usavalorultentbasestfonte;
    }

    public String getBnfnaocalculaicms() {
        return bnfnaocalculaicms;
    }

    public void setBnfnaocalculaicms(String bnfnaocalculaicms) {
        this.bnfnaocalculaicms = bnfnaocalculaicms;
    }

    public String getUsavalorstfonte() {
        return usavalorstfonte;
    }

    public void setUsavalorstfonte(String usavalorstfonte) {
        this.usavalorstfonte = usavalorstfonte;
    }

    public String getUsavalorultentbaseicms() {
        return usavalorultentbaseicms;
    }

    public void setUsavalorultentbaseicms(String usavalorultentbaseicms) {
        this.usavalorultentbaseicms = usavalorultentbaseicms;
    }

    public String getUsavalorultentbaseicmsfonte() {
        return usavalorultentbaseicmsfonte;
    }

    public void setUsavalorultentbaseicmsfonte(String usavalorultentbaseicmsfonte) {
        this.usavalorultentbaseicmsfonte = usavalorultentbaseicmsfonte;
    }

    public String getUtilizanatopsrtv20() {
        return utilizanatopsrtv20;
    }

    public void setUtilizanatopsrtv20(String utilizanatopsrtv20) {
        this.utilizanatopsrtv20 = utilizanatopsrtv20;
    }

    public String getAgregasuframast2() {
        return agregasuframast2;
    }

    public void setAgregasuframast2(String agregasuframast2) {
        this.agregasuframast2 = agregasuframast2;
    }

    public String getAgregaicmsisencaost2() {
        return agregaicmsisencaost2;
    }

    public void setAgregaicmsisencaost2(String agregaicmsisencaost2) {
        this.agregaicmsisencaost2 = agregaicmsisencaost2;
    }

    public String getAgregapiscofinsst2() {
        return agregapiscofinsst2;
    }

    public void setAgregapiscofinsst2(String agregapiscofinsst2) {
        this.agregapiscofinsst2 = agregapiscofinsst2;
    }

    public Integer getCodfiscalsimplesnacest() {
        return codfiscalsimplesnacest;
    }

    public void setCodfiscalsimplesnacest(Integer codfiscalsimplesnacest) {
        this.codfiscalsimplesnacest = codfiscalsimplesnacest;
    }

    public Integer getCodfiscalsimplesnacnac() {
        return codfiscalsimplesnacnac;
    }

    public void setCodfiscalsimplesnacnac(Integer codfiscalsimplesnacnac) {
        this.codfiscalsimplesnacnac = codfiscalsimplesnacnac;
    }

    public BigDecimal getPerdiferimentocmstransf() {
        return perdiferimentocmstransf;
    }

    public void setPerdiferimentocmstransf(BigDecimal perdiferimentocmstransf) {
        this.perdiferimentocmstransf = perdiferimentocmstransf;
    }

    public Integer getCodfiscalsrvasilhame() {
        return codfiscalsrvasilhame;
    }

    public void setCodfiscalsrvasilhame(Integer codfiscalsrvasilhame) {
        this.codfiscalsrvasilhame = codfiscalsrvasilhame;
    }

    public Integer getCodfiscalsrvasilhameinteres() {
        return codfiscalsrvasilhameinteres;
    }

    public void setCodfiscalsrvasilhameinteres(Integer codfiscalsrvasilhameinteres) {
        this.codfiscalsrvasilhameinteres = codfiscalsrvasilhameinteres;
    }

    public String getSittributsrvasilhame() {
        return sittributsrvasilhame;
    }

    public void setSittributsrvasilhame(String sittributsrvasilhame) {
        this.sittributsrvasilhame = sittributsrvasilhame;
    }

    public String getGeraricmslivrofiscal() {
        return geraricmslivrofiscal;
    }

    public void setGeraricmslivrofiscal(String geraricmslivrofiscal) {
        this.geraricmslivrofiscal = geraricmslivrofiscal;
    }

    public String getCodcest() {
        return codcest;
    }

    public void setCodcest(String codcest) {
        this.codcest = codcest;
    }

    public BigDecimal getPeriss() {
        return periss;
    }

    public void setPeriss(BigDecimal periss) {
        this.periss = periss;
    }

    public BigDecimal getPerdiferencialtransf() {
        return perdiferencialtransf;
    }

    public void setPerdiferencialtransf(BigDecimal perdiferencialtransf) {
        this.perdiferencialtransf = perdiferencialtransf;
    }

    public String getRiologisentost() {
        return riologisentost;
    }

    public void setRiologisentost(String riologisentost) {
        this.riologisentost = riologisentost;
    }

    public String getSittributtv9() {
        return sittributtv9;
    }

    public void setSittributtv9(String sittributtv9) {
        this.sittributtv9 = sittributtv9;
    }

    public String getTv9isentost() {
        return tv9isentost;
    }

    public void setTv9isentost(String tv9isentost) {
        this.tv9isentost = tv9isentost;
    }

    public String getSittributpriorit() {
        return sittributpriorit;
    }

    public void setSittributpriorit(String sittributpriorit) {
        this.sittributpriorit = sittributpriorit;
    }

    public String getFigurapartilha() {
        return figurapartilha;
    }

    public void setFigurapartilha(String figurapartilha) {
        this.figurapartilha = figurapartilha;
    }

    public String getIsentaicmsufdest() {
        return isentaicmsufdest;
    }

    public void setIsentaicmsufdest(String isentaicmsufdest) {
        this.isentaicmsufdest = isentaicmsufdest;
    }

    public BigDecimal getPercpisretorgpub() {
        return percpisretorgpub;
    }

    public void setPercpisretorgpub(BigDecimal percpisretorgpub) {
        this.percpisretorgpub = percpisretorgpub;
    }

    public BigDecimal getPerccofinsretorgpub() {
        return perccofinsretorgpub;
    }

    public void setPerccofinsretorgpub(BigDecimal perccofinsretorgpub) {
        this.perccofinsretorgpub = perccofinsretorgpub;
    }

    public BigDecimal getPercirpjretorgpub() {
        return percirpjretorgpub;
    }

    public void setPercirpjretorgpub(BigDecimal percirpjretorgpub) {
        this.percirpjretorgpub = percirpjretorgpub;
    }

    public BigDecimal getPerccsllretorgpub() {
        return perccsllretorgpub;
    }

    public void setPerccsllretorgpub(BigDecimal perccsllretorgpub) {
        this.perccsllretorgpub = perccsllretorgpub;
    }

    public String getUtilizarstfonteprecific() {
        return utilizarstfonteprecific;
    }

    public void setUtilizarstfonteprecific(String utilizarstfonteprecific) {
        this.utilizarstfonteprecific = utilizarstfonteprecific;
    }

    public BigDecimal getIvafontesimplesnac() {
        return ivafontesimplesnac;
    }

    public void setIvafontesimplesnac(BigDecimal ivafontesimplesnac) {
        this.ivafontesimplesnac = ivafontesimplesnac;
    }

    public BigDecimal getAliqicms1fontesimplesnac() {
        return aliqicms1fontesimplesnac;
    }

    public void setAliqicms1fontesimplesnac(BigDecimal aliqicms1fontesimplesnac) {
        this.aliqicms1fontesimplesnac = aliqicms1fontesimplesnac;
    }

    public BigDecimal getAliqicms2fontesimplesnac() {
        return aliqicms2fontesimplesnac;
    }

    public void setAliqicms2fontesimplesnac(BigDecimal aliqicms2fontesimplesnac) {
        this.aliqicms2fontesimplesnac = aliqicms2fontesimplesnac;
    }

    public BigDecimal getPercbaseredstfontesimplesnac() {
        return percbaseredstfontesimplesnac;
    }

    public void setPercbaseredstfontesimplesnac(BigDecimal percbaseredstfontesimplesnac) {
        this.percbaseredstfontesimplesnac = percbaseredstfontesimplesnac;
    }

    public BigDecimal getPautafontesimplesnac() {
        return pautafontesimplesnac;
    }

    public void setPautafontesimplesnac(BigDecimal pautafontesimplesnac) {
        this.pautafontesimplesnac = pautafontesimplesnac;
    }

    public Integer getCodfiscalsrenviodepfech() {
        return codfiscalsrenviodepfech;
    }

    public void setCodfiscalsrenviodepfech(Integer codfiscalsrenviodepfech) {
        this.codfiscalsrenviodepfech = codfiscalsrenviodepfech;
    }

    public Integer getCodfissrenviodepfechinteres() {
        return codfissrenviodepfechinteres;
    }

    public void setCodfissrenviodepfechinteres(Integer codfissrenviodepfechinteres) {
        this.codfissrenviodepfechinteres = codfissrenviodepfechinteres;
    }

    public Integer getCodfissrretornodepfech() {
        return codfissrretornodepfech;
    }

    public void setCodfissrretornodepfech(Integer codfissrretornodepfech) {
        this.codfissrretornodepfech = codfissrretornodepfech;
    }

    public Integer getCodfissrretornodepfechinteres() {
        return codfissrretornodepfechinteres;
    }

    public void setCodfissrretornodepfechinteres(Integer codfissrretornodepfechinteres) {
        this.codfissrretornodepfechinteres = codfissrretornodepfechinteres;
    }

    public String getSittribenviodepfec() {
        return sittribenviodepfec;
    }

    public void setSittribenviodepfec(String sittribenviodepfec) {
        this.sittribenviodepfec = sittribenviodepfec;
    }

    public String getSittribretornodepfec() {
        return sittribretornodepfec;
    }

    public void setSittribretornodepfec(String sittribretornodepfec) {
        this.sittribretornodepfec = sittribretornodepfec;
    }

    public String getAgregapiscofinsst1() {
        return agregapiscofinsst1;
    }

    public void setAgregapiscofinsst1(String agregapiscofinsst1) {
        this.agregapiscofinsst1 = agregapiscofinsst1;
    }

    public String getAgregaicmsisencaost1() {
        return agregaicmsisencaost1;
    }

    public void setAgregaicmsisencaost1(String agregaicmsisencaost1) {
        this.agregaicmsisencaost1 = agregaicmsisencaost1;
    }

    public String getGregasuframast1() {
        return gregasuframast1;
    }

    public void setGregasuframast1(String gregasuframast1) {
        this.gregasuframast1 = gregasuframast1;
    }

    public String getAgregasuframast1() {
        return agregasuframast1;
    }

    public void setAgregasuframast1(String agregasuframast1) {
        this.agregasuframast1 = agregasuframast1;
    }

    public String getAgregadescst1() {
        return agregadescst1;
    }

    public void setAgregadescst1(String agregadescst1) {
        this.agregadescst1 = agregadescst1;
    }

    public BigDecimal getCodicmtabpfbonif() {
        return codicmtabpfbonif;
    }

    public void setCodicmtabpfbonif(BigDecimal codicmtabpfbonif) {
        this.codicmtabpfbonif = codicmtabpfbonif;
    }

    public BigDecimal getCodicmtabbonif() {
        return codicmtabbonif;
    }

    public void setCodicmtabbonif(BigDecimal codicmtabbonif) {
        this.codicmtabbonif = codicmtabbonif;
    }

    public Integer getCodfiscalserv() {
        return codfiscalserv;
    }

    public void setCodfiscalserv(Integer codfiscalserv) {
        this.codfiscalserv = codfiscalserv;
    }

    public String getSittributtriang() {
        return sittributtriang;
    }

    public void setSittributtriang(String sittributtriang) {
        this.sittributtriang = sittributtriang;
    }

    public Integer getCodfiscaltransfdepfechest() {
        return codfiscaltransfdepfechest;
    }

    public void setCodfiscaltransfdepfechest(Integer codfiscaltransfdepfechest) {
        this.codfiscaltransfdepfechest = codfiscaltransfdepfechest;
    }

    public Integer getCodfiscaltransfdepfechinterest() {
        return codfiscaltransfdepfechinterest;
    }

    public void setCodfiscaltransfdepfechinterest(Integer codfiscaltransfdepfechinterest) {
        this.codfiscaltransfdepfechinterest = codfiscaltransfdepfechinterest;
    }

    public BigDecimal getIvatransfvirt() {
        return ivatransfvirt;
    }

    public void setIvatransfvirt(BigDecimal ivatransfvirt) {
        this.ivatransfvirt = ivatransfvirt;
    }

    public BigDecimal getAliqicms1transfvirt() {
        return aliqicms1transfvirt;
    }

    public void setAliqicms1transfvirt(BigDecimal aliqicms1transfvirt) {
        this.aliqicms1transfvirt = aliqicms1transfvirt;
    }

    public BigDecimal getAliqicms2transfvirt() {
        return aliqicms2transfvirt;
    }

    public void setAliqicms2transfvirt(BigDecimal aliqicms2transfvirt) {
        this.aliqicms2transfvirt = aliqicms2transfvirt;
    }

    public BigDecimal getPautatransfvirt() {
        return pautatransfvirt;
    }

    public void setPautatransfvirt(BigDecimal pautatransfvirt) {
        this.pautatransfvirt = pautatransfvirt;
    }

    public BigDecimal getPercbaseredsttransfvirt() {
        return percbaseredsttransfvirt;
    }

    public void setPercbaseredsttransfvirt(BigDecimal percbaseredsttransfvirt) {
        this.percbaseredsttransfvirt = percbaseredsttransfvirt;
    }

    public BigDecimal getCodicmtransfvirt() {
        return codicmtransfvirt;
    }

    public void setCodicmtransfvirt(BigDecimal codicmtransfvirt) {
        this.codicmtransfvirt = codicmtransfvirt;
    }

    public BigDecimal getPerdiferencialtransfvirt() {
        return perdiferencialtransfvirt;
    }

    public void setPerdiferencialtransfvirt(BigDecimal perdiferencialtransfvirt) {
        this.perdiferencialtransfvirt = perdiferencialtransfvirt;
    }

    public BigDecimal getPerbaseredtransfvirtent() {
        return perbaseredtransfvirtent;
    }

    public void setPerbaseredtransfvirtent(BigDecimal perbaseredtransfvirtent) {
        this.perbaseredtransfvirtent = perbaseredtransfvirtent;
    }

    public BigDecimal getPercbaseredtranfvirtsaid() {
        return percbaseredtranfvirtsaid;
    }

    public void setPercbaseredtranfvirtsaid(BigDecimal percbaseredtranfvirtsaid) {
        this.percbaseredtranfvirtsaid = percbaseredtranfvirtsaid;
    }

    public String getSittributtransfvirt() {
        return sittributtransfvirt;
    }

    public void setSittributtransfvirt(String sittributtransfvirt) {
        this.sittributtransfvirt = sittributtransfvirt;
    }

    public String getSittributtransvfvirtent() {
        return sittributtransvfvirtent;
    }

    public void setSittributtransvfvirtent(String sittributtransvfvirtent) {
        this.sittributtransvfvirtent = sittributtransvfvirtent;
    }

    public String getAplicaacrespfjuridica() {
        return aplicaacrespfjuridica;
    }

    public void setAplicaacrespfjuridica(String aplicaacrespfjuridica) {
        this.aplicaacrespfjuridica = aplicaacrespfjuridica;
    }

    public Integer getCodfiscalisentostramo() {
        return codfiscalisentostramo;
    }

    public void setCodfiscalisentostramo(Integer codfiscalisentostramo) {
        this.codfiscalisentostramo = codfiscalisentostramo;
    }

    public Integer getCodfiscalisentostramointer() {
        return codfiscalisentostramointer;
    }

    public void setCodfiscalisentostramointer(Integer codfiscalisentostramointer) {
        this.codfiscalisentostramointer = codfiscalisentostramointer;
    }

    public String getSittributisentostramo() {
        return sittributisentostramo;
    }

    public void setSittributisentostramo(String sittributisentostramo) {
        this.sittributisentostramo = sittributisentostramo;
    }

    public String getCalculafecpclimei() {
        return calculafecpclimei;
    }

    public void setCalculafecpclimei(String calculafecpclimei) {
        this.calculafecpclimei = calculafecpclimei;
    }

    public Short getCodfigvendatriangular() {
        return codfigvendatriangular;
    }

    public void setCodfigvendatriangular(Short codfigvendatriangular) {
        this.codfigvendatriangular = codfigvendatriangular;
    }

    public String getAcrescaliqdesticmspart() {
        return acrescaliqdesticmspart;
    }

    public void setAcrescaliqdesticmspart(String acrescaliqdesticmspart) {
        this.acrescaliqdesticmspart = acrescaliqdesticmspart;
    }

    public String getConsiderarcontribicmspart() {
        return considerarcontribicmspart;
    }

    public void setConsiderarcontribicmspart(String considerarcontribicmspart) {
        this.considerarcontribicmspart = considerarcontribicmspart;
    }

    public BigDecimal getCodicmtabsimpnasc() {
        return codicmtabsimpnasc;
    }

    public void setCodicmtabsimpnasc(BigDecimal codicmtabsimpnasc) {
        this.codicmtabsimpnasc = codicmtabsimpnasc;
    }

    public BigDecimal getPeracrescismosimpnac() {
        return peracrescismosimpnac;
    }

    public void setPeracrescismosimpnac(BigDecimal peracrescismosimpnac) {
        this.peracrescismosimpnac = peracrescismosimpnac;
    }

    public Integer getCodfiscsuframaisenticmsinter() {
        return codfiscsuframaisenticmsinter;
    }

    public void setCodfiscsuframaisenticmsinter(Integer codfiscsuframaisenticmsinter) {
        this.codfiscsuframaisenticmsinter = codfiscsuframaisenticmsinter;
    }

    public String getCalcularfecpisentoie() {
        return calcularfecpisentoie;
    }

    public void setCalcularfecpisentoie(String calcularfecpisentoie) {
        this.calcularfecpisentoie = calcularfecpisentoie;
    }

    public String getCalcbaseicmsmediaent() {
        return calcbaseicmsmediaent;
    }

    public void setCalcbaseicmsmediaent(String calcbaseicmsmediaent) {
        this.calcbaseicmsmediaent = calcbaseicmsmediaent;
    }

    public String getCalcpartisentoicms() {
        return calcpartisentoicms;
    }

    public void setCalcpartisentoicms(String calcpartisentoicms) {
        this.calcpartisentoicms = calcpartisentoicms;
    }

    public String getUsaaliqdestpart() {
        return usaaliqdestpart;
    }

    public void setUsaaliqdestpart(String usaaliqdestpart) {
        this.usaaliqdestpart = usaaliqdestpart;
    }

    public String getMeinaocalcdif() {
        return meinaocalcdif;
    }

    public void setMeinaocalcdif(String meinaocalcdif) {
        this.meinaocalcdif = meinaocalcdif;
    }

    public String getSittributmei() {
        return sittributmei;
    }

    public void setSittributmei(String sittributmei) {
        this.sittributmei = sittributmei;
    }

    public Integer getCodfiscalisentostcont() {
        return codfiscalisentostcont;
    }

    public void setCodfiscalisentostcont(Integer codfiscalisentostcont) {
        this.codfiscalisentostcont = codfiscalisentostcont;
    }

    public Integer getCodfiscalisentostcontinter() {
        return codfiscalisentostcontinter;
    }

    public void setCodfiscalisentostcontinter(Integer codfiscalisentostcontinter) {
        this.codfiscalisentostcontinter = codfiscalisentostcontinter;
    }

    public Integer getCodfiscalisentostcontinternasc() {
        return codfiscalisentostcontinternasc;
    }

    public void setCodfiscalisentostcontinternasc(Integer codfiscalisentostcontinternasc) {
        this.codfiscalisentostcontinternasc = codfiscalisentostcontinternasc;
    }

    public Integer getCodfiscalconsufinal() {
        return codfiscalconsufinal;
    }

    public void setCodfiscalconsufinal(Integer codfiscalconsufinal) {
        this.codfiscalconsufinal = codfiscalconsufinal;
    }

    public Integer getCodfiscalconsufinalinter() {
        return codfiscalconsufinalinter;
    }

    public void setCodfiscalconsufinalinter(Integer codfiscalconsufinalinter) {
        this.codfiscalconsufinalinter = codfiscalconsufinalinter;
    }

    public Integer getCodfiscalconsufinalinternasc() {
        return codfiscalconsufinalinternasc;
    }

    public void setCodfiscalconsufinalinternasc(Integer codfiscalconsufinalinternasc) {
        this.codfiscalconsufinalinternasc = codfiscalconsufinalinternasc;
    }

    public String getCalcularfuncepisentoie() {
        return calcularfuncepisentoie;
    }

    public void setCalcularfuncepisentoie(String calcularfuncepisentoie) {
        this.calcularfuncepisentoie = calcularfuncepisentoie;
    }

    public BigDecimal getPercpisretorgpubest() {
        return percpisretorgpubest;
    }

    public void setPercpisretorgpubest(BigDecimal percpisretorgpubest) {
        this.percpisretorgpubest = percpisretorgpubest;
    }

    public BigDecimal getPerccofinsretorgpubest() {
        return perccofinsretorgpubest;
    }

    public void setPerccofinsretorgpubest(BigDecimal perccofinsretorgpubest) {
        this.perccofinsretorgpubest = perccofinsretorgpubest;
    }

    public BigDecimal getPercirpjretorgpubest() {
        return percirpjretorgpubest;
    }

    public void setPercirpjretorgpubest(BigDecimal percirpjretorgpubest) {
        this.percirpjretorgpubest = percirpjretorgpubest;
    }

    public BigDecimal getPerccsllretorgpubest() {
        return perccsllretorgpubest;
    }

    public void setPerccsllretorgpubest(BigDecimal perccsllretorgpubest) {
        this.perccsllretorgpubest = perccsllretorgpubest;
    }

    public BigDecimal getPercpisretorgpubmun() {
        return percpisretorgpubmun;
    }

    public void setPercpisretorgpubmun(BigDecimal percpisretorgpubmun) {
        this.percpisretorgpubmun = percpisretorgpubmun;
    }

    public BigDecimal getPerccofinsretorgpubmun() {
        return perccofinsretorgpubmun;
    }

    public void setPerccofinsretorgpubmun(BigDecimal perccofinsretorgpubmun) {
        this.perccofinsretorgpubmun = perccofinsretorgpubmun;
    }

    public BigDecimal getPercirpjretorgpubmun() {
        return percirpjretorgpubmun;
    }

    public void setPercirpjretorgpubmun(BigDecimal percirpjretorgpubmun) {
        this.percirpjretorgpubmun = percirpjretorgpubmun;
    }

    public BigDecimal getPerccsllretorgpubmun() {
        return perccsllretorgpubmun;
    }

    public void setPerccsllretorgpubmun(BigDecimal perccsllretorgpubmun) {
        this.perccsllretorgpubmun = perccsllretorgpubmun;
    }

    public BigDecimal getPericmtransvirtent() {
        return pericmtransvirtent;
    }

    public void setPericmtransvirtent(BigDecimal pericmtransvirtent) {
        this.pericmtransvirtent = pericmtransvirtent;
    }

    public BigDecimal getCodicmtabinternac() {
        return codicmtabinternac;
    }

    public void setCodicmtabinternac(BigDecimal codicmtabinternac) {
        this.codicmtabinternac = codicmtabinternac;
    }

    public BigDecimal getCodicminternac() {
        return codicminternac;
    }

    public void setCodicminternac(BigDecimal codicminternac) {
        this.codicminternac = codicminternac;
    }

    public String getSittributsimpnacdevfilnf() {
        return sittributsimpnacdevfilnf;
    }

    public void setSittributsimpnacdevfilnf(String sittributsimpnacdevfilnf) {
        this.sittributsimpnacdevfilnf = sittributsimpnacdevfilnf;
    }

    public String getIdentificartrib() {
        return identificartrib;
    }

    public void setIdentificartrib(String identificartrib) {
        this.identificartrib = identificartrib;
    }

    public BigDecimal getCodicmtabisencaoicms() {
        return codicmtabisencaoicms;
    }

    public void setCodicmtabisencaoicms(BigDecimal codicmtabisencaoicms) {
        this.codicmtabisencaoicms = codicmtabisencaoicms;
    }

    public BigDecimal getPercbaseredst2transf() {
        return percbaseredst2transf;
    }

    public void setPercbaseredst2transf(BigDecimal percbaseredst2transf) {
        this.percbaseredst2transf = percbaseredst2transf;
    }

    public BigDecimal getPercbaseredst2transfvirt() {
        return percbaseredst2transfvirt;
    }

    public void setPercbaseredst2transfvirt(BigDecimal percbaseredst2transfvirt) {
        this.percbaseredst2transfvirt = percbaseredst2transfvirt;
    }

    public BigDecimal getCodicmdifer() {
        return codicmdifer;
    }

    public void setCodicmdifer(BigDecimal codicmdifer) {
        this.codicmdifer = codicmdifer;
    }

    public BigDecimal getIndicecompbasestmt() {
        return indicecompbasestmt;
    }

    public void setIndicecompbasestmt(BigDecimal indicecompbasestmt) {
        this.indicecompbasestmt = indicecompbasestmt;
    }

    public BigDecimal getPercredbcstclisn() {
        return percredbcstclisn;
    }

    public void setPercredbcstclisn(BigDecimal percredbcstclisn) {
        this.percredbcstclisn = percredbcstclisn;
    }

    public String getAplicamvabaseicms() {
        return aplicamvabaseicms;
    }

    public void setAplicamvabaseicms(String aplicamvabaseicms) {
        this.aplicamvabaseicms = aplicamvabaseicms;
    }

    public BigDecimal getIndicecompbasestmg() {
        return indicecompbasestmg;
    }

    public void setIndicecompbasestmg(BigDecimal indicecompbasestmg) {
        this.indicecompbasestmg = indicecompbasestmg;
    }

    public String getCalcmediapondstmg() {
        return calcmediapondstmg;
    }

    public void setCalcmediapondstmg(String calcmediapondstmg) {
        this.calcmediapondstmg = calcmediapondstmg;
    }

    public String getGeraicmslivrofiscaltransfvirt() {
        return geraicmslivrofiscaltransfvirt;
    }

    public void setGeraicmslivrofiscaltransfvirt(String geraicmslivrofiscaltransfvirt) {
        this.geraicmslivrofiscaltransfvirt = geraicmslivrofiscaltransfvirt;
    }

    public Boolean getGruponftribut() {
        return gruponftribut;
    }

    public void setGruponftribut(Boolean gruponftribut) {
        this.gruponftribut = gruponftribut;
    }

    public String getSittributconsfinal() {
        return sittributconsfinal;
    }

    public void setSittributconsfinal(String sittributconsfinal) {
        this.sittributconsfinal = sittributconsfinal;
    }


    public String getCalculastmt() {
        return calculastmt;
    }

    public void setCalculastmt(String calculastmt) {
        this.calculastmt = calculastmt;
    }

    public String getSittributtv7ordem() {
        return sittributtv7ordem;
    }

    public void setSittributtv7ordem(String sittributtv7ordem) {
        this.sittributtv7ordem = sittributtv7ordem;
    }

    public String getSittributtv8ordem() {
        return sittributtv8ordem;
    }

    public void setSittributtv8ordem(String sittributtv8ordem) {
        this.sittributtv8ordem = sittributtv8ordem;
    }

    public String getUtilizamotorcalculo() {
        return utilizamotorcalculo;
    }

    public void setUtilizamotorcalculo(String utilizamotorcalculo) {
        this.utilizamotorcalculo = utilizamotorcalculo;
    }

    public String getFormulapvenda() {
        return formulapvenda;
    }

    public void setFormulapvenda(String formulapvenda) {
        this.formulapvenda = formulapvenda;
    }

    public String getFormulapvendatransf() {
        return formulapvendatransf;
    }

    public void setFormulapvendatransf(String formulapvendatransf) {
        this.formulapvendatransf = formulapvendatransf;
    }

    public String getFormulapvendatransfvirt() {
        return formulapvendatransfvirt;
    }

    public void setFormulapvendatransfvirt(String formulapvendatransfvirt) {
        this.formulapvendatransfvirt = formulapvendatransfvirt;
    }

    public BigDecimal getPerdifereimentoicmstv9() {
        return perdifereimentoicmstv9;
    }

    public void setPerdifereimentoicmstv9(BigDecimal perdifereimentoicmstv9) {
        this.perdifereimentoicmstv9 = perdifereimentoicmstv9;
    }

    public String getSittributbnftv14() {
        return sittributbnftv14;
    }

    public void setSittributbnftv14(String sittributbnftv14) {
        this.sittributbnftv14 = sittributbnftv14;
    }

    public String getBnfnaocalculaicmstv14() {
        return bnfnaocalculaicmstv14;
    }

    public void setBnfnaocalculaicmstv14(String bnfnaocalculaicmstv14) {
        this.bnfnaocalculaicmstv14 = bnfnaocalculaicmstv14;
    }

    public String getFormulafuncepicms() {
        return formulafuncepicms;
    }

    public void setFormulafuncepicms(String formulafuncepicms) {
        this.formulafuncepicms = formulafuncepicms;
    }

    public BigDecimal getVlpautaicmsest() {
        return vlpautaicmsest;
    }

    public void setVlpautaicmsest(BigDecimal vlpautaicmsest) {
        this.vlpautaicmsest = vlpautaicmsest;
    }

    public String getFormulafunceptransfretira() {
        return formulafunceptransfretira;
    }

    public void setFormulafunceptransfretira(String formulafunceptransfretira) {
        this.formulafunceptransfretira = formulafunceptransfretira;
    }

    public String getFormulafunceptransfvirt() {
        return formulafunceptransfvirt;
    }

    public void setFormulafunceptransfvirt(String formulafunceptransfvirt) {
        this.formulafunceptransfvirt = formulafunceptransfvirt;
    }

    public String getAgregaricmsnovltransf() {
        return agregaricmsnovltransf;
    }

    public void setAgregaricmsnovltransf(String agregaricmsnovltransf) {
        this.agregaricmsnovltransf = agregaricmsnovltransf;
    }

    public String getSittributtransfvirregespsai() {
        return sittributtransfvirregespsai;
    }

    public void setSittributtransfvirregespsai(String sittributtransfvirregespsai) {
        this.sittributtransfvirregespsai = sittributtransfvirregespsai;
    }

    public String getSittributtransfvirregespent() {
        return sittributtransfvirregespent;
    }

    public void setSittributtransfvirregespent(String sittributtransfvirregespent) {
        this.sittributtransfvirregespent = sittributtransfvirregespent;
    }

    public String getSittributtransfviropsai() {
        return sittributtransfviropsai;
    }

    public void setSittributtransfviropsai(String sittributtransfviropsai) {
        this.sittributtransfviropsai = sittributtransfviropsai;
    }

    public String getSittributtransfviropent() {
        return sittributtransfviropent;
    }

    public void setSittributtransfviropent(String sittributtransfviropent) {
        this.sittributtransfviropent = sittributtransfviropent;
    }

    public String getSittributtransfvirsnsai() {
        return sittributtransfvirsnsai;
    }

    public void setSittributtransfvirsnsai(String sittributtransfvirsnsai) {
        this.sittributtransfvirsnsai = sittributtransfvirsnsai;
    }

    public String getSittributtransfvirsnent() {
        return sittributtransfvirsnent;
    }

    public void setSittributtransfvirsnent(String sittributtransfvirsnent) {
        this.sittributtransfvirsnent = sittributtransfvirsnent;
    }

    public Integer getCodfiscaltransfviropsaiest() {
        return codfiscaltransfviropsaiest;
    }

    public void setCodfiscaltransfviropsaiest(Integer codfiscaltransfviropsaiest) {
        this.codfiscaltransfviropsaiest = codfiscaltransfviropsaiest;
    }

    public Integer getCodfiscaltransfviropentest() {
        return codfiscaltransfviropentest;
    }

    public void setCodfiscaltransfviropentest(Integer codfiscaltransfviropentest) {
        this.codfiscaltransfviropentest = codfiscaltransfviropentest;
    }

    public Integer getCodfiscaltransfvirsnsaiest() {
        return codfiscaltransfvirsnsaiest;
    }

    public void setCodfiscaltransfvirsnsaiest(Integer codfiscaltransfvirsnsaiest) {
        this.codfiscaltransfvirsnsaiest = codfiscaltransfvirsnsaiest;
    }

    public Integer getCodfiscaltransfvirsnentest() {
        return codfiscaltransfvirsnentest;
    }

    public void setCodfiscaltransfvirsnentest(Integer codfiscaltransfvirsnentest) {
        this.codfiscaltransfvirsnentest = codfiscaltransfvirsnentest;
    }

    public Integer getCodfiscaltransfviropsaiinter() {
        return codfiscaltransfviropsaiinter;
    }

    public void setCodfiscaltransfviropsaiinter(Integer codfiscaltransfviropsaiinter) {
        this.codfiscaltransfviropsaiinter = codfiscaltransfviropsaiinter;
    }

    public Integer getCodfiscaltransfviropentinter() {
        return codfiscaltransfviropentinter;
    }

    public void setCodfiscaltransfviropentinter(Integer codfiscaltransfviropentinter) {
        this.codfiscaltransfviropentinter = codfiscaltransfviropentinter;
    }

    public Integer getCodfiscaltransfvirsnsaiinter() {
        return codfiscaltransfvirsnsaiinter;
    }

    public void setCodfiscaltransfvirsnsaiinter(Integer codfiscaltransfvirsnsaiinter) {
        this.codfiscaltransfvirsnsaiinter = codfiscaltransfvirsnsaiinter;
    }

    public Integer getCodfiscaltransfvirsnentinter() {
        return codfiscaltransfvirsnentinter;
    }

    public void setCodfiscaltransfvirsnentinter(Integer codfiscaltransfvirsnentinter) {
        this.codfiscaltransfvirsnentinter = codfiscaltransfvirsnentinter;
    }

    public String getSittributmercconsig() {
        return sittributmercconsig;
    }

    public void setSittributmercconsig(String sittributmercconsig) {
        this.sittributmercconsig = sittributmercconsig;
    }

    public BigDecimal getPercacrescbenffis() {
        return percacrescbenffis;
    }

    public void setPercacrescbenffis(BigDecimal percacrescbenffis) {
        this.percacrescbenffis = percacrescbenffis;
    }

    public String getUsaregimeespisenredicms() {
        return usaregimeespisenredicms;
    }

    public void setUsaregimeespisenredicms(String usaregimeespisenredicms) {
        this.usaregimeespisenredicms = usaregimeespisenredicms;
    }

    public BigDecimal getAliqicmsefetivo() {
        return aliqicmsefetivo;
    }

    public void setAliqicmsefetivo(BigDecimal aliqicmsefetivo) {
        this.aliqicmsefetivo = aliqicmsefetivo;
    }

    public BigDecimal getPercredicmsefetivo() {
        return percredicmsefetivo;
    }

    public void setPercredicmsefetivo(BigDecimal percredicmsefetivo) {
        this.percredicmsefetivo = percredicmsefetivo;
    }

    public String getForumaicmsefetivo() {
        return forumaicmsefetivo;
    }

    public void setForumaicmsefetivo(String forumaicmsefetivo) {
        this.forumaicmsefetivo = forumaicmsefetivo;
    }

    public String getFormulaicmsefetivo() {
        return formulaicmsefetivo;
    }

    public void setFormulaicmsefetivo(String formulaicmsefetivo) {
        this.formulaicmsefetivo = formulaicmsefetivo;
    }

    public String getSnnaocalcdif() {
        return snnaocalcdif;
    }

    public void setSnnaocalcdif(String snnaocalcdif) {
        this.snnaocalcdif = snnaocalcdif;
    }

    public String getProdruralcalcdifer() {
        return prodruralcalcdifer;
    }

    public void setProdruralcalcdifer(String prodruralcalcdifer) {
        this.prodruralcalcdifer = prodruralcalcdifer;
    }

    public String getSittributprodruralcalcdifer() {
        return sittributprodruralcalcdifer;
    }

    public void setSittributprodruralcalcdifer(String sittributprodruralcalcdifer) {
        this.sittributprodruralcalcdifer = sittributprodruralcalcdifer;
    }

    public String getSittributbonificint() {
        return sittributbonificint;
    }

    public void setSittributbonificint(String sittributbonificint) {
        this.sittributbonificint = sittributbonificint;
    }

    public String getIsentaicmsbonificint() {
        return isentaicmsbonificint;
    }

    public void setIsentaicmsbonificint(String isentaicmsbonificint) {
        this.isentaicmsbonificint = isentaicmsbonificint;
    }

    public String getFormulacmv() {
        return formulacmv;
    }

    public void setFormulacmv(String formulacmv) {
        this.formulacmv = formulacmv;
    }

    public String getNaopersisteivapcmov() {
        return naopersisteivapcmov;
    }

    public void setNaopersisteivapcmov(String naopersisteivapcmov) {
        this.naopersisteivapcmov = naopersisteivapcmov;
    }

    public Integer getCodfiscaldevcontaordem() {
        return codfiscaldevcontaordem;
    }

    public void setCodfiscaldevcontaordem(Integer codfiscaldevcontaordem) {
        this.codfiscaldevcontaordem = codfiscaldevcontaordem;
    }

    public Integer getCodfiscaldevcontordinternasc() {
        return codfiscaldevcontordinternasc;
    }

    public void setCodfiscaldevcontordinternasc(Integer codfiscaldevcontordinternasc) {
        this.codfiscaldevcontordinternasc = codfiscaldevcontordinternasc;
    }

    public String getIsentaicmspartufdestorgaopub() {
        return isentaicmspartufdestorgaopub;
    }

    public void setIsentaicmspartufdestorgaopub(String isentaicmspartufdestorgaopub) {
        this.isentaicmspartufdestorgaopub = isentaicmspartufdestorgaopub;
    }

    public String getZerarpercbaseredstfontedanfe() {
        return zerarpercbaseredstfontedanfe;
    }

    public void setZerarpercbaseredstfontedanfe(String zerarpercbaseredstfontedanfe) {
        this.zerarpercbaseredstfontedanfe = zerarpercbaseredstfontedanfe;
    }

    public Integer getCodfiscaldevcontaordeminter() {
        return codfiscaldevcontaordeminter;
    }

    public void setCodfiscaldevcontaordeminter(Integer codfiscaldevcontaordeminter) {
        this.codfiscaldevcontaordeminter = codfiscaldevcontaordeminter;
    }

    public BigDecimal getPerdiferimentocmstransfvirt() {
        return perdiferimentocmstransfvirt;
    }

    public void setPerdiferimentocmstransfvirt(BigDecimal perdiferimentocmstransfvirt) {
        this.perdiferimentocmstransfvirt = perdiferimentocmstransfvirt;
    }

    public Integer getCodfiscalvendaexpindireta() {
        return codfiscalvendaexpindireta;
    }

    public void setCodfiscalvendaexpindireta(Integer codfiscalvendaexpindireta) {
        this.codfiscalvendaexpindireta = codfiscalvendaexpindireta;
    }

    public Integer getCodfiscalvendaexpindiretainter() {
        return codfiscalvendaexpindiretainter;
    }

    public void setCodfiscalvendaexpindiretainter(Integer codfiscalvendaexpindiretainter) {
        this.codfiscalvendaexpindiretainter = codfiscalvendaexpindiretainter;
    }

    public String getSittributvendaexpindireta() {
        return sittributvendaexpindireta;
    }

    public void setSittributvendaexpindireta(String sittributvendaexpindireta) {
        this.sittributvendaexpindireta = sittributvendaexpindireta;
    }

    public String getIsentaicmssittribut041() {
        return isentaicmssittribut041;
    }

    public void setIsentaicmssittribut041(String isentaicmssittribut041) {
        this.isentaicmssittribut041 = isentaicmssittribut041;
    }

    public String getUsaformulapvendafilret() {
        return usaformulapvendafilret;
    }

    public void setUsaformulapvendafilret(String usaformulapvendafilret) {
        this.usaformulapvendafilret = usaformulapvendafilret;
    }

    public Integer getCodfiscaltransfvendent() {
        return codfiscaltransfvendent;
    }

    public void setCodfiscaltransfvendent(Integer codfiscaltransfvendent) {
        this.codfiscaltransfvendent = codfiscaltransfvendent;
    }

    public Integer getCodfiscalintertransfvendent() {
        return codfiscalintertransfvendent;
    }

    public void setCodfiscalintertransfvendent(Integer codfiscalintertransfvendent) {
        this.codfiscalintertransfvendent = codfiscalintertransfvendent;
    }

    public Integer getCodfiscalfilretdeptercentrada() {
        return codfiscalfilretdeptercentrada;
    }

    public void setCodfiscalfilretdeptercentrada(Integer codfiscalfilretdeptercentrada) {
        this.codfiscalfilretdeptercentrada = codfiscalfilretdeptercentrada;
    }

    public Integer getCodfiscalfilretdeptercentradai() {
        return codfiscalfilretdeptercentradai;
    }

    public void setCodfiscalfilretdeptercentradai(Integer codfiscalfilretdeptercentradai) {
        this.codfiscalfilretdeptercentradai = codfiscalfilretdeptercentradai;
    }

    public String getNaocalculafuncepajusteestoque() {
        return naocalculafuncepajusteestoque;
    }

    public void setNaocalculafuncepajusteestoque(String naocalculafuncepajusteestoque) {
        this.naocalculafuncepajusteestoque = naocalculafuncepajusteestoque;
    }

    public String getUsarmedultentbasicmsnfsr() {
        return usarmedultentbasicmsnfsr;
    }

    public void setUsarmedultentbasicmsnfsr(String usarmedultentbasicmsnfsr) {
        this.usarmedultentbasicmsnfsr = usarmedultentbasicmsnfsr;
    }

    public String getSomarvalordifbcicms() {
        return somarvalordifbcicms;
    }

    public void setSomarvalordifbcicms(String somarvalordifbcicms) {
        this.somarvalordifbcicms = somarvalordifbcicms;
    }

    public String getSittributsemimpostoMc() {
        return sittributsemimpostoMc;
    }

    public void setSittributsemimpostoMc(String sittributsemimpostoMc) {
        this.sittributsemimpostoMc = sittributsemimpostoMc;
    }

    public BigDecimal getPerdifereimentoicmsMc() {
        return perdifereimentoicmsMc;
    }

    public void setPerdifereimentoicmsMc(BigDecimal perdifereimentoicmsMc) {
        this.perdifereimentoicmsMc = perdifereimentoicmsMc;
    }

    public String getReplicadesoneracaocomercial() {
        return replicadesoneracaocomercial;
    }

    public void setReplicadesoneracaocomercial(String replicadesoneracaocomercial) {
        this.replicadesoneracaocomercial = replicadesoneracaocomercial;
    }

    public String getDestacicmsstanterior() {
        return destacicmsstanterior;
    }

    public void setDestacicmsstanterior(String destacicmsstanterior) {
        this.destacicmsstanterior = destacicmsstanterior;
    }

    public String getCompararbaseicmsmedultentmes() {
        return compararbaseicmsmedultentmes;
    }

    public void setCompararbaseicmsmedultentmes(String compararbaseicmsmedultentmes) {
        this.compararbaseicmsmedultentmes = compararbaseicmsmedultentmes;
    }

    public String getSittributoperlogisticoentrada() {
        return sittributoperlogisticoentrada;
    }

    public void setSittributoperlogisticoentrada(String sittributoperlogisticoentrada) {
        this.sittributoperlogisticoentrada = sittributoperlogisticoentrada;
    }

    public String getSittributoperlogisticosaida() {
        return sittributoperlogisticosaida;
    }

    public void setSittributoperlogisticosaida(String sittributoperlogisticosaida) {
        this.sittributoperlogisticosaida = sittributoperlogisticosaida;
    }

    public String getAplicardifvalorfuncep() {
        return aplicardifvalorfuncep;
    }

    public void setAplicardifvalorfuncep(String aplicardifvalorfuncep) {
        this.aplicardifvalorfuncep = aplicardifvalorfuncep;
    }

    public String getUsavlstmaiorpercminpmc() {
        return usavlstmaiorpercminpmc;
    }

    public void setUsavlstmaiorpercminpmc(String usavlstmaiorpercminpmc) {
        this.usavlstmaiorpercminpmc = usavlstmaiorpercminpmc;
    }

    public BigDecimal getPervlstmaiorpercminpmc() {
        return pervlstmaiorpercminpmc;
    }

    public void setPervlstmaiorpercminpmc(BigDecimal pervlstmaiorpercminpmc) {
        this.pervlstmaiorpercminpmc = pervlstmaiorpercminpmc;
    }

    public Instant getDtalterc5() {
        return dtalterc5;
    }

    public void setDtalterc5(Instant dtalterc5) {
        this.dtalterc5 = dtalterc5;
    }

    public Integer getCodfiscalestnfevenda() {
        return codfiscalestnfevenda;
    }

    public void setCodfiscalestnfevenda(Integer codfiscalestnfevenda) {
        this.codfiscalestnfevenda = codfiscalestnfevenda;
    }

    public Integer getCodfiscalestnfevendainter() {
        return codfiscalestnfevendainter;
    }

    public void setCodfiscalestnfevendainter(Integer codfiscalestnfevendainter) {
        this.codfiscalestnfevendainter = codfiscalestnfevendainter;
    }

    public Integer getCodfiscalestnfevendainternasc() {
        return codfiscalestnfevendainternasc;
    }

    public void setCodfiscalestnfevendainternasc(Integer codfiscalestnfevendainternasc) {
        this.codfiscalestnfevendainternasc = codfiscalestnfevendainternasc;
    }

    public Integer getCodfiscaldevclisuframaest() {
        return codfiscaldevclisuframaest;
    }

    public void setCodfiscaldevclisuframaest(Integer codfiscaldevclisuframaest) {
        this.codfiscaldevclisuframaest = codfiscaldevclisuframaest;
    }

    public Integer getCodfiscaldevclisuframainte() {
        return codfiscaldevclisuframainte;
    }

    public void setCodfiscaldevclisuframainte(Integer codfiscaldevclisuframainte) {
        this.codfiscaldevclisuframainte = codfiscaldevclisuframainte;
    }

    public String getDesvincularfecpstfuncepicms() {
        return desvincularfecpstfuncepicms;
    }

    public void setDesvincularfecpstfuncepicms(String desvincularfecpstfuncepicms) {
        this.desvincularfecpstfuncepicms = desvincularfecpstfuncepicms;
    }

    public String getUtilizaicmtabflex() {
        return utilizaicmtabflex;
    }

    public void setUtilizaicmtabflex(String utilizaicmtabflex) {
        this.utilizaicmtabflex = utilizaicmtabflex;
    }

    public String getFormulaicmtab() {
        return formulaicmtab;
    }

    public void setFormulaicmtab(String formulaicmtab) {
        this.formulaicmtab = formulaicmtab;
    }

    public Short getCodcolecaovar() {
        return codcolecaovar;
    }

    public void setCodcolecaovar(Short codcolecaovar) {
        this.codcolecaovar = codcolecaovar;
    }

}