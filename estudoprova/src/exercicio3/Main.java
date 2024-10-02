package exercicio3;

public class Main {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(50,30);
		OperacoesRetangulo operacoes = new OperacoesRetangulo();
		
		double area = operacoes.calcularArea(retangulo);
		System.out.println("O resultado da area: "+area);
		
		double perimetro = operacoes.calcularPerimetro(retangulo);
		System.out.println("O resultado do perimetro: "+ perimetro);
	}
}
