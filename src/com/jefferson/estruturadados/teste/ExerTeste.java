package com.jefferson.estruturadados.teste;

import com.jefferson.estruturadados.array.VetorTreino;

public class ExerTeste {

    public static void main(String[] args) {

        VetorTreino vetor = new VetorTreino(10);

        vetor.adiciona("Feijão");
        vetor.adiciona("Arroz");
        vetor.adiciona("Farinha");


        System.out.println(vetor.buscaDaPosicao(2));

        System.out.println(vetor.verificarProduto("Arroz"));




    }
}
