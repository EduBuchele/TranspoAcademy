package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
//2) Crie um programa que solicite 3 notas e em seguida calcule a media das notas.
//Se a media for maior ou igual a 7 escreva "Aprovado" senao escreva "Reprovado
		System.out.println("Programa para caluclo de Media: ");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota: ");
		double n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a terceira nota: ");
		double n3 = Double.parseDouble(teclado.nextLine());
		double media = ((n1 + n2 + n3) / 3);

		if (media >= 7) {
			System.out.printf("Sua media foi: %.2f e voce foi aprovado!", media);
		} else {
			System.out.printf("Sua media foi: %.2f e voce esta Reprovado!", media);
		}
		System.out.println("Fim da Aplicação.");

		teclado.close();

	}

}
