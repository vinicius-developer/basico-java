package alura.bytebankheranca.funcionarios.adminstrador;

import alura.bytebankheranca.autenticacao.Autenticador;
import alura.bytebankheranca.funcionarios.Funcionario;

public class Adminstrador extends Funcionario {

    private Autenticador autenticador;

    public Adminstrador() {
        this.autenticador = new Autenticador();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.1;
    }

    public void setSenha(String senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(String senha) {
        return this.autenticador.autentica(senha);
    }

}
