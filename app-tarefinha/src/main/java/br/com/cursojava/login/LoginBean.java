package br.com.cursojava.login;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.cursojava.usuario.Usuario;
import br.com.cursojava.usuario.UsuarioFacade;

@ManagedBean
@ViewScoped
public class LoginBean {

	private Usuario usuarioLogin = new Usuario();
	private UsuarioFacade facade = new UsuarioFacade();

	public String efetuaLogin() {

		try {
			Usuario usuarioEncontrado = facade.buscarPorNome(usuarioLogin.getNome());
			if (usuarioEncontrado.getSenha().equals(usuarioLogin.getSenha())) {
				System.out.println("Login Sucesso");
				addMessage("Usuário logado com Sucesso!!!", FacesMessage.SEVERITY_INFO);
			} else {
				addMessage("Usuário e senha não conferem!", FacesMessage.SEVERITY_ERROR);
			}

		} catch (Exception e) {
			System.out.println("Não encontramos o usuario");
			addMessage("Não encontramos o usuario!", FacesMessage.SEVERITY_ERROR);
		}

		limparForm();
		return "";

	}

	private void addMessage(String mensagem, Severity prioridade) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(mensagem);
		message.setSeverity(prioridade);
		context.addMessage(null, message);
	}

	private void limparForm() {
		this.usuarioLogin = new Usuario();
	}

	public Usuario getUsuarioLogin() {
		return usuarioLogin;
	}

	public void setUsuarioLogin(Usuario usuarioLogin) {
		this.usuarioLogin = usuarioLogin;
	}

	public String getNome() {
		return usuarioLogin.getNome();
	}

	public void setNome(String nome) {
		usuarioLogin.setNome(nome);
	}

	public String getSenha() {
		return usuarioLogin.getSenha();
	}

	public void setSenha(String senha) {
		usuarioLogin.setSenha(senha);
	}

}
