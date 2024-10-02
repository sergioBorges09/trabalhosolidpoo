package exercicio2;

public class OperacoesBancarias {
	public void depositar(ContaBancaria conta, double valor) {
		conta.setSaldo(conta.getSaldo() + valor);
	}
	public void saque(ContaBancaria conta, double valor) {
		if(conta.getSaldo() >= valor) {
			conta.setSaldo(conta.getSaldo() - valor);
		}else {
			System.out.println ("Saque invalido");
	}
}
}
