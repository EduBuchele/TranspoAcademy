package br.com.cursojava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
//2) escreva um programa que solicite 3 numeros reais e em seguida apresente o resultado da media dos numeros informados.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int n1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe um numero: ");
		int n2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe um numero: ");
		int n3 = Integer.parseInt(teclado.nextLine());
		int media = (n1 + n2 + n3) / 3;
		System.out.println("A media dos numeros informados é: " + media);
		teclado.close();

	}

}
