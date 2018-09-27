package br.com.cursojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {
	
		ArrayList<String> listaNomes = new ArrayList<String>();
		
		//retorna a qtdd de elementos da lista
		System.out.println("Quantidade de elementos: " + listaNomes.size());
		
		//Adicionando Elementos ao final da lista
		listaNomes.add("Eduardo");
		System.out.println("Quantidade de elementos: " + listaNomes.size());
		
		//adiciona o Elemento no indice desejado
		listaNomes.add(0, "Joao");
				
		//trocar um elemento da lista
		listaNomes.set(0, "Maria");
		
		//buscar um elemento da lista
		System.out.println(listaNomes.get(0));
		
		//remover um elemento da lista
		listaNomes.remove(0);
		
		
		//buscar um index da lista 
		//se acahar retorna "0" se não achar nenhum item retornar "-1"
		System.out.println(listaNomes.indexOf("Eduardo"));
		
		//imprimir os elementos da lista		
		System.out.println(listaNomes);
		System.out.println(Arrays.asList(listaNomes));
		
	}
}
