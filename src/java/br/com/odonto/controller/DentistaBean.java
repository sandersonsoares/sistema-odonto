package br.com.odonto.controller;

import br.com.odonto.enums.Sexo;
import br.com.odonto.exception.DAOException;
import br.com.odonto.facade.Facade;
import br.com.odonto.model.Cidade;
import br.com.odonto.model.Dentista;
import br.com.odonto.model.Estado;
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
public class DentistaBean extends DefaultBean {

    private Facade fachada;

    private Dentista dentista;
    private List<Dentista> dentistas;
    private Sexo sexo;
    private String busca;
    private List<Cidade> cidadesPorEstado;
    private List<Estado> estados;

    public DentistaBean() {
        super();
        this.fachada = new Facade();
    }

    @PostConstruct
    private void init() {
        String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");

        try {
            if (id != null) {
                this.dentista = this.fachada.buscarDentista(Long.parseLong(id));
                this.cidadesPorEstado = this.fachada.buscarEstado(this.dentista.getEndereco().getEstado().getId()).getCidades();
            } else {
                this.dentista = new Dentista();
            }
            dentistas = this.fachada.listarDentistas();
            estados = this.fachada.listarEstados();
        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public void filtraDentistas() {
        try {
            this.dentistas = fachada.listarDentistas();

        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }

        Iterator<Dentista> intDentista = this.dentistas.iterator();
        List<Dentista> tempList = new ArrayList<>();

        while (intDentista.hasNext()) {
            Dentista dentista = intDentista.next();

            if (dentista.getNome().contains(busca)
                    || dentista.getCpf().contains(busca)) {
                tempList.add(dentista);
            }
        }

        this.dentistas = tempList;
    }

    public void preparaDentista(Dentista dentista) {
        this.dentista = dentista;
        abrirDialog("apagar-dlg");
    }

    public void salvarDentista() {
        try {
            this.dentista = this.fachada.cadastrarDentista(this.dentista);
            abrirDialog("sucess-dlg");
        } catch (DAOException ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public void removerDentista() {
        try {
            this.dentista = this.fachada.removerDentista(this.dentista);
            abrirDialog("sucess-dlg");
        } catch (DAOException ex) {
            imprimirErro(ex.getMessage());
            fecharDialog("apagar-dlg");
        }
    }

    public void carregarCidades() {
        try {
            this.cidadesPorEstado = this.fachada.buscarEstado(this.dentista.getEndereco().getEstado().getId()).getCidades();
        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public Sexo[] getListarSexos() {
        return Sexo.values();
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public List<Dentista> getDentistas() {
        return dentistas;
    }

    public void setDentistas(List<Dentista> dentistas) {
        this.dentistas = dentistas;
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

    public List<Cidade> getCidadesPorEstado() {
        return cidadesPorEstado;
    }

    public void setCidadesPorEstado(List<Cidade> cidadesPorEstado) {
        this.cidadesPorEstado = cidadesPorEstado;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

}
