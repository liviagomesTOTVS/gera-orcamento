package org.example.orcamentototvsjakarta.DTO;

public class FuncionarioDTO {
    private Integer codigo;
    private String nome;

    public FuncionarioDTO(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        if (codigo == null) return "Selecione...";
        return codigo + " - " + nome;
    }

}

