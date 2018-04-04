package br.com.odonto.business;

import br.com.odonto.exception.DAOException;
import br.com.odonto.factory.DAOFactory;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Estado;
import java.util.List;

/**
 *
 * @author Sanderson
 */
public class EstadoBusiness {

    private DaoGeneric<Estado> estadoDao;

    public EstadoBusiness() {
        estadoDao = DAOFactory.createEstadoDAO();
    }

    public synchronized Estado salvar(Estado estado) throws DAOException {
        if (estado.getId() != null) {
            return estadoDao.update(estado);
        } else {
            return estadoDao.save(estado);
        }
    }

    public List<Estado> listar() throws DAOException {
        return estadoDao.getAll();
    }

    public Estado buscar(Long id) throws DAOException {
        return (Estado) estadoDao.getById(id);
    }

    public synchronized Estado remover(Estado estado) throws DAOException {
        return estadoDao.remove(estado);
    }

}
