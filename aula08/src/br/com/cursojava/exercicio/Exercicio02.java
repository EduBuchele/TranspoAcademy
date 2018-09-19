package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio02 {

//2) Crie um programa que crie um array com os valores 1,3,2 e
//	em seguida processe o array para que os valores se posicionem na forma 3,2,1

	public static void main(String[] args) {

		int[] numeros = new int[] { 1, 3, 2 };

		int troca = numeros[1];
		numeros[1] = numeros[2];
		numeros[2] = troca;

		for (int i = 2; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
		

		System.out.println(" ");

		for (int i : numeros) {
			System.out.print(i + " ");
		}

	}

}
