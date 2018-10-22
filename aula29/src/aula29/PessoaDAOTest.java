package aula29;

import java.util.List;

public class PessoaDAOTest {

	public static void main(String[] args) {
		PessoaDAO dao = new PessoaDAO();
		
		//Buscando Lista de Pessoas
//		List<Pessoa> listaPessoas = dao.buscarTodos();
//		for (Pessoa pessoa : listaPessoas) {
//			System.out.println(pessoa);
//		}

		//Buscando Pessoas
//		Pessoa p1 = dao.buscaPorId(1);
//		System.out.println(p1);
		
//		for (int i = 1; i<=10;i++) {
//			System.out.println(dao.buscaPorId(i));
//		}

		//Inserindo Registros
//		Pessoa tib = new Pessoa(null, "Tibúrcio");
//		dao.inserir(tib);
//		System.out.println(tib);
		
		//Alterando Dados
//		Pessoa p1 = dao.buscaPorId(9);
//		System.out.println(p1);
//		p1.setNome("Tiburcio da Silva");
//		dao.atualizar(p1);
//		
//		System.out.println(dao.buscaPorId(9));
		
		//Removendo Contato
		dao.remover(9);
		System.out.println(dao.buscarTodos());	}
}
