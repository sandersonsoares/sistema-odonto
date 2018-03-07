package br.com.odonto.dao;

import br.com.odonto.exception.DAOException;
import br.com.odonto.interfaces.IUsuarioDAO;
import br.com.odonto.model.Usuario;
import br.com.odonto.utils.ExceptionsType;
import br.com.odonto.utils.PersistenceUtil;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UsuarioDAO extends DaoGenericImpl<Usuario> implements IUsuarioDAO, Serializable {

    public Usuario buscarLogin(String login) throws DAOException {
        EntityManager manager = PersistenceUtil.getEntityManager();
        List<Usuario> result;
        try {

            Query query = manager.createNativeQuery("select u.*, p.* "
                    + "from usuario u, pessoa p "
                    + "where u.id_pessoa = p.id "
                    + "AND (u.username = :username "
                    + "OR p.email = :email)", Usuario.class)
                    .setParameter("username", login)
                    .setParameter("email", login);

            result = query.getResultList();

            if (result.size() > 0) {
                return result.get(0);
            }

            return null;

        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException(ExceptionsType.getMessage(ExceptionsType.READ_ERROR), e);
        }
    }

}
