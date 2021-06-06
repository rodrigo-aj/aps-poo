package com.aps.model;

public class ContaPoupanca extends Conta {

    private double taxa;

    private static final double TAXA_SAQUE = 15;

    public ContaPoupanca(int numero) {
        super(numero);
        this.taxa = TAXA_SAQUE;
    }

    @Override
    public boolean depositar(double valor) {
        super.setSaldo(super.getSaldo() + valor);

        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (super.getSaldo() >= (valor)) {
            super.setSaldo(super.getSaldo() - (valor + this.taxa));
        }

        return false;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
