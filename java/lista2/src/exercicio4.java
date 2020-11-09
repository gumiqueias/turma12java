import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int a,x;
		
		System.out.println("Insira um número: ");
		a = leia.nextInt();
		
		
		
		if ((a%2) == 0 )
		{			
				System.out.printf ("\nNúmero par");
		} 
		else
		{	
				System.out.printf ("\nNúmero ímpar");
		}
		
		if (a >= 0 )
		{			
				System.out.printf ("\nNúmero positivo");
		}
		else
		{
				System.out.printf ("\nNúmero negativo");
		}
		

	
	}
}
