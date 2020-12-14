package org.generation.blogPessoal.seguranca;

import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // Controla todas as classes
public class ControllerGeral {

	@Autowired //Faz injecao e o repository é o caminhao que leva os dados na tabela

	private TemaRepository repository;

	// localhost:8080 <- direciona p a index
	@GetMapping(value = "/")
	public String login() {
		return "index";
	}

	@GetMapping(value = "/cadastrarTema") //Faz o cadastro dentro da aba Tema 
	public String form() {
		return "formTema";
	}

	@PostMapping(value = "/cadastrarTema") //
	public String form(Tema tema) {
		repository.save(tema);
		return "redirect:/cadastrarTema";
	}
	// insert into tb_manutencao "OQUE A PESSOA DIGITAR NO BODY"
}
