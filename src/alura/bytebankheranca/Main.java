package alura.bytebankheranca;

import alura.bytebankheranca.cliente.Cliente;
import alura.bytebankheranca.conta.corrente.ContaCorrente;
import alura.bytebankheranca.conta.poupanca.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Cliente vinicius = new Cliente(
                "vinicius",
                "430.411.158-24"
        );

        Cliente carla = new Cliente(
                "carla",
                "430,411.158-24"
        );

        ContaCorrente contaCorrente = new ContaCorrente(
                1234,
                26,
                vinicius
        );

        ContaPoupanca contaPoupanca = new ContaPoupanca(
                1234,
                26,
                carla
        );

        contaCorrente.deposita(200);
        contaPoupanca.deposita(200);;

        contaPoupanca.transfere(contaCorrente, 10);

        System.out.println("Conta Corrente; " + contaCorrente.getSaldo());
        System.out.println("Conta Poupanca; " + contaPoupanca.getSaldo());

        if(vinicius.autentica("2222")) {
            System.out.println("logado");
        } else {
            System.out.println("deslogado");
        }

    }

}


