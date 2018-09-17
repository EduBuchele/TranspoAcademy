package br.com.cursojava;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		// utilizando o "continue" ele sai do laço
		// utilizando o break ele termina o laço
		int numero = 10;
		

//		while (numero <= 20) {
//			if (numero % 2 == 0) {
//				numero++;
//				continue;
//			}
//			System.out.print(numero++ + ", ");
//		}

		meulabel:
		while (numero < 15) {
			if (numero == 13) {
					break meulabel;
			}
			System.out.print(numero++ + ", ");
		}
		
	}

}
