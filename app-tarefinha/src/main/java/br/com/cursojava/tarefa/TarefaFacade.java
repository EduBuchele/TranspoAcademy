package br.com.cursojava.tarefa;

import java.util.List;

import br.com.cursojava.situacao.Situacao;
import br.com.cursojava.situacao.SituacaoRepositorio;
import br.com.cursojava.situacao.TipoSituacao;

public class TarefaFacade {

	TarefaRepositorio repositorioTarefa = new TarefaRepositorio(Tarefa.class);
	SituacaoRepositorio repositorioSituacao = new SituacaoRepositorio(Situacao.class);

	public Tarefa novaTarefa() {
		return new Tarefa();
	}

	public Tarefa carregarTarefa(Integer id) {
		return repositorioTarefa.buscarPorId(id);
	}

	public boolean salvar(Tarefa tarefaAtual) {
		boolean ok = false;
		if (tarefaAtual.getId() == null) {
			ok = repositorioTarefa.inserir(tarefaAtual);
		} else {
			ok = repositorioTarefa.atualizar(tarefaAtual);
		}
		return ok;
	}

	public boolean removerTarefa(Tarefa tarefaAtual) {
		return repositorioTarefa.remover(tarefaAtual.getId());
	}

	public List<Tarefa> carregarTarefas() {
		return repositorioTarefa.buscarTodos();
	}

	public long contarPorCategoria(String categoria) {
		return repositorioTarefa.contarPorCategoria(categoria);
	}

	public List<Tarefa> carregarTarefas(String categoria) {

		return repositorioTarefa.carregarTarefasCat(categoria);
	}

	public void concluirTarefa(Integer idTarefa) {
		Tarefa tarefa = repositorioTarefa.buscarPorId(idTarefa);
		TipoSituacao tipo = tarefa.getSituacao().getTipo();
		Situacao situacaoConcluida = repositorioSituacao.buscarPorNome("CONCLUIDA", tipo);
		tarefa.setSituacao(situacaoConcluida);
		repositorioTarefa.atualizar(tarefa);

	}

}
