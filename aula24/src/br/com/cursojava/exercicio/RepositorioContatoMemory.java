package br.com.cursojava.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RepositorioContatoMemory implements RepositorioContato {

	List<Contato> contatos = new ArrayList<Contato>();

	@Override
	public boolean adicionar(Contato contato) {
		boolean resultado = false;
		if (contato != null) {
			resultado = contatos.add(contato);
		}
		return resultado;
	}

	@Override
	public boolean editar(Contato contato) {
		boolean resultado = false;
		int index = -1;
		for (Contato user : contatos) {
			if (contato.getId() == user.getId()) {
				index = contatos.indexOf(contato);
			} 
		}
		if (index >= 0 && index <= contatos.size()) {
			contatos.set(index, contato);
			if (contatos.get(index).equals(contato)) {
				resultado = true;
			}
		} else {
			return false;
		}
		return resultado;
	}

	@Override
	public List<Contato> buscarTodos() {
		return contatos;
	}

	@Override
	public List<Contato> buscarPorNome(String nome) {
		List<Contato> contatosFiltrados = new ArrayList<Contato>();
		if (nome != null) {
			for (Contato contato : contatos) {
				if (contato.getNome().equals(nome)) {
					contatosFiltrados.add(contato);
				}
			}
		}
		return contatosFiltrados;
	}

	@Override
	public List<Contato> buscaPorTelefone(String telefone) {
		List<Contato> ListaPorTelefone = null;
		if (telefone != null) {
			ListaPorTelefone = contatos.stream().filter((Contato contato) -> {
				return contato.getTelefone().equals(telefone);
			}).collect(Collectors.toList());
		}
		return ListaPorTelefone;
	}

	@Override
	public List<Contato> buscaPorTipo(TipoContato tipo) {
		List<Contato> ListaPorTipo = null;
		if (tipo != null) {
			ListaPorTipo = contatos.stream().filter((Contato contato) -> {
				return contato.getTipo().equals(tipo);
			}).collect(Collectors.toList());
		}
		return ListaPorTipo;
	}

	@Override
	public Contato buscaPorId(Integer id) {

		if (id != null) {
			if (id >= 0 && id <= contatos.size()) {
				Optional<Contato> user = contatos.stream().filter((Contato contato) -> {
					return contato.getId().equals(id);
				}).findFirst();
				return user.get();
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	@Override
	public boolean remover(Contato contato) {
		boolean resultado = false;
		if (contato != null) {
			if (contatos.contains(contato)) {
				contatos.remove(contato);
			} else {
				return false;
			}
			resultado = !contatos.contains(contato);
		}
		return resultado;
	}

}
