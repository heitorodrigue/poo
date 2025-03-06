package com.mycompany.aula20250306conta;

public class Aula20250306Conta {

    public static void main(String[] args) {
        
        System.out.println("BANCO");
        
        Cliente cli = new Cliente();
        cli.nome = "cassio";
        cli.sobrenome= "Rodrigues";
        cli.CPF= "1212211";
        
        Conta c1 = new Conta();
        c1.numero = 10;
        c1.limite = 1000;
        c1.saldo = 2000;
        c1.dono = cli;
        
        c1.Depositar(100);

        boolean resultado;
        resultado = c1.Sacar(300);
        System.out.println(resultado);

        
        
    }
}
