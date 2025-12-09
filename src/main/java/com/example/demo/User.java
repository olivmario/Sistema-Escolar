package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity//Faz isso virar uma tabelo no banco
public class User{

@Id//Id do usuário para o banco
@GeneratedValue(strategy = GenerationType.IDENTITY)//Valida o id para coloca ele no banco
private String nome;
private String cpf;
private String email;
private int idade;
private String Senha; 

}

public interface User extends JpaRepository {

    
}
