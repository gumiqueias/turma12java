import java.util.Scanner;

public class exercicio6 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		int valorDigitado = 0, totalSoma = 0, contador = 0;
		
		System.out.println("Digite um valor inteiro positivo: ");
		valorDigitado = leia.nextInt();		
	
		do {
			
			contador ++;
			totalSoma = totalSoma + contador;
			
			System.out.printf("%d\n", contador);
			
		}
		while ((contador < valorDigitado));

			System.out.print("= "+totalSoma);
	}

}
