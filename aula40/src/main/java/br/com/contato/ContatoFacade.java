package br.com.contato;

import java.util.List;

public class ContatoFacade {

	private RepositorioContato repositorio = new RepositorioContato();
	
	public Contato carregarContato(Integer id) {
		return repositorio.buscarPorId(id);
	}

	public List<Contato> carregarContatos() {
		return repositorio.buscarTodos();
	}

	public Contato novoContato() {
		return new Contato();
	}

	public boolean salvar(Contato contatoAtual) {
		boolean ok = false;
		if(contatoAtual.getId()==null) {
			ok = repositorio.salvar(contatoAtual);
		}else {
			ok = repositorio.atualizar(contatoAtual);
		}
		
		return ok;
	}

	public boolean removerContato(Contato contatoAtual) {
		return repositorio.remover(contatoAtual.getId());
	}

}
