package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

//1) Escreva um programa que solicite dois numeros inteiro 
//		e em seguida escreva o valor do maior numero informado. Utilize Math.max.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int n1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe outro numero: ");
		int n2 = Integer.parseInt(teclado.nextLine());
		System.out.println("O maior numero informado é: " + Math.max(n1, n2));
		// Usando o printf
		//System.out.printf("O maior numero informado é: %d", Math.max(n1, n2));

		teclado.close();
	}
}
