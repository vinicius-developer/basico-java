package alura.bytebankheranca.conta.corrente;

import alura.bytebankheranca.calculoimposto.interfaces.Tributavel;
import alura.bytebankheranca.cliente.Cliente;
import alura.bytebankheranca.conta.Conta;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero, Cliente titulor) {
        super(agencia, numero, titulor);
    }

    @Override
    protected void removeSaldo(double quantia) {
        super.saldo -= quantia;
    }

    @Override
    public double getValorImposto() {
        return 500;
    }
}
