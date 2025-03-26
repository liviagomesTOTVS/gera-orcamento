package org.example.orcamentototvsjakarta.db.dao;

import org.example.orcamentototvsjakarta.db.entidade.Pccaixa;

import java.util.List;

public class PccaixaDAO extends BaseDAO<Pccaixa, Short> {

    public PccaixaDAO() {
        super(Pccaixa.class);
    }

    public List<Pccaixa> buscarPorDescricao(String descricao) {
        return entityManager.createQuery("SELECT p FROM Pccaixa p WHERE p.descricao LIKE :desc", Pccaixa.class)
                .setParameter("desc", "%" + descricao + "%")
                .getResultList();
    }
}

