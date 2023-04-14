package com.jefferson.estruturadados.teste;

import com.jefferson.estruturadados.array.Vetor;

public class Exer04 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        System.out.println(vetor.getTamanho());

        System.out.println(vetor);

        System.out.println(vetor.busca(1));


    }
}
