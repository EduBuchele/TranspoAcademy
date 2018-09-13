package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

//3) Escreva um programa que solicite a idade de um usuario e em seguida apresente a idade do usuario após 20 anos.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		int idade = Integer.parseInt(teclado.nextLine());
		System.out.println("Sua idade daqui 20 anos será: " + (idade + 20) + " anos");
		teclado.close();

	}

}
