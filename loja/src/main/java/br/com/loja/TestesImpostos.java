package br.com.loja;

import br.com.loja.imposto.CalculadoraDeImpostos;
import br.com.loja.imposto.ICMS;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        //Padrão decorator
        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
        System.out.println(calculadora.calcular(orcamento, new ICMS(null)));


    }
}
