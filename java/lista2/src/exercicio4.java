import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int a,x;
		
		System.out.println("Insira um n�mero: ");
		a = leia.nextInt();
		
		
		
		if ((a%2) == 0 )
		{			
				System.out.printf ("\nN�mero par");
		} 
		else
		{	
				System.out.printf ("\nN�mero �mpar");
		}
		
		if (a >= 0 )
		{			
				System.out.printf ("\nN�mero positivo");
		}
		else
		{
				System.out.printf ("\nN�mero negativo");
		}
		

	
	}
}
