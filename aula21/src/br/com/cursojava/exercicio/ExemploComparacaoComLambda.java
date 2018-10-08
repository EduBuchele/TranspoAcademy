package br.com.cursojava.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExemploComparacaoComLambda {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Feijao", 4.90));
		produtos.add(new Produto("Macarrão", 3.68));
		produtos.add(new Produto("Arroz", 3.50));
		produtos.add(new Produto("Leite", 2.75));
		produtos.add(new Produto("Cafe", 8.90));
		produtos.add(new Produto("Margarina", 3.57));

		System.out.println(produtos);
		Collections.sort(produtos);
		System.out.println(produtos);	
		
		//Filtro do Menor Preco -> Maior Preco Com Lambda
		produtos.sort((o1, o2) -> {
			if (o1 != null) {
				if (o2 != null) {
					return Double.compare(o1.getPreco(), o2.getPreco());
				} else {
					return -1;
				}
			}
			return 1;
		});
		System.out.println(produtos);
		
		//Filtro Maior preço -> Menor Preco Com Lambda
		produtos.sort((o1, o2) -> {
			if (o1 != null) {
				if (o2 != null) {
					return Double.compare(o2.getPreco(), o1.getPreco());
				} else {
					return -1;
				}
			}
			return 1;
		});
		System.out.println(produtos);
		
		//Comparador sem Lambda
//		Comparator<Produto> comparador = new Comparator<Produto>() {
//		@Override
//		public int compare(Produto o1, Produto o2) {
//			if (o1 != null){
//				if (o2 != null) {
//					return Double.compare(o1.getPreco(), o2.getPreco());
//				} else {
//					return -1;
//				}
//			}
//			return 1;
//		}
//
//	};
	
		//Comparador com Lambda
//		Comparator<Produto> comparador = (Produto o1, Produto o2) -> {
//			if (o1 != null) {
//				if (o2 != null) {
//					return Double.compare(o1.getPreco(), o2.getPreco());
//				} else {
//					return -1;
//				}
//			}
//			return 1;
//		};
	}

	
}
