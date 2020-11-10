import java.util.Scanner;

public class exercicio3 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		int a = 0, b = 0, c = 0, soma =0;
		
		while (a>=0)
		{
			System.out.println("Insira um valor: ");
			a = leia.nextInt();	
			
			if (a>=0)
			{
				soma = soma + a;
				c ++;
			}
		}
		System.out.println("STOP\n");
		b = soma / c;
		
		System.out.printf ("O programa foi executado %d vezes, a soma total é de %d e a média é de %d", c, soma, b);
		
	}

}
