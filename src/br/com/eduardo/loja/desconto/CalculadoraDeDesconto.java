package br.com.eduardo.loja.desconto;

import java.math.BigDecimal;

import br.com.eduardo.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoItensMaiorCinco(
				new DescontoValorMaiorQuinhentos(
						new SemDesconto()));

		return desconto.calcular(orcamento);
	}
	
}
