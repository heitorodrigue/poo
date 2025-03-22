
package com.mycompany.veiculo;

public class Veiculo {

    public static void main(String[] args) {
        System.out.println("Status");
        Motorista m = new Motorista("Heitor",12);
        Carro c = new Carro("Camaro");
        Motorista mm = new Motorista("Jefferson",10);
        Carro cc = new Carro("Corvette");
        Motorista mmm = new Motorista("Cassio",100);

        
c.dirigir(m);
c.dirigir(mm);
cc.dirigir(mmm);
cc.motor.potencia=170;
cc.motor.tipo="O melhor";
c.motor.potencia= 90;
c.motor.tipo="Rapidao";
System.out.println("Piloto 1:");
System.out.println(mm);
System.out.println(c);
System.out.println("-------------------------");
System.out.println("Piloto 2:");
System.out.println(m);
System.out.println(c);
System.out.println("-------------------------");
System.out.println("Piloto 3:");
System.out.println(mmm);
System.out.println(cc);
System.out.println("-------------------------");
System.out.println("Quantos pilotos: "+Motorista.getQuantidade());
}
}
