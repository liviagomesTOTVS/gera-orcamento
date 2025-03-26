package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "PCCAIXA")
public class Pccaixa {
    @Id
    @Column(name = "NUMCAIXA", nullable = false)
    private Short id;

    @Column(name = "DESCRICAO", length = 40)
    private String descricao;

    @Column(name = "POSICAO", length = 1)
    private String posicao;

    @Column(name = "CODFUNCCX")
    private Integer codfunccx;

    @Column(name = "DTINICIO")
    private LocalDate dtinicio;

    @Column(name = "DTFIM")
    private LocalDate dtfim;

    @Column(name = "TIPOIMPRESSORA", length = 2)
    private String tipoimpressora;

    @Column(name = "PORTAIMPRESSORA")
    private Short portaimpressora;

    @Column(name = "NUMSERIEEQUIP", length = 30)
    private String numserieequip;

    @Column(name = "PORTALEITOR")
    private Short portaleitor;

    @Column(name = "VERSAOIMPRESSORA", length = 40)
    private String versaoimpressora;

    @Column(name = "PERMITEABRIRGAVETA", length = 1)
    private String permiteabrirgaveta;

    @Column(name = "GAVETAACOPLADA", length = 1)
    private String gavetaacoplada;

    @Column(name = "TIPOTEF", length = 4)
    private String tipotef;

    @Column(name = "PORTALEITORCH")
    private Short portaleitorch;

    @Column(name = "VALIDACH", length = 1)
    private String validach;

    @Column(name = "NUMREGIAO")
    private Short numregiao;

    @Column(name = "CODFILIAL", length = 2)
    private String codfilial;

    @Column(name = "NUMOPCX")
    private Short numopcx;

    @Column(name = "TIPOIMPRESSORACHEQUE", length = 1)
    private String tipoimpressoracheque;

    @Column(name = "VERSAOIMPRESSORACHEQUE", length = 5)
    private String versaoimpressoracheque;

    @Column(name = "PORTAIMPRESSORACHEQUE")
    private Short portaimpressoracheque;

    @Column(name = "NUMCUPOMABERTO")
    private Long numcupomaberto;

    @Column(name = "NUMCUPOMFECHADO")
    private Long numcupomfechado;

    @Column(name = "DIRATUALIZACAO", length = 200)
    private String diratualizacao;

    @Column(name = "DEGUSTACAO", length = 1)
    private String degustacao;

    @Column(name = "TIPOTECLADO", length = 5)
    private String tipoteclado;

    @Column(name = "TIPOBALANCA", length = 1)
    private String tipobalanca;

    @Column(name = "SALTARLINHATEF", length = 1)
    private String saltarlinhatef;

    @Column(name = "MSGCUPOMFISCAL", length = 40)
    private String msgcupomfiscal;

    @Column(name = "ADMISSAO")
    private LocalDate admissao;

    @Column(name = "NUMCAIXAFISCAL")
    private Short numcaixafiscal;

    @Column(name = "MODELO", length = 10)
    private String modelo;

    @Column(name = "ATUALIZACESTABASICA", length = 1)
    private String atualizacestabasica;

    @Column(name = "ATUALIZAPLANO", length = 1)
    private String atualizaplano;

    @Column(name = "ATUALIZAFORMAPG", length = 1)
    private String atualizaformapg;

    @Column(name = "ATUALIZAEMPREGADO", length = 1)
    private String atualizaempregado;

    @Column(name = "ATUALIZALAYOUT", length = 1)
    private String atualizalayout;

    @Column(name = "ATUALIZASETOR", length = 1)
    private String atualizasetor;

    @Column(name = "ATUALIZATRIBUTACAO", length = 1)
    private String atualizatributacao;

    @Column(name = "ATUALIZACLIENTE", length = 1)
    private String atualizacliente;

    @Column(name = "ATUALIZACLIENTEDTINI")
    private LocalDate atualizaclientedtini;

    @Column(name = "ATUALIZACLIENTEDTFIM")
    private LocalDate atualizaclientedtfim;

    @Column(name = "ATUALIZACFO", length = 1)
    private String atualizacfo;

    @Column(name = "ATUALIZAPRODUTO", length = 1)
    private String atualizaproduto;

    @Column(name = "ATUALIZAPRODUTODTINI")
    private LocalDate atualizaprodutodtini;

