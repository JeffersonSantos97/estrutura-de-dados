package com.jefferson.estruturadados.array;

public class VetorTreino {

    private String[] frutas;
    private int tamanho;

    public VetorTreino(int capacidade){

        this.frutas = new String[capacidade];
        this.tamanho = 0;
    }

   public boolean adicionar(String fruta){

        this.frutas[this.tamanho] = fruta;
        this.tamanho++;
        return true;
   }
}
