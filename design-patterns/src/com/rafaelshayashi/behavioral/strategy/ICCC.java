package com.rafaelshayashi.behavioral.strategy;

public class ICCC implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        double valor = orcamento.getValor();
        if (valor < 1000.0) {
            return valor * 0.05;
        } else if (valor >= 1000.0 && valor <= 3000.00) {
            return valor * 0.07;
        } else {
            return (valor * 0.08) + 30.0;
        }
    }
}
