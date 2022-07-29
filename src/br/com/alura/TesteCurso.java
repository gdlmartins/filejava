package br.com.alura;

public class TesteCurso {

	public static void main(String[] args) {

		Curso javaColections = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColections.add(new Aula("Trabalhando com array list ", 20));

		System.out.println(javaColections.getAulas());
	}

}
