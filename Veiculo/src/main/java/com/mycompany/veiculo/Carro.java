
package com.mycompany.veiculo;


public class Carro {
    private int quantidadee;
    private String modelo;
    private Motorista motorista;
    protected Motor motor;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.quantidadee++;
        this.motor = new Motor();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadee() {
        return quantidadee;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public Motor getMotor() {
        return motor;
    }
    @Override
    public String toString(){
    return "Modelo: "+this.modelo+"\n"+"Motor: "+this.motor+"\n"
            +"Quantidade de vezes usada: "+this.quantidadee;
    }
    
}
