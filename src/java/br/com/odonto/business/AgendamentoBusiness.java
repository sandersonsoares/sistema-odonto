package br.com.odonto.business;

import br.com.odonto.exception.DAOException;
import br.com.odonto.factory.DAOFactory;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Agendamento;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Sanderson
 */
public class AgendamentoBusiness implements Serializable {

    private DaoGeneric<Agendamento> agendamentoDao;

    public AgendamentoBusiness() {
        agendamentoDao = DAOFactory.createAgendamentoDAO();
    }

    public synchronized Agendamento salvar(Agendamento agendamento) throws DAOException {
        if (agendamento.getId() != null) {
            return agendamentoDao.update(agendamento);
        } else {
            return agendamentoDao.save(agendamento);
        }
    }

    public List<Agendamento> listar() throws DAOException {
        return agendamentoDao.getAll();
    }

    public Agendamento buscar(Long id) throws DAOException {
        return (Agendamento) agendamentoDao.getById(id);
    }

    public synchronized Agendamento remover(Agendamento agendamento) throws DAOException {
        return agendamentoDao.remove(agendamento);
    }

}
