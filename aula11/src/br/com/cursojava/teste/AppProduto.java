package br.com.cursojava.teste;

import br.com.cursojava.modelo.Produto;

public class AppProduto {

	public static void main(String[] args) {

		Produto p = new Produto();
		p.setNome("Produto01");
		p.setPreco(-10);
		p.setPreco(-0.01);
		p.setPreco(15);
		
		
		
		System.out.println(p);
	}
}
