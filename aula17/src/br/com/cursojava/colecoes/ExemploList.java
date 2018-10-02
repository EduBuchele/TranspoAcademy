package br.com.cursojava.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		
	List<String> nomes = new ArrayList<>();
	nomes.add("Joao");
	nomes.add("Maria");
	nomes.add("Jose");
	nomes.add("Eva");
	nomes.add("Adão");
//	System.out.println(nomes);
//	Collections.sort(nomes);
//	System.out.println(nomes);
//	Collections.sort(nomes, Collections.reverseOrder());
//	System.out.println(nomes);
//	
	List<Contato> contatos = new ArrayList<>();
	contatos.add(new Contato("Igor", "email@igor"));
	contatos.add(new Contato("Jones", "email@igor"));
	contatos.add(new Contato("Fernanda", "email@igor"));
	contatos.add(new Contato("Edu", "email@edu"));
	contatos.add(new Contato("Ana", "email1@igor"));
	contatos.add(new Contato("Ana", "email2@igor"));
	contatos.add(new Contato("Ane" , "email@igor"));
	System.out.println(contatos);
	Collections.sort(contatos);
	System.out.println(contatos);
	Collections.sort(contatos, Collections.reverseOrder());
	System.out.println(contatos);
	
	
	
}

}