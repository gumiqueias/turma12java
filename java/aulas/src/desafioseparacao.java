import java.util.Scanner;

public class desafioseparacao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		String nomes[] = {"Ana veronica Nascimento cruz", "Bruno Estivalli Vicente", "Bruno Henrique Moraes Santos", "Daniel Ferreira", "Dayane de Oliveira", "Denis Vinicius Bolla da Silva", "Diego  Joaquim Silva ", "Erick Alan", "Everson Silva", "Gabriel Enrique Cabral Silva", "Guilherme Alex", "Guilherme Fidelis Pereira", "Gustavo Miquéias Lopes Santana", "Isac Cordeiro de Oliveira", "Iuri Garcia Nunes", "Jenifer Lima Placido", "Jéssica Cristiane", "Joao Pedro Sena", "Larissa Moraes Ribeiro", "Leonardo de Moraes Magalhães", "Lucas Santos Gonçalves", "Mariana  de Cássia Antunes Oliveira", "Patricia da Silva Machado", "Paula Leticia", "Raul Fernandes", "RICARDO MAGALHAES FINKELSTEIN", "Thiago dos Anjos", "Vitória Gonçalves de Freitas", "William Xavier"};
		String codigos[] = new String[29];
		boolean sexo[] = {false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,false,false,true,false,true,true,false,false,false,true,true,true,false,true};
		int tamanho=0;
		int grupo = 1;
		char sep;
		
		
		for (int x = 0; x<29; x++) {
			codigos[x] = "C0"+(x+1);
		}

		System.out.println("DIVISÃO DE GRUPOS");
		
		System.out.println("\nInsira o tamanho do grupo de 2 a 10:");
		tamanho = leia.nextInt();
		
		if (tamanho <2)
		{
			System.out.println("VALOR INVÁLIDO");
			
			System.out.println("\nInsira o tamanho do grupo de 2 a 10:");
			tamanho = leia.nextInt();
		}
		
		System.out.println("\nDeseja separar as meninas S / N ?");
		sep = leia.next().charAt(0);
		
		if (sep == 's' || sep == 'S' )
		{
			System.out.println("COD \t GRUPO \t\t NOME"); 
			

			for(int x = 0; x<29; x++) 
			{
				if (sexo[x]) 
				{
					System.out.printf("%s \t %d \t\t %s\n",codigos[x] , grupo,nomes[x]);
					
					if (((x+1)%tamanho)==0)
						
					{					
						grupo++;
						
						System.out.println ("____________________________________________________________________");	
						
					}
				
				}
			}
			

			for(int x = 0; x<29; x++) 
			{
				if (sexo[x]==false)
				{
					System.out.printf("%s \t %d \t\t %s\n",codigos[x] , grupo,nomes[x]);
					
					if (((x+1)%tamanho)==0)
					{					
						grupo++;
						
						
					}
					
				}
			}
		}
		
		else 
		{
			System.out.println("COD \t GRUPO \t\t NOME"); 
			for(int x = 0; x<29; x++) 
			{	
				
				System.out.printf("%s \t %d \t\t %s\n",codigos[x] , grupo,nomes[x]);
							
				if (((x+1)%tamanho)==0)
				{					
					grupo++;
					System.out.println ("____________________________________________________________________");
				}
		}	

		
		
		}
		
	
	}

}
