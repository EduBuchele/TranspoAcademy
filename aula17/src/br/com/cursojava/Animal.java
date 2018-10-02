package br.com.cursojava;

public abstract class Animal {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract void comer();

	public void respirar() {
		System.out.println(this.getClass().getSimpleName() + " Respirando O2...");

	}

}
