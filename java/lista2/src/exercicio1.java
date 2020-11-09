import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double p, ex, m;
		
		System.out.println("Por favor, insira o peso cotemplando o exemplo de 00.00: ");
		p = ler.nextDouble();
		
		if (p >50.00) 
		{
			
			ex = p*4.00;
			m = ex - 200.0;
			
			System.out.printf ("Devido ao excesso de peso a multa a ser paga tem o valor de R$ %.2f",m);
		}
		else 
		{
			p = 0;
			ex = 0;
			m = 0;
			System.out.printf ("P: "+p+", E: "+ex+", M: "+m);
		}

	}

}
