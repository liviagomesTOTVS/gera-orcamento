package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.orcamentototvsjakarta.db.entidade.Pcest;
import java.util.List;

public class PcestDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Pcest buscarPorId(Long id) {
        return entityManager.find(Pcest.class, id);
    }

    public List<Pcest> buscarTodos() {
        return entityManager.createQuery("SELECT p FROM Pcest p", Pcest.class).getResultList();
    }

    public List<Pcest> buscarPorProduto(Long codProd) {
        return entityManager.createQuery("SELECT p FROM Pcest p WHERE p.id.codProd = :codProd", Pcest.class)
                .setParameter("codProd", codProd)
                .getResultList();
    }

    public List<Pcest> buscarPorFilial(String codFilial) {
        return entityManager.createQuery("SELECT p FROM Pcest p WHERE p.id.codFilial = :codFilial", Pcest.class)
                .setParameter("codFilial", codFilial)
                .getResultList();
    }

    public List<Pcest> buscarPorEstoqueMinimo() {
        return entityManager.createQuery("SELECT p FROM Pcest p WHERE p.qtest < p.estmin", Pcest.class)
                .getResultList();
    }

    public List<Pcest> buscarProdutosComBaixoEstoque() {
        return entityManager.createQuery("SELECT p FROM Pcest p WHERE p.qtest < p.qtreserv", Pcest.class)
                .getResultList();
    }

    public List<Pcest> buscarPorCustoAlto() {
        return entityManager.createQuery("SELECT p FROM Pcest p WHERE p.custoreal > p.custofin", Pcest.class)
                .getResultList();
    }

    @Transactional
    public void salvar(Pcest estoque) {
        entityManager.persist(estoque);
    }

    @Transactional
    public void atualizar(Pcest estoque) {
        entityManager.merge(estoque);
    }

    @Transactional
    public void remover(Long id) {
        Pcest estoque = buscarPorId(id);
        if (estoque != null) {
            entityManager.remove(estoque);
        }
    }
}