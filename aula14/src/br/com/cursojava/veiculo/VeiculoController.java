package br.com.cursojava.veiculo;

import java.util.ArrayList;

public class VeiculoController {

	VeiculoRepositorio repositorio = new VeiculoRepositorio();
	private static int count = 1;

	public boolean CadastrarVeiculo(String marca, String modelo, String placa, int anoFabricacao, int anoModelo,
			String cor) {
		Veiculo veiculo = new Veiculo();
		veiculo.setId(count++);
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setPlaca(placa);
		veiculo.setAnoFabricacao(anoFabricacao);
		veiculo.setAnoModelo(anoModelo);
		veiculo.setCor(cor);

		return repositorio.adicionarVeiculo(veiculo);
	}

	public boolean isMarcaValida(String marca) {
		boolean valido = marca != null && !"".equals(marca.trim()) && marca.length() >= 3;
		if (!valido) {
			System.out.println("O Nome deve conter +3 Caracteres e não pode ser vazio!");
		}
		return valido;
	}

	public boolean isModeloValida(String modelo) {
		boolean valido = modelo != null && !"".equals(modelo.trim()) && modelo.length() >= 3;
		if (!valido) {
			System.out.println("O Modelo deve conter +3 Caracteres e não pode ser vazio!");
		}
		return valido;
	}

	public ArrayList<Veiculo> getListaVeiculo() {
		return repositorio.buscarListaVeiculos();
	}

	public boolean isPlacaValida(String placa) {
		boolean valido = placa != null && !"".equals(placa.trim()) && placa.length() == 7;
		if (!valido) {
			System.out.println("A Placa deve conter 7 Caracteres");
		}
		return valido;
	}

	public boolean isAnoFabValido(int anoFabricacao) {
		boolean valido = anoFabricacao >= 2000;
		if (!valido) {
			System.out.println("O ano deve ser maior que 2000 ");
		}
		return valido;
	}

	public boolean isAnoModValido(int anoFabricacao, int anoModelo) {
		boolean valido = anoFabricacao <= anoModelo;
		if (!valido) {
			System.out.println("O ano deve ser maior que a Fabricação " + anoFabricacao);
		}
		return valido;
	}

	public ArrayList<Veiculo> buscaVeiculoMarca(String marca) {
		ArrayList<Veiculo> listaCompleta = repositorio.buscarListaVeiculos();
		ArrayList<Veiculo> listaPorMarca = new ArrayList<>();

		for (Veiculo veiculo : listaCompleta) {
			if (marca.equals(veiculo.getMarca())) {
				listaPorMarca.add(veiculo);
			}
		}

		return listaPorMarca;
	}

	public ArrayList<Veiculo> buscaVeiculoModelo(String modelo) {
		ArrayList<Veiculo> listaCompleta = repositorio.buscarListaVeiculos();
		ArrayList<Veiculo> listaPorModelo = new ArrayList<>();

		for (Veiculo veiculo : listaCompleta) {
			if (modelo.equals(veiculo.getModelo())) {
				listaPorModelo.add(veiculo);
			}
		}
		return listaPorModelo;
	}

	public ArrayList<Veiculo> buscaVeiculoPlaca(String placa) {
		ArrayList<Veiculo> listaCompleta = repositorio.buscarListaVeiculos();
		ArrayList<Veiculo> listaPorPlaca = new ArrayList<>();

		for (Veiculo veiculo : listaCompleta) {
			if (placa.equals(veiculo.getPlaca())) {
				listaPorPlaca.add(veiculo);
			}
		}
		return listaPorPlaca;
	}

	public ArrayList<Veiculo> buscaVeiculoAnoFab(int ano) {
		ArrayList<Veiculo> listaCompleta = repositorio.buscarListaVeiculos();
		ArrayList<Veiculo> listaPorAnoFab = new ArrayList<>();

		for (Veiculo veiculo : listaCompleta) {
			if (ano == veiculo.getAnoFabricacao()) {
				listaPorAnoFab.add(veiculo);
			}
		}
		return listaPorAnoFab;
	}

	public boolean removeVeiculo(int id) {
		boolean ok = false;
		if (id > 0) {
			Veiculo veiculo = repositorio.getVeiculo(id);
			if (veiculo != null) {
				ok = repositorio.removeVeiculo(veiculo);
			}
		} else {
			System.out.println("ID invalido");
		}
		return ok;

	}
}
