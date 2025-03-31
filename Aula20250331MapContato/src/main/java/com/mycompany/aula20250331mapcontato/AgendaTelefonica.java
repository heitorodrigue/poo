package com.mycompany.aula20250331mapcontato;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
        
    private Map<String, Contato> colecao;

    public AgendaTelefonica() {
        this.colecao = new HashMap<>();
    }
    
    public void inserir(String nome, String telefone){
        Contato temp = new Contato(nome, telefone);
        this.colecao.put(nome, temp);
    }
    
    public Contato buscar(String nome){
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
            /*for(Map.Entry<String, String> contato: this.colecao.entrySet()){
                System.out.println("Nome: "+contato.getKey()+" ("+contato.getValue()+")");  
            }*/
            for(String chave : colecao.keySet()){
                System.out.println(colecao.get(chave).toString()); 
            }
            
        }
    }
    
}
