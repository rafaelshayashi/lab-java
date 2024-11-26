package dev.hayashi.util;

import dev.hayashi.model.Pessoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Predicate;

public class Validations {

    public static void main(String[] args) {
        // Dado um Objeto quero validar todos os seus atributos e retornar um HashMap contendo quais regras falharam

        Pessoa pessoaValida = new Pessoa();
        pessoaValida.setNome("Carlos Souza");
        pessoaValida.setIdade(20);
        pessoaValida.setEndereco("Rua qualquer");

        Pessoa pessoaInvalida = new Pessoa();
        pessoaInvalida.setNome(null);
        pessoaInvalida.setIdade(0);
        pessoaInvalida.setEndereco(null);

        Predicate<Pessoa> nomeValido = p -> p.getEndereco() != null && !p.getNome().isEmpty();
        Predicate<Pessoa> idadeValida = p -> p.getIdade() > 18;
        Predicate<Pessoa> enderecoValido = p -> p.getEndereco() != null && !p.getEndereco().isEmpty();

        ArrayList<Predicate<Pessoa>> validadores = new ArrayList<>();
        validadores.add(nomeValido);
        validadores.add(idadeValida);
        validadores.add(enderecoValido);

        HashMap<String, Predicate<Pessoa>> validadoresMap = new HashMap<>();

        validadoresMap.put("nomeValido", nomeValido);
        validadoresMap.put("idadeValida", idadeValida);
        validadoresMap.put("enderecoValido", enderecoValido);

        HashMap<String, Boolean> resultado1 = new HashMap<>();
        validadoresMap.forEach((k,v) -> resultado1.put(k,v.test(pessoaValida)));
        HashMap<String, Boolean> resultado2 = new HashMap<>();
        validadoresMap.forEach((k,v) -> resultado2.put(k,v.test(pessoaInvalida)));


        boolean test1 = nomeValido.and(idadeValida).and(enderecoValido).test(pessoaValida);
        boolean test2 = nomeValido.and(idadeValida).and(enderecoValido).test(pessoaInvalida);

        System.out.println("A primeira pessoa é " + test1);
        System.out.println("A segunda pessoa é " + test2);
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
