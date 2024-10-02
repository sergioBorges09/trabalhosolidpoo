package exercicio2;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(123,"Sergio Borges",1000);
		OperacoesBancarias operacoes = new OperacoesBancarias();
		
		operacoes.depositar(conta, 100);
		operacoes.saque(conta, 5000);
		
		System.out.println("Saldo atual: " + conta.getSaldo());
	}

}
