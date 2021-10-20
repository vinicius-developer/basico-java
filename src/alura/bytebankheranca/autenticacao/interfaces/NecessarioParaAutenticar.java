package alura.bytebankheranca.autenticacao.interfaces;

public interface NecessarioParaAutenticar {

    boolean autentica(String senha);

    void setSenha(String senha);

}
