package io.github.joanaribeiro.somapay.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.joanaribeiro.somapay.dao.entity.Transacao;
import io.github.joanaribeiro.somapay.service.TransacaoService;

@Controller
public class ExtratoController {

	@Autowired
	private TransacaoService transacaoService;
	
	@RequestMapping("/extrato")
	public String extrato(Model model) {
		
		List<Transacao> transacoes = transacaoService.listarTransacoes();
		model.addAttribute("transacoes", transacoes);
		
		BigDecimal saldo = new BigDecimal(0.0);
		saldo.setScale(2);
		for(Transacao t : transacoes) {
			saldo = saldo.add(t.getMontante());
		}
		model.addAttribute("saldo", saldo);
		
		return "extrato";
	}
	
}
