import java.util.Scanner;

public class desafioBanco {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String tipoConta;
		String nc = "CE-1";
		double saldo = 0.0, valorMov = 0.0;
		double limite = 400.0;
		final int mov = 2;
		String cpf = "478.475.228-33";
		double movimentacao [] = new double [10];
		int x;
		char tipo, liberaLimite;
		
		System.out.println("Insira o tipo de conta CP/CC/CE/CB:");		
		tipoConta = leia.nextLine();
				
		if (tipoConta.equals("CE") || tipoConta.equals("ce") )
		{	
			System.out.println("------------------------------------------------");
			System.out.println("NUMERO CONTA: " + nc );
			System.out.println("\nSALDO: R$ " + saldo);
			System.out.println("\nVALOR LIMITE: R$ " + limite);
			System.out.println("\nCPF: " + cpf);
			System.out.println("------------------------------------------------\n");
			
		}
		
		for (x=0; x<mov; x++)
		{
			System.out.print("\n\nINSIRA A "+(x+1)+"º MOVIMENTAÇÃO \n");
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

				if (saldo < 0.0)
				{
					System.out.print("\n\nVALOR NEGATIVO - LIBERA O USO DO LIMITE ? S/N - ");
					liberaLimite = leia.next().charAt(0);
					
					if (liberaLimite == 'S' || liberaLimite == 's')
					{
						limite = limite + saldo;
						
						if (limite <0)
						{
							limite = 0;
						}
						
						System.out.printf("\n\nRESTANTE LIMITE: R$ %.2f\n",limite);
					}
				}
			}
		}
			System.out.println("\nTRANSAÇÕES");	
			
			for (x=0; x<mov; x++) 
			{				
				System.out.printf("\nR$ %.2f", movimentacao[x]);
			}
						
				System.out.printf("\n\nSALDO RESTANTE NA CONTA - R$ "+saldo);
		
	}

}
