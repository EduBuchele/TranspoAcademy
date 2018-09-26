package br.com.cursojava;

import java.util.Scanner;

public class AppContato {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		CadastroContato cadastro = new CadastroContato();
		cadastro.mostrarMenu(teclado);
		System.out.println("********Fim da Aplicação**********");

		teclado.close();

	}
}
