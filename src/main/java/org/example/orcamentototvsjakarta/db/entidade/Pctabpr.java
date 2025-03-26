package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PCTABPR")
public class Pctabpr {
    @EmbeddedId
    private PctabprId id;

    @Column(name = "PTABELA", precision = 18, scale = 6)
    private BigDecimal ptabela;

    @Column(name = "PVENDA", precision = 18, scale = 6)
    private BigDecimal pvenda;

    @Column(name = "PERDESCMAX", precision = 10, scale = 2)
    private BigDecimal perdescmax;

    @Column(name = "PERDESCMAXTAB", precision = 10, scale = 2)
    private BigDecimal perdescmaxtab;

    @Column(name = "POFERTA", precision = 12, scale = 3)
    private BigDecimal poferta;

    @Column(name = "POFERTATAB", precision = 12, scale = 3)
    private BigDecimal pofertatab;

    @Column(name = "MARGEM", precision = 6, scale = 2)
    private BigDecimal margem;

    @Column(name = "DTULTALTPVENDA")
    private LocalDate dtultaltpvenda;

    @Column(name = "EXCLUIDO", length = 1)
    private String excluido;

    @Column(name = "PTABELA1", precision = 18, scale = 6)
    private BigDecimal ptabela1;

    @Column(name = "PTABELA2", precision = 18, scale = 6)
    private BigDecimal ptabela2;

    @Column(name = "PTABELA3", precision = 18, scale = 6)
    private BigDecimal ptabela3;

    @Column(name = "PTABELA4", precision = 18, scale = 6)
    private BigDecimal ptabela4;

    @Column(name = "PTABELA5", precision = 18, scale = 6)
    private BigDecimal ptabela5;

    @Column(name = "PTABELA6", precision = 18, scale = 6)
    private BigDecimal ptabela6;

    @Column(name = "PTABELA7", precision = 18, scale = 6)
    private BigDecimal ptabela7;

    @Column(name = "PVENDA1", precision = 18, scale = 6)
    private BigDecimal pvenda1;

    @Column(name = "PVENDA2", precision = 18, scale = 6)
    private BigDecimal pvenda2;

    @Column(name = "PVENDA3", precision = 18, scale = 6)
    private BigDecimal pvenda3;

    @Column(name = "PVENDA4", precision = 18, scale = 6)
    private BigDecimal pvenda4;

    @Column(name = "PVENDA5", precision = 18, scale = 6)
    private BigDecimal pvenda5;

    @Column(name = "PVENDA6", precision = 18, scale = 6)
    private BigDecimal pvenda6;

    @Column(name = "PVENDA7", precision = 18, scale = 6)
    private BigDecimal pvenda7;

    @Column(name = "CODST")
    private Short codst;

    @Column(name = "MARGEM_ESP", precision = 6, scale = 2)
    private BigDecimal margemEsp;

    @Column(name = "PFRETE", precision = 10, scale = 4)
    private BigDecimal pfrete;

    @Column(name = "TABELAEMITIDA", length = 1)
    private String tabelaemitida;

    @Column(name = "PERDESCMAXESP", precision = 6, scale = 3)
    private BigDecimal perdescmaxesp;

    @Column(name = "PERDESCAUTOR", precision = 6, scale = 3)
    private BigDecimal perdescautor;

    @Column(name = "COTAITEM")
    private Integer cotaitem;

    @Column(name = "QTDESCAUTOR")
    private Integer qtdescautor;

    @Column(name = "POFERTAAUX", precision = 12, scale = 3)
    private BigDecimal pofertaaux;

    @Column(name = "PERDESCAUTORTAB", precision = 6, scale = 3)
    private BigDecimal perdescautortab;

    @Column(name = "COTAITEMTAB")
    private Integer cotaitemtab;

    @Column(name = "QTDESCAUTORTAB")
    private Integer qtdescautortab;

    @Column(name = "PERDESCMAXBALCAO", precision = 10, scale = 2)
    private BigDecimal perdescmaxbalcao;

    @Column(name = "PERDESCMAXTABBALCAO", precision = 10, scale = 2)
    private BigDecimal perdescmaxtabbalcao;

    @Column(name = "PERDESCFOB", precision = 5, scale = 2)
    private BigDecimal perdescfob;

    @Column(name = "PTABELAMED", precision = 12, scale = 3)
    private BigDecimal ptabelamed;

    @Column(name = "PVENDAMED", precision = 12, scale = 3)
    private BigDecimal pvendamed;

    @Column(name = "PTABELAMED1", precision = 12, scale = 3)
    private BigDecimal ptabelamed1;

    @Column(name = "PTABELAMED2", precision = 12, scale = 3)
    private BigDecimal ptabelamed2;

    @Column(name = "PTABELAMED3", precision = 12, scale = 3)
    private BigDecimal ptabelamed3;

    @Column(name = "PTABELAMED4", precision = 12, scale = 3)
    private BigDecimal ptabelamed4;

    @Column(name = "PTABELAMED5", precision = 12, scale = 3)
    private BigDecimal ptabelamed5;

    @Column(name = "PTABELAMED6", precision = 12, scale = 3)
    private BigDecimal ptabelamed6;

    @Column(name = "PTABELAMED7", precision = 12, scale = 3)
    private BigDecimal ptabelamed7;

    @Column(name = "PVENDAMED1", precision = 12, scale = 3)
    private BigDecimal pvendamed1;

    @Column(name = "PVENDAMED2", precision = 12, scale = 3)
    private BigDecimal pvendamed2;

    @Column(name = "PVENDAMED3", precision = 12, scale = 3)
    private BigDecimal pvendamed3;

    @Column(name = "PVENDAMED4", precision = 12, scale = 3)
    private BigDecimal pvendamed4;

    @Column(name = "PVENDAMED5", precision = 12, scale = 3)
    private BigDecimal pvendamed5;

    @Column(name = "PVENDAMED6", precision = 12, scale = 3)
    private BigDecimal pvendamed6;

    @Column(name = "PVENDAMED7", precision = 12, scale = 3)
    private BigDecimal pvendamed7;

    @Column(name = "DESCONTAFRETE", length = 1)
    private String descontafrete;

    @Column(name = "DTINICIOPTABELA")
    private LocalDate dtinicioptabela;

    @Column(name = "PTABELAFUTURO", precision = 12, scale = 3)
    private BigDecimal ptabelafuturo;

    @Column(name = "DTULTALTPTABELAFUTURO")
    private LocalDate dtultaltptabelafuturo;

    @Column(name = "DTULTALTPTABELA")
    private LocalDate dtultaltptabela;

    @Column(name = "PCOMREP1", precision = 6, scale = 2)
    private BigDecimal pcomrep1;

    @Column(name = "PCOMREP2", precision = 6, scale = 2)
    private BigDecimal pcomrep2;

    @Column(name = "PCOMREP3", precision = 6, scale = 2)
    private BigDecimal pcomrep3;

    @Column(name = "PERCACRESCIMOFRETE", precision = 8, scale = 2)
    private BigDecimal percacrescimofrete;

    @Column(name = "DTEMISSAOETIQ")
    private LocalDate dtemissaoetiq;

    @Column(name = "NUMSEQATU")
    private Long numseqatu;

    @Column(name = "PRECOFAB", precision = 18, scale = 6)
    private BigDecimal precofab;

    @Column(name = "ATUALIZAR", length = 1)
    private String atualizar;

    @Column(name = "PTABELAATAC", precision = 18, scale = 6)
    private BigDecimal ptabelaatac;

    @Column(name = "PTABELAATAC1", precision = 18, scale = 6)
    private BigDecimal ptabelaatac1;

    @Column(name = "PTABELAATAC2", precision = 18, scale = 6)
    private BigDecimal ptabelaatac2;

