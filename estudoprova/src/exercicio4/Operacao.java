package exercicio4;

import java.util.ArrayList;

public class Operacao {
	public double calcularMedia(Aluno aluno,ArrayList<Double> notas) {
		double media = 0;
		for(Double nota : notas) {
			media += nota;
		}
		return media / notas.size();
	}
	public void situacaoAluno(Aluno aluno,ArrayList<Double> notas) {
		if(notas.size() >= 60) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}	
	}
}
