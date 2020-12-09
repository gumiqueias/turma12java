package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, String>{
		
	Usuario findByLogin(String login);
}
