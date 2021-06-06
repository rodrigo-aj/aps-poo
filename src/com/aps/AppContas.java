package com.aps;

import com.aps.model.Cliente;
import com.aps.model.ContaCorrente;
import com.aps.model.ContaEspecial;
import com.aps.model.ContaPoupanca;

import java.util.Scanner;

public class AppContas {

    public static void main(String[] args) {

        GerenciaContas conta = new GerenciaContas();
//
//        conta.adicionarConta(new ContaPoupanca(40028922), new Cliente("Carlos", "16056570"));
//        conta.adicionarConta(new ContaCorrente(89224002), new Cliente("Benda", "57075562"));
//        conta.adicionarConta(new ContaCorrente(40028922), new Cliente("Carlos", "16056570"));
//
//        conta.realizarDeposito(40028922, 500);
//        conta.realizarDeposito(89224002, 500);
//
//        conta.realizarSaque(40028922, 300);
//        conta.realizarSaque(89224002, 600);
//
//
//        System.out.println(conta.listarContas());

        int numeroDigitado = 0, numeroConta;
        boolean validaEntradaUsuario = false;
        String nomeCliente, cpfCliente;
        Scanner enter;

        do {
            enter = new Scanner(System.in);

            System.out.println("\n1- cadastrar conta corrente");
            System.out.println("2- cadastrar conta poupança");
            System.out.println("3- cadastrar conta especial");
            System.out.println("4- listar contas cadastrasas");
            System.out.println("5- remover conta pelo número");
            System.out.println("6- realizar depósito");
            System.out.println("7- realizar saque");
            System.out.println("8- sair\n");

            switch (Integer.parseInt(enter.nextLine())) {
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
                    System.out.println("opção 2");
                    break;

                case 3:
                    System.out.println("opção 3");
                    break;

                case 4:
                    System.out.println("opção 4");
                    break;

                case 5:
                    System.out.println("opção 5");
                    break;

                case 6:
                    System.out.println("opção 6");
                    break;

                case 7:
                    System.out.println("opção 7");
                    break;

                case 8:
                    System.out.println("opção 8");
                    break;
            }
        } while (Integer.parseInt(enter.nextLine()) != 8);
    }
}
