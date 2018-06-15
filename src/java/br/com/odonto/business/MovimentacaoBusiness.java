package br.com.odonto.business;

import br.com.odonto.exception.DAOException;
import br.com.odonto.factory.DAOFactory;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Movimentacao;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Sanderson
 */
public class MovimentacaoBusiness implements Serializable {

    private DaoGeneric<Movimentacao> movimentacaoDao;

    public MovimentacaoBusiness() {
        movimentacaoDao = DAOFactory.createMovimentacaoDAO();
    }

    public synchronized Movimentacao salvar(Movimentacao movimentacao) throws DAOException {
        if (movimentacao.getId() != null) {
            return movimentacaoDao.update(movimentacao);
        } else {
            return movimentacaoDao.save(movimentacao);
        }
    }

    public List<Movimentacao> listar() throws DAOException {
        return movimentacaoDao.getAll();
    }

    public Movimentacao buscar(Long id) throws DAOException {
        return (Movimentacao) movimentacaoDao.getById(id);
    }

    public synchronized Movimentacao remover(Movimentacao movimentacao) throws DAOException {
        return movimentacaoDao.remove(movimentacao);
    }

}
