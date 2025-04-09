package org.example.orcamentototvsjakarta.DTO;

import java.math.BigDecimal;

public class ItemOrcamentoDTO {
    private Integer codprod;
    private String descricao;
    private BigDecimal quantidade;
    private BigDecimal vlcustofin;
    private BigDecimal pvenda;
    private BigDecimal ptabela;
    private Integer codst;

    // Construtor vazio necessário para criar instâncias durante o carregamento dos dados
    public ItemOrcamentoDTO() {
    }

    // Construtor com parâmetros
    public ItemOrcamentoDTO(Integer codprod, String descricao, BigDecimal quantidade,
                            BigDecimal vlcustofin, BigDecimal pvenda, BigDecimal ptabela, Integer codst) {
        this.codprod = codprod;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.vlcustofin = vlcustofin;
        this.pvenda = pvenda;
        this.ptabela = ptabela;
        this.codst = codst;
    }

    // Getters
    public Integer getCodprod() { return codprod; }
    public String getDescricao() { return descricao; }
    public BigDecimal getQuantidade() { return quantidade; }
    public BigDecimal getVlcustofin() { return vlcustofin; }
    public BigDecimal getPvenda() { return pvenda; }
    public BigDecimal getPtabela() { return ptabela; }
    public Integer getCodst() { return codst; }

    // Setters necessários para modificar os valores após a instanciação
    public void setCodprod(Integer codprod) { this.codprod = codprod; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setQuantidade(BigDecimal quantidade) { this.quantidade = quantidade; }
    public void setVlcustofin(BigDecimal vlcustofin) { this.vlcustofin = vlcustofin; }
    public void setPvenda(BigDecimal pvenda) { this.pvenda = pvenda; }
    public void setPtabela(BigDecimal ptabela) { this.ptabela = ptabela; }
    public void setCodst(Integer codst) { this.codst = codst; }

    // Método toString útil para depuração
    @Override
    public String toString() {
        return "ItemOrcamentoDTO{" +
                "codprod=" + codprod +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", vlcustofin=" + vlcustofin +
                ", pvenda=" + pvenda +
                ", ptabela=" + ptabela +
                ", codst=" + codst +
                '}';
    }
}