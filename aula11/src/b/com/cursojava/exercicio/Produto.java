package b.com.cursojava.exercicio;

public class Produto {

	private String nomeProduto;
	private double precoProduto;
	private boolean promocao;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nome) {
		this.nomeProduto = nome;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		if (precoProduto >= 0.01) {
			this.precoProduto = precoProduto;
		} else {
			System.out.println("Tentativa de inserir Valor Invalido!!" + precoProduto);
		}
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}

	public boolean isPromocao() {
		return promocao;
	}

	@Override
	public String toString() {
		return this.nomeProduto;
	}

}
