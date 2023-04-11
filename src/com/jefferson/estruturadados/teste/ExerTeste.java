package com.jefferson.estruturadados.teste;

import com.jefferson.estruturadados.array.VetorTreino;

public class ExerTeste {

    public static void main(String[] args) {


        VetorTreino vetor = new VetorTreino(5);

        vetor.adiciona("Jefferson");
        vetor.adiciona("Beatriz");
        vetor.adiciona("Nala");
        vetor.adiciona("Akin");
        vetor.adiciona("Heru");


        System.out.println(vetor);

        System.out.println(vetor.buscar(6));


    }
}
