package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
//	7) Escreva um programa que solicite o valor do salario de uma pessoa e 
// calcule o valor do imposto de renda conforme os dados abaixo
//	Ate 1800. Isento
//	de 1800,01 até 2400,00 = 7,5%
//	de 2400,01 ate 3600,00 = 15%
//	acima de 3600 = 27%

		System.out.println("Programa de Calculo de IR");

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		double salario = Double.parseDouble(teclado.nextLine());
		double imposto;
		if (salario < 1800) {
			System.out.printf("Imposto de renda: Isento \n");
		} else if (salario < 2400) {
			imposto = 0.075 * salario;
			System.out.printf("Imposto de Renda (7,5): R$ %.2f   \n", imposto);
		} else if (salario < 3600) {
			imposto = 0.15 * salario;
			System.out.printf("Imposto de Renda (15): R$ %.2f   \n", imposto);
		} else {
			imposto = 0.27 * salario;
			System.out.printf("Imposto de Renda (27): R$ %.2f   \n", imposto);
		}

		System.out.println("Fim da Aplicação.");
		teclado.close();

	}

}
