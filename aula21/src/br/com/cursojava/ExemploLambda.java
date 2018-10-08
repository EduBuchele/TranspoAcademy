package br.com.cursojava;

public class ExemploLambda {
	public static void main(String[] args) {

		Voador v1 = new Aviao();
		Voador v2 = () -> {System.out.println("Voador Lamda1 voando");};
		Voador v3 = () -> System.out.println("Voador Lambda2 Voando....");

//		v1.voar();
//		v2.voar();
//		v3.voar();

		liberarVoo(v1);
		liberarVoo(v2);
		liberarVoo(v3);
		System.out.println("***************");
		liberarVoo(() -> System.out.println("Voador Lambda3 Voando..."));

		System.out.println("***************");
		
		Voador v = new Voador() {
			public void voar() {
				System.out.println("Faz alguma Coisa...");
			}
		};
		Voador vl = () -> System.out.println("Faz Alguma Coisa");
		 liberarVoo(v);
		 liberarVoo(vl);
	
	}

	
		
	
	
	private static void liberarVoo(Voador voador) {
		voador.voar();
	}
}
