

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		double basex, alturax, basey, alturay;
		double areax, areay;
		
		System.out.println("Insira a base do 1� tri�ngulo: ");
		basex = leia.nextDouble();
		System.out.println("Insira a altura do 1� tri�ngulo: ");
		alturax = leia.nextDouble();
		
		System.out.println("Insira a base do 2� tri�ngulo: ");
		basey = leia.nextDouble();
		System.out.println("Insira a base do 2� tri�ngulo: ");
		alturay = leia.nextDouble();
		
		if ((basex > 0) && (alturax >0) && (basey > 0) && (alturay > 0))
		{
			areax = (basex * alturax)/2;
			areay = (basey * alturay)/2;
			
			System.out.printf("\n�rea do 1� tri�ngulo %.2f", areax);
			System.out.printf("\n�rea do 2� tri�ngulo %.2f", areay);
			
			
			if (areax > areay)				
			{
				System.out.printf("\n\nBASE DO TRI�NGULO 1� � MAIOR QUE O 2�");
			}
			else if (areax == areay)
			{
				System.out.printf("\nOPA BASES IGUAIS");
				
			}
			else 
			{
				System.out.printf("\nBASE DO TRI�NGULO 2� � MAIOR QUE O 1�");
			}
			
		}
		else 
		{
			System.out.println("\nVALOR = 0 OU NEGATIVO, INSIRA NOVAMENTE\n:");
			
			System.out.println("Insira a base do 1� tri�ngulo: ");
			basex = leia.nextDouble();
			System.out.println("Insira a altura do 1� tri�ngulo: ");
			alturax = leia.nextDouble();
			
			System.out.println("Insira a base do 2� tri�ngulo: ");
			basey = leia.nextDouble();
			System.out.println("Insira a base do 2� tri�ngulo: ");
			alturay = leia.nextDouble();
		}
		
	}

}
