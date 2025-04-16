package org.example.orcamentototvsjakarta.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.example.orcamentototvsjakarta.DTO.OrcamentoParams;
import org.example.orcamentototvsjakarta.DTO.ProdutoDTO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Repositório para acesso a dados de produtos
 * Encapsula as consultas SQL complexas para melhor manutenção
 */
public class ProdutoRepository {
    private static final Logger LOGGER = Logger.getLogger(ProdutoRepository.class.getName());

    /**
     * Busca produtos usando paginação para melhor performance
     */
    public List<Object[]> buscarProdutosPaginados(
            EntityManager em,
            Integer codcli,
            Short codplpag,
            Integer codfilial,
            List<Integer> departamentos,
            List<Short> codsts,
            Integer limiteProdutos,
            int offset,
            int pageSize,
            OrcamentoParams parametros) {  // Adicionar parâmetro OrcamentoParams

        try {
            LOGGER.info("DENTRO DE buscarProdutosPaginados");
            System.out.println("parametros é null? " + (parametros == null));

            // Abordagem compatível com Oracle para paginação
            StringBuilder sql = new StringBuilder();
            if (offset > 0 || pageSize > 0) {
                // Quando usando paginação, precisamos de uma estrutura diferente
                sql.append("SELECT * FROM (");
                sql.append("  SELECT a.*, ROWNUM rnum FROM (");
            } else {
                // Sem paginação, estrutura mais simples
                sql.append("SELECT * FROM (");
            }

            sql.append("    SELECT ROWNUM NUMSEQ, CODPROD, QTUNITEMB, QTESTOQUE, QTEST, QTESTGER, PUNIT, PTABELA, CODST ");
            sql.append("    FROM (");
            sql.append(construirQueryProdutos());

            // Substituímos parâmetros nomeados por posicionais
            sql.append("        AND PCPRODUT.CODEPTO IN (?1) ");
            sql.append("        AND PCTRIBUT.CODST IN (?2) ");
            sql.append("        AND PCCLIENT.CODCLI = ?3 ");
            sql.append("        AND PCPLPAG.CODPLPAG = ?4 ");
            sql.append("        AND PCEST.CODFILIAL = ?5 ");

            // Aplicar filtro de tipo de venda se necessário
            if (parametros != null && parametros.temFiltroTipoVendaAtivo()) {
                // Não aplicar filtro se todos estiverem selecionados ou todos desativados
                boolean boleto = parametros.isBoletoSelecionado();
                boolean pix = parametros.isPixSelecionado();
                boolean cartao = parametros.isCartaoSelecionado();
                LOGGER.info("Estado dos filtros: Boleto=" + boleto + ", Pix=" + pix + ", Cartão=" + cartao);

                if (!((boleto && pix && cartao) || (!boleto && !pix && !cartao))) {
                    sql.append(" AND PCPRODUT.CODPROD IN (");

                    List<String> subconsultas = new ArrayList<>();

                    if (boleto) {
                        LOGGER.info("Adicionando filtro para BOLETO");
                        subconsultas.add("SELECT DISTINCT p2.codprod FROM pcnfsaid v " +
                                "INNER JOIN pccob c ON v.codcob = c.codcob " +
                                "INNER JOIN pcmov m ON m.numnota = v.numnota " +
                                "INNER JOIN pcprodut p2 ON p2.codprod = m.codprod " +
                                "WHERE c.boleto = 'S'");
                    }

                    if (pix) {
                        LOGGER.info("Adicionando filtro para PIX");
                        subconsultas.add("SELECT DISTINCT p2.codprod FROM pcnfsaid v " +
                                "INNER JOIN pccob c ON v.codcob = c.codcob " +
                                "INNER JOIN pcmov m ON m.numnota = v.numnota " +
                                "INNER JOIN pcprodut p2 ON p2.codprod = m.codprod " +
                                "WHERE c.carteirapix = 'S' OR c.bolepix = 'S'");
                    }

                    if (cartao) {
                        LOGGER.info("Adicionando filtro para CARTÃO");
                        subconsultas.add("SELECT DISTINCT p2.codprod FROM pcnfsaid v " +
                                "INNER JOIN pccob c ON v.codcob = c.codcob " +
                                "INNER JOIN pcmov m ON m.numnota = v.numnota " +
                                "INNER JOIN pcprodut p2 ON p2.codprod = m.codprod " +
                                "WHERE c.cartao = 'S'");
                    }

                    sql.append(String.join(" UNION ", subconsultas));
                    sql.append(")");
                }
            } else {
                LOGGER.info("Nenhum filtro de tipo de venda ativo ou parâmetros nulos");
            }

            sql.append("        ORDER BY DBMS_RANDOM.RANDOM"); // ORDER BY aqui dentro da subquery interna
            sql.append("    )");

            if (offset > 0 || pageSize > 0) {
                // Fechando a estrutura para paginação
                sql.append("  ) a WHERE ROWNUM <= ?7");
                sql.append(") WHERE rnum > ?6");
            } else {
                // Fechando a estrutura sem paginação
                sql.append("  WHERE ROWNUM <= ?6");
            }

            // Log da consulta SQL final para depuração
            LOGGER.info("SQL construído: " + sql.toString());

            // Criar e configurar a query
            Query query = em.createNativeQuery(sql.toString());
            query.setParameter(1, departamentos);
            query.setParameter(2, codsts);
            query.setParameter(3, codcli);
            query.setParameter(4, codplpag);
            query.setParameter(5, codfilial);

            if (offset > 0 || pageSize > 0) {
                // Para paginação, precisamos calcular o limite superior
                int endRow = offset + pageSize;
                query.setParameter(6, offset);
                query.setParameter(7, endRow);
            } else {
                // Sem paginação, apenas o limite
                query.setParameter(6, limiteProdutos);
            }

            // Executar a query
            List<Object[]> results = query.getResultList();
            LOGGER.info("Encontrados " + results.size() + " produtos para o cliente " + codcli +
                    " (offset=" + offset + ", pageSize=" + pageSize + ")");

            return results;
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao buscar produtos", e);
            throw new RuntimeException("Erro ao buscar produtos: " + e.getMessage(), e);
        }
    }

