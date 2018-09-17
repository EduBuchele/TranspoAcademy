package br.com.cursojava.exercicio;

public class Exercicio06 {

	// 06) Escreva um programa que escreva todos os numeros primos entre 1 e 50.

	public static void main(String[] args) {

		int num = 1;
		boolean primo = true;

		do {

			int divisor = 2;
			primo = true;

			do {
				if (num % divisor == 0) {
					primo = false;
					break;
				}
				divisor++;
			} while (divisor < num);
			if (primo) {
				System.out.print(num + ", ");
			}
			num++;

		} while (num <= 50);
		System.out.println("");
		System.out.println("Fim Aplicação");
	}

//	int num = 1;
//	boolean primo = true;
//
//	while (num <= 50) {
//
//		int divisor = 2;
//		primo = true;
//
//		while (divisor < num) {
//			if (num % divisor == 0) {
//				primo = false;
//				break;
//			}
//			divisor++;
//		}
//		if (primo) {
//			System.out.print(num + ", ");
//		}
//		num++;
//	}
//	System.out.println("");
//	System.out.println("Fim Aplicação");
//}
}
