package br.com.odonto.facade;

import br.com.odonto.business.ProcedimentoBusiness;
import br.com.odonto.business.AgendamentoBusiness;
import br.com.odonto.business.GrupoBusiness;
import br.com.odonto.business.ClienteBusiness;
import br.com.odonto.business.ConvenioBusiness;
import br.com.odonto.business.DentistaBusiness;
import br.com.odonto.business.MovimentacaoBusiness;
import br.com.odonto.business.EstadoBusiness;
import br.com.odonto.business.FichaAnamneseBusiness;
import br.com.odonto.business.PagamentoBusiness;
import br.com.odonto.business.UsuarioBusiness;
import br.com.odonto.exception.DAOException;
import br.com.odonto.model.Agendamento;
import br.com.odonto.model.Cliente;
import br.com.odonto.model.Convenio;
import br.com.odonto.model.Dentista;
import br.com.odonto.model.Movimentacao;
import br.com.odonto.model.Estado;
import br.com.odonto.model.FichaAnamnese;
import br.com.odonto.model.Grupo;
import br.com.odonto.model.Pagamento;
import br.com.odonto.model.Procedimento;
import br.com.odonto.model.Usuario;
import java.io.Serializable;
import java.util.List;

public class Facade implements Serializable {

    private ClienteBusiness clienteBusiness;
    private GrupoBusiness grupoBusiness;
    private UsuarioBusiness usuarioBusiness;
    private EstadoBusiness estadoBusiness;
    private FichaAnamneseBusiness fichaAnamneseBusiness;
    private DentistaBusiness dentistaBusiness;
    private AgendamentoBusiness agendamentoBusiness;
    private ProcedimentoBusiness procedimentoBusiness;
    private ConvenioBusiness convenioBusiness;
    private PagamentoBusiness pagamentoBusiness;
    private MovimentacaoBusiness movimentacaoBusiness;

    public Facade() {
        this.clienteBusiness = new ClienteBusiness();
        this.grupoBusiness = new GrupoBusiness();
        this.usuarioBusiness = new UsuarioBusiness();
        this.estadoBusiness = new EstadoBusiness();
        this.agendamentoBusiness = new AgendamentoBusiness();
        this.fichaAnamneseBusiness = new FichaAnamneseBusiness();
        this.dentistaBusiness = new DentistaBusiness();
        this.convenioBusiness = new ConvenioBusiness();
        this.pagamentoBusiness = new PagamentoBusiness();
        this.movimentacaoBusiness = new MovimentacaoBusiness();
        this.procedimentoBusiness = new ProcedimentoBusiness();

    }

    // Cliente
    public Cliente cadastrarCliente(Cliente cliente) throws DAOException {
        return clienteBusiness.salvar(cliente);
    }

    public Cliente removerCliente(Cliente cliente) throws DAOException {
        return clienteBusiness.remover(cliente);
    }

    public Cliente buscarCliente(Long id) throws DAOException {
        return clienteBusiness.buscar(id);
    }

    public List<Cliente> listarClientes() throws DAOException {
        return clienteBusiness.listar();
    }

    // Procedimento
    public Procedimento cadastrarProcedimento(Procedimento procedimento) throws DAOException {
        return procedimentoBusiness.salvar(procedimento);
    }

    public Procedimento removerProcedimento(Procedimento procedimento) throws DAOException {
        return procedimentoBusiness.remover(procedimento);
    }

    public Procedimento buscarProcedimento(Long id) throws DAOException {
        return procedimentoBusiness.buscar(id);
    }

    public List<Procedimento> listarProcedimentos() throws DAOException {
        return procedimentoBusiness.listar();
    }

    // Pagamento
    public Pagamento cadastrarPagamento(Pagamento pagamento) throws DAOException {
        return pagamentoBusiness.salvar(pagamento);
    }

    public Pagamento removerPagamento(Pagamento pagamento) throws DAOException {
        return pagamentoBusiness.remover(pagamento);
    }

    public Pagamento buscarPagamento(Long id) throws DAOException {
        return pagamentoBusiness.buscar(id);
    }

    public List<Pagamento> listarPagamentos() throws DAOException {
        return pagamentoBusiness.listar();
    }

    // Movimentacao
    public Movimentacao cadastrarMovimentacao(Movimentacao movimentacao) throws DAOException {
        return movimentacaoBusiness.salvar(movimentacao);
    }

