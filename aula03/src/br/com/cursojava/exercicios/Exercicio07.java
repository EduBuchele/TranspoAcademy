package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
//		7) Escreva um programa que solicite 3 notas e em seguida calcule e apresente os seguintes dados:
//			a) O valor da média
//			b) O valor da maior nota( Math.max)
//			c) O valor da menor nota (Math.min)
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota: ");
		double n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a terceira nota: ");
		double n3 = Double.parseDouble(teclado.nextLine());

		teclado.close();

		double mediaNotas = (n1 + n2 + n3) / 3;
		double notaMaisBaixa = Math.min(Math.min(n1, n2), n3);
		double notaMaisAlta = Math.max(Math.max(n1, n2), n3);
		
		System.out.println("A media das notas é : " + mediaNotas);
		System.out.println("A maior nota é: " + notaMaisAlta);
		System.out.println("A menor nota é: " + notaMaisBaixa);

	}

}
