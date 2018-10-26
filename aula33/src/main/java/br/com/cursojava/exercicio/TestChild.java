package br.com.cursojava.exercicio;

import java.util.List;

public class TestChild {

	public static void main(String[] args) {

		ChildDAO dao = new ChildDAO();

//		Child c1 = new Child(null, "Zezinho", new Owner(null, "Jose"));
//		Child c2 = new Child(null, "Mariazinha", new Owner(null, "Maria"));
//		dao.inserir(c1);
//		dao.inserir(c2);
		
		System.out.println("===================Busca por id '1'" + dao.buscarPorId(1));
		System.out.println("===================Busca por nome 'ma'" + dao.buscarPorNome("ma"));
		System.out.println("===================Busca por Lista====");
		List<Child> todos = dao.buscarTodos();
		for (Child childz : todos) {
			System.out.println(childz);
		}
		dao.remover(1);
		Child child = dao.buscarPorId(2);
		child.setNome("Margaret");
		child.getOwner().setNome("Ana");
		dao.atualizar(child);
		
		System.out.println("===================Busca por Lista====");
		List<Child> todas = dao.buscarTodos();
		for (Child childs : todas) {
			System.out.println(childs);
		}
		
		System.out.println(dao.contar());
	}
}
