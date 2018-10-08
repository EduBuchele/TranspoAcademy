package br.com.cursojava;

public class ExemploClasseAnonima {

	public static void main(String[] args) {
		Voador v1 = new Aviao();
//		v1.voar();

		Voador v2 = new Voador() {
			public void voar() {
				System.out.println("Voador Anonimo...");
			}
		};
//		v2.voar();
		liberarVoo(v1);
		liberarVoo(v2);

		liberarVoo(new Voador() {
			public void voar() {
				System.out.println("Voador Anonimo 2....");
			}
		});
	}

	private static void liberarVoo(Voador voador) {
		voador.voar();
	}

}
