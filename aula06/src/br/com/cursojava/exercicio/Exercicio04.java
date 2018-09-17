package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio04 {

	// 04) Escreva um programa que solicite 3 notas e em seguida calcule e apresente
	// o valor da media das notas.
	// O programa deve ser executado até que a primeira nota tenha um valor negativo

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		

		while (true) {
			System.out.println("Informe 3 notas: ");
			double n1 = Double.parseDouble(scanner.nextLine());
			if (n1 < 0) {
				break;
			}
			System.out.println("Informe a Segunda nota: ");
			double n2 = Double.parseDouble(scanner.nextLine());
			System.out.println("Informe a Terceira nota: ");
			double n3 = Double.parseDouble(scanner.nextLine());
			double media = (n1 + n2 + n3) / 3;
			System.out.println("A media é: " + media);

		}
		System.out.println("Fim da Aplicação");
		scanner.close();
	}
}
