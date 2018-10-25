package br.com.cursojava;


import java.util.List;

public class ProdutoController {

	private ProdutoDAO dao = new ProdutoDAO();

	public boolean adicionar(String nome, double preco) {
		boolean resultado = false;
		if (nome != null && !"".equals(nome.trim()) && preco >= 0.01) {
			Produto produto = new Produto();
			produto.setNome(nome);
			produto.setPreco(preco);
			resultado = dao.inserir(produto);
		}
		return resultado;
	}

	public List<Produto> listarProdutos() {
		return dao.buscarTodos();
	}

	public void removerProduto(int index) {

		int quantidade = dao.contar();
		dao.remover(index);
		int atual = dao.contar();
		if (atual < quantidade) {
			System.out.println("O produto foi removido com Sucesso!.");
		} else {
			System.out.println("Não foi possivel remover o produto");
		}
	}

	public boolean isVazio(String campo) {
		boolean valido = campo != null && !"".equals(campo.trim());
		if (!valido) {
			System.out.println("O campo não pode ser Vazio");
		}
		return valido;
	}

	public boolean isVazioInt(int numero) {
		boolean valido = numero >= 0;
		if (!valido) {
			System.out.println("O campo não pode ser Vazio");
		}
		return valido;
	}

	public List<Produto> buscarPorNome(String nome) {
		List<Produto> produtos = dao.buscarPorNome(nome);
		return produtos;
	}

	public List<Produto> buscarPorPreco(double minimo, double maximo) {
		List<Produto> produtos = dao.buscarPorPreco(minimo, maximo);
		return produtos;
	}

	public void atualizarProduto(String nome, double preco, int id) {
		Produto produto = new Produto(id, nome, preco);
		dao.atualizar(produto);

	}

	public boolean idValido(int id) {
		Produto prod = dao.buscarPorId(id);
		if (prod != null && id > 0) {
			return true;
		} else {
			System.out.println("O ID informado não consta no cadastro");
			return false;
		}
	}

}
