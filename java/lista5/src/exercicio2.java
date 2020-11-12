import java.util.Scanner;

public class exercicio2 
{

	public static void main(String[] args) 
	{		
		Scanner leia = new Scanner (System.in);
		
		double peso, altura, imc;

		System.out.println ("Insira seu peso: ");
		peso = leia.nextDouble();
		System.out.println ("Insira sua altura: ");
		altura = leia.nextDouble();

		imc =(peso/(Math.pow(altura,2)));

		if (imc <= 18.5)
		{
			System.out.println ("\nVocê está abaixo do peso");
		}
		else if (imc >= 18.6 && imc < 25)
		{
			System.out.println ("\nPeso normal ");
		}
		else if (imc >= 25 && imc <= 30)
		{
			System.out.println ("\nAcima do peso");
		}
		else if (imc >30)
		{
			System.out.println ("\nObeso");	
		}	
	}	

}


