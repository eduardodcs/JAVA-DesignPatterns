package br.com.eduardo.loja.pedido.acao;

import br.com.eduardo.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando email no bando de dados!");
	}
	
}
