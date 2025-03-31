package com.mycompany.aula20230331mapsimples;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
    
    private Map<String, String> colecao;

    public AgendaTelefonica() {
        this.colecao = new HashMap<>();
    }
    
    public void inserir(String nome, String telefone){
        this.colecao.put(nome, telefone);
    }
    
    public String buscar(String nome){
        return this.colecao.get(nome);
    }
    
    public int tamanho(){
        return this.colecao.size();
    }
    
    public void remover(String nome){
        if(this.colecao.remove(nome) != null){
            System.out.println("Removido");
        }else{
            System.out.println("Não encontrado");
        }   
    }
    
    public void imprimirAgenda(){
        if(this.colecao.isEmpty()){
          System.out.println("Sem registros");  
        }else{
            for(Map.Entry<String, String> contato: this.colecao.entrySet()){
                System.out.println("Nome: "+contato.getKey()+" ("+contato.getValue()+")");  
            }
            for(String chave : colecao.keySet()){
                System.out.println("Nome: "+chave+" ("+colecao.get(chave)+")"); 
            }
            
        }
    }
    
}
