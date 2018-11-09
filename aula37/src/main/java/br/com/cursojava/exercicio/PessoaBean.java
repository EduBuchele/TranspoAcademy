package br.com.cursojava.exercicio;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PessoaBean {

	private String nome;
	private String time;
	private int posicao;

	public PessoaBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaBean(String nome, String time, int posicao) {
		super();
		this.nome = nome;
		this.time = time;
		this.posicao = posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		PessoaBean other = (PessoaBean) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", time=" + time + ", posicao=" + posicao + "]";
	}

	public String enviar() {
		if (this.nome != null && this.nome.length() >= 3) {
			
			return "relatorio";
		} else {
			System.out.println("O nome não é valido");
			return null;
		}
		
	}
}
