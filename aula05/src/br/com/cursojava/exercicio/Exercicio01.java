package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio01 {
	//1) Escreva um programa que solicite 2 números para o usuário e em seguida escreva o resultado da multiplicação do primeiro número pelo segundo.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informa um numero: ");
		double n1 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informa o segundo numero: ");
		double n2 = Double.parseDouble(scanner.nextLine());
		double multiplicacao = n1* n2;
		System.out.printf("%.2f x %.2f = %.2f ", n1, n2, multiplicacao);
		scanner.close();
	}
}
