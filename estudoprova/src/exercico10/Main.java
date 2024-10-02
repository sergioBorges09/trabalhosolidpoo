package exercico10;

public class Main {
	public static void main(String[] args) {
		Livro livro = new Livro("Diario de um banana","Sergio",560);
		Operacao operacao = new Operacao();
		System.out.println("O Livro esta disponivel?"+livro.isDisponivel());
		operacao.emprestarLivro(livro, false);
		System.out.println("O livro esta disponivel? "+livro.isDisponivel());
		operacao.devolverLivro(livro, false);
	}
}
