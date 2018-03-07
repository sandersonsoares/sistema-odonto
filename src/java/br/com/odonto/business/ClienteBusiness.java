package br.com.odonto.business;

import br.com.odonto.exception.DAOException;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Cliente;
import br.com.odonto.factory.DAOFactory;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Sandersoon
 */
public class ClienteBusiness implements Serializable {

    private DaoGeneric<Cliente> clienteDao;

    public ClienteBusiness() {
        clienteDao = DAOFactory.createClienteDAO();
    }

    public synchronized Cliente salvar(Cliente cliente) throws DAOException {
        if (cliente.getId() != null) {
            return clienteDao.update(cliente);
        } else {
            return clienteDao.save(cliente);
        }
    }

    public List<Cliente> listar() throws DAOException {
        return clienteDao.getAll();
    }

    public Cliente buscar(Long id) throws DAOException {
        return (Cliente) clienteDao.getById(id);
    }

    public synchronized Cliente remover(Cliente cliente) throws DAOException {
        return clienteDao.remove(cliente);
    }
}