    public Movimentacao removerMovimentacao(Movimentacao movimentacao) throws DAOException {
        return movimentacaoBusiness.remover(movimentacao);
    }

    public Movimentacao buscarMovimentacao(Long id) throws DAOException {
        return movimentacaoBusiness.buscar(id);
    }

    public List<Movimentacao> listarMovimentacaos() throws DAOException {
        return movimentacaoBusiness.listar();
    }

    // Convenio
    public Convenio cadastrarConvenio(Convenio procedimento) throws DAOException {
        return convenioBusiness.salvar(procedimento);
    }

    public Convenio removerConvenio(Convenio procedimento) throws DAOException {
        return convenioBusiness.remover(procedimento);
    }

    public Convenio buscarConvenio(Long id) throws DAOException {
        return convenioBusiness.buscar(id);
    }

    public List<Convenio> listarConvenios() throws DAOException {
        return convenioBusiness.listar();
    }

    // Dentista
    public Dentista cadastrarDentista(Dentista dentista) throws DAOException {
        return dentistaBusiness.salvar(dentista);
    }

    public Dentista removerDentista(Dentista dentista) throws DAOException {
        return dentistaBusiness.remover(dentista);
    }

    public Dentista buscarDentista(Long id) throws DAOException {
        return dentistaBusiness.buscar(id);
    }

    public List<Dentista> listarDentistas() throws DAOException {
        return dentistaBusiness.listar();
    }

    // Agendamento
    public Agendamento cadastrarAgendamento(Agendamento agendamento) throws DAOException {
        return agendamentoBusiness.salvar(agendamento);
    }

    public Agendamento removerAgendamento(Agendamento agendamento) throws DAOException {
        return agendamentoBusiness.remover(agendamento);
    }

    public Agendamento buscarAgendamento(Long id) throws DAOException {
        return agendamentoBusiness.buscar(id);
    }

    public List<Agendamento> listarAgendamentos() throws DAOException {
        return agendamentoBusiness.listar();
    }

    // Usuario
    public Usuario logarUsuario(String login) {
        return usuarioBusiness.logarUsuario(login);
    }

    public Usuario cadastrarUsuario(Usuario usuario) throws Exception {
        return usuarioBusiness.salvar(usuario);
    }

    public Usuario atualizarUsuario(Usuario usuario) throws Exception {
        return usuarioBusiness.salvar(usuario);
    }

    public Usuario removerUsuario(Usuario usuario) throws DAOException {
        return usuarioBusiness.remover(usuario);
    }

    public Usuario buscarUsuario(Long id) throws DAOException {
        return usuarioBusiness.buscar(id);
    }

    public List<Usuario> listarUsuarios() throws Exception {
        return usuarioBusiness.listar();
    }

    // Grupos de Usuario
    public Grupo cadastrarGrupo(Grupo grupo) throws Exception {
        return grupoBusiness.salvar(grupo);
    }

    public Grupo removerGrupo(Grupo grupo) throws Exception {
        return grupoBusiness.remover(grupo);
    }

    public Grupo buscarGrupo(Long id) throws Exception {
        return grupoBusiness.buscarGrupo(id);
    }

    public List<Grupo> listarGrupos() throws Exception {
        return grupoBusiness.listar();
    }

    // Estados
    public Estado cadastrarEstado(Estado estado) throws Exception {
        return estadoBusiness.salvar(estado);
    }

    public Estado removerEstado(Estado estado) throws Exception {
        return estadoBusiness.remover(estado);
    }

    public Estado buscarEstado(Long id) throws Exception {
        return estadoBusiness.buscar(id);
    }

    public List<Estado> listarEstados() throws Exception {
        return estadoBusiness.listar();
    }

    // Ficha de Anamnese
    public FichaAnamnese cadastrarFichaAnamnese(FichaAnamnese fichaAnamnese) throws DAOException {
        return fichaAnamneseBusiness.salvar(fichaAnamnese);
    }

    public FichaAnamnese removerFichaAnamnese(FichaAnamnese fichaAnamnese) throws DAOException {
        return fichaAnamneseBusiness.remover(fichaAnamnese);
    }

    public FichaAnamnese buscarFichaAnamnese(Long id) throws DAOException {
        return fichaAnamneseBusiness.buscar(id);
    }

    public List<FichaAnamnese> listarFichaAnamnese() throws DAOException {
        return fichaAnamneseBusiness.listar();
    }

}
