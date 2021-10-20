package alura.bytebankheranca.conta;

import alura.bytebankheranca.cliente.Cliente;

public abstract class Conta {

    protected double saldo;

    private int agencia;

    private int numero;

    private final Cliente titulor;

    public Conta(int agencia, int numero, Cliente titulor) {
        this.agencia = agencia;
        this.numero = numero;
        this.titulor = titulor;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitulor() {
        return titulor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double quantia) {
        this.adicionaSaldo(quantia);
    }

    public boolean saca(double quantia) {
        if(this.verificarValorEmConta(quantia)) {
            this.removeSaldo(quantia);
            return true;
        }

        return false;
    }

    public boolean transfere(Conta recebedor, double quantia) {
        if(this.verificarValorEmConta(quantia)) {
            this.removeSaldo(quantia);
            recebedor.adicionaSaldo(quantia);
            return true;
        }

        return false;
    }

    private boolean verificarValorEmConta(double quantia) {
        return this.saldo >= quantia;
    }

    private void adicionaSaldo(double quantia) {
        this.saldo += quantia;
    }

    protected abstract void removeSaldo(double quantia);

}
