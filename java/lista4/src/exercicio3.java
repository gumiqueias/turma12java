import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		final int linha = 4, coluna = 6;
		int n1[][] = new int [linha] [coluna];
		int n2[][] = new int [linha] [coluna];
		int m1[][] = new int [linha] [coluna];
		int m2[][] = new int [linha] [coluna];
		int x = 0, y = 0, soma = 0, sub = 0;
		
		for (x = 0; x<linha; x++)
		{
			for (y = 0; y<coluna; y++)
			{
				n1[x][y] = (int) (Math.random() * 10);
				n2[x][y] = (int) (Math.random() * 10);
			}
		}
		
		for (x = 0; x<linha; x++)
		{
			for (y = 0; y<coluna; y++)
			{
				m1[x][y] = n1[x][y] + n2[x][y];
				m2[x][y] = n1[x][y] - n2[x][y];	
				
			}
						
		}
		
		for (x = 0; x<linha; x++)
		{
			for (y = 0; y<coluna; y++)
			{
				System.out.print (m1[x][y]);
				System.out.print (" ");																			
			}
			
			System.out.print ("\n\n");
		}
		
		for (x = 0; x<linha; x++)
		{
			for (y = 0; y<coluna; y++)
			{
				System.out.print (m2[x][y]);
				System.out.print (" ");
			}
			
			System.out.print ("\n\n");
		}
		
		

	}

}
