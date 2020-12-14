package org.generation.blogPessoal.repository;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> //Extenção da Jpa, herdando os atributos
{
	Usuario findByLogin(String login); // Pega as informações do usuario por meio do seu login

}
