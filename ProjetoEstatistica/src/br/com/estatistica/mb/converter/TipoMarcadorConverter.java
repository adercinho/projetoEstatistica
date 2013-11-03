package br.com.estatistica.mb.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.persistence.EntityManager;

import br.com.estatistica.dao.DAO;
import br.com.estatistica.dao.impl.DAOImpl;
import br.com.estatistica.entity.TipoMarcador;
import br.com.estatistica.util.JPAUtil;
  
@FacesConverter("tipoMarcadorConverter")
public class TipoMarcadorConverter implements Converter {  
  

	public Object getAsObject(FacesContext context, UIComponent component, String submittedValue) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		DAO<TipoMarcador, Integer> service = new DAOImpl<TipoMarcador, Integer>(TipoMarcador.class, em); 
		
        if (submittedValue == null || submittedValue.isEmpty()) {
            return null;
        }

        try {
            return service.searchByID(Integer.valueOf(submittedValue));
        } catch (NumberFormatException exception) {
            throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid player ID"));
        }
    }

    public String getAsString(FacesContext context, UIComponent component, Object modelValue) {
        if (modelValue == null) {
            return "";
        }
        
        System.out.println("Valor model Objet: "+modelValue);

        if (modelValue instanceof TipoMarcador) {
            return String.valueOf(((TipoMarcador) modelValue).getId());
        } else {
            throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid player instance"));
        }
    }
	
} 
