package com.example.demo;
import java.util.List;

public class Diario {
    private String codigo;
    private String professor;
    private List<String> alunos;
    
    public Diario(String codigo, String professor, List<String> alunos) {
        this.codigo = codigo;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public List<String> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<String> alunos) {
        this.alunos = alunos;
    }

    public void addAlunos(String alunos){
        this.alunos.add(alunos);
    }

    
}