    @Column(name = "PTABELAATAC3", precision = 18, scale = 6)
    private BigDecimal ptabelaatac3;

    @Column(name = "PTABELAATAC4", precision = 18, scale = 6)
    private BigDecimal ptabelaatac4;

    @Column(name = "PTABELAATAC5", precision = 18, scale = 6)
    private BigDecimal ptabelaatac5;

    @Column(name = "PTABELAATAC6", precision = 18, scale = 6)
    private BigDecimal ptabelaatac6;

    @Column(name = "PTABELAATAC7", precision = 18, scale = 6)
    private BigDecimal ptabelaatac7;

    @Column(name = "PVENDAATAC", precision = 18, scale = 6)
    private BigDecimal pvendaatac;

    @Column(name = "PVENDAATAC1", precision = 18, scale = 6)
    private BigDecimal pvendaatac1;

    @Column(name = "PVENDAATAC2", precision = 18, scale = 6)
    private BigDecimal pvendaatac2;

    @Column(name = "PVENDAATAC3", precision = 18, scale = 6)
    private BigDecimal pvendaatac3;

    @Column(name = "PVENDAATAC4", precision = 18, scale = 6)
    private BigDecimal pvendaatac4;

    @Column(name = "PVENDAATAC5", precision = 18, scale = 6)
    private BigDecimal pvendaatac5;

    @Column(name = "PVENDAATAC6", precision = 18, scale = 6)
    private BigDecimal pvendaatac6;

    @Column(name = "PVENDAATAC7", precision = 18, scale = 6)
    private BigDecimal pvendaatac7;

    @Column(name = "PRECOANTERIORATAC", precision = 18, scale = 6)
    private BigDecimal precoanterioratac;

    @Column(name = "VLACRESFRETEKG", precision = 12, scale = 6)
    private BigDecimal vlacresfretekg;

    @Column(name = "DTINICIOVALIDADE")
    private LocalDate dtiniciovalidade;

    @Column(name = "DTFIMVALIDADE")
    private LocalDate dtfimvalidade;

    @Column(name = "INDICEPRECO", precision = 12, scale = 8)
    private BigDecimal indicepreco;

    @Column(name = "PERCIPIVENDATAB", precision = 18, scale = 6)
    private BigDecimal percipivendatab;

    @Column(name = "VLPAUTAIPIVENDATAB", precision = 18, scale = 6)
    private BigDecimal vlpautaipivendatab;

    @Column(name = "VLIPIPORKGVENDATAB", precision = 18, scale = 6)
    private BigDecimal vlipiporkgvendatab;

    @Column(name = "PRECOMAXCONSUM", precision = 18, scale = 6)
    private BigDecimal precomaxconsum;

    @Column(name = "DTIMPORTINTEGRACAO")
    private LocalDate dtimportintegracao;

    @Column(name = "DTULTALTERSRVPRC")
    private LocalDate dtultaltersrvprc;

    @Column(name = "DTULTATUPVENDA")
    private LocalDate dtultatupvenda;

    @Column(name = "PRECOMAXCONSUMTAB", precision = 18, scale = 6)
    private BigDecimal precomaxconsumtab;

    @Column(name = "PERCDESCSIMPLESNAC", precision = 18, scale = 6)
    private BigDecimal percdescsimplesnac;

    @Column(name = "VLSTTAB", precision = 18, scale = 6)
    private BigDecimal vlsttab;

    @Column(name = "VLST", precision = 18, scale = 6)
    private BigDecimal vlst;

    @Column(name = "CODTRIBPISCOFINS")
    private Short codtribpiscofins;

    @Column(name = "PRECOREVISTA", precision = 18, scale = 6)
    private BigDecimal precorevista;

    @Column(name = "DTVALPREVISTA")
    private LocalDate dtvalprevista;

    @Column(name = "ROTINA", length = 40)
    private String rotina;

    @Column(name = "MATRICULA")
    private Integer matricula;

    @Column(name = "OBS", length = 80)
    private String obs;

    @Column(name = "PERDESCMAXIDEALTAB", precision = 10, scale = 2)
    private BigDecimal perdescmaxidealtab;

    @Column(name = "PERDESCMAXPOSSIVELTAB", precision = 10, scale = 2)
    private BigDecimal perdescmaxpossiveltab;

    @Column(name = "PERCCOMGARANTIDATAB", precision = 10, scale = 2)
    private BigDecimal perccomgarantidatab;

    @Column(name = "PERDESCMAXAVISTATAB", precision = 10, scale = 2)
    private BigDecimal perdescmaxavistatab;

    @Column(name = "PERDESCMAXIDEAL", precision = 10, scale = 2)
    private BigDecimal perdescmaxideal;

    @Column(name = "PERCCOMGARANTIDA", precision = 10, scale = 2)
    private BigDecimal perccomgarantida;

    @Column(name = "PERDESCMAXAVISTA", precision = 10, scale = 2)
    private BigDecimal perdescmaxavista;

    @Column(name = "PERDESCMAXPOSSIVEL", precision = 10, scale = 2)
    private BigDecimal perdescmaxpossivel;

    @Column(name = "VLIPITAB", precision = 18, scale = 6)
    private BigDecimal vlipitab;

    @Column(name = "VLIPI", precision = 18, scale = 6)
    private BigDecimal vlipi;

    @Column(name = "PERCCOM", precision = 10, scale = 2)
    private BigDecimal perccom;

    @Column(name = "CUSTOPRECIFIC", precision = 18, scale = 6)
    private BigDecimal custoprecific;

    @Column(name = "CUSTOPRECIFICTAB", precision = 18, scale = 6)
    private BigDecimal custoprecifictab;

    @Column(name = "VLULTENTMES", precision = 18, scale = 6)
    private BigDecimal vlultentmes;

    @Column(name = "PTABELASEMIMPOSTO1", precision = 18, scale = 6)
    private BigDecimal ptabelasemimposto1;

    @Column(name = "PTABELASEMIMPOSTO2", precision = 18, scale = 6)
    private BigDecimal ptabelasemimposto2;

    @Column(name = "PTABELASEMIMPOSTO3", precision = 18, scale = 6)
    private BigDecimal ptabelasemimposto3;

    @Column(name = "PTABELASEMIMPOSTO4", precision = 18, scale = 6)
    private BigDecimal ptabelasemimposto4;

    @Column(name = "PTABELASEMIMPOSTO5", precision = 18, scale = 6)
    private BigDecimal ptabelasemimposto5;

    @Column(name = "PTABELASEMIMPOSTO6", precision = 18, scale = 6)
    private BigDecimal ptabelasemimposto6;

    @Column(name = "PTABELASEMIMPOSTO7", precision = 18, scale = 6)
    private BigDecimal ptabelasemimposto7;

    @Column(name = "PVENDASEMIMPOSTO1", precision = 18, scale = 6)
    private BigDecimal pvendasemimposto1;

    @Column(name = "PVENDASEMIMPOSTO2", precision = 18, scale = 6)
    private BigDecimal pvendasemimposto2;

    @Column(name = "PVENDASEMIMPOSTO3", precision = 18, scale = 6)
    private BigDecimal pvendasemimposto3;

    @Column(name = "PVENDASEMIMPOSTO4", precision = 18, scale = 6)
    private BigDecimal pvendasemimposto4;

    @Column(name = "PVENDASEMIMPOSTO5", precision = 18, scale = 6)
    private BigDecimal pvendasemimposto5;

    @Column(name = "PVENDASEMIMPOSTO6", precision = 18, scale = 6)
    private BigDecimal pvendasemimposto6;

    @Column(name = "PVENDASEMIMPOSTO7", precision = 18, scale = 6)
    private BigDecimal pvendasemimposto7;

