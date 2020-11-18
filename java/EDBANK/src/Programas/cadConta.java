package Programas;

import java.util.Scanner;

import Classes.ContaCorrente;
import Classes.ContaEspecial;
import Classes.ContaPoupanca;

public class cadConta 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
				
		char opcao;
		char emitir;
		double valor;
		int tipoConta;
		int dataAniversario;
		String cpf;
		int numero;
		
		
		System.out.println("INSIRA NUMERO DA CONTA?");
		numero = leia.nextInt();		

		leia.nextLine();
		System.out.println("INSIRA SEU CPF ?");
		cpf = leia.nextLine();		
		
		System.out.println("POR FAVOR, INSIRA O CODIGO DA CONTA DESEJADA:\n1 - CONTA POUPANÇA \n2 - CONTA CORRENTE \n3 - CONTA ESPECIAL \n4 - CONTA EMPRESARIAL");
		tipoConta = leia.nextInt();
			
			if (tipoConta == 1)
			{	
				ContaPoupanca pp1 = new ContaPoupanca (numero, cpf, 15);
				System.out.println("\n________CONTA POUPANÇA_______");
				System.out.println("NUMERO DA CONTA: "+pp1.getNumero());
				System.out.println("SALDO DA CONTA: R$ "+pp1.getSaldo());
				System.out.println("CPF: "+pp1.getCpf_cnpj());
				System.out.println("QUAL A SUA DATA DE ANIVERSARIO ?");
				dataAniversario = leia.nextInt();
			
				for (int x = 0; x<5; x++)
				{
					System.out.println("\nSALDO: R$ "+pp1.getSaldo());
					System.out.print("\nINSIRA A "+(x+1)+"º MOVIMENTAÇÃO \n");
					System.out.print("\nVOCE DESEJA CREDITAR-(C) OU DEBITAR-(D) UM VALOR ?");
					opcao = leia.next().toUpperCase().charAt(0);
					
					if (opcao == 'C')
					{
						System.out.print("\nQUAL O VALOR PARA CRÉDITO ?");
						valor = leia.nextDouble();
						pp1.creditar(valor);
					}
					
				if (opcao == 'D')
				{
					if (pp1.getSaldo() <= 0)
					{
						System.out.println("\nCONTA SEM SALDO");
						x--;
			
					}						
					else 
					{
						System.out.println("QUAL O VALOR PARA DÉBITO ?");
						valor = leia.nextDouble();
								
						while (valor > pp1.getSaldo())
						{
							System.out.println("\nVALOR ACIMA DO SALDO, DIGITE NOVAMENTE");
							System.out.println("QUAL O VALOR PARA DÉBITO ?");
							valor = leia.nextDouble();
						}
						pp1.debitar(valor);
					}
				}
					
			}
				
				pp1.correcao(dataAniversario);
				
				System.out.println("SALDO DA CONTA: R$ "+pp1.getSaldo());
				System.out.println("\nTRANSAÇÃO FINALIZADA\n");
			}
			
			if (tipoConta == 2)
			{				
				ContaCorrente cc1 = new ContaCorrente (numero, cpf);
				System.out.println("________CONTA CORRENTE_______");
				System.out.println("DESEJA EMITIR TALAO S/N?");
				emitir = leia.next().toUpperCase().charAt(0);
				
				if (emitir == 'S')
				{
					System.out.println("DESEJA QUANTOS TALOES ?");
					dataAniversario = leia.nextInt();
					cc1.emitirTalao(dataAniversario);
				}
				
			
				for (int x = 0; x<5; x++)
				{
					
					System.out.println("VOCE DESEJA CREDITAR-(C) OU DEBITAR-(D) UM VALOR ?");
					opcao = leia.next().toUpperCase().charAt(0);
					
					if (opcao == 'C')
					{
						System.out.println("QUAL O VALOR PARA CRÉDITO ?");
						valor = leia.nextDouble();
						cc1.creditar(valor);
					}
					
					if (opcao == 'D')
					{
						if (cc1.getSaldo() <= 0)
						{
							System.out.println("\nCONTA SEM SALDO");
							x--;
						}
						else 
						{
							System.out.println("QUAL O VALOR PARA DÉBITO ?");
							valor = leia.nextDouble();
							
							while (valor > cc1.getSaldo())
							{
								System.out.println("\nVALOR ACIMA DO SALDO, DIGITE NOVAMENTE");
								System.out.println("QUAL O VALOR PARA DÉBITO ?");
								valor = leia.nextDouble();
							}
							cc1.debitar(valor);
						}
					}
				}
								
				System.out.println("SALDO DA CONTA: R$ "+cc1.getSaldo());
				System.out.println("\nTRANSAÇÃO FINALIZADA\n");
			}
			
			if (tipoConta == 3)
			{	

				ContaEspecial ce1 = new ContaEspecial (numero, cpf, 500.0);
				double saldoLimite = 0;
				saldoLimite = ce1.getSaldo() + ce1.getLimite();
				char liberaLimite;
				System.out.println("\n________CONTA ESPECIAL_______");
				System.out.println("NUMERO DA CONTA: "+ce1.getNumero());
				System.out.println("SALDO DA CONTA: R$ "+ce1.getSaldo());
				System.out.println("SALDO DO LIMITE R$ "+ce1.getLimite());
				System.out.println("CPF: "+ce1.getCpf_cnpj());
				
				for (int x = 0; x<5; x++)
				{
					System.out.println("\nSALDO: R$ "+ce1.getSaldo());
					System.out.println("SALDO DO LIMITE R$ "+ce1.getLimite());
					System.out.print("\nINSIRA A "+(x+1)+"º MOVIMENTAÇÃO \n");
					System.out.print("\nVOCE DESEJA CREDITAR-(C) OU DEBITAR-(D) UM VALOR ?");
					opcao = leia.next().toUpperCase().charAt(0);
					
					if (opcao == 'C')
					{
						if (ce1.getLimite() < 500)
						{
							System.out.print("\nQUAL O VALOR PARA CRÉDITO ?");
							valor = leia.nextDouble();
							ce1.creditar(valor);
							ce1.reporLimite(valor);
						}
						else 
						{
							System.out.print("\nQUAL O VALOR PARA CRÉDITO ?");
							valor = leia.nextDouble();
							ce1.creditar(valor);
						}	
					}
					
					
					if (opcao == 'D')
					{
						System.out.print("\nQUAL O VALOR PARA DEBITO ? ");
						valor = leia.nextDouble();
						
						if ((saldoLimite - valor) < 500 && ( saldoLimite - valor) >=0 )
						{
							System.out.print("\n\nVALOR NEGATIVO - LIBERA O USO DO LIMITE ? S/N - ");
							liberaLimite = leia.next().toUpperCase().charAt(0);
							
							if (liberaLimite == 'S')
							{
									
								ce1.usarLimite(valor);
								ce1.debitar(valor*2);
															
							}
							
							if (liberaLimite == 'N')
							{
								System.out.print("\n\nSALDO INSUFICIENTE\n");
								System.out.print("\nREPITA A TRANSAÇÃO\n\n");
								x--;
							}
							
						}
						
						else if ((saldoLimite - valor) < 0 )
							
						{
							System.out.print("\nSALDO INSUFICIENTE\n");
							x --;
						}
						
						else 
						{
							saldoLimite = saldoLimite - valor;
						}						
						
					}
				}
				
				System.out.println("SALDO DA CONTA: R$ "+ce1.getSaldo());
				System.out.println("SALDO DO LIMITE R$ "+ce1.getLimite());
				System.out.println("\nTRANSAÇÃO FINALIZADA\n");
				
					
			}
					
	}

}
