package br.com.cursojava.veiculo;

import java.util.ArrayList;

public class VeiculoRepositorio {

	ArrayList<Veiculo> veiculos = new ArrayList<>();

	public boolean adicionarVeiculo(Veiculo veiculo) {
		boolean ok = false;
		if (veiculo != null) {
			veiculos.add(veiculo);
			ok = true;
		}
		return ok;
	}

	public ArrayList<Veiculo> buscarListaVeiculos() {
		return veiculos;
	}
	
	public Veiculo getVeiculo(int id) {
		Veiculo veic = null;
		for (Veiculo veiculo : veiculos) {
			if (veiculo.getId()==id) {
				veic = veiculo;
			}			
		}
		return veic;
	}

	public boolean removeVeiculo(Veiculo veiculo) {
		System.out.println("Veiculo Removido: " + veiculo.getModelo());
		boolean ok = false;
		if (veiculo != null) {
			veiculos.remove(veiculo);
			ok = true;
		}
		return ok;
	}

}
