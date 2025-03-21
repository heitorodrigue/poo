
package com.mycompany.veiculo;

public class Motorista {
    private static int quantidade=0;
    private String nome;
    private int cnh;

    public Motorista(String nome, int cnh) {
        this.nome = nome;
        this.cnh = cnh;
        quantidade++;
    }
    @Override
    public String toString(){
    return "Nome: "+this.nome+"\n"+
            "Cnh: "+this.cnh;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCnh() {
        return cnh;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }
    
}
