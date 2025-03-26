package org.example.orcamentototvsjakarta.DTO;

public class CaixaDTO {
    private Integer codigo;
    private String descricao;

    public CaixaDTO(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }
}

