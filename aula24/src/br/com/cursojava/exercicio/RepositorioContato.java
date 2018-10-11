package br.com.cursojava.exercicio;

public interface RepositorioContato {

	public abstract boolean adicionar(Contato contato);
	
	public abstract boolean editar(Contato contato);
	public abstract java.util.List<Contato> buscarTodos();
	public abstract java.util.List<Contato> buscarPorNome (String nome);
	public abstract java.util.List<Contato> buscaPorTelefone (String telefone);
	public abstract java.util.List<Contato> buscaPorTipo (TipoContato tipo);
	public abstract Contato buscaPorId (Integer id);
	public abstract boolean remover (Contato contato);
	
}
