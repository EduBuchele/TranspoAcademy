package br.com.cursojava;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CalculadoraDescontos {

	private Properties properties;

	public CalculadoraDescontos() {
		build();
	}

	private void build() {
		properties = new Properties();
		FileReader reader;
		try {
			reader = new FileReader(new File("data.properties"));
			properties.load(reader);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public double getPercentualDesconto() {
		double percentual = Double.parseDouble(properties.getProperty("maxdesconto","0"));
		return percentual;
	}

}
