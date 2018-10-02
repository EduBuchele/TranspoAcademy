package br.com.cursojava.colecoes;

public class Contato implements Comparable<Contato> {

	private String nome;
	private String email;

	public Contato() {
	}

	public Contato(String nome) {
		this();
		this.nome = nome;
	}

	public Contato(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome + " " + email;
	}

//	@Override
//	public int compareTo(Contato o) {
//		if (nome != null) {
//			return nome.compareTo(o.nome);
//		}else if(o == null || o.nome == null) {
//			
//		}
//		return 0;
//	}
//	
//	@Override
//	public int compareTo(Contato o) {
//		if (nome.length() > 0) {
//			if (nome.length() > (o.getNome().length())) {
//				return 1;
//			} else if (nome.length() == (o.getNome().length())) {
//				return nome.compareTo(o.nome);
//			} else {
//				return -1;
//			}
//
//		}else if(o == null || o.nome == null) {
//			
//		}
//		return 0;
//	}
//	@Override
//	public int compareTo(Contato o) {
//		if (nome != null) {
//			if (o != null && o.nome != null) {
//				int compare = Integer.compare(nome.length(), o.nome.length());
//				if (compare == 0) {
//					compare = nome.compareTo(o.nome);
//				}
//				return compare;
//			} else {
//				return -1;
//			}
//		} else if (o == null || o.nome == null) {
//			return 0;
//		} else {
//			return 1;
//		}
//	}

	@Override
	public int compareTo(Contato o) {
		if (nome != null) {
			int compare = nome.compareTo(o.nome);
			if (compare == 0) {
				compare = email.compareTo(o.email);
			}
			return compare;
		} else if (o == null || o.nome == null) {

		}
		return 0;
	}
}
