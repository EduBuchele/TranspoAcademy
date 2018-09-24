package b.com.cursojava.modelo;

public class Contato {

	// variaveis de instancia/propriedades/atributos da classe
	String nome;
	String email;
	String telefone;

	void configuraNome(String nome) {
		this.nome = nome;
	}

	String retornaNome() {
		return this.nome;
	}

	void configuraEmail(String email) {
		this.email = email;
	}

	String retornaEmail() {
		return this.email;
	}

	void configuraTelefone(String fone) {
		this.telefone = fone;
	}

	String retornaTelefone() {
		return this.telefone;
	}

	void ligar() {
		System.out.println("Ligando para contato: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
	}

	void enviarMensagem(String mensagem) {
		System.out.println("Enviando mensagem...");
		System.out.println(mensagem);
		System.out.println("Para o email: " + this.email);
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " | Email: " + this.email + " | Fone: " + this.telefone;
	}

}
