package com.rafaelshayashi.behavioral.strategy;

public class ImpostoTest {

    public static void main(String[] args) {
        ICMS icms = new ICMS();
        ISS iss = new ISS();
        ICCC iccc = new ICCC();

        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        Orcamento orcamento = new Orcamento(3001.0);

        double valorIcms = calculadoraImposto.realizaCalculo(orcamento, icms);
        System.out.println("O valor do ICMS é: " + valorIcms);

        double valorIss = calculadoraImposto.realizaCalculo(orcamento, iss);
        System.out.println("O valor do ISS é: " + valorIss);

        double valorIccc = calculadoraImposto.realizaCalculo(orcamento, iccc);
        System.out.println("O valor do ICCC é: " + valorIccc);
    }
}
