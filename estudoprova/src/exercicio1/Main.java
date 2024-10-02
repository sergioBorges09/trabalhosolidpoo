package exercicio1;

public class Main {
	public static void main(String[] args) {
	Circulo circulo = new Circulo(5);
	CalculaCirculo calculadora = new CalculaCirculo();
	
	double area = calculadora.CalcularArea(circulo);
	System.out.println("A area da area sera: "+area);
	
	double perimetro = calculadora.CalcularPerimetro(circulo);
	System.out.println("O perimetro do raio sera: "+ perimetro);
	}

}
