package io.github.joanaribeiro.somapay.service;

import java.math.BigDecimal;
import java.util.List;

import io.github.joanaribeiro.somapay.dao.entity.Transacao;

public interface TransacaoService {

	public void criarTransacao(String dataOperacao, String tipoOperacao, BigDecimal montante);
	
	public void removerTransacao(int id);
	public void removerTransacao(Transacao trans);
	
	public Transacao buscarTransacao(int id);
	
	public List<Transacao> listarTransacoes();

}
