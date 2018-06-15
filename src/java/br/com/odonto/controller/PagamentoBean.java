package br.com.odonto.controller;

import br.com.odonto.exception.DAOException;
import br.com.odonto.facade.Facade;
import br.com.odonto.model.Agendamento;
import br.com.odonto.model.Pagamento;
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
 * @author Fernanda
 */
@ManagedBean
@ViewScoped
public class PagamentoBean extends DefaultBean {

    private Facade fachada;
    private List<Pagamento> pagamentos;
    private List<Agendamento> agendamentos;
    private Pagamento pagamento;
    private Agendamento agendamento;
    private Double valorTotal;
    private String busca;

    @PostConstruct
    private void init() {
        String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");
        this.fachada = new Facade();

        try {
            if (id != null) {
                this.pagamento = this.fachada.buscarPagamento(Long.parseLong(id));
            }
            this.pagamentos = this.fachada.listarPagamentos();
            this.agendamentos = this.fachada.listarAgendamentos();

        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public void salvarPagamento() {
        try {
            this.pagamento = this.fachada.cadastrarPagamento(this.pagamento);
            abrirDialog("sucess-dlg");
        } catch (DAOException ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public void calcularValorTotal() {
        System.out.println(this.agendamento.getProtocolo());
        valorTotal = new Double(0);
        if (this.pagamento.getAgendamento().getProcedimentos().size() > 0) {
            for (Procedimento procedimento : this.pagamento.getAgendamento().getProcedimentos()) {
                valorTotal = valorTotal + procedimento.getValor();
            }
            this.pagamento.setValor(valorTotal);
        }
    }

    public void filtraPagamentos() {
        try {
            this.agendamentos = fachada.listarAgendamentos();

        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }

        Iterator<Pagamento> intPagamento = this.pagamentos.iterator();
        List<Pagamento> tempList = new ArrayList<>();

        while (intPagamento.hasNext()) {
            Pagamento pagamento = intPagamento.next();

            if (pagamento.getAgendamento().getPaciente().getNome().contains(busca) || pagamento.getDescricao().contains(busca)) {
                tempList.add(pagamento);
            }
        }

        this.pagamentos = tempList;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
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

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }
    
}
