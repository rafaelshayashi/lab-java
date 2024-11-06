package com.rafaelshayashi.vector;

import java.util.Objects;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // Recomendacao do efective java
        this.tamanho = 2;
    }

    public Lista(){
        this(10);
    }

    public boolean adiciona(T elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento) {
        isPosicaoValida(posicao);
        aumentaCapacidade();

        // Swap para direita de todos os elementos
        for (int i = this.tamanho; i > posicao; i--) {
            this.elementos[i] = this.elementos[i - 1];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                novosElementos[i] = this.elementos[i];
            }
            this.elementos = novosElementos;
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public void remove(int posicao) {
        isPosicaoValida(posicao);
        for (int i = posicao; i < (this.tamanho - 1); i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public void remove(T elemento){
        int busca = busca(elemento);
        if(busca > -1){
            remove(busca);
        }
    }

    private void isPosicaoValida(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
    }

    public T busca(int posicao) {
        isPosicaoValida(posicao);
        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int ultimoIndice(T elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento) {
        return busca(elemento) > -1;
    }

    public T obtem(int posicao){
        return busca(posicao);
    }

    public void limpar(){
        this.elementos = (T[]) new Objects[this.tamanho];
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        // Vai até o penultimo elemento
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        // O ultimo elemento é tamanho - 1 pois o Array é zero index
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }
}