import java.util.Scanner;

public class exercicio8 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		double custo;
		double total;
		double d;
		double i;
		
		System.out.println("Insira o valor de f�bica do veic�lo: ");
		custo = leia.nextInt();
		
		d = custo*0.28;
		i = custo*0.48;
		
		total = d+i+custo;
		
		
		System.out.println ("\nO valor de f�brica do ve�culo � de : " + custo);
		System.out.println ("\nO valor a ser pago  ditribuidora � de : " + d);
		System.out.println("\nValor a ser pago de impostos �: "+ i); 
		System.out.println ("\nValor total a pagar pelo carro � de: " + total);

	}

}
