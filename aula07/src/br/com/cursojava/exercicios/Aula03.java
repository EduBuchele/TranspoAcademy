package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Aula03 {

	public static void main(String[] args) {
//		3) Crie um programa que solicite 5 numeros e em seguida escreva o valor do maior numero informado.

		Scanner scan = new Scanner(System.in);
		int maior = 0;
		System.out.println("Informe um numero");
		int n1 = Integer.parseInt(scan.nextLine());
		maior = n1;

		for (int i = 4; i > 0; i--) {
			System.out.println("Informe um numero");
			n1 = Integer.parseInt(scan.nextLine());
			if (maior < n1) {
				maior = n1;
			}

		}
		scan.close();
		System.out.println("O maior numero informado é: " + maior);
	}

}
