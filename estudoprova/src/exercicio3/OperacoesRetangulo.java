package exercicio3;

public class OperacoesRetangulo {
	public double calcularArea(Retangulo retangulo) {
		return retangulo.getAltura() * retangulo.getLargura();
	}
	public double calcularPerimetro(Retangulo retangulo) {
		return 2 * retangulo.getAltura() + retangulo.getAltura();
	}
}
