package br.com.cursojava.introducao;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloWorldBean")
@SessionScoped
public class HelloWorldBean {

	private String nome;

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataHora() {
		return sdf.format(new Date());
	}

	public String salvar() {
		if (this.nome != null && this.nome.length() >= 3) {
			return "result?faces-redirect=true";
		} else {
			System.out.println("O nome não é valido");
			return null;
		}
	}

}