    @Column(name = "PTABELAATACSEMIMPOSTO1", precision = 18, scale = 6)
    private BigDecimal ptabelaatacsemimposto1;

    @Column(name = "PTABELAATACSEMIMPOSTO2", precision = 18, scale = 6)
    private BigDecimal ptabelaatacsemimposto2;

    @Column(name = "PTABELAATACSEMIMPOSTO3", precision = 18, scale = 6)
    private BigDecimal ptabelaatacsemimposto3;

    @Column(name = "PTABELAATACSEMIMPOSTO4", precision = 18, scale = 6)
    private BigDecimal ptabelaatacsemimposto4;

    @Column(name = "PTABELAATACSEMIMPOSTO5", precision = 18, scale = 6)
    private BigDecimal ptabelaatacsemimposto5;

    @Column(name = "PTABELAATACSEMIMPOSTO6", precision = 18, scale = 6)
    private BigDecimal ptabelaatacsemimposto6;

    @Column(name = "PTABELAATACSEMIMPOSTO7", precision = 18, scale = 6)
    private BigDecimal ptabelaatacsemimposto7;

    @Column(name = "PVENDAATACSEMIMPOSTO1", precision = 18, scale = 6)
    private BigDecimal pvendaatacsemimposto1;

    @Column(name = "PVENDAATACSEMIMPOSTO2", precision = 18, scale = 6)
    private BigDecimal pvendaatacsemimposto2;

    @Column(name = "PVENDAATACSEMIMPOSTO3", precision = 18, scale = 6)
    private BigDecimal pvendaatacsemimposto3;

    @Column(name = "PVENDAATACSEMIMPOSTO4", precision = 18, scale = 6)
    private BigDecimal pvendaatacsemimposto4;

    @Column(name = "PVENDAATACSEMIMPOSTO5", precision = 18, scale = 6)
    private BigDecimal pvendaatacsemimposto5;

    @Column(name = "PVENDAATACSEMIMPOSTO6", precision = 18, scale = 6)
    private BigDecimal pvendaatacsemimposto6;

    @Column(name = "PVENDAATACSEMIMPOSTO7", precision = 18, scale = 6)
    private BigDecimal pvendaatacsemimposto7;

    @Column(name = "UTILIZARIOLOG", length = 1)
    private String utilizariolog;

    @Column(name = "CALCULARIPI", length = 1)
    private String calcularipi;

    @Column(name = "PERCBONIFICVENDA", precision = 5, scale = 2)
    private BigDecimal percbonificvenda;

    @Column(name = "PERCBONIFICVENDATAB", precision = 5, scale = 2)
    private BigDecimal percbonificvendatab;

    @Column(name = "PERCBONIFICVENDAANT", precision = 5, scale = 2)
    private BigDecimal percbonificvendaant;

    @Column(name = "DTIMPORT")
    private LocalDate dtimport;

    @Column(name = "TIPOPFPRECIFIC", length = 1)
    private String tipopfprecific;

    @Column(name = "PRECOFABRICAMEDTAB", precision = 18, scale = 3)
    private BigDecimal precofabricamedtab;

    @Column(name = "PRECOFABRICAMED", precision = 18, scale = 3)
    private BigDecimal precofabricamed;

    @Column(name = "TIPOSIMULACAOVENDAMED", length = 2)
    private String tiposimulacaovendamed;

    @Column(name = "CODPROMOCAOMEDTAB")
    private Integer codpromocaomedtab;

    @Column(name = "PERCDESCPROMOCAOMEDTAB", precision = 11, scale = 6)
    private BigDecimal percdescpromocaomedtab;

    @Column(name = "PERCDESCFINPROMOCAOMEDTAB", precision = 11, scale = 6)
    private BigDecimal percdescfinpromocaomedtab;

    @Column(name = "PERCCOMISSPROMOCAOMEDTAB", precision = 11, scale = 6)
    private BigDecimal perccomisspromocaomedtab;

    @Column(name = "COMBOPROMOCAOMEDTAB", length = 1)
    private String combopromocaomedtab;

    @Column(name = "PERCDESCADICCMPSIMULACAOMED", precision = 11, scale = 6)
    private BigDecimal percdescadiccmpsimulacaomed;

    @Column(name = "PERCDESCADICVNDSIMULACAOMED", precision = 11, scale = 6)
    private BigDecimal percdescadicvndsimulacaomed;

    @Column(name = "PERCREPVERBAVNDSIMULACAOMED", precision = 11, scale = 6)
    private BigDecimal percrepverbavndsimulacaomed;

    @Column(name = "QTCOMBOPROMOCAOMEDTAB", precision = 20, scale = 6)
    private BigDecimal qtcombopromocaomedtab;

    @Column(name = "PERCDESCBASERCAPROMOCAOMEDTAB", precision = 11, scale = 6)
    private BigDecimal percdescbasercapromocaomedtab;

    @Column(name = "PERCDESCCMVPROMOCAOMEDTAB", precision = 11, scale = 6)
    private BigDecimal percdesccmvpromocaomedtab;

    @Column(name = "QTMINPROMOCAOMEDTAB", precision = 20, scale = 6)
    private BigDecimal qtminpromocaomedtab;

    @Column(name = "VINCULOUPROMOCAOMEDTAB", length = 1)
    private String vinculoupromocaomedtab;

    @Lob
    @Column(name = "FORMULA")
    private String formula;

    @Column(name = "REGPRECIFICADA", length = 1)
    private String regprecificada;

    @Column(name = "VLFCPSTTAB", precision = 18, scale = 6)
    private BigDecimal vlfcpsttab;

    @Column(name = "VLFCPST", precision = 12, scale = 4)
    private BigDecimal vlfcpst;

    @Column(name = "CALCULARFECPSTVENDA", length = 1)
    private String calcularfecpstvenda;

    @Column(name = "VLULTENTCONTSEMSTTAB", precision = 18, scale = 6)
    private BigDecimal vlultentcontsemsttab;

    @Column(name = "VLULTENTCONTSEMST", precision = 18, scale = 6)
    private BigDecimal vlultentcontsemst;

    @Column(name = "REGRAALTERARDESCONTO", length = 1)
    private String regraalterardesconto;

    @Column(name = "CODFILIALINTEGRACAO")
    private Short codfilialintegracao;

    @Column(name = "DTALTERC5")
    private Instant dtalterc5;

    @Column(name = "UTILIZAMULTIPLO", length = 1)
    private String utilizamultiplo;

    @Column(name = "PRECOMINIMOTABELA", precision = 18, scale = 6)
    private BigDecimal precominimotabela;

    @Column(name = "PRECOMINIMOVENDA", precision = 18, scale = 6)
    private BigDecimal precominimovenda;

    public PctabprId getId() {
        return id;
    }

    public void setId(PctabprId id) {
        this.id = id;
    }

    public BigDecimal getPtabela() {
        return ptabela;
    }

    public void setPtabela(BigDecimal ptabela) {
        this.ptabela = ptabela;
    }

    public BigDecimal getPvenda() {
        return pvenda;
    }

    public void setPvenda(BigDecimal pvenda) {
        this.pvenda = pvenda;
    }

    public BigDecimal getPerdescmax() {
        return perdescmax;
    }

    public void setPerdescmax(BigDecimal perdescmax) {
        this.perdescmax = perdescmax;
    }

    public BigDecimal getPerdescmaxtab() {
        return perdescmaxtab;
    }

    public void setPerdescmaxtab(BigDecimal perdescmaxtab) {
        this.perdescmaxtab = perdescmaxtab;
    }

    public BigDecimal getPoferta() {
        return poferta;
    }

    public void setPoferta(BigDecimal poferta) {
        this.poferta = poferta;
    }

