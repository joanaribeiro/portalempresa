package io.github.joanaribeiro.somapay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.joanaribeiro.somapay.dao.FuncionarioDAO;
import io.github.joanaribeiro.somapay.dao.entity.Funcionario;
import io.github.joanaribeiro.somapay.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDAO funcionarioDAO;
	
	@Override
	@Transactional
	public void criarFuncionario(int matricula, String nome, String funcao) {
		Funcionario func = new Funcionario();
		func.setMatricula(matricula);
		func.setNome(nome);
		func.setFuncao(funcao);
		funcionarioDAO.save(func);
	}

	@Override
	@Transactional
	public void removerFuncionario(int matricula) {
		Funcionario func = funcionarioDAO.findById(matricula);
		if (func == null) { throw new RuntimeException(String.format("Funcionario %d não encontrado!", matricula)); }
		this.removerFuncionario(func);
	}

	@Override
	@Transactional
	public void removerFuncionario(Funcionario func) {
		funcionarioDAO.delete(func);
	}

	@Override
	@Transactional
	public Funcionario buscarFuncionario(int matricula) {
		return funcionarioDAO.findById(matricula);
	}

	@Override
	@Transactional
	public List<Funcionario> listarFuncionarios() {
		return funcionarioDAO.list();
	}
	
}
