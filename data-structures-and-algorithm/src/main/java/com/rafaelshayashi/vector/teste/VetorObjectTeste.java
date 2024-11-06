package com.rafaelshayashi.vector.teste;

import com.rafaelshayashi.vector.VetorObject;

public class VetorObjectTeste {

    public static void main(String[] args) {

        /*
         * Para tornar o vetor mais dinamico e nao especificamente tipado, uma primeira abordagem e transformar o vetor
         * com o tipo Object que eh a superclasse de todos os objetos no java
         *
         * Essa abordagem porem tras um problema que e a da possibilidade de ter elementos de diferentes tipos dentro do
         * mesmo array
         */
        VetorObject vetorObject = new VetorObject(10);

        vetorObject.adiciona("Teste 1");
        vetorObject.adiciona("Teste 2");

        System.out.println("======================================================================");
        System.out.println("Um vetor de objects");
        System.out.println(vetorObject);
    }
}
