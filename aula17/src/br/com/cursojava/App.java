package br.com.cursojava;

public class App {

	public static void main(String[] args) {
		
		Animal a2 = new Humano();
		Animal a3 = new Peixe();
//		Animal a4 = new Bovino(); 
//		Animal a5 = new Reptil();
		Animal a6 = new Ave();
		Animal a7 = new PeixeVoador();
		a2.setNome("Ted");
	
		Voador v = new Voador() {

			@Override
			public void voar() {
				System.out.println("Voador Anonimo");
				
			}
			
		};
		
		v.voar();
		System.out.println(a2.getNome());
		a2.comer();
		a2.respirar();
		a3.comer();
//		a3.respirar();
//		a4.comer();
//		a4.respirar();
//		a5.comer();
//		a5.respirar();
		a6.comer();
		a7.comer();
		((Ave) a6).voar();
		Delorian delorian = new Delorian();
		delorian.acionarTurbo();
		delorian.voar();
		delorian.desligarTurbo();
		
		
		
	}
	
	
}
