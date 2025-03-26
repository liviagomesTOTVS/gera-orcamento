package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.orcamentototvsjakarta.db.entidade.Pccob;

import java.util.List;

public class PccobDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    private EntityManager em = emf.createEntityManager();

    /**
     * Busca todas as cobranças cadastradas.
     * @return Lista de cobranças (Pccob)
     */
    public List<Pccob> buscarTodos() {
        return em.createQuery("SELECT p FROM Pccob p WHERE p.codcob <> '9999'", Pccob.class).getResultList();
    }

    /**
     * Busca uma cobrança específica pelo código.
     * @param codcob Código da cobrança
     * @return Objeto Pccob ou null se não encontrado
     */
    public Pccob buscarPorCodigo(String codcob) {
        return em.find(Pccob.class, codcob);
    }

    /**
     * Salva uma nova cobrança no banco de dados.
     * @param pccob Objeto Pccob a ser salvo
     */
    public void salvar(Pccob pccob) {
        try {
            em.getTransaction().begin();
            em.persist(pccob);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        }
    }

    /**
     * Atualiza um registro existente de cobrança.
     * @param pccob Objeto Pccob com os dados atualizados
     */
    public void atualizar(Pccob pccob) {
        try {
            em.getTransaction().begin();
            em.merge(pccob);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        }
    }

    /**
     * Exclui uma cobrança pelo código.
     * @param codcob Código da cobrança a ser removida
     */
    public void excluir(String codcob) {
        try {
            Pccob pccob = buscarPorCodigo(codcob);
            if (pccob != null) {
                em.getTransaction().begin();
                em.remove(pccob);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        }
    }

    /**
     * Busca cobranças com base em um critério específico.
     * @param codmoeda Código da moeda associada à cobrança
     * @return Lista de cobranças que correspondem ao critério
     */
    public List<Pccob> buscarPorMoeda(String codmoeda) {
        return em.createQuery("SELECT p FROM Pccob p WHERE p.codmoeda = :codmoeda", Pccob.class)
                .setParameter("codmoeda", codmoeda)
                .getResultList();
    }

    /**
     * Fecha o EntityManager e a fábrica de persistência.
     */
    public void fechar() {
        if (em.isOpen()) {
            em.close();
        }
        if (emf.isOpen()) {
            emf.close();
        }
    }
}
