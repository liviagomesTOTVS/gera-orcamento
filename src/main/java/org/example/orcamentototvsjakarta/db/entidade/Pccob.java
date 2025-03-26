package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PCCOB")
public class Pccob {
    @Id
    @Column(name = "CODCOB", nullable = false, length = 4)
    private String codcob;

    @Column(name = "COBRANCA", nullable = false, length = 30)
    private String cobranca;

    @Column(name = "PAGCOMISSAO", nullable = false, length = 1)
    private String pagcomissao;

    @Column(name = "TXJUROS", precision = 6, scale = 2)
    private BigDecimal txjuros;

    @Column(name = "CODMOEDA", length = 4)
    private String codmoeda;

    @Column(name = "BAIXACXBANCO", length = 1)
    private String baixacxbanco;

    @Column(name = "NIVELVENDA")
    private Short nivelvenda;

    @Column(name = "FLUXOCX", length = 1)
    private String fluxocx;

    @Column(name = "COLUNAFLUXOCX")
    private Short colunafluxocx;

    @Column(name = "NUMDIASVENCFLUXOCX")
    private Short numdiasvencfluxocx;

    @Column(name = "BLOQAUTOMATICO", length = 1)
    private String bloqautomatico;

    @Column(name = "NUMDIASBLOQAUTOMATIC")
    private Short numdiasbloqautomatic;

    @Column(name = "EXIBIRCXMOT", length = 1)
    private String exibircxmot;

    @Column(name = "EXIBIRBK", length = 1)
    private String exibirbk;

    @Column(name = "PERCACRESVENDA", precision = 6, scale = 2)
    private BigDecimal percacresvenda;

    @Column(name = "PRAZOMAXIMOVENDA")
    private Short prazomaximovenda;

    @Column(name = "LETRACOB", length = 2)
    private String letracob;

    @Column(name = "BOLETO", length = 1)
    private String boleto;

    @Column(name = "CUSTODIA", length = 1)
    private String custodia;

    @Column(name = "PERMITEALTCOBDESD", length = 1)
    private String permitealtcobdesd;

    @Column(name = "PERCOM", precision = 6, scale = 2)
    private BigDecimal percom;

    @Column(name = "VLTARIFA", precision = 14, scale = 2)
    private BigDecimal vltarifa;

    @Column(name = "CODECF", length = 6)
    private String codecf;

    @Column(name = "CARTAO", length = 1)
    private String cartao;

    @Column(name = "OBSNF", length = 100)
    private String obsnf;

    @Column(name = "NUMDIASLIBERACAOCREDITO")
    private Short numdiasliberacaocredito;

    @Column(name = "CODCLICC")
    private Integer codclicc;

    @Column(name = "PRAZOCC")
    private Short prazocc;

    @Column(name = "PERCTXADMINCC", precision = 5, scale = 2)
    private BigDecimal perctxadmincc;

    @Column(name = "CODCONTACC")
    private Long codcontacc;

    @Column(name = "CODCOBCC", length = 4)
    private String codcobcc;

    @Column(name = "ENVIACOBRANCAFV", length = 1)
    private String enviacobrancafv;

    @Column(name = "VALIDALIMCREDECF", length = 1)
    private String validalimcredecf;

    @Column(name = "DIASCARENCIA")
    private Short diascarencia;

    @Column(name = "ACERTOAUTOCXMOT", length = 1)
    private String acertoautocxmot;

    @Column(name = "CODPARAPROTESTO", length = 2)
    private String codparaprotesto;

    @Column(name = "ENVIOPARAPROTESTO", length = 1)
    private String envioparaprotesto;

    @Column(name = "NUMDIASPROTESTO", length = 2)
    private String numdiasprotesto;

    @Column(name = "NUMBANCO")
    private Short numbanco;

    @Column(name = "PERMITEDESCDEVCLI", length = 1)
    private String permitedescdevcli;

    @Column(name = "PERCOMMOT", precision = 5, scale = 2)
    private BigDecimal percommot;

    @Column(name = "COBRANCABROKER", length = 1)
    private String cobrancabroker;

    @Column(name = "VLMINPEDIDO", precision = 12, scale = 2)
    private BigDecimal vlminpedido;

    @Column(name = "DEPOSITOBANCARIO", length = 1)
    private String depositobancario;

