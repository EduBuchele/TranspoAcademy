package br.com.cursojava;

import java.util.ArrayList;

public class RepositorioCliente {
	ArrayList<Cliente> clientes = new ArrayList<>();
	private static int count = 100;

	public boolean cadastarCliente(Cliente cliente) {
		boolean resultado = false;
		if (cliente != null) {
			cliente.setId(count++);
			clientes.add(cliente);
			resultado = true;
		}
		return resultado;
	}

	public ArrayList<Cliente> listarClientes() {
		return clientes;
	}

	public boolean removeCliente(Cliente clienteRemove) {
		boolean ok = false;
		if (clienteRemove != null) {
			ok = clientes.remove(clienteRemove);
			System.out.println("O cliente " + clienteRemove.getNome() + " foi removido com sucesso!!");

		}
		return ok;
	}

}
