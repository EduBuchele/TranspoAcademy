package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio04 {
//	4) Crie um programa que solicite 3 notas e em seguida calcule a média das notas. 
//	Caso a nota seja maior ou igual a 9 apresente a mensagem "Conceito A",
//	caso a 	nota seja menor que 9 e maior ou igual a 7 apresente a mensagem "Conceito B",
//	caso a nota seja menor que 7 e maior ou igual a 6 apresente a mensagem "Conceito C",
//	caso a nota seja menor que 6 e maior ou igual a 5 apresente a mensagem "Conceito D",
//	senão apresente a mensagem "Conceito Insuficiente". 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informa a primeira nota: ");
		double n1 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informa a segundo nota: ");
		double n2 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informa a terceira nota: ");
		double n3 = Double.parseDouble(scanner.nextLine());
		double media = (n1 + n2+ n3)/3;
		
		if (media >= 9) {
			System.out.printf("Sua média foi %.2f : Conceito A", media);
		} else if ( media >=7){
			System.out.printf("Sua média foi %.2f : Conceito B", media);
		} else if ( media >=6){
			System.out.printf("Sua média foi %.2f : Conceito C", media);
		} else if ( media >5){
			System.out.printf("Sua média foi %.2f : Conceito D", media);
		}else {
			System.out.println(" Conceito Insuficiente, estude mais!");
		}

		scanner.close();
		
	}
}