    @Column(name = "TIPOCOMISSAO", length = 1)
    private String tipocomissao;

    @Column(name = "CODBANCOTARIFA")
    private Short codbancotarifa;

    @Column(name = "CODFILIAL", length = 2)
    private String codfilial;

    @Column(name = "EXPORTARECF", length = 1)
    private String exportarecf;

    @Column(name = "CODBANCO")
    private Short codbanco;

    @Column(name = "SOMATARIFABANCDUPLIC", length = 1)
    private String somatarifabancduplic;

    @Column(name = "SOMATARIFABANCNF", length = 1)
    private String somatarifabancnf;

    @Column(name = "CODOPERADORACARTAO", length = 6)
    private String codoperadoracartao;

    @Column(name = "TIPOOPERACAOTEF", length = 4)
    private String tipooperacaotef;

    @Column(name = "CODPARANAOPROTESTO", length = 2)
    private String codparanaoprotesto;

    @Column(name = "NUMMAXPARCELAS")
    private Short nummaxparcelas;

    @Column(name = "TIPOPAGTOECF", length = 1)
    private String tipopagtoecf;

    @Column(name = "PERMITEBAIXAMANUAL", length = 1)
    private String permitebaixamanual;

    @Column(name = "NUMVIASCPADICIONAL", length = 3)
    private String numviascpadicional;

    @Column(name = "CODBANDEIRA")
    private Integer codbandeira;

    @Column(name = "SELECIONACLIENTEECF", length = 1)
    private String selecionaclienteecf;

    @Column(name = "UTILIZACHDESC", length = 1)
    private String utilizachdesc;

    @Column(name = "CODCOBCHDESC", length = 4)
    private String codcobchdesc;

    @Column(name = "CODCOBDEVCHDESC", length = 4)
    private String codcobdevchdesc;

    @Column(name = "AUTENTICARACERTOCX402", length = 1)
    private String autenticaracertocx402;

    @Column(name = "COBRANCAEMTRANSITO", length = 1)
    private String cobrancaemtransito;

    @Column(name = "PERMITECONTRAVALE", length = 1)
    private String permitecontravale;

    @Column(name = "CALCJUROSCOBRANCA", length = 1)
    private String calcjuroscobranca;

    @Column(name = "CODIGOBANDEIRA", length = 6)
    private String codigobandeira;

    @Column(name = "CONVENIO", length = 1)
    private String convenio;

    @Column(name = "MXDIASINAD")
    private Short mxdiasinad;

    @Column(name = "MXINAD", length = 1)
    private String mxinad;

    @Column(name = "RECARGACELULAR", length = 1)
    private String recargacelular;

    @Column(name = "CODREDE")
    private Integer codrede;

    @Column(name = "TXPRIMEIRAPARCELA", length = 1)
    private String txprimeiraparcela;

    @Column(name = "NAOVALIDAPRAZOMEDIO", length = 1)
    private String naovalidaprazomedio;

    @Column(name = "CHEQUE", length = 1)
    private String cheque;

    @Column(name = "FLEXIVEL", length = 1)
    private String flexivel;

    @Column(name = "PERCMULTA", precision = 7, scale = 4)
    private BigDecimal percmulta;

    @Column(name = "COBSUPPLIERCARD", length = 1)
    private String cobsuppliercard;

    @Column(name = "CODCOBSEFAZ", length = 4)
    private String codcobsefaz;

    @Column(name = "CODBANDEIRAOPERADORACARTAO", length = 4)
    private String codbandeiraoperadoracartao;

    @Column(name = "BANDEIRACARTAO")
    private Short bandeiracartao;

    @Column(name = "INDPAG")
    private Boolean indpag;

    @Column(name = "CARTEIRADIGITAL", length = 1)
    private String carteiradigital;

    @Column(name = "NOMECARTEIRADIGITAL", length = 50)
    private String nomecarteiradigital;

    @Column(name = "DESCRICAOFORMAPAGTO", length = 60)
    private String descricaoformapagto;

    @Column(name = "VALIDALIMITECREDITO", length = 1)
    private String validalimitecredito;

    @Column(name = "DTULTALTER", nullable = false)
    private LocalDate dtultalter;

    @Column(name = "DTCADASTRO", nullable = false)
    private LocalDate dtcadastro;

