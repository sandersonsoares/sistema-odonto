package br.com.odonto.controller;

import br.com.odonto.enums.Motivo;
import br.com.odonto.enums.Situacao;
import br.com.odonto.enums.TipoAgendamento;
import br.com.odonto.exception.DAOException;
import br.com.odonto.facade.Facade;
import br.com.odonto.model.Agendamento;
import br.com.odonto.model.Cliente;
import br.com.odonto.model.Dentista;
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
public class AgendamentoBean extends DefaultBean {

    private Facade fachada = new Facade();

    private Agendamento agendamento;
    private List<Agendamento> agendamentos;
    private List<Cliente> clientes;
    private List<Dentista> dentistas;
    private List<Procedimento> procedimentos;
    private String busca;

    private Procedimento procedimentoSelecionado;
    private Double valorTotal;

    @PostConstruct
    private void init() {
        String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");
        this.agendamento = new Agendamento();
        try {
            this.agendamentos = this.fachada.listarAgendamentos();
            this.clientes = this.fachada.listarClientes();
            this.dentistas = this.fachada.listarDentistas();
            this.procedimentos = this.fachada.listarProcedimentos();
            if (id != null) {
                this.agendamento = this.fachada.buscarAgendamento(Long.parseLong(id));
                calcularValorTotal();
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

            if (agendamento.getDentista().getNome().contains(busca) || agendamento.getProtocolo().contains(busca)
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

    public void adicionarProcedimento() {
        System.out.println(this.procedimentoSelecionado.getNome());
        this.agendamento.getProcedimentos().add(this.procedimentoSelecionado);
        calcularValorTotal();
    }

    public void removerProcedimento(Procedimento procedimento) {
        this.agendamento.getProcedimentos().remove(procedimento);
        calcularValorTotal();
    }

    public void calcularValorTotal() {
        valorTotal = new Double(0);
        if (agendamento.getProcedimentos().size() > 0) {
            for (Procedimento procedimento : agendamento.getProcedimentos()) {
                valorTotal = valorTotal + procedimento.getValor();
            }
        }
    }

    public TipoAgendamento[] getListarTipoAgendamentos() {
        return TipoAgendamento.values();
    }

    public Situacao[] getListarSituacao() {
        return Situacao.values();
    }

    public Motivo[] getListarMotivos() {
        return Motivo.values();
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

    public Procedimento getProcedimentoSelecionado() {
        return procedimentoSelecionado;
    }

    public void setProcedimentoSelecionado(Procedimento procedimentoSelecionado) {
        this.procedimentoSelecionado = procedimentoSelecionado;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
