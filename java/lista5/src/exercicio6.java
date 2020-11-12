import java.util.Random;
import java.util.Scanner;

public class exercicio6 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		Random aleatorio = new Random();
		
		final int linha = 3, coluna = 3;
		int vetor [] = new int [linha];
		int matriz [][] = new int [linha][coluna];
		int x = 0, y = 0;
		
		for (x = 0; x<linha; x++) // populando a matriz
		{
			for (y = 0; y<coluna; y++)
			{
				matriz[x][y] = aleatorio.nextInt(10) + 1;
			}
		}
				
		for (x = 0; x<linha; x++) // populando vetor
		{
			vetor[x] =  aleatorio.nextInt(10) + 1;
		}
		
		System.out.print ("MATRIZ\n");
		
		for (x = 0; x<linha; x++) // imprimindo a matriz
		{
			for (y = 0; y<coluna; y++)
			{
				System.out.print (matriz[x][y]);
				System.out.print (" ");																			
			}
			
			System.out.print ("\n");
		}
			
		System.out.print ("\n\n");
		System.out.print ("VETOR\n");
		
		for  (x = 0; x<linha; x++) // imprimindo vetor
		{
			System.out.print (vetor[x]);
			System.out.print (" ");
		}
		
		System.out.print ("\n\n");
		System.out.print ("\nMULTIPLIÇÃO\n");
		
		vetor [0] = vetor [0] * matriz [0][0];
		vetor [1] = vetor [1] * matriz [0][1];
		vetor [2] = vetor [2] * matriz [0][2];		
	
		for  (x = 0; x<linha; x++) // imprimindo vetor
		{
			System.out.print (vetor[x]);
			System.out.print (" ");
		}
	}
}
