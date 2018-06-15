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
    Agendamentos
     */
    public String novoAgendamento() {
        return "/privado/agendamento/formulario.xhtml" + FACES_REDIRECT;
    }

    public String editarAgendamento(Long id) {
        return "/privado/agendamento/formulario.xhtml" + FACES_REDIRECT + "&id=" + id;
    }

    public String listaAgendamentos() {
        return "/privado/agendamento/lista.xhtml" + FACES_REDIRECT;
    }

    /*
    Procedimentos
     */
    public String novoProcedimento() {
        return "/privado/procedimento/formulario.xhtml" + FACES_REDIRECT;
    }

    public String editarProcedimento(Long id) {
        return "/privado/procedimento/formulario.xhtml" + FACES_REDIRECT + "&id=" + id;
    }

    public String listaProcedimentos() {
        return "/privado/procedimento/lista.xhtml" + FACES_REDIRECT;
    }

    /*
    Convenios
     */
    public String novoConvenio() {
        return "/privado/convenio/formulario.xhtml" + FACES_REDIRECT;
    }

    public String editarConvenio(Long id) {
        return "/privado/convenio/formulario.xhtml" + FACES_REDIRECT + "&id=" + id;
    }

    public String listaConvenios() {
        return "/privado/convenio/lista.xhtml" + FACES_REDIRECT;
    }

    /*
    Despesas
     */
    public String novaDespesa() {
        return "/privado/despesa/formulario.xhtml" + FACES_REDIRECT;
    }

    public String editarDespesa(Long id) {
        return "/privado/despesa/formulario.xhtml" + FACES_REDIRECT + "&id=" + id;
    }

    public String listaDespesas() {
        return "/privado/despesa/lista.xhtml" + FACES_REDIRECT;
    }

    /*
    Ficha Anamnese
     */
    public String novaFichaAnamnese() {
        return "/privado/fichaanamnese/formulario.xhtml" + FACES_REDIRECT;
    }

    public String editarFichaAnamnese(Long id) {
        return "/privado/fichaanamnese/formulario.xhtml" + FACES_REDIRECT + "&id=" + id;
    }

    public String listaFichasAnamnese() {
        return "/privado/fichaanamnese/lista.xhtml" + FACES_REDIRECT;
    }

    /*
    Pagamentos
     */
    public String novoPagamento() {
        return "/privado/pagamento/formulario.xhtml" + FACES_REDIRECT;
    }

    public String editarPagamento(Long id) {
        return "/privado/pagamento/formulario.xhtml" + FACES_REDIRECT + "&id=" + id;
    }

    public String listaPagamentos() {
        return "/privado/pagamento/lista.xhtml" + FACES_REDIRECT;
    }

    /*
    Dentistas
     */
    public String novoDentista() {
        return "/privado/dentista/formulario.xhtml" + FACES_REDIRECT;
    }

    public String editarDentista(Long id) {
        return "/privado/dentista/formulario.xhtml" + FACES_REDIRECT + "&id=" + id;
    }

    public String listaDentistas() {
        return "/privado/dentista/lista.xhtml" + FACES_REDIRECT;
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
