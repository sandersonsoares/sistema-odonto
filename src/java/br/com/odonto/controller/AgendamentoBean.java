package br.com.odonto.controller;

import br.com.odonto.exception.DAOException;
import br.com.odonto.facade.Facade;
import br.com.odonto.model.Agendamento;
import br.com.odonto.model.Cliente;
import br.com.odonto.model.Dentista;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
public class AgendamentoBean extends DefaultBean {

    private Facade fachada;

    private Agendamento agendamento;
    private List<Agendamento> agendamentos;
    private List<Cliente> clientes;
    private List<Dentista> dentistas;
    private String busca;

    public AgendamentoBean() {
        super();
        this.fachada = new Facade();
    }

    @PostConstruct
    private void init() {
        String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");

        try {
            agendamentos = this.fachada.listarAgendamentos();
            clientes = this.fachada.listarClientes();
            dentistas = this.fachada.listarDentistas();
            if (id != null) {
                this.agendamento = this.fachada.buscarAgendamento(Long.parseLong(id));
            } else {
                this.agendamento = new Agendamento();
                this.agendamento.setProtocolo("AG-" + this.agendamentos.size() + Calendar.getInstance().getTimeInMillis());
            }

        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public void filtraAgendamentos() {
        try {
            this.agendamentos = fachada.listarAgendamentos();

        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }

        Iterator<Agendamento> intAgendamento = this.agendamentos.iterator();
        List<Agendamento> tempList = new ArrayList<>();

        while (intAgendamento.hasNext()) {
            Agendamento agendamento = intAgendamento.next();

            if (agendamento.getOrtodontia().contains(busca)
                    || agendamento.getPaciente().getNome().contains(busca)) {
                tempList.add(agendamento);
            }
        }

        this.agendamentos = tempList;
    }

    public void preparaAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
        abrirDialog("apagar-dlg");
    }

    public void salvarAgendamento() {
        try {
            this.agendamento = this.fachada.cadastrarAgendamento(this.agendamento);
            abrirDialog("sucess-dlg");
        } catch (DAOException ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public void removerAgendamento() {
        try {
            this.agendamento = this.fachada.removerAgendamento(this.agendamento);
            abrirDialog("sucess-dlg");
        } catch (DAOException ex) {
            imprimirErro(ex.getMessage());
            fecharDialog("apagar-dlg");
        }
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Dentista> getDentistas() {
        return dentistas;
    }

    public void setDentistas(List<Dentista> dentistas) {
        this.dentistas = dentistas;
    }

}
