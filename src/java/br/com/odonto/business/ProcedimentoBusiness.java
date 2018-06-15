package br.com.odonto.business;

import br.com.odonto.exception.DAOException;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Procedimento;
import br.com.odonto.factory.DAOFactory;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Sandersoon
 */
public class ProcedimentoBusiness implements Serializable {

    private DaoGeneric<Procedimento> procedimentoDao;

    public ProcedimentoBusiness() {
        procedimentoDao = DAOFactory.createProcedimentoDAO();
    }

    public synchronized Procedimento salvar(Procedimento procedimento) throws DAOException {
        if (procedimento.getId() != null) {
            return procedimentoDao.update(procedimento);
        } else {
            return procedimentoDao.save(procedimento);
        }
    }

    public List<Procedimento> listar() throws DAOException {
        return procedimentoDao.getAll();
    }

    public Procedimento buscar(Long id) throws DAOException {
        return (Procedimento) procedimentoDao.getById(id);
    }

    public synchronized Procedimento remover(Procedimento procedimento) throws DAOException {
        return procedimentoDao.remove(procedimento);
    }
}
