package com.example.demo;

import java.util.Scanner;


public class Main {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("######\n");
System.out.println("Bem vindo ao Sistema escolar");
System.out.print("######\n\n");

System.out.print("Inicialmente, nós conte se você é:\n 1 para Administrador; \n 2 para Professor; \n 3 para Aluno;\n");
 int acao = input.nextInt();
 if (acao == 1){
    System.out.print("São necessários algumas informações para login\n\n Digite seu login:\n");
    String login = input.next();
    System.out.print("Agora digite a senha:");
    String senha = input.next();
    System.out.println(login + senha);
}

 if (acao == 2){
    System.out.print("São necessários algumas informações para login\n\n Digite seu login:\n");
    String login = input.next();
    System.out.print("Agora digite a senha:");
    String senha = input.next();
    System.out.println(login + senha);





}
    
}}
