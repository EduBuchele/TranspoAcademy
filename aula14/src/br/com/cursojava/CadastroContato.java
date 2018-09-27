package br.com.cursojava;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContato {

	private static final int FILTRAR_TELEFONE = 4;
	private static final int FILTRAR_NOME = 3;
	private static final int LISTAR = 2;
	private static final int NOVO = 1;
	private static final int SAIR = 5;
	private ContatoController controller = new ContatoController();

	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;
		
		do{
			System.out.println("MENU Principal");
			System.out.println("1 - Cadastrar Contato");
			System.out.println("2 - Listar Contato");
			System.out.println("3 - Pesquisar por nome");
			System.out.println("4 - Pesquisar por telefone");
			System.out.println("5 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao,teclado);
		}while(opcao != SAIR);
		
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case NOVO:
			novoContato(teclado);
			break;
		case LISTAR:
			listarContatos();
			
			break;
		case FILTRAR_NOME:
			filtrarPorNome(teclado);
			break;
		case FILTRAR_TELEFONE:
			System.out.println("Tem que filtrar por telefone");
			break;
		case SAIR:
			System.out.println("Obrigado por usar nosso sistema");
			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}
		
	}

	private void filtrarPorNome(Scanner teclado) {
		System.out.println("======== FILTRAR POR NOME =============");
		System.out.println("Nome:");
		String nome = teclado.nextLine();
		ArrayList<Contato> lista = controller.filtrarPorNome(nome);
		for (Contato contato : lista) {
			System.out.printf("%d - %s - %s - %s \n",contato.getId(),contato.getNome(),contato.getEmail(),contato.getTelefone());
		}
		
	}

	private void listarContatos() {
		ArrayList<Contato> lista = controller.buscarTodos();
		System.out.println("======== LISTA DE CONTATOS =============");
		for (Contato contato : lista) {
			System.out.printf("%d - %s - %s - %s \n",contato.getId(),contato.getNome(),contato.getEmail(),contato.getTelefone());
		}
		
	}

	private void novoContato(Scanner teclado) {
		System.out.println("======== NOVO CONTATO =============");
		String nome;
		do{
			System.out.println("Nome:");
			nome = teclado.nextLine();
		}while(!controller.isNomeValido(nome));
		
		System.out.println("Email:");
		String email = teclado.nextLine();
		System.out.println("Telefone:");
		String telefone = teclado.nextLine();
		
		boolean ok = controller.adicionarContato(nome,email,telefone);
		if(ok){
			System.out.println("Contato adicionado com sucesso");
		}else{
			System.out.println("Não foi possível adicionar o contato");
		}
		
		
	}

}