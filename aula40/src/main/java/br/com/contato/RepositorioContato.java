package br.com.contato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RepositorioContato {
	
	private static List<Contato> lista = new ArrayList<>();
	private static int contador = 1;
	
	public List<Contato> buscarTodos(){
		return Collections.unmodifiableList(lista);
	}
	
	public Contato buscarPorId(Integer id) {
		Optional<Contato> first = lista
		.stream()
		.filter(contato -> id!=null && id.equals(contato.getId()))
		.findFirst();
		return first.isPresent() ? first.get() : null;
	}
	
	public boolean salvar(Contato contato) {
		boolean resultado = false;
		if(contato.getId() == null ) {
			resultado =  inserir(contato);
		}else {
			resultado = atualizar(contato);
		}
		return resultado;
	}

	public boolean atualizar(Contato contato) {
		boolean resultado = false;
		int indexOf = lista.indexOf(contato.getId());
		if(indexOf > -1) {
			lista.set(indexOf, contato);
			resultado = true;
		}
		return resultado;
	}

	public boolean inserir(Contato contato) {
		contato.setId(contador++);
		return lista.add(contato);
	}
	
	public boolean remover(Integer id) {
		int maior = lista.size();
		lista = lista.stream()
				.filter(contato -> id != null && !id.equals(contato.getId()))
				.collect(Collectors.toList());
		return maior > lista.size();
	}

}
