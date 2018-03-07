package br.com.odonto.interfaces;

import br.com.odonto.exception.DAOException;
import br.com.odonto.model.Usuario;

/**
 *
 * @author Sanderson
 */
public interface IUsuarioDAO extends DaoGeneric<Usuario> {

    public Usuario buscarLogin(String login) throws DAOException;
}
