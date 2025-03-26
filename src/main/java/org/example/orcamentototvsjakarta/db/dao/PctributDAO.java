package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.*;
import org.example.orcamentototvsjakarta.db.entidade.Pctribut;
import java.math.BigDecimal;
import java.util.List;

public class PctributDAO extends BaseDAO<Pctribut, Short> {

    @PersistenceContext
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    private EntityManager entityManager;

    public PctributDAO() {
        super(Pctribut.class);
        this.entityManager = emf.createEntityManager(); // Inicializando o EntityManager corretamente
    }

    /** Buscar tributação por código do ST **/
    public Pctribut buscarPorCodigoST(Short codst) {
        return entityManager.find(Pctribut.class, codst);
    }

    /** Buscar todas as tributações **/
    public List<Pctribut> buscarTodos() {
        return entityManager.createQuery("SELECT p FROM Pctribut p", Pctribut.class).getResultList();
    }

    /** Buscar tributações filtrando por parâmetros **/
    public List<Pctribut> buscarPorTributacao(BigDecimal codicm, String sittribut, String figurapartilha) {
        TypedQuery<Pctribut> query = entityManager.createQuery(
                "SELECT p FROM Pctribut p WHERE p.codicm = :codicm AND p.sittribut = :sittribut AND p.figurapartilha = :figurapartilha",
                Pctribut.class);
        query.setParameter("codicm", codicm);
        query.setParameter("sittribut", sittribut);
        query.setParameter("figurapartilha", figurapartilha);
        return query.getResultList();
    }

    /** Salvar nova tributação **/
    public void salvar(Pctribut pctribut) {
        entityManager.getTransaction().begin();
        entityManager.persist(pctribut);
        entityManager.getTransaction().commit();
    }

    /** Atualizar tributação existente **/
    public void atualizar(Pctribut pctribut) {
        entityManager.getTransaction().begin();
        entityManager.merge(pctribut);
        entityManager.getTransaction().commit();
    }

    /** Remover uma tributação **/
    public void remover(Short codst) {
        entityManager.getTransaction().begin();
        Pctribut pctribut = buscarPorCodigoST(codst);
        if (pctribut != null) {
            entityManager.remove(pctribut);
        }
        entityManager.getTransaction().commit();
    }
}