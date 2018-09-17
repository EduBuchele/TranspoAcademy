package br.com.cursojava.exercicio;

public class Exercicio05 {

	// 05) Escreva um programa que escreva todos os numeros impares entre 1 e 100.

	public static void main(String[] args) {

		int i = 0;

		while (i <= 100) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;

		}
	}
}