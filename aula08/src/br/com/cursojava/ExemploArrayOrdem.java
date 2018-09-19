package br.com.cursojava;

import java.util.Arrays;

public class ExemploArrayOrdem {
	public static void main(String[] args) {

		int[] numeros = { 3, 2, 5, 1, 4, 8, 7, 9, 10, 6 };
		int temp = 0;

		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[i] > numeros[j]) {
					temp = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(numeros));
//		for (int i : numeros) {
//			System.out.print(i + " ");
//
//		}
	}
}
