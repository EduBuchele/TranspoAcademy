package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
// 1) Crie um programa que solicite o nome do usuario
// e ems eguida informe a quantidade de letras do nome informado;

		System.out.println("Digite um nome: ");
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		int quantidadeLetrasNome = nome.length();
		System.out.println("A quantidade de letras do nome digitado é: " + quantidadeLetrasNome);
		

		teclado.close();

	}

}
