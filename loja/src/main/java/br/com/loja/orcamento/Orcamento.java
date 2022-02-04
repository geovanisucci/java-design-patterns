package br.com.loja.orcamento;

import br.com.loja.orcamento.situacao.EmAnalise;
import br.com.loja.orcamento.situacao.Finalizado;
import br.com.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    private int quantidadeItens;

    public void aplicarDescontoExtra(){
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }
    public void reprovar(){
        this.situacao.reprovar(this);
    }
    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public boolean isFinalizado(){
        return situacao instanceof Finalizado;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
