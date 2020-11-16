package exercicio4;

public class dadosFuncionario 
{
	public String nome;
	public String empresa;
	public int cod;
	
	public dadosFuncionario(String nome, String empresa, int cod) 
	{
		this.nome = nome;
		this.empresa = empresa;
		this.cod = cod;
	}

	public void getFuncionario ()
	{
		System.out.println("FUNCIONARIO: "+nome );
		System.out.println("EMPRESA: "+empresa );
		System.out.println("CÓDIGO: "+cod);
		
	}
}
