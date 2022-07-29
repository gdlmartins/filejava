package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Nome:%s matricula: %03d", this.nome , this.numeroMatricula);
	}

}
