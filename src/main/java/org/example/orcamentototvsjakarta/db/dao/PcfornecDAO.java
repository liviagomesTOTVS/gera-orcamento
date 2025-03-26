package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.orcamentototvsjakarta.db.entidade.Pcfornec;
import java.util.List;

public class PcfornecDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Pcfornec buscarPorId(Integer id) {
        return entityManager.find(Pcfornec.class, id);
    }

    public List<Pcfornec> buscarTodos() {
        return entityManager.createQuery("SELECT p FROM Pcfornec p", Pcfornec.class).getResultList();
    }

    public List<Pcfornec> buscarPorNome(String nome) {
        return entityManager.createQuery("SELECT p FROM Pcfornec p WHERE p.fornecedor LIKE :nome", Pcfornec.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }

    public List<Pcfornec> buscarPorCidade(String cidade) {
        return entityManager.createQuery("SELECT p FROM Pcfornec p WHERE p.cidade = :cidade", Pcfornec.class)
                .setParameter("cidade", cidade)
                .getResultList();
    }

    public List<Pcfornec> buscarPorEstado(String estado) {
        return entityManager.createQuery("SELECT p FROM Pcfornec p WHERE p.estado = :estado", Pcfornec.class)
                .setParameter("estado", estado)
                .getResultList();
    }

    public Pcfornec buscarPorCNPJ(String cgc) {
        return entityManager.createQuery("SELECT p FROM Pcfornec p WHERE p.cgc = :cgc", Pcfornec.class)
                .setParameter("cgc", cgc)
                .getSingleResult();
    }

    @Transactional
    public void salvar(Pcfornec fornecedor) {
        entityManager.persist(fornecedor);
    }

    @Transactional
    public void atualizar(Pcfornec fornecedor) {
        entityManager.merge(fornecedor);
    }

    @Transactional
    public void remover(Integer id) {
        Pcfornec fornecedor = buscarPorId(id);
        if (fornecedor != null) {
            entityManager.remove(fornecedor);
        }
    }
}