    @Column(name = "ATUALIZAPRODUTODTFIM")
    private LocalDate atualizaprodutodtfim;

    @Column(name = "ATUALIZAPRECOEMBALAGEM", length = 1)
    private String atualizaprecoembalagem;

    @Column(name = "ATUALIZAPRECOEMBALAGEMDTINI")
    private LocalDate atualizaprecoembalagemdtini;

    @Column(name = "ATUALIZAPRECOEMBALAGEMDTFIM")
    private LocalDate atualizaprecoembalagemdtfim;

    @Column(name = "ATUALIZAPRECOREGIAO", length = 1)
    private String atualizaprecoregiao;

    @Column(name = "ATUALIZAPRECOREGIAODTINI")
    private LocalDate atualizaprecoregiaodtini;

    @Column(name = "ATUALIZAPRECOREGIAODTFIM")
    private LocalDate atualizaprecoregiaodtfim;

    @Column(name = "IPSERVIDORSITEF", length = 20)
    private String ipservidorsitef;

    @Column(name = "CODEMPRESASITEF", length = 20)
    private String codempresasitef;

    @Column(name = "TERMINALSITEF", length = 20)
    private String terminalsitef;

    @Column(name = "ATUALIZAPCCOMISSAOPLPAG", length = 1)
    private String atualizapccomissaoplpag;

    @Column(name = "ATUALIZAPCCOMISSAOUSUR", length = 1)
    private String atualizapccomissaousur;

    @Column(name = "BITSPORSEGUNDOLEITOR", length = 10)
    private String bitsporsegundoleitor;

    @Column(name = "BITSDEDADOSLEITOR", length = 10)
    private String bitsdedadosleitor;

    @Column(name = "PARIDADELEITOR", length = 10)
    private String paridadeleitor;

    @Column(name = "RESPSITEFTECLADO", length = 1)
    private String respsitefteclado;

    @Column(name = "CODBANCO")
    private Short codbanco;

    @Column(name = "USAINDICEECF", length = 1)
    private String usaindiceecf;

    @Column(name = "ITENSCARGAGERAL", length = 200)
    private String itenscargageral;

    @Column(name = "DTPROXCARGAGERAL")
    private LocalDate dtproxcargageral;

    @Column(name = "DTULTCARGAGERAL")
    private LocalDate dtultcargageral;

    @Column(name = "ITENSCARGAPARCIAL", length = 200)
    private String itenscargaparcial;

    @Column(name = "DTPROXCARGAPARCIAL")
    private LocalDate dtproxcargaparcial;

    @Column(name = "DATAINIPARC")
    private LocalDate datainiparc;

    @Column(name = "DTULTCARGAPARCIAL")
    private LocalDate dtultcargaparcial;

    @Column(name = "DATAFIMPARC")
    private LocalDate datafimparc;

    @Column(name = "CODPRODPARC")
    private Integer codprodparc;

    @Column(name = "CODCLIPARC")
    private Integer codcliparc;

    @Column(name = "USASUFIXOLEITOR", length = 1)
    private String usasufixoleitor;

    @Column(name = "ATUALIZAPRECOFIMVENDA", length = 1)
    private String atualizaprecofimvenda;

    @Column(name = "CONFIRMAR_CARGA", length = 1)
    private String confirmarCarga;

    @Column(name = "NUMUSUARIOECF")
    private Short numusuarioecf;

    @Column(name = "VERFIRMWARE", length = 15)
    private String verfirmware;

    @Column(name = "CODNACIONALECF", length = 6)
    private String codnacionalecf;

    @Column(name = "DTSWBASICO")
    private LocalDate dtswbasico;

    @Column(name = "DTREINICIOOP")
    private LocalDate dtreinicioop;

    @Column(name = "DTSWUSUARIO")
    private LocalDate dtswusuario;

    @Column(name = "MODELOECF", length = 40)
    private String modeloecf;

    @Column(name = "DTPROXATULIZACAO")
    private Short dtproxatulizacao;

    @Column(name = "SOLICITARCAVENDA", length = 1)
    private String solicitarcavenda;

    @Column(name = "POSSUIGUILHOTINA", length = 1)
    private String possuiguilhotina;

    @Column(name = "TIPOCAIXA", length = 1)
    private String tipocaixa;

    @Column(name = "TIPODECAIXA", length = 15)
    private String tipodecaixa;

    @Column(name = "PROXNUMNFCE")
    private Long proxnumnfce;

