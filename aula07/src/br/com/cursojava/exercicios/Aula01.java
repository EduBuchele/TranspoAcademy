package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
//		1) Crie um programa que solicite um numero entre 1 e 20 e em seguida calcule e
//	apresente o valor do fatorial do numero informado.

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um numero entre 1 e 20: ");
		int numero = Integer.parseInt(scan.nextLine());
		scan.close();
		
		if (numero <= 0 || numero > 20) {
			System.out.println("Numero Invalido");
		} else {
			long fatorial = 1;
			for (; numero > 1; numero--) {
				fatorial *= numero;

			}
			System.out.println("O fatorial é: " + fatorial);
		}
	}

}
