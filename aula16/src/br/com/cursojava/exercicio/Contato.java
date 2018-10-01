package br.com.cursojava.exercicio;

public class Contato extends Pessoa{

	private Integer id;
	private String telefone;
	private String email;
	
	public Contato(Integer id, String codigo, String nome,  String telefone, String email) {
		super(codigo, nome);
		this.id = id;
		this.telefone = telefone;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
