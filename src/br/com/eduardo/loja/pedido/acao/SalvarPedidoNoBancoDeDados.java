package br.com.eduardo.loja.pedido.acao;

import br.com.eduardo.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com dados do pedido");
	}
	
}
