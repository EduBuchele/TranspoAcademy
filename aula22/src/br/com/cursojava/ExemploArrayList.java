package br.com.cursojava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploArrayList {
	public static void main(String args[]) {

		List<Integer> al = new LinkedList<Integer>();
		al.add(7);
		
		
		al.add(9);
		al.add(6);
		al.add(8);
		al.add(5);
		al.add(10);
		al.add(12);
		System.out.println(al);
		System.out.println("tamanaho: " + al.size());
		al.add(11);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(6);
		al.add(4);
		System.out.println(al);
		System.out.println("tamanaho: " + al.size());
		
		al.remove(0);
		
		System.out.println(al);
		
		System.out.println("********* Metodo Set | Get *********");
		al.set(0, 7);
		
		System.out.println(al);
		
		System.out.println(al.get(0));
		
		System.out.println("****Ordenação*****");
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("****SubList*****");
		System.out.println(al.subList(3, 9));
		
		}

}
