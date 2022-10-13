package com.rafaelshayashi.vector.teste;

import com.rafaelshayashi.vector.Lista;

public class ListaTeste {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(20);

        lista.adiciona("Teste 1");
        lista.adiciona("Teste 2");

        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);
    }
}
