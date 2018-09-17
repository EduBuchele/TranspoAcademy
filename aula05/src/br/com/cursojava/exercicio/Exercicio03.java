package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio03 {
//	3)Escreva um programa que solicite 3 notas de um aluno e 
//	em seguida calcule a média das notas. 
//	Caso a média seja maior ou igual a 9 escreva Excelente,
//	caso a média seja maior ou igual a 8 e menor que 9 escreva "Muito Bom", 
//	caso a nota seja maior ou igual a 6 e menor que 8 escreva "Bom", 
//	caso a nota seja menor que 6 escreva "Insuficiente".

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informa a primeira nota: ");
		double n1 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informa a segundo nota: ");
		double n2 = Double.parseDouble(scanner.nextLine());
		System.out.println("Informa a terceira nota: ");
		double n3 = Double.parseDouble(scanner.nextLine());
		double media = (n1 + n2+ n3)/3;
		
		if (media > 9) {
			System.out.printf("Sua média foi %.2f : Excelente", media);
		} else if ( media >8){
			System.out.printf("Sua média foi %.2f : Muito Bom", media);
		} else if ( media >6){
			System.out.printf("Sua média foi %.2f : Bom", media);
		}else {
			System.out.println("Insuficiente, estude mais!");
		}
		
		scanner.close();
	}
}
