package br.com.odonto.business;

import br.com.odonto.exception.DAOException;
import br.com.odonto.factory.DAOFactory;
import br.com.odonto.interfaces.IUsuarioDAO;
import br.com.odonto.model.Usuario;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author sanderson
 */
public class UsuarioBusiness {

    private IUsuarioDAO usuarioDao;

    public UsuarioBusiness() {
        this.usuarioDao = DAOFactory.createUsuarioDAO();
    }

    public synchronized Usuario salvar(Usuario usuario) throws DAOException {
        if (usuario.getId() != null) {
            return usuarioDao.update(usuario);
        } else {
            return usuarioDao.save(usuario);
        }
    }

    public Usuario buscar(Long id) throws DAOException {
        return usuarioDao.getById(id);
    }

    public Usuario remover(Usuario usuario) throws DAOException {
        return usuarioDao.remove(usuario);
    }

    public List<Usuario> listar() throws DAOException {
        return usuarioDao.getAll();
    }

    public Usuario logarUsuario(String login) {
        try {
            return usuarioDao.buscarLogin(login);
        } catch (DAOException ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), null));
        }
        return null;
    }

}
