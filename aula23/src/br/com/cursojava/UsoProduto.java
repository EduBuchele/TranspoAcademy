package br.com.cursojava;

import java.util.HashSet;
import java.util.Set;

public class UsoProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto(1, "Produto01", 1.99, Categoria.ALIMENTO );
		Produto p2 = new Produto(2, "Produto02", 1.99, Categoria.LIMPEZA);
		Produto p3 = new Produto(3, "Produto03", 1.99, Categoria.ELETRONICO);
		imprimirCategoria(p1);
		imprimirCategoria(p2);
		imprimirCategoria(p3);
		Set<Produto> produtos = new HashSet<>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		System.out.println(produtos.size());
		System.out.println(produtos.contains(new Produto(1, "Produto01", 1.99, Categoria.ALIMENTO )));
		System.out.println(produtos.contains(p1));
		produtos.remove(new Produto(1, "Produto01", 1.99, Categoria.ALIMENTO ));
		System.out.println(produtos.size());
		produtos.remove(p1);
		System.out.println(produtos.size());
	}

	private static void imprimirCategoria(Produto produto) {
		String categoria = "";
		switch (produto.getCategoria()) {
		case ALIMENTO:
			categoria = "Alimento";
			break;
		case ELETRONICO:
			categoria = "Eletronico";
			break;
		case LIMPEZA:
			categoria = "Limpeza";
			break;
		case PERFUMARIA:
			categoria = "Perfumaria";
			break;
		case VESTUARIO:
			categoria = "Vestuario";
			break;
		}
		System.out.println("Categoria: " + categoria + " - " + produto.getCategoria().name());
		
	}
}
