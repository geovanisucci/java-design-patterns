package br.com.loja.desconto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){

        Desconto cadeiaDeDescontos = new
                DescontoParaOrcamentoComMaisdeCincoItens(
                        new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                                new SemDesconto()));
        return cadeiaDeDescontos.calcular(orcamento);
    }
}
