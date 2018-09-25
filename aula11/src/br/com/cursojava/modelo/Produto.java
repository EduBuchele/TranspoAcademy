package br.com.cursojava.modelo;

public class Produto {

	private String nome;
	private double preco;
	private boolean promocao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double precoProduto) {
		if (precoProduto >= 0.01) {
			this.preco = precoProduto;
		} else {
			System.out.println("Tentativa de inserir Valor Invalido!!" + precoProduto);
		}
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}

	public boolean isPromocao() {
		return promocao;
	}

	@Override
	public String toString() {
		return this.nome;
	}

}
