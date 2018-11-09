package br.com.cursojava.apptarefas.usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class UsuarioBean {

	Usuario usuario = new Usuario();
	private List<Usuario> contatos = new ArrayList<>();

	public UsuarioBean() {
		super();
	}

	public UsuarioBean(Usuario usuario, List<Usuario> contatos) {
		super();
		this.usuario = usuario;
		this.contatos = contatos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getContatos() {
		return contatos;
	}

	public void setContatos(List<Usuario> contatos) {
		this.contatos = contatos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contatos == null) ? 0 : contatos.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioBean other = (UsuarioBean) obj;
		if (contatos == null) {
			if (other.contatos != null)
				return false;
		} else if (!contatos.equals(other.contatos))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsuarioBean [usuario=" + usuario + ", contatos=" + contatos + "]";
	}

	public void salvar() {
		usuario.setDataHoraCriacao(new Date());
		usuario.setDataHoraAtualizacao(new Date());
		contatos.add(usuario);
		limparCampos();
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage mensagem = new FacesMessage("Usuario adicionado com sucesso!");
		mensagem.setSeverity(FacesMessage.SEVERITY_INFO);
		context.addMessage("nome", mensagem);
	}

	private void limparCampos() {
		usuario = new Usuario();
	}

}
