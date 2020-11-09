import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double a, b, c, d , a1, b1, c1, d1;
		
		System.out.println ("Digite o numero 1: ");
		a = ler.nextDouble();
		System.out.println ("Digite o numero 2: ");
		b = ler.nextDouble();
		System.out.println ("Digite o numero 3: ");
		c = ler.nextDouble();
		System.out.println ("Digite o numero 4: ");
		d = ler.nextDouble();
		
		a1 = Math.pow(a,2);
		b1 = Math.pow(b,2);
		c1 = Math.pow(c,2);
		d1 = Math.pow(d,2);
		
		if (c1 >= 1000) 
		{
			System.out.println (" O resultado do número 3 ao quadrado é: " + c1);
		}
		else
		{
			System.out.println ("\nValor 1: " + a + " Valor ao quadrado: " + a1);
			System.out.println ("\nValor 2: " + b + " Valor ao quadrado: " + b1);
			System.out.println ("\nValor 3: " + c + " Valor ao quadrado: " + c1);
			System.out.println ("\nValor 4: " + d + " Valor ao quadrado: " + d1);
		}
	}

}
