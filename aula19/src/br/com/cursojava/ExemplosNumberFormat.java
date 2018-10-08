package br.com.cursojava;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.text.DecimalFormat;

public class ExemplosNumberFormat {
	
	public static void main(String[] args) throws ParseException {
		
		double numero = 12345678.90;
		
		System.out.println(numero);
		System.out.println("Exemplos de getCurrency: ");
		String numCurrency = NumberFormat.getCurrencyInstance(Locale.CANADA).format(numero);
		System.out.println(numCurrency);
		
		Locale ptBr = new Locale("pt", "BR");
		System.out.println(NumberFormat.getCurrencyInstance(ptBr).format(88888));
		
		Locale enUS = new Locale("en", "US");
		System.out.println(NumberFormat.getCurrencyInstance(enUS).format(55555));
		
		System.out.println("Exemplos de getInstance: ");
		
		String numInstance = NumberFormat.getInstance().format(numero);
		System.out.println(numInstance);
		
		String numCanada = NumberFormat.getInstance(Locale.US).format(numero);
		System.out.println(numCanada);
		//NumberFormat.
		
		double numero2 = 2.0/3.0;
		System.out.println(numero2);
		
		
		System.out.println("Exemplos de getPercent: ");
		System.out.println(NumberFormat.getPercentInstance().format(numero2));
		
		
		System.out.println("Exemplos de getInteger: ");
		System.out.println(NumberFormat.getIntegerInstance().format(numero2));
		
		System.out.println("Exemplos de parse: ");
		NumberFormat format = NumberFormat.getInstance(Locale.US);
		String source = "3456";
		Number number = format.parse(source);
		System.out.println(number);
		double v = (long)number + 6500;
		System.out.println(v);
		format.setMaximumIntegerDigits(2);
	
		
	}
}

