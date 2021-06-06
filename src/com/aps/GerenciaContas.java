package com.aps;

import com.aps.model.Cliente;
import com.aps.model.Conta;

import java.util.ArrayList;
import java.util.Iterator;

import static java.util.Objects.isNull;

public class GerenciaContas {

    private ArrayList<Conta> contas;

    public GerenciaContas() {

        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta, Cliente c) {

        if (!isNull(this.buscarConta(conta.getNumero()))){
            System.out.println("Já existe uma conta cadastrada com o número: " + conta.getNumero());
        } else {
            conta.setCliente(c);
            this.contas.add(conta);
            System.out.println("Cadastro realizado com sucesso! Dados da conta: " + conta.toString());
        }
    }

    public boolean removerConta(String cpf) {

        Iterator<Conta> i = contas.iterator();

        while (i.hasNext()) {
            Conta c = i.next();

            if (c.getCliente().getCpf().equals(cpf)) {
                i.remove();

                return true;
            }
        }

        return false;
    }

    public String listarContas() {

        String saida = "";

        for (Conta c : contas) {
            saida += c.toString() + "\n";
        }

        return saida;
    }

    public boolean realizarDeposito(int numeroConta, double valor) {

        Conta contaEncontrada = this.buscarConta(numeroConta);

        if (!isNull(contaEncontrada)) {
            return contaEncontrada.depositar(valor);
        }

        return false;
    }

    public boolean realizarSaque(int numeroConta, double valor) {
        Conta contaEncontrada = this.buscarConta(numeroConta);

        if (!isNull(contaEncontrada)) {
            return contaEncontrada.sacar(valor);
        }

        return false;
    }


    private Conta buscarConta(int numeroConta) {

        for (Conta c : contas) {
            if (c.getNumero() == numeroConta) {
                return c;
            }
        }

        return null;
    }
}
