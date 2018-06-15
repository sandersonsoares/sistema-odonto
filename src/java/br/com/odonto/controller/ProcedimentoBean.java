package br.com.odonto.controller;

import br.com.odonto.exception.DAOException;
import br.com.odonto.facade.Facade;
import br.com.odonto.model.Procedimento;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Sanderson
 */
@ManagedBean
@ViewScoped
public class ProcedimentoBean extends DefaultBean {

    private Facade fachada;

    private Procedimento procedimento;
    private List<Procedimento> procedimentos;
    private String busca;

    public ProcedimentoBean() {
        super();
        this.fachada = new Facade();
    }

    @PostConstruct
    private void init() {
        String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");

        try {
            if (id != null) {
                this.procedimento = this.fachada.buscarProcedimento(Long.parseLong(id));
            } else {
                this.procedimento = new Procedimento();
            }
            procedimentos = this.fachada.listarProcedimentos();
        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public void filtraProcedimentos() {
        try {
            this.procedimentos = fachada.listarProcedimentos();

        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }

        Iterator<Procedimento> intProcedimento = this.procedimentos.iterator();
        List<Procedimento> tempList = new ArrayList<>();

        while (intProcedimento.hasNext()) {
            Procedimento procedimento = intProcedimento.next();

            if (procedimento.getNome().contains(busca)
                    || procedimento.getDescricao().contains(busca)) {
                tempList.add(procedimento);
            }
        }

        this.procedimentos = tempList;
    }

    public void preparaProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
        abrirDialog("apagar-dlg");
    }

    public void salvarProcedimento() {
        try {
            this.procedimento = this.fachada.cadastrarProcedimento(this.procedimento);
            abrirDialog("sucess-dlg");
        } catch (DAOException ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public void removerProcedimento() {
        try {
            this.procedimento = this.fachada.removerProcedimento(this.procedimento);
            abrirDialog("sucess-dlg");
        } catch (DAOException ex) {
            imprimirErro(ex.getMessage());
            fecharDialog("apagar-dlg");
        }
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public List<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(List<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

}
