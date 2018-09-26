package br.com.cursojava;

public class ContatoRepositorio {

	private static Contato[] contatos = new Contato[50];
	private static int quantidade = 0;
	private static int count = 1;

	public boolean inserir(Contato contato) {
		boolean resultado = false;
		if (contato != null) {
			if (quantidade < contatos.length) {
				contato.setId(count++);
				contatos[quantidade++] = contato;
				resultado = true;
			}
		}
		return resultado;
	}

	public Contato[] buscarTodos() {
		Contato[] resultado = new Contato[quantidade];
		for (int index = 0; index < quantidade; index++) {
			resultado[index] = contatos[index];
		}
		return resultado;
	}

	public boolean remover(int index) {
		boolean resultado = false;
		if (index < quantidade && index > -1) {
			contatos[index].setNome("Cadastro Removido ");
			contatos[index].setId(index);
			contatos[index].setEmail(" ");
			contatos[index].setTelefone(" ");
			resultado = true;
		}
		return resultado;
	}

}
