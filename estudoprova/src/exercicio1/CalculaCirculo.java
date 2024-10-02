package exercicio1;

public class CalculaCirculo {
	public double CalcularPerimetro(Circulo circulo) {
		return 2 * Math.PI * circulo.getRaio();
	}
	public double CalcularArea(Circulo circulo) {
		return  Math.PI * circulo.getRaio() * circulo.getRaio();
	}
}
