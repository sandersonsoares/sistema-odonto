package br.com.odonto.business;

import br.com.odonto.exception.DAOException;
import br.com.odonto.factory.DAOFactory;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Pagamento;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Sanderson
 */
public class PagamentoBusiness implements Serializable {

    private DaoGeneric<Pagamento> pagamentoDao;

    public PagamentoBusiness() {
        pagamentoDao = DAOFactory.createPagamentoDAO();
    }

    public synchronized Pagamento salvar(Pagamento pagamento) throws DAOException {
        if (pagamento.getId() != null) {
            return pagamentoDao.update(pagamento);
        } else {
            return pagamentoDao.save(pagamento);
        }
    }

    public List<Pagamento> listar() throws DAOException {
        return pagamentoDao.getAll();
    }

    public Pagamento buscar(Long id) throws DAOException {
        return (Pagamento) pagamentoDao.getById(id);
    }

    public synchronized Pagamento remover(Pagamento pagamento) throws DAOException {
        return pagamentoDao.remove(pagamento);
    }

}
