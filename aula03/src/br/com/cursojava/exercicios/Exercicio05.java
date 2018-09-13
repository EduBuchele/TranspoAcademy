package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// 5) Escreva um programa que solicite a idade do usuario em dias e em seguida
		// aprense o valor em dias meses e anos.
//		 		considere que cada mes possui 30 dias e que um ano equivale a 12 meses
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade em dias: ");
		int idadeDias = Integer.parseInt(teclado.nextLine());
		int idadeMeses = idadeDias / 30;
		int idadeAnos = idadeMeses / 12;
		int sobraMeses = idadeMeses % 12;
		int sobraDias = idadeDias % 30;
		System.out
				.println("Sua idade é: " + idadeAnos + " ano(s) " + sobraMeses + " mes(es) e " + sobraDias + " dia(s)");
		teclado.close();
	}

}
