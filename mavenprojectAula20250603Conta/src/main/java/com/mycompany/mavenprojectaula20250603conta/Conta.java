
package com.mycompany.mavenprojectaula20250603conta;


public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;
    
    boolean Sacar(double valor){
        if(valor > saldo){
            System.out.println("Saque nao permitido");
            return false;
        }else{
            saldo-= valor;
            System.out.println("Saque liberrado");
            return true;
        }
    }
        
       
    
    
    void Depositar(double valor){
        saldo += valor;
    }
}
