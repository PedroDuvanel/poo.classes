package com.poo.classes;

public class Atendente extends Funcionario{

    private String login;
    private String senha;

    public Atendente(String nome, String cpf, Endereco endereco, String login, String senha){
     super(nome, cpf, endereco, senha, login);



    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
