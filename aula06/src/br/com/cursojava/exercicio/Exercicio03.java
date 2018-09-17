package br.com.cursojava.exercicio;

public class Exercicio03 {
//	3) Escreva um programa que imprima o resultado da soma dos 50 primeiros numeros inteiros positivos
	public static void main(String[] args) {
		int num = 0;
		int soma = 0;

		while (num <= 50) {
			soma += num;
			num++;
		}

		System.out.print(soma);
	}
}
