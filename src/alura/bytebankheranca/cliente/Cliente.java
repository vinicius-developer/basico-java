package alura.bytebankheranca.cliente;

import alura.bytebankheranca.autenticacao.Autenticador;

public class Cliente {

    private String nome;

    private String cpf;

    private Autenticador autenticador;

    public Cliente(String nome, String cpf) {
        this.autenticador = new Autenticador();
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSenha(String senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(String senha) {
        return this.autenticador.autentica(senha);
    }
}
