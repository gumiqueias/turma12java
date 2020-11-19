package luis_vintao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pagamento pagamento = new Pagamento();
		Cliente cliente1 = new Cliente();
		int codigoProduto; int quantidade; int qTotal = 0; char operacao; int vezes = 0; boolean novoCliente = true;
		List <String> carrinho = new ArrayList<>();
		List <Produto> produtosLista = new ArrayList<>();
		
		produtosLista.add(new Produto(40.0,"Calça", 1 ,10));
		produtosLista.add(new Produto(30.0,"Short",2,10));
		produtosLista.add(new Produto(20.0,"Camisa",3,10));
		produtosLista.add(new Produto(30.0,"Vestida",4,10));
		produtosLista.add(new Produto(25.0,"Camiseta",5,10));
		produtosLista.add(new Produto(20.0,"Babylook",6,10));
		produtosLista.add(new Produto(20.0, "Saia",7,10));
		produtosLista.add(new Produto(10.0,"Bermuda",8,10));
		produtosLista.add(new Produto(10.0,"Touca",9,10));
		produtosLista.add(new Produto(20.0, "Cinto",10,10));
		
		//----------------------------CLIENTE---------------------//
		
		while(novoCliente == true) {
		
			System.out.println("-----------------BEM VINDO A LOJA LOUIS VINTÃO!!-----------------\n");
			System.out.println("SR(A/X) CLIENTE, ENTRE COM SEU NOME E SEU CPF: ");
			System.out.println("NOME:");
			cliente1.setNome(input.nextLine().toUpperCase());
			System.out.println("CPF: ");
			cliente1.setCpf(input.nextLine());
			System.out.println("SEJA BEM VINDO: "+ cliente1.getNome());
			//----------------------------CLIENTE---------------------//
			System.out.println("\nESCOLHA O NUMERO DO PRODUTO E A QUANTIDADE:\n");
			System.out.println("--------------------------------------------");
			System.out.println("CODIGO:\t\tVALOR:\t\tQUANTIDADE");
			for (Produto produtos : produtosLista) {
				System.out.println(produtos.getCodigo()+" - "+produtos.getNome()+"\t"+produtos.getPreco()+"\t\t"+produtos.getQuantidade());
			}
			//---------------------------CALCULO DAS COMPRAS----------//
			
			for( int x = 0; x<10; x++) {
				System.out.println("\nENTRE COM O CODIGO DO PRODUTO QUE DESEJA:");
				codigoProduto = input.nextInt() - 1;
				if(produtosLista.get(codigoProduto).getQuantidade() == 0) {
					System.out.println("PRODUTO FORA DE ESTOQUE, DESEJA OUTRO PRODUTO ?");
					operacao = input.next().toUpperCase().charAt(0);
					if(operacao =='S') {
						System.out.println("CODIGO PRODUTO:");
						codigoProduto = input.nextInt() - 1;
					} else {
						break;
					}
				}
				if (codigoProduto > 10)
				{
					System.out.println("CODIGO PRODUTO INVALIDO");
					System.out.println("CODIGO PRODUTO:");
					codigoProduto = input.nextInt() - 1;
				}
				
				System.out.println("QUANTAS UNIDADES DO PRODUTO: "+produtosLista.get(codigoProduto).getNome().toUpperCase());
				quantidade = input.nextInt();
				qTotal += quantidade;
				produtosLista.get(codigoProduto).retirar(quantidade);
				System.out.println("DESEJA ADICIONAR OUTRO PRODUTO S/N ?");
				operacao = input.next().toUpperCase().charAt(0);

				carrinho.add(x,"\t\t\n"+produtosLista.get(codigoProduto).getNome()+"\t\tR$"+produtosLista.get(codigoProduto).precoQuantidade(quantidade)+"\t\t"+quantidade+"\t\t"+cliente1.getData().getDayOfMonth()+"/"+cliente1.getData().getMonthValue()+"/"+cliente1.getData().getYear());
				pagamento.valorFinal(produtosLista.get(codigoProduto).precoQuantidade(quantidade));
				if(operacao == 'S') {
					
				} else {
					break;
				}
			}
			
			//------------------------CARRINNHO-------------------------//
			System.out.println("---------------------CARRINHO-------------------");
			System.out.println("PRODUTOS: \t VALOR: \t UND: \t\t DATA:");
			System.out.println(carrinho.toString().replace("[", "").replace("]", "").replace(",", ""));
			System.out.println("\n\nVALOR A SER PAGO: R$"+pagamento.getValorFinal());
			
			
			 System.out.println("\n\n--------------FORMA DE PAGAMENNTO----------------\n\n");
			 
			 System.out.println("\nInsira 'D' dinheiro ou cheque ou 'C' para cartão de crédito: ");
		     char pag = input.next().toUpperCase().charAt(0);
		     
		     if (pag == 'D')
		     {
		    	 pagamento.pagamentoAvistaDinheiro();
		     }
		     
		     if (pag == 'C')
		     {
		    	 System.out.println("\nEm 1, 2 ou 3 vezes: "); 
		         int parc = input.nextInt();
		       
		         if (parc == 1)
		         {
		        	 pagamento.pagamentoAvistaCartao();
		         }
		         if (parc == 2)
		         {
		        	 vezes ++;
		        	 pagamento.pagamentoCartao2x();
		         }
		         if (parc == 3)
		         {
		        	 pagamento.pagamentoCartao3x();
		        	 vezes = vezes + 2;
		         }
		     }
		     
		     
		     System.out.println("\nDeseja a impressão da nota fiscal - S/N ?");
		     char notaFiscal = input.next().toUpperCase().charAt(0);
		     
		     if (notaFiscal == 'S')
		     {
		    	pagamento.notaFiscal1();
		    	System.out.println(carrinho.toString().replace("[", "").replace("]", "").replace(",", ""));
		    	System.out.println("--------------------------------------------------------------------");
				System.out.println("\n                  CLIENTE: "+cliente1.getNome()+"          CPF: "+ cliente1.getCpf()+"               ");
		 		pagamento.notaFiscal2();
		     }	
		     
		     else 
		     {
		    	 System.out.print("\n\n------------------------OBRIGADO E VOLTE SEMPRE-----------------------\n\n\n\n");
		     }
		     System.out.println("DESEJA ENTRAR COM UM NOVO CLIENTE ? (S-SIM / N-NÃO)");
		     operacao = input.next().toUpperCase().charAt(0);
		     if(operacao == 'S') {
		    	 
		     } else {
		    	 novoCliente = false;
		     }
		}
	}
}
