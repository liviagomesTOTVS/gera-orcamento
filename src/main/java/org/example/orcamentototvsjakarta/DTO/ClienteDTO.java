package org.example.orcamentototvsjakarta.DTO;

public class ClienteDTO {
    private Integer codcli;
    private String nome;

    public ClienteDTO(Integer codcli, String nome) {
        this.codcli = codcli;
        this.nome = nome;
    }

    public Integer getCodcli() {
        return codcli;
    }

    public void setCodcli(Integer codcli) {
        this.codcli = codcli;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return codcli + " - " + nome;
    }

}
