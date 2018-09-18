package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Aula06 {

	public static void main(String[] args) {
//		6) Crie um programa que solicite uma palavra e em seguida escreva a palavra de forma inversa. (Ex. Felipe => epileF)

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String frase = scan.nextLine();
		scan.close();
		int i = frase.length();
		i--;
		for (; i >= 0; i--) {
			System.out.print(frase.charAt(i));

		}
	}

}
