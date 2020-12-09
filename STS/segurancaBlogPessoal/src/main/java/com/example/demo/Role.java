package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority{
	
	//Atribustos
	private String nomeRole;
	
	@ManyToMany(mappedBy = "roles")
	private List <Usuario> usuarios;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.nomeRole;
	}
	
	//Getters e Setters
	public String getNomeRole() {
		return nomeRole;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}

