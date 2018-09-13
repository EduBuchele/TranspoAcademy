package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
//		10) Escreva um programa que solicite o peso e a altura de uma pessoa e 
		// em seguida calcule o IMC desta pessoa. IMC = peso/(altura*altura)

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu peso: ");
		double peso = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a sua altura: ");
		double altura = Double.parseDouble(teclado.nextLine());

		teclado.close();

		double imc = peso / (altura * altura);
		System.out.println("Seu IMC é : " + imc);
		System.out.printf("Seu IMC é : %.2f", imc);

	}

}