    public BigDecimal getPofertatab() {
        return pofertatab;
    }

    public void setPofertatab(BigDecimal pofertatab) {
        this.pofertatab = pofertatab;
    }

    public BigDecimal getMargem() {
        return margem;
    }

    public void setMargem(BigDecimal margem) {
        this.margem = margem;
    }

    public LocalDate getDtultaltpvenda() {
        return dtultaltpvenda;
    }

    public void setDtultaltpvenda(LocalDate dtultaltpvenda) {
        this.dtultaltpvenda = dtultaltpvenda;
    }

    public String getExcluido() {
        return excluido;
    }

    public void setExcluido(String excluido) {
        this.excluido = excluido;
    }

    public BigDecimal getPtabela1() {
        return ptabela1;
    }

    public void setPtabela1(BigDecimal ptabela1) {
        this.ptabela1 = ptabela1;
    }

    public BigDecimal getPtabela2() {
        return ptabela2;
    }

    public void setPtabela2(BigDecimal ptabela2) {
        this.ptabela2 = ptabela2;
    }

    public BigDecimal getPtabela3() {
        return ptabela3;
    }

    public void setPtabela3(BigDecimal ptabela3) {
        this.ptabela3 = ptabela3;
    }

    public BigDecimal getPtabela4() {
        return ptabela4;
    }

    public void setPtabela4(BigDecimal ptabela4) {
        this.ptabela4 = ptabela4;
    }

    public BigDecimal getPtabela5() {
        return ptabela5;
    }

    public void setPtabela5(BigDecimal ptabela5) {
        this.ptabela5 = ptabela5;
    }

    public BigDecimal getPtabela6() {
        return ptabela6;
    }

    public void setPtabela6(BigDecimal ptabela6) {
        this.ptabela6 = ptabela6;
    }

    public BigDecimal getPtabela7() {
        return ptabela7;
    }

    public void setPtabela7(BigDecimal ptabela7) {
        this.ptabela7 = ptabela7;
    }

    public BigDecimal getPvenda1() {
        return pvenda1;
    }

    public void setPvenda1(BigDecimal pvenda1) {
        this.pvenda1 = pvenda1;
    }

    public BigDecimal getPvenda2() {
        return pvenda2;
    }

    public void setPvenda2(BigDecimal pvenda2) {
        this.pvenda2 = pvenda2;
    }

    public BigDecimal getPvenda3() {
        return pvenda3;
    }

    public void setPvenda3(BigDecimal pvenda3) {
        this.pvenda3 = pvenda3;
    }

    public BigDecimal getPvenda4() {
        return pvenda4;
    }

    public void setPvenda4(BigDecimal pvenda4) {
        this.pvenda4 = pvenda4;
    }

    public BigDecimal getPvenda5() {
        return pvenda5;
    }

    public void setPvenda5(BigDecimal pvenda5) {
        this.pvenda5 = pvenda5;
    }

    public BigDecimal getPvenda6() {
        return pvenda6;
    }

    public void setPvenda6(BigDecimal pvenda6) {
        this.pvenda6 = pvenda6;
    }

    public BigDecimal getPvenda7() {
        return pvenda7;
    }

    public void setPvenda7(BigDecimal pvenda7) {
        this.pvenda7 = pvenda7;
    }

    public Short getCodst() {
        return codst;
    }

    public void setCodst(Short codst) {
        this.codst = codst;
    }

    public BigDecimal getMargemEsp() {
        return margemEsp;
    }

    public void setMargemEsp(BigDecimal margemEsp) {
        this.margemEsp = margemEsp;
    }

    public BigDecimal getPfrete() {
        return pfrete;
    }

    public void setPfrete(BigDecimal pfrete) {
        this.pfrete = pfrete;
    }

    public String getTabelaemitida() {
        return tabelaemitida;
    }

    public void setTabelaemitida(String tabelaemitida) {
        this.tabelaemitida = tabelaemitida;
    }

    public BigDecimal getPerdescmaxesp() {
        return perdescmaxesp;
    }

    public void setPerdescmaxesp(BigDecimal perdescmaxesp) {
        this.perdescmaxesp = perdescmaxesp;
    }

    public BigDecimal getPerdescautor() {
        return perdescautor;
    }

    public void setPerdescautor(BigDecimal perdescautor) {
        this.perdescautor = perdescautor;
    }

    public Integer getCotaitem() {
        return cotaitem;
    }

    public void setCotaitem(Integer cotaitem) {
        this.cotaitem = cotaitem;
    }

    public Integer getQtdescautor() {
        return qtdescautor;
    }

    public void setQtdescautor(Integer qtdescautor) {
        this.qtdescautor = qtdescautor;
    }

    public BigDecimal getPofertaaux() {
        return pofertaaux;
    }

    public void setPofertaaux(BigDecimal pofertaaux) {
        this.pofertaaux = pofertaaux;
    }

    public BigDecimal getPerdescautortab() {
        return perdescautortab;
    }

    public void setPerdescautortab(BigDecimal perdescautortab) {
        this.perdescautortab = perdescautortab;
    }

    public Integer getCotaitemtab() {
        return cotaitemtab;
    }

    public void setCotaitemtab(Integer cotaitemtab) {
        this.cotaitemtab = cotaitemtab;
    }

    public Integer getQtdescautortab() {
        return qtdescautortab;
    }

    public void setQtdescautortab(Integer qtdescautortab) {
        this.qtdescautortab = qtdescautortab;
    }

    public BigDecimal getPerdescmaxbalcao() {
        return perdescmaxbalcao;
    }

    public void setPerdescmaxbalcao(BigDecimal perdescmaxbalcao) {
        this.perdescmaxbalcao = perdescmaxbalcao;
    }

    public BigDecimal getPerdescmaxtabbalcao() {
        return perdescmaxtabbalcao;
    }

    public void setPerdescmaxtabbalcao(BigDecimal perdescmaxtabbalcao) {
        this.perdescmaxtabbalcao = perdescmaxtabbalcao;
    }

    public BigDecimal getPerdescfob() {
        return perdescfob;
    }

    public void setPerdescfob(BigDecimal perdescfob) {
        this.perdescfob = perdescfob;
    }

    public BigDecimal getPtabelamed() {
        return ptabelamed;
    }

    public void setPtabelamed(BigDecimal ptabelamed) {
        this.ptabelamed = ptabelamed;
    }

    public BigDecimal getPvendamed() {
        return pvendamed;
    }

    public void setPvendamed(BigDecimal pvendamed) {
        this.pvendamed = pvendamed;
    }

    public BigDecimal getPtabelamed1() {
        return ptabelamed1;
    }

    public void setPtabelamed1(BigDecimal ptabelamed1) {
        this.ptabelamed1 = ptabelamed1;
    }

    public BigDecimal getPtabelamed2() {
        return ptabelamed2;
    }

    public void setPtabelamed2(BigDecimal ptabelamed2) {
        this.ptabelamed2 = ptabelamed2;
    }

    public BigDecimal getPtabelamed3() {
        return ptabelamed3;
    }

    public void setPtabelamed3(BigDecimal ptabelamed3) {
        this.ptabelamed3 = ptabelamed3;
    }

    public BigDecimal getPtabelamed4() {
        return ptabelamed4;
    }

    public void setPtabelamed4(BigDecimal ptabelamed4) {
        this.ptabelamed4 = ptabelamed4;
    }

    public BigDecimal getPtabelamed5() {
        return ptabelamed5;
    }

    public void setPtabelamed5(BigDecimal ptabelamed5) {
        this.ptabelamed5 = ptabelamed5;
    }

    public BigDecimal getPtabelamed6() {
        return ptabelamed6;
    }

    public void setPtabelamed6(BigDecimal ptabelamed6) {
        this.ptabelamed6 = ptabelamed6;
    }

