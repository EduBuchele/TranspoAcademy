package br.com.cursojava;

import java.util.Scanner;

public class ExemploLeitor {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();
		System.out.printf("O nome digitado foi: %s \n", nome);
		teclado.close();

	}

}
