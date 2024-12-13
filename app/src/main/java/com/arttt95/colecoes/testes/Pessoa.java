package com.arttt95.colecoes.testes;

public class Pessoa {

    private String nome = "";
    int idade = 0;

    public String getNome() {
        System.out.println("get: " + nome);
        return nome;
    }

    public void setNome(String nome) {
//        nome = nome.toUpperCase();
        this.nome = nome;
        System.out.println("set: " + nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
