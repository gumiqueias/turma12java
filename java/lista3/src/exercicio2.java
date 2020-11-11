import java.util.Scanner;

public class exercicio2 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		int contador, soma = 0;
		
		for (contador = 1; contador <=500; contador ++)
		{
			if ((contador % 2) !=0 && (contador % 3) ==0)
			{
				soma = contador + soma;
				
				System.out.printf("\nA soma de todos números ímpares e múltiplos de 3 é %d", soma);
			}
		}

	}

}