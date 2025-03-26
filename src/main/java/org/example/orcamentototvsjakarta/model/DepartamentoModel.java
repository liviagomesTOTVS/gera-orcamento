package org.example.orcamentototvsjakarta.model;

import javafx.beans.property.*;

import java.util.List;
import java.util.stream.Collectors;

public class DepartamentoModel {
    private final BooleanProperty selecionado;
    private final StringProperty codigo;
    private final StringProperty descricao;

    public DepartamentoModel(boolean selecionado, String codigo, String descricao) {
        this.selecionado = new SimpleBooleanProperty(selecionado);
        this.codigo = new SimpleStringProperty(codigo);
        this.descricao = new SimpleStringProperty(descricao);

        // Adiciona um listener para depuração (opcional)
        this.selecionado.addListener((obs, oldValue, newValue) ->
                System.out.println("Departamento " + codigo + " selecionado: " + newValue));
    }

    public boolean isSelecionado() {
        return selecionado.get();
    }

    public BooleanProperty selecionadoProperty() {
        return selecionado;
    }

    public void setSelecionado(boolean selecionado) {
        this.selecionado.set(selecionado);
    }

    public String getCodigo() {
        return codigo.get();
    }

    public StringProperty codigoProperty() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo.set(codigo);
    }

    public String getDescricao() {
        return descricao.get();
    }

    public StringProperty descricaoProperty() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao.set(descricao);
    }

    /**
     * Obtém a lista de departamentos que foram selecionados.
     *
     * @param listaDepartamentos Lista completa de departamentos
     * @return Lista de departamentos filtrados que foram marcados como selecionados
     */
    public static List<DepartamentoModel> obterDepartamentosSelecionados(List<DepartamentoModel> listaDepartamentos) {
        return listaDepartamentos.stream()
                .filter(DepartamentoModel::isSelecionado)
                .collect(Collectors.toList());
    }
}
