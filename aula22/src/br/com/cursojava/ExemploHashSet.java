package br.com.cursojava;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		System.out.println(set);
		HashSet<String> set2 = (HashSet<String>) set.clone();
		System.out.println(set2);
		
	}

}
