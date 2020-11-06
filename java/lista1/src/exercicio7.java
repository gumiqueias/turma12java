import java.util.Scanner;

public class exercicio7 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double x;
		double y;
		
		System.out.println("Insira o número A: ");
		a = leia.nextDouble();
		
		System.out.println("Insira o número B: ");
		b = leia.nextDouble();
		
		System.out.println("Insira o número C: ");
		c = leia.nextDouble();
		
		System.out.println("Insira o número D: ");
		d = leia.nextDouble();
		
		System.out.println("Insira o número E: ");
		e = leia.nextDouble();
		
		System.out.println("Insira o número F: ");
		f = leia.nextDouble();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println("\nValor de X: " + x);
		System.out.println("\nValor de Y: " + y);

	}

}
