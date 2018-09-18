package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Aula07 {

	public static void main(String[] args) {
//		7) Cire um programa que imprima os valores abaixo no console:
//		X
//		XX
//		XXX
//		XXXX
//		XXXXX

//		String letra = "XXXXX";
//		for (int i = 4; i >= 0; i--) {
//			System.out.println(letra.substring(i));
//		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("X");
			}
			System.out.println("");
		}

	}

}
