package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Aula05 {

	public static void main(String[] args) {
//		5) Crie um programa que solicite uma frase e em seguida apresente as letras dos indices impares;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String frase = scan.nextLine();
		scan.close();

		for (int i = 0; i < frase.length(); i++) {

			if (i % 2 != 0 ) {
				System.out.println(frase.charAt(i));
			}

		}
	}

}
