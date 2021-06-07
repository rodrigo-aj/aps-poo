package com.aps.model;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(int numero) {
        super(numero);
        this.setLimite(2000);
    }

    @Override
    public boolean depositar(double valor) {
        super.setSaldo(super.getSaldo() + valor);

        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (super.getSaldo() >= (valor + getLimite())) {
            super.setSaldo(super.getSaldo() - valor);

            return true;
        }

        return false;
    }

    public double getLimite() {

        return limite;
    }

    public void setLimite(double limite) {

        this.limite = limite;
    }
}
