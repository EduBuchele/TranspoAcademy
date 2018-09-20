package br.com.cursojava.exercicio;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
//		2) Escreva um programa que solicite 3 notas para uma turma de 10 alunos e 
//		em seguida calcule a média de cada aluno juntamente com a media da turma. 
//		Ao final o programa deve apresentar as 3 notas do aluno juntamente com sua media
//		e posteriormente deve apresentar a media final da turma.

		Scanner teclado = new Scanner(System.in);

		int numeroNotas = 3;
		int numeroAlunos = 5;
		double mediaTurma = 0;
		double[][] tabelaNotas = new double[numeroAlunos][numeroNotas + 1];
		for (int j = 0; j < numeroAlunos; j++) {
			double media = 0;
			for (int i = 0; i < numeroNotas; i++) {
				System.out.println("Informe sua nota (" + (i + 1) + "/" + numeroNotas + "): ");
				tabelaNotas[j][i] = Integer.parseInt(teclado.nextLine());
				media += tabelaNotas[j][i];
			}

			tabelaNotas[j][numeroNotas] = (media / numeroNotas);
			mediaTurma += tabelaNotas[j][numeroNotas];
		}

		System.out.println("Nota1 Nota2 Nota3 Media");
		for (int i = 0; i < tabelaNotas.length; i++) {

			for (int j = 0; j < tabelaNotas[i].length; j++) {
				System.out.printf(" %.1f ", tabelaNotas[i][j]);
			}
			System.out.println("");
		}
		System.out.printf(" A media da turma foi: %.2f ", (mediaTurma / numeroAlunos));

		teclado.close();
	}

}
