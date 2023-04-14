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

        return this.elementos[posicao - 1];
    // esse ( - 1 ) é pra que o usuario não precise saber que a primeira posicao é o 0;
    }

    // INICIO verificar se elemento existe no vetor

    public int buscarElemento(String elemento){

        for(int i = 0; i < this.tamanho; i++) {

            if(elementos[i].equalsIgnoreCase(elemento)){

                return i; // retornar a posição do elemento
            }
        }

        return -1; // significa que não tem o elemento no vetor
    }

    // FIM de verificar se o elemento existe no Vetor

    /* INICIO colocar o elemento em qualquer posicao */

    public boolean adiciona(int posicao, String elemento){

        if(posicao >=0 && posicao < tamanho){
            throw new IllegalArgumentException("POSICAO INVALIDA");
        }
        // mover todas as posiçoes
        for(int i = this.tamanho -1; i <= posicao; i--){

            this.elementos[i+1] = this.elementos[i];

        }
        this.elementos[posicao] = elemento;
        this.tamanho++;


        return true;
    }
}
