package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio04 {

//4) Crie um programa que solicite o nome de 10 pessoas 
//	e em seguida apresente os nomes informados na ordem inversa. ( O ultimo nome deve ser o primeiro);

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nomes = new String[10];

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Informe um nome: ");
			nomes[i] = scan.nextLine();
		}

		for (int i = nomes.length - 1; i >= 0; i--) {
			System.out.print(nomes[i] + " ");

		}
		scan.close();
	}

}
