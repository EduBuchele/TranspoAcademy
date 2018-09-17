package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio02 {
//	2) Escreva um programa que solicite 3 números para o usuário e 
//	em seguida escreva o resultado da soma do primeiro número com o terceiro número 
//e em seguida multiplique o resultado pelo segundo número informado.
//Mostre na tela o resultado da aplicação.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informa o primeiro numero: ");
		double n1 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informa o segundo numero: ");
		double n2 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informa o terceiro numero: ");
		double n3 = Double.parseDouble(scanner.nextLine());
		double soma1e3 = n1 + n3;
		System.out.printf("( %.2f + %.2f ) = %.2f x %.2f = %.2f ", n1, n3, soma1e3, n2, soma1e3 * n2);
		scanner.close();
	}
	
}
