import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double a, b, c;
		
		System.out.println("Insira o índice do grupo A: ");
		a = leia.nextDouble();
		
		System.out.println("Insira o índice do grupo B: ");
		b = leia.nextDouble();
		
		System.out.println("Insira o índice do grupo C: ");
		c = leia.nextDouble();
		
		if ((a >= 0.05 && a <= 0.25) && (b >= 0.05 && b <= 0.25) && (c >= 0.05 && c <= 0.25))
		{
			System.out.println("Índice do grupo OK!");
		}
		
		 if (a >= 0.3)
		 {
  			if (a >= 0.5 && b >= 0.5 && c >= 0.5)
  			{
  				
  				System.out.println ("TODOS GRUPOS DEVERÃO SUSPENDER SUAS ATIVIDADES!");
  			}
  			else if (a >= 0.4 && b >= 0.4)
  			{ 				
  				System.out.println ("ATENÇÃO!! GRUPO A E B DEVERÃO SUSPENDER AS ATIVIDADES!");
  			}

  			else if (a < 0.05 && b < 0.05 && c < 0.05)
  			{
  				System.out.println ("índice abaixo do padrão");
  			}
  			else 
  			{ 
  				System.out.println ("ATENÇÃO!! GRUPO A DEVERÁ SUSPENDER AS ATIVIDADES!");
  			}               	 		

		 }

	}

}
