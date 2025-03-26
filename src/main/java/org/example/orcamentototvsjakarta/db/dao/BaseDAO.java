package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public abstract class BaseDAO<T, ID> {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

    protected EntityManager entityManager;

    private final Class<T> entityClass;

    protected BaseDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
        this.entityManager = emf.createEntityManager(); // Inicializando EntityManager
    }

    public void salvar(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    public void atualizar(T entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void remover(T entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
        entityManager.getTransaction().commit();
    }

    public T buscarPorId(ID id) {
        return entityManager.find(entityClass, id);
    }

    public List<T> buscarTodos() {
        return entityManager.createQuery("FROM " + entityClass.getSimpleName(), entityClass).getResultList();
    }

    public static void close() {
        if (emf.isOpen()) {
            emf.close();
        }
    }
}
