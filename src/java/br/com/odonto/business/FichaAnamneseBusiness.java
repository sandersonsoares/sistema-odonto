package br.com.odonto.business;

import br.com.odonto.exception.DAOException;
import br.com.odonto.factory.DAOFactory;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.FichaAnamnese;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Fernanda
 */
public class FichaAnamneseBusiness implements Serializable {
    
    private DaoGeneric<FichaAnamnese> fichaAnamneseDAO;
    
    public FichaAnamneseBusiness() {
        fichaAnamneseDAO = DAOFactory.createClienteDAO();
    }
    
    public synchronized FichaAnamnese salvar(FichaAnamnese fichaAnamnese) throws DAOException {
        if (fichaAnamnese.getId() != null) {
            return fichaAnamneseDAO.update(fichaAnamnese);
        } else {
            return fichaAnamneseDAO.save(fichaAnamnese);
        }
    }
    
    public List<FichaAnamnese> listar() throws DAOException {
        return fichaAnamneseDAO.getAll();
    }

    public FichaAnamnese buscar(Long id) throws DAOException {
        return (FichaAnamnese) fichaAnamneseDAO.getById(id);
    }

    public synchronized FichaAnamnese remover(FichaAnamnese fichaAnamnese) throws DAOException {
        return fichaAnamneseDAO.remove(fichaAnamnese);
    }
}
