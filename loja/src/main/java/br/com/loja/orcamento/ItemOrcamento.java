package br.com.loja.orcamento;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel {

    public BigDecimal getValor() {
        return valor;
    }

    private BigDecimal valor;

    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
    }
}
