package exercicio3;

public class dadosProduto 
{
	public String nomeProduto;
	public double preco;
	public int quantidade;
	
	public dadosProduto(String nomeProduto, double preco, int quantidade) {
		super();
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void getProduto ()
	{
		System.out.println("PRODUTO: "+nomeProduto);
		System.out.printf("PREÇO: R$ %.2f",preco);
		System.out.println("\nQUANTIDADE: "+quantidade +" UNIDADES");
		
		System.out.printf("\nVALOR TOTAL: R$ %.2f ",(preco*quantidade));
	}
	
	
}
