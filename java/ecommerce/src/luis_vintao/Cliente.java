package luis_vintao;

public class Cliente 
{
	//ATRIBUTOS
	private String nome;
	private String email;
	private String cpf;
	
	//CONSTRUTOR PADRÃO
	public Cliente() 
	{
		super();
	}

	//CONSTRUTORES
	public Cliente(String nome, String cpf) 
	{
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	//GETTERS E SETTERS
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	
	
}//CHAVE PUBLIC CLASS
