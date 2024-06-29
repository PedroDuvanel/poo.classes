package com.poo.classes;


public class Pessoa {

    int pessoaId;
    String cpf;
    String rg;
    String nome;

    public int getpessoaId() {

        return pessoaId;

    }

    public String getNome() {

        return nome;

    }

    public String getCpf() {

        return cpf;

    }

    public String getRg() {

        return rg;

    }

    public void setpessoaId(int pessoaId) {

        this.pessoaId = pessoaId;

    }

    public void setNome( String nome){

        this.nome = nome;

    }

    public  void setCpf( String cpf){

        this.cpf = cpf;

    }

    public void setRg( String rg) {

        this.rg = rg;

    }

}
