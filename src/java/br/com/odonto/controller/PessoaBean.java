package br.com.odonto.controller;

import br.com.odonto.enums.Estados;
import br.com.odonto.enums.Sexo;
import br.com.odonto.exception.DAOException;
import br.com.odonto.facade.Facade;
import br.com.odonto.model.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PessoaBean extends DefaultBean {

    private Facade fachada;
    
    private Cliente cliente;
    private List<Cliente> clientes;
    private Sexo sexo;
    private String busca;

    public PessoaBean() {
        super();
        this.fachada = new Facade();
    }

    @PostConstruct
    private void init() {
        String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");

        try {
            if (id != null) {
                this.cliente = this.fachada.buscarCliente(Long.parseLong(id));
            } else {
                this.cliente = new Cliente();
            }
            clientes = this.fachada.listarClientes();
        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public Estados[] getListarEstados() {
        return Estados.values();
    }

    public void filtraClientes() {
        try {
            this.clientes = fachada.listarClientes();

        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }

        Iterator<Cliente> intCliente = this.clientes.iterator();
        List<Cliente> tempList = new ArrayList<>();

        while (intCliente.hasNext()) {
            Cliente cliente = intCliente.next();

            if (cliente.getNome().contains(busca)
                    || cliente.getCpf().contains(busca)) {
                tempList.add(cliente);
            }
        }

        this.clientes = tempList;
    }
    
    public void preparaCliente(Cliente cliente){
        this.cliente = cliente;
        abrirDialog("apagar-dlg");
    }

    public void salvarCliente() {
        try {
            this.cliente = this.fachada.cadastrarCliente(this.cliente);
            abrirDialog("sucess-dlg");
        } catch (DAOException ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public void removerCliente() {
        try {
            this.cliente = this.fachada.removerCliente(this.cliente);
            abrirDialog("sucess-dlg");
        } catch (DAOException ex) {
            imprimirErro(ex.getMessage());
            fecharDialog("apagar-dlg");
        }
    }

    public Sexo[] getListarSexos() {
        return Sexo.values();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

}
