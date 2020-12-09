package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControllerGeral {

	@Autowired
	private RepositoryTema repository;
	
	@GetMapping (value="/")
	public String login () {
		return "index";
	}
	
	@GetMapping (value="/cadastrarTema")
	public String form() {
		return "formTema";
	}
	
	@PostMapping (value="/cadastrarTema")
	public String form (ModelTema tema) {
		repository.save(tema);
		return "redirect:/cadastrarTema";
	}
}
