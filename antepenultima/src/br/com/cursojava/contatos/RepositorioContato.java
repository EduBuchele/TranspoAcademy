package br.com.cursojava.contatos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioContato {

	private static List<Contato> lista = new ArrayList<>();
	private static Integer count = 1;

	static {
		lista.add(new Contato(count++, "João", "joao@teste.com", "3322-2211"));
		lista.add(new Contato(count++, "Maria", "maria@teste.com", "3344-2211"));
		lista.add(new Contato(count++, "José", "jose@teste.com", "3355-5515"));
		lista.add(new Contato(count++, "Adão", "adao@gmail.com", "2244-2211"));
		lista.add(new Contato(count++, "Eva", "eva@bol.com", "3344-5515"));
	}
	
	
	
	public List<Contato> buscaTodos() {
		return lista;
	}

	public Contato buscarPorId(Integer id) {
		Contato contato = null;
		for (Contato atual : lista) {
			if (atual != null && id.equals(atual.getId())) {
				contato = atual;
				break;
			}
		}
		return contato;
	}

	public boolean salvar(Contato contato) {
		boolean resultado = false;
		if (contato != null) {
			if (contato.getId() == null) {
				resultado = inserir(contato);
			} else {
				resultado = atualizar(contato);
			}
		}
		return resultado;

	}

	private boolean inserir(Contato contato) {
		contato.setId(count++);
		return lista.add(contato);
	}

	private boolean atualizar(Contato contato) {
		int idx = lista.indexOf(contato);
		boolean resultado = false;
		if (idx > -1) {
			lista.set(idx, contato);
			resultado = true;
		}
		return resultado;
	}

	public boolean remover(Integer id) {
		int quantidade = lista.size();
		lista = lista.stream().filter(c -> !id.equals(c.getId())).collect(Collectors.toList());
		return quantidade > lista.size();
	}

}
