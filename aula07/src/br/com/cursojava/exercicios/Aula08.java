package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Aula08 {

	public static void main(String[] args) {
//		8) Crie um programa que imprima os calores abaixo no console
//		#####
//		####
//		###
//		##
//		#


//		String letra = "#####";
//		for (int i = 0; i < 5; i++) {
//
//			System.out.println(letra.substring(i));
//
//		}
//		
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		
	}

}
