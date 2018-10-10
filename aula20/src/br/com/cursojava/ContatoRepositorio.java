package br.com.cursojava;

import java.util.ArrayList;
import java.util.List;

public class ContatoRepositorio {

	List<Contato> contatos = new ArrayList<Contato>();

	public boolean adicionarContato(Contato contato) {
		boolean resultado = false;
		if (contato != null) {
			System.out.println("Adicionando Contato");
			try {
				resultado = contatos.add(contato);
			} catch (NullPointerException e) {
				System.out.println("Erro ao cadastrar");
			}
		}
		return resultado;
	}

	public boolean removerContato(int idRemover) {
		boolean resultado = false;
		Contato contatoRemove = new Contato();
		if (idRemover > 0) {
			for (Contato contato : this.contatos) {
				if (contato.getId() == idRemover) {
					contatoRemove = contato;
				}
			}
		}
		resultado = contatos.remove(contatoRemove);
		return resultado;
	}

	public ArrayList<Contato> buscarContatos() {
		return (ArrayList<Contato>) contatos;

	}

}
