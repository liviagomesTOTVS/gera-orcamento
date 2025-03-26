package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import org.example.orcamentototvsjakarta.db.entidade.Pcusuari;

import java.util.List;

public class PcusuariDAO extends BaseDAO<Pcusuari, Short> {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

    public PcusuariDAO() {
        super(Pcusuari.class);
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Pcusuari findById(Short id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pcusuari.class, id);
        } finally {
            em.close();
        }
    }

    public List<Pcusuari> findByName(String name) {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Pcusuari p WHERE LOWER(p.nome) LIKE LOWER(:name)", Pcusuari.class)
                    .setParameter("name", "%" + name + "%")
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public void updatePassword(Short id, String newPassword) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Pcusuari user = em.find(Pcusuari.class, id);
            if (user != null) {
                user.setSenha(newPassword);
                em.merge(user);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<Pcusuari> findByFilial(String codFilial) {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Pcusuari p WHERE p.codfilial = :codFilial", Pcusuari.class)
                    .setParameter("codFilial", codFilial)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public Long getNextOrcamentoNumber(Short codUsur) {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT COALESCE(p.proxnumpedforca, 0) FROM Pcusuari p WHERE p.id = :codUsur", Long.class)
                    .setParameter("codUsur", codUsur)
                    .getSingleResult();
        } finally {
            em.close();
        }
    }

    public void updateNextOrcamentoNumber(Short codUsur, Long newNumber) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Pcusuari user = em.find(Pcusuari.class, codUsur);
            if (user != null) {
                user.setProxnumpedforca(newNumber);
                em.merge(user);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<Pcusuari> buscarTodos() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT u FROM Pcusuari u", Pcusuari.class).getResultList();
        } finally {
            em.close();
        }
    }

    public Short buscarSupervisorPorRCA(Short codusur) {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p.codsupervisor FROM Pcusuari p WHERE p.id = :codusur", Short.class)
                    .setParameter("codusur", codusur)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null; // Retorna null se o RCA não tiver um supervisor associado
        } finally {
            em.close();
        }
    }

}
