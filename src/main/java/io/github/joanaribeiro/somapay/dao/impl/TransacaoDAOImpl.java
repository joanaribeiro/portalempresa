package io.github.joanaribeiro.somapay.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.github.joanaribeiro.somapay.dao.TransacaoDAO;
import io.github.joanaribeiro.somapay.dao.entity.Transacao;

@Repository
public class TransacaoDAOImpl implements TransacaoDAO {
	
	@Autowired
	private SessionFactory session;

	@Override
	public void save(Transacao trans) {
		this.session.getCurrentSession().save(trans);
	}

	@Override
	public void delete(Transacao trans) {
		this.session.getCurrentSession().delete(trans);
	}

	@Override
	public Transacao findById(int id) {
		Transacao trans = this.session.getCurrentSession().get(Transacao.class, id);
		if (trans != null) { this.session.getCurrentSession().detach(trans); }
		return trans;
	}

	@Override
	public List<Transacao> list() {		
		Session s = this.session.getCurrentSession();
		CriteriaQuery<Transacao> cq = s.getCriteriaBuilder().createQuery(Transacao.class);
		Root<Transacao> root = cq.from(Transacao.class);
		cq.select(root);
		cq.orderBy(s.getCriteriaBuilder().asc(root.get("data_operacao")));
		return s.createQuery(cq).getResultList();
	}

}
