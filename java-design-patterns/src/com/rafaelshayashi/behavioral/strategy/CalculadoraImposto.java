package com.rafaelshayashi.behavioral.strategy;

public class CalculadoraImposto {

    public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
        return imposto.calcula(orcamento);
    }
}
