package com.mycompany.aula20250331mapcontato;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
        
    private ArrayList<Contato> colecao = new ArrayList<Contato>();
    
    public void inserir(String nome, String telefone){
        Contato temp = new Contato(nome, telefone);
        this.colecao.add(temp);
    }
    
    public Contato buscar(String nome){
        for(Contato contato : colecao){
          if(contato.getNome().equalsIgnoreCase(nome)){
              return contato;}
    }
        return null;
    }
    
  
    public int tamanho(){
        return this.colecao.size();
    }
    
    public void remover(String nome){
        colecao.remove(nome);   
    }
    
    public void imprimirAgenda(){
        if(this.colecao.isEmpty()){
          System.out.println("Sem registros");  
        }else{
            for (int i = 0; i<colecao.size(); i++){
                System.out.println(colecao.get(i)); 
            }
            
        }
    }
    
}
