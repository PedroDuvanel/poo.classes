package com.poo.classes;

public class Exemplar_emprestimo {

    private static int contadorEx = 0;

    int exemplarEmprestimoId;

    public Exemplar_emprestimo(int exemplarEmprestimoId) {

        exemplarEmprestimoId = contadorEx;
        contadorEx++;

    }

    public int getExemplarEmprestimoId() {

        return exemplarEmprestimoId;

    }

    public void setExemplarEmprestimoId(int exemplarEmprestimoId) {

        this.exemplarEmprestimoId = exemplarEmprestimoId;
        
    }

}
