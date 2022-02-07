package br.com.loja.imposto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {
    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    private Imposto outro;

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {

        BigDecimal valorImposto = realizarCalculo(orcamento);

        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;

        if(outro != null){
            valorDoOutroImposto = outro.realizarCalculo(orcamento);
        }

        return valorImposto.add(valorDoOutroImposto);
    }
}
