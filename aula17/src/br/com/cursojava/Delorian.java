package br.com.cursojava;

public class Delorian extends Carro implements Turbinavel, Voador {

	@Override
	public void acionarTurbo() {
		System.out.println("Acionando turbo");

	}

	@Override
	public void desligarTurbo() {
		System.out.println("Desligando Turbo");

	}

	@Override
	public void voar() {
		System.out.println("Delorian Voador");

	}

}
