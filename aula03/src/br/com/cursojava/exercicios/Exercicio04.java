package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// 4) Escreva um programa que solicite a idade do usuario em anos e apresente o
		// valor da idade informada em meses;(ex. 1ano = 12meses)

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		int idade = Integer.parseInt(teclado.nextLine());
		System.out.println("Sua idade em meses é: " + (idade * 12) + " meses");
		teclado.close();
	}

}
