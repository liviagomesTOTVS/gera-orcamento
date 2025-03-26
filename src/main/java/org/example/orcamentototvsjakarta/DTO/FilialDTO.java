package org.example.orcamentototvsjakarta.DTO;

public class FilialDTO {
    private Integer codigo;
    private String razaosocial;

    public FilialDTO(Integer codigo, String razaosocial) {
        this.codigo = codigo;
        this.razaosocial = razaosocial;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    @Override
    public String toString() {
        if (codigo == null) {
            return "Selecione...";
        }
        return codigo + " - " + razaosocial;
    }

}

