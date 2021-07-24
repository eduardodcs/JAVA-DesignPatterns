package br.com.eduardo.loja.impostos;

import java.math.BigDecimal;

import br.com.eduardo.loja.orcamento.Orcamento;

public interface Imposto {
	BigDecimal calcular(Orcamento orcamento);
}

