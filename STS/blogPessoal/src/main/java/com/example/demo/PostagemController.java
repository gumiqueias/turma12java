package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping ("/titulo/{titulo}")
	public ResponseEntity <List<ModelPostagem>> GetByTitulo (@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity<ModelPostagem> post (@RequestBody ModelPostagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));	
	}
	
	@PutMapping
	public ResponseEntity<ModelPostagem> put (@RequestBody ModelPostagem postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));	
	}
	
	@DeleteMapping ("/delete/{id}")
	public void delete (@PathVariable long id){
		repository.deleteById(id);
		
	}
	
	
}
