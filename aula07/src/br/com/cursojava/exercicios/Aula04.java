package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Aula04 {

	public static void main(String[] args) {
//		4) Crie um programa que solicite 5 numeros e em seguida apresente o valor da soma e da media;

		
		Scanner scan = new Scanner(System.in);
		int soma = 0;
				for (int i = 5; i > 0; i--) {
		System.out.println("Informe um numero");
		int numero = Integer.parseInt(scan.nextLine());
		soma += numero; 
				}
		scan.close();
		int media = soma/5;
		System.out.println("A Soma é : " + soma);
		System.out.println("A Media é : " + media);
	}
	
			
		

}
