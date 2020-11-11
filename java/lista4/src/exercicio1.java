import java.util.Scanner;

public class exercicio1 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
			int vetor [] = new int [5];
			int c = 0, maior = 0;
			
			for (c=0; c<5; c ++)
			{
				System.out.println("Informe o valor: ");
				vetor [c] = leia.nextInt();
			}
			
			for (c=0; c<5; c ++)
			{
				System.out.printf("\nValor posição %d : %d", (c+1),vetor[c]);
				
				if (vetor[c]>maior)
				{
					maior = vetor[c];
				}
			}
			
			System.out.println("\n\nMaior valor: " + maior);

	}

}