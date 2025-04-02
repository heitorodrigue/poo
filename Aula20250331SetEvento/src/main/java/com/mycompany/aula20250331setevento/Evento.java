package com.mycompany.aula20250331setevento;

import java.util.HashSet;
import java.util.Set;

public class Evento {
    String nome;
    Set<Participante> participantes;

    public Evento(String nome) {
        this.nome = nome;
        this.participantes = new HashSet<>();
    }

    public void adicionarParticipante(String nome, String email) {
        // Verifica se o e-mail já existe antes de adicionar
        for (Participante p : participantes) {
            if (p.getEmail().equals(email)) {
                System.out.println("Participante com e-mail " + email + " já está cadastrado.");
                return;
            }
        }
        participantes.add(new Participante(nome, email));
        System.out.println("Participante adicionado com sucesso!");
    }

    public void removerParticipante(String email) {
        Participante encontrado = null;
        for (Participante p : participantes) {
            if (p.getEmail().equals(email)) {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) {
            participantes.remove(encontrado);
            System.out.println("Participante removido.");
        } else {
            System.out.println("Participante não encontrado.");
        }
    }

    public void listarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("Nenhum participante cadastrado.");
        } else {
            System.out.println("Lista de participantes:");
            for (Participante p : participantes) {
                 System.out.println(p.toString());;
            }
        }
    }
}
