package com.poo.classes;

public class Autor {

    private static int contadorAutor = 0;

    public int autorId;
    public String nome;

    public Autor(String nome) {

            if (nome == null || nome.trim().isEmpty()) {
                throw new IllegalArgumentException("O nome do autor não pode ser vazio");
            
            }

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
