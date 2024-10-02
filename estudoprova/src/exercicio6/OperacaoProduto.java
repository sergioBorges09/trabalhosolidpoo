package exercicio6;

public class OperacaoProduto {
	public double calcularValorTotal(Produto produto) {
		return produto.getPreco() * produto.getQuantEstoque();
	}
	public boolean produtoDisponivel(Produto produto) {
		return produto.getQuantEstoque() > 0;
	}
}
