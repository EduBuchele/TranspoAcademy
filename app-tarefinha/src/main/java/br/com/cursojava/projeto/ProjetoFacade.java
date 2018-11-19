package br.com.cursojava.projeto;

import java.util.List;


import br.com.cursojava.utils.CrudRepository;

public class ProjetoFacade {
	CrudRepository<Projeto> repositorio = new ProjetoRepositorio(Projeto.class);

	public Projeto novoProjeto() {
		return new Projeto();
	}

	public Projeto carregarProjeto(Integer id) {
		return repositorio.buscarPorId(id);
	}

	public boolean salvar(Projeto projetoAtual) {
		boolean ok = false;
		if (projetoAtual.getId() == null) {
			ok = repositorio.inserir(projetoAtual);
		} else {
			ok = repositorio.atualizar(projetoAtual);
		}
		return ok;
	}

	public boolean removerProjeto(Projeto projetoAtual) {
		boolean ok = false;
		projetoAtual.setStatus(ProjetoStatus.INATIVO);
		repositorio.atualizar(projetoAtual);
		 ok = repositorio.buscarPorId(projetoAtual.getId()).getStatus().equals(ProjetoStatus.INATIVO); 
		return ok;
	}

	public List<Projeto> carregarProjetos() {
		return repositorio.buscarTodos();
	}
}