    public BigDecimal getPtabelamed7() {
        return ptabelamed7;
    }

    public void setPtabelamed7(BigDecimal ptabelamed7) {
        this.ptabelamed7 = ptabelamed7;
    }

    public BigDecimal getPvendamed1() {
        return pvendamed1;
    }

    public void setPvendamed1(BigDecimal pvendamed1) {
        this.pvendamed1 = pvendamed1;
    }

    public BigDecimal getPvendamed2() {
        return pvendamed2;
    }

    public void setPvendamed2(BigDecimal pvendamed2) {
        this.pvendamed2 = pvendamed2;
    }

    public BigDecimal getPvendamed3() {
        return pvendamed3;
    }

    public void setPvendamed3(BigDecimal pvendamed3) {
        this.pvendamed3 = pvendamed3;
    }

    public BigDecimal getPvendamed4() {
        return pvendamed4;
    }

    public void setPvendamed4(BigDecimal pvendamed4) {
        this.pvendamed4 = pvendamed4;
    }

    public BigDecimal getPvendamed5() {
        return pvendamed5;
    }

    public void setPvendamed5(BigDecimal pvendamed5) {
        this.pvendamed5 = pvendamed5;
    }

    public BigDecimal getPvendamed6() {
        return pvendamed6;
    }

    public void setPvendamed6(BigDecimal pvendamed6) {
        this.pvendamed6 = pvendamed6;
    }

    public BigDecimal getPvendamed7() {
        return pvendamed7;
    }

    public void setPvendamed7(BigDecimal pvendamed7) {
        this.pvendamed7 = pvendamed7;
    }

    public String getDescontafrete() {
        return descontafrete;
    }

    public void setDescontafrete(String descontafrete) {
        this.descontafrete = descontafrete;
    }

    public LocalDate getDtinicioptabela() {
        return dtinicioptabela;
    }

    public void setDtinicioptabela(LocalDate dtinicioptabela) {
        this.dtinicioptabela = dtinicioptabela;
    }

    public BigDecimal getPtabelafuturo() {
        return ptabelafuturo;
    }

    public void setPtabelafuturo(BigDecimal ptabelafuturo) {
        this.ptabelafuturo = ptabelafuturo;
    }

    public LocalDate getDtultaltptabelafuturo() {
        return dtultaltptabelafuturo;
    }

    public void setDtultaltptabelafuturo(LocalDate dtultaltptabelafuturo) {
        this.dtultaltptabelafuturo = dtultaltptabelafuturo;
    }

    public LocalDate getDtultaltptabela() {
        return dtultaltptabela;
    }

    public void setDtultaltptabela(LocalDate dtultaltptabela) {
        this.dtultaltptabela = dtultaltptabela;
    }

    public BigDecimal getPcomrep1() {
        return pcomrep1;
    }

    public void setPcomrep1(BigDecimal pcomrep1) {
        this.pcomrep1 = pcomrep1;
    }

    public BigDecimal getPcomrep2() {
        return pcomrep2;
    }

    public void setPcomrep2(BigDecimal pcomrep2) {
        this.pcomrep2 = pcomrep2;
    }

    public BigDecimal getPcomrep3() {
        return pcomrep3;
    }

    public void setPcomrep3(BigDecimal pcomrep3) {
        this.pcomrep3 = pcomrep3;
    }

    public BigDecimal getPercacrescimofrete() {
        return percacrescimofrete;
    }

    public void setPercacrescimofrete(BigDecimal percacrescimofrete) {
        this.percacrescimofrete = percacrescimofrete;
    }

    public LocalDate getDtemissaoetiq() {
        return dtemissaoetiq;
    }

    public void setDtemissaoetiq(LocalDate dtemissaoetiq) {
        this.dtemissaoetiq = dtemissaoetiq;
    }

    public Long getNumseqatu() {
        return numseqatu;
    }

    public void setNumseqatu(Long numseqatu) {
        this.numseqatu = numseqatu;
    }

    public BigDecimal getPrecofab() {
        return precofab;
    }

    public void setPrecofab(BigDecimal precofab) {
        this.precofab = precofab;
    }

    public String getAtualizar() {
        return atualizar;
    }

    public void setAtualizar(String atualizar) {
        this.atualizar = atualizar;
    }

    public BigDecimal getPtabelaatac() {
        return ptabelaatac;
    }

    public void setPtabelaatac(BigDecimal ptabelaatac) {
        this.ptabelaatac = ptabelaatac;
    }

    public BigDecimal getPtabelaatac1() {
        return ptabelaatac1;
    }

    public void setPtabelaatac1(BigDecimal ptabelaatac1) {
        this.ptabelaatac1 = ptabelaatac1;
    }

    public BigDecimal getPtabelaatac2() {
        return ptabelaatac2;
    }

    public void setPtabelaatac2(BigDecimal ptabelaatac2) {
        this.ptabelaatac2 = ptabelaatac2;
    }

    public BigDecimal getPtabelaatac3() {
        return ptabelaatac3;
    }

    public void setPtabelaatac3(BigDecimal ptabelaatac3) {
        this.ptabelaatac3 = ptabelaatac3;
    }

    public BigDecimal getPtabelaatac4() {
        return ptabelaatac4;
    }

    public void setPtabelaatac4(BigDecimal ptabelaatac4) {
        this.ptabelaatac4 = ptabelaatac4;
    }

    public BigDecimal getPtabelaatac5() {
        return ptabelaatac5;
    }

    public void setPtabelaatac5(BigDecimal ptabelaatac5) {
        this.ptabelaatac5 = ptabelaatac5;
    }

    public BigDecimal getPtabelaatac6() {
        return ptabelaatac6;
    }

    public void setPtabelaatac6(BigDecimal ptabelaatac6) {
        this.ptabelaatac6 = ptabelaatac6;
    }

    public BigDecimal getPtabelaatac7() {
        return ptabelaatac7;
    }

    public void setPtabelaatac7(BigDecimal ptabelaatac7) {
        this.ptabelaatac7 = ptabelaatac7;
    }

    public BigDecimal getPvendaatac() {
        return pvendaatac;
    }

    public void setPvendaatac(BigDecimal pvendaatac) {
        this.pvendaatac = pvendaatac;
    }

    public BigDecimal getPvendaatac1() {
        return pvendaatac1;
    }

    public void setPvendaatac1(BigDecimal pvendaatac1) {
        this.pvendaatac1 = pvendaatac1;
    }

    public BigDecimal getPvendaatac2() {
        return pvendaatac2;
    }

    public void setPvendaatac2(BigDecimal pvendaatac2) {
        this.pvendaatac2 = pvendaatac2;
    }

    public BigDecimal getPvendaatac3() {
        return pvendaatac3;
    }

    public void setPvendaatac3(BigDecimal pvendaatac3) {
        this.pvendaatac3 = pvendaatac3;
    }

    public BigDecimal getPvendaatac4() {
        return pvendaatac4;
    }

    public void setPvendaatac4(BigDecimal pvendaatac4) {
        this.pvendaatac4 = pvendaatac4;
    }

    public BigDecimal getPvendaatac5() {
        return pvendaatac5;
    }

    public void setPvendaatac5(BigDecimal pvendaatac5) {
        this.pvendaatac5 = pvendaatac5;
    }

    public BigDecimal getPvendaatac6() {
        return pvendaatac6;
    }

    public void setPvendaatac6(BigDecimal pvendaatac6) {
        this.pvendaatac6 = pvendaatac6;
    }

    public BigDecimal getPvendaatac7() {
        return pvendaatac7;
    }

    public void setPvendaatac7(BigDecimal pvendaatac7) {
        this.pvendaatac7 = pvendaatac7;
    }

