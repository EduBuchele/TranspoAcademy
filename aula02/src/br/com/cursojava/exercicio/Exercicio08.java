package br.com.cursojava.exercicio;

public class Exercicio08 {
//	8) Utilizando a calsse Math Crie uym programa e escreva o valor absoluto dos numeros -10, 20, -50 e -1000;
	public static void main(String[] args) {

		long numeroUm = -10;
		long numeroDois = 20;
		long numeroTres = -50;
		long numeroQuatro = -1000;

		System.out.println("Numero Absoluto : " + Math.abs(numeroUm) + ", " + Math.abs(numeroDois) + ", "
				+ Math.abs(numeroTres) + ", " + Math.abs(numeroQuatro));

	}
}
