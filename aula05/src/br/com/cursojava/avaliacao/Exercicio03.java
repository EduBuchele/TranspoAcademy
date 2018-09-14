package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
//3) Crie um programa que solicite uma frase e 
//em seguida apresente a frase digita sem as vogais.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = teclado.nextLine();
		frase = frase.replaceAll("a", "");
		frase = frase.replaceAll("e", "");
		frase = frase.replaceAll("i", "");
		frase = frase.replaceAll("o", "");
		frase = frase.replaceAll("u", "");
		frase = frase.replaceAll("A", "");
		frase = frase.replaceAll("E", "");
		frase = frase.replaceAll("I", "");
		frase = frase.replaceAll("O", "");
		frase = frase.replaceAll("U", "");
		System.out.println("A frase sem as vogais: " + frase);

		System.out.println("Fim da Aplicação.");

		teclado.close();

	}

}
