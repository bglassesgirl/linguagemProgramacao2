package br.ifba.demo.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping
	public String teste() {
		return "Testando rota /demo";
	}
	
	@GetMapping("/{nome}")
	public String index() {
		return "Testando chamada index";
	}
}
