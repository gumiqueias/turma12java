import java.util.Scanner;

public class exercicio4 
{

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner (System.in);
		
		double a;
		double b;
		double c;
		double d;
		double r;
		double s;
		
		System.out.println("Insira o n�mero A: ");
		a = leia.nextDouble();
		
		System.out.println("Insira o n�mero B: ");
		b = leia.nextDouble();
		
		System.out.println("Insira o n�mero C: ");
		c = leia.nextDouble();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		
		d = (r+s)/2;
		
		System.out.println("\nO resultado do valor de D �: "+d);
		
	}

}
