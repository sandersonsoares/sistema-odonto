package br.com.odonto.business;

import br.com.odonto.exception.DAOException;
import br.com.odonto.factory.DAOFactory;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Convenio;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Sanderson
 */
public class ConvenioBusiness implements Serializable {

    private DaoGeneric<Convenio> convenioDao;

    public ConvenioBusiness() {
        convenioDao = DAOFactory.createConvenioDAO();
    }

    public synchronized Convenio salvar(Convenio convenio) throws DAOException {
        if (convenio.getId() != null) {
            return convenioDao.update(convenio);
        } else {
            return convenioDao.save(convenio);
        }
    }

    public List<Convenio> listar() throws DAOException {
        return convenioDao.getAll();
    }

    public Convenio buscar(Long id) throws DAOException {
        return (Convenio) convenioDao.getById(id);
    }

    public synchronized Convenio remover(Convenio convenio) throws DAOException {
        return convenioDao.remove(convenio);
    }

}
