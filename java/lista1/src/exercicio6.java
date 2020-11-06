import java.util.Scanner;

public class exercicio6 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		double a;
		double b;
		double c;
		double d;
		double x;
		
		System.out.println("Insira o número A: ");
		a = leia.nextDouble();
		
		System.out.println("Insira o número B: ");
		b = leia.nextDouble();
		
		System.out.println("Insira o número C: ");
		c = leia.nextDouble();
		
		System.out.println("Insira o número D: ");
		d = leia.nextDouble();
		
		x = ((Math.pow((b - a), 2)) + (Math.pow((d - c), 2)));
		
		d = Math.ceil(Math.sqrt(x));
		
		System.out.println("\nO valor da equação é de: " + d);

	}

}
