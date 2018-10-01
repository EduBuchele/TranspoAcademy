package br.com.cursojava;

public class Vendedor extends Funcionario {

	private double percentualVenda;
	private double totalVendas;


	public Vendedor() {
		super();
	}

	public Vendedor(String nome, String codigo, double salarioBase) {
		super(nome, codigo, salarioBase);
		
	}

	public double getPercentualVenda() {
		return percentualVenda;
	}

	public void setPercentualVenda(double percentualVenda) {
		this.percentualVenda = percentualVenda > 1 ? percentualVenda / 100 : percentualVenda;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	@Override
	public double salarioLiquido() {
		double acrecimo = 0;
		if (totalVendas >= 20000) {
			acrecimo = totalVendas * getPercentualVenda();
		}
		double salario = (getSalarioBase() + acrecimo) * (1 - 0.11);
		return salario;
	}

}
