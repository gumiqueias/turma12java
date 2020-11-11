import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		final int linha = 5, coluna = 31;
		String matriz[][] = new String [linha][coluna];
		int x, y, dias;
		
		
		System.out.println("\nInforme o dia correspondente de 1 a 31");
		dias = leia.nextInt();
		
		if (dias == 0 || dias >31)
		{
			System.out.println("Dia inválido");
			System.out.println("Informe o dia correspondente de 1 a 31");
			dias = leia.nextInt();			
		}
		
		dias = dias - 1;
		
		System.out.println("\nDigite 'sair' para finalizar o programa ");
				
			for (x = 0; x<linha; x++)
			{
				
				System.out.printf("\n\nInsira a tarefa %dº: ",x+1);
				leia.nextLine();
				matriz [x][dias] = leia.nextLine();
				
								
				if (matriz [x][dias].equals("sair") || matriz [x][dias].equals("SAIR") )
				{
					
					System.out.printf("\n\n");
					for (x = 0; x<linha; x++)
					{
						for (y = 0; y<coluna; y++)
						{
							System.out.print (matriz[x][y]+"\t");
							System.out.print (" ");
						}
						
						System.out.print ("\n\n");
					}
					
				}
				
			}
			
			
		
		

	}

}
