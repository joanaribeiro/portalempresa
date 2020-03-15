package io.github.joanaribeiro.somapay.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.github.joanaribeiro.somapay.dao.FuncionarioDAO;
import io.github.joanaribeiro.somapay.dao.entity.Funcionario;

@Repository
public class FuncionarioDAOImpl implements FuncionarioDAO {
	
	@Autowired
	private SessionFactory session;

	@Override
	public void save(Funcionario func) {
		this.session.getCurrentSession().save(func);
	}

	@Override
	public void delete(Funcionario func) {
		this.session.getCurrentSession().delete(func);
	}

	@Override
	public Funcionario findById(int matricula) {
		Funcionario func = this.session.getCurrentSession().get(Funcionario.class, matricula);
		if (func != null) { this.session.getCurrentSession().detach(func); }
		return func;
	}

	@Override
	public List<Funcionario> list() {		
		Session s = this.session.getCurrentSession();
		CriteriaQuery<Funcionario> cq = s.getCriteriaBuilder().createQuery(Funcionario.class);
		cq.select(cq.from(Funcionario.class));
		return s.createQuery(cq).getResultList();		
	}
	
}
