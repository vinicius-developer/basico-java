package alura.bytebankheranca.funcionarios.designer;

import alura.bytebankheranca.funcionarios.Funcionario;

public class Designer extends Funcionario {

    @Override
    public double getBonificacao() {
        return 200;
    }
}
