package br.com.cursojava;

public class ExemploDoWhile {

	public static void main(String[] args) {
	
		// Ele sempre executara o "Do" pelo menos 1 vez
		
		int num = 10;
		do {
			System.out.println(num);
			num++;
		} while (num < 15);
	}
}
