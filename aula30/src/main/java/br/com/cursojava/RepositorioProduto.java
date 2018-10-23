package br.com.cursojava;

import java.util.List;

public interface RepositorioProduto {
	public List<Produto> buscarTodos();
	public List<Produto> buscarPorNome(String nome);
	public List<Produto> buscarPorPreco (double minimo, double maximo);
	public Produto buscarPorId(Integer id);
	public void inserir(Produto produto);
	public void atualizar(Produto produto);
	public void remover (Integer id);
	public int contar();
}
