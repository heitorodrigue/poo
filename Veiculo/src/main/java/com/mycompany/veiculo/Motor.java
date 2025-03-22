
package com.mycompany.veiculo;

public class Motor {
    protected int potencia;
    protected String tipo;

    public Motor(int potencia, String tipo){
        this.potencia = potencia;
        this.tipo = tipo;
    }

   
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
    return "Potencia: "+potencia+"\n"+
            "Tipo: "+tipo;
    }
}