    /**
     * Constrói a parte central da query de produtos
     */
    private String construirQueryProdutos() {
        return
                "      SELECT " +
                        "          PCPRODUT.CODPROD, " +
                        "          PCPRODUT.DESCRICAO, " +
                        "          PCPRODUT.EMBALAGEM, " +
                        "          PCPRODUT.UNIDADE, " +
                        "          NVL(VIEWMENOREMBALAGEM.CODAUXILIAR, PCPRODUT.CODAUXILIAR) CODAUXILIAR, " +
                        "          PCFORNEC.CODFORNEC, " +
                        "          PCFORNEC.FORNECEDOR, " +
                        "          PCMARCA.CODMARCA, " +
                        "          PCMARCA.MARCA, " +
                        "          PCPRODUT.CODFAB, " +
                        "          PCPRODUT.OBS2, " +
                        "          NVL(VIEWMENOREMBALAGEM.QTUNIT, PCPRODUT.QTUNIT) QTUNITEMB, " +
                        "          PCPRODUT.CODINTERNO, " +
                        "          PCPRODUT.NUMORIGINAL, " +
                        "          (NVL(PCEST.QTEST, 0) - NVL(PCEST.QTESTGER, 0)) - NVL((SELECT SUM(PCORCAVENDAI.QT) " +
                        "              FROM PCORCAVENDAI, PCORCAVENDAC " +
                        "              WHERE PCORCAVENDAI.NUMORCA = PCORCAVENDAC.NUMORCA " +
                        "                AND PCORCAVENDAI.CODPROD = PCPRODUT.CODPROD " +
                        "                AND NVL(PCORCAVENDAC.CODFILIALNF, PCORCAVENDAC.CODFILIAL) = PCEST.CODFILIAL " +
                        "                AND PCORCAVENDAC.NUMPED IS NULL " +
                        "                AND PCORCAVENDAC.NUMCCF IS NULL " +
                        "                AND PCORCAVENDAC.DTCANCEL IS NULL), 0) QTPEDIDA, " +
                        "          CEIL(((NVL(PCEST.QTEST, 0) - NVL(PCEST.QTESTGER, 0)) - NVL((SELECT SUM(PCORCAVENDAI.QT) " +
                        "              FROM PCORCAVENDAI, PCORCAVENDAC " +
                        "              WHERE PCORCAVENDAI.NUMORCA = PCORCAVENDAC.NUMORCA " +
                        "                AND PCORCAVENDAI.CODPROD = PCPRODUT.CODPROD " +
                        "                AND NVL(PCORCAVENDAC.CODFILIALNF, PCORCAVENDAC.CODFILIAL) = PCEST.CODFILIAL " +
                        "                AND PCORCAVENDAC.NUMPED IS NULL " +
                        "                AND PCORCAVENDAC.NUMCCF IS NULL " +
                        "                AND PCORCAVENDAC.FUT_DATACRIACAO IS NOT NULL " +
                        "                AND PCORCAVENDAC.DTCANCEL IS NULL), 0)) * 1 - (PCEST.QTESTGER * -1)) AS QTESTOQUE, " +
                        "          PCEST.QTEST, " +
                        "          PCEST.QTESTGER, " +
                        "          DECODE(NVL(PCEST.CUSTOCONT, 0), 0, NVL(PCEST.CUSTOFIN, 0), PCEST.CUSTOCONT) PUNIT, " +
                        "          DECODE(NVL(PCEST.CUSTOCONT, 0), 0, NVL(PCEST.CUSTOFIN, 0), PCEST.CUSTOCONT) PTABELA, " +
                        "          PCTRIBUT.CODST " +
                        "      FROM PCPRODUT, PCFORNEC, PCMARCA, PCEST, PCTABPR, PCCLIENT, PCPRACA, " +
                        "           PCTRIBUT, PCTRIBPISCOFINS, PCCONSUM, PCPLPAG, VIEWMENOREMBALAGEM " +
                        "      WHERE PCPRODUT.CODPROD = PCEST.CODPROD " +
                        "        AND PCPRODUT.DTEXCLUSAO IS NULL " +
                        "        AND PCPRODUT.CODFORNEC = PCFORNEC.CODFORNEC(+) " +
                        "        AND PCPRODUT.CODMARCA = PCMARCA.CODMARCA(+) " +
                        "        AND PCCLIENT.CODPRACA = PCPRACA.CODPRACA " +
                        "        AND PCTABPR.CODPROD = PCPRODUT.CODPROD " +
                        "        AND PCTABPR.NUMREGIAO = PCPRACA.NUMREGIAO " +
                        "        AND PCEST.CODFILIAL = VIEWMENOREMBALAGEM.CODFILIAL(+) " +
                        "        AND PCEST.CODPROD = VIEWMENOREMBALAGEM.CODPROD(+) " +
                        "        AND ((PCCONSUM.USATRIBUTACAOPORUF = 'S' " +
                        "              AND EXISTS (SELECT 1 FROM PCTABTRIB " +
                        "                          WHERE PCTABTRIB.CODPROD = PCEST.CODPROD " +
                        "                            AND PCTABTRIB.CODFILIALNF = PCEST.CODFILIAL " +
                        "                            AND PCTABTRIB.UFDESTINO = PCCLIENT.ESTENT " +
                        "                            AND PCTABTRIB.CODST = PCTRIBUT.CODST)) " +
                        "           OR (PCCONSUM.USATRIBUTACAOPORUF = 'N' " +
                        "               AND (PCTRIBUT.CODST = PCTABPR.CODST))) " +
                        "        AND ((PCCONSUM.USATRIBUTACAOPORUF = 'S' " +
                        "              AND EXISTS (SELECT 1 FROM PCTABTRIB " +
                        "                          WHERE PCTABTRIB.CODPROD = PCEST.CODPROD " +
                        "                            AND PCTABTRIB.CODFILIALNF = PCEST.CODFILIAL " +
                        "                            AND PCTABTRIB.UFDESTINO = PCCLIENT.ESTENT " +
                        "                            AND PCTABTRIB.CODTRIBPISCOFINS = PCTRIBPISCOFINS.CODTRIBPISCOFINS)) " +
                        "           OR (PCCONSUM.USATRIBUTACAOPORUF = 'N' " +
                        "               AND (PCTRIBPISCOFINS.CODTRIBPISCOFINS = PCTABPR.CODTRIBPISCOFINS))) " +
                        "        AND (NVL(PCEST.QTEST, 0) - NVL(PCEST.QTESTGER, 0)) - NVL((SELECT SUM(PCORCAVENDAI.QT) " +
                        "               FROM PCORCAVENDAI, PCORCAVENDAC " +
                        "               WHERE PCORCAVENDAI.NUMORCA = PCORCAVENDAC.NUMORCA " +
                        "                 AND PCORCAVENDAI.CODPROD = PCPRODUT.CODPROD " +
                        "                 AND NVL(PCORCAVENDAC.CODFILIALNF, PCORCAVENDAC.CODFILIAL) = PCEST.CODFILIAL " +
                        "                 AND PCORCAVENDAC.NUMPED IS NULL " +
                        "                 AND PCORCAVENDAC.NUMCCF IS NULL " +
                        "                 AND PCORCAVENDAC.FUT_DATACRIACAO IS NOT NULL " +
                        "                 AND PCORCAVENDAC.DTCANCEL IS NULL), 0) > 0 ";
    }

