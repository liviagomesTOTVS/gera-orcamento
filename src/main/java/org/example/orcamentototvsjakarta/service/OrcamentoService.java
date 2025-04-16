package org.example.orcamentototvsjakarta.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.example.orcamentototvsjakarta.DTO.ClienteDTO;
import org.example.orcamentototvsjakarta.DTO.OrcamentoParams;
import org.example.orcamentototvsjakarta.model.OrcamentoModel;
import org.example.orcamentototvsjakarta.DTO.ProdutoDTO;
import org.example.orcamentototvsjakarta.util.JPAUtil;


import java.math.BigDecimal;
import java.math.RoundingMode;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Serviço responsável pelo processamento de orçamentos
 */
public class OrcamentoService {
    private static final Logger LOGGER = Logger.getLogger(OrcamentoService.class.getName());
    private static final int BATCH_SIZE = 500; // Tamanho ideal para operações em lote

    /**
     * Gera um único orçamento
     */
    public OrcamentoModel gerarOrcamento(OrcamentoParams params) {
        EntityManager em = null;
        try {
            em = JPAUtil.getEntityManager();
            em.getTransaction().begin();

            // Obter próximo número de orçamento com bloqueio para evitar concorrência
            BigDecimal proxNumOrca = obterProximoNumeroOrcamento(em, params.getCodusur());

            // Obter cliente
            ClienteDTO cliente = obterCliente(em, params.getCodcli());

            // Inserir cabeçalho
            inserirCabecalho(em, proxNumOrca, params, cliente);

            // Inserir itens
            inserirItensOrcamento(em, proxNumOrca, params);

            // Atualizar próximo número
            atualizarProximoNumero(em, params.getCodusur());

            // Atualizar totais
            atualizarTotaisOrcamento(em, proxNumOrca);

            // Calcular total para retorno
            BigDecimal total = calcularTotal(em, proxNumOrca);

            // Calcular e atualizar o valor do desconto baseado no percentual
            BigDecimal valorDesconto = calcularValorDesconto(em, proxNumOrca, params.getTipoPreco(), params.getPercentual());
            atualizarDescontoOrcamento(em, proxNumOrca, valorDesconto);

            // Confirmar transação
            em.getTransaction().commit();

            return new OrcamentoModel(
                    proxNumOrca.longValue(),
                    LocalDate.now(),
                    total,
                    params.getCodcli(),
                    params.getCodusur(),
                    valorDesconto  // Passando o valor do desconto calculado
            );
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            //LOGGER.log(Level.SEVERE, "Erro ao gerar orçamento", e);
            throw new RuntimeException("Erro ao gerar orçamento: " + e.getMessage(), e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Calcula o valor do desconto ou acréscimo aplicado ao orçamento
     */
    // Adicione estas linhas no método calcularValorDesconto() para depuração
    private BigDecimal calcularValorDesconto(EntityManager em, BigDecimal numOrca, String tipoPreco, Double percentual) {
        try {
            // Log para diagnóstico
            //LOGGER.info("=== INÍCIO DO CÁLCULO DE DESCONTO ===");
            //LOGGER.info("Calculando desconto para orçamento " + numOrca + " com percentual " + percentual + " e tipo preço " + tipoPreco);

            if (percentual == null || percentual == 0.0) {
                //LOGGER.info("Percentual nulo ou zero. Retornando zero para desconto.");
                return BigDecimal.ZERO;
            }

            // Para preço de custo (acréscimo)
            if ("C".equalsIgnoreCase(tipoPreco)) {
                // Buscar a soma dos custos (usando vlcustofin em vez de ptabela)
                Query query = em.createNativeQuery("SELECT NVL(SUM(QT * VLCUSTOFIN), 0) FROM PCORCAVENDAI WHERE NUMORCA = ?1");
                query.setParameter(1, numOrca);
                BigDecimal valorCusto = getBigDecimal(query.getSingleResult());
                //LOGGER.info("Valor custo calculado: " + valorCusto);

                // Calcular o acréscimo aplicado
                BigDecimal fator = BigDecimal.valueOf(percentual).divide(BigDecimal.valueOf(100), 6, RoundingMode.HALF_UP);
                BigDecimal resultado = valorCusto.multiply(fator).setScale(4, RoundingMode.HALF_UP);
                //LOGGER.info("Acréscimo calculado: " + resultado);

                // Como é acréscimo, retornamos o valor positivo
                return resultado;
            }
            // Para preço de venda (desconto)
            else {
                // Buscar a soma dos preços de tabela
                Query query = em.createNativeQuery("SELECT NVL(SUM(QT * PTABELA), 0) FROM PCORCAVENDAI WHERE NUMORCA = ?1");
                query.setParameter(1, numOrca);
                BigDecimal valorTabela = getBigDecimal(query.getSingleResult());
                //LOGGER.info("Valor tabela calculado: " + valorTabela);

                // Buscar a soma dos preços de venda
                query = em.createNativeQuery("SELECT NVL(SUM(QT * PVENDA), 0) FROM PCORCAVENDAI WHERE NUMORCA = ?1");
                query.setParameter(1, numOrca);
                BigDecimal valorVenda = getBigDecimal(query.getSingleResult());
                //LOGGER.info("Valor venda calculado: " + valorVenda);

                // O desconto é a diferença entre o valor de tabela e o valor de venda
                BigDecimal resultado = valorTabela.subtract(valorVenda).setScale(4, RoundingMode.HALF_UP);
                //LOGGER.info("Desconto calculado (diferença entre tabela e venda): " + resultado);

                // VERIFICAÇÃO IMPORTANTE! Se o resultado for zero ou negativo, calcular o desconto diretamente
                if (resultado.compareTo(BigDecimal.ZERO) <= 0) {
                    //LOGGER.info("Diferença entre tabela e venda é zero ou negativa. Calculando percentual diretamente.");
                    BigDecimal descontoPercentual = valorTabela.multiply(
                            BigDecimal.valueOf(percentual).divide(BigDecimal.valueOf(100), 6, RoundingMode.HALF_UP)
                    ).setScale(4, RoundingMode.HALF_UP);
                    //LOGGER.info("Desconto calculado diretamente do percentual: " + descontoPercentual);
                    return descontoPercentual;
                }

                //LOGGER.info("=== FIM DO CÁLCULO DE DESCONTO ===");
                return resultado;
            }
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao calcular valor do desconto", e);
            return BigDecimal.ZERO;
        }
    }

    /**
     * Processa múltiplos orçamentos garantindo que todos os itens sejam incluídos
     */
    public List<OrcamentoModel> processarOrcamentos(OrcamentoParams params, String mensagem, int limiteProdutos) {
        EntityManager em = null;
        try {
            em = JPAUtil.getEntityManager();
            em.getTransaction().begin();

            List<OrcamentoModel> orcamentosCriados = new ArrayList<>();
            List<ProdutoDTO> produtos = parseStringProdutos(mensagem);

            if (produtos.isEmpty()) {
                throw new RuntimeException("Nenhum produto válido foi encontrado na mensagem.");
            }

            ClienteDTO cliente = obterCliente(em, params.getCodcli());
            BigDecimal valorMaximoOrcamento = params.getValorMaximo();

            // Lista principal de produtos a processar
            List<ProdutoDTO> produtosParaProcessar = new ArrayList<>(produtos);

            // Lista para itens que precisam ser processados individualmente
            List<ProdutoDTO> itensDificeis = new ArrayList<>();

            // Processar produtos enquanto houver itens na lista
            while (!produtosParaProcessar.isEmpty()) {
                int itemCount = 0;
                BigDecimal currentNumOrca = null;
                List<Object[]> itensBatch = new ArrayList<>();
                BigDecimal valorTotalAtual = BigDecimal.ZERO;
                List<ProdutoDTO> produtosProcessados = new ArrayList<>();

                // Processar os produtos em lotes para melhor eficiência
                for (ProdutoDTO produto : produtosParaProcessar) {
                    // Verificações de validação do produto
                    if (produto.getQtEstoque() <= 0) {
                        //LOGGER.info("Item CODPROD=" + produto.getCodProd() + " com quantidade zero ou negativa. Pulando item.");
                        produtosProcessados.add(produto);
                        continue;
                    }

                    // Definir preço conforme o tipo
                    BigDecimal precoVenda = calcularPrecoVenda(params.getTipoPreco(), produto.getPUnit(), produto.getPTabela(), params.getPercentual());
                    BigDecimal valorItem = precoVenda.multiply(BigDecimal.valueOf(produto.getQtEstoque()));

                    // Validar valor do item
                    if (valorItem.compareTo(BigDecimal.ZERO) <= 0) {
                        //LOGGER.info("Item CODPROD=" + produto.getCodProd() + " geraria valor negativo ou zero. Pulando item.");
                        produtosProcessados.add(produto);
                        continue;
                    }

                    // Verificar se o item sozinho excede o valor máximo
                    if (valorItem.compareTo(valorMaximoOrcamento) > 0) {
                        //LOGGER.info("Item CODPROD=" + produto.getCodProd() + " excede o limite individual de valor. Pulando item.");
                        produtosProcessados.add(produto);
                        continue;
                    }

                    // Verificar se o item cabe no orçamento atual ou se precisamos criar um novo
                    if (currentNumOrca == null || itemCount >= limiteProdutos ||
                            valorTotalAtual.add(valorItem).compareTo(valorMaximoOrcamento) > 0) {

                        // Se já temos itens no lote, inserimos antes de criar um novo orçamento
                        if (!itensBatch.isEmpty()) {
                            inserirBatchItens(em, itensBatch);
                            atualizarTotaisOrcamento(em, currentNumOrca);
                            itensBatch.clear();
                        }

                        // Criar novo orçamento
                        currentNumOrca = obterProximoNumeroOrcamento(em, params.getCodusur());
                        inserirCabecalho(em, currentNumOrca, params, cliente);
                        atualizarProximoNumero(em, params.getCodusur());

                        OrcamentoModel novoOrcamento = new OrcamentoModel(
                                currentNumOrca.longValue(),
                                LocalDate.now(),
                                BigDecimal.ZERO, // Será atualizado depois
                                params.getCodcli(),
                                params.getCodusur(),
                                BigDecimal.ZERO
                        );

                        orcamentosCriados.add(novoOrcamento);
                        itemCount = 0;
                        valorTotalAtual = BigDecimal.ZERO;
                    }

                    // Adicionar item ao lote de inserção
                    int numseqItem = ++itemCount;
                    Object[] item = construirItem(
                            currentNumOrca,
                            params.getCodcli(),
                            produto.getCodProd(),
                            params.getCodusur(),
                            produto.getQtEstoque(),
                            produto.getQtUnitEmb(),
                            precoVenda,
                            produto.getPTabela(),
                            numseqItem,
                            produto.getCodSt(),
                            produto.getVlCustoFin(),
                            produto.getVlCustoReal()
                    );

                    itensBatch.add(item);
                    valorTotalAtual = valorTotalAtual.add(valorItem);
                    produtosProcessados.add(produto);

                    // Inserir lotes intermediários para evitar consumo excessivo de memória
                    if (itensBatch.size() >= BATCH_SIZE) {
                        inserirBatchItens(em, itensBatch);
                        itensBatch.clear();
                    }
                }

                // Inserir os itens do último orçamento
                if (!itensBatch.isEmpty()) {
                    inserirBatchItens(em, itensBatch);
                    atualizarTotaisOrcamento(em, currentNumOrca);
                }

                // Remover os produtos processados da lista principal
                produtosParaProcessar.removeAll(produtosProcessados);

                // Se não conseguimos processar nenhum produto neste ciclo, mas ainda há produtos na lista,
                // significa que estamos com itens difíceis que não cabem em nenhum orçamento - vamos processá-los individualmente
                if (produtosProcessados.isEmpty() && !produtosParaProcessar.isEmpty()) {
                    //LOGGER.warning("Há " + produtosParaProcessar.size() + " itens que não puderam ser agrupados. Processando individualmente.");

                    // Processar cada item individualmente (um orçamento por item)
                    for (ProdutoDTO produto : produtosParaProcessar) {
                        BigDecimal precoVenda = calcularPrecoVenda(params.getTipoPreco(), produto.getPUnit(), produto.getPTabela(), params.getPercentual());


                        currentNumOrca = obterProximoNumeroOrcamento(em, params.getCodusur());
                        inserirCabecalho(em, currentNumOrca, params, cliente);
                        atualizarProximoNumero(em, params.getCodusur());

                        OrcamentoModel novoOrcamento = new OrcamentoModel(
                                currentNumOrca.longValue(),
                                LocalDate.now(),
                                BigDecimal.ZERO,
                                params.getCodcli(),
                                params.getCodusur(),
                                BigDecimal.ZERO
                        );

                        orcamentosCriados.add(novoOrcamento);

                        Object[] item = construirItem(
                                currentNumOrca,
                                params.getCodcli(),
                                produto.getCodProd(),
                                params.getCodusur(),
                                produto.getQtEstoque(),
                                produto.getQtUnitEmb(),
                                precoVenda,
                                produto.getPTabela(),
                                1,
                                produto.getCodSt(),
                                produto.getVlCustoFin(),
                                produto.getVlCustoReal()
                        );

                        List<Object[]> itemUnico = new ArrayList<>();
                        itemUnico.add(item);
                        inserirBatchItens(em, itemUnico);
                        atualizarTotaisOrcamento(em, currentNumOrca);

                        //LOGGER.info("Item difícil processado individualmente: CODPROD=" + produto.getCodProd());
                    }

                    // Limpar a lista após processar todos individualmente
                    produtosParaProcessar.clear();
                }
            }

            // Remover orçamentos sem itens e atualizar os valores totais
            List<OrcamentoModel> orcamentosValidos = new ArrayList<>();
            for (OrcamentoModel orcamento : orcamentosCriados) {
                BigDecimal numOrca = BigDecimal.valueOf(orcamento.getId());
                if (temItens(em, numOrca)) {
                    BigDecimal total = calcularTotal(em, numOrca);

                    // ADICIONAR ESTA VERIFICAÇÃO:
                    if (total.compareTo(valorMaximoOrcamento) > 0) {
                        //LOGGER.warning("Orçamento " + numOrca + " com valor total " + total +
                               // " excede o limite máximo de " + valorMaximoOrcamento + ". Removendo orçamento.");
                        removerOrcamentoSemItens(em, numOrca);
                        continue;
                    }

                    // Calcular e definir o valor do desconto
                    BigDecimal valorDesconto = calcularValorDesconto(em, numOrca, params.getTipoPreco(), params.getPercentual());

                    orcamento.setVltotal(total);
                    orcamento.setVldesconto(valorDesconto); // Definir o valor do desconto
                    atualizarDescontoOrcamento(em, numOrca, valorDesconto);

                    orcamentosValidos.add(orcamento);


                } else {
                    removerOrcamentoSemItens(em, numOrca);
                }
            }

            em.getTransaction().commit();
            return orcamentosValidos;

        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            //LOGGER.log(Level.SEVERE, "Erro ao processar orçamentos", e);
            throw new RuntimeException("Erro ao processar orçamentos: " + e.getMessage(), e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Obtém o próximo número de orçamento com bloqueio de linha
     */
    private BigDecimal obterProximoNumeroOrcamento(EntityManager em, Short codusur) {
        try {
            // Usando parâmetro posicional (?1) em vez de nomeado (:nome)
            Query query = em.createNativeQuery("SELECT PROXNUMPEDFORCA FROM PCUSUARI WHERE CODUSUR = ?1 FOR UPDATE");
            query.setParameter(1, codusur);

            // Converter o resultado para BigDecimal de forma segura
            Object result = query.getSingleResult();
            if (result == null) {
                throw new RuntimeException("Próximo número de orçamento não encontrado para o usuário: " + codusur);
            }

            // Tratar diferentes tipos possíveis de retorno
            if (result instanceof BigDecimal) {
                return (BigDecimal) result;
            } else if (result instanceof Number) {
                return BigDecimal.valueOf(((Number) result).longValue());
            } else {
                throw new RuntimeException("Tipo de resultado inesperado: " + result.getClass());
            }
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao obter próximo número de orçamento", e);
            throw new RuntimeException("Erro ao obter próximo número de orçamento: " + e.getMessage(), e);
        }
    }

    /**
     * Atualiza o próximo número de orçamento
     */
    private void atualizarProximoNumero(EntityManager em, Short codusur) {
        try {
            Query updateQuery = em.createNativeQuery(
                    "UPDATE PCUSUARI SET PROXNUMPEDFORCA = PROXNUMPEDFORCA + 1 WHERE CODUSUR = ?1");
            updateQuery.setParameter(1, codusur);
            updateQuery.executeUpdate();
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao atualizar próximo número", e);
            throw new RuntimeException("Erro ao atualizar próximo número: " + e.getMessage(), e);
        }
    }

    /**
     * Obtém dados do cliente
     */
    private ClienteDTO obterCliente(EntityManager em, Integer codcli) {
        try {
            Query query = em.createNativeQuery(
                    "SELECT CODCLI, CLIENTE, CGCENT, CODPRACA, CODATV1 FROM PCCLIENT WHERE CODCLI = ?1");
            query.setParameter(1, codcli);
            Object[] result = (Object[]) query.getSingleResult();
            return new ClienteDTO(
                    getInt(result[0]),
                    (String) result[1],
                    (String) result[2],
                    getInt(result[3]),  // CODPRACA
                    getInt(result[4])   // CODATV1
            );
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao obter cliente", e);
            throw new RuntimeException("Erro ao obter cliente: " + e.getMessage(), e);
        }
    }

    /**
     * Insere o cabeçalho do orçamento
     */
    private void inserirCabecalho(EntityManager em, BigDecimal numOrca, OrcamentoParams params, ClienteDTO cliente) {
        try {
            Date agora = new Date();
            String hora = new SimpleDateFormat("HH").format(agora);
            String minuto = new SimpleDateFormat("mm").format(agora);

            int codPraca = cliente.getCodpraca() != null ? cliente.getCodpraca() : 0;
            int codAtv1 = cliente.getCodatv1() != null ? cliente.getCodatv1() : params.getCodatv1();

            Query query = em.createNativeQuery(
                    "INSERT INTO PCORCAVENDAC " +
                            "(NUMORCA, DATA, CODCLI, CODUSUR, DTENTREGA, CODFILIAL, CODFILIALNF, TIPOVENDA, CODPRACA, CODEMITENTE, " +
                            "POSICAO, OPERACAO, NUMCAR, CODCOB, HORA, MINUTO, CODSUPERVISOR, CONDVENDA, PERCVENDA, " +
                            "CODPLPAG, CODATV1, ORCAMENTOUTILIZADO, ORIGEMPED, GERACP, DUPLICADO, TIPODOC, " +
                            "VENDATRIANGULAR, NUMPREVENDA, FUT_DATACRIACAO, ROTINALANC) " +
                            "VALUES (?1, SYSDATE, ?2, ?3, SYSDATE, ?4, ?5, 'V', ?6, '1', " +
                            "'L', 'N', '0', ?7, ?8, ?9, ?10, 1, 100, ?11, ?12, 'N', 'A', 'N', 'N', " +
                            "'O', 'N', ?13, SYSDATE, '9801')"
            );

            // Definir parâmetros posicionais
            query.setParameter(1, numOrca);
            query.setParameter(2, params.getCodcli());
            query.setParameter(3, params.getCodusur());
            query.setParameter(4, params.getCodfilial());
            query.setParameter(5, params.getCodfilialnf());
            query.setParameter(6, codPraca);
            query.setParameter(7, params.getCodcob());
            query.setParameter(8, hora);
            query.setParameter(9, minuto);
            query.setParameter(10, params.getCodsupervisor());
            query.setParameter(11, params.getCodplpag());
            query.setParameter(12, codAtv1);
            query.setParameter(13, params.getNumprevenda());

            query.executeUpdate();
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao inserir cabeçalho", e);
            throw new RuntimeException("Erro ao inserir cabeçalho: " + e.getMessage(), e);
        }
    }

    /**
     * Insere itens de orçamento com base nos parâmetros
     */

    private void inserirItensOrcamento(EntityManager em, BigDecimal proxNumOrca, OrcamentoParams params) {
        try {
            // Usar paginação para lidar com grandes volumes de produtos
            int offset = 0;
            int pageSize = BATCH_SIZE;
            List<ProdutoDTO> produtos;
            List<Object[]> itensParaInserir = new ArrayList<>();

            BigDecimal valorTotalOrcamento = BigDecimal.ZERO;
            int numseqItem = 1;

            String tipoPrecoSelecionado = params.getTipoPreco();
            BigDecimal valorMaxOrcamento = params.getValorMaximo();
            Integer codcli = params.getCodcli();
            Short codusur = params.getCodusur();

            do {
                produtos = carregarProdutosPaginados(em, offset, pageSize, params);
                offset += pageSize;

                for (ProdutoDTO produto : produtos) {
                    Integer codProd = produto.getCodProd();
                    Double qtUnitEmb = produto.getQtUnitEmb();
                    Double qtEstoque = produto.getQtEstoque();
                    BigDecimal pUnit = produto.getPUnit();
                    BigDecimal pTabela = produto.getPTabela();
                    Integer codSt = produto.getCodSt();
                    BigDecimal vlCustoFin = produto.getVlCustoFin();
                    BigDecimal vlCustoReal = produto.getVlCustoReal();

                    if (qtEstoque <= 0) continue;

                    BigDecimal precoVenda = calcularPrecoVenda(params.getTipoPreco(), produto.getPUnit(), produto.getPTabela(), params.getPercentual());
                    BigDecimal valorItem = precoVenda.multiply(BigDecimal.valueOf(qtEstoque));

                    if (!itemDentroDoOrcamento(valorItem, valorTotalOrcamento, valorMaxOrcamento)) continue;

                    valorTotalOrcamento = valorTotalOrcamento.add(valorItem);

                    itensParaInserir.add(construirItem(proxNumOrca, codcli, codProd, codusur,
                            qtEstoque, qtUnitEmb, precoVenda, pTabela, numseqItem, codSt,vlCustoFin, vlCustoReal));
                    numseqItem++;

                    // Inserir em lotes para evitar sobrecarga de memória
                    if (itensParaInserir.size() >= BATCH_SIZE) {
                        inserirBatchItens(em, itensParaInserir);
                        itensParaInserir.clear();
                    }
                }
            } while (!produtos.isEmpty());

            // Inserir os itens restantes
            if (!itensParaInserir.isEmpty()) {
                inserirBatchItens(em, itensParaInserir);
                atualizarInformacoesAdicionaisItens(em, proxNumOrca, params.getCodfilial());
            }
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao inserir itens do orçamento", e);
            throw new RuntimeException("Erro ao inserir itens do orçamento: " + e.getMessage(), e);
        }
    }


    /**
     * Atualiza informações adicionais dos itens
     */
    private void atualizarInformacoesAdicionaisItens(EntityManager em, BigDecimal numOrca, Integer codfilial) {
        try {
            Query query = em.createNativeQuery(
                    "UPDATE PCORCAVENDAI i " +
                            "SET (vlcustofin, vlcustoreal, pesobruto, tipomerc, codauxiliar, qtunitemb) = " +
                            "(SELECT " +
                            "  NVL(NVL(e.custofin, e.custocont), 0.01), " +
                            "  NVL(NVL(e.custoreal, e.custocont), 0.01), " +
                            "  p.pesobruto, " +
                            "  p.tipomerc, " +
                            "  NVL(vm.codauxiliar, p.codauxiliar), " +
                            "  NVL(vm.qtunit, p.qtunit) " +
                            "FROM pcest e " +
                            "JOIN pcprodut p ON i.codprod = p.codprod " +
                            "LEFT JOIN VIEWMENOREMBALAGEM vm ON e.codprod = vm.codprod AND e.codfilial = vm.codfilial " +
                            "WHERE i.codprod = e.codprod " +
                            "AND e.codfilial = ?1) " +
                            "WHERE i.numorca = ?2"
            );

            query.setParameter(1, codfilial);
            query.setParameter(2, numOrca);
            query.executeUpdate();
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao atualizar informações adicionais dos itens", e);
            throw new RuntimeException("Erro ao atualizar informações adicionais dos itens: " + e.getMessage(), e);
        }
    }

    /**
     * Atualiza os totais do orçamento
     */
    private void atualizarTotaisOrcamento(EntityManager em, BigDecimal numOrca) {
        try {
            Query query = em.createNativeQuery(
                    "UPDATE PCORCAVENDAC c " +
                            "SET (VLTOTAL, VLTABELA, NUMITENS, TOTPESO, TOTVOLUME) = " +
                            "(SELECT " +
                            "  SUM(i.QT * i.PVENDA), " +
                            "  SUM(i.QT * i.PTABELA), " +
                            "  COUNT(i.NUMORCA), " +
                            "  SUM(i.QT * p.PESOLIQ), " +
                            "  SUM(i.QT * p.VOLUME) " +
                            "FROM PCORCAVENDAI i " +
                            "JOIN PCPRODUT p ON i.CODPROD = p.CODPROD " +
                            "WHERE i.NUMORCA = ?1 " +
                            "GROUP BY i.NUMORCA) " +
                            "WHERE c.NUMORCA = ?1"
            );

            query.setParameter(1, numOrca);
            query.executeUpdate();
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao atualizar totais do orçamento", e);
            throw new RuntimeException("Erro ao atualizar totais do orçamento: " + e.getMessage(), e);
        }
    }

    private void atualizarDescontoOrcamento(EntityManager em, BigDecimal numOrca, BigDecimal valorDesconto) {
        try {
            // Log para diagnóstico
            //LOGGER.info("Atualizando desconto do orçamento " + numOrca + " com valor " + valorDesconto);

            Query query = em.createNativeQuery(
                    "UPDATE PCORCAVENDAC SET VLDESCONTO = ?2 WHERE NUMORCA = ?1");
            query.setParameter(1, numOrca);
            query.setParameter(2, valorDesconto);
            int rowsUpdated = query.executeUpdate();

            // Verificar se a atualização foi bem sucedida
            if (rowsUpdated == 0) {
                //LOGGER.warning("Nenhuma linha atualizada ao definir desconto para o orçamento " + numOrca);
            } else {
                //LOGGER.info("Desconto atualizado com sucesso para o orçamento " + numOrca);
            }
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao atualizar desconto do orçamento", e);
            throw new RuntimeException("Erro ao atualizar desconto do orçamento: " + e.getMessage(), e);
        }
    }

    /**
     * Constrói um array com os dados de um item de orçamento
     */
    private Object[] construirItem(BigDecimal numOrca, Integer codcli, Integer codProd, Short codusur,
                                   Double qtEstoque, Double qtUnitEmb, BigDecimal precoVenda,
                                   BigDecimal pTabela, int numseqItem, Integer codSt,
                                   BigDecimal vlCustoFin, BigDecimal vlCustoReal) {
        return new Object[]{numOrca, codcli, codProd, codusur, qtEstoque, qtUnitEmb, precoVenda, pTabela, numseqItem, codSt, vlCustoFin, vlCustoReal};
    }

    /**
     * Verifica se um orçamento tem itens
     */
    private boolean temItens(EntityManager em, BigDecimal numOrca) {
        try {
            Query query = em.createNativeQuery("SELECT COUNT(*) FROM PCORCAVENDAI WHERE NUMORCA = ?1");
            query.setParameter(1, numOrca);
            Long count = ((Number) query.getSingleResult()).longValue();
            return count > 0;
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao verificar se orçamento tem itens", e);
            throw new RuntimeException("Erro ao verificar se orçamento tem itens: " + e.getMessage(), e);
        }
    }

    /**
     * Remove orçamentos sem itens
     */
    private void removerOrcamentoSemItens(EntityManager em, BigDecimal numOrca) {
        try {
            Query query = em.createNativeQuery("DELETE FROM PCORCAVENDAC WHERE NUMORCA = ?1");
            query.setParameter(1, numOrca);
            query.executeUpdate();
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao remover orçamento sem itens", e);
            throw new RuntimeException("Erro ao remover orçamento sem itens: " + e.getMessage(), e);
        }
    }

    /**
     * Calcula o valor total do orçamento
     */
    private BigDecimal calcularTotal(EntityManager em, BigDecimal numOrca) {
        try {
            Query query = em.createNativeQuery("SELECT NVL(SUM(QT * PVENDA), 0) FROM PCORCAVENDAI WHERE NUMORCA = ?1");
            query.setParameter(1, numOrca);
            Object result = query.getSingleResult();

            if (result == null) {
                return BigDecimal.ZERO;
            }

            // Tratar diferentes tipos de retorno
            if (result instanceof BigDecimal) {
                return (BigDecimal) result;
            } else if (result instanceof Number) {
                return BigDecimal.valueOf(((Number) result).doubleValue());
            } else {
                //LOGGER.warning("Tipo inesperado retornado da consulta: " + result.getClass());
                return BigDecimal.ZERO;
            }
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao calcular total do orçamento", e);
            throw new RuntimeException("Erro ao calcular total do orçamento: " + e.getMessage(), e);
        }
    }

    /**
     * Carrega produtos paginados para melhor performance com grandes volumes
     */
    private List<ProdutoDTO> carregarProdutosPaginados(EntityManager em, int offset, int pageSize, OrcamentoParams parametros) {
        try {
            // Construir a consulta SQL base
            LOGGER.info("DENTRO DE CARREGARPRODUTOSPAGINADOS");
            System.out.println("parametros é null? " + (parametros == null));
            StringBuilder sqlBuilder = new StringBuilder(
                    "SELECT p.CODPROD, COALESCE(vm.QTUNIT, p.QTUNIT) as QTUNITEMB, " +
                            "CASE WHEN (NVL(e.QTEST, 0) - NVL(e.QTESTGER, 0)) - " +
                            "     NVL((SELECT SUM(i.QT) FROM PCORCAVENDAI i " +
                            "          JOIN PCORCAVENDAC c ON i.NUMORCA = c.NUMORCA " +
                            "          WHERE i.CODPROD = p.CODPROD " +
                            "          AND NVL(c.CODFILIALNF, c.CODFILIAL) = e.CODFILIAL " +
                            "          AND c.NUMPED IS NULL AND c.NUMCCF IS NULL AND c.DTCANCEL IS NULL), 0) > 0 " +
                            "     THEN (NVL(e.QTEST, 0) - NVL(e.QTESTGER, 0)) - " +
                            "          NVL((SELECT SUM(i.QT) FROM PCORCAVENDAI i " +
                            "               JOIN PCORCAVENDAC c ON i.NUMORCA = c.NUMORCA " +
                            "               WHERE i.CODPROD = p.CODPROD " +
                            "               AND NVL(c.CODFILIALNF, c.CODFILIAL) = e.CODFILIAL " +
                            "               AND c.NUMPED IS NULL AND c.NUMCCF IS NULL AND c.DTCANCEL IS NULL), 0) " +
                            "     ELSE 0 " +
                            "END as QTESTOQUE, " +
                            "NVL(e.CUSTOFIN, 0) as VLCUSTOFIN, " +
                            "NVL(e.CUSTOREAL, 0) as VLCUSTOREAL, " +
                            "p.PESOBRUTO, " +
                            "DECODE(NVL(e.CUSTOCONT, 0), 0, NVL(e.CUSTOFIN, 0), e.CUSTOCONT) as PUNIT, " +
                            "NVL(tb.PTABELA, DECODE(NVL(e.CUSTOCONT, 0), 0, NVL(e.CUSTOFIN, 0), e.CUSTOCONT)) as PTABELA, " +
                            "NVL(tr.CODST, 0) as CODST, " +
                            "NVL(vm.CODAUXILIAR, p.CODAUXILIAR) as CODAUXILIAR, " +
                            "COALESCE(vm.QTUNIT, p.QTUNIT) as QTUNIT, " +
                            "p.TIPOMERC " +
                            "FROM PCPRODUT p " +
                            "JOIN PCEST e ON p.CODPROD = e.CODPROD " +
                            "LEFT JOIN VIEWMENOREMBALAGEM vm ON e.CODPROD = vm.CODPROD AND e.CODFILIAL = vm.CODFILIAL " +
                            "LEFT JOIN PCTABPR tb ON p.CODPROD = tb.CODPROD " +
                            "LEFT JOIN PCTRIBUT tr ON tb.CODST = tr.CODST " +
                            "WHERE e.QTEST > 0 ");

            // Aplicar filtro de tipo de venda se necessário
            if (parametros != null && parametros.temFiltroTipoVendaAtivo()) {
                // Não aplicar filtro se todos estiverem selecionados ou todos desativados
                boolean boleto = parametros.isBoletoSelecionado();
                boolean pix = parametros.isPixSelecionado();
                boolean cartao = parametros.isCartaoSelecionado();
                LOGGER.info("Estado dos filtros: Boleto=" + boleto + ", Pix=" + pix + ", Cartão=" + cartao);


                if (!((boleto && pix && cartao) || (!boleto && !pix && !cartao))) {
                    sqlBuilder.append(" AND p.CODPROD IN (");

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

                    sqlBuilder.append(String.join(" UNION ", subconsultas));
                    sqlBuilder.append(")");
                }
            }else{
                LOGGER.info("Nenhum filtro de tipo de venda ativo ou parâmetros nulos");
            }

            // Adicionar ordenação e paginação
            sqlBuilder.append(" ORDER BY p.CODPROD OFFSET ?1 ROWS FETCH NEXT ?2 ROWS ONLY");

            // Criar e executar a consulta
            Query query = em.createNativeQuery(sqlBuilder.toString());
            query.setParameter(1, offset);
            query.setParameter(2, pageSize);

            // Processar os resultados
            List<ProdutoDTO> produtos = new ArrayList<>();
            List<Object[]> resultList = query.getResultList();

            // Parte da lógica onde cria o objeto ProdutoDTO
            for (Object[] row : resultList) {
                ProdutoDTO produto = new ProdutoDTO();
                produto.setCodProd(getInt(row[0]));
                produto.setQtUnitEmb(getDouble(row[1]));
                produto.setQtEstoque(getDouble(row[2]));

                // Obter valores iniciais
                BigDecimal custoFin = getBigDecimal(row[3]);
                BigDecimal custoReal = getBigDecimal(row[4]);
                BigDecimal pUnit = getBigDecimal(row[6]);
                BigDecimal pTabela = getBigDecimal(row[7]);

                // Lógica de verificação cruzada para preço e custo
                if (custoFin.compareTo(BigDecimal.ZERO) <= 0) {
                    // Se o custo for zero, usar o preço de venda ou tabela como referência
                    if (pTabela.compareTo(BigDecimal.ZERO) > 0) {
                        custoFin = pTabela;
                    } else if (pUnit.compareTo(BigDecimal.ZERO) > 0) {
                        custoFin = pUnit;
                    } else {
                        custoFin = BigDecimal.valueOf(0.01); // Valor mínimo como último recurso
                    }
                }

                if (custoReal.compareTo(BigDecimal.ZERO) <= 0) {
                    custoReal = custoFin; // Usar custo financeiro como referência
                }

                // Se o preço de tabela for zero, usar o custo como referência
                if (pTabela.compareTo(BigDecimal.ZERO) <= 0) {
                    if (custoFin.compareTo(BigDecimal.ZERO) > 0) {
                        // Aplicar uma margem padrão sobre o custo (ex: 30%)
                        pTabela = custoFin.multiply(BigDecimal.valueOf(1.3)).setScale(4, RoundingMode.HALF_UP);
                    } else {
                        pTabela = BigDecimal.valueOf(0.01); // Valor mínimo como último recurso
                    }
                }

                // Se o preço unitário for zero, usar o custo como referência
                if (pUnit.compareTo(BigDecimal.ZERO) <= 0) {
                    pUnit = custoFin;
                }

                produto.setVlCustoFin(custoFin);
                produto.setVlCustoReal(custoReal);
                produto.setPesoBruto(getDouble(row[5]));
                produto.setPUnit(pUnit);
                produto.setPTabela(pTabela);
                produto.setCodSt(getInt(row[8]));
                produto.setCodAuxiliar(getLong(row[9]));
                produto.setQtUnit(getDouble(row[10]));
                produto.setTipoMerc(getString(row[11]));
                produtos.add(produto);
            }

            return produtos;
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao carregar produtos paginados", e);
            throw new RuntimeException("Erro ao carregar produtos paginados: " + e.getMessage(), e);
        }
    }

    /**
     * Analisa a string de produtos e converte para objetos ProdutoDTO
     */
    private List<ProdutoDTO> parseStringProdutos(String mensagem) {
        List<ProdutoDTO> produtos = new ArrayList<>();
        if (mensagem == null || mensagem.trim().isEmpty()) {
            return produtos;
        }
        try {
            String[] produtosArray = mensagem.split(";");
            Pattern pattern = Pattern.compile("([^|]+)\\|([^|]+)\\|([^|]+)\\|([^|]+)\\|([^|]+)\\|([^|]+)");

            for (String produtoStr : produtosArray) {
                Matcher matcher = pattern.matcher(produtoStr);
                if (matcher.find()) {
                    ProdutoDTO produto = new ProdutoDTO();
                    try {
                        produto.setCodProd(Integer.parseInt(matcher.group(1).trim()));
                        produto.setQtUnitEmb(parseDouble(matcher.group(2)));
                        produto.setQtEstoque(parseDouble(matcher.group(3)));
                        produto.setPUnit(BigDecimal.valueOf(parseDouble(matcher.group(4))));
                        produto.setPTabela(BigDecimal.valueOf(parseDouble(matcher.group(5))));
                        produto.setCodSt(Integer.parseInt(matcher.group(6).trim()));

                        BigDecimal pUnit = BigDecimal.valueOf(parseDouble(matcher.group(4)));
                        BigDecimal pTabela = BigDecimal.valueOf(parseDouble(matcher.group(5)));
                        produto.setCodSt(Integer.parseInt(matcher.group(6).trim()));

                        BigDecimal custoFin;
                        if (pUnit.compareTo(BigDecimal.ZERO) <= 0) {
                            // Se o custo for zero, usar o preço de tabela
                            if (pTabela.compareTo(BigDecimal.ZERO) > 0) {
                                custoFin = pTabela;
                            } else {
                                custoFin = BigDecimal.valueOf(0.01);
                            }
                        } else {
                            custoFin = pUnit;
                        }

                        if (pTabela.compareTo(BigDecimal.ZERO) <= 0) {
                            pTabela = custoFin.multiply(BigDecimal.valueOf(1.3)).setScale(4, RoundingMode.HALF_UP);
                        }

                        produto.setPUnit(pUnit);
                        produto.setPTabela(pTabela);
                        produto.setVlCustoFin(custoFin);
                        produto.setVlCustoReal(custoFin);


                        produtos.add(produto);
                    } catch (NumberFormatException e) {
                        //LOGGER.log(Level.WARNING, "Erro ao converter valores para o produto: " + produtoStr, e);
                    }
                } else {
                    //LOGGER.warning("Formato inválido de produto: " + produtoStr);
                }
            }
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao analisar mensagem de produtos", e);
            throw new RuntimeException("Erro ao analisar mensagem de produtos: " + e.getMessage(), e);
        }

        return produtos;
    }

    /**
     * Converte string para double com tratamento de vírgula e ponto
     */
    private double parseDouble(String value) {
        if (value == null || value.trim().isEmpty()) {
            return 0.0;
        }
        // Substituir vírgula por ponto para padrão americano
        value = value.replace(',', '.');
        try {
            return Double.parseDouble(value.trim());
        } catch (NumberFormatException e) {
            //LOGGER.warning("Erro ao converter para double: " + value);
            return 0.0;
        }
    }

    /**
     * Verifica se um item está dentro do limite de valor do orçamento
     */
    private boolean itemDentroDoOrcamento(BigDecimal valorItem, BigDecimal totalAtual, BigDecimal valorMaximo) {
        return valorItem.compareTo(BigDecimal.ZERO) > 0 &&
                totalAtual.add(valorItem).compareTo(valorMaximo) <= 0;
    }

    /**
     * Calcula o preço de venda com base no tipo de preço
     */
    private BigDecimal calcularPrecoVenda(String tipoPreco, BigDecimal pUnit, BigDecimal pTabela, Double percentual) {
        // Log para diagnóstico
        //LOGGER.info("Calculando preço de venda com: tipoPreco=" + tipoPreco +
               // ", pUnit=" + pUnit + ", pTabela=" + pTabela + ", percentual=" + percentual);

        BigDecimal result;

        if ("C".equalsIgnoreCase(tipoPreco)) {
            // Para preço de custo, aplicar acréscimo
            result = pUnit != null ? pUnit : BigDecimal.ZERO;
            if (percentual != null && percentual > 0) {
                BigDecimal fator = BigDecimal.ONE.add(BigDecimal.valueOf(percentual)
                        .divide(BigDecimal.valueOf(100), 6, RoundingMode.HALF_UP));
                result = result.multiply(fator).setScale(4, RoundingMode.HALF_UP);
                //LOGGER.info("Acréscimo aplicado. Novo valor: " + result);
            }
        } else {
            // Para preço de venda (ou outro tipo), aplicar desconto
            result = (pTabela != null && pTabela.compareTo(BigDecimal.ZERO) > 0) ? pTabela : pUnit;
            if (percentual != null && percentual > 0) {
                BigDecimal fator = BigDecimal.ONE.subtract(BigDecimal.valueOf(percentual)
                        .divide(BigDecimal.valueOf(100), 6, RoundingMode.HALF_UP));
                result = result.multiply(fator).setScale(4, RoundingMode.HALF_UP);
                //LOGGER.info("Desconto aplicado. Valor original: " + ((pTabela != null && pTabela.compareTo(BigDecimal.ZERO) > 0) ? pTabela : pUnit) + ", Percentual: " + percentual + "%, Novo valor: " + result);
            }
        }

        return result;
    }

    /**
     * Métodos auxiliares para converter tipos de dados
     */
    private int getInt(Object o) {
        return o != null ? ((Number) o).intValue() : 0;
    }

    private long getLong(Object o) {
        return o != null ? ((Number) o).longValue() : 0L;
    }

    private double getDouble(Object o) {
        return o != null ? ((Number) o).doubleValue() : 0.0;
    }

    private BigDecimal getBigDecimal(Object o) {
        if (o == null) return BigDecimal.ZERO;
        if (o instanceof BigDecimal) return (BigDecimal) o;
        return BigDecimal.valueOf(((Number) o).doubleValue());
    }

    private String getString(Object o) {
        return o != null ? o.toString() : "";
    }

    /**
     * Insere itens em lote usando JDBC para melhor performance
     */
    private void inserirBatchItens(EntityManager em, List<Object[]> itens) {
        if (itens.isEmpty()) return;

        try {
            // Usar transação JPA diretamente
            for (Object[] item : itens) {
                BigDecimal numOrca = (BigDecimal) item[0];
                Integer codcli = (Integer) item[1];
                Integer codProd = (Integer) item[2];
                Short codusur = (Short) item[3];
                Double qtEstoque = (Double) item[4];
                Double qtUnitEmb = (Double) item[5];
                BigDecimal precoVenda = (BigDecimal) item[6];
                BigDecimal pTabela = (BigDecimal) item[7];
                Integer numseqItem = (Integer) item[8];
                Integer codSt = (Integer) item[9];
                BigDecimal vlCustoFin = (BigDecimal) item[10];
                BigDecimal vlCustoReal = (BigDecimal) item[11];


                // Verificação cruzada
                if (vlCustoFin == null || vlCustoFin.compareTo(BigDecimal.ZERO) <= 0) {
                    // Se preço de venda existir, usar como base para o custo
                    if (precoVenda != null && precoVenda.compareTo(BigDecimal.ZERO) > 0) {
                        vlCustoFin = precoVenda;
                    } else if (pTabela != null && pTabela.compareTo(BigDecimal.ZERO) > 0) {
                        vlCustoFin = pTabela;
                    } else {
                        vlCustoFin = BigDecimal.valueOf(0.01);
                    }
                }

                if (vlCustoReal == null || vlCustoReal.compareTo(BigDecimal.ZERO) <= 0) {
                    vlCustoReal = vlCustoFin; // Usar custo financeiro como referência
                }

                // Verificar preço de venda e tabela
                if (precoVenda == null || precoVenda.compareTo(BigDecimal.ZERO) <= 0) {
                    if (vlCustoFin.compareTo(BigDecimal.ZERO) > 0) {
                        // Aplicar margem padrão se o preço for zero
                        precoVenda = vlCustoFin.multiply(BigDecimal.valueOf(1.3)).setScale(4, RoundingMode.HALF_UP);
                    } else {
                        precoVenda = BigDecimal.valueOf(0.01);
                    }
                }

                if (pTabela == null || pTabela.compareTo(BigDecimal.ZERO) <= 0) {
                    pTabela = precoVenda;
                }

                // Usar query nativa com parâmetros nomeados
                Query query = em.createNativeQuery(
                        "INSERT INTO PCORCAVENDAI (" +
                                "NUMORCA, DATA, CODCLI, CODPROD, CODUSUR, QT, QTUNITEMB, ST, PVENDA, PTABELA, " +
                                "PERDESC, POSICAO, NUMCAR, NUMSEQ, CODST, PORIGINAL, DTULTALTER, VLCUSTOFIN, " +
                                "VLCUSTOREAL, PERCOM, BAIXADO) " +
                                "VALUES (?1, SYSDATE, ?2, ?3, ?4, ?5, ?6, '0', ?7, ?8, 80, 'L', '0', ?9, ?10, ?8, SYSDATE, ?11, ?12, 0, 'N')"
                );

                query.setParameter(1, numOrca);
                query.setParameter(2, codcli);
                query.setParameter(3, codProd);
                query.setParameter(4, codusur);
                query.setParameter(5, qtEstoque);
                query.setParameter(6, qtUnitEmb);
                query.setParameter(7, precoVenda);
                query.setParameter(8, pTabela);
                query.setParameter(9, numseqItem);
                query.setParameter(10, codSt);
                query.setParameter(11, vlCustoFin);
                query.setParameter(12, vlCustoReal);

                query.executeUpdate();

                // A cada BATCH_SIZE inserções, fazer flush para não acumular muitas operações em memória
                if (numseqItem % BATCH_SIZE == 0) {
                    em.flush();
                    em.clear(); // Limpar o cache de entidades
                }
            }

            // Flush final para garantir que todas as operações foram enviadas ao banco
            em.flush();

        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao inserir itens do orçamento", e);
            throw new RuntimeException("Erro ao inserir itens do orçamento: " + e.getMessage(), e);
        }
    }

    /**
     * Obtém a sequência para a pré-venda
     */
    private BigDecimal obterSequenciaPreVenda(EntityManager em) {
        try {
            Query query = em.createNativeQuery("SELECT DFSEQ_PCORCAVENDACPREVENDA.NEXTVAL FROM DUAL");
            Object result = query.getSingleResult();
            return result instanceof BigDecimal ? (BigDecimal) result : BigDecimal.valueOf(((Number) result).longValue());
        } catch (Exception e) {
            //LOGGER.log(Level.SEVERE, "Erro ao obter sequência para pré-venda", e);
            throw new RuntimeException("Erro ao obter sequência para pré-venda: " + e.getMessage(), e);
        }
    }
}