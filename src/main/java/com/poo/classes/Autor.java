package com.poo.classes;

public class Autor extends Pessoa {

    private static int contadorAutor = 0;

    public int autorId;
    public String nome;

    public Autor(String nome, String cpf, Endereco endereco, int autorId) {
        super(nome, cpf, endereco);
        this.nome = nome;
        this.autorId = contadorAutor++;

    }

    public int getautorId() {
        
        return autorId;

    }

    public String getNome() {

        return nome;

    }

    public void getautorId(int autorId) {

        this.autorId = autorId;

    }

    public void setNome(String nome) {
        
        this.nome = nome;

    }

}
