package br.com.cursojava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploStreamFiltro {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(1, "Alimento01", 1.99, Categoria.ALIMENTO));
		produtos.add(new Produto(8, "Comida02", 35.99, Categoria.ALIMENTO));
		produtos.add(new Produto(2, "Eletronico01", 2.11, Categoria.ELETRONICO));
		produtos.add(new Produto(5, "Eletronico02", 8.10, Categoria.ELETRONICO));
		produtos.add(new Produto(3, "Perfume01", 3.50, Categoria.PERFUMARIA));
		produtos.add(new Produto(6, "Perfume02", 11.10, Categoria.PERFUMARIA));
		produtos.add(new Produto(7, "Limpeza01", 21.99, Categoria.LIMPEZA));
		produtos.add(new Produto(9, "Limpo02", 0.99, Categoria.LIMPEZA));
		produtos.add(new Produto(10, "Calça02", 20.55, Categoria.VESTUARIO));
		produtos.add(new Produto(4, "Roupa01", 4.35, Categoria.VESTUARIO));

		Stream<Produto> streamProdutos = produtos.stream();
		System.out.println("Produtos Impressos com Filter");
		streamProdutos.filter((Produto produto) -> {
			return Categoria.ALIMENTO.equals(produto.getCategoria());
		}).map(p -> p.getNome()).forEach(p -> System.out.println(p));
		
		System.out.println("\nImprimindo nova List");
		List<Produto> alimentos = produtos.stream().filter((Produto produto) -> {
			return Categoria.LIMPEZA.equals(produto.getCategoria());
		}).collect(Collectors.toList());
		for (Produto alimento : alimentos) {
			System.out.println(alimento.getNome());
		}
		
		System.out.println("\nPerfumaria:");
		produtos.stream().filter((Produto produto) -> {
			return Categoria.PERFUMARIA.equals(produto.getCategoria());
		}).map(p -> p.getNome())
		.forEach(p -> System.out.println(p));
		
		System.out.println("\nProdutos preco < 10:");
		produtos.stream().filter((Produto produto) -> {
			return produto.getPreco()<4;
		}).map(p -> p.getNome())
		.forEach(p -> System.out.println(p));
		
		System.out.println("\n++++++++++ Maiores que 10++++++++++++++++");
		List<String> nomesProdutosMaiorque10 = 
				produtos.stream().filter(p -> p.getPreco() >= 10)
				.map(p -> p.getNome())
				.collect(Collectors.toList());
		for (String nomes : nomesProdutosMaiorque10) {
			System.out.println(nomes);
			
		}
		
		System.out.println("\n////////// Soma e Media /////////////");
		double soma = produtos.stream().mapToDouble(p-> p.getPreco()).sum();
		System.out.printf("O valor total dos produtos é: %.2f \n", soma);
		OptionalDouble media = produtos.stream().mapToDouble(p-> p.getPreco()).average();
		System.out.println("A Media dos preços é: " + media.getAsDouble());
		
		System.out.println("\nSoma dos produtos por categoria");
		Map<Categoria, Double> map = new HashMap<>();
		Map<Categoria, Double> totalizador = produtos
				.stream().filter(p -> p.getPreco() >= 10)
				.reduce(map, (current,prod) ->{
					Double value = current.get(prod.getCategoria());
					if(value == null) {
						value = 0.0;
					}
					
					value += prod.getPreco();
					
					current.put(prod.getCategoria(), value);
					return current;
				},(i,j) ->{
					return i;
				});
		for (Map.Entry<Categoria, Double> item : totalizador.entrySet()) {
			System.out.printf("%s = %.2f\n", item.getKey(), item.getValue());
		}
		
		System.out.println("\n|||||||||||||||Produto de menor preço|||||||||||");
		Optional<Produto> produtoMenorPreco = produtos.stream().reduce((anterior, atual)->{
			return anterior.getPreco() < atual.getPreco() ? anterior : atual;			
		});
		
		System.out.println("O produto com menor preço é: " + produtoMenorPreco.get());
		
		
		System.out.println("\nOrdenação");
		produtos.stream().
		          sorted(Comparator.comparing(Produto::getNome))
		          .forEach(p->System.out.println(p.getNome()));
		
		
		
		
		
				
//		Stream<Produto> alimentos = streamProdutos.filter((Produto produto)->{
//		return Categoria.ALIMENTO.equals(produto.getCategoria());
//	});
//	
//	
//	alimentos.forEach(p -> System.out.println(p.getNome()));
		// alimentos.forEach(System.out::println);

	}
}
