package br.com.cursojava;


public class App {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setCodigo("FUNC-0001");
		func.setNome("João da Silva");
		func.setSalarioBase(1000);
		
		Vendedor vend = new Vendedor("Fernando Souza","VEND-0002",1000);
//		vend.setCodigo();
//		vend.setNome();
//		vend.setSalarioBase();
		vend.setPercentualVenda(0.05);
		vend.setTotalVendas(100000);

		FolhaPagamento folha = new FolhaPagamento();
	//	folha.imprimirFolha(func);
		folha.imprimirFolha(vend);
		
		Funcionario fv = new Vendedor();
		fv.setCodigo("coodigo");
		fv.setNome("Nome Vendedor");
		fv.setSalarioBase(12000);
		if (fv instanceof Vendedor) {
			((Vendedor) fv).setPercentualVenda(0.10);
			((Vendedor) fv).setTotalVendas(20000);
		}
	//	folha.imprimirFolha(fv);
		
		
		
	}
}