    @Column(name = "QTDEHORASEXPIRALINKPGTODIGITAL")
    private Short qtdehorasexpiralinkpgtodigital;

    @Column(name = "NUMDIASVENCPIX")
    private Short numdiasvencpix;

    @Column(name = "NAOBLOQPEDCOBDIG", length = 1)
    private String naobloqpedcobdig;

    @Column(name = "CARTEIRAPIX", length = 1)
    private String carteirapix;

    @Column(name = "NAOVALIDARCLIBLOQVENDA", length = 1)
    private String naovalidarclibloqvenda;

    @Column(name = "MODALIDADETEF", length = 4)
    private String modalidadetef;

    @Column(name = "CODCLIINTERMEDIADOR")
    private Integer codcliintermediador;

    @Column(name = "REALIZACONFCEGAPDV", length = 1)
    private String realizaconfcegapdv;

    @Column(name = "CHAVEBOLEPIX", length = 260)
    private String chavebolepix;

    @Column(name = "BOLEPIX", length = 1)
    private String bolepix;

    @Column(name = "CODBANCOBOLEPIX")
    private Short codbancobolepix;

    @Column(name = "PERMITEBAIXABOLEPIXAMAIOR", length = 1)
    private String permitebaixabolepixamaior;

    @Column(name = "PERMITEBAIXABOLEPIXAMENOR", length = 1)
    private String permitebaixabolepixamenor;

    @Column(name = "DTALTERC5")
    private Instant dtalterc5;

    @Column(name = "CREDIARIO", length = 1)
    private String crediario;

    @Column(name = "PERCTAXAADMCREDIARIO", precision = 6, scale = 2)
    private BigDecimal perctaxaadmcrediario;

    @Column(name = "GERACASHBACK", length = 1)
    private String geracashback;

    @Column(name = "PERCCASHBACK", precision = 5, scale = 2)
    private BigDecimal perccashback;

    public String getCodcob() {
        return codcob;
    }

    public void setCodcob(String codcob) {
        this.codcob = codcob;
    }

    public String getCobranca() {
        return cobranca;
    }

    public void setCobranca(String cobranca) {
        this.cobranca = cobranca;
    }

    public String getPagcomissao() {
        return pagcomissao;
    }

    public void setPagcomissao(String pagcomissao) {
        this.pagcomissao = pagcomissao;
    }

    public BigDecimal getTxjuros() {
        return txjuros;
    }

    public void setTxjuros(BigDecimal txjuros) {
        this.txjuros = txjuros;
    }

    public String getCodmoeda() {
        return codmoeda;
    }

    public void setCodmoeda(String codmoeda) {
        this.codmoeda = codmoeda;
    }

    public String getBaixacxbanco() {
        return baixacxbanco;
    }

    public void setBaixacxbanco(String baixacxbanco) {
        this.baixacxbanco = baixacxbanco;
    }

    public Short getNivelvenda() {
        return nivelvenda;
    }

    public void setNivelvenda(Short nivelvenda) {
        this.nivelvenda = nivelvenda;
    }

    public String getFluxocx() {
        return fluxocx;
    }

    public void setFluxocx(String fluxocx) {
        this.fluxocx = fluxocx;
    }

    public Short getColunafluxocx() {
        return colunafluxocx;
    }

    public void setColunafluxocx(Short colunafluxocx) {
        this.colunafluxocx = colunafluxocx;
    }

    public Short getNumdiasvencfluxocx() {
        return numdiasvencfluxocx;
    }

    public void setNumdiasvencfluxocx(Short numdiasvencfluxocx) {
        this.numdiasvencfluxocx = numdiasvencfluxocx;
    }

    public String getBloqautomatico() {
        return bloqautomatico;
    }

    public void setBloqautomatico(String bloqautomatico) {
        this.bloqautomatico = bloqautomatico;
    }

    public Short getNumdiasbloqautomatic() {
        return numdiasbloqautomatic;
    }

    public void setNumdiasbloqautomatic(Short numdiasbloqautomatic) {
        this.numdiasbloqautomatic = numdiasbloqautomatic;
    }

    public String getExibircxmot() {
        return exibircxmot;
    }

    public void setExibircxmot(String exibircxmot) {
        this.exibircxmot = exibircxmot;
    }

