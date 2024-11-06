package com.rafaelshayashi.vector.teste;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        //criando();

        testIndexOf();

    }

    private static void testIndexOf() {
        ArrayList<String> list = new ArrayList<>();

        list.add("element 1"); // posicao 0
        list.add("element 2"); // posicao 1
        list.add("element 3"); // posicao 2
        list.add("element 2"); // posicao 3
        list.add("element 2"); // posicao 4
        list.add("element 4"); // posicao 5
        list.add("element 5"); // posicao 6
        list.add("element 2"); // posicao 7

        System.out.println("A primeira posicao do element 2 eh " + list.indexOf("element 2"));
        System.out.println("A ultima posicao do element 2 eh " + list.lastIndexOf("element 2"));
        System.out.println("Buscando um elemento que nao exite " + list.lastIndexOf("elemento nao existe"));

    }

    private static void criando(){
        // Iniciando um array list sem um tamanho definido, por padrao sera 10
        ArrayList<String> list = new ArrayList<>();
        list.add("Elemento list 1");
        list.add("Elemento list 2");


        // Nesse caso sera iniciado um array com tamanho 30
        ArrayList<String> listComTamanho = new ArrayList<>(30);

        // Criando um array com base alguma coisa que extenda Collections
        ArrayList<String> strings = new ArrayList<>(listComTamanho);
    }
}
