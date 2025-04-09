package org.example.orcamentototvsjakarta.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JPAUtil {
    private static final Logger LOGGER = Logger.getLogger(JPAUtil.class.getName());
    private static EntityManagerFactory emf;

    // Cache simples em memória
    private static final Map<String, CacheEntry<?>> queryCache = new ConcurrentHashMap<>();
    private static final long CACHE_TIMEOUT = 300000; // 5 minutos

    // Inicialização estática do EntityManagerFactory
    static {
        try {
            emf = Persistence.createEntityManagerFactory("default");
            LOGGER.info("EntityManagerFactory inicializado com sucesso");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao inicializar EntityManagerFactory", e);
            throw new RuntimeException("Erro ao inicializar conexão com banco de dados", e);
        }
    }

    // Retorna um EntityManager da pool
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Fecha o EntityManagerFactory (chamar no encerramento da aplicação)
    public static void closeEntityManagerFactory() {
        if (emf != null && emf.isOpen()) {
            emf.close();
            LOGGER.info("EntityManagerFactory fechado com sucesso");
        }
    }

    // Método utilitário para execução de transações
    public static <T> T executeInTransaction(TransactionCallback<T> action) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            T result = action.execute(em);
            em.getTransaction().commit();
            return result;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new RuntimeException("Erro durante transação", e);
        } finally {
            em.close();
        }
    }

    // Método para execução sem transação
    public static <T> T executeWithoutTransaction(EntityManagerCallback<T> action) {
        EntityManager em = getEntityManager();
        try {
            return action.execute(em);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao executar operação", e);
        } finally {
            em.close();
        }
    }

    // Métodos para cache em memória
    @SuppressWarnings("unchecked")
    public static <T> T getCachedValue(String key) {
        CacheEntry<?> entry = queryCache.get(key);
        if (entry == null) {
            return null;
        }

        if (System.currentTimeMillis() - entry.timestamp > CACHE_TIMEOUT) {
            queryCache.remove(key);
            return null;
        }

        return (T) entry.value;
    }

    public static <T> void putCachedValue(String key, T value) {
        queryCache.put(key, new CacheEntry<>(value, System.currentTimeMillis()));
    }

    public static void clearCache() {
        queryCache.clear();
    }

    // Interface funcional para execução em transação
    @FunctionalInterface
    public interface TransactionCallback<T> {
        T execute(EntityManager em) throws Exception;
    }

    // Interface funcional para execução sem transação
    @FunctionalInterface
    public interface EntityManagerCallback<T> {
        T execute(EntityManager em) throws Exception;
    }

    // Classe interna para armazenar entradas de cache
    private static class CacheEntry<T> {
        private final T value;
        private final long timestamp;

        public CacheEntry(T value, long timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }
}