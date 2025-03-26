package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.orcamentototvsjakarta.db.entidade.Pcsuperv;

import java.util.List;

public class PcsupervDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Pcsuperv buscarPorId(Short id) {
        return entityManager.find(Pcsuperv.class, id);
    }

    public List<Pcsuperv> buscarPorRegional(Short regional) {
        return entityManager.createQuery("SELECT p FROM Pcsuperv p WHERE p.regional = :regional", Pcsuperv.class)
                .setParameter("regional", regional)
                .getResultList();
    }

    public List<Pcsuperv> buscarPorGerente(Short codgerente) {
        return entityManager.createQuery("SELECT p FROM Pcsuperv p WHERE p.codgerente = :codgerente", Pcsuperv.class)
                .setParameter("codgerente", codgerente)
                .getResultList();
    }

    public List<Pcsuperv> buscarPorCoordenador(Long codcoordenador) {
        return entityManager.createQuery("SELECT p FROM Pcsuperv p WHERE p.codcoordenador = :codcoordenador", Pcsuperv.class)
                .setParameter("codcoordenador", codcoordenador)
                .getResultList();
    }

    public List<Pcsuperv> buscarPorPosicao(String posicao) {
        return entityManager.createQuery("SELECT p FROM Pcsuperv p WHERE p.posicao = :posicao", Pcsuperv.class)
                .setParameter("posicao", posicao)
                .getResultList();
    }

    @Transactional
    public void inserirSupervisor(Pcsuperv supervisor) {
        entityManager.persist(supervisor);
    }

    @Transactional
    public void atualizarSupervisor(Pcsuperv supervisor) {
        entityManager.merge(supervisor);
    }

    @Transactional
    public void removerSupervisor(Short id) {
        Pcsuperv supervisor = entityManager.find(Pcsuperv.class, id);
        if (supervisor != null) {
            entityManager.remove(supervisor);
        }
    }
}
