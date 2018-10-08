package br.com.cursojava;

import java.util.Scanner;

public class ExemploExcecoes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um Numero:");
		try {
			int numero = Integer.parseInt(teclado.nextLine());
			System.out.println("O numero digitado foi: " + numero);
		} catch (NumberFormatException e) {
			System.out.println("Não aceito Textos.Apenas Digitos Numeraiss");
		}

		try {
			String[] nomes = { "Joao", "Maria" };
			System.out.println(nomes[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Voce tentnou acessar uma posição invalida.");
		}

		try {
			String[] nomes = { "Joao", "Maria" };
			System.out.println(nomes[2]);
		} catch (Throwable e) {
			// Throwable vai pegar todos os erros e excessoes
			System.out.println("Voce tentnou acessar uma posição invalida.");
		}

		try {
			int numero2 = Integer.parseInt(teclado.nextLine());
			System.out.println("O numero digitado foi: " + numero2);
			String[] nomes = { "Joao", "Maria" };
			System.out.println(nomes[2]);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Errrow");
		}
		teclado.close();

	}

}
