package br.com.odonto.controller;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

@ManagedBean
public class DefaultBean implements Serializable {

    protected LinkUtilBean linkBean;

    public DefaultBean() {
        linkBean = new LinkUtilBean();
    }

    protected void imprimirMensagem(String mensagem) {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, null));
    }

    protected void imprimirErro(String mensagem) {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, null));
    }

    protected void abrirDialog(String dialog) {
        RequestContext request = RequestContext.getCurrentInstance();
        request.execute("PF('" + dialog + "').show()");
    }

    protected void fecharDialog(String dialog) {
        RequestContext request = RequestContext.getCurrentInstance();
        request.execute("PF('" + dialog + "').hide()");
    }
    
    protected void update(String idComponente) {
        RequestContext request = RequestContext.getCurrentInstance();
        request.update(idComponente);
    }

}
