package com.aps.model;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean depositar(double valor) {
        super.setSaldo(super.getSaldo() + valor);

        return false;
    }

    @Override
    public boolean sacar(double valor) {
        if (super.getSaldo() >= valor) {
            super.setSaldo(super.getSaldo() - valor);
        }

        return false;
    }
}
