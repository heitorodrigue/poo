
package com.mycompany.aulaencapsulamento;


public class Teste {
    public int a;
    public int b;
    private int c;
    private static int quantidade = 0;
    
    public Teste(int a, int b , int c){
    this.a = a;
    this.b = b;
    this.c = c;
    quantidade++;
    }

    public static int getQuantidade() {
        return quantidade;
    }
    
    public Teste(){
    quantidade++;
    }
    public int getC(){
    return this.c;
    }

    
     
      
  
    public void ImprimeA(){
        System.out.println("Valor de a: "+a);
    }
    public void ImprimeB(){
        System.out.println("Valor de b: "+b);
    }
    public void ImprimeC(){
        System.out.println("Valor de a: "+c);
    }
}
