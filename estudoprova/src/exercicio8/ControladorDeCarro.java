package exercicio8;

public class ControladorDeCarro {
	public void acelerar(Carro carro,double aceleraçao) {
		carro.setVelocidadeAtual(carro.getVelocidadeAtual() + aceleraçao);
	}
	public void frear(Carro carro,double desaceleracao) {
		double novaVelocidade = carro.getVelocidadeAtual() - desaceleracao;
		carro.setVelocidadeAtual(novaVelocidade >= 0 ? novaVelocidade: 0);
	}
	public void exibirInformacao(Carro carro) {
		System.out.println("Velocidade atual: "+ carro.getVelocidadeAtual());
	}
}
