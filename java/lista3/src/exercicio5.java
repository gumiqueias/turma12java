import java.util.Scanner;

public class exercicio5 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		int x = 233;
		
		do 
		{
			System.out.println(x);
			
			if (x >=300 && x<=400)
			{
				x = x + 3;
			}
			
			else
			{
				x = x  + 5;
			}
		}
		while (x <= 456);
		

	}

}
