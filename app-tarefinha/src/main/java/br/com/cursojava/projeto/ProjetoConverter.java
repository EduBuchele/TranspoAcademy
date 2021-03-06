package br.com.cursojava.projeto;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.cursojava.utils.CrudRepository;

@FacesConverter(value="projetoConverter")
public class ProjetoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent uiComponent, String value) {
		CrudRepository<Projeto> repositorio = new ProjetoRepositorio(Projeto.class);
		Projeto projeto = null;
		try {
			projeto = repositorio.buscarPorId(Integer.parseInt(value));
		}catch(NumberFormatException ex) {}
		return projeto;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent uiComponent, Object object) {
		if(object.getClass() == Projeto.class) {
			Projeto projeto = (Projeto)object;
			return projeto.getId() != null ? projeto.getId().toString() : "";
		}
		return "";
	}

}
