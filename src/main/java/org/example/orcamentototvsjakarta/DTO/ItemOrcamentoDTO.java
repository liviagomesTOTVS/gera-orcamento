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

    // Construtor
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
}
