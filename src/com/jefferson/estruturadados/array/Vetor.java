package com.jefferson.estruturadados.array;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;
    //INICIO  Definir a capacidade do elemento //
    public Vetor(int capacidade) {

         this.elementos = new String[capacidade];
         this.tamanho = 0;

    }
   /* FINAL definir a capacidade do elemento  */

    // INICIO ADICIONAR ELEMENTO //
    public boolean adiciona(String elemento){


        if(tamanho < elementos.length){

            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }

        return false;
    }

    // FIM ADICIONAR ELEMENTOS //

    // INICIO VERIFICAR TAMANHO //

    public int getTamanho(){

        return this.tamanho;
    }

    // FIM VERIFICAR TAMANHO //

    // INICIO IMPRIMIR OS ELEMENTOS //
    public String toString(){

        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < this.tamanho - 1; i++) {
        s.append(this.elementos[i]);
        s.append(",");

        }

        if(this.tamanho > 0 ) {

            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();

    }

    // FIM IMPRIMIR OS ELEMENTOS //

    // INICIO BUSCAR ELEMENTOS DE UMA POISIÇÃO //

    public String busca(int posicao) {
    if(!(posicao >=0 && posicao < tamanho)) {

        throw new IllegalArgumentException("POSICAO INVALIDA");
    }

        return this.elementos[posicao];
    }
}
