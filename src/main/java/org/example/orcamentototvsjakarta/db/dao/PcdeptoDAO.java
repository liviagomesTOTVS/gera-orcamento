package org.example.orcamentototvsjakarta.db.dao;

import org.example.orcamentototvsjakarta.db.entidade.Pcdepto;

import java.util.List;

public class PcdeptoDAO extends BaseDAO<Pcdepto, Integer> {

    public PcdeptoDAO() {
        super(Pcdepto.class);
    }

    public List<Pcdepto> buscarPorDescricao(String descricao) {
        return entityManager.createQuery("SELECT p FROM Pcdepto p WHERE p.descricao LIKE :desc", Pcdepto.class)
                .setParameter("desc", "%" + descricao + "%")
                .getResultList();
    }
}

