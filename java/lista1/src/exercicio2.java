import java.util.Scanner;

public class exercicio2 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		int anos;
		int meses;
		int dias;
		
		System.out.println("Insira sua idade em dias: ");
		dias = leia.nextInt();
		
		anos = (dias / 365);
		meses = (dias % 365)/30;
		dias = ((dias % 365)%30);
		
		System.out.println("Total da sua idade em anos: " + anos);
		System.out.println("Total da sua idade em meses: " + meses);
		System.out.println("Total da sua idade em dias: " + dias);
		
	}

}
