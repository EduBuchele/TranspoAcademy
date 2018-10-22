package br.com.cursojava.exercicio;

import java.util.List;

public interface RepositorioContato {

	public abstract List<Contato> buscarTodos();
	public abstract List<Contato> buscarPorNome(String nome);
	public abstract Contato buscarPorTelefone(String telefone);
	public abstract Contato buscarPorId(Integer id);
	public void inserir(Contato contato);
	public void atualizar(Contato contato);
	public void remover(Integer id);
	public int contar();
	
	
}
