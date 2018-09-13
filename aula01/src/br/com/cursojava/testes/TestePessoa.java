package br.com.cursojava.testes;

import br.com.cursojava.modelo.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Eduardo");
		pessoa.setIdade(33);
		pessoa.setTime("Sao Paulo");

		System.out.println(pessoa);

	}
}
