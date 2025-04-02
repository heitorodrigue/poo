package com.mycompany.aula20250331setevento;

public class Aula20250331SetEvento {

    public static void main(String[] args) {
        Evento evento = new Evento("Tech Conference 2025");

        evento.adicionarParticipante("Ana", "ana@email.com");
        evento.adicionarParticipante("Carlos", "carlos@email.com");
        evento.adicionarParticipante("Ana", "ana@email.com"); // Teste de e-mail duplicado
        evento.listarParticipantes();

        evento.removerParticipante("carlos@email.com");
        evento.listarParticipantes();
    }
}
