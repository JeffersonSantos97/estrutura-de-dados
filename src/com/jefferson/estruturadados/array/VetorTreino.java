package com.jefferson.estruturadados.array;

public class VetorTreino {


    private String[] carrinhoFrutas;
    private int tamanho;

    public VetorTreino(int capacidade){

        carrinhoFrutas = new String[capacidade];
        this.tamanho = tamanho;
    }

    public boolean adiciona(String fruta){

        if(this.tamanho < this.carrinhoFrutas.length){

           carrinhoFrutas[tamanho] = fruta;
           tamanho++;
           return true;
        }

        return false;
    }

    public int getTamanho(){
        return this.tamanho;
    }


    public String toString(){

        StringBuilder s = new StringBuilder();

        s.append("[");
        for(int i = 0; i < tamanho - 1; i++){

            s.append(this.carrinhoFrutas[i]);
            s.append(",");
        }

        if(tamanho > 0) {

            s.append("]");
        }

        return s.toString();
    }

    public String buscar(int posicao){

        if(posicao >=0 && posicao < tamanho) {
            return carrinhoFrutas[posicao - 1];
        }

        return "POSICAO INVALIDA";
    }
}
