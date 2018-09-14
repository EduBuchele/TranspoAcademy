package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

//5) Escreva um programa que solicite um numero e em seguida apresente uma mensagem 
//informadno se o umero digitado foi "PAR" ou "IMPAR". 
// Todo numero par deve ter resto da divisao por 2 igual a zero.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int numero = Integer.parseInt(teclado.nextLine());

		if (numero % 2 == 0) {
			System.out.println("O numero é Par!");
		} else {
			System.out.println("O numero é Impar!");
		}

		System.out.println("Fim da Aplicação.");
		teclado.close();

	}

}
