package br.com.odonto.facade;

import br.com.odonto.business.AgendamentoBusiness;
import br.com.odonto.business.GrupoBusiness;
import br.com.odonto.business.ClienteBusiness;
import br.com.odonto.business.DentistaBusiness;
import br.com.odonto.business.EstadoBusiness;
import br.com.odonto.business.FichaAnamneseBusiness;
import br.com.odonto.business.UsuarioBusiness;
import br.com.odonto.exception.DAOException;
import br.com.odonto.model.Agendamento;
import br.com.odonto.model.Cliente;
import br.com.odonto.model.Dentista;
import br.com.odonto.model.Estado;
import br.com.odonto.model.FichaAnamnese;
import br.com.odonto.model.Grupo;
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

    public Facade() {
        this.clienteBusiness = new ClienteBusiness();
        this.grupoBusiness = new GrupoBusiness();
        this.usuarioBusiness = new UsuarioBusiness();
        this.estadoBusiness = new EstadoBusiness();
        this.fichaAnamneseBusiness = new FichaAnamneseBusiness();
        this.dentistaBusiness = new DentistaBusiness();
        this.agendamentoBusiness = new AgendamentoBusiness();

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
    public FichaAnamnese cadastrarFichaAnamnese(FichaAnamnese fichaAnamnese) throws Exception {
        return fichaAnamneseBusiness.salvar(fichaAnamnese);
    }

    public FichaAnamnese removerFichaAnamnese(FichaAnamnese fichaAnamnese) throws Exception {
        return fichaAnamneseBusiness.remover(fichaAnamnese);
    }

    public FichaAnamnese buscarFichaAnamnese(Long id) throws Exception {
        return fichaAnamneseBusiness.buscar(id);
    }

    public List<FichaAnamnese> listarFichaAnamnese() throws Exception {
        return fichaAnamneseBusiness.listar();
    }

}
