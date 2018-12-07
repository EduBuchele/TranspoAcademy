package br.com.cursojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		Random randon = new Random();
		for (int i = 0; i < 100; i++) {
			double valor = randon.nextInt(1000) * 0.89;
			produtos.add(new Produto(i + 1, "Produto" + (i + 1), valor));
		}

		Produto p = new Produto();
		p.setId(produtos.get(50).getId());
		p.setNome(produtos.get(50).getNome());
		p.setPreco(produtos.get(50).getPreco());
		int indexOf = produtos.indexOf(p);
		System.out.printf("%d == %d", 50, indexOf);
	}

}
