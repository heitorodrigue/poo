
package com.mycompany.agenda;
import java.util.HashMap;
import java.util.Map; 
     
public class Agenda {
   private Map<String, Contato> contato;
   
   public Agenda(){
   this.contato= new HashMap<>();
   }
           
   public void inserir(Contato contato){
   this.contato.put(contato.getNome(), contato);
   }        
   
   public Contato buscar(String nome){
   return this.contato.get(nome);
   }
   
   public void remover(String nome){
   this.contato.remove(nome);
   }
   
   public int tamanho(){
   return this.contato.size();
   }
public static void main(String[] args) {
       Agenda agenda = new Agenda();
       
       Contato contato1=new Contato("Heitor","279999");
       Contato contato2=new Contato("Cassio","278888");
       Contato contato3=new Contato("Bruno","275555");
       Contato contato4=new Contato("Pedro","272222");
       Contato contato5=new Contato("Dudu","271111");
    agenda.inserir(contato1);
     agenda.inserir(contato2);
      agenda.inserir(contato3);
       agenda.inserir(contato4);
        agenda.inserir(contato5);

    agenda.remover("Cassio");
    System.out.println(agenda.tamanho());
    System.out.println(agenda.buscar("Heitor"));
}
   
    }

