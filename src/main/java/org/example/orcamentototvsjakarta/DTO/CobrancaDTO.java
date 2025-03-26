package org.example.orcamentototvsjakarta.DTO;

public class CobrancaDTO {
    private String codigo;
    private String descricao;

    public CobrancaDTO(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return (codigo == null) ? "Selecione..." : codigo + " - " + descricao;
    }

}

