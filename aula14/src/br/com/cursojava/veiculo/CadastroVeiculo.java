package br.com.cursojava.veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroVeiculo {

	private static final int SAIR = 8;
	VeiculoController controller = new VeiculoController();

	public void mostrarMenu(Scanner teclado) {

		int escolha = 0;

		do {
			System.out.println("*****Sistema Cadastro de Veiculos*****");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Lista de Veiculos");
			System.out.println("3 - Pesquisa por Marca");
			System.out.println("4 - Pesquisa por Modelo");
			System.out.println("5 - Pesquisa por Placa");
			System.out.println("6 - Pesquisa por Ano Fabricação");
			System.out.println("7 - Remover Veiculo");
			System.out.println("8 - Sair");
			escolha = Integer.parseInt(teclado.nextLine());
			tratarEscolha(escolha, teclado);

		} while (escolha != SAIR);
	}

	private void tratarEscolha(int escolha, Scanner teclado) {
		switch (escolha) {
		case 1:
			cadastroVeiculos(teclado);
			break;
		case 2:
			listaVeiculos();
			break;
		case 3:
			pesquisaVeiculoMarca(teclado);
			break;
		case 4:
			pesquisaVeiculoModelo(teclado);
			break;
		case 5:
			pesquisaVeiculoPlaca(teclado);
			break;
		case 6:
			pesquisaVeiculoAnofab(teclado);
			break;
		case 7:
			removeVeiculo(teclado);
			break;
		case 8:
			System.out.println("Obrigado por usar nosso sistema!");
			break;
		default:
			System.out.println("Opção Invalida");
		}
	}

	private void removeVeiculo(Scanner teclado) {
		System.out.println("Digite o ID do veiculo: ");
		int id = Integer.parseInt(teclado.nextLine());
		boolean ok = controller.removeVeiculo(id);
		if (ok) {
			System.out.println("Veiculo Removido com Sucesso!");
		} else {
			System.out.println("Não foi possivel Remover!");
		}

	}

	private boolean cadastroVeiculos(Scanner teclado) {
		boolean ok = false;
		String marca = "";
		String modelo = "";
		String placa = "";
		int anoFabricacao = 0;
		int anoModelo = 0;

		System.out.println("*****Cadastro de Veiculos*****");
		do {
			System.out.println("Digite a marca do veiculo: ");
			marca = teclado.nextLine();
		} while (!controller.isMarcaValida(marca));

		do {
			System.out.println("Digite a modelo do veiculo: ");
			modelo = teclado.nextLine();
		} while (!controller.isModeloValida(modelo));

		do {
			System.out.println("Digite a placa do veiculo: ");
			placa = teclado.nextLine();
		} while (!controller.isPlacaValida(placa));

		do {
			System.out.println("Digite o ano Fabricação do veiculo: ");
			anoFabricacao = Integer.parseInt(teclado.nextLine());
		} while (!controller.isAnoFabValido(anoFabricacao));

		do {
			System.out.println("Digite o ano Modelo do veiculo: ");
			anoModelo = Integer.parseInt(teclado.nextLine());
		} while (!controller.isAnoModValido(anoFabricacao, anoModelo));

		System.out.println("Digite a cor do veiculo: ");
		String cor = teclado.nextLine();

		ok = controller.CadastrarVeiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor);
		if (ok) {
			System.out.println("### Veiculo Cadastrado com Sucesso!!! ###");
		} else {
			System.out.println("### Não foi possivel adicionar o Veiculo! ###");
		}
		return ok;
	}

	private void listaVeiculos() {
		System.out.println("*****Lista de Veiculos*****");
		ArrayList<Veiculo> veiculos = controller.getListaVeiculo();
		if (veiculos.size() == 0) {
			System.out.println("Não há veiculos cadastrados!");
		} else {
			for (Veiculo veiculo : veiculos) {
				System.out.println("ID: " + veiculo.getId() + " | Modelo: " + veiculo.getModelo() + " | marca: "
						+ veiculo.getMarca() + " | Cor:" + veiculo.getCor() + " | Ano Modelo: "
						+ veiculo.getAnoModelo());
			}
		}
	}

	private void pesquisaVeiculoMarca(Scanner teclado) {
		System.out.println("Digite a Marca desejada: ");
		String marca = teclado.nextLine();
		ArrayList<Veiculo> lista = controller.buscaVeiculoMarca(marca);
		if (lista.size() == 0) {
			System.out.println("Não houve resultados para esta busca.");
		}
		for (Veiculo veiculo : lista) {
			System.out.println(
					"Marca: " + veiculo.getMarca() + " Modelo: " + veiculo.getModelo() + " Cor: " + veiculo.getCor());
		}
	}

	private void pesquisaVeiculoModelo(Scanner teclado) {
		System.out.println("Digite a Modelo desejada: ");
		String modelo = teclado.nextLine();
		ArrayList<Veiculo> lista = controller.buscaVeiculoModelo(modelo);
		if (lista.size() == 0) {
			System.out.println("Não houve resultados para esta busca.");
		}
		for (Veiculo veiculo : lista) {
			System.out.println(
					"Marca: " + veiculo.getMarca() + " Modelo: " + veiculo.getModelo() + " Cor: " + veiculo.getCor());
		}
	}

	private void pesquisaVeiculoPlaca(Scanner teclado) {
		System.out.println("Digite a Placa desejada: ");
		String placa = teclado.nextLine();
		ArrayList<Veiculo> lista = controller.buscaVeiculoPlaca(placa);
		if (lista.size() == 0) {
			System.out.println("Não houve resultados para esta busca.");
		}
		for (Veiculo veiculo : lista) {
			System.out.println("Placa: " + veiculo.getPlaca() + " Marca: " + veiculo.getMarca() + " Modelo: "
					+ veiculo.getModelo() + " Cor: " + veiculo.getCor());
		}
	}

	private void pesquisaVeiculoAnofab(Scanner teclado) {

		System.out.println("Digite o Ano Fabricação desejado: ");
		int ano = Integer.parseInt(teclado.nextLine());
		ArrayList<Veiculo> lista = controller.buscaVeiculoAnoFab(ano);
		if (lista.size() == 0) {
			System.out.println("Não houve resultados para esta busca.");
		}
		for (Veiculo veiculo : lista) {
			System.out.println("Ano Fab: " + veiculo.getAnoFabricacao() + " Marca: " + veiculo.getMarca() + " Modelo: "
					+ veiculo.getModelo() + " Cor: " + veiculo.getCor());
		}
	}

}
