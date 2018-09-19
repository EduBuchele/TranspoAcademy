package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio03 {

//3) Crie um programa que solicite 5 notas e em seguida apresente o 
//	valor da maior nota juntamente com a posição da nota dentro do array.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] notas = new int[5];
		int maior = notas[0];
		int indice = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe uma nota: (" + (i+1) + "/5):");
			notas[i] = Integer.parseInt(scan.nextLine());
			if (maior < notas[i]) {
				maior = notas[i];
				indice = i;
			}
		}

		System.out.println("A maior nota é: " + maior + " Esta no indice: " + indice);
		scan.close();
	}

}
