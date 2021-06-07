package com.aps.model;

public abstract class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(int numero) {
        this.numero = numero;
        this.cliente = new Cliente();
    }

    public abstract boolean depositar(double valor);

    public abstract boolean sacar(double valor);

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
