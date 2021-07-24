package br.com.eduardo.loja;

import java.math.BigDecimal;

import br.com.eduardo.loja.desconto.CalculadoraDeDesconto;
import br.com.eduardo.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("800"), 8);
		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		System.out.println(calculadora.calcular(orcamento));

	}

}
