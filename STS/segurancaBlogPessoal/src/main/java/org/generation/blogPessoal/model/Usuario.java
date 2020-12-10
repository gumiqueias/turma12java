package org.generation.blogPessoal.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.JoinColumn;


@Entity
public class Usuario implements UserDetails, Serializable {
	
	//previne erros de versões sobrepostas
		private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS --------------------------------------
	@Id
	private String login;
	private String nomeCompleto;
	private String senha;
	
	//faz o relaciomento entre as tabelas
	@ManyToMany
	@JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "usuario_id",
				referencedColumnName = "login"), inverseJoinColumns = @JoinColumn
				(name = "role_id", referencedColumnName = "nomeRole"))
	
	private List<Role> roles;
	
	// segurança //
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.roles;  
	}
	@Override
	public String getPassword() 
	{
		return this.senha;   	
	}
	@Override
	public String getUsername() 
	{
		return this.login; 
	}
	
	//VERIFICAÇÕES E AUTENTICAÇÕES
	
	// indica se a conta do usuario expirou
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	
	//indica se o usuario esta bloqueado ou desbloqueado
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	
	// indica se as credenciais do usuario expiraram
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	
	//indica se o usuario esta habilitado ou desabilitado
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	// GETTER E SETTERS ------------------------------------------------------
	
	public void setPassaword(String encode) {
		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}
