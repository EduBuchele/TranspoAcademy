package br.com.cursojava;

public class ExemploString {

	public static void main(String[] args) {

		String curso = "Java Web TranspoBrasil";

// metodo length : retorna o numero de caracteres da String
//		System.out.println(curso.length());

// metodo charAt: retorna o caracter indicado pelo indice
//		System.out.println(curso.charAt(2));
// Brincando com For
//		for(int i = 0; i<curso.length(); i++) {		
//		System.out.println(curso.charAt(i));
//		}

// metodo indexOf: retorna o indice que inicia a string
//		System.out.println(curso.indexOf("Web"));
// indicar a posição que inicia a verificar (EX. começa a buscar "a" apartir do
// indice 4
//		System.out.println(curso.indexOf("a", 4));

// Brincando com Do/While retornando todos os indices da pesquisa por "a"
//		int i = 0;
//		do {
//			i++;
//			i = curso.indexOf("a", i);
//			System.out.print(i + ", ");
//			
//		} while (i != -1);

// String é um objeto e sao imutaveis, caso queira usar o replace temos que
// colocar o resultado em nova String, as funções nao alteram o a origem no Heap
//		System.out.println(curso.replace("J", "j"));
//		System.out.println(curso);

// String é especial em Java, ele cria um pool de Strings, por isso usamos para
// comparação o equals e nao ==

//		String a = "bola";
//		String b = "bola";
//		String c = new String("bola");
//
//		System.out.println("a==b:" + (a == b));
//		System.out.println("a==c:" + (a == c));
//		System.out.println("a.equals(b):" + a.equals(b));
//		System.out.println("a.equals(c):" + a.equals(c));

// Metodo subString retorna String apos o index informado
		System.out.println(curso.substring(10));
//ou entre o indexs informados/ index inicial é INclusivo e final EXcluisivo
		System.out.println(curso.substring(0,10));
		
		
		
	}

}