    public String getExibirbk() {
        return exibirbk;
    }

    public void setExibirbk(String exibirbk) {
        this.exibirbk = exibirbk;
    }

    public BigDecimal getPercacresvenda() {
        return percacresvenda;
    }

    public void setPercacresvenda(BigDecimal percacresvenda) {
        this.percacresvenda = percacresvenda;
    }

    public Short getPrazomaximovenda() {
        return prazomaximovenda;
    }

    public void setPrazomaximovenda(Short prazomaximovenda) {
        this.prazomaximovenda = prazomaximovenda;
    }

    public String getLetracob() {
        return letracob;
    }

    public void setLetracob(String letracob) {
        this.letracob = letracob;
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public String getCustodia() {
        return custodia;
    }

    public void setCustodia(String custodia) {
        this.custodia = custodia;
    }

    public String getPermitealtcobdesd() {
        return permitealtcobdesd;
    }

    public void setPermitealtcobdesd(String permitealtcobdesd) {
        this.permitealtcobdesd = permitealtcobdesd;
    }

    public BigDecimal getPercom() {
        return percom;
    }

    public void setPercom(BigDecimal percom) {
        this.percom = percom;
    }

    public BigDecimal getVltarifa() {
        return vltarifa;
    }

    public void setVltarifa(BigDecimal vltarifa) {
        this.vltarifa = vltarifa;
    }

    public String getCodecf() {
        return codecf;
    }

    public void setCodecf(String codecf) {
        this.codecf = codecf;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getObsnf() {
        return obsnf;
    }

    public void setObsnf(String obsnf) {
        this.obsnf = obsnf;
    }

    public Short getNumdiasliberacaocredito() {
        return numdiasliberacaocredito;
    }

    public void setNumdiasliberacaocredito(Short numdiasliberacaocredito) {
        this.numdiasliberacaocredito = numdiasliberacaocredito;
    }

    public Integer getCodclicc() {
        return codclicc;
    }

    public void setCodclicc(Integer codclicc) {
        this.codclicc = codclicc;
    }

    public Short getPrazocc() {
        return prazocc;
    }

    public void setPrazocc(Short prazocc) {
        this.prazocc = prazocc;
    }

    public BigDecimal getPerctxadmincc() {
        return perctxadmincc;
    }

    public void setPerctxadmincc(BigDecimal perctxadmincc) {
        this.perctxadmincc = perctxadmincc;
    }

    public Long getCodcontacc() {
        return codcontacc;
    }

    public void setCodcontacc(Long codcontacc) {
        this.codcontacc = codcontacc;
    }

    public String getCodcobcc() {
        return codcobcc;
    }

    public void setCodcobcc(String codcobcc) {
        this.codcobcc = codcobcc;
    }

    public String getEnviacobrancafv() {
        return enviacobrancafv;
    }

    public void setEnviacobrancafv(String enviacobrancafv) {
        this.enviacobrancafv = enviacobrancafv;
    }

    public String getValidalimcredecf() {
        return validalimcredecf;
    }

    public void setValidalimcredecf(String validalimcredecf) {
        this.validalimcredecf = validalimcredecf;
    }

    public Short getDiascarencia() {
        return diascarencia;
    }

    public void setDiascarencia(Short diascarencia) {
        this.diascarencia = diascarencia;
    }

    public String getAcertoautocxmot() {
        return acertoautocxmot;
    }

    public void setAcertoautocxmot(String acertoautocxmot) {
        this.acertoautocxmot = acertoautocxmot;
    }

    public String getCodparaprotesto() {
        return codparaprotesto;
    }

    public void setCodparaprotesto(String codparaprotesto) {
        this.codparaprotesto = codparaprotesto;
    }

    public String getEnvioparaprotesto() {
        return envioparaprotesto;
    }

    public void setEnvioparaprotesto(String envioparaprotesto) {
        this.envioparaprotesto = envioparaprotesto;
    }

    public String getNumdiasprotesto() {
        return numdiasprotesto;
    }

    public void setNumdiasprotesto(String numdiasprotesto) {
        this.numdiasprotesto = numdiasprotesto;
    }

    public Short getNumbanco() {
        return numbanco;
    }

    public void setNumbanco(Short numbanco) {
        this.numbanco = numbanco;
    }

    public String getPermitedescdevcli() {
        return permitedescdevcli;
    }

    public void setPermitedescdevcli(String permitedescdevcli) {
        this.permitedescdevcli = permitedescdevcli;
    }

    public BigDecimal getPercommot() {
        return percommot;
    }

    public void setPercommot(BigDecimal percommot) {
        this.percommot = percommot;
    }

    public String getCobrancabroker() {
        return cobrancabroker;
    }

    public void setCobrancabroker(String cobrancabroker) {
        this.cobrancabroker = cobrancabroker;
    }

    public BigDecimal getVlminpedido() {
        return vlminpedido;
    }

    public void setVlminpedido(BigDecimal vlminpedido) {
        this.vlminpedido = vlminpedido;
    }

    public String getDepositobancario() {
        return depositobancario;
    }

    public void setDepositobancario(String depositobancario) {
        this.depositobancario = depositobancario;
    }

    public String getTipocomissao() {
        return tipocomissao;
    }

    public void setTipocomissao(String tipocomissao) {
        this.tipocomissao = tipocomissao;
    }

    public Short getCodbancotarifa() {
        return codbancotarifa;
    }

    public void setCodbancotarifa(Short codbancotarifa) {
        this.codbancotarifa = codbancotarifa;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public String getExportarecf() {
        return exportarecf;
    }

    public void setExportarecf(String exportarecf) {
        this.exportarecf = exportarecf;
    }

    public Short getCodbanco() {
        return codbanco;
    }

    public void setCodbanco(Short codbanco) {
        this.codbanco = codbanco;
    }

    public String getSomatarifabancduplic() {
        return somatarifabancduplic;
    }

    public void setSomatarifabancduplic(String somatarifabancduplic) {
        this.somatarifabancduplic = somatarifabancduplic;
    }

    public String getSomatarifabancnf() {
        return somatarifabancnf;
    }

    public void setSomatarifabancnf(String somatarifabancnf) {
        this.somatarifabancnf = somatarifabancnf;
    }

    public String getCodoperadoracartao() {
        return codoperadoracartao;
    }

    public void setCodoperadoracartao(String codoperadoracartao) {
        this.codoperadoracartao = codoperadoracartao;
    }

    public String getTipooperacaotef() {
        return tipooperacaotef;
    }

    public void setTipooperacaotef(String tipooperacaotef) {
        this.tipooperacaotef = tipooperacaotef;
    }

    public String getCodparanaoprotesto() {
        return codparanaoprotesto;
    }

    public void setCodparanaoprotesto(String codparanaoprotesto) {
        this.codparanaoprotesto = codparanaoprotesto;
    }

    public Short getNummaxparcelas() {
        return nummaxparcelas;
    }

    public void setNummaxparcelas(Short nummaxparcelas) {
        this.nummaxparcelas = nummaxparcelas;
    }

    public String getTipopagtoecf() {
        return tipopagtoecf;
    }

    public void setTipopagtoecf(String tipopagtoecf) {
        this.tipopagtoecf = tipopagtoecf;
    }

    public String getPermitebaixamanual() {
        return permitebaixamanual;
    }

    public void setPermitebaixamanual(String permitebaixamanual) {
        this.permitebaixamanual = permitebaixamanual;
    }

    public String getNumviascpadicional() {
        return numviascpadicional;
    }

    public void setNumviascpadicional(String numviascpadicional) {
        this.numviascpadicional = numviascpadicional;
    }

    public Integer getCodbandeira() {
        return codbandeira;
    }

    public void setCodbandeira(Integer codbandeira) {
        this.codbandeira = codbandeira;
    }

    public String getSelecionaclienteecf() {
        return selecionaclienteecf;
    }

    public void setSelecionaclienteecf(String selecionaclienteecf) {
        this.selecionaclienteecf = selecionaclienteecf;
    }

    public String getUtilizachdesc() {
        return utilizachdesc;
    }

    public void setUtilizachdesc(String utilizachdesc) {
        this.utilizachdesc = utilizachdesc;
    }

    public String getCodcobchdesc() {
        return codcobchdesc;
    }

    public void setCodcobchdesc(String codcobchdesc) {
        this.codcobchdesc = codcobchdesc;
    }

    public String getCodcobdevchdesc() {
        return codcobdevchdesc;
    }

    public void setCodcobdevchdesc(String codcobdevchdesc) {
        this.codcobdevchdesc = codcobdevchdesc;
    }

    public String getAutenticaracertocx402() {
        return autenticaracertocx402;
    }

    public void setAutenticaracertocx402(String autenticaracertocx402) {
        this.autenticaracertocx402 = autenticaracertocx402;
    }

    public String getCobrancaemtransito() {
        return cobrancaemtransito;
    }

    public void setCobrancaemtransito(String cobrancaemtransito) {
        this.cobrancaemtransito = cobrancaemtransito;
    }

    public String getPermitecontravale() {
        return permitecontravale;
    }

    public void setPermitecontravale(String permitecontravale) {
        this.permitecontravale = permitecontravale;
    }

    public String getCalcjuroscobranca() {
        return calcjuroscobranca;
    }

    public void setCalcjuroscobranca(String calcjuroscobranca) {
        this.calcjuroscobranca = calcjuroscobranca;
    }

    public String getCodigobandeira() {
        return codigobandeira;
    }

    public void setCodigobandeira(String codigobandeira) {
        this.codigobandeira = codigobandeira;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public Short getMxdiasinad() {
        return mxdiasinad;
    }

    public void setMxdiasinad(Short mxdiasinad) {
        this.mxdiasinad = mxdiasinad;
    }

    public String getMxinad() {
        return mxinad;
    }

    public void setMxinad(String mxinad) {
        this.mxinad = mxinad;
    }

    public String getRecargacelular() {
        return recargacelular;
    }

    public void setRecargacelular(String recargacelular) {
        this.recargacelular = recargacelular;
    }

    public Integer getCodrede() {
        return codrede;
    }

    public void setCodrede(Integer codrede) {
        this.codrede = codrede;
    }

    public String getTxprimeiraparcela() {
        return txprimeiraparcela;
    }

    public void setTxprimeiraparcela(String txprimeiraparcela) {
        this.txprimeiraparcela = txprimeiraparcela;
    }

    public String getNaovalidaprazomedio() {
        return naovalidaprazomedio;
    }

    public void setNaovalidaprazomedio(String naovalidaprazomedio) {
        this.naovalidaprazomedio = naovalidaprazomedio;
    }

    public String getCheque() {
        return cheque;
    }

    public void setCheque(String cheque) {
        this.cheque = cheque;
    }

    public String getFlexivel() {
        return flexivel;
    }

    public void setFlexivel(String flexivel) {
        this.flexivel = flexivel;
    }

    public BigDecimal getPercmulta() {
        return percmulta;
    }

    public void setPercmulta(BigDecimal percmulta) {
        this.percmulta = percmulta;
    }

    public String getCobsuppliercard() {
        return cobsuppliercard;
    }

    public void setCobsuppliercard(String cobsuppliercard) {
        this.cobsuppliercard = cobsuppliercard;
    }

    public String getCodcobsefaz() {
        return codcobsefaz;
    }

    public void setCodcobsefaz(String codcobsefaz) {
        this.codcobsefaz = codcobsefaz;
    }

    public String getCodbandeiraoperadoracartao() {
        return codbandeiraoperadoracartao;
    }

    public void setCodbandeiraoperadoracartao(String codbandeiraoperadoracartao) {
        this.codbandeiraoperadoracartao = codbandeiraoperadoracartao;
    }

    public Short getBandeiracartao() {
        return bandeiracartao;
    }

    public void setBandeiracartao(Short bandeiracartao) {
        this.bandeiracartao = bandeiracartao;
    }

    public Boolean getIndpag() {
        return indpag;
    }

    public void setIndpag(Boolean indpag) {
        this.indpag = indpag;
    }

    public String getCarteiradigital() {
        return carteiradigital;
    }

    public void setCarteiradigital(String carteiradigital) {
        this.carteiradigital = carteiradigital;
    }

    public String getNomecarteiradigital() {
        return nomecarteiradigital;
    }

    public void setNomecarteiradigital(String nomecarteiradigital) {
        this.nomecarteiradigital = nomecarteiradigital;
    }

    public String getDescricaoformapagto() {
        return descricaoformapagto;
    }

    public void setDescricaoformapagto(String descricaoformapagto) {
        this.descricaoformapagto = descricaoformapagto;
    }

    public String getValidalimitecredito() {
        return validalimitecredito;
    }

    public void setValidalimitecredito(String validalimitecredito) {
        this.validalimitecredito = validalimitecredito;
    }

    public LocalDate getDtultalter() {
        return dtultalter;
    }

    public void setDtultalter(LocalDate dtultalter) {
        this.dtultalter = dtultalter;
    }

    public LocalDate getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(LocalDate dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public Short getQtdehorasexpiralinkpgtodigital() {
        return qtdehorasexpiralinkpgtodigital;
    }

    public void setQtdehorasexpiralinkpgtodigital(Short qtdehorasexpiralinkpgtodigital) {
        this.qtdehorasexpiralinkpgtodigital = qtdehorasexpiralinkpgtodigital;
    }

    public Short getNumdiasvencpix() {
        return numdiasvencpix;
    }

    public void setNumdiasvencpix(Short numdiasvencpix) {
        this.numdiasvencpix = numdiasvencpix;
    }

    public String getNaobloqpedcobdig() {
        return naobloqpedcobdig;
    }

    public void setNaobloqpedcobdig(String naobloqpedcobdig) {
        this.naobloqpedcobdig = naobloqpedcobdig;
    }

    public String getCarteirapix() {
        return carteirapix;
    }

    public void setCarteirapix(String carteirapix) {
        this.carteirapix = carteirapix;
    }

    public String getNaovalidarclibloqvenda() {
        return naovalidarclibloqvenda;
    }

    public void setNaovalidarclibloqvenda(String naovalidarclibloqvenda) {
        this.naovalidarclibloqvenda = naovalidarclibloqvenda;
    }

    public String getModalidadetef() {
        return modalidadetef;
    }

    public void setModalidadetef(String modalidadetef) {
        this.modalidadetef = modalidadetef;
    }

    public Integer getCodcliintermediador() {
        return codcliintermediador;
    }

    public void setCodcliintermediador(Integer codcliintermediador) {
        this.codcliintermediador = codcliintermediador;
    }

    public String getRealizaconfcegapdv() {
        return realizaconfcegapdv;
    }

    public void setRealizaconfcegapdv(String realizaconfcegapdv) {
        this.realizaconfcegapdv = realizaconfcegapdv;
    }

    public String getChavebolepix() {
        return chavebolepix;
    }

    public void setChavebolepix(String chavebolepix) {
        this.chavebolepix = chavebolepix;
    }

    public String getBolepix() {
        return bolepix;
    }

    public void setBolepix(String bolepix) {
        this.bolepix = bolepix;
    }

    public Short getCodbancobolepix() {
        return codbancobolepix;
    }

    public void setCodbancobolepix(Short codbancobolepix) {
        this.codbancobolepix = codbancobolepix;
    }

    public String getPermitebaixabolepixamaior() {
        return permitebaixabolepixamaior;
    }

    public void setPermitebaixabolepixamaior(String permitebaixabolepixamaior) {
        this.permitebaixabolepixamaior = permitebaixabolepixamaior;
    }

    public String getPermitebaixabolepixamenor() {
        return permitebaixabolepixamenor;
    }

    public void setPermitebaixabolepixamenor(String permitebaixabolepixamenor) {
        this.permitebaixabolepixamenor = permitebaixabolepixamenor;
    }

    public Instant getDtalterc5() {
        return dtalterc5;
    }

    public void setDtalterc5(Instant dtalterc5) {
        this.dtalterc5 = dtalterc5;
    }

    public String getCrediario() {
        return crediario;
    }

    public void setCrediario(String crediario) {
        this.crediario = crediario;
    }

    public BigDecimal getPerctaxaadmcrediario() {
        return perctaxaadmcrediario;
    }

    public void setPerctaxaadmcrediario(BigDecimal perctaxaadmcrediario) {
        this.perctaxaadmcrediario = perctaxaadmcrediario;
    }

    public String getGeracashback() {
        return geracashback;
    }

    public void setGeracashback(String geracashback) {
        this.geracashback = geracashback;
    }

    public BigDecimal getPerccashback() {
        return perccashback;
    }

    public void setPerccashback(BigDecimal perccashback) {
        this.perccashback = perccashback;
    }

}