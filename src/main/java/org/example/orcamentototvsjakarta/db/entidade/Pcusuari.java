package org.example.orcamentototvsjakarta.db.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PCUSUARI")
public class Pcusuari {
    @Id
    @Column(name = "CODUSUR", nullable = false)
    private Short id;

    @Column(name = "NOME", nullable = false, length = 40)
    private String nome;

    @Column(name = "SENHA", length = 10)
    private String senha;

    @Column(name = "TIPOVEND", length = 2)
    private String tipovend;

    @Column(name = "PERCENT", precision = 4, scale = 2)
    private BigDecimal percent;

    @Column(name = "PERCENT2", precision = 6, scale = 2)
    private BigDecimal percent2;

    @Column(name = "ENDERECO", length = 40)
    private String endereco;

    @Column(name = "CIDADE", length = 15)
    private String cidade;

    @Column(name = "ESTADO", length = 2)
    private String estado;

    @Column(name = "CEP", length = 9)
    private String cep;

    @Column(name = "TELEFONE1", length = 13)
    private String telefone1;

    @Column(name = "TELEFONE2", length = 13)
    private String telefone2;

    @Column(name = "CPF", length = 20)
    private String cpf;

    @Column(name = "CI", length = 20)
    private String ci;

    @Column(name = "FAX", length = 13)
    private String fax;

    @Column(name = "BIP", length = 20)
    private String bip;

    @Column(name = "MENS1", length = 60)
    private String mens1;

    @Column(name = "MENS2", length = 60)
    private String mens2;

    @Column(name = "MENS3", length = 60)
    private String mens3;

    @Column(name = "MENS4", length = 60)
    private String mens4;

    @Column(name = "BLOQUEIO", length = 1)
    private String bloqueio;

    @Column(name = "DTINICIO")
    private LocalDate dtinicio;

    @Column(name = "DTTERMINO")
    private LocalDate dttermino;

    @Column(name = "MOTIVO", length = 40)
    private String motivo;

    @Column(name = "DTNASC")
    private LocalDate dtnasc;

    @Column(name = "FIRMA", length = 40)
    private String firma;

    @Column(name = "CGC", length = 20)
    private String cgc;

    @Column(name = "BAIRRO", length = 25)
    private String bairro;

    @Column(name = "CODSUPERVISOR", nullable = false)
    private Short codsupervisor;

    @Column(name = "CONJUGE", length = 40)
    private String conjuge;

    @Column(name = "DTNASCONJUGE")
    private LocalDate dtnasconjuge;

    @Column(name = "TIPOFIRMA", length = 1)
    private String tipofirma;

    @Column(name = "NUMDEP")
    private Short numdep;

    @Column(name = "DTULTVENDA")
    private LocalDate dtultvenda;

    @Column(name = "DTENTREGADOC")
    private LocalDate dtentregadoc;

    @Column(name = "CODCOMOCLIENTE")
    private Integer codcomocliente;

