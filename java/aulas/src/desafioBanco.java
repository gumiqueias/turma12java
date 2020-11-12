import java.util.Scanner;

public class desafioBanco {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String tipoConta;
		String nc = "CE-1";
		double saldo = 0.0;
		double limite = 400.0;
		final int mov = 10;
		String cpf = "000.000.000-00";
		double movimentacao [] = new double [mov];
		int x;
		char tipo, liberaLimite;
		
		System.out.println("Insira o tipo de conta CP/CC/CE/CB:");		
		tipoConta = leia.nextLine();
				
		if (tipoConta.equals("CE") || tipoConta.equals("ce") )
		{	
			System.out.println("------------------------------------");
			System.out.println("NUMERO CONTA: " + nc );
			System.out.printf("SALDO: R$ %.2f",saldo);
			System.out.printf("\nVALOR LIMITE: R$ %.2f ", limite);
			System.out.println("\nCPF: " + cpf);
			System.out.println("------------------------------------\n");
			
		
		for (x=0; x<mov; x++)
		{
			System.out.print("\nINSIRA A "+(x+1)+"º MOVIMENTAÇÃO \n");
			System.out.print("\nCREDITO (C) OU DÉBITO (D) ? ");
			tipo = leia.next().charAt(0);
			
			if (tipo == 'C' || tipo == 'c')
			{
				System.out.print("\nINSIRA O VALOR DA TRANSAÇÃO: R$ ");
				movimentacao [x] = leia.nextDouble();
												
				if (limite < 400.0)
				{
					
					limite = limite + movimentacao[x];
					
				}
				
				else 
				{
					saldo = saldo + movimentacao[x];
				}
				
			}
			
			if (tipo == 'D' || tipo == 'd')
			{
				System.out.print("\nINSIRA O VALOR DA TRANSAÇÃO: R$ ");
				movimentacao [x] = leia.nextDouble();
				saldo = saldo - movimentacao[x];

				if (saldo < 0.0)
				{
					System.out.print("\n\nVALOR NEGATIVO - LIBERA O USO DO LIMITE ? S/N - ");
					liberaLimite = leia.next().charAt(0);
					
					if (liberaLimite == 'S' || liberaLimite == 's')
					{
							limite = saldo + limite;
							
							if (limite <0)
							{
								limite = 0;
							}
							
							System.out.printf("\n\nRESTANTE LIMITE: R$ %.2f\n",limite);						
					}
					
					else if ((liberaLimite == 'N' || liberaLimite == 'N'))
					{
						break;
					}
				}
			}
		}
			System.out.println("\nTRANSAÇÕES");	
			
			for (x=0; x<mov; x++) 
			{				
				System.out.printf("\nR$ %.2f", movimentacao[x]);
			}
				if (saldo <0)
				{
					saldo = 0.0;
				}
						
				System.out.printf("\n\nRESTANTE SALDO: R$ %.2f",saldo);
				System.out.printf("\n\nRESTANTE LIMITE: R$ %.2f\n",limite);
		}
	}

}
