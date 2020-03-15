package io.github.joanaribeiro.somapay.service;

import java.util.List;

import io.github.joanaribeiro.somapay.dao.entity.Funcionario;

public interface FuncionarioService {

	public void criarFuncionario(int matricula, String nome, String funcao);
	
	public void removerFuncionario(int matricula);
	public void removerFuncionario(Funcionario func);
	
	public Funcionario buscarFuncionario(int matricula);
	
	public List<Funcionario> listarFuncionarios();
	
}