    public BigDecimal getPrecoanterioratac() {
        return precoanterioratac;
    }

    public void setPrecoanterioratac(BigDecimal precoanterioratac) {
        this.precoanterioratac = precoanterioratac;
    }

    public BigDecimal getVlacresfretekg() {
        return vlacresfretekg;
    }

    public void setVlacresfretekg(BigDecimal vlacresfretekg) {
        this.vlacresfretekg = vlacresfretekg;
    }

    public LocalDate getDtiniciovalidade() {
        return dtiniciovalidade;
    }

    public void setDtiniciovalidade(LocalDate dtiniciovalidade) {
        this.dtiniciovalidade = dtiniciovalidade;
    }

    public LocalDate getDtfimvalidade() {
        return dtfimvalidade;
    }

    public void setDtfimvalidade(LocalDate dtfimvalidade) {
        this.dtfimvalidade = dtfimvalidade;
    }

    public BigDecimal getIndicepreco() {
        return indicepreco;
    }

    public void setIndicepreco(BigDecimal indicepreco) {
        this.indicepreco = indicepreco;
    }

    public BigDecimal getPercipivendatab() {
        return percipivendatab;
    }

    public void setPercipivendatab(BigDecimal percipivendatab) {
        this.percipivendatab = percipivendatab;
    }

    public BigDecimal getVlpautaipivendatab() {
        return vlpautaipivendatab;
    }

    public void setVlpautaipivendatab(BigDecimal vlpautaipivendatab) {
        this.vlpautaipivendatab = vlpautaipivendatab;
    }

    public BigDecimal getVlipiporkgvendatab() {
        return vlipiporkgvendatab;
    }

    public void setVlipiporkgvendatab(BigDecimal vlipiporkgvendatab) {
        this.vlipiporkgvendatab = vlipiporkgvendatab;
    }

    public BigDecimal getPrecomaxconsum() {
        return precomaxconsum;
    }

    public void setPrecomaxconsum(BigDecimal precomaxconsum) {
        this.precomaxconsum = precomaxconsum;
    }

    public LocalDate getDtimportintegracao() {
        return dtimportintegracao;
    }

    public void setDtimportintegracao(LocalDate dtimportintegracao) {
        this.dtimportintegracao = dtimportintegracao;
    }

    public LocalDate getDtultaltersrvprc() {
        return dtultaltersrvprc;
    }

    public void setDtultaltersrvprc(LocalDate dtultaltersrvprc) {
        this.dtultaltersrvprc = dtultaltersrvprc;
    }

    public LocalDate getDtultatupvenda() {
        return dtultatupvenda;
    }

    public void setDtultatupvenda(LocalDate dtultatupvenda) {
        this.dtultatupvenda = dtultatupvenda;
    }

    public BigDecimal getPrecomaxconsumtab() {
        return precomaxconsumtab;
    }

    public void setPrecomaxconsumtab(BigDecimal precomaxconsumtab) {
        this.precomaxconsumtab = precomaxconsumtab;
    }

    public BigDecimal getPercdescsimplesnac() {
        return percdescsimplesnac;
    }

    public void setPercdescsimplesnac(BigDecimal percdescsimplesnac) {
        this.percdescsimplesnac = percdescsimplesnac;
    }

    public BigDecimal getVlsttab() {
        return vlsttab;
    }

    public void setVlsttab(BigDecimal vlsttab) {
        this.vlsttab = vlsttab;
    }

    public BigDecimal getVlst() {
        return vlst;
    }

    public void setVlst(BigDecimal vlst) {
        this.vlst = vlst;
    }

    public Short getCodtribpiscofins() {
        return codtribpiscofins;
    }

    public void setCodtribpiscofins(Short codtribpiscofins) {
        this.codtribpiscofins = codtribpiscofins;
    }

    public BigDecimal getPrecorevista() {
        return precorevista;
    }

    public void setPrecorevista(BigDecimal precorevista) {
        this.precorevista = precorevista;
    }

    public LocalDate getDtvalprevista() {
        return dtvalprevista;
    }

    public void setDtvalprevista(LocalDate dtvalprevista) {
        this.dtvalprevista = dtvalprevista;
    }

    public String getRotina() {
        return rotina;
    }

