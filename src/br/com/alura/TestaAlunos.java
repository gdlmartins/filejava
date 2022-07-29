package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Alana");
		alunos.add("Jose");
		alunos.add("Marcela");
		alunos.add("Jieun");
		alunos.add("Jesus");

		
		int tamanho = alunos.size();
		
		System.out.println(tamanho);
		
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
		
		alunos.forEach(s-> System.out.println(s));
		
       
		boolean containAluno = alunos.contains("Jose");
		System.out.println(containAluno);
		
		boolean containAluno2 = alunos.contains("nada");
		System.out.println(containAluno2);
		
		
		alunos.remove("Jesus");
		
		System.out.println(alunos);
	}

}
