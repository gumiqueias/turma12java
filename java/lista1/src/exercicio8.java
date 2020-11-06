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
		
		System.out.println("Insira o valor de fábica do veicúlo: ");
		custo = leia.nextInt();
		
		d = custo*0.28;
		i = custo*0.48;
		
		total = d+i+custo;
		
		
		System.out.println ("\nO valor de fábrica do veículo é de : " + custo);
		System.out.println ("\nO valor a ser pago  ditribuidora é de : " + d);
		System.out.println("\nValor a ser pago de impostos é: "+ i); 
		System.out.println ("\nValor total a pagar pelo carro é de: " + total);

	}

}
