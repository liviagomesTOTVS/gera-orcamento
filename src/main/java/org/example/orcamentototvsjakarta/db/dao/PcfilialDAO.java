package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.TypedQuery;
import org.example.orcamentototvsjakarta.db.entidade.Pcfilial;

import java.util.List;

public class PcfilialDAO extends BaseDAO<Pcfilial, String> {

    public PcfilialDAO() {
        super(Pcfilial.class);
    }

    /** Buscar uma filial pelo código **/
    public Pcfilial buscarPorCodigo(String codFilial) {
        return entityManager.find(Pcfilial.class, codFilial);
    }

    /** Buscar todas as filiais **/
    public List<Pcfilial> buscarTodas() {
        TypedQuery<Pcfilial> query = entityManager.createQuery("SELECT p FROM Pcfilial p", Pcfilial.class);
        return query.getResultList();
    }

    /** Buscar filiais por CNPJ **/
    public List<Pcfilial> buscarPorCNPJ(String cgc) {
        TypedQuery<Pcfilial> query = entityManager.createQuery(
                "SELECT p FROM Pcfilial p WHERE p.cgc = :cgc", Pcfilial.class);
        query.setParameter("cgc", cgc);
        return query.getResultList();
    }

    /** Buscar filiais por nome (Razão Social) **/
    public List<Pcfilial> buscarPorNome(String nome) {
        TypedQuery<Pcfilial> query = entityManager.createQuery(
                "SELECT p FROM Pcfilial p WHERE p.razaosocial LIKE :nome", Pcfilial.class);
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }

    /** Buscar filiais por cidade **/
    public List<Pcfilial> buscarPorCidade(String cidade) {
        TypedQuery<Pcfilial> query = entityManager.createQuery(
                "SELECT p FROM Pcfilial p WHERE p.cidade = :cidade", Pcfilial.class);
        query.setParameter("cidade", cidade);
        return query.getResultList();
    }

    /** Buscar filiais por UF **/
    public List<Pcfilial> buscarPorUF(String uf) {
        TypedQuery<Pcfilial> query = entityManager.createQuery(
                "SELECT p FROM Pcfilial p WHERE p.uf = :uf", Pcfilial.class);
        query.setParameter("uf", uf);
        return query.getResultList();
    }

    /** Buscar filiais que tenham um cliente vinculado **/
    public List<Pcfilial> buscarPorCliente(Integer codCli) {
        TypedQuery<Pcfilial> query = entityManager.createQuery(
                "SELECT p FROM Pcfilial p WHERE p.codcli = :codCli", Pcfilial.class);
        query.setParameter("codCli", codCli);
        return query.getResultList();
    }

    /** Buscar filiais que tenham um fornecedor vinculado **/
    public List<Pcfilial> buscarPorFornecedor(Integer codFornec) {
        TypedQuery<Pcfilial> query = entityManager.createQuery(
                "SELECT p FROM Pcfilial p WHERE p.codfornec = :codFornec", Pcfilial.class);
        query.setParameter("codFornec", codFornec);
        return query.getResultList();
    }

    /** Buscar a próxima numeração de nota fiscal **/
    public Long buscarProxNumNota(String codFilial) {
        TypedQuery<Long> query = entityManager.createQuery(
                "SELECT p.proxnumnota FROM Pcfilial p WHERE p.id = :codFilial", Long.class);
        query.setParameter("codFilial", codFilial);
        return query.getSingleResult();
    }
}
