package br.com.cursojava;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
//		7) Escreva um programa que solicite 3 notas e em seguida calcule e apresente os seguintes dados:
//			a) O valor da m�dia
//			b) O valor da maior nota( Math.max)
//			c) O valor da menor nota (Math.min)
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota: ");
		double n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a terceira nota: ");
		double n3 = Double.parseDouble(teclado.nextLine());

		teclado.close();

		System.out.println("A media das notas � : " + ((n1 + n2 + n3) / 3));
		System.out.println("A maior nota �: " + Math.max(Math.max(n1, n2), n3));
		System.out.println("A menorr nota �: " + Math.min(Math.min(n1, n2), n3));

	}

}
