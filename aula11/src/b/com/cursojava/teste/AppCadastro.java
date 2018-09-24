package b.com.cursojava.teste;

import java.util.Scanner;

public class AppCadastro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		CadastroProdutos cadastro = new CadastroProdutos();
		cadastro.mostrarMenu(teclado);

		teclado.close();

	}
}
