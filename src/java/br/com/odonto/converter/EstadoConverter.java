package br.com.odonto.converter;

import br.com.odonto.factory.DAOFactory;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Estado;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Estado.class, value = "EstadoConverter")
public class EstadoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
        try {
            DaoGeneric dao = DAOFactory.createEstadoDAO();
            return dao.getById(Long.parseLong(arg2));
        } catch (Exception e) {
            throw new ConverterException("Objeto não encontrado!");
        }
    }

    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
        if (arg2 != null) {
            Estado estado = (Estado) arg2;
            return String.valueOf(estado.getId());
        }
        return "";
    }
}
