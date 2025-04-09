package org.example.orcamentototvsjakarta.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe utilitária para gerenciar recursos JPA.
 * Implementa o padrão Singleton para a EntityManagerFactory.
 */
public class JPAUtil {

    private static final Logger LOGGER = Logger.getLogger(JPAUtil.class.getName());
    private static EntityManagerFactory emf;

    private static final String PERSISTENCE_UNIT = "default";

    /**
     * Inicializa a EntityManagerFactory se necessário
     */
    private static synchronized void inicializarFactory() {
        if (emf == null || !emf.isOpen()) {
            try {
                emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
                LOGGER.info("EntityManagerFactory inicializada com sucesso");
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Erro ao inicializar EntityManagerFactory", e);
                throw new RuntimeException("Erro ao inicializar banco de dados", e);
            }
        }
    }

    /**
     * Obtém um EntityManager da factory
     *
     * @return Um novo EntityManager
     */
    public static EntityManager getEntityManager() {
        inicializarFactory();
        return emf.createEntityManager();
    }

    /**
     * Fecha a EntityManagerFactory se estiver aberta.
     * Este método deve ser chamado quando a aplicação for encerrada.
     */
    public static void closeEntityManagerFactory() {
        if (emf != null && emf.isOpen()) {
            try {
                emf.close();
                LOGGER.info("EntityManagerFactory fechada com sucesso");
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "Erro ao fechar EntityManagerFactory", e);
            }
        }
    }
}