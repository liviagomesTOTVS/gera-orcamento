package org.example.orcamentototvsjakarta.DTO;

public class ClienteDTO {
    private Integer codcli;
    private String nome;
    private String cnpj;

    public ClienteDTO(Integer codcli, String nome, String cnpj) {
        this.codcli = codcli;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Integer getCodcli() {
        return codcli;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
