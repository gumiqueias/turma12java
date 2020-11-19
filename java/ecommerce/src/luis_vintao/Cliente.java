package luis_vintao;
import java.time.LocalDate;

public class Cliente 
{
	//ATRIBUTOS
	private LocalDate data = LocalDate.now();
	protected String nome;
	private String email;
	protected String cpf;
	
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
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
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
