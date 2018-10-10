package br.com.cursojava;

import java.util.ArrayList;
import java.util.Scanner;

public class ContatoController {

	private static int contador = 100;
	ContatoRepositorio repositorio = new ContatoRepositorio();

	public boolean cadastrarContato(Scanner teclado) {
		System.out.print("Informe o CPF do Contato: ");
		String cpf = teclado.nextLine();
		System.out.print("\nInforme o nome do Contato: ");
		String nome = teclado.nextLine();
		System.out.print("\nInforme o E-mail do Contato: ");
		String email = teclado.nextLine();

		Contato contato = new Contato();
		contato.setId(contador++);
		contato.setCpf(cpf);
		contato.setNome(nome);
		contato.setEmail(email);

		boolean resultado = repositorio.adicionarContato(contato);
		return resultado;

	}

	public void listarContatos() {
		ArrayList<Contato> lista = repositorio.buscarContatos();
		if (lista.isEmpty()) {
			System.out.println("A lista esta vazia.");
		} else {
			for (Contato contato : lista) {
				System.out.println("ID: " + contato.getId() + " Nome: " + contato.getNome());
			}
		}
	}

	public boolean removerContato(Scanner teclado) {
		boolean resultado = false;
		int idContato = 0;
		System.out.print("Informe o ID do Contato: ");
		try {
			idContato = Integer.parseInt(teclado.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Aceito apenas Digitos numerais.");
		}
		resultado = repositorio.removerContato(idContato);

		return resultado;
	}

	public ArrayList<Contato> pesquisaNome(Scanner teclado) {
		ArrayList<Contato> lista = repositorio.buscarContatos();
		ArrayList<Contato> listaFiltro = new ArrayList<Contato>();
		System.out.println("Informe o Nome para pesquisa: ");
		String pesquisa = teclado.nextLine();
		
		if (pesquisa != null) {
			for (Contato contato : lista) {
				if (contato.getNome().equals(pesquisa)) {
					listaFiltro.add(contato);
				}
			}
		} else {
			System.out.println("Nome informado inválido! ");
		}

		if (listaFiltro.isEmpty()) {
			System.out.println("A busca não retornou nenhum resultado");
		} else {
			System.out.println("##### LISTA DE CONTATOS FILTRADOS #####");
			for (Contato contato : listaFiltro) {
				System.out.println("ID: " + contato.getId() + " Nome: " + contato.getNome());
			}
		}
		return listaFiltro;
	}

}
