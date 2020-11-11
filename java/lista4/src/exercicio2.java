import java.util.Scanner;

public class exercicio2 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		int vetor [] = new int [10];
		int soma = 0, c, maior = 0, x = 0, cmaior = 0;
		double media = 0;
		
		for (c=0; c<10; c++)
		{
			System.out.println("Insira o valor correspondente a jogada de 1 a 6:");
			vetor [c] = leia.nextInt();
			System.out.printf("\nValor posição %d : %d\n\n", c,vetor[c]);
			
			soma = soma + vetor[c];
			media = soma / 10;
			
			if (vetor[c] >= maior)
			{				
									
				maior = 0;
				maior = maior + vetor[c];
				cmaior ++;
				
			}

		}
		
		if (vetor[0] < maior)
		{
			cmaior --;
		}
		
		System.out.println ("____________________________________________________________________");
		System.out.println ("\nTotal de valores somados: " + soma);
		System.out.println ("\nMaior valor: " + maior);
		System.out.println ("\nMédia aritimética dos valores lançados: " + media);
		System.out.println ("\nQuantas foram as ocorrências da maior pontuação: " + cmaior);

	}

}