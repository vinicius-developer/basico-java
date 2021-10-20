package alura.bytebankheranca.conta.poupanca;

import alura.bytebankheranca.cliente.Cliente;
import alura.bytebankheranca.conta.Conta;

public class ContaPoupanca extends Conta {

    private double taxa = 0.2;

    public ContaPoupanca(int agencia, int numero, Cliente titulor) {
        super(agencia, numero, titulor);
    }

    @Override
    protected void removeSaldo(double quantia) {
        super.saldo -= (quantia + this.taxa);
    }
}
