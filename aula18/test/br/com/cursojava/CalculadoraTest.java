package br.com.cursojava;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calc;

	@Before
	public void antesDeCadaTest() {
		calc = new Calculadora();
	}

	@After
	public void depoisDeCadaTest() {
		System.out.println("Teste concluído.");
	}
	
	@Test
	public void testSomarDoisMaisDois() {
		double resultado = calc.somar(2.0, 2.0);
		Assert.assertEquals(4.0, resultado, 0);
		// Assert.fail("Teste somar ainda nao implementado");
	}

	@Test
	public void testSomarDoisMaisTres() {
		double resultado = calc.somar(2.0, 3.0);
		Assert.assertEquals(5.0, resultado, 0);
	}

	@Test
	public void testSomarVinteMaisCinco() {
		double resultado = calc.somar(20.0, 5.0);
		Assert.assertEquals(25.0, resultado, 0);
	}
	@Test
	public void testSubtrairCincoMenosTres() {
		//Assert.fail("Deu Erro!!");
		double resultado = calc.subtrair(5.0, 3.0);
		Assert.assertEquals(2.0, resultado, 0);
		}
	@Test
	public void testSubtrairDezMenosQuatro() {
		//Assert.fail("Deu Erro!!");
		double resultado = calc.subtrair(10.0, 4.0);
		Assert.assertEquals(6.0, resultado, 0);
		}
	
	@Test
	public void testSubtrairVinteMenosOnze() {
		//Assert.fail("Deu Erro!!");
		double resultado = calc.subtrair(20.0, 11.0);
		Assert.assertEquals(9.0, resultado, 0);
		}

	
	
	
}
