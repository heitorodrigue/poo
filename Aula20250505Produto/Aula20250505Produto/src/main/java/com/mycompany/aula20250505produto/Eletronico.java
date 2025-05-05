package com.mycompany.aula20250505produto;

public class Eletronico extends Produto{
    public int voltagem;

    public Eletronico(int voltagem, String nome, double preco) {
        super(nome, preco);
        this.voltagem = voltagem;
    }
    
    @Override
    public void ehCaro(){
        if(preco>200){
            System.out.println("Eletronico caro.");
        }else{
            System.out.println("Eletronico barato.");
        }
    }
    
}
