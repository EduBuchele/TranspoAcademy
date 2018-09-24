package b.com.cursojava.exercicio;

public class Veiculo {

	String marcaVeiculo;
	String modeloVeiculo;
	String corVeiculo;
	int anoDeFabricacaoVeiculo;
	int anoModeloVeiculo;

	String retornaMarca() {
		return marcaVeiculo;
	}

	void configuraMarca(String marca) {
		this.marcaVeiculo = marca;
	}

	String retornaModelo() {
		return modeloVeiculo;
	}

	void configuraModelo(String modelo) {
		this.modeloVeiculo = modelo;
	}

	String retornaCor() {
		return corVeiculo;
	}

	void configuraCor(String cor) {
		this.corVeiculo = cor;
	}

	int retornaAnoDeFabricação() {
		return anoDeFabricacaoVeiculo;
	}

	void configuraAnoDeFabricação(int anoDeFabricação) {
		this.anoDeFabricacaoVeiculo = anoDeFabricação;
	}

	int retornaAnoModelo() {
		return anoModeloVeiculo;
	}

	void configuraAnoModelo(int anoModelo) {
		this.anoModeloVeiculo = anoModelo;
	}

}
