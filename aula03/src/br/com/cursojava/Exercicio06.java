package br.com.cursojava;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		// 6) Escreva um programa que solicite o valor de um produto e o percentual de
		// desconto,
		// em seguida o programa deve apresentar o valor do desconto e o valor do
		// produto apos a aplicação do desconto.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o preço do Produto: ");
		double produto = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite o percentual de desconto do Produto: ");
		double desconto = Double.parseDouble(teclado.nextLine());
		System.out.println("Desconto é de R$" + (produto * desconto) + " O produto com desconto é R$"
				+ (produto - (produto * desconto)));
		teclado.close();
	}

}
