package com.poo.classes;

public class Endereco {

    private static int contadorEnd = 0;

    int enderecoId;
    String uf;
    String cidade;
    String tipo;
    String lagradouro;
    String complemento;
    int cep;

    public Endereco(String cidade) {

        this.cidade = cidade;
        this.cep = cep;
        enderecoId = contadorEnd;
        contadorEnd++;

    }

    public int getenderecoId() {

        return enderecoId;

    }

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

    public int getCep() {

        return cep;

    }


    public void setenderecoId(int enderecoId) {

        this.enderecoId = enderecoId;

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

    public void setCep(int cep) {

        this.cep = cep;

    }

}