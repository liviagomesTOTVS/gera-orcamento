package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.*;
import org.example.orcamentototvsjakarta.DTO.ClienteDTO;
import org.example.orcamentototvsjakarta.db.entidade.Pcclient;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * DAO para acesso a dados da entidade Pcclient.
 * Implementa operações CRUD e consultas específicas.
 */
public class PcclientDAO extends BaseDAO<Pcclient, Short> {

    private static final Logger LOGGER = Logger.getLogger(PcclientDAO.class.getName());
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

    /**
     * Construtor padrão
     */
    public PcclientDAO() {
        super(Pcclient.class);
    }

    /**
     * Obtém um EntityManager para operações de banco de dados
     */
    protected EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    /**
     * Busca um cliente pelo código e retorna como DTO
     */
    public ClienteDTO buscarDTOporCodigo(Integer codcli) {
        EntityManager entityManager = getEntityManager();
        try {
            Pcclient cliente = buscarPorCodigo(codcli);
            if (cliente != null) {
                return new ClienteDTO(cliente.getId().getCodcli(), cliente.getCliente(), cliente.getCgcent());
            }
            return null;
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca clientes por filtro de texto e retorna como DTOs
     */
    public List<ClienteDTO> buscarDTOPorFiltro(String termo, int limite) {
        EntityManager entityManager = getEntityManager();
        try {
            String jpql = "SELECT NEW org.example.orcamentototvsjakarta.DTO.ClienteDTO(" +
                    "p.id.codcli, p.cliente, p.cgcent) " +
                    "FROM Pcclient p " +
                    "WHERE (UPPER(p.cliente) LIKE :termo OR " +
                    "       CAST(p.id.codcli AS string) LIKE :termo OR " +
                    "       REGEXP_REPLACE(p.cgcent, '[^0-9]', '') LIKE :termo) " +
                    "AND p.id.codcli <> 99";

            return entityManager.createQuery(jpql, ClienteDTO.class)
                    .setParameter("termo", "%" + termo.replaceAll("[^0-9a-zA-Z]", "").toUpperCase() + "%")
                    .setMaxResults(limite)
                    .getResultList();
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca todos os clientes e retorna como DTOs
     */
    public List<ClienteDTO> buscarTodosDTO() {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.createQuery(
                            "SELECT new org.example.orcamentototvsjakarta.DTO.ClienteDTO(p.id.codcli, p.cliente, p.cgcent) " +
                                    "FROM Pcclient p WHERE p.id.codcli <> 99", ClienteDTO.class)
                    .getResultList();
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca todos os clientes
     */
    public List<Pcclient> buscarTodos() {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.createQuery(
                            "SELECT p FROM Pcclient p WHERE p.id.codcli <> 99", Pcclient.class)
                    .getResultList();
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca clientes por filtro de texto
     */
    public List<Pcclient> buscarPorFiltro(String termo) {
        EntityManager entityManager = getEntityManager();
        try {
            String jpql = "SELECT c FROM Pcclient c WHERE " +
                    "UPPER(c.cliente) LIKE :termo OR " +
                    "CAST(c.id.codcli AS string) LIKE :termo";
            return entityManager.createQuery(jpql, Pcclient.class)
                    .setParameter("termo", "%" + termo.toUpperCase() + "%")
                    .getResultList();
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca um cliente pelo código
     */
    public Pcclient buscarPorCodigo(int codcli) {
        if (codcli == 99) {
            return null;
        }

        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.createQuery(
                            "SELECT p FROM Pcclient p WHERE p.id.codcli = :codcli AND p.id.codcli <> 99", Pcclient.class)
                    .setParameter("codcli", codcli)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null; // Retorna null se não encontrar nenhum cliente
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao buscar cliente pelo código: " + codcli, e);
            throw new RuntimeException("Erro ao buscar cliente pelo código: " + codcli, e);
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca clientes por praça
     */
    public List<Pcclient> buscarPorPraca(Integer codpraca) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Pcclient> query = entityManager.createQuery(
                    "SELECT p FROM Pcclient p WHERE p.codpraca = :codpraca", Pcclient.class);
            query.setParameter("codpraca", codpraca);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca a praça de um cliente
     */
    public Integer buscarPracaPorCliente(Integer codcli) {
        EntityManager entityManager = getEntityManager();
        try {
            List<Integer> resultados = entityManager.createQuery(
                            "SELECT p.codpraca FROM Pcclient p WHERE p.id.codcli = :codcli", Integer.class)
                    .setParameter("codcli", codcli)
                    .getResultList();

            // Retorna o primeiro resultado, ou null se a lista estiver vazia
            return resultados.isEmpty() ? null : resultados.get(0);
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao buscar praça do cliente: " + codcli, e);
            return null; // Retorna null em caso de erro
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca o ramo de atividade de um cliente
     */
    public Integer buscarRamoAtividadePorCliente(Integer codcli) {
        EntityManager entityManager = getEntityManager();
        try {
            List<Integer> resultados = entityManager.createQuery(
                            "SELECT p.codatv1 FROM Pcclient p WHERE p.id.codcli = :codcli", Integer.class)
                    .setParameter("codcli", codcli)
                    .getResultList();

            // Retorna o primeiro resultado, ou null se a lista estiver vazia
            return resultados.isEmpty() ? null : resultados.get(0);
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao buscar ramo de atividade do cliente: " + codcli, e);
            return null; // Retorna null em caso de erro
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca clientes por ramo de atividade
     */
    public List<Pcclient> buscarPorRamoAtividade(Integer codatv1) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Pcclient> query = entityManager.createQuery(
                    "SELECT p FROM Pcclient p WHERE p.codatv1 = :codatv1", Pcclient.class);
            query.setParameter("codatv1", codatv1);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca clientes por plano de pagamento
     */
    public List<Pcclient> buscarPorPlanoPagamento(Integer codplpag) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Pcclient> query = entityManager.createQuery(
                    "SELECT p FROM Pcclient p WHERE p.codplpag = :codplpag", Pcclient.class);
            query.setParameter("codplpag", codplpag);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca clientes por código de cobrança
     */
    public List<Pcclient> buscarPorCobranca(String codcob) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Pcclient> query = entityManager.createQuery(
                    "SELECT p FROM Pcclient p WHERE p.codcob = :codcob", Pcclient.class);
            query.setParameter("codcob", codcob);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }

    /**
     * Salva um novo cliente
     */
    public void salvar(Pcclient cliente) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(cliente);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            LOGGER.log(Level.SEVERE, "Erro ao salvar cliente", e);
            throw new RuntimeException("Erro ao salvar cliente: " + e.getMessage(), e);
        } finally {
            entityManager.close();
        }
    }

    /**
     * Atualiza um cliente existente
     */
    public void atualizar(Pcclient cliente) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(cliente);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            LOGGER.log(Level.SEVERE, "Erro ao atualizar cliente", e);
            throw new RuntimeException("Erro ao atualizar cliente: " + e.getMessage(), e);
        } finally {
            entityManager.close();
        }
    }

    /**
     * Remove um cliente
     */
    public void remover(Pcclient cliente) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.contains(cliente) ? cliente : entityManager.merge(cliente));
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            LOGGER.log(Level.SEVERE, "Erro ao remover cliente", e);
            throw new RuntimeException("Erro ao remover cliente: " + e.getMessage(), e);
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca o plano de pagamento de um cliente
     */
    public Short buscarPlanoPagamentoPorCliente(Integer codcli) {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.createQuery(
                            "SELECT p.codplpag FROM Pcclient p WHERE p.id.codcli = :codcli", Short.class)
                    .setParameter("codcli", codcli)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null; // Retorna null se o cliente não tiver plano de pagamento
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao buscar plano de pagamento do cliente: " + codcli, e);
            return null;
        } finally {
            entityManager.close();
        }
    }

    /**
     * Busca o código de cobrança de um cliente
     */
    public String buscarCobrancaPorCliente(Integer codcli) {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.createQuery(
                            "SELECT p.codcob FROM Pcclient p WHERE p.id.codcli = :codcli", String.class)
                    .setParameter("codcli", codcli)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null; // Retorna null se o cliente não tiver cobrança cadastrada
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Erro ao buscar código de cobrança do cliente: " + codcli, e);
            return null;
        } finally {
            entityManager.close();
        }
    }

    /**
     * Método para fechar a EntityManagerFactory quando a aplicação for encerrada
     * Este método deve ser chamado ao finalizar a aplicação
     */
    public static void closeEntityManagerFactory() {
        if (emf != null && emf.isOpen()) {
            emf.close();
            LOGGER.info("EntityManagerFactory fechada com sucesso");
        }
    }
}