    @Column(name = "PROXNUMFECHAMENTOMOVCX")
    private Long proxnumfechamentomovcx;

    @Column(name = "PROXNUMNFCEHOMOLOGACAO")
    private Long proxnumnfcehomologacao;

    @Column(name = "PROXNUMPEDAUX")
    private Long proxnumpedaux;

    @Column(name = "TIPODOCFISCAL", length = 20)
    private String tipodocfiscal;

    @Column(name = "NUMSAT")
    private Short numsat;

    @Column(name = "TIPOOPERACAO", length = 1)
    private String tipooperacao;

    @Column(name = "PROXNUMDOCSAT")
    private Long proxnumdocsat;

    @Column(name = "ENDERECOFTP", length = 200)
    private String enderecoftp;

    @Column(name = "PORTA", length = 10)
    private String porta;

    @Column(name = "ENDERECOUPLOAD", length = 200)
    private String enderecoupload;

    @Column(name = "ENDERECODOWNLOAD", length = 200)
    private String enderecodownload;

    @Column(name = "USUARIOFTP", length = 200)
    private String usuarioftp;

    @Column(name = "SENHAFTP", length = 50)
    private String senhaftp;

    @Column(name = "MFADICIONAL", length = 1)
    private String mfadicional;

    @Column(name = "NUMEROUSUARIO", length = 4)
    private String numerousuario;

    @Column(name = "ROTINALANC", length = 48)
    private String rotinalanc;

    @Column(name = "TIPOECF", length = 10)
    private String tipoecf;

    @Column(name = "NUMSERIEPLACAMAE", length = 50)
    private String numserieplacamae;

    @Column(name = "NOMEMAQUINA", length = 50)
    private String nomemaquina;

    @Column(name = "PROXNUMMOVIMENTOPDV")
    private Long proxnummovimentopdv;

    @Column(name = "PROXNUMDOCMFE")
    private Long proxnumdocmfe;

    @Column(name = "MD5PAF", length = 200)
    private String md5paf;


    @Column(name = "PROXIMONUMPEDECF")
    private Long proximonumpedecf;

    @Column(name = "IMPCHEQUEHANDSHAKE", length = 15)
    private String impchequehandshake;

    @Column(name = "IMPCHEQUEVELOCIDADE")
    private Long impchequevelocidade;

    @Column(name = "NUMCAIXAFISCALCONTIGENCIA")
    private Short numcaixafiscalcontigencia;

    @Column(name = "ENDERECOMAC", length = 100)
    private String enderecomac;

    @Column(name = "MODELO_LEITOR", length = 30)
    private String modeloLeitor;

    @Column(name = "CODEMPRESAREDE", length = 10)
    private String codempresarede;

    @Column(name = "IPSERVIDORGATECASH", length = 20)
    private String ipservidorgatecash;

    @Column(name = "NOMEPDV", length = 50)
    private String nomepdv;

    @Column(name = "HASHLICENCAPDV", length = 250)
    private String hashlicencapdv;

    @Column(name = "STATUSSEFAZ", length = 3)
    private String statussefaz;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Integer getCodfunccx() {
        return codfunccx;
    }

    public void setCodfunccx(Integer codfunccx) {
        this.codfunccx = codfunccx;
    }

    public LocalDate getDtinicio() {
        return dtinicio;
    }

    public void setDtinicio(LocalDate dtinicio) {
        this.dtinicio = dtinicio;
    }

    public LocalDate getDtfim() {
        return dtfim;
    }

    public void setDtfim(LocalDate dtfim) {
        this.dtfim = dtfim;
    }

    public String getTipoimpressora() {
        return tipoimpressora;
    }

    public void setTipoimpressora(String tipoimpressora) {
        this.tipoimpressora = tipoimpressora;
    }

    public Short getPortaimpressora() {
        return portaimpressora;
    }

    public void setPortaimpressora(Short portaimpressora) {
        this.portaimpressora = portaimpressora;
    }

    public String getNumserieequip() {
        return numserieequip;
    }

    public void setNumserieequip(String numserieequip) {
        this.numserieequip = numserieequip;
    }

    public Short getPortaleitor() {
        return portaleitor;
    }

    public void setPortaleitor(Short portaleitor) {
        this.portaleitor = portaleitor;
    }

    public String getVersaoimpressora() {
        return versaoimpressora;
    }

