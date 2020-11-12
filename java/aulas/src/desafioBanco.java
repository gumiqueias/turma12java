import java.util.Scanner;

public class desafioBanco {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String tipoConta;
		String nc = "CE-1"; // numero conta
		double saldo = 0.0; // saldo
		double limite = 400.0; 
		final int mov = 10; // limite da movimentação
		String cpf = "000.000.000-00"; // cpf
		double movimentacao [] = new double [mov]; // vetor que guarda as movimentacoes
		int x; // contador vetor
		char tipo, liberaLimite; // tipo que usuario insere e o sistema lê
		int dataAniversario;
		int aniversario = 15;
		double saldoAt;
		
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
		
		if (tipoConta.equals("CP") || tipoConta.equals("cp") )
		{	
			System.out.println("------------------------------------");
			System.out.println("NUMERO CONTA: " + nc );
			System.out.printf("SALDO: R$ %.2f",saldo);
			System.out.println("\nCPF: " + cpf);
			System.out.println("\nANIVERSÁRIO DA CONTA DIA: "+aniversario);
			System.out.println("------------------------------------\n");
			
			System.out.print("\nQUAL A DATA DE HOJE?: ");
			dataAniversario = leia.nextInt();
			
		for (x=0; x<mov; x++)
		{
			System.out.print("\nINSIRA A "+(x+1)+"º MOVIMENTAÇÃO \n");
			System.out.print("\nCREDITO (C) OU DÉBITO (D) ? ");
			tipo = leia.next().charAt(0);
			
			if (tipo == 'C' || tipo == 'c')
			{
				System.out.print("\nINSIRA O VALOR DA TRANSAÇÃO: R$ ");
				movimentacao [x] = leia.nextDouble();
				saldo = saldo + movimentacao[x];							
				
			}
			
			if (tipo == 'D' || tipo == 'd')
			{
				System.out.print("\nINSIRA O VALOR DA TRANSAÇÃO: R$ ");
				movimentacao [x] = leia.nextDouble();
				saldo = saldo - movimentacao[x];
			}
			
		}
		
		if (dataAniversario == aniversario)
		{			
			saldoAt = saldo * 0.05;	
			saldo = saldoAt + saldo;
			
			for (x=0; x<mov; x++) 
			{				
				System.out.printf("\nR$ %.2f", movimentacao[x]);
			}
			
			System.out.println("\nPARABÉNS !!1");
			System.out.printf("\n\nRESTANTE SALDO: R$ %.2f",saldo);
		}
		else 
		{
			for (x=0; x<mov; x++) 
			{				
				System.out.printf("\nR$ %.2f", movimentacao[x]);
			}
			
			System.out.printf("\n\nRESTANTE SALDO: R$ %.2f",saldo);
		}
	
	}
}

}
