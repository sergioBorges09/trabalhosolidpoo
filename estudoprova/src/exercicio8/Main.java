package exercicio8;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Honda","Civic",0);
		ControladorDeCarro controlador = new ControladorDeCarro();
		
		controlador.acelerar(carro,20);
		controlador.exibirInformacao(carro);
		controlador.frear(carro, 5);
		controlador.exibirInformacao(carro);
	}

}
