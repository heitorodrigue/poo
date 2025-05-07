package com.d.aula20250505produto;

import java.util.ArrayList;
import java.util.List;

public class Aula20250505Produto {

    public static void main(String[] args) {
        //Produto p1 = new Produto("Produto generico", 150.9);
        //p1.ehCaro();
        
        Livro l1 = new Livro ("Pablo M.", 50, "Cafe com Deus Pai", 500.9);

        Eletronico e1 = new Eletronico(110, "cafeteira", 150.9);
        
        List<Produto> listaGenerica = new ArrayList<>();
        listaGenerica.add(l1);
        listaGenerica.add(e1);
        
        for(Produto p : listaGenerica){
            System.out.println(p.nome);
            p.ehCaro();
             if (p instanceof Livro l) {
                l.ehGrande();
        }
        }
    }
}
