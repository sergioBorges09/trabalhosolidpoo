package exercicio4;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int matricula;
	private ArrayList<Double> notas = new ArrayList<Double>();
	
	public Aluno(String nome, int matricula, ArrayList<Double> notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		double media = 0;
		for(Double nota : notas) {
			media += nota;
		}
		return media / notas.size();
	}
	public void situacaoAluno() {
		if(notas.size() >= 60) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}	
	}
}
	