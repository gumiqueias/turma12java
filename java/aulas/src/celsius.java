import java.util.Scanner;

public class celsius 
{
	
	
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		double c;
		double f;
		
		System.out.println("Insira os graus em celsius: ");
		c = leia.nextDouble();
		
		f = (c * 1.8)+32;
		
		System.out.println("\nTemperatura em Graus " + c + "º");
		System.out.println("\nTemperatura em fahrenheit: " + f);
		
	
	}
}