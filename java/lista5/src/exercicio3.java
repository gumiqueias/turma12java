import java.util.Scanner;

public class exercicio3 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		int x, c = 0;
		
		do
		{
			
			System.out.println("Escreva um número: ");
			x = leia.nextInt();
			
			if (x > 0 && x<= 25)
			{
				c ++;
			}
			else if (x >= 26 && x <= 50)
			{
				c ++	;
			}
			else if (x >= 51 && x <= 75)
			{
				c ++;
			}
			else if (x >= 76 && x<= 100)
			{				
				c ++;
			}
			
		} while (x>0);
		
		System.out.println ("\nQuantidade de números entre [0-25], [26-50], [51-75] e [76-100]: " + c);		
	}

}
