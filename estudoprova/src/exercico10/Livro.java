package exercico10;

public class Livro {
	private String livro;
	private String autor;
	private int paginas;
	private boolean disponivel;
	
	public Livro(String livro, String autor, int paginas) {
		this.livro = livro;
		this.autor = autor;
		this.paginas = paginas;
		this.disponivel = true;
	}

	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
}
