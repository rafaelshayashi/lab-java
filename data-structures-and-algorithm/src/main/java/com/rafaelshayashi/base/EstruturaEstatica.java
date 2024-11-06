package com.rafaelshayashi.base;

public class EstruturaEstatica<T> {

    private T[] elementos;
    private int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // Recomendacao do efective java
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
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

    private void isPosicaoValida(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
    }

    public int tamanho() {
        return tamanho;
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