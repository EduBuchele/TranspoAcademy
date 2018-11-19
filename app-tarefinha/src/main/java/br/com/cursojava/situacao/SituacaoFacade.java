package br.com.cursojava.situacao;

import java.util.List;

import br.com.cursojava.utils.CrudRepository;

public class SituacaoFacade {

	CrudRepository<Situacao> repositorio = new SituacaoRepositorio(Situacao.class);

	public Situacao novaSituacao() {
		return new Situacao();
	}

	public Situacao carregarSituacao(Integer id) {
		return repositorio.buscarPorId(id);
	}

	public boolean salvar(Situacao situacaoAtual) {
		boolean ok = false;
		if (situacaoAtual.getId() == null) {
			ok = repositorio.inserir(situacaoAtual);
		} else {
			ok = repositorio.atualizar(situacaoAtual);
		}
		return ok;
	}

	public boolean removerSituacao(Situacao situacaoAtual) {
		return repositorio.remover(situacaoAtual.getId());
	}

	public List<Situacao> carregarSituacoes() {
		return repositorio.buscarTodos();
	}
}
