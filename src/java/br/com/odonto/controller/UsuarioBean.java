package br.com.odonto.controller;

import br.com.odonto.enums.Estados;
import br.com.odonto.enums.Sexo;
import br.com.odonto.exception.DAOException;
import br.com.odonto.facade.Facade;
import br.com.odonto.model.Cidade;
import br.com.odonto.model.Estado;
import br.com.odonto.model.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class UsuarioBean extends DefaultBean implements Serializable {
    
    private Facade fachada;

    private Usuario usuario;
    private List<Usuario> usuarios;
    private String busca;
     private List<Cidade> cidadesPorEstado;
    private List<Estado> estados;

    public UsuarioBean() {
        super();
        this.fachada = new Facade();
    }

    @PostConstruct
    private void init() {
        String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");

        try {
            if (id != null) {
                this.usuario = fachada.buscarUsuario(Long.parseLong(id));
            } else {
                this.usuario = new Usuario();
                this.cidadesPorEstado = this.fachada.buscarEstado(this.usuario.getEndereco().getEstado().getId()).getCidades();
            }
            this.usuarios = fachada.listarUsuarios();
        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public Sexo[] getListarSexos() {
        return Sexo.values();
    }

    public Estados[] getListarEstados() {
        return Estados.values();
    }
    
    public void carregarCidades() {
        try {
            this.cidadesPorEstado = this.fachada.buscarEstado(this.usuario.getEndereco().getEstado().getId()).getCidades();
        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }
    }

    public void salvar() {
        try {
            this.usuario = this.fachada.cadastrarUsuario(this.usuario);
            abrirDialog("sucess-dlg");
        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }
    }
    
    public void preparaUsuario(Usuario usuario){
        this.usuario = usuario;
        abrirDialog("apagar-dlg");
    }
    
    public void removerUsuario() {
        try {
            this.usuario = this.fachada.removerUsuario(this.usuario);
            abrirDialog("sucess-dlg");
        } catch (DAOException ex) {
            imprimirErro(ex.getMessage());
            fecharDialog("apagar-dlg");
        }
    }

    public void filtrar() {
        try {
            usuarios = fachada.listarUsuarios();
        } catch (Exception ex) {
            imprimirErro(ex.getMessage());
        }

        Iterator<Usuario> intUsuario = this.usuarios.iterator();
        List<Usuario> tempList = new ArrayList<Usuario>();

        while (intUsuario.hasNext()) {
            Usuario user = intUsuario.next();

            if (user.getNome().contains(busca)
                    || user.getUsername().contains(busca)
                    || user.getCpf().contains(busca)
                    || user.getEmail().contains(busca)) {
                tempList.add(user);
            }
        }
        
        this.usuarios = tempList;
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
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

}
