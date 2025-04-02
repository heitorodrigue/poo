package com.mycompany.aula20250331listcontato;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> colec;

    public AgendaTelefonica() {
        this.colec = new ArrayList<>();
    }
    
    public void inserir(String nome, String telefone) {
        colec.add(new Contato(nome, telefone));
    }
    
    public Contato buscar(String nome) {
        for (Contato c : colec) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }
    
    public int quantidade() {
        return colec.size();
    }
    
    public void remover(String nome) {
        Contato contatoParaRemover = null;
        for (Contato c : colec) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                contatoParaRemover = c;
                break;
            }
        }
        if (contatoParaRemover != null) {
            colec.remove(contatoParaRemover);
            System.out.println("Contato removido");
        } else {
            System.out.println("Nao encontrado");
        }
    }
    
    public void imprimir() {
        if (colec.isEmpty()) {
            System.out.println("Agenda Vazia");
        } else {
            for (Contato c : colec) {
                System.out.println(c);
            }
        }
    }
}
