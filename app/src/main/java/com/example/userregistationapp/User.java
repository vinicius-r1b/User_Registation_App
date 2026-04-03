package com.example.userregistationapp;

//Importa anotações do Room necessarios para mapear esta classe como uma entidade
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    //Define p campo "id" como chave primaria da tabela e configura para ser gerado automaticamente
    @PrimaryKey(autoGenerate = true)
    private int id;
    //Campos que representam as colunas da tabela para armazenar os dados do usuario
    private String name;  //Nome do usuario
    private String cpf;   //CPF do usuario
    private String email; //Email do usuario
    private String phone; //Fone do usuario
    //Construtor da classe que sera usado para crirar novo objeto User
    public User(String name, String cpf, String email, String phone){
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
    }
    //Metodos getter e setter para acessar e modificar os dados do objeto User

    //Retorna ID do usuario
    public int getId(){return id;}

    //Define ID do usuario (usado pelo Room para preencher automaticamente)
    public void setId(int id){this.id = id;}

    //Retorna o nome do usuario
    public String getName(){return name;}

    //Retorna o CPF do usuario
    public String getCpf(){return cpf;}

    //Retorna o email do usuario
    public String getEmail(){return email;}

    //Retorna o telefone do usuario
    public String getPhone(){return phone;}
}
