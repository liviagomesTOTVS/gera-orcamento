package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.*;
import org.example.orcamentototvsjakarta.db.entidade.Pcclient;

import java.util.List;

public class PcclientDAO extends BaseDAO<Pcclient, Short>{

    @PersistenceContext
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    private EntityManager entityManager;

    public PcclientDAO() {
        super(Pcclient.class);
        this.entityManager = emf.createEntityManager(); // Inicializando o EntityManager corretamente
    }

    /** Buscar um cliente pelo código **/
//    public Pcclient buscarPorCodigo(Integer codcli) {
//        return entityManager.find(Pcclient.class, codcli);
//    }

    /** Buscar todos os clientes **/
    public List<Pcclient> buscarTodos() {
        return entityManager.createQuery(
                        "SELECT p FROM Pcclient p WHERE p.id.codcli <> 99", Pcclient.class)
                .getResultList();
    }

    public List<Pcclient> buscarPorFiltro(String termo) {
        // Exemplo genérico usando JPQL ou SQL nativo — adapte à sua stack.
        String jpql = "SELECT c FROM Pcclient c WHERE " +
                "UPPER(c.cliente) LIKE :termo OR " +
                "CAST(c.id.codcli AS string) LIKE :termo";
        return entityManager.createQuery(jpql, Pcclient.class)
                .setParameter("termo", "%" + termo.toUpperCase() + "%")
                .getResultList();
    }

    public Pcclient buscarPorCodigo(int codcli) {
        if (codcli == 99) {
            return null;
        }
        try {
            return entityManager.createQuery(
                            "SELECT p FROM Pcclient p WHERE p.id.codcli = :codcli AND p.id.codcli <> 99", Pcclient.class)
                    .setParameter("codcli", codcli)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null; // Retorna null se não encontrar nenhum cliente
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar cliente pelo código: " + codcli, e);
        }
    }

    /** Buscar clientes por praça **/
    public List<Pcclient> buscarPorPraca(Integer codpraca) {
        TypedQuery<Pcclient> query = entityManager.createQuery(
                "SELECT p FROM Pcclient p WHERE p.codpraca = :codpraca", Pcclient.class);
        query.setParameter("codpraca", codpraca);
        return query.getResultList();
    }

    public Integer buscarPracaPorCliente(Integer codcli) {
        try {
            List<Integer> resultados = entityManager.createQuery(
                            "SELECT p.codpraca FROM Pcclient p WHERE p.id.codcli = :codcli", Integer.class)
                    .setParameter("codcli", codcli)
                    .getResultList();

            // Retorna o primeiro resultado, ou null se a lista estiver vazia
            return resultados.isEmpty() ? null : resultados.get(0);
        } catch (Exception e) {
            // Log da exceção (opcional)
            System.err.println("Erro ao buscar praça do cliente: " + e.getMessage());
            return null; // Retorna null em caso de erro
        }
    }

    public Integer buscarRamoAtividadePorCliente(Integer codcli) {
        try {
            List<Integer> resultados = entityManager.createQuery(
                            "SELECT p.codatv1 FROM Pcclient p WHERE p.id.codcli = :codcli", Integer.class)
                    .setParameter("codcli", codcli)
                    .getResultList();

            // Retorna o primeiro resultado, ou null se a lista estiver vazia
            return resultados.isEmpty() ? null : resultados.get(0);
        } catch (Exception e) {
            // Log da exceção (opcional)
            System.err.println("Erro ao buscar ramo de atividade do cliente: " + e.getMessage());
            return null; // Retorna null em caso de erro
        }
    }


    /** Buscar clientes por ramo de atividade **/
    public List<Pcclient> buscarPorRamoAtividade(Integer codatv1) {
        TypedQuery<Pcclient> query = entityManager.createQuery(
                "SELECT p FROM Pcclient p WHERE p.codatv1 = :codatv1", Pcclient.class);
        query.setParameter("codatv1", codatv1);
        return query.getResultList();
    }


    /** Buscar clientes por plano de pagamento **/
    public List<Pcclient> buscarPorPlanoPagamento(Integer codplpag) {
        TypedQuery<Pcclient> query = entityManager.createQuery(
                "SELECT p FROM Pcclient p WHERE p.codplpag = :codplpag", Pcclient.class);
        query.setParameter("codplpag", codplpag);
        return query.getResultList();
    }

    /** Buscar clientes por código de cobrança **/
    public List<Pcclient> buscarPorCobranca(String codcob) {
        TypedQuery<Pcclient> query = entityManager.createQuery(
                "SELECT p FROM Pcclient p WHERE p.codcob = :codcob", Pcclient.class);
        query.setParameter("codcob", codcob);
        return query.getResultList();
    }

    /** Salvar um novo cliente **/
    public void salvar(Pcclient cliente) {
        entityManager.persist(cliente);
    }

    /** Atualizar um cliente existente **/
    public void atualizar(Pcclient cliente) {
        entityManager.merge(cliente);
    }

    /** Remover um cliente **/
    public void remover(Pcclient cliente) {
        entityManager.remove(entityManager.contains(cliente) ? cliente : entityManager.merge(cliente));
    }

    public Short buscarPlanoPagamentoPorCliente(Integer codcli) {
        try {
            return entityManager.createQuery(
                            "SELECT p.codplpag FROM Pcclient p WHERE p.id.codcli = :codcli", Short.class)
                    .setParameter("codcli", codcli)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null; // Retorna null se o cliente não tiver plano de pagamento
        } catch (Exception e) {
            System.err.println("Erro ao buscar plano de pagamento do cliente: " + e.getMessage());
            return null;
        }
    }

    public String buscarCobrancaPorCliente(Integer codcli) {
        try {
            return entityManager.createQuery(
                            "SELECT p.codcob FROM Pcclient p WHERE p.id.codcli = :codcli", String.class)
                    .setParameter("codcli", codcli)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null; // Retorna null se o cliente não tiver cobrança cadastrada
        } catch (Exception e) {
            System.err.println("Erro ao buscar código de cobrança do cliente: " + e.getMessage());
            return null;
        }
    }



}
