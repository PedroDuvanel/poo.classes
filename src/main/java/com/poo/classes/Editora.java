package com.poo.classes;

public class Editora {

    private static int contadorEditora = 0;

    int editoraId;
    String nome;

    public Editora(String nome, int editoraId){

        this.nome = nome;
        editoraId = contadorEditora;
        contadorEditora++;

    }

    public int getEditoraId() {

        return editoraId;

    }

    public String getNome() {

        return nome;

    }

    public void setEditoraId(int editoraId) {

        this.editoraId = editoraId;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }
    
}
