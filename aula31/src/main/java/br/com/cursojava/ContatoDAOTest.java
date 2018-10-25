package br.com.cursojava;

import java.util.List;

public class ContatoDAOTest {
public static void main(String[] args) {
	
	ContatoDAO dao = new ContatoDAO();

//	Contato c1 = new Contato(1, "João","joao@teste.com", "33332222");
//	Contato c2 = new Contato(null, "Maria","maria@gmail.com", "33332222");
//	dao.inserir(c1);
//	dao.inserir(c2);

//	List<Contato> buscaPorNome = dao.buscarPorNome("jo");
//	for (Contato contato : buscaPorNome) {
//		System.out.println(contato.getNome());
//	}
	
	dao.remover(new Contato(1, "João da Silva","joao@teste.com", "33332222"));
//	dao.remover(new Contato(1, "João","joao@teste.com", "33332222"));
	

	List<Contato> list = dao.buscarTodos();
	System.out.println(list);
}	
}
