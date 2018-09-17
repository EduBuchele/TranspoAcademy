package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio07 {

	// 07) Escreva um programa que apresente o menu abaixo para o usuario,
//	e apos a escolha do usuario apresente uma mensagem correspondente ao tipo
//	 de operação selecionado. O programa deve continuar executando até que o usuario 
//	escolha a opção sair. Caso o usuario escolha uma opção diferente, o programa deve apresentar
//	a mensagem "Opção Invalida".
//	1 - Cadastrar Aluno 	-> Escolheu a opção Cadastrar Aluno
//	2 - cadastrar Professor -> Escolheu a opção Cadastrar Professor
//	3 - Cadastrar Turma	-> Escolheu a opção Cadastrar Turma
//	4 - Sair

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int escolha = 0;
		while (escolha != 4) {

			System.out.println("Escolha uma Opção: ");
			System.out.println("1 - Cadastrar Aluno:");
			System.out.println("2 - Cadastrar Professor:");
			System.out.println("3 - Cadastrar Turma:");
			System.out.println("4 - Sair");
			escolha = Integer.parseInt(scanner.nextLine());

			switch (escolha) {
			case 1:
				System.out.println("Escolheu a opção Cadastrar Aluno");
				break;
			case 2:
				System.out.println("Escolheu a opção Cadastrar Professor");
				break;
			case 3:
				System.out.println("Escolheu a opção Cadastrar Turma");
				break;
			case 4:
				System.out.println("Fim da aplicação");
				// aplicacao = false;
				break;
			default:
				System.out.println("Opção invalida!");
			}
		} 
		scanner.close();

	}


//	Scanner scanner = new Scanner(System.in);
//	int escolha = 0;
//	do {
//
//		System.out.println("Escolha uma Opção: ");
//		System.out.println("1 - Cadastrar Aluno:");
//		System.out.println("2 - Cadastrar Professor:");
//		System.out.println("3 - Cadastrar Turma:");
//		System.out.println("4 - Sair");
//		escolha = Integer.parseInt(scanner.nextLine());
//
//		switch (escolha) {
//		case 1:
//			System.out.println("Escolheu a opção Cadastrar Aluno");
//			break;
//		case 2:
//			System.out.println("Escolheu a opção Cadastrar Professor");
//			break;
//		case 3:
//			System.out.println("Escolheu a opção Cadastrar Turma");
//			break;
//		case 4:
//			System.out.println("Fim da aplicação");
//			// aplicacao = false;
//			break;
//		default:
//			System.out.println("Opção invalida!");
//		}
//	} while (escolha != 4);
//	scanner.close();

}
