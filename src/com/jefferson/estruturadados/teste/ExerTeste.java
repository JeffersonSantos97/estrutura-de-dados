package com.jefferson.estruturadados.teste;

import com.jefferson.estruturadados.array.VetorTreino;

public class ExerTeste {

    public static void main(String[] args) {

       VetorTreino vetor = new VetorTreino(11);

       vetor.adiciona("Jefferson");
       vetor.adiciona("Brazil");
       vetor.adiciona("Negro");

       // System.out.println(vetor.getTamanho());
        //System.out.println(vetor);

        //System.out.println(vetor.buscar(2));
        vetor.adiciona(1, "Anny");
        vetor.adiciona(3, "Mateus");

        System.out.println(vetor);


    }
}
