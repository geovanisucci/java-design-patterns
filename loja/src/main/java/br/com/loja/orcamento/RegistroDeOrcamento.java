package br.com.loja.orcamento;

import br.com.loja.DomainException;
import br.com.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento){

        if(!orcamento.isFinalizado()){
            throw new DomainException("Orçamento não finalizado");
        }

        Map<String, Object> dados = Map.of("valor", orcamento.getValor(),
                                            "quantidadeItens", orcamento.getQuantidadeItens());
        httpAdapter.post("http://api.externa/orcamento", dados);

    }
}
