package com.poo.classes;

public class Endereco {

    int enderecoId;
    String uf;
    String cidade;
    String tipo;
    String lagradouro;
    String complemento;
    int numEndereco;

    public String getUf () {

        return uf;

    }

    public String getCidade() {

        return cidade;

    }

    public String getTipo () {

        return tipo;

    }

    public String getLagradouro() {

        return lagradouro;

    }

    public String getComplemento() {

        return complemento;

    }

    public int getnumEndereco() {

        return numEndereco;

    }


    public void setUf(String uf) {

        this.uf = uf;

    }

    public void setCidade(String cidade) {

        this.cidade = cidade;

    }

    public void setTipo(String tipo) {

        this.tipo = tipo;

    }

    public void setLagradouro(String lagradouro) {

        this.lagradouro = lagradouro;

    }

    public void setComplemento(String complemento) {

        this.complemento = complemento;

    }

    public void setnumEndereco(int numEndereco) {

        this.numEndereco = numEndereco;

    }

}