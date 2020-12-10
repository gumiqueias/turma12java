package org.generation.blogPessoal.seguranca;

import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerGeral {

	// injeta o repository
	@Autowired
	public TemaRepository repository;
	
	//responsavel por direcionar o usuario para o index
	@GetMapping(value="/")
	public String login() {
		return "index";
	}
	
	//responsavel por direcionar o usuario para a pagina formTema
	@GetMapping(value="/cadastrarTema")
	public String form() {
		return "formTema";
	}
	
	//cadastra o tema, na tabela tema e depois redireciona o usuario para um novo cadastro de tema
	@PostMapping(value="/cadastrarTema")
	public String form(Tema tema) {
		repository.save(tema);
		return "redirect:/cadastrarTema";
	}
	
}
