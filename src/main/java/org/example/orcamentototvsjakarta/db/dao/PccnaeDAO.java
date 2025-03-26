package org.example.orcamentototvsjakarta.db.dao;

import org.example.orcamentototvsjakarta.db.entidade.Pccnae;

import java.util.List;

public class PccnaeDAO extends BaseDAO<Pccnae, String> {

    public PccnaeDAO() {
        super(Pccnae.class);
    }

    public List<Pccnae> buscarPorDescricao(String descricao) {
        return entityManager.createQuery("SELECT p FROM Pccnae p WHERE p.desccnae LIKE :desc", Pccnae.class)
                .setParameter("desc", "%" + descricao + "%")
                .getResultList();
    }
}

