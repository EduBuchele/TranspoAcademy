package br.com.cursojava;

public class ExemploStatic {
	
	public static void main(String[] args) {
		Teste t1 = new Teste();
		Teste t2 = new Teste();
		
		System.out.println(t1.atributo);
		System.out.println(t2.atributo);
		System.out.println(t1.atributoStatic);
		System.out.println(t2.atributoStatic);
		System.out.println(Teste.atributoStatic);
		
		t1.atributo = 10;
		t2.atributo = 20;
		
		t1.atributoStatic = 50;
		t2.atributoStatic = 250;
		System.out.println("********************");
		System.out.println(t1.atributo);
		System.out.println(t2.atributo);
		System.out.println(t1.atributoStatic);
		System.out.println(t2.atributoStatic);
		System.out.println(Teste.atributoStatic);
		
		t1.oi();
		t1.ola();
		Teste.ola();
		
	}
	

	
	
}
