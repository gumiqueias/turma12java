package projetoBanco;

import java.util.Scanner;

public class contaEspecial 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		String tipoConta;
		String nc = "CE-1"; 
		double saldo = 0.0; 
		double limite = 500.0, saldoLimite; 
		final int mov = 4; 
		String cpf = "000.000.000-00"; 
		double movimentacaoDebito [] = new double [mov]; 
		double movimentacaoCredito [] = new double [mov]; 
		int x; 
		char tipo, liberaLimite; 

		
		System.out.println("Insira o tipo de conta CP/CC/CE/CB:");		
		tipoConta = leia.nextLine();
				
		if (tipoConta.equals("CE") || tipoConta.equals("ce") )
		{	
			saldoLimite = saldo + limite;
			System.out.println("------------------------------------");
			System.out.println("NUMERO CONTA: " + nc );
			System.out.printf("SALDO: R$ %.2f",saldo);
			System.out.printf("\nVALOR LIMITE: R$ %.2f ", limite);
			System.out.printf("\nSALDO + LIMITE: R$ %.2f ", saldoLimite);
			System.out.println("\nCPF: " + cpf);
			System.out.println("------------------------------------\n");
			
		
		for (x=0; x<mov; x++)
		{
			System.out.print("\nINSIRA A "+(x+1)+"� MOVIMENTA��O \n");
			System.out.print("\nCREDITO (C) OU D�BITO (D) ? ");
			tipo = leia.next().charAt(0);
			
			if (tipo == 'C' || tipo == 'c')
			{
				System.out.print("\nINSIRA O VALOR DA TRANSA��O: R$ ");
				movimentacaoCredito [x] = leia.nextDouble();
															
					saldoLimite = saldoLimite + movimentacaoCredito[x];
			}
				
			
			if (tipo == 'D' || tipo == 'd')
			{
				System.out.print("\nINSIRA O VALOR DA TRANSA��O: R$ ");
				movimentacaoDebito [x] = leia.nextDouble();
				

				if ((saldoLimite - movimentacaoDebito[x]) < 500 && ( saldoLimite - movimentacaoDebito[x]) >=0 )
				{
					System.out.print("\n\nVALOR NEGATIVO - LIBERA O USO DO LIMITE ? S/N - ");
					liberaLimite = leia.next().charAt(0);
					
					if (liberaLimite == 'S' || liberaLimite == 's')
					{
							saldoLimite = saldoLimite - movimentacaoDebito[x];
							
							System.out.printf("\n\nSALDO + LIMITE = R$ %.2f\n",saldoLimite);						
					}
					
					else if ((liberaLimite == 'N' || liberaLimite == 'N'))
					{
						break;
					}
				}
				
				else if ((saldoLimite - movimentacaoDebito[x])  <0 )
					
				{
					System.out.print("\nSALDO INSUFICIENTE\n");
					x --;
				}
				
				else 
				{
					saldoLimite = saldoLimite - movimentacaoDebito[x];
				}
				
			}
		}
			System.out.println("\nTRANSA��ES D�BITO");	
			
			for (x=0; x<mov; x++) 
			{				
				System.out.printf("\nR$ %.2f", movimentacaoDebito[x]);
			}
			
			System.out.println("\n\nTRANSA��ES CR�DITO");	
			
			for (x=0; x<mov; x++) 
			{				
				System.out.printf("\nR$ %.2f", movimentacaoCredito[x]);
			}
			
				if (saldoLimite > 500)
				{
					saldo = saldoLimite-500;
					limite = 500;
				}
				
				if (saldoLimite <= 500)
				{
					saldo = 0;
					limite = saldoLimite;
				}
					
				System.out.printf("\n\nRESTANTE SALDO: R$ %.2f\n",saldo);
				System.out.printf("\n\nRESTANTE LIMITE: R$ %.2f\n",limite);
				System.out.printf("\n\nRESTANTE SALDO + LIMITE: R$ %.2f\n",saldoLimite);
		}
		
	}

}
