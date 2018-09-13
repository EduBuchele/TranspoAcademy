package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
//2) escreva um programa que solicite 3 numeros reais e em seguida apresente o resultado da media dos numeros informados.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um numero(1/3): ");
		double n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe um numero(2/3): ");
		double n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe um numero(3/3): ");
		int n3 = Integer.parseInt(teclado.nextLine());
		double media = (n1 + n2 + n3) / 3;
		System.out.println("A media dos numeros informados é: " + media);
		System.out.printf("A media dos numeros informados é: %.2f", media);
		teclado.close();

	}

}
