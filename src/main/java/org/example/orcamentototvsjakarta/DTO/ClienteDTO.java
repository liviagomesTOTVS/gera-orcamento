package org.example.orcamentototvsjakarta.DTO;

public class ClienteDTO {
    private Integer codcli;
    private String nome;
    private String cgc;
    private Integer codpraca;
    private Integer codatv1;

    public ClienteDTO() {
    }

    public ClienteDTO(Integer codcli, String nome, String cgc) {
        this.codcli = codcli;
        this.nome = nome;
        this.cgc = cgc;
    }

    public ClienteDTO(Integer codcli, String nome, String cgc, Integer codpraca, Integer codatv1) {
        this.codcli = codcli;
        this.nome = nome;
        this.cgc = cgc;
        this.codpraca = codpraca;
        this.codatv1 = codatv1;
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

    public Integer getCodpraca() {
        return codpraca;
    }

    public void setCodpraca(Integer codpraca) {
        this.codpraca = codpraca;
    }

    public Integer getCodatv1() {
        return codatv1;
    }

    public void setCodatv1(Integer codatv1) {
        this.codatv1 = codatv1;
    }

    public String getCnpj() {
        return cgc;
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    /**
     * Retorna o CNPJ/CPF formatado
     * @return String formatada do CNPJ ou CPF
     */
    public String getCnpjFormatado() {
        if (cgc == null || cgc.trim().isEmpty()) {
            return "";
        }

        String numeros = cgc.replaceAll("[^0-9]", "");

        // CNPJ (14 dígitos)
        if (numeros.length() == 14) {
            return numeros.substring(0, 2) + "." +
                    numeros.substring(2, 5) + "." +
                    numeros.substring(5, 8) + "/" +
                    numeros.substring(8, 12) + "-" +
                    numeros.substring(12, 14);
        }

        // CPF (11 dígitos)
        else if (numeros.length() == 11) {
            return numeros.substring(0, 3) + "." +
                    numeros.substring(3, 6) + "." +
                    numeros.substring(6, 9) + "-" +
                    numeros.substring(9, 11);
        }

        return cgc;
    }

    /**
     * Sobrescreve o método toString para exibir corretamente o objeto nas interfaces
     */
    @Override
    public String toString() {
        return codcli + " - " + nome + (cgc != null && !cgc.trim().isEmpty() ? " (" + getCnpjFormatado() + ")" : "");
    }
}