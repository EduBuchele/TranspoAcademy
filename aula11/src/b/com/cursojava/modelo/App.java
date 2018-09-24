package b.com.cursojava.modelo;

public class App {
	public static void main(String[] args) {
		
	Contato contato = new Contato();
	
	contato.nome = "Eduardo";
	contato.telefone = "(48) 9911-9911";
	contato.email = "eduardo@teste.com.br";
	
	System.out.println(contato.nome);
	System.out.println(contato.email);
	System.out.println(contato.telefone);
	
	contato.configuraNome("Joao da Silva");
	System.out.println(contato.retornaNome());
	
	System.out.println(contato);
	
	//contato.ligar();
	contato.enviarMensagem("Oiiii");
	
	
	}
}
