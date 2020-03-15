package io.github.joanaribeiro.somapay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.joanaribeiro.somapay.dao.entity.Funcionario;
import io.github.joanaribeiro.somapay.service.FuncionarioService;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@RequestMapping("/funcionarios")
	public String funcionario(Model model) {
		
		List<Funcionario> funcionarios = funcionarioService.listarFuncionarios();
		model.addAttribute("funcionarios", funcionarios);
		
		return "funcionarios";
	}

}
