package com.mycompany.aula20250505produto;

public class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        System.out.println("Construtor de Produto");
    }
    
    public void ehCaro(){
        if(preco>100){
            System.out.println("Produto caro.");
        }else{
            System.out.println("Produto barato.");
        }
    }
}
