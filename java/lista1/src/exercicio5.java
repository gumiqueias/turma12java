import java.util.Scanner;

public class exercicio5 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		double a;
		double b;
		double c;
		double x;
		
		System.out.println("Insira o número 1: ");
		a = leia.nextDouble();
		
		System.out.println("Insira o número 2: ");
		b = leia.nextDouble();
		
		System.out.println("Insira o número 3: ");
		c = leia.nextDouble();
		
		x = ((a*2) + (b*3) + (c*5)) / 10;
		
		System.out.println("\nA média ponderada das notas é: " + x);

	}

}
