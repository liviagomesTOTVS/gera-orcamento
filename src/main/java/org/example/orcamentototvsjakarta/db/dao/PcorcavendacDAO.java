package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.orcamentototvsjakarta.db.entidade.Pcorcavendac;
import java.util.List;

public class PcorcavendacDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Pcorcavendac buscarPorId(Long id) {
        return entityManager.find(Pcorcavendac.class, id);
    }

    public List<Pcorcavendac> buscarTodos() {
        return entityManager.createQuery("SELECT p FROM Pcorcavendac p", Pcorcavendac.class).getResultList();
    }

    public List<Pcorcavendac> buscarPorCliente(Integer codCli) {
        return entityManager.createQuery("SELECT p FROM Pcorcavendac p WHERE p.codcli = :codCli", Pcorcavendac.class)
                .setParameter("codCli", codCli)
                .getResultList();
    }

    public List<Pcorcavendac> buscarPorFilial(String codFilial) {
        return entityManager.createQuery("SELECT p FROM Pcorcavendac p WHERE p.codfilial = :codFilial", Pcorcavendac.class)
                .setParameter("codFilial", codFilial)
                .getResultList();
    }

    public List<Pcorcavendac> buscarPorData(String data) {
        return entityManager.createQuery("SELECT p FROM Pcorcavendac p WHERE p.data = :data", Pcorcavendac.class)
                .setParameter("data", data)
                .getResultList();
    }

    public List<Pcorcavendac> buscarPorVendedor(Short codUsur) {
        return entityManager.createQuery("SELECT p FROM Pcorcavendac p WHERE p.codusur = :codUsur", Pcorcavendac.class)
                .setParameter("codUsur", codUsur)
                .getResultList();
    }

    public List<Pcorcavendac> buscarPorPrazoMedio(Short prazoMedio) {
        return entityManager.createQuery("SELECT p FROM Pcorcavendac p WHERE p.prazomedio = :prazoMedio", Pcorcavendac.class)
                .setParameter("prazoMedio", prazoMedio)
                .getResultList();
    }

    @Transactional
    public void salvar(Pcorcavendac orcamento) {
        entityManager.persist(orcamento);
    }

    @Transactional
    public void atualizar(Pcorcavendac orcamento) {
        entityManager.merge(orcamento);
    }

    @Transactional
    public void remover(Long id) {
        Pcorcavendac orcamento = buscarPorId(id);
        if (orcamento != null) {
            entityManager.remove(orcamento);
        }
    }
}
