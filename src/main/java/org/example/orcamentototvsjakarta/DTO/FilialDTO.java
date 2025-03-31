package org.example.orcamentototvsjakarta.DTO;

public class FilialDTO {
    private String codigo;
    private String razaosocial;

    public FilialDTO(String codigo, String razaosocial) {
        this.codigo = codigo;
        this.razaosocial = razaosocial;
    }

    public String getCodigo() {
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

