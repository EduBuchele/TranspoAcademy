package br.com.cursojava.exercicio;

import java.util.Scanner;

public class CadastroContato {

	private static final int NOVO_CONTATO = 1;	
	private static final int LISTAR_CONTATOS = 2;
	private static final int FILTRO_NOME = 3;
	private static final int FILTRO_TELEFONE = 4;
	private static final int APAGAR_CONTATO = 5;
	private static final int EDITAR_CONTATO = 6;
	private static final int SAIR = 7;
	
	ContatoController controller = new ContatoController();

	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;
		do {
			System.out.println("********MENU de Contatos********");
			System.out.println("1 - Cadastrar Contato");
			System.out.println("2 - Listar Contatos ");
			System.out.println("3 - Pesquisa por Nomes");
			System.out.println("4 - Pesquisa por Telefone ");
			System.out.println("5 - Apagar Contato ");
			System.out.println("6 - Editar Contato ");
			System.out.println("7 - Sair ");
			opcao = Integer.parseInt(teclado.nextLine());

			tratarOpcao(opcao, teclado);

		} while (opcao != SAIR);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case NOVO_CONTATO:
			cadastrarContato(teclado);
			break;
		case LISTAR_CONTATOS:
			listarContato(teclado);
			break;
		case FILTRO_NOME:
			pesquisaNome(teclado);
			break;
		case FILTRO_TELEFONE:
			pesquisaTelefone(teclado);
			break;
		case APAGAR_CONTATO:
			apagarContato(teclado);
			break;
		case EDITAR_CONTATO:
			editarContato(teclado);
			break;
		case SAIR:
			System.out.println("Obrigado por usar nossos terminais!");
			break;
		default:
			System.out.println("Opção Invalida!");
		}

	}

	private void editarContato(Scanner teclado) {
		System.out.println("Informe o id do contato: ");
		int id = Integer.parseInt(teclado.nextLine());

		Contato atual = controller.getContato(id - 1);
		System.out.printf("%d  | %s| %s| %s \n", atual.getId(), atual.getNome(), atual.getEmail(), atual.getTelefone());
		int opcaoEditar = 0;
		do {
			System.out.println("########Editar Contato########");
			System.out.println("1 - Editar Nome");
			System.out.println("2 - Editar Email");
			System.out.println("3 - Editar Telefone");
			System.out.println("4 - Voltar ao Menu Principal");
			opcaoEditar = Integer.parseInt(teclado.nextLine());
			tratarOpcaoEditar(opcaoEditar, teclado);
		} while (opcaoEditar != 4);
	}

	private void tratarOpcaoEditar(int opcaoEditar, Scanner teclado) {
		switch (opcaoEditar) {
		case 1:
			System.out.println("Editando Nome");
//				editarNome(teclado);
			break;
		case 2:
			System.out.println("Editando Email");
//				editarEmail(teclado);
			break;
		case 3:
			System.out.println("Editando Telefone");
//				editarTelefone(teclado);
			break;
		default:
			System.out.println("Opção Invalida!");
		}
	}

	

	private void apagarContato(Scanner teclado) {
		System.out.println("Informe o id do contato: ");
		int id = Integer.parseInt(teclado.nextLine());

		boolean ok = controller.remover(id);
		if (ok) {
			System.out.println("Contato Apagado com sucesso!");
		} else {
			System.out.println("Não foi possivel remover o contato.");
		}
	}

	private void cadastrarContato(Scanner teclado) {
		boolean nomeValido = false;
		String nome = "";
		do {
			System.out.println("Informe o nome do contato: ");
			nome = teclado.nextLine();
			nomeValido = controller.validarNome(nome);
		} while (nomeValido);

		System.out.println("Informe o email do contato: ");
		String email = teclado.nextLine();
		System.out.println("Informe o telefone do contato: ");
		String telefone = teclado.nextLine();

		boolean ok = controller.adicionar(nome, email, telefone);
		if (ok) {
			System.out.println("Contato adicionado com sucesso!");
		} else {
			System.out.println("Não foi possivel adicionar o contato.");
		}

	}

	private void listarContato(Scanner teclado) {

		System.out.println("==========Lista de Contatos==========");
		System.out.println("ID |Codigo | Nome | Email | Telefone");
		Contato atual = null;
		Contato[] contatos = controller.listarContatos();

		for (int index = 0; index < contatos.length; index++) {
			atual = contatos[index];
			System.out.printf("%d | %s | %s| %s| %s \n", atual.getId(), atual.getCodigo(), atual.getNome(), atual.getEmail(),
					atual.getTelefone());
		}
	}

	private void pesquisaNome(Scanner teclado) {
		System.out.println("Informe o nome do Cadastro: ");
		String nomePesquisa = teclado.nextLine();
		System.out.println("==========Lista de Contatos Filtrados==========");
		System.out.println("Nome | Telefone | Email");
		Contato[] contatos = controller.listarPesquisaNome(nomePesquisa);
		if (contatos != null && contatos.length > 0) {
			for (Contato atual : contatos) {
				System.out.printf(" %s| %s| %s \n", atual.getNome(), atual.getEmail(), atual.getTelefone());
			}
		} else
			System.out.println("Não existem contatos com o nome informado");
	}

	private void pesquisaTelefone(Scanner teclado) {
		System.out.println("Informe o telefone do Cadastro: ");
		String telefonePesquisa = teclado.nextLine();
		System.out.println("==========Lista de Produtos Filtrados==========");
		System.out.println("Telefone | Nome | Email");
		Contato[] contatos = controller.listarPesquisaTelefone(telefonePesquisa);
		if (contatos != null && contatos.length > 0) {
			for (Contato atual : contatos) {
				System.out.printf(" %s| %s| %s \n", atual.getTelefone(), atual.getNome(), atual.getEmail());
			}
		} else
			System.out.println("Não existem contatos com o telefone informado");
	}

}
