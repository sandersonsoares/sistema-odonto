/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.odonto.business;

import br.com.odonto.exception.DAOException;
import br.com.odonto.factory.DAOFactory;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Endereco;
import java.util.List;

/**
 *
 * @author Sanderson
 */
public class EnderecoBusiness {

    private DaoGeneric<Endereco> enderecoDao;

    public EnderecoBusiness() {
        enderecoDao = DAOFactory.createEnderecoDAO();
    }

    public synchronized Endereco salvar(Endereco endereco) throws DAOException {
        if (endereco.getId() != null) {
            return enderecoDao.update(endereco);
        } else {
            return enderecoDao.save(endereco);
        }
    }

    public List<Endereco> listar() throws DAOException {
        return enderecoDao.getAll();
    }

    public Endereco buscar(Long id) throws DAOException {
        return (Endereco) enderecoDao.getById(id);
    }

    public synchronized Endereco remover(Endereco endereco) throws DAOException {
        return enderecoDao.remove(endereco);
    }

}
