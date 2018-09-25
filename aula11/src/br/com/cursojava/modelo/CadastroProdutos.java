package br.com.cursojava.modelo;

import java.util.Scanner;

import br.com.cursojava.ProdutoController;

public class CadastroProdutos {

	private static final int SAIR = 5;
	ProdutoController controller = new ProdutoController();

	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;
		do {
			System.out.println("==========MENU de Produtos==========");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos ");
			System.out.println("3 - Soma dos preços de todos produtos ");
			System.out.println("4 - Filtrar produtos por Preço ");
			System.out.println("5 - Sair ");
			opcao = Integer.parseInt(teclado.nextLine());

			tratarOpcao(opcao, teclado);

		} while (opcao != SAIR);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			cadastrarProduto(teclado);
			break;
		case 2:
			listarProduto(teclado);
			break;
		case 3:
			somarPrecosProdutos();
			break;
		case 4:
			filtrarPorPreco(teclado);
			break;
		case 5:
			System.out.println("Obrigado por usar nossos terminais!");
			break;
		default:
			System.out.println("Opção Invalida!");
		}

	}

	private void cadastrarProduto(Scanner teclado) {
		System.out.println("Informe o nome do produto: ");
		String nome = teclado.nextLine();
		System.out.println("Informe o preco do produto: ");
		double preco = Double.parseDouble(teclado.nextLine());
		boolean ok = controller.adicionar(nome, preco);
		if (ok) {
			System.out.println("Produto adicionado com sucesso!");
		} else {
			System.out.println("Não foi possivel adicionar o produto.");
		}

	}

	private void listarProduto(Scanner teclado) {

		System.out.println("==========Lista de Produtos==========");
		System.out.println("ID | Valor | Descrição");
		Produto atual = null;
		Produto[] produtos = controller.listarProdutos();

		for (int index = 0; index < produtos.length; index++) {
			atual = produtos[index];
			System.out.printf("%d  | %.2f | %s \n", index + 1, atual.getPreco(), atual.getNome());
		}
	}

	private void somarPrecosProdutos() {
		System.out.println("==========Soma do Preço dos Produtos==========");
		double soma = controller.somaProduto();
		System.out.printf("A soma dos preços é: %.2f: \n", soma);
	}

	private void filtrarPorPreco(Scanner teclado) {
		System.out.println("Informe o valor minimo: ");
		double precoMinimo = Double.parseDouble(teclado.nextLine());
		System.out.println("==========Lista de Produtos Filtrados==========");
		System.out.println("Valor | Descrição");
		Produto[] produtos = controller.listarProdutosPorPrecoMinimo(precoMinimo);
		if (produtos != null && produtos.length > 0) {
			for (Produto atual : produtos) {
				System.out.printf("%.2f | %s \n", atual.getPreco(), atual.getNome());
			}
		} else
			System.out.println("Não existem produtos com o preço mínimo informado");

	}
}
