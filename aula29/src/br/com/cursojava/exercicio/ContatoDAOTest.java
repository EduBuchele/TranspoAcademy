package br.com.cursojava.exercicio;

public class ContatoDAOTest {
	
	public static void main(String[] args) {
		
	ContatoDAO dao = new ContatoDAO();
	
//	Contato c2 = new Contato(null, "Joao", "email", "telefone" );
//	dao.inserir(c2);
	
//	System.out.println(dao.buscarTodos());
//	
//	System.out.println(dao.buscarPorId(1));
	System.out.println(dao.buscarPorNome("Jo"));
//	System.out.println(dao.buscarPorTelefone("telefone"));
	System.out.println(dao.contar());
//	dao.remover(4);
//	dao.remover(3);
//	System.out.println(dao.buscarTodos());
	
//	Contato contato = dao.buscarPorId(1);
//	contato.setNome("Maria");
//	dao.atualizar(contato);
//	System.out.println(dao.buscarTodos());
	
	}
}
