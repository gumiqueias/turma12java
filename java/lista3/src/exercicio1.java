import java.util.Scanner;

public class exercicio1 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		double sal = 0.0, filhos = 0, tfilhos = 0, tsal = 0, maiorsal = 0, menorcem = 0, funci = 0, 
		contador = 0, entrevistados = 0;
		
		System.out.println("Digite a quantidade de entrevistados: ");
		entrevistados = leia.nextDouble();
		
		for (funci=0; funci <entrevistados; funci ++)
		{
			System.out.println("Informe o salário: ");
			sal = leia.nextDouble();
			System.out.println("Informe a quantididade de filhos: ");
			filhos = leia.nextDouble();
			
			if (sal > maiorsal)
			{
				maiorsal = sal;
			}
			
			if (sal < 100)
			{
				contador ++;
			}	
			
			tsal = (tsal + sal)/entrevistados;
			tfilhos = (tfilhos + filhos)/entrevistados;
			menorcem = (contador/entrevistados)*100.00;
		}

		System.out.printf ("\nA média do salário da população é de: %.2f" ,tsal);
		System.out.printf ("\nA média de filhos da população é de: %.0f",tfilhos);
		System.out.printf ("\nO maior salário dentro os inifridos é de: %.2f ",maiorsal);
		System.out.printf ("\nO percentual de pessoal com salário abaixo de 100 é de: %.2f porcento",menorcem);

	}

}
