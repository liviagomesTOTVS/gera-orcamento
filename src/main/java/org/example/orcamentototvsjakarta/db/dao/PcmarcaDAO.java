package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.orcamentototvsjakarta.db.entidade.Pcmarca;
import java.util.List;

public class PcmarcaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Pcmarca buscarPorId(Integer id) {
        return entityManager.find(Pcmarca.class, id);
    }

    public List<Pcmarca> buscarTodos() {
        return entityManager.createQuery("SELECT p FROM Pcmarca p", Pcmarca.class).getResultList();
    }

    public List<Pcmarca> buscarPorNome(String nome) {
        return entityManager.createQuery("SELECT p FROM Pcmarca p WHERE p.marca LIKE :nome", Pcmarca.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }

    public List<Pcmarca> buscarAtivas() {
        return entityManager.createQuery("SELECT p FROM Pcmarca p WHERE p.ativo = 'S'", Pcmarca.class)
                .getResultList();
    }

    public List<Pcmarca> buscarPorComprador(Integer codcomprador) {
        return entityManager.createQuery("SELECT p FROM Pcmarca p WHERE p.codcomprador = :codcomprador", Pcmarca.class)
                .setParameter("codcomprador", codcomprador)
                .getResultList();
    }

    @Transactional
    public void salvar(Pcmarca marca) {
        entityManager.persist(marca);
    }

    @Transactional
    public void atualizar(Pcmarca marca) {
        entityManager.merge(marca);
    }

    @Transactional
    public void remover(Integer id) {
        Pcmarca marca = buscarPorId(id);
        if (marca != null) {
            entityManager.remove(marca);
        }
    }
}
