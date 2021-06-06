package com.aps.model;

public class ContaEspecial extends Conta {

    private double limite;


    public ContaEspecial(int numero) {
        super(numero);
    }

    @Override
    public boolean depositar(double valor) {
        super.setSaldo(super.getSaldo() + valor);

        return false;
    }

    @Override
    public boolean sacar(double valor) {
        super.setSaldo(super.getSaldo() - valor);
        return false;
    }

    public double getLimite() {

        return limite;
    }

    public void setLimite(double limite) {

        this.limite = limite;
    }
}
