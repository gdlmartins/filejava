package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas2 {

	public static void main(String[] args) {

		Curso cursoSemana10 = new Curso("Java advanced", "Gabriel");

		Aula aula1 = new Aula("b Introducao ao curso", 15);

		Aula aula2 = new Aula("c Segunda aula ao curso", 10);

		Aula aula3 = new Aula("A primeira aula do curso", 19);
		cursoSemana10.add(aula1);
		cursoSemana10.add(aula2);
		cursoSemana10.add(aula3);

		System.out.println(cursoSemana10);
		
		
			
//		List<Aula> imutavelAulas = cursoSemana10.getAulas();			
		List<Aula> aulas =	new ArrayList<>(cursoSemana10.getAulas());			

		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
	
		cursoSemana10.remove(aula1);
//		cursoSemana10.remove(aula2);
		System.out.println(cursoSemana10.getAulas());
		
		System.out.println(cursoSemana10.getTempoTotal());
	
	}

}
