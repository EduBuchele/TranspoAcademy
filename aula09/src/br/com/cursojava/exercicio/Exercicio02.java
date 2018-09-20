package br.com.cursojava.exercicio;


public class Exercicio02 {

	public static void main(String[] args) {
////		2) Data a tabeça abaixo:
//		meias	camisas	camisetas
//		Jan	100	200	150	
//		Fev	75	26	100
//		Mar	150	200	250
//		Abr	50	210	240
//
//		Calcule as seguintes operações:
//		a) A quantidade de peças vendidas
//		b) A quantidade de meias vendidas
//		c) A quantidade de peças vendidas mês a mês
//		d) A quantidade de camisas + a quantidade de camisetas vendidas mês a mês
//		e) O tipo de peça mais vendida em cada mês.

		int[][] tabelaPreco = { { 100, 200, 150 }, { 75, 260, 100 }, { 150, 200, 250 }, { 50, 210, 240 } };

		// a) A quantidade de peças vendidas
		System.out.println("a) A quantidade de peças vendidas");
		int somaTotal = 0;
		for (int mes = 0; mes < tabelaPreco.length; mes++) {
			for (int produto = 0; produto < tabelaPreco[mes].length; produto++) {
				somaTotal += tabelaPreco[mes][produto];
			}
		}
		System.out.println("Total de peças vendidas: " + somaTotal);

		// A quantidade de meias vendidas
		System.out.println("b) A quantidade de meias vendidas");
		int somaMeias = 0;
		for (int mes = 0; mes < tabelaPreco[0].length; mes++) {
			somaMeias += tabelaPreco[mes][0];
		}
		System.out.println("Total de meias vendidas: " + somaMeias);

		// c) A quantidade de peças vendidas mês a mês
		System.out.println("c) A quantidade de peças mes");
		for (int mes = 0; mes < tabelaPreco.length; mes++) {
			int somaMes = 0;
			int soma = 0;
			for (int produto = 0; produto < tabelaPreco[mes].length; produto++) {
				soma += tabelaPreco[mes][produto];
			}
			somaMes += soma;
			System.out.println("Total de peças mes: " + somaMes);
		}

		// d) A quantidade de camisas e camisetas mes a mes

		System.out.println("d) A quantidade de camisas +Camisetas mes/mes");
		for (int i = 0; i < tabelaPreco.length; i++) {
			int somaCamisas = 0;
			for (int produto = 0; produto < tabelaPreco[i].length; produto++) {
				if (produto != 0) {
					somaCamisas += tabelaPreco[i][produto];
				}
			}
			System.out.println("A soma das camisas + camisetas no mes: " + somaCamisas);
		}

		// e) O tipo de peça mais vendida de cada mes
		System.out.println("e) A peça mais vendida do mes");
		for (int mes = 0; mes < tabelaPreco.length; mes++) {
			int maisVendida = 0;
			int index = 0;
			for (int produto = 0; produto < tabelaPreco[mes].length; produto++) {
				if (maisVendida < tabelaPreco[mes][produto]) {
					maisVendida = tabelaPreco[mes][produto];
					index = produto;
				}
			}
			System.out.println("O produto mais vendido do mes foi: " + index + " qtdd de peças: " + maisVendida);

		}

	}

}
