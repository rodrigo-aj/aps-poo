package com.aps;

import com.aps.model.Cliente;
import com.aps.model.ContaCorrente;
import com.aps.model.ContaEspecial;
import com.aps.model.ContaPoupanca;

public class AppContas {

    public static void main(String[] args) {

        GerenciaContas conta = new GerenciaContas();

        conta.adicionarConta(new ContaPoupanca(40028922), new Cliente("Carlos", "16056570"));
        conta.adicionarConta(new ContaCorrente(89224002), new Cliente("Benda", "57075562"));

        conta.realizarDeposito(40028922, 500);
        conta.realizarDeposito(89224002, 500);

        conta.realizarSaque(40028922, 300);
        conta.realizarSaque(89224002, 600);


        System.out.println(conta.listarContas());

    }
}
