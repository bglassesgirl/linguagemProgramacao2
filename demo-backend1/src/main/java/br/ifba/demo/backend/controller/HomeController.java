package br.ifba.demo.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public String index() {			
		return "<h1>Chmando tela inicial!!</h1>";
	}
	
	@GetMapping("/{nome}")
	public String index_nome(@PathVariable("nome")String nome) {
		return "Nome:" + nome;
	}
	
	@GetMapping("/{nome}/{idade}")
	public String index_nome_idade(@PathVariable("nome")String nome, @PathVariable("idade") int idade) {
		return "Nome: " + nome + "<br>Idade: " + idade;
	}
	
	
}
