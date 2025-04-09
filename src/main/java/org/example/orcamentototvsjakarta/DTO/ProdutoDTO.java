package org.example.orcamentototvsjakarta.DTO;

import java.math.BigDecimal;

/**
 * DTO para transferência de dados de Produto
 */
public class ProdutoDTO {
    private Integer codProd;
    private Double qtUnitEmb;
    private Double qtEstoque;
    private BigDecimal vlCustoFin;
    private BigDecimal vlCustoReal;
    private Double pesoBruto;
    private BigDecimal pUnit;
    private BigDecimal pTabela;
    private Integer codSt;
    private Long codAuxiliar;
    private Double qtUnit;
    private String tipoMerc;

    public ProdutoDTO() {
    }

    public Integer getCodProd() {
        return codProd;
    }

    public void setCodProd(Integer codProd) {
        this.codProd = codProd;
    }

    public Double getQtUnitEmb() {
        return qtUnitEmb;
    }

    public void setQtUnitEmb(Double qtUnitEmb) {
        this.qtUnitEmb = qtUnitEmb;
    }

    public Double getQtEstoque() {
        return qtEstoque;
    }

    public void setQtEstoque(Double qtEstoque) {
        this.qtEstoque = qtEstoque;
    }

    public BigDecimal getVlCustoFin() {
        return vlCustoFin;
    }

    public void setVlCustoFin(BigDecimal vlCustoFin) {
        this.vlCustoFin = vlCustoFin;
    }

    public void setVlCustoFin(Double vlCustoFin) {
        this.vlCustoFin = vlCustoFin != null ? BigDecimal.valueOf(vlCustoFin) : BigDecimal.ZERO;
    }

    public BigDecimal getVlCustoReal() {
        return vlCustoReal;
    }

    public void setVlCustoReal(BigDecimal vlCustoReal) {
        this.vlCustoReal = vlCustoReal;
    }

    public void setVlCustoReal(Double vlCustoReal) {
        this.vlCustoReal = vlCustoReal != null ? BigDecimal.valueOf(vlCustoReal) : BigDecimal.ZERO;
    }

    public Double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public BigDecimal getPUnit() {
        return pUnit;
    }

    public void setPUnit(BigDecimal pUnit) {
        this.pUnit = pUnit;
    }

    public void setPUnit(Double pUnit) {
        this.pUnit = pUnit != null ? BigDecimal.valueOf(pUnit) : BigDecimal.ZERO;
    }

    public BigDecimal getPTabela() {
        return pTabela;
    }

    public void setPTabela(BigDecimal pTabela) {
        this.pTabela = pTabela;
    }

    public void setPTabela(Double pTabela) {
        this.pTabela = pTabela != null ? BigDecimal.valueOf(pTabela) : BigDecimal.ZERO;
    }

    public Integer getCodSt() {
        return codSt;
    }

    public void setCodSt(Integer codSt) {
        this.codSt = codSt;
    }

    public Long getCodAuxiliar() {
        return codAuxiliar;
    }

    public void setCodAuxiliar(Long codAuxiliar) {
        this.codAuxiliar = codAuxiliar;
    }

    public Double getQtUnit() {
        return qtUnit;
    }

    public void setQtUnit(Double qtUnit) {
        this.qtUnit = qtUnit;
    }

    public String getTipoMerc() {
        return tipoMerc;
    }

    public void setTipoMerc(String tipoMerc) {
        this.tipoMerc = tipoMerc;
    }
}