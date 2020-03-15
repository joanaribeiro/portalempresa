package io.github.joanaribeiro.somapay.dao;

import java.util.List;

import io.github.joanaribeiro.somapay.dao.entity.Transacao;

public interface TransacaoDAO {

	public void save(Transacao trans);
	public void delete(Transacao trans);
	public Transacao findById(int id);
	public List<Transacao> list();

}
