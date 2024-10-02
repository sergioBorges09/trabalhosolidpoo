package exercicio8;

public class Carro {
	private String marca;
	private String modelo;
	private double velocidadeAtual;
	
	public Carro(String marca, String modelo, double velocidadeAtual) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadeAtual = 0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
}
