package com.mycompany.aula20250331mapcontato;

public class Aula20250331MapContato {

    public static void main(String[] args) {
        System.out.println("Agenda");
        
        AgendaTelefonica ag = new AgendaTelefonica();
        ag.inserir("Cassio", "3213561435");
        ag.inserir("Pedro", "786578");
        ag.inserir("Joao", "364534563");
        ag.inserir("Maria", "876754656546");
        
        
        System.out.println(ag.buscar("Joao"));
    }
}