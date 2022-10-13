package com.rafaelshayashi.vector.teste;

import com.rafaelshayashi.vector.Lista;

public class ListaExercicios {

    public static void main(String[] args) {
        //exercicioContem();
        //exercicioUltimoIndice();
        //exercicioRemove();
        //exercicioObtem();
        exercicioLimpar();
    }

    private static void exercicioUltimoIndice(){

        Lista<String> lista = new Lista<>(10);

        lista.adiciona("elemento 1"); // posicao 0
        lista.adiciona("elemento 2"); // posicao 1
        lista.adiciona("elemento 3"); // posicao 2
        lista.adiciona("elemento 4"); // posicao 3
        lista.adiciona("elemento 2"); // posicao 4

        System.out.println("Buscando a primeira ocorrencia " + lista.busca("elemento 2"));
        System.out.println("Buscando a ultima ocorrencia " + lista.ultimoIndice("elemento 2"));

    }

    private static void exercicioContem() {

        // Melhore a classe lista e implemente o metodo contem do ArrayList
        Lista<String> lista = new Lista<>(10);

        lista.adiciona("elemento 1");
        lista.adiciona("elemento 2");
        lista.adiciona("elemento 3");

        System.out.println("======================================================================");
        System.out.println("Implementacao metodo comtem");
        System.out.println(lista.contem("elemento 1"));
        System.out.println(lista.contem("elemento 5"));
    }

    private static void exercicioRemove(){
        // Melhore a classe lista e implemente o metodo contem do ArrayList
        Lista<String> lista = new Lista<>(10);

        lista.adiciona("elemento 1");
        lista.adiciona("elemento 2");
        lista.adiciona("elemento 3");
        lista.adiciona("elemento 4");
        lista.adiciona("elemento 2");

        System.out.println(lista);
        lista.remove("elemento 2");
        System.out.println(lista);
    }

    private static void exercicioObtem(){
        // Melhore a classe lista e implemente o metodo contem do ArrayList
        Lista<String> lista = new Lista<>(10);

        lista.adiciona("elemento 1"); // posicao 0
        lista.adiciona("elemento 2"); // posicao 1
        lista.adiciona("elemento 3"); // posicao 2
        lista.adiciona("elemento 4"); // posicao 3
        lista.adiciona("elemento 2"); // posicao 4


        System.out.println("O valor do elemento na posicao 2 eh " + lista.obtem(2));
    }

    private static void exercicioLimpar() {
        // Melhore a classe lista e implemente o metodo contem do ArrayList
        Lista<String> lista = new Lista<>(10);

        lista.adiciona("elemento 1"); // posicao 0
        lista.adiciona("elemento 2"); // posicao 1
        lista.adiciona("elemento 3"); // posicao 2
        lista.adiciona("elemento 4"); // posicao 3
        lista.adiciona("elemento 2"); // posicao 4

        System.out.println(lista);
        System.out.println(lista.tamanho());
        lista.limpar();
        System.out.println(lista);
        System.out.println(lista.tamanho());
    }
}
