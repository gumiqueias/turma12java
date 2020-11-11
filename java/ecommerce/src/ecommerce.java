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
		
		//PRODUTOS DA NOSSA LOJA
		String produtos[] = {"Calça","Short","Camisa","Vestido","Camiseta","Babylook","Saia","Bermuda","Touca","Cinto"};
		
		//CARACTER COM INTERACAO DO USUARIO
		String compras[] = new String [minimo];
		char  notaFiscal,  confirmacao, novoUser;
		String  pag;
		boolean user = true;

		// CODIGO DOS PRODUTOS
		
		while (user==true)
		{
			System.out.println("\n---------LOJAS LUIS VINTÃO-----------\n");
			System.out.println("\nPRODUTOS:\t"+"VALOR:\t\t"+ "ESTOQUE:\n");
			
			for (x = 0; x<10; x++)
			{
				System.out.println("------------------------------------------------\n");
				System.out.println(codigo[x]+" - "+produtos[x]+"\tR$"+valor[x]+"\t\t"+estoque[x]+" und.\t|"+"\n");
			}
			
			System.out.println("Por favor, digite o código do produto que deseja: ");
			
			for (x = 0; x<10; x++)
			{
				codigo [x] = ler.nextInt();
				
				if (codigo[x] == 1)
				{
					estoque[0] = estoque[0] -1;
					compras[x] = produtos[0];
					valorCompras[x] = valor[0];
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
					estoque[1] = estoque[1] -1;
					compras[x] = produtos[1];
					valorCompras[x] = valor[1];
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
					estoque[2] = estoque[2] -1;
					compras[x] = produtos[2];
					valorCompras[x] = valor[2];
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
					estoque[3] = estoque[3] -1;
					compras[x] = produtos[3];
					valorCompras[x] = valor[3];
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
					estoque[4] = estoque[4] -1;
					compras[x] = produtos[4];
					valorCompras[x] = valor[4];
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
					estoque[5] = estoque[5] -1;
					compras[x] = produtos[5];
					valorCompras[x] = valor[5];
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
					estoque[6] = estoque[6] -1;
					compras[x] = produtos[6];
					valorCompras[x] = valor[6];
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
					estoque[7] = estoque[7] -1;
					compras[x] = produtos[7];
					valorCompras[x] = valor[7];
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
					estoque[8] = estoque[8] -1;
					compras[x] = produtos[8];
					valorCompras[x] = valor[8];
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
					estoque[9] = estoque[9] -1;
					compras[x] = produtos[9];
					valorCompras[x] = valor[9];
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
			}
			
				System.out.println("\nCarrinho de compras:\n");
				System.out.println("PRODUTOS:\t"+"VALOR:\n");
				
				for (x = 0; x < minimo; x++ )
				{
					valorTotal = valorTotal + valorCompras[x];
					System.out.println("------------------------------------------------\n");
					System.out.println((x + 1)+" - "+compras[x]+"\t"+"R$ "+ valorCompras[x]+"\n");
					
				}
				
				imp = (valorTotal*0.09);
		        System.out.println("Valor total do carrinho: R$"+ valorTotal + "\n");
		        System.out.println("\n\n--------------FORMA DE PAGAMENNTO---------------\n\n");
		        
		        System.out.println("\nInsira 'A' dinheiro ou cheque ou 'C' para cartão de crédito: ");
		        pag = ler.next();
		        
		        if (pag .equals("A")  || pag .equals("a"))
		        {
		            valorAtualizado = valorTotal * 0.20;
		            valorTotal = valorTotal - valorAtualizado;
		        }
		        if (pag .equals("C")  || pag .equals("c"))
		        {

		        	 System.out.println("\nEm 1, 2 ou 3 vezes: "); 
			          parc = ler.nextInt();
			            
			          if (parc == 1)
			          {			        	  
			        	  valorAtualizado = valorTotal * 0.15;
			        	  valorTotal = valorTotal - valorAtualizado;		            
			          }
			          		       
		            if (parc == 2)
		            {	
		                vezes = 1;   
		            }
		            
		            else if (parc == 3)
		            {
		                vezes = 2;
		                
		                valorAtualizado = (valorTotal*0.10);
		                valorTotal = valorTotal + valorAtualizado;
		            }
		    
		        }
		        
		        System.out.println("\nDeseja a impressão da nota fiscal - S/N ?");
				notaFiscal = ler.next().charAt(0);
		        
		       
		        if (notaFiscal == 'S' || notaFiscal == 's')
				{
					System.out.println("\n---------NOTA FISCAL-----------\n");
					System.out.println("\n---------LOJAS LUIS VINTÃO-----------\n");
					
					for(x = 0; x < minimo; x++ )
					{
					System.out.println("------------------------------------------------\n\n");
					System.out.printf((x + 1) +" - "+compras[x]+"\t"+"R$ "+ valorCompras[x]+"\n");				
					}
					
					System.out.printf("\n\n---------IMPOSTOS A SEREM PAGOS R$ %.2f-----------",imp,"\n\n");			
					
					if (vezes == 1)
					{ 
						System.out.print("\n\n---------TOTAL A SER PAGO = R$ " + valorTotal + " -----------\n");
						valorTotal = (valorTotal / 2);
						System.out.printf("\n---------PARCELADO EM 2X DE R$ %.2f -------------- " ,valorTotal);
					}
					else if (vezes == 2)
					{ 
						System.out.print("\n\n---------TOTAL A SER PAGO = R$ " + valorTotal + " -----------\n");
						valorTotal = (valorTotal / 3);
						System.out.printf("\n---------PARCELADO EM 3X DE R$ %.2f -------------" ,valorTotal);
					}
					else
					{
						System.out.print("\n\n\n---------TOTAL A SER PAGO = R$ " + valorTotal + " -----------\n");
					}
					System.out.print("\n\n---------OBRIGADO E VOLTE SEMPRE -----------\n");
					
				} else {
					
					System.out.print("\n\n---------OBRIGADO E VOLTE SEMPRE -----------\n\n");
				}
				System.out.print("\n\nDeseja continuar com novas compras ? (S/N)\n" );
				novoUser = ler.next().charAt(0);
				
				if (novoUser == 'S' || novoUser== 's') {
					user = true;
				} else {
					user = false;	
				}
		}
		
	}

}