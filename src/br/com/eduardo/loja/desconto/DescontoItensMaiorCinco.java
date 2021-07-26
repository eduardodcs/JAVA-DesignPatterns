package br.com.eduardo.loja.desconto;

import java.math.BigDecimal;

import br.com.eduardo.loja.orcamento.Orcamento;

	public class DescontoItensMaiorCinco extends Desconto{
		
		public DescontoItensMaiorCinco(Desconto proximo) {
			super(proximo);
		}

		public BigDecimal efetuarCalcular(Orcamento orcamento) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}

		@Override
		public boolean deveAplicar(Orcamento orcamento) {
			return orcamento.getQuantidadeItens() > 5;
		}
}
