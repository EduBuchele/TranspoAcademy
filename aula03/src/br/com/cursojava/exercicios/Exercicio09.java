package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
//		9) Escreva um programa que solicite 3 notas e em seguida calcule a media ponderada aplicando os pesos 2,3,5 
		// respectivamente. Ao final o programa deve apresentar o resultado da media
		// calculada.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota: ");
		double n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a terceira nota: ");
		double n3 = Double.parseDouble(teclado.nextLine());

		teclado.close();

		double mediaPonderada = (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5);
		System.out.println("A média podenrada é : " + mediaPonderada);
		System.out.printf("A média podenrada é %.2f: ", mediaPonderada);

	}

}
