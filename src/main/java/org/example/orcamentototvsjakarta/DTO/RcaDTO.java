package org.example.orcamentototvsjakarta.DTO;

public class RcaDTO {
    private Short codigo;
    private String nome;

    public RcaDTO(Short codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Short getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return codigo + " - " + nome;
    }
}

