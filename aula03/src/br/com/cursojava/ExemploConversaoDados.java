package br.com.cursojava;

import java.util.Scanner;

public class ExemploConversaoDados {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
//		System.out.println("Digite um numero: ");
//		String n1 = teclado.nextLine();
//		int numero1 = Integer.parseInt(n1);
//		int numero2 = Integer.parseInt(teclado.nextLine());
//		System.out.println(numero1 + numero2);
		System.out.println("Digite o preço do Produto: ");
		double preco = Double.parseDouble(teclado.nextLine());
		double desconto = Double.parseDouble(teclado.nextLine());
		System.out.println("O produto com desconto é: " + (preco - (preco * desconto)));

		teclado.close();

	}
}
