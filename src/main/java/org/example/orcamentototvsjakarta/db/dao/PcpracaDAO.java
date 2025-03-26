package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.orcamentototvsjakarta.db.entidade.Pcpraca;
import java.util.List;

public class PcpracaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Pcpraca buscarPorId(Short id) {
        return entityManager.find(Pcpraca.class, id);
    }

    public List<Pcpraca> buscarTodos() {
        return entityManager.createQuery("SELECT p FROM Pcpraca p", Pcpraca.class).getResultList();
    }

    public List<Pcpraca> buscarPorNome(String nome) {
        return entityManager.createQuery("SELECT p FROM Pcpraca p WHERE p.praca LIKE :nome", Pcpraca.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }

    public List<Pcpraca> buscarPorRegiao(Short numRegiao) {
        return entityManager.createQuery("SELECT p FROM Pcpraca p WHERE p.numregiao = :numRegiao", Pcpraca.class)
                .setParameter("numRegiao", numRegiao)
                .getResultList();
    }

    public List<Pcpraca> buscarPorSituacao(String situacao) {
        return entityManager.createQuery("SELECT p FROM Pcpraca p WHERE p.situacao = :situacao", Pcpraca.class)
                .setParameter("situacao", situacao)
                .getResultList();
    }

    public List<Pcpraca> buscarPorPrioridadeEntrega(String prioridade) {
        return entityManager.createQuery("SELECT p FROM Pcpraca p WHERE p.prioridadeentrega = :prioridade", Pcpraca.class)
                .setParameter("prioridade", prioridade)
                .getResultList();
    }

    @Transactional
    public void salvar(Pcpraca praca) {
        entityManager.persist(praca);
    }

    @Transactional
    public void atualizar(Pcpraca praca) {
        entityManager.merge(praca);
    }

    @Transactional
    public void remover(Short id) {
        Pcpraca praca = buscarPorId(id);
        if (praca != null) {
            entityManager.remove(praca);
        }
    }
}