package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();

	public String getNome() {
		return nome;
	}

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void add(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void remove(Aula aula) {
		this.aulas.remove(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal= 0;
		for (Aula aula : aulas) {
		  tempoTotal +=aula.getTempo();
		}
        return tempoTotal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s", nome);
	}

}
