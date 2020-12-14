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

import org.hibernate.validator.constraints.NotEmpty;



@Entity // Especifica uma classe de entidade e se mescla com a tabela do banco de dados 
public class Usuario implements UserDetails, Serializable {
		    
			//previne erros de versões sobrepostas
			private static final long serialVersionUID = 1L;

	//ATRIBUTOS --------------------------------------
	@Id // Identificador 
	private String login;
	private String nomeCompleto;
	private String senha;
	@ManyToMany // Varios para todos. 
	//JoinTable = Estabelece a tabela   JoinColumn= Estabelece a coluna // E ambos se mesclam
	@JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "usuario_id",
				referencedColumnName = "login"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "nomeRole"))
	private List<Role> roles;
	
	//SEGURANÇA-----------------------------------------
	@Override // Garantia de sobrescrever o msm código sem criar um novo
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.roles;  

	}
	@Override
	public String getPassword() //Solicita a senha de acesso
	{
		return this.senha;   	
	}
	@Override
	public String getUsername() //Solicita o nome cadastrado
	{
		return this.login; 
	}

	@Override
	public boolean isAccountNonExpired() // Validade da conta cadastrada
	{
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() // Mostra se o usuario está bloqueado e desbloqueado
	{
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() // Acesso Inspirou
	{
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() //Indica se está ativado ou não
	{
		// TODO Auto-generated method stub
		return true;
	}
	// GETTER E SETTERS ------------------------------------------------------
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
