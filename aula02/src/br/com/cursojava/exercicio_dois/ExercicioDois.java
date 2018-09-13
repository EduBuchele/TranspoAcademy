package br.com.cursojava.exercicio_dois;

public class ExercicioDois {
//2) Dado um circulo de 30cm de diametro. Calcule e apresente o vclor da area deste circulo.
	public static void main(String[] args) {

		int diametroCirculo = 30;
		int raioCirculo = diametroCirculo / 2;
		double areaCirculo = (Math.PI * Math.pow(raioCirculo, 2));

		System.out.println("Area do circulo: " + areaCirculo);

	}
}
