package com.poo.classes;


public class Pessoa {

    private static int contadorPessoa = 0;

    int pessoaId;
    String cpf;
    String rg;
    String nome;
    private Endereco endereco;

    Pessoa(String nome, String cpf, Endereco endereco, int pessoaId){

        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.pessoaId = contadorPessoa;
        contadorPessoa++;

    }

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

    public Endereco getEndereco() {

        return endereco;

    }

    public void setpessoaId(int pessoaId) {

        this.pessoaId = pessoaId;

    }

    public void setNome( String nome){

        this.nome = nome;

    }

    public  void setCpf( String cpf){

        if (isValidCpf(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido. Deve conter exatamente 11 dígitos.");
        }

    }

    public void setRg( String rg) {

        this.rg = rg;

    }

    public void setEndereco(Endereco endereco) {
        
        this.endereco = endereco;

    }

    private boolean isValidCpf(String cpf) {

        cpf = cpf.replaceAll("\\D", "");
        
        return cpf.length() == 11;
    }
}
