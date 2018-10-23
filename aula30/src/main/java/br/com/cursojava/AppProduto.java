package br.com.cursojava;

import java.util.Scanner;

public class AppProduto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		CadastroProdutoView cadastro = new CadastroProdutoView();
		cadastro.mostrarMenu(teclado);
		System.out.println("********Fim da Aplicação**********");

		teclado.close();

	}
}
