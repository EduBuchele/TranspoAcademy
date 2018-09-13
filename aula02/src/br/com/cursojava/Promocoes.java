package br.com.cursojava;

public class Promocoes {

	public static void main(String[] args) {

		int a = 10;
		double b = 2.0;

		System.out.println(a + b);
		// a resposta sempre vira no maior cargo

		byte x = 1;
		byte y = 1;
		byte z = (byte) (x + y);
		// toda operação com valores menores que inteiros retornam um valor inteiro como
		// resposta.
		System.out.println(z);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}
}
