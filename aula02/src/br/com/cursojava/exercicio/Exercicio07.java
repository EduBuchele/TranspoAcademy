package br.com.cursojava.exercicio;

public class Exercicio07 {
//	7) Utilizando a classe Math crie um programa que apresente o valor inteiro referente ao numero 13.36543;
	public static void main(String[] args) {

		int numeroInteiro = (int) 13.36543;

		System.out.println("Numero Inteiro : " + numeroInteiro);
		// outra forma
		System.out.println("Numero Inteiro : " + (int) Math.floor(13.36546));

	}
}
