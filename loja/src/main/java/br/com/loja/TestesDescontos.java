package br.com.loja;

import br.com.loja.desconto.CalculadoraDeDescontos;
import br.com.loja.imposto.CalculadoraDeImpostos;
import br.com.loja.imposto.ICMS;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        CalculadoraDeDescontos descontos = new CalculadoraDeDescontos();
        System.out.println(descontos.calcular(orcamento));
    }
}
