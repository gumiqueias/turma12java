

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		double basex, alturax, basey, alturay;
		double areax, areay;
		
		System.out.println("Insira a base do 1º triângulo: ");
		basex = leia.nextDouble();
		System.out.println("Insira a altura do 1º triângulo: ");
		alturax = leia.nextDouble();
		
		System.out.println("Insira a base do 2º triângulo: ");
		basey = leia.nextDouble();
		System.out.println("Insira a base do 2º triângulo: ");
		alturay = leia.nextDouble();
		
		if ((basex > 0) && (alturax >0) && (basey > 0) && (alturay > 0))
		{
			areax = (basex * alturax)/2;
			areay = (basey * alturay)/2;
			
			System.out.printf("\nÁrea do 1ª triângulo %.2f", areax);
			System.out.printf("\nÁrea do 2ª triângulo %.2f", areay);
			
			
			if (areax > areay)				
			{
				System.out.printf("\n\nBASE DO TRIÂNGULO 1ª É MAIOR QUE O 2º");
			}
			else if (areax == areay)
			{
				System.out.printf("\nOPA BASES IGUAIS");
				
			}
			else 
			{
				System.out.printf("\nBASE DO TRIÂNGULO 2ª É MAIOR QUE O 1º");
			}
			
		}
		else 
		{
			System.out.println("\nVALOR = 0 OU NEGATIVO, INSIRA NOVAMENTE\n:");
			
			System.out.println("Insira a base do 1º triângulo: ");
			basex = leia.nextDouble();
			System.out.println("Insira a altura do 1º triângulo: ");
			alturax = leia.nextDouble();
			
			System.out.println("Insira a base do 2º triângulo: ");
			basey = leia.nextDouble();
			System.out.println("Insira a base do 2º triângulo: ");
			alturay = leia.nextDouble();
		}
		
	}

}
