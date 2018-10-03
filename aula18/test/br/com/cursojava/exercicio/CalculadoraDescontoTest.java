package br.com.cursojava.exercicio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraDescontoTest {

	private CalculadoraDesconto calc;

	@Before
	public void comeco() {
		calc = new CalculadoraDesconto();
	}

	@Test
	public void valoresNegativos() {
		double resultado = calc.calculaValorComDesconto(-10.0);
		Assert.assertEquals(0, resultado, 0);
	}

	@Test
	public void valoresNegativosMin() {
		double resultado = calc.calculaValorComDesconto(-0.1);
		Assert.assertEquals(0, resultado, 0);
	}

	@Test
	public void valorPositivoAte1800Max() {
		double resultado = calc.calculaValorComDesconto(1800.0);
		Assert.assertEquals(1800, resultado, 0);
	}

	@Test
	public void valorPositivoAte1800Min() {
		double resultado = calc.calculaValorComDesconto(0.1);
		Assert.assertEquals(0.1, resultado, 0);
	}

	@Test
	public void valorAte2400Max() {
		double resultado = calc.calculaValorComDesconto(2400.0);
		Assert.assertEquals(2280, resultado, 0);
	}

	@Test
	public void valorAte2400Min() {
		double resultado = calc.calculaValorComDesconto(1800.01);
		Assert.assertEquals(1710, resultado, 0.2);
	}

	@Test
	public void valorMenor3600Max() {
		double resultado = calc.calculaValorComDesconto(3599.99);
		Assert.assertEquals(2807.99, resultado, 0.1);
	}

	@Test
	public void valorMenor3600Min() {
		double resultado = calc.calculaValorComDesconto(2400.01);
		Assert.assertEquals(1872.0, resultado, 0.1);
	}

	@Test
	public void valorMaior3600Min() {
		double resultado = calc.calculaValorComDesconto(3600.00);
		Assert.assertEquals(2448.0, resultado, 0.1);
	}

	@Test
	public void valorMaior3600Dois() {
		double resultado = calc.calculaValorComDesconto(4000.00);
		Assert.assertEquals(2720.0, resultado, 0.1);
	}

}
