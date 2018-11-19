package br.com.cursojava.usuario;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.cursojava.utils.CrudRepository;

@FacesConverter(value="usuarioConverter")
public class UsuarioConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent uiComponent, String value) {
		CrudRepository<Usuario> repositorio = new UsuarioRepositorio(Usuario.class);
		Usuario usuario = null;
		try {
		usuario = repositorio.buscarPorId(Integer.parseInt(value));
		}catch(NumberFormatException ex) {}
		return usuario;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent uiComponent, Object object) {
		if(object.getClass() == Usuario.class) {
			Usuario usuario = (Usuario)object;
			return usuario.getId() != null ? usuario.getId().toString() : "";
		}
		return "";
	}

}
