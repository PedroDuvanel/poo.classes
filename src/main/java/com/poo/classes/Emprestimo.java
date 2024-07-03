package com.poo.classes;

import java.util.Date;

public class Emprestimo {

    private static int contadorEmp = 0;

    int emprestimoId;
    Date data;
    Date data_prev_dev;

    public Emprestimo(int emprestimoId){

        emprestimoId = contadorEmp;
        contadorEmp++;

    }

    public int getemprestimoId() {

        return emprestimoId;

    }

    public Date getdata() {

        return data;

    }

    public Date getdata_prev_dev() {

        return data_prev_dev;

    }

    public void setemprestimoId(int emprestimoId) {

        this.emprestimoId = emprestimoId;

    }

    public void setdata(Date data) {

        this.data = data;

    }
    
    public void setdata_prev_dev(Date data_prev_dev) {

        this.data_prev_dev = data_prev_dev;

    }
    
}
