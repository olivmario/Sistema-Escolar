package com.example.demo;


public class Disciplina {
    private String nomeDisciplina;
    private double n1;
    private double n2;
    private double media;
    private boolean aprovacao;

    
    public Disciplina(String nomeDisciplina, double n1, double n2, double media, boolean aprovacao) {
        this.nomeDisciplina = nomeDisciplina;
        this.n1 = n1;
        this.n2 = n2;
        this.media = media;
        this.aprovacao = aprovacao;
    }


    public String getNomeDisciplina() {
        return nomeDisciplina;
    }


    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


    public double getN1() {
        return n1;
    }


    public void setN1(double n1) {
        this.n1 = n1;
    }


    public double getN2() {
        return n2;
    }


    public void setN2(double n2) {
        this.n2 = n2;
    }


    public double getMedia() {
        return media;
    }


    public void setMedia(double media) {
        this.media = media;
    }


    public boolean isAprovacao() {
        return aprovacao;
    }


    public void setAprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
    }

}
