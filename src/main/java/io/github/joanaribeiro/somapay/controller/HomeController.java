package io.github.joanaribeiro.somapay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public RedirectView home() {
		return new RedirectView("funcionarios");
	}

}
