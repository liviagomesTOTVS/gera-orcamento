package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.orcamentototvsjakarta.db.entidade.Pcorcavendai;
import java.util.List;

public class PcorcavendaiDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Pcorcavendai buscarPorId(Long id) {
        return entityManager.find(Pcorcavendai.class, id);
    }

    public List<Pcorcavendai> buscarTodos() {
        return entityManager.createQuery("SELECT p FROM Pcorcavendai p", Pcorcavendai.class).getResultList();
    }

    public List<Pcorcavendai> buscarPorNumeroOrcamento(Long numOrca) {
        return entityManager.createQuery("SELECT p FROM Pcorcavendai p WHERE p.id.numOrca = :numOrca", Pcorcavendai.class)
                .setParameter("numOrca", numOrca)
                .getResultList();
    }

    public List<Pcorcavendai> buscarPorCodigoProduto(Long codProd) {
        return entityManager.createQuery("SELECT p FROM Pcorcavendai p WHERE p.id.codProd = :codProd", Pcorcavendai.class)
                .setParameter("codProd", codProd)
                .getResultList();
    }

    public List<Pcorcavendai> buscarPorCliente(Integer codCli) {
        return entityManager.createQuery("SELECT p FROM Pcorcavendai p WHERE p.codcli = :codCli", Pcorcavendai.class)
                .setParameter("codCli", codCli)
                .getResultList();
    }

    @Transactional
    public void salvar(Pcorcavendai item) {
        entityManager.persist(item);
    }

    @Transactional
    public void atualizar(Pcorcavendai item) {
        entityManager.merge(item);
    }

    @Transactional
    public void remover(Long id) {
        Pcorcavendai item = buscarPorId(id);
        if (item != null) {
            entityManager.remove(item);
        }
    }
}
