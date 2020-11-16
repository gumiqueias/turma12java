package entidades;

public class pessoa 
{
	public String nome;
	public String sobrenome;
	public char genero;
	public int anoNascimento;
	public int idade;
	
	public pessoa (String nome) 
	{
		this.nome = nome;
	}
	
	public pessoa (String nome, String sobrenome) 
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public void idade()
	{
		System.out.println("\n"+(2020-this.anoNascimento));
	}
}
