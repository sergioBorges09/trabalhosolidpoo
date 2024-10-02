package exercicio13;

import java.util.ArrayList;
import java.util.List;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
}
class Compra {
    private Produto produto;
    private int quantidade;
    public Compra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
public class LojaVirtual {
    private int idLoja;
    private String nomeLoja;
    private String descricaoLoja;
    private List<Produto> produtos;

    public LojaVirtual(int idLoja, String nomeLoja, String descricaoLoja) {
        this.idLoja = idLoja;
        this.nomeLoja = nomeLoja;
        this.descricaoLoja = descricaoLoja;
        this.produtos = new ArrayList<>();
    }
    public int getIdLoja() {
        return idLoja;
    }
    public String getNomeLoja() {
        return nomeLoja;
    }
    public String getDescricaoLoja() {
        return descricaoLoja;
    }
    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }
    public void gerarCarrinhoDeCompras(List<Compra> compras, double percentualDesconto) {
        double valorTotalSemDesconto = 0;
        for (Compra compra : compras) {
            valorTotalSemDesconto += calcularValorTotalCompra(compra);
        }
        double valorTotalComDesconto = aplicarDesconto(valorTotalSemDesconto, percentualDesconto);
        System.out.println("Valor total da compra sem desconto: R$ " + valorTotalSemDesconto);
        System.out.println("Valor total da compra com desconto: R$ " + valorTotalComDesconto);
    }
    public double calcularValorTotalCompra(Compra compra) {
        return compra.getProduto().getPreco() * compra.getQuantidade();
    }
    public double aplicarDesconto(double valorTotal, double percentual) {
        return valorTotal - (valorTotal * (percentual / 100));
    }
}

