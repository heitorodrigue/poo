package com.mycompany.aulaencapsulamento;

public class AulaEncapsulamento {

    public static void main(String[] args) {
        System.out.println("Teste!");
        
        Teste t1 = new Teste(10,20,30);
        Teste t2 = new Teste();
        Teste t3 = new Teste();
       
        System.out.println(Teste.getQuantidade());
    }
}
