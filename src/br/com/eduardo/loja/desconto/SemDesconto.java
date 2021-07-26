package br.com.eduardo.loja.desconto;

import java.math.BigDecimal;

import br.com.eduardo.loja.orcamento.Orcamento;

	public class SemDesconto extends Desconto{
		
		public SemDesconto() {
			super(null);
		}

		public BigDecimal efetuarCalcular(Orcamento orcamento) {
			return BigDecimal.ZERO;
		}

		@Override
		public boolean deveAplicar(Orcamento orcamento) {
			return true;
		}
}
