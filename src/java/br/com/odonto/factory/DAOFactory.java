package br.com.odonto.factory;

import br.com.odonto.dao.AgendamentoDAO;
import br.com.odonto.dao.CidadeDAO;
import br.com.odonto.dao.EnderecoDAO;
import br.com.odonto.dao.GrupoDAO;
import br.com.odonto.dao.ClienteDAO;
import br.com.odonto.dao.DentistaDAO;
import br.com.odonto.dao.EstadoDAO;
import br.com.odonto.dao.FichaAnamneseDAO;
import br.com.odonto.dao.PessoaDAO;
import br.com.odonto.dao.UsuarioDAO;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.interfaces.IUsuarioDAO;
import br.com.odonto.model.Agendamento;
import br.com.odonto.model.Dentista;

public class DAOFactory {

    public static DaoGeneric createEnderecoDAO() {
        return new EnderecoDAO();
    }

    public static DaoGeneric createClienteDAO() {
        return new ClienteDAO();
    }

    public static DaoGeneric createPessoaDAO() {
        return new PessoaDAO();
    }

    public static IUsuarioDAO createUsuarioDAO() {
        return new UsuarioDAO();
    }

    public static DaoGeneric createGrupoDAO() {
        return new GrupoDAO();
    }

    public static DaoGeneric createEstadoDAO() {
        return new EstadoDAO();
    }

    public static DaoGeneric createCidadeDAO() {
        return new CidadeDAO();
    }

    public static DaoGeneric createFichaAnamneseDAO() {
        return new FichaAnamneseDAO();
    }

    public static DaoGeneric<Dentista> createDentistaDAO() {
        return new DentistaDAO();
    }

    public static DaoGeneric<Agendamento> createAgendamentoDAO() {
        return new AgendamentoDAO();
    }

}
