package com.mycompany.exercicio20250313;

import java.util.Random;

public class CLASS {

    public String Matricula;
    private String Nome;
    private String Curso;
    private int Turma;
    private int Periodo;
    public double Nota1;
    public double Nota2;
    public double NotaFinal;

    public String GetNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public CLASS() {
        Random rand = new Random();
        int NumeroAleatorio = rand.nextInt(9999);
        this.Matricula = String.format("2025" + NumeroAleatorio);
    }

    public double GerarMedia() {
        return (Nota1 + Nota2) / 2;
    }

   
 

    public int getTurma() {
        return Turma;
    }

    public int getPeriodo() {
        return Periodo;
    }

    public void setTurma(int Turma) {
        this.Turma = Turma;
    }

    public void setPeriodo(int Periodo) {
        this.Periodo = Periodo;
    }

}













//public int alunos{
//public int static qtd alunos=2000;
//}

 //public int Aleatorio(){
//private int numero;
//public Aleatorio(){
//Random rand= new random();
//numero = rand.nextInt(4);
//}
//}

//public int Matricula{
 //public static void main(string[]args){
 //Aleatorio aleat= new.aleatorio()+2025;
 //}
//}
