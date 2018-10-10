package br.com.cursojava;

import java.util.Scanner;

public class AppContato {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContatoViewCadastro view = new ContatoViewCadastro();
		view.viewMenu(teclado);
		teclado.close();
		System.out.println("------  Fim da Aplicação  -------");
		
	}

}
