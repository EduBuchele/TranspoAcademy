package br.com.cursojava;

public class Produto {

//	public static final int ALIMENTO = 1;
//	public static final int  ELETRONICO = 2;
//	public static final int LIMPEZA = 3;
//	public static final int VESTUARIO = 4;
//	public static final int PERFUMARIA = 5;
	
	private Integer id;
	private String nome;
	private double preco;
//	private int categoria;
	private Categoria categoria;
	
	public Produto() {}

	public Produto(Integer id, String nome, double preco, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
		public String toString() {
			return nome;
		}
	
	
	
}
