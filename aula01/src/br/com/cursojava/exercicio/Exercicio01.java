package br.com.cursojava.exercicio_um;

public class ExercicioUm {

	public static void main(String[] args) {

		int a = 10;
		int b = 9;
		int c = 8;

		System.out.println("Media: " + (a + b + c) / 3);
		System.out.println("Soma: " + (a + b + c));
		System.out.println("Soma/Media: " + (a + b + c) / ((a + b + c) / 3));
		System.out.println("Resto a/b: " + a % b);
		System.out.println("Soma - c/4: " + ((a + b + c) - (c / 4)));

	}
}
