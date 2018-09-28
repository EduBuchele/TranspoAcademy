package br.com.cursojava;

import java.util.ArrayList;

public class ControllerCliente {
	RepositorioCliente repositorio = new RepositorioCliente();

	public boolean cadatrarCliente(String nome, String email, String telefone, String tipo, String rua, int numero,
			String complemento, String bairro, String cidade, String cep, String estado) {
		boolean resultado = false;
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setTelefone(telefone);
		cliente.setTipo(tipo.toUpperCase());

		endereco.setRua(rua);
		endereco.setNumero(numero);
		endereco.setComplemento(complemento);
		endereco.setBairro(bairro);
		endereco.setCidade(cidade.toUpperCase());
		endereco.setCep(cep);
		endereco.setEstado(estado);

		cliente.setEndereço(endereco);
		resultado = repositorio.cadastarCliente(cliente);
		return resultado;
	}

	public ArrayList<Cliente> listarClientes() {
		if(repositorio.listarClientes() == null) {
			System.out.println("Não foi encontrado nenhum resultado!");
		}
		return repositorio.listarClientes();
	}

	public boolean isNomeValido(String nome) {
		boolean valido = nome != null && !"".equals(nome.trim()) && nome.length() >= 3;
		if (!valido) {
			System.out.println("O nome deve conter 3 caracteres e não pode ser vazio!");
		}
		return valido;
	}

	public boolean isTipoValido(String tipo) {
		boolean valido = tipo.toUpperCase().equals("SILVER") || tipo.toUpperCase().equals("GOLD")
				|| tipo.toUpperCase().equals("PLATINUM");
		if (!valido) {
			System.out.println("O tipo deve ser: SILVER, GOLD ou PLATINUM.");
		}
		return valido;
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

	public ArrayList<Cliente> listaTipo(String pesquisa) {
		ArrayList<Cliente> listaCompleta = repositorio.listarClientes();
		ArrayList<Cliente> listaFiltrada = new ArrayList<>();
		pesquisa = pesquisa.toUpperCase();
		for (Cliente cliente : listaCompleta) {
			if (pesquisa.equals(cliente.getTipo())) {
				listaFiltrada.add(cliente);
			}

		}
		return listaFiltrada;
	}

	public ArrayList<Cliente> listaCidade(String pesquisa) {
		ArrayList<Cliente> listaCompleta = repositorio.listarClientes();
		ArrayList<Cliente> listaFiltrada = new ArrayList<>();
		pesquisa = pesquisa.toUpperCase();
		for (Cliente cliente : listaCompleta) {
			if (pesquisa.equals(cliente.getEndereço().getCidade())) {
				listaFiltrada.add(cliente);
			}else {
				System.out.println("Não foi encontrado nenhum resultado!");
			}

		}
		return listaFiltrada;
	}

	public boolean removerCliente(int pesquisa) {
		ArrayList<Cliente> listaCompleta = repositorio.listarClientes();
		Cliente clienteRemove = null;

		for (Cliente cliente : listaCompleta) {
			if (pesquisa == cliente.getId()) {
				clienteRemove = cliente;
			}
		}
		if (clienteRemove == null) {
			System.out.println("Não foi encontrado nenhum cliente com este ID.");
		}

		return repositorio.removeCliente(clienteRemove);

	}

}
