package com.mycompany.agenda;
public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
    
    @Override
    public String toString(){
    return "Nome: "+nome+"\n"+"Numero:"+numero;
    }
}
