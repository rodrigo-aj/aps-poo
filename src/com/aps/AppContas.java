package com.aps;

import com.aps.model.Cliente;
import com.aps.model.ContaCorrente;
import com.aps.model.ContaEspecial;
import com.aps.model.ContaPoupanca;

import java.util.Scanner;

public class AppContas {

    public static void main(String[] args) {

        GerenciaContas conta = new GerenciaContas();

        int numeroDigitado = 0, numeroConta, menu;
        boolean validaEntradaUsuario = false;
        double valorDeposito, valorSaque;
        String nomeCliente, cpfCliente;
        Scanner enter;

        do {
            enter = new Scanner(System.in);

            System.out.println("\n1- cadastrar conta corrente");
            System.out.println("2- cadastrar conta poupança");
            System.out.println("3- cadastrar conta especial");
            System.out.println("4- listar contas cadastradas");
            System.out.println("5- remover conta pelo número");
            System.out.println("6- realizar depósito");
            System.out.println("7- realizar saque");
            System.out.println("8- sair\n");

            menu = Integer.parseInt(enter.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("Primeiro digite o CPF: ");
                    cpfCliente = enter.nextLine();

                    System.out.println("Agora digite o nome: ");
                    nomeCliente = enter.nextLine();

                    System.out.println("Agora digite o número da conta: ");
                    numeroConta = enter.nextInt();

                    conta.adicionarConta(new ContaCorrente(numeroConta), new Cliente(nomeCliente, cpfCliente));
                    break;

                case 2:
                    System.out.println("Primeiro digite o CPF: ");
                    cpfCliente = enter.nextLine();

                    System.out.println("Agora digite o nome: ");
                    nomeCliente = enter.nextLine();

                    System.out.println("Agora digite o número da conta: ");
                    numeroConta = enter.nextInt();

                    conta.adicionarConta(new ContaPoupanca(numeroConta), new Cliente(nomeCliente, cpfCliente));
                    break;

                case 3:
                    System.out.println("Primeiro digite o CPF: ");
                    cpfCliente = enter.nextLine();

                    System.out.println("Agora digite o nome: ");
                    nomeCliente = enter.nextLine();

                    System.out.println("Agora digite o número da conta: ");
                    numeroConta = enter.nextInt();

                    conta.adicionarConta(new ContaEspecial(numeroConta), new Cliente(nomeCliente, cpfCliente));
                    break;

                case 4:
                    System.out.println(conta.listarContas());
                    break;

                case 5:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = enter.nextInt();

                    if (conta.removerConta(numeroConta)) {
                        System.out.println("Conta " + numeroConta + " removida com sucesso!");
                    } else {
                        System.out.println("Conta " + numeroConta + " não localizada!");
                    }
                    break;

                case 6:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = enter.nextInt();

                    System.out.println("Digite o valor do depósito: ");
                    valorDeposito = enter.nextInt();

                    if (conta.realizarDeposito(numeroConta, valorDeposito)) {
                        System.out.println("Depósito de " + valorDeposito + " realizado com sucesso na conta " + numeroConta + ".");
                    } else {
                        System.out.println("Não foi possível realizar deposíto, pois a conta " + numeroConta + " não foi localizada!");
                    }
                    break;

                case 7:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = enter.nextInt();

                    System.out.println("Digite o valor do saque: ");
                    valorSaque = enter.nextInt();

                    if (conta.realizarSaque(numeroConta, valorSaque)) {
                        System.out.println("Saque de " + valorSaque + " realizado com sucesso na conta " + numeroConta + ".");
                    } else {
                        System.out.println("Não foi possível realizar saque!");
                    }
                    break;

                case 8:
                    break;
            }
        } while (menu != 8);
    }
}
