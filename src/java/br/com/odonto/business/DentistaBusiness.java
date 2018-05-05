package br.com.odonto.business;

import br.com.odonto.exception.DAOException;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Dentista;
import br.com.odonto.factory.DAOFactory;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Sandersoon
 */
public class DentistaBusiness implements Serializable {

    private DaoGeneric<Dentista> dentistaDao;

    public DentistaBusiness() {
        dentistaDao = DAOFactory.createDentistaDAO();
    }

    public synchronized Dentista salvar(Dentista dentista) throws DAOException {
        if (dentista.getId() != null) {
            return dentistaDao.update(dentista);
        } else {
            return dentistaDao.save(dentista);
        }
    }

    public List<Dentista> listar() throws DAOException {
        return dentistaDao.getAll();
    }

    public Dentista buscar(Long id) throws DAOException {
        return (Dentista) dentistaDao.getById(id);
    }

    public synchronized Dentista remover(Dentista dentista) throws DAOException {
        return dentistaDao.remove(dentista);
    }
}
