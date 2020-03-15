package io.github.joanaribeiro.somapay.dao;

import java.util.List;

import io.github.joanaribeiro.somapay.dao.entity.Funcionario;

public interface FuncionarioDAO {

	public void save(Funcionario func);
	public void delete(Funcionario func);
	public Funcionario findById(int matricula);
	public List<Funcionario> list();
	
}
