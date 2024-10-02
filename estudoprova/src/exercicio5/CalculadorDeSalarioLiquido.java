package exercicio5;

public class CalculadorDeSalarioLiquido {
		 public double calcularSalarioLiquido(double salarioBruto, double aliquotaImposto, double valorBeneficios) {
		       double imposto = salarioBruto * aliquotaImposto;
		       return salarioBruto - imposto - valorBeneficios;
		    }
		}

