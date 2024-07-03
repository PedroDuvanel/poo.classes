package com.poo.classes;


public class Exemplar {
    
    private static int contadorExemplar = 0;
    int exemplarId;

    public Exemplar(int exemplarId){

        exemplarId = contadorExemplar;
        contadorExemplar++;

    }

    public int getexemplarId() {
        
        return exemplarId;

    }

    public void setexemplarId(int exemplarId) {

        this.exemplarId = exemplarId;

    }

}
