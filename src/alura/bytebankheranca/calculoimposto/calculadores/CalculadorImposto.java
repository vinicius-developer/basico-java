package alura.bytebankheranca.calculoimposto.calculadores;

import alura.bytebankheranca.calculoimposto.interfaces.Tributavel;

public class CalculadorImposto {

    private double impostoTotal = 0;

    public double getImpostoTotal() {
        return this.impostoTotal;
    }

    public void adicionarImposto(Tributavel tributavel) {
        this.impostoTotal += tributavel.getValorImposto();
    }

}
