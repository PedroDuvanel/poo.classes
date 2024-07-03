package com.poo.classes;

public class Livro {

    private static int contadorLivro = 0;

    int livroId;
    String edicao;
    String titulo;
    int ano;

    public Livro(int livroId, String edicao, String titulo, int ano){

        this.edicao = edicao;
        this.titulo = titulo;
        this.ano = ano;
        this.livroId = contadorLivro;
        contadorLivro++;

    }

    public int getLivroId() {

        return livroId;

    }

    public String getEdicao() {
      
        return edicao;

    }

    public String getTitulo() {

        return titulo;

    }

    public int getAno() {

        return ano;

    }

    public void setLivroId(int livroId) {

        this.livroId = livroId;

    }

    public void setEdicao(String edicao) {

        this.edicao = edicao;

    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }

    public void setAno(int ano) {

        this.ano = ano;
        
    }

}
