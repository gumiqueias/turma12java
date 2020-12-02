package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/postagens")
@CrossOrigin("*")
public class PostagemController {

	@Autowired
	private  RepositoryPostagem repository;
	
	@GetMapping ("/getAll")
	public List <ModelPostagem> pesquisarTodos() {
		return repository.findAll();
	}
	
	@GetMapping ("/getById/{id}")
	public Optional<ModelPostagem> encontrarUm (@PathVariable Long id){
		return repository.findById(id);
	}
}
