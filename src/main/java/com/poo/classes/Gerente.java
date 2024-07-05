package com.poo.classes;

public class Gerente extends Funcionario {

    public Gerente (String nome, String cpf, Endereco endereco, String login, String senha, double salarioBase) {
        super(nome, cpf, endereco, senha, login, salarioBase);




    }

    @Override
    public void contraCheque(String salarioBase) {

        System.out.println("Impressão de contra-cheque para gerente: ");
        System.out.println("Salario base: " + getSalarioBase());

        double fgts = getSalarioBase() * 0.1;
        double inss = getSalarioBase() * 0.12;
        System.out.println("FGTS: " + fgts);
        System.out.println("INSS: " + inss);

    }

    @Override
    public boolean autentica(String login, String senha) {

        return this.getLogin().equals(login) && this.getSenha().equals(senha);

    }

}
