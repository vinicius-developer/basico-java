package alura.bytebankheranca.autenticacao;

import alura.bytebankheranca.autenticacao.interfaces.NecessarioParaAutenticar;

public class Autenticador implements NecessarioParaAutenticar {
    private String senha;

    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
