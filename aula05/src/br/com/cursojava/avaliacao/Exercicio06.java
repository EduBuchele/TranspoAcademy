package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
//6) Escreva um programa que solicite a idade, a altura e o peso de uma pessoa, 
//em seguida calulce o IMC utilizando a formaula IMC = peso/altura*altura. 
//O programa deve apresentar uma mensagem informadno se o imc de acordo com a tabela.
//		Abaixo 17 = "Muito abaixo do Peso"
//				17 a 18,49 = "Abaixo do Peso"
//				18,5 a 24,99 = "peso Normal"
//				25 a 29,99 = " Acima do Peso"
//				30 a 34,99 = "Obesidade I"
//				35 a 39,99 = " Obesidade II (severa)"
//				Acima 40 = " Obesidade III (morbida)"
		System.out.println("Programa de Calculo de IMC");

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a altura da pessoa: ");
		double altura = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite o peso da pessoa: ");
		double peso = Double.parseDouble(teclado.nextLine());
		double imc = peso / (altura * altura);

		if (imc < 17) {
			System.out.printf("Seu IMC é %.2f: Muito abaixo do peso \n", imc);
		} else if (imc < 18.49) {
			System.out.printf("Seu IMC é %.2f: Abaixo do peso \n", imc);
		} else if (imc < 24.99) {
			System.out.printf("Seu IMC é %.2f: Peso Normal \n", imc);
		} else if (imc < 29.99) {
			System.out.printf("Seu IMC é %.2f: Acima do Peso \n", imc);
		} else if (imc < 34.99) {
			System.out.printf("Seu IMC é %.2f: Obesidade I \n", imc);
		} else if (imc < 39.99) {
			System.out.printf("Seu IMC é %.2f: Obesidade II (severa) \n", imc);
		} else {
			System.out.printf("Seu IMC é %.2f: Obesidade III (mórbida) \n", imc);
		}

		System.out.println("Fim da Aplicação.");
		teclado.close();

	}

}
