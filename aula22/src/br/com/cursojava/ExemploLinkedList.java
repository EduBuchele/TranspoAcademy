package br.com.cursojava;

import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {

	public static void main(String args[]) {

		List<Integer> al = new LinkedList<Integer>();
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(6);
		System.out.println(al);
		System.out.println("tamanaho: " + al.size());
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(6);
		System.out.println(al);
		System.out.println("tamanaho: " + al.size());
		
		al.remove(0);
		
		System.out.println(al);
		
		System.out.println("********* Metodo Set | Get *********");
		al.set(0, 11);
		
		System.out.println(al);
		
		System.out.println(al.get(0));

	}
}
