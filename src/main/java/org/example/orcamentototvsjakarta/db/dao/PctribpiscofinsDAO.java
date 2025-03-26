package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.orcamentototvsjakarta.db.entidade.Pctribpiscofins;
import java.util.List;

public class PctribpiscofinsDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Pctribpiscofins buscarPorId(Short id) {
        return entityManager.find(Pctribpiscofins.class, id);
    }

    public List<Pctribpiscofins> buscarTodos() {
        return entityManager.createQuery("SELECT p FROM Pctribpiscofins p", Pctribpiscofins.class).getResultList();
    }

    public List<Pctribpiscofins> buscarPorDescricao(String descricao) {
        return entityManager.createQuery("SELECT p FROM Pctribpiscofins p WHERE p.descricaotribpiscofins LIKE :descricao", Pctribpiscofins.class)
                .setParameter("descricao", "%" + descricao + "%")
                .getResultList();
    }

    public List<Pctribpiscofins> buscarPorSituacaoTributaria(Integer sittribut) {
        return entityManager.createQuery("SELECT p FROM Pctribpiscofins p WHERE p.sittribut = :sittribut", Pctribpiscofins.class)
                .setParameter("sittribut", sittribut)
                .getResultList();
    }

    @Transactional
    public void salvar(Pctribpiscofins tributacao) {
        entityManager.persist(tributacao);
    }

    @Transactional
    public void atualizar(Pctribpiscofins tributacao) {
        entityManager.merge(tributacao);
    }

    @Transactional
    public void remover(Short id) {
        Pctribpiscofins tributacao = buscarPorId(id);
        if (tributacao != null) {
            entityManager.remove(tributacao);
        }
    }
}
