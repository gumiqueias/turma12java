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
		
		System.out.println("Insira o n�mero A: ");
		a = leia.nextDouble();
		
		System.out.println("Insira o n�mero B: ");
		b = leia.nextDouble();
		
		System.out.println("Insira o n�mero C: ");
		c = leia.nextDouble();
		
		System.out.println("Insira o n�mero D: ");
		d = leia.nextDouble();
		
		x = ((Math.pow((b - a), 2)) + (Math.pow((d - c), 2)));
		
		d = Math.ceil(Math.sqrt(x));
		
		System.out.println("\nO valor da equa��o � de: " + d);

	}

}
