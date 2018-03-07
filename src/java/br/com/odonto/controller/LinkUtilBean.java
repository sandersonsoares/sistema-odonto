package br.com.odonto.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class LinkUtilBean {

    private static final String FACES_REDIRECT = "?faces-redirect=true";

    public String login() {
        return "/index.xhtml" + FACES_REDIRECT;
    }

    public String home() {
        return "/privado/index.xhtml" + FACES_REDIRECT;
    }

    public String paginaPrincipal() {
        return "/privado/principal.xhtml" + FACES_REDIRECT;
    }

    /*
    Usuários
     */
    public String novoUsuario() {
        return "/privado/usuario/formulario.xhtml" + FACES_REDIRECT;
    }

    public String listaUsuarios() {
        return "/privado/usuario/lista.xhtml" + FACES_REDIRECT;
    }

    public String editarUsuario(Long id) {
        return "/privado/usuario/formulario.xhtml" + FACES_REDIRECT + "&id=" + id;
    }

    /*
    Clientes
     */
    public String novoCliente() {
        return "/privado/cliente/formulario.xhtml" + FACES_REDIRECT;
    }

    public String editarCliente(Long id) {
        return "/privado/cliente/formulario.xhtml" + FACES_REDIRECT + "&id=" + id;
    }

    public String listaClientes() {
        return "/privado/cliente/lista.xhtml" + FACES_REDIRECT;
    }

    /*
    Grupos
     */
    public String novoGrupo() {
        return "/privado/grupos/formulario.xhtml" + FACES_REDIRECT;
    }

    public String listaGrupos() {
        return "/privado/grupos/lista.xhtml" + FACES_REDIRECT;
    }

    public String editarGrupo(Long id) {
        return "/privado/grupos/formulario.xhtml" + FACES_REDIRECT + "&id=" + id;
    }

}
