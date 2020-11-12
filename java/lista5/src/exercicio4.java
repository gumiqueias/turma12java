import java.util.Scanner;

public class exercicio4 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		double x = 1, y;
		double soma = 0.0, div = 0.0;
				
		for (y=1; y<=50; y++)
		{

			div = x/y;	
			soma = soma + div;		
					
			x = x + 2;
					
			System.out.printf ("\nA soma total é %.2f", soma );	
		}
	}

}
