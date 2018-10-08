package br.com.cursojava;

import java.text.DateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ExemplosCalendar {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance(Locale.getDefault());
		System.out.println(c);
		Date dataCanada = Calendar.getInstance(Locale.CANADA).getTime();
		System.out.println(dataCanada);
		int day = Calendar.getInstance(Locale.CANADA).getTime().getDay();
		System.out.println(day);
		c.set(2018, 11, 30);
		System.out.println(c.getTime());
		c.add(Calendar.MONTH, 3);
		System.out.println("add " + c.getTime());

		c.roll(Calendar.MONTH, 3);
		System.out.println("roll " + c.getTime());

//		c.set(2018, 11, 35);
//		System.out.println(c.getTime());

//		 System.out.println("Ano: "+Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
//		
		Date data = new Date("12/31/2018");
		System.out.println("Utilizando o Date: " + data);

		int dia = data.getDay();
		System.out.println("Dia: " + dia);
		int mes = data.getMonth();
		System.out.println("Mês: " + mes);
		data.setDate(11);
		System.out.println("Nova Data: " + data);

		
//		String novaData = DateFormat.getDateInstance(DateFormat.FULL, Locale.CANADA).format(data);
//		System.out.println(novaData);
//		
//	

	}

}
