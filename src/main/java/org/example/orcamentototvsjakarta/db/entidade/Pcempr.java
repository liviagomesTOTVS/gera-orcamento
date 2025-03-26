package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "PCEMPR")
public class Pcempr {
    @Id
    @Column(name = "MATRICULA", nullable = false)
    private Integer id;

    @Column(name = "NOME", nullable = false, length = 40)
    private String nome;

    @Column(name = "DT_EXCLUSAO")
    private LocalDate dtExclusao;

    @Column(name = "NOME_GUERRA", length = 15)
    private String nomeGuerra;

    @Column(name = "ADMISSAO")
    private LocalDate admissao;

    @Column(name = "ENDERECO", length = 40)
    private String endereco;

    @Column(name = "BAIRRO", length = 25)
    private String bairro;

    @Column(name = "CIDADE", length = 20)
    private String cidade;

    @Column(name = "ESTADO", length = 2)
    private String estado;

    @Column(name = "FONE", length = 13)
    private String fone;

    @Column(name = "CODSETOR", nullable = false)
    private Integer codsetor;

    @Column(name = "USUARIOBD", length = 15)
    private String usuariobd;

    @Column(name = "SENHABD", length = 32)
    private String senhabd;

    @Column(name = "SITUACAO", length = 1)
    private String situacao;

    @Column(name = "CPF", length = 20)
    private String cpf;

    @Column(name = "TIPOVENDA", length = 1)
    private String tipovenda;

    @Column(name = "CODFILIAL", length = 2)
    private String codfilial;

    @Column(name = "CODUSUR")
    private Short codusur;

    @Column(name = "CELULAR", length = 13)
    private String celular;

    @Column(name = "NUMBANCO")
    private Short numbanco;

    @Column(name = "NUMAGENCIA")
    private Short numagencia;

    @Column(name = "NUMCCORRENTE", length = 15)
    private String numccorrente;

    @Column(name = "NUMCENTRALPA")
    private Short numcentralpa;

    @Column(name = "NUMCENTRALTEL", length = 20)
    private String numcentraltel;

    @Column(name = "PERMITEALTJUROSBX", length = 1)
    private String permitealtjurosbx;

    @Column(name = "VLAUMENTOLIMCRED", precision = 14, scale = 2)
    private BigDecimal vlaumentolimcred;

    @Column(name = "TIPO", length = 1)
    private String tipo;

    @Column(name = "RG", length = 20)
    private String rg;

    @Column(name = "CTPS", length = 20)
    private String ctps;

    @Column(name = "PIS", length = 20)
    private String pis;

