package alura.bytebankheranca.conta.acaobolsa;

import alura.bytebankheranca.calculoimposto.interfaces.Tributavel;

public class AcaoBolsa implements Tributavel {

    @Override
    public double getValorImposto() {
        return 100;
    }


}
