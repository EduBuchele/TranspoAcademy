package br.com.cursojava.modelo;

public class Pessoa {

	private String nome;
	private int idade;
	private String time;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + this.nome + " Idade: " + this.idade + " Time: " + this.time;
	}

}