    public void setRotina(String rotina) {
        this.rotina = rotina;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public BigDecimal getPerdescmaxidealtab() {
        return perdescmaxidealtab;
    }

    public void setPerdescmaxidealtab(BigDecimal perdescmaxidealtab) {
        this.perdescmaxidealtab = perdescmaxidealtab;
    }

    public BigDecimal getPerdescmaxpossiveltab() {
        return perdescmaxpossiveltab;
    }

    public void setPerdescmaxpossiveltab(BigDecimal perdescmaxpossiveltab) {
        this.perdescmaxpossiveltab = perdescmaxpossiveltab;
    }

    public BigDecimal getPerccomgarantidatab() {
        return perccomgarantidatab;
    }

    public void setPerccomgarantidatab(BigDecimal perccomgarantidatab) {
        this.perccomgarantidatab = perccomgarantidatab;
    }

    public BigDecimal getPerdescmaxavistatab() {
        return perdescmaxavistatab;
    }

    public void setPerdescmaxavistatab(BigDecimal perdescmaxavistatab) {
        this.perdescmaxavistatab = perdescmaxavistatab;
    }

    public BigDecimal getPerdescmaxideal() {
        return perdescmaxideal;
    }

    public void setPerdescmaxideal(BigDecimal perdescmaxideal) {
        this.perdescmaxideal = perdescmaxideal;
    }

    public BigDecimal getPerccomgarantida() {
        return perccomgarantida;
    }

    public void setPerccomgarantida(BigDecimal perccomgarantida) {
        this.perccomgarantida = perccomgarantida;
    }

    public BigDecimal getPerdescmaxavista() {
        return perdescmaxavista;
    }

    public void setPerdescmaxavista(BigDecimal perdescmaxavista) {
        this.perdescmaxavista = perdescmaxavista;
    }

    public BigDecimal getPerdescmaxpossivel() {
        return perdescmaxpossivel;
    }

    public void setPerdescmaxpossivel(BigDecimal perdescmaxpossivel) {
        this.perdescmaxpossivel = perdescmaxpossivel;
    }

    public BigDecimal getVlipitab() {
        return vlipitab;
    }

    public void setVlipitab(BigDecimal vlipitab) {
        this.vlipitab = vlipitab;
    }

    public BigDecimal getVlipi() {
        return vlipi;
    }

    public void setVlipi(BigDecimal vlipi) {
        this.vlipi = vlipi;
    }

    public BigDecimal getPerccom() {
        return perccom;
    }

    public void setPerccom(BigDecimal perccom) {
        this.perccom = perccom;
    }

    public BigDecimal getCustoprecific() {
        return custoprecific;
    }

    public void setCustoprecific(BigDecimal custoprecific) {
        this.custoprecific = custoprecific;
    }

    public BigDecimal getCustoprecifictab() {
        return custoprecifictab;
    }

    public void setCustoprecifictab(BigDecimal custoprecifictab) {
        this.custoprecifictab = custoprecifictab;
    }

    public BigDecimal getVlultentmes() {
        return vlultentmes;
    }

    public void setVlultentmes(BigDecimal vlultentmes) {
        this.vlultentmes = vlultentmes;
    }

    public BigDecimal getPtabelasemimposto1() {
        return ptabelasemimposto1;
    }

    public void setPtabelasemimposto1(BigDecimal ptabelasemimposto1) {
        this.ptabelasemimposto1 = ptabelasemimposto1;
    }

    public BigDecimal getPtabelasemimposto2() {
        return ptabelasemimposto2;
    }

    public void setPtabelasemimposto2(BigDecimal ptabelasemimposto2) {
        this.ptabelasemimposto2 = ptabelasemimposto2;
    }

    public BigDecimal getPtabelasemimposto3() {
        return ptabelasemimposto3;
    }

    public void setPtabelasemimposto3(BigDecimal ptabelasemimposto3) {
        this.ptabelasemimposto3 = ptabelasemimposto3;
    }

    public BigDecimal getPtabelasemimposto4() {
        return ptabelasemimposto4;
    }

    public void setPtabelasemimposto4(BigDecimal ptabelasemimposto4) {
        this.ptabelasemimposto4 = ptabelasemimposto4;
    }

    public BigDecimal getPtabelasemimposto5() {
        return ptabelasemimposto5;
    }

    public void setPtabelasemimposto5(BigDecimal ptabelasemimposto5) {
        this.ptabelasemimposto5 = ptabelasemimposto5;
    }

    public BigDecimal getPtabelasemimposto6() {
        return ptabelasemimposto6;
    }

    public void setPtabelasemimposto6(BigDecimal ptabelasemimposto6) {
        this.ptabelasemimposto6 = ptabelasemimposto6;
    }

    public BigDecimal getPtabelasemimposto7() {
        return ptabelasemimposto7;
    }

    public void setPtabelasemimposto7(BigDecimal ptabelasemimposto7) {
        this.ptabelasemimposto7 = ptabelasemimposto7;
    }

    public BigDecimal getPvendasemimposto1() {
        return pvendasemimposto1;
    }

    public void setPvendasemimposto1(BigDecimal pvendasemimposto1) {
        this.pvendasemimposto1 = pvendasemimposto1;
    }

    public BigDecimal getPvendasemimposto2() {
        return pvendasemimposto2;
    }

    public void setPvendasemimposto2(BigDecimal pvendasemimposto2) {
        this.pvendasemimposto2 = pvendasemimposto2;
    }

    public BigDecimal getPvendasemimposto3() {
        return pvendasemimposto3;
    }

    public void setPvendasemimposto3(BigDecimal pvendasemimposto3) {
        this.pvendasemimposto3 = pvendasemimposto3;
    }

    public BigDecimal getPvendasemimposto4() {
        return pvendasemimposto4;
    }

    public void setPvendasemimposto4(BigDecimal pvendasemimposto4) {
        this.pvendasemimposto4 = pvendasemimposto4;
    }

    public BigDecimal getPvendasemimposto5() {
        return pvendasemimposto5;
    }

    public void setPvendasemimposto5(BigDecimal pvendasemimposto5) {
        this.pvendasemimposto5 = pvendasemimposto5;
    }

    public BigDecimal getPvendasemimposto6() {
        return pvendasemimposto6;
    }

    public void setPvendasemimposto6(BigDecimal pvendasemimposto6) {
        this.pvendasemimposto6 = pvendasemimposto6;
    }

    public BigDecimal getPvendasemimposto7() {
        return pvendasemimposto7;
    }

    public void setPvendasemimposto7(BigDecimal pvendasemimposto7) {
        this.pvendasemimposto7 = pvendasemimposto7;
    }

    public BigDecimal getPtabelaatacsemimposto1() {
        return ptabelaatacsemimposto1;
    }

    public void setPtabelaatacsemimposto1(BigDecimal ptabelaatacsemimposto1) {
        this.ptabelaatacsemimposto1 = ptabelaatacsemimposto1;
    }

    public BigDecimal getPtabelaatacsemimposto2() {
        return ptabelaatacsemimposto2;
    }

    public void setPtabelaatacsemimposto2(BigDecimal ptabelaatacsemimposto2) {
        this.ptabelaatacsemimposto2 = ptabelaatacsemimposto2;
    }

    public BigDecimal getPtabelaatacsemimposto3() {
        return ptabelaatacsemimposto3;
    }

    public void setPtabelaatacsemimposto3(BigDecimal ptabelaatacsemimposto3) {
        this.ptabelaatacsemimposto3 = ptabelaatacsemimposto3;
    }

    public BigDecimal getPtabelaatacsemimposto4() {
        return ptabelaatacsemimposto4;
    }

    public void setPtabelaatacsemimposto4(BigDecimal ptabelaatacsemimposto4) {
        this.ptabelaatacsemimposto4 = ptabelaatacsemimposto4;
    }

    public BigDecimal getPtabelaatacsemimposto5() {
        return ptabelaatacsemimposto5;
    }

    public void setPtabelaatacsemimposto5(BigDecimal ptabelaatacsemimposto5) {
        this.ptabelaatacsemimposto5 = ptabelaatacsemimposto5;
    }

    public BigDecimal getPtabelaatacsemimposto6() {
        return ptabelaatacsemimposto6;
    }

    public void setPtabelaatacsemimposto6(BigDecimal ptabelaatacsemimposto6) {
        this.ptabelaatacsemimposto6 = ptabelaatacsemimposto6;
    }

    public BigDecimal getPtabelaatacsemimposto7() {
        return ptabelaatacsemimposto7;
    }

    public void setPtabelaatacsemimposto7(BigDecimal ptabelaatacsemimposto7) {
        this.ptabelaatacsemimposto7 = ptabelaatacsemimposto7;
    }

    public BigDecimal getPvendaatacsemimposto1() {
        return pvendaatacsemimposto1;
    }

    public void setPvendaatacsemimposto1(BigDecimal pvendaatacsemimposto1) {
        this.pvendaatacsemimposto1 = pvendaatacsemimposto1;
    }

    public BigDecimal getPvendaatacsemimposto2() {
        return pvendaatacsemimposto2;
    }

    public void setPvendaatacsemimposto2(BigDecimal pvendaatacsemimposto2) {
        this.pvendaatacsemimposto2 = pvendaatacsemimposto2;
    }

    public BigDecimal getPvendaatacsemimposto3() {
        return pvendaatacsemimposto3;
    }

    public void setPvendaatacsemimposto3(BigDecimal pvendaatacsemimposto3) {
        this.pvendaatacsemimposto3 = pvendaatacsemimposto3;
    }

    public BigDecimal getPvendaatacsemimposto4() {
        return pvendaatacsemimposto4;
    }

    public void setPvendaatacsemimposto4(BigDecimal pvendaatacsemimposto4) {
        this.pvendaatacsemimposto4 = pvendaatacsemimposto4;
    }

    public BigDecimal getPvendaatacsemimposto5() {
        return pvendaatacsemimposto5;
    }

    public void setPvendaatacsemimposto5(BigDecimal pvendaatacsemimposto5) {
        this.pvendaatacsemimposto5 = pvendaatacsemimposto5;
    }

    public BigDecimal getPvendaatacsemimposto6() {
        return pvendaatacsemimposto6;
    }

    public void setPvendaatacsemimposto6(BigDecimal pvendaatacsemimposto6) {
        this.pvendaatacsemimposto6 = pvendaatacsemimposto6;
    }

    public BigDecimal getPvendaatacsemimposto7() {
        return pvendaatacsemimposto7;
    }

    public void setPvendaatacsemimposto7(BigDecimal pvendaatacsemimposto7) {
        this.pvendaatacsemimposto7 = pvendaatacsemimposto7;
    }

    public String getUtilizariolog() {
        return utilizariolog;
    }

    public void setUtilizariolog(String utilizariolog) {
        this.utilizariolog = utilizariolog;
    }

    public String getCalcularipi() {
        return calcularipi;
    }

    public void setCalcularipi(String calcularipi) {
        this.calcularipi = calcularipi;
    }

    public BigDecimal getPercbonificvenda() {
        return percbonificvenda;
    }

    public void setPercbonificvenda(BigDecimal percbonificvenda) {
        this.percbonificvenda = percbonificvenda;
    }

    public BigDecimal getPercbonificvendatab() {
        return percbonificvendatab;
    }

    public void setPercbonificvendatab(BigDecimal percbonificvendatab) {
        this.percbonificvendatab = percbonificvendatab;
    }

    public BigDecimal getPercbonificvendaant() {
        return percbonificvendaant;
    }

    public void setPercbonificvendaant(BigDecimal percbonificvendaant) {
        this.percbonificvendaant = percbonificvendaant;
    }

    public LocalDate getDtimport() {
        return dtimport;
    }

    public void setDtimport(LocalDate dtimport) {
        this.dtimport = dtimport;
    }

    public String getTipopfprecific() {
        return tipopfprecific;
    }

    public void setTipopfprecific(String tipopfprecific) {
        this.tipopfprecific = tipopfprecific;
    }

    public BigDecimal getPrecofabricamedtab() {
        return precofabricamedtab;
    }

    public void setPrecofabricamedtab(BigDecimal precofabricamedtab) {
        this.precofabricamedtab = precofabricamedtab;
    }

    public BigDecimal getPrecofabricamed() {
        return precofabricamed;
    }

    public void setPrecofabricamed(BigDecimal precofabricamed) {
        this.precofabricamed = precofabricamed;
    }

    public String getTiposimulacaovendamed() {
        return tiposimulacaovendamed;
    }

    public void setTiposimulacaovendamed(String tiposimulacaovendamed) {
        this.tiposimulacaovendamed = tiposimulacaovendamed;
    }

    public Integer getCodpromocaomedtab() {
        return codpromocaomedtab;
    }

    public void setCodpromocaomedtab(Integer codpromocaomedtab) {
        this.codpromocaomedtab = codpromocaomedtab;
    }

    public BigDecimal getPercdescpromocaomedtab() {
        return percdescpromocaomedtab;
    }

    public void setPercdescpromocaomedtab(BigDecimal percdescpromocaomedtab) {
        this.percdescpromocaomedtab = percdescpromocaomedtab;
    }

    public BigDecimal getPercdescfinpromocaomedtab() {
        return percdescfinpromocaomedtab;
    }

    public void setPercdescfinpromocaomedtab(BigDecimal percdescfinpromocaomedtab) {
        this.percdescfinpromocaomedtab = percdescfinpromocaomedtab;
    }

    public BigDecimal getPerccomisspromocaomedtab() {
        return perccomisspromocaomedtab;
    }

    public void setPerccomisspromocaomedtab(BigDecimal perccomisspromocaomedtab) {
        this.perccomisspromocaomedtab = perccomisspromocaomedtab;
    }

    public String getCombopromocaomedtab() {
        return combopromocaomedtab;
    }

    public void setCombopromocaomedtab(String combopromocaomedtab) {
        this.combopromocaomedtab = combopromocaomedtab;
    }

    public BigDecimal getPercdescadiccmpsimulacaomed() {
        return percdescadiccmpsimulacaomed;
    }

    public void setPercdescadiccmpsimulacaomed(BigDecimal percdescadiccmpsimulacaomed) {
        this.percdescadiccmpsimulacaomed = percdescadiccmpsimulacaomed;
    }

    public BigDecimal getPercdescadicvndsimulacaomed() {
        return percdescadicvndsimulacaomed;
    }

    public void setPercdescadicvndsimulacaomed(BigDecimal percdescadicvndsimulacaomed) {
        this.percdescadicvndsimulacaomed = percdescadicvndsimulacaomed;
    }

    public BigDecimal getPercrepverbavndsimulacaomed() {
        return percrepverbavndsimulacaomed;
    }

    public void setPercrepverbavndsimulacaomed(BigDecimal percrepverbavndsimulacaomed) {
        this.percrepverbavndsimulacaomed = percrepverbavndsimulacaomed;
    }

    public BigDecimal getQtcombopromocaomedtab() {
        return qtcombopromocaomedtab;
    }

    public void setQtcombopromocaomedtab(BigDecimal qtcombopromocaomedtab) {
        this.qtcombopromocaomedtab = qtcombopromocaomedtab;
    }

    public BigDecimal getPercdescbasercapromocaomedtab() {
        return percdescbasercapromocaomedtab;
    }

    public void setPercdescbasercapromocaomedtab(BigDecimal percdescbasercapromocaomedtab) {
        this.percdescbasercapromocaomedtab = percdescbasercapromocaomedtab;
    }

    public BigDecimal getPercdesccmvpromocaomedtab() {
        return percdesccmvpromocaomedtab;
    }

    public void setPercdesccmvpromocaomedtab(BigDecimal percdesccmvpromocaomedtab) {
        this.percdesccmvpromocaomedtab = percdesccmvpromocaomedtab;
    }

    public BigDecimal getQtminpromocaomedtab() {
        return qtminpromocaomedtab;
    }

    public void setQtminpromocaomedtab(BigDecimal qtminpromocaomedtab) {
        this.qtminpromocaomedtab = qtminpromocaomedtab;
    }

    public String getVinculoupromocaomedtab() {
        return vinculoupromocaomedtab;
    }

    public void setVinculoupromocaomedtab(String vinculoupromocaomedtab) {
        this.vinculoupromocaomedtab = vinculoupromocaomedtab;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getRegprecificada() {
        return regprecificada;
    }

    public void setRegprecificada(String regprecificada) {
        this.regprecificada = regprecificada;
    }

    public BigDecimal getVlfcpsttab() {
        return vlfcpsttab;
    }

    public void setVlfcpsttab(BigDecimal vlfcpsttab) {
        this.vlfcpsttab = vlfcpsttab;
    }

    public BigDecimal getVlfcpst() {
        return vlfcpst;
    }

    public void setVlfcpst(BigDecimal vlfcpst) {
        this.vlfcpst = vlfcpst;
    }

    public String getCalcularfecpstvenda() {
        return calcularfecpstvenda;
    }

    public void setCalcularfecpstvenda(String calcularfecpstvenda) {
        this.calcularfecpstvenda = calcularfecpstvenda;
    }

    public BigDecimal getVlultentcontsemsttab() {
        return vlultentcontsemsttab;
    }

    public void setVlultentcontsemsttab(BigDecimal vlultentcontsemsttab) {
        this.vlultentcontsemsttab = vlultentcontsemsttab;
    }

    public BigDecimal getVlultentcontsemst() {
        return vlultentcontsemst;
    }

    public void setVlultentcontsemst(BigDecimal vlultentcontsemst) {
        this.vlultentcontsemst = vlultentcontsemst;
    }

    public String getRegraalterardesconto() {
        return regraalterardesconto;
    }

    public void setRegraalterardesconto(String regraalterardesconto) {
        this.regraalterardesconto = regraalterardesconto;
    }

    public Short getCodfilialintegracao() {
        return codfilialintegracao;
    }

    public void setCodfilialintegracao(Short codfilialintegracao) {
        this.codfilialintegracao = codfilialintegracao;
    }

    public Instant getDtalterc5() {
        return dtalterc5;
    }

    public void setDtalterc5(Instant dtalterc5) {
        this.dtalterc5 = dtalterc5;
    }

    public String getUtilizamultiplo() {
        return utilizamultiplo;
    }

    public void setUtilizamultiplo(String utilizamultiplo) {
        this.utilizamultiplo = utilizamultiplo;
    }

    public BigDecimal getPrecominimotabela() {
        return precominimotabela;
    }

    public void setPrecominimotabela(BigDecimal precominimotabela) {
        this.precominimotabela = precominimotabela;
    }

    public BigDecimal getPrecominimovenda() {
        return precominimovenda;
    }

    public void setPrecominimovenda(BigDecimal precominimovenda) {
        this.precominimovenda = precominimovenda;
    }

}