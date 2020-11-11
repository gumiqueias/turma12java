import java.util.Scanner;

public class exercicio4 
{

	public static void main(String[] args) 
	{

		Scanner leia = new Scanner (System.in);
		
		final int linha = 3, coluna = 3;
		int matriz [][] = new int [linha][coluna];
		int x = 0, y = 0, soma = 0;
		
		for (x = 0; x<linha; x++)
		{
			for (y = 0; y<coluna; y++)
			{
				matriz[x][y] = (int) (Math.random() * 10);

				if  (x==y)
				{
					soma = soma + matriz[x][y];
				}
			}
		}
		
		for (x = 0; x<linha; x++)
		{
			for (y = 0; y<coluna; y++)
			{
				System.out.print (matriz[x][y]);
				System.out.print (" ");																			
			}
			
			System.out.print ("\n");
		}
		System.out.println ("\nTotal de valores da diagonal principal: "+soma);
	}

}
