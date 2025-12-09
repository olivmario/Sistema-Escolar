package com.example.demo;

public abstract class Pessoa {
    private String nomePessoa;
    private String nascimento;

    public Pessoa(String nomePessoa, String nascimento) {
        this.nomePessoa = nomePessoa;
        this.nascimento = nascimento;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public String getNascimento() {
        return nascimento;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    
}
