package dev.rafaelhayashi.model;

public class Pessoa {

    private String nome;
    private int idade;
    public String endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static Pessoa of(String name, int age){
        return new Pessoa(name, age);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
