package br.com.cursojava;

public class Pratica01 {

	public static void main(String[] args) {
//		1) Dada a matriz abaixo, calcule a soma dos valores da sua diagonal principal.
//	|10,09,08|
//	|07,09,10|
//	|10,07,08|

		int[][] matriz = { { 10, 9, 8 }, { 7, 9, 10 }, { 10, 7, 8 } };
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					soma += matriz[i][j];
				}
			}
		}
		System.out.println(soma);

		// outro jeito de fazer
		int[][] matrix = new int[3][3];
		matrix[0][0] = 10;
		matrix[0][1] = 9;
		matrix[0][2] = 8;
		matrix[1][0] = 7;
		matrix[1][1] = 9;
		matrix[1][2] = 10;
		matrix[2][0] = 10;
		matrix[2][1] = 7;
		matrix[2][2] = 8;

		int soma2 = 0;
		for (int index = 0; index < matrix.length; index++) {
			soma2 += matrix[index][index];

		}

		System.out.println(soma2);
	}

}
