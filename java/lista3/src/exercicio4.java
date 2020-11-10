import java.util.Scanner;

public class exercicio4 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		int a = 0;
		
		System.out.print("Insira o valor: ");
		a = leia.nextInt();
		
		while (a<100)
		{
			
		a = a * 3;	
				
		System.out.printf("\n%d ", a);		
		}				
			System.out.println("\nPrograma interrompido");
			System.out.println("\nNúmero maior que 100");
	
	}

}