    public void setVersaoimpressora(String versaoimpressora) {
        this.versaoimpressora = versaoimpressora;
    }

    public String getPermiteabrirgaveta() {
        return permiteabrirgaveta;
    }

    public void setPermiteabrirgaveta(String permiteabrirgaveta) {
        this.permiteabrirgaveta = permiteabrirgaveta;
    }

    public String getGavetaacoplada() {
        return gavetaacoplada;
    }

    public void setGavetaacoplada(String gavetaacoplada) {
        this.gavetaacoplada = gavetaacoplada;
    }

    public String getTipotef() {
        return tipotef;
    }

    public void setTipotef(String tipotef) {
        this.tipotef = tipotef;
    }

    public Short getPortaleitorch() {
        return portaleitorch;
    }

    public void setPortaleitorch(Short portaleitorch) {
        this.portaleitorch = portaleitorch;
    }

    public String getValidach() {
        return validach;
    }

    public void setValidach(String validach) {
        this.validach = validach;
    }

    public Short getNumregiao() {
        return numregiao;
    }

    public void setNumregiao(Short numregiao) {
        this.numregiao = numregiao;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public Short getNumopcx() {
        return numopcx;
    }

    public void setNumopcx(Short numopcx) {
        this.numopcx = numopcx;
    }

    public String getTipoimpressoracheque() {
        return tipoimpressoracheque;
    }

    public void setTipoimpressoracheque(String tipoimpressoracheque) {
        this.tipoimpressoracheque = tipoimpressoracheque;
    }

    public String getVersaoimpressoracheque() {
        return versaoimpressoracheque;
    }

    public void setVersaoimpressoracheque(String versaoimpressoracheque) {
        this.versaoimpressoracheque = versaoimpressoracheque;
    }

    public Short getPortaimpressoracheque() {
        return portaimpressoracheque;
    }

    public void setPortaimpressoracheque(Short portaimpressoracheque) {
        this.portaimpressoracheque = portaimpressoracheque;
    }

    public Long getNumcupomaberto() {
        return numcupomaberto;
    }

    public void setNumcupomaberto(Long numcupomaberto) {
        this.numcupomaberto = numcupomaberto;
    }

    public Long getNumcupomfechado() {
        return numcupomfechado;
    }

    public void setNumcupomfechado(Long numcupomfechado) {
        this.numcupomfechado = numcupomfechado;
    }

    public String getDiratualizacao() {
        return diratualizacao;
    }

    public void setDiratualizacao(String diratualizacao) {
        this.diratualizacao = diratualizacao;
    }

    public String getDegustacao() {
        return degustacao;
    }

    public void setDegustacao(String degustacao) {
        this.degustacao = degustacao;
    }

    public String getTipoteclado() {
        return tipoteclado;
    }

    public void setTipoteclado(String tipoteclado) {
        this.tipoteclado = tipoteclado;
    }

    public String getTipobalanca() {
        return tipobalanca;
    }

    public void setTipobalanca(String tipobalanca) {
        this.tipobalanca = tipobalanca;
    }

    public String getSaltarlinhatef() {
        return saltarlinhatef;
    }

    public void setSaltarlinhatef(String saltarlinhatef) {
        this.saltarlinhatef = saltarlinhatef;
    }

    public String getMsgcupomfiscal() {
        return msgcupomfiscal;
    }

    public void setMsgcupomfiscal(String msgcupomfiscal) {
        this.msgcupomfiscal = msgcupomfiscal;
    }

    public LocalDate getAdmissao() {
        return admissao;
    }

    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }

    public Short getNumcaixafiscal() {
        return numcaixafiscal;
    }

