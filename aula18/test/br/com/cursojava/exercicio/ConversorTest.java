package br.com.cursojava.exercicio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cursojava.exercicio.Conversor;

public class ConversorTest {

	private Conversor conversor;

	@Before
	public void inicioTest() {
		conversor = new Conversor();
	}

	@Test
	public void conversaoDezCelciusCinquentaFahrenheit() {
		double resultado = conversor.celciusFahrenheit(10.0);
		// Assert.fail("Erro");
		Assert.assertEquals(50, resultado, 0);
	}

	@Test
	public void conversaoVinteCelciusMeiaOitoFahrenheit() {
		double resultado = conversor.celciusFahrenheit(20.0);
		Assert.assertEquals(68, resultado, 0);
	}
	
	@Test
	public void conversaoCemFahrenheitTrintaOitoCelsius() {
		double resultado = conversor.fahrenheitCelsius(100.0);
		Assert.assertEquals(38, resultado, 0.3);
	}
	@Test
	public void conversaoDuzentosFahrenheitNoventaTresCelsius() {
		double resultado = conversor.fahrenheitCelsius(200.0);
		Assert.assertEquals(93, resultado, 0.4);
	}
	

}
