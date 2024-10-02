package exercicio5;

public class Funcionario {
	private String nome;
	private double salarioBruto;
	private String cargoFuncionario;
	
	public Funcionario(String nome, double salarioBruto, String cargoFuncionario) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.cargoFuncionario = cargoFuncionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public String getCargoFuncionario() {
		return cargoFuncionario;
	}
	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}	
}
	    
