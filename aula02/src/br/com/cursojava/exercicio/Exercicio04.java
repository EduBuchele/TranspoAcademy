package br.com.cursojava.exercicio_dois;

public class ExercicioQuatro {
//4) Dado que um veiculo percorre uma distancia de 200km em 240min. caclule a velocidade media em km/h
	public static void main(String[] args) {

		int distancia = 200;
		int tempoMin = 240;
		int tempoHora = tempoMin / 60;
		long velocidadeMedia = distancia / tempoHora;

		System.out.println("Velocidade media em km/h:" + velocidadeMedia);

	}
}
