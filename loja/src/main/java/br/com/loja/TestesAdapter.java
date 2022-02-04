package br.com.loja;

import br.com.loja.http.JavaHttpClient;
import br.com.loja.orcamento.Orcamento;
import br.com.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);

    }
}
