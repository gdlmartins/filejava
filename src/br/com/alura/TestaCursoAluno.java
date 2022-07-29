package br.com.alura;

public class TestaCursoAluno {

	public static void main(String[] args) {
		
		Curso javaColections = new Curso
				("Dominando as coloecos do java", "Paulo Silveira");
		
		javaColections.add(new Aula("Trabalhando com vetor!" , 10));
		javaColections.add(new Aula ("Segunda aula de array ", 15));
		javaColections.add(new Aula ("Testando as Listas", 19 ));
		
	
		
		Aluno a1 = new Aluno("Gabriel Martins",001);
		Aluno a2 = new Aluno("Jose da Silva", 002);
		Aluno a3 = new Aluno("Jiuen Lee", 003);
		
		javaColections.matricula(a1);
		javaColections.matricula(a2);
		javaColections.matricula(a3);
		
		
		System.out.println(javaColections.getAlunos());
		
		javaColections.getAlunos().forEach( s -> System.out.println(s));
		
	}
}
 