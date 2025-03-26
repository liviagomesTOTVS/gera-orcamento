package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.orcamentototvsjakarta.db.entidade.Pctabpr;
import java.util.List;

public class PctabprDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Pctabpr buscarPorId(Long id) {
        return entityManager.find(Pctabpr.class, id);
    }

    public List<Pctabpr> buscarTodos() {
        return entityManager.createQuery("SELECT p FROM Pctabpr p", Pctabpr.class).getResultList();
    }

    public List<Pctabpr> buscarPorProduto(Long codProd) {
        return entityManager.createQuery("SELECT p FROM Pctabpr p WHERE p.id.codProd = :codProd", Pctabpr.class)
                .setParameter("codProd", codProd)
                .getResultList();
    }

    public List<Pctabpr> buscarPorRegiao(Integer numRegiao) {
        return entityManager.createQuery("SELECT p FROM Pctabpr p WHERE p.id.numRegiao = :numRegiao", Pctabpr.class)
                .setParameter("numRegiao", numRegiao)
                .getResultList();
    }

    public List<Pctabpr> buscarPorTabelaPreco(Integer numTabela) {
        return entityManager.createQuery("SELECT p FROM Pctabpr p WHERE p.id.numTabela = :numTabela", Pctabpr.class)
                .setParameter("numTabela", numTabela)
                .getResultList();
    }

    public List<Pctabpr> buscarProdutosComDescontoMaximo() {
        return entityManager.createQuery("SELECT p FROM Pctabpr p WHERE p.perdescmax > 0", Pctabpr.class)
                .getResultList();
    }

    @Transactional
    public void salvar(Pctabpr tabelaPreco) {
        entityManager.persist(tabelaPreco);
    }

    @Transactional
    public void atualizar(Pctabpr tabelaPreco) {
        entityManager.merge(tabelaPreco);
    }

    @Transactional
    public void remover(Long id) {
        Pctabpr tabelaPreco = buscarPorId(id);
        if (tabelaPreco != null) {
            entityManager.remove(tabelaPreco);
        }
    }
}