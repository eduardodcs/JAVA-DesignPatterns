package br.com.eduardo.loja.impostos;

import java.math.BigDecimal;

import br.com.eduardo.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
