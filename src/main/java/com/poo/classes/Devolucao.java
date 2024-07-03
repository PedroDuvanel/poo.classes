package com.poo.classes;

import java.util.Date;

public class Devolucao {
    private static int contadorDevolucao = 0;
    int devolucaoId;
    Date data_devolucao;

    public Devolucao(int devolucaoId){

        devolucaoId = contadorDevolucao;
        contadorDevolucao++;

    }

    public int getdevolucaoId() {

        return devolucaoId;

    }

    public Date getdata_devolucao() {

        return data_devolucao;

    }

    public void setdevolucaoId( int devolucaoId) {

        this.devolucaoId = devolucaoId;

    }

    public void setdata_devolucao( Date data_devolucao) {

        this.data_devolucao = data_devolucao;

    }
    
}
