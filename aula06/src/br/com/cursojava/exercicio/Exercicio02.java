package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
//		2) Escreva um programa que solicite um numero entre 1 e 3 para o usuario. E
//	Em seguida escreva uma mensagem informando o valor da opção selecionado.
//	As mensagens devem ser de cordo com a tabela abaixo:
//	1 - Sacar
//	2 - Depositar
//	3 - Verificar Saldo
//	![1-3] = Opção Invalida

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha uma opção entre 1 a 3: ");
		int opcao = Integer.parseInt(teclado.nextLine());
		teclado.close();

		switch (opcao) {
		default:
			System.out.println("Opção Escolhida Invalida!");
			break;
		case 1:
			System.out.println("Opção escolhida: Sacar");
			break;
		case 2:
			System.out.println("Opção escolhida: Depositar");
			break;
		case 3:
			System.out.println("Opção escolhida: Verificar Saldo");
			break;
		}
	}
}
