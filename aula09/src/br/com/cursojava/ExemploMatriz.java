package br.com.cursojava;

public class ExemploMatriz {

	public static void main(String[] args) {
		double[][] notasTurma = new double[3][5];
		double pontos[][] = new double[3][3];
		String[] nomes[] = new String[2][2];

		String[][] frutas = { { "Abacaxi", "Amora", "Uva" }, { "Banana", "Maça", "Goiaba", "Pessego" } };
		int[][] numeros = new int[3][];
		numeros[0] = new int[2];
		numeros[1] = new int[5];
		numeros[2] = new int[10];

		for (int i = 0; i < frutas.length; i++) {
			for (int j = 0; j < frutas[i].length; j++) {
				System.out.print(frutas[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		for (int[] linha : numeros) {
			for (int celula : linha) {
				System.out.printf("%d ", celula);

			}
			System.out.println(" ");

		}

		System.out.println(" ");
		pontos[0][0] = 1;
		pontos[0][1] = 2;
		pontos[0][2] = 3;
		pontos[1][0] = 4;
		pontos[1][1] = 5;
		pontos[1][2] = 6;
		pontos[2][0] = 7;
		pontos[2][1] = 8;
		pontos[2][2] = 9;

		for (int i = 0; i < pontos.length; i++) {
			for (int j = 0; j < pontos[i].length; j++) {
				System.out.printf("%.2f ", pontos[i][j]);
			}
			System.out.println(" ");
		}
	}
}
