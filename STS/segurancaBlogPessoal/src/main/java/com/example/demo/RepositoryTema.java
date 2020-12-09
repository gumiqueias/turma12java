package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTema extends JpaRepository<ModelTema, Long>{
	
	public List <ModelTema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
