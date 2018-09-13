package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		// 6) Escreva um programa que solicite o valor de um produto e o percentual de
		// desconto,
		// em seguida o programa deve apresentar o valor do desconto e o valor do
		// produto apos a aplicação do desconto.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o preço do Produto: ");
		double valorProduto = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite o percentual de desconto do Produto: ");
		double percentualDesconto = Double.parseDouble(teclado.nextLine());
		double valorDesconto = valorProduto * percentualDesconto;
		double produtoComDesconto = valorProduto - valorDesconto;
		System.out.println("Desconto é de R$" + valorDesconto + " O produto com desconto é R$"
				+ produtoComDesconto);
		teclado.close();
	}

}
