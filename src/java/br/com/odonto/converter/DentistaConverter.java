package br.com.odonto.converter;

import br.com.odonto.factory.DAOFactory;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Dentista;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Dentista.class, value = "DentistaConverter")
public class DentistaConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
        try {
            DaoGeneric dao = DAOFactory.createDentistaDAO();
            return dao.getById(Long.parseLong(arg2));
        } catch (Exception e) {
            throw new ConverterException("Objeto não encontrado!");
        }
    }

    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
        if (arg2 != null) {
            Dentista dentista = (Dentista) arg2;
            return String.valueOf(dentista.getId());
        }
        return "";
    }
}
