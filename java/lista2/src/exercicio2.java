import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int c;
		double n, ex, sal;
		
		System.out.println("Insira o c�digo: ");
		c = leia.nextInt();
		
		System.out.println("Insira a quantidade de horas trabalhadas: ");
		n = leia.nextDouble();

		if(n > 50.0)
		{			  
			ex = n - 50.0;
			ex = ex * 20.0;
			sal = ex + 500.0;
			System.out.println("\nFuncion�rio C�DIGO "+c);
			System.out.printf ("\nValor do sal�rio R$ 500,00 e Valor de hora extra R$ %.2f",ex);
			System.out.printf ("\nTotalizando R$ %.2f",sal);
		}
		
		else 
		{
			sal = n * 10.0;  
			ex = 0;
			
			System.out.printf ("\nValor do sal�rio R$ %.2f",sal);
			
		}
		
	}

}
