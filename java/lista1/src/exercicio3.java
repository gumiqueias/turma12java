import java.util.Scanner;

public class exercicio3 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		int evento;
		int horas;
		int minutos;
		int segundos;
		
		System.out.println("Tempo de duração do evento em segundos: ");
		evento = leia.nextInt();
		
		minutos = (evento % 3600)/60;
		horas = evento / 3600;
		segundos = ((evento % 3600)%60);
		
		System.out.println ("\nTotal em minutos: "+minutos);
		System.out.println ("\nTotal em horas: "+horas);
		System.out.println ("\nTotal em segundos: "+segundos);

	}

}
