package com.mycompany.aula20230331mapsimples;

public class Aula20230331MapSimples {

    public static void main(String[] args) {
        System.out.println("Agenda");
        
        AgendaTelefonica ag = new AgendaTelefonica();
        ag.inserir("Cassio", "3213561435");
        ag.inserir("Pedro", "786578");
        ag.inserir("Joao", "364534563");
        ag.inserir("Maria", "876754656546");
        
        ag.imprimirAgenda();
    }
}
