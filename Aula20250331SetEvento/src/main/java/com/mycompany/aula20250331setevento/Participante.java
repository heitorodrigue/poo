package com.mycompany.aula20250331setevento;

public class Participante {
    private String nome;
    private String email;
    
    public Participante(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email;
    }
}
