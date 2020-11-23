package com.example.demo;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// toda tabela chama entidade

@Entity

public class Colaboradores {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private int id;
	
	@Column
	private String nome;
	
	@Column
	private boolean fumante;

	// GETERS E SETERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isFumante() {
		return fumante;
	}

	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}
	
	
}
