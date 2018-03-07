package br.com.odonto.business;

import br.com.odonto.exception.DAOException;
import br.com.odonto.factory.DAOFactory;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Grupo;
import java.util.List;

/**
 *
 * @author Sanderson
 */
public class GrupoBusiness {

    private DaoGeneric<Grupo> gruposDao;

    public GrupoBusiness() {
        this.gruposDao = DAOFactory.createGrupoDAO();
    }

    public synchronized Grupo salvar(Grupo grupo) throws DAOException {
        if (grupo.getId() != null) {
            return gruposDao.update(grupo);
        } else {
            return gruposDao.save(grupo);

        }
    }

    public Grupo remover(Grupo grupo) throws DAOException {
        return gruposDao.remove(grupo);
    }

    public List<Grupo> listar() throws DAOException {
        return gruposDao.getAll();
    }

    public Grupo buscarGrupo(Long id) throws DAOException {
        return gruposDao.getById(id);
    }
}
