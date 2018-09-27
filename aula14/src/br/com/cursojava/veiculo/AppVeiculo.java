package br.com.cursojava.veiculo;

import java.util.Scanner;

import br.com.cursojava.CadastroContato;

public class AppVeiculo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CadastroVeiculo cadastro = new CadastroVeiculo();
		cadastro.mostrarMenu(teclado);
		teclado.close();
	}
}
