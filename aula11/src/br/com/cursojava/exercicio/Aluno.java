package br.com.cursojava.exercicio;

public class Aluno {

	String nomeAluno;
	String telefoneAluno;
	int matriculaAluno;

	String retornaNome() {
		return nomeAluno;
	}

	void configuraNome(String nome) {
		this.nomeAluno = nome;
	}

	String retornaTelefone() {
		return telefoneAluno;
	}

	void configuraTelefone(String telefone) {
		this.telefoneAluno = telefone;
	}

	int retornaMatricula() {
		return matriculaAluno;
	}

	void configuraMatricula(int matricula) {
		this.matriculaAluno = matricula;
	}

}
