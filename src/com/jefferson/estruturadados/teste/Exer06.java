package com.jefferson.estruturadados.teste;

import com.jefferson.estruturadados.array.Vetor;

public class Exer06 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento1");
        vetor.adiciona("Elemento2");
        vetor.adiciona("Elemento3");
        vetor.adiciona("Elemento4");
        vetor.adiciona("Elemento5");



        System.out.println(vetor.buscarElemento("elemento10"));  // return -1
        System.out.println( vetor.buscarElemento("elemento3")); // return 2
    }
}
