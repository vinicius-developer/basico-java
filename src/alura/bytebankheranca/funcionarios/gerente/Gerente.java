package alura.bytebankheranca.funcionarios.gerente;

import alura.bytebankheranca.autenticacao.Autenticador;
import alura.bytebankheranca.funcionarios.Funcionario;

public class Gerente extends Funcionario {

    private Autenticador autenticador;

    public Gerente() {
        this.autenticador = new Autenticador();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.5;
    }

    public void setSenha(String senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(String senha) {
        return this.autenticador.autentica(senha);
    }



}
