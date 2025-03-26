package org.example.orcamentototvsjakarta.db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.orcamentototvsjakarta.db.entidade.Pcprodut;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class PcprodutDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Pcprodut buscarPorId(Integer id) {
        return entityManager.find(Pcprodut.class, id);
    }

    public List<Pcprodut> buscarPorDepartamento(Integer codepto) {
        return entityManager.createQuery("SELECT p FROM Pcprodut p WHERE p.codepto = :codepto", Pcprodut.class)
                .setParameter("codepto", codepto)
                .getResultList();
    }

    public List<Pcprodut> buscarDisponiveisParaVenda() {
        return entityManager.createQuery("SELECT p FROM Pcprodut p WHERE p.qtest > 0", Pcprodut.class)
                .getResultList();
    }

    public List<Pcprodut> buscarPorFornecedor(Integer codfornec) {
        return entityManager.createQuery("SELECT p FROM Pcprodut p WHERE p.codfornec = :codfornec", Pcprodut.class)
                .setParameter("codfornec", codfornec)
                .getResultList();
    }

    public List<Pcprodut> buscarPorMarca(Integer codmarca) {
        return entityManager.createQuery("SELECT p FROM Pcprodut p WHERE p.codmarca = :codmarca", Pcprodut.class)
                .setParameter("codmarca", codmarca)
                .getResultList();
    }

    public List<Pcprodut> buscarPorCategoria(Integer codcategoria, Integer codsubcategoria) {
        return entityManager.createQuery("SELECT p FROM Pcprodut p WHERE p.codcategoria = :codcategoria AND p.codsubcategoria = :codsubcategoria", Pcprodut.class)
                .setParameter("codcategoria", codcategoria)
                .setParameter("codsubcategoria", codsubcategoria)
                .getResultList();
    }

    public Pcprodut buscarPorCodigoAuxiliar(Long codauxiliar) {
        return entityManager.createQuery("SELECT p FROM Pcprodut p WHERE p.codauxiliar = :codauxiliar", Pcprodut.class)
                .setParameter("codauxiliar", codauxiliar)
                .getSingleResult();
    }

    public List<Pcprodut> buscarHistoricoPreco(Integer codprod) {
        return entityManager.createQuery("SELECT p FROM Pcprodut p WHERE p.id = :codprod ORDER BY p.dtultalter DESC", Pcprodut.class)
                .setParameter("codprod", codprod)
                .getResultList();
    }

    @Transactional
    public void atualizarEstoqueECusto(Integer codprod, Integer qtest, Double custofin, Double custoreal) {
        entityManager.createQuery("UPDATE Pcprodut p SET p.qtest = :qtest, p.custofin = :custofin, p.custoreal = :custoreal WHERE p.id = :codprod")
                .setParameter("qtest", qtest)
                .setParameter("custofin", custofin)
                .setParameter("custoreal", custoreal)
                .setParameter("codprod", codprod)
                .executeUpdate();
    }

    @Transactional
    public void inserirProduto(Pcprodut produto) {
        entityManager.persist(produto);
    }


    public List<Pcprodut> buscarProdutosFiltrados(String cliente, String filial, String praca,
                                                  String planoPagamento, String cobranca,
                                                  List<Integer> departamentos, List<Integer> tributacoes) {

        StringBuilder jpql = new StringBuilder("SELECT p FROM Pcprodut p JOIN p.estoque e WHERE p.dtExclusao IS NULL AND e.qtest > 0 ");

        if (cliente != null) {
            jpql.append("AND EXISTS (SELECT c FROM Pcclient c WHERE c.codcli = :cliente AND c.codpraca = :praca) ");
        }
        if (filial != null) {
            jpql.append("AND e.codfilial = :filial ");
        }
        if (planoPagamento != null) {
            jpql.append("AND EXISTS (SELECT t FROM Pctabpr t WHERE t.codplpag = :planoPagamento) ");
        }
        if (cobranca != null) {
            jpql.append("AND EXISTS (SELECT c FROM Pccob c WHERE c.codcob = :cobranca) ");
        }
        if (!departamentos.isEmpty()) {
            jpql.append("AND p.codepto IN :departamentos ");
        }
        if (!tributacoes.isEmpty()) {
            jpql.append("AND EXISTS (SELECT t FROM Pctribut t WHERE t.codst IN :tributacoes) ");
        }

        var query = entityManager.createQuery(jpql.toString(), Pcprodut.class);

        if (cliente != null) {
            query.setParameter("cliente", Integer.parseInt(cliente));
            query.setParameter("praca", Integer.parseInt(praca));
        }
        if (filial != null) {
            query.setParameter("filial", Integer.parseInt(filial));
        }
        if (planoPagamento != null) {
            query.setParameter("planoPagamento", Integer.parseInt(planoPagamento));
        }
        if (cobranca != null) {
            query.setParameter("cobranca", Integer.parseInt(cobranca));
        }
        if (!departamentos.isEmpty()) {
            query.setParameter("departamentos", departamentos);
        }
        if (!tributacoes.isEmpty()) {
            query.setParameter("tributacoes", tributacoes);
        }

        return query.getResultList();
    }

    public List<Pcprodut> buscarPorDepartamentos(List<String> codeptos) {
        return entityManager.createQuery(
                        "SELECT p FROM Pcprodut p WHERE p.codepto IN :codeptos", Pcprodut.class)
                .setParameter("codeptos", codeptos)
                .getResultList();
    }

    @Transactional
    public void atualizarProduto(Pcprodut produto) {
        entityManager.merge(produto);
    }
}
