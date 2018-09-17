package br.com.cursojava;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
		// Cuidado, ele analisa os dados conforme o tipo da variavel informado no switch() "dia" no caso int
		// os valores do case, tem que ser igual a variavel, 
		//lembrar de utilizar o break para pular para o final da aplicação caso necessario.
		
		
		//Exemplo de constante estatica
		//private static final int INICIAL;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 7");
		int dia = Integer.parseInt(scan.nextLine());
		
		switch(dia){
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Numero Invalido!");
		}
		
		scan.close();

}

}
