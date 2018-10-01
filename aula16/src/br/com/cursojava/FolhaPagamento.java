package br.com.cursojava;

public class FolhaPagamento {

	public void imprimirFolha(Funcionario funcionario) {
		System.out.println("*******Folha de Pagamento **********");
		System.out.println(funcionario.getClass().getSimpleName().toUpperCase());
		System.out.printf("Condigo: %s\n", funcionario.getCodigo());
		System.out.printf("Nome: %s\n", funcionario.getNome());
		System.out.printf("Salário Base: %.2f\n", funcionario.getSalarioBase());
		System.out.printf("Salário Líquido: %.2f\n", funcionario.salarioLiquido());
		System.out.println("*********FIM***********");
	}


}
