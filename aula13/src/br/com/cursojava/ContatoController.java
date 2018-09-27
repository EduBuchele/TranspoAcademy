package br.com.cursojava;

import java.util.Arrays;

public class ContatoController {

	private ContatoRepositorio repositorio = new ContatoRepositorio();

	public boolean validarNome(String nome) {
		boolean resultado = true;
		if (nome != null && !"".equals(nome.trim()) && nome.length() >= 3) {
			resultado = false;
		} else {
			System.out.println("O nome deve conter no minimo 3 Caracteres e não pode ser vazio");
		}
		return resultado;
	}

	public boolean remover(int id) {
		boolean resultado = false;
		if (id > -1 && id <= repositorio.buscarTodos().length) {
			resultado = repositorio.remover(id - 1);
		}
		return resultado;
	}

	public boolean adicionar(String nome, String email, String telefone) {
		boolean resultado = false;

		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);

		resultado = repositorio.inserir(contato);

		return resultado;
	}

	public Contato getContato(int index) {
		Contato[] contatos = repositorio.buscarTodos();
		Contato resultado = null;
		if (index > -1 && index < contatos.length) {
			resultado = contatos[index];
		}
		return resultado;
	}

	public Contato[] listarContatos() {
		return repositorio.buscarTodos();
	}

	public Contato[] listarPesquisaNome(String nomePesquisa) {
		Contato[] lista = listarContatos();
		Contato[] listaPorNomes = new Contato[lista.length];
		int quantidade = 0;
//			Filtra ignorando Maisucula e Minuscula
//		for (Contato contato : lista) {
//			if (contato.getNome().equalsIgnoreCase(nomePesquisa)) {
//				listaPorNomes[quantidade++] = contato;
//			}
//		}
//		listaPorNomes = Arrays.copyOf(listaPorNomes, quantidade);
//		return listaPorNomes;
		for (Contato contato : lista) {
			if (contato != null && contato.getNome() != null && contato.getNome().startsWith(nomePesquisa)) {
				listaPorNomes[quantidade++] = contato;
				
			}
		}
		return Arrays.copyOf(listaPorNomes,	quantidade);

	}

	public Contato[] listarPesquisaTelefone(String telefonePesquisa) {
		Contato[] lista = repositorio.buscarTodos();
		Contato[] listaPorTelefone = new Contato[lista.length];
		int quantidade = 0;
		for (Contato contato : lista) {
			if (contato.getTelefone().equals(telefonePesquisa)) {
				listaPorTelefone[quantidade++] = contato;
			}
		}
		listaPorTelefone = Arrays.copyOf(listaPorTelefone, quantidade);
		return listaPorTelefone;
	}

}
