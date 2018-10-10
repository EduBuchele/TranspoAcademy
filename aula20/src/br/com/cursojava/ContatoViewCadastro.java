package br.com.cursojava;

import java.util.Scanner;

public class ContatoViewCadastro {

	ContatoController controller = new ContatoController();

	public void viewMenu(Scanner teclado) {
		int escolha = 0;
		do {
			System.out.println("##### MENU #####");
			System.out.println("1 - Listar todos Contatos");
			System.out.println("2 - Cadastrar Novo Contato");
			System.out.println("3 - Remover Contato");
			System.out.println("4 - Pesquisar por Nome");
			System.out.println("5 - Sair");
			try {
				escolha = Integer.parseInt(teclado.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Aceito apenas Digito numerais.");
			}
			tratarEscolha(escolha, teclado);

		} while (escolha != 5);
	}

	private void tratarEscolha(int escolha, Scanner teclado) {

		switch (escolha) {
		case 1:
			System.out.println("##### LISTA DE CONTATOS #####");
			controller.listarContatos();
			break;
		case 2:
			System.out.println("##### CADASTRAR NOVO CONTATO #####");
			if (controller.cadastrarContato(teclado)) {
				System.out.println("Contato Cadastrato com Sucesso!!!");
			} else {
				System.out.println("Não foi possivel fazer o Cadastro, tente novamente.");
			};
			break;
		case 3:
			System.out.println("##### REMOVER CONTATO #####");
			if (controller.removerContato(teclado)) {
				System.out.println("Contato Removido com Sucesso!!!");
			} else {
				System.out.println("Não foi possivel remover o Contato. Verifique o ID e tente novamente.");
			};
			break;
		case 4:
			System.out.println("##### PESQUISA POR NOME #####");
			controller.pesquisaNome(teclado);			
			break;
		case 5:
			System.out.println("Obrigado por usar nossos terminais!!!");
			break;
		default:
			System.out.println("Opção Inválida, tente novamente!");

		}

	}

}
