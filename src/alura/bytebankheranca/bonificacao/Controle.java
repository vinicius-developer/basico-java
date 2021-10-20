package alura.bytebankheranca.bonificacao;

import alura.bytebankheranca.funcionarios.Funcionario;

public class Controle {

    private double soma;

    public double getSoma() {
        return soma;
    }

    public void registra(Funcionario funcionario) {
        this.soma += funcionario.getBonificacao();
    }

}
