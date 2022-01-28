package br.com.loja;

import br.com.loja.imposto.CalculadoraDeImpostos;
import br.com.loja.imposto.TipoImposto;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));
    }
}
