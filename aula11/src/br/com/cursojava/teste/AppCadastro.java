package br.com.cursojava.teste;

import java.util.Scanner;

import br.com.cursojava.modelo.CadastroProdutos;

public class AppCadastro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		CadastroProdutos cadastro = new CadastroProdutos();
		cadastro.mostrarMenu(teclado);
		System.out.println("********Fim da Aplicação**********");

		teclado.close();

	}
}
