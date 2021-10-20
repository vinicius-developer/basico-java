package alura.bytebankheranca.conta.segurodevida;

import alura.bytebankheranca.calculoimposto.interfaces.Tributavel;
import alura.bytebankheranca.conta.Conta;

public class SeguroDeVida implements Tributavel {


    @Override
    public double getValorImposto() {
        return 200;
    }

}
