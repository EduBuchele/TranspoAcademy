package br.com.cursojava;

import java.util.Scanner;

public class AppCliente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CadastroCliente cadastro = new CadastroCliente();
		cadastro.mostrarMenu(teclado);
		
		teclado.close();
		
	}
}
