package br.com.loja;

import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.GeraPedidoHandler;
import br.com.loja.pedido.Pedido;
import br.com.loja.pedido.acao.EnviarEmailPedido;
import br.com.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {

        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);

        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoNoBancoDeDados(),
                new EnviarEmailPedido()));

        handler.execute(geraPedido);
    }
}
