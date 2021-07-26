package br.com.eduardo.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.eduardo.loja.pedido.GeraPedido;
import br.com.eduardo.loja.pedido.GeraPedidoHandler;
import br.com.eduardo.loja.pedido.acao.EnviarEmailPedido;
import br.com.eduardo.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestePedidos {

	public static void main(String[] args) {
		
		String cliente = "Eduardo";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(),
						new EnviarEmailPedido()
						));
		handler.executa(gerador);
		
		
	}

}
