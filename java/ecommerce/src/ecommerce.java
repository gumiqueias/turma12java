import java.util.Scanner;

public class ecommerce {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		final int minimo = 10;
		int x = 0;
		int estoque[] = {10,10,10,10,10,10,10,10,10,10};
		
		//CODIGOS E VALOR DOS PRODUTOS
		double valor[] = {40.00, 30.00, 20.00, 30.00, 30.00, 25.00, 20.00, 20.00, 10.00, 10.00};
		
		int codigo[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int vezes = 0, parc = 0;
		double valorCompras[] = new double[minimo];
		double valorTotal = 0.0;
		double imp = 0.0;
		double valorAtualizado = 0.0;
		int quantidade[] = new int[minimo];
		
		//PRODUTOS DA NOSSA LOJA
		String produtos[] = {"Cal�a","Short","Camisa","Vestido","Camiseta","Babylook","Saia","Bermuda","Touca","Cinto"};
		
		//CARACTER COM INTERACAO DO USUARIO
		String compras[] = new String [minimo];
		char  notaFiscal,  confirmacao, novoUser;
		char  pag;
		boolean user = true;

		// CODIGO DOS PRODUTOS
		
		while (user==true)
		{
			System.out.println("\n---------LOJAS LUIS VINT�O-----------\n");
			System.out.println("\nPRODUTOS:\t"+"VALOR:\t\t"+ "ESTOQUE:\n");
			
			for (x = 0; x<10; x++)
			{
				System.out.println("------------------------------------------------\n");
				System.out.println(codigo[x]+" - "+produtos[x]+"\tR$"+valor[x]+"\t\t"+estoque[x]+" und.\t|"+"\n\n");
			}
			
			System.out.println("Por favor, digite o c�digo do produto que deseja: ");
			
			for (x = 0; x<10; x++)
			{
				codigo [x] = ler.nextInt();
				
				if (codigo[x] == 1)
				{
					System.out.println("Quantas unidades do produto ?");
					quantidade[0] = ler.nextInt();
					estoque[0] = (estoque[0] - quantidade[0]);
					compras[x] = produtos[0];
					valorCompras[x] = valor[0];
					System.out.println("O produto "+"'"+produtos[0]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o c�digo do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
				
								
				if (codigo[x] == 2)
				{
					System.out.println("Quantas unidades do produto ?");
					quantidade[1] = ler.nextInt();
					estoque[1] = (estoque[1] - quantidade[1]);
					compras[x] = produtos[1];
					valorCompras[x] = valor[1];
					System.out.println("O produto "+"'"+produtos[1]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o c�digo do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
				
								
				if (codigo[x] == 3)
				{
					System.out.println("Quantas unidades do produto ?");
					quantidade[2] = ler.nextInt();
					estoque[2] = (estoque[2] - quantidade[2]);
					compras[x] = produtos[2];
					valorCompras[x] = valor[2];
					System.out.println("O produto "+"'"+produtos[2]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o c�digo do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
				
								
				if (codigo[x] == 4)
				{
					System.out.println("Quantas unidades do produto ?");
					quantidade[3] = ler.nextInt();
					estoque[3] = (estoque[3] - quantidade[3]);
					compras[x] = produtos[3];
					valorCompras[x] = valor[3];
					System.out.println("O produto "+"'"+produtos[3]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o c�digo do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
												
				if (codigo[x] == 5)
				{
					System.out.println("Quantas unidades do produto ?");
					quantidade[4] = ler.nextInt();
					estoque[4] = (estoque[4] - quantidade[4]);
					compras[x] = produtos[4];
					valorCompras[x] = valor[4];
					System.out.println("O produto "+"'"+produtos[4]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o c�digo do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
											
				if (codigo[x] == 6)
				{
					System.out.println("Quantas unidades do produto ?");
					quantidade[5] = ler.nextInt();
					estoque[5] = (estoque[5] - quantidade[5]);
					compras[x] = produtos[5];
					valorCompras[x] = valor[5];
					System.out.println("O produto "+"'"+produtos[5]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o c�digo do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
												
				if (codigo[x] == 7)
				{
					System.out.println("Quantas unidades do produto ?");
					quantidade[6] = ler.nextInt();
					estoque[6] = (estoque[6] - quantidade[6]);
					compras[x] = produtos[6];
					valorCompras[x] = valor[6];
					System.out.println("O produto "+"'"+produtos[6]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o c�digo do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
												
				if (codigo[x] == 8)
				{
					System.out.println("Quantas unidades do produto ?");
					quantidade[7] = ler.nextInt();
					estoque[7] = (estoque[7] - quantidade[7]);
					compras[x] = produtos[7];
					valorCompras[x] = valor[7];
					System.out.println("O produto "+"'"+produtos[7]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o c�digo do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
												
				if (codigo[x] == 9)
				{
					System.out.println("Quantas unidades do produto ?");
					quantidade[8] = ler.nextInt();
					estoque[8] = (estoque[8] - quantidade[8]);
					compras[x] = produtos[8];
					valorCompras[x] = valor[8];
					System.out.println("O produto "+"'"+produtos[8]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o c�digo do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
				
				if (codigo[x] == 10)
				{
					System.out.println("Quantas unidades do produto ?");
					quantidade[9] = ler.nextInt();
					estoque[9] = (estoque[9] - quantidade[9]);
					compras[x] = produtos[9];
					valorCompras[x] = valor[9];
					System.out.println("O produto "+"'"+produtos[9]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o c�digo do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
				
				if(estoque[x] == 0) {
					System.out.println("\nProduto fora de estoque.");
				}
																			
			}
			
				System.out.println("\n--------------CARRINHO DE COMPRAS---------------:\n");
				System.out.println("PRODUTOS:\t"+"VALOR:\n");
				
				for (x = 0; x < minimo; x++ )
				{
					valorTotal = valorTotal + valorCompras[x];
					
					if ((compras[x] != null) || (valorCompras[x] > 0.0)) 
					{
										
					System.out.println((x + 1)+" - "+compras[x]+"\t"+"R$ "+ valorCompras[x]+"\n");
					System.out.println("------------------------------------------------");
					
					}
				}
				
				imp = (valorTotal*0.09);
		        System.out.printf("\n\nValor total do carrinho: R$ %.2f\n", valorTotal);
		        
		        System.out.println("\n\n--------------FORMA DE PAGAMENNTO----------------\n\n");
		        
		        System.out.println("\nInsira 'D' dinheiro ou cheque ou 'C' para cart�o de cr�dito: ");
		        pag = ler.next().toUpperCase().charAt(0);
		        
		        if (pag =='D')
		        {
		            valorAtualizado = valorTotal * 0.20;
		            valorTotal = valorTotal - valorAtualizado;
		        }
		        if (pag == 'C')
		        {

		        	 System.out.println("\nEm 1, 2 ou 3 vezes: "); 
			          parc = ler.nextInt();
			            
			        if (parc == 1)
			        {			        	  
			        	  valorAtualizado = valorTotal * 0.15;
			        	  valorTotal = valorTotal - valorAtualizado;		            
			        }
			          		       
			        else if (parc == 2)
		            {	
		                vezes = 1;   
		            }
		            
		            else if (parc == 3)
		            {
		                vezes = 2;
		                
		                valorAtualizado = (valorTotal*0.10);
		                valorTotal = valorTotal + valorAtualizado;
		            }
			        
		            else 
		            {
		            	 System.out.println("\nSELE��O INCORRETA\n");
		            	 System.out.println("\nEm 1, 2 ou 3 vezes: "); 
				         parc = ler.nextInt();
		            }
		    
		        }
		        
		        System.out.println("\nDeseja a impress�o da nota fiscal - S/N ?");
				notaFiscal = ler.next().toUpperCase().charAt(0);
		        
		       
		        if (notaFiscal == 'S')
				{
					System.out.println("\n\n\n\n\n---------------NOTA FISCAL-------------------\n");
					System.out.println("\n--------------LOJAS LUIS VINT�O--------------\n");
					
					for(x = 0; x < minimo; x++ )
					{
						if ((compras[x] != null) || (valorCompras[x] > 0.0)) 
						{							
							System.out.println("------------------------------------------------\n\n");
							System.out.printf((x + 1) +" - "+compras[x]+"\t"+"R$ "+ valorCompras[x]+"\n");
						
						}
						
									
					}
					
					System.out.printf("\n\n-------------IMPOSTOS A SEREM PAGOS R$ %.2f-------------",imp,"\n\n");			
					
					if (vezes == 1)
					{ 
						System.out.print("\n\n-----------TOTAL A SER PAGO = R$ " + valorTotal + " --------------\n");
						valorTotal = (valorTotal / 2);
						System.out.printf("\n------------PARCELADO EM 2X DE R$ %.2f -------------- " ,valorTotal);
					}
					else if (vezes == 2)
					{ 
						System.out.print("\n\n---------TOTAL A SER PAGO = R$ " + valorTotal + " -----------\n");
						valorTotal = (valorTotal / 3);
						System.out.printf("\n----------PARCELADO EM 3X DE R$ %.2f -------------" ,valorTotal);
					}
					else
					{
						System.out.print("\n\n\n---------TOTAL A SER PAGO = R$ " + valorTotal + " -----------\n");
					}
					System.out.print("\n\n----------------OBRIGADO E VOLTE SEMPRE -----------\n");
					
				} 
				System.out.print("\n\nDeseja continuar com novas compras ? (S/N)\n" );
				novoUser = ler.next().charAt(0);
				
				if (novoUser == 'S' || novoUser== 's') {
					user = true;
					valorTotal = 0.0;
				} 
				else 
				{
					user = false;	
					System.out.print("\n\n---------OBRIGADO E VOLTE SEMPRE -----------\n");
				}
		}
		
	}

}