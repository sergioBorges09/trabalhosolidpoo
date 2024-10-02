package exercicio4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Operacao operacao = new Operacao();
		ArrayList<Double> notas = new ArrayList<Double>();
		notas.add(2.00);
		notas.add(3.00);
		notas.add(5.00);
		notas.add(1.00);
		Aluno aluno = new Aluno("Sergio Borges",1232442,notas);
		System.out.println("Sua media é: "+aluno.calcularMedia());
		aluno.situacaoAluno();
	}

}
