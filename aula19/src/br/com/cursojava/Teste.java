package br.com.cursojava;

public class Teste {
	
	public static int atributoStatic;
	public int atributo;
	
	public void oi() {
		System.out.println("Oi!!!!");
		System.out.println("O valor do atributo é: " + atributo);
		System.out.println("O valor do atributo Static é: " + atributoStatic);
	}

	public static void ola() {
		System.out.println("Olaaa!!!!");
//		variaveis de instancia nao podem ser chamadas diretamente em um metodo Static		
//		System.out.println("O valor do atributo é: " + atributo);
		System.out.println("O valor do atributo Static é: " + atributoStatic);
	}
	
	
}
