package b.com.cursojava.teste;

import java.util.Scanner;

import b.com.cursojava.exercicio.Produto;

public class CadastroProdutos {
	
	private Produto[] produtos = new Produto[50];
	private int quantidade = 0;

	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;
		do {

			System.out.println("==========MENU de Produtos==========");
			
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos ");
			System.out.println("3 - Sair ");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
			
		} while (opcao != 3);
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
		Produto p = new Produto();
		p.setNomeProduto(nome);
		p.setPrecoProduto(preco);
		if (quantidade < produtos.length) {
			produtos[quantidade++] = p;
		} else {
			System.out.println("Quantidade maxima de produtos já cadastrados.");
		}

	}

	private void listarProduto(Scanner teclado) {

		System.out.println("==========Lista de Produtos==========");
		Produto atual = null;
		for (int index = 0; index < quantidade; index++) {
			atual = produtos[index];
			System.out.printf("%d - %.2f - %s \n", index + 1, atual.getPrecoProduto(), atual.getNomeProduto());
		}

	}

}
