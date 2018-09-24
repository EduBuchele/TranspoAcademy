package b.com.cursojava.teste;

import b.com.cursojava.exercicio.Produto;

public class AppProduto {

	public static void main(String[] args) {

		Produto p = new Produto();
		p.setNomeProduto("Produto01");
		p.setPrecoProduto(-10);
		p.setPrecoProduto(-0.01);
		p.setPrecoProduto(15);
		
		
		
		System.out.println(p);
	}
}
