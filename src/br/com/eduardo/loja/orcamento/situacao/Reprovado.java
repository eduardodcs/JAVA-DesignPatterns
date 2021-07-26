package br.com.eduardo.loja.orcamento.situacao;

import br.com.eduardo.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{

	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
