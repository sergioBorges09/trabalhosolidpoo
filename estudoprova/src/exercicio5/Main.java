package exercicio5;


public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Sergio Borges",2500.0,"Empreededor");
		CalculadorDeSalarioLiquido calculador = new CalculadorDeSalarioLiquido();
		
		double salarioLiquido = calculador.calcularSalarioLiquido(funcionario.getSalarioBruto(),0.2,500.0);
		System.out.println("O salario liquido do funcionario: "+ funcionario.getNome() + " é: "+salarioLiquido);
		

	}

}
