package com.example.demo;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nomePessoa, String nascimento, String matricula){
        super(nomePessoa, nascimento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
