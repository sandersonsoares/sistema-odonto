package br.com.odonto.controller;

import br.com.odonto.exception.DAOException;
import br.com.odonto.facade.Facade;
import br.com.odonto.model.Cliente;
import br.com.odonto.model.FichaAnamnese;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Fernanda
 */
@ManagedBean
@ViewScoped
public class FichaAnamneseBean extends DefaultBean {

    private Facade fachada;
    private FichaAnamnese fichaAnamnese;
    private Cliente cliente;

    @PostConstruct
    private void init() {
        String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");
        this.fachada = new Facade();
        this.fichaAnamnese = new FichaAnamnese();
        this.cliente = new Cliente();

        try {
            if (id != null) {
                this.cliente = this.fachada.buscarCliente(Long.parseLong(id));
                this.fichaAnamnese = this.cliente.getFichaAnamnese();
            }

        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public void salvarFichaAnamnese() {
        try {
            this.fichaAnamnese = this.fachada.cadastrarFichaAnamnese(this.fichaAnamnese);
            abrirDialog("sucess-dlg");
        } catch (DAOException ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public FichaAnamnese getFichaAnamnese() {
        return fichaAnamnese;
    }

    public void setFichaAnamnese(FichaAnamnese fichaAnamnese) {
        this.fichaAnamnese = fichaAnamnese;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
