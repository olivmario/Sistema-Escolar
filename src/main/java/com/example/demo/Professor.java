package com.example.demo;

public class Professor extends Pessoa {
    public String siape;
    public String formacao;

    public Professor(String nomePessoa, String nascimento, String siape, String formacao){
        super(nomePessoa, nascimento);
        this.siape = siape;
        this.formacao = formacao;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
}