    @Column(name = "CCORRENTE", length = 1)
    private String ccorrente;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "DTINFORMATIZA")
    private LocalDate dtinformatiza;

    @Column(name = "NUMSERIEEQUIP")
    private Long numserieequip;

    @Column(name = "PROXNUMPED", precision = 14, scale = 2)
    private BigDecimal proxnumped;

    @Column(name = "ULTNUMPED")
    private Long ultnumped;

    @Column(name = "NUMBANCO")
    private Short numbanco;

    @Column(name = "NUMAGENCIA")
    private Short numagencia;

    @Column(name = "NUMDVAGENCIA", length = 1)
    private String numdvagencia;

    @Column(name = "NUMCCORRENTE")
    private Long numccorrente;

    @Column(name = "NUMDVCCORRENTE", length = 2)
    private String numdvccorrente;

    @Column(name = "DTULTALTERACAO")
    private LocalDate dtultalteracao;

    @Column(name = "DTEXCLUSAO")
    private LocalDate dtexclusao;

    @Column(name = "VENDEDORQK", length = 1)
    private String vendedorqk;

    @Column(name = "CODEQUIPE")
    private Short codequipe;

    @Column(name = "PERMETA", precision = 10, scale = 2)
    private BigDecimal permeta;

    @Column(name = "CODFILIAL", length = 2)
    private String codfilial;

    @Column(name = "OBS1", length = 80)
    private String obs1;

    @Column(name = "OBS2", length = 80)
    private String obs2;

    @Column(name = "PROXNUMPEDFORCA")
    private Long proxnumpedforca;

    @Column(name = "BLOQCOMIS", length = 1)
    private String bloqcomis;

    @Column(name = "OBSBLOQ", length = 30)
    private String obsbloq;

    @Column(name = "VLCORRENTE", precision = 10, scale = 2)
    private BigDecimal vlcorrente;

    @Column(name = "VLLIMCRED", precision = 10, scale = 2)
    private BigDecimal vllimcred;

    @Column(name = "NUMCONSELHO", length = 20)
    private String numconselho;

    @Column(name = "INSS")
    private Long inss;

    @Column(name = "VLVENDAPREV", precision = 12, scale = 2)
    private BigDecimal vlvendaprev;

    @Column(name = "CODDISTRIB", length = 4)
    private String coddistrib;

    @Column(name = "DTLIMENTREGADOC")
    private LocalDate dtlimentregadoc;

    @Column(name = "MASKPREPOSTO", length = 9)
    private String maskpreposto;

    @Column(name = "EXPORTADADOS", length = 1)
    private String exportadados;

    @Column(name = "NUMSERIEEQUIP2", length = 15)
    private String numserieequip2;

    @Column(name = "DTULTPAGCONSELHO")
    private LocalDate dtultpagconselho;

    @Column(name = "INSCMUNICIPAL", length = 15)
    private String inscmunicipal;

    @Column(name = "PRACA1", length = 80)
    private String praca1;

    @Column(name = "PRACA2", length = 80)
    private String praca2;

    @Column(name = "ENDERECO2", length = 40)
    private String endereco2;

    @Column(name = "PERDESCMAX", precision = 5, scale = 2)
    private BigDecimal perdescmax;

    @Column(name = "EMAIL2", length = 100)
    private String email2;

    @Column(name = "BLOQVENDATLMK", length = 1)
    private String bloqvendatlmk;

    @Column(name = "AREAATUACAO", length = 1)
    private String areaatuacao;

    @Column(name = "VLVENDAMINPED", precision = 12, scale = 2)
    private BigDecimal vlvendaminped;

    @Column(name = "PERCMETADEPTO", precision = 10, scale = 2)
    private BigDecimal percmetadepto;

    @Column(name = "TIPOCOMISSAO", length = 1)
    private String tipocomissao;

    @Column(name = "USADEBCREDRCA", length = 1)
    private String usadebcredrca;

    @Column(name = "PERCACRESCIMOVENDA", precision = 5, scale = 2)
    private BigDecimal percacrescimovenda;

    @Column(name = "NUMBANCOPOUP")
    private Short numbancopoup;

    @Column(name = "NUMCCORRENTEPOUP")
    private Long numccorrentepoup;

    @Column(name = "NUMAGENCIAPOUP")
    private Short numagenciapoup;

    @Column(name = "NUMDVCCORRENTEPOUP", length = 2)
    private String numdvccorrentepoup;

    @Column(name = "NUMDVAGENCIAPOUP", length = 1)
    private String numdvagenciapoup;

    @Column(name = "HORAINICONEXAOPALM")
    private Short horainiconexaopalm;

    @Column(name = "MINUTOINICONEXAOPALM")
    private Short minutoiniconexaopalm;

    @Column(name = "HORAFIMCONEXAOPALM")
    private Short horafimconexaopalm;

    @Column(name = "MINUTOFIMCONEXAOPALM")
    private Short minutofimconexaopalm;

    @Column(name = "PROXCODCLIPALM")
    private Integer proxcodclipalm;

    @Column(name = "QTITENSPEDPREV", precision = 14, scale = 2)
    private BigDecimal qtitenspedprev;

    @Column(name = "QTPEDPREV", precision = 14, scale = 2)
    private BigDecimal qtpedprev;

    @Column(name = "TELPROVEDOR", length = 15)
    private String telprovedor;

    @Column(name = "SENHAPOP", length = 10)
    private String senhapop;

    @Column(name = "USURPOP", length = 40)
    private String usurpop;

    @Column(name = "SERVSMTP", length = 30)
    private String servsmtp;

    @Column(name = "SERVPOP", length = 30)
    private String servpop;

    @Column(name = "USURDIALUP", length = 40)
    private String usurdialup;

    @Column(name = "SENHADIALUP", length = 12)
    private String senhadialup;

    @Column(name = "PERCACRESFV", precision = 8, scale = 2)
    private BigDecimal percacresfv;

    @Column(name = "ROTAMASTERFOODS", length = 20)
    private String rotamasterfoods;

    @Column(name = "NUMPEDECF")
    private Long numpedecf;

    @Column(name = "USURLOGIN", length = 40)
    private String usurlogin;

    @Column(name = "SENHALOGIN", length = 10)
    private String senhalogin;

    @Column(name = "USURDIRFV", length = 50)
    private String usurdirfv;

    @Column(name = "DIRRECEPCAOFTP", length = 50)
    private String dirrecepcaoftp;

    @Column(name = "DIRENVIOFTP", length = 50)
    private String direnvioftp;

    @Column(name = "SERVFTP", length = 50)
    private String servftp;

    @Column(name = "USURFTP", length = 40)
    private String usurftp;

    @Column(name = "SENHAFTP", length = 10)
    private String senhaftp;

    @Column(name = "PERMETAMETRO", precision = 10, scale = 2)
    private BigDecimal permetametro;

    @Column(name = "PROXNUMPEDWEB")
    private Long proxnumpedweb;

    @Column(name = "CODOPERACAO", length = 3)
    private String codoperacao;

    @Column(name = "TIPOPESSOA", length = 1)
    private String tipopessoa;

    @Column(name = "PERMITEADIANTCOMISSAO", length = 1)
    private String permiteadiantcomissao;

    @Column(name = "INDICECPFECHCOMISSAO", length = 1)
    private String indicecpfechcomissao;

    @Column(name = "PERMAXVENDA", precision = 18, scale = 6)
    private BigDecimal permaxvenda;

    @Column(name = "INDICERATEIOCOMISSAO", precision = 5, scale = 2)
    private BigDecimal indicerateiocomissao;

    @Column(name = "USARRCAOPERADOR", length = 1)
    private String usarrcaoperador;

    @Column(name = "PERCOMMETA", precision = 8, scale = 4)
    private BigDecimal percommeta;

    @Column(name = "NUMCLIPOS", precision = 20, scale = 8)
    private BigDecimal numclipos;

    @Column(name = "CODMONITOR")
    private Integer codmonitor;

    @Column(name = "CODPRACAPRINCIPAL")
    private Short codpracaprincipal;

    @Column(name = "COMISSAOFIXA", precision = 10, scale = 2)
    private BigDecimal comissaofixa;

    @Column(name = "VLMAXTROCA", precision = 6, scale = 2)
    private BigDecimal vlmaxtroca;

    @Column(name = "USACOBRANCACARTAO", length = 1)
    private String usacobrancacartao;

    @Column(name = "EXPORTARECF", length = 1)
    private String exportarecf;

    @Column(name = "NUMCCORRENTEALFA", length = 12)
    private String numccorrentealfa;

    @Column(name = "CPFAUX", length = 20)
    private String cpfaux;

    @Column(name = "VALIDARACRESCDESCPRECOFIXO", length = 1)
    private String validaracrescdescprecofixo;

    @Column(name = "CODCIDADE")
    private Integer codcidade;

    @Column(name = "CODBAIRRO")
    private Integer codbairro;

    @Column(name = "CODCONTACSRF")
    private Long codcontacsrf;

    @Column(name = "PERCINSS", precision = 5, scale = 2)
    private BigDecimal percinss;

    @Column(name = "PERCCSRF", precision = 5, scale = 2)
    private BigDecimal perccsrf;

    @Column(name = "PERCPISNFSERVICO", precision = 6, scale = 2)
    private BigDecimal percpisnfservico;

    @Column(name = "PERCCOFINSNFSERVICO", precision = 6, scale = 2)
    private BigDecimal perccofinsnfservico;

    @Column(name = "PERCISS", precision = 4, scale = 2)
    private BigDecimal perciss;

    @Column(name = "PERCIRRF", precision = 4, scale = 2)
    private BigDecimal percirrf;

    @Column(name = "CODCONTAIRRF")
    private Long codcontairrf;

    @Column(name = "CODCONTAISS")
    private Long codcontaiss;

    @Column(name = "CODCONTAINSS")
    private Long codcontainss;

    @Column(name = "CODCONTAPIS")
    private Long codcontapis;

    @Column(name = "CODCONTACOFINS")
    private Long codcontacofins;

    @Column(name = "NUMNOTABLOCO1", length = 10)
    private String numnotabloco1;

    @Column(name = "EXPORTARPARAFORCAVENDAS", length = 1)
    private String exportarparaforcavendas;

    @Column(name = "DIRETORIOASSINATURA", length = 200)
    private String diretorioassinatura;

    @Column(name = "MODELOPALM", length = 30)
    private String modelopalm;

    @Column(name = "OBSFORCAVENDAS1", length = 80)
    private String obsforcavendas1;

    @Column(name = "OBSFORCAVENDAS2", length = 80)
    private String obsforcavendas2;

    @Column(name = "OBSFORCAVENDAS3", length = 80)
    private String obsforcavendas3;

    @Column(name = "OBSFORCAVENDAS4", length = 80)
    private String obsforcavendas4;

    @Column(name = "VISUALIZARPRODDEPTOSEC", length = 1)
    private String visualizarproddeptosec;

    @Column(name = "CODCONTAB", length = 12)
    private String codcontab;

    @Column(name = "SIMPLESNACIONAL", length = 1)
    private String simplesnacional;

    @Column(name = "CODIGOCENTROCUSTO", length = 40)
    private String codigocentrocusto;

    @Column(name = "COMISSAOSERVICOPRESTADO", precision = 12, scale = 2)
    private BigDecimal comissaoservicoprestado;

    @Column(name = "FATORCOMISLIQ", precision = 18, scale = 6)
    private BigDecimal fatorcomisliq;

    @Column(name = "NUMDEPENDENTES")
    private Short numdependentes;

    @Column(name = "LATITUDE", length = 20)
    private String latitude;

    @Column(name = "LONGITUDE", length = 20)
    private String longitude;

    @Column(name = "EXPORTARCOMISSAOFOLHARM", length = 1)
    private String exportarcomissaofolharm;

    @Column(name = "CODROTA")
    private Short codrota;

    @Column(name = "NUMSELOINICIAL", length = 20)
    private String numseloinicial;

    @Column(name = "NUMSELOFINAL", length = 20)
    private String numselofinal;

    @Column(name = "NUMFORMINICIAL")
    private Long numforminicial;

    @Column(name = "NUMFORMFINAL")
    private Long numformfinal;

    @Column(name = "UTILIZASELOSEFAZ", length = 1)
    private String utilizaselosefaz;

    @Column(name = "SERIENF", length = 3)
    private String serienf;

    @Column(name = "USACONTROLEFORMSELOSEFAZ", length = 1)
    private String usacontroleformselosefaz;

    @Column(name = "PROXNUMFORM")
    private Long proxnumform;

    @Column(name = "PROXNUMSELO")
    private Long proxnumselo;

    @Column(name = "CODCONTASRF")
    private Long codcontasrf;

    @Column(name = "NUMAIDF", length = 30)
    private String numaidf;

    @Column(name = "CPFTITULARCC", length = 20)
    private String cpftitularcc;

    @Column(name = "CPFTITULARCP", length = 20)
    private String cpftitularcp;

    @Column(name = "CONTRIBINDIVIDUALINSS", length = 1)
    private String contribindividualinss;

    @Column(name = "NIT", length = 20)
    private String nit;

    @Column(name = "PARTCLUBEITT", length = 1)
    private String partclubeitt;

    @Column(name = "DTFIMVIGCLUBEITT")
    private LocalDate dtfimvigclubeitt;

    @Column(name = "CHAPA_RM", length = 16)
    private String chapaRm;


    @Column(name = "CALCULARDSR", length = 1)
    private String calculardsr;

    @Column(name = "TIPOCONTAPAGAMENTO")
    private Boolean tipocontapagamento;

    @Column(name = "PERMITEPRODSEMDISTRIBUICAO", length = 1)
    private String permiteprodsemdistribuicao;

    @Column(name = "CODUSURPG", length = 6)
    private String codusurpg;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipovend() {
        return tipovend;
    }

    public void setTipovend(String tipovend) {
        this.tipovend = tipovend;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    public BigDecimal getPercent2() {
        return percent2;
    }

    public void setPercent2(BigDecimal percent2) {
        this.percent2 = percent2;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getBip() {
        return bip;
    }

    public void setBip(String bip) {
        this.bip = bip;
    }

    public String getMens1() {
        return mens1;
    }

    public void setMens1(String mens1) {
        this.mens1 = mens1;
    }

    public String getMens2() {
        return mens2;
    }

    public void setMens2(String mens2) {
        this.mens2 = mens2;
    }

    public String getMens3() {
        return mens3;
    }

    public void setMens3(String mens3) {
        this.mens3 = mens3;
    }

    public String getMens4() {
        return mens4;
    }

    public void setMens4(String mens4) {
        this.mens4 = mens4;
    }

    public String getBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(String bloqueio) {
        this.bloqueio = bloqueio;
    }

    public LocalDate getDtinicio() {
        return dtinicio;
    }

    public void setDtinicio(LocalDate dtinicio) {
        this.dtinicio = dtinicio;
    }

    public LocalDate getDttermino() {
        return dttermino;
    }

    public void setDttermino(LocalDate dttermino) {
        this.dttermino = dttermino;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDate getDtnasc() {
        return dtnasc;
    }

    public void setDtnasc(LocalDate dtnasc) {
        this.dtnasc = dtnasc;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Short getCodsupervisor() {
        return codsupervisor;
    }

    public void setCodsupervisor(Short codsupervisor) {
        this.codsupervisor = codsupervisor;
    }

    public String getConjuge() {
        return conjuge;
    }

    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
    }

    public LocalDate getDtnasconjuge() {
        return dtnasconjuge;
    }

    public void setDtnasconjuge(LocalDate dtnasconjuge) {
        this.dtnasconjuge = dtnasconjuge;
    }

    public String getTipofirma() {
        return tipofirma;
    }

    public void setTipofirma(String tipofirma) {
        this.tipofirma = tipofirma;
    }

    public Short getNumdep() {
        return numdep;
    }

    public void setNumdep(Short numdep) {
        this.numdep = numdep;
    }

    public LocalDate getDtultvenda() {
        return dtultvenda;
    }

    public void setDtultvenda(LocalDate dtultvenda) {
        this.dtultvenda = dtultvenda;
    }

    public LocalDate getDtentregadoc() {
        return dtentregadoc;
    }

    public void setDtentregadoc(LocalDate dtentregadoc) {
        this.dtentregadoc = dtentregadoc;
    }

    public Integer getCodcomocliente() {
        return codcomocliente;
    }

    public void setCodcomocliente(Integer codcomocliente) {
        this.codcomocliente = codcomocliente;
    }

    public String getCcorrente() {
        return ccorrente;
    }

    public void setCcorrente(String ccorrente) {
        this.ccorrente = ccorrente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDtinformatiza() {
        return dtinformatiza;
    }

    public void setDtinformatiza(LocalDate dtinformatiza) {
        this.dtinformatiza = dtinformatiza;
    }

    public Long getNumserieequip() {
        return numserieequip;
    }

    public void setNumserieequip(Long numserieequip) {
        this.numserieequip = numserieequip;
    }

    public BigDecimal getProxnumped() {
        return proxnumped;
    }

    public void setProxnumped(BigDecimal proxnumped) {
        this.proxnumped = proxnumped;
    }

    public Long getUltnumped() {
        return ultnumped;
    }

    public void setUltnumped(Long ultnumped) {
        this.ultnumped = ultnumped;
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

    public String getNumdvagencia() {
        return numdvagencia;
    }

    public void setNumdvagencia(String numdvagencia) {
        this.numdvagencia = numdvagencia;
    }

    public Long getNumccorrente() {
        return numccorrente;
    }

    public void setNumccorrente(Long numccorrente) {
        this.numccorrente = numccorrente;
    }

    public String getNumdvccorrente() {
        return numdvccorrente;
    }

    public void setNumdvccorrente(String numdvccorrente) {
        this.numdvccorrente = numdvccorrente;
    }

    public LocalDate getDtultalteracao() {
        return dtultalteracao;
    }

    public void setDtultalteracao(LocalDate dtultalteracao) {
        this.dtultalteracao = dtultalteracao;
    }

    public LocalDate getDtexclusao() {
        return dtexclusao;
    }

    public void setDtexclusao(LocalDate dtexclusao) {
        this.dtexclusao = dtexclusao;
    }

    public String getVendedorqk() {
        return vendedorqk;
    }

    public void setVendedorqk(String vendedorqk) {
        this.vendedorqk = vendedorqk;
    }

    public Short getCodequipe() {
        return codequipe;
    }

    public void setCodequipe(Short codequipe) {
        this.codequipe = codequipe;
    }

    public BigDecimal getPermeta() {
        return permeta;
    }

    public void setPermeta(BigDecimal permeta) {
        this.permeta = permeta;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public String getObs1() {
        return obs1;
    }

    public void setObs1(String obs1) {
        this.obs1 = obs1;
    }

    public String getObs2() {
        return obs2;
    }

    public void setObs2(String obs2) {
        this.obs2 = obs2;
    }

    public Long getProxnumpedforca() {
        return proxnumpedforca;
    }

    public void setProxnumpedforca(Long proxnumpedforca) {
        this.proxnumpedforca = proxnumpedforca;
    }

    public String getBloqcomis() {
        return bloqcomis;
    }

    public void setBloqcomis(String bloqcomis) {
        this.bloqcomis = bloqcomis;
    }

    public String getObsbloq() {
        return obsbloq;
    }

    public void setObsbloq(String obsbloq) {
        this.obsbloq = obsbloq;
    }

    public BigDecimal getVlcorrente() {
        return vlcorrente;
    }

    public void setVlcorrente(BigDecimal vlcorrente) {
        this.vlcorrente = vlcorrente;
    }

    public BigDecimal getVllimcred() {
        return vllimcred;
    }

    public void setVllimcred(BigDecimal vllimcred) {
        this.vllimcred = vllimcred;
    }

    public String getNumconselho() {
        return numconselho;
    }

    public void setNumconselho(String numconselho) {
        this.numconselho = numconselho;
    }

    public Long getInss() {
        return inss;
    }

    public void setInss(Long inss) {
        this.inss = inss;
    }

    public BigDecimal getVlvendaprev() {
        return vlvendaprev;
    }

    public void setVlvendaprev(BigDecimal vlvendaprev) {
        this.vlvendaprev = vlvendaprev;
    }

    public String getCoddistrib() {
        return coddistrib;
    }

    public void setCoddistrib(String coddistrib) {
        this.coddistrib = coddistrib;
    }

    public LocalDate getDtlimentregadoc() {
        return dtlimentregadoc;
    }

    public void setDtlimentregadoc(LocalDate dtlimentregadoc) {
        this.dtlimentregadoc = dtlimentregadoc;
    }

    public String getMaskpreposto() {
        return maskpreposto;
    }

    public void setMaskpreposto(String maskpreposto) {
        this.maskpreposto = maskpreposto;
    }

    public String getExportadados() {
        return exportadados;
    }

    public void setExportadados(String exportadados) {
        this.exportadados = exportadados;
    }

    public String getNumserieequip2() {
        return numserieequip2;
    }

    public void setNumserieequip2(String numserieequip2) {
        this.numserieequip2 = numserieequip2;
    }

    public LocalDate getDtultpagconselho() {
        return dtultpagconselho;
    }

    public void setDtultpagconselho(LocalDate dtultpagconselho) {
        this.dtultpagconselho = dtultpagconselho;
    }

    public String getInscmunicipal() {
        return inscmunicipal;
    }

    public void setInscmunicipal(String inscmunicipal) {
        this.inscmunicipal = inscmunicipal;
    }

    public String getPraca1() {
        return praca1;
    }

    public void setPraca1(String praca1) {
        this.praca1 = praca1;
    }

    public String getPraca2() {
        return praca2;
    }

    public void setPraca2(String praca2) {
        this.praca2 = praca2;
    }

    public String getEndereco2() {
        return endereco2;
    }

    public void setEndereco2(String endereco2) {
        this.endereco2 = endereco2;
    }

    public BigDecimal getPerdescmax() {
        return perdescmax;
    }

    public void setPerdescmax(BigDecimal perdescmax) {
        this.perdescmax = perdescmax;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getBloqvendatlmk() {
        return bloqvendatlmk;
    }

    public void setBloqvendatlmk(String bloqvendatlmk) {
        this.bloqvendatlmk = bloqvendatlmk;
    }

    public String getAreaatuacao() {
        return areaatuacao;
    }

    public void setAreaatuacao(String areaatuacao) {
        this.areaatuacao = areaatuacao;
    }

    public BigDecimal getVlvendaminped() {
        return vlvendaminped;
    }

    public void setVlvendaminped(BigDecimal vlvendaminped) {
        this.vlvendaminped = vlvendaminped;
    }

    public BigDecimal getPercmetadepto() {
        return percmetadepto;
    }

    public void setPercmetadepto(BigDecimal percmetadepto) {
        this.percmetadepto = percmetadepto;
    }

    public String getTipocomissao() {
        return tipocomissao;
    }

    public void setTipocomissao(String tipocomissao) {
        this.tipocomissao = tipocomissao;
    }

    public String getUsadebcredrca() {
        return usadebcredrca;
    }

    public void setUsadebcredrca(String usadebcredrca) {
        this.usadebcredrca = usadebcredrca;
    }

    public BigDecimal getPercacrescimovenda() {
        return percacrescimovenda;
    }

    public void setPercacrescimovenda(BigDecimal percacrescimovenda) {
        this.percacrescimovenda = percacrescimovenda;
    }

    public Short getNumbancopoup() {
        return numbancopoup;
    }

    public void setNumbancopoup(Short numbancopoup) {
        this.numbancopoup = numbancopoup;
    }

    public Long getNumccorrentepoup() {
        return numccorrentepoup;
    }

    public void setNumccorrentepoup(Long numccorrentepoup) {
        this.numccorrentepoup = numccorrentepoup;
    }

    public Short getNumagenciapoup() {
        return numagenciapoup;
    }

    public void setNumagenciapoup(Short numagenciapoup) {
        this.numagenciapoup = numagenciapoup;
    }

    public String getNumdvccorrentepoup() {
        return numdvccorrentepoup;
    }

    public void setNumdvccorrentepoup(String numdvccorrentepoup) {
        this.numdvccorrentepoup = numdvccorrentepoup;
    }

    public String getNumdvagenciapoup() {
        return numdvagenciapoup;
    }

    public void setNumdvagenciapoup(String numdvagenciapoup) {
        this.numdvagenciapoup = numdvagenciapoup;
    }

    public Short getHorainiconexaopalm() {
        return horainiconexaopalm;
    }

    public void setHorainiconexaopalm(Short horainiconexaopalm) {
        this.horainiconexaopalm = horainiconexaopalm;
    }

    public Short getMinutoiniconexaopalm() {
        return minutoiniconexaopalm;
    }

    public void setMinutoiniconexaopalm(Short minutoiniconexaopalm) {
        this.minutoiniconexaopalm = minutoiniconexaopalm;
    }

    public Short getHorafimconexaopalm() {
        return horafimconexaopalm;
    }

    public void setHorafimconexaopalm(Short horafimconexaopalm) {
        this.horafimconexaopalm = horafimconexaopalm;
    }

    public Short getMinutofimconexaopalm() {
        return minutofimconexaopalm;
    }

    public void setMinutofimconexaopalm(Short minutofimconexaopalm) {
        this.minutofimconexaopalm = minutofimconexaopalm;
    }

    public Integer getProxcodclipalm() {
        return proxcodclipalm;
    }

    public void setProxcodclipalm(Integer proxcodclipalm) {
        this.proxcodclipalm = proxcodclipalm;
    }

    public BigDecimal getQtitenspedprev() {
        return qtitenspedprev;
    }

    public void setQtitenspedprev(BigDecimal qtitenspedprev) {
        this.qtitenspedprev = qtitenspedprev;
    }

    public BigDecimal getQtpedprev() {
        return qtpedprev;
    }

    public void setQtpedprev(BigDecimal qtpedprev) {
        this.qtpedprev = qtpedprev;
    }

    public String getTelprovedor() {
        return telprovedor;
    }

    public void setTelprovedor(String telprovedor) {
        this.telprovedor = telprovedor;
    }

    public String getSenhapop() {
        return senhapop;
    }

    public void setSenhapop(String senhapop) {
        this.senhapop = senhapop;
    }

    public String getUsurpop() {
        return usurpop;
    }

    public void setUsurpop(String usurpop) {
        this.usurpop = usurpop;
    }

    public String getServsmtp() {
        return servsmtp;
    }

    public void setServsmtp(String servsmtp) {
        this.servsmtp = servsmtp;
    }

    public String getServpop() {
        return servpop;
    }

    public void setServpop(String servpop) {
        this.servpop = servpop;
    }

    public String getUsurdialup() {
        return usurdialup;
    }

    public void setUsurdialup(String usurdialup) {
        this.usurdialup = usurdialup;
    }

    public String getSenhadialup() {
        return senhadialup;
    }

    public void setSenhadialup(String senhadialup) {
        this.senhadialup = senhadialup;
    }

    public BigDecimal getPercacresfv() {
        return percacresfv;
    }

    public void setPercacresfv(BigDecimal percacresfv) {
        this.percacresfv = percacresfv;
    }

    public String getRotamasterfoods() {
        return rotamasterfoods;
    }

    public void setRotamasterfoods(String rotamasterfoods) {
        this.rotamasterfoods = rotamasterfoods;
    }

    public Long getNumpedecf() {
        return numpedecf;
    }

    public void setNumpedecf(Long numpedecf) {
        this.numpedecf = numpedecf;
    }

    public String getUsurlogin() {
        return usurlogin;
    }

    public void setUsurlogin(String usurlogin) {
        this.usurlogin = usurlogin;
    }

    public String getSenhalogin() {
        return senhalogin;
    }

    public void setSenhalogin(String senhalogin) {
        this.senhalogin = senhalogin;
    }

    public String getUsurdirfv() {
        return usurdirfv;
    }

    public void setUsurdirfv(String usurdirfv) {
        this.usurdirfv = usurdirfv;
    }

    public String getDirrecepcaoftp() {
        return dirrecepcaoftp;
    }

    public void setDirrecepcaoftp(String dirrecepcaoftp) {
        this.dirrecepcaoftp = dirrecepcaoftp;
    }

    public String getDirenvioftp() {
        return direnvioftp;
    }

    public void setDirenvioftp(String direnvioftp) {
        this.direnvioftp = direnvioftp;
    }

    public String getServftp() {
        return servftp;
    }

    public void setServftp(String servftp) {
        this.servftp = servftp;
    }

    public String getUsurftp() {
        return usurftp;
    }

    public void setUsurftp(String usurftp) {
        this.usurftp = usurftp;
    }

    public String getSenhaftp() {
        return senhaftp;
    }

    public void setSenhaftp(String senhaftp) {
        this.senhaftp = senhaftp;
    }

    public BigDecimal getPermetametro() {
        return permetametro;
    }

    public void setPermetametro(BigDecimal permetametro) {
        this.permetametro = permetametro;
    }

    public Long getProxnumpedweb() {
        return proxnumpedweb;
    }

    public void setProxnumpedweb(Long proxnumpedweb) {
        this.proxnumpedweb = proxnumpedweb;
    }

    public String getCodoperacao() {
        return codoperacao;
    }

    public void setCodoperacao(String codoperacao) {
        this.codoperacao = codoperacao;
    }

    public String getTipopessoa() {
        return tipopessoa;
    }

    public void setTipopessoa(String tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

    public String getPermiteadiantcomissao() {
        return permiteadiantcomissao;
    }

    public void setPermiteadiantcomissao(String permiteadiantcomissao) {
        this.permiteadiantcomissao = permiteadiantcomissao;
    }

    public String getIndicecpfechcomissao() {
        return indicecpfechcomissao;
    }

    public void setIndicecpfechcomissao(String indicecpfechcomissao) {
        this.indicecpfechcomissao = indicecpfechcomissao;
    }

    public BigDecimal getPermaxvenda() {
        return permaxvenda;
    }

    public void setPermaxvenda(BigDecimal permaxvenda) {
        this.permaxvenda = permaxvenda;
    }

    public BigDecimal getIndicerateiocomissao() {
        return indicerateiocomissao;
    }

    public void setIndicerateiocomissao(BigDecimal indicerateiocomissao) {
        this.indicerateiocomissao = indicerateiocomissao;
    }

    public String getUsarrcaoperador() {
        return usarrcaoperador;
    }

    public void setUsarrcaoperador(String usarrcaoperador) {
        this.usarrcaoperador = usarrcaoperador;
    }

    public BigDecimal getPercommeta() {
        return percommeta;
    }

    public void setPercommeta(BigDecimal percommeta) {
        this.percommeta = percommeta;
    }

    public BigDecimal getNumclipos() {
        return numclipos;
    }

    public void setNumclipos(BigDecimal numclipos) {
        this.numclipos = numclipos;
    }

    public Integer getCodmonitor() {
        return codmonitor;
    }

    public void setCodmonitor(Integer codmonitor) {
        this.codmonitor = codmonitor;
    }

    public Short getCodpracaprincipal() {
        return codpracaprincipal;
    }

    public void setCodpracaprincipal(Short codpracaprincipal) {
        this.codpracaprincipal = codpracaprincipal;
    }

    public BigDecimal getComissaofixa() {
        return comissaofixa;
    }

    public void setComissaofixa(BigDecimal comissaofixa) {
        this.comissaofixa = comissaofixa;
    }

    public BigDecimal getVlmaxtroca() {
        return vlmaxtroca;
    }

    public void setVlmaxtroca(BigDecimal vlmaxtroca) {
        this.vlmaxtroca = vlmaxtroca;
    }

    public String getUsacobrancacartao() {
        return usacobrancacartao;
    }

    public void setUsacobrancacartao(String usacobrancacartao) {
        this.usacobrancacartao = usacobrancacartao;
    }

    public String getExportarecf() {
        return exportarecf;
    }

    public void setExportarecf(String exportarecf) {
        this.exportarecf = exportarecf;
    }

    public String getNumccorrentealfa() {
        return numccorrentealfa;
    }

    public void setNumccorrentealfa(String numccorrentealfa) {
        this.numccorrentealfa = numccorrentealfa;
    }

    public String getCpfaux() {
        return cpfaux;
    }

    public void setCpfaux(String cpfaux) {
        this.cpfaux = cpfaux;
    }

    public String getValidaracrescdescprecofixo() {
        return validaracrescdescprecofixo;
    }

    public void setValidaracrescdescprecofixo(String validaracrescdescprecofixo) {
        this.validaracrescdescprecofixo = validaracrescdescprecofixo;
    }

    public Integer getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(Integer codcidade) {
        this.codcidade = codcidade;
    }

    public Integer getCodbairro() {
        return codbairro;
    }

    public void setCodbairro(Integer codbairro) {
        this.codbairro = codbairro;
    }

    public Long getCodcontacsrf() {
        return codcontacsrf;
    }

    public void setCodcontacsrf(Long codcontacsrf) {
        this.codcontacsrf = codcontacsrf;
    }

    public BigDecimal getPercinss() {
        return percinss;
    }

    public void setPercinss(BigDecimal percinss) {
        this.percinss = percinss;
    }

    public BigDecimal getPerccsrf() {
        return perccsrf;
    }

    public void setPerccsrf(BigDecimal perccsrf) {
        this.perccsrf = perccsrf;
    }

    public BigDecimal getPercpisnfservico() {
        return percpisnfservico;
    }

    public void setPercpisnfservico(BigDecimal percpisnfservico) {
        this.percpisnfservico = percpisnfservico;
    }

    public BigDecimal getPerccofinsnfservico() {
        return perccofinsnfservico;
    }

    public void setPerccofinsnfservico(BigDecimal perccofinsnfservico) {
        this.perccofinsnfservico = perccofinsnfservico;
    }

    public BigDecimal getPerciss() {
        return perciss;
    }

    public void setPerciss(BigDecimal perciss) {
        this.perciss = perciss;
    }

    public BigDecimal getPercirrf() {
        return percirrf;
    }

    public void setPercirrf(BigDecimal percirrf) {
        this.percirrf = percirrf;
    }

    public Long getCodcontairrf() {
        return codcontairrf;
    }

    public void setCodcontairrf(Long codcontairrf) {
        this.codcontairrf = codcontairrf;
    }

    public Long getCodcontaiss() {
        return codcontaiss;
    }

    public void setCodcontaiss(Long codcontaiss) {
        this.codcontaiss = codcontaiss;
    }

    public Long getCodcontainss() {
        return codcontainss;
    }

    public void setCodcontainss(Long codcontainss) {
        this.codcontainss = codcontainss;
    }

    public Long getCodcontapis() {
        return codcontapis;
    }

    public void setCodcontapis(Long codcontapis) {
        this.codcontapis = codcontapis;
    }

    public Long getCodcontacofins() {
        return codcontacofins;
    }

    public void setCodcontacofins(Long codcontacofins) {
        this.codcontacofins = codcontacofins;
    }

    public String getNumnotabloco1() {
        return numnotabloco1;
    }

    public void setNumnotabloco1(String numnotabloco1) {
        this.numnotabloco1 = numnotabloco1;
    }

    public String getExportarparaforcavendas() {
        return exportarparaforcavendas;
    }

    public void setExportarparaforcavendas(String exportarparaforcavendas) {
        this.exportarparaforcavendas = exportarparaforcavendas;
    }

    public String getDiretorioassinatura() {
        return diretorioassinatura;
    }

    public void setDiretorioassinatura(String diretorioassinatura) {
        this.diretorioassinatura = diretorioassinatura;
    }

    public String getModelopalm() {
        return modelopalm;
    }

    public void setModelopalm(String modelopalm) {
        this.modelopalm = modelopalm;
    }

    public String getObsforcavendas1() {
        return obsforcavendas1;
    }

    public void setObsforcavendas1(String obsforcavendas1) {
        this.obsforcavendas1 = obsforcavendas1;
    }

    public String getObsforcavendas2() {
        return obsforcavendas2;
    }

    public void setObsforcavendas2(String obsforcavendas2) {
        this.obsforcavendas2 = obsforcavendas2;
    }

    public String getObsforcavendas3() {
        return obsforcavendas3;
    }

    public void setObsforcavendas3(String obsforcavendas3) {
        this.obsforcavendas3 = obsforcavendas3;
    }

    public String getObsforcavendas4() {
        return obsforcavendas4;
    }

    public void setObsforcavendas4(String obsforcavendas4) {
        this.obsforcavendas4 = obsforcavendas4;
    }

    public String getVisualizarproddeptosec() {
        return visualizarproddeptosec;
    }

    public void setVisualizarproddeptosec(String visualizarproddeptosec) {
        this.visualizarproddeptosec = visualizarproddeptosec;
    }

    public String getCodcontab() {
        return codcontab;
    }

    public void setCodcontab(String codcontab) {
        this.codcontab = codcontab;
    }

    public String getSimplesnacional() {
        return simplesnacional;
    }

    public void setSimplesnacional(String simplesnacional) {
        this.simplesnacional = simplesnacional;
    }

    public String getCodigocentrocusto() {
        return codigocentrocusto;
    }

    public void setCodigocentrocusto(String codigocentrocusto) {
        this.codigocentrocusto = codigocentrocusto;
    }

    public BigDecimal getComissaoservicoprestado() {
        return comissaoservicoprestado;
    }

    public void setComissaoservicoprestado(BigDecimal comissaoservicoprestado) {
        this.comissaoservicoprestado = comissaoservicoprestado;
    }

    public BigDecimal getFatorcomisliq() {
        return fatorcomisliq;
    }

    public void setFatorcomisliq(BigDecimal fatorcomisliq) {
        this.fatorcomisliq = fatorcomisliq;
    }

    public Short getNumdependentes() {
        return numdependentes;
    }

    public void setNumdependentes(Short numdependentes) {
        this.numdependentes = numdependentes;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getExportarcomissaofolharm() {
        return exportarcomissaofolharm;
    }

    public void setExportarcomissaofolharm(String exportarcomissaofolharm) {
        this.exportarcomissaofolharm = exportarcomissaofolharm;
    }

    public Short getCodrota() {
        return codrota;
    }

    public void setCodrota(Short codrota) {
        this.codrota = codrota;
    }

    public String getNumseloinicial() {
        return numseloinicial;
    }

    public void setNumseloinicial(String numseloinicial) {
        this.numseloinicial = numseloinicial;
    }

    public String getNumselofinal() {
        return numselofinal;
    }

    public void setNumselofinal(String numselofinal) {
        this.numselofinal = numselofinal;
    }

    public Long getNumforminicial() {
        return numforminicial;
    }

    public void setNumforminicial(Long numforminicial) {
        this.numforminicial = numforminicial;
    }

    public Long getNumformfinal() {
        return numformfinal;
    }

    public void setNumformfinal(Long numformfinal) {
        this.numformfinal = numformfinal;
    }

    public String getUtilizaselosefaz() {
        return utilizaselosefaz;
    }

    public void setUtilizaselosefaz(String utilizaselosefaz) {
        this.utilizaselosefaz = utilizaselosefaz;
    }

    public String getSerienf() {
        return serienf;
    }

    public void setSerienf(String serienf) {
        this.serienf = serienf;
    }

    public String getUsacontroleformselosefaz() {
        return usacontroleformselosefaz;
    }

    public void setUsacontroleformselosefaz(String usacontroleformselosefaz) {
        this.usacontroleformselosefaz = usacontroleformselosefaz;
    }

    public Long getProxnumform() {
        return proxnumform;
    }

    public void setProxnumform(Long proxnumform) {
        this.proxnumform = proxnumform;
    }

    public Long getProxnumselo() {
        return proxnumselo;
    }

    public void setProxnumselo(Long proxnumselo) {
        this.proxnumselo = proxnumselo;
    }

    public Long getCodcontasrf() {
        return codcontasrf;
    }

    public void setCodcontasrf(Long codcontasrf) {
        this.codcontasrf = codcontasrf;
    }

    public String getNumaidf() {
        return numaidf;
    }

    public void setNumaidf(String numaidf) {
        this.numaidf = numaidf;
    }

    public String getCpftitularcc() {
        return cpftitularcc;
    }

    public void setCpftitularcc(String cpftitularcc) {
        this.cpftitularcc = cpftitularcc;
    }

    public String getCpftitularcp() {
        return cpftitularcp;
    }

    public void setCpftitularcp(String cpftitularcp) {
        this.cpftitularcp = cpftitularcp;
    }

    public String getContribindividualinss() {
        return contribindividualinss;
    }

    public void setContribindividualinss(String contribindividualinss) {
        this.contribindividualinss = contribindividualinss;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getPartclubeitt() {
        return partclubeitt;
    }

    public void setPartclubeitt(String partclubeitt) {
        this.partclubeitt = partclubeitt;
    }

    public LocalDate getDtfimvigclubeitt() {
        return dtfimvigclubeitt;
    }

    public void setDtfimvigclubeitt(LocalDate dtfimvigclubeitt) {
        this.dtfimvigclubeitt = dtfimvigclubeitt;
    }

    public String getChapaRm() {
        return chapaRm;
    }

    public void setChapaRm(String chapaRm) {
        this.chapaRm = chapaRm;
    }

    public String getCalculardsr() {
        return calculardsr;
    }

    public void setCalculardsr(String calculardsr) {
        this.calculardsr = calculardsr;
    }

    public Boolean getTipocontapagamento() {
        return tipocontapagamento;
    }

    public void setTipocontapagamento(Boolean tipocontapagamento) {
        this.tipocontapagamento = tipocontapagamento;
    }

    public String getPermiteprodsemdistribuicao() {
        return permiteprodsemdistribuicao;
    }

    public void setPermiteprodsemdistribuicao(String permiteprodsemdistribuicao) {
        this.permiteprodsemdistribuicao = permiteprodsemdistribuicao;
    }

    public String getCodusurpg() {
        return codusurpg;
    }

    public void setCodusurpg(String codusurpg) {
        this.codusurpg = codusurpg;
    }

}