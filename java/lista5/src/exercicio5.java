import java.util.Scanner;

public class exercicio5 
{

	public static void main(String[] args) 
	{

		Scanner leia = new Scanner (System.in);
		
		int vetor [] = new int [5];
		int x, c;
		
		for (c = 0; c < 5; c++)
		{
			System.out.println("Insira o número para a posição "+(c+1)+" do vetor: ");
			vetor [c] = leia.nextInt();
		}
		
		System.out.println("\nInsira o código: ");
		x = leia.nextInt();
				
		 if (x==1)
		{
			for (c=0; c <5; c++)
			{
				System.out.println ("\nPosição: " + (c+1)  + " - Valor: "+vetor[c]);

			}
		}
		else if (x==2)
		{
			for (c=4; c >=0; c--)
			{
				System.out.println ("\nPosição: " + (c+1)  + " - Valor: "+vetor[c]);

			}
		}	
		else 
		{
			System.out.println("\n\nPROGRAMA FINALIZADO");	
		}	

	}

}
