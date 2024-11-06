package com.rafaelshayashi.vector.teste;

import com.rafaelshayashi.vector.Vetor;

public class VetorTeste {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);


        vetor.adiciona("Elemento 1"); // Index array 0 (posicao) - Tamanho 1
        vetor.adiciona("Elemento 2"); // Index array 1 (posicao) - Tamanho 2
        vetor.adiciona("Elemento 3"); // Index array 2 (posicao) - Tamanho 3
        vetor.adiciona("Elemento 4"); // Index array 3 (posicao) - Tamanho 4


        System.out.println("O tamanho do Vetor é : " + vetor.tamanho());
        System.out.println("Imprimindo o vetor : " + vetor);

        System.out.println("======================================================================");
        System.out.println("Obtendo um elemento pela sua posicao");
        System.out.println(vetor.busca(2));

        System.out.println("======================================================================");
        System.out.println("Procurando um elemento");
        System.out.println("O 'Elemento 3' está na posicao : " + vetor.busca("Elemento 1"));

        System.out.println("======================================================================");
        System.out.println("Adicionando um elemento na posicao 2");
        System.out.println(vetor);
        vetor.adiciona(0, "Elemento adicionado");
        System.out.println(vetor);

        System.out.println("======================================================================");
        System.out.println("Aumentando a capacidade do vetor de forma dinamica");
        System.out.println(vetor.tamanho());
        vetor.adiciona("Elemento 5");
        vetor.adiciona("Elemento 6");
        vetor.adiciona("Elemento 7");
        vetor.adiciona("Elemento 8");
        vetor.adiciona("Elemento 9");
        vetor.adiciona("Elemento 10");
        vetor.adiciona("Elemento 11");
        System.out.println(vetor);
        System.out.println(vetor.tamanho());

        System.out.println("======================================================================");
        System.out.println("Removendo um elemento pela sua posicao");
        System.out.println(vetor);
        System.out.println("Removendo");
        vetor.remove(2);
        System.out.println(vetor);

    }
}
