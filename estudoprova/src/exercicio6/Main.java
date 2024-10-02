package exercicio6;

public class Main {
	public static void main(String[] args) {
	Produto produto = new Produto ("Arroz",12.00,20);
	OperacaoProduto operacao= new OperacaoProduto();
	
	double valorTotal = operacao.calcularValorTotal(produto);
	System.out.println("O valor total do produto: "+valorTotal);
	boolean disponivel = operacao.produtoDisponivel(produto);
	System.out.println("Quantidade total de produto disponiveis: "+disponivel);
	}
}
