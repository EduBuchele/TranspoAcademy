package br.com.cursojava;

import java.util.ArrayList;

public class ContatoRepositorio {
	private static int count = 1;
	private static ArrayList<Contato> contatos = new ArrayList<>();
	
	
	public boolean adicionarContato(Contato contato) {
		boolean resultado = false;
		if(contato != null){
			contato.setId(count++);
			resultado = contatos.add(contato);
		}
		
		return resultado;
	}

	public ArrayList<Contato> buscarTodos() {
		return contatos;
	}

}