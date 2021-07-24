package br.com.eduardo.loja.impostos;

import java.math.BigDecimal;

import br.com.eduardo.loja.orcamento.Orcamento;

public class ISS implements Imposto{
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
}
