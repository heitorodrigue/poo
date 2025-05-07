
package com.d.aula20250505produto;

public class Livro extends Produto{
     public String autor;
    public int paginas;

    public Livro(String autor, int paginas, String nome, double preco) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
        System.out.println("Construtor de Livro");
    }

   
    
    public void ehGrande(){
        if(paginas>200){
            System.out.println("Livro grande.");
        }else{
            System.out.println("Livro pequeno.");
        }
    }
    
    public void ehGrande(boolean ehInfantil){
        if(paginas>13){
            System.out.println("Livro infantil grande.");
        }else{
            System.out.println("Livro infantil pequeno.");
        }
    }
}
