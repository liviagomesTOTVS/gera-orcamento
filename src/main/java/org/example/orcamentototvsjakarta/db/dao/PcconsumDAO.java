package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.orcamentototvsjakarta.db.entidade.Pcconsum;
import java.util.List;

public class PcconsumDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Pcconsum findById(Long id) {
        return entityManager.find(Pcconsum.class, id);
    }

    public List<Pcconsum> findAll() {
        return entityManager.createQuery("SELECT p FROM Pcconsum p", Pcconsum.class).getResultList();
    }

    public List<Pcconsum> findByTributacaoPorUF(String valor) {
        return entityManager.createQuery("SELECT p FROM Pcconsum p WHERE p.usatributacaoporuf = :valor", Pcconsum.class)
                .setParameter("valor", valor)
                .getResultList();
    }

    public Integer findProximoNumeroPedido() {
        return entityManager.createQuery("SELECT p.proxnumped FROM Pcconsum p", Integer.class)
                .getSingleResult();
    }

    public Integer findProximoNumeroOrcamento() {
        return entityManager.createQuery("SELECT p.proxnumorc FROM Pcconsum p", Integer.class)
                .getSingleResult();
    }

    public Integer findProximoNumeroBonus() {
        return entityManager.createQuery("SELECT p.proxnumbonus FROM Pcconsum p", Integer.class)
                .getSingleResult();
    }

    public List<Pcconsum> findByTaxas() {
        return entityManager.createQuery("SELECT p FROM Pcconsum p WHERE p.taxa0 IS NOT NULL OR p.taxa7 IS NOT NULL OR p.taxa14 IS NOT NULL OR p.taxa21 IS NOT NULL OR p.taxa28 IS NOT NULL", Pcconsum.class)
                .getResultList();
    }

    public List<Pcconsum> findByConfigTributaria() {
        return entityManager.createQuery("SELECT p FROM Pcconsum p WHERE p.calccredpiscofins = 'S' OR p.calccredicms = 'S'", Pcconsum.class)
                .getResultList();
    }

    @Transactional
    public void updateProximoNumeroPedido(Long id, Integer novoNumero) {
        Pcconsum pcconsum = findById(id);
        if (pcconsum != null) {
            pcconsum.setProxnumped(novoNumero);
            entityManager.merge(pcconsum);
        }
    }

    @Transactional
    public void updateProximoNumeroOrcamento(Long id, Integer novoNumero) {
        Pcconsum pcconsum = findById(id);
        if (pcconsum != null) {
            pcconsum.setProxnumorc(Long.valueOf(novoNumero));
            entityManager.merge(pcconsum);
        }
    }
}
