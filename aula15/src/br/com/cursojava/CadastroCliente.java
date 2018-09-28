package br.com.cursojava;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {

	ControllerCliente controller = new ControllerCliente();

	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;
		do {
			System.out.println("*****Menu de CLientes*****");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Lista de Clientes");
			System.out.println("3 - Pesquisa por Tipo");
			System.out.println("4 - Pesquisa por Cidade");
			System.out.println("5 - Remover Cliente");
			System.out.println("6 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(teclado, opcao);
		} while (opcao != 6);
	}

	private void tratarOpcao(Scanner teclado, int opcao) {

		switch (opcao) {
		case 1:
			cadastroCliente(teclado);
			break;
		case 2:
			listarClientes();
			break;
		case 3:
			pesquisaTipo(teclado);
			break;
		case 4:
			pesquisaCidade(teclado);
			break;
		case 5:
			removerCliente(teclado);
			break;
		case 6:
			System.out.println("Obrigado por usar nosso Sistema!");
			break;
		default:
			System.out.println("Opção Inválida!");
		}
	}

	private void pesquisaCidade(Scanner teclado) {
		String pesquisa = "";
		do {
			System.out.println("Qual cidade você gostaria de pesquisar?");
			pesquisa = teclado.nextLine();
		} while (!controller.isVazio(pesquisa));
		ArrayList<Cliente> lista = controller.listaCidade(pesquisa);
		System.out.println("###### Lista de Clientes por cidade " + pesquisa + " ######");
		if (lista.isEmpty()) {
			System.out.println("Não houve resultados para esta busca.");
		} else {
			for (Cliente cliente : lista) {
				System.out.printf("%d - %s - %s - %s - %s \n", cliente.getId(), cliente.getNome(), cliente.getEmail(),
						cliente.getTelefone(), cliente.getTipo());
			}
		}

	}

	private void removerCliente(Scanner teclado) {
		int pesquisa = 0;
		do {
			System.out.println("Qual o ID do client que você gostaria de remover?");
			pesquisa = Integer.parseInt(teclado.nextLine());
		} while (!controller.isVazioInt(pesquisa));
		controller.removerCliente(pesquisa);
	}

	private void pesquisaTipo(Scanner teclado) {
		String pesquisa = "";
		do {
			System.out.println("Qual tipo você gostaria de pesquisar? (SILVER, GOLD ou PLATINUM)");
			pesquisa = teclado.nextLine();
		} while (!controller.isTipoValido(pesquisa));
		ArrayList<Cliente> lista = controller.listaTipo(pesquisa);
		System.out.println("###### Lista de Clientes por Tipo " + pesquisa + " ######");
		if (lista.isEmpty()) {
			System.out.println("Não houve resultados para esta busca.");
		} else {
			for (Cliente cliente : lista) {
				System.out.printf("%d - %s - %s - %s - %s \n", cliente.getId(), cliente.getNome(), cliente.getEmail(),
						cliente.getTelefone(), cliente.getTipo());
			}
		}
	}

	private void listarClientes() {
		System.out.println("###### Lista de Clientes ######");
		ArrayList<Cliente> lista = new ArrayList<>();
		lista = controller.listarClientes();
		if (!lista.isEmpty()) {
			for (Cliente cliente : lista) {
				System.out.printf("%d - %s - %s - %s - %s \n", cliente.getId(), cliente.getNome(), cliente.getEmail(),
						cliente.getTelefone(), cliente.getTipo());
				System.out.printf("Rua: %s, nº %d, %s \nbairro: %s, cidade: %s / %s CEP: %s.\n",
						cliente.getEndereço().getRua(), cliente.getEndereço().getNumero(),
						cliente.getEndereço().getComplemento(), cliente.getEndereço().getBairro(),
						cliente.getEndereço().getCidade(), cliente.getEndereço().getEstado(),
						cliente.getEndereço().getCep());
				System.out.println("-------------------------------------------------------------");
			}
		} else {
			System.out.println("Não houve resultado!");
		}

	}

	private void cadastroCliente(Scanner teclado) {
		String nome = "";
		String email = "";
		String telefone = "";
		String tipo = "";

		String rua = "";
		int numero = 0;
		String complemento = "";
		String bairro = "";
		String cidade = "";
		String cep = "";
		String estado = "";

		System.out.println("###### Cadastro de Clientes ######");
		do {
			System.out.println("Informe o nome: ");
			nome = teclado.nextLine();
		} while (!controller.isNomeValido(nome));

		System.out.println("Informe o email: ");
		email = teclado.nextLine();
		System.out.println("Informe o telefone: ");
		telefone = teclado.nextLine();
		do {
			System.out.println("Informe o tipo: ");
			tipo = teclado.nextLine();
		} while (!controller.isTipoValido(tipo));
		System.out.println("### Cadastro de Endereço ###");
		do {
			System.out.println("Informe a Rua: ");
			rua = teclado.nextLine();
		} while (!controller.isVazio(rua));
		do {
			System.out.println("Informe o numero: ");
			numero = Integer.parseInt(teclado.nextLine());
		} while (!controller.isVazioInt(numero));
		System.out.println("Informe o complemento(opcional): ");
		complemento = teclado.nextLine();
		do {
			System.out.println("Informe a bairro: ");
			bairro = teclado.nextLine();
		} while (!controller.isVazio(bairro));
		do {
			System.out.println("Informe a cidade: ");
			cidade = teclado.nextLine();
		} while (!controller.isVazio(cidade));
		do {
			System.out.println("Informe a CEP: ");
			cep = teclado.nextLine();
		} while (!controller.isVazio(cep));
		do {
			System.out.println("Informe a estado: ");
			estado = teclado.nextLine();
		} while (!controller.isVazio(estado));
		if (controller.cadatrarCliente(nome, email, telefone, tipo, rua, numero, complemento, bairro, cidade, cep,
				estado)) {
			System.out.println("Cliente cadastrado com sucesso.");
		} else {
			System.out.println("Não foi possível cadastrar.");
		}

	}

}
