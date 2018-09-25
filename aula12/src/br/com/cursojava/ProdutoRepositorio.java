package br.com.cursojava;


import br.com.cursojava.Produto;

public class ProdutoRepositorio {

	private Produto[] produtos = new Produto[50];
	private int quantidade = 0;

	public boolean inserir (Produto produto) {
		boolean resultado = false;
		if (produto != null) {
			if (quantidade < produtos.length) {
				produtos[quantidade++] = produto;
				resultado = true;
			}
		}
		return resultado;
	}

	public Produto[] buscarTodos() {
		Produto[] resultado = new Produto[quantidade];
		for (int index = 0; index < quantidade; index++) {
			resultado[index] = produtos[index];
		}
		return resultado;
	}

	public boolean remover(int index) {
		boolean resultado = false;
		if (index < quantidade && index > -1) {
			produtos[index] = null;
			resultado = true;
		}
		return resultado;
	}
}
