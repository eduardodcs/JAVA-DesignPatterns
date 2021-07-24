package br.com.eduardo.loja;

import java.math.BigDecimal;

import br.com.eduardo.loja.desconto.CalculadoraDeDesconto;
import br.com.eduardo.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento(new BigDecimal("100"), 8);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("2000"), 1);
		
		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		System.out.println(calculadora.calcular(orcamento1));
		System.out.println(calculadora.calcular(orcamento2));
		

	}

}