    public void setNumcaixafiscal(Short numcaixafiscal) {
        this.numcaixafiscal = numcaixafiscal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAtualizacestabasica() {
        return atualizacestabasica;
    }

    public void setAtualizacestabasica(String atualizacestabasica) {
        this.atualizacestabasica = atualizacestabasica;
    }

    public String getAtualizaplano() {
        return atualizaplano;
    }

    public void setAtualizaplano(String atualizaplano) {
        this.atualizaplano = atualizaplano;
    }

    public String getAtualizaformapg() {
        return atualizaformapg;
    }

    public void setAtualizaformapg(String atualizaformapg) {
        this.atualizaformapg = atualizaformapg;
    }

    public String getAtualizaempregado() {
        return atualizaempregado;
    }

    public void setAtualizaempregado(String atualizaempregado) {
        this.atualizaempregado = atualizaempregado;
    }

    public String getAtualizalayout() {
        return atualizalayout;
    }

    public void setAtualizalayout(String atualizalayout) {
        this.atualizalayout = atualizalayout;
    }

    public String getAtualizasetor() {
        return atualizasetor;
    }

    public void setAtualizasetor(String atualizasetor) {
        this.atualizasetor = atualizasetor;
    }

    public String getAtualizatributacao() {
        return atualizatributacao;
    }

    public void setAtualizatributacao(String atualizatributacao) {
        this.atualizatributacao = atualizatributacao;
    }

    public String getAtualizacliente() {
        return atualizacliente;
    }

    public void setAtualizacliente(String atualizacliente) {
        this.atualizacliente = atualizacliente;
    }

    public LocalDate getAtualizaclientedtini() {
        return atualizaclientedtini;
    }

    public void setAtualizaclientedtini(LocalDate atualizaclientedtini) {
        this.atualizaclientedtini = atualizaclientedtini;
    }

    public LocalDate getAtualizaclientedtfim() {
        return atualizaclientedtfim;
    }

    public void setAtualizaclientedtfim(LocalDate atualizaclientedtfim) {
        this.atualizaclientedtfim = atualizaclientedtfim;
    }

    public String getAtualizacfo() {
        return atualizacfo;
    }

    public void setAtualizacfo(String atualizacfo) {
        this.atualizacfo = atualizacfo;
    }

    public String getAtualizaproduto() {
        return atualizaproduto;
    }

    public void setAtualizaproduto(String atualizaproduto) {
        this.atualizaproduto = atualizaproduto;
    }

    public LocalDate getAtualizaprodutodtini() {
        return atualizaprodutodtini;
    }

    public void setAtualizaprodutodtini(LocalDate atualizaprodutodtini) {
        this.atualizaprodutodtini = atualizaprodutodtini;
    }

    public LocalDate getAtualizaprodutodtfim() {
        return atualizaprodutodtfim;
    }

    public void setAtualizaprodutodtfim(LocalDate atualizaprodutodtfim) {
        this.atualizaprodutodtfim = atualizaprodutodtfim;
    }

    public String getAtualizaprecoembalagem() {
        return atualizaprecoembalagem;
    }

    public void setAtualizaprecoembalagem(String atualizaprecoembalagem) {
        this.atualizaprecoembalagem = atualizaprecoembalagem;
    }

    public LocalDate getAtualizaprecoembalagemdtini() {
        return atualizaprecoembalagemdtini;
    }

    public void setAtualizaprecoembalagemdtini(LocalDate atualizaprecoembalagemdtini) {
        this.atualizaprecoembalagemdtini = atualizaprecoembalagemdtini;
    }

    public LocalDate getAtualizaprecoembalagemdtfim() {
        return atualizaprecoembalagemdtfim;
    }

    public void setAtualizaprecoembalagemdtfim(LocalDate atualizaprecoembalagemdtfim) {
        this.atualizaprecoembalagemdtfim = atualizaprecoembalagemdtfim;
    }

    public String getAtualizaprecoregiao() {
        return atualizaprecoregiao;
    }

    public void setAtualizaprecoregiao(String atualizaprecoregiao) {
        this.atualizaprecoregiao = atualizaprecoregiao;
    }

    public LocalDate getAtualizaprecoregiaodtini() {
        return atualizaprecoregiaodtini;
    }

    public void setAtualizaprecoregiaodtini(LocalDate atualizaprecoregiaodtini) {
        this.atualizaprecoregiaodtini = atualizaprecoregiaodtini;
    }

    public LocalDate getAtualizaprecoregiaodtfim() {
        return atualizaprecoregiaodtfim;
    }

    public void setAtualizaprecoregiaodtfim(LocalDate atualizaprecoregiaodtfim) {
        this.atualizaprecoregiaodtfim = atualizaprecoregiaodtfim;
    }

    public String getIpservidorsitef() {
        return ipservidorsitef;
    }

    public void setIpservidorsitef(String ipservidorsitef) {
        this.ipservidorsitef = ipservidorsitef;
    }

    public String getCodempresasitef() {
        return codempresasitef;
    }

    public void setCodempresasitef(String codempresasitef) {
        this.codempresasitef = codempresasitef;
    }

    public String getTerminalsitef() {
        return terminalsitef;
    }

    public void setTerminalsitef(String terminalsitef) {
        this.terminalsitef = terminalsitef;
    }

    public String getAtualizapccomissaoplpag() {
        return atualizapccomissaoplpag;
    }

    public void setAtualizapccomissaoplpag(String atualizapccomissaoplpag) {
        this.atualizapccomissaoplpag = atualizapccomissaoplpag;
    }

    public String getAtualizapccomissaousur() {
        return atualizapccomissaousur;
    }

    public void setAtualizapccomissaousur(String atualizapccomissaousur) {
        this.atualizapccomissaousur = atualizapccomissaousur;
    }

    public String getBitsporsegundoleitor() {
        return bitsporsegundoleitor;
    }

    public void setBitsporsegundoleitor(String bitsporsegundoleitor) {
        this.bitsporsegundoleitor = bitsporsegundoleitor;
    }

    public String getBitsdedadosleitor() {
        return bitsdedadosleitor;
    }

    public void setBitsdedadosleitor(String bitsdedadosleitor) {
        this.bitsdedadosleitor = bitsdedadosleitor;
    }

    public String getParidadeleitor() {
        return paridadeleitor;
    }

    public void setParidadeleitor(String paridadeleitor) {
        this.paridadeleitor = paridadeleitor;
    }

    public String getRespsitefteclado() {
        return respsitefteclado;
    }

    public void setRespsitefteclado(String respsitefteclado) {
        this.respsitefteclado = respsitefteclado;
    }

    public Short getCodbanco() {
        return codbanco;
    }

    public void setCodbanco(Short codbanco) {
        this.codbanco = codbanco;
    }

    public String getUsaindiceecf() {
        return usaindiceecf;
    }

    public void setUsaindiceecf(String usaindiceecf) {
        this.usaindiceecf = usaindiceecf;
    }

    public String getItenscargageral() {
        return itenscargageral;
    }

    public void setItenscargageral(String itenscargageral) {
        this.itenscargageral = itenscargageral;
    }

    public LocalDate getDtproxcargageral() {
        return dtproxcargageral;
    }

    public void setDtproxcargageral(LocalDate dtproxcargageral) {
        this.dtproxcargageral = dtproxcargageral;
    }

    public LocalDate getDtultcargageral() {
        return dtultcargageral;
    }

    public void setDtultcargageral(LocalDate dtultcargageral) {
        this.dtultcargageral = dtultcargageral;
    }

    public String getItenscargaparcial() {
        return itenscargaparcial;
    }

    public void setItenscargaparcial(String itenscargaparcial) {
        this.itenscargaparcial = itenscargaparcial;
    }

    public LocalDate getDtproxcargaparcial() {
        return dtproxcargaparcial;
    }

    public void setDtproxcargaparcial(LocalDate dtproxcargaparcial) {
        this.dtproxcargaparcial = dtproxcargaparcial;
    }

    public LocalDate getDatainiparc() {
        return datainiparc;
    }

    public void setDatainiparc(LocalDate datainiparc) {
        this.datainiparc = datainiparc;
    }

    public LocalDate getDtultcargaparcial() {
        return dtultcargaparcial;
    }

    public void setDtultcargaparcial(LocalDate dtultcargaparcial) {
        this.dtultcargaparcial = dtultcargaparcial;
    }

    public LocalDate getDatafimparc() {
        return datafimparc;
    }

    public void setDatafimparc(LocalDate datafimparc) {
        this.datafimparc = datafimparc;
    }

    public Integer getCodprodparc() {
        return codprodparc;
    }

    public void setCodprodparc(Integer codprodparc) {
        this.codprodparc = codprodparc;
    }

    public Integer getCodcliparc() {
        return codcliparc;
    }

    public void setCodcliparc(Integer codcliparc) {
        this.codcliparc = codcliparc;
    }

    public String getUsasufixoleitor() {
        return usasufixoleitor;
    }

    public void setUsasufixoleitor(String usasufixoleitor) {
        this.usasufixoleitor = usasufixoleitor;
    }

    public String getAtualizaprecofimvenda() {
        return atualizaprecofimvenda;
    }

    public void setAtualizaprecofimvenda(String atualizaprecofimvenda) {
        this.atualizaprecofimvenda = atualizaprecofimvenda;
    }

    public String getConfirmarCarga() {
        return confirmarCarga;
    }

    public void setConfirmarCarga(String confirmarCarga) {
        this.confirmarCarga = confirmarCarga;
    }

    public Short getNumusuarioecf() {
        return numusuarioecf;
    }

    public void setNumusuarioecf(Short numusuarioecf) {
        this.numusuarioecf = numusuarioecf;
    }

    public String getVerfirmware() {
        return verfirmware;
    }

    public void setVerfirmware(String verfirmware) {
        this.verfirmware = verfirmware;
    }

    public String getCodnacionalecf() {
        return codnacionalecf;
    }

    public void setCodnacionalecf(String codnacionalecf) {
        this.codnacionalecf = codnacionalecf;
    }

    public LocalDate getDtswbasico() {
        return dtswbasico;
    }

    public void setDtswbasico(LocalDate dtswbasico) {
        this.dtswbasico = dtswbasico;
    }

    public LocalDate getDtreinicioop() {
        return dtreinicioop;
    }

    public void setDtreinicioop(LocalDate dtreinicioop) {
        this.dtreinicioop = dtreinicioop;
    }

    public LocalDate getDtswusuario() {
        return dtswusuario;
    }

    public void setDtswusuario(LocalDate dtswusuario) {
        this.dtswusuario = dtswusuario;
    }

    public String getModeloecf() {
        return modeloecf;
    }

    public void setModeloecf(String modeloecf) {
        this.modeloecf = modeloecf;
    }

    public Short getDtproxatulizacao() {
        return dtproxatulizacao;
    }

    public void setDtproxatulizacao(Short dtproxatulizacao) {
        this.dtproxatulizacao = dtproxatulizacao;
    }

    public String getSolicitarcavenda() {
        return solicitarcavenda;
    }

    public void setSolicitarcavenda(String solicitarcavenda) {
        this.solicitarcavenda = solicitarcavenda;
    }

    public String getPossuiguilhotina() {
        return possuiguilhotina;
    }

    public void setPossuiguilhotina(String possuiguilhotina) {
        this.possuiguilhotina = possuiguilhotina;
    }

    public String getTipocaixa() {
        return tipocaixa;
    }

    public void setTipocaixa(String tipocaixa) {
        this.tipocaixa = tipocaixa;
    }

    public String getTipodecaixa() {
        return tipodecaixa;
    }

    public void setTipodecaixa(String tipodecaixa) {
        this.tipodecaixa = tipodecaixa;
    }

    public Long getProxnumnfce() {
        return proxnumnfce;
    }

    public void setProxnumnfce(Long proxnumnfce) {
        this.proxnumnfce = proxnumnfce;
    }

    public Long getProxnumfechamentomovcx() {
        return proxnumfechamentomovcx;
    }

    public void setProxnumfechamentomovcx(Long proxnumfechamentomovcx) {
        this.proxnumfechamentomovcx = proxnumfechamentomovcx;
    }

    public Long getProxnumnfcehomologacao() {
        return proxnumnfcehomologacao;
    }

    public void setProxnumnfcehomologacao(Long proxnumnfcehomologacao) {
        this.proxnumnfcehomologacao = proxnumnfcehomologacao;
    }

    public Long getProxnumpedaux() {
        return proxnumpedaux;
    }

    public void setProxnumpedaux(Long proxnumpedaux) {
        this.proxnumpedaux = proxnumpedaux;
    }

    public String getTipodocfiscal() {
        return tipodocfiscal;
    }

    public void setTipodocfiscal(String tipodocfiscal) {
        this.tipodocfiscal = tipodocfiscal;
    }

    public Short getNumsat() {
        return numsat;
    }

    public void setNumsat(Short numsat) {
        this.numsat = numsat;
    }

    public String getTipooperacao() {
        return tipooperacao;
    }

    public void setTipooperacao(String tipooperacao) {
        this.tipooperacao = tipooperacao;
    }

    public Long getProxnumdocsat() {
        return proxnumdocsat;
    }

    public void setProxnumdocsat(Long proxnumdocsat) {
        this.proxnumdocsat = proxnumdocsat;
    }

    public String getEnderecoftp() {
        return enderecoftp;
    }

    public void setEnderecoftp(String enderecoftp) {
        this.enderecoftp = enderecoftp;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getEnderecoupload() {
        return enderecoupload;
    }

    public void setEnderecoupload(String enderecoupload) {
        this.enderecoupload = enderecoupload;
    }

    public String getEnderecodownload() {
        return enderecodownload;
    }

    public void setEnderecodownload(String enderecodownload) {
        this.enderecodownload = enderecodownload;
    }

    public String getUsuarioftp() {
        return usuarioftp;
    }

    public void setUsuarioftp(String usuarioftp) {
        this.usuarioftp = usuarioftp;
    }

    public String getSenhaftp() {
        return senhaftp;
    }

    public void setSenhaftp(String senhaftp) {
        this.senhaftp = senhaftp;
    }

    public String getMfadicional() {
        return mfadicional;
    }

    public void setMfadicional(String mfadicional) {
        this.mfadicional = mfadicional;
    }

    public String getNumerousuario() {
        return numerousuario;
    }

    public void setNumerousuario(String numerousuario) {
        this.numerousuario = numerousuario;
    }

    public String getRotinalanc() {
        return rotinalanc;
    }

    public void setRotinalanc(String rotinalanc) {
        this.rotinalanc = rotinalanc;
    }

    public String getTipoecf() {
        return tipoecf;
    }

    public void setTipoecf(String tipoecf) {
        this.tipoecf = tipoecf;
    }

    public String getNumserieplacamae() {
        return numserieplacamae;
    }

    public void setNumserieplacamae(String numserieplacamae) {
        this.numserieplacamae = numserieplacamae;
    }

    public String getNomemaquina() {
        return nomemaquina;
    }

    public void setNomemaquina(String nomemaquina) {
        this.nomemaquina = nomemaquina;
    }

    public Long getProxnummovimentopdv() {
        return proxnummovimentopdv;
    }

    public void setProxnummovimentopdv(Long proxnummovimentopdv) {
        this.proxnummovimentopdv = proxnummovimentopdv;
    }

    public Long getProxnumdocmfe() {
        return proxnumdocmfe;
    }

    public void setProxnumdocmfe(Long proxnumdocmfe) {
        this.proxnumdocmfe = proxnumdocmfe;
    }

    public String getMd5paf() {
        return md5paf;
    }

    public void setMd5paf(String md5paf) {
        this.md5paf = md5paf;
    }


    public Long getProximonumpedecf() {
        return proximonumpedecf;
    }

    public void setProximonumpedecf(Long proximonumpedecf) {
        this.proximonumpedecf = proximonumpedecf;
    }

    public String getImpchequehandshake() {
        return impchequehandshake;
    }

    public void setImpchequehandshake(String impchequehandshake) {
        this.impchequehandshake = impchequehandshake;
    }

    public Long getImpchequevelocidade() {
        return impchequevelocidade;
    }

    public void setImpchequevelocidade(Long impchequevelocidade) {
        this.impchequevelocidade = impchequevelocidade;
    }

    public Short getNumcaixafiscalcontigencia() {
        return numcaixafiscalcontigencia;
    }

    public void setNumcaixafiscalcontigencia(Short numcaixafiscalcontigencia) {
        this.numcaixafiscalcontigencia = numcaixafiscalcontigencia;
    }

    public String getEnderecomac() {
        return enderecomac;
    }

    public void setEnderecomac(String enderecomac) {
        this.enderecomac = enderecomac;
    }

    public String getModeloLeitor() {
        return modeloLeitor;
    }

    public void setModeloLeitor(String modeloLeitor) {
        this.modeloLeitor = modeloLeitor;
    }

    public String getCodempresarede() {
        return codempresarede;
    }

    public void setCodempresarede(String codempresarede) {
        this.codempresarede = codempresarede;
    }

    public String getIpservidorgatecash() {
        return ipservidorgatecash;
    }

    public void setIpservidorgatecash(String ipservidorgatecash) {
        this.ipservidorgatecash = ipservidorgatecash;
    }

    public String getNomepdv() {
        return nomepdv;
    }

    public void setNomepdv(String nomepdv) {
        this.nomepdv = nomepdv;
    }

    public String getHashlicencapdv() {
        return hashlicencapdv;
    }

    public void setHashlicencapdv(String hashlicencapdv) {
        this.hashlicencapdv = hashlicencapdv;
    }

    public String getStatussefaz() {
        return statussefaz;
    }

    public void setStatussefaz(String statussefaz) {
        this.statussefaz = statussefaz;
    }

}