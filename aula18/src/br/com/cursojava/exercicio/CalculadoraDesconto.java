package br.com.cursojava.exercicio;

import java.util.Scanner;

public class CalculadoraDesconto {

	public double calculaValorComDesconto(double valor) {
		double desconto=0;
		if (valor < 0) {
			valor = 0;
		} else if (valor <= 1800) {
			desconto = 0;
		} else if (valor <= 2400) {
			desconto = 5;
		} else if (valor < 3600) {
			desconto = 22;
		} else {
			desconto = 32;
		}
		valor *= ((100 - desconto) / 100);
		return valor;

	}

}
