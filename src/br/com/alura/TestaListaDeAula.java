package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisitando as Arraylista", 21);
		Aula a2 = new Aula("Lista de Objectos", 15);
		Aula a3 = new Aula("Relacionamento de listas e objectos", 25);
		
	    ArrayList<Aula>  aulas = new ArrayList<Aula>();
	    
	    aulas.add(a1);
	    aulas.add(a2);
	    aulas.add(a3);
	    
		System.out.println(aulas);
		
		Collections.sort(aulas);  

		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo).reversed());
		
		System.out.println(aulas);
		
		
		
	}

}
