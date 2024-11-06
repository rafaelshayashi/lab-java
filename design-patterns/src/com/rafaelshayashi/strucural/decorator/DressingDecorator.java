package com.rafaelshayashi.strucural.decorator;

public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + mustard";
    }
}
