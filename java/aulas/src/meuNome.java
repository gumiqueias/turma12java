  
import java.util.Scanner;

public class meuNome 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		int anoNas; 
		int idade;
		int ano = 2020;
		String nome;
		
		
		System.out.print("Dgite ifu nome: ");
		nome = leia.next();
		
		System.out.print("\nDigite ifu ano de nascimento: " );
		anoNas = leia.nextInt();
		
		idade = ano - anoNas;
		
		System.out.print("\nifu nome é " + nome + " e sua idade é " + idade + " anos." );

	}

}