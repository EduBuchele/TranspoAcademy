package br.com.cursojava;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
//		8) Escreva um programa que solicite a base e a altura de um triangulo e em seguida calcule a area.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a base do traingulo: ");
		double base = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a altura do triangulo: ");
		double altura = Double.parseDouble(teclado.nextLine());

		teclado.close();

		System.out.println("A área do trinagulo é : " + ((base * altura) / 2));

	}

}
