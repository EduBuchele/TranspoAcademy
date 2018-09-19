package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio01 {

//1) Crie um programa que solicite 10 notas e em seguida calcule 
//a media das notas e escreva as notas digitas juntamenteo com o valor da media

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double soma = 0;
		double[] notas = new double[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe a nota (" + (i + 1) + "/10):");
			double nota = Double.parseDouble(scan.nextLine());
			notas[i] = nota;
			soma += nota;
		}
		double media = soma / notas.length;
		System.out.println("Suas notas são: ");
		for (double i : notas) {
			System.out.print(i + " ");
		}
		System.out.println("\nA media é: " + media);
		scan.close();

	}

}
