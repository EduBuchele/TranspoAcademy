package br.com.cursojava.situacao;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.cursojava.utils.CrudRepository;

@FacesConverter(value="situacaoConverter")
public class SituacaoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent uiComponent, String value) {
		CrudRepository<Situacao> repositorio = new SituacaoRepositorio(Situacao.class);
		Situacao situacao = null;
		try {
			situacao = repositorio.buscarPorId(Integer.parseInt(value));
		}catch(NumberFormatException ex) {}
		return situacao;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent uiComponent, Object object) {
		if(object.getClass() == Situacao.class) {
			Situacao situacao = (Situacao)object;
			return situacao.getId() != null ? situacao.getId().toString() : "";
		}
		return "";
	}

}
