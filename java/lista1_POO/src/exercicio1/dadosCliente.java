package exercicio1;

public class dadosCliente 
{
	public String nome;
	public String cpf;
	public String telefone;
	public int idade;
	
	public dadosCliente() 
	{
	
	}
	
	public void getCliente ()
	{
		System.out.println("Bem vindo, "+nome );
		System.out.println("CPF: "+cpf );
		System.out.println("Telefone: " +telefone );
		System.out.println(idade+ "Anos");
		
	}
	
	
}
