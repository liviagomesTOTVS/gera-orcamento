package org.example.orcamentototvsjakarta.service;

import org.example.orcamentototvsjakarta.db.dao.PcprodutDAO;
import org.example.orcamentototvsjakarta.db.entidade.Pcprodut;
import org.example.orcamentototvsjakarta.model.ParametrosModel;
import org.example.orcamentototvsjakarta.model.TributacaoModel;
import org.example.orcamentototvsjakarta.model.DepartamentoModel;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoSelecionadoService {
    private final PcprodutDAO pcprodutDAO = new PcprodutDAO();

    public List<Pcprodut> filtrarProdutos(ParametrosModel parametros,
                                          List<DepartamentoModel> departamentosSelecionados,
                                          List<TributacaoModel> tributacoesSelecionadas) {
        // Obtém os códigos dos departamentos e tributações selecionados
        List<Integer> codDepartamentos = departamentosSelecionados.stream()
                .filter(DepartamentoModel::isSelecionado)
                .map(dep -> Integer.parseInt(dep.getCodigo()))
                .collect(Collectors.toList());

        List<Integer> codTributacoes = tributacoesSelecionadas.stream()
                .filter(TributacaoModel::isSelecionado)
                .map(trib -> Integer.parseInt(trib.getCodigo().toString()))
                .collect(Collectors.toList());

        // Busca os produtos no banco de dados com os critérios selecionados
        return pcprodutDAO.buscarProdutosFiltrados(
                parametros.getCliente(),
                parametros.getFilial(),
                parametros.getPraca(),
                parametros.getPlanoPagamento(),
                parametros.getCobranca(),
                codDepartamentos,
                codTributacoes
        );
    }
}
