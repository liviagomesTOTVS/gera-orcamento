package org.example.orcamentototvsjakarta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class testeJPA {
    public static void main(String[] args) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default"); // OU "orcamentototvs"
            EntityManager em = emf.createEntityManager();
            System.out.println("JPA carregado com sucesso!");
            em.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
