package exercico10;

public class Operacao {
    public boolean emprestarLivro(Livro livro,boolean disponivel){
        if(disponivel){
            disponivel = false;
            System.out.println("Emprestado com sucesso!");
            return true;
        }else{
            System.out.println("Livro nao disponivel!");
            return false;
        }
    }
    public void devolverLivro(Livro livro,boolean disponivel){
        if(!disponivel){
            disponivel = true;
            System.out.println("Devolvido com sucesso!");
        }else{
            System.out.println("Livro ja esta disponivel!");
        }
    }
    
}
