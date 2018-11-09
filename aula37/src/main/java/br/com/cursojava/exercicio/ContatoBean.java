package br.com.cursojava.exercicio;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ContatoBean {

	private String nome;
	private String email;
	private String telefone;
	private List<Contato> contatos = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public void salvar() {
		Contato contato = new Contato(nome, email, telefone);
		contatos.add(contato);
		limparCampos();
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage mensagem = new FacesMessage("Contato adicionado com sucesso!");
		mensagem.setSeverity(FacesMessage.SEVERITY_INFO);
		context.addMessage("nome", mensagem);
	}

	private void limparCampos() {
		this.nome = "";
		this.email = "";
		this.telefone = "";
	}

}
