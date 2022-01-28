package br.com.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    private int quantidadeItens;

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
