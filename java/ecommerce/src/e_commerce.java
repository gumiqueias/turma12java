import java.util.Scanner;

public class e_commerce {

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
		int totalQuantidade[] = new int[minimo];
		
		//PRODUTOS DA NOSSA LOJA
		String produtos[] = {"Calça","Short","Camisa","Vestido","Camiseta","Babylook","Saia","Bermuda","Touca","Cinto"};
		
		//CARACTER COM INTERACAO DO USUARIO
		String compras[] = new String [minimo];
		char  notaFiscal,  confirmacao, novoUser;
		char  pag;
		boolean user = true;

		// CODIGO DOS PRODUTOS
		
		while (user==true)
		{
			System.out.println("\n---------------LOJAS LUIS VINTÃO--------------\n");
			System.out.println("\nPRODUTOS:\t"+"VALOR:\t\t"+ "ESTOQUE:\n");
			
			for (x = 0; x<10; x++)
			{
				
				System.out.println(codigo[x]+" - "+produtos[x]+"\tR$"+valor[x]+"\t\t"+estoque[x]+" und.\t|"+"\n");
			}
			System.out.println("------------------------------------------------\n");
			System.out.print("Por favor, digite o código do produto que deseja: ");
			
			for (x = 0; x<10; x++)
			{
				codigo [x] = ler.nextInt();
				
				if (codigo[x] == 1)
				{	
					System.out.print("Quantas unidades do produto "+produtos[0]+" :");
					quantidade[x] = ler.nextInt();
					
					if ((estoque[0] - quantidade[0]) < 0) 
					{
						System.out.println("\nQUANTIDADE FORA DE ESTOQUE !! ");
						System.out.print("Quantas unidades do produto "+produtos[0]+" :");
						quantidade[x] = ler.nextInt();

					}
					else 
					{
						estoque[0] = (estoque[0] - quantidade[0]);
						compras[0] = produtos[0];
						totalQuantidade[0] = totalQuantidade[0] + quantidade[0];
						valorCompras[0] = (valor[0] * quantidade[0]);
					}
					
					System.out.println("O produto "+"'"+produtos[0]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o código do produto que deseja: ");						
					}
					else
					{
						break;
					}
					
				}
				
				if (codigo[x] == 2)
				{					
					System.out.print("Quantas unidades do produto "+produtos[1]+" :");
					quantidade[1] = ler.nextInt();
					
					if ((estoque[1] - quantidade[1]) < 0) 
					{
						System.out.println("\nQUANTIDADE FORA DE ESTOQUE !! ");
						System.out.print("Quantas unidades do produto "+produtos[1]+" :");
						quantidade[x] = ler.nextInt();

					}
					else 
					{
					estoque[1] = (estoque[1] - quantidade[1]);
					compras[1] = produtos[1];
					totalQuantidade[1] = totalQuantidade[1] + quantidade[1];;
					valorCompras[1] = (valor[1] * quantidade[1]);
					}
					
					System.out.println("O produto "+"'"+produtos[1]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o código do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
				
				if (codigo[x] == 3)
				{
					System.out.print("Quantas unidades do produto "+produtos[2]+" :");
					quantidade[2] = ler.nextInt();
					
					if ((estoque[2] - quantidade[2]) < 0) 
					{
						System.out.println("\nQUANTIDADE FORA DE ESTOQUE !! ");
						System.out.print("Quantas unidades do produto "+produtos[2]+" :");
						quantidade[x] = ler.nextInt();

					}
					else 
					{
						estoque[2] = (estoque[2] - quantidade[2]);
						compras[2] = produtos[2];
						totalQuantidade[2] = totalQuantidade[2] + quantidade[2];
						valorCompras[2] = (valor[2] * quantidade[2]);
					}
					
					System.out.println("O produto "+"'"+produtos[2]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o código do produto que deseja: ");						
					}
					else 
					{
						break;
					}
				}
				
				if (codigo[x] == 4)
				{
					System.out.print("Quantas unidades do produto "+produtos[3]+" :");
					quantidade[3] = ler.nextInt();
					
					if ((estoque[3] - quantidade[3]) < 0) 
					{
						System.out.println("\nQUANTIDADE FORA DE ESTOQUE !! ");
						System.out.print("Quantas unidades do produto "+produtos[3]+" :");
						quantidade[x] = ler.nextInt();

					}
					else 
					{
						estoque[3] = (estoque[3] - quantidade[3]);
						compras[3] = produtos[3];
						totalQuantidade[3] = totalQuantidade[3] + quantidade[3];
						valorCompras[3] = (valor[3] * quantidade[3]);
					}
					
					System.out.println("O produto "+"'"+produtos[3]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o código do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
				
				if (codigo[x] == 5)
				{
					System.out.print("Quantas unidades do produto "+produtos[4]+" :");
					quantidade[4] = ler.nextInt();
					
					if ((estoque[4] - quantidade[4]) < 0) 
					{
						System.out.println("\nQUANTIDADE FORA DE ESTOQUE !! ");
						System.out.print("Quantas unidades do produto "+produtos[4]+" :");
						quantidade[x] = ler.nextInt();

					}
					else 
					{
						estoque[4] = (estoque[4] - quantidade[4]);
						compras[4] = produtos[4];
						totalQuantidade[4] = totalQuantidade[4] + quantidade[4];
						valorCompras[4] = (valor[4] * quantidade[4]);
					}
					
					System.out.println("O produto "+"'"+produtos[4]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o código do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
				
				if (codigo[x] == 6)
				{
					System.out.print("Quantas unidades do produto "+produtos[5]+" :");
					quantidade[5] = ler.nextInt();
					
					if ((estoque[5] - quantidade[5]) < 0) 
					{
						System.out.println("\nQUANTIDADE FORA DE ESTOQUE !! ");
						System.out.print("Quantas unidades do produto "+produtos[5]+" :");
						quantidade[x] = ler.nextInt();

					}
					else 
					{
						estoque[5] = (estoque[5] - quantidade[5]);
						compras[5] = produtos[5];
						totalQuantidade[5] = totalQuantidade[5] + quantidade[5];
						valorCompras[5] = (valor[5] * quantidade[5]);
					}
					
					System.out.println("O produto "+"'"+produtos[5]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o código do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
				
				if (codigo[x] == 7)
				{
					System.out.print("Quantas unidades do produto "+produtos[6]+" :");
					quantidade[6] = ler.nextInt();
					
					if ((estoque[6] - quantidade[6]) < 0) 
					{
						System.out.println("\nQUANTIDADE FORA DE ESTOQUE !! ");
						System.out.print("Quantas unidades do produto "+produtos[6]+" :");
						quantidade[x] = ler.nextInt();

					}
					else 
					{											
						estoque[6] = (estoque[6] - quantidade[6]);
						compras[6] = produtos[6];
						totalQuantidade[6] = totalQuantidade[6] + quantidade[6];
						valorCompras[6] = (valor[6] * quantidade[6]);
					}
					System.out.println("O produto "+"'"+produtos[6]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o código do produto que deseja: ");						
					}
					else 
					{
						break;
					}
				}
				
				if (codigo[x] == 8)
				{
					System.out.print("Quantas unidades do produto "+produtos[7]+" :");
					quantidade[7] = ler.nextInt();
					
					if ((estoque[7] - quantidade[7]) < 0) 
					{
						System.out.println("\nQUANTIDADE FORA DE ESTOQUE !! ");
						System.out.print("Quantas unidades do produto "+produtos[7]+" :");
						quantidade[x] = ler.nextInt();
					}
					else 
					{
						estoque[7] = (estoque[7] - quantidade[7]);
						compras[7] = produtos[7];
						totalQuantidade[7] = totalQuantidade[7] + quantidade[7];
						valorCompras[7] = (valor[7] * quantidade[7]);
					}
					System.out.println("O produto "+"'"+produtos[7]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o código do produto que deseja: ");						
					}
					else
					{
						break;
					}
				}
				
				if (codigo[x] == 9)
				{
					System.out.print("Quantas unidades do produto "+produtos[8]+" :");
					quantidade[8] = ler.nextInt();
					if ((estoque[8] - quantidade[8]) < 0) 
					{
						System.out.println("\nQUANTIDADE FORA DE ESTOQUE !! ");
						System.out.print("Quantas unidades do produto "+produtos[8]+" :");
						quantidade[x] = ler.nextInt();
					}	
					else
					{
						estoque[8] = (estoque[8] - quantidade[8]);
						compras[8] = produtos[8];
						totalQuantidade[8] = totalQuantidade[8] + quantidade[8];
						valorCompras[8] = (valor[8] * quantidade[8]);
					}
					System.out.println("O produto "+"'"+produtos[8]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o código do produto que deseja: ");						
					}
					else 
					{
						break;
					}
				}
				
				if (codigo[x] == 10)
				{
					System.out.print("Quantas unidades do produto "+produtos[9]+" :");
					quantidade[9] = ler.nextInt();
					
					if ((estoque[9] - quantidade[9]) < 0) 
					{
						System.out.println("\nQUANTIDADE FORA DE ESTOQUE !! ");
						System.out.print("Quantas unidades do produto "+produtos[9]+" :");
						quantidade[x] = ler.nextInt();
					}	
					else
					{
						estoque[9] = (estoque[9] - quantidade[9]);
						compras[9] = produtos[9];
						totalQuantidade[9] = totalQuantidade[9] + quantidade[9];
						valorCompras[9] = (valor[9] * quantidade[9]);
					}
					System.out.println("O produto "+"'"+produtos[9]+"'"+ " foi adicionado ao carrinho.\n");
					System.out.println("Deseja adicionar outros produtos ao carrinho ?(S/N)");
					confirmacao = ler.next().charAt(0);
					
					if (confirmacao == 'S' || confirmacao == 's')
					{
						System.out.println("Por favor, digite o código do produto que deseja: ");						
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
				System.out.println("PRODUTOS:\t"+"VALOR:\t\tQUANTIDADE:\n");
				
				for (x = 0; x < minimo; x++ )
				{
					valorTotal = valorTotal + valorCompras[x];
					
					if (compras[x] != null) 
					{
										
					System.out.println((x + 1)+" - "+compras[x]+"\t"+"R$ "+ valorCompras[x]+"\t\t"+totalQuantidade[x]+" - und.\n");
					
					}				
				}
				System.out.println("------------------------------------------------");
				imp = (valorTotal*0.09);
		        System.out.printf("\n\nValor total do carrinho: R$ %.2f\n", valorTotal);
		        
		        System.out.println("\n\n--------------FORMA DE PAGAMENNTO----------------\n\n");
		        
		        System.out.println("\nInsira 'D' dinheiro ou cheque ou 'C' para cartão de crédito: ");
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
		            	 System.out.println("\nSELEÇÃO INCORRETA\n");
		            	 System.out.println("\nEm 1, 2 ou 3 vezes: "); 
				         parc = ler.nextInt();
		            }
		    
		        }
		        
		        System.out.println("\nDeseja a impressão da nota fiscal - S/N ?");
				notaFiscal = ler.next().toUpperCase().charAt(0);
		        
		       
		        if (notaFiscal == 'S')
				{
					System.out.println("\n\n\n\n\n---------------NOTA FISCAL-------------------\n");
					System.out.println("\n--------------LOJAS LUIS VINTÃO--------------\n");
					
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