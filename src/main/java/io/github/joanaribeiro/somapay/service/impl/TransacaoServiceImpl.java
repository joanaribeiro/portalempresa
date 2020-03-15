package io.github.joanaribeiro.somapay.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.joanaribeiro.somapay.dao.TransacaoDAO;
import io.github.joanaribeiro.somapay.dao.entity.Transacao;
import io.github.joanaribeiro.somapay.service.TransacaoService;

@Service
public class TransacaoServiceImpl implements TransacaoService {
	
	@Autowired
	private TransacaoDAO transacaoDAO;

	@Override
	@Transactional
	public void criarTransacao(String dataOperacao, String tipoOperacao, BigDecimal montante) {
		Transacao trans = new Transacao();
		trans.setData_operacao(dataOperacao);
		trans.setTipo_operacao(tipoOperacao);
		trans.setMontante(montante);
		transacaoDAO.save(trans);
	}

	@Override
	@Transactional
	public void removerTransacao(int id) {
		Transacao trans = transacaoDAO.findById(id);
		if (trans == null) { throw new RuntimeException(String.format("Funcionario %d não encontrado!", id)); }
		this.removerTransacao(trans);
	}

	@Override
	@Transactional
	public void removerTransacao(Transacao trans) {
		transacaoDAO.delete(trans);
	}

	@Override
	@Transactional
	public Transacao buscarTransacao(int id) {
		return transacaoDAO.findById(id);
	}

	@Override
	@Transactional
	public List<Transacao> listarTransacoes() {
		return transacaoDAO.list();
	}

}
