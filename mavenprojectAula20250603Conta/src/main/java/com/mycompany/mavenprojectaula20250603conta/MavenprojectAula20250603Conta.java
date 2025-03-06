

package com.mycompany.mavenprojectaula20250603conta;


public class MavenprojectAula20250603Conta {

    public static void main(String[] args) {
        System.out.println("BANCO");
        
        Conta c1 = new Conta();
        c1.numero = 10;
        c1.nome = "heitor";
        c1.limite = 1000;
        c1.saldo = 2000;
        
        c1.Depositar(100);
        
        c1.Sacar(300);
    }
}
