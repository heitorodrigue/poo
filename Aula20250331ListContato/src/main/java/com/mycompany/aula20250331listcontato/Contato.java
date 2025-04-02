package com.mycompany.aula20250331listcontato;

public class Contato {
        String nome;
    String numero;

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
    public String toString() {
        return "Contato{" + "nome=" + nome + ", numero=" + numero + '}';
    }
}
