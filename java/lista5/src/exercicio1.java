import java.util.Scanner;

public class exercicio1 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		double valor, desconto, cc;
		String pag;
		

		System.out.println ("Insira o valor da etiqueta do produto: ");
		valor = leia.nextDouble();
		System.out.println ("\nFORMA DE PAGAMENTO");
		leia.nextLine();
		System.out.println("\nInsira 'D' dinheiro ou cheque ou 'C' para cartão de crédito: ");
	    pag = leia.next();
	        
	        if (pag .equals("D")  || pag .equals("d"))
	        {
	            desconto = valor * 0.20;
	            valor = valor - desconto;
	        }
	        if (pag .equals("C")  || pag .equals("c"))
	        {

	        	 System.out.println("\nEm 1, 2 ou 3 vezes: "); 
		          cc = leia.nextInt();
		            
		          if (cc == 1)
		          {			        	  
		        	  desconto = valor * 0.15;
		        	  valor = valor - desconto;		            
		          }
	            
	            else if (cc == 3)
	            {
	                
	                desconto = valor*0.10;
	                valor = valor + desconto;
	            }
		         
	            else 
	            {
	            	 System.out.println("\nSELEÇÃO INCORRETA\n");
	            	 System.out.println("\nEm 1, 2 ou 3 vezes: "); 
			         cc = leia.nextInt();
	            }
	        }    
	         else 
	         {
	            System.out.println("\nSELEÇÃO INCORRETA\n");
	            System.out.println("\nInsira 'A' dinheiro ou cheque ou 'C' para cartão de crédito: ");
	            pag = leia.next();
	         }	    
	         
	        System.out.printf("\n\nValor a ser pago é de R$ %.2f",valor);
	         	        
	}

}
