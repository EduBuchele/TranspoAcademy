package br.com.cursojava;

public class Cliente {

	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String tipo; //(Silver, Gold, Platinum)
	private Endereco endereco = new Endereco();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Endereco getEndereço() {
		return endereco;
	}
	public void setEndereço(Endereco endereço) {
		this.endereco = endereço;
	}
	
	
	
	

}