    @Column(name = "FUNCAO", length = 30)
    private String funcao;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "FATORCOMISSAO", precision = 10, scale = 6)
    private BigDecimal fatorcomissao;

    @Column(name = "DTEXPIRASENHA")
    private LocalDate dtexpirasenha;

    @Column(name = "VLCOMISSTON", precision = 14, scale = 2)
    private BigDecimal vlcomisston;

    @Column(name = "VLCOMISSENT", precision = 14, scale = 2)
    private BigDecimal vlcomissent;

    @Column(name = "VLLIMCREDCOMPRA", precision = 14, scale = 2)
    private BigDecimal vllimcredcompra;

    @Column(name = "DTINICIOLIMCREDCOMPRA")
    private LocalDate dtiniciolimcredcompra;

    @Column(name = "DTFIMLIMCREDCOMPRA")
    private LocalDate dtfimlimcredcompra;

    @Column(name = "CODCONFERENTE")
    private Integer codconferente;

    @Column(name = "CODFUNCAO")
    private Short codfuncao;

    @Column(name = "SERIECTPS", length = 15)
    private String seriectps;

    @Column(name = "GERACCCARD", length = 1)
    private String geracccard;

    @Column(name = "MATRICULACCCARD")
    private Long matriculacccard;

    @Column(name = "VLSALCARTEIRA", precision = 10, scale = 2)
    private BigDecimal vlsalcarteira;

    @Column(name = "VLSALARIO", precision = 10, scale = 2)
    private BigDecimal vlsalario;

    @Column(name = "RESCISAO")
    private LocalDate rescisao;

    @Column(name = "NUMFILHOS")
    private Short numfilhos;

    @Column(name = "COMPLEMENTO", length = 40)
    private String complemento;

    @Column(name = "OBSERVACAO", length = 100)
    private String observacao;

    @Column(name = "PERCVT", precision = 5, scale = 2)
    private BigDecimal percvt;

    @Column(name = "VLPLANOSAUDE", precision = 10, scale = 2)
    private BigDecimal vlplanosaude;

    @Column(name = "VLSALFAMILIA", precision = 10, scale = 2)
    private BigDecimal vlsalfamilia;

    @Column(name = "PERCINSS", precision = 5, scale = 2)
    private BigDecimal percinss;

    @Column(name = "VLPENSAOALIMENTICIA", precision = 10, scale = 2)
    private BigDecimal vlpensaoalimenticia;

    @Column(name = "VLADICIONAL", precision = 10, scale = 2)
    private BigDecimal vladicional;

    @Column(name = "VLVALES", precision = 10, scale = 2)
    private BigDecimal vlvales;

    @Column(name = "VLMAXLIBPEDIDO", precision = 16, scale = 3)
    private BigDecimal vlmaxlibpedido;

    @Column(name = "CNH", length = 15)
    private String cnh;

    @Column(name = "UFCNH", length = 2)
    private String ufcnh;

    @Column(name = "TIPOENVIO", length = 1)
    private String tipoenvio;

    @Column(name = "CODFORNEC")
    private Integer codfornec;

    @Column(name = "PERCOMMOT", precision = 5, scale = 2)
    private BigDecimal percommot;

    @Column(name = "VLFRETEENTREGA", precision = 10, scale = 4)
    private BigDecimal vlfreteentrega;

    @Column(name = "CODVEICULO")
    private Short codveiculo;

    @Column(name = "PERMITEALTDESCBX", length = 1)
    private String permitealtdescbx;

    @Column(name = "REFERENCIAPESSOAL", length = 100)
    private String referenciapessoal;

    @Column(name = "DDDTEL")
    private Short dddtel;

    @Column(name = "NOMEPAI", length = 60)
    private String nomepai;

    @Column(name = "NOMEMAE", length = 60)
    private String nomemae;

    @Column(name = "CATEGORIACNH", length = 3)
    private String categoriacnh;

    @Column(name = "TIPOMOTORISTA", length = 1)
    private String tipomotorista;

    @Column(name = "SEXO", length = 1)
    private String sexo;

    @Column(name = "DTNASC")
    private LocalDate dtnasc;

    @Column(name = "DTVALIDADECNH")
    private LocalDate dtvalidadecnh;

    @Column(name = "ORGAOEMISSORRG", length = 20)
    private String orgaoemissorrg;

    @Column(name = "NACIONALIDADE", length = 40)
    private String nacionalidade;

    @Column(name = "ESTADOCIVIL", length = 25)
    private String estadocivil;

    @Column(name = "PROFISSAO", length = 30)
    private String profissao;

    @Column(name = "USUARIOLOGADO", length = 1)
    private String usuariologado;

    @Column(name = "NUMDVAGENCIA", length = 2)
    private String numdvagencia;

    @Column(name = "NUMCONEXOES")
    private Short numconexoes;

    @Column(name = "NUMCONEXOESATUAL")
    private Short numconexoesatual;

    @Column(name = "GRUPOEMAIL", length = 10)
    private String grupoemail;

    @Column(name = "NOMEEMAIL", length = 40)
    private String nomeemail;

    @Column(name = "PERCMINJUROSMORA", precision = 8, scale = 4)
    private BigDecimal percminjurosmora;

    @Column(name = "PERCMAXJUROSMORA", precision = 8, scale = 4)
    private BigDecimal percmaxjurosmora;

    @Column(name = "CODIDIOMA", length = 6)
    private String codidioma;

    @Column(name = "PERCEXCLIMCRED", precision = 8, scale = 4)
    private BigDecimal percexclimcred;

    @Column(name = "ENVIAFV", length = 1)
    private String enviafv;

    @Column(name = "PERCREDUZCOMISRCA", precision = 6, scale = 2)
    private BigDecimal percreduzcomisrca;

    @Column(name = "VLSALDOLIMALTCREDITO", precision = 14, scale = 2)
    private BigDecimal vlsaldolimaltcredito;

    @Column(name = "DTINICIO")
    private LocalDate dtinicio;

    @Column(name = "TIPOATENDE", length = 1)
    private String tipoatende;

    @Column(name = "IPRF", length = 14)
    private String iprf;

    @Column(name = "GRUPOOS")
    private Long grupoos;

    @Column(name = "CODBARRA", length = 20)
    private String codbarra;

    @Column(name = "OBSINATIVO", length = 100)
    private String obsinativo;

    @Column(name = "NUMDIASPAGTORETROATIVO")
    private Short numdiaspagtoretroativo;

    @Column(name = "VENDAASSISTIDA", length = 1)
    private String vendaassistida;

    @Column(name = "NUMCAIXABALCAO")
    private Integer numcaixabalcao;

    @Column(name = "CODIGOPERFIL")
    private Long codigoperfil;

    @Column(name = "MAXTEMPOSECAOOCIOSA")
    private Integer maxtemposecaoociosa;

    @Column(name = "USARATEIOCOMISSAOOPERADOR", length = 1)
    private String usarateiocomissaooperador;

    @Column(name = "PERMITEPERSONCAD", length = 1)
    private String permitepersoncad;

    @Column(name = "NUMIDENTIFICADORECF", length = 13)
    private String numidentificadorecf;

    @Column(name = "OBS", length = 60)
    private String obs;

    @Column(name = "NUMDIASMAXPRORROG")
    private Short numdiasmaxprorrog;

    @Column(name = "AREAATUACAO", length = 40)
    private String areaatuacao;

    @Column(name = "PERCDESC", precision = 10, scale = 4)
    private BigDecimal percdesc;

    @Column(name = "NUMDVCONTA", length = 2)
    private String numdvconta;

    @Column(name = "TIPOAGENTECOB", length = 1)
    private String tipoagentecob;

    @Column(name = "DIASCOB")
    private Integer diascob;

    @Column(name = "LIMITEDESCONTO561", precision = 5, scale = 2)
    private BigDecimal limitedesconto561;

    @Column(name = "NUMINSS", length = 12)
    private String numinss;

    @Column(name = "USABIOMETRIAMENU", length = 1)
    private String usabiometriamenu;

    @Column(name = "TIPOCOMISSAO", length = 1)
    private String tipocomissao;

    @Column(name = "COMISSAOFIXA", precision = 10, scale = 2)
    private BigDecimal comissaofixa;

    @Column(name = "USAAVISOAUTOMENU", length = 1)
    private String usaavisoautomenu;

    @Column(name = "PERCMAXDESCTITULO", precision = 10, scale = 4)
    private BigDecimal percmaxdesctitulo;

    @Column(name = "RESPLIBCADASTRO", length = 1)
    private String resplibcadastro;

    @Column(name = "USATABELACLIENTE", length = 1)
    private String usatabelacliente;

    @Column(name = "VLMAXLIMCREDCLI", precision = 14, scale = 2)
    private BigDecimal vlmaxlimcredcli;

    @Column(name = "USUARIOLOGADORF", length = 1)
    private String usuariologadorf;

    @Column(name = "CODPERFIL")
    private Integer codperfil;

    @Column(name = "CONCEDERABATIMENTO", length = 1)
    private String concederabatimento;

    @Column(name = "ORGAOEMISSORCNH", length = 20)
    private String orgaoemissorcnh;

    @Column(name = "QTDEPENDENTES")
    private Short qtdependentes;

    @Column(name = "CODIGOCENTROCUSTO", length = 40)
    private String codigocentrocusto;

    @Column(name = "IDINTEGRACAOMYFROTA")
    private byte[] idintegracaomyfrota;

    @Column(name = "CODCIDADE")
    private Integer codcidade;

    @Column(name = "VLLIMMAXPEDCOMPRA", precision = 14, scale = 2)
    private BigDecimal vllimmaxpedcompra;

    @Column(name = "DTDEMISSAO")
    private LocalDate dtdemissao;

    @Column(name = "CHAPA_RM", length = 16)
    private String chapaRm;

    @Column(name = "AUTOCHEQUEBLOQVENDA", length = 1)
    private String autochequebloqvenda;

    @Column(name = "SENHAHASH", length = 32)
    private String senhahash;

    @Column(name = "MOTIVOINATIVACAO", length = 2000)
    private String motivoinativacao;

    @Column(name = "VLRLIMAPROVARSOLICITACAO", precision = 14, scale = 2)
    private BigDecimal vlrlimaprovarsolicitacao;

    @Column(name = "RAMAL")
    private Integer ramal;

    @Column(name = "FIID", length = 50)
    private String fiid;

    @Column(name = "AREAATUACAO_COMPRA", length = 1)
    private String areaatuacaoCompra;

    @Column(name = "AREAATUACAO_VENDAS", length = 1)
    private String areaatuacaoVendas;

    @Column(name = "AREAATUACAO_FINANCEIRO", length = 1)
    private String areaatuacaoFinanceiro;

    @Column(name = "AREAATUACAO_LOGISTICA", length = 1)
    private String areaatuacaoLogistica;

    @Column(name = "AREAATUACAO_EXPEDICAO", length = 1)
    private String areaatuacaoExpedicao;

    @Column(name = "AREAATUACAO_RH", length = 1)
    private String areaatuacaoRh;

    @Column(name = "AREAATUACAO_FISCAL", length = 1)
    private String areaatuacaoFiscal;

    @Column(name = "AREAATUACAO_CONTABIL", length = 1)
    private String areaatuacaoContabil;

    @Column(name = "AREAATUACAO_OUTROS", length = 1)
    private String areaatuacaoOutros;

    @Column(name = "TIPOCARGO", length = 100)
    private String tipocargo;

    @Column(name = "CEP", length = 8)
    private String cep;

    @Column(name = "PERDESCMAXITEM", precision = 6, scale = 2)
    private BigDecimal perdescmaxitem;

    @Column(name = "PERDESCMAXRODAPE", precision = 6, scale = 2)
    private BigDecimal perdescmaxrodape;

    @Column(name = "LIM_REDUCAOCREDITO", precision = 12, scale = 6)
    private BigDecimal limReducaocredito;

    @Column(name = "LIM_AUMENTOCREDITO", precision = 12, scale = 6)
    private BigDecimal limAumentocredito;

    @Column(name = "PERIODO_ALTERACAOCREDITO")
    private Short periodoAlteracaocredito;

    @Column(name = "DIGITALPOLEGAR")
    private byte[] digitalpolegar;

    @Column(name = "DIGITALINDICADOR")
    private byte[] digitalindicador;

    @Column(name = "DIGITALMEDIO")
    private byte[] digitalmedio;

    @Column(name = "DIGITALANELAR")
    private byte[] digitalanelar;

    @Column(name = "DIGITALMINIMO")
    private byte[] digitalminimo;

    @Column(name = "DEDOPRIORITARIO", length = 1)
    private String dedoprioritario;

    @Column(name = "SITUACAO_CCW", length = 1)
    private String situacaoCcw;

    @Column(name = "USERMYAUDIT", length = 200)
    private String usermyaudit;

    @Column(name = "SENHAMYAUDIT", length = 100)
    private String senhamyaudit;

    @Column(name = "USERMYBI", length = 200)
    private String usermybi;

    @Column(name = "SENHAMYBI", length = 100)
    private String senhamybi;

    @Column(name = "USERGOGEO", length = 200)
    private String usergogeo;

    @Column(name = "SENHAGOGEO", length = 100)
    private String senhagogeo;


    @Column(name = "EMITIRPEDIDO", length = 1)
    private String emitirpedido;

    @Column(name = "EMITIRORCAMENTO", length = 1)
    private String emitirorcamento;

    @Column(name = "PERSONALEMBRETE")
    private LocalDate personalembrete;

    @Column(name = "IDSOFITVIEW", length = 10)
    private String idsofitview;

    @Column(name = "DTULTALTERSOFITVIEW")
    private Instant dtultaltersofitview;

    @Column(name = "DTEXCLUSAOSOFITVIEW")
    private Instant dtexclusaosofitview;

    @Column(name = "VOIPMUNDOIPTOKEN", length = 100)
    private String voipmundoiptoken;

    @Column(name = "VOIPMUNDOIPKEY", length = 100)
    private String voipmundoipkey;

    @Column(name = "TELEFONERAMAL", length = 15)
    private String telefoneramal;

    @Column(name = "HASHSENHAWINTHOR", length = 250)
    private String hashsenhawinthor;

    @Column(name = "VOIPMUNDOIDCHAMADA", length = 20)
    private String voipmundoidchamada;

    @Column(name = "DTULTALTER")
    private LocalDate dtultalter;

    @Column(name = "ACESSOWEBCOMPRAS", length = 1)
    private String acessowebcompras;

    @Column(name = "ACESSOWEBVERBAS", length = 1)
    private String acessowebverbas;

    @Column(name = "LIMITEFUNDONEGATIVO", nullable = false, precision = 18, scale = 6)
    private BigDecimal limitefundonegativo;

    @Column(name = "CODIBGE")
    private Long codibge;

    @Column(name = "CODFILIALINTEGRACAO")
    private Short codfilialintegracao;

    @Column(name = "DTALTERC5")
    private Instant dtalterc5;

    @Column(name = "ALTERARSENHAPROXIMOLOGIN", length = 1)
    private String alterarsenhaproximologin;

    @Column(name = "CODPERFILACESSO")
    private Integer codperfilacesso;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtExclusao() {
        return dtExclusao;
    }

    public void setDtExclusao(LocalDate dtExclusao) {
        this.dtExclusao = dtExclusao;
    }

    public String getNomeGuerra() {
        return nomeGuerra;
    }

    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }

    public LocalDate getAdmissao() {
        return admissao;
    }

    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Integer getCodsetor() {
        return codsetor;
    }

    public void setCodsetor(Integer codsetor) {
        this.codsetor = codsetor;
    }

    public String getUsuariobd() {
        return usuariobd;
    }

    public void setUsuariobd(String usuariobd) {
        this.usuariobd = usuariobd;
    }

    public String getSenhabd() {
        return senhabd;
    }

    public void setSenhabd(String senhabd) {
        this.senhabd = senhabd;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipovenda() {
        return tipovenda;
    }

    public void setTipovenda(String tipovenda) {
        this.tipovenda = tipovenda;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public Short getCodusur() {
        return codusur;
    }

    public void setCodusur(Short codusur) {
        this.codusur = codusur;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Short getNumbanco() {
        return numbanco;
    }

    public void setNumbanco(Short numbanco) {
        this.numbanco = numbanco;
    }

    public Short getNumagencia() {
        return numagencia;
    }

    public void setNumagencia(Short numagencia) {
        this.numagencia = numagencia;
    }

    public String getNumccorrente() {
        return numccorrente;
    }

    public void setNumccorrente(String numccorrente) {
        this.numccorrente = numccorrente;
    }

    public Short getNumcentralpa() {
        return numcentralpa;
    }

    public void setNumcentralpa(Short numcentralpa) {
        this.numcentralpa = numcentralpa;
    }

    public String getNumcentraltel() {
        return numcentraltel;
    }

    public void setNumcentraltel(String numcentraltel) {
        this.numcentraltel = numcentraltel;
    }

    public String getPermitealtjurosbx() {
        return permitealtjurosbx;
    }

    public void setPermitealtjurosbx(String permitealtjurosbx) {
        this.permitealtjurosbx = permitealtjurosbx;
    }

    public BigDecimal getVlaumentolimcred() {
        return vlaumentolimcred;
    }

    public void setVlaumentolimcred(BigDecimal vlaumentolimcred) {
        this.vlaumentolimcred = vlaumentolimcred;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getFatorcomissao() {
        return fatorcomissao;
    }

    public void setFatorcomissao(BigDecimal fatorcomissao) {
        this.fatorcomissao = fatorcomissao;
    }

    public LocalDate getDtexpirasenha() {
        return dtexpirasenha;
    }

    public void setDtexpirasenha(LocalDate dtexpirasenha) {
        this.dtexpirasenha = dtexpirasenha;
    }

    public BigDecimal getVlcomisston() {
        return vlcomisston;
    }

    public void setVlcomisston(BigDecimal vlcomisston) {
        this.vlcomisston = vlcomisston;
    }

    public BigDecimal getVlcomissent() {
        return vlcomissent;
    }

    public void setVlcomissent(BigDecimal vlcomissent) {
        this.vlcomissent = vlcomissent;
    }

    public BigDecimal getVllimcredcompra() {
        return vllimcredcompra;
    }

    public void setVllimcredcompra(BigDecimal vllimcredcompra) {
        this.vllimcredcompra = vllimcredcompra;
    }

    public LocalDate getDtiniciolimcredcompra() {
        return dtiniciolimcredcompra;
    }

    public void setDtiniciolimcredcompra(LocalDate dtiniciolimcredcompra) {
        this.dtiniciolimcredcompra = dtiniciolimcredcompra;
    }

    public LocalDate getDtfimlimcredcompra() {
        return dtfimlimcredcompra;
    }

    public void setDtfimlimcredcompra(LocalDate dtfimlimcredcompra) {
        this.dtfimlimcredcompra = dtfimlimcredcompra;
    }

    public Integer getCodconferente() {
        return codconferente;
    }

    public void setCodconferente(Integer codconferente) {
        this.codconferente = codconferente;
    }

    public Short getCodfuncao() {
        return codfuncao;
    }

    public void setCodfuncao(Short codfuncao) {
        this.codfuncao = codfuncao;
    }

    public String getSeriectps() {
        return seriectps;
    }

    public void setSeriectps(String seriectps) {
        this.seriectps = seriectps;
    }

    public String getGeracccard() {
        return geracccard;
    }

    public void setGeracccard(String geracccard) {
        this.geracccard = geracccard;
    }

    public Long getMatriculacccard() {
        return matriculacccard;
    }

    public void setMatriculacccard(Long matriculacccard) {
        this.matriculacccard = matriculacccard;
    }

    public BigDecimal getVlsalcarteira() {
        return vlsalcarteira;
    }

    public void setVlsalcarteira(BigDecimal vlsalcarteira) {
        this.vlsalcarteira = vlsalcarteira;
    }

    public BigDecimal getVlsalario() {
        return vlsalario;
    }

    public void setVlsalario(BigDecimal vlsalario) {
        this.vlsalario = vlsalario;
    }

    public LocalDate getRescisao() {
        return rescisao;
    }

    public void setRescisao(LocalDate rescisao) {
        this.rescisao = rescisao;
    }

    public Short getNumfilhos() {
        return numfilhos;
    }

    public void setNumfilhos(Short numfilhos) {
        this.numfilhos = numfilhos;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public BigDecimal getPercvt() {
        return percvt;
    }

    public void setPercvt(BigDecimal percvt) {
        this.percvt = percvt;
    }

    public BigDecimal getVlplanosaude() {
        return vlplanosaude;
    }

    public void setVlplanosaude(BigDecimal vlplanosaude) {
        this.vlplanosaude = vlplanosaude;
    }

    public BigDecimal getVlsalfamilia() {
        return vlsalfamilia;
    }

    public void setVlsalfamilia(BigDecimal vlsalfamilia) {
        this.vlsalfamilia = vlsalfamilia;
    }

    public BigDecimal getPercinss() {
        return percinss;
    }

    public void setPercinss(BigDecimal percinss) {
        this.percinss = percinss;
    }

    public BigDecimal getVlpensaoalimenticia() {
        return vlpensaoalimenticia;
    }

    public void setVlpensaoalimenticia(BigDecimal vlpensaoalimenticia) {
        this.vlpensaoalimenticia = vlpensaoalimenticia;
    }

    public BigDecimal getVladicional() {
        return vladicional;
    }

    public void setVladicional(BigDecimal vladicional) {
        this.vladicional = vladicional;
    }

    public BigDecimal getVlvales() {
        return vlvales;
    }

    public void setVlvales(BigDecimal vlvales) {
        this.vlvales = vlvales;
    }

    public BigDecimal getVlmaxlibpedido() {
        return vlmaxlibpedido;
    }

    public void setVlmaxlibpedido(BigDecimal vlmaxlibpedido) {
        this.vlmaxlibpedido = vlmaxlibpedido;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getUfcnh() {
        return ufcnh;
    }

    public void setUfcnh(String ufcnh) {
        this.ufcnh = ufcnh;
    }

    public String getTipoenvio() {
        return tipoenvio;
    }

    public void setTipoenvio(String tipoenvio) {
        this.tipoenvio = tipoenvio;
    }

    public Integer getCodfornec() {
        return codfornec;
    }

    public void setCodfornec(Integer codfornec) {
        this.codfornec = codfornec;
    }

    public BigDecimal getPercommot() {
        return percommot;
    }

    public void setPercommot(BigDecimal percommot) {
        this.percommot = percommot;
    }

    public BigDecimal getVlfreteentrega() {
        return vlfreteentrega;
    }

    public void setVlfreteentrega(BigDecimal vlfreteentrega) {
        this.vlfreteentrega = vlfreteentrega;
    }

    public Short getCodveiculo() {
        return codveiculo;
    }

    public void setCodveiculo(Short codveiculo) {
        this.codveiculo = codveiculo;
    }

    public String getPermitealtdescbx() {
        return permitealtdescbx;
    }

    public void setPermitealtdescbx(String permitealtdescbx) {
        this.permitealtdescbx = permitealtdescbx;
    }

    public String getReferenciapessoal() {
        return referenciapessoal;
    }

    public void setReferenciapessoal(String referenciapessoal) {
        this.referenciapessoal = referenciapessoal;
    }

    public Short getDddtel() {
        return dddtel;
    }

    public void setDddtel(Short dddtel) {
        this.dddtel = dddtel;
    }

    public String getNomepai() {
        return nomepai;
    }

    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public String getCategoriacnh() {
        return categoriacnh;
    }

    public void setCategoriacnh(String categoriacnh) {
        this.categoriacnh = categoriacnh;
    }

    public String getTipomotorista() {
        return tipomotorista;
    }

    public void setTipomotorista(String tipomotorista) {
        this.tipomotorista = tipomotorista;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDtnasc() {
        return dtnasc;
    }

    public void setDtnasc(LocalDate dtnasc) {
        this.dtnasc = dtnasc;
    }

    public LocalDate getDtvalidadecnh() {
        return dtvalidadecnh;
    }

    public void setDtvalidadecnh(LocalDate dtvalidadecnh) {
        this.dtvalidadecnh = dtvalidadecnh;
    }

    public String getOrgaoemissorrg() {
        return orgaoemissorrg;
    }

    public void setOrgaoemissorrg(String orgaoemissorrg) {
        this.orgaoemissorrg = orgaoemissorrg;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getUsuariologado() {
        return usuariologado;
    }

    public void setUsuariologado(String usuariologado) {
        this.usuariologado = usuariologado;
    }

    public String getNumdvagencia() {
        return numdvagencia;
    }

    public void setNumdvagencia(String numdvagencia) {
        this.numdvagencia = numdvagencia;
    }

    public Short getNumconexoes() {
        return numconexoes;
    }

    public void setNumconexoes(Short numconexoes) {
        this.numconexoes = numconexoes;
    }

    public Short getNumconexoesatual() {
        return numconexoesatual;
    }

    public void setNumconexoesatual(Short numconexoesatual) {
        this.numconexoesatual = numconexoesatual;
    }

    public String getGrupoemail() {
        return grupoemail;
    }

    public void setGrupoemail(String grupoemail) {
        this.grupoemail = grupoemail;
    }

    public String getNomeemail() {
        return nomeemail;
    }

    public void setNomeemail(String nomeemail) {
        this.nomeemail = nomeemail;
    }

    public BigDecimal getPercminjurosmora() {
        return percminjurosmora;
    }

    public void setPercminjurosmora(BigDecimal percminjurosmora) {
        this.percminjurosmora = percminjurosmora;
    }

    public BigDecimal getPercmaxjurosmora() {
        return percmaxjurosmora;
    }

    public void setPercmaxjurosmora(BigDecimal percmaxjurosmora) {
        this.percmaxjurosmora = percmaxjurosmora;
    }

    public String getCodidioma() {
        return codidioma;
    }

    public void setCodidioma(String codidioma) {
        this.codidioma = codidioma;
    }

    public BigDecimal getPercexclimcred() {
        return percexclimcred;
    }

    public void setPercexclimcred(BigDecimal percexclimcred) {
        this.percexclimcred = percexclimcred;
    }

    public String getEnviafv() {
        return enviafv;
    }

    public void setEnviafv(String enviafv) {
        this.enviafv = enviafv;
    }

    public BigDecimal getPercreduzcomisrca() {
        return percreduzcomisrca;
    }

    public void setPercreduzcomisrca(BigDecimal percreduzcomisrca) {
        this.percreduzcomisrca = percreduzcomisrca;
    }

    public BigDecimal getVlsaldolimaltcredito() {
        return vlsaldolimaltcredito;
    }

    public void setVlsaldolimaltcredito(BigDecimal vlsaldolimaltcredito) {
        this.vlsaldolimaltcredito = vlsaldolimaltcredito;
    }

    public LocalDate getDtinicio() {
        return dtinicio;
    }

    public void setDtinicio(LocalDate dtinicio) {
        this.dtinicio = dtinicio;
    }

    public String getTipoatende() {
        return tipoatende;
    }

    public void setTipoatende(String tipoatende) {
        this.tipoatende = tipoatende;
    }

    public String getIprf() {
        return iprf;
    }

    public void setIprf(String iprf) {
        this.iprf = iprf;
    }

    public Long getGrupoos() {
        return grupoos;
    }

    public void setGrupoos(Long grupoos) {
        this.grupoos = grupoos;
    }

    public String getCodbarra() {
        return codbarra;
    }

    public void setCodbarra(String codbarra) {
        this.codbarra = codbarra;
    }

    public String getObsinativo() {
        return obsinativo;
    }

    public void setObsinativo(String obsinativo) {
        this.obsinativo = obsinativo;
    }

    public Short getNumdiaspagtoretroativo() {
        return numdiaspagtoretroativo;
    }

    public void setNumdiaspagtoretroativo(Short numdiaspagtoretroativo) {
        this.numdiaspagtoretroativo = numdiaspagtoretroativo;
    }

    public String getVendaassistida() {
        return vendaassistida;
    }

    public void setVendaassistida(String vendaassistida) {
        this.vendaassistida = vendaassistida;
    }

    public Integer getNumcaixabalcao() {
        return numcaixabalcao;
    }

    public void setNumcaixabalcao(Integer numcaixabalcao) {
        this.numcaixabalcao = numcaixabalcao;
    }

    public Long getCodigoperfil() {
        return codigoperfil;
    }

    public void setCodigoperfil(Long codigoperfil) {
        this.codigoperfil = codigoperfil;
    }

    public Integer getMaxtemposecaoociosa() {
        return maxtemposecaoociosa;
    }

    public void setMaxtemposecaoociosa(Integer maxtemposecaoociosa) {
        this.maxtemposecaoociosa = maxtemposecaoociosa;
    }

    public String getUsarateiocomissaooperador() {
        return usarateiocomissaooperador;
    }

    public void setUsarateiocomissaooperador(String usarateiocomissaooperador) {
        this.usarateiocomissaooperador = usarateiocomissaooperador;
    }

    public String getPermitepersoncad() {
        return permitepersoncad;
    }

    public void setPermitepersoncad(String permitepersoncad) {
        this.permitepersoncad = permitepersoncad;
    }

    public String getNumidentificadorecf() {
        return numidentificadorecf;
    }

    public void setNumidentificadorecf(String numidentificadorecf) {
        this.numidentificadorecf = numidentificadorecf;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Short getNumdiasmaxprorrog() {
        return numdiasmaxprorrog;
    }

    public void setNumdiasmaxprorrog(Short numdiasmaxprorrog) {
        this.numdiasmaxprorrog = numdiasmaxprorrog;
    }

    public String getAreaatuacao() {
        return areaatuacao;
    }

    public void setAreaatuacao(String areaatuacao) {
        this.areaatuacao = areaatuacao;
    }

    public BigDecimal getPercdesc() {
        return percdesc;
    }

    public void setPercdesc(BigDecimal percdesc) {
        this.percdesc = percdesc;
    }

    public String getNumdvconta() {
        return numdvconta;
    }

    public void setNumdvconta(String numdvconta) {
        this.numdvconta = numdvconta;
    }

    public String getTipoagentecob() {
        return tipoagentecob;
    }

    public void setTipoagentecob(String tipoagentecob) {
        this.tipoagentecob = tipoagentecob;
    }

    public Integer getDiascob() {
        return diascob;
    }

    public void setDiascob(Integer diascob) {
        this.diascob = diascob;
    }

    public BigDecimal getLimitedesconto561() {
        return limitedesconto561;
    }

    public void setLimitedesconto561(BigDecimal limitedesconto561) {
        this.limitedesconto561 = limitedesconto561;
    }

    public String getNuminss() {
        return numinss;
    }

    public void setNuminss(String numinss) {
        this.numinss = numinss;
    }

    public String getUsabiometriamenu() {
        return usabiometriamenu;
    }

    public void setUsabiometriamenu(String usabiometriamenu) {
        this.usabiometriamenu = usabiometriamenu;
    }

    public String getTipocomissao() {
        return tipocomissao;
    }

    public void setTipocomissao(String tipocomissao) {
        this.tipocomissao = tipocomissao;
    }

    public BigDecimal getComissaofixa() {
        return comissaofixa;
    }

    public void setComissaofixa(BigDecimal comissaofixa) {
        this.comissaofixa = comissaofixa;
    }

    public String getUsaavisoautomenu() {
        return usaavisoautomenu;
    }

    public void setUsaavisoautomenu(String usaavisoautomenu) {
        this.usaavisoautomenu = usaavisoautomenu;
    }

    public BigDecimal getPercmaxdesctitulo() {
        return percmaxdesctitulo;
    }

    public void setPercmaxdesctitulo(BigDecimal percmaxdesctitulo) {
        this.percmaxdesctitulo = percmaxdesctitulo;
    }

    public String getResplibcadastro() {
        return resplibcadastro;
    }

    public void setResplibcadastro(String resplibcadastro) {
        this.resplibcadastro = resplibcadastro;
    }

    public String getUsatabelacliente() {
        return usatabelacliente;
    }

    public void setUsatabelacliente(String usatabelacliente) {
        this.usatabelacliente = usatabelacliente;
    }

    public BigDecimal getVlmaxlimcredcli() {
        return vlmaxlimcredcli;
    }

    public void setVlmaxlimcredcli(BigDecimal vlmaxlimcredcli) {
        this.vlmaxlimcredcli = vlmaxlimcredcli;
    }

    public String getUsuariologadorf() {
        return usuariologadorf;
    }

    public void setUsuariologadorf(String usuariologadorf) {
        this.usuariologadorf = usuariologadorf;
    }

    public Integer getCodperfil() {
        return codperfil;
    }

    public void setCodperfil(Integer codperfil) {
        this.codperfil = codperfil;
    }

    public String getConcederabatimento() {
        return concederabatimento;
    }

    public void setConcederabatimento(String concederabatimento) {
        this.concederabatimento = concederabatimento;
    }

    public String getOrgaoemissorcnh() {
        return orgaoemissorcnh;
    }

    public void setOrgaoemissorcnh(String orgaoemissorcnh) {
        this.orgaoemissorcnh = orgaoemissorcnh;
    }

    public Short getQtdependentes() {
        return qtdependentes;
    }

    public void setQtdependentes(Short qtdependentes) {
        this.qtdependentes = qtdependentes;
    }

    public String getCodigocentrocusto() {
        return codigocentrocusto;
    }

    public void setCodigocentrocusto(String codigocentrocusto) {
        this.codigocentrocusto = codigocentrocusto;
    }

    public byte[] getIdintegracaomyfrota() {
        return idintegracaomyfrota;
    }

    public void setIdintegracaomyfrota(byte[] idintegracaomyfrota) {
        this.idintegracaomyfrota = idintegracaomyfrota;
    }

    public Integer getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(Integer codcidade) {
        this.codcidade = codcidade;
    }

    public BigDecimal getVllimmaxpedcompra() {
        return vllimmaxpedcompra;
    }

    public void setVllimmaxpedcompra(BigDecimal vllimmaxpedcompra) {
        this.vllimmaxpedcompra = vllimmaxpedcompra;
    }

    public LocalDate getDtdemissao() {
        return dtdemissao;
    }

    public void setDtdemissao(LocalDate dtdemissao) {
        this.dtdemissao = dtdemissao;
    }

    public String getChapaRm() {
        return chapaRm;
    }

    public void setChapaRm(String chapaRm) {
        this.chapaRm = chapaRm;
    }

    public String getAutochequebloqvenda() {
        return autochequebloqvenda;
    }

    public void setAutochequebloqvenda(String autochequebloqvenda) {
        this.autochequebloqvenda = autochequebloqvenda;
    }

    public String getSenhahash() {
        return senhahash;
    }

    public void setSenhahash(String senhahash) {
        this.senhahash = senhahash;
    }

    public String getMotivoinativacao() {
        return motivoinativacao;
    }

    public void setMotivoinativacao(String motivoinativacao) {
        this.motivoinativacao = motivoinativacao;
    }

    public BigDecimal getVlrlimaprovarsolicitacao() {
        return vlrlimaprovarsolicitacao;
    }

    public void setVlrlimaprovarsolicitacao(BigDecimal vlrlimaprovarsolicitacao) {
        this.vlrlimaprovarsolicitacao = vlrlimaprovarsolicitacao;
    }

    public Integer getRamal() {
        return ramal;
    }

    public void setRamal(Integer ramal) {
        this.ramal = ramal;
    }

    public String getFiid() {
        return fiid;
    }

    public void setFiid(String fiid) {
        this.fiid = fiid;
    }

    public String getAreaatuacaoCompra() {
        return areaatuacaoCompra;
    }

    public void setAreaatuacaoCompra(String areaatuacaoCompra) {
        this.areaatuacaoCompra = areaatuacaoCompra;
    }

    public String getAreaatuacaoVendas() {
        return areaatuacaoVendas;
    }

    public void setAreaatuacaoVendas(String areaatuacaoVendas) {
        this.areaatuacaoVendas = areaatuacaoVendas;
    }

    public String getAreaatuacaoFinanceiro() {
        return areaatuacaoFinanceiro;
    }

    public void setAreaatuacaoFinanceiro(String areaatuacaoFinanceiro) {
        this.areaatuacaoFinanceiro = areaatuacaoFinanceiro;
    }

    public String getAreaatuacaoLogistica() {
        return areaatuacaoLogistica;
    }

    public void setAreaatuacaoLogistica(String areaatuacaoLogistica) {
        this.areaatuacaoLogistica = areaatuacaoLogistica;
    }

    public String getAreaatuacaoExpedicao() {
        return areaatuacaoExpedicao;
    }

    public void setAreaatuacaoExpedicao(String areaatuacaoExpedicao) {
        this.areaatuacaoExpedicao = areaatuacaoExpedicao;
    }

    public String getAreaatuacaoRh() {
        return areaatuacaoRh;
    }

    public void setAreaatuacaoRh(String areaatuacaoRh) {
        this.areaatuacaoRh = areaatuacaoRh;
    }

    public String getAreaatuacaoFiscal() {
        return areaatuacaoFiscal;
    }

    public void setAreaatuacaoFiscal(String areaatuacaoFiscal) {
        this.areaatuacaoFiscal = areaatuacaoFiscal;
    }

    public String getAreaatuacaoContabil() {
        return areaatuacaoContabil;
    }

    public void setAreaatuacaoContabil(String areaatuacaoContabil) {
        this.areaatuacaoContabil = areaatuacaoContabil;
    }

    public String getAreaatuacaoOutros() {
        return areaatuacaoOutros;
    }

    public void setAreaatuacaoOutros(String areaatuacaoOutros) {
        this.areaatuacaoOutros = areaatuacaoOutros;
    }

    public String getTipocargo() {
        return tipocargo;
    }

    public void setTipocargo(String tipocargo) {
        this.tipocargo = tipocargo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public BigDecimal getPerdescmaxitem() {
        return perdescmaxitem;
    }

    public void setPerdescmaxitem(BigDecimal perdescmaxitem) {
        this.perdescmaxitem = perdescmaxitem;
    }

    public BigDecimal getPerdescmaxrodape() {
        return perdescmaxrodape;
    }

    public void setPerdescmaxrodape(BigDecimal perdescmaxrodape) {
        this.perdescmaxrodape = perdescmaxrodape;
    }

    public BigDecimal getLimReducaocredito() {
        return limReducaocredito;
    }

    public void setLimReducaocredito(BigDecimal limReducaocredito) {
        this.limReducaocredito = limReducaocredito;
    }

    public BigDecimal getLimAumentocredito() {
        return limAumentocredito;
    }

    public void setLimAumentocredito(BigDecimal limAumentocredito) {
        this.limAumentocredito = limAumentocredito;
    }

    public Short getPeriodoAlteracaocredito() {
        return periodoAlteracaocredito;
    }

    public void setPeriodoAlteracaocredito(Short periodoAlteracaocredito) {
        this.periodoAlteracaocredito = periodoAlteracaocredito;
    }

    public byte[] getDigitalpolegar() {
        return digitalpolegar;
    }

    public void setDigitalpolegar(byte[] digitalpolegar) {
        this.digitalpolegar = digitalpolegar;
    }

    public byte[] getDigitalindicador() {
        return digitalindicador;
    }

    public void setDigitalindicador(byte[] digitalindicador) {
        this.digitalindicador = digitalindicador;
    }

    public byte[] getDigitalmedio() {
        return digitalmedio;
    }

    public void setDigitalmedio(byte[] digitalmedio) {
        this.digitalmedio = digitalmedio;
    }

    public byte[] getDigitalanelar() {
        return digitalanelar;
    }

    public void setDigitalanelar(byte[] digitalanelar) {
        this.digitalanelar = digitalanelar;
    }

    public byte[] getDigitalminimo() {
        return digitalminimo;
    }

    public void setDigitalminimo(byte[] digitalminimo) {
        this.digitalminimo = digitalminimo;
    }

    public String getDedoprioritario() {
        return dedoprioritario;
    }

    public void setDedoprioritario(String dedoprioritario) {
        this.dedoprioritario = dedoprioritario;
    }

    public String getSituacaoCcw() {
        return situacaoCcw;
    }

    public void setSituacaoCcw(String situacaoCcw) {
        this.situacaoCcw = situacaoCcw;
    }

    public String getUsermyaudit() {
        return usermyaudit;
    }

    public void setUsermyaudit(String usermyaudit) {
        this.usermyaudit = usermyaudit;
    }

    public String getSenhamyaudit() {
        return senhamyaudit;
    }

    public void setSenhamyaudit(String senhamyaudit) {
        this.senhamyaudit = senhamyaudit;
    }

    public String getUsermybi() {
        return usermybi;
    }

    public void setUsermybi(String usermybi) {
        this.usermybi = usermybi;
    }

    public String getSenhamybi() {
        return senhamybi;
    }

    public void setSenhamybi(String senhamybi) {
        this.senhamybi = senhamybi;
    }

    public String getUsergogeo() {
        return usergogeo;
    }

    public void setUsergogeo(String usergogeo) {
        this.usergogeo = usergogeo;
    }

    public String getSenhagogeo() {
        return senhagogeo;
    }

    public void setSenhagogeo(String senhagogeo) {
        this.senhagogeo = senhagogeo;
    }


    public String getEmitirpedido() {
        return emitirpedido;
    }

    public void setEmitirpedido(String emitirpedido) {
        this.emitirpedido = emitirpedido;
    }

    public String getEmitirorcamento() {
        return emitirorcamento;
    }

    public void setEmitirorcamento(String emitirorcamento) {
        this.emitirorcamento = emitirorcamento;
    }

    public LocalDate getPersonalembrete() {
        return personalembrete;
    }

    public void setPersonalembrete(LocalDate personalembrete) {
        this.personalembrete = personalembrete;
    }

    public String getIdsofitview() {
        return idsofitview;
    }

    public void setIdsofitview(String idsofitview) {
        this.idsofitview = idsofitview;
    }

    public Instant getDtultaltersofitview() {
        return dtultaltersofitview;
    }

    public void setDtultaltersofitview(Instant dtultaltersofitview) {
        this.dtultaltersofitview = dtultaltersofitview;
    }

    public Instant getDtexclusaosofitview() {
        return dtexclusaosofitview;
    }

    public void setDtexclusaosofitview(Instant dtexclusaosofitview) {
        this.dtexclusaosofitview = dtexclusaosofitview;
    }

    public String getVoipmundoiptoken() {
        return voipmundoiptoken;
    }

    public void setVoipmundoiptoken(String voipmundoiptoken) {
        this.voipmundoiptoken = voipmundoiptoken;
    }

    public String getVoipmundoipkey() {
        return voipmundoipkey;
    }

    public void setVoipmundoipkey(String voipmundoipkey) {
        this.voipmundoipkey = voipmundoipkey;
    }

    public String getTelefoneramal() {
        return telefoneramal;
    }

    public void setTelefoneramal(String telefoneramal) {
        this.telefoneramal = telefoneramal;
    }

    public String getHashsenhawinthor() {
        return hashsenhawinthor;
    }

    public void setHashsenhawinthor(String hashsenhawinthor) {
        this.hashsenhawinthor = hashsenhawinthor;
    }

    public String getVoipmundoidchamada() {
        return voipmundoidchamada;
    }

    public void setVoipmundoidchamada(String voipmundoidchamada) {
        this.voipmundoidchamada = voipmundoidchamada;
    }

    public LocalDate getDtultalter() {
        return dtultalter;
    }

    public void setDtultalter(LocalDate dtultalter) {
        this.dtultalter = dtultalter;
    }

    public String getAcessowebcompras() {
        return acessowebcompras;
    }

    public void setAcessowebcompras(String acessowebcompras) {
        this.acessowebcompras = acessowebcompras;
    }

    public String getAcessowebverbas() {
        return acessowebverbas;
    }

    public void setAcessowebverbas(String acessowebverbas) {
        this.acessowebverbas = acessowebverbas;
    }

    public BigDecimal getLimitefundonegativo() {
        return limitefundonegativo;
    }

    public void setLimitefundonegativo(BigDecimal limitefundonegativo) {
        this.limitefundonegativo = limitefundonegativo;
    }

    public Long getCodibge() {
        return codibge;
    }

    public void setCodibge(Long codibge) {
        this.codibge = codibge;
    }

    public Short getCodfilialintegracao() {
        return codfilialintegracao;
    }

    public void setCodfilialintegracao(Short codfilialintegracao) {
        this.codfilialintegracao = codfilialintegracao;
    }

    public Instant getDtalterc5() {
        return dtalterc5;
    }

    public void setDtalterc5(Instant dtalterc5) {
        this.dtalterc5 = dtalterc5;
    }

    public String getAlterarsenhaproximologin() {
        return alterarsenhaproximologin;
    }

    public void setAlterarsenhaproximologin(String alterarsenhaproximologin) {
        this.alterarsenhaproximologin = alterarsenhaproximologin;
    }

    public Integer getCodperfilacesso() {
        return codperfilacesso;
    }

    public void setCodperfilacesso(Integer codperfilacesso) {
        this.codperfilacesso = codperfilacesso;
    }

}