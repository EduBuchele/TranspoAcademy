package br.com.cursojava;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
	public static void main(String args[]) {

		List<Integer> al = new Vector<Integer>();
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(6);
		System.out.println("Tamanaho: " + al.size());
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(6);
		System.out.println("Tamanaho: " + al.size());
		
		System.out.println(al);
		
		al.remove(0);
		
		System.out.println(al);
		
		al.set(0, 11);
		
		System.out.println(al);
		
		System.out.println("********* Unico Elemento *********");
		System.out.println(al.get(0));

	}

}
