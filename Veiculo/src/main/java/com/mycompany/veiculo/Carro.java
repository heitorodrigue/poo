
package com.mycompany.veiculo;


public class Carro {
    private int quantidadee = 0;
    private String modelo;
    private Motorista[] motoristas= new Motorista[100];
    protected Motor motor;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.motor = new Motor(90,"motor");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void dirigir(Motorista motorista){
    for(int i=0;i<quantidadee;i++){
    if(motoristas[i].getNome().equals(motorista.getNome())){
        return;
    }
    }
    if(quantidadee<motoristas.length){
    motoristas[quantidadee] = motorista;
    quantidadee++;
    }
    }

    public int getQuantidadee() {
        return quantidadee;
    }

    public Motor getMotor() {
        return motor;
    }
    @Override
    public String toString(){
    return "Modelo: "+this.modelo+"\n"+"Motor: "+this.motor+"\n"
            +"Quantidade de vezes usada: "+getQuantidadee();
    }
    
}
