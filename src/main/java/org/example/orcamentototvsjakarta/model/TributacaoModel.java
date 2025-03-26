package org.example.orcamentototvsjakarta.model;

import java.util.List;
import java.util.stream.Collectors;

public class TributacaoModel {
    private boolean selecionado;
    private Short codigo;
    private String descricao;

    public TributacaoModel(boolean selecionado, Short codigo, String descricao) {
        this.selecionado = selecionado;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public TributacaoModel(boolean selecionado, Short codigo) {
        this.selecionado = selecionado;
        this.codigo = codigo;
    }

    public boolean isSelecionado() {
        return selecionado;
    }

    public void setSelecionado(boolean selecionado) {
        this.selecionado = selecionado;
    }

    public Short getCodigo() {
        return codigo;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém a lista de tributações que foram selecionadas.
     *
     * @param listaTributacoes Lista completa de tributações
     * @return Lista de tributações filtradas que foram marcadas como selecionadas
     */
    public static List<TributacaoModel> obterTributacoesSelecionadas(List<TributacaoModel> listaTributacoes) {
        return listaTributacoes.stream()
                .filter(TributacaoModel::isSelecionado)
                .collect(Collectors.toList());
    }
}
