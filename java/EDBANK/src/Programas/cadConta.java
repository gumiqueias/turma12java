package Programas;

import java.util.Scanner;

import Classes.ContaCorrente;
import Classes.ContaEmpresa;
import Classes.ContaEspecial;
import Classes.ContaPoupanca;

public class cadConta 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
				
		char opcao;	
		double valor;
		int tipoConta;	
		String cpf;
		int numero;
		boolean user = true;
		char continua;
		
	while (user == true)
	{
		System.out.println("INSIRA NUMERO DA CONTA: ");
		numero = leia.nextInt();		

		leia.nextLine();
		System.out.println("INSIRA SEU CPF / CNPJ: ");
		cpf = leia.nextLine();		
		
		System.out.println("POR FAVOR, INSIRA O CODIGO DA CONTA DESEJADA:\n1 - CONTA POUPANÇA \n2 - CONTA CORRENTE \n3 - CONTA ESPECIAL \n4 - CONTA EMPRESARIAL");
		tipoConta = leia.nextInt();
			
			if (tipoConta == 1)
			{	
				ContaPoupanca pp1 = new ContaPoupanca (numero, cpf, 15);
				int dataAniversario;
				System.out.print("\n________CONTA POUPANÇA_______");
				System.out.print("\nNUMERO DA CONTA: "+pp1.getNumero());
				System.out.printf("\nSALDO DA CONTA: R$ %.2f",pp1.getSaldo());
				System.out.print("\nCPF: "+pp1.getCpf_cnpj());
				System.out.print("\nQUAL A SUA DATA DE ANIVERSARIO ?");
				dataAniversario = leia.nextInt();
			
				for (int x = 0; x<5; x++)
				{
					System.out.printf("\nSALDO: R$ %.2f",pp1.getSaldo(),"\n");
					System.out.print("\n\nINSIRA A "+(x+1)+"º MOVIMENTAÇÃO ");
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
						System.out.println("\nQUAL O VALOR PARA DÉBITO ?");
						valor = leia.nextDouble();
								
						while (valor > pp1.getSaldo())
						{
							System.out.println("\nVALOR ACIMA DO SALDO, DIGITE NOVAMENTE");
							System.out.println("\nQUAL O VALOR PARA DÉBITO ?");
							valor = leia.nextDouble();
						}
						pp1.debitar(valor);
					}
				}
					
			}
				
				pp1.correcao(dataAniversario);
				
				System.out.printf("\nSALDO DA CONTA: R$ %.2f",pp1.getSaldo(),"\n");
				System.out.println("\nTRANSAÇÃO FINALIZADA\n");
			}
			
			if (tipoConta == 2)
			{				
				ContaCorrente cc1 = new ContaCorrente (numero, cpf);
				char emitir;
				int dataAniversario;
				System.out.println("________CONTA CORRENTE_______");
				System.out.println("\nNUMERO DA CONTA: "+cc1.getNumero());
				System.out.printf("\nSALDO DA CONTA: R$ %.2f",cc1.getSaldo());
				System.out.println("\nCPF: "+cc1.getCpf_cnpj());
				System.out.println("\n\nDESEJA EMITIR TALAO S/N?");
				emitir = leia.next().toUpperCase().charAt(0);
				
				if (emitir == 'S')
				{
					System.out.println("\nDESEJA QUANTOS TALOES ?");
					dataAniversario = leia.nextInt();
					cc1.emitirTalao(dataAniversario);
					for (int x = 0; x < dataAniversario; x++)
					{
						System.out.println("\nTALÃO Nº "+(x+1)+"\n");
					}
				}
				
			
				for (int x = 0; x<5; x++)
				{
					
					System.out.printf("\nSALDO R$ %.2f",cc1.getSaldo(),"\n");
					System.out.print("\n\nINSIRA A "+(x+1)+"º MOVIMENTAÇÃO \n");
					System.out.print("\nVOCE DESEJA CREDITAR-(C) OU DEBITAR-(D) UM VALOR ?");
					opcao = leia.next().toUpperCase().charAt(0);
					
					if (opcao == 'C')
					{
						System.out.println("\nQUAL O VALOR PARA CRÉDITO ?");
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
							System.out.println("\nQUAL O VALOR PARA DÉBITO ?");
							valor = leia.nextDouble();
							
							while (valor > cc1.getSaldo())
							{
								System.out.println("\nVALOR ACIMA DO SALDO, DIGITE NOVAMENTE");
								System.out.println("\nQUAL O VALOR PARA DÉBITO ?");
								valor = leia.nextDouble();
							}
							cc1.debitar(valor);
						}
					}
				}
								
				System.out.printf("\nSALDO DA CONTA: R$ %.2f",cc1.getSaldo());
				System.out.println("\nTRANSAÇÃO FINALIZADA\n");
			}
			
			if (tipoConta == 3)
			{	
				ContaEspecial ce1 = new ContaEspecial (numero, cpf, 500.0);
				double saldoLimite = 0;
				saldoLimite = ce1.getSaldo() + ce1.getLimite();
				char liberaLimite;
				System.out.print("\n________CONTA ESPECIAL_______");
				System.out.print("\nNUMERO DA CONTA: "+ce1.getNumero());
				System.out.printf("\nSALDO DA CONTA: R$ %.2f",ce1.getSaldo());
				System.out.printf("\nSALDO DO LIMITE R$ %.2f",ce1.getLimite());
				System.out.println("\nCPF: "+ce1.getCpf_cnpj());
				
				for (int x = 0; x<5; x++)
				{
					System.out.printf("\nSALDO R$ %.2f",ce1.getSaldo(),"\n");
					System.out.printf("\nSALDO DO LIMITE R$ %.2f",ce1.getLimite());
					System.out.print("\n\nINSIRA A "+(x+1)+"º MOVIMENTAÇÃO \n");
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
				
				System.out.printf("\nSALDO DA CONTA: R$ %.2f",ce1.getSaldo());
				System.out.printf("\nSALDO DO LIMITE R$ %.2f",ce1.getLimite());
				System.out.println("\nTRANSAÇÃO FINALIZADA\n");				
			}
			
			if (tipoConta == 4)
			{	
				ContaEmpresa cem1 = new ContaEmpresa (numero, cpf,10000.0);
				char deseja;
				double valorEmp;
				System.out.print("\n________CONTA EMPRESARIAL_______");
				System.out.print("\nNUMERO DA CONTA: "+cem1.getNumero());
				System.out.printf("\nSALDO DA CONTA: R$ %.2f",cem1.getSaldo());
				System.out.print("\nCNPJ: "+cem1.getCpf_cnpj());
				System.out.printf("\nPARABÉNS, SUA EMPRESA TEM UM LIMITE PRÉ-APROVADO DE R$ %.2f PARA EMPRESTIMO !\n",cem1.getEmprestimo());
				System.out.print("\nDESEJA REALIZAR UM EMPRESTIMO ? S/N");
				deseja = leia.next().toUpperCase().charAt(0);
				
				if (deseja == 'S')
				{
					System.out.print("\nQUAL VALOR ? R$ ");
					valorEmp = leia.nextDouble();
					cem1.pedirEmprestimo(valorEmp);
					System.out.printf("\nSALDO DA CONTA: R$ %.2f",cem1.getSaldo());										
				}
				
				else 
				{
					System.out.println("\nOK, OBRIGADO !!");
				}
				
			
				for (int x = 0; x<5; x++)
				{
					System.out.printf("\nSALDO: R$ %.2f",cem1.getSaldo(),"\n");
					System.out.print("\nINSIRA A "+(x+1)+"º MOVIMENTAÇÃO \n");
					System.out.print("\nVOCE DESEJA CREDITAR-(C) OU DEBITAR-(D) UM VALOR ?");
					opcao = leia.next().toUpperCase().charAt(0);
					
					if (opcao == 'C')
					{
						System.out.print("\nQUAL O VALOR PARA CRÉDITO ?");
						valor = leia.nextDouble();
						cem1.creditar(valor);
					}
					
				if (opcao == 'D')
				{
					if (cem1.getSaldo() <= 0)
					{
						System.out.println("\nCONTA SEM SALDO");
						x--;
			
					}						
					else 
					{
						System.out.println("QUAL O VALOR PARA DÉBITO ?");
						valor = leia.nextDouble();
								
						while (valor > cem1.getSaldo())
						{
							System.out.println("\nVALOR ACIMA DO SALDO, DIGITE NOVAMENTE");
							System.out.println("QUAL O VALOR PARA DÉBITO ?");
							valor = leia.nextDouble();
						}
						cem1.debitar(valor);
					}
				}
					
			}
								
				System.out.printf("\nSALDO DA CONTA: R$ %.2f",cem1.getSaldo());
				System.out.println("\nTRANSAÇÃO FINALIZADA\n");
			}
			
			System.out.println("\nDESEJA CONTINUAR COM OUTRO USUÁRIO S/N ?");
			continua = leia.next().toUpperCase().charAt(0);
			
			if (continua == 'S')
			{
				user = true;
			}
			else 
			{
				user = false;
				
				System.out.println("\nPROGRAMA FINALIZADO");
			}
	}			
}

}
