
package com.mycompany.veiculo;

public class Motor {
    protected int potencia;
    protected String tipo;

    public Motor(){ 
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
    return "Potencia: "+this.potencia+"\n"+
            "Tipo: "+this.tipo;
    }
}
