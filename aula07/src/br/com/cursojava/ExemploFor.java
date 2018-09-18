package br.com.cursojava;

public class ExemploFor {

	public static void main(String[] args) {

		System.out.println("formato padrao");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i);

		}

		System.out.println(" dois parametros");
		int i = 10;
		for (; i >= 1; i--) {
			System.out.print(i + " ");
		}

		System.out.println("\n um parametro");
		for (; i <= 10;) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println("\n Sem nenhum parametro itens");
		for (; i <= 10;) {
			System.out.print(i + " ");
			i++;
		}
		for (;;) {
			System.out.print(i + " ");
			i--;
			if (i == 0) {
				break;
			}
		}

	}

}
