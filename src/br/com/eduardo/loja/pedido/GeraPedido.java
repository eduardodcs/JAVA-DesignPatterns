package br.com.eduardo.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	
	
	//injecao de dependencias: PedidoRepository, EmailService, ...
	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantideItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantideItens;
	}
	
	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	
}
