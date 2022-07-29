package br.com.alura.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class PerformanceTesteListSet {

	public static void main(String[] args) {

		
		Collection<Integer> numeros1 = new HashSet<>();
		Collection<Integer> numeros2 = new ArrayList<>();
		
		long ini1 = System.currentTimeMillis();

		int interations1 = 100000;

		for (int i = 0; i <= interations1; i++) {
			numeros1.add(i);
		}
		
		long end1 = System.currentTimeMillis();
		
		System.out.println(end1-ini1);

		long ini2 = System.currentTimeMillis();

		int interations2 = 100000;

		for (int i = 0; i <= interations2; i++) {
			numeros2.add(i);
		}
		
		long end2 = System.currentTimeMillis();
		
		System.out.println(end2-ini2);
	}
	

}