    /**
     * Converte resultados da query para objetos ProdutoDTO
     */
    public List<ProdutoDTO> converterParaProdutoDTO(List<Object[]> resultados) {
        List<ProdutoDTO> produtos = new ArrayList<>();

        for (Object[] row : resultados) {
            ProdutoDTO produto = new ProdutoDTO();

            try {
                produto.setCodProd(getInt(row[1]));
                produto.setQtUnitEmb(getDouble(row[2]));
                produto.setQtEstoque(getDouble(row[3]));
                produto.setPUnit(getBigDecimal(row[6]));
                produto.setPTabela(getBigDecimal(row[7]));
                produto.setCodSt(getInt(row[8]));
                produtos.add(produto);
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "Erro ao converter produto: " + e.getMessage(), e);
            }
        }

        return produtos;
    }

    /**
     * Métodos auxiliares para conversão de tipos
     */
    private Integer getInt(Object o) {
        if (o == null) return null;
        return ((Number) o).intValue();
    }

    private Double getDouble(Object o) {
        if (o == null) return null;
        return ((Number) o).doubleValue();
    }

    private BigDecimal getBigDecimal(Object o) {
        if (o == null) return null;
        if (o instanceof BigDecimal) return (BigDecimal) o;
        return BigDecimal.valueOf(((Number) o).doubleValue());
    }
}