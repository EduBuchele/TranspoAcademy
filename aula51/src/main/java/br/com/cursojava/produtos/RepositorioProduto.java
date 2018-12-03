package br.com.cursojava.produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioProduto {
	
	private static List<Produto>lista = new ArrayList<>();
	private static Integer count = 1;
	static{
		lista.add(new Produto(count++, "Produto01", "descricao01", 10.50));
		lista.add(new Produto(count++, "Produto02", "descricao02", 22.50));
		lista.add(new Produto(count++, "Produto03", "descricao03", 33.50));
		lista.add(new Produto(count++, "Produto04", "descricao04", 11.50));
		lista.add(new Produto(count++, "Produto05", "descricao05", 0.50));
		lista.add(new Produto(count++, "Produto06", "descricao06", 34.50));
		lista.add(new Produto(count++, "Produto07", "descricao07", 22.50));
	}
	
	public List<Produto> buscarTodos(){
		return lista;
	}
	
	public Produto buscarPorId(Integer id){
		Produto produto = null;
		for (Produto atual : lista) {
			if(atual != null && id.equals(atual.getId())){
				produto = atual;
				break;
			}
		}
		return produto;
	}
	
	public boolean salvar(Produto produto){
		boolean resultado = false;
		if(produto != null){
			if(produto.getId() == null){
				resultado = inserir(produto);
			}else{
				resultado = atualizar(produto);
			}
		}
		return resultado;
	}

	private boolean atualizar(Produto produto) {
		boolean resultado = false;
		int idx = lista.indexOf(produto);
		if(idx > -1){
			lista.set(idx, produto);
			resultado = true;
		}
		return resultado;
	}

	private boolean inserir(Produto produto) {
		produto.setId(count++);
		return lista.add(produto);
	}
	
	public boolean remover(Integer id){
		int qt = lista.size();
		lista=lista.stream().filter(c -> !id.equals(c.getId())).collect(Collectors.toList());
		return qt > lista.size();
	}
}