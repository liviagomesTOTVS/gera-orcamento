package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.*;
import org.example.orcamentototvsjakarta.db.entidade.Pcempr;
import java.util.List;

public class PcemprDAO extends BaseDAO<Pcempr, Integer> {

    @PersistenceContext
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    private EntityManager entityManager;

    public PcemprDAO() {
        super(Pcempr.class);
        this.entityManager = emf.createEntityManager(); // Inicializando o EntityManager corretamente
    }

    /** Buscar um funcionário pela matrícula **/
    public Pcempr buscarPorMatricula(Integer matricula) {
        return entityManager.find(Pcempr.class, matricula);
    }

    /** Buscar todos os funcionários **/
    public List<Pcempr> listarTodos() {
        return entityManager.createQuery("SELECT p FROM Pcempr p", Pcempr.class).getResultList();
    }

    /** Buscar funcionários pelo nome **/
    public List<Pcempr> buscarPorNome(String nome) {
        TypedQuery<Pcempr> query = entityManager.createQuery(
                "SELECT p FROM Pcempr p WHERE p.nome LIKE :nome", Pcempr.class);
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }

    /** Salvar um novo funcionário **/
    public void salvar(Pcempr funcionario) {
        entityManager.getTransaction().begin();
        entityManager.persist(funcionario);
        entityManager.getTransaction().commit();
    }

    /** Atualizar um funcionário existente **/
    public void atualizar(Pcempr funcionario) {
        entityManager.getTransaction().begin();
        entityManager.merge(funcionario);
        entityManager.getTransaction().commit();
    }

    /** Remover um funcionário **/
    public void remover(Pcempr funcionario) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(funcionario) ? funcionario : entityManager.merge(funcionario));
        entityManager.getTransaction().commit();
    }
}
