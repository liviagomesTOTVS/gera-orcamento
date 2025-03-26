package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;
import org.example.orcamentototvsjakarta.db.entidade.Pcplpag;

import java.util.List;

public class PcplpagDAO extends BaseDAO<Pcplpag, Short> {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

    public PcplpagDAO() {
        super(Pcplpag.class);
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    /**
     * Retorna todos os registros da tabela PCPLPAG.
     * @return Lista de todos os planos de pagamento cadastrados.
     */
    public List<Pcplpag> buscarTodos() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Pcplpag p", Pcplpag.class).getResultList();
        } finally {
            em.close();
        }
    }

    public Pcplpag buscarPorId(Short id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pcplpag.class, id);
        } finally {
            em.close();
        }
    }

    public List<Pcplpag> buscarPorDescricao(String descricao) {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Pcplpag p WHERE LOWER(p.descricao) LIKE LOWER(:descricao)", Pcplpag.class)
                    .setParameter("descricao", "%" + descricao + "%")
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public List<Pcplpag> buscarPorTipoVenda(String tipovenda) {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Pcplpag p WHERE p.tipovenda = :tipovenda", Pcplpag.class)
                    .setParameter("tipovenda", tipovenda)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public List<Pcplpag> buscarPorCodigoCobranca(String codcob) {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Pcplpag p WHERE p.codcob = :codcob", Pcplpag.class)
                    .setParameter("codcob", codcob)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public List<Pcplpag> buscarParcelasPorDias(Short numdias) {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Pcplpag p WHERE p.numdias = :numdias", Pcplpag.class)
                    .setParameter("numdias", numdias)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    @Transactional
    public void inserir(Pcplpag pcplpag) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(pcplpag);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Transactional
    public void atualizar(Pcplpag pcplpag) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(pcplpag);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Transactional
    public void remover(Pcplpag pcplpag) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.contains(pcplpag) ? pcplpag : em.merge(pcplpag));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
