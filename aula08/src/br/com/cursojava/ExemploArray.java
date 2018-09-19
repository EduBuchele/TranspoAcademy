package br.com.cursojava;

public class ExemploArray {
	public static void main(String[] args) {

		int[] numeros;
		numeros = new int[10];

		String nomes[];
		nomes = new String[3];

		String[] frutas = { "Abacaxi", "Banana", "Pessego" };
		double[] medias = new double[3];
		int[] notas = new int[] { 10, 9, 8, 10, 9, 8 };
		int[] notas2 = { 10, 9, 8, 10, 9, 8 };

		// notas = new int[] {100};

		// System.out.println(notas.length);
		int y = new int[] { 10, 9, 8, 7 }[1];
		// System.out.println(y);

		// se precisar percorrer todos os index, preciso usar essa sintaxe
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}

		System.out.println(" ");

		// imprime todos os index, mnao percorre// mais rapido, menos opções
		for (int atual : notas) {
			System.out.print(atual + " ");
		}

		System.out.println(" ");

		// isso é equivalente ao foreach
		for (int i = 0; i < notas.length; i++) {
			int atual = notas[i];
			System.out.print(atual + " ");
		}

	}

}
