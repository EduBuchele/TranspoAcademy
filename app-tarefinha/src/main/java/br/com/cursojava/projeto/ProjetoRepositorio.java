package br.com.cursojava.projeto;

import br.com.cursojava.utils.CrudRepository;

public class ProjetoRepositorio extends CrudRepository<Projeto> {

	public ProjetoRepositorio(Class<Projeto> classe) {
		super(classe);
	}
	
	

}
